package R0;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6533i;
import m0.AbstractC6680P;
import m0.O0;
import mh.InterfaceC6835l;
import y0.InterfaceC8573M;

/* renamed from: R0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3452e {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC8573M f19459a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3467u f19460b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19462d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f19463e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f19464f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f19465g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19466h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19467i;

    /* renamed from: j, reason: collision with root package name */
    private Q f19468j;

    /* renamed from: k, reason: collision with root package name */
    private L0.M f19469k;

    /* renamed from: l, reason: collision with root package name */
    private H f19470l;

    /* renamed from: n, reason: collision with root package name */
    private C6533i f19472n;

    /* renamed from: o, reason: collision with root package name */
    private C6533i f19473o;

    /* renamed from: c, reason: collision with root package name */
    private final Object f19461c = new Object();

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC6835l f19471m = b.f19478a;

    /* renamed from: p, reason: collision with root package name */
    private final CursorAnchorInfo.Builder f19474p = new CursorAnchorInfo.Builder();

    /* renamed from: q, reason: collision with root package name */
    private final float[] f19475q = O0.c(null, 1, null);

    /* renamed from: r, reason: collision with root package name */
    private final Matrix f19476r = new Matrix();

    /* renamed from: R0.e$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f19477a = new a();

        a() {
            super(1);
        }

        public final void a(float[] fArr) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((O0) obj).r());
            return Yg.J.f24997a;
        }
    }

    /* renamed from: R0.e$b */
    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final b f19478a = new b();

        b() {
            super(1);
        }

        public final void a(float[] fArr) {
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((O0) obj).r());
            return Yg.J.f24997a;
        }
    }

    public C3452e(InterfaceC8573M interfaceC8573M, InterfaceC3467u interfaceC3467u) {
        this.f19459a = interfaceC8573M;
        this.f19460b = interfaceC3467u;
    }

    private final void c() {
        if (this.f19460b.isActive()) {
            this.f19471m.invoke(O0.a(this.f19475q));
            this.f19459a.t(this.f19475q);
            AbstractC6680P.a(this.f19476r, this.f19475q);
            InterfaceC3467u interfaceC3467u = this.f19460b;
            CursorAnchorInfo.Builder builder = this.f19474p;
            Q q10 = this.f19468j;
            AbstractC6492s.f(q10);
            H h10 = this.f19470l;
            AbstractC6492s.f(h10);
            L0.M m10 = this.f19469k;
            AbstractC6492s.f(m10);
            Matrix matrix = this.f19476r;
            C6533i c6533i = this.f19472n;
            AbstractC6492s.f(c6533i);
            C6533i c6533i2 = this.f19473o;
            AbstractC6492s.f(c6533i2);
            interfaceC3467u.c(AbstractC3451d.b(builder, q10, h10, m10, matrix, c6533i, c6533i2, this.f19464f, this.f19465g, this.f19466h, this.f19467i));
            this.f19463e = false;
        }
    }

    public final void a() {
        synchronized (this.f19461c) {
            this.f19468j = null;
            this.f19470l = null;
            this.f19469k = null;
            this.f19471m = a.f19477a;
            this.f19472n = null;
            this.f19473o = null;
            Yg.J j10 = Yg.J.f24997a;
        }
    }

    public final void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f19461c) {
            try {
                this.f19464f = z12;
                this.f19465g = z13;
                this.f19466h = z14;
                this.f19467i = z15;
                if (z10) {
                    this.f19463e = true;
                    if (this.f19468j != null) {
                        c();
                    }
                }
                this.f19462d = z11;
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(Q q10, H h10, L0.M m10, InterfaceC6835l interfaceC6835l, C6533i c6533i, C6533i c6533i2) {
        synchronized (this.f19461c) {
            try {
                this.f19468j = q10;
                this.f19470l = h10;
                this.f19469k = m10;
                this.f19471m = interfaceC6835l;
                this.f19472n = c6533i;
                this.f19473o = c6533i2;
                if (this.f19463e || this.f19462d) {
                    c();
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
