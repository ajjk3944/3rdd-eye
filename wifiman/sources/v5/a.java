package V5;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Y0.d;
import Y0.t;
import android.graphics.RectF;
import androidx.compose.ui.platform.AbstractC3932k0;
import kotlin.jvm.internal.AbstractC6492s;
import u6.f;

/* loaded from: classes3.dex */
public abstract class a {
    public static final f a(boolean z10, float f10, RectF canvasBounds, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(canvasBounds, "canvasBounds");
        interfaceC3540l.e(-618260979);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-618260979, i10, -1, "com.patrykandpatrick.vico.compose.layout.getMeasureContext (MeasureContextExtensions.kt:35)");
        }
        interfaceC3540l.e(-492369756);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new f(canvasBounds, 0.0f, 0.0f, true, z10, f10);
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.P();
        f fVar = (f) objF;
        fVar.v(((d) interfaceC3540l.t(AbstractC3932k0.g())).getDensity());
        fVar.w(((d) interfaceC3540l.t(AbstractC3932k0.g())).y() * ((d) interfaceC3540l.t(AbstractC3932k0.g())).getDensity());
        fVar.z(interfaceC3540l.t(AbstractC3932k0.m()) == t.Ltr);
        fVar.x(z10);
        fVar.u(f10);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.P();
        return fVar;
    }
}
