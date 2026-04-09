package k6;

import H6.C0675l;
import N7.AbstractC1192h2;
import N7.C1147e2;

/* compiled from: DivActionTypedTimerHandler.kt */
/* renamed from: k6.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5245x implements InterfaceC5234m {
    @Override // k6.InterfaceC5234m
    public final boolean a(String str, AbstractC1192h2 action, C0675l c0675l, A7.d dVar) {
        kotlin.jvm.internal.l.f(action, "action");
        if (!(action instanceof AbstractC1192h2.s)) {
            return false;
        }
        C1147e2 c1147e2 = ((AbstractC1192h2.s) action).f8337b;
        String strA = c1147e2.f8150b.a(dVar);
        C1147e2.a.c cVar = C1147e2.a.Converter;
        C1147e2.a obj = c1147e2.f8149a.a(dVar);
        cVar.getClass();
        kotlin.jvm.internal.l.f(obj, "obj");
        c0675l.n(strA, obj.value);
        return true;
    }
}
