package A;

import B.D;
import B.InterfaceC2440d;
import T.AbstractC3546o;
import T.InterfaceC3540l;
import T.L0;
import T.X0;
import Yg.J;
import java.util.List;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6839p;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    private final B f93a;

    /* renamed from: b, reason: collision with root package name */
    private final k f94b;

    /* renamed from: c, reason: collision with root package name */
    private final d f95c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.compose.foundation.lazy.layout.c f96d;

    static final class a extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f98b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10) {
            super(2);
            this.f98b = i10;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            if ((i10 & 3) == 2 && interfaceC3540l.v()) {
                interfaceC3540l.C();
                return;
            }
            if (AbstractC3546o.H()) {
                AbstractC3546o.Q(-824725566, i10, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item.<anonymous> (LazyListItemProvider.kt:77)");
            }
            k kVar = n.this.f94b;
            int i11 = this.f98b;
            n nVar = n.this;
            InterfaceC2440d.a aVar = kVar.c().get(i11);
            ((j) aVar.c()).a().y(nVar.e(), Integer.valueOf(i11 - aVar.b()), interfaceC3540l, 0);
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
        final /* synthetic */ int f100b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f101c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f102d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Object obj, int i11) {
            super(2);
            this.f100b = i10;
            this.f101c = obj;
            this.f102d = i11;
        }

        public final void a(InterfaceC3540l interfaceC3540l, int i10) {
            n.this.h(this.f100b, this.f101c, interfaceC3540l, L0.a(this.f102d | 1));
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC3540l) obj, ((Number) obj2).intValue());
            return J.f24997a;
        }
    }

    public n(B b10, k kVar, d dVar, androidx.compose.foundation.lazy.layout.c cVar) {
        this.f93a = b10;
        this.f94b = kVar;
        this.f95c = dVar;
        this.f96d = cVar;
    }

    @Override // B.InterfaceC2455t
    public int a() {
        return this.f94b.d();
    }

    @Override // B.InterfaceC2455t
    public Object b(int i10) {
        Object objB = f().b(i10);
        return objB == null ? this.f94b.e(i10) : objB;
    }

    @Override // B.InterfaceC2455t
    public int c(Object obj) {
        return f().c(obj);
    }

    @Override // B.InterfaceC2455t
    public Object d(int i10) {
        return this.f94b.b(i10);
    }

    @Override // A.m
    public d e() {
        return this.f95c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return AbstractC6492s.d(this.f94b, ((n) obj).f94b);
        }
        return false;
    }

    @Override // A.m
    public androidx.compose.foundation.lazy.layout.c f() {
        return this.f96d;
    }

    @Override // A.m
    public List g() {
        return this.f94b.f();
    }

    @Override // B.InterfaceC2455t
    public void h(int i10, Object obj, InterfaceC3540l interfaceC3540l, int i11) {
        int i12;
        InterfaceC3540l interfaceC3540lR = interfaceC3540l.r(-462424778);
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
                AbstractC3546o.Q(-462424778, i12, -1, "androidx.compose.foundation.lazy.LazyListItemProviderImpl.Item (LazyListItemProvider.kt:75)");
            }
            D.a(obj, i10, this.f93a.z(), b0.c.e(-824725566, true, new a(i10), interfaceC3540lR, 54), interfaceC3540lR, ((i12 >> 3) & 14) | 3072 | ((i12 << 3) & 112));
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
        return this.f94b.hashCode();
    }
}
