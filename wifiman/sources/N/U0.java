package N;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.o1;
import T.z1;
import m0.C6733v0;
import m0.j1;
import r.AbstractC7521c;
import r.AbstractC7535j;
import s.C7846g;
import y.AbstractC8551f;
import y.InterfaceC8556k;

/* loaded from: classes.dex */
public abstract class U0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final z1 b(boolean z10, boolean z11, InterfaceC8556k interfaceC8556k, S0 s02, float f10, float f11, InterfaceC3540l interfaceC3540l, int i10) {
        z1 z1VarN;
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(1097899920, i10, -1, "androidx.compose.material.animateBorderStrokeAsState (TextFieldDefaults.kt:982)");
        }
        z1 z1VarA = AbstractC8551f.a(interfaceC8556k, interfaceC3540l, (i10 >> 6) & 14);
        z1 z1VarE = s02.e(z10, z11, interfaceC8556k, interfaceC3540l, i10 & 8190);
        float f12 = c(z1VarA) ? f10 : f11;
        if (z10) {
            interfaceC3540l.U(772641254);
            z1VarN = AbstractC7521c.c(f12, AbstractC7535j.l(150, 0, null, 6, null), null, null, interfaceC3540l, 48, 12);
            interfaceC3540l.J();
        } else {
            interfaceC3540l.U(772737540);
            z1VarN = o1.n(Y0.h.d(f11), interfaceC3540l, (i10 >> 15) & 14);
            interfaceC3540l.J();
        }
        z1 z1VarN2 = o1.n(new C7846g(((Y0.h) z1VarN.getValue()).s(), new j1(((C6733v0) z1VarE.getValue()).u(), null), null), interfaceC3540l, 0);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return z1VarN2;
    }

    private static final boolean c(z1 z1Var) {
        return ((Boolean) z1Var.getValue()).booleanValue();
    }
}
