package androidx.compose.ui.platform;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public abstract class A {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29095a = new a();

        a() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        @Override // mh.InterfaceC6835l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Boolean invoke(E0.G r3) {
            /*
                r2 = this;
                J0.j r3 = r3.I()
                if (r3 == 0) goto L1a
                boolean r0 = r3.u()
                r1 = 1
                if (r0 != r1) goto L1a
                J0.q r0 = J0.q.f9676a
                J0.v r0 = r0.g()
                boolean r3 = r3.f(r0)
                if (r3 == 0) goto L1a
                goto L1b
            L1a:
                r1 = 0
            L1b:
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.A.a.invoke(E0.G):java.lang.Boolean");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(J0.a aVar, Object obj) {
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof J0.a)) {
            return false;
        }
        J0.a aVar2 = (J0.a) obj;
        if (!AbstractC6492s.d(aVar.b(), aVar2.b())) {
            return false;
        }
        if (aVar.a() != null || aVar2.a() == null) {
            return aVar.a() == null || aVar2.a() != null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(J0.n nVar) {
        return !nVar.n().f(J0.q.f9676a.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(J0.n nVar) {
        J0.j jVarW = nVar.w();
        J0.q qVar = J0.q.f9676a;
        if (jVarW.f(qVar.g()) && !AbstractC6492s.d(J0.k.a(nVar.w(), qVar.i()), Boolean.TRUE)) {
            return true;
        }
        E0.G gJ = j(nVar.q(), a.f29095a);
        if (gJ != null) {
            J0.j jVarI = gJ.I();
            if (!(jVarI != null ? AbstractC6492s.d(J0.k.a(jVarI, qVar.i()), Boolean.TRUE) : false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E0.G j(E0.G g10, InterfaceC6835l interfaceC6835l) {
        for (E0.G gO0 = g10.o0(); gO0 != null; gO0 = gO0.o0()) {
            if (((Boolean) interfaceC6835l.invoke(gO0)).booleanValue()) {
                return gO0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(J0.n nVar) {
        return nVar.p().getLayoutDirection() == Y0.t.Rtl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(J0.n nVar, J0.j jVar) {
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            if (!nVar.n().f((J0.v) ((Map.Entry) it.next()).getKey())) {
                return true;
            }
        }
        return false;
    }
}
