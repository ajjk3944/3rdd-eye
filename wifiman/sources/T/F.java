package T;

import Ii.AbstractC3059i;
import Ii.C3048c0;
import Ii.C3073p;
import Ii.InterfaceC3069n;
import T.InterfaceC3530g0;
import Yg.u;
import android.view.Choreographer;
import dh.InterfaceC5380e;
import dh.InterfaceC5384i;
import eh.AbstractC5467b;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6835l;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
final class F implements InterfaceC3530g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final F f20846a = new F();

    /* renamed from: b, reason: collision with root package name */
    private static final Choreographer f20847b = (Choreographer) AbstractC3059i.e(C3048c0.c().r0(), new a(null));

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f20848a;

        a(InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            return new a(interfaceC5380e);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AbstractC5467b.g();
            if (this.f20848a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Yg.v.b(obj);
            return Choreographer.getInstance();
        }

        @Override // mh.InterfaceC6839p
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Ii.N n10, InterfaceC5380e interfaceC5380e) {
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class b extends AbstractC6494u implements InterfaceC6835l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Choreographer.FrameCallback f20849a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Choreographer.FrameCallback frameCallback) {
            super(1);
            this.f20849a = frameCallback;
        }

        public final void a(Throwable th2) {
            F.f20847b.removeFrameCallback(this.f20849a);
        }

        @Override // mh.InterfaceC6835l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Yg.J.f24997a;
        }
    }

    static final class c implements Choreographer.FrameCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC3069n f20850a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC6835l f20851b;

        c(InterfaceC3069n interfaceC3069n, InterfaceC6835l interfaceC6835l) {
            this.f20850a = interfaceC3069n;
            this.f20851b = interfaceC6835l;
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            Object objC;
            InterfaceC3069n interfaceC3069n = this.f20850a;
            F f10 = F.f20846a;
            InterfaceC6835l interfaceC6835l = this.f20851b;
            try {
                u.a aVar = Yg.u.f25017b;
                objC = Yg.u.c(interfaceC6835l.invoke(Long.valueOf(j10)));
            } catch (Throwable th2) {
                u.a aVar2 = Yg.u.f25017b;
                objC = Yg.u.c(Yg.v.a(th2));
            }
            interfaceC3069n.resumeWith(objC);
        }
    }

    private F() {
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public Object fold(Object obj, InterfaceC6839p interfaceC6839p) {
        return InterfaceC3530g0.a.a(this, obj, interfaceC6839p);
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i.b get(InterfaceC5384i.c cVar) {
        return InterfaceC3530g0.a.b(this, cVar);
    }

    @Override // T.InterfaceC3530g0
    public Object j(InterfaceC6835l interfaceC6835l, InterfaceC5380e interfaceC5380e) {
        C3073p c3073p = new C3073p(AbstractC5467b.d(interfaceC5380e), 1);
        c3073p.A();
        c cVar = new c(c3073p, interfaceC6835l);
        f20847b.postFrameCallback(cVar);
        c3073p.B(new b(cVar));
        Object objU = c3073p.u();
        if (objU == AbstractC5467b.g()) {
            kotlin.coroutines.jvm.internal.h.c(interfaceC5380e);
        }
        return objU;
    }

    @Override // dh.InterfaceC5384i.b, dh.InterfaceC5384i
    public InterfaceC5384i minusKey(InterfaceC5384i.c cVar) {
        return InterfaceC3530g0.a.c(this, cVar);
    }

    @Override // dh.InterfaceC5384i
    public InterfaceC5384i plus(InterfaceC5384i interfaceC5384i) {
        return InterfaceC3530g0.a.d(this, interfaceC5384i);
    }
}
