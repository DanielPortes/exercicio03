package padroescriacao.exercicio03;

public abstract class TrackerState {
    protected Tracker tracker;

    public TrackerState(Tracker tracker) {
        this.tracker = tracker;
    }


    public boolean initialize() {
        return false;
    }

    public boolean commission() {
        return false;
    }

    public boolean operate() {
        return false;
    }

    public boolean configure() {
        return false;
    }

    public boolean handleFault() {
        return false;
    }

    public boolean switchToManual() {
        return false;
    }

    public boolean switchToAI() {
        return false;
    }


    public String getStateName() {
        return this.getClass().getSimpleName();
    }
}
