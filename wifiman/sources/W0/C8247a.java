package w0;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.sqlcipher.database.SQLiteDatabase;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.asn1.BER;
import org.snmp4j.mp.SnmpConstants;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8247a {

    /* renamed from: a, reason: collision with root package name */
    private final long f64328a;

    /* renamed from: b, reason: collision with root package name */
    public static final C2277a f64178b = new C2277a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final long f64184c = AbstractC8252f.a(0);

    /* renamed from: d, reason: collision with root package name */
    private static final long f64190d = AbstractC8252f.a(1);

    /* renamed from: e, reason: collision with root package name */
    private static final long f64196e = AbstractC8252f.a(2);

    /* renamed from: f, reason: collision with root package name */
    private static final long f64202f = AbstractC8252f.a(3);

    /* renamed from: g, reason: collision with root package name */
    private static final long f64208g = AbstractC8252f.a(4);

    /* renamed from: h, reason: collision with root package name */
    private static final long f64214h = AbstractC8252f.a(259);

    /* renamed from: i, reason: collision with root package name */
    private static final long f64220i = AbstractC8252f.a(260);

    /* renamed from: j, reason: collision with root package name */
    private static final long f64226j = AbstractC8252f.a(261);

    /* renamed from: k, reason: collision with root package name */
    private static final long f64232k = AbstractC8252f.a(262);

    /* renamed from: l, reason: collision with root package name */
    private static final long f64238l = AbstractC8252f.a(263);

    /* renamed from: m, reason: collision with root package name */
    private static final long f64244m = AbstractC8252f.a(280);

    /* renamed from: n, reason: collision with root package name */
    private static final long f64250n = AbstractC8252f.a(281);

    /* renamed from: o, reason: collision with root package name */
    private static final long f64256o = AbstractC8252f.a(282);

    /* renamed from: p, reason: collision with root package name */
    private static final long f64262p = AbstractC8252f.a(283);

    /* renamed from: q, reason: collision with root package name */
    private static final long f64268q = AbstractC8252f.a(5);

    /* renamed from: r, reason: collision with root package name */
    private static final long f64274r = AbstractC8252f.a(6);

    /* renamed from: s, reason: collision with root package name */
    private static final long f64280s = AbstractC8252f.a(19);

    /* renamed from: t, reason: collision with root package name */
    private static final long f64286t = AbstractC8252f.a(20);

    /* renamed from: u, reason: collision with root package name */
    private static final long f64292u = AbstractC8252f.a(21);

    /* renamed from: v, reason: collision with root package name */
    private static final long f64298v = AbstractC8252f.a(22);

    /* renamed from: w, reason: collision with root package name */
    private static final long f64304w = AbstractC8252f.a(23);

    /* renamed from: x, reason: collision with root package name */
    private static final long f64310x = AbstractC8252f.a(268);

    /* renamed from: y, reason: collision with root package name */
    private static final long f64316y = AbstractC8252f.a(269);

    /* renamed from: z, reason: collision with root package name */
    private static final long f64322z = AbstractC8252f.a(270);

    /* renamed from: A, reason: collision with root package name */
    private static final long f64040A = AbstractC8252f.a(271);

    /* renamed from: B, reason: collision with root package name */
    private static final long f64046B = AbstractC8252f.a(24);

    /* renamed from: C, reason: collision with root package name */
    private static final long f64052C = AbstractC8252f.a(25);

    /* renamed from: D, reason: collision with root package name */
    private static final long f64058D = AbstractC8252f.a(26);

    /* renamed from: E, reason: collision with root package name */
    private static final long f64063E = AbstractC8252f.a(27);

    /* renamed from: F, reason: collision with root package name */
    private static final long f64068F = AbstractC8252f.a(28);

    /* renamed from: G, reason: collision with root package name */
    private static final long f64073G = AbstractC8252f.a(7);

    /* renamed from: H, reason: collision with root package name */
    private static final long f64078H = AbstractC8252f.a(8);

    /* renamed from: I, reason: collision with root package name */
    private static final long f64083I = AbstractC8252f.a(9);

    /* renamed from: J, reason: collision with root package name */
    private static final long f64088J = AbstractC8252f.a(10);

    /* renamed from: K, reason: collision with root package name */
    private static final long f64093K = AbstractC8252f.a(11);

    /* renamed from: L, reason: collision with root package name */
    private static final long f64098L = AbstractC8252f.a(12);

    /* renamed from: M, reason: collision with root package name */
    private static final long f64103M = AbstractC8252f.a(13);

    /* renamed from: N, reason: collision with root package name */
    private static final long f64108N = AbstractC8252f.a(14);

    /* renamed from: O, reason: collision with root package name */
    private static final long f64113O = AbstractC8252f.a(15);

    /* renamed from: P, reason: collision with root package name */
    private static final long f64118P = AbstractC8252f.a(16);

    /* renamed from: Q, reason: collision with root package name */
    private static final long f64123Q = AbstractC8252f.a(81);

    /* renamed from: R, reason: collision with root package name */
    private static final long f64128R = AbstractC8252f.a(69);

    /* renamed from: S, reason: collision with root package name */
    private static final long f64133S = AbstractC8252f.a(17);

    /* renamed from: T, reason: collision with root package name */
    private static final long f64138T = AbstractC8252f.a(70);

    /* renamed from: U, reason: collision with root package name */
    private static final long f64143U = AbstractC8252f.a(18);

    /* renamed from: V, reason: collision with root package name */
    private static final long f64148V = AbstractC8252f.a(29);

    /* renamed from: W, reason: collision with root package name */
    private static final long f64153W = AbstractC8252f.a(30);

    /* renamed from: X, reason: collision with root package name */
    private static final long f64158X = AbstractC8252f.a(31);

    /* renamed from: Y, reason: collision with root package name */
    private static final long f64163Y = AbstractC8252f.a(32);

    /* renamed from: Z, reason: collision with root package name */
    private static final long f64168Z = AbstractC8252f.a(33);

    /* renamed from: a0, reason: collision with root package name */
    private static final long f64173a0 = AbstractC8252f.a(34);

    /* renamed from: b0, reason: collision with root package name */
    private static final long f64179b0 = AbstractC8252f.a(35);

    /* renamed from: c0, reason: collision with root package name */
    private static final long f64185c0 = AbstractC8252f.a(36);

    /* renamed from: d0, reason: collision with root package name */
    private static final long f64191d0 = AbstractC8252f.a(37);

    /* renamed from: e0, reason: collision with root package name */
    private static final long f64197e0 = AbstractC8252f.a(38);

    /* renamed from: f0, reason: collision with root package name */
    private static final long f64203f0 = AbstractC8252f.a(39);

    /* renamed from: g0, reason: collision with root package name */
    private static final long f64209g0 = AbstractC8252f.a(40);

    /* renamed from: h0, reason: collision with root package name */
    private static final long f64215h0 = AbstractC8252f.a(41);

    /* renamed from: i0, reason: collision with root package name */
    private static final long f64221i0 = AbstractC8252f.a(42);

    /* renamed from: j0, reason: collision with root package name */
    private static final long f64227j0 = AbstractC8252f.a(43);

    /* renamed from: k0, reason: collision with root package name */
    private static final long f64233k0 = AbstractC8252f.a(44);

    /* renamed from: l0, reason: collision with root package name */
    private static final long f64239l0 = AbstractC8252f.a(45);

    /* renamed from: m0, reason: collision with root package name */
    private static final long f64245m0 = AbstractC8252f.a(46);

    /* renamed from: n0, reason: collision with root package name */
    private static final long f64251n0 = AbstractC8252f.a(47);

    /* renamed from: o0, reason: collision with root package name */
    private static final long f64257o0 = AbstractC8252f.a(48);

    /* renamed from: p0, reason: collision with root package name */
    private static final long f64263p0 = AbstractC8252f.a(49);

    /* renamed from: q0, reason: collision with root package name */
    private static final long f64269q0 = AbstractC8252f.a(50);

    /* renamed from: r0, reason: collision with root package name */
    private static final long f64275r0 = AbstractC8252f.a(51);

    /* renamed from: s0, reason: collision with root package name */
    private static final long f64281s0 = AbstractC8252f.a(52);

    /* renamed from: t0, reason: collision with root package name */
    private static final long f64287t0 = AbstractC8252f.a(53);

    /* renamed from: u0, reason: collision with root package name */
    private static final long f64293u0 = AbstractC8252f.a(54);

    /* renamed from: v0, reason: collision with root package name */
    private static final long f64299v0 = AbstractC8252f.a(55);

    /* renamed from: w0, reason: collision with root package name */
    private static final long f64305w0 = AbstractC8252f.a(56);

    /* renamed from: x0, reason: collision with root package name */
    private static final long f64311x0 = AbstractC8252f.a(57);

    /* renamed from: y0, reason: collision with root package name */
    private static final long f64317y0 = AbstractC8252f.a(58);

    /* renamed from: z0, reason: collision with root package name */
    private static final long f64323z0 = AbstractC8252f.a(59);

    /* renamed from: A0, reason: collision with root package name */
    private static final long f64041A0 = AbstractC8252f.a(60);

    /* renamed from: B0, reason: collision with root package name */
    private static final long f64047B0 = AbstractC8252f.a(61);

    /* renamed from: C0, reason: collision with root package name */
    private static final long f64053C0 = AbstractC8252f.a(62);

    /* renamed from: D0, reason: collision with root package name */
    private static final long f64059D0 = AbstractC8252f.a(63);

    /* renamed from: E0, reason: collision with root package name */
    private static final long f64064E0 = AbstractC8252f.a(64);

    /* renamed from: F0, reason: collision with root package name */
    private static final long f64069F0 = AbstractC8252f.a(65);

    /* renamed from: G0, reason: collision with root package name */
    private static final long f64074G0 = AbstractC8252f.a(66);

    /* renamed from: H0, reason: collision with root package name */
    private static final long f64079H0 = AbstractC8252f.a(67);

    /* renamed from: I0, reason: collision with root package name */
    private static final long f64084I0 = AbstractC8252f.a(112);

    /* renamed from: J0, reason: collision with root package name */
    private static final long f64089J0 = AbstractC8252f.a(111);

    /* renamed from: K0, reason: collision with root package name */
    private static final long f64094K0 = AbstractC8252f.a(113);

    /* renamed from: L0, reason: collision with root package name */
    private static final long f64099L0 = AbstractC8252f.a(114);

    /* renamed from: M0, reason: collision with root package name */
    private static final long f64104M0 = AbstractC8252f.a(115);

    /* renamed from: N0, reason: collision with root package name */
    private static final long f64109N0 = AbstractC8252f.a(116);

    /* renamed from: O0, reason: collision with root package name */
    private static final long f64114O0 = AbstractC8252f.a(117);

    /* renamed from: P0, reason: collision with root package name */
    private static final long f64119P0 = AbstractC8252f.a(118);

    /* renamed from: Q0, reason: collision with root package name */
    private static final long f64124Q0 = AbstractC8252f.a(119);

    /* renamed from: R0, reason: collision with root package name */
    private static final long f64129R0 = AbstractC8252f.a(120);

    /* renamed from: S0, reason: collision with root package name */
    private static final long f64134S0 = AbstractC8252f.a(121);

    /* renamed from: T0, reason: collision with root package name */
    private static final long f64139T0 = AbstractC8252f.a(122);

    /* renamed from: U0, reason: collision with root package name */
    private static final long f64144U0 = AbstractC8252f.a(123);

    /* renamed from: V0, reason: collision with root package name */
    private static final long f64149V0 = AbstractC8252f.a(124);

    /* renamed from: W0, reason: collision with root package name */
    private static final long f64154W0 = AbstractC8252f.a(277);

    /* renamed from: X0, reason: collision with root package name */
    private static final long f64159X0 = AbstractC8252f.a(278);

    /* renamed from: Y0, reason: collision with root package name */
    private static final long f64164Y0 = AbstractC8252f.a(279);

    /* renamed from: Z0, reason: collision with root package name */
    private static final long f64169Z0 = AbstractC8252f.a(68);

    /* renamed from: a1, reason: collision with root package name */
    private static final long f64174a1 = AbstractC8252f.a(71);

    /* renamed from: b1, reason: collision with root package name */
    private static final long f64180b1 = AbstractC8252f.a(72);

    /* renamed from: c1, reason: collision with root package name */
    private static final long f64186c1 = AbstractC8252f.a(76);

    /* renamed from: d1, reason: collision with root package name */
    private static final long f64192d1 = AbstractC8252f.a(73);

    /* renamed from: e1, reason: collision with root package name */
    private static final long f64198e1 = AbstractC8252f.a(74);

    /* renamed from: f1, reason: collision with root package name */
    private static final long f64204f1 = AbstractC8252f.a(75);

    /* renamed from: g1, reason: collision with root package name */
    private static final long f64210g1 = AbstractC8252f.a(77);

    /* renamed from: h1, reason: collision with root package name */
    private static final long f64216h1 = AbstractC8252f.a(78);

    /* renamed from: i1, reason: collision with root package name */
    private static final long f64222i1 = AbstractC8252f.a(79);

    /* renamed from: j1, reason: collision with root package name */
    private static final long f64228j1 = AbstractC8252f.a(80);

    /* renamed from: k1, reason: collision with root package name */
    private static final long f64234k1 = AbstractC8252f.a(82);

    /* renamed from: l1, reason: collision with root package name */
    private static final long f64240l1 = AbstractC8252f.a(83);

    /* renamed from: m1, reason: collision with root package name */
    private static final long f64246m1 = AbstractC8252f.a(84);

    /* renamed from: n1, reason: collision with root package name */
    private static final long f64252n1 = AbstractC8252f.a(92);

    /* renamed from: o1, reason: collision with root package name */
    private static final long f64258o1 = AbstractC8252f.a(93);

    /* renamed from: p1, reason: collision with root package name */
    private static final long f64264p1 = AbstractC8252f.a(94);

    /* renamed from: q1, reason: collision with root package name */
    private static final long f64270q1 = AbstractC8252f.a(95);

    /* renamed from: r1, reason: collision with root package name */
    private static final long f64276r1 = AbstractC8252f.a(96);

    /* renamed from: s1, reason: collision with root package name */
    private static final long f64282s1 = AbstractC8252f.a(97);

    /* renamed from: t1, reason: collision with root package name */
    private static final long f64288t1 = AbstractC8252f.a(98);

    /* renamed from: u1, reason: collision with root package name */
    private static final long f64294u1 = AbstractC8252f.a(99);

    /* renamed from: v1, reason: collision with root package name */
    private static final long f64300v1 = AbstractC8252f.a(100);

    /* renamed from: w1, reason: collision with root package name */
    private static final long f64306w1 = AbstractC8252f.a(101);

    /* renamed from: x1, reason: collision with root package name */
    private static final long f64312x1 = AbstractC8252f.a(102);

    /* renamed from: y1, reason: collision with root package name */
    private static final long f64318y1 = AbstractC8252f.a(103);

    /* renamed from: z1, reason: collision with root package name */
    private static final long f64324z1 = AbstractC8252f.a(104);

    /* renamed from: A1, reason: collision with root package name */
    private static final long f64042A1 = AbstractC8252f.a(105);

    /* renamed from: B1, reason: collision with root package name */
    private static final long f64048B1 = AbstractC8252f.a(106);

    /* renamed from: C1, reason: collision with root package name */
    private static final long f64054C1 = AbstractC8252f.a(107);

    /* renamed from: D1, reason: collision with root package name */
    private static final long f64060D1 = AbstractC8252f.a(108);

    /* renamed from: E1, reason: collision with root package name */
    private static final long f64065E1 = AbstractC8252f.a(109);

    /* renamed from: F1, reason: collision with root package name */
    private static final long f64070F1 = AbstractC8252f.a(110);

    /* renamed from: G1, reason: collision with root package name */
    private static final long f64075G1 = AbstractC8252f.a(188);

    /* renamed from: H1, reason: collision with root package name */
    private static final long f64080H1 = AbstractC8252f.a(189);

    /* renamed from: I1, reason: collision with root package name */
    private static final long f64085I1 = AbstractC8252f.a(190);

    /* renamed from: J1, reason: collision with root package name */
    private static final long f64090J1 = AbstractC8252f.a(191);

    /* renamed from: K1, reason: collision with root package name */
    private static final long f64095K1 = AbstractC8252f.a(192);

    /* renamed from: L1, reason: collision with root package name */
    private static final long f64100L1 = AbstractC8252f.a(193);

    /* renamed from: M1, reason: collision with root package name */
    private static final long f64105M1 = AbstractC8252f.a(194);

    /* renamed from: N1, reason: collision with root package name */
    private static final long f64110N1 = AbstractC8252f.a(195);

    /* renamed from: O1, reason: collision with root package name */
    private static final long f64115O1 = AbstractC8252f.a(196);

    /* renamed from: P1, reason: collision with root package name */
    private static final long f64120P1 = AbstractC8252f.a(197);

    /* renamed from: Q1, reason: collision with root package name */
    private static final long f64125Q1 = AbstractC8252f.a(198);

    /* renamed from: R1, reason: collision with root package name */
    private static final long f64130R1 = AbstractC8252f.a(199);

    /* renamed from: S1, reason: collision with root package name */
    private static final long f64135S1 = AbstractC8252f.a(200);

    /* renamed from: T1, reason: collision with root package name */
    private static final long f64140T1 = AbstractC8252f.a(201);

    /* renamed from: U1, reason: collision with root package name */
    private static final long f64145U1 = AbstractC8252f.a(202);

    /* renamed from: V1, reason: collision with root package name */
    private static final long f64150V1 = AbstractC8252f.a(203);

    /* renamed from: W1, reason: collision with root package name */
    private static final long f64155W1 = AbstractC8252f.a(125);

    /* renamed from: X1, reason: collision with root package name */
    private static final long f64160X1 = AbstractC8252f.a(131);

    /* renamed from: Y1, reason: collision with root package name */
    private static final long f64165Y1 = AbstractC8252f.a(132);

    /* renamed from: Z1, reason: collision with root package name */
    private static final long f64170Z1 = AbstractC8252f.a(133);

    /* renamed from: a2, reason: collision with root package name */
    private static final long f64175a2 = AbstractC8252f.a(134);

    /* renamed from: b2, reason: collision with root package name */
    private static final long f64181b2 = AbstractC8252f.a(135);

    /* renamed from: c2, reason: collision with root package name */
    private static final long f64187c2 = AbstractC8252f.a(136);

    /* renamed from: d2, reason: collision with root package name */
    private static final long f64193d2 = AbstractC8252f.a(137);

    /* renamed from: e2, reason: collision with root package name */
    private static final long f64199e2 = AbstractC8252f.a(138);

    /* renamed from: f2, reason: collision with root package name */
    private static final long f64205f2 = AbstractC8252f.a(139);

    /* renamed from: g2, reason: collision with root package name */
    private static final long f64211g2 = AbstractC8252f.a(ModuleDescriptor.MODULE_VERSION);

    /* renamed from: h2, reason: collision with root package name */
    private static final long f64217h2 = AbstractC8252f.a(141);

    /* renamed from: i2, reason: collision with root package name */
    private static final long f64223i2 = AbstractC8252f.a(142);

    /* renamed from: j2, reason: collision with root package name */
    private static final long f64229j2 = AbstractC8252f.a(143);

    /* renamed from: k2, reason: collision with root package name */
    private static final long f64235k2 = AbstractC8252f.a(144);

    /* renamed from: l2, reason: collision with root package name */
    private static final long f64241l2 = AbstractC8252f.a(145);

    /* renamed from: m2, reason: collision with root package name */
    private static final long f64247m2 = AbstractC8252f.a(146);

    /* renamed from: n2, reason: collision with root package name */
    private static final long f64253n2 = AbstractC8252f.a(147);

    /* renamed from: o2, reason: collision with root package name */
    private static final long f64259o2 = AbstractC8252f.a(148);

    /* renamed from: p2, reason: collision with root package name */
    private static final long f64265p2 = AbstractC8252f.a(149);

    /* renamed from: q2, reason: collision with root package name */
    private static final long f64271q2 = AbstractC8252f.a(150);

    /* renamed from: r2, reason: collision with root package name */
    private static final long f64277r2 = AbstractC8252f.a(151);

    /* renamed from: s2, reason: collision with root package name */
    private static final long f64283s2 = AbstractC8252f.a(152);

    /* renamed from: t2, reason: collision with root package name */
    private static final long f64289t2 = AbstractC8252f.a(153);

    /* renamed from: u2, reason: collision with root package name */
    private static final long f64295u2 = AbstractC8252f.a(154);

    /* renamed from: v2, reason: collision with root package name */
    private static final long f64301v2 = AbstractC8252f.a(155);

    /* renamed from: w2, reason: collision with root package name */
    private static final long f64307w2 = AbstractC8252f.a(156);

    /* renamed from: x2, reason: collision with root package name */
    private static final long f64313x2 = AbstractC8252f.a(157);

    /* renamed from: y2, reason: collision with root package name */
    private static final long f64319y2 = AbstractC8252f.a(158);

    /* renamed from: z2, reason: collision with root package name */
    private static final long f64325z2 = AbstractC8252f.a(159);

    /* renamed from: A2, reason: collision with root package name */
    private static final long f64043A2 = AbstractC8252f.a(160);

    /* renamed from: B2, reason: collision with root package name */
    private static final long f64049B2 = AbstractC8252f.a(SnmpConstants.DEFAULT_COMMAND_RESPONDER_PORT);

    /* renamed from: C2, reason: collision with root package name */
    private static final long f64055C2 = AbstractC8252f.a(SnmpConstants.DEFAULT_NOTIFICATION_RECEIVER_PORT);

    /* renamed from: D2, reason: collision with root package name */
    private static final long f64061D2 = AbstractC8252f.a(163);

    /* renamed from: E2, reason: collision with root package name */
    private static final long f64066E2 = AbstractC8252f.a(126);

    /* renamed from: F2, reason: collision with root package name */
    private static final long f64071F2 = AbstractC8252f.a(BER.MAX_OID_LENGTH);

    /* renamed from: G2, reason: collision with root package name */
    private static final long f64076G2 = AbstractC8252f.a(85);

    /* renamed from: H2, reason: collision with root package name */
    private static final long f64081H2 = AbstractC8252f.a(86);

    /* renamed from: I2, reason: collision with root package name */
    private static final long f64086I2 = AbstractC8252f.a(130);

    /* renamed from: J2, reason: collision with root package name */
    private static final long f64091J2 = AbstractC8252f.a(87);

    /* renamed from: K2, reason: collision with root package name */
    private static final long f64096K2 = AbstractC8252f.a(88);

    /* renamed from: L2, reason: collision with root package name */
    private static final long f64101L2 = AbstractC8252f.a(89);

    /* renamed from: M2, reason: collision with root package name */
    private static final long f64106M2 = AbstractC8252f.a(90);

    /* renamed from: N2, reason: collision with root package name */
    private static final long f64111N2 = AbstractC8252f.a(128);

    /* renamed from: O2, reason: collision with root package name */
    private static final long f64116O2 = AbstractC8252f.a(222);

    /* renamed from: P2, reason: collision with root package name */
    private static final long f64121P2 = AbstractC8252f.a(129);

    /* renamed from: Q2, reason: collision with root package name */
    private static final long f64126Q2 = AbstractC8252f.a(226);

    /* renamed from: R2, reason: collision with root package name */
    private static final long f64131R2 = AbstractC8252f.a(272);

    /* renamed from: S2, reason: collision with root package name */
    private static final long f64136S2 = AbstractC8252f.a(273);

    /* renamed from: T2, reason: collision with root package name */
    private static final long f64141T2 = AbstractC8252f.a(274);

    /* renamed from: U2, reason: collision with root package name */
    private static final long f64146U2 = AbstractC8252f.a(275);

    /* renamed from: V2, reason: collision with root package name */
    private static final long f64151V2 = AbstractC8252f.a(91);

    /* renamed from: W2, reason: collision with root package name */
    private static final long f64156W2 = AbstractC8252f.a(164);

    /* renamed from: X2, reason: collision with root package name */
    private static final long f64161X2 = AbstractC8252f.a(165);

    /* renamed from: Y2, reason: collision with root package name */
    private static final long f64166Y2 = AbstractC8252f.a(166);

    /* renamed from: Z2, reason: collision with root package name */
    private static final long f64171Z2 = AbstractC8252f.a(167);

    /* renamed from: a3, reason: collision with root package name */
    private static final long f64176a3 = AbstractC8252f.a(168);

    /* renamed from: b3, reason: collision with root package name */
    private static final long f64182b3 = AbstractC8252f.a(169);

    /* renamed from: c3, reason: collision with root package name */
    private static final long f64188c3 = AbstractC8252f.a(170);

    /* renamed from: d3, reason: collision with root package name */
    private static final long f64194d3 = AbstractC8252f.a(171);

    /* renamed from: e3, reason: collision with root package name */
    private static final long f64200e3 = AbstractC8252f.a(172);

    /* renamed from: f3, reason: collision with root package name */
    private static final long f64206f3 = AbstractC8252f.a(173);

    /* renamed from: g3, reason: collision with root package name */
    private static final long f64212g3 = AbstractC8252f.a(174);

    /* renamed from: h3, reason: collision with root package name */
    private static final long f64218h3 = AbstractC8252f.a(175);

    /* renamed from: i3, reason: collision with root package name */
    private static final long f64224i3 = AbstractC8252f.a(176);

    /* renamed from: j3, reason: collision with root package name */
    private static final long f64230j3 = AbstractC8252f.a(177);

    /* renamed from: k3, reason: collision with root package name */
    private static final long f64236k3 = AbstractC8252f.a(178);

    /* renamed from: l3, reason: collision with root package name */
    private static final long f64242l3 = AbstractC8252f.a(179);

    /* renamed from: m3, reason: collision with root package name */
    private static final long f64248m3 = AbstractC8252f.a(180);

    /* renamed from: n3, reason: collision with root package name */
    private static final long f64254n3 = AbstractC8252f.a(181);

    /* renamed from: o3, reason: collision with root package name */
    private static final long f64260o3 = AbstractC8252f.a(182);

    /* renamed from: p3, reason: collision with root package name */
    private static final long f64266p3 = AbstractC8252f.a(183);

    /* renamed from: q3, reason: collision with root package name */
    private static final long f64272q3 = AbstractC8252f.a(184);

    /* renamed from: r3, reason: collision with root package name */
    private static final long f64278r3 = AbstractC8252f.a(185);

    /* renamed from: s3, reason: collision with root package name */
    private static final long f64284s3 = AbstractC8252f.a(186);

    /* renamed from: t3, reason: collision with root package name */
    private static final long f64290t3 = AbstractC8252f.a(187);

    /* renamed from: u3, reason: collision with root package name */
    private static final long f64296u3 = AbstractC8252f.a(204);

    /* renamed from: v3, reason: collision with root package name */
    private static final long f64302v3 = AbstractC8252f.a(205);

    /* renamed from: w3, reason: collision with root package name */
    private static final long f64308w3 = AbstractC8252f.a(206);

    /* renamed from: x3, reason: collision with root package name */
    private static final long f64314x3 = AbstractC8252f.a(207);

    /* renamed from: y3, reason: collision with root package name */
    private static final long f64320y3 = AbstractC8252f.a(208);

    /* renamed from: z3, reason: collision with root package name */
    private static final long f64326z3 = AbstractC8252f.a(209);

    /* renamed from: A3, reason: collision with root package name */
    private static final long f64044A3 = AbstractC8252f.a(210);

    /* renamed from: B3, reason: collision with root package name */
    private static final long f64050B3 = AbstractC8252f.a(211);

    /* renamed from: C3, reason: collision with root package name */
    private static final long f64056C3 = AbstractC8252f.a(212);

    /* renamed from: D3, reason: collision with root package name */
    private static final long f64062D3 = AbstractC8252f.a(213);

    /* renamed from: E3, reason: collision with root package name */
    private static final long f64067E3 = AbstractC8252f.a(214);

    /* renamed from: F3, reason: collision with root package name */
    private static final long f64072F3 = AbstractC8252f.a(215);

    /* renamed from: G3, reason: collision with root package name */
    private static final long f64077G3 = AbstractC8252f.a(216);

    /* renamed from: H3, reason: collision with root package name */
    private static final long f64082H3 = AbstractC8252f.a(217);

    /* renamed from: I3, reason: collision with root package name */
    private static final long f64087I3 = AbstractC8252f.a(218);

    /* renamed from: J3, reason: collision with root package name */
    private static final long f64092J3 = AbstractC8252f.a(219);

    /* renamed from: K3, reason: collision with root package name */
    private static final long f64097K3 = AbstractC8252f.a(220);

    /* renamed from: L3, reason: collision with root package name */
    private static final long f64102L3 = AbstractC8252f.a(221);

    /* renamed from: M3, reason: collision with root package name */
    private static final long f64107M3 = AbstractC8252f.a(223);

    /* renamed from: N3, reason: collision with root package name */
    private static final long f64112N3 = AbstractC8252f.a(224);

    /* renamed from: O3, reason: collision with root package name */
    private static final long f64117O3 = AbstractC8252f.a(276);

    /* renamed from: P3, reason: collision with root package name */
    private static final long f64122P3 = AbstractC8252f.a(225);

    /* renamed from: Q3, reason: collision with root package name */
    private static final long f64127Q3 = AbstractC8252f.a(229);

    /* renamed from: R3, reason: collision with root package name */
    private static final long f64132R3 = AbstractC8252f.a(230);

    /* renamed from: S3, reason: collision with root package name */
    private static final long f64137S3 = AbstractC8252f.a(231);

    /* renamed from: T3, reason: collision with root package name */
    private static final long f64142T3 = AbstractC8252f.a(232);

    /* renamed from: U3, reason: collision with root package name */
    private static final long f64147U3 = AbstractC8252f.a(233);

    /* renamed from: V3, reason: collision with root package name */
    private static final long f64152V3 = AbstractC8252f.a(234);

    /* renamed from: W3, reason: collision with root package name */
    private static final long f64157W3 = AbstractC8252f.a(235);

    /* renamed from: X3, reason: collision with root package name */
    private static final long f64162X3 = AbstractC8252f.a(236);

    /* renamed from: Y3, reason: collision with root package name */
    private static final long f64167Y3 = AbstractC8252f.a(237);

    /* renamed from: Z3, reason: collision with root package name */
    private static final long f64172Z3 = AbstractC8252f.a(238);

    /* renamed from: a4, reason: collision with root package name */
    private static final long f64177a4 = AbstractC8252f.a(239);

    /* renamed from: b4, reason: collision with root package name */
    private static final long f64183b4 = AbstractC8252f.a(240);

    /* renamed from: c4, reason: collision with root package name */
    private static final long f64189c4 = AbstractC8252f.a(241);

    /* renamed from: d4, reason: collision with root package name */
    private static final long f64195d4 = AbstractC8252f.a(242);

    /* renamed from: e4, reason: collision with root package name */
    private static final long f64201e4 = AbstractC8252f.a(243);

    /* renamed from: f4, reason: collision with root package name */
    private static final long f64207f4 = AbstractC8252f.a(244);

    /* renamed from: g4, reason: collision with root package name */
    private static final long f64213g4 = AbstractC8252f.a(245);

    /* renamed from: h4, reason: collision with root package name */
    private static final long f64219h4 = AbstractC8252f.a(246);

    /* renamed from: i4, reason: collision with root package name */
    private static final long f64225i4 = AbstractC8252f.a(247);

    /* renamed from: j4, reason: collision with root package name */
    private static final long f64231j4 = AbstractC8252f.a(248);

    /* renamed from: k4, reason: collision with root package name */
    private static final long f64237k4 = AbstractC8252f.a(249);

    /* renamed from: l4, reason: collision with root package name */
    private static final long f64243l4 = AbstractC8252f.a(SQLiteDatabase.MAX_SQL_CACHE_SIZE);

    /* renamed from: m4, reason: collision with root package name */
    private static final long f64249m4 = AbstractC8252f.a(251);

    /* renamed from: n4, reason: collision with root package name */
    private static final long f64255n4 = AbstractC8252f.a(252);

    /* renamed from: o4, reason: collision with root package name */
    private static final long f64261o4 = AbstractC8252f.a(253);

    /* renamed from: p4, reason: collision with root package name */
    private static final long f64267p4 = AbstractC8252f.a(254);

    /* renamed from: q4, reason: collision with root package name */
    private static final long f64273q4 = AbstractC8252f.a(255);

    /* renamed from: r4, reason: collision with root package name */
    private static final long f64279r4 = AbstractC8252f.a(PSKKeyManager.MAX_KEY_LENGTH_BYTES);

    /* renamed from: s4, reason: collision with root package name */
    private static final long f64285s4 = AbstractC8252f.a(257);

    /* renamed from: t4, reason: collision with root package name */
    private static final long f64291t4 = AbstractC8252f.a(258);

    /* renamed from: u4, reason: collision with root package name */
    private static final long f64297u4 = AbstractC8252f.a(264);

    /* renamed from: v4, reason: collision with root package name */
    private static final long f64303v4 = AbstractC8252f.a(265);

    /* renamed from: w4, reason: collision with root package name */
    private static final long f64309w4 = AbstractC8252f.a(266);

    /* renamed from: x4, reason: collision with root package name */
    private static final long f64315x4 = AbstractC8252f.a(267);

    /* renamed from: y4, reason: collision with root package name */
    private static final long f64321y4 = AbstractC8252f.a(284);

    /* renamed from: z4, reason: collision with root package name */
    private static final long f64327z4 = AbstractC8252f.a(285);

    /* renamed from: A4, reason: collision with root package name */
    private static final long f64045A4 = AbstractC8252f.a(286);

    /* renamed from: B4, reason: collision with root package name */
    private static final long f64051B4 = AbstractC8252f.a(287);

    /* renamed from: C4, reason: collision with root package name */
    private static final long f64057C4 = AbstractC8252f.a(288);

    /* renamed from: w0.a$a, reason: collision with other inner class name */
    public static final class C2277a {
        public /* synthetic */ C2277a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return C8247a.f64208g;
        }

        public final long b() {
            return C8247a.f64304w;
        }

        public final long c() {
            return C8247a.f64286t;
        }

        public final long d() {
            return C8247a.f64292u;
        }

        public final long e() {
            return C8247a.f64298v;
        }

        public final long f() {
            return C8247a.f64280s;
        }

        public final long g() {
            return C8247a.f64074G0;
        }

        public final long h() {
            return C8247a.f64089J0;
        }

        public final long i() {
            return C8247a.f64043A2;
        }

        public final long j() {
            return C8247a.f64258o1;
        }

        public final long k() {
            return C8247a.f64252n1;
        }

        public final long l() {
            return C8247a.f64047B0;
        }

        private C2277a() {
        }
    }

    private /* synthetic */ C8247a(long j10) {
        this.f64328a = j10;
    }

    public static final /* synthetic */ C8247a m(long j10) {
        return new C8247a(j10);
    }

    public static long n(long j10) {
        return j10;
    }

    public static boolean o(long j10, Object obj) {
        return (obj instanceof C8247a) && j10 == ((C8247a) obj).s();
    }

    public static final boolean p(long j10, long j11) {
        return j10 == j11;
    }

    public static int q(long j10) {
        return Long.hashCode(j10);
    }

    public static String r(long j10) {
        return "Key code: " + j10;
    }

    public boolean equals(Object obj) {
        return o(this.f64328a, obj);
    }

    public int hashCode() {
        return q(this.f64328a);
    }

    public final /* synthetic */ long s() {
        return this.f64328a;
    }

    public String toString() {
        return r(this.f64328a);
    }
}
