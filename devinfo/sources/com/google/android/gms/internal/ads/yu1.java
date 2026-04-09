package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class yu1 {

    /* renamed from: h, reason: collision with root package name */
    public static final Random f18875h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public av1 f18879d;

    /* renamed from: f, reason: collision with root package name */
    public String f18881f;

    /* renamed from: a, reason: collision with root package name */
    public final fh f18876a = new fh();

    /* renamed from: b, reason: collision with root package name */
    public final tg f18877b = new tg();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18878c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public uh f18880e = uh.f17203a;
    public long g = -1;

    public final synchronized String a(uh uhVar, jy1 jy1Var) {
        return g(uhVar.o(jy1Var.f12875a, this.f18877b).f16811c, jy1Var).f18508a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0058, B:32:0x0062, B:35:0x0069, B:37:0x006f, B:39:0x0082, B:40:0x0096, B:42:0x009a, B:43:0x009c, B:45:0x00a6, B:47:0x00aa, B:53:0x00b8), top: B:56:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0058, B:32:0x0062, B:35:0x0069, B:37:0x006f, B:39:0x0082, B:40:0x0096, B:42:0x009a, B:43:0x009c, B:45:0x00a6, B:47:0x00aa, B:53:0x00b8), top: B:56:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0058, B:32:0x0062, B:35:0x0069, B:37:0x006f, B:39:0x0082, B:40:0x0096, B:42:0x009a, B:43:0x009c, B:45:0x00a6, B:47:0x00aa, B:53:0x00b8), top: B:56:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(com.google.android.gms.internal.ads.qu1 r15) {
        /*
            r14 = this;
            r0 = 0
            long r2 = com.google.android.gms.internal.ads.bq0.r(r0)
            monitor-enter(r14)
            com.google.android.gms.internal.ads.av1 r4 = r14.f18879d     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto Lb7
            com.google.android.gms.internal.ads.uh r4 = r15.f15448b     // Catch: java.lang.Throwable -> L56
            boolean r5 = r4.g()     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L15
            goto Lb5
        L15:
            com.google.android.gms.internal.ads.jy1 r5 = r15.f15450d     // Catch: java.lang.Throwable -> L56
            if (r5 == 0) goto L58
            long r6 = r5.f12878d     // Catch: java.lang.Throwable -> L56
            r8 = -1
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L3d
            java.util.HashMap r10 = r14.f18878c     // Catch: java.lang.Throwable -> L56
            java.lang.String r11 = r14.f18881f     // Catch: java.lang.Throwable -> L56
            java.lang.Object r10 = r10.get(r11)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.internal.ads.xu1 r10 = (com.google.android.gms.internal.ads.xu1) r10     // Catch: java.lang.Throwable -> L56
            if (r10 == 0) goto L34
            long r10 = r10.f18510c     // Catch: java.lang.Throwable -> L56
            int r12 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r12 == 0) goto L34
            goto L39
        L34:
            long r10 = r14.g     // Catch: java.lang.Throwable -> L56
            r12 = 1
            long r10 = r10 + r12
        L39:
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 < 0) goto Lb5
        L3d:
            java.util.HashMap r6 = r14.f18878c     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = r14.f18881f     // Catch: java.lang.Throwable -> L56
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.internal.ads.xu1 r6 = (com.google.android.gms.internal.ads.xu1) r6     // Catch: java.lang.Throwable -> L56
            if (r6 == 0) goto L58
            long r10 = r6.f18510c     // Catch: java.lang.Throwable -> L56
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L58
            int r6 = r6.f18509b     // Catch: java.lang.Throwable -> L56
            int r7 = r15.f15449c     // Catch: java.lang.Throwable -> L56
            if (r6 != r7) goto Lb5
            goto L58
        L56:
            r15 = move-exception
            goto Lb9
        L58:
            int r6 = r15.f15449c     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.internal.ads.xu1 r7 = r14.g(r6, r5)     // Catch: java.lang.Throwable -> L56
            java.lang.String r8 = r14.f18881f     // Catch: java.lang.Throwable -> L56
            if (r8 != 0) goto L66
            java.lang.String r8 = r7.f18508a     // Catch: java.lang.Throwable -> L56
            r14.f18881f = r8     // Catch: java.lang.Throwable -> L56
        L66:
            r8 = 1
            if (r5 == 0) goto L96
            boolean r9 = r5.b()     // Catch: java.lang.Throwable -> L56
            if (r9 == 0) goto L96
            java.lang.Object r9 = r5.f12875a     // Catch: java.lang.Throwable -> L56
            long r10 = r5.f12878d     // Catch: java.lang.Throwable -> L56
            int r5 = r5.f12876b     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.internal.ads.jy1 r12 = new com.google.android.gms.internal.ads.jy1     // Catch: java.lang.Throwable -> L56
            r12.<init>(r9, r10, r5)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.internal.ads.xu1 r6 = r14.g(r6, r12)     // Catch: java.lang.Throwable -> L56
            boolean r10 = r6.f18512e     // Catch: java.lang.Throwable -> L56
            if (r10 != 0) goto L96
            r6.f18512e = r8     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.internal.ads.tg r6 = r14.f18877b     // Catch: java.lang.Throwable -> L56
            r4.o(r9, r6)     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.internal.ads.mu r4 = r6.f16814f     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.internal.ads.a r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L56
            r4.getClass()     // Catch: java.lang.Throwable -> L56
            long r2 = r2 + r2
            java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> L56
        L96:
            boolean r0 = r7.f18512e     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto L9c
            r7.f18512e = r8     // Catch: java.lang.Throwable -> L56
        L9c:
            java.lang.String r0 = r7.f18508a     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = r14.f18881f     // Catch: java.lang.Throwable -> L56
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L56
            if (r0 == 0) goto Lb5
            boolean r0 = r7.f18513f     // Catch: java.lang.Throwable -> L56
            if (r0 != 0) goto Lb5
            r7.f18513f = r8     // Catch: java.lang.Throwable -> L56
            com.google.android.gms.internal.ads.av1 r0 = r14.f18879d     // Catch: java.lang.Throwable -> L56
            java.lang.String r1 = r7.f18508a     // Catch: java.lang.Throwable -> L56
            r0.r(r15, r1)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r14)
            return
        Lb5:
            monitor-exit(r14)
            return
        Lb7:
            r15 = 0
            throw r15     // Catch: java.lang.Throwable -> L56
        Lb9:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L56
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yu1.b(com.google.android.gms.internal.ads.qu1):void");
    }

    public final synchronized void c(qu1 qu1Var, int i4) {
        try {
            if (this.f18879d == null) {
                throw null;
            }
            Iterator it = this.f18878c.values().iterator();
            while (it.hasNext()) {
                xu1 xu1Var = (xu1) it.next();
                if (xu1Var.b(qu1Var)) {
                    it.remove();
                    if (xu1Var.f18508a.equals(this.f18881f)) {
                        f(xu1Var);
                    }
                    if (xu1Var.f18512e) {
                        this.f18879d.s(qu1Var, xu1Var.f18508a);
                    }
                }
            }
            e(qu1Var);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(qu1 qu1Var) {
        av1 av1Var;
        try {
            String str = this.f18881f;
            if (str != null) {
                xu1 xu1Var = (xu1) this.f18878c.get(str);
                if (xu1Var == null) {
                    throw null;
                }
                f(xu1Var);
            }
            Iterator it = this.f18878c.values().iterator();
            while (it.hasNext()) {
                xu1 xu1Var2 = (xu1) it.next();
                it.remove();
                if (xu1Var2.f18512e && (av1Var = this.f18879d) != null) {
                    av1Var.s(qu1Var, xu1Var2.f18508a);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e(qu1 qu1Var) {
        jy1 jy1Var;
        boolean zG = qu1Var.f15448b.g();
        HashMap map = this.f18878c;
        if (zG) {
            String str = this.f18881f;
            if (str != null) {
                xu1 xu1Var = (xu1) map.get(str);
                xu1Var.getClass();
                f(xu1Var);
                return;
            }
            return;
        }
        xu1 xu1Var2 = (xu1) map.get(this.f18881f);
        int i4 = qu1Var.f15449c;
        jy1 jy1Var2 = qu1Var.f15450d;
        this.f18881f = g(i4, jy1Var2).f18508a;
        b(qu1Var);
        if (jy1Var2 != null) {
            long j = jy1Var2.f12878d;
            if (jy1Var2.b()) {
                if (xu1Var2 != null && xu1Var2.f18510c == j && (jy1Var = xu1Var2.f18511d) != null) {
                    if (jy1Var.f12876b == jy1Var2.f12876b) {
                        if (jy1Var.f12877c == jy1Var2.f12877c) {
                            return;
                        }
                    }
                }
                g(i4, new jy1(jy1Var2.f12875a, j));
            }
        }
    }

    public final void f(xu1 xu1Var) {
        long j = xu1Var.f18510c;
        if (j != -1 && xu1Var.f18512e) {
            this.g = j;
        }
        this.f18881f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.xu1 g(int r19, com.google.android.gms.internal.ads.jy1 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.f18878c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La4
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.ads.xu1 r8 = (com.google.android.gms.internal.ads.xu1) r8
            long r9 = r8.f18510c
            com.google.android.gms.internal.ads.jy1 r11 = r8.f18511d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.f18509b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            com.google.android.gms.internal.ads.yu1 r9 = r8.g
            long r14 = r2.f12878d
            java.util.HashMap r10 = r9.f18878c
            r16 = r12
            java.lang.String r12 = r9.f18881f
            java.lang.Object r10 = r10.get(r12)
            com.google.android.gms.internal.ads.xu1 r10 = (com.google.android.gms.internal.ads.xu1) r10
            if (r10 == 0) goto L4b
            long r12 = r10.f18510c
            int r10 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r10 == 0) goto L4b
            goto L50
        L4b:
            long r9 = r9.g
            r12 = 1
            long r12 = r12 + r9
        L50:
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 < 0) goto L59
            r8.f18510c = r14
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 == 0) goto L84
            long r9 = r2.f12878d
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 != 0) goto L62
            goto L84
        L62:
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.f18510c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L88
        L71:
            long r12 = r11.f12878d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.f12876b
            int r10 = r11.f12876b
            if (r9 != r10) goto L16
            int r9 = r2.f12877c
            int r10 = r11.f12877c
            if (r9 != r10) goto L16
            goto L88
        L84:
            int r9 = r8.f18509b
            if (r1 != r9) goto L16
        L88:
            long r9 = r8.f18510c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 >= 0) goto L93
            goto La0
        L93:
            if (r12 != 0) goto L16
            java.lang.String r9 = com.google.android.gms.internal.ads.bq0.f9768a
            com.google.android.gms.internal.ads.jy1 r9 = r7.f18511d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r7 = r8
            goto L16
        La0:
            r7 = r8
            r5 = r9
            goto L16
        La4:
            if (r7 != 0) goto Lbe
            r4 = 12
            byte[] r4 = new byte[r4]
            java.util.Random r5 = com.google.android.gms.internal.ads.yu1.f18875h
            r5.nextBytes(r4)
            r5 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
            com.google.android.gms.internal.ads.xu1 r5 = new com.google.android.gms.internal.ads.xu1
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
            return r5
        Lbe:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yu1.g(int, com.google.android.gms.internal.ads.jy1):com.google.android.gms.internal.ads.xu1");
    }
}
