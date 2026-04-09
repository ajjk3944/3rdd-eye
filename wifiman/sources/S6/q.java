package S6;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import m0.J0;
import r0.AbstractC7554d;
import r0.C7551a;

/* loaded from: classes3.dex */
public abstract class q {
    public static final AbstractC7554d a(List imagePlugins, J0 imageBitmap, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(imagePlugins, "imagePlugins");
        AbstractC6492s.i(imageBitmap, "imageBitmap");
        interfaceC3540l.U(944814705);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(944814705, i10, -1, "com.skydoves.landscapist.rememberBitmapPainter (RememberPainterPlugins.kt:36)");
        }
        interfaceC3540l.U(-219651812);
        boolean zT = interfaceC3540l.T(imageBitmap) | interfaceC3540l.T(imagePlugins);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            objF = new C7551a(imageBitmap, 0L, 0L, 6, null);
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.J();
        AbstractC7554d abstractC7554dA = X6.a.a((C7551a) objF, imagePlugins, imageBitmap, interfaceC3540l, (i10 << 3) & 1008);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return abstractC7554dA;
    }
}
