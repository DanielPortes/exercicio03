package padroescriacao.exercicio03;


public class TrackerStateCommissioning extends TrackerState {

    public TrackerStateCommissioning(Tracker tracker) {
        super(tracker);
    }

    @Override
    public boolean commission() {
        boolean commissioningComplete = checkCommissioningComplete();
        if (commissioningComplete) {
            tracker.setState(new TrackerStateOperation(tracker));
            return true;
        }
        return false;
    }

    private boolean checkCommissioningComplete() {
        return true;
    }
}
