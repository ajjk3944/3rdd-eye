package D9;

import b9.C1992A;
import com.yandex.mobile.ads.impl.ga0;
import f9.InterfaceC4347e;

/* compiled from: Share.kt */
@h9.e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class s extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: l, reason: collision with root package name */
    public int f1247l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0644f<Object> f1248m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ J f1249n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ga0 f1250o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(InterfaceC0644f interfaceC0644f, J j4, ga0 ga0Var, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f1248m = interfaceC0644f;
        this.f1249n = j4;
        this.f1250o = ga0Var;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new s(this.f1248m, this.f1249n, this.f1250o, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((s) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r2.b(r3, r6) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
    
        if (r2.b(r3, r6) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        return r0;
     */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r6.f1247l
            D9.f<java.lang.Object> r2 = r6.f1248m
            D9.J r3 = r6.f1249n
            r4 = 1
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L16
            r4 = 3
            r5 = 2
            if (r1 == r5) goto L22
            if (r1 == r4) goto L16
            r0 = 4
            if (r1 != r0) goto L1a
        L16:
            b9.n.b(r7)
            goto L3a
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            b9.n.b(r7)
            r6.f1247l = r4
            java.lang.Object r7 = r2.b(r3, r6)
            if (r7 != r0) goto L3a
            goto L39
        L2e:
            b9.n.b(r7)
            r6.f1247l = r4
            java.lang.Object r7 = r2.b(r3, r6)
            if (r7 != r0) goto L3a
        L39:
            return r0
        L3a:
            b9.A r7 = b9.C1992A.f18074a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: D9.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
