package g8;

import android.content.Context;
import java.util.List;
import l8.l;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final l8.j f9401a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9402b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9403c;

    /* renamed from: d, reason: collision with root package name */
    public final l8.j f9404d;

    /* renamed from: e, reason: collision with root package name */
    public final m8.h f9405e;

    /* renamed from: f, reason: collision with root package name */
    public final a8.b f9406f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9407g;

    public j(l8.j jVar, List list, int i10, l8.j jVar2, m8.h hVar, a8.b bVar, boolean z10) {
        this.f9401a = jVar;
        this.f9402b = list;
        this.f9403c = i10;
        this.f9404d = jVar2;
        this.f9405e = hVar;
        this.f9406f = bVar;
        this.f9407g = z10;
    }

    public final void a(l8.j jVar, h hVar) {
        Context context = jVar.f14922a;
        l8.j jVar2 = this.f9401a;
        if (context != jVar2.f14922a) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's context.").toString());
        }
        if (jVar.f14923b == l.f14946b) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot set the request's data to null.").toString());
        }
        if (jVar.f14924c != jVar2.f14924c) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's target.").toString());
        }
        if (jVar.f14940u != jVar2.f14940u) {
            throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's lifecycle.").toString());
        }
        if (jVar.f14941v == jVar2.f14941v) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + hVar + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(l8.j r13, rq.c r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof g8.i
            if (r0 == 0) goto L13
            r0 = r14
            g8.i r0 = (g8.i) r0
            int r1 = r0.D
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.D = r1
            goto L18
        L13:
            g8.i r0 = new g8.i
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f9400y
            qq.a r1 = qq.a.COROUTINE_SUSPENDED
            int r2 = r0.D
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            g8.h r13 = r0.f9399x
            g8.j r0 = r0.f9398r
            lf.t1.G(r14)
            goto L70
        L2b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L33:
            lf.t1.G(r14)
            java.util.List r14 = r12.f9402b
            int r2 = r12.f9403c
            if (r2 <= 0) goto L47
            int r4 = r2 + (-1)
            java.lang.Object r4 = r14.get(r4)
            g8.h r4 = (g8.h) r4
            r12.a(r13, r4)
        L47:
            java.lang.Object r14 = r14.get(r2)
            g8.h r14 = (g8.h) r14
            int r7 = r2 + 1
            g8.j r4 = new g8.j
            a8.b r10 = r12.f9406f
            boolean r11 = r12.f9407g
            l8.j r5 = r12.f9401a
            java.util.List r6 = r12.f9402b
            m8.h r9 = r12.f9405e
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.f9398r = r12
            r0.f9399x = r14
            r0.D = r3
            java.lang.Object r13 = r14.d(r4, r0)
            if (r13 != r1) goto L6c
            return r1
        L6c:
            r0 = r14
            r14 = r13
            r13 = r0
            r0 = r12
        L70:
            l8.k r14 = (l8.k) r14
            l8.j r1 = r14.a()
            r0.a(r1, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: g8.j.b(l8.j, rq.c):java.lang.Object");
    }
}
