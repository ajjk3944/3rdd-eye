package or;

import com.google.android.gms.internal.measurement.e5;
import ht.d1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import rr.u;
import rr.z;
import ur.b0;
import ur.o0;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f19726a;

    static {
        kt.k kVar = kt.k.f14520a;
        qr.o oVar = new qr.o(kt.k.f14521b, o.f19717e, 1);
        rr.g gVar = rr.g.INTERFACE;
        qs.g gVarF = o.f19718f.f();
        gt.b bVar = gt.l.f9657e;
        b0 b0Var = new b0(oVar, gVar, gVarF, bVar);
        z zVar = z.ABSTRACT;
        if (zVar == null) {
            b0.J(6);
            throw null;
        }
        b0Var.D = zVar;
        as.p pVar = rr.p.f21701e;
        if (pVar == null) {
            b0.J(9);
            throw null;
        }
        b0Var.E = pVar;
        List listH = e5.H(o0.y1(b0Var, d1.IN_VARIANCE, qs.g.e("T"), 0, bVar));
        if (b0Var.G != null) {
            throw new IllegalStateException("Type parameters are already set for " + b0Var.getName());
        }
        ArrayList arrayList = new ArrayList(listH);
        b0Var.G = arrayList;
        b0Var.F = new ht.k(b0Var, arrayList, b0Var.H, b0Var.I);
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            b0.J(13);
            throw null;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ur.j) ((u) it.next())).D = b0Var.q();
        }
        f19726a = b0Var;
    }
}
