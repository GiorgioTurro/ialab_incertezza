package aima.core.probability.example;

import aima.core.probability.domain.ArbitraryTokenDomain;
import aima.core.probability.domain.BooleanDomain;
import aima.core.probability.domain.FiniteIntegerDomain;
import aima.core.probability.util.RandVar;

/**
 * Predefined example Random Variables from AIMA3e.
 *
 * @author Ciaran O'Reilly
 */
public class ExampleRV {
	//
	public static final RandVar DICE_1_RV = new RandVar("Dice1",
			new FiniteIntegerDomain(1, 2, 3, 4, 5, 6));
	public static final RandVar DICE_2_RV = new RandVar("Dice2",
			new FiniteIntegerDomain(1, 2, 3, 4, 5, 6));
	//
	public static final RandVar TOOTHACHE_RV = new RandVar("Toothache",
			new BooleanDomain());
	public static final RandVar CAVITY_RV = new RandVar("Cavity",
			new BooleanDomain());
	public static final RandVar CATCH_RV = new RandVar("Catch",
			new BooleanDomain());
	//
	public static final RandVar WEATHER_RV = new RandVar("Weather",
			new ArbitraryTokenDomain("sunny", "rain", "cloudy", "snow"));
	//
	public static final RandVar MENINGITIS_RV = new RandVar("Meningitis",
			new BooleanDomain());
	public static final RandVar STIFF_NECK_RV = new RandVar("StiffNeck",
			new BooleanDomain());
	//
	public static final RandVar BURGLARY_RV = new RandVar("Burglary",
			new BooleanDomain());
	public static final RandVar EARTHQUAKE_RV = new RandVar("Earthquake",
			new BooleanDomain());
	public static final RandVar ALARM_RV = new RandVar("Alarm",
			new BooleanDomain());
	public static final RandVar JOHN_CALLS_RV = new RandVar("JohnCalls",
			new BooleanDomain());
	public static final RandVar MARY_CALLS_RV = new RandVar("MaryCalls",
			new BooleanDomain());


	public static final RandVar BURGLARY_RVm1 = new RandVar("Burglary_tm1",
			new BooleanDomain());
	public static final RandVar EARTHQUAKE_RVm1 = new RandVar("Earthquake_tm1",
			new BooleanDomain());
	public static final RandVar BURGLARY_RVt = new RandVar("Burglary_t0",
			new BooleanDomain());
	public static final RandVar EARTHQUAKE_RVt = new RandVar("Earthquake_t0",
			new BooleanDomain());
	public static final RandVar ALARM_RVt = new RandVar("Alarm_t0",
			new BooleanDomain());
	public static final RandVar JOHN_CALLS_RVt = new RandVar("JohnCalls_t0",
			new BooleanDomain());
	public static final RandVar MARY_CALLS_RVt = new RandVar("MaryCalls_t0",
			new BooleanDomain());
	public static final RandVar BURGLARY_RV1 = new RandVar("Burglary_t1",
			new BooleanDomain());
	public static final RandVar EARTHQUAKE_RV1 = new RandVar("Earthquake_t1",
			new BooleanDomain());
	public static final RandVar ALARM_RV1 = new RandVar("Alarm_t1",
			new BooleanDomain());
	public static final RandVar JOHN_CALLS_RV1 = new RandVar("JohnCalls_t1",
			new BooleanDomain());
	public static final RandVar MARY_CALLS_RV1 = new RandVar("MaryCalls_t1",
			new BooleanDomain());
	public static final RandVar BURGLARY_RV2 = new RandVar("Burglary_t2",
			new BooleanDomain());
	public static final RandVar EARTHQUAKE_RV2 = new RandVar("Earthquake_t2",
			new BooleanDomain());
	public static final RandVar ALARM_RV2 = new RandVar("Alarm_t2",
			new BooleanDomain());
	public static final RandVar JOHN_CALLS_RV2 = new RandVar("JohnCalls_t2",
			new BooleanDomain());
	public static final RandVar MARY_CALLS_RV2 = new RandVar("MaryCalls_t2",
			new BooleanDomain());
	public static final RandVar BURGLARY_RV3 = new RandVar("Burglary_t3",
			new BooleanDomain());
	public static final RandVar EARTHQUAKE_RV3 = new RandVar("Earthquake_t3",
			new BooleanDomain());
	public static final RandVar ALARM_RV3 = new RandVar("Alarm_t3",
			new BooleanDomain());
	public static final RandVar JOHN_CALLS_RV3 = new RandVar("JohnCalls_t3",
			new BooleanDomain());
	public static final RandVar MARY_CALLS_RV3 = new RandVar("MaryCalls_t3",
			new BooleanDomain());
	public static final RandVar BURGLARY_RV4 = new RandVar("Burglary_t4",
			new BooleanDomain());
	public static final RandVar EARTHQUAKE_RV4 = new RandVar("Earthquake_t4",
			new BooleanDomain());
	public static final RandVar ALARM_RV4 = new RandVar("Alarm_t4",
			new BooleanDomain());
	public static final RandVar JOHN_CALLS_RV4 = new RandVar("JohnCalls_t4",
			new BooleanDomain());
	public static final RandVar MARY_CALLS_RV4 = new RandVar("MaryCalls_t4",
			new BooleanDomain());
	public static final RandVar BURGLARY_RV6 = new RandVar("Burglary_t6",
			new BooleanDomain());
	public static final RandVar EARTHQUAKE_RV6 = new RandVar("Earthquake_t6",
			new BooleanDomain());
	public static final RandVar ALARM_RV6 = new RandVar("Alarm_t6",
			new BooleanDomain());
	public static final RandVar JOHN_CALLS_RV6 = new RandVar("JohnCalls_t6",
			new BooleanDomain());
	public static final RandVar MARY_CALLS_RV6 = new RandVar("MaryCalls_t6",
			new BooleanDomain());

