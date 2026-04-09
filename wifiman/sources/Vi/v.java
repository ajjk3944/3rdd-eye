package Vi;

import Zi.A0;
import Zi.AbstractC3722o;
import Zi.InterfaceC3744z0;
import Zi.S0;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes4.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private static final S0 f23466a = AbstractC3722o.a(new InterfaceC6835l() { // from class: Vi.p
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return v.k((th.d) obj);
        }
    });

    /* renamed from: b, reason: collision with root package name */
    private static final S0 f23467b = AbstractC3722o.a(new InterfaceC6835l() { // from class: Vi.q
        @Override // mh.InterfaceC6835l
        public final Object invoke(Object obj) {
            return v.l((th.d) obj);
        }
    });

    /* renamed from: c, reason: collision with root package name */
    private static final InterfaceC3744z0 f23468c = AbstractC3722o.b(new InterfaceC6839p() { // from class: Vi.r
        @Override // mh.InterfaceC6839p
        public final Object invoke(Object obj, Object obj2) {
            return v.g((th.d) obj, (List) obj2);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC3744z0 f23469d = AbstractC3722o.b(new InterfaceC6839p() { // from class: Vi.s
        @Override // mh.InterfaceC6839p
        public final Object invoke(Object obj, Object obj2) {
            return v.i((th.d) obj, (List) obj2);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final b g(th.d clazz, final List types) {
        AbstractC6492s.i(clazz, "clazz");
        AbstractC6492s.i(types, "types");
        List listI = w.i(cj.g.a(), types, true);
        AbstractC6492s.f(listI);
        return w.a(clazz, listI, new InterfaceC6824a() { // from class: Vi.t
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return v.h(types);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final th.e h(List list) {
        return ((th.p) list.get(0)).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b i(th.d clazz, final List types) {
        b bVarU;
        AbstractC6492s.i(clazz, "clazz");
        AbstractC6492s.i(types, "types");
        List listI = w.i(cj.g.a(), types, true);
        AbstractC6492s.f(listI);
        b bVarA = w.a(clazz, listI, new InterfaceC6824a() { // from class: Vi.u
            @Override // mh.InterfaceC6824a
            public final Object invoke() {
                return v.j(types);
            }
        });
        if (bVarA == null || (bVarU = Wi.a.u(bVarA)) == null) {
            return null;
        }
        return bVarU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final th.e j(List list) {
        return ((th.p) list.get(0)).r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b k(th.d it) {
        AbstractC6492s.i(it, "it");
        b bVarH = w.h(it);
        if (bVarH != null) {
            return bVarH;
        }
        if (A0.l(it)) {
            return new f(it);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b l(th.d it) {
        b bVarU;
        AbstractC6492s.i(it, "it");
        b bVarH = w.h(it);
        if (bVarH == null) {
            bVarH = A0.l(it) ? new f(it) : null;
        }
        if (bVarH == null || (bVarU = Wi.a.u(bVarH)) == null) {
            return null;
        }
        return bVarU;
    }

    public static final b m(th.d clazz, boolean z10) {
        AbstractC6492s.i(clazz, "clazz");
        if (z10) {
            return f23467b.a(clazz);
        }
        b bVarA = f23466a.a(clazz);
        if (bVarA != null) {
            return bVarA;
        }
        return null;
    }

    public static final Object n(th.d clazz, List types, boolean z10) {
        AbstractC6492s.i(clazz, "clazz");
        AbstractC6492s.i(types, "types");
        return !z10 ? f23468c.a(clazz, types) : f23469d.a(clazz, types);
    }
}
