package a7;

import a7.g;
import java.util.ArrayList;

/* compiled from: LocalFunctionProvider.kt */
/* loaded from: classes.dex */
public final class q implements k {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14233b;

    public q(ArrayList arrayList) {
        this.f14233b = arrayList;
    }

    public final g a(String str, p9.l<? super g, ? extends g.b> lVar) {
        ArrayList arrayList = this.f14233b;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            g gVar = (g) obj;
            if (kotlin.jvm.internal.l.b(gVar.c(), str) && kotlin.jvm.internal.l.b(lVar.invoke(gVar), g.b.c.f14222a)) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (g) arrayList2.get(0);
        }
        throw new C1665b(null, "Function " + arrayList2.get(0) + " declared multiple times.");
    }

    @Override // a7.k
    public final g d(String str, ArrayList arrayList) {
        g gVarA = a(str, new o(arrayList));
        if (gVarA != null) {
            return gVarA;
        }
        g gVarA2 = a(str, new p(arrayList));
        if (gVarA2 != null) {
            return gVarA2;
        }
        throw new r(str, arrayList);
    }

    @Override // a7.k
    public final g e(String str, ArrayList arrayList) {
        g gVarA = a(str, new m(arrayList));
        if (gVarA != null) {
            return gVarA;
        }
        g gVarA2 = a(str, new n(arrayList));
        if (gVarA2 != null) {
            return gVarA2;
        }
        throw new r(str, arrayList);
    }
}
