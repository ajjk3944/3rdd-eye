package androidx.compose.ui.layout;

import E0.G;
import T.AbstractC3550q;
import Yg.J;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: f, reason: collision with root package name */
    public static final int f29085f = 8;

    /* renamed from: a, reason: collision with root package name */
    private final y f29086a;

    /* renamed from: b, reason: collision with root package name */
    private h f29087b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC6839p f29088c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC6839p f29089d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC6839p f29090e;

    public interface a {
        default void a(Object obj, InterfaceC6835l interfaceC6835l) {
        }

        default void b(int i10, long j10) {
        }

        default int c() {
            return 0;
        }

        void dispose();
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {
        b() {
            super(2);
        }

        public final void a(G g10, AbstractC3550q abstractC3550q) {
            x.this.h().I(abstractC3550q);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (AbstractC3550q) obj2);
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6839p {
        c() {
            super(2);
        }

        public final void a(G g10, InterfaceC6839p interfaceC6839p) {
            g10.i(x.this.h().u(interfaceC6839p));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (InterfaceC6839p) obj2);
            return J.f24997a;
        }
    }

    static final class d extends AbstractC6494u implements InterfaceC6839p {
        d() {
            super(2);
        }

        public final void a(G g10, x xVar) {
            x xVar2 = x.this;
            h hVarR0 = g10.r0();
            if (hVarR0 == null) {
                hVarR0 = new h(g10, x.this.f29086a);
                g10.J1(hVarR0);
            }
            xVar2.f29087b = hVarR0;
            x.this.h().B();
            x.this.h().J(x.this.f29086a);
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((G) obj, (x) obj2);
            return J.f24997a;
        }
    }

    public x(y yVar) {
        this.f29086a = yVar;
        this.f29088c = new d();
        this.f29089d = new b();
        this.f29090e = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h h() {
        h hVar = this.f29087b;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public final void d() {
        h().z();
    }

    public final InterfaceC6839p e() {
        return this.f29089d;
    }

    public final InterfaceC6839p f() {
        return this.f29090e;
    }

    public final InterfaceC6839p g() {
        return this.f29088c;
    }

    public final a i(Object obj, InterfaceC6839p interfaceC6839p) {
        return h().G(obj, interfaceC6839p);
    }

    public x() {
        this(n.f29055a);
    }
}
