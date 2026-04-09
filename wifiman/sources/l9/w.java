package L9;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import m0.C6733v0;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static final w f11485a = new w();

    /* renamed from: b, reason: collision with root package name */
    private static final float f11486b = Y0.h.j(56);

    /* renamed from: c, reason: collision with root package name */
    private static final float f11487c = Y0.h.j(64);

    /* renamed from: d, reason: collision with root package name */
    private static final float f11488d = Y0.h.j(4);

    private w() {
    }

    public static /* synthetic */ z.N b(w wVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = f11488d;
        }
        if ((i10 & 2) != 0) {
            f11 = f11488d;
        }
        return wVar.a(f10, f11);
    }

    public final z.N a(float f10, float f11) {
        return androidx.compose.foundation.layout.o.e(f10, 0.0f, f11, 0.0f, 10, null);
    }

    public final float c() {
        return f11487c;
    }

    public final float d() {
        return f11486b;
    }

    public final long e(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-1840103342);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1840103342, i10, -1, "com.ui.core.ui.component.toolbar.UiToolbarDefaults.<get-defaultBackground> (UiToolbarDefaults.kt:13)");
        }
        long jD = C6733v0.f52951b.d();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jD;
    }
}
