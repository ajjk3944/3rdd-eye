package Mj;

import Ii.C3073p;
import Ii.InterfaceC3069n;
import Yg.J;
import Yg.u;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import kotlin.KotlinNullPointerException;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import org.snmp4j.mp.PduHandle;
import retrofit2.HttpException;

/* loaded from: classes2.dex */
public abstract class o {

    static final class a extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Mj.d f13362a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Mj.d dVar) {
            super(1);
            this.f13362a = dVar;
        }

        public final void a(Throwable th2) {
            this.f13362a.cancel();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return J.f24997a;
        }
    }

    public static final class b implements Mj.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f13363a;

        b(InterfaceC3069n interfaceC3069n) {
            this.f13363a = interfaceC3069n;
        }

        @Override // Mj.f
        public void a(Mj.d call, w response) {
            AbstractC6492s.i(call, "call");
            AbstractC6492s.i(response, "response");
            if (!response.f()) {
                InterfaceC3069n interfaceC3069n = this.f13363a;
                u.a aVar = Yg.u.f25017b;
                interfaceC3069n.resumeWith(Yg.u.c(Yg.v.a(new HttpException(response))));
                return;
            }
            Object objA = response.a();
            if (objA != null) {
                this.f13363a.resumeWith(Yg.u.c(objA));
                return;
            }
            Object objJ = call.j().j(n.class);
            AbstractC6492s.f(objJ);
            n nVar = (n) objJ;
            KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + nVar.b().getName() + '.' + nVar.a().getName() + " was null but response body type was declared as non-null");
            InterfaceC3069n interfaceC3069n2 = this.f13363a;
            u.a aVar2 = Yg.u.f25017b;
            interfaceC3069n2.resumeWith(Yg.u.c(Yg.v.a(kotlinNullPointerException)));
        }

        @Override // Mj.f
        public void b(Mj.d call, Throwable t10) {
            AbstractC6492s.i(call, "call");
            AbstractC6492s.i(t10, "t");
            InterfaceC3069n interfaceC3069n = this.f13363a;
            u.a aVar = Yg.u.f25017b;
            interfaceC3069n.resumeWith(Yg.u.c(Yg.v.a(t10)));
        }
    }

    static final class c extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Mj.d f13364a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Mj.d dVar) {
            super(1);
            this.f13364a = dVar;
        }

        public final void a(Throwable th2) {
            this.f13364a.cancel();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return J.f24997a;
        }
    }

    public static final class d implements Mj.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f13365a;

        d(InterfaceC3069n interfaceC3069n) {
            this.f13365a = interfaceC3069n;
        }

        @Override // Mj.f
        public void a(Mj.d call, w response) {
            AbstractC6492s.i(call, "call");
            AbstractC6492s.i(response, "response");
            if (response.f()) {
                InterfaceC3069n interfaceC3069n = this.f13365a;
                u.a aVar = Yg.u.f25017b;
                interfaceC3069n.resumeWith(Yg.u.c(response.a()));
            } else {
                InterfaceC3069n interfaceC3069n2 = this.f13365a;
                u.a aVar2 = Yg.u.f25017b;
                interfaceC3069n2.resumeWith(Yg.u.c(Yg.v.a(new HttpException(response))));
            }
        }

        @Override // Mj.f
        public void b(Mj.d call, Throwable t10) {
            AbstractC6492s.i(call, "call");
            AbstractC6492s.i(t10, "t");
            InterfaceC3069n interfaceC3069n = this.f13365a;
            u.a aVar = Yg.u.f25017b;
            interfaceC3069n.resumeWith(Yg.u.c(Yg.v.a(t10)));
        }
    }

    static final class e extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Mj.d f13366a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Mj.d dVar) {
            super(1);
            this.f13366a = dVar;
        }

        public final void a(Throwable th2) {
            this.f13366a.cancel();
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return J.f24997a;
        }
    }

    public static final class f implements Mj.f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f13367a;

        f(InterfaceC3069n interfaceC3069n) {
            this.f13367a = interfaceC3069n;
        }

        @Override // Mj.f
        public void a(Mj.d call, w response) {
            AbstractC6492s.i(call, "call");
            AbstractC6492s.i(response, "response");
            this.f13367a.resumeWith(Yg.u.c(response));
        }

        @Override // Mj.f
        public void b(Mj.d call, Throwable t10) {
            AbstractC6492s.i(call, "call");
            AbstractC6492s.i(t10, "t");
            InterfaceC3069n interfaceC3069n = this.f13367a;
            u.a aVar = Yg.u.f25017b;
            interfaceC3069n.resumeWith(Yg.u.c(Yg.v.a(t10)));
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f13368a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13369b;

        /* renamed from: c, reason: collision with root package name */
        int f13370c;

        g(InterfaceC5380e interfaceC5380e) {
            super(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13369b = obj;
            this.f13370c |= PduHandle.NONE;
            return o.e(null, this);
        }
    }

    static final class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC5380e f13371a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Throwable f13372b;

        h(InterfaceC5380e interfaceC5380e, Throwable th2) {
            this.f13371a = interfaceC5380e;
            this.f13372b = th2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            InterfaceC5380e interfaceC5380eD = AbstractC5467b.d(this.f13371a);
            u.a aVar = Yg.u.f25017b;
            interfaceC5380eD.resumeWith(Yg.u.c(Yg.v.a(this.f13372b)));
        }
    }

    public static final Object a(Mj.d dVar, InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        c3073p.B(new a(dVar));
        dVar.K0(new b(c3073p));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    public static final Object b(Mj.d dVar, InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        c3073p.B(new c(dVar));
        dVar.K0(new d(c3073p));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    public static final Object c(Mj.d dVar, InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        c3073p.B(new e(dVar));
        dVar.K0(new f(c3073p));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    public static final Object d(Mj.d dVar, InterfaceC5380e interfaceC5380e) {
        AbstractC6492s.g(dVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return b(dVar, interfaceC5380e);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(java.lang.Throwable r4, dh.InterfaceC5380e r5) {
        /*
            boolean r0 = r5 instanceof Mj.o.g
            if (r0 == 0) goto L13
            r0 = r5
            Mj.o$g r0 = (Mj.o.g) r0
            int r1 = r0.f13370c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13370c = r1
            goto L18
        L13:
            Mj.o$g r0 = new Mj.o$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f13369b
            java.lang.Object r1 = eh.AbstractC5467b.g()
            int r2 = r0.f13370c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.f13368a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            Yg.v.b(r5)
            goto L5c
        L35:
            Yg.v.b(r5)
            r0.f13368a = r4
            r0.f13370c = r3
            Ii.J r5 = Ii.C3048c0.a()
            dh.i r2 = r0.getContext()
            Mj.o$h r3 = new Mj.o$h
            r3.<init>(r0, r4)
            r5.Y(r2, r3)
            java.lang.Object r4 = eh.AbstractC5467b.g()
            java.lang.Object r5 = eh.AbstractC5467b.g()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.h.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Mj.o.e(java.lang.Throwable, dh.e):java.lang.Object");
    }
}
