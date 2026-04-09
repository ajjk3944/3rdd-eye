package pi;

import Bh.InterfaceC2498h;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ri.InterfaceC7614e;

/* renamed from: pi.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C7377y extends AbstractC7333A implements InterfaceC7375w, InterfaceC7614e {

    /* renamed from: d, reason: collision with root package name */
    public static final a f58191d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC7346d0 f58192b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f58193c;

    /* renamed from: pi.y$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean a(M0 m02) {
            m02.N0();
            return (m02.N0().c() instanceof Bh.l0) || (m02 instanceof kotlin.reflect.jvm.internal.impl.types.checker.i);
        }

        public static /* synthetic */ C7377y c(a aVar, M0 m02, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                z11 = false;
            }
            return aVar.b(m02, z10, z11);
        }

        private final boolean d(M0 m02, boolean z10) {
            if (!a(m02)) {
                return false;
            }
            InterfaceC2498h interfaceC2498hC = m02.N0().c();
            Dh.U u10 = interfaceC2498hC instanceof Dh.U ? (Dh.U) interfaceC2498hC : null;
            if (u10 == null || u10.T0()) {
                return (z10 && (m02.N0().c() instanceof Bh.l0)) ? J0.l(m02) : !kotlin.reflect.jvm.internal.impl.types.checker.r.f52170a.a(m02);
            }
            return true;
        }

        public final C7377y b(M0 type, boolean z10, boolean z11) {
            AbstractC6492s.i(type, "type");
            if (type instanceof C7377y) {
                return (C7377y) type;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z11 && !d(type, z10)) {
                return null;
            }
            if (type instanceof I) {
                I i10 = (I) type;
                AbstractC6492s.d(i10.V0().N0(), i10.W0().N0());
            }
            return new C7377y(L.c(type).R0(false), z10, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ C7377y(AbstractC7346d0 abstractC7346d0, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC7346d0, z10);
    }

    @Override // pi.InterfaceC7375w
    public boolean B0() {
        W0().N0();
        return W0().N0().c() instanceof Bh.l0;
    }

    @Override // pi.AbstractC7333A, pi.S
    public boolean O0() {
        return false;
    }

    @Override // pi.M0
    /* renamed from: U0 */
    public AbstractC7346d0 R0(boolean z10) {
        return z10 ? W0().R0(z10) : this;
    }

    @Override // pi.M0
    /* renamed from: V0 */
    public AbstractC7346d0 T0(r0 newAttributes) {
        AbstractC6492s.i(newAttributes, "newAttributes");
        return new C7377y(W0().T0(newAttributes), this.f58193c);
    }

    @Override // pi.AbstractC7333A
    protected AbstractC7346d0 W0() {
        return this.f58192b;
    }

    public final AbstractC7346d0 Z0() {
        return this.f58192b;
    }

    @Override // pi.AbstractC7333A
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C7377y Y0(AbstractC7346d0 delegate) {
        AbstractC6492s.i(delegate, "delegate");
        return new C7377y(delegate, this.f58193c);
    }

    @Override // pi.InterfaceC7375w
    public S i0(S replacement) {
        AbstractC6492s.i(replacement, "replacement");
        return AbstractC7354h0.e(replacement.Q0(), this.f58193c);
    }

    @Override // pi.AbstractC7346d0
    public String toString() {
        return W0() + " & Any";
    }

    private C7377y(AbstractC7346d0 abstractC7346d0, boolean z10) {
        this.f58192b = abstractC7346d0;
        this.f58193c = z10;
    }
}
