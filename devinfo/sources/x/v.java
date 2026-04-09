package x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public long[] f36947a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f36948b;

    /* renamed from: c, reason: collision with root package name */
    public int f36949c;

    /* renamed from: d, reason: collision with root package name */
    public int f36950d;

    /* renamed from: e, reason: collision with root package name */
    public int f36951e;

    public v(int i4) {
        this.f36947a = l0.f36914a;
        this.f36948b = l.f36913a;
        if (i4 >= 0) {
            d(l0.d(i4));
        } else {
            y.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0070, code lost:
    
        r21 = r12;
        r4 = '\b';
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007c, code lost:
    
        if (((((~r8) << 6) & r8) & r21) == 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
    
        r3 = c(r5);
        r12 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0086, code lost:
    
        if (r37.f36951e != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009a, code lost:
    
        if (((r37.f36947a[r3 >> 3] >> ((r3 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009c, code lost:
    
        r23 = r10;
        r29 = 255;
        r34 = true;
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a8, code lost:
    
        r3 = r37.f36949c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00aa, code lost:
    
        if (r3 <= 8) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        r17 = 128;
        r23 = r10;
        r6 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c7, code lost:
    
        if (java.lang.Long.compare((r37.f36950d * 32) ^ Long.MIN_VALUE, (r3 * 25) ^ Long.MIN_VALUE) > 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c9, code lost:
    
        r3 = r37.f36947a;
        r7 = r37.f36949c;
        r8 = r37.f36948b;
        r9 = (r7 + 7) >> 3;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00d5, code lost:
    
        if (r10 >= r9) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d7, code lost:
    
        r29 = r12;
        r12 = r3[r10] & r21;
        r3[r10] = (-72340172838076674L) & ((~r12) + (r12 >>> 7));
        r10 = r10 + 1;
        r15 = r15;
        r14 = r14;
        r12 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00f3, code lost:
    
        r29 = r12;
        r27 = r14;
        r11 = r15;
        r9 = zj.m.Z(r3);
        r10 = r9 - 1;
        r3[r10] = (r3[r10] & 72057594037927935L) | (-72057594037927936L);
        r3[r9] = r3[0];
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0112, code lost:
    
        if (r9 == r7) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0114, code lost:
    
        r10 = r9 >> 3;
        r21 = (r9 & 7) << 3;
        r12 = (r3[r10] >> r21) & r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0122, code lost:
    
        if (r12 != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0124, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0129, code lost:
    
        if (r12 == 254) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x012c, code lost:
    
        r12 = r8[r9] * r27;
        r13 = (r12 ^ (r12 << 16)) >>> 7;
        r22 = c(r13);
        r13 = r13 & r7;
        r31 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0147, code lost:
    
        if ((((r22 - r13) & r7) / 8) != (((r9 - r13) & r7) / 8)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0149, code lost:
    
        r3[r10] = (r3[r10] & (~(r29 << r21))) | ((r12 & 127) << r21);
        r3[r3.length - (r11 ? 1 : 0)] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r6 = r6;
        r7 = r7;
        r4 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x016c, code lost:
    
        r4 = r6;
        r28 = r7;
        r6 = r22 >> 3;
        r32 = r3[r6];
        r7 = (r22 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x017d, code lost:
    
        if (((r32 >> r7) & r29) != 128) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017f, code lost:
    
        r34 = r11 ? 1 : 0;
        r3[r6] = (r32 & (~(r29 << r7))) | ((r12 & 127) << r7);
        r3[r10] = (r3[r10] & (~(r29 << r21))) | (128 << r21);
        r8[r22] = r8[r9];
        r8[r9] = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a3, code lost:
    
        r34 = r11 ? 1 : 0;
        r3[r6] = ((r12 & 127) << r7) | (r32 & (~(r29 << r7)));
        r6 = r8[r22];
        r8[r22] = r8[r9];
        r8[r9] = r6;
        r9 = r9 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01bb, code lost:
    
        r3[r3.length - 1] = (r3[0] & 72057594037927935L) | Long.MIN_VALUE;
        r9 = r9 + 1;
        r6 = r4;
        r7 = r28;
        r4 = r31;
        r11 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01d0, code lost:
    
        r4 = r6;
        r34 = r11 ? 1 : 0;
        r37.f36951e = x.l0.a(r37.f36949c) - r37.f36950d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01e3, code lost:
    
        r4 = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01e4, code lost:
    
        r29 = 255;
        r34 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01eb, code lost:
    
        r23 = r10;
        r4 = 7;
        r17 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01f1, code lost:
    
        r3 = x.l0.b(r37.f36949c);
        r6 = r37.f36947a;
        r7 = r37.f36948b;
        r8 = r37.f36949c;
        d(r3);
        r3 = r37.f36947a;
        r9 = r37.f36948b;
        r10 = r37.f36949c;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0208, code lost:
    
        if (r11 >= r8) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0217, code lost:
    
        if (((r6[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r17) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0219, code lost:
    
        r12 = r7[r11];
        r13 = r12 * r14;
        r13 = r13 ^ (r13 << 16);
        r14 = c(r13 >>> 7);
        r19 = r4;
        r15 = r5;
        r4 = r13 & 127;
        r13 = r14 >> 3;
        r20 = (r14 & 7) << 3;
        r25 = r3;
        r3 = (r3[r13] & (~(255 << r20))) | (r4 << r20);
        r25[r13] = r3;
        r25[(((r14 - 7) & r10) + (r10 & 7)) >> 3] = r3;
        r9[r14] = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0250, code lost:
    
        r25 = r3;
        r19 = r4;
        r15 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0255, code lost:
    
        r11 = r11 + 1;
        r5 = r15;
        r4 = r19;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x025d, code lost:
    
        r3 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0261, code lost:
    
        r37.f36950d++;
        r4 = r37.f36951e;
        r5 = r37.f36947a;
        r6 = r3 >> 3;
        r7 = r5[r6];
        r9 = (r3 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0279, code lost:
    
        if (((r7 >> r9) & r29) != r17) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x027b, code lost:
    
        r10 = r34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x027e, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0280, code lost:
    
        r37.f36951e = r4 - r10;
        r4 = r37.f36949c;
        r7 = (r7 & (~(r29 << r9))) | (r23 << r9);
        r5[r6] = r7;
        r5[(((r3 - 7) & r4) + (r4 & 7)) >> 3] = r7;
        r18 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(int r38) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.v.a(int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0.f36949c
            int r2 = r2 >>> 7
            r2 = r2 & r4
            r5 = 0
            r6 = r5
        L14:
            long[] r7 = r0.f36947a
            int r8 = r2 >> 3
            r9 = r2 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L40:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L5b
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            int[] r15 = r0.f36948b
            r15 = r15[r11]
            if (r15 != r1) goto L55
            goto L65
        L55:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L40
        L5b:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L69
            r11 = -1
        L65:
            if (r11 < 0) goto L68
            return r12
        L68:
            return r5
        L69:
            int r6 = r6 + 8
            int r2 = r2 + r6
            r2 = r2 & r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: x.v.b(int):boolean");
    }

    public final int c(int i4) {
        int i10 = this.f36949c;
        int i11 = i4 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f36947a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j8 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j8 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j8) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    public final void d(int i4) {
        long[] jArr;
        int iMax = i4 > 0 ? Math.max(7, l0.c(i4)) : 0;
        this.f36949c = iMax;
        if (iMax == 0) {
            jArr = l0.f36914a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            zj.m.W(jArr, -9187201950435737472L);
        }
        this.f36947a = jArr;
        int i10 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f36951e = l0.a(this.f36949c) - this.f36950d;
        this.f36948b = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r2 = r2 * r1
            int r3 = r2 << 16
            r2 = r2 ^ r3
            r3 = r2 & 127(0x7f, float:1.78E-43)
            int r4 = r0.f36949c
            int r2 = r2 >>> 7
            r2 = r2 & r4
            r5 = 0
            r6 = r5
        L14:
            long[] r7 = r0.f36947a
            int r8 = r2 >> 3
            r9 = r2 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r3
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L40:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L5b
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r2
            r11 = r11 & r4
            int[] r15 = r0.f36948b
            r15 = r15[r11]
            if (r15 != r1) goto L55
            goto L65
        L55:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L40
        L5b:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L6e
            r11 = -1
        L65:
            if (r11 < 0) goto L68
            r5 = r12
        L68:
            if (r5 == 0) goto L6d
            r0.f(r11)
        L6d:
            return r5
        L6e:
            int r6 = r6 + 8
            int r2 = r2 + r6
            r2 = r2 & r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: x.v.e(int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof x.v
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            x.v r1 = (x.v) r1
            int r3 = r1.f36950d
            int r5 = r0.f36950d
            if (r3 == r5) goto L17
            return r4
        L17:
            int[] r3 = r0.f36948b
            long[] r5 = r0.f36947a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L5d
            r7 = r4
        L21:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L58
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r4
        L3b:
            if (r12 >= r10) goto L56
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L52
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            boolean r13 = r1.b(r13)
            if (r13 != 0) goto L52
            return r4
        L52:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3b
        L56:
            if (r10 != r11) goto L5d
        L58:
            if (r7 == r6) goto L5d
            int r7 = r7 + 1
            goto L21
        L5d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x.v.equals(java.lang.Object):boolean");
    }

    public final void f(int i4) {
        this.f36950d--;
        long[] jArr = this.f36947a;
        int i10 = this.f36949c;
        int i11 = i4 >> 3;
        int i12 = (i4 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i4 - 7) & i10) + (i10 & 7)) >> 3] = j;
    }

    public final int hashCode() {
        int[] iArr = this.f36948b;
        long[] jArr = this.f36947a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i4 = 0;
        int i10 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i4 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        i10 += iArr[(i4 << 3) + i12];
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return i10;
                }
            }
            if (i4 == length) {
                return i10;
            }
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[PHI: r7
  0x005d: PHI (r7v2 int) = (r7v1 int), (r7v3 int) binds: [B:6:0x0026, B:18:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "["
            r1.append(r2)
            int[] r2 = r0.f36948b
            long[] r3 = r0.f36947a
            int r4 = r3.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r5 = 0
            r6 = r5
            r7 = r6
        L18:
            r8 = r3[r6]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L5d
            int r10 = r6 - r4
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L32:
            if (r12 >= r10) goto L5b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L57
            int r13 = r6 << 3
            int r13 = r13 + r12
            r13 = r2[r13]
            r14 = -1
            if (r7 != r14) goto L4b
            java.lang.String r2 = "..."
            r1.append(r2)
            goto L67
        L4b:
            if (r7 == 0) goto L52
            java.lang.String r14 = ", "
            r1.append(r14)
        L52:
            r1.append(r13)
            int r7 = r7 + 1
        L57:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L32
        L5b:
            if (r10 != r11) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L18
        L62:
            java.lang.String r2 = "]"
            r1.append(r2)
        L67:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            nk.k.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x.v.toString():java.lang.String");
    }

    public /* synthetic */ v() {
        this(6);
    }
}
