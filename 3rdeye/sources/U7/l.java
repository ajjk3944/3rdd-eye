package U7;

import A9.E;
import D9.H;
import D9.J;
import b9.C1992A;
import f9.InterfaceC4347e;
import p9.p;

/* compiled from: InterstitialProvider.kt */
@h9.e(c = "com.zipoapps.ads.interstitial.InterstitialProvider$waitForInterstitial$2", f = "InterstitialProvider.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class l extends h9.i implements p<E, InterfaceC4347e<Object>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f12544l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ m<Object> f12545m;

    /* compiled from: InterstitialProvider.kt */
    @h9.e(c = "com.zipoapps.ads.interstitial.InterstitialProvider$waitForInterstitial$2$1", f = "InterstitialProvider.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h9.i implements p<Object, InterfaceC4347e<? super Boolean>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f12546l;

        public a() {
            throw null;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            a aVar = new a(2, interfaceC4347e);
            aVar.f12546l = obj;
            return aVar;
        }

        @Override // p9.p
        public final Object invoke(Object obj, InterfaceC4347e<? super Boolean> interfaceC4347e) {
            return ((a) create(obj, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            return Boolean.valueOf(this.f12546l != null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m<Object> mVar, InterfaceC4347e<? super l> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f12545m = mVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new l(this.f12545m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<Object> interfaceC4347e) {
        return ((l) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f12544l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
            return obj;
        }
        b9.n.b(obj);
        J j4 = this.f12545m.f12548b;
        a aVar2 = new a(2, null);
        this.f12544l = 1;
        Object objE = H.e(j4, aVar2, this);
        return objE == aVar ? aVar : objE;
    }
}
