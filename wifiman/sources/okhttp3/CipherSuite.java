package okhttp3;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.t;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u000b2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007¨\u0006\r"}, d2 = {"Lokhttp3/CipherSuite;", "", "", "javaName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", SnmpConfigurator.O_AUTH_PROTOCOL, "Ljava/lang/String;", SnmpConfigurator.O_COMMUNITY, SnmpConfigurator.O_BIND_ADDRESS, "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CipherSuite {

    /* renamed from: A, reason: collision with root package name */
    public static final CipherSuite f55835A;

    /* renamed from: A0, reason: collision with root package name */
    public static final CipherSuite f55836A0;

    /* renamed from: B, reason: collision with root package name */
    public static final CipherSuite f55837B;

    /* renamed from: B0, reason: collision with root package name */
    public static final CipherSuite f55838B0;

    /* renamed from: C, reason: collision with root package name */
    public static final CipherSuite f55839C;

    /* renamed from: C0, reason: collision with root package name */
    public static final CipherSuite f55840C0;

    /* renamed from: D, reason: collision with root package name */
    public static final CipherSuite f55841D;

    /* renamed from: D0, reason: collision with root package name */
    public static final CipherSuite f55842D0;

    /* renamed from: E, reason: collision with root package name */
    public static final CipherSuite f55843E;

    /* renamed from: E0, reason: collision with root package name */
    public static final CipherSuite f55844E0;

    /* renamed from: F, reason: collision with root package name */
    public static final CipherSuite f55845F;

    /* renamed from: F0, reason: collision with root package name */
    public static final CipherSuite f55846F0;

    /* renamed from: G, reason: collision with root package name */
    public static final CipherSuite f55847G;

    /* renamed from: G0, reason: collision with root package name */
    public static final CipherSuite f55848G0;

    /* renamed from: H, reason: collision with root package name */
    public static final CipherSuite f55849H;

    /* renamed from: H0, reason: collision with root package name */
    public static final CipherSuite f55850H0;

    /* renamed from: I, reason: collision with root package name */
    public static final CipherSuite f55851I;

    /* renamed from: I0, reason: collision with root package name */
    public static final CipherSuite f55852I0;

    /* renamed from: J, reason: collision with root package name */
    public static final CipherSuite f55853J;

    /* renamed from: J0, reason: collision with root package name */
    public static final CipherSuite f55854J0;

    /* renamed from: K, reason: collision with root package name */
    public static final CipherSuite f55855K;

    /* renamed from: K0, reason: collision with root package name */
    public static final CipherSuite f55856K0;

    /* renamed from: L, reason: collision with root package name */
    public static final CipherSuite f55857L;

    /* renamed from: L0, reason: collision with root package name */
    public static final CipherSuite f55858L0;

    /* renamed from: M, reason: collision with root package name */
    public static final CipherSuite f55859M;

    /* renamed from: M0, reason: collision with root package name */
    public static final CipherSuite f55860M0;

    /* renamed from: N, reason: collision with root package name */
    public static final CipherSuite f55861N;

    /* renamed from: N0, reason: collision with root package name */
    public static final CipherSuite f55862N0;

    /* renamed from: O, reason: collision with root package name */
    public static final CipherSuite f55863O;

    /* renamed from: O0, reason: collision with root package name */
    public static final CipherSuite f55864O0;

    /* renamed from: P, reason: collision with root package name */
    public static final CipherSuite f55865P;

    /* renamed from: P0, reason: collision with root package name */
    public static final CipherSuite f55866P0;

    /* renamed from: Q, reason: collision with root package name */
    public static final CipherSuite f55867Q;

    /* renamed from: Q0, reason: collision with root package name */
    public static final CipherSuite f55868Q0;

    /* renamed from: R, reason: collision with root package name */
    public static final CipherSuite f55869R;

    /* renamed from: R0, reason: collision with root package name */
    public static final CipherSuite f55870R0;

    /* renamed from: S, reason: collision with root package name */
    public static final CipherSuite f55871S;

    /* renamed from: S0, reason: collision with root package name */
    public static final CipherSuite f55872S0;

    /* renamed from: T, reason: collision with root package name */
    public static final CipherSuite f55873T;

    /* renamed from: T0, reason: collision with root package name */
    public static final CipherSuite f55874T0;

    /* renamed from: U, reason: collision with root package name */
    public static final CipherSuite f55875U;

    /* renamed from: U0, reason: collision with root package name */
    public static final CipherSuite f55876U0;

    /* renamed from: V, reason: collision with root package name */
    public static final CipherSuite f55877V;

    /* renamed from: V0, reason: collision with root package name */
    public static final CipherSuite f55878V0;

    /* renamed from: W, reason: collision with root package name */
    public static final CipherSuite f55879W;

    /* renamed from: W0, reason: collision with root package name */
    public static final CipherSuite f55880W0;

    /* renamed from: X, reason: collision with root package name */
    public static final CipherSuite f55881X;

    /* renamed from: X0, reason: collision with root package name */
    public static final CipherSuite f55882X0;

    /* renamed from: Y, reason: collision with root package name */
    public static final CipherSuite f55883Y;

    /* renamed from: Y0, reason: collision with root package name */
    public static final CipherSuite f55884Y0;

    /* renamed from: Z, reason: collision with root package name */
    public static final CipherSuite f55885Z;

    /* renamed from: Z0, reason: collision with root package name */
    public static final CipherSuite f55886Z0;

    /* renamed from: a0, reason: collision with root package name */
    public static final CipherSuite f55887a0;

    /* renamed from: a1, reason: collision with root package name */
    public static final CipherSuite f55888a1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b0, reason: collision with root package name */
    public static final CipherSuite f55890b0;

    /* renamed from: b1, reason: collision with root package name */
    public static final CipherSuite f55891b1;

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f55892c;

    /* renamed from: c0, reason: collision with root package name */
    public static final CipherSuite f55893c0;

    /* renamed from: c1, reason: collision with root package name */
    public static final CipherSuite f55894c1;

    /* renamed from: d, reason: collision with root package name */
    private static final Map f55895d;

    /* renamed from: d0, reason: collision with root package name */
    public static final CipherSuite f55896d0;

    /* renamed from: d1, reason: collision with root package name */
    public static final CipherSuite f55897d1;

    /* renamed from: e, reason: collision with root package name */
    public static final CipherSuite f55898e;

    /* renamed from: e0, reason: collision with root package name */
    public static final CipherSuite f55899e0;

    /* renamed from: e1, reason: collision with root package name */
    public static final CipherSuite f55900e1;

    /* renamed from: f, reason: collision with root package name */
    public static final CipherSuite f55901f;

    /* renamed from: f0, reason: collision with root package name */
    public static final CipherSuite f55902f0;

    /* renamed from: f1, reason: collision with root package name */
    public static final CipherSuite f55903f1;

    /* renamed from: g, reason: collision with root package name */
    public static final CipherSuite f55904g;

    /* renamed from: g0, reason: collision with root package name */
    public static final CipherSuite f55905g0;

    /* renamed from: g1, reason: collision with root package name */
    public static final CipherSuite f55906g1;

    /* renamed from: h, reason: collision with root package name */
    public static final CipherSuite f55907h;

    /* renamed from: h0, reason: collision with root package name */
    public static final CipherSuite f55908h0;

    /* renamed from: h1, reason: collision with root package name */
    public static final CipherSuite f55909h1;

    /* renamed from: i, reason: collision with root package name */
    public static final CipherSuite f55910i;

    /* renamed from: i0, reason: collision with root package name */
    public static final CipherSuite f55911i0;

    /* renamed from: i1, reason: collision with root package name */
    public static final CipherSuite f55912i1;

    /* renamed from: j, reason: collision with root package name */
    public static final CipherSuite f55913j;

    /* renamed from: j0, reason: collision with root package name */
    public static final CipherSuite f55914j0;

    /* renamed from: j1, reason: collision with root package name */
    public static final CipherSuite f55915j1;

    /* renamed from: k, reason: collision with root package name */
    public static final CipherSuite f55916k;

    /* renamed from: k0, reason: collision with root package name */
    public static final CipherSuite f55917k0;

    /* renamed from: k1, reason: collision with root package name */
    public static final CipherSuite f55918k1;

    /* renamed from: l, reason: collision with root package name */
    public static final CipherSuite f55919l;

    /* renamed from: l0, reason: collision with root package name */
    public static final CipherSuite f55920l0;

    /* renamed from: l1, reason: collision with root package name */
    public static final CipherSuite f55921l1;

    /* renamed from: m, reason: collision with root package name */
    public static final CipherSuite f55922m;

    /* renamed from: m0, reason: collision with root package name */
    public static final CipherSuite f55923m0;

    /* renamed from: m1, reason: collision with root package name */
    public static final CipherSuite f55924m1;

    /* renamed from: n, reason: collision with root package name */
    public static final CipherSuite f55925n;

    /* renamed from: n0, reason: collision with root package name */
    public static final CipherSuite f55926n0;

    /* renamed from: n1, reason: collision with root package name */
    public static final CipherSuite f55927n1;

    /* renamed from: o, reason: collision with root package name */
    public static final CipherSuite f55928o;

    /* renamed from: o0, reason: collision with root package name */
    public static final CipherSuite f55929o0;

    /* renamed from: o1, reason: collision with root package name */
    public static final CipherSuite f55930o1;

    /* renamed from: p, reason: collision with root package name */
    public static final CipherSuite f55931p;

    /* renamed from: p0, reason: collision with root package name */
    public static final CipherSuite f55932p0;

    /* renamed from: p1, reason: collision with root package name */
    public static final CipherSuite f55933p1;

    /* renamed from: q, reason: collision with root package name */
    public static final CipherSuite f55934q;

    /* renamed from: q0, reason: collision with root package name */
    public static final CipherSuite f55935q0;

    /* renamed from: q1, reason: collision with root package name */
    public static final CipherSuite f55936q1;

    /* renamed from: r, reason: collision with root package name */
    public static final CipherSuite f55937r;

    /* renamed from: r0, reason: collision with root package name */
    public static final CipherSuite f55938r0;

    /* renamed from: r1, reason: collision with root package name */
    public static final CipherSuite f55939r1;

    /* renamed from: s, reason: collision with root package name */
    public static final CipherSuite f55940s;

    /* renamed from: s0, reason: collision with root package name */
    public static final CipherSuite f55941s0;

    /* renamed from: s1, reason: collision with root package name */
    public static final CipherSuite f55942s1;

    /* renamed from: t, reason: collision with root package name */
    public static final CipherSuite f55943t;

    /* renamed from: t0, reason: collision with root package name */
    public static final CipherSuite f55944t0;

    /* renamed from: u, reason: collision with root package name */
    public static final CipherSuite f55945u;

    /* renamed from: u0, reason: collision with root package name */
    public static final CipherSuite f55946u0;

    /* renamed from: v, reason: collision with root package name */
    public static final CipherSuite f55947v;

    /* renamed from: v0, reason: collision with root package name */
    public static final CipherSuite f55948v0;

    /* renamed from: w, reason: collision with root package name */
    public static final CipherSuite f55949w;

    /* renamed from: w0, reason: collision with root package name */
    public static final CipherSuite f55950w0;

    /* renamed from: x, reason: collision with root package name */
    public static final CipherSuite f55951x;

    /* renamed from: x0, reason: collision with root package name */
    public static final CipherSuite f55952x0;

    /* renamed from: y, reason: collision with root package name */
    public static final CipherSuite f55953y;

    /* renamed from: y0, reason: collision with root package name */
    public static final CipherSuite f55954y0;

    /* renamed from: z, reason: collision with root package name */
    public static final CipherSuite f55955z;

    /* renamed from: z0, reason: collision with root package name */
    public static final CipherSuite f55956z0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String javaName;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b{\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u000fj\b\u0012\u0004\u0012\u00020\u0004`\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u0014\u0010!\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u0014\u0010%\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\u0014\u0010'\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u0014\u0010(\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u0014\u0010)\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b)\u0010\u0019R\u0014\u0010*\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0019R\u0014\u0010+\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0019R\u0014\u0010,\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0019R\u0014\u0010-\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0019R\u0014\u0010.\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0019R\u0014\u0010/\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0019R\u0014\u00100\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0019R\u0014\u00101\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0019R\u0014\u00102\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0019R\u0014\u00103\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0019R\u0014\u00104\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u0010\u0019R\u0014\u00105\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0019R\u0014\u00106\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0019R\u0014\u00107\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0019R\u0014\u00108\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010\u0019R\u0014\u00109\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0019R\u0014\u0010:\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0019R\u0014\u0010;\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0019R\u0014\u0010<\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0019R\u0014\u0010=\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010\u0019R\u0014\u0010>\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0019R\u0014\u0010?\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0019R\u0014\u0010@\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0019R\u0014\u0010A\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0019R\u0014\u0010B\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0019R\u0014\u0010C\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0019R\u0014\u0010D\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010\u0019R\u0014\u0010E\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0019R\u0014\u0010F\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010\u0019R\u0014\u0010G\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0019R\u0014\u0010H\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0019R\u0014\u0010I\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0019R\u0014\u0010J\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010\u0019R\u0014\u0010K\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0019R\u0014\u0010L\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0019R\u0014\u0010M\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010\u0019R\u0014\u0010N\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0019R\u0014\u0010O\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010\u0019R\u0014\u0010P\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0019R\u0014\u0010Q\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0019R\u0014\u0010R\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010\u0019R\u0014\u0010S\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0019R\u0014\u0010T\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0019R\u0014\u0010U\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0019R\u0014\u0010V\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010\u0019R\u0014\u0010W\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bW\u0010\u0019R\u0014\u0010X\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0019R\u0014\u0010Y\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bY\u0010\u0019R\u0014\u0010Z\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010\u0019R\u0014\u0010[\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0019R\u0014\u0010\\\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0019R\u0014\u0010]\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0019R\u0014\u0010^\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010\u0019R\u0014\u0010_\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010\u0019R\u0014\u0010`\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0019R\u0014\u0010a\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0019R\u0014\u0010b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0019R\u0014\u0010c\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010\u0019R\u0014\u0010d\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010\u0019R\u0014\u0010e\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010\u0019R\u0014\u0010f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010\u0019R\u0014\u0010g\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010\u0019R\u0014\u0010h\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010\u0019R\u0014\u0010i\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010\u0019R\u0014\u0010j\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bj\u0010\u0019R\u0014\u0010k\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010\u0019R\u0014\u0010l\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010\u0019R\u0014\u0010m\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bm\u0010\u0019R\u0014\u0010n\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010\u0019R\u0014\u0010o\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010\u0019R\u0014\u0010p\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010\u0019R\u0014\u0010q\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0019R\u0014\u0010r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010\u0019R\u0014\u0010s\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010\u0019R\u0014\u0010t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0019R\u0014\u0010u\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010\u0019R\u0014\u0010v\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010\u0019R\u0014\u0010w\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0019R\u0014\u0010x\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bx\u0010\u0019R\u0014\u0010y\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010\u0019R\u0014\u0010z\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010\u0019R\u0014\u0010{\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b{\u0010\u0019R\u0014\u0010|\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010\u0019R\u0014\u0010}\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b}\u0010\u0019R\u0014\u0010~\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b~\u0010\u0019R\u0014\u0010\u007f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010\u0019R\u0016\u0010\u0080\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0019R\u0016\u0010\u0081\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0019R\u0016\u0010\u0082\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0019R\u0016\u0010\u0083\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0019R\u0016\u0010\u0084\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0019R\u0016\u0010\u0085\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0019R\u0016\u0010\u0086\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0019R\u0016\u0010\u0087\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0019R\u0016\u0010\u0088\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0019R\u0016\u0010\u0089\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u0019R\u0016\u0010\u008a\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u0019R\u0016\u0010\u008b\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010\u0019R\u0016\u0010\u008c\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010\u0019R\u0016\u0010\u008d\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010\u0019R\u0016\u0010\u008e\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u0019R\u0016\u0010\u008f\u0001\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010\u0019¨\u0006\u0090\u0001"}, d2 = {"Lokhttp3/CipherSuite$Companion;", "", "<init>", "()V", "", "javaName", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Ljava/lang/String;)Ljava/lang/String;", "", "value", "Lokhttp3/CipherSuite;", "d", "(Ljava/lang/String;I)Lokhttp3/CipherSuite;", SnmpConfigurator.O_BIND_ADDRESS, "(Ljava/lang/String;)Lokhttp3/CipherSuite;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ORDER_BY_NAME", "Ljava/util/Comparator;", SnmpConfigurator.O_COMMUNITY, "()Ljava/util/Comparator;", "", "INSTANCES", "Ljava/util/Map;", "TLS_AES_128_CCM_8_SHA256", "Lokhttp3/CipherSuite;", "TLS_AES_128_CCM_SHA256", "TLS_AES_128_GCM_SHA256", "TLS_AES_256_GCM_SHA384", "TLS_CHACHA20_POLY1305_SHA256", "TLS_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_DSS_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA", "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA", "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_DSS_WITH_DES_CBC_SHA", "TLS_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_DHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_DHE_RSA_WITH_DES_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_DES40_CBC_SHA", "TLS_DH_anon_EXPORT_WITH_RC4_40_MD5", "TLS_DH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA", "TLS_DH_anon_WITH_AES_128_CBC_SHA256", "TLS_DH_anon_WITH_AES_128_GCM_SHA256", "TLS_DH_anon_WITH_AES_256_CBC_SHA", "TLS_DH_anon_WITH_AES_256_CBC_SHA256", "TLS_DH_anon_WITH_AES_256_GCM_SHA384", "TLS_DH_anon_WITH_DES_CBC_SHA", "TLS_DH_anon_WITH_RC4_128_MD5", "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_ECDSA_WITH_NULL_SHA", "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", "TLS_ECDHE_RSA_WITH_NULL_SHA", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_ECDSA_WITH_NULL_SHA", "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", "TLS_ECDH_RSA_WITH_NULL_SHA", "TLS_ECDH_RSA_WITH_RC4_128_SHA", "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", "TLS_ECDH_anon_WITH_NULL_SHA", "TLS_ECDH_anon_WITH_RC4_128_SHA", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_FALLBACK_SCSV", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", "TLS_KRB5_WITH_DES_CBC_MD5", "TLS_KRB5_WITH_DES_CBC_SHA", "TLS_KRB5_WITH_RC4_128_MD5", "TLS_KRB5_WITH_RC4_128_SHA", "TLS_PSK_WITH_3DES_EDE_CBC_SHA", "TLS_PSK_WITH_AES_128_CBC_SHA", "TLS_PSK_WITH_AES_256_CBC_SHA", "TLS_PSK_WITH_RC4_128_SHA", "TLS_RSA_EXPORT_WITH_DES40_CBC_SHA", "TLS_RSA_EXPORT_WITH_RC4_40_MD5", "TLS_RSA_WITH_3DES_EDE_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_128_CBC_SHA256", "TLS_RSA_WITH_AES_128_GCM_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA256", "TLS_RSA_WITH_AES_256_GCM_SHA384", "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", "TLS_RSA_WITH_DES_CBC_SHA", "TLS_RSA_WITH_NULL_MD5", "TLS_RSA_WITH_NULL_SHA", "TLS_RSA_WITH_NULL_SHA256", "TLS_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_RC4_128_SHA", "TLS_RSA_WITH_SEED_CBC_SHA", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final CipherSuite d(String javaName, int value) {
            CipherSuite cipherSuite = new CipherSuite(javaName, null);
            CipherSuite.f55895d.put(javaName, cipherSuite);
            return cipherSuite;
        }

        private final String e(String javaName) {
            if (t.P(javaName, "TLS_", false, 2, null)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SSL_");
                String strSubstring = javaName.substring(4);
                AbstractC6492s.h(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                return sb2.toString();
            }
            if (!t.P(javaName, "SSL_", false, 2, null)) {
                return javaName;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("TLS_");
            String strSubstring2 = javaName.substring(4);
            AbstractC6492s.h(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb3.append(strSubstring2);
            return sb3.toString();
        }

        public final synchronized CipherSuite b(String javaName) {
            CipherSuite cipherSuite;
            try {
                AbstractC6492s.i(javaName, "javaName");
                cipherSuite = (CipherSuite) CipherSuite.f55895d.get(javaName);
                if (cipherSuite == null) {
                    cipherSuite = (CipherSuite) CipherSuite.f55895d.get(e(javaName));
                    if (cipherSuite == null) {
                        cipherSuite = new CipherSuite(javaName, null);
                    }
                    CipherSuite.f55895d.put(javaName, cipherSuite);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return cipherSuite;
        }

        public final Comparator c() {
            return CipherSuite.f55892c;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f55892c = new Comparator<String>() { // from class: okhttp3.CipherSuite$Companion$ORDER_BY_NAME$1
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(String a10, String b10) {
                AbstractC6492s.i(a10, "a");
                AbstractC6492s.i(b10, "b");
                int iMin = Math.min(a10.length(), b10.length());
                for (int i10 = 4; i10 < iMin; i10++) {
                    char cCharAt = a10.charAt(i10);
                    char cCharAt2 = b10.charAt(i10);
                    if (cCharAt != cCharAt2) {
                        return AbstractC6492s.k(cCharAt, cCharAt2) < 0 ? -1 : 1;
                    }
                }
                int length = a10.length();
                int length2 = b10.length();
                if (length != length2) {
                    return length < length2 ? -1 : 1;
                }
                return 0;
            }
        };
        f55895d = new LinkedHashMap();
        f55898e = companion.d("SSL_RSA_WITH_NULL_MD5", 1);
        f55901f = companion.d("SSL_RSA_WITH_NULL_SHA", 2);
        f55904g = companion.d("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        f55907h = companion.d("SSL_RSA_WITH_RC4_128_MD5", 4);
        f55910i = companion.d("SSL_RSA_WITH_RC4_128_SHA", 5);
        f55913j = companion.d("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        f55916k = companion.d("SSL_RSA_WITH_DES_CBC_SHA", 9);
        f55919l = companion.d("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        f55922m = companion.d("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        f55925n = companion.d("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        f55928o = companion.d("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        f55931p = companion.d("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        f55934q = companion.d("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        f55937r = companion.d("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        f55940s = companion.d("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        f55943t = companion.d("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        f55945u = companion.d("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        f55947v = companion.d("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        f55949w = companion.d("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        f55951x = companion.d("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        f55953y = companion.d("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        f55955z = companion.d("TLS_KRB5_WITH_RC4_128_SHA", 32);
        f55835A = companion.d("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        f55837B = companion.d("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        f55839C = companion.d("TLS_KRB5_WITH_RC4_128_MD5", 36);
        f55841D = companion.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        f55843E = companion.d("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        f55845F = companion.d("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        f55847G = companion.d("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        f55849H = companion.d("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        f55851I = companion.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        f55853J = companion.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        f55855K = companion.d("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f55857L = companion.d("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        f55859M = companion.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        f55861N = companion.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        f55863O = companion.d("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        f55865P = companion.d("TLS_RSA_WITH_NULL_SHA256", 59);
        f55867Q = companion.d("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        f55869R = companion.d("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        f55871S = companion.d("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        f55873T = companion.d("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        f55875U = companion.d("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        f55877V = companion.d("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        f55879W = companion.d("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        f55881X = companion.d("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        f55883Y = companion.d("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        f55885Z = companion.d("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        f55887a0 = companion.d("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        f55890b0 = companion.d("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        f55893c0 = companion.d("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        f55896d0 = companion.d("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        f55899e0 = companion.d("TLS_PSK_WITH_RC4_128_SHA", 138);
        f55902f0 = companion.d("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        f55905g0 = companion.d("TLS_PSK_WITH_AES_128_CBC_SHA", ModuleDescriptor.MODULE_VERSION);
        f55908h0 = companion.d("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        f55911i0 = companion.d("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        f55914j0 = companion.d("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        f55917k0 = companion.d("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        f55920l0 = companion.d("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        f55923m0 = companion.d("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        f55926n0 = companion.d("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", SnmpConstants.DEFAULT_NOTIFICATION_RECEIVER_PORT);
        f55929o0 = companion.d("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        f55932p0 = companion.d("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        f55935q0 = companion.d("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        f55938r0 = companion.d("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        f55941s0 = companion.d("TLS_FALLBACK_SCSV", 22016);
        f55944t0 = companion.d("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        f55946u0 = companion.d("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        f55948v0 = companion.d("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        f55950w0 = companion.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        f55952x0 = companion.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        f55954y0 = companion.d("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        f55956z0 = companion.d("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        f55836A0 = companion.d("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        f55838B0 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        f55840C0 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        f55842D0 = companion.d("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        f55844E0 = companion.d("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        f55846F0 = companion.d("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        f55848G0 = companion.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        f55850H0 = companion.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        f55852I0 = companion.d("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        f55854J0 = companion.d("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        f55856K0 = companion.d("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        f55858L0 = companion.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        f55860M0 = companion.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        f55862N0 = companion.d("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        f55864O0 = companion.d("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        f55866P0 = companion.d("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        f55868Q0 = companion.d("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        f55870R0 = companion.d("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        f55872S0 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        f55874T0 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        f55876U0 = companion.d("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        f55878V0 = companion.d("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        f55880W0 = companion.d("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        f55882X0 = companion.d("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        f55884Y0 = companion.d("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        f55886Z0 = companion.d("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        f55888a1 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        f55891b1 = companion.d("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        f55894c1 = companion.d("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        f55897d1 = companion.d("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        f55900e1 = companion.d("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        f55903f1 = companion.d("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        f55906g1 = companion.d("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        f55909h1 = companion.d("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        f55912i1 = companion.d("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        f55915j1 = companion.d("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        f55918k1 = companion.d("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        f55921l1 = companion.d("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        f55924m1 = companion.d("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        f55927n1 = companion.d("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        f55930o1 = companion.d("TLS_AES_128_GCM_SHA256", 4865);
        f55933p1 = companion.d("TLS_AES_256_GCM_SHA384", 4866);
        f55936q1 = companion.d("TLS_CHACHA20_POLY1305_SHA256", 4867);
        f55939r1 = companion.d("TLS_AES_128_CCM_SHA256", 4868);
        f55942s1 = companion.d("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    public /* synthetic */ CipherSuite(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: c, reason: from getter */
    public final String getJavaName() {
        return this.javaName;
    }

    public String toString() {
        return this.javaName;
    }

    private CipherSuite(String str) {
        this.javaName = str;
    }
}
