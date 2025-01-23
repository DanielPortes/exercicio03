package padroescriacao.exercicio03;


public class TrackerStateConfiguration extends TrackerState {

    public TrackerStateConfiguration(Tracker tracker) {
        super(tracker);
    }

    @Override
    public boolean configure() {

        boolean configurationComplete = checkConfigurationComplete();
        if (configurationComplete) {
            tracker.setState(new TrackerStateOperation(tracker));
            return true;
        }
        return false;
    }

    private boolean checkConfigurationComplete() {

        return true;
    }
}