package T6;

import T.AbstractC3546o;
import T.InterfaceC3540l;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC6492s;
import mh.q;

/* loaded from: classes3.dex */
public abstract class g {
    public static final f a(q block, InterfaceC3540l interfaceC3540l, int i10) {
        AbstractC6492s.i(block, "block");
        interfaceC3540l.U(-212168686);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-212168686, i10, -1, "com.skydoves.landscapist.components.rememberImageComponent (RememberImageComponent.kt:30)");
        }
        interfaceC3540l.U(91457797);
        Object fVar = new f(AbstractC3689v.l1(new f(new ArrayList()).a()));
        block.s(fVar, interfaceC3540l, Integer.valueOf(((i10 & 14) << 3) & 112));
        interfaceC3540l.J();
        interfaceC3540l.U(-762480885);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            interfaceC3540l.K(fVar);
        } else {
            fVar = objF;
        }
        f fVar2 = (f) fVar;
        interfaceC3540l.J();
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return fVar2;
    }
}
