package C;

import B.AbstractC2451o;
import B.InterfaceC2440d;
import B.InterfaceC2455t;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public final class r implements InterfaceC2455t {

    /* renamed from: a, reason: collision with root package name */
    private final C f2043a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC2451o f2044b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.c f2045c;

    /* renamed from: d, reason: collision with root package name */
    private final w f2046d = w.f2111a;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2048b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f2048b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(1142237095, i10, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item.<anonymous> (LazyLayoutPager.kt:208)");
            }
            AbstractC2451o abstractC2451o = r.this.f2044b;
            int i11 = this.f2048b;
            r rVar = r.this;
            InterfaceC2440d.a aVar = abstractC2451o.c().get(i11);
            ((l) aVar.c()).a().y(rVar.f2046d, Integer.valueOf(i11 - aVar.b()), interfaceC3540l, 0);
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2050b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f2051c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2052d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Object obj, int i11) {
            super(2);
            this.f2050b = i10;
            this.f2051c = obj;
            this.f2052d = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            r.this.h(this.f2050b, this.f2051c, interfaceC3540l, L0.a(this.f2052d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public r(C c10, AbstractC2451o abstractC2451o, androidx.compose.foundation.lazy.layout.c cVar) {
        this.f2043a = c10;
        this.f2044b = abstractC2451o;
        this.f2045c = cVar;
    }

    @Override // B.InterfaceC2455t
    public int a() {
        return this.f2044b.d();
    }

    @Override // B.InterfaceC2455t
    public Object b(int i10) {
        Object objB = this.f2045c.b(i10);
        return objB == null ? this.f2044b.e(i10) : objB;
    }

    @Override // B.InterfaceC2455t
    public int c(Object obj) {
        return this.f2045c.c(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return AbstractC6492s.d(this.f2044b, ((r) obj).f2044b);
        }
        return false;
    }

    @Override // B.InterfaceC2455t
    public void h(int i10, Object obj, InterfaceC3540l interfaceC3540l, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-1201380429);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC3540lR.i(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC3540lR.l(obj) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC3540lR.T(this) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i12 & 147) == 146 && interfaceC3540lR.v()) {
            interfaceC3540lR.C();
        } else {
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-1201380429, i12, -1, "androidx.compose.foundation.pager.PagerLazyLayoutItemProvider.Item (LazyLayoutPager.kt:206)");
            }
            B.D.a(obj, i10, this.f2043a.J(), b0.c.e(1142237095, true, new a(i10), interfaceC3540lR, 54), interfaceC3540lR, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
            if (AbstractC3546o.H()) {
                AbstractC3546o.P();
            }
        }
        X0 x0Z = interfaceC3540lR.z();
        if (x0Z != null) {
            x0Z.a(new b(i10, obj, i11));
        }
    }

    public int hashCode() {
        return this.f2044b.hashCode();
    }
}
