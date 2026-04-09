package B;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import com.google.ar.core.ImageMetadata;

/* renamed from: B.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2448l {
    public static final androidx.compose.ui.e b(androidx.compose.ui.e eVar, InterfaceC2449m interfaceC2449m, C2446j c2446j, boolean z10, Y0.t tVar, w.q qVar, boolean z11, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1331498025, i10, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutBeyondBoundsModifier (LazyLayoutBeyondBoundsModifierLocal.kt:51)");
        }
        if (z11) {
            interfaceC3540l.U(-1890632411);
            boolean z12 = ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.T(interfaceC2449m)) || (i10 & 48) == 32) | ((((i10 & 896) ^ 384) > 256 && interfaceC3540l.T(c2446j)) || (i10 & 384) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && interfaceC3540l.c(z10)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && interfaceC3540l.T(tVar)) || (i10 & 24576) == 16384) | ((((458752 & i10) ^ ImageMetadata.EDGE_MODE) > 131072 && interfaceC3540l.T(qVar)) || (i10 & ImageMetadata.EDGE_MODE) == 131072);
            Object objF = interfaceC3540l.f();
            if (z12 || objF == InterfaceC3540l.f21100a.a()) {
                objF = new C2447k(interfaceC2449m, c2446j, z10, tVar, qVar);
                interfaceC3540l.K(objF);
            }
            eVar = eVar.b0((C2447k) objF);
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(-1890658823);
            interfaceC3540l.J();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction");
    }
}
