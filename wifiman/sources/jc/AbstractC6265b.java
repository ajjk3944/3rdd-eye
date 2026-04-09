package jc;

import Bc.s;
import Cc.i;
import Ed.e;
import Fd.r;
import Xc.u;
import Yg.J;
import Zd.f;
import com.ui.wifiman.db.z;
import de.m;
import fe.AbstractC5814e;
import he.AbstractC5992p;
import kc.w;
import kd.AbstractC6453c;
import kotlin.jvm.internal.AbstractC6492s;
import ld.AbstractC6579f;
import md.AbstractC6801f;
import mh.InterfaceC6835l;
import nd.AbstractC6933e;
import org.kodein.di.DI;
import pd.p;
import sc.AbstractC7938e;
import wc.AbstractC8295A;

/* renamed from: jc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6265b {

    /* renamed from: a, reason: collision with root package name */
    private static final DI.g f50223a = new DI.g("model", false, null, new InterfaceC6835l() { // from class: jc.a
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return AbstractC6265b.b((DI.b) obj);
        }
    }, 6, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final J b(DI.b Module) {
        AbstractC6492s.i(Module, "$this$Module");
        DI.b.a.a(Module, z.Y(), false, 2, null);
        DI.b.a.a(Module, AbstractC5814e.i(), false, 2, null);
        DI.b.a.a(Module, AbstractC6801f.e(), false, 2, null);
        DI.b.a.a(Module, AbstractC6579f.e(), false, 2, null);
        DI.b.a.a(Module, w.S(), false, 2, null);
        DI.b.a.a(Module, u.O(), false, 2, null);
        DI.b.a.a(Module, p.E(), false, 2, null);
        DI.b.a.a(Module, e.i(), false, 2, null);
        DI.b.a.a(Module, Dc.d.g(), false, 2, null);
        DI.b.a.a(Module, i.e(), false, 2, null);
        DI.b.a.a(Module, com.ui.wifiman.model.vendor.c.e(), false, 2, null);
        DI.b.a.a(Module, m.s(), false, 2, null);
        DI.b.a.a(Module, f.k(), false, 2, null);
        DI.b.a.a(Module, s.e(), false, 2, null);
        DI.b.a.a(Module, AbstractC6453c.e(), false, 2, null);
        DI.b.a.a(Module, AbstractC5992p.E(), false, 2, null);
        DI.b.a.a(Module, AbstractC8295A.A(), false, 2, null);
        DI.b.a.a(Module, AbstractC6933e.i(), false, 2, null);
        DI.b.a.a(Module, r.I(), false, 2, null);
        DI.b.a.a(Module, AbstractC7938e.e(), false, 2, null);
        DI.b.a.a(Module, com.ui.wifiman.model.wmw.a.s(), false, 2, null);
        DI.b.a.a(Module, Ld.c.e(), false, 2, null);
        return J.f24997a;
    }

    public static final DI.g c() {
        return f50223a;
    }
}
