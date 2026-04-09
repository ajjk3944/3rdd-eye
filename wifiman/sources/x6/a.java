package X6;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import f.AbstractC5487d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import m0.J0;
import r0.AbstractC7554d;

/* loaded from: classes3.dex */
public abstract class a {
    public static final AbstractC7554d a(AbstractC7554d abstractC7554d, List imagePlugins, J0 imageBitmap, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(abstractC7554d, "<this>");
        AbstractC6492s.i(imagePlugins, "imagePlugins");
        AbstractC6492s.i(imageBitmap, "imageBitmap");
        interfaceC3540l.U(1134167668);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1134167668, i10, -1, "com.skydoves.landscapist.plugins.composePainterPlugins (ImagePlugin.kt:94)");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = imagePlugins.iterator();
        while (it.hasNext()) {
            it.next();
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            AbstractC5487d.a(it2.next());
            throw null;
        }
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return abstractC7554d;
    }
}
