package y1;

import A9.E;
import b9.C1992A;
import f9.InterfaceC4347e;
import kotlin.jvm.internal.w;

/* compiled from: ConnectionPoolImpl.kt */
@h9.e(c = "androidx.room.coroutines.ConnectionPoolImpl$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {171}, m = "invokeSuspend")
/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5792c extends h9.i implements p9.p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public w f47923l;

    /* renamed from: m, reason: collision with root package name */
    public int f47924m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ w<C5797h> f47925n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ j f47926o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5792c(w<C5797h> wVar, j jVar, InterfaceC4347e<? super C5792c> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f47925n = wVar;
        this.f47926o = jVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new C5792c(this.f47925n, this.f47926o, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C5792c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        w<C5797h> wVar;
        T t10;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f47924m;
        if (i == 0) {
            b9.n.b(obj);
            w<C5797h> wVar2 = this.f47925n;
            this.f47923l = wVar2;
            this.f47924m = 1;
            Object objA = this.f47926o.a(this);
            if (objA == aVar) {
                return aVar;
            }
            wVar = wVar2;
            t10 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wVar = this.f47923l;
            b9.n.b(obj);
            t10 = obj;
        }
        wVar.f43660b = t10;
        return C1992A.f18074a;
    }
}
