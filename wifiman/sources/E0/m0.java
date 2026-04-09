package E0;

import Q0.AbstractC3434k;
import Q0.InterfaceC3433j;
import android.view.View;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.platform.E1;
import androidx.compose.ui.platform.InterfaceC3923h0;
import androidx.compose.ui.platform.InterfaceC3925i;
import androidx.compose.ui.platform.n1;
import androidx.compose.ui.platform.q1;
import androidx.compose.ui.platform.w1;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import i0.InterfaceC6053c;
import m0.InterfaceC6671H0;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import p0.C7182c;
import u0.InterfaceC8123a;
import v0.InterfaceC8184b;
import y0.InterfaceC8573M;
import y0.InterfaceC8601v;

/* loaded from: classes.dex */
public interface m0 extends InterfaceC8573M {

    /* renamed from: L, reason: collision with root package name */
    public static final a f3951L = a.f3952a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f3952a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static boolean f3953b;

        private a() {
        }

        public final boolean a() {
            return f3953b;
        }
    }

    public interface b {
        void d();
    }

    static /* synthetic */ void B(m0 m0Var, G g10, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        m0Var.C(g10, z10, z11);
    }

    static /* synthetic */ void f(m0 m0Var, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        m0Var.a(z10);
    }

    static /* synthetic */ void m(m0 m0Var, G g10, boolean z10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        m0Var.s(g10, z10);
    }

    static /* synthetic */ l0 n(m0 m0Var, InterfaceC6839p interfaceC6839p, InterfaceC6824a interfaceC6824a, C7182c c7182c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLayer");
        }
        if ((i10 & 4) != 0) {
            c7182c = null;
        }
        return m0Var.y(interfaceC6839p, interfaceC6824a, c7182c);
    }

    static /* synthetic */ void v(m0 m0Var, G g10, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        if ((i10 & 8) != 0) {
            z12 = true;
        }
        m0Var.o(g10, z10, z11, z12);
    }

    void A(G g10, long j10);

    void C(G g10, boolean z10, boolean z11);

    void a(boolean z10);

    void b(G g10);

    void c(G g10);

    long d(long j10);

    long e(long j10);

    InterfaceC3925i getAccessibilityManager();

    g0.d getAutofill();

    g0.i getAutofillTree();

    InterfaceC3923h0 getClipboardManager();

    InterfaceC5384i getCoroutineContext();

    Y0.d getDensity();

    InterfaceC6053c getDragAndDropManager();

    k0.g getFocusOwner();

    AbstractC3434k.b getFontFamilyResolver();

    InterfaceC3433j.a getFontLoader();

    InterfaceC6671H0 getGraphicsContext();

    InterfaceC8123a getHapticFeedBack();

    InterfaceC8184b getInputModeManager();

    Y0.t getLayoutDirection();

    D0.f getModifierLocalManager();

    t.a getPlacementScope();

    InterfaceC8601v getPointerIconService();

    G getRoot();

    I getSharedDrawScope();

    boolean getShowLayoutBounds();

    o0 getSnapshotObserver();

    n1 getSoftwareKeyboardController();

    R0.T getTextInputService();

    q1 getTextToolbar();

    w1 getViewConfiguration();

    E1 getWindowInfo();

    void i(G g10);

    void k(InterfaceC6824a interfaceC6824a);

    void l(View view);

    void o(G g10, boolean z10, boolean z11, boolean z12);

    void s(G g10, boolean z10);

    void setShowLayoutBounds(boolean z10);

    void u(G g10);

    Object w(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e);

    void x();

    l0 y(InterfaceC6839p interfaceC6839p, InterfaceC6824a interfaceC6824a, C7182c c7182c);

    void z();
}
