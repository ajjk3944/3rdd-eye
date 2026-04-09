package m0;

import E0.AbstractC2624c0;
import E0.AbstractC2633k;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.t;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;

/* renamed from: m0.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6711k0 extends e.c implements E0.B {

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC6835l f52921n;

    /* renamed from: m0.k0$a */
    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.t f52922a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6711k0 f52923b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.t tVar, C6711k0 c6711k0) {
            super(1);
            this.f52922a = tVar;
            this.f52923b = c6711k0;
        }

        public final void a(t.a aVar) {
            t.a.v(aVar, this.f52922a, 0, 0, 0.0f, this.f52923b.D2(), 4, null);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((t.a) obj);
            return Yg.J.f24997a;
        }
    }

    public C6711k0(InterfaceC6835l interfaceC6835l) {
        this.f52921n = interfaceC6835l;
    }

    public final InterfaceC6835l D2() {
        return this.f52921n;
    }

    public final void E2() {
        AbstractC2624c0 abstractC2624c0H2 = AbstractC2633k.h(this, E0.e0.a(2)).H2();
        if (abstractC2624c0H2 != null) {
            abstractC2624c0H2.w3(this.f52921n, true);
        }
    }

    public final void F2(InterfaceC6835l interfaceC6835l) {
        this.f52921n = interfaceC6835l;
    }

    @Override // E0.B
    public C0.D b(androidx.compose.ui.layout.m mVar, C0.B b10, long j10) {
        androidx.compose.ui.layout.t tVarT = b10.T(j10);
        return androidx.compose.ui.layout.m.x0(mVar, tVarT.I0(), tVarT.C0(), null, new a(tVarT, this), 4, null);
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return false;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f52921n + ')';
    }
}
