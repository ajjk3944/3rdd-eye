package androidx.compose.ui.layout;

import C0.D;
import C0.InterfaceC2523c;
import C0.InterfaceC2524d;
import C0.InterfaceC2534n;
import E0.B;
import E0.g0;
import Yg.J;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* loaded from: classes.dex */
public interface b extends B {

    static final class a implements g0.a {
        a() {
        }

        @Override // E0.g0.a
        public final D a(InterfaceC2524d interfaceC2524d, C0.B b10, long j10) {
            return b.this.Q0(interfaceC2524d, b10, j10);
        }
    }

    /* renamed from: androidx.compose.ui.layout.b$b, reason: collision with other inner class name */
    static final class C1067b implements g0.a {
        C1067b() {
        }

        @Override // E0.g0.a
        public final D a(InterfaceC2524d interfaceC2524d, C0.B b10, long j10) {
            return b.this.Q0(interfaceC2524d, b10, j10);
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ t f28974a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(t tVar) {
            super(1);
            this.f28974a = tVar;
        }

        public final void a(t.a aVar) {
            t.a.h(aVar, this.f28974a, 0, 0, 0.0f, 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return J.f24997a;
        }
    }

    static final class d implements g0.a {
        d() {
        }

        @Override // E0.g0.a
        public final D a(InterfaceC2524d interfaceC2524d, C0.B b10, long j10) {
            return b.this.Q0(interfaceC2524d, b10, j10);
        }
    }

    static final class e implements g0.a {
        e() {
        }

        @Override // E0.g0.a
        public final D a(InterfaceC2524d interfaceC2524d, C0.B b10, long j10) {
            return b.this.Q0(interfaceC2524d, b10, j10);
        }
    }

    default int O(InterfaceC2523c interfaceC2523c, InterfaceC2534n interfaceC2534n, int i10) {
        return g0.f3935a.c(new C1067b(), interfaceC2523c, interfaceC2534n, i10);
    }

    D Q0(InterfaceC2524d interfaceC2524d, C0.B b10, long j10);

    boolean S(long j10);

    default int V(InterfaceC2523c interfaceC2523c, InterfaceC2534n interfaceC2534n, int i10) {
        return g0.f3935a.e(new d(), interfaceC2523c, interfaceC2534n, i10);
    }

    default int W0(InterfaceC2523c interfaceC2523c, InterfaceC2534n interfaceC2534n, int i10) {
        return g0.f3935a.a(new a(), interfaceC2523c, interfaceC2534n, i10);
    }

    default int W1(InterfaceC2523c interfaceC2523c, InterfaceC2534n interfaceC2534n, int i10) {
        return g0.f3935a.g(new e(), interfaceC2523c, interfaceC2534n, i10);
    }

    @Override // E0.B
    default D b(m mVar, C0.B b10, long j10) {
        t tVarT = b10.T(j10);
        return m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new c(tVarT), 4, null);
    }

    boolean k0(t.a aVar, C0.r rVar);
}
