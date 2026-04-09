package ci;

import Bh.InterfaceC2498h;
import Bh.l0;
import Yg.s;
import Zg.AbstractC3682n;
import Zg.AbstractC3689v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import oi.f;
import oi.n;
import pi.AbstractC7378z;
import pi.B0;
import pi.D0;
import pi.E0;
import pi.M;
import pi.N0;
import pi.S;
import pi.Y;

/* renamed from: ci.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4268e {

    /* renamed from: ci.e$a */
    public static final class a extends AbstractC7378z {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f34031d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(E0 e02, boolean z10) {
            super(e02);
            this.f34031d = z10;
        }

        @Override // pi.E0
        public boolean b() {
            return this.f34031d;
        }

        @Override // pi.AbstractC7378z, pi.E0
        public B0 e(S key) {
            AbstractC6492s.i(key, "key");
            B0 b0E = super.e(key);
            if (b0E == null) {
                return null;
            }
            InterfaceC2498h interfaceC2498hC = key.N0().c();
            return AbstractC4268e.c(b0E, interfaceC2498hC instanceof l0 ? (l0) interfaceC2498hC : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final B0 c(B0 b02, l0 l0Var) {
        if (l0Var == null || b02.a() == N0.INVARIANT) {
            return b02;
        }
        if (l0Var.p() != b02.a()) {
            return new D0(e(b02));
        }
        if (!b02.c()) {
            return new D0(b02.getType());
        }
        n NO_LOCKS = f.f55716e;
        AbstractC6492s.h(NO_LOCKS, "NO_LOCKS");
        return new D0(new Y(NO_LOCKS, new C4267d(b02)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S d(B0 b02) {
        S type = b02.getType();
        AbstractC6492s.h(type, "getType(...)");
        return type;
    }

    public static final S e(B0 typeProjection) {
        AbstractC6492s.i(typeProjection, "typeProjection");
        return new C4264a(typeProjection, null, false, null, 14, null);
    }

    public static final boolean f(S s10) {
        AbstractC6492s.i(s10, "<this>");
        return s10.N0() instanceof InterfaceC4265b;
    }

    public static final E0 g(E0 e02, boolean z10) {
        AbstractC6492s.i(e02, "<this>");
        if (!(e02 instanceof M)) {
            return new a(e02, z10);
        }
        M m10 = (M) e02;
        l0[] l0VarArrJ = m10.j();
        List<s> listT1 = AbstractC3682n.t1(m10.i(), m10.j());
        ArrayList arrayList = new ArrayList(AbstractC3689v.w(listT1, 10));
        for (s sVar : listT1) {
            arrayList.add(c((B0) sVar.h(), (l0) sVar.j()));
        }
        return new M(l0VarArrJ, (B0[]) arrayList.toArray(new B0[0]), z10);
    }

    public static /* synthetic */ E0 h(E0 e02, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return g(e02, z10);
    }
}