	public static final RandVar BURGLARY_RV7 = new RandVar("Burglary_t7",
			new BooleanDomain());
	public static final RandVar EARTHQUAKE_RV7 = new RandVar("Earthquake_t7",
			new BooleanDomain());
	public static final RandVar ALARM_RV7 = new RandVar("Alarm_t7",
			new BooleanDomain());
	public static final RandVar JOHN_CALLS_RV7 = new RandVar("JohnCalls_t7",
			new BooleanDomain());
	public static final RandVar MARY_CALLS_RV7 = new RandVar("MaryCalls_t7",
			new BooleanDomain());

	public static final RandVar BURGLARY_RV8 = new RandVar("Burglary_t8",
			new BooleanDomain());
	public static final RandVar EARTHQUAKE_RV8 = new RandVar("Earthquake_t8",
			new BooleanDomain());
	public static final RandVar ALARM_RV8 = new RandVar("Alarm_t8",
			new BooleanDomain());
	public static final RandVar JOHN_CALLS_RV8 = new RandVar("JohnCalls_t8",
			new BooleanDomain());
	public static final RandVar MARY_CALLS_RV8 = new RandVar("MaryCalls_t8",
			new BooleanDomain());

	public static final RandVar BURGLARY_RV9 = new RandVar("Burglary_t9",
			new BooleanDomain());
	public static final RandVar EARTHQUAKE_RV9 = new RandVar("Earthquake_t9",
			new BooleanDomain());
	public static final RandVar ALARM_RV9 = new RandVar("Alarm_t9",
			new BooleanDomain());
	public static final RandVar JOHN_CALLS_RV9 = new RandVar("JohnCalls_t9",
			new BooleanDomain());
	public static final RandVar MARY_CALLS_RV9 = new RandVar("MaryCalls_t9",
			new BooleanDomain());

