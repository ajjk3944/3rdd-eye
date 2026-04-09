package k6;

import H6.C0675l;
import N7.AbstractC1192h2;
import N7.P1;

/* compiled from: DivActionTypedShowTooltipHandler.kt */
/* renamed from: k6.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5243v implements InterfaceC5234m {
    @Override // k6.InterfaceC5234m
    public final boolean a(String str, AbstractC1192h2 action, C0675l c0675l, A7.d dVar) {
        kotlin.jvm.internal.l.f(action, "action");
        if (!(action instanceof AbstractC1192h2.q)) {
            return false;
        }
        P1 p12 = ((AbstractC1192h2.q) action).f8335b;
        String strA = p12.f6000a.a(dVar);
        A7.b<Boolean> bVar = p12.f6001b;
        Boolean boolA = bVar != null ? bVar.a(dVar) : null;
        if (boolA != null) {
            c0675l.a(strA, boolA.booleanValue());
            return true;
        }
        c0675l.H(strA);
        return true;
    }
}
