package ch;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.KeyguardManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.telephony.SubscriptionManager;
import android.telephony.euicc.EuiccManager;
import android.view.WindowManager;
import com.google.android.gms.internal.measurement.e5;
import com.opensignal.sdk.data.receiver.SdkPipelineReceiver;
import com.opensignal.sdk.domain.ApplicationLifecycleListener;
import com.squareup.picasso.s;
import fj.o;
import h7.h0;
import h7.r1;
import h9.r2;
import i.g0;
import io.sentry.t;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import jj.e0;
import jj.q;
import kg.r;
import oh.p;
import p.l2;
import p.v2;
import xi.u;
import xi.v;

/* loaded from: classes.dex */
public abstract class d {
    public fi.g A;
    public ai.g A0;
    public p A1;
    public gk.b A2;
    public z7.j A3;
    public wh.a A4;
    public dj.h B;
    public oi.a B0;
    public xi.m B1;
    public gk.a B2;
    public z4.e B3;
    public bm.d B4;
    public a2.g C;
    public et.d C0;
    public xi.l C1;
    public gk.a C2;
    public xr.a C3;
    public b9.e C4;
    public b9.c D;
    public hi.a D0;
    public xi.k D1;
    public bm.d D2;
    public gi.a D3;
    public ai.g D4;
    public qj.a E;
    public hi.a E0;
    public u E1;
    public df.c E2;
    public gi.a E3;
    public z.b E4;
    public ab.g F;
    public hi.a F0;
    public bk.f F1;
    public q3.a F2;
    public ai.f F3;
    public tv.b F4;
    public r2 G;
    public gi.a G0;
    public qm.c G1;
    public y9.u G2;
    public ai.g G3;
    public m G4;
    public om.f H;
    public hi.a H0;
    public sm.m H1;
    public gj.b H2;
    public ai.f H3;
    public j H4;
    public h9.p I;
    public ek.c I0;
    public pc.a I1;
    public r2 I2;
    public ai.f I3;
    public o2.g I4;
    public al.g J;
    public ek.c J0;
    public q3.a J1;
    public r2 J2;
    public ai.g J3;
    public ai.f J4;
    public bm.d K;
    public io.sentry.internal.debugmeta.c K0;
    public pc.a K1;
    public uj.a K2;
    public ai.g K3;
    public ai.g K4;
    public sm.m L;
    public om.f L0;
    public js.e L1;
    public io.sentry.k L2;
    public ai.f L3;
    public df.c L4;
    public ConnectivityManager M;
    public WifiManager M0;
    public al.b M1;
    public qm.c M2;
    public ai.g M3;
    public ee.f M4;
    public i7.m N;
    public EuiccManager N0;
    public xr.a N1;
    public et.d N2;
    public z.b N3;
    public ai.f N4;
    public h0 O;
    public PowerManager O0;
    public z4.f O1;
    public js.e O2;
    public ai.g O3;
    public ai.g O4;
    public l2 P;
    public KeyguardManager P0;
    public vh.a P1;
    public o2.g P2;
    public z4.e P3;
    public xj.d P4;
    public r1 Q;
    public ActivityManager Q0;
    public qm.c Q1;
    public fk.a Q2;
    public p Q3;
    public ai.g Q4;
    public hk.k R;
    public UsageStatsManager R0;
    public ic.b R1;
    public r2 R2;
    public sm.m R3;
    public ai.c R4;
    public l2 S;
    public jj.d S0;
    public zc.d S1;
    public r2 S2;
    public om.f S3;
    public pi.a S4;
    public df.c T;
    public e0 T0;
    public z4.d T1;
    public r T2;
    public p T3;
    public r2 T4;
    public io.sentry.hints.i U;
    public jj.d U0;
    public z4.d U1;
    public bm.e U2;
    public a2.g U3;
    public z7.b U4;
    public gi.c V;
    public xi.g V0;
    public zc.d V1;
    public r2 V2;
    public yh.c V3;
    public yi.g V4;
    public gi.a W;
    public xi.g W0;
    public zc.d W1;
    public bm.e W2;
    public z.b W3;
    public gi.a W4;
    public xj.f X;
    public gi.a X0;
    public zc.d X1;
    public cg.e X2;
    public bm.e X3;
    public io.sentry.hints.i X4;
    public xj.c Y;
    public xi.i Y0;
    public z4.e Y1;
    public t Y2;
    public xi.j Y3;
    public k Y4;
    public xj.c Z;
    public jj.e Z0;
    public z7.b Z1;
    public bm.d Z2;
    public ee.f Z3;
    public io.sentry.hints.i Z4;

    /* renamed from: a, reason: collision with root package name */
    public Context f3775a;

    /* renamed from: a0, reason: collision with root package name */
    public ai.f f3776a0;

    /* renamed from: a1, reason: collision with root package name */
    public xi.i f3777a1;

    /* renamed from: a2, reason: collision with root package name */
    public gi.a f3778a2;

    /* renamed from: a3, reason: collision with root package name */
    public bm.d f3779a3;
    public xi.d a4;

    /* renamed from: a5, reason: collision with root package name */
    public o f3780a5;

    /* renamed from: b, reason: collision with root package name */
    public a8.f f3781b;

    /* renamed from: b0, reason: collision with root package name */
    public ai.f f3782b0;

    /* renamed from: b1, reason: collision with root package name */
    public xi.e f3783b1;
    public y9.u b2;

    /* renamed from: b3, reason: collision with root package name */
    public io.sentry.internal.debugmeta.c f3784b3;

    /* renamed from: b4, reason: collision with root package name */
    public q f3785b4;

    /* renamed from: c, reason: collision with root package name */
    public l2 f3787c;

    /* renamed from: c0, reason: collision with root package name */
    public ai.f f3788c0;

    /* renamed from: c1, reason: collision with root package name */
    public xi.e f3789c1;

    /* renamed from: c2, reason: collision with root package name */
    public zi.a f3790c2;

    /* renamed from: c3, reason: collision with root package name */
    public zi.a f3791c3;
    public g0 c4;

    /* renamed from: d, reason: collision with root package name */
    public dj.g f3793d;

    /* renamed from: d0, reason: collision with root package name */
    public ai.f f3794d0;

    /* renamed from: d1, reason: collision with root package name */
    public jj.d f3795d1;

    /* renamed from: d2, reason: collision with root package name */
    public yi.g f3796d2;

    /* renamed from: d3, reason: collision with root package name */
    public b9.c f3797d3;

    /* renamed from: d4, reason: collision with root package name */
    public ki.a f3798d4;

    /* renamed from: e, reason: collision with root package name */
    public om.f f3800e;

    /* renamed from: e0, reason: collision with root package name */
    public ai.f f3801e0;

    /* renamed from: e1, reason: collision with root package name */
    public xi.c f3802e1;

    /* renamed from: e2, reason: collision with root package name */
    public zj.b f3803e2;

    /* renamed from: e3, reason: collision with root package name */
    public sm.m f3804e3;
    public h0 e4;

    /* renamed from: f, reason: collision with root package name */
    public q3.a f3806f;

    /* renamed from: f0, reason: collision with root package name */
    public oi.c f3807f0;

    /* renamed from: f1, reason: collision with root package name */
    public jj.d f3808f1;

    /* renamed from: f2, reason: collision with root package name */
    public zj.c f3809f2;

    /* renamed from: f3, reason: collision with root package name */
    public cg.e f3810f3;

    /* renamed from: f4, reason: collision with root package name */
    public Locale f3811f4;

    /* renamed from: g, reason: collision with root package name */
    public bm.d f3813g;

    /* renamed from: g0, reason: collision with root package name */
    public xj.j f3814g0;

    /* renamed from: g1, reason: collision with root package name */
    public ExecutorService f3815g1;

    /* renamed from: g2, reason: collision with root package name */
    public y9.u f3816g2;

    /* renamed from: g3, reason: collision with root package name */
    public bj.c f3817g3;

    /* renamed from: g4, reason: collision with root package name */
    public df.c f3818g4;

    /* renamed from: h, reason: collision with root package name */
    public xi.a f3820h;

    /* renamed from: h0, reason: collision with root package name */
    public ai.g f3821h0;

    /* renamed from: h1, reason: collision with root package name */
    public ApplicationLifecycleListener f3822h1;

    /* renamed from: h2, reason: collision with root package name */
    public z4.f f3823h2;

    /* renamed from: h3, reason: collision with root package name */
    public yi.e f3824h3;

    /* renamed from: h4, reason: collision with root package name */
    public wh.c f3825h4;

    /* renamed from: i, reason: collision with root package name */
    public cj.q f3827i;

    /* renamed from: i0, reason: collision with root package name */
    public ai.g f3828i0;

    /* renamed from: i1, reason: collision with root package name */
    public al.b f3829i1;

    /* renamed from: i2, reason: collision with root package name */
    public yh.c f3830i2;

    /* renamed from: i3, reason: collision with root package name */
    public ek.c f3831i3;

    /* renamed from: i4, reason: collision with root package name */
    public wh.c f3832i4;
    public dj.h j;

    /* renamed from: j0, reason: collision with root package name */
    public ai.g f3834j0;

    /* renamed from: j1, reason: collision with root package name */
    public dj.g f3835j1;

    /* renamed from: j2, reason: collision with root package name */
    public dj.h f3836j2;

    /* renamed from: j3, reason: collision with root package name */
    public bm.e f3837j3;

    /* renamed from: j4, reason: collision with root package name */
    public s f3838j4;
    public cj.q k;

    /* renamed from: k0, reason: collision with root package name */
    public ai.g f3840k0;

    /* renamed from: k1, reason: collision with root package name */
    public bk.k f3841k1;

    /* renamed from: k2, reason: collision with root package name */
    public z7.b f3842k2;

    /* renamed from: k3, reason: collision with root package name */
    public bk.c f3843k3;

    /* renamed from: k4, reason: collision with root package name */
    public WindowManager f3844k4;

    /* renamed from: l, reason: collision with root package name */
    public h f3846l;

    /* renamed from: l0, reason: collision with root package name */
    public ai.g f3847l0;

    /* renamed from: l1, reason: collision with root package name */
    public cj.a f3848l1;

    /* renamed from: l2, reason: collision with root package name */
    public z4.f f3849l2;

    /* renamed from: l3, reason: collision with root package name */
    public bk.f f3850l3;

    /* renamed from: l4, reason: collision with root package name */
    public xj.d f3851l4;

    /* renamed from: m, reason: collision with root package name */
    public bm.d f3853m;

    /* renamed from: m0, reason: collision with root package name */
    public ai.g f3854m0;

    /* renamed from: m1, reason: collision with root package name */
    public AudioManager f3855m1;

    /* renamed from: m2, reason: collision with root package name */
    public xj.m f3856m2;

    /* renamed from: m3, reason: collision with root package name */
    public js.e f3857m3;

    /* renamed from: m4, reason: collision with root package name */
    public gi.c f3858m4;

    /* renamed from: n, reason: collision with root package name */
    public r f3860n;

    /* renamed from: n0, reason: collision with root package name */
    public xj.d f3861n0;

    /* renamed from: n1, reason: collision with root package name */
    public b9.c f3862n1;

    /* renamed from: n2, reason: collision with root package name */
    public xj.j f3863n2;

    /* renamed from: n3, reason: collision with root package name */
    public cj.a f3864n3;

    /* renamed from: n4, reason: collision with root package name */
    public gi.a f3865n4;

    /* renamed from: o, reason: collision with root package name */
    public bm.d f3867o;

    /* renamed from: o0, reason: collision with root package name */
    public ai.f f3868o0;

    /* renamed from: o1, reason: collision with root package name */
    public f f3869o1;

    /* renamed from: o2, reason: collision with root package name */
    public js.e f3870o2;
    public fj.b o3;

    /* renamed from: o4, reason: collision with root package name */
    public ai.f f3871o4;

    /* renamed from: p, reason: collision with root package name */
    public cj.a f3873p;

    /* renamed from: p0, reason: collision with root package name */
    public ai.f f3874p0;

    /* renamed from: p1, reason: collision with root package name */
    public b9.e f3875p1;

