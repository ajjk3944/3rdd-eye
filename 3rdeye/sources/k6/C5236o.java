package k6;

import H6.C0675l;
import N7.AbstractC1192h2;
import N7.C1223j4;
import N7.Y0;
import h7.C4421b;
import java.util.Iterator;

/* compiled from: DivActionTypedHandlerProxy.kt */
/* renamed from: k6.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5236o {
    public static boolean a(String str, AbstractC1192h2 abstractC1192h2, j6.y yVar, A7.d dVar, C1223j4 c1223j4) {
        if (abstractC1192h2 == null || !(yVar instanceof C0675l)) {
            return false;
        }
        Object obj = null;
        if (abstractC1192h2 instanceof AbstractC1192h2.i) {
            Y0 action = ((AbstractC1192h2.i) abstractC1192h2).f8327b;
            kotlin.jvm.internal.l.f(action, "action");
            kotlin.jvm.internal.l.e(action.f7761c.a(dVar).toString(), "url.toString()");
            ((C0675l) yVar).getDiv2Component$div_release().s().b();
            throw null;
        }
        C0675l c0675l = (C0675l) yVar;
        C5235n c5235nG = c0675l.getDiv2Component$div_release().g();
        c5235nG.getClass();
        Iterator it = c5235nG.f43421a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((InterfaceC5234m) next).a(str, abstractC1192h2, c0675l, dVar)) {
                obj = next;
                break;
            }
        }
        boolean z10 = obj != null;
        if (!z10) {
            int i = C4421b.f38269a;
            C4421b.a(C7.a.DEBUG);
        }
        return z10;
    }
}
