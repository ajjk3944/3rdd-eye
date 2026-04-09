package k6;

import H6.C0675l;
import K6.C0748o0;
import N7.AbstractC1192h2;
import N7.C1303p0;
import N7.C1372u0;
import N7.C1442z0;
import i7.l;

/* compiled from: DivActionTypedArrayMutationHandler.kt */
/* renamed from: k6.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5226e implements InterfaceC5234m {
    @Override // k6.InterfaceC5234m
    public final boolean a(String str, AbstractC1192h2 action, C0675l c0675l, A7.d dVar) {
        kotlin.jvm.internal.l.f(action, "action");
        if (action instanceof AbstractC1192h2.c) {
            C1303p0 c1303p0 = ((AbstractC1192h2.c) action).f8321b;
            String strA = c1303p0.f8884c.a(dVar);
            A7.b<Long> bVar = c1303p0.f8882a;
            C0748o0 c0748o0 = new C0748o0(bVar != null ? Integer.valueOf((int) bVar.a(dVar).longValue()) : null, c0675l, strA, C5246y.c(c1303p0.f8883b, dVar), 6);
            l.a aVar = i7.l.f38481a;
            C5227f c5227f = new C5227f(c0675l, c0748o0);
            aVar.getClass();
            l.a.b(c0675l, strA, dVar, c5227f);
            return true;
        }
        if (action instanceof AbstractC1192h2.d) {
            C1372u0 c1372u0 = ((AbstractC1192h2.d) action).f8322b;
            String strA2 = c1372u0.f9356b.a(dVar);
            C5223b c5223b = new C5223b((int) c1372u0.f9355a.a(dVar).longValue(), c0675l, strA2);
            l.a aVar2 = i7.l.f38481a;
            C5227f c5227f2 = new C5227f(c0675l, c5223b);
            aVar2.getClass();
            l.a.b(c0675l, strA2, dVar, c5227f2);
            return true;
        }
        if (!(action instanceof AbstractC1192h2.e)) {
            return false;
        }
        C1442z0 c1442z0 = ((AbstractC1192h2.e) action).f8323b;
        String strA3 = c1442z0.f9996c.a(dVar);
        C5225d c5225d = new C5225d((int) c1442z0.f9994a.a(dVar).longValue(), c0675l, strA3, C5246y.c(c1442z0.f9995b, dVar));
        l.a aVar3 = i7.l.f38481a;
        C5227f c5227f3 = new C5227f(c0675l, c5225d);
        aVar3.getClass();
        l.a.b(c0675l, strA3, dVar, c5227f3);
        return true;
    }
}
