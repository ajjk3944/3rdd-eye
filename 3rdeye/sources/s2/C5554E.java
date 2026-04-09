package s2;

import android.graphics.PointF;
import com.singular.sdk.internal.SingularParamsBase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import n2.C5347a;
import t2.AbstractC5601b;
import u2.C5628g;

/* compiled from: ShapeDataParser.java */
/* renamed from: s2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5554E implements K<p2.n> {

    /* renamed from: a, reason: collision with root package name */
    public static final C5554E f45961a = new C5554E();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC5601b.a f45962b = AbstractC5601b.a.a("c", "v", SingularParamsBase.Constants.PACKAGE_NAME_KEY, "o");

    @Override // s2.K
    public final p2.n a(AbstractC5601b abstractC5601b, float f10) throws IOException {
        if (abstractC5601b.F() == AbstractC5601b.EnumC0535b.BEGIN_ARRAY) {
            abstractC5601b.a();
        }
        abstractC5601b.c();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zN = false;
        while (abstractC5601b.l()) {
            int iK0 = abstractC5601b.k0(f45962b);
            if (iK0 == 0) {
                zN = abstractC5601b.n();
            } else if (iK0 == 1) {
                arrayListC = r.c(abstractC5601b, f10);
            } else if (iK0 == 2) {
                arrayListC2 = r.c(abstractC5601b, f10);
            } else if (iK0 != 3) {
                abstractC5601b.m0();
                abstractC5601b.p0();
            } else {
                arrayListC3 = r.c(abstractC5601b, f10);
            }
        }
        abstractC5601b.e();
        if (abstractC5601b.F() == AbstractC5601b.EnumC0535b.END_ARRAY) {
            abstractC5601b.d();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (arrayListC.isEmpty()) {
            return new p2.n(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i10 = i - 1;
            arrayList.add(new C5347a(C5628g.a((PointF) arrayListC.get(i10), (PointF) arrayListC3.get(i10)), C5628g.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zN) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i11 = size - 1;
            arrayList.add(new C5347a(C5628g.a((PointF) arrayListC.get(i11), (PointF) arrayListC3.get(i11)), C5628g.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new p2.n(pointF, zN, arrayList);
    }
}
