package S6;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import m0.AbstractC6679O;
import m0.AbstractC6737x0;
import r0.AbstractC7554d;
import r0.C7551a;
import r0.C7553c;
import x1.AbstractC8417b;

/* loaded from: classes3.dex */
public abstract class p {
    public static final AbstractC7554d a(Drawable drawable, List imagePlugins, InterfaceC3540l interfaceC3540l, int i10) {
        Object cVar;
        AbstractC6492s.i(drawable, "drawable");
        AbstractC6492s.i(imagePlugins, "imagePlugins");
        interfaceC3540l.U(409244552);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(409244552, i10, -1, "com.skydoves.landscapist.rememberDrawablePainter (RememberDrawablePainter.kt:49)");
        }
        interfaceC3540l.U(1168861164);
        boolean zT = interfaceC3540l.T(drawable) | interfaceC3540l.T(imagePlugins);
        Object objF = interfaceC3540l.f();
        if (zT || objF == InterfaceC3540l.f21100a.a()) {
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                AbstractC6492s.h(bitmap, "getBitmap(...)");
                objF = new C7551a(AbstractC6679O.c(bitmap), 0L, 0L, 6, null);
            } else {
                if (drawable instanceof ColorDrawable) {
                    cVar = new C7553c(AbstractC6737x0.b(((ColorDrawable) drawable).getColor()), null);
                } else {
                    Drawable drawableMutate = drawable.mutate();
                    AbstractC6492s.h(drawableMutate, "mutate(...)");
                    cVar = new c(drawableMutate);
                }
                objF = cVar;
            }
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.J();
        AbstractC7554d abstractC7554dA = X6.a.a((AbstractC7554d) objF, imagePlugins, AbstractC6679O.c(AbstractC8417b.b(drawable, 0, 0, null, 7, null)), interfaceC3540l, i10 & 112);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return abstractC7554dA;
    }
}
