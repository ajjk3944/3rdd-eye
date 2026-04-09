package V6;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC6492s;

/* loaded from: classes3.dex */
public abstract class w {
    public static final b a(b target, S6.k imageOptions, boolean z10, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(target, "target");
        AbstractC6492s.i(imageOptions, "imageOptions");
        interfaceC3540l.U(1706865971);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1706865971, i10, -1, "com.skydoves.landscapist.glide.rememberTarget (RememberTarget.kt:39)");
        }
        Context context = (Context) interfaceC3540l.t(AndroidCompositionLocals_androidKt.g());
        interfaceC3540l.U(-1011778940);
        boolean z11 = ((((i10 & 14) ^ 6) > 4 && interfaceC3540l.T(target)) || (i10 & 6) == 4) | ((((i10 & 112) ^ 48) > 32 && interfaceC3540l.T(imageOptions)) || (i10 & 48) == 32);
        Object objF = interfaceC3540l.f();
        if (z11 || objF == InterfaceC3540l.f21100a.a()) {
            Context applicationContext = context.getApplicationContext();
            AbstractC6492s.h(applicationContext, "getApplicationContext(...)");
            objF = new x(applicationContext, target, z10);
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.J();
        b bVarA = ((x) objF).a();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return bVarA;
    }
}
