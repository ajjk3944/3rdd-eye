package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* loaded from: classes.dex */
public final class IO {

    /* renamed from: h, reason: collision with root package name */
    public static final Random f9093h = new Random();

    /* renamed from: d, reason: collision with root package name */
    public LO f9097d;

    /* renamed from: f, reason: collision with root package name */
    public String f9099f;

    /* renamed from: a, reason: collision with root package name */
    public final U7 f9094a = new U7();

    /* renamed from: b, reason: collision with root package name */
    public final I7 f9095b = new I7();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9096c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public AbstractC1353j8 f9098e = AbstractC1353j8.f14909a;

    /* renamed from: g, reason: collision with root package name */
    public long f9100g = -1;

    public final synchronized String a(AbstractC1353j8 abstractC1353j8, C1749qQ c1749qQ) {
        return g(abstractC1353j8.o(c1749qQ.f16374a, this.f9095b).f9072c, c1749qQ).f8911a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0021, B:15:0x002d, B:18:0x0034, B:21:0x003d, B:23:0x0049, B:25:0x004f, B:30:0x0059, B:32:0x0063, B:35:0x006a, B:37:0x0070, B:39:0x0083, B:40:0x0097, B:42:0x009b, B:43:0x009d, B:45:0x00a7, B:47:0x00ab, B:49:0x00b8, B:52:0x00bf, B:58:0x00dc), top: B:61:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(com.google.android.gms.internal.ads.BO r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.IO.b(com.google.android.gms.internal.ads.BO):void");
    }

    public final synchronized void c(BO bo, int i) {
        try {
            if (this.f9097d == null) {
                throw null;
            }
            Iterator it = this.f9096c.values().iterator();
            while (it.hasNext()) {
                HO ho = (HO) it.next();
                if (ho.b(bo)) {
                    it.remove();
                    if (ho.f8911a.equals(this.f9099f)) {
                        f(ho);
                    }
                    if (ho.f8915e) {
                        this.f9097d.q(bo, ho.f8911a);
                    }
                }
            }
            e(bo);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(BO bo) {
        LO lo;
        try {
            String str = this.f9099f;
            if (str != null) {
                HO ho = (HO) this.f9096c.get(str);
                if (ho == null) {
                    throw null;
                }
                f(ho);
            }
            Iterator it = this.f9096c.values().iterator();
            while (it.hasNext()) {
                HO ho2 = (HO) it.next();
                it.remove();
                if (ho2.f8915e && (lo = this.f9097d) != null) {
                    lo.q(bo, ho2.f8911a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e(BO bo) {
        C1749qQ c1749qQ;
        boolean zG = bo.f7344b.g();
        HashMap map = this.f9096c;
        if (zG) {
            String str = this.f9099f;
            if (str != null) {
                HO ho = (HO) map.get(str);
                ho.getClass();
                f(ho);
                return;
            }
            return;
        }
        HO ho2 = (HO) map.get(this.f9099f);
        int i = bo.f7345c;
        C1749qQ c1749qQ2 = bo.f7346d;
        this.f9099f = g(i, c1749qQ2).f8911a;
        b(bo);
        if (c1749qQ2 != null) {
            long j6 = c1749qQ2.f16377d;
            if (c1749qQ2.b()) {
                if (ho2 != null && ho2.f8913c == j6 && (c1749qQ = ho2.f8914d) != null) {
                    if (c1749qQ.f16375b == c1749qQ2.f16375b) {
                        if (c1749qQ.f16376c == c1749qQ2.f16376c) {
                            return;
                        }
                    }
                }
                g(i, new C1749qQ(j6, c1749qQ2.f16374a));
            }
        }
    }

    public final void f(HO ho) {
        long j6 = ho.f8913c;
        if (j6 != -1 && ho.f8915e) {
            this.f9100g = j6;
        }
        this.f9099f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a0 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.HO g(int r19, com.google.android.gms.internal.ads.C1749qQ r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.f9096c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto La4
            java.lang.Object r8 = r4.next()
            com.google.android.gms.internal.ads.HO r8 = (com.google.android.gms.internal.ads.HO) r8
            long r9 = r8.f8913c
            com.google.android.gms.internal.ads.qQ r11 = r8.f8914d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.f8912b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            com.google.android.gms.internal.ads.IO r9 = r8.f8917g
            long r14 = r2.f16377d
            java.util.HashMap r10 = r9.f9096c
            r16 = r12
            java.lang.String r12 = r9.f9099f
            java.lang.Object r10 = r10.get(r12)
            com.google.android.gms.internal.ads.HO r10 = (com.google.android.gms.internal.ads.HO) r10
            if (r10 == 0) goto L4b
            long r12 = r10.f8913c
            int r10 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r10 == 0) goto L4b
            goto L50
        L4b:
            long r9 = r9.f9100g
            r12 = 1
            long r12 = r12 + r9
        L50:
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 < 0) goto L59
            r8.f8913c = r14
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 == 0) goto L84
            long r9 = r2.f16377d
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 != 0) goto L62
            goto L84
        L62:
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.f8913c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L88
        L71:
            long r12 = r11.f16377d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.f16375b
            int r10 = r11.f16375b
            if (r9 != r10) goto L16
            int r9 = r2.f16376c
            int r10 = r11.f16376c
            if (r9 != r10) goto L16
            goto L88
        L84:
            int r9 = r8.f8912b
            if (r1 != r9) goto L16
        L88:
            long r9 = r8.f8913c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto La0
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 >= 0) goto L93
            goto La0
        L93:
            if (r12 != 0) goto L16
            java.lang.String r9 = com.google.android.gms.internal.ads.Vt.f12096a
            com.google.android.gms.internal.ads.qQ r9 = r7.f8914d
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
            java.util.Random r5 = com.google.android.gms.internal.ads.IO.f9093h
            r5.nextBytes(r4)
            r5 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
            com.google.android.gms.internal.ads.HO r5 = new com.google.android.gms.internal.ads.HO
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
            return r5
        Lbe:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.IO.g(int, com.google.android.gms.internal.ads.qQ):com.google.android.gms.internal.ads.HO");
    }
}
