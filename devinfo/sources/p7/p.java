package p7;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final km.n f31436a = km.n.q("k");

    public static ArrayList a(q7.a aVar, f7.j jVar, float f10, d0 d0Var, boolean z3) {
        q7.a aVar2;
        f7.j jVar2;
        float f11;
        d0 d0Var2;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (aVar.F() == 6) {
            jVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        aVar.e();
        while (aVar.v()) {
            if (aVar.L(f31436a) != 0) {
                aVar.O();
            } else if (aVar.F() == 1) {
                aVar.c();
                if (aVar.F() == 7) {
                    q7.a aVar3 = aVar;
                    f7.j jVar3 = jVar;
                    float f12 = f10;
                    d0 d0Var3 = d0Var;
                    boolean z11 = z3;
                    s7.a aVarB = o.b(aVar3, jVar3, f12, d0Var3, false, z11);
                    aVar2 = aVar3;
                    jVar2 = jVar3;
                    f11 = f12;
                    d0Var2 = d0Var3;
                    z10 = z11;
                    arrayList.add(aVarB);
                } else {
                    aVar2 = aVar;
                    jVar2 = jVar;
                    f11 = f10;
                    d0Var2 = d0Var;
                    z10 = z3;
                    while (aVar2.v()) {
                        arrayList.add(o.b(aVar2, jVar2, f11, d0Var2, true, z10));
                    }
                }
                aVar2.g();
                aVar = aVar2;
                jVar = jVar2;
                f10 = f11;
                d0Var = d0Var2;
                z3 = z10;
            } else {
                q7.a aVar4 = aVar;
                arrayList.add(o.b(aVar4, jVar, f10, d0Var, false, z3));
                aVar = aVar4;
            }
        }
        aVar.m();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i4;
        Object obj;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            i4 = size - 1;
            if (i10 >= i4) {
                break;
            }
            s7.a aVar = (s7.a) arrayList.get(i10);
            i10++;
            s7.a aVar2 = (s7.a) arrayList.get(i10);
            aVar.f33489h = Float.valueOf(aVar2.g);
            if (aVar.f33485c == null && (obj = aVar2.f33484b) != null) {
                aVar.f33485c = obj;
                if (aVar instanceof i7.l) {
                    ((i7.l) aVar).d();
                }
            }
        }
        s7.a aVar3 = (s7.a) arrayList.get(i4);
        if ((aVar3.f33484b == null || aVar3.f33485c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
