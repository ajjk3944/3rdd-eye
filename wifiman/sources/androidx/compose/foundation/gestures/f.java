package androidx.compose.foundation.gestures;

import C0.r;
import E0.AbstractC2631i;
import E0.AbstractC2633k;
import E0.InterfaceC2630h;
import E0.h0;
import E0.i0;
import E0.v0;
import E0.w0;
import Ii.AbstractC3063k;
import Ii.N;
import Yg.J;
import Yg.v;
import android.view.KeyEvent;
import androidx.compose.foundation.gestures.a;
import androidx.compose.ui.focus.k;
import androidx.compose.ui.platform.AbstractC3932k0;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import java.util.List;
import k0.o;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.AbstractC6532h;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import q.AbstractC7405x;
import s.C7831D;
import s.EnumC7839L;
import s.S;
import w.AbstractC8241b;
import w.C8234A;
import w.C8245f;
import w.InterfaceC8243d;
import w.n;
import w.p;
import w.q;
import w.t;
import w.w;
import w.y;
import w0.AbstractC8249c;
import w0.AbstractC8250d;
import w0.C8247a;
import w0.InterfaceC8251e;
import x0.AbstractC8415d;
import x0.C8413b;
import y.InterfaceC8558m;
import y0.AbstractC8596q;
import y0.C8593n;
import y0.C8604y;
import y0.EnumC8595p;

/* loaded from: classes.dex */
final class f extends androidx.compose.foundation.gestures.b implements h0, InterfaceC2630h, k0.h, InterfaceC8251e, v0 {

    /* renamed from: A, reason: collision with root package name */
    private final boolean f27973A;

    /* renamed from: B, reason: collision with root package name */
    private final C8413b f27974B;

    /* renamed from: C, reason: collision with root package name */
    private final w f27975C;

    /* renamed from: D, reason: collision with root package name */
    private final w.h f27976D;

    /* renamed from: E, reason: collision with root package name */
    private final C8234A f27977E;

    /* renamed from: F, reason: collision with root package name */
    private final androidx.compose.foundation.gestures.e f27978F;

    /* renamed from: G, reason: collision with root package name */
    private final C8245f f27979G;

    /* renamed from: H, reason: collision with root package name */
    private t f27980H;

    /* renamed from: I, reason: collision with root package name */
    private InterfaceC6839p f27981I;

    /* renamed from: J, reason: collision with root package name */
    private InterfaceC6839p f27982J;

    /* renamed from: y, reason: collision with root package name */
    private S f27983y;

    /* renamed from: z, reason: collision with root package name */
    private n f27984z;

    static final class a extends AbstractC6494u implements InterfaceC6835l {
        a() {
            super(1);
        }

        public final void a(r rVar) {
            f.this.f27979G.X2(rVar);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((r) obj);
            return J.f24997a;
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27986a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27987b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f27988c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C8234A f27989d;

        static final class a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ p f27990a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C8234A f27991b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p pVar, C8234A c8234a) {
                super(1);
                this.f27990a = pVar;
                this.f27991b = c8234a;
            }

