package androidx.compose.ui.platform;

import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.AbstractC7978m;

/* renamed from: androidx.compose.ui.platform.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3913e extends AbstractC3904b {

    /* renamed from: h, reason: collision with root package name */
    private static C3913e f29356h;

    /* renamed from: c, reason: collision with root package name */
    private L0.M f29359c;

    /* renamed from: d, reason: collision with root package name */
    private J0.n f29360d;

    /* renamed from: e, reason: collision with root package name */
    private Rect f29361e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f29354f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final int f29355g = 8;

    /* renamed from: i, reason: collision with root package name */
    private static final W0.i f29357i = W0.i.Rtl;

    /* renamed from: j, reason: collision with root package name */
    private static final W0.i f29358j = W0.i.Ltr;

    /* renamed from: androidx.compose.ui.platform.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3913e a() {
            if (C3913e.f29356h == null) {
                C3913e.f29356h = new C3913e(null);
            }
            C3913e c3913e = C3913e.f29356h;
            AbstractC6492s.g(c3913e, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
            return c3913e;
        }

        private a() {
        }
    }

    public /* synthetic */ C3913e(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i10, W0.i iVar) {
        L0.M m10 = this.f29359c;
        L0.M m11 = null;
        if (m10 == null) {
            AbstractC6492s.v("layoutResult");
            m10 = null;
        }
        int iU = m10.u(i10);
        L0.M m12 = this.f29359c;
        if (m12 == null) {
            AbstractC6492s.v("layoutResult");
            m12 = null;
        }
        if (iVar != m12.y(iU)) {
            L0.M m13 = this.f29359c;
            if (m13 == null) {
                AbstractC6492s.v("layoutResult");
            } else {
                m11 = m13;
            }
            return m11.u(i10);
        }
        L0.M m14 = this.f29359c;
        if (m14 == null) {
            AbstractC6492s.v("layoutResult");
            m14 = null;
        }
        return L0.M.p(m14, i10, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3919g
    public int[] a(int i10) {
        int iN;
        L0.M m10 = null;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        try {
            J0.n nVar = this.f29360d;
            if (nVar == null) {
                AbstractC6492s.v("node");
                nVar = null;
            }
            int iRound = Math.round(nVar.i().j());
            int iD = AbstractC7978m.d(0, i10);
            L0.M m11 = this.f29359c;
            if (m11 == null) {
                AbstractC6492s.v("layoutResult");
                m11 = null;
            }
            int iQ = m11.q(iD);
            L0.M m12 = this.f29359c;
            if (m12 == null) {
                AbstractC6492s.v("layoutResult");
                m12 = null;
            }
            float fV = m12.v(iQ) + iRound;
            L0.M m13 = this.f29359c;
            if (m13 == null) {
                AbstractC6492s.v("layoutResult");
                m13 = null;
            }
            L0.M m14 = this.f29359c;
            if (m14 == null) {
                AbstractC6492s.v("layoutResult");
                m14 = null;
            }
            if (fV < m13.v(m14.n() - 1)) {
                L0.M m15 = this.f29359c;
                if (m15 == null) {
                    AbstractC6492s.v("layoutResult");
                } else {
                    m10 = m15;
                }
                iN = m10.r(fV);
            } else {
                L0.M m16 = this.f29359c;
                if (m16 == null) {
                    AbstractC6492s.v("layoutResult");
                } else {
                    m10 = m16;
                }
                iN = m10.n();
            }
            return c(iD, i(iN - 1, f29358j) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.InterfaceC3919g
    public int[] b(int i10) {
        int iR;
        L0.M m10 = null;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        try {
            J0.n nVar = this.f29360d;
            if (nVar == null) {
                AbstractC6492s.v("node");
                nVar = null;
            }
            int iRound = Math.round(nVar.i().j());
            int iG = AbstractC7978m.g(d().length(), i10);
            L0.M m11 = this.f29359c;
            if (m11 == null) {
                AbstractC6492s.v("layoutResult");
                m11 = null;
            }
            int iQ = m11.q(iG);
            L0.M m12 = this.f29359c;
            if (m12 == null) {
                AbstractC6492s.v("layoutResult");
                m12 = null;
            }
            float fV = m12.v(iQ) - iRound;
            if (fV > 0.0f) {
                L0.M m13 = this.f29359c;
                if (m13 == null) {
                    AbstractC6492s.v("layoutResult");
                } else {
                    m10 = m13;
                }
                iR = m10.r(fV);
            } else {
                iR = 0;
            }
            if (iG == d().length() && iR < iQ) {
                iR++;
            }
            return c(i(iR, f29357i), iG);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final void j(String str, L0.M m10, J0.n nVar) {
        f(str);
        this.f29359c = m10;
        this.f29360d = nVar;
    }

    private C3913e() {
        this.f29361e = new Rect();
    }
}
