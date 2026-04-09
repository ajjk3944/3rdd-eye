package c9;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class a0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a0 f3385a = new a0();

    /* renamed from: d, reason: collision with root package name */
    public static final io.sentry.internal.debugmeta.c f3386d = io.sentry.internal.debugmeta.c.v("c", "v", "i", "o");

    @Override // c9.g0
    public final Object a(d9.b bVar, float f10) {
        if (bVar.V() == d9.a.BEGIN_ARRAY) {
            bVar.b();
        }
        bVar.f();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zY = false;
        while (bVar.w()) {
            int iZ = bVar.Z(f3386d);
            if (iZ == 0) {
                zY = bVar.y();
            } else if (iZ == 1) {
                arrayListC = p.c(bVar, f10);
            } else if (iZ == 2) {
                arrayListC2 = p.c(bVar, f10);
            } else if (iZ != 3) {
                bVar.f0();
                bVar.i0();
            } else {
                arrayListC3 = p.c(bVar, f10);
            }
        }
        bVar.i();
        if (bVar.V() == d9.a.END_ARRAY) {
            bVar.h();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new z8.p(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 1; i10 < size; i10++) {
            PointF pointF2 = (PointF) arrayListC.get(i10);
            int i11 = i10 - 1;
            arrayList.add(new x8.a(e9.g.a((PointF) arrayListC.get(i11), (PointF) arrayListC3.get(i11)), e9.g.a(pointF2, (PointF) arrayListC2.get(i10)), pointF2));
        }
        if (zY) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i12 = size - 1;
            arrayList.add(new x8.a(e9.g.a((PointF) arrayListC.get(i12), (PointF) arrayListC3.get(i12)), e9.g.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new z8.p(pointF, zY, arrayList);
    }
}
