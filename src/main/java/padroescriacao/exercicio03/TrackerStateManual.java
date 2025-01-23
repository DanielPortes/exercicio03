package padroescriacao.exercicio03;




public class TrackerStateManual extends TrackerState {

    public TrackerStateManual(Tracker tracker) {
        super(tracker);
    }

    @Override
    public boolean operate() {

        boolean manualComplete = checkManualComplete();
        if (manualComplete) {
            tracker.setState(new TrackerStateOperation(tracker));
            return true;
        }
        return false;
    }

    private boolean checkManualComplete() {

        return true;
    }
}
