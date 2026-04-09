package androidx.compose.foundation;

import E0.s0;
import E0.w0;
import J0.t;
import J0.w;
import Yg.J;
import Yg.v;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l0.C6531g;
import mh.InterfaceC6824a;
import mh.InterfaceC6835l;
import mh.q;
import s.InterfaceC7836I;
import w.AbstractC8235B;
import w.r;
import y.InterfaceC8558m;
import y0.InterfaceC8567G;

/* loaded from: classes.dex */
final class f extends androidx.compose.foundation.a implements s0 {

    /* renamed from: J, reason: collision with root package name */
    private String f27830J;

    /* renamed from: N, reason: collision with root package name */
    private InterfaceC6824a f27831N;

    /* renamed from: X, reason: collision with root package name */
    private InterfaceC6824a f27832X;

    static final class a extends AbstractC6494u implements InterfaceC6824a {
        a() {
            super(0);
        }

        @Override // mh.InterfaceC6824a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            InterfaceC6824a interfaceC6824a = f.this.f27831N;
            if (interfaceC6824a != null) {
                interfaceC6824a.invoke();
            }
            return Boolean.TRUE;
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {
        b() {
            super(1);
        }

        public final void a(long j10) {
            InterfaceC6824a interfaceC6824a = f.this.f27832X;
            if (interfaceC6824a != null) {
                interfaceC6824a.invoke();
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6531g) obj).v());
            return J.f24997a;
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {
        c() {
            super(1);
        }

        public final void a(long j10) {
            InterfaceC6824a interfaceC6824a = f.this.f27831N;
            if (interfaceC6824a != null) {
                interfaceC6824a.invoke();
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6531g) obj).v());
            return J.f24997a;
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.l implements q {

        /* renamed from: a, reason: collision with root package name */
        int f27836a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27837b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ long f27838c;

        d(InterfaceC5380e interfaceC5380e) {
            super(3, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27836a;
            if (i10 == 0) {
                v.b(obj);
                r rVar = (r) this.f27837b;
                long j10 = this.f27838c;
                if (f.this.V2()) {
                    f fVar = f.this;
                    this.f27836a = 1;
                    if (fVar.X2(rVar, j10, this) == objG) {
                        return objG;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                v.b(obj);
            }
            return J.f24997a;
        }

        public final Object n(r rVar, long j10, InterfaceC5380e interfaceC5380e) {
            d dVar = f.this.new d(interfaceC5380e);
            dVar.f27837b = rVar;
            dVar.f27838c = j10;
            return dVar.invokeSuspend(J.f24997a);
        }

        @Override // mh.q
        public /* bridge */ /* synthetic */ Object s(Object obj, Object obj2, Object obj3) {
            return n((r) obj, ((C6531g) obj2).v(), (InterfaceC5380e) obj3);
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {
        e() {
            super(1);
        }

        public final void a(long j10) {
            if (f.this.V2()) {
                f.this.W2().invoke();
            }
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C6531g) obj).v());
            return J.f24997a;
        }
    }

    public /* synthetic */ f(InterfaceC6824a interfaceC6824a, String str, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, String str2, J0.g gVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6824a, str, interfaceC6824a2, interfaceC6824a3, interfaceC8558m, interfaceC7836I, z10, str2, gVar);
    }

    @Override // androidx.compose.foundation.a
    public void P2(w wVar) {
        if (this.f27831N != null) {
            t.D(wVar, this.f27830J, new a());
        }
    }

    @Override // androidx.compose.foundation.a
    public Object Q2(InterfaceC8567G interfaceC8567G, InterfaceC5380e interfaceC5380e) {
        Object objJ = AbstractC8235B.j(interfaceC8567G, (!V2() || this.f27832X == null) ? null : new b(), (!V2() || this.f27831N == null) ? null : new c(), new d(null), new e(), interfaceC5380e);
        return objJ == AbstractC5467b.g() ? objJ : J.f24997a;
    }

    public void e3(InterfaceC6824a interfaceC6824a, String str, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, String str2, J0.g gVar) {
        boolean z11;
        if (!AbstractC6492s.d(this.f27830J, str)) {
            this.f27830J = str;
            w0.b(this);
        }
        if ((this.f27831N == null) != (interfaceC6824a2 == null)) {
            S2();
            w0.b(this);
            z11 = true;
        } else {
            z11 = false;
        }
        this.f27831N = interfaceC6824a2;
        if ((this.f27832X == null) != (interfaceC6824a3 == null)) {
            z11 = true;
        }
        this.f27832X = interfaceC6824a3;
        boolean z12 = V2() != z10 ? true : z11;
        b3(interfaceC8558m, interfaceC7836I, z10, str2, gVar, interfaceC6824a);
        if (z12) {
            Z2();
        }
    }

    private f(InterfaceC6824a interfaceC6824a, String str, InterfaceC6824a interfaceC6824a2, InterfaceC6824a interfaceC6824a3, InterfaceC8558m interfaceC8558m, InterfaceC7836I interfaceC7836I, boolean z10, String str2, J0.g gVar) {
        super(interfaceC8558m, interfaceC7836I, z10, str2, gVar, interfaceC6824a, null);
        this.f27830J = str;
        this.f27831N = interfaceC6824a2;
        this.f27832X = interfaceC6824a3;
    }
}
