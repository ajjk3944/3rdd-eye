package androidx.compose.ui.draw;

import E0.AbstractC2633k;
import E0.AbstractC2640s;
import E0.e0;
import E0.h0;
import E0.i0;
import Y0.s;
import Y0.t;
import Yg.J;
import androidx.compose.ui.e;
import j0.C6233d;
import j0.C6237h;
import j0.InterfaceC6231b;
import j0.InterfaceC6232c;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import m0.InterfaceC6671H0;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import o0.InterfaceC7036c;

/* loaded from: classes.dex */
final class a extends e.c implements InterfaceC6232c, h0, InterfaceC6231b {

    /* renamed from: n, reason: collision with root package name */
    private final C6233d f28754n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f28755o;

    /* renamed from: p, reason: collision with root package name */
    private f f28756p;

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC6835l f28757q;

    /* renamed from: androidx.compose.ui.draw.a$a, reason: collision with other inner class name */
    static final class C1064a extends AbstractC6494u implements InterfaceC6824a {
        C1064a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC6671H0 invoke() {
            return a.this.E2();
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6824a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6233d f28760b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6233d c6233d) {
            super(0);
            this.f28760b = c6233d;
        }

        public final void a() {
            a.this.D2().invoke(this.f28760b);
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    public a(C6233d c6233d, InterfaceC6835l interfaceC6835l) {
        this.f28754n = c6233d;
        this.f28757q = interfaceC6835l;
        c6233d.q(this);
        c6233d.v(new C1064a());
    }

    private final C6237h F2(InterfaceC7036c interfaceC7036c) {
        if (!this.f28755o) {
            C6233d c6233d = this.f28754n;
            c6233d.s(null);
            c6233d.r(interfaceC7036c);
            i0.a(this, new b(c6233d));
            if (c6233d.b() == null) {
                B0.a.c("DrawResult not defined, did you forget to call onDraw?");
                throw new KotlinNothingValueException();
            }
            this.f28755o = true;
        }
        C6237h c6237hB = this.f28754n.b();
        AbstractC6492s.f(c6237hB);
        return c6237hB;
    }

    public final InterfaceC6835l D2() {
        return this.f28757q;
    }

    public final InterfaceC6671H0 E2() {
        f fVar = this.f28756p;
        if (fVar == null) {
            fVar = new f();
            this.f28756p = fVar;
        }
        if (fVar.c() == null) {
            fVar.e(AbstractC2633k.j(this));
        }
        return fVar;
    }

    public final void G2(InterfaceC6835l interfaceC6835l) {
        this.f28757q = interfaceC6835l;
        c0();
    }

    @Override // E0.r
    public void H0() {
        c0();
    }

    @Override // E0.r
    public void J(InterfaceC7036c interfaceC7036c) {
        F2(interfaceC7036c).a().invoke(interfaceC7036c);
    }

    @Override // j0.InterfaceC6231b
    public long c() {
        return s.d(AbstractC2633k.h(this, e0.a(128)).h());
    }

    @Override // j0.InterfaceC6232c
    public void c0() {
        f fVar = this.f28756p;
        if (fVar != null) {
            fVar.d();
        }
        this.f28755o = false;
        this.f28754n.s(null);
        AbstractC2640s.a(this);
    }

    @Override // j0.InterfaceC6231b
    public Y0.d getDensity() {
        return AbstractC2633k.i(this);
    }

    @Override // j0.InterfaceC6231b
    public t getLayoutDirection() {
        return AbstractC2633k.l(this);
    }

    @Override // androidx.compose.ui.e.c
    public void o2() {
        super.o2();
        f fVar = this.f28756p;
        if (fVar != null) {
            fVar.d();
        }
    }

    @Override // E0.h0
    public void q1() {
        c0();
    }
}
