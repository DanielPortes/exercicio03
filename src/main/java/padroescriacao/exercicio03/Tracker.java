package padroescriacao.exercicio03;


public class Tracker {
    private TrackerState currentState;

    public Tracker() {
        this.currentState = new TrackerStateStartup(this);
    }

    public void setState(TrackerState newState) {
        this.currentState = newState;
    }


    public boolean initialize() {
        return this.currentState.initialize();
    }

    public boolean commission() {
        return this.currentState.commission();
    }

    public boolean operate() {
        return this.currentState.operate();
    }

    public boolean configure() {
        return this.currentState.configure();
    }

    public boolean handleFault() {
        return this.currentState.handleFault();
    }

    public boolean switchToManual() {
        return this.currentState.switchToManual();
    }

    public boolean switchToAI() {
        return this.currentState.switchToAI();
    }


    public String getState() {
        return currentState.getStateName();
    }
}
