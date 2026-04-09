package P;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.z1;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.ar.core.ImageMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y.InterfaceC8556k;

/* loaded from: classes.dex */
public final class e extends f {
    public /* synthetic */ e(boolean z10, float f10, z1 z1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, f10, z1Var);
    }

    @Override // P.f
    public o c(InterfaceC8556k interfaceC8556k, boolean z10, float f10, z1 z1Var, z1 z1Var2, InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(331259447);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(331259447, i10, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:92)");
        }
        ViewGroup viewGroupE = t.e((View) interfaceC3540l.t(AndroidCompositionLocals_androidKt.k()));
        boolean zT = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(interfaceC8556k)) || (i10 & 6) == 4) | ((((458752 & i10) ^ ImageMetadata.EDGE_MODE) > 131072 && interfaceC3540l.T(this)) || (i10 & ImageMetadata.EDGE_MODE) == 131072) | interfaceC3540l.T(viewGroupE);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new a(z10, f10, z1Var, z1Var2, viewGroupE, null);
            interfaceC3540l.K(objF);
        }
        a aVar = (a) objF;
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return aVar;
    }

    private e(boolean z10, float f10, z1 z1Var) {
        super(z10, f10, z1Var, null);
    }
}
