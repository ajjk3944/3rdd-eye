package i8;

import A9.C0575f;
import A9.C0585k;
import A9.E;
import A9.I;
import A9.L;
import A9.M;
import A9.O;
import D9.H;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.List;

/* compiled from: PremiumHelper.kt */
@h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2", f = "PremiumHelper.kt", l = {406}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class p extends h9.i implements p9.p<E, InterfaceC4347e<? super List<? extends Boolean>>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f38620l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f38621m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f38622n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.zipoapps.premiumhelper.e f38623o;

    /* compiled from: PremiumHelper.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2$1", f = "PremiumHelper.kt", l = {407}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<E, InterfaceC4347e<? super List<? extends Boolean>>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f38624l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ M f38625m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ M f38626n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(M m10, M m11, InterfaceC4347e interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f38625m = m10;
            this.f38626n = m11;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f38625m, this.f38626n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super List<? extends Boolean>> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f38624l;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            L[] lArr = {this.f38625m, this.f38626n};
            this.f38624l = 1;
            Object objI = I.i(lArr, this);
            return objI == aVar ? aVar : objI;
        }
    }

    /* compiled from: PremiumHelper.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2$initActions$1", f = "PremiumHelper.kt", l = {399}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<E, InterfaceC4347e<? super Boolean>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f38627l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.zipoapps.premiumhelper.e f38628m;

        /* compiled from: PremiumHelper.kt */
        @h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2$initActions$1$1", f = "PremiumHelper.kt", l = {}, m = "invokeSuspend")
        public static final class a extends h9.i implements p9.p<Boolean, InterfaceC4347e<? super Boolean>, Object> {

            /* renamed from: l, reason: collision with root package name */
            public /* synthetic */ boolean f38629l;

            public a() {
                throw null;
            }

            @Override // h9.AbstractC4424a
            public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
                a aVar = new a(2, interfaceC4347e);
                aVar.f38629l = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // p9.p
            public final Object invoke(Boolean bool, InterfaceC4347e<? super Boolean> interfaceC4347e) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((a) create(bool2, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
            }

            @Override // h9.AbstractC4424a
            public final Object invokeSuspend(Object obj) {
                g9.a aVar = g9.a.COROUTINE_SUSPENDED;
                b9.n.b(obj);
                return Boolean.valueOf(this.f38629l);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f38628m = eVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new b(this.f38628m, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super Boolean> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f38627l;
            if (i == 0) {
                b9.n.b(obj);
                com.zipoapps.premiumhelper.e eVar = this.f38628m;
                if (!((Boolean) eVar.f37029s.f1130b.getValue()).booleanValue()) {
                    a aVar2 = new a(2, null);
                    this.f38627l = 1;
                    if (H.e(eVar.f37029s, aVar2, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: PremiumHelper.kt */
    @h9.e(c = "com.zipoapps.premiumhelper.PremiumHelper$waitForInitComplete$2$minSplashTimeout$1", f = "PremiumHelper.kt", l = {393}, m = "invokeSuspend")
    public static final class c extends h9.i implements p9.p<E, InterfaceC4347e<? super Boolean>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f38630l;

        public c() {
            throw null;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new c(2, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(E e4, InterfaceC4347e<? super Boolean> interfaceC4347e) {
            return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f38630l;
            if (i == 0) {
                b9.n.b(obj);
                this.f38630l = 1;
                if (O.a(1500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j4, com.zipoapps.premiumhelper.e eVar, InterfaceC4347e<? super p> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f38622n = j4;
        this.f38623o = eVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        p pVar = new p(this.f38622n, this.f38623o, interfaceC4347e);
        pVar.f38621m = obj;
        return pVar;
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super List<? extends Boolean>> interfaceC4347e) {
        return ((p) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws Throwable {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f38620l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
            return obj;
        }
        b9.n.b(obj);
        E e4 = (E) this.f38621m;
        a aVar2 = new a(C0575f.b(e4, null, new c(2, null), 3), C0575f.b(e4, null, new b(this.f38623o, null), 3), null);
        this.f38620l = 1;
        Object objB = C0585k.b(this.f38622n, aVar2, this);
        return objB == aVar ? aVar : objB;
    }
}
