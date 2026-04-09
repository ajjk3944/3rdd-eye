package q0;

import R.C0187n;
import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class L {

    /* renamed from: a, reason: collision with root package name */
    public C2796i f22938a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f22939b;

    public abstract v a();

    public final C2796i b() {
        C2796i c2796i = this.f22938a;
        if (c2796i != null) {
            return c2796i;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached");
    }

    public void d(List list, B b5) {
        x5.c cVar = new x5.c(new x5.d(new x5.f(2, new d5.q(0, list), new A5.c(this, 3, b5)), false, new D4.d(12)));
        while (cVar.hasNext()) {
            b().g((C2794g) cVar.next());
        }
    }

    public void e(C2796i c2796i) {
        this.f22938a = c2796i;
        this.f22939b = true;
    }

    public void f(C2794g c2794g) {
        v vVar = c2794g.f22965b;
        if (vVar == null) {
            vVar = null;
        }
        if (vVar == null) {
            return;
        }
        C c6 = new C();
        c6.f22917b = true;
        boolean z6 = c6.f22917b;
        boolean z7 = c6.f22918c;
        int i = c6.f22919d;
        boolean z8 = c6.f22920e;
        C0187n c0187n = c6.f22916a;
        c(vVar, null, new B(z6, z7, i, false, z8, c0187n.f3349a, c0187n.f3350b, -1, -1));
        b().c(c2794g);
    }

    public Bundle h() {
        return null;
    }

    public void i(C2794g c2794g, boolean z6) {
        q5.i.e(c2794g, "popUpTo");
        List list = (List) ((C5.o) b().f22982e.f73b).I();
        if (!list.contains(c2794g)) {
            throw new IllegalStateException(("popBackStack was called with " + c2794g + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        C2794g c2794g2 = null;
        while (j()) {
            c2794g2 = (C2794g) listIterator.previous();
            if (q5.i.a(c2794g2, c2794g)) {
                break;
            }
        }
        if (c2794g2 != null) {
            b().d(c2794g2);
        }
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }

    public v c(v vVar, Bundle bundle, B b5) {
        return vVar;
    }
}