    /* renamed from: p2, reason: collision with root package name */
    public o2.g f3876p2;

    /* renamed from: p3, reason: collision with root package name */
    public r f3877p3;

    /* renamed from: p4, reason: collision with root package name */
    public ai.g f3878p4;

    /* renamed from: q, reason: collision with root package name */
    public AlarmManager f3880q;

    /* renamed from: q0, reason: collision with root package name */
    public ai.f f3881q0;

    /* renamed from: q1, reason: collision with root package name */
    public com.opensignal.sdk.common.measurements.base.f f3882q1;

    /* renamed from: q2, reason: collision with root package name */
    public t f3883q2;

    /* renamed from: q3, reason: collision with root package name */
    public yi.d f3884q3;

    /* renamed from: q4, reason: collision with root package name */
    public BatteryManager f3885q4;

    /* renamed from: r, reason: collision with root package name */
    public JobScheduler f3887r;

    /* renamed from: r0, reason: collision with root package name */
    public ai.f f3888r0;

    /* renamed from: r1, reason: collision with root package name */
    public a2.g f3889r1;

    /* renamed from: r2, reason: collision with root package name */
    public mj.d f3890r2;

    /* renamed from: r3, reason: collision with root package name */
    public com.opensignal.sdk.common.measurements.base.e f3891r3;

    /* renamed from: r4, reason: collision with root package name */
    public xi.i f3892r4;

    /* renamed from: s, reason: collision with root package name */
    public of.b f3894s;

    /* renamed from: s0, reason: collision with root package name */
    public ai.f f3895s0;
    public com.opensignal.sdk.common.measurements.base.c s1;

    /* renamed from: s2, reason: collision with root package name */
    public a2.g f3896s2;

    /* renamed from: s3, reason: collision with root package name */
    public cj.p f3897s3;

    /* renamed from: s4, reason: collision with root package name */
    public xj.c f3898s4;

    /* renamed from: t, reason: collision with root package name */
    public gi.e f3900t;

    /* renamed from: t0, reason: collision with root package name */
    public gi.a f3901t0;

    /* renamed from: t1, reason: collision with root package name */
    public b9.e f3902t1;

    /* renamed from: t2, reason: collision with root package name */
    public i f3903t2;

    /* renamed from: t3, reason: collision with root package name */
    public l2 f3904t3;

    /* renamed from: t4, reason: collision with root package name */
    public ai.f f3905t4;

    /* renamed from: u, reason: collision with root package name */
    public gi.a f3906u;

    /* renamed from: u0, reason: collision with root package name */
    public gi.a f3907u0;

    /* renamed from: u1, reason: collision with root package name */
    public io.sentry.internal.debugmeta.c f3908u1;

    /* renamed from: u2, reason: collision with root package name */
    public xr.a f3909u2;

    /* renamed from: u3, reason: collision with root package name */
    public cj.t f3910u3;

    /* renamed from: u4, reason: collision with root package name */
    public ai.g f3911u4;

    /* renamed from: v, reason: collision with root package name */
    public gi.e f3912v;

    /* renamed from: v0, reason: collision with root package name */
    public ai.g f3913v0;

    /* renamed from: v1, reason: collision with root package name */
    public b9.c f3914v1;

    /* renamed from: v2, reason: collision with root package name */
    public hk.k f3915v2;

    /* renamed from: v3, reason: collision with root package name */
    public dd.o f3916v3;

    /* renamed from: v4, reason: collision with root package name */
    public yi.g f3917v4;

    /* renamed from: w, reason: collision with root package name */
    public gi.a f3918w;

    /* renamed from: w0, reason: collision with root package name */
    public ai.g f3919w0;

    /* renamed from: w1, reason: collision with root package name */
    public ag.b f3920w1;

    /* renamed from: w2, reason: collision with root package name */
    public cg.e f3921w2;

    /* renamed from: w3, reason: collision with root package name */
    public bm.e f3922w3;

    /* renamed from: w4, reason: collision with root package name */
    public SensorManager f3923w4;

    /* renamed from: x, reason: collision with root package name */
    public h9.p f3924x;

    /* renamed from: x0, reason: collision with root package name */
    public oi.a f3925x0;

    /* renamed from: x1, reason: collision with root package name */
    public cj.a f3926x1;

    /* renamed from: x2, reason: collision with root package name */
    public df.c f3927x2;

    /* renamed from: x3, reason: collision with root package name */
    public z4.d f3928x3;

    /* renamed from: x4, reason: collision with root package name */
    public v f3929x4;

    /* renamed from: y, reason: collision with root package name */
    public hi.a f3930y;

    /* renamed from: y0, reason: collision with root package name */
    public ai.g f3931y0;

    /* renamed from: y1, reason: collision with root package name */
    public sm.f f3932y1;

    /* renamed from: y2, reason: collision with root package name */
    public g0 f3933y2;

    /* renamed from: y3, reason: collision with root package name */
    public yi.g f3934y3;

    /* renamed from: y4, reason: collision with root package name */
    public et.d f3935y4;

    /* renamed from: z, reason: collision with root package name */
    public hi.a f3936z;

    /* renamed from: z0, reason: collision with root package name */
    public oi.a f3937z0;
    public ai.g z1;

    /* renamed from: z2, reason: collision with root package name */
    public vi.a f3938z2;

    /* renamed from: z3, reason: collision with root package name */
    public sm.f f3939z3;

    /* renamed from: z4, reason: collision with root package name */
    public yh.c f3940z4;

    /* renamed from: b5, reason: collision with root package name */
    public final AtomicBoolean f3786b5 = new AtomicBoolean(false);

    /* renamed from: c5, reason: collision with root package name */
    public final boolean f3792c5 = true;

    /* renamed from: d5, reason: collision with root package name */
    public final lq.q f3799d5 = kc.f.F(c.F);

    /* renamed from: e5, reason: collision with root package name */
    public final lq.q f3805e5 = kc.f.F(new b(this, 5));

    /* renamed from: f5, reason: collision with root package name */
    public final lq.q f3812f5 = kc.f.F(new b(this, 1));

    /* renamed from: g5, reason: collision with root package name */
    public final lq.q f3819g5 = kc.f.F(new b(this, 3));

    /* renamed from: h5, reason: collision with root package name */
    public final lq.q f3826h5 = kc.f.F(c.f3770g);

    /* renamed from: i5, reason: collision with root package name */
    public final lq.q f3833i5 = kc.f.F(c.f3772x);

    /* renamed from: j5, reason: collision with root package name */
    public final lq.q f3839j5 = kc.f.F(c.f3771r);

    /* renamed from: k5, reason: collision with root package name */
    public final lq.q f3845k5 = kc.f.F(c.f3773y);

    /* renamed from: l5, reason: collision with root package name */
    public final lq.q f3852l5 = kc.f.F(c.E);

    /* renamed from: m5, reason: collision with root package name */
    public final lq.q f3859m5 = kc.f.F(new b(this, 2));

    /* renamed from: n5, reason: collision with root package name */
    public final lq.q f3866n5 = kc.f.F(new b(this, 4));

    /* renamed from: o5, reason: collision with root package name */
    public final lq.q f3872o5 = kc.f.F(c.B);

    /* renamed from: p5, reason: collision with root package name */
    public final lq.q f3879p5 = kc.f.F(c.D);

    /* renamed from: q5, reason: collision with root package name */
    public final lq.q f3886q5 = kc.f.F(c.H);

    /* renamed from: r5, reason: collision with root package name */
    public final lq.q f3893r5 = kc.f.F(c.G);

    /* renamed from: s5, reason: collision with root package name */
    public final lq.q f3899s5 = kc.f.F(new b(this, 0));

    public final df.c A() {
        if (this.T == null) {
            this.T = new df.c(7);
        }
        df.c cVar = this.T;
        if (cVar != null) {
            return cVar;
        }
        br.l.l("_dateTimeRepository");
        throw null;
    }

    public final io.sentry.internal.debugmeta.c A0() {
        if (this.f3784b3 == null) {
            PowerManager powerManagerQ0 = q0();
            if (this.P0 == null) {
                Object systemService = d().getApplicationContext().getSystemService("keyguard");
                br.l.c(systemService, "null cannot be cast to non-null type android.app.KeyguardManager");
                this.P0 = (KeyguardManager) systemService;
            }
            KeyguardManager keyguardManager = this.P0;
            if (keyguardManager == null) {
                br.l.l("_keyguardManager");
                throw null;
            }
            io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(12, false);
            cVar.f12353d = powerManagerQ0;
            cVar.f12354g = keyguardManager;
            this.f3784b3 = cVar;
        }
        io.sentry.internal.debugmeta.c cVar2 = this.f3784b3;
        if (cVar2 != null) {
            return cVar2;
        }
        br.l.l("_screenStatus");
        throw null;
    }

    public final b9.c B() {
        if (this.f3797d3 == null) {
            if (this.f3804e3 == null) {
                this.f3804e3 = new sm.m();
            }
            sm.m mVar = this.f3804e3;
            if (mVar == null) {
                br.l.l("_dependencyFactory");
                throw null;
            }
            this.f3797d3 = new b9.c(mVar);
        }
        b9.c cVar = this.f3797d3;
        if (cVar != null) {
            return cVar;
        }
        br.l.l("_dependenciesChecker");
        throw null;
    }

    public final j B0() {
        if (this.H4 == null) {
            this.H4 = new j(d(), r(), s0());
        }
        j jVar = this.H4;
        if (jVar != null) {
            return jVar;
        }
        br.l.l("_sdkExceptionHandler");
        throw null;
    }

