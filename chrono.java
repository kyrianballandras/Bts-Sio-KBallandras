public class chrono {
    private int heures;
    private int minutes;
    private int secondes;

    public chrono() {
        this(0, 0, 0);
    }

    public chrono(int heures, int minutes, int secondes) {
        setHeures(heures);
        setMinutes(minutes);
        setSecondes(secondes);
    }

    // getters
    public int getHeures() {
        return heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    // setters (valeurs normalisées : minutes et secondes dans [0,59], heures >= 0)
    public void setHeures(int heures) {
        this.heures = Math.max(0, heures);
    }

    public void setMinutes(int minutes) {
        if (minutes < 0) minutes = 0;
        if (minutes > 59) minutes = minutes % 60;
        this.minutes = minutes;
    }

    public void setSecondes(int secondes) {
        if (secondes < 0) secondes = 0;
        if (secondes > 59) secondes = secondes % 60;
        this.secondes = secondes;
    }

    // enlève une seconde au temps courant en gérant les emprunts
    public void decompte() {
        if (heures == 0 && minutes == 0 && secondes == 0) return;
        if (secondes > 0) {
            secondes--;
            return;
        }
        if (minutes > 0) {
            minutes--;
            secondes = 59;
            return;
        }
        // secondes == 0 && minutes == 0 && heures > 0
        if (heures > 0) {
            heures--;
            minutes = 59;
            secondes = 59;
        }
    }

    public boolean estZero() {
        return heures == 0 && minutes == 0 && secondes == 0;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", heures, minutes, secondes);
    }
}