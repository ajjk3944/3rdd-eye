package F0;

import C5.o;
import androidx.lifecycle.EnumC0291m;
import androidx.lifecycle.InterfaceC0296s;
import androidx.lifecycle.InterfaceC0298u;
import java.util.Iterator;
import java.util.List;
import k0.AbstractComponentCallbacksC2617v;
import q0.C2794g;
import q0.z;
import q5.i;
import s0.C2885f;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements InterfaceC0296s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1434b;

    public /* synthetic */ c(int i, Object obj) {
        this.f1433a = i;
        this.f1434b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0296s
    public final void d(InterfaceC0298u interfaceC0298u, EnumC0291m enumC0291m) {
        switch (this.f1433a) {
            case 0:
                f fVar = (f) this.f1434b;
                i.e(fVar, "this$0");
                if (enumC0291m == EnumC0291m.ON_START) {
                    fVar.f1437c = true;
                    break;
                } else if (enumC0291m == EnumC0291m.ON_STOP) {
                    fVar.f1437c = false;
                    break;
                }
                break;
            case 1:
                z zVar = (z) this.f1434b;
                zVar.f23070q = enumC0291m.a();
                if (zVar.f23057c != null) {
                    Iterator<E> it = zVar.f23061g.iterator();
                    while (it.hasNext()) {
                        C2794g c2794g = (C2794g) it.next();
                        c2794g.getClass();
                        c2794g.f22967d = enumC0291m.a();
                        c2794g.e();
                    }
                    break;
                }
                break;
            default:
                C2885f c2885f = (C2885f) this.f1434b;
                if (enumC0291m == EnumC0291m.ON_DESTROY) {
                    AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = (AbstractComponentCallbacksC2617v) interfaceC0298u;
                    Object obj = null;
                    for (Object obj2 : (Iterable) ((o) c2885f.b().f22983f.f73b).I()) {
                        if (i.a(((C2794g) obj2).f22969f, abstractComponentCallbacksC2617v.M)) {
                            obj = obj2;
                        }
                    }
                    C2794g c2794g2 = (C2794g) obj;
                    if (c2794g2 != null && !((List) ((o) c2885f.b().f22982e.f73b).I()).contains(c2794g2)) {
                        c2885f.b().b(c2794g2);
                        break;
                    }
                }
                break;
        }
    }
}
