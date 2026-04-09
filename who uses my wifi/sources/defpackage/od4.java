package defpackage;

import java.util.HashMap;
import java.util.Random;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class od4 {
    public static final Random h = new Random();
    public rd4 d;
    public String f;
    public final ez1 a = new ez1();
    public final sw1 b = new sw1();
    public final HashMap c = new HashMap();
    public oz1 e = oz1.a;
    public long g = -1;

    public final synchronized String a(oz1 oz1Var, kh4 kh4Var) {
        return e(oz1Var.o(kh4Var.a, this.b).c, kh4Var).a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0027, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:23:0x004b, B:16:0x002e, B:28:0x0055, B:30:0x005f, B:33:0x0066, B:35:0x006c, B:37:0x007f, B:38:0x0093, B:40:0x0097, B:41:0x0099, B:43:0x00a3, B:45:0x00a7, B:47:0x00b4, B:50:0x00bb, B:56:0x00d8), top: B:59:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:4:0x0007, B:6:0x000b, B:9:0x0015, B:11:0x0019, B:13:0x0027, B:17:0x0033, B:19:0x0039, B:21:0x0045, B:23:0x004b, B:16:0x002e, B:28:0x0055, B:30:0x005f, B:33:0x0066, B:35:0x006c, B:37:0x007f, B:38:0x0093, B:40:0x0097, B:41:0x0099, B:43:0x00a3, B:45:0x00a7, B:47:0x00b4, B:50:0x00bb, B:56:0x00d8), top: B:59:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(defpackage.ad4 r14) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od4.b(ad4):void");
    }

    public final void c(ad4 ad4Var) {
        kh4 kh4Var;
        boolean zG = ad4Var.b.g();
        HashMap map = this.c;
        if (zG) {
            String str = this.f;
            if (str != null) {
                nd4 nd4Var = (nd4) map.get(str);
                nd4Var.getClass();
                d(nd4Var);
                return;
            }
            return;
        }
        nd4 nd4Var2 = (nd4) map.get(this.f);
        int i = ad4Var.c;
        kh4 kh4Var2 = ad4Var.d;
        this.f = e(i, kh4Var2).a;
        b(ad4Var);
        if (kh4Var2 != null) {
            long j = kh4Var2.d;
            if (kh4Var2.b()) {
                if (nd4Var2 != null && nd4Var2.c == j && (kh4Var = nd4Var2.d) != null) {
                    if (kh4Var.b == kh4Var2.b) {
                        if (kh4Var.c == kh4Var2.c) {
                            return;
                        }
                    }
                }
                e(i, new kh4(j, kh4Var2.a));
            }
        }
    }

    public final void d(nd4 nd4Var) {
        long j = nd4Var.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.nd4 e(int r19, defpackage.kh4 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = 0
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r4.next()
            nd4 r8 = (defpackage.nd4) r8
            long r9 = r8.c
            kh4 r11 = r8.d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            od4 r9 = r8.g
            long r14 = r2.d
            java.util.HashMap r10 = r9.c
            r16 = r12
            java.lang.String r12 = r9.f
            java.lang.Object r10 = r10.get(r12)
            nd4 r10 = (defpackage.nd4) r10
            if (r10 == 0) goto L4b
            long r12 = r10.c
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
            r8.c = r14
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 != 0) goto L60
            int r9 = r8.b
            if (r1 != r9) goto L16
            goto L83
        L60:
            long r9 = r2.d
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L83
        L71:
            long r12 = r11.d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.b
            int r10 = r11.b
            if (r9 != r10) goto L16
            int r9 = r2.c
            int r10 = r11.c
            if (r9 != r10) goto L16
        L83:
            long r9 = r8.c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto L9b
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 >= 0) goto L8e
            goto L9b
        L8e:
            if (r12 != 0) goto L16
            java.lang.String r9 = defpackage.v23.a
            kh4 r9 = r7.d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r7 = r8
            goto L16
        L9b:
            r7 = r8
            r5 = r9
            goto L16
        L9f:
            if (r7 != 0) goto Lb9
            r4 = 12
            byte[] r4 = new byte[r4]
            java.util.Random r5 = defpackage.od4.h
            r5.nextBytes(r4)
            r5 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
            nd4 r5 = new nd4
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
            return r5
        Lb9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od4.e(int, kh4):nd4");
    }
}
