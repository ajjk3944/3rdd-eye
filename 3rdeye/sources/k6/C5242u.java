package k6;

import H6.C0675l;
import N7.AbstractC1192h2;
import N7.K1;
import i7.l;

/* compiled from: DivActionTypedSetVariableHandler.kt */
/* renamed from: k6.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5242u implements InterfaceC5234m {
    @Override // k6.InterfaceC5234m
    public final boolean a(String str, AbstractC1192h2 action, C0675l c0675l, A7.d dVar) {
        kotlin.jvm.internal.l.f(action, "action");
        if (!(action instanceof AbstractC1192h2.p)) {
            return false;
        }
        K1 k12 = ((AbstractC1192h2.p) action).f8334b;
        String strA = k12.f5613b.a(dVar);
        Object objC = C5246y.c(k12.f5612a, dVar);
        l.a aVar = i7.l.f38481a;
        C5241t c5241t = new C5241t(this, objC, c0675l, strA);
        aVar.getClass();
        l.a.b(c0675l, strA, dVar, c5241t);
        return true;
    }
}
