package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class xu0 implements o41 {
    public static final xu0 f = new xu0();
    public static final l92 g = l92.D("c", "v", "i", "o");

    @Override // defpackage.o41
    public final Object k(i40 i40Var, float f2) {
        if (i40Var.o() == 1) {
            i40Var.a();
        }
        i40Var.c();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zK = false;
        while (i40Var.i()) {
            int iQ = i40Var.q(g);
            if (iQ == 0) {
                zK = i40Var.k();
            } else if (iQ == 1) {
                arrayListC = k40.c(i40Var, f2);
            } else if (iQ == 2) {
                arrayListC2 = k40.c(i40Var, f2);
            } else if (iQ != 3) {
                i40Var.r();
                i40Var.s();
            } else {
                arrayListC3 = k40.c(i40Var, f2);
            }
        }
        i40Var.g();
        if (i40Var.o() == 2) {
            i40Var.f();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new wu0(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new yk(te0.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), te0.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zK) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new yk(te0.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), te0.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new wu0(pointF, zK, arrayList);
    }
}
