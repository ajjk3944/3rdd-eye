package U7;

import A9.E;
import android.app.Activity;
import b9.C1992A;
import f9.InterfaceC4347e;
import p9.p;

/* compiled from: InterstitialProvider.kt */
@h9.e(c = "com.zipoapps.ads.interstitial.InterstitialProvider$showInterstitial$1", f = "InterstitialProvider.kt", l = {77, 78, 84}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class j extends h9.i implements p<E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public Object f12534l;

    /* renamed from: m, reason: collision with root package name */
    public int f12535m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m<Object> f12536n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Activity f12537o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f12538p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ f f12539q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f12540r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, Activity activity, String str, f fVar, h hVar, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f12536n = mVar;
        this.f12537o = activity;
        this.f12538p = str;
        this.f12539q = fVar;
        this.f12540r = hVar;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        f fVar = this.f12539q;
        h hVar = this.f12540r;
        return new j(this.f12536n, this.f12537o, this.f12538p, fVar, hVar, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((j) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005b A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:8:0x0017, B:35:0x0078, B:14:0x0025, B:24:0x004b, B:26:0x005b, B:27:0x005e, B:29:0x0062, B:31:0x006a, B:15:0x0029, B:21:0x003d, B:18:0x0030), top: B:44:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:8:0x0017, B:35:0x0078, B:14:0x0025, B:24:0x004b, B:26:0x005b, B:27:0x005e, B:29:0x0062, B:31:0x006a, B:15:0x0029, B:21:0x003d, B:18:0x0030), top: B:44:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006a A[Catch: Exception -> 0x001b, TryCatch #0 {Exception -> 0x001b, blocks: (B:8:0x0017, B:35:0x0078, B:14:0x0025, B:24:0x004b, B:26:0x005b, B:27:0x005e, B:29:0x0062, B:31:0x006a, B:15:0x0029, B:21:0x003d, B:18:0x0030), top: B:44:0x000d }] */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r8.f12535m
            U7.h r2 = r8.f12540r
            android.app.Activity r3 = r8.f12537o
            r4 = 3
            r5 = 2
            r6 = 1
            U7.m<java.lang.Object> r7 = r8.f12536n
            if (r1 == 0) goto L2d
            if (r1 == r6) goto L29
            if (r1 == r5) goto L25
            if (r1 != r4) goto L1d
            java.lang.Object r0 = r8.f12534l
            b9.n.b(r9)     // Catch: java.lang.Exception -> L1b
            goto L78
        L1b:
            r9 = move-exception
            goto L7c
        L1d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L25:
            b9.n.b(r9)     // Catch: java.lang.Exception -> L1b
            goto L4b
        L29:
            b9.n.b(r9)     // Catch: java.lang.Exception -> L1b
            goto L3d
        L2d:
            b9.n.b(r9)
            java.lang.String r9 = r8.f12538p     // Catch: java.lang.Exception -> L1b
            U7.f r1 = r8.f12539q     // Catch: java.lang.Exception -> L1b
            r8.f12535m = r6     // Catch: java.lang.Exception -> L1b
            java.lang.Object r9 = r7.b(r3, r9, r1, r8)     // Catch: java.lang.Exception -> L1b
            if (r9 != r0) goto L3d
            goto L76
        L3d:
            r8.f12535m = r5     // Catch: java.lang.Exception -> L1b
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Object r9 = r7.f(r5, r8)     // Catch: java.lang.Exception -> L1b
            if (r9 != r0) goto L4b
            goto L76
        L4b:
            D9.J r1 = r7.f12548b     // Catch: java.lang.Exception -> L1b
            r5 = 0
            r1.setValue(r5)     // Catch: java.lang.Exception -> L1b
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.f12549c     // Catch: java.lang.Exception -> L1b
            r6 = 0
            r1.set(r6)     // Catch: java.lang.Exception -> L1b
            A9.o0 r1 = r7.f12550d     // Catch: java.lang.Exception -> L1b
            if (r1 == 0) goto L5e
            r1.c(r5)     // Catch: java.lang.Exception -> L1b
        L5e:
            r7.f12550d = r5     // Catch: java.lang.Exception -> L1b
            if (r9 != 0) goto L6a
            P7.t$d r9 = P7.t.d.f10800b     // Catch: java.lang.Exception -> L1b
            r2.c(r9)     // Catch: java.lang.Exception -> L1b
            b9.A r9 = b9.C1992A.f18074a     // Catch: java.lang.Exception -> L1b
            return r9
        L6a:
            long r5 = r2.f10795b     // Catch: java.lang.Exception -> L1b
            r8.f12534l = r9     // Catch: java.lang.Exception -> L1b
            r8.f12535m = r4     // Catch: java.lang.Exception -> L1b
            java.lang.Object r1 = A9.O.a(r5, r8)     // Catch: java.lang.Exception -> L1b
            if (r1 != r0) goto L77
        L76:
            return r0
        L77:
            r0 = r9
        L78:
            r7.e(r3, r0, r2)     // Catch: java.lang.Exception -> L1b
            goto L90
        L7c:
            boolean r0 = r9 instanceof java.util.concurrent.TimeoutException
            if (r0 == 0) goto L83
            P7.t$e r9 = P7.t.e.f10801b
            goto L8d
        L83:
            P7.t$f r0 = new P7.t$f
            java.lang.String r9 = r9.getMessage()
            r0.<init>(r9)
            r9 = r0
        L8d:
            r2.c(r9)
        L90:
            b9.A r9 = b9.C1992A.f18074a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
