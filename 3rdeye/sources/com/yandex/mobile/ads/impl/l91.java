package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;
import b9.C1992A;
import b9.m;
import com.yandex.mobile.ads.impl.k91;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.nativeads.creator.NativeResourcesLoader$load$1", f = "NativeResourcesLoader.kt", l = {55, 57}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class l91 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: b, reason: collision with root package name */
    A9.L f29929b;

    /* renamed from: c, reason: collision with root package name */
    int f29930c;

    /* renamed from: d, reason: collision with root package name */
    private /* synthetic */ Object f29931d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f29932e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ x41 f29933f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ k91.a f29934g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ k91 f29935h;
    final /* synthetic */ C4072a3 i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ j41 f29936j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ yv f29937k;

    @h9.e(c = "com.monetization.ads.nativeads.creator.NativeResourcesLoader$load$1$1", f = "NativeResourcesLoader.kt", l = {55}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f29938b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k91 f29939c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ j41 f29940d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k91 k91Var, j41 j41Var, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f29939c = k91Var;
            this.f29940d = j41Var;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f29939c, this.f29940d, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
            return new a(this.f29939c, this.f29940d, interfaceC4347e).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f29938b;
            if (i == 0) {
                b9.n.b(obj);
                fa1 fa1Var = this.f29939c.f29569c;
                j41 j41Var = this.f29940d;
                this.f29938b = 1;
                if (fa1Var.a(j41Var, this) == aVar) {
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

    @h9.e(c = "com.monetization.ads.nativeads.creator.NativeResourcesLoader$load$1$updatedNativeAdBlockTask$1", f = "NativeResourcesLoader.kt", l = {50}, m = "invokeSuspend")
    public static final class b extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super j41>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f29941b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f29942c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ k91 f29943d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C4072a3 f29944e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f29945f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ j41 f29946g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ sk1 f29947h;
        final /* synthetic */ yv i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k91 k91Var, C4072a3 c4072a3, Context context, j41 j41Var, sk1 sk1Var, yv yvVar, InterfaceC4347e<? super b> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f29943d = k91Var;
            this.f29944e = c4072a3;
            this.f29945f = context;
            this.f29946g = j41Var;
            this.f29947h = sk1Var;
            this.i = yvVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            b bVar = new b(this.f29943d, this.f29944e, this.f29945f, this.f29946g, this.f29947h, this.i, interfaceC4347e);
            bVar.f29942c = obj;
            return bVar;
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super j41> interfaceC4347e) {
            return ((b) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f29941b;
            try {
                if (i == 0) {
                    b9.n.b(obj);
                    k91 k91Var = this.f29943d;
                    C4072a3 c4072a3 = this.f29944e;
                    Context context = this.f29945f;
                    j41 j41Var = this.f29946g;
                    sk1 sk1Var = this.f29947h;
                    yv yvVar = this.i;
                    f91 f91Var = k91Var.f29568b;
                    this.f29941b = 1;
                    f91Var.getClass();
                    obj = C0575f.h(A9.U.f212b, new e91(c4072a3, f91Var, context, j41Var, yvVar, sk1Var, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b9.n.b(obj);
                }
                objA = (j41) obj;
            } catch (Throwable th) {
                objA = b9.n.a(th);
            }
            if (objA instanceof m.a) {
                return null;
            }
            return objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l91(Context context, x41 x41Var, k91.a aVar, k91 k91Var, C4072a3 c4072a3, j41 j41Var, yv yvVar, InterfaceC4347e<? super l91> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f29932e = context;
        this.f29933f = x41Var;
        this.f29934g = aVar;
        this.f29935h = k91Var;
        this.i = c4072a3;
        this.f29936j = j41Var;
        this.f29937k = yvVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        l91 l91Var = new l91(this.f29932e, this.f29933f, this.f29934g, this.f29935h, this.i, this.f29936j, this.f29937k, interfaceC4347e);
        l91Var.f29931d = obj;
        return l91Var;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((l91) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r13.f29930c
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L27
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            java.lang.Object r0 = r13.f29931d
            com.yandex.mobile.ads.impl.sk1 r0 = (com.yandex.mobile.ads.impl.sk1) r0
            b9.n.b(r14)
            goto L74
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            A9.L r1 = r13.f29929b
            java.lang.Object r4 = r13.f29931d
            com.yandex.mobile.ads.impl.sk1 r4 = (com.yandex.mobile.ads.impl.sk1) r4
            b9.n.b(r14)
            goto L66
        L27:
            b9.n.b(r14)
            java.lang.Object r14 = r13.f29931d
            A9.E r14 = (A9.E) r14
            com.yandex.mobile.ads.impl.sk1 r10 = new com.yandex.mobile.ads.impl.sk1
            android.content.Context r1 = r13.f29932e
            r10.<init>(r1)
            com.yandex.mobile.ads.impl.l91$b r5 = new com.yandex.mobile.ads.impl.l91$b
            com.yandex.mobile.ads.impl.k91 r6 = r13.f29935h
            com.yandex.mobile.ads.impl.a3 r7 = r13.i
            android.content.Context r8 = r13.f29932e
            com.yandex.mobile.ads.impl.j41 r9 = r13.f29936j
            com.yandex.mobile.ads.impl.yv r11 = r13.f29937k
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r1 = 3
            A9.M r5 = A9.C0575f.b(r14, r2, r5, r1)
            com.yandex.mobile.ads.impl.l91$a r6 = new com.yandex.mobile.ads.impl.l91$a
            com.yandex.mobile.ads.impl.k91 r7 = r13.f29935h
            com.yandex.mobile.ads.impl.j41 r8 = r13.f29936j
            r6.<init>(r7, r8, r2)
            A9.K0 r14 = A9.C0575f.e(r14, r2, r2, r6, r1)
            r13.f29931d = r10
            r13.f29929b = r5
            r13.f29930c = r4
            java.lang.Object r14 = r14.w0(r13)
            if (r14 != r0) goto L64
            goto L72
        L64:
            r1 = r5
            r4 = r10
        L66:
            r13.f29931d = r4
            r13.f29929b = r2
            r13.f29930c = r3
            java.lang.Object r14 = r1.l(r13)
            if (r14 != r0) goto L73
        L72:
            return r0
        L73:
            r0 = r4
        L74:
            com.yandex.mobile.ads.impl.j41 r14 = (com.yandex.mobile.ads.impl.j41) r14
            if (r14 != 0) goto L82
            com.yandex.mobile.ads.impl.x41 r14 = r13.f29933f
            com.yandex.mobile.ads.impl.i3 r0 = com.yandex.mobile.ads.impl.i7.d()
            r14.a(r0)
            goto L87
        L82:
            com.yandex.mobile.ads.impl.k91$a r1 = r13.f29934g
            r1.a(r0, r14)
        L87:
            b9.A r14 = b9.C1992A.f18074a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.l91.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
