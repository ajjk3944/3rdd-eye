package q0;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

@K("navigation")
/* loaded from: classes.dex */
public class y extends L {

    /* renamed from: c, reason: collision with root package name */
    public final M f23051c;

    public y(M m6) {
        this.f23051c = m6;
    }

    @Override // q0.L
    public final v a() {
        return new x(this);
    }

    @Override // q0.L
    public final void d(List list, B b5) {
        String strValueOf;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2794g c2794g = (C2794g) it.next();
            v vVar = c2794g.f22965b;
            q5.i.c(vVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            x xVar = (x) vVar;
            Bundle bundleA = c2794g.a();
            int i = xVar.f23049l;
            if (i == 0) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i3 = xVar.f23043h;
                if (i3 != 0) {
                    strValueOf = xVar.f23038c;
                    if (strValueOf == null) {
                        strValueOf = String.valueOf(i3);
                    }
                } else {
                    strValueOf = "the root navigation";
                }
                sb.append(strValueOf);
                throw new IllegalStateException(sb.toString().toString());
            }
            v vVarH = xVar.h(i, false);
            if (vVarH == null) {
                if (xVar.f23050m == null) {
                    xVar.f23050m = String.valueOf(xVar.f23049l);
                }
                String str = xVar.f23050m;
                q5.i.b(str);
                throw new IllegalArgumentException(A.f.m("navigation destination ", str, " is not a direct child of this NavGraph"));
            }
            L lB = this.f23051c.b(vVarH.f23036a);
            C2796i c2796iB = b();
            Bundle bundleB = vVarH.b(bundleA);
            z zVar = c2796iB.f22985h;
            lB.d(a4.p.l(p1.e.a(zVar.f23055a, vVarH, bundleB, zVar.j(), zVar.f23068o)), b5);
        }
    }
}