    public final hk.k C() throws Throwable {
        Throwable th2;
        h0 h0Var;
        Context contextD;
        if (this.f3915v2 == null) {
            if (this.f3914v1 == null) {
                this.f3914v1 = new b9.c(10, F());
            }
            b9.c cVar = this.f3914v1;
            if (cVar == null) {
                br.l.l("_deviceHardware");
                throw null;
            }
            dj.g gVarS0 = S0();
            i iVarN0 = n0();
            A();
            q3.a aVarN = N();
            q3.a aVarN2 = n();
            bm.d dVarF0 = F0();
            ag.b bVarO0 = o0();
            u uVarZ = Z();
            if (this.c4 == null) {
                ActivityManager activityManagerB = b();
                if (this.f3818g4 == null) {
                    this.f3818g4 = new df.c();
                }
                df.c cVar2 = this.f3818g4;
                if (cVar2 == null) {
                    br.l.l("_memoryRounding");
                    throw null;
                }
                this.c4 = new g0(activityManagerB, cVar2);
            }
            g0 g0Var = this.c4;
            if (g0Var == null) {
                br.l.l("_ramInfo");
                throw null;
            }
            if (this.f3798d4 == null) {
                f fVarF = F();
                if (this.f3818g4 == null) {
                    this.f3818g4 = new df.c();
                }
                df.c cVar3 = this.f3818g4;
                if (cVar3 == null) {
                    br.l.l("_memoryRounding");
                    throw null;
                }
                this.f3798d4 = new ki.a(fVarF, cVar3);
            }
            ki.a aVar = this.f3798d4;
            if (aVar == null) {
                br.l.l("_storageInfo");
                throw null;
            }
            h0 h0VarW = W();
            if (this.f3838j4 == null) {
                if (this.f3844k4 == null) {
                    if (F().h()) {
                        th2 = null;
                        Object systemService = d().getSystemService("display");
                        br.l.c(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
                        h0Var = h0VarW;
                        contextD = d().createDisplayContext(((DisplayManager) systemService).getDisplay(0)).createWindowContext(1, null);
                    } else {
                        th2 = null;
                        h0Var = h0VarW;
                        contextD = d();
                    }
                    br.l.b(contextD);
                    Object systemService2 = contextD.getSystemService("window");
                    br.l.c(systemService2, "null cannot be cast to non-null type android.view.WindowManager");
                    this.f3844k4 = (WindowManager) systemService2;
                } else {
                    th2 = null;
                    h0Var = h0VarW;
                }
                WindowManager windowManager = this.f3844k4;
                if (windowManager == null) {
                    br.l.l("_windowManager");
                    throw th2;
                }
                this.f3838j4 = new s(windowManager);
            } else {
                th2 = null;
                h0Var = h0VarW;
            }
            s sVar = this.f3838j4;
            if (sVar == null) {
                br.l.l("_screenInfo");
                throw th2;
            }
            om.f fVarU = U();
            a8.f fVarT0 = t0();
            br.l.e(sVar, "screenInfo");
            hk.k kVar = new hk.k();
            kVar.f10831b = cVar;
            kVar.f10832c = gVarS0;
            kVar.f10833d = iVarN0;
            kVar.f10834e = aVarN;
            kVar.f10835f = aVarN2;
            kVar.f10836g = dVarF0;
            kVar.f10837h = bVarO0;
            kVar.f10838i = uVarZ;
            kVar.j = g0Var;
            kVar.k = aVar;
            kVar.f10839l = h0Var;
            kVar.f10840m = sVar;
            kVar.f10841n = fVarU;
            kVar.f10830a = fVarT0;
            this.f3915v2 = kVar;
        } else {
            th2 = null;
        }
        hk.k kVar2 = this.f3915v2;
        if (kVar2 != null) {
            return kVar2;
        }
        br.l.l("_deviceInstallationFactory");
        throw th2;
    }

    public final tv.b C0() {
        if (this.F4 == null) {
            Context contextD = d();
            tv.b bVar = new tv.b();
            bVar.f23029g = contextD;
            AtomicLong atomicLong = new AtomicLong(-1L);
            bVar.f23027a = atomicLong;
            AtomicReference atomicReference = new AtomicReference(null);
            bVar.f23028d = atomicReference;
            AtomicReference atomicReference2 = new AtomicReference(null);
            bVar.f23030r = atomicReference2;
            AtomicReference atomicReference3 = new AtomicReference(null);
            bVar.f23031x = atomicReference3;
            atomicReference2.set(bVar.d().getString("sdkPriorityList", null));
            atomicReference.set(bVar.d().getString("runningSdkId", null));
            atomicLong.set(bVar.d().getLong("highPrioritySdkLastInitTime", 0L));
            atomicReference3.set(bVar.d().getString("sdkInTheAppList", null));
            this.F4 = bVar;
        }
        tv.b bVar2 = this.F4;
        if (bVar2 != null) {
            return bVar2;
        }
        br.l.l("_sdkInSdkPreferencesRepository");
        throw null;
    }

    public final xj.i D() {
        if (this.f3918w == null) {
            this.f3918w = new gi.a(6);
        }
        gi.a aVar = this.f3918w;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("_deviceLocationJsonMapper");
        throw null;
    }

    public final ThreadFactory D0() {
        if (this.Y4 == null) {
            this.Y4 = new k("CNNASSNT-", B0(), n());
        }
        k kVar = this.Y4;
        if (kVar != null) {
            return kVar;
        }
        br.l.l("_threadFactory");
        throw null;
    }

    public final js.e E() {
        if (this.O2 == null) {
            q3.a aVarN = n();
            if (this.P2 == null) {
                this.P2 = new o2.g(25, l());
            }
            o2.g gVar = this.P2;
            if (gVar == null) {
                br.l.l("_deviceIpResolver");
                throw null;
            }
            this.O2 = new js.e(aVarN, gVar, U());
        }
        js.e eVar = this.O2;
        if (eVar != null) {
            return eVar;
        }
        br.l.l("_devicePublicIpRepository");
        throw null;
    }

    public final js.e E0() {
        if (this.f3870o2 == null) {
            o2.g gVarS = s();
            if (this.f3883q2 == null) {
                g();
                s();
                t tVar = new t();
                tVar.f12737d = Charset.forName("UTF-8");
                this.f3883q2 = tVar;
                tVar.f12736a = r();
            }
            t tVar2 = this.f3883q2;
            if (tVar2 == null) {
                br.l.l("_secretsCryptor");
                throw null;
            }
            js.e eVar = new js.e(gVarS, tVar2);
            this.f3870o2 = eVar;
            eVar.f13797d = r();
        }
        js.e eVar2 = this.f3870o2;
        if (eVar2 != null) {
            return eVar2;
        }
        br.l.l("_secrets");
        throw null;
    }

    public final f F() {
        if (this.f3869o1 == null) {
            this.f3869o1 = new f();
        }
        f fVar = this.f3869o1;
        if (fVar != null) {
            return fVar;
        }
        br.l.l("_deviceSdk");
        throw null;
    }

    public final bm.d F0() {
        if (this.f3813g == null) {
            this.f3813g = new bm.d(U(), E0());
        }
        bm.d dVar = this.f3813g;
        if (dVar != null) {
            return dVar;
        }
        br.l.l("_secureInfoRepository");
        throw null;
    }

    public final sm.f G() {
        if (this.f3939z3 == null) {
            this.f3939z3 = new sm.f(3);
        }
        sm.f fVar = this.f3939z3;
        if (fVar != null) {
            return fVar;
        }
        br.l.l("_eventRecorderFactory");
        throw null;
    }

    public final xj.h G0() throws Throwable {
        Throwable th2;
        ai.g gVar;
        ai.g gVar2;
        ai.g gVar3;
        ai.g gVar4;
        ai.g gVar5;
        ai.g gVar6;
        ai.g gVar7;
        ai.g gVar8;
        ai.g gVar9;
        ai.g gVar10;
        if (this.f3807f0 == null) {
            if (this.f3821h0 == null) {
                this.f3821h0 = new ai.g(8);
            }
            ai.g gVar11 = this.f3821h0;
            if (gVar11 == null) {
                br.l.l("_genericSpeedResultUploadMapper");
                throw null;
            }
            if (this.f3840k0 == null) {
                this.f3840k0 = new ai.g(5);
            }
            ai.g gVar12 = this.f3840k0;
            if (gVar12 == null) {
                br.l.l("_downloadResultUploadMapper");
                throw null;
            }
            if (this.f3828i0 == null) {
                this.f3828i0 = new ai.g(24);
            }
            ai.g gVar13 = this.f3828i0;
            if (gVar13 == null) {
                br.l.l("_uploadSpeedResultUploadMapper");
                throw null;
            }
            if (this.f3834j0 == null) {
                this.f3834j0 = new ai.g(13);
            }
            ai.g gVar14 = this.f3834j0;
            if (gVar14 == null) {
                br.l.l("_latencyResultUploadMapper");
                throw null;
            }
            if (this.f3913v0 == null) {
                this.f3913v0 = new ai.g(25);
            }
            ai.g gVar15 = this.f3913v0;
            if (gVar15 == null) {
                br.l.l("_videoResultUploadMapper");
                throw null;
            }
            if (this.f3925x0 == null) {
                this.f3925x0 = new oi.a(p0(), 0);
            }
            oi.a aVar = this.f3925x0;
            if (aVar == null) {
                br.l.l("_coreResultItemUploadMapper");
                throw null;
            }
            if (this.f3931y0 == null) {
                this.f3931y0 = new ai.g(6);
            }
            ai.g gVar16 = this.f3931y0;
            if (gVar16 == null) {
                br.l.l("_endCoreResultItemUploadMapper");
                throw null;
            }
            if (this.f3937z0 == null) {
                this.f3937z0 = new oi.a(p0(), 1);
            }
            oi.a aVar2 = this.f3937z0;
            if (aVar2 == null) {
                br.l.l("_dailyResultUploadMapper");
                throw null;
            }
            if (this.A0 == null) {
                this.A0 = new ai.g(22);
            }
            ai.g gVar17 = this.A0;
            if (gVar17 == null) {
                br.l.l("_udpResultUploadMapper");
                throw null;
            }
            xj.h hVar = (xj.h) this.f3886q5.getValue();
            if (this.f3847l0 == null) {
                this.f3847l0 = new ai.g(15);
            }
            ai.g gVar18 = this.f3847l0;
            if (gVar18 == null) {
                br.l.l("_publicIpResultUploadMapper");
                throw null;
            }
            if (this.B0 == null) {
                th2 = null;
                this.B0 = new oi.a(p0(), 2);
            } else {
                th2 = null;
            }
            oi.a aVar3 = this.B0;
            if (aVar3 == null) {
                br.l.l("_deviceInstallationInfoMapper");
                throw th2;
            }
            hk.k kVarC = C();
            if (this.f3854m0 == null) {
                this.f3854m0 = new ai.g(21);
            }
            ai.g gVar19 = this.f3854m0;
            if (gVar19 == null) {
                br.l.l("_tracerouteResultUploadMapper");
                throw th2;
            }
            if (this.G3 == null) {
                gVar = gVar19;
                this.G3 = new ai.g(18);
            } else {
                gVar = gVar19;
            }
            ai.g gVar20 = this.G3;
            if (gVar20 == null) {
                br.l.l("_throughputDownloadResultUploadMapper");
                throw th2;
            }
            if (this.J3 == null) {
                gVar2 = gVar20;
                this.J3 = new ai.g(20);
            } else {
                gVar2 = gVar20;
            }
            ai.g gVar21 = this.J3;
            if (gVar21 == null) {
                br.l.l("_throughputUploadResultUploadMapper");
                throw th2;
            }
            if (this.K3 == null) {
                gVar3 = gVar21;
                this.K3 = new ai.g(19);
            } else {
                gVar3 = gVar21;
            }
            ai.g gVar22 = this.K3;
            if (gVar22 == null) {
                br.l.l("_throughputServerResponseResultUploadMapper");
                throw th2;
            }
            if (this.O3 == null) {
                gVar4 = gVar22;
                this.O3 = new ai.g(16);
            } else {
                gVar4 = gVar22;
            }
            ai.g gVar23 = this.O3;
            if (gVar23 == null) {
                br.l.l("_schedulerInfoResultUploadMapper");
                throw th2;
            }
            if (this.f3878p4 == null) {
                gVar5 = gVar23;
                this.f3878p4 = new ai.g(7);
            } else {
                gVar5 = gVar23;
            }
            ai.g gVar24 = this.f3878p4;
            if (gVar24 == null) {
                br.l.l("_flushConnectionInfoJobResultItemUploadMapper");
                throw th2;
            }
            if (this.M3 == null) {
                gVar6 = gVar24;
                this.M3 = new ai.g(11);
            } else {
                gVar6 = gVar24;
            }
            ai.g gVar25 = this.M3;
            if (gVar25 == null) {
                br.l.l("_icmpResultUploadMapper");
                throw th2;
            }
            xj.h hVar2 = (xj.h) this.f3839j5.getValue();
            xj.h hVar3 = (xj.h) this.f3845k5.getValue();
            if (this.f3911u4 == null) {
                gVar7 = gVar25;
                this.f3911u4 = new ai.g(27);
            } else {
                gVar7 = gVar25;
            }
            ai.g gVar26 = this.f3911u4;
            if (gVar26 == null) {
                br.l.l("_wifiScanJobResultItemUploadMapper");
                throw th2;
            }
            if (this.K4 == null) {
                gVar8 = gVar26;
                this.K4 = new ai.g(4);
            } else {
                gVar8 = gVar26;
            }
            ai.g gVar27 = this.K4;
            if (gVar27 == null) {
                br.l.l("_assistantJobResultUploadMapper");
                throw th2;
            }
            if (this.O4 == null) {
                gVar9 = gVar27;
                this.O4 = new ai.g(26);
            } else {
                gVar9 = gVar27;
            }
            ai.g gVar28 = this.O4;
            if (gVar28 == null) {
                br.l.l("_wifiInformationElementsJobResultUploadMapper");
                throw th2;
            }
            if (this.Q4 == null) {
                gVar10 = gVar28;
                this.Q4 = new ai.g(9);
            } else {
                gVar10 = gVar28;
            }
            ai.g gVar29 = this.Q4;
            if (gVar29 == null) {
                br.l.l("_httpHeadLatencyJobResultUploadMapper");
                throw th2;
            }
            this.f3807f0 = new oi.c(gVar11, gVar12, gVar13, gVar14, gVar15, aVar, gVar16, aVar2, gVar17, hVar, gVar18, aVar3, kVarC, gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, hVar2, hVar3, gVar8, gVar9, gVar10, gVar29, new ai.g(17));
        } else {
            th2 = null;
        }
        oi.c cVar = this.f3807f0;
        if (cVar != null) {
            return cVar;
        }
        br.l.l("_sendJobResultDataMapper");
        throw th2;
    }

    public final al.g H() throws Throwable {
        if (this.J == null) {
            sm.m mVarX0 = X0();
            r2 r2VarP0 = P0();
            if (this.H == null) {
                this.H = new om.f(A());
            }
            om.f fVar = this.H;
            if (fVar == null) {
                br.l.l("_completedTasksRepository");
                throw null;
            }
            df.c cVarA = A();
            ek.c cVarS = S();
            l2 l2VarS0 = s0();
            bm.d dVarX0 = x0();
            l2 l2VarL0 = l0();
            b9.c cVarB = B();
            if (this.K == null) {
                dj.h hVarY0 = Y0();
                this.K = new bm.d(n(), X0(), hVarY0, P0(), A());
            }
            bm.d dVar = this.K;
            if (dVar == null) {
                br.l.l("_crossTaskDelayExecutionChecker");
                throw null;
            }
            if (this.U3 == null) {
                this.U3 = new a2.g(t());
            }
            a2.g gVar = this.U3;
            if (gVar == null) {
                br.l.l("_dataUsageLimitsChecker");
                throw null;
            }
            this.J = new al.g(mVarX0, r2VarP0, fVar, cVarA, cVarS, l2VarS0, dVarX0, l2VarL0, cVarB, dVar, gVar, k0());
            n.b("BaseServiceLocator", "_executionChecker instance set");
        }
        al.g gVar2 = this.J;
        if (gVar2 != null) {
            return gVar2;
        }
        br.l.l("_executionChecker");
        throw null;
    }

    public final com.opensignal.sdk.common.measurements.base.f H0() {
        if (this.f3882q1 == null) {
            if (this.f3889r1 == null) {
                f fVarF = F();
                a2.g gVar = new a2.g();
                gVar.f31a = fVarF.i() ? new ee.f(5) : fVarF.h() ? new df.c() : fVarF.f() ? new cg.e() : new sm.f(4);
                this.f3889r1 = gVar;
            }
            a2.g gVar2 = this.f3889r1;
            if (gVar2 == null) {
                br.l.l("_serviceStateParcelMapperFactory");
                throw null;
            }
            this.f3882q1 = (com.opensignal.sdk.common.measurements.base.f) gVar2.f31a;
        }
        com.opensignal.sdk.common.measurements.base.f fVar = this.f3882q1;
        if (fVar != null) {
            return fVar;
        }
        br.l.l("_serviceStateParcelMapper");
        throw null;
    }

    public final Executor I() {
        if (this.f3815g1 == null) {
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool(D0());
            br.l.d(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
            this.f3815g1 = executorServiceNewCachedThreadPool;
        }
        ExecutorService executorService = this.f3815g1;
        if (executorService != null) {
            return executorService;
        }
        br.l.l("_executor");
        throw null;
    }

    public final r2 I0() {
        if (this.J2 == null) {
            this.J2 = new r2(19);
        }
        r2 r2Var = this.J2;
        if (r2Var != null) {
            return r2Var;
        }
        br.l.l("_sharedJobDataRepository");
        throw null;
    }

    public final p J() {
        if (this.Q3 == null) {
            this.Q3 = new p(5, B());
        }
        p pVar = this.Q3;
        if (pVar != null) {
            return pVar;
        }
        br.l.l("_exoPlayerVersionChecker");
        throw null;
    }

    public final r2 J0() {
        if (this.S2 == null) {
            PowerManager powerManagerQ0 = q0();
            ActivityManager activityManagerB = b();
            if (this.R0 == null && F().f3941a >= 22) {
                Object systemService = d().getApplicationContext().getSystemService("usagestats");
                br.l.c(systemService, "null cannot be cast to non-null type android.app.usage.UsageStatsManager");
                this.R0 = (UsageStatsManager) systemService;
            }
            UsageStatsManager usageStatsManager = this.R0;
            String packageName = d().getApplicationContext().getPackageName();
            br.l.d(packageName, "getPackageName(...)");
            String str = ((Context) t0().f195a).getApplicationContext().getApplicationInfo().processName;
            br.l.d(str, "processName");
            f fVarF = F();
            r2 r2Var = new r2();
            r2Var.f10470a = powerManagerQ0;
            r2Var.f10471d = activityManagerB;
            r2Var.f10472g = usageStatsManager;
            r2Var.f10473r = str;
            r2Var.f10474x = packageName;
            r2Var.f10475y = fVarF;
            this.S2 = r2Var;
        }
        r2 r2Var2 = this.S2;
        if (r2Var2 != null) {
            return r2Var2;
        }
        br.l.l("_systemStatus");
        throw null;
    }

    public final bm.d K() throws Throwable {
        xi.j jVarO = o();
        LinkedHashMap linkedHashMap = (LinkedHashMap) U0().f8952m;
        if (this.P1 == null) {
            String absolutePath = d().getFilesDir().getAbsolutePath();
            br.l.d(absolutePath, "getAbsolutePath(...)");
            this.P1 = new vh.a(absolutePath, I(), A(), n(), c(), P0(), r());
        }
        vh.a aVar = this.P1;
        if (aVar != null) {
            return new bm.d(jVarO, linkedHashMap, aVar);
        }
        br.l.l("_mlvisDiskLogger");
        throw null;
    }

    public final of.b K0() {
        if (this.f3894s == null) {
            if (this.f3853m == null) {
                if (this.f3846l == null) {
                    this.f3846l = new h(r(), D0());
                }
                h hVar = this.f3846l;
                if (hVar == null) {
                    br.l.l("_executorService");
                    throw null;
                }
                this.f3853m = new bm.d(hVar, A());
            }
            bm.d dVar = this.f3853m;
            if (dVar == null) {
                br.l.l("_shortPipeline");
                throw null;
            }
            if (this.f3873p == null) {
                Context contextD = d();
                f fVarF = F();
                if (this.f3880q == null) {
                    Object systemService = d().getSystemService("alarm");
                    br.l.c(systemService, "null cannot be cast to non-null type android.app.AlarmManager");
                    this.f3880q = (AlarmManager) systemService;
                }
                AlarmManager alarmManager = this.f3880q;
                if (alarmManager == null) {
                    br.l.l("_alarmManager");
                    throw null;
                }
                if (this.X0 == null) {
                    this.X0 = new gi.a(4);
                }
                gi.a aVar = this.X0;
                if (aVar == null) {
                    br.l.l("_alarmManagerJobDataMapper");
                    throw null;
                }
                this.f3873p = new cj.a(contextD, fVarF, alarmManager, aVar, k(), r(), n());
            }
            cj.a aVar2 = this.f3873p;
            if (aVar2 == null) {
                br.l.l("_alarmManagerPipeline");
                throw null;
            }
            if (this.f3860n == null) {
                Context contextD2 = d();
                f fVarF2 = F();
                JobScheduler jobSchedulerT = T();
                if (this.f3906u == null) {
                    this.f3906u = new gi.a(5);
                }
                gi.a aVar3 = this.f3906u;
                if (aVar3 == null) {
                    br.l.l("_jobSchedulerTaskMapper");
                    throw null;
                }
                r();
                r rVar = new r();
                rVar.f14395a = fVarF2;
                rVar.f14396d = jobSchedulerT;
                rVar.f14397g = aVar3;
                rVar.f14398r = contextD2;
                this.f3860n = rVar;
            }
            r rVar2 = this.f3860n;
            if (rVar2 == null) {
                br.l.l("_longRunningPipeline");
                throw null;
            }
            if (this.f3867o == null) {
                this.f3867o = new bm.d(d(), F(), T(), r(), 11);
            }
            bm.d dVar2 = this.f3867o;
            if (dVar2 == null) {
                br.l.l("_keepAlivePipeline");
                throw null;
            }
            this.f3894s = new of.b(dVar, aVar2, rVar2, dVar2, H(), P0(), l0(), n());
        }
        of.b bVar = this.f3894s;
        if (bVar != null) {
            return bVar;
        }
        br.l.l("_taskExecutor");
        throw null;
    }

    public final r L() {
        if (this.T2 == null) {
            if (this.f3891r3 == null) {
                this.f3891r3 = new com.opensignal.sdk.common.measurements.base.e(F());
            }
            com.opensignal.sdk.common.measurements.base.e eVar = this.f3891r3;
            if (eVar == null) {
                br.l.l("_nrStateRegexMatcher");
                throw null;
            }
            this.T2 = new r(eVar, F(), H0(), m0());
        }
        r rVar = this.T2;
        if (rVar != null) {
            return rVar;
        }
        br.l.l("_fiveGExtractorFactory");
        throw null;
    }

    public final cj.q L0() {
        if (this.f3827i == null) {
            this.f3827i = new cj.q(this, false);
        }
        cj.q qVar = this.f3827i;
        if (qVar != null) {
            return qVar;
        }
        br.l.l("_taskFactory");
        throw null;
    }

    public final sm.m M() {
        if (this.H1 == null) {
            this.H1 = new sm.m();
        }
        sm.m mVar = this.H1;
        if (mVar != null) {
            return mVar;
        }
        br.l.l("_googlePlayServicesLocation");
        throw null;
    }

    public abstract v2 M0();

    public final synchronized q3.a N() {
        q3.a aVar;
        try {
            if (this.f3806f == null) {
                this.f3806f = new q3.a(U(), 21, A());
            }
            aVar = this.f3806f;
            if (aVar == null) {
                br.l.l("_installationInfoRepository");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final xj.m N0() throws Throwable {
        if (this.f3856m2 == null) {
            df.c cVarA = A();
            dj.h hVarY0 = Y0();
            cj.q qVarP = P();
            ek.c cVarS = S();
            if (this.f3863n2 == null) {
                this.f3863n2 = new xj.j(1);
            }
            xj.j jVar = this.f3863n2;
            if (jVar == null) {
                br.l.l("_scheduleConfigMapper");
                throw null;
            }
            this.f3856m2 = new xj.m(cVarA, hVarY0, qVarP, cVarS, jVar, I0(), s0(), J0(), O0(), R0(), n(), Z(), o(), u0(), G(), Q(), q());
        }
        xj.m mVar = this.f3856m2;
        if (mVar != null) {
            return mVar;
        }
        br.l.l("_taskItemItemConfigMapper");
        throw null;
    }

    public final ek.c O() {
        if (this.J0 == null) {
            qj.a aVarV = v();
            if (this.F0 == null) {
                this.F0 = new hi.a(0);
            }
            hi.a aVar = this.F0;
            if (aVar == null) {
                br.l.l("_ipCacheDatabaseTable");
                throw null;
            }
            if (this.G0 == null) {
                this.G0 = new gi.a(0);
            }
            gi.a aVar2 = this.G0;
            if (aVar2 == null) {
                br.l.l("_ipCacheTableMapper");
                throw null;
            }
            this.J0 = new ek.c(aVarV, aVar, aVar2);
        }
        ek.c cVar = this.J0;
        if (cVar != null) {
            return cVar;
        }
        br.l.l("_ipCacheRepository");
        throw null;
    }

    public final bj.c O0() {
        if (this.f3817g3 == null) {
            this.f3817g3 = new bj.c(S0().b(), u(), A(), k0(), Process.myUid(), 0);
        }
        bj.c cVar = this.f3817g3;
        if (cVar != null) {
            return cVar;
        }
        br.l.l("_taskNetworkStatsCollectorFactory");
        throw null;
    }

    public final cj.q P() {
        if (this.k == null) {
            this.k = new cj.q(this, false);
        }
        cj.q qVar = this.k;
        if (qVar != null) {
            return qVar;
        }
        br.l.l("_jobFactory");
        throw null;
    }

    public final synchronized r2 P0() {
        r2 r2Var;
        try {
            if (this.G == null) {
                qj.a aVarV = v();
                if (this.f3900t == null) {
                    this.f3900t = new gi.e(this);
                }
                gi.e eVar = this.f3900t;
                if (eVar == null) {
                    br.l.l("_taskMapper");
                    throw null;
                }
                if (this.f3924x == null) {
                    this.f3924x = new h9.p(1);
                }
                h9.p pVar = this.f3924x;
                if (pVar == null) {
                    br.l.l("_runningTasksDataSource");
                    throw null;
                }
                this.G = new r2(aVarV, eVar, pVar, y0(), U());
            }
            r2Var = this.G;
            if (r2Var == null) {
                br.l.l("_taskRepository");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return r2Var;
    }

    public final io.sentry.hints.i Q() {
        if (this.U == null) {
            this.U = new io.sentry.hints.i(27);
        }
        io.sentry.hints.i iVar = this.U;
        if (iVar != null) {
            return iVar;
        }
        br.l.l("_jobIdFactory");
        throw null;
    }

    public final synchronized hk.k Q0() {
        hk.k kVar;
        try {
            if (this.R == null) {
                Context contextD = d();
                a8.f fVarT0 = t0();
                of.b bVarK0 = K0();
                r2 r2VarP0 = P0();
                if (this.H == null) {
                    this.H = new om.f(A());
                }
                om.f fVar = this.H;
                if (fVar == null) {
                    br.l.l("_completedTasksRepository");
                    throw null;
                }
                if (this.I == null) {
                    this.I = new h9.p(A());
                }
                h9.p pVar = this.I;
                if (pVar == null) {
                    br.l.l("_sentResultsRepository");
                    throw null;
                }
                al.g gVarH = H();
                sm.m mVarX0 = X0();
                if (this.f3793d == null) {
                    this.f3793d = new dj.g(this, false);
                }
                dj.g gVar = this.f3793d;
                if (gVar == null) {
                    br.l.l("_triggerRegistry");
                    throw null;
                }
                h0 h0VarZ0 = Z0();
                if (this.P == null) {
                    this.P = new l2(18, i());
                }
                l2 l2Var = this.P;
                if (l2Var == null) {
                    br.l.l("_jobResultProcessor");
                    throw null;
                }
                this.R = new hk.k(contextD, fVarT0, bVarK0, r2VarP0, fVar, pVar, gVarH, mVarX0, gVar, h0VarZ0, l2Var, L0(), A(), s0(), x0(), l0(), I0(), r());
                n.b("BaseServiceLocator", "_taskScheduler instance set");
            }
            kVar = this.R;
            if (kVar == null) {
                br.l.l("_taskScheduler");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return kVar;
    }

    public final hi.a R() {
        if (this.D0 == null) {
            this.D0 = new hi.a(1);
        }
        hi.a aVar = this.D0;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("_jobResultDatabaseTable");
        throw null;
    }

    public final ek.c R0() {
        if (this.f3831i3 == null) {
            qj.a aVarV = v();
            if (this.W == null) {
                this.W = new gi.a(1);
            }
            gi.a aVar = this.W;
            if (aVar == null) {
                br.l.l("_taskDataUsageTableMapper");
                throw null;
            }
            if (this.E0 == null) {
                this.E0 = new hi.a(4);
            }
            hi.a aVar2 = this.E0;
            if (aVar2 == null) {
                br.l.l("_taskStatsDatabaseTable");
                throw null;
            }
            this.f3831i3 = new ek.c(aVarV, aVar, aVar2);
        }
        ek.c cVar = this.f3831i3;
        if (cVar != null) {
            return cVar;
        }
        br.l.l("_taskStatsRepository");
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v0 xj.f, still in use, count: 3, list:
          (r7v0 xj.f) from 0x00f3: MOVE (r16v0 xj.f) = (r7v0 xj.f) (LINE:244)
          (r7v0 xj.f) from 0x00de: MOVE (r16v3 xj.f) = (r7v0 xj.f) (LINE:223)
          (r7v0 xj.f) from 0x00d4: MOVE (r16v5 xj.f) = (r7v0 xj.f) (LINE:213)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final ek.c S() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 828
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ch.d.S():ek.c");
    }

    public final dj.g S0() {
        if (this.f3835j1 == null) {
            this.f3835j1 = new dj.g(this, false);
        }
        dj.g gVar = this.f3835j1;
        if (gVar != null) {
            return gVar;
        }
        br.l.l("_telephonyFactory");
        throw null;
    }

    public final JobScheduler T() {
        if (this.f3887r == null) {
            Object systemService = d().getSystemService("jobscheduler");
            br.l.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
            this.f3887r = (JobScheduler) systemService;
        }
        JobScheduler jobScheduler = this.f3887r;
        if (jobScheduler != null) {
            return jobScheduler;
        }
        br.l.l("_jobScheduler");
        throw null;
    }

    public final cj.a T0() {
        if (this.f3848l1 == null) {
            this.f3848l1 = new cj.a(d(), V0(), F());
        }
        cj.a aVar = this.f3848l1;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("_telephonyManagerProvider");
        throw null;
    }

    public final synchronized om.f U() {
        om.f fVar;
        try {
            if (this.f3800e == null) {
                this.f3800e = new om.f(v(), 28, V());
            }
            fVar = this.f3800e;
            if (fVar == null) {
                br.l.l("_keyValueRepository");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return fVar;
    }

    public final o U0() {
        if (this.f3780a5 == null) {
            cj.a aVarT0 = T0();
            f fVarF = F();
            df.c cVarA = A();
            if (this.E2 == null) {
                this.E2 = new df.c();
            }
            df.c cVar = this.E2;
            if (cVar == null) {
                br.l.l("_phoneStateListenerFactory");
                throw null;
            }
            this.f3780a5 = new o(aVarT0, fVarF, cVarA, cVar, new xj.j(2), o0(), n0(), j(), s0(), c0(), n(), I());
        }
        o oVar = this.f3780a5;
        if (oVar != null) {
            return oVar;
        }
        br.l.l("_telephonyPhoneStateProvider");
        throw null;
    }

    public final hi.a V() {
        if (this.f3936z == null) {
            this.f3936z = new hi.a(2);
        }
        hi.a aVar = this.f3936z;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("_keyValueTable");
        throw null;
    }

    public final bk.k V0() {
        bk.k iVar;
        if (this.f3841k1 == null) {
            if (F().f3941a >= 22) {
                f fVarF = F();
                ag.b bVarO0 = o0();
                Object systemService = d().getSystemService("telephony_subscription_service");
                iVar = new js.e(fVarF, bVarO0, systemService instanceof SubscriptionManager ? (SubscriptionManager) systemService : null);
            } else {
                iVar = new io.sentry.hints.i(25);
            }
            this.f3841k1 = iVar;
        }
        bk.k kVar = this.f3841k1;
        if (kVar != null) {
            return kVar;
        }
        br.l.l("_telephonySubscriptions");
        throw null;
    }

    public final h0 W() {
        if (this.e4 == null) {
            if (this.f3811f4 == null) {
                Locale locale = Locale.getDefault();
                br.l.d(locale, "getDefault(...)");
                this.f3811f4 = locale;
            }
            Locale locale2 = this.f3811f4;
            if (locale2 == null) {
                br.l.l("_defaultLocale");
                throw null;
            }
            br.l.e(locale2, "locale");
            h0 h0Var = new h0();
            h0Var.f10078a = locale2;
            this.e4 = h0Var;
        }
        h0 h0Var2 = this.e4;
        if (h0Var2 != null) {
            return h0Var2;
        }
        br.l.l("_languageInfo");
        throw null;
    }

    public final io.sentry.internal.debugmeta.c W0() {
        if (this.K0 == null) {
            this.K0 = new io.sentry.internal.debugmeta.c(F());
        }
        io.sentry.internal.debugmeta.c cVar = this.K0;
        if (cVar != null) {
            return cVar;
        }
        br.l.l("_trafficStatTagger");
        throw null;
    }

    public final SQLiteOpenHelper X() {
        SQLiteDatabase.CursorFactory cursorFactory = null;
        if (this.S4 == null) {
            o2.g gVarS = s();
            String strX = gVarS.X("cNiYP04ld0wos1bfg+bBAYmD0pCpMOV/OH5RLT6qaSM=");
            String strX2 = gVarS.X("XU92U0LGH5d54777MKjheaL1QJ/KEKXJACMDUJbBR3Ql70bLIX4/dSYTxUjXsuXl");
            boolean zQ0 = tt.l.q0("com.opensignal.sdk", strX, false);
            boolean zQ02 = tt.l.q0("com.opensignal.sdk", strX2, false);
            String strX3 = gVarS.X("JYwegjASYZFI9NoTK9X80NtFm6x5gBc/PjDiLCIK18MLySENcJ+wrk8SjPpPw8Ou");
            String strX4 = gVarS.X("uvidtFVX9AF9DS19QEnGkSh3ZouJdALzY41dLUlAXEJpCsFzC/ut3B6XAXquNVL7");
            if ((!zQ02 || !a(strX3)) && zQ0 && a(strX4)) {
                strX3 = strX4;
            }
            Context contextD = d();
            ii.c.Companion.getClass();
            this.S4 = new pi.a(contextD, strX3, cursorFactory, ii.b.a(), 0);
        }
        pi.a aVar = this.S4;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("_legacyDatabaseHelper");
        throw null;
    }

    public final sm.m X0() {
        if (this.L == null) {
            this.L = new sm.m();
        }
        sm.m mVar = this.L;
        if (mVar != null) {
            return mVar;
        }
        br.l.l("_triggerChecker");
        throw null;
    }

    public final bk.f Y() {
        if (this.F1 == null) {
            pc.a aVar = this.K1;
            ac.a aVar2 = ac.b.f322a;
            if (aVar == null) {
                M();
                Context contextD = d();
                int i10 = tc.a.f22695a;
                this.K1 = new pc.a(contextD, null, pc.a.j, aVar2, ac.e.f324b);
            }
            pc.a aVar3 = this.K1;
            if (aVar3 == null) {
                br.l.l("_fusedLocationProviderClient");
                throw null;
            }
            r2 r2VarJ0 = J0();
            if (this.I1 == null) {
                M();
                Context contextD2 = d();
                int i11 = tc.a.f22695a;
                this.I1 = new pc.a(contextD2, null, pc.a.j, aVar2, ac.e.f324b);
            }
            pc.a aVar4 = this.I1;
            if (aVar4 == null) {
                br.l.l("_settingsClient");
                throw null;
            }
            ag.b bVarO0 = o0();
            q3.a aVarN = n();
            qm.c cVarA0 = a0();
            if (this.f3912v == null) {
                this.f3912v = new gi.e(F(), A());
            }
            gi.e eVar = this.f3912v;
            if (eVar == null) {
                br.l.l("_deviceLocationMapper");
                throw null;
            }
            Executor executorI = I();
            sm.m mVarM = M();
            br.l.e(aVar3, "fusedLocationProviderClient");
            br.l.e(aVar4, "settingsClient");
            br.l.e(eVar, "deviceLocationMapper");
            bk.f fVar = new bk.f();
            fVar.f2803a = aVar3;
            fVar.f2804b = r2VarJ0;
            fVar.f2805c = aVar4;
            fVar.f2806d = bVarO0;
            fVar.f2807e = aVarN;
            fVar.f2808f = cVarA0;
            fVar.f2809g = eVar;
            fVar.f2810h = executorI;
            fVar.f2811i = mVarM;
            fVar.j = new ji.a(1, fVar);
            fVar.k = new ji.a(0, fVar);
            this.F1 = fVar;
        }
        bk.f fVar2 = this.F1;
        if (fVar2 != null) {
            return fVar2;
        }
        br.l.l("_locationDataSource");
        throw null;
    }

    public final dj.h Y0() {
        if (this.j == null) {
            this.j = new dj.h(this, (byte) 0);
        }
        dj.h hVar = this.j;
        if (hVar != null) {
            return hVar;
        }
        br.l.l("_triggerFactory");
        throw null;
    }

    public final u Z() {
        if (this.E1 == null) {
            q3.a aVarN = n();
            this.E1 = new u(I(), Y(), a0(), o0(), U(), D(), b0(), r(), s0(), aVarN, new qm.c(new p(23), aVarN, new sm.m()));
        }
        u uVar = this.E1;
        if (uVar != null) {
            return uVar;
        }
        br.l.l("_locationRepository");
        throw null;
    }

    public final synchronized h0 Z0() {
        h0 h0Var;
        try {
            if (this.O == null) {
                this.O = new h0();
            }
            h0Var = this.O;
            if (h0Var == null) {
                br.l.l("_triggerMonitor");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h0Var;
    }

    public final boolean a(String str) {
        try {
            return d().getDatabasePath(str).exists();
        } catch (Exception e4) {
            n.d("BaseServiceLocator", "Error checking if database exists: ".concat(str), e4);
            return false;
        }
    }

    public final synchronized qm.c a0() {
        qm.c cVar;
        try {
            if (this.G1 == null) {
                qm.c cVar2 = new qm.c(20);
                this.G1 = cVar2;
                cVar2.f20918d = Y();
            }
            cVar = this.G1;
            if (cVar == null) {
                br.l.l("_locationSettingsRepository");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return cVar;
    }

    public final WifiManager a1() {
        if (this.M0 == null) {
            Object systemService = d().getApplicationContext().getSystemService("wifi");
            br.l.c(systemService, "null cannot be cast to non-null type android.net.wifi.WifiManager");
            this.M0 = (WifiManager) systemService;
        }
        WifiManager wifiManager = this.M0;
        if (wifiManager != null) {
            return wifiManager;
        }
        br.l.l("_wifiManager");
        throw null;
    }

    public final ActivityManager b() {
        if (this.Q0 == null) {
            Object systemService = d().getApplicationContext().getSystemService("activity");
            br.l.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
            this.Q0 = (ActivityManager) systemService;
        }
        ActivityManager activityManager = this.Q0;
        if (activityManager != null) {
            return activityManager;
        }
        br.l.l("_activityManager");
        throw null;
    }

    public final js.e b0() {
        if (this.L1 == null) {
            df.c cVarA = A();
            q3.a aVarN = n();
            if (this.X2 == null) {
                this.X2 = new cg.e();
            }
            cg.e eVar = this.X2;
            if (eVar == null) {
                br.l.l("_handlerFactory");
                throw null;
            }
            js.e eVar2 = new js.e(cVarA, aVarN, eVar);
            this.L1 = eVar2;
            if (Looper.myLooper() == null) {
                Looper.prepare();
            }
            eVar2.f13800x = new Handler();
        }
        js.e eVar3 = this.L1;
        if (eVar3 != null) {
            return eVar3;
        }
        br.l.l("_locationValidator");
        throw null;
    }

    public final r2 b1() {
        if (this.V2 == null) {
            WifiManager wifiManagerA1 = a1();
            ag.b bVarO0 = o0();
            f fVarF = F();
            Context contextD = d();
            if (this.f3940z4 == null) {
                this.f3940z4 = new yh.c(18);
            }
            yh.c cVar = this.f3940z4;
            if (cVar == null) {
                br.l.l("_systemClockCompat");
                throw null;
            }
            if (this.f3857m3 == null) {
                this.f3857m3 = new js.e(22);
            }
            js.e eVar = this.f3857m3;
            if (eVar == null) {
                br.l.l("_detailedWifiStateRepository");
                throw null;
            }
            r2 r2Var = new r2();
            r2Var.f10470a = wifiManagerA1;
            r2Var.f10471d = bVarO0;
            r2Var.f10472g = fVarF;
            r2Var.f10473r = contextD.getApplicationContext();
            r2Var.f10474x = cVar;
            r2Var.f10475y = eVar;
            this.V2 = r2Var;
        }
        r2 r2Var2 = this.V2;
        if (r2Var2 != null) {
            return r2Var2;
        }
        br.l.l("_wifiStatus");
        throw null;
    }

    public final xi.a c() {
        if (this.f3820h == null) {
            this.f3820h = new xi.a();
        }
        xi.a aVar = this.f3820h;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("_appVisibilityRepository");
        throw null;
    }

    public final l2 c0() {
        if (this.f3904t3 == null) {
            if (this.X2 == null) {
                this.X2 = new cg.e();
            }
            if (this.X2 == null) {
                br.l.l("_handlerFactory");
                throw null;
            }
            Looper mainLooper = Looper.getMainLooper();
            br.l.d(mainLooper, "getMainLooper(...)");
            this.f3904t3 = new l2(6, new Handler(mainLooper));
        }
        l2 l2Var = this.f3904t3;
        if (l2Var != null) {
            return l2Var;
        }
        br.l.l("_looperPoster");
        throw null;
    }

    public final void c1(Context context) {
        if (this.f3775a == null) {
            this.f3775a = context;
        }
    }

    public final Context d() {
        Context context = this.f3775a;
        if (context != null) {
            return context;
        }
        br.l.l("_context");
        throw null;
    }

    public final zj.b d0() throws Throwable {
        Throwable th2;
        z.b bVar;
        yi.g gVar;
        z.b bVar2;
        z4.d dVar;
        z4.f fVar;
        z4.e eVar;
        if (this.f3803e2 == null) {
            if (this.U1 == null) {
                this.U1 = new z4.d(r(), 18);
            }
            z4.d dVar2 = this.U1;
            if (dVar2 == null) {
                br.l.l("_backgroundConfigMapper");
                throw null;
            }
            if (this.Y1 == null) {
                this.Y1 = new z4.e(r(), 19);
            }
            z4.e eVar2 = this.Y1;
            if (eVar2 == null) {
                br.l.l("_locationConfigMapper");
                throw null;
            }
            if (this.Z1 == null) {
                if (this.f3778a2 == null) {
                    this.f3778a2 = new gi.a(r(), 11);
                }
                gi.a aVar = this.f3778a2;
                if (aVar == null) {
                    br.l.l("_udpConfigItemMapper");
                    throw null;
                }
                this.Z1 = new z7.b(aVar, r());
            }
            z7.b bVar3 = this.Z1;
            if (bVar3 == null) {
                br.l.l("_udpConfigMapper");
                throw null;
            }
            zj.d dVar3 = (zj.d) this.f3805e5.getValue();
            if (this.b2 == null) {
                if (this.f3816g2 == null) {
                    if (this.f3823h2 == null) {
                        this.f3823h2 = new z4.f(r(), 20);
                    }
                    z4.f fVar2 = this.f3823h2;
                    if (fVar2 == null) {
                        br.l.l("_testServerItemMapper");
                        throw null;
                    }
                    this.f3816g2 = new y9.u(fVar2, r());
                }
                y9.u uVar = this.f3816g2;
                if (uVar == null) {
                    br.l.l("_testConfigMapper");
                    throw null;
                }
                this.b2 = new y9.u(uVar, r());
            }
            y9.u uVar2 = this.b2;
            if (uVar2 == null) {
                br.l.l("_speedTestConfigJsonMapper");
                throw null;
            }
            if (this.f3790c2 == null) {
                if (this.f3830i2 == null) {
                    this.f3830i2 = new yh.c(r(), 21);
                }
                yh.c cVar = this.f3830i2;
                if (cVar == null) {
                    br.l.l("_videoConfigItemMapper");
                    throw null;
                }
                if (this.f3928x3 == null) {
                    this.f3928x3 = new z4.d(r(), 19);
                }
                z4.d dVar4 = this.f3928x3;
                if (dVar4 == null) {
                    br.l.l("_innerTubeConfigMapper");
                    throw null;
                }
                if (this.f3934y3 == null) {
                    this.f3934y3 = new yi.g(r(), 18);
                }
                yi.g gVar2 = this.f3934y3;
                if (gVar2 == null) {
                    br.l.l("_adaptiveConfigMapper");
                    throw null;
                }
                this.f3790c2 = new zi.a(cVar, dVar4, gVar2, r());
            }
            zi.a aVar2 = this.f3790c2;
            if (aVar2 == null) {
                br.l.l("_videoConfigMapper");
                throw null;
            }
            if (this.W1 == null) {
                this.W1 = new zc.d(r(), 20);
            }
            zc.d dVar5 = this.W1;
            if (dVar5 == null) {
                br.l.l("_traceRouteConfigMapper");
                throw null;
            }
            if (this.X1 == null) {
                this.X1 = new zc.d(r(), 18);
            }
            zc.d dVar6 = this.X1;
            if (dVar6 == null) {
                br.l.l("_dataLimitsConfigMapper");
                throw null;
            }
            if (this.C3 == null) {
                cj.a aVarR = r();
                if (this.D3 == null) {
                    this.D3 = new gi.a(r(), 9);
                }
                gi.a aVar3 = this.D3;
                if (aVar3 == null) {
                    br.l.l("_throughputDownloadTestConfigMapper");
                    throw null;
                }
                if (this.E3 == null) {
                    this.E3 = new gi.a(r(), 10);
                }
                gi.a aVar4 = this.E3;
                if (aVar4 == null) {
                    br.l.l("_throughputUploadTestConfigMapper");
                    throw null;
                }
                this.C3 = new xr.a(aVarR, aVar3, aVar4);
            }
            xr.a aVar5 = this.C3;
            if (aVar5 == null) {
                br.l.l("_throughputTestConfigMapper");
                throw null;
            }
            if (this.N3 == null) {
                this.N3 = new z.b(r(), 19);
            }
            z.b bVar4 = this.N3;
            if (bVar4 == null) {
                br.l.l("_icmpTestConfigMapper");
                throw null;
            }
            cj.a aVarR2 = r();
            if (this.P3 == null) {
                this.P3 = new z4.e(r(), 18);
            }
            z4.e eVar3 = this.P3;
            if (eVar3 == null) {
                br.l.l("_cellConfigMapper");
                throw null;
            }
            if (this.W3 == null) {
                this.W3 = new z.b(20);
            }
            z.b bVar5 = this.W3;
            if (bVar5 == null) {
                br.l.l("_sdkDataUsageLimitsMapper");
                throw null;
            }
            if (this.A3 == null) {
                if (this.B3 == null) {
                    th2 = null;
                    bVar = bVar4;
                    this.B3 = new z4.e(r(), 20);
                } else {
                    bVar = bVar4;
                    th2 = null;
                }
                z4.e eVar4 = this.B3;
                if (eVar4 == null) {
                    br.l.l("_serverResponseTestServerConfigMapper");
                    throw th2;
                }
                this.A3 = new z7.j(eVar4, r());
            } else {
                bVar = bVar4;
                th2 = null;
            }
            z7.j jVar = this.A3;
            if (jVar == null) {
                br.l.l("_serverResponseTestConfigMapper");
                throw th2;
            }
            if (this.f3917v4 == null) {
                this.f3917v4 = new yi.g(r(), 21);
            }
            yi.g gVar3 = this.f3917v4;
            if (gVar3 == null) {
                br.l.l("_wifiScanConfigMapper");
                throw th2;
            }
            if (this.E4 == null) {
                gVar = gVar3;
                this.E4 = new z.b(r(), 18);
            } else {
                gVar = gVar3;
            }
            z.b bVar6 = this.E4;
            if (bVar6 == null) {
                br.l.l("_assistantConfigMapper");
                throw th2;
            }
            if (this.T1 == null) {
                bVar2 = bVar6;
                this.T1 = new z4.d(r(), 20);
            } else {
                bVar2 = bVar6;
            }
            z4.d dVar7 = this.T1;
            if (dVar7 == null) {
                br.l.l("_sdkInSdkConfigMapper");
                throw th2;
            }
            if (this.O1 == null) {
                dVar = dVar7;
                this.O1 = new z4.f(r(), 19);
            } else {
                dVar = dVar7;
            }
            z4.f fVar3 = this.O1;
            if (fVar3 == null) {
                br.l.l("_mlvisConfigMapper");
                throw th2;
            }
            if (this.U4 == null) {
                if (this.V4 == null) {
                    fVar = fVar3;
                    eVar = eVar3;
                    this.V4 = new yi.g(r(), 19);
                } else {
                    fVar = fVar3;
                    eVar = eVar3;
                }
                yi.g gVar4 = this.V4;
                if (gVar4 == null) {
                    br.l.l("_httpHeadLatencyEndpointMapper");
                    throw th2;
                }
                this.U4 = new z7.b(gVar4, r());
            } else {
                fVar = fVar3;
                eVar = eVar3;
            }
            z7.b bVar7 = this.U4;
            if (bVar7 == null) {
                br.l.l("_httpHeadLatencyConfigMapper");
                throw th2;
            }
            if (this.V1 == null) {
                this.V1 = new zc.d(r(), 19);
            }
            zc.d dVar8 = this.V1;
            if (dVar8 == null) {
                br.l.l("_networkRestrictionsConfigMapper");
                throw th2;
            }
            this.f3803e2 = new zj.b(dVar2, eVar2, bVar3, dVar3, uVar2, aVar2, dVar5, dVar6, jVar, aVar5, bVar, eVar, bVar5, gVar, bVar2, dVar, fVar, bVar7, dVar8, new yh.c(r(), 20), aVarR2);
        } else {
            th2 = null;
        }
        zj.b bVar8 = this.f3803e2;
        if (bVar8 != null) {
            return bVar8;
        }
        br.l.l("_measurementConfigMapper");
        throw th2;
    }

    public final AudioManager e() {
        if (this.f3855m1 == null) {
            Object systemService = d().getSystemService("audio");
            br.l.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            this.f3855m1 = (AudioManager) systemService;
        }
        AudioManager audioManager = this.f3855m1;
        if (audioManager != null) {
            return audioManager;
        }
        br.l.l("_audioManager");
        throw null;
    }

    public final bk.c e0() {
        if (this.f3843k3 == null) {
            this.f3843k3 = F().b() ? new of.b(p(), o0()) : new sm.f(25);
        }
        bk.c cVar = this.f3843k3;
        if (cVar != null) {
            return cVar;
        }
        br.l.l("_networkCallbackMonitor");
        throw null;
    }

    public final al.b f() {
        if (this.M1 == null) {
            xr.a aVarM = m();
            q3.a aVarN = n();
            hk.k kVarQ0 = Q0();
            if (this.f3793d == null) {
                this.f3793d = new dj.g(this, false);
            }
            dj.g gVar = this.f3793d;
            if (gVar == null) {
                br.l.l("_triggerRegistry");
                throw null;
            }
            A();
            r();
            xj.m mVarN0 = N0();
            bm.d dVarK = K();
            tv.b bVarC0 = C0();
            xh.a aVar = (xh.a) this.f3819g5.getValue();
            br.l.e(aVar, "deviceReportingExclusionRepository");
            al.b bVar = new al.b();
            bVar.f810b = aVarN;
            bVar.f811c = aVarM;
            bVar.f812d = aVarN;
            bVar.f813e = kVarQ0;
            bVar.f814f = gVar;
            bVar.f815g = mVarN0;
            bVar.f816h = dVarK;
            bVar.f809a = bVarC0;
            bVar.f817i = aVar;
            this.M1 = bVar;
        }
        al.b bVar2 = this.M1;
        if (bVar2 != null) {
            return bVar2;
        }
        br.l.l("_configInitialiser");
        throw null;
    }

    public final q3.a f0() {
        if (this.F2 == null) {
            this.F2 = new q3.a(29, o0(), p(), false);
        }
        q3.a aVar = this.F2;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("_networkDetector");
        throw null;
    }

    public final cg.e g() {
        if (this.f3921w2 == null) {
            this.f3921w2 = new cg.e();
        }
        cg.e eVar = this.f3921w2;
        if (eVar != null) {
            return eVar;
        }
        br.l.l("_base64");
        throw null;
    }

    public final bk.f g0() {
        if (this.f3850l3 == null) {
            ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) I();
            bk.f fVar = new bk.f();
            fVar.f2803a = threadPoolExecutor;
            this.f3850l3 = fVar;
        }
        bk.f fVar2 = this.f3850l3;
        if (fVar2 != null) {
            return fVar2;
        }
        br.l.l("_networkEventStabiliser");
        throw null;
    }

    public final xi.e h() {
        if (this.f3789c1 == null) {
            this.f3789c1 = new xi.e(d(), 0);
        }
        xi.e eVar = this.f3789c1;
        if (eVar != null) {
            return eVar;
        }
        br.l.l("_batteryStateTriggerDataSource");
        throw null;
    }

    public final om.f h0() {
        if (this.L0 == null) {
            this.L0 = new om.f(W0(), 17, r());
        }
        om.f fVar = this.L0;
        if (fVar != null) {
            return fVar;
        }
        br.l.l("_networkFactory");
        throw null;
    }

    public final r1 i() {
        if (this.Q == null) {
            r1 r1Var = new r1((char) 0, 23);
            r1Var.f10199d = new ConcurrentHashMap();
            this.Q = r1Var;
        }
        r1 r1Var2 = this.Q;
        if (r1Var2 != null) {
            return r1Var2;
        }
        br.l.l("_binderRegistry");
        throw null;
    }

    public final cj.a i0() {
        if (this.f3864n3 == null) {
            if (this.f3891r3 == null) {
                this.f3891r3 = new com.opensignal.sdk.common.measurements.base.e(F());
            }
            com.opensignal.sdk.common.measurements.base.e eVar = this.f3891r3;
            if (eVar == null) {
                br.l.l("_nrStateRegexMatcher");
                throw null;
            }
            this.f3864n3 = new cj.a(eVar, n(), F(), H0(), m0());
        }
        cj.a aVar = this.f3864n3;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("_networkGenerationCheckerFactory");
        throw null;
    }

    public final fj.b j() {
        if (this.o3 == null) {
            f fVarF = F();
            i iVarN0 = n0();
            ag.b bVarO0 = o0();
            if (this.f3877p3 == null) {
                ak.d dVar = ((ak.g) n().f20680g).f529f.f449a;
                ag.b bVarO02 = o0();
                if (this.f3922w3 == null) {
                    Executor executorI = I();
                    if (this.f3916v3 == null) {
                        this.f3916v3 = new dd.o(4);
                    }
                    dd.o oVar = this.f3916v3;
                    if (oVar == null) {
                        br.l.l("_directExecutor");
                        throw null;
                    }
                    this.f3922w3 = new bm.e(executorI, oVar);
                }
                bm.e eVar = this.f3922w3;
                if (eVar == null) {
                    br.l.l("_executorFactory");
                    throw null;
                }
                f fVarF2 = F();
                br.l.e(eVar, "executorFactory");
                r rVar = new r();
                rVar.f14395a = dVar;
                rVar.f14396d = bVarO02;
                rVar.f14397g = eVar;
                rVar.f14398r = fVarF2;
                this.f3877p3 = rVar;
            }
            r rVar2 = this.f3877p3;
            if (rVar2 == null) {
                br.l.l("_cellInfoUpdaterFactory");
                throw null;
            }
            this.o3 = new fj.b(fVarF, iVarN0, bVarO0, rVar2, A(), ((ak.g) n().f20680g).f529f.f458l);
        }
        fj.b bVar = this.o3;
        if (bVar != null) {
            return bVar;
        }
        br.l.l("_cellsInfoRepository");
        throw null;
    }

    public final e0 j0() {
        if (this.T0 == null) {
            this.T0 = new e0(S0().b(), k0());
        }
        e0 e0Var = this.T0;
        if (e0Var != null) {
            return e0Var;
        }
        br.l.l("_networkGenerationDataSource");
        throw null;
    }

    public final cj.t k() {
        if (this.f3910u3 == null) {
            this.f3910u3 = new cj.t();
        }
        cj.t tVar = this.f3910u3;
        if (tVar != null) {
            return tVar;
        }
        br.l.l("_commandBundleCreator");
        throw null;
    }

    public final al.b k0() {
        if (this.f3829i1 == null) {
            f fVarF = F();
            WifiManager wifiManagerA1 = a1();
            ConnectivityManager connectivityManagerP = p();
            bk.c cVarE0 = e0();
            ag.b bVarO0 = o0();
            if (this.f3825h4 == null) {
                this.f3825h4 = new wh.c(0);
            }
            wh.c cVar = this.f3825h4;
            if (cVar == null) {
                br.l.l("_ipv4Obfuscator");
                throw null;
            }
            if (this.f3832i4 == null) {
                this.f3832i4 = new wh.c(1);
            }
            wh.c cVar2 = this.f3832i4;
            if (cVar2 == null) {
                br.l.l("_ipv6Obfuscator");
                throw null;
            }
            r2 r2VarB1 = b1();
            q3.a aVarN = n();
            br.l.e(cVar, "ipV4Obfuscator");
            br.l.e(cVar2, "ipV6Obfuscator");
            al.b bVar = new al.b();
            bVar.f810b = fVarF;
            bVar.f811c = wifiManagerA1;
            bVar.f812d = connectivityManagerP;
            bVar.f813e = cVarE0;
            bVar.f814f = bVarO0;
            bVar.f815g = cVar;
            bVar.f816h = cVar2;
            bVar.f809a = r2VarB1;
            bVar.f817i = aVarN;
            this.f3829i1 = bVar;
        }
        al.b bVar2 = this.f3829i1;
        if (bVar2 != null) {
            return bVar2;
        }
        br.l.l("_networkStateRepository");
        throw null;
    }

    public final wh.a l() {
        if (this.A4 == null) {
            io.sentry.internal.debugmeta.c cVarW0 = W0();
            wh.a aVar = new wh.a();
            aVar.f24526a = cVarW0;
            this.A4 = aVar;
        }
        wh.a aVar2 = this.A4;
        if (aVar2 != null) {
            return aVar2;
        }
        br.l.l("_commonNetworkUtils");
        throw null;
    }

    public final l2 l0() {
        if (this.S == null) {
            l2 l2Var = new l2(26, false);
            l2Var.f20100d = new AtomicBoolean(false);
            this.S = l2Var;
        }
        l2 l2Var2 = this.S;
        if (l2Var2 != null) {
            return l2Var2;
        }
        br.l.l("_networkTrafficRepository");
        throw null;
    }

    public final xr.a m() throws Throwable {
        if (this.N1 == null) {
            zj.b bVarD0 = d0();
            if (this.f3809f2 == null) {
                if (this.f3836j2 == null) {
                    this.f3836j2 = new dj.h(this, (byte) 0);
                }
                dj.h hVar = this.f3836j2;
                if (hVar == null) {
                    br.l.l("_taskConfigItemJsonMapper");
                    throw null;
                }
                if (this.f3842k2 == null) {
                    if (this.f3849l2 == null) {
                        this.f3849l2 = new z4.f(r(), 18);
                    }
                    z4.f fVar = this.f3849l2;
                    if (fVar == null) {
                        br.l.l("_crossTaskDelayConfigJsonMapper");
                        throw null;
                    }
                    this.f3842k2 = new z7.b(fVar, r());
                }
                z7.b bVar = this.f3842k2;
                if (bVar == null) {
                    br.l.l("_taskConfigJsonMapper");
                    throw null;
                }
                this.f3809f2 = new zj.c(hVar, bVar, r());
            }
            zj.c cVar = this.f3809f2;
            if (cVar == null) {
                br.l.l("_taskSchedulerConfigMapper");
                throw null;
            }
            this.N1 = new xr.a(bVarD0, cVar);
        }
        xr.a aVar = this.N1;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("_configMapper");
        throw null;
    }

    public final com.opensignal.sdk.common.measurements.base.c m0() {
        if (this.s1 == null) {
            if (this.f3902t1 == null) {
                this.f3902t1 = new b9.e(F());
            }
            b9.e eVar = this.f3902t1;
            if (eVar == null) {
                br.l.l("_nrFrequencyRangeParcelMapperFactory");
                throw null;
            }
            this.s1 = (com.opensignal.sdk.common.measurements.base.c) eVar.f2481d;
        }
        com.opensignal.sdk.common.measurements.base.c cVar = this.s1;
        if (cVar != null) {
            return cVar;
        }
        br.l.l("_nrFrequencyRangeParcelMapper");
        throw null;
    }

    public final synchronized q3.a n() {
        q3.a aVar;
        try {
            if (this.J1 == null) {
                this.J1 = new q3.a(this);
            }
            aVar = this.J1;
            if (aVar == null) {
                br.l.l("_configRepository");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final i n0() {
        if (this.f3903t2 == null) {
            this.f3903t2 = new i(d(), F());
        }
        i iVar = this.f3903t2;
        if (iVar != null) {
            return iVar;
        }
        br.l.l("_parentApplication");
        throw null;
    }

    public final xi.j o() throws Throwable {
        String str;
        Throwable th2;
        if (this.Y3 == null) {
            om.f fVarU = U();
            if (this.f3858m4 == null) {
                if (this.f3865n4 == null) {
                    this.f3865n4 = new gi.a(2);
                }
                gi.a aVar = this.f3865n4;
                if (aVar == null) {
                    br.l.l("_deviceConnectionJsonMapper");
                    throw null;
                }
                this.f3858m4 = new gi.c(aVar);
            }
            gi.c cVar = this.f3858m4;
            if (cVar == null) {
                br.l.l("_deviceConnectionListJsonMapper");
                throw null;
            }
            bk.c cVarE0 = e0();
            if (this.Z3 == null) {
                this.Z3 = new ee.f(6);
            }
            ee.f fVar = this.Z3;
            if (fVar == null) {
                br.l.l("_connectionChecker");
                throw null;
            }
            al.b bVarK0 = k0();
            fj.b bVarJ = j();
            dj.g gVarS0 = S0();
            r2 r2VarB1 = b1();
            df.c cVarA = A();
            u uVarZ = Z();
            q3.a aVarN = n();
            if (this.f3909u2 == null) {
                th2 = null;
                str = "_connectionRepository";
                this.f3909u2 = new xr.a(n(), L());
            } else {
                str = "_connectionRepository";
                th2 = null;
            }
            xr.a aVar2 = this.f3909u2;
            if (aVar2 == null) {
                br.l.l("_internalServiceStateProvider");
                throw th2;
            }
            this.Y3 = new xi.j(fVarU, cVar, cVarE0, fVar, bVarK0, bVarJ, gVarS0, r2VarB1, cVarA, uVarZ, aVarN, aVar2, D0(), u());
            fj.n nVar = (fj.n) ((LinkedHashMap) U0().f8952m).get(Integer.valueOf(V0().x()));
            xi.j jVar = this.Y3;
            if (jVar == null) {
                br.l.l(str);
                throw th2;
            }
            fj.n nVar2 = jVar.Q;
            if (nVar2 != null) {
                synchronized (nVar2.J) {
                    nVar2.J.remove(jVar);
                }
            }
            fj.n nVar3 = jVar.Q;
            if (nVar3 != null) {
                nVar3.e(jVar);
            }
            jVar.Q = nVar;
            if (jVar.R) {
                if (nVar != null) {
                    nVar.c(jVar);
                }
                fj.n nVar4 = jVar.Q;
                if (nVar4 != null) {
                    nVar4.b(jVar);
                }
            }
        } else {
            str = "_connectionRepository";
            th2 = null;
        }
        xi.j jVar2 = this.Y3;
        if (jVar2 != null) {
            return jVar2;
        }
        br.l.l(str);
        throw th2;
    }

    public final ag.b o0() {
        if (this.f3920w1 == null) {
            Context contextD = d();
            this.f3920w1 = new ag.b(i3.g.u(contextD), 15, contextD);
        }
        ag.b bVar = this.f3920w1;
        if (bVar != null) {
            return bVar;
        }
        br.l.l("_permissionChecker");
        throw null;
    }

    public final ConnectivityManager p() {
        if (this.M == null) {
            Object systemService = d().getSystemService("connectivity");
            br.l.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            this.M = (ConnectivityManager) systemService;
        }
        ConnectivityManager connectivityManager = this.M;
        if (connectivityManager != null) {
            return connectivityManager;
        }
        br.l.l("_connectivityManager");
        throw null;
    }

    public final xj.h p0() {
        if (this.f3919w0 == null) {
            this.f3919w0 = new ai.g(14);
        }
        ai.g gVar = this.f3919w0;
        if (gVar != null) {
            return gVar;
        }
        br.l.l("_permissionUploadMapper");
        throw null;
    }

    public final zh.a q() {
        return new zh.a(f0(), D0());
    }

    public final PowerManager q0() {
        if (this.O0 == null) {
            Object systemService = d().getApplicationContext().getSystemService("power");
            br.l.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            this.O0 = (PowerManager) systemService;
        }
        PowerManager powerManager = this.O0;
        if (powerManager != null) {
            return powerManager;
        }
        br.l.l("_powerManager");
        throw null;
    }

    public abstract cj.a r();

    public final xi.e r0() {
        if (this.f3783b1 == null) {
            this.f3783b1 = new xi.e(d(), 1);
        }
        xi.e eVar = this.f3783b1;
        if (eVar != null) {
            return eVar;
        }
        br.l.l("_powerConnectedStateTriggerDataSource");
        throw null;
    }

    public final o2.g s() {
        if (this.f3876p2 == null) {
            cg.e eVarG = g();
            if (this.f3927x2 == null) {
                g();
                this.f3927x2 = new df.c();
            }
            df.c cVar = this.f3927x2;
            if (cVar == null) {
                br.l.l("_masterKey");
                throw null;
            }
            this.f3876p2 = new o2.g(eVarG, cVar);
        }
        o2.g gVar = this.f3876p2;
        if (gVar != null) {
            return gVar;
        }
        br.l.l("_cryptor");
        throw null;
    }

    public final l2 s0() {
        if (this.f3787c == null) {
            this.f3787c = new l2(25, U());
        }
        l2 l2Var = this.f3787c;
        if (l2Var != null) {
            return l2Var;
        }
        br.l.l("_privacyRepository");
        throw null;
    }

    public final bm.e t() {
        if (this.X3 == null) {
            ek.c cVarR0 = R0();
            df.c cVarA = A();
            q3.a aVarN = n();
            if (this.W3 == null) {
                this.W3 = new z.b(20);
            }
            z.b bVar = this.W3;
            if (bVar == null) {
                br.l.l("_sdkDataUsageLimitsMapper");
                throw null;
            }
            this.X3 = new bm.e(cVarR0, cVarA, aVarN, bVar);
        }
        bm.e eVar = this.X3;
        if (eVar != null) {
            return eVar;
        }
        br.l.l("_dataUsageLimitsRepository");
        throw null;
    }

    public final a8.f t0() {
        if (this.f3781b == null) {
            this.f3781b = new a8.f(d(), b(), C0(), s());
        }
        a8.f fVar = this.f3781b;
        if (fVar != null) {
            return fVar;
        }
        br.l.l("_processChecker");
        throw null;
    }

    public final yi.e u() {
        if (this.f3824h3 == null) {
            this.f3824h3 = F().b() ? new yi.g(0) : new bu.t();
        }
        yi.e eVar = this.f3824h3;
        if (eVar != null) {
            return eVar;
        }
        br.l.l("_dataUsageReader");
        throw null;
    }

    public abstract cj.a u0();

    public final synchronized qj.a v() {
        qj.a aVar;
        try {
            if (this.E == null) {
                this.E = w().k();
            }
            aVar = this.E;
            if (aVar == null) {
                br.l.l("_databaseDataSource");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    public final cj.a v0() {
        if (this.f3926x1 == null) {
            Context contextD = d();
            if (this.f3932y1 == null) {
                this.f3932y1 = new sm.f(28);
            }
            sm.f fVar = this.f3932y1;
            if (fVar == null) {
                br.l.l("_broadcastReceiverFactory");
                throw null;
            }
            if (this.A1 == null) {
                this.A1 = new p(26);
            }
            p pVar = this.A1;
            if (pVar == null) {
                br.l.l("_broadcastReceiverRepository");
                throw null;
            }
            this.f3926x1 = new cj.a(contextD, fVar, pVar, w0(), e5.I(new ck.a(new wi.c(), 23), new ck.a(new SdkPipelineReceiver()), new ck.a(new wi.e())), F());
        }
        cj.a aVar = this.f3926x1;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("_receiverRegistry");
        throw null;
    }

    public final synchronized ab.g w() {
        ab.g gVar;
        try {
            if (this.F == null) {
                this.F = new ab.g(this, this.f3792c5, 3);
            }
            gVar = this.F;
            if (gVar == null) {
                br.l.l("_databaseDataSourceFactory");
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return gVar;
    }

    public final ai.g w0() {
        if (this.z1 == null) {
            this.z1 = new ai.g(28);
        }
        ai.g gVar = this.z1;
        if (gVar != null) {
            return gVar;
        }
        br.l.l("_receiverTypeMapper");
        throw null;
    }

    public final synchronized fi.g x() {
        fi.g gVar;
        if (this.A == null) {
            Context contextD = d();
            ii.c.Companion.getClass();
            int iA = ii.b.a();
            List listY = y();
            synchronized (this) {
                try {
                    if (this.B == null) {
                        this.B = new dj.h(this, 1);
                    }
                    dj.h hVar = this.B;
                    if (hVar == null) {
                        br.l.l("_databaseUpgrader");
                        throw null;
                    }
                    this.A = new fi.g(contextD, iA, listY, hVar, z());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        gVar = this.A;
        if (gVar == null) {
            br.l.l("_databaseHelper");
            throw null;
        }
        return gVar;
    }

    public final bm.d x0() {
        if (this.D2 == null) {
            if (this.A2 == null) {
                this.A2 = new gk.b(9, A());
            }
            gk.b bVar = this.A2;
            if (bVar == null) {
                br.l.l("_rollingWindowScheduleMechanism");
                throw null;
            }
            if (this.B2 == null) {
                this.B2 = new gk.a(A(), 1);
            }
            gk.a aVar = this.B2;
            if (aVar == null) {
                br.l.l("_fixedWindowScheduleMechanism");
                throw null;
            }
            if (this.C2 == null) {
                this.C2 = new gk.a(A(), 0);
            }
            gk.a aVar2 = this.C2;
            if (aVar2 == null) {
                br.l.l("_eventBasedScheduleMechanism");
                throw null;
            }
            this.D2 = new bm.d(bVar, aVar, aVar2);
        }
        bm.d dVar = this.D2;
        if (dVar != null) {
            return dVar;
        }
        br.l.l("_scheduleMechanisms");
        throw null;
    }

    public final List y() {
        hi.a aVarY0 = y0();
        hi.a aVarR = R();
        hi.a aVarV = V();
        if (this.E0 == null) {
            this.E0 = new hi.a(4);
        }
        hi.a aVar = this.E0;
        if (aVar == null) {
            br.l.l("_taskStatsDatabaseTable");
            throw null;
        }
        if (this.H0 == null) {
            this.H0 = new hi.a(3);
        }
        hi.a aVar2 = this.H0;
        if (aVar2 == null) {
            br.l.l("_getQosResultDatabaseTable");
            throw null;
        }
        if (this.F0 == null) {
            this.F0 = new hi.a(0);
        }
        hi.a aVar3 = this.F0;
        if (aVar3 != null) {
            return e5.I(aVarY0, aVarR, aVarV, aVar, aVar2, aVar3);
        }
        br.l.l("_ipCacheDatabaseTable");
        throw null;
    }

    public final hi.a y0() {
        if (this.f3930y == null) {
            this.f3930y = new hi.a(5);
        }
        hi.a aVar = this.f3930y;
        if (aVar != null) {
            return aVar;
        }
        br.l.l("_scheduledTasksTable");
        throw null;
    }

    public final synchronized a2.g z() {
        a2.g gVar;
        if (this.C == null) {
            synchronized (this) {
                try {
                    if (this.D == null) {
                        this.D = new b9.c(20, V());
                    }
                    b9.c cVar = this.D;
                    if (cVar == null) {
                        br.l.l("_keyValueDatabaseHelper");
                        throw null;
                    }
                    br.l.e(cVar, "keyValueDatabaseHelper");
                    a2.g gVar2 = new a2.g();
                    gVar2.f31a = cVar;
                    this.C = gVar2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        gVar = this.C;
        if (gVar == null) {
            br.l.l("_databaseVersionPersister");
            throw null;
        }
        return gVar;
    }

    public final jj.d z0() {
        if (this.f3795d1 == null) {
            this.f3795d1 = new jj.d(A0());
        }
        jj.d dVar = this.f3795d1;
        if (dVar != null) {
            return dVar;
        }
        br.l.l("_screenStateTriggerDataSource");
        throw null;
    }
}
