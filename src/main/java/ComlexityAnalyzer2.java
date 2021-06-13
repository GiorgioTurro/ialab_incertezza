import aima.core.probability.Factor;
import aima.core.probability.RandomVariable;
import aima.core.probability.bayes.DynamicBayesianNetwork;
import aima.core.probability.bayes.Node;
import aima.core.probability.bayes.approx.ParticleFiltering;
import aima.core.probability.example.ExampleRV;
import aima.core.probability.proposition.AssignmentProposition;

import java.util.*;


public class ComplexityAnalyzer2 {
    private DynamicBayesianNetwork DBN;
    private List<RandomVariable> allrv;
    private List<Node> allNodes = new ArrayList<Node>();
    Map<Integer,Long> Time = new HashMap<>();
    public float mean;
    public int maxDim;
    //QUERY
    private List<RandomVariable> qrv;
    private List<AssignmentProposition> ap;
    ComplexDBN cdbn = new ComplexDBN();

    private final static String TOPOLOGICAL_ORDER = "Topological_Order";
    private final static String MIN_DEGREE_ORDER = "Min_Degree_Order";
    private final static String MIN_FILL_ORDER = "Min_Fill_Order";

    private final static String ASIA_NET = "DBN_Asia";
    private final static String ASIA_NET2 = "DBN_Asia2";
    private final static String ASIA_NET3 = "DBN_Asia3";
    private final static String ASIA_NET4 = "DBN_Asia4";
    private final static String ASIA_NET5 = "DBN_Asia5";
    private final static String ASIA_NET6 = "DBN_Asia6";
    private final static String ASIA_NET7 = "DBN_Asia7";
    private final static String ASIA_NET8 = "DBN_Asia8";
    private final static String ASIA_NET9 = "DBN_Asia9";
    private final static String RAIN_NET = "DBN_Rain";
    private final static String WIND_NET = "DBN_Rain_Wind";
    private final static String ALARM_NET = "DBN_Burglary";
    /**
     * Return a Dynamic Bayesian Network of the Umbrella World Network.
     *
     * @return a Dynamic Bayesian Network of the Umbrella World Network.
     */

    private PreprocessingInfo preproInfo = new PreprocessingInfo();

    public void AsiaWorld() {
        HashMap<String, RandomVariable> rvsmap = new HashMap<>();
        DBN = cdbn.getAsiaNetworkDBN();
        allrv = DBN.getVariablesInTopologicalOrder();

        for (RandomVariable rv : allrv) {
            rvsmap.put(rv.getName(), rv);
            allNodes.add(DBN.getNode(rv));
        }
        qrv = new ArrayList<RandomVariable>(1);
        qrv.add(0, rvsmap.get("Asia_t15"));
        qrv.add(0, rvsmap.get("Smoke_t15"));
        qrv.add(0, rvsmap.get("Lung_t15"));
        qrv.add(0, rvsmap.get("Tub_t15"));


        ap = new ArrayList<AssignmentProposition>(1);
        Set<RandomVariable> evidence = new HashSet<RandomVariable>();
        evidence = DBN.getE_1();
        /**/
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t15"), true));


        ap.add(new AssignmentProposition(rvsmap.get("Either_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t15"), true));


        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t15"), true));

        ap.add(new AssignmentProposition(rvsmap.get("Xray_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t15"), true));




    }

    public void AsiaWorld2() {
        HashMap<String, RandomVariable> rvsmap = new HashMap<>();
        DBN = cdbn.getAsiaNetworkDBN();
        allrv = DBN.getVariablesInTopologicalOrder();

        for (RandomVariable rv : allrv) {
            rvsmap.put(rv.getName(), rv);
            allNodes.add(DBN.getNode(rv));
        }
        qrv = new ArrayList<RandomVariable>(1);
        qrv.add(0, rvsmap.get("Asia_t15"));
        //qrv.add(0, rvsmap.get("Smoke_t15"));
        //qrv.add(0, rvsmap.get("Lung_t15"));
        //qrv.add(0, rvsmap.get("Tub_15"));


        ap = new ArrayList<AssignmentProposition>(1);
        Set<RandomVariable> evidence = new HashSet<RandomVariable>();
        evidence = DBN.getE_1();
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t15"), true));
*/
        /**/
        ap.add(new AssignmentProposition(rvsmap.get("Either_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t15"), true));

        /*
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t15"), true));

        ap.add(new AssignmentProposition(rvsmap.get("Xray_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t15"), true));
*/


    }

