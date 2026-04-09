package e7;

import b7.a0;
import b7.i;
import b7.l;
import b7.n;
import b7.r;
import com.google.android.gms.internal.measurement.d5;
import java.util.Iterator;
import java.util.List;
import nk.k;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22445a;

    static {
        String strG = v.g("DiagnosticsWrkr");
        k.d(strG, "tagWithPrefix(...)");
        f22445a = strG;
    }

    public static final String a(n nVar, a0 a0Var, b7.k kVar, List list) {
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            l lVarH = d5.h(rVar);
            String str = rVar.f2030a;
            i iVarA = kVar.a(lVarH);
            Integer numValueOf = iVarA != null ? Integer.valueOf(iVarA.f2001c) : null;
            nVar.getClass();
            k.e(str, "workSpecId");
            String strG0 = zj.n.g0((List) com.bumptech.glide.f.r(nVar.f2009a, true, false, new b7.c(str, 4)), ",", null, null, null, 62);
            a0Var.getClass();
            String strG02 = zj.n.g0((List) com.bumptech.glide.f.r(a0Var.f1970a, true, false, new b7.c(str, 14)), ",", null, null, null, 62);
            StringBuilder sbA = d.h.A("\n", str, "\t ");
            sbA.append(rVar.f2032c);
            sbA.append("\t ");
            sbA.append(numValueOf);
            sbA.append("\t ");
            sbA.append(rVar.f2031b.name());
            sbA.append("\t ");
            sbA.append(strG0);
            sbA.append("\t ");
            sbA.append(strG02);
            sbA.append('\t');
            sb2.append(sbA.toString());
        }
        return sb2.toString();
    }
}
