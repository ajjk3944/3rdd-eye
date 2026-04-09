package androidx.compose.ui.platform;

import E0.AbstractC2633k;
import E0.C2642u;
import F1.C2736a;
import G1.t;
import L0.C3174d;
import Zg.AbstractC3689v;
import a1.AbstractC3750a;
import android.R;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.r;
import androidx.lifecycle.AbstractC4013k;
import androidx.lifecycle.InterfaceC4017o;
import com.google.ar.core.ImageMetadata;
import dh.InterfaceC5380e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.AbstractC6532h;
import l0.C6531g;
import l0.C6533i;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import o.AbstractC7020k;
import o.AbstractC7021l;
import o.AbstractC7022m;
import o.AbstractC7023n;
import o.C7002A;
import o.C7011b;
import o.C7032x;
import org.conscrypt.PSKKeyManager;
import org.snmp4j.mp.MPv3;
import org.snmp4j.mp.PduHandle;
import sh.AbstractC7978m;
import sh.InterfaceC7970e;

/* renamed from: androidx.compose.ui.platform.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3959x extends C2736a {

    /* renamed from: O, reason: collision with root package name */
    public static final d f29631O = new d(null);

    /* renamed from: P, reason: collision with root package name */
    public static final int f29632P = 8;

    /* renamed from: Q, reason: collision with root package name */
    private static final AbstractC7020k f29633Q = AbstractC7021l.a(f0.h.f46612a, f0.h.f46613b, f0.h.f46624m, f0.h.f46635x, f0.h.f46600A, f0.h.f46601B, f0.h.f46602C, f0.h.f46603D, f0.h.f46604E, f0.h.f46605F, f0.h.f46614c, f0.h.f46615d, f0.h.f46616e, f0.h.f46617f, f0.h.f46618g, f0.h.f46619h, f0.h.f46620i, f0.h.f46621j, f0.h.f46622k, f0.h.f46623l, f0.h.f46625n, f0.h.f46626o, f0.h.f46627p, f0.h.f46628q, f0.h.f46629r, f0.h.f46630s, f0.h.f46631t, f0.h.f46632u, f0.h.f46633v, f0.h.f46634w, f0.h.f46636y, f0.h.f46637z);

    /* renamed from: A, reason: collision with root package name */
    private g f29634A;

    /* renamed from: B, reason: collision with root package name */
    private AbstractC7022m f29635B;

    /* renamed from: C, reason: collision with root package name */
    private C7002A f29636C;

    /* renamed from: D, reason: collision with root package name */
    private C7032x f29637D;

    /* renamed from: E, reason: collision with root package name */
    private C7032x f29638E;

    /* renamed from: F, reason: collision with root package name */
    private final String f29639F;

    /* renamed from: G, reason: collision with root package name */
    private final String f29640G;

    /* renamed from: H, reason: collision with root package name */
    private final T0.t f29641H;

    /* renamed from: I, reason: collision with root package name */
    private o.z f29642I;

    /* renamed from: J, reason: collision with root package name */
    private C3930j1 f29643J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f29644K;

    /* renamed from: L, reason: collision with root package name */
    private final Runnable f29645L;

    /* renamed from: M, reason: collision with root package name */
    private final List f29646M;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC6835l f29647N;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.compose.ui.platform.r f29648d;

    /* renamed from: e, reason: collision with root package name */
    private int f29649e = PduHandle.NONE;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC6835l f29650f = new m();

    /* renamed from: g, reason: collision with root package name */
    private final AccessibilityManager f29651g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f29652h;

    /* renamed from: i, reason: collision with root package name */
    private long f29653i;

    /* renamed from: j, reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f29654j;

    /* renamed from: k, reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f29655k;

    /* renamed from: l, reason: collision with root package name */
    private List f29656l;

    /* renamed from: m, reason: collision with root package name */
    private final Handler f29657m;

    /* renamed from: n, reason: collision with root package name */
    private e f29658n;

    /* renamed from: o, reason: collision with root package name */
    private int f29659o;

    /* renamed from: p, reason: collision with root package name */
    private G1.t f29660p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f29661q;

    /* renamed from: r, reason: collision with root package name */
    private final o.z f29662r;

    /* renamed from: s, reason: collision with root package name */
    private final o.z f29663s;

    /* renamed from: t, reason: collision with root package name */
    private o.W f29664t;

    /* renamed from: u, reason: collision with root package name */
    private o.W f29665u;

    /* renamed from: v, reason: collision with root package name */
    private int f29666v;

    /* renamed from: w, reason: collision with root package name */
    private Integer f29667w;

    /* renamed from: x, reason: collision with root package name */
    private final C7011b f29668x;

    /* renamed from: y, reason: collision with root package name */
    private final Ki.g f29669y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f29670z;

    /* renamed from: androidx.compose.ui.platform.x$a */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            AccessibilityManager accessibilityManager = C3959x.this.f29651g;
            C3959x c3959x = C3959x.this;
            accessibilityManager.addAccessibilityStateChangeListener(c3959x.f29654j);
            accessibilityManager.addTouchExplorationStateChangeListener(c3959x.f29655k);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            C3959x.this.f29657m.removeCallbacks(C3959x.this.f29645L);
            AccessibilityManager accessibilityManager = C3959x.this.f29651g;
            C3959x c3959x = C3959x.this;
            accessibilityManager.removeAccessibilityStateChangeListener(c3959x.f29654j);
            accessibilityManager.removeTouchExplorationStateChangeListener(c3959x.f29655k);
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f29672a = new b();

        private b() {
        }

        public static final void a(G1.t tVar, J0.n nVar) {
            J0.a aVar;
            if (!A.h(nVar) || (aVar = (J0.a) J0.k.a(nVar.w(), J0.i.f9619a.w())) == null) {
                return;
            }
            tVar.b(new t.a(R.id.accessibilityActionSetProgress, aVar.b()));
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$c */
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f29673a = new c();

        private c() {
        }

        public static final void a(G1.t tVar, J0.n nVar) {
            if (A.h(nVar)) {
                J0.j jVarW = nVar.w();
                J0.i iVar = J0.i.f9619a;
                J0.a aVar = (J0.a) J0.k.a(jVarW, iVar.q());
                if (aVar != null) {
                    tVar.b(new t.a(R.id.accessibilityActionPageUp, aVar.b()));
                }
                J0.a aVar2 = (J0.a) J0.k.a(nVar.w(), iVar.n());
                if (aVar2 != null) {
                    tVar.b(new t.a(R.id.accessibilityActionPageDown, aVar2.b()));
                }
                J0.a aVar3 = (J0.a) J0.k.a(nVar.w(), iVar.o());
                if (aVar3 != null) {
                    tVar.b(new t.a(R.id.accessibilityActionPageLeft, aVar3.b()));
                }
                J0.a aVar4 = (J0.a) J0.k.a(nVar.w(), iVar.p());
                if (aVar4 != null) {
                    tVar.b(new t.a(R.id.accessibilityActionPageRight, aVar4.b()));
                }
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$e */
    private final class e extends G1.u {
        public e() {
        }

        @Override // G1.u
        public void a(int i10, G1.t tVar, String str, Bundle bundle) {
            C3959x.this.K(i10, tVar, str, bundle);
        }

        @Override // G1.u
        public G1.t b(int i10) {
            G1.t tVarS = C3959x.this.S(i10);
            C3959x c3959x = C3959x.this;
            if (c3959x.f29661q && i10 == c3959x.f29659o) {
                c3959x.f29660p = tVarS;
            }
            return tVarS;
        }

        @Override // G1.u
        public G1.t d(int i10) {
            return b(C3959x.this.f29659o);
        }

        @Override // G1.u
        public boolean f(int i10, int i11, Bundle bundle) {
            return C3959x.this.v0(i10, i11, bundle);
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$f */
    private static final class f implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public static final f f29675a = new f();

        private f() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(J0.n nVar, J0.n nVar2) {
            C6533i c6533iJ = nVar.j();
            C6533i c6533iJ2 = nVar2.j();
            int iCompare = Float.compare(c6533iJ.k(), c6533iJ2.k());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(c6533iJ.n(), c6533iJ2.n());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(c6533iJ.e(), c6533iJ2.e());
            return iCompare3 != 0 ? iCompare3 : Float.compare(c6533iJ.l(), c6533iJ2.l());
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$g */
    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        private final J0.n f29676a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29677b;

        /* renamed from: c, reason: collision with root package name */
        private final int f29678c;

        /* renamed from: d, reason: collision with root package name */
        private final int f29679d;

        /* renamed from: e, reason: collision with root package name */
        private final int f29680e;

        /* renamed from: f, reason: collision with root package name */
        private final long f29681f;

        public g(J0.n nVar, int i10, int i11, int i12, int i13, long j10) {
            this.f29676a = nVar;
            this.f29677b = i10;
            this.f29678c = i11;
            this.f29679d = i12;
            this.f29680e = i13;
            this.f29681f = j10;
        }

        public final int a() {
            return this.f29677b;
        }

        public final int b() {
            return this.f29679d;
        }

        public final int c() {
            return this.f29678c;
        }

        public final J0.n d() {
            return this.f29676a;
        }

        public final int e() {
            return this.f29680e;
        }

        public final long f() {
            return this.f29681f;
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$h */
    private static final class h implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public static final h f29682a = new h();

        private h() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(J0.n nVar, J0.n nVar2) {
            C6533i c6533iJ = nVar.j();
            C6533i c6533iJ2 = nVar2.j();
            int iCompare = Float.compare(c6533iJ2.l(), c6533iJ.l());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(c6533iJ.n(), c6533iJ2.n());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(c6533iJ.e(), c6533iJ2.e());
            return iCompare3 != 0 ? iCompare3 : Float.compare(c6533iJ2.k(), c6533iJ.k());
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$i */
    private static final class i implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public static final i f29683a = new i();

        private i() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Yg.s sVar, Yg.s sVar2) {
            int iCompare = Float.compare(((C6533i) sVar.h()).n(), ((C6533i) sVar2.h()).n());
            return iCompare != 0 ? iCompare : Float.compare(((C6533i) sVar.h()).e(), ((C6533i) sVar2.h()).e());
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$j */
    public /* synthetic */ class j {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29684a;

        static {
            int[] iArr = new int[K0.a.values().length];
            try {
                iArr[K0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K0.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K0.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29684a = iArr;
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$k */
    static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f29685a;

        /* renamed from: b, reason: collision with root package name */
        Object f29686b;

        /* renamed from: c, reason: collision with root package name */
        Object f29687c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f29688d;

        /* renamed from: f, reason: collision with root package name */
        int f29690f;

        k(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f29688d = obj;
            this.f29690f |= PduHandle.NONE;
            return C3959x.this.M(this);
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$l */
    static final class l extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        public static final l f29691a = new l();

        l() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$m */
    static final class m extends AbstractC6494u implements InterfaceC6835l {
        m() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(C3959x.this.l0().getParent().requestSendAccessibilityEvent(C3959x.this.l0(), accessibilityEvent));
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$n */
    static final class n extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C3927i1 f29693a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3959x f29694b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(C3927i1 c3927i1, C3959x c3959x) {
            super(0);
            this.f29693a = c3927i1;
            this.f29694b = c3959x;
        }

        public final void a() {
            J0.n nVarB;
            E0.G gQ;
            J0.h hVarA = this.f29693a.a();
            J0.h hVarE = this.f29693a.e();
            Float fB = this.f29693a.b();
            Float fC = this.f29693a.c();
            float fFloatValue = (hVarA == null || fB == null) ? 0.0f : ((Number) hVarA.c().invoke()).floatValue() - fB.floatValue();
            float fFloatValue2 = (hVarE == null || fC == null) ? 0.0f : ((Number) hVarE.c().invoke()).floatValue() - fC.floatValue();
            if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                int iF0 = this.f29694b.F0(this.f29693a.d());
                C3933k1 c3933k1 = (C3933k1) this.f29694b.a0().c(this.f29694b.f29659o);
                if (c3933k1 != null) {
                    C3959x c3959x = this.f29694b;
                    try {
                        G1.t tVar = c3959x.f29660p;
                        if (tVar != null) {
                            tVar.d0(c3959x.L(c3933k1));
                            Yg.J j10 = Yg.J.f24997a;
                        }
                    } catch (IllegalStateException unused) {
                        Yg.J j11 = Yg.J.f24997a;
                    }
                }
                this.f29694b.l0().invalidate();
                C3933k1 c3933k12 = (C3933k1) this.f29694b.a0().c(iF0);
                if (c3933k12 != null && (nVarB = c3933k12.b()) != null && (gQ = nVarB.q()) != null) {
                    C3959x c3959x2 = this.f29694b;
                    if (hVarA != null) {
                        c3959x2.f29662r.t(iF0, hVarA);
                    }
                    if (hVarE != null) {
                        c3959x2.f29663s.t(iF0, hVarE);
                    }
                    c3959x2.s0(gQ);
                }
            }
            if (hVarA != null) {
                this.f29693a.g((Float) hVarA.c().invoke());
            }
            if (hVarE != null) {
                this.f29693a.h((Float) hVarE.c().invoke());
            }
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Yg.J.f24997a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$o */
    static final class o extends AbstractC6494u implements InterfaceC6835l {
        o() {
            super(1);
        }

        public final void a(C3927i1 c3927i1) {
            C3959x.this.D0(c3927i1);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C3927i1) obj);
            return Yg.J.f24997a;
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$p */
    static final class p extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final p f29696a = new p();

        p() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E0.G g10) {
            J0.j jVarI = g10.I();
            boolean z10 = false;
            if (jVarI != null && jVarI.u()) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$q */
    static final class q extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final q f29697a = new q();

        q() {
            super(1);
        }

        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E0.G g10) {
            return Boolean.valueOf(g10.k0().q(E0.e0.a(8)));
        }
    }

    /* renamed from: androidx.compose.ui.platform.x$r */
    static final class r extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        public static final r f29698a = new r();

        /* renamed from: androidx.compose.ui.platform.x$r$a */
        static final class a extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final a f29699a = new a();

            a() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        /* renamed from: androidx.compose.ui.platform.x$r$b */
        static final class b extends AbstractC6494u implements InterfaceC6824a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f29700a = new b();

            b() {
                super(0);
            }

            @Override // mh.InterfaceC6824a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(0.0f);
            }
        }

        r() {
            super(2);
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(J0.n nVar, J0.n nVar2) {
            J0.j jVarW = nVar.w();
            J0.q qVar = J0.q.f9676a;
            return Integer.valueOf(Float.compare(((Number) jVarW.k(qVar.H(), a.f29699a)).floatValue(), ((Number) nVar2.w().k(qVar.H(), b.f29700a)).floatValue()));
        }
    }

    public C3959x(androidx.compose.ui.platform.r rVar) {
        this.f29648d = rVar;
        Object systemService = rVar.getContext().getSystemService("accessibility");
        AbstractC6492s.g(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.f29651g = accessibilityManager;
        this.f29653i = 100L;
        this.f29654j = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.u
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z10) {
                C3959x.W(this.f29597a, z10);
            }
        };
        this.f29655k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.v
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                C3959x.c1(this.f29626a, z10);
            }
        };
        this.f29656l = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.f29657m = new Handler(Looper.getMainLooper());
        this.f29658n = new e();
        this.f29659o = PduHandle.NONE;
        this.f29662r = new o.z(0, 1, null);
        this.f29663s = new o.z(0, 1, null);
        this.f29664t = new o.W(0, 1, null);
        this.f29665u = new o.W(0, 1, null);
        this.f29666v = -1;
        this.f29668x = new C7011b(0, 1, null);
        this.f29669y = Ki.j.b(1, null, null, 6, null);
        this.f29670z = true;
        this.f29635B = AbstractC7023n.a();
        this.f29636C = new C7002A(0, 1, null);
        this.f29637D = new C7032x(0, 1, null);
        this.f29638E = new C7032x(0, 1, null);
        this.f29639F = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.f29640G = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.f29641H = new T0.t();
        this.f29642I = AbstractC7023n.b();
        this.f29643J = new C3930j1(rVar.getSemanticsOwner().a(), AbstractC7023n.a());
        rVar.addOnAttachStateChangeListener(new a());
        this.f29645L = new Runnable() { // from class: androidx.compose.ui.platform.w
            @Override // java.lang.Runnable
            public final void run() {
                C3959x.E0(this.f29630a);
            }
        };
        this.f29646M = new ArrayList();
        this.f29647N = new o();
    }

    private static final boolean A0(J0.h hVar) {
        return (((Number) hVar.c().invoke()).floatValue() < ((Number) hVar.a().invoke()).floatValue() && !hVar.b()) || (((Number) hVar.c().invoke()).floatValue() > 0.0f && hVar.b());
    }

    private final boolean B0(int i10, List list) {
        boolean z10;
        C3927i1 c3927i1A = AbstractC3936l1.a(list, i10);
        if (c3927i1A != null) {
            z10 = false;
        } else {
            c3927i1A = new C3927i1(i10, this.f29646M, null, null, null, null);
            z10 = true;
        }
        this.f29646M.add(c3927i1A);
        return z10;
    }

    private final boolean C0(int i10) {
        if (!r0() || n0(i10)) {
            return false;
        }
        int i11 = this.f29659o;
        if (i11 != Integer.MIN_VALUE) {
            J0(this, i11, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, null, null, 12, null);
        }
        this.f29659o = i10;
        this.f29648d.invalidate();
        J0(this, i10, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(C3927i1 c3927i1) {
        if (c3927i1.h0()) {
            this.f29648d.getSnapshotObserver().i(c3927i1, this.f29647N, new n(c3927i1, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E0(C3959x c3959x) {
        Trace.beginSection("measureAndLayout");
        try {
            E0.m0.f(c3959x.f29648d, false, 1, null);
            Yg.J j10 = Yg.J.f24997a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                c3959x.P();
                Trace.endSection();
                c3959x.f29644K = false;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int F0(int i10) {
        if (i10 == this.f29648d.getSemanticsOwner().a().o()) {
            return -1;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void G0(J0.n r17, androidx.compose.ui.platform.C3930j1 r18) {
        /*
            r16 = this;
            r0 = r16
            o.A r1 = o.AbstractC7025p.b()
            java.util.List r2 = r17.t()
            int r3 = r2.size()
            r4 = 0
            r5 = r4
        L10:
            if (r5 >= r3) goto L46
            java.lang.Object r6 = r2.get(r5)
            J0.n r6 = (J0.n) r6
            o.m r7 = r16.a0()
            int r8 = r6.o()
            boolean r7 = r7.a(r8)
            if (r7 == 0) goto L43
            o.A r7 = r18.a()
            int r8 = r6.o()
            boolean r7 = r7.a(r8)
            if (r7 != 0) goto L3c
            E0.G r1 = r17.q()
            r0.s0(r1)
            return
        L3c:
            int r6 = r6.o()
            r1.f(r6)
        L43:
            int r5 = r5 + 1
            goto L10
        L46:
            o.A r2 = r18.a()
            int[] r3 = r2.f54988b
            long[] r2 = r2.f54987a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L97
            r6 = r4
        L54:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L92
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r4
        L6e:
            if (r11 >= r9) goto L90
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L8c
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            boolean r12 = r1.a(r12)
            if (r12 != 0) goto L8c
            E0.G r1 = r17.q()
            r0.s0(r1)
            return
        L8c:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L6e
        L90:
            if (r9 != r10) goto L97
        L92:
            if (r6 == r5) goto L97
            int r6 = r6 + 1
            goto L54
        L97:
            java.util.List r1 = r17.t()
            int r2 = r1.size()
        L9f:
            if (r4 >= r2) goto Lca
            java.lang.Object r3 = r1.get(r4)
            J0.n r3 = (J0.n) r3
            o.m r5 = r16.a0()
            int r6 = r3.o()
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lc7
            o.z r5 = r0.f29642I
            int r6 = r3.o()
            java.lang.Object r5 = r5.c(r6)
            kotlin.jvm.internal.AbstractC6492s.f(r5)
            androidx.compose.ui.platform.j1 r5 = (androidx.compose.ui.platform.C3930j1) r5
            r0.G0(r3, r5)
        Lc7:
            int r4 = r4 + 1
            goto L9f
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C3959x.G0(J0.n, androidx.compose.ui.platform.j1):void");
    }

    private final boolean H0(AccessibilityEvent accessibilityEvent) {
        if (!p0()) {
            return false;
        }
        if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
            this.f29661q = true;
        }
        try {
            return ((Boolean) this.f29650f.invoke(accessibilityEvent)).booleanValue();
        } finally {
            this.f29661q = false;
        }
    }

    private final boolean I0(int i10, int i11, Integer num, List list) {
        if (i10 == Integer.MIN_VALUE || !p0()) {
            return false;
        }
        AccessibilityEvent accessibilityEventR = R(i10, i11);
        if (num != null) {
            accessibilityEventR.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            accessibilityEventR.setContentDescription(AbstractC3750a.e(list, ",", null, null, 0, null, null, 62, null));
        }
        Trace.beginSection("sendEvent");
        try {
            return H0(accessibilityEventR);
        } finally {
            Trace.endSection();
        }
    }

    static /* synthetic */ boolean J0(C3959x c3959x, int i10, int i11, Integer num, List list, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            num = null;
        }
        if ((i12 & 8) != 0) {
            list = null;
        }
        return c3959x.I0(i10, i11, num, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(int i10, G1.t tVar, String str, Bundle bundle) {
        J0.n nVarB;
        C3933k1 c3933k1 = (C3933k1) a0().c(i10);
        if (c3933k1 == null || (nVarB = c3933k1.b()) == null) {
            return;
        }
        String strI0 = i0(nVarB);
        if (AbstractC6492s.d(str, this.f29639F)) {
            int iE = this.f29637D.e(i10, -1);
            if (iE != -1) {
                tVar.t().putInt(str, iE);
                return;
            }
            return;
        }
        if (AbstractC6492s.d(str, this.f29640G)) {
            int iE2 = this.f29638E.e(i10, -1);
            if (iE2 != -1) {
                tVar.t().putInt(str, iE2);
                return;
            }
            return;
        }
        if (!nVarB.w().f(J0.i.f9619a.i()) || bundle == null || !AbstractC6492s.d(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            J0.j jVarW = nVarB.w();
            J0.q qVar = J0.q.f9676a;
            if (!jVarW.f(qVar.C()) || bundle == null || !AbstractC6492s.d(str, "androidx.compose.ui.semantics.testTag")) {
                if (AbstractC6492s.d(str, "androidx.compose.ui.semantics.id")) {
                    tVar.t().putInt(str, nVarB.o());
                    return;
                }
                return;
            } else {
                String str2 = (String) J0.k.a(nVarB.w(), qVar.C());
                if (str2 != null) {
                    tVar.t().putCharSequence(str, str2);
                    return;
                }
                return;
            }
        }
        int i11 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i12 > 0 && i11 >= 0) {
            if (i11 < (strI0 != null ? strI0.length() : MPv3.MAX_MESSAGE_ID)) {
                L0.M mE = AbstractC3936l1.e(nVarB.w());
                if (mE == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < i12; i13++) {
                    int i14 = i11 + i13;
                    if (i14 >= mE.l().j().length()) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(a1(nVarB, mE.d(i14)));
                    }
                }
                tVar.t().putParcelableArray(str, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
    }

    private final void K0(int i10, int i11, String str) {
        AccessibilityEvent accessibilityEventR = R(F0(i10), 32);
        accessibilityEventR.setContentChangeTypes(i11);
        if (str != null) {
            accessibilityEventR.getText().add(str);
        }
        H0(accessibilityEventR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect L(C3933k1 c3933k1) {
        Rect rectA = c3933k1.a();
        long jQ = this.f29648d.q(AbstractC6532h.a(rectA.left, rectA.top));
        long jQ2 = this.f29648d.q(AbstractC6532h.a(rectA.right, rectA.bottom));
        return new Rect((int) Math.floor(C6531g.m(jQ)), (int) Math.floor(C6531g.n(jQ)), (int) Math.ceil(C6531g.m(jQ2)), (int) Math.ceil(C6531g.n(jQ2)));
    }

    private final void L0(int i10) {
        g gVar = this.f29634A;
        if (gVar != null) {
            if (i10 != gVar.d().o()) {
                return;
            }
            if (SystemClock.uptimeMillis() - gVar.f() <= 1000) {
                AccessibilityEvent accessibilityEventR = R(F0(gVar.d().o()), 131072);
                accessibilityEventR.setFromIndex(gVar.b());
                accessibilityEventR.setToIndex(gVar.e());
                accessibilityEventR.setAction(gVar.a());
                accessibilityEventR.setMovementGranularity(gVar.c());
                accessibilityEventR.getText().add(i0(gVar.d()));
                H0(accessibilityEventR);
            }
        }
        this.f29634A = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x060b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void M0(o.AbstractC7022m r37) {
        /*
            Method dump skipped, instructions count: 1620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C3959x.M0(o.m):void");
    }

    private final void N0(E0.G g10, C7002A c7002a) {
        J0.j jVarI;
        E0.G gJ;
        if (g10.K0() && !this.f29648d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(g10)) {
            if (!g10.k0().q(E0.e0.a(8))) {
                g10 = A.j(g10, q.f29697a);
            }
            if (g10 == null || (jVarI = g10.I()) == null) {
                return;
            }
            if (!jVarI.u() && (gJ = A.j(g10, p.f29696a)) != null) {
                g10 = gJ;
            }
            int iQ0 = g10.q0();
            if (c7002a.f(iQ0)) {
                J0(this, F0(iQ0), 2048, 1, null, 8, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean O(o.AbstractC7022m r21, boolean r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C3959x.O(o.m, boolean, int, long):boolean");
    }

    private final void O0(E0.G g10) {
        if (g10.K0() && !this.f29648d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(g10)) {
            int iQ0 = g10.q0();
            J0.h hVar = (J0.h) this.f29662r.c(iQ0);
            J0.h hVar2 = (J0.h) this.f29663s.c(iQ0);
            if (hVar == null && hVar2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventR = R(iQ0, 4096);
            if (hVar != null) {
                accessibilityEventR.setScrollX((int) ((Number) hVar.c().invoke()).floatValue());
                accessibilityEventR.setMaxScrollX((int) ((Number) hVar.a().invoke()).floatValue());
            }
            if (hVar2 != null) {
                accessibilityEventR.setScrollY((int) ((Number) hVar2.c().invoke()).floatValue());
                accessibilityEventR.setMaxScrollY((int) ((Number) hVar2.a().invoke()).floatValue());
            }
            H0(accessibilityEventR);
        }
    }

    private final void P() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (p0()) {
                G0(this.f29648d.getSemanticsOwner().a(), this.f29643J);
            }
            Yg.J j10 = Yg.J.f24997a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                M0(a0());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    g1();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final boolean P0(J0.n nVar, int i10, int i11, boolean z10) {
        String strI0;
        J0.j jVarW = nVar.w();
        J0.i iVar = J0.i.f9619a;
        if (jVarW.f(iVar.x()) && A.h(nVar)) {
            mh.q qVar = (mh.q) ((J0.a) nVar.w().j(iVar.x())).a();
            if (qVar != null) {
                return ((Boolean) qVar.s(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10))).booleanValue();
            }
            return false;
        }
        if ((i10 == i11 && i11 == this.f29666v) || (strI0 = i0(nVar)) == null) {
            return false;
        }
        if (i10 < 0 || i10 != i11 || i11 > strI0.length()) {
            i10 = -1;
        }
        this.f29666v = i10;
        boolean z11 = strI0.length() > 0;
        H0(U(F0(nVar.o()), z11 ? Integer.valueOf(this.f29666v) : null, z11 ? Integer.valueOf(this.f29666v) : null, z11 ? Integer.valueOf(strI0.length()) : null, strI0));
        L0(nVar.o());
        return true;
    }

    private final boolean Q(int i10) {
        if (!n0(i10)) {
            return false;
        }
        this.f29659o = PduHandle.NONE;
        this.f29660p = null;
        this.f29648d.invalidate();
        J0(this, i10, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE, null, null, 12, null);
        return true;
    }

    private final void Q0(J0.n nVar, G1.t tVar) {
        J0.j jVarW = nVar.w();
        J0.q qVar = J0.q.f9676a;
        if (jVarW.f(qVar.h())) {
            tVar.l0(true);
            tVar.o0((CharSequence) J0.k.a(nVar.w(), qVar.h()));
        }
    }

    private final AccessibilityEvent R(int i10, int i11) {
        C3933k1 c3933k1;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.f29648d.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.f29648d, i10);
        if (p0() && (c3933k1 = (C3933k1) a0().c(i10)) != null) {
            accessibilityEventObtain.setPassword(c3933k1.b().w().f(J0.q.f9676a.w()));
        }
        return accessibilityEventObtain;
    }

    private final void R0(J0.n nVar, G1.t tVar) {
        tVar.e0(f0(nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final G1.t S(int i10) {
        InterfaceC4017o interfaceC4017oA;
        AbstractC4013k abstractC4013kO;
        r.b viewTreeOwners = this.f29648d.getViewTreeOwners();
        if (((viewTreeOwners == null || (interfaceC4017oA = viewTreeOwners.a()) == null || (abstractC4013kO = interfaceC4017oA.O()) == null) ? null : abstractC4013kO.b()) == AbstractC4013k.b.DESTROYED) {
            return null;
        }
        G1.t tVarU = G1.t.U();
        C3933k1 c3933k1 = (C3933k1) a0().c(i10);
        if (c3933k1 == null) {
            return null;
        }
        J0.n nVarB = c3933k1.b();
        if (i10 == -1) {
            ViewParent parentForAccessibility = this.f29648d.getParentForAccessibility();
            tVarU.B0(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
        } else {
            J0.n nVarR = nVarB.r();
            Integer numValueOf = nVarR != null ? Integer.valueOf(nVarR.o()) : null;
            if (numValueOf == null) {
                B0.a.c("semanticsNode " + i10 + " has null parent");
                throw new KotlinNothingValueException();
            }
            int iIntValue = numValueOf.intValue();
            tVarU.C0(this.f29648d, iIntValue != this.f29648d.getSemanticsOwner().a().o() ? iIntValue : -1);
        }
        tVarU.K0(this.f29648d, i10);
        tVarU.d0(L(c3933k1));
        y0(i10, tVarU, nVarB);
        return tVarU;
    }

    private final String T(J0.n nVar) {
        Collection collection;
        CharSequence charSequence;
        J0.j jVarN = nVar.a().n();
        J0.q qVar = J0.q.f9676a;
        Collection collection2 = (Collection) J0.k.a(jVarN, qVar.d());
        if ((collection2 == null || collection2.isEmpty()) && (((collection = (Collection) J0.k.a(jVarN, qVar.D())) == null || collection.isEmpty()) && ((charSequence = (CharSequence) J0.k.a(jVarN, qVar.g())) == null || charSequence.length() == 0))) {
            return this.f29648d.getContext().getResources().getString(f0.i.f46650m);
        }
        return null;
    }

    private final void T0(J0.n nVar, G1.t tVar) {
        tVar.L0(g0(nVar));
    }

    private final AccessibilityEvent U(int i10, Integer num, Integer num2, Integer num3, CharSequence charSequence) {
        AccessibilityEvent accessibilityEventR = R(i10, 8192);
        if (num != null) {
            accessibilityEventR.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            accessibilityEventR.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            accessibilityEventR.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            accessibilityEventR.getText().add(charSequence);
        }
        return accessibilityEventR;
    }

    private final void U0(J0.n nVar, G1.t tVar) {
        C3174d c3174dH0 = h0(nVar);
        tVar.M0(c3174dH0 != null ? b1(c3174dH0) : null);
    }

    private final void V0() {
        this.f29637D.i();
        this.f29638E.i();
        C3933k1 c3933k1 = (C3933k1) a0().c(-1);
        J0.n nVarB = c3933k1 != null ? c3933k1.b() : null;
        AbstractC6492s.f(nVarB);
        List listZ0 = Z0(A.k(nVarB), AbstractC3689v.r(nVarB));
        int iN = AbstractC3689v.n(listZ0);
        int i10 = 1;
        if (1 > iN) {
            return;
        }
        while (true) {
            int iO = ((J0.n) listZ0.get(i10 - 1)).o();
            int iO2 = ((J0.n) listZ0.get(i10)).o();
            this.f29637D.q(iO, iO2);
            this.f29638E.q(iO2, iO);
            if (i10 == iN) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(C3959x c3959x, boolean z10) {
        c3959x.f29656l = z10 ? c3959x.f29651g.getEnabledAccessibilityServiceList(-1) : AbstractC3689v.l();
    }

    private final List W0(boolean z10, ArrayList arrayList, o.z zVar) {
        ArrayList arrayList2 = new ArrayList();
        int iN = AbstractC3689v.n(arrayList);
        int size = 0;
        if (iN >= 0) {
            int i10 = 0;
            while (true) {
                J0.n nVar = (J0.n) arrayList.get(i10);
                if (i10 == 0 || !Y0(arrayList2, nVar)) {
                    arrayList2.add(new Yg.s(nVar.j(), AbstractC3689v.r(nVar)));
                }
                if (i10 == iN) {
                    break;
                }
                i10++;
            }
        }
        AbstractC3689v.B(arrayList2, i.f29683a);
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Yg.s sVar = (Yg.s) arrayList2.get(i11);
            AbstractC3689v.B((List) sVar.j(), new C3963z(new C3961y(z10 ? h.f29682a : f.f29675a, E0.G.f3617X.b())));
            arrayList3.addAll((Collection) sVar.j());
        }
        final r rVar = r.f29698a;
        AbstractC3689v.B(arrayList3, new Comparator() { // from class: androidx.compose.ui.platform.t
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C3959x.X0(rVar, obj, obj2);
            }
        });
        while (size <= AbstractC3689v.n(arrayList3)) {
            List list = (List) zVar.c(((J0.n) arrayList3.get(size)).o());
            if (list != null) {
                if (q0((J0.n) arrayList3.get(size))) {
                    size++;
                } else {
                    arrayList3.remove(size);
                }
                arrayList3.addAll(size, list);
                size += list.size();
            } else {
                size++;
            }
        }
        return arrayList3;
    }

    private final void X(J0.n nVar, ArrayList arrayList, o.z zVar) {
        boolean zK = A.k(nVar);
        boolean zBooleanValue = ((Boolean) nVar.w().k(J0.q.f9676a.s(), l.f29691a)).booleanValue();
        if ((zBooleanValue || q0(nVar)) && a0().b(nVar.o())) {
            arrayList.add(nVar);
        }
        if (zBooleanValue) {
            zVar.t(nVar.o(), Z0(zK, AbstractC3689v.l1(nVar.k())));
            return;
        }
        List listK = nVar.k();
        int size = listK.size();
        for (int i10 = 0; i10 < size; i10++) {
            X((J0.n) listK.get(i10), arrayList, zVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int X0(InterfaceC6839p interfaceC6839p, Object obj, Object obj2) {
        return ((Number) interfaceC6839p.invoke(obj, obj2)).intValue();
    }

    private final int Y(J0.n nVar) {
        J0.j jVarW = nVar.w();
        J0.q qVar = J0.q.f9676a;
        return (jVarW.f(qVar.d()) || !nVar.w().f(qVar.E())) ? this.f29666v : L0.S.i(((L0.S) nVar.w().j(qVar.E())).r());
    }

    private static final boolean Y0(ArrayList arrayList, J0.n nVar) {
        float fN = nVar.j().n();
        float fE = nVar.j().e();
        boolean z10 = fN >= fE;
        int iN = AbstractC3689v.n(arrayList);
        if (iN >= 0) {
            int i10 = 0;
            while (true) {
                C6533i c6533i = (C6533i) ((Yg.s) arrayList.get(i10)).h();
                boolean z11 = c6533i.n() >= c6533i.e();
                if (!z10 && !z11 && Math.max(fN, c6533i.n()) < Math.min(fE, c6533i.e())) {
                    arrayList.set(i10, new Yg.s(c6533i.s(0.0f, fN, Float.POSITIVE_INFINITY, fE), ((Yg.s) arrayList.get(i10)).j()));
                    ((List) ((Yg.s) arrayList.get(i10)).j()).add(nVar);
                    return true;
                }
                if (i10 == iN) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    private final int Z(J0.n nVar) {
        J0.j jVarW = nVar.w();
        J0.q qVar = J0.q.f9676a;
        return (jVarW.f(qVar.d()) || !nVar.w().f(qVar.E())) ? this.f29666v : L0.S.n(((L0.S) nVar.w().j(qVar.E())).r());
    }

    private final List Z0(boolean z10, List list) {
        o.z zVarB = AbstractC7023n.b();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            X((J0.n) list.get(i10), arrayList, zVarB);
        }
        return W0(z10, arrayList, zVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC7022m a0() {
        if (this.f29670z) {
            this.f29670z = false;
            this.f29635B = AbstractC3936l1.b(this.f29648d.getSemanticsOwner());
            if (p0()) {
                V0();
            }
        }
        return this.f29635B;
    }

    private final RectF a1(J0.n nVar, C6533i c6533i) {
        if (nVar == null) {
            return null;
        }
        C6533i c6533iX = c6533i.x(nVar.s());
        C6533i c6533iI = nVar.i();
        C6533i c6533iT = c6533iX.v(c6533iI) ? c6533iX.t(c6533iI) : null;
        if (c6533iT == null) {
            return null;
        }
        long jQ = this.f29648d.q(AbstractC6532h.a(c6533iT.k(), c6533iT.n()));
        long jQ2 = this.f29648d.q(AbstractC6532h.a(c6533iT.l(), c6533iT.e()));
        return new RectF(C6531g.m(jQ), C6531g.n(jQ), C6531g.m(jQ2), C6531g.n(jQ2));
    }

    private final SpannableString b1(C3174d c3174d) {
        return (SpannableString) e1(T0.a.b(c3174d, this.f29648d.getDensity(), this.f29648d.getFontFamilyResolver(), this.f29641H), 100000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c1(C3959x c3959x, boolean z10) {
        c3959x.f29656l = c3959x.f29651g.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean d1(J0.n nVar, int i10, boolean z10, boolean z11) {
        int iZ;
        int i11;
        int iO = nVar.o();
        Integer num = this.f29667w;
        if (num == null || iO != num.intValue()) {
            this.f29666v = -1;
            this.f29667w = Integer.valueOf(nVar.o());
        }
        String strI0 = i0(nVar);
        boolean z12 = false;
        if (strI0 != null && strI0.length() != 0) {
            InterfaceC3919g interfaceC3919gJ0 = j0(nVar, i10);
            if (interfaceC3919gJ0 == null) {
                return false;
            }
            int iY = Y(nVar);
            if (iY == -1) {
                iY = z10 ? 0 : strI0.length();
            }
            int[] iArrA = z10 ? interfaceC3919gJ0.a(iY) : interfaceC3919gJ0.b(iY);
            if (iArrA == null) {
                return false;
            }
            int i12 = iArrA[0];
            z12 = true;
            int i13 = iArrA[1];
            if (z11 && o0(nVar)) {
                iZ = Z(nVar);
                if (iZ == -1) {
                    iZ = z10 ? i12 : i13;
                }
                i11 = z10 ? i13 : i12;
            } else {
                iZ = z10 ? i13 : i12;
                i11 = iZ;
            }
            this.f29634A = new g(nVar, z10 ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 512, i10, i12, i13, SystemClock.uptimeMillis());
            P0(nVar, iZ, i11, true);
        }
        return z12;
    }

    private final CharSequence e1(CharSequence charSequence, int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= i10) {
            return charSequence;
        }
        int i11 = i10 - 1;
        if (Character.isHighSurrogate(charSequence.charAt(i11)) && Character.isLowSurrogate(charSequence.charAt(i10))) {
            i10 = i11;
        }
        CharSequence charSequenceSubSequence = charSequence.subSequence(0, i10);
        AbstractC6492s.g(charSequenceSubSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return charSequenceSubSequence;
    }

    private final boolean f0(J0.n nVar) {
        J0.j jVarW = nVar.w();
        J0.q qVar = J0.q.f9676a;
        K0.a aVar = (K0.a) J0.k.a(jVarW, qVar.G());
        J0.g gVar = (J0.g) J0.k.a(nVar.w(), qVar.y());
        boolean z10 = aVar != null;
        if (((Boolean) J0.k.a(nVar.w(), qVar.A())) != null) {
            return gVar != null ? J0.g.k(gVar.n(), J0.g.f9602b.g()) : false ? z10 : true;
        }
        return z10;
    }

    private final void f1(int i10) {
        int i11 = this.f29649e;
        if (i11 == i10) {
            return;
        }
        this.f29649e = i10;
        J0(this, i10, 128, null, null, 12, null);
        J0(this, i11, PSKKeyManager.MAX_KEY_LENGTH_BYTES, null, null, 12, null);
    }

    private final String g0(J0.n nVar) throws Resources.NotFoundException {
        J0.j jVarW = nVar.w();
        J0.q qVar = J0.q.f9676a;
        Object objA = J0.k.a(jVarW, qVar.B());
        K0.a aVar = (K0.a) J0.k.a(nVar.w(), qVar.G());
        J0.g gVar = (J0.g) J0.k.a(nVar.w(), qVar.y());
        if (aVar != null) {
            int i10 = j.f29684a[aVar.ordinal()];
            if (i10 == 1) {
                if ((gVar == null ? false : J0.g.k(gVar.n(), J0.g.f9602b.f())) && objA == null) {
                    objA = this.f29648d.getContext().getResources().getString(f0.i.f46652o);
                }
            } else if (i10 == 2) {
                if ((gVar == null ? false : J0.g.k(gVar.n(), J0.g.f9602b.f())) && objA == null) {
                    objA = this.f29648d.getContext().getResources().getString(f0.i.f46651n);
                }
            } else if (i10 == 3 && objA == null) {
                objA = this.f29648d.getContext().getResources().getString(f0.i.f46644g);
            }
        }
        Boolean bool = (Boolean) J0.k.a(nVar.w(), qVar.A());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(gVar == null ? false : J0.g.k(gVar.n(), J0.g.f9602b.g())) && objA == null) {
                objA = zBooleanValue ? this.f29648d.getContext().getResources().getString(f0.i.f46649l) : this.f29648d.getContext().getResources().getString(f0.i.f46646i);
            }
        }
        J0.f fVar = (J0.f) J0.k.a(nVar.w(), qVar.x());
        if (fVar != null) {
            if (fVar != J0.f.f9597d.a()) {
                if (objA == null) {
                    InterfaceC7970e interfaceC7970eC = fVar.c();
                    float fB = ((((Number) interfaceC7970eC.g()).floatValue() - ((Number) interfaceC7970eC.e()).floatValue()) > 0.0f ? 1 : ((((Number) interfaceC7970eC.g()).floatValue() - ((Number) interfaceC7970eC.e()).floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (fVar.b() - ((Number) interfaceC7970eC.e()).floatValue()) / (((Number) interfaceC7970eC.g()).floatValue() - ((Number) interfaceC7970eC.e()).floatValue());
                    if (fB < 0.0f) {
                        fB = 0.0f;
                    }
                    if (fB > 1.0f) {
                        fB = 1.0f;
                    }
                    if (!(fB == 0.0f)) {
                        iK = (fB == 1.0f ? 1 : 0) != 0 ? 100 : AbstractC7978m.k(Math.round(fB * 100), 1, 99);
                    }
                    objA = this.f29648d.getContext().getResources().getString(f0.i.f46655r, Integer.valueOf(iK));
                }
            } else if (objA == null) {
                objA = this.f29648d.getContext().getResources().getString(f0.i.f46643f);
            }
        }
        if (nVar.w().f(qVar.g())) {
            objA = T(nVar);
        }
        return (String) objA;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g1() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C3959x.g1():void");
    }

    private final C3174d h0(J0.n nVar) {
        C3174d c3174dK0 = k0(nVar.w());
        List list = (List) J0.k.a(nVar.w(), J0.q.f9676a.D());
        return c3174dK0 == null ? list != null ? (C3174d) AbstractC3689v.s0(list) : null : c3174dK0;
    }

    private final String i0(J0.n nVar) {
        C3174d c3174d;
        if (nVar == null) {
            return null;
        }
        J0.j jVarW = nVar.w();
        J0.q qVar = J0.q.f9676a;
        if (jVarW.f(qVar.d())) {
            return AbstractC3750a.e((List) nVar.w().j(qVar.d()), ",", null, null, 0, null, null, 62, null);
        }
        if (nVar.w().f(qVar.g())) {
            C3174d c3174dK0 = k0(nVar.w());
            if (c3174dK0 != null) {
                return c3174dK0.k();
            }
            return null;
        }
        List list = (List) J0.k.a(nVar.w(), qVar.D());
        if (list == null || (c3174d = (C3174d) AbstractC3689v.s0(list)) == null) {
            return null;
        }
        return c3174d.k();
    }

    private final InterfaceC3919g j0(J0.n nVar, int i10) {
        String strI0;
        L0.M mE;
        if (nVar == null || (strI0 = i0(nVar)) == null || strI0.length() == 0) {
            return null;
        }
        if (i10 == 1) {
            C3907c c3907cA = C3907c.f29335d.a(this.f29648d.getContext().getResources().getConfiguration().locale);
            c3907cA.e(strI0);
            return c3907cA;
        }
        if (i10 == 2) {
            C3922h c3922hA = C3922h.f29386d.a(this.f29648d.getContext().getResources().getConfiguration().locale);
            c3922hA.e(strI0);
            return c3922hA;
        }
        if (i10 != 4) {
            if (i10 == 8) {
                C3916f c3916fA = C3916f.f29363c.a();
                c3916fA.e(strI0);
                return c3916fA;
            }
            if (i10 != 16) {
                return null;
            }
        }
        if (!nVar.w().f(J0.i.f9619a.i()) || (mE = AbstractC3936l1.e(nVar.w())) == null) {
            return null;
        }
        if (i10 == 4) {
            C3910d c3910dA = C3910d.f29343d.a();
            c3910dA.j(strI0, mE);
            return c3910dA;
        }
        C3913e c3913eA = C3913e.f29354f.a();
        c3913eA.j(strI0, mE, nVar);
        return c3913eA;
    }

    private final C3174d k0(J0.j jVar) {
        return (C3174d) J0.k.a(jVar, J0.q.f9676a.g());
    }

    private final boolean n0(int i10) {
        return this.f29659o == i10;
    }

    private final boolean o0(J0.n nVar) {
        J0.j jVarW = nVar.w();
        J0.q qVar = J0.q.f9676a;
        return !jVarW.f(qVar.d()) && nVar.w().f(qVar.g());
    }

    private final boolean q0(J0.n nVar) {
        List list = (List) J0.k.a(nVar.w(), J0.q.f9676a.d());
        boolean z10 = ((list != null ? (String) AbstractC3689v.s0(list) : null) == null && h0(nVar) == null && g0(nVar) == null && !f0(nVar)) ? false : true;
        if (AbstractC3936l1.g(nVar)) {
            if (nVar.w().u()) {
                return true;
            }
            if (nVar.A() && z10) {
                return true;
            }
        }
        return false;
    }

    private final boolean r0() {
        return this.f29652h || (this.f29651g.isEnabled() && this.f29651g.isTouchExplorationEnabled());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(E0.G g10) {
        if (this.f29668x.add(g10)) {
            this.f29669y.k(Yg.J.f24997a);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:89:0x018e
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v48 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.Comparable] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x018d -> B:89:0x018e). Please report as a decompilation issue!!! */
    public final boolean v0(int r18, int r19, android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C3959x.v0(int, int, android.os.Bundle):boolean");
    }

    private static final boolean w0(J0.h hVar, float f10) {
        return (f10 < 0.0f && ((Number) hVar.c().invoke()).floatValue() > 0.0f) || (f10 > 0.0f && ((Number) hVar.c().invoke()).floatValue() < ((Number) hVar.a().invoke()).floatValue());
    }

    private static final float x0(float f10, float f11) {
        if (Math.signum(f10) == Math.signum(f11)) {
            return Math.abs(f10) < Math.abs(f11) ? f10 : f11;
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0326  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void y0(int r17, G1.t r18, J0.n r19) {
        /*
            Method dump skipped, instructions count: 2083
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C3959x.y0(int, G1.t, J0.n):void");
    }

    private static final boolean z0(J0.h hVar) {
        return (((Number) hVar.c().invoke()).floatValue() > 0.0f && !hVar.b()) || (((Number) hVar.c().invoke()).floatValue() < ((Number) hVar.a().invoke()).floatValue() && hVar.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:25:0x0065, B:29:0x0077, B:31:0x007f, B:33:0x0088, B:35:0x0091, B:36:0x00a2, B:38:0x00a9, B:39:0x00b2, B:20:0x0051), top: B:49:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0086 -> B:42:0x00d2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cf -> B:42:0x00d2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object M(dh.InterfaceC5380e r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C3959x.M(dh.e):java.lang.Object");
    }

    public final boolean N(boolean z10, int i10, long j10) {
        if (AbstractC6492s.d(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return O(a0(), z10, i10, j10);
        }
        return false;
    }

    public final void S0(long j10) {
        this.f29653i = j10;
    }

    public final boolean V(MotionEvent motionEvent) {
        if (!r0()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iM0 = m0(motionEvent.getX(), motionEvent.getY());
            boolean zDispatchGenericMotionEvent = this.f29648d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
            f1(iM0);
            if (iM0 == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.f29649e == Integer.MIN_VALUE) {
            return this.f29648d.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
        }
        f1(PduHandle.NONE);
        return true;
    }

    @Override // F1.C2736a
    public G1.u b(View view) {
        return this.f29658n;
    }

    public final String b0() {
        return this.f29640G;
    }

    public final String c0() {
        return this.f29639F;
    }

    public final C7032x d0() {
        return this.f29638E;
    }

    public final C7032x e0() {
        return this.f29637D;
    }

    public final androidx.compose.ui.platform.r l0() {
        return this.f29648d;
    }

    public final int m0(float f10, float f11) {
        int iF0;
        E0.m0.f(this.f29648d, false, 1, null);
        C2642u c2642u = new C2642u();
        this.f29648d.getRoot().z0(AbstractC6532h.a(f10, f11), c2642u, (12 & 4) != 0, (12 & 8) != 0);
        int iN = AbstractC3689v.n(c2642u);
        while (true) {
            iF0 = PduHandle.NONE;
            if (-1 >= iN) {
                break;
            }
            E0.G gM = AbstractC2633k.m(c2642u.get(iN));
            if (this.f29648d.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(gM) != null) {
                return PduHandle.NONE;
            }
            if (gM.k0().q(E0.e0.a(8))) {
                iF0 = F0(gM.q0());
                if (AbstractC3936l1.f(J0.o.a(gM, false))) {
                    break;
                }
            }
            iN--;
        }
        return iF0;
    }

    public final boolean p0() {
        return this.f29652h || (this.f29651g.isEnabled() && !this.f29656l.isEmpty());
    }

    public final void t0(E0.G g10) {
        this.f29670z = true;
        if (p0()) {
            s0(g10);
        }
    }

    public final void u0() {
        this.f29670z = true;
        if (!p0() || this.f29644K) {
            return;
        }
        this.f29644K = true;
        this.f29657m.post(this.f29645L);
    }
}
