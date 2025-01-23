package padroescriacao.exercicio03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TrackerTest {
    private Tracker tracker;

    @BeforeEach
    public void setUp() {
        tracker = new Tracker();
    }


    @Test
    public void testInitialState() {
        assertEquals("TrackerStateStartup", tracker.getState(), "Estado inicial deve ser TrackerStateStartup");
    }


    @Test
    public void testInitializeTransition() {
        tracker.initialize();
        assertEquals("TrackerStateOperation", tracker.getState(), "Após initialize(), estado deve ser TrackerStateOperation");
    }


    @Test
    public void testHandleFaultTransition() {

        tracker.initialize();
        assertEquals("TrackerStateOperation", tracker.getState());


        tracker.handleFault();

        assertEquals("TrackerStateOperation", tracker.getState(), "Falha não detectada, estado deve permanecer Operation");


    }


    @Test
    public void testResolveFaultTransition() {

        tracker.setState(new TrackerStateFault(tracker));
        assertEquals("TrackerStateFault", tracker.getState());


        tracker.handleFault();
        assertEquals("TrackerStateOperation", tracker.getState(), "Após resolver falha, estado deve ser TrackerStateOperation");
    }


    @Test
    public void testSwitchToManualTransition() {

        tracker.initialize();
        assertEquals("TrackerStateOperation", tracker.getState());


        tracker.switchToManual();
        assertEquals("TrackerStateManual", tracker.getState(), "Após switchToManual(), estado deve ser TrackerStateManual");
    }


    @Test
    public void testManualToOperationTransition() {

        tracker.setState(new TrackerStateManual(tracker));
        assertEquals("TrackerStateManual", tracker.getState());


        tracker.operate();
        assertEquals("TrackerStateOperation", tracker.getState(), "Após operar manualmente, estado deve ser TrackerStateOperation");
    }


    @Test
    public void testSwitchToAITransition() {

        tracker.initialize();
        assertEquals("TrackerStateOperation", tracker.getState());


        tracker.switchToAI();
        assertEquals("TrackerStateArtificialIntelligence", tracker.getState(), "Após switchToAI(), estado deve ser TrackerStateArtificialIntelligence");
    }


    @Test
    public void testAITaskCompleteTransition() {

        tracker.setState(new TrackerStateArtificialIntelligence(tracker));
        assertEquals("TrackerStateArtificialIntelligence", tracker.getState());


        tracker.operate();
        assertEquals("TrackerStateOperation", tracker.getState(), "Após completar tarefas de IA, estado deve ser TrackerStateOperation");
    }


    @Test
    public void testUnsupportedActions() {

        assertEquals("TrackerStateStartup", tracker.getState());


        tracker.operate();
        assertEquals("TrackerStateStartup", tracker.getState(), "Chamar operate() no estado Startup não deve alterar o estado");


        tracker.initialize();
        assertEquals("TrackerStateOperation", tracker.getState());


        tracker.initialize();
        assertEquals("TrackerStateOperation", tracker.getState(), "Chamar initialize() no estado Operation não deve alterar o estado");
    }
}
