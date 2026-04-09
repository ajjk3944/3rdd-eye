package androidx.lifecycle;

import D9.InterfaceC0645g;
import androidx.lifecycle.AbstractC1781n;
import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: FlowExt.kt */
@h9.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
/* renamed from: androidx.lifecycle.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1775h extends h9.i implements p9.p<C9.u<Object>, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f16151l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f16152m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC1781n f16153n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC1781n.b f16154o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ D9.A f16155p;

    /* compiled from: FlowExt.kt */
    @h9.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.h$a */
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: l, reason: collision with root package name */
        public int f16156l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ D9.A f16157m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C9.u<Object> f16158n;

        /* compiled from: FlowExt.kt */
        /* renamed from: androidx.lifecycle.h$a$a, reason: collision with other inner class name */
        public static final class C0245a<T> implements InterfaceC0645g {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C9.u<T> f16159b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0245a(C9.u<? super T> uVar) {
                this.f16159b = uVar;
            }

            @Override // D9.InterfaceC0645g
            public final Object emit(T t10, InterfaceC4347e<? super C1992A> interfaceC4347e) {
                Object objM = this.f16159b.m(interfaceC4347e, t10);
                return objM == g9.a.COROUTINE_SUSPENDED ? objM : C1992A.f18074a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(D9.A a10, C9.u uVar, InterfaceC4347e interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f16157m = a10;
            this.f16158n = uVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f16157m, this.f16158n, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f16156l;
            if (i == 0) {
                b9.n.b(obj);
                C0245a c0245a = new C0245a(this.f16158n);
                this.f16156l = 1;
                if (this.f16157m.f1130b.b(c0245a, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775h(AbstractC1781n abstractC1781n, AbstractC1781n.b bVar, D9.A a10, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f16153n = abstractC1781n;
        this.f16154o = bVar;
        this.f16155p = a10;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        C1775h c1775h = new C1775h(this.f16153n, this.f16154o, this.f16155p, interfaceC4347e);
        c1775h.f16152m = obj;
        return c1775h;
    }

    @Override // p9.p
    public final Object invoke(C9.u<Object> uVar, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((C1775h) create(uVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        C9.u uVar;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f16151l;
        if (i == 0) {
            b9.n.b(obj);
            C9.u uVar2 = (C9.u) this.f16152m;
            a aVar2 = new a(this.f16155p, uVar2, null);
            this.f16152m = uVar2;
            this.f16151l = 1;
            if (N.a(this.f16153n, this.f16154o, aVar2, this) == aVar) {
                return aVar;
            }
            uVar = uVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uVar = (C9.u) this.f16152m;
            b9.n.b(obj);
        }
        uVar.h(null);
        return C1992A.f18074a;
    }
}
