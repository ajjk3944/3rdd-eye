package I;

import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo;
import kotlin.jvm.internal.AbstractC6492s;
import l0.C6533i;
import m0.AbstractC6680P;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public final class M0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC6835l f8042a;

    /* renamed from: b, reason: collision with root package name */
    private final I0 f8043b;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8045d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8046e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8047f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8048g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8049h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f8050i;

    /* renamed from: j, reason: collision with root package name */
    private R0.Q f8051j;

    /* renamed from: k, reason: collision with root package name */
    private L0.M f8052k;

    /* renamed from: l, reason: collision with root package name */
    private R0.H f8053l;

    /* renamed from: m, reason: collision with root package name */
    private C6533i f8054m;

    /* renamed from: n, reason: collision with root package name */
    private C6533i f8055n;

    /* renamed from: c, reason: collision with root package name */
    private final Object f8044c = new Object();

    /* renamed from: o, reason: collision with root package name */
    private final CursorAnchorInfo.Builder f8056o = new CursorAnchorInfo.Builder();

    /* renamed from: p, reason: collision with root package name */
    private final float[] f8057p = m0.O0.c(null, 1, null);

    /* renamed from: q, reason: collision with root package name */
    private final Matrix f8058q = new Matrix();

    public M0(InterfaceC6835l interfaceC6835l, I0 i02) {
        this.f8042a = interfaceC6835l;
        this.f8043b = i02;
    }

    private final void c() {
        if (!this.f8043b.isActive() || this.f8051j == null || this.f8053l == null || this.f8052k == null || this.f8054m == null || this.f8055n == null) {
            return;
        }
        m0.O0.h(this.f8057p);
        this.f8042a.invoke(m0.O0.a(this.f8057p));
        float[] fArr = this.f8057p;
        C6533i c6533i = this.f8055n;
        AbstractC6492s.f(c6533i);
        float f10 = -c6533i.k();
        C6533i c6533i2 = this.f8055n;
        AbstractC6492s.f(c6533i2);
        m0.O0.p(fArr, f10, -c6533i2.n(), 0.0f);
        AbstractC6680P.a(this.f8058q, this.f8057p);
        I0 i02 = this.f8043b;
        CursorAnchorInfo.Builder builder = this.f8056o;
        R0.Q q10 = this.f8051j;
        AbstractC6492s.f(q10);
        R0.H h10 = this.f8053l;
        AbstractC6492s.f(h10);
        L0.M m10 = this.f8052k;
        AbstractC6492s.f(m10);
        Matrix matrix = this.f8058q;
        C6533i c6533i3 = this.f8054m;
        AbstractC6492s.f(c6533i3);
        C6533i c6533i4 = this.f8055n;
        AbstractC6492s.f(c6533i4);
        i02.c(L0.b(builder, q10, h10, m10, matrix, c6533i3, c6533i4, this.f8047f, this.f8048g, this.f8049h, this.f8050i));
        this.f8046e = false;
    }

    public final void a() {
        synchronized (this.f8044c) {
            this.f8051j = null;
            this.f8053l = null;
            this.f8052k = null;
            this.f8054m = null;
            this.f8055n = null;
            Yg.J j10 = Yg.J.f24997a;
        }
    }

    public final void b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        synchronized (this.f8044c) {
            try {
                this.f8047f = z12;
                this.f8048g = z13;
                this.f8049h = z14;
                this.f8050i = z15;
                if (z10) {
                    this.f8046e = true;
                    if (this.f8051j != null) {
                        c();
                    }
                }
                this.f8045d = z11;
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(R0.Q q10, R0.H h10, L0.M m10, C6533i c6533i, C6533i c6533i2) {
        synchronized (this.f8044c) {
            try {
                this.f8051j = q10;
                this.f8053l = h10;
                this.f8052k = m10;
                this.f8054m = c6533i;
                this.f8055n = c6533i2;
                if (this.f8046e || this.f8045d) {
                    c();
                }
                Yg.J j10 = Yg.J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
