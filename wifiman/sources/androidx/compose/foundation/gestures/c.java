package androidx.compose.foundation.gestures;

import Ii.AbstractC3063k;
import Ii.N;
import Y0.y;
import Yg.J;
import Yg.v;
import androidx.compose.foundation.gestures.a;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import l0.C6531g;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;
import mh.q;
import s.EnumC7839L;
import w.k;
import w.m;
import y.InterfaceC8558m;

/* loaded from: classes.dex */
public final class c extends androidx.compose.foundation.gestures.b {

    /* renamed from: A, reason: collision with root package name */
    private boolean f27930A;

    /* renamed from: B, reason: collision with root package name */
    private q f27931B;

    /* renamed from: C, reason: collision with root package name */
    private q f27932C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f27933D;

    /* renamed from: y, reason: collision with root package name */
    private m f27934y;

    /* renamed from: z, reason: collision with root package name */
    private w.q f27935z;

    static final class a extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27936a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27937b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f27938c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ c f27939d;

        /* renamed from: androidx.compose.foundation.gestures.c$a$a, reason: collision with other inner class name */
        static final class C1043a extends AbstractC6494u implements InterfaceC6835l {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f27940a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f27941b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1043a(k kVar, c cVar) {
                super(1);
                this.f27940a = kVar;
                this.f27941b = cVar;
            }

            public final void a(a.b bVar) {
                this.f27940a.a(w.l.j(this.f27941b.k3(bVar.a()), this.f27941b.f27935z));
            }

            @Override // mh.InterfaceC6835l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a.b) obj);
                return J.f24997a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p, c cVar, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27938c = interfaceC6839p;
            this.f27939d = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f27938c, this.f27939d, interfaceC5380e);
            aVar.f27937b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27936a;
            if (i10 == 0) {
                v.b(obj);
                k kVar = (k) this.f27937b;
                InterfaceC6839p interfaceC6839p = this.f27938c;
                C1043a c1043a = new C1043a(kVar, this.f27939d);
                this.f27936a = 1;
                if (interfaceC6839p.invoke(c1043a, this) == objG) {
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
        public final Object invoke(k kVar, InterfaceC5380e interfaceC5380e) {
            return ((a) create(kVar, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    static final class b extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27942a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27943b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f27945d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27945d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = c.this.new b(this.f27945d, interfaceC5380e);
            bVar.f27943b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27942a;
            if (i10 == 0) {
                v.b(obj);
                N n10 = (N) this.f27943b;
                q qVar = c.this.f27931B;
                C6531g c6531gD = C6531g.d(this.f27945d);
                this.f27942a = 1;
                if (qVar.s(n10, c6531gD, this) == objG) {
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
            return ((b) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    /* renamed from: androidx.compose.foundation.gestures.c$c, reason: collision with other inner class name */
    static final class C1044c extends l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f27946a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f27947b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f27949d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1044c(long j10, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f27949d = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            C1044c c1044c = c.this.new C1044c(this.f27949d, interfaceC5380e);
            c1044c.f27947b = obj;
            return c1044c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f27946a;
            if (i10 == 0) {
                v.b(obj);
                N n10 = (N) this.f27947b;
                q qVar = c.this.f27932C;
                Float fC = kotlin.coroutines.jvm.internal.b.c(w.l.k(c.this.j3(this.f27949d), c.this.f27935z));
                this.f27946a = 1;
                if (qVar.s(n10, fC, this) == objG) {
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
            return ((C1044c) create(n10, interfaceC5380e)).invokeSuspend(J.f24997a);
        }
    }

    public c(m mVar, InterfaceC6835l interfaceC6835l, w.q qVar, boolean z10, InterfaceC8558m interfaceC8558m, boolean z11, q qVar2, q qVar3, boolean z12) {
        super(interfaceC6835l, z10, interfaceC8558m, qVar);
        this.f27934y = mVar;
        this.f27935z = qVar;
        this.f27930A = z11;
        this.f27931B = qVar2;
        this.f27932C = qVar3;
        this.f27933D = z12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long j3(long j10) {
        return y.m(j10, this.f27933D ? -1.0f : 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long k3(long j10) {
        return C6531g.s(j10, this.f27933D ? -1.0f : 1.0f);
    }

    @Override // androidx.compose.foundation.gestures.b
    public Object S2(InterfaceC6839p interfaceC6839p, InterfaceC5380e interfaceC5380e) {
        Object objA = this.f27934y.a(EnumC7839L.UserInput, new a(interfaceC6839p, this, null), interfaceC5380e);
        return objA == AbstractC5467b.g() ? objA : J.f24997a;
    }

    @Override // androidx.compose.foundation.gestures.b
    public void W2(long j10) {
        if (!k2() || AbstractC6492s.d(this.f27931B, w.l.f63982a)) {
            return;
        }
        AbstractC3063k.d(d2(), null, null, new b(j10, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    public void X2(long j10) {
        if (!k2() || AbstractC6492s.d(this.f27932C, w.l.f63983b)) {
            return;
        }
        AbstractC3063k.d(d2(), null, null, new C1044c(j10, null), 3, null);
    }

    @Override // androidx.compose.foundation.gestures.b
    public boolean b3() {
        return this.f27930A;
    }

    public final void l3(m mVar, InterfaceC6835l interfaceC6835l, w.q qVar, boolean z10, InterfaceC8558m interfaceC8558m, boolean z11, q qVar2, q qVar3, boolean z12) {
        boolean z13;
        boolean z14;
        q qVar4;
        if (AbstractC6492s.d(this.f27934y, mVar)) {
            z13 = false;
        } else {
            this.f27934y = mVar;
            z13 = true;
        }
        if (this.f27935z != qVar) {
            this.f27935z = qVar;
            z13 = true;
        }
        if (this.f27933D != z12) {
            this.f27933D = z12;
            qVar4 = qVar2;
            z14 = true;
        } else {
            z14 = z13;
            qVar4 = qVar2;
        }
        this.f27931B = qVar4;
        this.f27932C = qVar3;
        this.f27930A = z11;
        d3(interfaceC6835l, z10, interfaceC8558m, qVar, z14);
    }
}
