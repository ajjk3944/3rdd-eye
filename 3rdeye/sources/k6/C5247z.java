package k6;

import H6.C0675l;
import N7.AbstractC1192h2;
import N7.C1263m2;

/* compiled from: DivActionTypedVideoHandler.kt */
/* renamed from: k6.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5247z implements InterfaceC5234m {
    @Override // k6.InterfaceC5234m
    public final boolean a(String str, AbstractC1192h2 action, C0675l c0675l, A7.d dVar) {
        kotlin.jvm.internal.l.f(action, "action");
        if (!(action instanceof AbstractC1192h2.t)) {
            return false;
        }
        C1263m2 c1263m2 = ((AbstractC1192h2.t) action).f8338b;
        String strA = c1263m2.f8748b.a(dVar);
        C1263m2.a.c cVar = C1263m2.a.Converter;
        C1263m2.a obj = c1263m2.f8747a.a(dVar);
        cVar.getClass();
        kotlin.jvm.internal.l.f(obj, "obj");
        c0675l.o(strA, obj.value, dVar);
        return true;
    }
}