    public void AsiaWorld3() {
        HashMap<String, RandomVariable> rvsmap = new HashMap<>();
        DBN = cdbn.getAsiaNetworkDBN();
        allrv = DBN.getVariablesInTopologicalOrder();

        for (RandomVariable rv : allrv) {
            rvsmap.put(rv.getName(), rv);
            allNodes.add(DBN.getNode(rv));
        }
        qrv = new ArrayList<RandomVariable>(1);
        qrv.add(0, rvsmap.get("Asia_t15"));
        //qrv.add(0, rvsmap.get("Smoke_t15"));
        //qrv.add(0, rvsmap.get("Lung_t15"));
        //qrv.add(0, rvsmap.get("Tub_15"));


        ap = new ArrayList<AssignmentProposition>(1);
        Set<RandomVariable> evidence = new HashSet<RandomVariable>();
        evidence = DBN.getE_1();
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t15"), true));
*/
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Either_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t15"), true));
*/
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t15"), true));
*/
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t15"), true));

    }

    public void AsiaWorld4() {
        HashMap<String, RandomVariable> rvsmap = new HashMap<>();
        DBN = cdbn.getAsiaNetworkDBN();
        allrv = DBN.getVariablesInTopologicalOrder();

        for (RandomVariable rv : allrv) {
            rvsmap.put(rv.getName(), rv);
            allNodes.add(DBN.getNode(rv));
        }
        qrv = new ArrayList<RandomVariable>(1);
        //qrv.add(0, rvsmap.get("Asia_t15"));
        qrv.add(0, rvsmap.get("Smoke_t15"));
        //qrv.add(0, rvsmap.get("Lung_t15"));
        //qrv.add(0, rvsmap.get("Tub_15"));


        ap = new ArrayList<AssignmentProposition>(1);
        Set<RandomVariable> evidence = new HashSet<RandomVariable>();
        evidence = DBN.getE_1();
        /**/
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t15"), true));

       /*
        ap.add(new AssignmentProposition(rvsmap.get("Either_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t15"), true));
*/
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t15"), true));

        ap.add(new AssignmentProposition(rvsmap.get("Xray_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t15"), true));
*/
    }

    public void AsiaWorld5() {
        HashMap<String, RandomVariable> rvsmap = new HashMap<>();
        DBN = cdbn.getAsiaNetworkDBN();
        allrv = DBN.getVariablesInTopologicalOrder();

        for (RandomVariable rv : allrv) {
            rvsmap.put(rv.getName(), rv);
            allNodes.add(DBN.getNode(rv));
        }
        qrv = new ArrayList<RandomVariable>(1);
        //qrv.add(0, rvsmap.get("Asia_t15"));
        qrv.add(0, rvsmap.get("Smoke_t15"));
        //qrv.add(0, rvsmap.get("Lung_t15"));
        //qrv.add(0, rvsmap.get("Tub_15"));


        ap = new ArrayList<AssignmentProposition>(1);
        Set<RandomVariable> evidence = new HashSet<RandomVariable>();
        evidence = DBN.getE_1();
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t15"), true));
*/
        /**/
        ap.add(new AssignmentProposition(rvsmap.get("Either_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t15"), true));

        /*
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t15"), true));

        ap.add(new AssignmentProposition(rvsmap.get("Xray_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t15"), true));
*/
    }

    public void AsiaWorld6() {
        HashMap<String, RandomVariable> rvsmap = new HashMap<>();
        DBN = cdbn.getAsiaNetworkDBN();
        allrv = DBN.getVariablesInTopologicalOrder();

        for (RandomVariable rv : allrv) {
            rvsmap.put(rv.getName(), rv);
            allNodes.add(DBN.getNode(rv));
        }
        qrv = new ArrayList<RandomVariable>(1);
        //qrv.add(0, rvsmap.get("Asia_t15"));
        qrv.add(0, rvsmap.get("Smoke_t15"));
        //qrv.add(0, rvsmap.get("Lung_t15"));
        //qrv.add(0, rvsmap.get("Tub_t15"));


        ap = new ArrayList<AssignmentProposition>(1);
        Set<RandomVariable> evidence = new HashSet<RandomVariable>();
        evidence = DBN.getE_1();
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t15"), true));
*/
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Either_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t15"), true));
*/
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t15"), true));
*/
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t15"), true));

    }