            public final void a(a.b bVar) {
                this.f27990a.a(this.f27991b.x(bVar.a()), x0.e.f65322a.b());
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a.b) obj);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6839p interfaceC6839p, C8234A c8234a, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27988c = interfaceC6839p;
            this.f27989d = c8234a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f27988c, this.f27989d, interfaceC5380e);
            bVar.f27987b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27986a;
            if (i10 == 0) {
                v.b(obj);
                p pVar = (p) this.f27987b;
                InterfaceC6839p interfaceC6839p = this.f27988c;
                a aVar = new a(pVar, this.f27989d);
                this.f27986a = 1;
                if (interfaceC6839p.invoke(aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p pVar, InterfaceC5380e interfaceC5380e) {
            return ((b) create(pVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27992a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f27994c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27994c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return f.this.new c(this.f27994c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27992a;
            if (i10 == 0) {
                v.b(obj);
                C8234A c8234a = f.this.f27977E;
                long j10 = this.f27994c;
                this.f27992a = 1;
                if (c8234a.q(j10, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class d extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27995a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f27997c;

        static final class a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f27998a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f27999b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f28000c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f28000c = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f28000c, interfaceC5380e);
                aVar.f27999b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f27998a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                ((p) this.f27999b).b(this.f28000c, x0.e.f65322a.b());
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p pVar, InterfaceC5380e interfaceC5380e) {
                return ((a) create(pVar, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(long j10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27997c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return f.this.new d(this.f27997c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27995a;
            if (i10 == 0) {
                v.b(obj);
                C8234A c8234a = f.this.f27977E;
                EnumC7839L enumC7839L = EnumC7839L.UserInput;
                a aVar = new a(this.f27997c, null);
                this.f27995a = 1;
                if (c8234a.v(enumC7839L, aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((d) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class e extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28001a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f28003c;

        static final class a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f28004a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f28005b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f28006c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(long j10, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f28006c = j10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                a aVar = new a(this.f28006c, interfaceC5380e);
                aVar.f28005b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                AbstractC5467b.g();
                if (this.f28004a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
                ((p) this.f28005b).b(this.f28006c, x0.e.f65322a.b());
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p pVar, InterfaceC5380e interfaceC5380e) {
                return ((a) create(pVar, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f28003c = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return f.this.new e(this.f28003c, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28001a;
            if (i10 == 0) {
                v.b(obj);
                C8234A c8234a = f.this.f27977E;
                EnumC7839L enumC7839L = EnumC7839L.UserInput;
                a aVar = new a(this.f28003c, null);
                this.f28001a = 1;
                if (c8234a.v(enumC7839L, aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
            return ((e) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.f$f, reason: collision with other inner class name */
    static final class C1046f extends AbstractC6494u implements InterfaceC6839p {

        /* renamed from: androidx.compose.foundation.gestures.f$f$a */
        static final class a extends l implements InterfaceC6839p {

            /* renamed from: a, reason: collision with root package name */
            int f28008a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f28009b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ float f28010c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ float f28011d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, float f10, float f11, InterfaceC5380e interfaceC5380e) {
                super(2, interfaceC5380e);
                this.f28009b = fVar;
                this.f28010c = f10;
                this.f28011d = f11;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
                return new a(this.f28009b, this.f28010c, this.f28011d, interfaceC5380e);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = AbstractC5467b.g();
                int i10 = this.f28008a;
                if (i10 == 0) {
                    v.b(obj);
                    C8234A c8234a = this.f28009b.f27977E;
                    long jA = AbstractC6532h.a(this.f28010c, this.f28011d);
                    this.f28008a = 1;
                    if (androidx.compose.foundation.gestures.d.j(c8234a, jA, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v.b(obj);
                }
                return J.f24997a;
            }

            @Override // mh.InterfaceC6839p
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N n10, InterfaceC5380e interfaceC5380e) {
                return ((a) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
            }
        }

        C1046f() {
            super(2);
        }

        public final Boolean a(float f10, float f11) {
            AbstractC3063k.d(f.this.d2(), null, null, new a(f.this, f10, f11, null), 3, null);
            return Boolean.TRUE;
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }
    }

    static final class g extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f28012a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ long f28013b;

        g(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            g gVar = f.this.new g(interfaceC5380e);
            gVar.f28013b = ((C6531g) obj).v();
            return gVar;
        }

        @Override // mh.InterfaceC6839p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((C6531g) obj).v(), (InterfaceC5380e) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f28012a;
            if (i10 == 0) {
                v.b(obj);
                long j10 = this.f28013b;
                C8234A c8234a = f.this.f27977E;
                this.f28012a = 1;
                obj = androidx.compose.foundation.gestures.d.j(c8234a, j10, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return obj;
        }

        public final Object n(long j10, InterfaceC5380e interfaceC5380e) {
            return ((g) create(C6531g.d(j10), interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class h extends AbstractC6494u implements InterfaceC6824a {
        h() {
            super(0);
        }

        public final void a() {
            f.this.f27976D.f(AbstractC7405x.c((Y0.d) AbstractC2631i.a(f.this, AbstractC3932k0.g())));
        }

        @Override // mh.InterfaceC6824a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return J.f24997a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [w.n] */
    public f(y yVar, S s10, n nVar, q qVar, boolean z10, boolean z11, InterfaceC8558m interfaceC8558m, InterfaceC8243d interfaceC8243d) {
        super(androidx.compose.foundation.gestures.d.f27950a, z10, interfaceC8558m, qVar);
        this.f27983y = s10;
        this.f27984z = nVar;
        C8413b c8413b = new C8413b();
        this.f27974B = c8413b;
        this.f27975C = (w) D2(new w(z10));
        w.h hVar = new w.h(AbstractC7405x.c(androidx.compose.foundation.gestures.d.f27953d), null, 2, null);
        this.f27976D = hVar;
        S s11 = this.f27983y;
        ?? r22 = this.f27984z;
        C8234A c8234a = new C8234A(yVar, s11, r22 == 0 ? hVar : r22, qVar, z11, c8413b);
        this.f27977E = c8234a;
        androidx.compose.foundation.gestures.e eVar = new androidx.compose.foundation.gestures.e(c8234a, z10);
        this.f27978F = eVar;
        C8245f c8245f = (C8245f) D2(new C8245f(qVar, c8234a, z11, interfaceC8243d));
        this.f27979G = c8245f;
        D2(AbstractC8415d.a(eVar, c8413b));
        D2(o.a());
        D2(new androidx.compose.foundation.relocation.f(c8245f));
        D2(new C7831D(new a()));
    }

    private final void h3() {
        this.f27981I = null;
        this.f27982J = null;
    }

    private final void i3(C8593n c8593n, long j10) {
        List listC = c8593n.c();
        int size = listC.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C8604y) listC.get(i10)).p()) {
                return;
            }
        }
        t tVar = this.f27980H;
        AbstractC6492s.f(tVar);
        AbstractC3063k.d(d2(), null, null, new e(tVar.a(AbstractC2633k.i(this), c8593n, j10), null), 3, null);
        List listC2 = c8593n.c();
        int size2 = listC2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((C8604y) listC2.get(i11)).a();
        }
    }

    private final void j3() {
        this.f27981I = new C1046f();
        this.f27982J = new g(null);
    }

    private final void l3() {
        i0.a(this, new h());
    }

    @Override // w0.InterfaceC8251e
    public boolean Q(KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.gestures.b
    public Object S2(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        C8234A c8234a = this.f27977E;
        Object objV = c8234a.v(EnumC7839L.UserInput, new b(interfaceC6839p, c8234a, null), interfaceC5380e);
        return objV == AbstractC5467b.g() ? objV : J.f24997a;
    }

    @Override // androidx.compose.foundation.gestures.b
    public void W2(long j10) {
    }

    @Override // androidx.compose.foundation.gestures.b
    public void X2(long j10) {
        AbstractC3063k.d(this.f27974B.e(), null, null, new c(j10, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    public boolean b3() {
        return this.f27977E.w();
    }

    @Override // androidx.compose.ui.e.c
    public boolean i2() {
        return this.f27973A;
    }

    public final void k3(y yVar, q qVar, S s10, boolean z10, boolean z11, n nVar, InterfaceC8558m interfaceC8558m, InterfaceC8243d interfaceC8243d) {
        boolean z12;
        if (U2() != z10) {
            this.f27978F.a(z10);
            this.f27975C.E2(z10);
            z12 = true;
        } else {
            z12 = false;
        }
        boolean z13 = z12;
        boolean zC = this.f27977E.C(yVar, qVar, s10, z11, nVar == null ? this.f27976D : nVar, this.f27974B);
        this.f27979G.a3(qVar, z11, interfaceC8243d);
        this.f27983y = s10;
        this.f27984z = nVar;
        d3(androidx.compose.foundation.gestures.d.f27950a, z10, interfaceC8558m, this.f27977E.p() ? q.Vertical : q.Horizontal, zC);
        if (z13) {
            h3();
            w0.b(this);
        }
    }

    @Override // androidx.compose.ui.e.c
    public void n2() {
        l3();
        this.f27980H = AbstractC8241b.a(this);
    }

    @Override // k0.h
    public void o0(k kVar) {
        kVar.w(false);
    }

    @Override // E0.v0
    public void q(J0.w wVar) {
        if (U2() && (this.f27981I == null || this.f27982J == null)) {
            j3();
        }
        InterfaceC6839p interfaceC6839p = this.f27981I;
        if (interfaceC6839p != null) {
            J0.t.U(wVar, null, interfaceC6839p, 1, null);
        }
        InterfaceC6839p interfaceC6839p2 = this.f27982J;
        if (interfaceC6839p2 != null) {
            J0.t.V(wVar, interfaceC6839p2);
        }
    }

    @Override // E0.h0
    public void q1() {
        l3();
    }

    @Override // w0.InterfaceC8251e
    public boolean r0(KeyEvent keyEvent) {
        long jA;
        if (U2()) {
            long jA2 = AbstractC8250d.a(keyEvent);
            C8247a.C2277a c2277a = C8247a.f64178b;
            if ((C8247a.p(jA2, c2277a.j()) || C8247a.p(AbstractC8250d.a(keyEvent), c2277a.k())) && AbstractC8249c.e(AbstractC8250d.b(keyEvent), AbstractC8249c.f64330a.a()) && !AbstractC8250d.e(keyEvent)) {
                if (this.f27977E.p()) {
                    int iF = Y0.r.f(this.f27979G.T2());
                    jA = AbstractC6532h.a(0.0f, C8247a.p(AbstractC8250d.a(keyEvent), c2277a.k()) ? iF : -iF);
                } else {
                    int iG = Y0.r.g(this.f27979G.T2());
                    jA = AbstractC6532h.a(C8247a.p(AbstractC8250d.a(keyEvent), c2277a.k()) ? iG : -iG, 0.0f);
                }
                AbstractC3063k.d(d2(), null, null, new d(jA, null), 3, null);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.foundation.gestures.b, E0.s0
    public void s0(C8593n c8593n, EnumC8595p enumC8595p, long j10) {
        List listC = c8593n.c();
        int size = listC.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (((Boolean) T2().invoke((C8604y) listC.get(i10))).booleanValue()) {
                super.s0(c8593n, enumC8595p, j10);
                break;
            }
            i10++;
        }
        if (enumC8595p == EnumC8595p.Main && AbstractC8596q.i(c8593n.f(), AbstractC8596q.f66307a.f())) {
            i3(c8593n, j10);
        }
    }
}
