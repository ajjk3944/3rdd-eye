package k6;

import H6.C0675l;
import N7.AbstractC1192h2;
import N7.AbstractC1373u1;
import N7.C1331r1;
import N7.C1443z1;
import N7.H9;
import R6.e;

/* compiled from: DivActionTypedScrollHandler.kt */
/* renamed from: k6.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5238q implements InterfaceC5234m {
    @Override // k6.InterfaceC5234m
    public final boolean a(String str, AbstractC1192h2 action, C0675l c0675l, A7.d dVar) {
        kotlin.jvm.internal.l.f(action, "action");
        if (action instanceof AbstractC1192h2.l) {
            C1331r1 c1331r1 = ((AbstractC1192h2.l) action).f8330b;
            String strA = c1331r1.f9011b.a(dVar);
            int iLongValue = (int) c1331r1.f9013d.a(dVar).longValue();
            int iLongValue2 = (int) c1331r1.f9012c.a(dVar).longValue();
            C1331r1.a.c cVar = C1331r1.a.Converter;
            C1331r1.a obj = c1331r1.f9014e.a(dVar);
            cVar.getClass();
            kotlin.jvm.internal.l.f(obj, "obj");
            String str2 = obj.value;
            boolean zBooleanValue = c1331r1.f9010a.a(dVar).booleanValue();
            R6.e eVarA = e.a.a(strA, c0675l, dVar, R6.a.NEXT);
            if (eVarA != null) {
                eVarA.a(str2, iLongValue2, zBooleanValue);
                eVarA.c(str2, iLongValue, zBooleanValue);
                return true;
            }
        } else {
            if (!(action instanceof AbstractC1192h2.m)) {
                return false;
            }
            C1443z1 c1443z1 = ((AbstractC1192h2.m) action).f8331b;
            String strA2 = c1443z1.f10000c.a(dVar);
            boolean zBooleanValue2 = c1443z1.f9998a.a(dVar).booleanValue();
            R6.e eVarA2 = e.a.a(strA2, c0675l, dVar, R6.a.NEXT);
            if (eVarA2 != null) {
                AbstractC1373u1 abstractC1373u1 = c1443z1.f9999b;
                boolean z10 = abstractC1373u1 instanceof AbstractC1373u1.c;
                R6.d dVar2 = eVarA2.f11744a;
                if (z10) {
                    dVar2.f((int) ((AbstractC1373u1.c) abstractC1373u1).f9361b.f8251a.a(dVar).longValue(), H9.DP, zBooleanValue2);
                    return true;
                }
                if (abstractC1373u1 instanceof AbstractC1373u1.b) {
                    eVarA2.d((int) ((AbstractC1373u1.b) abstractC1373u1).f9360b.f5434a.a(dVar).longValue(), zBooleanValue2);
                    return true;
                }
                if (abstractC1373u1 instanceof AbstractC1373u1.a) {
                    dVar2.g(zBooleanValue2);
                    return true;
                }
                if (abstractC1373u1 instanceof AbstractC1373u1.d) {
                    eVarA2.d(0, zBooleanValue2);
                }
            }
        }
        return true;
    }
}
