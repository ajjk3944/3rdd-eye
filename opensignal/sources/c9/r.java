package c9;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3432a = io.sentry.internal.debugmeta.c.v("k");

    public static ArrayList a(d9.b bVar, r8.h hVar, float f10, g0 g0Var, boolean z10) {
        d9.b bVar2;
        r8.h hVar2;
        float f11;
        g0 g0Var2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (bVar.V() == d9.a.STRING) {
            hVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        bVar.f();
        while (bVar.w()) {
            if (bVar.Z(f3432a) != 0) {
                bVar.i0();
            } else if (bVar.V() == d9.a.BEGIN_ARRAY) {
                bVar.b();
                if (bVar.V() == d9.a.NUMBER) {
                    d9.b bVar3 = bVar;
                    r8.h hVar3 = hVar;
                    float f12 = f10;
                    g0 g0Var3 = g0Var;
                    boolean z12 = z10;
                    f9.a aVarB = q.b(bVar3, hVar3, f12, g0Var3, false, z12);
                    bVar2 = bVar3;
                    hVar2 = hVar3;
                    f11 = f12;
                    g0Var2 = g0Var3;
                    z11 = z12;
                    arrayList.add(aVarB);
                } else {
                    bVar2 = bVar;
                    hVar2 = hVar;
                    f11 = f10;
                    g0Var2 = g0Var;
                    z11 = z10;
                    while (bVar2.w()) {
                        arrayList.add(q.b(bVar2, hVar2, f11, g0Var2, true, z11));
                    }
                }
                bVar2.h();
                bVar = bVar2;
                hVar = hVar2;
                f10 = f11;
                g0Var = g0Var2;
                z10 = z11;
            } else {
                d9.b bVar4 = bVar;
                arrayList.add(q.b(bVar4, hVar, f10, g0Var, false, z10));
                bVar = bVar4;
            }
        }
        bVar.i();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i10;
        Object obj;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            f9.a aVar = (f9.a) arrayList.get(i11);
            i11++;
            f9.a aVar2 = (f9.a) arrayList.get(i11);
            aVar.f8711h = Float.valueOf(aVar2.f8710g);
            if (aVar.f8706c == null && (obj = aVar2.f8705b) != null) {
                aVar.f8706c = obj;
                if (aVar instanceof u8.k) {
                    ((u8.k) aVar).d();
                }
            }
        }
        f9.a aVar3 = (f9.a) arrayList.get(i10);
        if ((aVar3.f8705b == null || aVar3.f8706c == null) && arrayList.size() > 1) {
            arrayList.remove(aVar3);
        }
    }
}
