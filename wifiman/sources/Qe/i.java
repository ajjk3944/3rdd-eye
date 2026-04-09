package Qe;

import Qe.c;
import T.AbstractC3546o;
import T.AbstractC3561w;
import T.H0;
import T.InterfaceC3540l;
import T.InterfaceC3551q0;
import T.t1;
import T.z1;
import Yg.z;
import Zg.U;
import c0.AbstractC4173b;
import c0.AbstractC4174c;
import c0.InterfaceC4182k;
import c0.InterfaceC4184m;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    private static final H0 f19320a = AbstractC3561w.f(new InterfaceC6824a() { // from class: Qe.f
        @Override // mh.InterfaceC6824a
        public final Object invoke() {
            return i.e();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final d e() {
        throw new IllegalStateException("No WifimanRootController set");
    }

    public static final H0 f() {
        return f19320a;
    }

    public static final z1 g(InterfaceC3540l interfaceC3540l, int i10) {
        interfaceC3540l.U(-1937041468);
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1937041468, i10, -1, "com.ui.wifiman.ui.root.rememberWifimanRootController (WifimanRootController.kt:92)");
        }
        Object[] objArr = new Object[0];
        InterfaceC4182k interfaceC4182kI = i();
        interfaceC3540l.U(-1250468340);
        Object objF = interfaceC3540l.f();
        if (objF == InterfaceC3540l.f21100a.a()) {
            objF = new InterfaceC6824a() { // from class: Qe.e
                @Override // mh.InterfaceC6824a
                public final Object invoke() {
                    return i.h();
                }
            };
            interfaceC3540l.K(objF);
        }
        interfaceC3540l.J();
        InterfaceC3551q0 interfaceC3551q0D = AbstractC4174c.d(objArr, interfaceC4182kI, null, (InterfaceC6824a) objF, interfaceC3540l, 3072, 4);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        interfaceC3540l.J();
        return interfaceC3551q0D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC3551q0 h() {
        return t1.d(new b(null, 1, null), null, 2, null);
    }

    private static final InterfaceC4182k i() {
        final String str = "tab";
        return AbstractC4173b.a(new InterfaceC6839p() { // from class: Qe.g
            @Override // mh.InterfaceC6839p
            public final Object invoke(Object obj, Object obj2) {
                return i.j(str, (InterfaceC4184m) obj, (b) obj2);
            }
        }, new InterfaceC6835l() { // from class: Qe.h
            @Override // mh.InterfaceC6835l
            public final Object invoke(Object obj) {
                return i.k(str, (Map) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map j(String str, InterfaceC4184m mapSaver, b it) {
        AbstractC6492s.i(mapSaver, "$this$mapSaver");
        AbstractC6492s.i(it, "it");
        return U.e(z.a(str, it.k().name()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b k(String str, Map it) {
        AbstractC6492s.i(it, "it");
        Object obj = it.get(str);
        AbstractC6492s.g(obj, "null cannot be cast to non-null type kotlin.String");
        return new b(c.a.valueOf((String) obj));
    }
}
