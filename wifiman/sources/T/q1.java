package T;

import T.InterfaceC3540l;
import dh.InterfaceC5380e;
import eh.AbstractC5467b;
import mh.InterfaceC6839p;

/* loaded from: classes.dex */
abstract /* synthetic */ class q1 {

    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f21187a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21188b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f21189c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f21190d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6839p interfaceC6839p, InterfaceC3551q0 interfaceC3551q0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f21189c = interfaceC6839p;
            this.f21190d = interfaceC3551q0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            a aVar = new a(this.f21189c, this.f21190d, interfaceC5380e);
            aVar.f21188b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f21187a;
            if (i10 == 0) {
                Yg.v.b(obj);
                Ii.N n10 = (Ii.N) this.f21188b;
                InterfaceC6839p interfaceC6839p = this.f21189c;
                G0 g02 = new G0(this.f21190d, n10.getCoroutineContext());
                this.f21187a = 1;
                if (interfaceC6839p.invoke(g02, this) == objG) {
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
            return ((a) create(n10, interfaceC5380e)).invokeSuspend(Yg.J.f24997a);
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC6839p {

        /* renamed from: a, reason: collision with root package name */
        int f21191a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f21192b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6839p f21193c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC3551q0 f21194d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6839p interfaceC6839p, InterfaceC3551q0 interfaceC3551q0, InterfaceC5380e interfaceC5380e) {
            super(2, interfaceC5380e);
            this.f21193c = interfaceC6839p;
            this.f21194d = interfaceC3551q0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC5380e create(Object obj, InterfaceC5380e interfaceC5380e) {
            b bVar = new b(this.f21193c, this.f21194d, interfaceC5380e);
            bVar.f21192b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = AbstractC5467b.g();
            int i10 = this.f21191a;
            if (i10 == 0) {
                Yg.v.b(obj);
                Ii.N n10 = (Ii.N) this.f21192b;
                InterfaceC6839p interfaceC6839p = this.f21193c;
                G0 g02 = new G0(this.f21194d, n10.getCoroutineContext());
                this.f21191a = 1;
                if (interfaceC6839p.invoke(g02, this) == objG) {
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

    public static final z1 a(Object obj, Object obj2, Object obj3, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:146)");
        }
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = t1.d(obj, null, 2, null);
            interfaceC3540l.K(objF);
        }
        InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
        boolean zL = interfaceC3540l.l(interfaceC6839p);
        Object objF2 = interfaceC3540l.f();
        if (zL || objF2 == aVar.a()) {
            objF2 = new b(interfaceC6839p, interfaceC3551q0, null);
            interfaceC3540l.K(objF2);
        }
        O.e(obj2, obj3, (InterfaceC6839p) objF2, interfaceC3540l, (i10 >> 3) & 126);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return interfaceC3551q0;
    }

    public static final z1 b(Object obj, InterfaceC6839p interfaceC6839p, InterfaceC3540l interfaceC3540l, int i10) {
        if (AbstractC3546o.H()) {
            AbstractC3546o.Q(10454275, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:79)");
        }
        Object objF = interfaceC3540l.f();
        InterfaceC3540l.a aVar = InterfaceC3540l.f21100a;
        if (objF == aVar.a()) {
            objF = t1.d(obj, null, 2, null);
            interfaceC3540l.K(objF);
        }
        InterfaceC3551q0 interfaceC3551q0 = (InterfaceC3551q0) objF;
        Yg.J j10 = Yg.J.f24997a;
        boolean zL = interfaceC3540l.l(interfaceC6839p);
        Object objF2 = interfaceC3540l.f();
        if (zL || objF2 == aVar.a()) {
            objF2 = new a(interfaceC6839p, interfaceC3551q0, null);
            interfaceC3540l.K(objF2);
        }
        O.f(j10, (InterfaceC6839p) objF2, interfaceC3540l, 6);
        if (AbstractC3546o.H()) {
            AbstractC3546o.P();
        }
        return interfaceC3551q0;
    }
}
