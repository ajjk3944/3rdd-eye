package defpackage;

import com.phuongpn.whousemywifi.networkscanner.MainActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class va0 extends mz0 implements hy {
    public int j;
    public final /* synthetic */ long k;
    public final /* synthetic */ so1 l;
    public final /* synthetic */ MainActivity m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va0(long j, so1 so1Var, MainActivity mainActivity, oj ojVar) {
        super(2, ojVar);
        this.k = j;
        this.l = so1Var;
        this.m = mainActivity;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) {
        return ((va0) h((oj) obj2, (qk) obj)).m(z31.a);
    }

    @Override // defpackage.s9
    public final oj h(oj ojVar, Object obj) {
        return new va0(this.k, this.l, this.m, ojVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a7, code lost:
    
        if (r10 == r6) goto L31;
     */
    @Override // defpackage.s9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            so1 r0 = r9.l
            int r1 = r9.j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L15:
            defpackage.bd2.x(r10)     // Catch: java.io.IOException -> Lad
            goto L83
        L19:
            defpackage.bd2.x(r10)
            java.lang.String r10 = ""
            r1 = 3
            r4 = r10
        L20:
            r5 = -1
            if (r5 >= r1) goto L43
            int r5 = r1 * 8
            long r6 = r9.k
            long r5 = r6 >> r5
            r7 = 255(0xff, double:1.26E-321)
            long r5 = r5 & r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r4)
            r7.append(r5)
            java.lang.String r4 = "."
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            int r1 = r1 + (-1)
            goto L20
        L43:
            int r1 = r4.length()
            int r1 = r1 - r3
            r5 = 0
            java.lang.String r1 = r4.substring(r5, r1)
            java.lang.String r4 = "substring(...)"
            defpackage.i30.l(r1, r4)
            d10 r4 = new d10
            r4.<init>()
            ro r5 = defpackage.ro.j
            r4.a = r5
            r4.c = r10
            java.lang.String r5 = "00:00:00:00:00:00"
            r4.d = r5
            r4.e = r10
            r10 = 2131230891(0x7f0800ab, float:1.8077848E38)
            r4.f = r10
            r4.b = r1
            java.lang.String r10 = defpackage.i41.k(r1)     // Catch: java.io.IOException -> Lad
            r4.d = r10     // Catch: java.io.IOException -> Lad
            boolean r10 = r5.equals(r10)     // Catch: java.io.IOException -> Lad
            com.phuongpn.whousemywifi.networkscanner.MainActivity r5 = r9.m
            rk r6 = defpackage.rk.f
            if (r10 != 0) goto L86
            r9.j = r3     // Catch: java.io.IOException -> Lad
            java.lang.Object r10 = com.phuongpn.whousemywifi.networkscanner.MainActivity.y(r5, r4, r9)     // Catch: java.io.IOException -> Lad
            if (r10 != r6) goto L83
            goto La9
        L83:
            d10 r10 = (defpackage.d10) r10     // Catch: java.io.IOException -> Lad
            return r10
        L86:
            java.net.InetAddress r10 = java.net.InetAddress.getByName(r1)     // Catch: java.io.IOException -> Lad
            int r3 = r0.f     // Catch: java.io.IOException -> Lad
            boolean r10 = r10.isReachable(r3)     // Catch: java.io.IOException -> Lad
            if (r10 == 0) goto Laa
            java.lang.String r10 = r5.R     // Catch: java.io.IOException -> Lad
            java.lang.String r3 = r4.b     // Catch: java.io.IOException -> Lad
            boolean r10 = defpackage.i30.c(r10, r3)     // Catch: java.io.IOException -> Lad
            if (r10 != 0) goto La1
            r0.h = r1     // Catch: java.io.IOException -> Lad
            r0.a()     // Catch: java.io.IOException -> Lad
        La1:
            r9.j = r2     // Catch: java.io.IOException -> Lad
            java.lang.Object r10 = com.phuongpn.whousemywifi.networkscanner.MainActivity.y(r5, r4, r9)     // Catch: java.io.IOException -> Lad
            if (r10 != r6) goto L83
        La9:
            return r6
        Laa:
            z31 r10 = defpackage.z31.a
            return r10
        Lad:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.va0.m(java.lang.Object):java.lang.Object");
    }
}
