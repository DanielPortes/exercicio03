package padroescriacao.exercicio03;


public class TrackerStateStartup extends TrackerState {

    public TrackerStateStartup(Tracker tracker) {
        super(tracker);
    }

    @Override
    public boolean initialize() {

        boolean startupComplete = checkStartupComplete();
        if (startupComplete) {
            tracker.setState(new TrackerStateOperation(tracker));
            return true;
        }
        return false;
    }

    private boolean checkStartupComplete() {

        return true;
    }
}