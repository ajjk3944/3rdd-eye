package androidx.compose.ui.platform;

import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.ui.platform.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3910d extends AbstractC3904b {

    /* renamed from: f, reason: collision with root package name */
    private static C3910d f29345f;

    /* renamed from: c, reason: collision with root package name */
    private L0.M f29348c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f29343d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f29344e = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final W0.i f29346g = W0.i.Rtl;

    /* renamed from: h, reason: collision with root package name */
    private static final W0.i f29347h = W0.i.Ltr;

    /* renamed from: androidx.compose.ui.platform.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3910d a() {
            if (C3910d.f29345f == null) {
                C3910d.f29345f = new C3910d(null);
            }
            C3910d c3910d = C3910d.f29345f;
            AbstractC6492s.g(c3910d, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
            return c3910d;
        }

        private a() {
        }
    }

    public /* synthetic */ C3910d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final int i(int i10, W0.i iVar) {
        L0.M m10 = this.f29348c;
        L0.M m11 = null;
        if (m10 == null) {
            AbstractC6492s.v("layoutResult");
            m10 = null;
        }
        int iU = m10.u(i10);
        L0.M m12 = this.f29348c;
        if (m12 == null) {
            AbstractC6492s.v("layoutResult");
            m12 = null;
        }
        if (iVar != m12.y(iU)) {
            L0.M m13 = this.f29348c;
            if (m13 == null) {
                AbstractC6492s.v("layoutResult");
            } else {
                m11 = m13;
            }
            return m11.u(i10);
        }
        L0.M m14 = this.f29348c;
        if (m14 == null) {
            AbstractC6492s.v("layoutResult");
            m14 = null;
        }
        return L0.M.p(m14, i10, false, 2, null) - 1;
    }

    @Override // androidx.compose.ui.platform.InterfaceC3919g
    public int[] a(int i10) {
        int iQ;
        if (d().length() <= 0 || i10 >= d().length()) {
            return null;
        }
        if (i10 < 0) {
            L0.M m10 = this.f29348c;
            if (m10 == null) {
                AbstractC6492s.v("layoutResult");
                m10 = null;
            }
            iQ = m10.q(0);
        } else {
            L0.M m11 = this.f29348c;
            if (m11 == null) {
                AbstractC6492s.v("layoutResult");
                m11 = null;
            }
            int iQ2 = m11.q(i10);
            iQ = i(iQ2, f29346g) == i10 ? iQ2 : iQ2 + 1;
        }
        L0.M m12 = this.f29348c;
        if (m12 == null) {
            AbstractC6492s.v("layoutResult");
            m12 = null;
        }
        if (iQ >= m12.n()) {
            return null;
        }
        return c(i(iQ, f29346g), i(iQ, f29347h) + 1);
    }

    @Override // androidx.compose.ui.platform.InterfaceC3919g
    public int[] b(int i10) {
        int iQ;
        if (d().length() <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > d().length()) {
            L0.M m10 = this.f29348c;
            if (m10 == null) {
                AbstractC6492s.v("layoutResult");
                m10 = null;
            }
            iQ = m10.q(d().length());
        } else {
            L0.M m11 = this.f29348c;
            if (m11 == null) {
                AbstractC6492s.v("layoutResult");
                m11 = null;
            }
            int iQ2 = m11.q(i10);
            iQ = i(iQ2, f29347h) + 1 == i10 ? iQ2 : iQ2 - 1;
        }
        if (iQ < 0) {
            return null;
        }
        return c(i(iQ, f29346g), i(iQ, f29347h) + 1);
    }

    public final void j(String str, L0.M m10) {
        f(str);
        this.f29348c = m10;
    }

    private C3910d() {
    }
}
