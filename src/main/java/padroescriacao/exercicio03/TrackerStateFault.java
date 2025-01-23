package padroescriacao.exercicio03;




public class TrackerStateFault extends TrackerState {

    public TrackerStateFault(Tracker tracker) {
        super(tracker);
    }

    @Override
    public boolean handleFault() {

        boolean faultResolved = resolveFault();
        if (faultResolved) {
            tracker.setState(new TrackerStateOperation(tracker));
            return true;
        }
        return false;
    }

    @Override
    public boolean switchToManual() {

        tracker.setState(new TrackerStateManual(tracker));
        return true;
    }

    private boolean resolveFault() {

        return true;
    }
}
