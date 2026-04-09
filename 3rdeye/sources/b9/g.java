package B9;

import A9.A;
import A9.I;
import A9.K;
import A9.N;
import A9.P0;
import A9.U;
import A9.W;
import F9.q;
import f9.InterfaceC4350h;

/* compiled from: HandlerDispatcher.kt */
/* loaded from: classes3.dex */
public abstract class g extends A implements N {
    public W B0(long j4, P0 p02, InterfaceC4350h interfaceC4350h) {
        return K.f197a.B0(j4, p02, interfaceC4350h);
    }

    @Override // A9.A
    public A Q0(int i) {
        I.n(1);
        return this;
    }

    public abstract g R0();

    @Override // A9.A
    public String toString() {
        g gVarR0;
        String str;
        I9.c cVar = U.f211a;
        g gVar = q.f1782a;
        if (this == gVar) {
            str = "Dispatchers.Main";
        } else {
            try {
                gVarR0 = gVar.R0();
            } catch (UnsupportedOperationException unused) {
                gVarR0 = null;
            }
            str = this == gVarR0 ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        return getClass().getSimpleName() + '@' + I.x(this);
    }
}