	public static final RandVar BURGLARY_RV5 = new RandVar("Burglary_t5",
			new BooleanDomain());
	public static final RandVar EARTHQUAKE_RV5 = new RandVar("Earthquake_t5",
			new BooleanDomain());
	public static final RandVar ALARM_RV5 = new RandVar("Alarm_t5",
			new BooleanDomain());
	public static final RandVar JOHN_CALLS_RV5 = new RandVar("JohnCalls_t5",
			new BooleanDomain());
	public static final RandVar MARY_CALLS_RV5 = new RandVar("MaryCalls_t5",
			new BooleanDomain());
	//
	public static final RandVar CLOUDY_RV = new RandVar("Cloudy",
			new BooleanDomain());
	public static final RandVar SPRINKLER_RV = new RandVar("Sprinkler",
			new BooleanDomain());
	public static final RandVar RAIN_RV = new RandVar("Rain",
			new BooleanDomain());
	public static final RandVar WET_GRASS_RV = new RandVar("WetGrass",
			new BooleanDomain());
	//
	public static final RandVar RAIN_tm1_RV = new RandVar("Rain_t-1",
			new BooleanDomain());
	public static final RandVar RAIN_t_RV = new RandVar("Rain_t0",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t_RV = new RandVar("Umbrella_t0",
			new BooleanDomain());
	public static final RandVar RAIN_t1_RV = new RandVar("Rain_t1",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t1_RV = new RandVar("Umbrella_t1",
			new BooleanDomain());
	public static final RandVar RAIN_t2_RV = new RandVar("Rain_t2",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t2_RV = new RandVar("Umbrella_t2",
			new BooleanDomain());
	public static final RandVar RAIN_t3_RV = new RandVar("Rain_t3",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t3_RV = new RandVar("Umbrella_t3",
			new BooleanDomain());
	public static final RandVar RAIN_t4_RV = new RandVar("Rain_t4",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t4_RV = new RandVar("Umbrella_t4",
			new BooleanDomain());
	public static final RandVar RAIN_t5_RV = new RandVar("Rain_t5",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t5_RV = new RandVar("Umbrella_t5",
			new BooleanDomain());
	public static final RandVar RAIN_t6_RV = new RandVar("Rain_t6",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t6_RV = new RandVar("Umbrella_t6",
			new BooleanDomain());
	public static final RandVar RAIN_t7_RV = new RandVar("Rain_t7",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t7_RV = new RandVar("Umbrella_t7",
			new BooleanDomain());
	public static final RandVar RAIN_t8_RV = new RandVar("Rain_t8",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t8_RV = new RandVar("Umbrella_t8",
			new BooleanDomain());
	public static final RandVar RAIN_t9_RV = new RandVar("Rain_t9",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t9_RV = new RandVar("Umbrella_t9",
			new BooleanDomain());
	public static final RandVar RAIN_t10_RV = new RandVar("Rain_t10",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t10_RV = new RandVar("Umbrella_t10",
			new BooleanDomain());
	public static final RandVar RAIN_t11_RV = new RandVar("Rain_t11",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t11_RV = new RandVar("Umbrella_t11",
			new BooleanDomain());
	public static final RandVar RAIN_t12_RV = new RandVar("Rain_t12",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t12_RV = new RandVar("Umbrella_t12",
			new BooleanDomain());
	public static final RandVar RAIN_t13_RV = new RandVar("Rain_t13",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t13_RV = new RandVar("Umbrella_t13",
			new BooleanDomain());
	public static final RandVar RAIN_t14_RV = new RandVar("Rain_t14",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t14_RV = new RandVar("Umbrella_t14",
			new BooleanDomain());
	public static final RandVar RAIN_t15_RV = new RandVar("Rain_t15",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t15_RV = new RandVar("Umbrella_t15",
			new BooleanDomain());
	public static final RandVar RAIN_t16_RV = new RandVar("Rain_t16",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t16_RV = new RandVar("Umbrella_t16",
			new BooleanDomain());
	public static final RandVar RAIN_t17_RV = new RandVar("Rain_t17",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t17_RV = new RandVar("Umbrella_t17",
			new BooleanDomain());
	public static final RandVar RAIN_t18_RV = new RandVar("Rain_t18",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t18_RV = new RandVar("Umbrella_t18",
			new BooleanDomain());
	public static final RandVar RAIN_t19_RV = new RandVar("Rain_t19",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t19_RV = new RandVar("Umbrella_t19",
			new BooleanDomain());
	public static final RandVar RAIN_t20_RV = new RandVar("Rain_t20",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t20_RV = new RandVar("Umbrella_t20",
			new BooleanDomain());
	public static final RandVar RAIN_t21_RV = new RandVar("Rain_t21",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t21_RV = new RandVar("Umbrella_t21",
			new BooleanDomain());
	public static final RandVar RAIN_t22_RV = new RandVar("Rain_t22",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t22_RV = new RandVar("Umbrella_t22",
			new BooleanDomain());
	public static final RandVar RAIN_t23_RV = new RandVar("Rain_t23",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t23_RV = new RandVar("Umbrella_t23",
			new BooleanDomain());
	public static final RandVar RAIN_t24_RV = new RandVar("Rain_t24",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t24_RV = new RandVar("Umbrella_t24",
			new BooleanDomain());
	public static final RandVar RAIN_t25_RV = new RandVar("Rain_t25",
			new BooleanDomain());
	public static final RandVar UMBREALLA_t25_RV = new RandVar("Umbrella_t25",
			new BooleanDomain());

	public static final RandVar WIND_tm1_RV = new RandVar("Wind_t-1",
			new BooleanDomain());
	public static final RandVar WIND_t_RV = new RandVar("Wind_t0",
			new BooleanDomain());
	public static final RandVar WIND_t1_RV = new RandVar("Wind_t1",
			new BooleanDomain());
	public static final RandVar WIND_t2_RV = new RandVar("Wind_t2",
			new BooleanDomain());
	public static final RandVar WIND_t3_RV = new RandVar("Wind_t3",
			new BooleanDomain());
	public static final RandVar WIND_t4_RV = new RandVar("Wind_t4",
			new BooleanDomain());
	public static final RandVar WIND_t5_RV = new RandVar("Wind_t5",
			new BooleanDomain());
	public static final RandVar WIND_t6_RV = new RandVar("Wind_t6",
			new BooleanDomain());
	public static final RandVar WIND_t7_RV = new RandVar("Wind_t7",
			new BooleanDomain());
	public static final RandVar WIND_t8_RV = new RandVar("Wind_t8",
			new BooleanDomain());
	public static final RandVar WIND_t9_RV = new RandVar("Wind_t9",
			new BooleanDomain());
	public static final RandVar WIND_t10_RV = new RandVar("Wind_t10",
			new BooleanDomain());



	public static final RandVar ASIA_Tm1_RV = new RandVar("Asia_tm1",
			new BooleanDomain());
	public static final RandVar SMOKE_Tm1_RV = new RandVar("Smoke_tm1",
			new BooleanDomain());
	public static final RandVar TUB_Tm1_RV = new RandVar("Tub_tm1",
			new BooleanDomain());
	public static final RandVar LUNG_Tm1_RV = new RandVar("Lung_tm1",
			new BooleanDomain());

	public static final RandVar ASIA_T_RV = new RandVar("Asia_t0",
			new BooleanDomain());
	public static final RandVar SMOKE_T_RV = new RandVar("Smoke_t0",
			new BooleanDomain());
	public static final RandVar TUB_T_RV = new RandVar("Tub_t0",
			new BooleanDomain());
	public static final RandVar LUNG_T_RV = new RandVar("Lung_t0",
			new BooleanDomain());
	public static final RandVar EITHER_T_RV = new RandVar("Either_t0",
			new BooleanDomain());
	public static final RandVar XRAY_T_RV = new RandVar("Xray_t0",
			new BooleanDomain());
	public static final RandVar DYSP_T_RV = new RandVar("Dysp_t0",
			new BooleanDomain());
	public static final RandVar BRONC_T_RV = new RandVar("Bronc_t0",
			new BooleanDomain());

	public static final RandVar ASIA_T1_RV = new RandVar("Asia_t1",
			new BooleanDomain());
	public static final RandVar SMOKE_T1_RV = new RandVar("Smoke_t1",
			new BooleanDomain());
	public static final RandVar TUB_T1_RV = new RandVar("Tub_t1",
			new BooleanDomain());
	public static final RandVar LUNG_T1_RV = new RandVar("Lung_t1",
			new BooleanDomain());
	public static final RandVar EITHER_T1_RV = new RandVar("Either_t1",
			new BooleanDomain());
	public static final RandVar XRAY_T1_RV = new RandVar("Xray_t1",
			new BooleanDomain());
	public static final RandVar DYSP_T1_RV = new RandVar("Dysp_t1",
			new BooleanDomain());
	public static final RandVar BRONC_T1_RV = new RandVar("Bronc_t1",
			new BooleanDomain());

	public static final RandVar ASIA_T2_RV = new RandVar("Asia_t2",
			new BooleanDomain());
	public static final RandVar SMOKE_T2_RV = new RandVar("Smoke_t2",
			new BooleanDomain());
	public static final RandVar TUB_T2_RV = new RandVar("Tub_t2",
			new BooleanDomain());
	public static final RandVar LUNG_T2_RV = new RandVar("Lung_t2",
			new BooleanDomain());
	public static final RandVar EITHER_T2_RV = new RandVar("Either_t2",
			new BooleanDomain());
	public static final RandVar XRAY_T2_RV = new RandVar("Xray_t2",
			new BooleanDomain());
	public static final RandVar DYSP_T2_RV = new RandVar("Dysp_t2",
			new BooleanDomain());
	public static final RandVar BRONC_T2_RV = new RandVar("Bronc_t2",
			new BooleanDomain());

	public static final RandVar ASIA_T3_RV = new RandVar("Asia_t3",
			new BooleanDomain());
	public static final RandVar SMOKE_T3_RV = new RandVar("Smoke_t3",
			new BooleanDomain());
	public static final RandVar TUB_T3_RV = new RandVar("Tub_t3",
			new BooleanDomain());
	public static final RandVar LUNG_T3_RV = new RandVar("Lung_t3",
			new BooleanDomain());
	public static final RandVar EITHER_T3_RV = new RandVar("Either_t3",
			new BooleanDomain());
	public static final RandVar XRAY_T3_RV = new RandVar("Xray_t3",
			new BooleanDomain());
	public static final RandVar DYSP_T3_RV = new RandVar("Dysp_t3",
			new BooleanDomain());
	public static final RandVar BRONC_T3_RV = new RandVar("Bronc_t3",
			new BooleanDomain());

	public static final RandVar ASIA_T4_RV = new RandVar("Asia_t4",
			new BooleanDomain());
	public static final RandVar SMOKE_T4_RV = new RandVar("Smoke_t4",
			new BooleanDomain());
	public static final RandVar TUB_T4_RV = new RandVar("Tub_t4",
			new BooleanDomain());
	public static final RandVar LUNG_T4_RV = new RandVar("Lung_t4",
			new BooleanDomain());
	public static final RandVar EITHER_T4_RV = new RandVar("Either_t4",
			new BooleanDomain());
	public static final RandVar XRAY_T4_RV = new RandVar("Xray_t4",
			new BooleanDomain());
	public static final RandVar DYSP_T4_RV = new RandVar("Dysp_t4",
			new BooleanDomain());
	public static final RandVar BRONC_T4_RV = new RandVar("Bronc_t4",
			new BooleanDomain());

	public static final RandVar ASIA_T5_RV = new RandVar("Asia_t5",
			new BooleanDomain());
	public static final RandVar SMOKE_T5_RV = new RandVar("Smoke_t5",
			new BooleanDomain());
	public static final RandVar TUB_T5_RV = new RandVar("Tub_t5",
			new BooleanDomain());
	public static final RandVar LUNG_T5_RV = new RandVar("Lung_t5",
			new BooleanDomain());
	public static final RandVar EITHER_T5_RV = new RandVar("Either_t5",
			new BooleanDomain());
	public static final RandVar XRAY_T5_RV = new RandVar("Xray_t5",
			new BooleanDomain());
	public static final RandVar DYSP_T5_RV = new RandVar("Dysp_t5",
			new BooleanDomain());
	public static final RandVar BRONC_T5_RV = new RandVar("Bronc_t5",
			new BooleanDomain());

	public static final RandVar ASIA_T6_RV = new RandVar("Asia_t6",
			new BooleanDomain());
	public static final RandVar SMOKE_T6_RV = new RandVar("Smoke_t6",
			new BooleanDomain());
	public static final RandVar TUB_T6_RV = new RandVar("Tub_t6",
			new BooleanDomain());
	public static final RandVar LUNG_T6_RV = new RandVar("Lung_t6",
			new BooleanDomain());
	public static final RandVar EITHER_T6_RV = new RandVar("Either_t6",
			new BooleanDomain());
	public static final RandVar XRAY_T6_RV = new RandVar("Xray_t6",
			new BooleanDomain());
	public static final RandVar DYSP_T6_RV = new RandVar("Dysp_t6",
			new BooleanDomain());
	public static final RandVar BRONC_T6_RV = new RandVar("Bronc_t6",
			new BooleanDomain());

	public static final RandVar ASIA_T7_RV = new RandVar("Asia_t7",
			new BooleanDomain());
	public static final RandVar SMOKE_T7_RV = new RandVar("Smoke_t7",
			new BooleanDomain());
	public static final RandVar TUB_T7_RV = new RandVar("Tub_t7",
			new BooleanDomain());
	public static final RandVar LUNG_T7_RV = new RandVar("Lung_t7",
			new BooleanDomain());
	public static final RandVar EITHER_T7_RV = new RandVar("Either_t7",
			new BooleanDomain());
	public static final RandVar XRAY_T7_RV = new RandVar("Xray_t7",
			new BooleanDomain());
	public static final RandVar DYSP_T7_RV = new RandVar("Dysp_t7",
			new BooleanDomain());
	public static final RandVar BRONC_T7_RV = new RandVar("Bronc_t7",
			new BooleanDomain());

	public static final RandVar ASIA_T8_RV = new RandVar("Asia_t8",
			new BooleanDomain());
	public static final RandVar SMOKE_T8_RV = new RandVar("Smoke_t8",
			new BooleanDomain());
	public static final RandVar TUB_T8_RV = new RandVar("Tub_t8",
			new BooleanDomain());
	public static final RandVar LUNG_T8_RV = new RandVar("Lung_t8",
			new BooleanDomain());
	public static final RandVar EITHER_T8_RV = new RandVar("Either_t8",
			new BooleanDomain());
	public static final RandVar XRAY_T8_RV = new RandVar("Xray_t8",
			new BooleanDomain());
	public static final RandVar DYSP_T8_RV = new RandVar("Dysp_t8",
			new BooleanDomain());
	public static final RandVar BRONC_T8_RV = new RandVar("Bronc_t8",
			new BooleanDomain());

	public static final RandVar ASIA_T9_RV = new RandVar("Asia_t9",
			new BooleanDomain());
	public static final RandVar SMOKE_T9_RV = new RandVar("Smoke_t9",
			new BooleanDomain());
	public static final RandVar TUB_T9_RV = new RandVar("Tub_t9",
			new BooleanDomain());
	public static final RandVar LUNG_T9_RV = new RandVar("Lung_t9",
			new BooleanDomain());
	public static final RandVar EITHER_T9_RV = new RandVar("Either_t9",
			new BooleanDomain());
	public static final RandVar XRAY_T9_RV = new RandVar("Xray_t9",
			new BooleanDomain());
	public static final RandVar DYSP_T9_RV = new RandVar("Dysp_t9",
			new BooleanDomain());
	public static final RandVar BRONC_T9_RV = new RandVar("Bronc_t9",
			new BooleanDomain());

	public static final RandVar ASIA_T10_RV = new RandVar("Asia_t10",
			new BooleanDomain());
	public static final RandVar SMOKE_T10_RV = new RandVar("Smoke_t10",
			new BooleanDomain());
	public static final RandVar TUB_T10_RV = new RandVar("Tub_t10",
			new BooleanDomain());
	public static final RandVar LUNG_T10_RV = new RandVar("Lung_t10",
			new BooleanDomain());
	public static final RandVar EITHER_T10_RV = new RandVar("Either_t10",
			new BooleanDomain());
	public static final RandVar XRAY_T10_RV = new RandVar("Xray_t10",
			new BooleanDomain());
	public static final RandVar DYSP_T10_RV = new RandVar("Dysp_t10",
			new BooleanDomain());
	public static final RandVar BRONC_T10_RV = new RandVar("Bronc_t10",
			new BooleanDomain());

	public static final RandVar ASIA_T11_RV = new RandVar("Asia_t11",
			new BooleanDomain());
	public static final RandVar SMOKE_T11_RV = new RandVar("Smoke_t11",
			new BooleanDomain());
	public static final RandVar TUB_T11_RV = new RandVar("Tub_t11",
			new BooleanDomain());
	public static final RandVar LUNG_T11_RV = new RandVar("Lung_t11",
			new BooleanDomain());
	public static final RandVar EITHER_T11_RV = new RandVar("Either_t11",
			new BooleanDomain());
	public static final RandVar XRAY_T11_RV = new RandVar("Xray_t11",
			new BooleanDomain());
	public static final RandVar DYSP_T11_RV = new RandVar("Dysp_t11",
			new BooleanDomain());
	public static final RandVar BRONC_T11_RV = new RandVar("Bronc_t11",
			new BooleanDomain());

	public static final RandVar ASIA_T12_RV = new RandVar("Asia_t12",
			new BooleanDomain());
	public static final RandVar SMOKE_T12_RV = new RandVar("Smoke_t12",
			new BooleanDomain());
	public static final RandVar TUB_T12_RV = new RandVar("Tub_t12",
			new BooleanDomain());
	public static final RandVar LUNG_T12_RV = new RandVar("Lung_t12",
			new BooleanDomain());
	public static final RandVar EITHER_T12_RV = new RandVar("Either_t12",
			new BooleanDomain());
	public static final RandVar XRAY_T12_RV = new RandVar("Xray_t12",
			new BooleanDomain());
	public static final RandVar DYSP_T12_RV = new RandVar("Dysp_t12",
			new BooleanDomain());
	public static final RandVar BRONC_T12_RV = new RandVar("Bronc_t12",
			new BooleanDomain());

	public static final RandVar ASIA_T13_RV = new RandVar("Asia_t13",
			new BooleanDomain());
	public static final RandVar SMOKE_T13_RV = new RandVar("Smoke_t13",
			new BooleanDomain());
	public static final RandVar TUB_T13_RV = new RandVar("Tub_t13",
			new BooleanDomain());
	public static final RandVar LUNG_T13_RV = new RandVar("Lung_t13",
			new BooleanDomain());
	public static final RandVar EITHER_T13_RV = new RandVar("Either_t13",
			new BooleanDomain());
	public static final RandVar XRAY_T13_RV = new RandVar("Xray_t13",
			new BooleanDomain());
	public static final RandVar DYSP_T13_RV = new RandVar("Dysp_t13",
			new BooleanDomain());
	public static final RandVar BRONC_T13_RV = new RandVar("Bronc_t13",
			new BooleanDomain());

	public static final RandVar ASIA_T14_RV = new RandVar("Asia_t14",
			new BooleanDomain());
	public static final RandVar SMOKE_T14_RV = new RandVar("Smoke_t14",
			new BooleanDomain());
	public static final RandVar TUB_T14_RV = new RandVar("Tub_t14",
			new BooleanDomain());
	public static final RandVar LUNG_T14_RV = new RandVar("Lung_t14",
			new BooleanDomain());
	public static final RandVar EITHER_T14_RV = new RandVar("Either_t14",
			new BooleanDomain());
	public static final RandVar XRAY_T14_RV = new RandVar("Xray_t14",
			new BooleanDomain());
	public static final RandVar DYSP_T14_RV = new RandVar("Dysp_t14",
			new BooleanDomain());
	public static final RandVar BRONC_T14_RV = new RandVar("Bronc_t14",
			new BooleanDomain());

	public static final RandVar ASIA_T15_RV = new RandVar("Asia_t15",
			new BooleanDomain());
	public static final RandVar SMOKE_T15_RV = new RandVar("Smoke_t15",
			new BooleanDomain());
	public static final RandVar TUB_T15_RV = new RandVar("Tub_t15",
			new BooleanDomain());
	public static final RandVar LUNG_T15_RV = new RandVar("Lung_t15",
			new BooleanDomain());
	public static final RandVar EITHER_T15_RV = new RandVar("Either_t15",
			new BooleanDomain());
	public static final RandVar XRAY_T15_RV = new RandVar("Xray_t15",
			new BooleanDomain());
	public static final RandVar DYSP_T15_RV = new RandVar("Dysp_t15",
			new BooleanDomain());
	public static final RandVar BRONC_T15_RV = new RandVar("Bronc_t15",
			new BooleanDomain());

	public static final RandVar ASIA_T16_RV = new RandVar("Asia_t16",
			new BooleanDomain());
	public static final RandVar SMOKE_T16_RV = new RandVar("Smoke_t16",
			new BooleanDomain());
	public static final RandVar TUB_T16_RV = new RandVar("Tub_t16",
			new BooleanDomain());
	public static final RandVar LUNG_T16_RV = new RandVar("Lung_t16",
			new BooleanDomain());
	public static final RandVar EITHER_T16_RV = new RandVar("Either_t16",
			new BooleanDomain());
	public static final RandVar XRAY_T16_RV = new RandVar("Xray_t16",
			new BooleanDomain());
	public static final RandVar DYSP_T16_RV = new RandVar("Dysp_t16",
			new BooleanDomain());
	public static final RandVar BRONC_T16_RV = new RandVar("Bronc_t16",
			new BooleanDomain());

	public static final RandVar ASIA_T17_RV = new RandVar("Asia_t17",
			new BooleanDomain());
	public static final RandVar SMOKE_T17_RV = new RandVar("Smoke_t17",
			new BooleanDomain());
	public static final RandVar TUB_T17_RV = new RandVar("Tub_t17",
			new BooleanDomain());
	public static final RandVar LUNG_T17_RV = new RandVar("Lung_t17",
			new BooleanDomain());
	public static final RandVar EITHER_T17_RV = new RandVar("Either_t17",
			new BooleanDomain());
	public static final RandVar XRAY_T17_RV = new RandVar("Xray_t17",
			new BooleanDomain());
	public static final RandVar DYSP_T17_RV = new RandVar("Dysp_t17",
			new BooleanDomain());
	public static final RandVar BRONC_T17_RV = new RandVar("Bronc_t17",
			new BooleanDomain());

	public static final RandVar ASIA_T18_RV = new RandVar("Asia_t18",
			new BooleanDomain());
	public static final RandVar SMOKE_T18_RV = new RandVar("Smoke_t18",
			new BooleanDomain());
	public static final RandVar TUB_T18_RV = new RandVar("Tub_t18",
			new BooleanDomain());
	public static final RandVar LUNG_T18_RV = new RandVar("Lung_t18",
			new BooleanDomain());
	public static final RandVar EITHER_T18_RV = new RandVar("Either_t18",
			new BooleanDomain());
	public static final RandVar XRAY_T18_RV = new RandVar("Xray_t18",
			new BooleanDomain());
	public static final RandVar DYSP_T18_RV = new RandVar("Dysp_t18",
			new BooleanDomain());
	public static final RandVar BRONC_T18_RV = new RandVar("Bronc_t18",
			new BooleanDomain());

	public static final RandVar ASIA_T19_RV = new RandVar("Asia_t19",
			new BooleanDomain());
	public static final RandVar SMOKE_T19_RV = new RandVar("Smoke_t19",
			new BooleanDomain());
	public static final RandVar TUB_T19_RV = new RandVar("Tub_t19",
			new BooleanDomain());
	public static final RandVar LUNG_T19_RV = new RandVar("Lung_t19",
			new BooleanDomain());
	public static final RandVar EITHER_T19_RV = new RandVar("Either_t19",
			new BooleanDomain());
	public static final RandVar XRAY_T19_RV = new RandVar("Xray_t19",
			new BooleanDomain());
	public static final RandVar DYSP_T19_RV = new RandVar("Dysp_t19",
			new BooleanDomain());
	public static final RandVar BRONC_T19_RV = new RandVar("Bronc_t19",
			new BooleanDomain());

	public static final RandVar ASIA_T20_RV = new RandVar("Asia_t20",
			new BooleanDomain());
	public static final RandVar SMOKE_T20_RV = new RandVar("Smoke_t20",
			new BooleanDomain());
	public static final RandVar TUB_T20_RV = new RandVar("Tub_t20",
			new BooleanDomain());
	public static final RandVar LUNG_T20_RV = new RandVar("Lung_t20",
			new BooleanDomain());
	public static final RandVar EITHER_T20_RV = new RandVar("Either_t20",
			new BooleanDomain());
	public static final RandVar XRAY_T20_RV = new RandVar("Xray_t20",
			new BooleanDomain());
	public static final RandVar DYSP_T20_RV = new RandVar("Dysp_t20",
			new BooleanDomain());
	public static final RandVar BRONC_T20_RV = new RandVar("Bronc_t20",
			new BooleanDomain());

}
