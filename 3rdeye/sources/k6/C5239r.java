package k6;

import H6.C0675l;
import N7.AbstractC1192h2;
import N7.C1;
import z6.C5865d;

/* compiled from: DivActionTypedSetStateHandler.kt */
/* renamed from: k6.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5239r implements InterfaceC5234m {
    @Override // k6.InterfaceC5234m
    public final boolean a(String str, AbstractC1192h2 action, C0675l c0675l, A7.d dVar) {
        kotlin.jvm.internal.l.f(action, "action");
        if (!(action instanceof AbstractC1192h2.n)) {
            return false;
        }
        C1 c12 = ((AbstractC1192h2.n) action).f8332b;
        String strA = c12.f5007a.a(dVar);
        try {
            c0675l.f(C5865d.a.b(strA), c12.f5008b.a(dVar).booleanValue());
            return true;
        } catch (z6.h e4) {
            C5246y.d(c0675l, new IllegalArgumentException(androidx.work.s.d("Invalid format of ", strA), e4));
            return true;
        }
    }
}
