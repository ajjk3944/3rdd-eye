package s;

import E0.AbstractC2635m;
import E0.InterfaceC2641t;
import E0.v0;
import E0.w0;
import Ii.AbstractC3063k;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import k0.InterfaceC6354b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;
import mh.InterfaceC6839p;
import y.InterfaceC8558m;

/* renamed from: s.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7864z extends AbstractC2635m implements InterfaceC6354b, v0, InterfaceC2641t, k0.k {

    /* renamed from: p, reason: collision with root package name */
    private final boolean f60803p;

    /* renamed from: q, reason: collision with root package name */
    private k0.l f60804q;

    /* renamed from: r, reason: collision with root package name */
    private final C7863y f60805r;

    /* renamed from: s, reason: collision with root package name */
    private final C7828A f60806s = (C7828A) D2(new C7828A());

    /* renamed from: t, reason: collision with root package name */
    private final C7830C f60807t = (C7830C) D2(new C7830C());

    /* renamed from: s.z$a */
    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(androidx.compose.ui.focus.q.a(C7864z.this));
        }
    }

    /* renamed from: s.z$b */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f60809a;

        b(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return C7864z.this.new b(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f60809a;
            if (i10 == 0) {
                Yg.v.b(obj);
                C7864z c7864z = C7864z.this;
                this.f60809a = 1;
                if (D.f.b(c7864z, null, this, 1, null) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Yg.v.b(obj);
            }
            return Yg.J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    public C7864z(InterfaceC8558m interfaceC8558m) {
        this.f60805r = (C7863y) D2(new C7863y(interfaceC8558m));
        D2(k0.o.a());
    }

    @Override // E0.InterfaceC2641t
    public void B(C0.r rVar) {
        this.f60807t.B(rVar);
    }

    @Override // k0.InterfaceC6354b
    public void J1(k0.l lVar) {
        if (AbstractC6492s.d(this.f60804q, lVar)) {
            return;
        }
        boolean zIsFocused = lVar.isFocused();
        if (zIsFocused) {
            AbstractC3063k.d(d2(), null, null, new b(null), 3, null);
        }
        if (k2()) {
            w0.b(this);
        }
        this.f60805r.F2(zIsFocused);
        this.f60807t.F2(zIsFocused);
        this.f60806s.E2(zIsFocused);
        this.f60804q = lVar;
    }

    public final void J2(InterfaceC8558m interfaceC8558m) {
        this.f60805r.G2(interfaceC8558m);
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return this.f60803p;
    }

    @Override // E0.v0
    public void q(J0.w wVar) {
        k0.l lVar = this.f60804q;
        boolean z10 = false;
        if (lVar != null && lVar.isFocused()) {
            z10 = true;
        }
        J0.t.d0(wVar, z10);
        J0.t.S(wVar, null, new a(), 1, null);
    }
}