    public void AsiaWorld7() {
        HashMap<String, RandomVariable> rvsmap = new HashMap<>();
        DBN = cdbn.getAsiaNetworkDBN();
        allrv = DBN.getVariablesInTopologicalOrder();

        for (RandomVariable rv : allrv) {
            rvsmap.put(rv.getName(), rv);
            allNodes.add(DBN.getNode(rv));
        }
        qrv = new ArrayList<RandomVariable>(1);
        qrv.add(0, rvsmap.get("Asia_t15"));
        qrv.add(0, rvsmap.get("Smoke_t15"));
        qrv.add(0, rvsmap.get("Lung_t15"));
        qrv.add(0, rvsmap.get("Tub_t15"));


        ap = new ArrayList<AssignmentProposition>(1);
        Set<RandomVariable> evidence = new HashSet<RandomVariable>();
        evidence = DBN.getE_1();
        /**/
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t15"), true));

       /*
        ap.add(new AssignmentProposition(rvsmap.get("Either_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t15"), true));
*/
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t15"), true));

        ap.add(new AssignmentProposition(rvsmap.get("Xray_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t15"), true));
*/
    }

    public void AsiaWorld8() {
        HashMap<String, RandomVariable> rvsmap = new HashMap<>();
        DBN = cdbn.getAsiaNetworkDBN();
        allrv = DBN.getVariablesInTopologicalOrder();

        for (RandomVariable rv : allrv) {
            rvsmap.put(rv.getName(), rv);
            allNodes.add(DBN.getNode(rv));
        }
        qrv = new ArrayList<RandomVariable>(1);
        qrv.add(0, rvsmap.get("Asia_t15"));
        qrv.add(0, rvsmap.get("Smoke_t15"));
        qrv.add(0, rvsmap.get("Lung_t15"));
        qrv.add(0, rvsmap.get("Tub_t15"));


        ap = new ArrayList<AssignmentProposition>(1);
        Set<RandomVariable> evidence = new HashSet<RandomVariable>();
        evidence = DBN.getE_1();
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t15"), true));
*/
        /**/
        ap.add(new AssignmentProposition(rvsmap.get("Either_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t15"), true));

        /*
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t15"), true));

        ap.add(new AssignmentProposition(rvsmap.get("Xray_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t15"), true));
*/

    }

