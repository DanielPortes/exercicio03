package padroescriacao.exercicio03;


public class TrackerStateArtificialIntelligence extends TrackerState {

    public TrackerStateArtificialIntelligence(Tracker tracker) {
        super(tracker);
    }

    @Override
    public boolean operate() {

        boolean aiTaskComplete = checkAITaskComplete();
        if (aiTaskComplete) {
            tracker.setState(new TrackerStateOperation(tracker));
            return true;
        }
        return false;
    }

    private boolean checkAITaskComplete() {

        return true;
    }
}