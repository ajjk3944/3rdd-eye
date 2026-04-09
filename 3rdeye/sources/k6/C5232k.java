package k6;

import H6.C0675l;
import N7.AbstractC1192h2;
import N7.T0;
import N7.Yb;
import i7.l;

/* compiled from: DivActionTypedDictSetValueHandler.kt */
/* renamed from: k6.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5232k implements InterfaceC5234m {
    @Override // k6.InterfaceC5234m
    public final boolean a(String str, AbstractC1192h2 action, C0675l c0675l, A7.d dVar) {
        kotlin.jvm.internal.l.f(action, "action");
        if (!(action instanceof AbstractC1192h2.h)) {
            return false;
        }
        T0 t02 = ((AbstractC1192h2.h) action).f8326b;
        String strA = t02.f6220c.a(dVar);
        String strA2 = t02.f6218a.a(dVar);
        Yb yb = t02.f6219b;
        Object objC = yb != null ? C5246y.c(yb, dVar) : null;
        l.a aVar = i7.l.f38481a;
        C5231j c5231j = new C5231j(c0675l, objC, strA2);
        aVar.getClass();
        l.a.b(c0675l, strA, dVar, c5231j);
        return true;
    }
}
