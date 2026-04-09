package A9;

import b9.C1992A;
import f9.InterfaceC4347e;

/* compiled from: JobSupport.kt */
@h9.e(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {963, 965}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class w0 extends h9.h implements p9.p<x9.i<? super InterfaceC0594o0>, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: m, reason: collision with root package name */
    public F9.k f290m;

    /* renamed from: n, reason: collision with root package name */
    public F9.m f291n;

    /* renamed from: o, reason: collision with root package name */
    public int f292o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f293p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0605u0 f294q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(C0605u0 c0605u0, InterfaceC4347e<? super w0> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f294q = c0605u0;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        w0 w0Var = new w0(this.f294q, interfaceC4347e);
        w0Var.f293p = obj;
        return w0Var;
    }

    @Override // p9.p
    public final Object invoke(x9.i<? super InterfaceC0594o0> iVar, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return ((w0) create(iVar, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        if (r6.a(r1, r5) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r4.a(((A9.C0593o) r1).f262f, r5) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0065 -> B:27:0x007b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0078 -> B:27:0x007b). Please report as a decompilation issue!!! */
    @Override // h9.AbstractC4424a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            g9.a r0 = g9.a.COROUTINE_SUSPENDED
            int r1 = r5.f292o
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            F9.m r1 = r5.f291n
            F9.k r3 = r5.f290m
            java.lang.Object r4 = r5.f293p
            x9.i r4 = (x9.i) r4
            b9.n.b(r6)
            goto L7b
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            b9.n.b(r6)
            goto L80
        L24:
            b9.n.b(r6)
            java.lang.Object r6 = r5.f293p
            x9.i r6 = (x9.i) r6
            A9.u0 r1 = r5.f294q
            java.lang.Object r1 = r1.L()
            boolean r4 = r1 instanceof A9.C0593o
            if (r4 == 0) goto L42
            A9.o r1 = (A9.C0593o) r1
            A9.u0 r1 = r1.f262f
            r5.f292o = r3
            g9.a r6 = r6.a(r1, r5)
            if (r6 != r0) goto L80
            goto L7a
        L42:
            boolean r3 = r1 instanceof A9.InterfaceC0584j0
            if (r3 == 0) goto L80
            A9.j0 r1 = (A9.InterfaceC0584j0) r1
            A9.D0 r1 = r1.c()
            if (r1 == 0) goto L80
            java.lang.Object r3 = r1.f()
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.l.d(r3, r4)
            F9.m r3 = (F9.m) r3
            r4 = r3
            r3 = r1
            r1 = r4
            r4 = r6
        L5d:
            boolean r6 = r1.equals(r3)
            if (r6 != 0) goto L80
            boolean r6 = r1 instanceof A9.C0593o
            if (r6 == 0) goto L7b
            r6 = r1
            A9.o r6 = (A9.C0593o) r6
            r5.f293p = r4
            r5.f290m = r3
            r5.f291n = r1
            r5.f292o = r2
            A9.u0 r6 = r6.f262f
            g9.a r6 = r4.a(r6, r5)
            if (r6 != r0) goto L7b
        L7a:
            return r0
        L7b:
            F9.m r1 = r1.g()
            goto L5d
        L80:
            b9.A r6 = b9.C1992A.f18074a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: A9.w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
