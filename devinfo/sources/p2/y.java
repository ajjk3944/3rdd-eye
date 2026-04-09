package p2;

import c2.l0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator[] f31144a;

    /* renamed from: b, reason: collision with root package name */
    public static final j f31145b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i4 = 0;
        while (i4 < 2) {
            comparatorArr[i4] = new com.liuzh.deviceinfo.utilities.n(new com.liuzh.deviceinfo.utilities.n(i4 == 0 ? f.f31045c : f.f31044b));
            i4++;
        }
        f31144a = comparatorArr;
        f31145b = j.f31069t;
    }

    public static final void a(p pVar, ArrayList arrayList, l0 l0Var, l0 l0Var2, x.u uVar) {
        l lVar = pVar.f31104d;
        Object objG = lVar.f31095a.g(t.f31124m);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) l0Var2.invoke(pVar)).booleanValue()) && ((Boolean) l0Var.invoke(pVar)).booleanValue()) {
            arrayList.add(pVar);
        }
        if (zBooleanValue) {
            uVar.h(pVar.g, b(pVar, l0Var, l0Var2, p.j(7, pVar)));
            return;
        }
        List listJ = p.j(7, pVar);
        int size = listJ.size();
        for (int i4 = 0; i4 < size; i4++) {
            a((p) listJ.get(i4), arrayList, l0Var, l0Var2, uVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList b(p2.p r18, c2.l0 r19, c2.l0 r20, java.util.List r21) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.y.b(p2.p, c2.l0, c2.l0, java.util.List):java.util.ArrayList");
    }
}
