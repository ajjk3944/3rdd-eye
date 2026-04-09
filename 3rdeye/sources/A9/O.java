package A9;

import b9.C1992A;
import f9.InterfaceC4347e;
import f9.InterfaceC4348f;
import f9.InterfaceC4350h;

/* compiled from: Delay.kt */
/* loaded from: classes3.dex */
public final class O {
    public static final Object a(long j4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        if (j4 <= 0) {
            return C1992A.f18074a;
        }
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
        c0583j.s();
        if (j4 < Long.MAX_VALUE) {
            b(c0583j.f253f).y0(j4, c0583j);
        }
        Object objR = c0583j.r();
        return objR == g9.a.COROUTINE_SUSPENDED ? objR : C1992A.f18074a;
    }

    public static final N b(InterfaceC4350h interfaceC4350h) {
        InterfaceC4350h.a aVar = interfaceC4350h.get(InterfaceC4348f.a.f37870b);
        N n9 = aVar instanceof N ? (N) aVar : null;
        return n9 == null ? K.f197a : n9;
    }
}
