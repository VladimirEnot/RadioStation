public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation;
    private int maxVolume;
    private int minRadioStation;
    private int minVolume;


    public Radio() {
        this.minVolume = 0;
        this.maxVolume = 100;
        this.minRadioStation = 0;
        this.maxRadioStation = 9;
        this.currentVolume = minVolume;
        this.currentRadioStation = minRadioStation;
    }

    public Radio(int minVolume, int maxVolume, int minRadioStation, int maxRadioStation, int stationsCount) {
        this.minVolume = minVolume;
        this.maxVolume = maxVolume;
        this.minRadioStation = minRadioStation;
        this.maxRadioStation = stationsCount - 1;
        this.currentVolume = minVolume;
        this.currentRadioStation = minRadioStation;
    }


    public void next() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = minRadioStation;
        }

    }

    public void prev() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation--;
        } else {
            currentRadioStation = maxRadioStation;
        }

    }

    public void up() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void down() {
        if (currentVolume > minVolume) {
            currentVolume--;
        } else {
            currentVolume = minVolume;
        }
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

}
