package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.nativeads.creator.NativeMediaLoader$loadMedia$2", f = "NativeMediaLoader.kt", l = {42, 43, 44, 46}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e91 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super j41>, Object> {

    /* renamed from: b, reason: collision with root package name */
    A9.L f26740b;

    /* renamed from: c, reason: collision with root package name */
    int f26741c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f26742d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C4072a3 f26743e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f91 f26744f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Context f26745g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ j41 f26746h;
    final /* synthetic */ yv i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ ej0 f26747j;

    @h9.e(c = "com.monetization.ads.nativeads.creator.NativeMediaLoader$loadMedia$2$imagesLoadJob$1", f = "NativeMediaLoader.kt", l = {37}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f26748b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f91 f26749c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j41 f26750d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ej0 f26751e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f91 f91Var, j41 j41Var, ej0 ej0Var, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f26749c = f91Var;
            this.f26750d = j41Var;
            this.f26751e = ej0Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f26749c, this.f26750d, this.f26751e, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f26748b;
            if (i == 0) {
                b9.n.b(obj);
                w81 w81Var = this.f26749c.f27248a;
                j41 j41Var = this.f26750d;
                ej0 ej0Var = this.f26751e;
                this.f26748b = 1;
                if (w81Var.a(j41Var, ej0Var, this) == aVar) {
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

    @h9.e(c = "com.monetization.ads.nativeads.creator.NativeMediaLoader$loadMedia$2$loadVideoTask$1", f = "NativeMediaLoader.kt", l = {40}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super j41>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f26752b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f91 f26753c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f26754d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j41 f26755e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ yv f26756f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f91 f91Var, Context context, j41 j41Var, yv yvVar, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f26753c = f91Var;
            this.f26754d = context;
            this.f26755e = j41Var;
            this.f26756f = yvVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new b(this.f26753c, this.f26754d, this.f26755e, this.f26756f, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super j41> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) throws Throwable {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f26752b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            ua1 ua1Var = this.f26753c.f27250c;
            Context context = this.f26754d;
            j41 j41Var = this.f26755e;
            yv yvVar = this.f26756f;
            this.f26752b = 1;
            Object objA = ua1Var.a(true, context, j41Var, yvVar, this);
            return objA == aVar ? aVar : objA;
        }
    }

    @h9.e(c = "com.monetization.ads.nativeads.creator.NativeMediaLoader$loadMedia$2$webViewLoadJob$1", f = "NativeMediaLoader.kt", l = {38}, m = "invokeSuspend")
    public static final class c extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f26757b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f91 f26758c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f26759d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ j41 f26760e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f91 f91Var, Context context, j41 j41Var, InterfaceC4347e<? super c> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f26758c = f91Var;
            this.f26759d = context;
            this.f26760e = j41Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new c(this.f26758c, this.f26759d, this.f26760e, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return ((c) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f26757b;
            if (i == 0) {
                b9.n.b(obj);
                ac1 ac1Var = this.f26758c.f27249b;
                Context context = this.f26759d;
                j41 j41Var = this.f26760e;
                this.f26757b = 1;
                if (ac1Var.a(context, j41Var, this) == aVar) {
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
    public e91(C4072a3 c4072a3, f91 f91Var, Context context, j41 j41Var, yv yvVar, ej0 ej0Var, InterfaceC4347e<? super e91> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f26743e = c4072a3;
        this.f26744f = f91Var;
        this.f26745g = context;
        this.f26746h = j41Var;
        this.i = yvVar;
        this.f26747j = ej0Var;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        e91 e91Var = new e91(this.f26743e, this.f26744f, this.f26745g, this.f26746h, this.i, this.f26747j, interfaceC4347e);
        e91Var.f26742d = obj;
        return e91Var;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super j41> interfaceC4347e) {
        return ((e91) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[RETURN] */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r13.f26741c
            r2 = 3
            r3 = 0
            r4 = 4
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L35
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L23
            if (r1 == r2) goto L1f
            if (r1 != r4) goto L17
            b9.n.b(r14)
            return r14
        L17:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1f:
            b9.n.b(r14)
            return r14
        L23:
            java.lang.Object r1 = r13.f26742d
            A9.L r1 = (A9.L) r1
            b9.n.b(r14)
            goto L8f
        L2b:
            A9.L r1 = r13.f26740b
            java.lang.Object r4 = r13.f26742d
            A9.o0 r4 = (A9.InterfaceC0594o0) r4
            b9.n.b(r14)
            goto L82
        L35:
            b9.n.b(r14)
            java.lang.Object r14 = r13.f26742d
            A9.E r14 = (A9.E) r14
            com.yandex.mobile.ads.impl.a3 r1 = r13.f26743e
            boolean r1 = r1.u()
            if (r1 == 0) goto L9b
            com.yandex.mobile.ads.impl.e91$a r1 = new com.yandex.mobile.ads.impl.e91$a
            com.yandex.mobile.ads.impl.f91 r4 = r13.f26744f
            com.yandex.mobile.ads.impl.j41 r7 = r13.f26746h
            com.yandex.mobile.ads.impl.ej0 r8 = r13.f26747j
            r1.<init>(r4, r7, r8, r3)
            A9.K0 r1 = A9.C0575f.e(r14, r3, r3, r1, r2)
            com.yandex.mobile.ads.impl.e91$c r4 = new com.yandex.mobile.ads.impl.e91$c
            com.yandex.mobile.ads.impl.f91 r7 = r13.f26744f
            android.content.Context r8 = r13.f26745g
            com.yandex.mobile.ads.impl.j41 r9 = r13.f26746h
            r4.<init>(r7, r8, r9, r3)
            A9.K0 r4 = A9.C0575f.e(r14, r3, r3, r4, r2)
            com.yandex.mobile.ads.impl.e91$b r7 = new com.yandex.mobile.ads.impl.e91$b
            com.yandex.mobile.ads.impl.f91 r8 = r13.f26744f
            android.content.Context r9 = r13.f26745g
            com.yandex.mobile.ads.impl.j41 r10 = r13.f26746h
            com.yandex.mobile.ads.impl.yv r11 = r13.i
            r12 = 0
            r7.<init>(r8, r9, r10, r11, r12)
            A9.M r14 = A9.C0575f.b(r14, r3, r7, r2)
            r13.f26742d = r4
            r13.f26740b = r14
            r13.f26741c = r6
            java.lang.Object r1 = r1.w0(r13)
            if (r1 != r0) goto L81
            goto Lb1
        L81:
            r1 = r14
        L82:
            r13.f26742d = r1
            r13.f26740b = r3
            r13.f26741c = r5
            java.lang.Object r14 = r4.w0(r13)
            if (r14 != r0) goto L8f
            goto Lb1
        L8f:
            r13.f26742d = r3
            r13.f26741c = r2
            java.lang.Object r14 = r1.l(r13)
            if (r14 != r0) goto L9a
            goto Lb1
        L9a:
            return r14
        L9b:
            com.yandex.mobile.ads.impl.f91 r14 = r13.f26744f
            com.yandex.mobile.ads.impl.ua1 r5 = com.yandex.mobile.ads.impl.f91.b(r14)
            android.content.Context r7 = r13.f26745g
            com.yandex.mobile.ads.impl.j41 r8 = r13.f26746h
            com.yandex.mobile.ads.impl.yv r9 = r13.i
            r13.f26741c = r4
            r6 = 0
            r10 = r13
            java.lang.Object r14 = r5.a(r6, r7, r8, r9, r10)
            if (r14 != r0) goto Lb2
        Lb1:
            return r0
        Lb2:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
