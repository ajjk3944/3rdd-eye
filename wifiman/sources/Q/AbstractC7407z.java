package q;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AbstractC3932k0;
import r.AbstractC7515B;
import r.InterfaceC7550z;

/* renamed from: q.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC7407z {

    /* renamed from: a, reason: collision with root package name */
    private static final float f58328a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f58328a;
    }

    public static final InterfaceC7550z b(InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(904445851, i10, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        Y0.d dVar = (Y0.d) interfaceC3540l.t(AbstractC3932k0.g());
        boolean zG = interfaceC3540l.g(dVar.getDensity());
        Object objF = interfaceC3540l.f();
        if (zG || objF == InterfaceC3540l.f21100a.a()) {
            objF = AbstractC7515B.b(new C7406y(dVar));
            interfaceC3540l.K(objF);
        }
        InterfaceC7550z interfaceC7550z = (InterfaceC7550z) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return interfaceC7550z;
    }
}