    public void AsiaWorld9() {
        HashMap<String, RandomVariable> rvsmap = new HashMap<>();
        DBN = cdbn.getAsiaNetworkDBN();
        allrv = DBN.getVariablesInTopologicalOrder();

        for (RandomVariable rv : allrv) {
            rvsmap.put(rv.getName(), rv);
            allNodes.add(DBN.getNode(rv));
        }
        qrv = new ArrayList<RandomVariable>(1);
        qrv.add(0, rvsmap.get("Asia_t15"));
        qrv.add(0, rvsmap.get("Smoke_t15"));
        qrv.add(0, rvsmap.get("Lung_t15"));
        qrv.add(0, rvsmap.get("Tub_t15"));


        ap = new ArrayList<AssignmentProposition>(1);
        Set<RandomVariable> evidence = new HashSet<RandomVariable>();
        evidence = DBN.getE_1();
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Bronc_t15"), true));
*/
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Either_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Either_t15"), true));
*/
        /*
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Dysp_t15"), true));
*/
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t2"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t3"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t5"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t6"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t8"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t9"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t10"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t11"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t12"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t13"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t14"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Xray_t15"), true));

    }


    public void UmbrellaWorld() {
        HashMap<String, RandomVariable> rvsmap = new HashMap<>();
        DBN = cdbn.getUmbrellaWorldNetworkExt();
        allrv = DBN.getVariablesInTopologicalOrder();

        for (RandomVariable rv : allrv) {
            rvsmap.put(rv.getName(), rv);
            allNodes.add(DBN.getNode(rv));
        }
        qrv = new ArrayList<RandomVariable>(1);
        qrv.add(0, rvsmap.get("Rain_t20"));
        ap = new ArrayList<AssignmentProposition>(1);
        Set<RandomVariable> evidence = new HashSet<RandomVariable>();
        evidence = DBN.getE_1();
        for (RandomVariable rv : evidence) {
            if(Math.round( Math.random())==0) ap.add(new AssignmentProposition(rvsmap.get(rv.getName()), false));
            else ap.add(new AssignmentProposition(rvsmap.get(rv.getName()), true));
        }
     /*   ap.add(new AssignmentProposition(rvsmap.get("Umbrella_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Umbrella_t1"), false)); */
    }

    public void WindWorld() {
        HashMap<String, RandomVariable> rvsmap = new HashMap<>();
        DBN = cdbn.getRainWindNet();
        allrv = DBN.getVariablesInTopologicalOrder();

        for (RandomVariable rv : allrv) {
            rvsmap.put(rv.getName(), rv);
            allNodes.add(DBN.getNode(rv));
        }
        qrv = new ArrayList<RandomVariable>(1);
        qrv.add(0, rvsmap.get("Rain_t10"));
        qrv.add(0, rvsmap.get("Wind_t10"));

        ap = new ArrayList<AssignmentProposition>(1);
        Set<RandomVariable> evidence = new HashSet<RandomVariable>();
        evidence = DBN.getE_1();
        for (RandomVariable rv : evidence) {
            ap.add(new AssignmentProposition(rvsmap.get(rv.getName()), true));
        }
    }

    public void AlarmWorld() {
        HashMap<String, RandomVariable> rvsmap = new HashMap<>();
        DBN = cdbn.getAlarmDBNet();
        allrv = DBN.getVariablesInTopologicalOrder();

        for (RandomVariable rv : allrv) {
            rvsmap.put(rv.getName(), rv);
            allNodes.add(DBN.getNode(rv));
        }
        qrv = new ArrayList<RandomVariable>(1);
        qrv.add(0, rvsmap.get("Burglary_t9"));
        qrv.add(0, rvsmap.get("Earthquake_t9"));

        ap = new ArrayList<AssignmentProposition>(1);
        Set<RandomVariable> evidence = new HashSet<RandomVariable>();
        //evidence = DBN.getE_1();
        //for(RandomVariable rv : evidence){
        //    ap.add(new AssignmentProposition(rvsmap.get(rv.getName()), true));
        //}
        ap.add(new AssignmentProposition(rvsmap.get("Alarm_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Alarm_t1"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Alarm_t2"), false));
        ap.add(new AssignmentProposition(rvsmap.get("Alarm_t3"), false));
        ap.add(new AssignmentProposition(rvsmap.get("Alarm_t4"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Alarm_t5"), false));
        ap.add(new AssignmentProposition(rvsmap.get("Alarm_t6"), false));
        ap.add(new AssignmentProposition(rvsmap.get("Alarm_t7"), true));
        ap.add(new AssignmentProposition(rvsmap.get("Alarm_t8"), false));
        ap.add(new AssignmentProposition(rvsmap.get("Alarm_t9"), false));

        ap.add(new AssignmentProposition(rvsmap.get("JohnCalls_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("MaryCalls_t0"), true));
        ap.add(new AssignmentProposition(rvsmap.get("JohnCalls_t1"), false));
        ap.add(new AssignmentProposition(rvsmap.get("MaryCalls_t1"), false));
        ap.add(new AssignmentProposition(rvsmap.get("JohnCalls_t2"), false));
        ap.add(new AssignmentProposition(rvsmap.get("MaryCalls_t2"), false));
        ap.add(new AssignmentProposition(rvsmap.get("JohnCalls_t3"), false));
        ap.add(new AssignmentProposition(rvsmap.get("MaryCalls_t3"), false));
        ap.add(new AssignmentProposition(rvsmap.get("JohnCalls_t4"), false));
        ap.add(new AssignmentProposition(rvsmap.get("MaryCalls_t4"), false));
        ap.add(new AssignmentProposition(rvsmap.get("JohnCalls_t5"), false));
        ap.add(new AssignmentProposition(rvsmap.get("MaryCalls_t5"), false));
        ap.add(new AssignmentProposition(rvsmap.get("JohnCalls_t6"), false));
        ap.add(new AssignmentProposition(rvsmap.get("MaryCalls_t6"), false));
        ap.add(new AssignmentProposition(rvsmap.get("JohnCalls_t7"), false));
        ap.add(new AssignmentProposition(rvsmap.get("MaryCalls_t7"), false));
        ap.add(new AssignmentProposition(rvsmap.get("JohnCalls_t8"), false));
        ap.add(new AssignmentProposition(rvsmap.get("MaryCalls_t8"), false));
        ap.add(new AssignmentProposition(rvsmap.get("JohnCalls_t9"), false));
        ap.add(new AssignmentProposition(rvsmap.get("MaryCalls_t9"), false));
        /*    */
    }

    public void getEV(){

    }

    public void approximatedInference(RollupFiltering rp,String Type){
        switch (Type) {
            case ALARM_NET: this.DBN=cdbn.getAlarmDBNet1(); break;
            case ASIA_NET: this.DBN=cdbn.getAsiaNetworkDBN1(); break;
            case RAIN_NET: this.DBN=cdbn.getUmbrellaWorldNetwork(); break;
            case WIND_NET: this.DBN=cdbn.getRainWindNet1();
        }
        int n = rp.slice;
        int m = rp.slice;
        int totEv = DBN.getE_1().size();
        AssignmentProposition[][] aps = null;
        if (m > 0) {
            aps = new AssignmentProposition[m][totEv];
            for (int i=0; i<m; i++) { int j = 0;
                for(RandomVariable asp:DBN.getE_1()) {
                    Iterator<List<AssignmentProposition>> iter = rp.setAP.iterator();
                    boolean done=false;
                    while(iter.hasNext()&&done==false)
                        for(AssignmentProposition ass:iter.next())
                            if(ass.getTermVariable().getName().contains(asp.getName().replace("0",""))&&(ass.getTermVariable().getName().contains("t"+String.valueOf(i))))
                            {  aps[i][j++] = new AssignmentProposition(asp, false); done=true;}
                    // Integer.parseInt(args[i+1])==0 ? Boolean.FALSE : Boolean.TRUE); }
                }
            }
        }


        System.out.println("Inferenza approssimata: ");
        ParticleFiltering pf = new ParticleFiltering(n, DBN);

        for (int i=0; i<m; i++) {
            AssignmentProposition[][] S = pf.particleFiltering(aps[i]);
            //System.out.println("Time " + (i+1));
            if(i==m-1) printSamples(S, n);
        }
    }

    public ComplexityAnalyzer2(String Network, String Type) {
        RollupFiltering RF = new RollupFiltering();
        ArrayList<Factor> factors = new ArrayList<Factor>();

        switch (Network) {
            case ALARM_NET: AlarmWorld(); break;
            case ASIA_NET: AsiaWorld(); break;
            case ASIA_NET2: AsiaWorld2(); break;
            case ASIA_NET3: AsiaWorld3(); break;
            case ASIA_NET4: AsiaWorld4(); break;
            case ASIA_NET5: AsiaWorld5(); break;
            case ASIA_NET6: AsiaWorld6(); break;
            case ASIA_NET7: AsiaWorld7(); break;
            case ASIA_NET8: AsiaWorld8(); break;
            case ASIA_NET9: AsiaWorld9(); break;
            case RAIN_NET: UmbrellaWorld(); break;
            case WIND_NET: WindWorld();
        }
        System.out.println("Rete: "+Network+"    Ordine delle variabili: "+Type);
        for(RandomVariable rv:qrv) System.out.println("P("+rv+"|E)");
        System.out.println("E = "+ap);
        RF.rollupFiltering(qrv.toArray(new RandomVariable[qrv.size()]), ap.toArray(new AssignmentProposition[ap.size()]), DBN,qrv.toArray(new RandomVariable[qrv.size()]), factors, Type);
        RF.mean = RF.sum/RF.slice;
        System.out.println("Tempo medio di esecuzione: "+RF.mean/100);
        System.out.println("Tempo esecuzione ordinamento variabili: " + RF.sumOrder/RF.slice/100000);
        mean = RF.mean;
        Time.putAll(RF.sliceTime);
        Factor product = RF.pointwiseProduct(factors);
        RF.getDistribution(product);
        RF.printFactors(Arrays.asList(product));
        maxDim = RF.dimMaxFattore;
        approximatedInference(RF,Network);
        System.out.println("Dimensione massima fattore intermedio: " + RF.dimMaxFattore);
    }

    public static void main(String[] args) {


        Map<String,Map<String,Map<Integer,Long>>> NetToTypeToTime = new HashMap<>();

        // ComplexityAnalyzer2 complexityAnal4 = new ComplexityAnalyzer2(RAIN_NET, TOPOLOGICAL_ORDER);
        //    System.out.println("\n");
        //-----------------------------------------RAIN.XML---------------------------------------------------------------
        ComplexityAnalyzer2 complexityAnalyzer4 = new ComplexityAnalyzer2(RAIN_NET, TOPOLOGICAL_ORDER);
        System.out.println("\n");
        ComplexityAnalyzer2 complexityAnalyzer5 = new ComplexityAnalyzer2(RAIN_NET, MIN_DEGREE_ORDER);
        System.out.println("\n");
        ComplexityAnalyzer2 complexityAnalyzer6 = new ComplexityAnalyzer2(RAIN_NET, MIN_FILL_ORDER);
        System.out.println("\n");
        Map<String,Map<Integer,Long>> TypeToTimeR = new HashMap<>();
        TypeToTimeR.put(TOPOLOGICAL_ORDER,complexityAnalyzer4.Time);
        TypeToTimeR.put(MIN_DEGREE_ORDER,complexityAnalyzer5.Time);
        TypeToTimeR.put(MIN_FILL_ORDER,complexityAnalyzer6.Time);
        NetToTypeToTime.put(RAIN_NET,TypeToTimeR);
/*
        //-----------------------------------------WIND.XML---------------------------------------------------------------
        Map<String,Map<Integer,Long>> TypeToTimeW = new HashMap<>();
        ComplexityAnalyzer2 complexityAnalyzer7 = new ComplexityAnalyzer2(WIND_NET, TOPOLOGICAL_ORDER);
        System.out.println("\n");

        ComplexityAnalyzer2 complexityAnalyzer8 = new ComplexityAnalyzer2(WIND_NET, MIN_DEGREE_ORDER);
        System.out.println("\n");
        ComplexityAnalyzer2 complexityAnalyzer9 = new ComplexityAnalyzer2(WIND_NET, MIN_FILL_ORDER);
        System.out.println("\n");
        TypeToTimeW.put(TOPOLOGICAL_ORDER,complexityAnalyzer7.Time);
        TypeToTimeW.put(MIN_DEGREE_ORDER,complexityAnalyzer8.Time);
        TypeToTimeW.put(MIN_FILL_ORDER,complexityAnalyzer9.Time);
        NetToTypeToTime.put(WIND_NET,TypeToTimeW);

*/
        //-----------------------------------------ASIA.XML---------------------------------------------------------------
        ComplexityAnalyzer2 complexityAnalyzer1 = new ComplexityAnalyzer2(ASIA_NET, TOPOLOGICAL_ORDER);
        System.out.println("\n");
        ComplexityAnalyzer2 complexityAnalyzer2 = new ComplexityAnalyzer2(ASIA_NET, MIN_DEGREE_ORDER);
        System.out.println("\n");
        ComplexityAnalyzer2 complexityAnalyzer3 = new ComplexityAnalyzer2(ASIA_NET, MIN_FILL_ORDER);
        System.out.println("\n");

        Map<String,Map<Integer,Long>> TypeToTimeA = new HashMap<>();
        TypeToTimeA.put(TOPOLOGICAL_ORDER,complexityAnalyzer1.Time);
        TypeToTimeA.put(MIN_DEGREE_ORDER,complexityAnalyzer2.Time);
        TypeToTimeA.put(MIN_FILL_ORDER,complexityAnalyzer3.Time);
        NetToTypeToTime.put(ASIA_NET,TypeToTimeA);

        //-----------------------------------------ALARM.XML---------------------------------------------------------------

        ComplexityAnalyzer2 complexityAnalyzer10 = new ComplexityAnalyzer2(ALARM_NET, TOPOLOGICAL_ORDER);
        System.out.println("\n");
        ComplexityAnalyzer2 complexityAnalyzer11 = new ComplexityAnalyzer2(ALARM_NET, MIN_DEGREE_ORDER);
        System.out.println("\n");
        ComplexityAnalyzer2 complexityAnalyzer12 = new ComplexityAnalyzer2(ALARM_NET, MIN_FILL_ORDER);
        System.out.println("\n");
        Map<String,Map<Integer,Long>> TypeToTimeAl = new HashMap<>();
        TypeToTimeAl.put(TOPOLOGICAL_ORDER,complexityAnalyzer10.Time);
        TypeToTimeAl.put(MIN_DEGREE_ORDER,complexityAnalyzer11.Time);
        TypeToTimeAl.put(MIN_FILL_ORDER,complexityAnalyzer12.Time);
        NetToTypeToTime.put(ALARM_NET,TypeToTimeAl);

        /*        System.out.println(NetToTypeToTime);
         */
    }





    private static void printSamples(AssignmentProposition[][] S, int n) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        int nstates = S[0].length;

        for (int i = 0; i < n; i++) {
            String key = "";
            for (int j = 0; j < nstates; j++) {
                AssignmentProposition ap = S[i][j];
                key += ap.getValue().toString();
            }
            Integer val = hm.get(key);
            if (val == null) {
                hm.put(key, 1);
            } else {
                hm.put(key, val + 1);
            }
        }

        for (String key : hm.keySet()) {
            System.out.println(key + ": " + hm.get(key)/(double)n);
        }


    }
}
