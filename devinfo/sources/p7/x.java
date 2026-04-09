package p7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class x implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final x f31449a = new x();

    /* renamed from: b, reason: collision with root package name */
    public static final km.n f31450b = km.n.q("c", "v", "i", "o");

    @Override // p7.d0
    public final Object b(q7.a aVar, float f10) {
        if (aVar.F() == 1) {
            aVar.c();
        }
        aVar.e();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zW = false;
        while (aVar.v()) {
            int iL = aVar.L(f31450b);
            if (iL == 0) {
                zW = aVar.w();
            } else if (iL == 1) {
                arrayListC = n.c(aVar, f10);
            } else if (iL == 2) {
                arrayListC2 = n.c(aVar, f10);
            } else if (iL != 3) {
                aVar.N();
                aVar.O();
            } else {
                arrayListC3 = n.c(aVar, f10);
            }
        }
        aVar.m();
        if (aVar.F() == 2) {
            aVar.g();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new m7.k(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 1; i4 < size; i4++) {
            PointF pointF2 = (PointF) arrayListC.get(i4);
            int i10 = i4 - 1;
            arrayList.add(new k7.a(r7.h.a((PointF) arrayListC.get(i10), (PointF) arrayListC3.get(i10)), r7.h.a(pointF2, (PointF) arrayListC2.get(i4)), pointF2));
        }
        if (zW) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i11 = size - 1;
            arrayList.add(new k7.a(r7.h.a((PointF) arrayListC.get(i11), (PointF) arrayListC3.get(i11)), r7.h.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new m7.k(pointF, zW, arrayList);
    }
}
