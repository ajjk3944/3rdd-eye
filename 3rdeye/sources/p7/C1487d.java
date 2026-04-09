package P7;

import D9.InterfaceC0645g;
import D9.J;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: AdManager.kt */
@h9.e(c = "com.zipoapps.ads.AdManager$handleConfigurationReady$1", f = "AdManager.kt", l = {111}, m = "invokeSuspend")
/* renamed from: P7.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1487d extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f10735l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1484a f10736m;

    /* compiled from: AdManager.kt */
    /* renamed from: P7.d$a */
    public static final class a<T> implements InterfaceC0645g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1484a f10737b;

        public a(C1484a c1484a) {
            this.f10737b = c1484a;
        }

        @Override // D9.InterfaceC0645g
        public final Object emit(Object obj, InterfaceC4347e interfaceC4347e) {
            w9.i<Object>[] iVarArr = C1484a.f10712m;
            C1484a c1484a = this.f10737b;
            c1484a.getClass();
            c1484a.f10714a.registerActivityLifecycleCallbacks(new C1491h());
            return C1992A.f18074a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1487d(C1484a c1484a, InterfaceC4347e<? super C1487d> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f10736m = c1484a;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C1487d(this.f10736m, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C1487d) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws Throwable {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f10735l;
        if (i == 0) {
            b9.n.b(obj);
            C1484a c1484a = this.f10736m;
            J j4 = c1484a.f10724l;
            a aVar2 = new a(c1484a);
            this.f10735l = 1;
            Object objB = j4.b(new C1488e(aVar2), this);
            if (objB != aVar) {
                objB = C1992A.f18074a;
            }
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
        }
        return C1992A.f18074a;
    }
}
