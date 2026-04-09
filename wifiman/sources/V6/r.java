package V6;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f23082a = new r();

    private r() {
    }

    public final com.bumptech.glide.i a(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-1093794907);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1093794907, i10, -1, "com.skydoves.landscapist.glide.LocalGlideProvider.getGlideRequestBuilder (LocalGlideProvider.kt:58)");
        }
        com.bumptech.glide.i iVarC = (com.bumptech.glide.i) interfaceC3540l.t(v.g());
        if (iVarC == null) {
            iVarC = b(interfaceC3540l, i10 & 14).c(Object.class);
            AbstractC6492s.h(iVarC, "as(...)");
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return iVarC;
    }

    public final com.bumptech.glide.j b(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(1797906177);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1797906177, i10, -1, "com.skydoves.landscapist.glide.LocalGlideProvider.getGlideRequestManager (LocalGlideProvider.kt:66)");
        }
        com.bumptech.glide.j jVarT = (com.bumptech.glide.j) interfaceC3540l.t(v.h());
        if (jVarT == null) {
            jVarT = com.bumptech.glide.b.t(((Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g())).getApplicationContext());
            AbstractC6492s.h(jVarT, "with(...)");
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return jVarT;
    }

    public final com.bumptech.glide.request.f c(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(81446111);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(81446111, i10, -1, "com.skydoves.landscapist.glide.LocalGlideProvider.getGlideRequestOptions (LocalGlideProvider.kt:52)");
        }
        com.bumptech.glide.request.f fVar = (com.bumptech.glide.request.f) interfaceC3540l.t(v.i());
        if (fVar == null) {
            fVar = new com.bumptech.glide.request.f();
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return fVar;
    }
}
