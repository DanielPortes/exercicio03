package padroescriacao.exercicio03;




public class TrackerStateOperation extends TrackerState {

    public TrackerStateOperation(Tracker tracker) {
        super(tracker);
    }

    @Override
    public boolean handleFault() {

        boolean faultDetected = detectFault();
        if (faultDetected) {
            tracker.setState(new TrackerStateFault(tracker));
            return true;
        }
        return false;
    }

    @Override
    public boolean switchToManual() {

        tracker.setState(new TrackerStateManual(tracker));
        return true;
    }

    @Override
    public boolean switchToAI() {

        tracker.setState(new TrackerStateArtificialIntelligence(tracker));
        return true;
    }

    private boolean detectFault() {

        return false;
    }
}
