package s2;

import com.singular.sdk.internal.SingularParamsBase;
import i2.C4448h;
import java.io.IOException;
import java.util.ArrayList;
import l2.C5276i;
import t2.AbstractC5601b;
import v2.C5673a;

/* compiled from: KeyframesParser.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC5601b.a f46005a = AbstractC5601b.a.a(SingularParamsBase.Constants.IDENTIFIER_KEYSPACE_KEY);

    public static ArrayList a(AbstractC5601b abstractC5601b, C4448h c4448h, float f10, K k10, boolean z10) throws IOException {
        AbstractC5601b abstractC5601b2;
        C4448h c4448h2;
        float f11;
        K k11;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (abstractC5601b.F() == AbstractC5601b.EnumC0535b.STRING) {
            c4448h.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        abstractC5601b.c();
        while (abstractC5601b.l()) {
            if (abstractC5601b.k0(f46005a) != 0) {
                abstractC5601b.p0();
            } else if (abstractC5601b.F() == AbstractC5601b.EnumC0535b.BEGIN_ARRAY) {
                abstractC5601b.a();
                if (abstractC5601b.F() == AbstractC5601b.EnumC0535b.NUMBER) {
                    AbstractC5601b abstractC5601b3 = abstractC5601b;
                    C4448h c4448h3 = c4448h;
                    float f12 = f10;
                    K k12 = k10;
                    boolean z12 = z10;
                    C5673a c5673aB = s.b(abstractC5601b3, c4448h3, f12, k12, false, z12);
                    abstractC5601b2 = abstractC5601b3;
                    c4448h2 = c4448h3;
                    f11 = f12;
                    k11 = k12;
                    z11 = z12;
                    arrayList.add(c5673aB);
                } else {
                    abstractC5601b2 = abstractC5601b;
                    c4448h2 = c4448h;
                    f11 = f10;
                    k11 = k10;
                    z11 = z10;
                    while (abstractC5601b2.l()) {
                        arrayList.add(s.b(abstractC5601b2, c4448h2, f11, k11, true, z11));
                    }
                }
                abstractC5601b2.d();
                abstractC5601b = abstractC5601b2;
                c4448h = c4448h2;
                f10 = f11;
                k10 = k11;
                z10 = z11;
            } else {
                AbstractC5601b abstractC5601b4 = abstractC5601b;
                arrayList.add(s.b(abstractC5601b4, c4448h, f10, k10, false, z10));
                abstractC5601b = abstractC5601b4;
            }
        }
        abstractC5601b.e();
        b(arrayList);
        return arrayList;
    }

    public static void b(ArrayList arrayList) {
        int i;
        T t10;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            i = size - 1;
            if (i10 >= i) {
                break;
            }
            C5673a c5673a = (C5673a) arrayList.get(i10);
            i10++;
            C5673a c5673a2 = (C5673a) arrayList.get(i10);
            c5673a.f47018h = Float.valueOf(c5673a2.f47017g);
            if (c5673a.f47013c == 0 && (t10 = c5673a2.f47012b) != 0) {
                c5673a.f47013c = t10;
                if (c5673a instanceof C5276i) {
                    ((C5276i) c5673a).d();
                }
            }
        }
        C5673a c5673a3 = (C5673a) arrayList.get(i);
        if ((c5673a3.f47012b == 0 || c5673a3.f47013c == 0) && arrayList.size() > 1) {
            arrayList.remove(c5673a3);
        }
    }
}
