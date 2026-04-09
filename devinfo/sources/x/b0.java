package x;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f36849a = l0.f36914a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f36850b = y.a.f37286c;

    /* renamed from: c, reason: collision with root package name */
    public long[] f36851c = p.f36929b;

    /* renamed from: d, reason: collision with root package name */
    public int f36852d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f36853e = Integer.MAX_VALUE;

    /* renamed from: f, reason: collision with root package name */
    public int f36854f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f36855h;

    public b0(int i4) {
        if (i4 >= 0) {
            f(l0.d(i4));
        } else {
            y.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i4 = this.g;
        int iD = d(obj);
        this.f36850b[iD] = obj;
        long[] jArr = this.f36851c;
        int i10 = this.f36852d;
        jArr[iD] = (i10 & 2147483647L) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((2147483647L & iD) << 31) | (jArr[i10] & (-4611686016279904257L));
        }
        this.f36852d = iD;
        if (this.f36853e == Integer.MAX_VALUE) {
            this.f36853e = iD;
        }
        return this.g != i4;
    }

    public final void b() {
        this.g = 0;
        long[] jArr = this.f36849a;
        if (jArr != l0.f36914a) {
            zj.m.W(jArr, -9187201950435737472L);
            long[] jArr2 = this.f36849a;
            int i4 = this.f36854f;
            int i10 = i4 >> 3;
            long j = 255 << ((i4 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        zj.m.U(0, this.f36854f, null, this.f36850b);
        zj.m.W(this.f36851c, 4611686018427387903L);
        this.f36852d = Integer.MAX_VALUE;
        this.f36853e = Integer.MAX_VALUE;
        this.f36855h = l0.a(this.f36854f) - this.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f36854f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f36849a
            int r8 = r3 >> 3
            r9 = r3 & 7
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
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f36850b
            r15 = r15[r11]
            boolean r15 = nk.k.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L75
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            return r12
        L74:
            return r2
        L75:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: x.b0.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        int i4;
        long j;
        long j8;
        long j9;
        char c9;
        long[] jArr;
        long[] jArr2;
        long j10;
        int i10 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f36854f;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f36849a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j11 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j12 = i13;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (j13 - 72340172838076673L) & (~j13) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j14) >> 3) + i15) & i14;
                int i19 = i10;
                if (nk.k.a(this.f36850b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i10 = i19;
            }
            int i20 = i10;
            if ((j11 & ((~j11) << 6) & (-9187201950435737472L)) != 0) {
                int iE = e(i12);
                long j15 = 255;
                if (this.f36855h != 0 || ((this.f36849a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    i4 = 0;
                    j = j12;
                    j8 = 255;
                    j9 = 128;
                } else {
                    int i21 = this.f36854f;
                    if (i21 > 8) {
                        c9 = 31;
                        j9 = 128;
                        if (Long.compare((this.g * 32) ^ Long.MIN_VALUE, (i21 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f36849a;
                            if (jArr4 == null) {
                                i4 = 0;
                                j = j12;
                                j8 = 255;
                            } else {
                                int i22 = this.f36854f;
                                Object[] objArr = this.f36850b;
                                long[] jArr5 = this.f36851c;
                                long[] jArr6 = new long[i22];
                                Arrays.fill(jArr6, 0, i22, 9223372034707292159L);
                                i4 = 0;
                                int i23 = (i22 + 7) >> 3;
                                int i24 = 0;
                                while (i24 < i23) {
                                    long j16 = j15;
                                    long j17 = jArr4[i24] & (-9187201950435737472L);
                                    int i25 = i24;
                                    jArr4[i25] = ((~j17) + (j17 >>> 7)) & (-72340172838076674L);
                                    i24 = i25 + 1;
                                    j15 = j16;
                                }
                                j8 = j15;
                                int length = jArr4.length;
                                int i26 = length - 1;
                                int i27 = length - 2;
                                jArr4[i27] = (jArr4[i27] & 72057594037927935L) | (-72057594037927936L);
                                jArr4[i26] = jArr4[0];
                                int i28 = 0;
                                while (i28 != i22) {
                                    int i29 = i28 >> 3;
                                    int i30 = (i28 & 7) << 3;
                                    long j18 = (jArr4[i29] >> i30) & j8;
                                    if (j18 != 128 && j18 == 254) {
                                        Object obj2 = objArr[i28];
                                        int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i20;
                                        int i31 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                        int iE2 = e(i31);
                                        int i32 = i31 & i22;
                                        if (((iE2 - i32) & i22) / 8 == ((i28 - i32) & i22) / 8) {
                                            int i33 = i22;
                                            Object[] objArr2 = objArr;
                                            jArr4[i29] = (jArr4[i29] & (~(j8 << i30))) | ((r17 & 127) << i30);
                                            if (jArr6[i28] == 9223372034707292159L) {
                                                long j19 = i28;
                                                jArr6[i28] = j19 | (j19 << 32);
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i28++;
                                            i22 = i33;
                                            objArr = objArr2;
                                        } else {
                                            int i34 = i22;
                                            Object[] objArr3 = objArr;
                                            int i35 = iE2 >> 3;
                                            long j20 = jArr4[i35];
                                            int i36 = (iE2 & 7) << 3;
                                            if (((j20 >> i36) & j8) == 128) {
                                                jArr4[i35] = (j20 & (~(j8 << i36))) | ((r17 & 127) << i36);
                                                jArr4[i29] = (jArr4[i29] & (~(j8 << i30))) | (128 << i30);
                                                objArr3[iE2] = objArr3[i28];
                                                objArr3[i28] = null;
                                                jArr5[iE2] = jArr5[i28];
                                                jArr5[i28] = 4611686018427387903L;
                                                int i37 = (int) ((jArr6[i28] >> 32) & 4294967295L);
                                                int i38 = Integer.MAX_VALUE;
                                                if (i37 != Integer.MAX_VALUE) {
                                                    j10 = j12;
                                                    jArr6[i37] = iE2 | (jArr6[i37] & (-4294967296L));
                                                    jArr6[i28] = (jArr6[i28] & 4294967295L) | (-4294967296L);
                                                    i38 = Integer.MAX_VALUE;
                                                } else {
                                                    j10 = j12;
                                                    jArr6[i28] = (Integer.MAX_VALUE << 32) | iE2;
                                                }
                                                jArr6[iE2] = (i28 << 32) | i38;
                                            } else {
                                                j10 = j12;
                                                jArr4[i35] = ((r17 & 127) << i36) | (j20 & (~(j8 << i36)));
                                                Object obj3 = objArr3[iE2];
                                                objArr3[iE2] = objArr3[i28];
                                                objArr3[i28] = obj3;
                                                long j21 = jArr5[iE2];
                                                jArr5[iE2] = jArr5[i28];
                                                jArr5[i28] = j21;
                                                int i39 = (int) ((jArr6[i28] >> 32) & 4294967295L);
                                                if (i39 != Integer.MAX_VALUE) {
                                                    long j22 = iE2;
                                                    jArr6[i39] = (jArr6[i39] & (-4294967296L)) | j22;
                                                    jArr6[i28] = (jArr6[i28] & 4294967295L) | (j22 << 32);
                                                } else {
                                                    long j23 = iE2;
                                                    jArr6[i28] = j23 | (j23 << 32);
                                                    i39 = i28;
                                                }
                                                jArr6[iE2] = (i39 << 32) | i28;
                                                i28--;
                                            }
                                            jArr4[jArr4.length - 1] = jArr4[0];
                                            i28++;
                                            i22 = i34;
                                            objArr = objArr3;
                                            j12 = j10;
                                        }
                                    } else {
                                        i28++;
                                    }
                                }
                                j = j12;
                                this.f36855h = l0.a(this.f36854f) - this.g;
                                long[] jArr7 = this.f36851c;
                                int length2 = jArr7.length;
                                for (int i40 = 0; i40 < length2; i40++) {
                                    long j24 = jArr7[i40];
                                    jArr7[i40] = (((j24 & (-4611686018427387904L)) | (((int) ((j24 >> 31) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r4] & 4294967295L))) << 31) | (((int) (j24 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (jArr6[r6] & 4294967295L));
                                }
                                int i41 = this.f36852d;
                                if (i41 != Integer.MAX_VALUE) {
                                    this.f36852d = (int) (jArr6[i41] & 4294967295L);
                                }
                                int i42 = this.f36853e;
                                if (i42 != Integer.MAX_VALUE) {
                                    this.f36853e = (int) (jArr6[i42] & 4294967295L);
                                }
                            }
                        }
                        iE = e(i12);
                    } else {
                        c9 = 31;
                        j9 = 128;
                    }
                    i4 = 0;
                    j = j12;
                    j8 = 255;
                    int iB = l0.b(this.f36854f);
                    long[] jArr8 = this.f36849a;
                    Object[] objArr4 = this.f36850b;
                    long[] jArr9 = this.f36851c;
                    int i43 = this.f36854f;
                    int[] iArr = new int[i43];
                    f(iB);
                    long[] jArr10 = this.f36849a;
                    Object[] objArr5 = this.f36850b;
                    long[] jArr11 = this.f36851c;
                    int i44 = this.f36854f;
                    int i45 = 0;
                    while (i45 < i43) {
                        if (((jArr8[i45 >> 3] >> ((i45 & 7) << 3)) & 255) < j9) {
                            Object obj4 = objArr4[i45];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i20;
                            int i46 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i46 >>> 7);
                            jArr = jArr10;
                            jArr2 = jArr8;
                            long j25 = i46 & 127;
                            int i47 = iE3 >> 3;
                            int i48 = (iE3 & 7) << 3;
                            long j26 = (jArr[i47] & (~(255 << i48))) | (j25 << i48);
                            jArr[i47] = j26;
                            jArr[(((iE3 - 7) & i44) + (i44 & 7)) >> 3] = j26;
                            objArr5[iE3] = obj4;
                            jArr11[iE3] = jArr9[i45];
                            iArr[i45] = iE3;
                        } else {
                            jArr = jArr10;
                            jArr2 = jArr8;
                        }
                        i45++;
                        jArr8 = jArr2;
                        jArr10 = jArr;
                    }
                    long[] jArr12 = this.f36851c;
                    int length3 = jArr12.length;
                    for (int i49 = 0; i49 < length3; i49++) {
                        long j27 = jArr12[i49];
                        jArr12[i49] = (((j27 & (-4611686018427387904L)) | (((int) ((j27 >> c9) & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r4])) << c9) | (((int) (j27 & 2147483647L)) == Integer.MAX_VALUE ? Integer.MAX_VALUE : iArr[r6]);
                    }
                    int i50 = this.f36852d;
                    if (i50 != Integer.MAX_VALUE) {
                        this.f36852d = iArr[i50];
                    }
                    int i51 = this.f36853e;
                    if (i51 != Integer.MAX_VALUE) {
                        this.f36853e = iArr[i51];
                    }
                    iE = e(i12);
                }
                this.g++;
                int i52 = this.f36855h;
                long[] jArr13 = this.f36849a;
                int i53 = iE >> 3;
                long j28 = jArr13[i53];
                int i54 = (iE & 7) << 3;
                if (((j28 >> i54) & j8) == j9) {
                    i4 = 1;
                }
                this.f36855h = i52 - i4;
                int i55 = this.f36854f;
                long j29 = (j28 & (~(j8 << i54))) | (j << i54);
                jArr13[i53] = j29;
                jArr13[(((iE - 7) & i55) + (i55 & 7)) >> 3] = j29;
                return iE;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i10 = i20;
        }
    }

    public final int e(int i4) {
        int i10 = this.f36854f;
        int i11 = i4 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f36849a;
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
            boolean r3 = r1 instanceof x.b0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            x.b0 r1 = (x.b0) r1
            int r3 = r1.g
            int r5 = r0.g
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f36850b
            long[] r5 = r0.f36849a
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
            boolean r13 = r1.c(r13)
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
        throw new UnsupportedOperationException("Method not decompiled: x.b0.equals(java.lang.Object):boolean");
    }

    public final void f(int i4) {
        long[] jArr;
        long[] jArr2;
        int iMax = i4 > 0 ? Math.max(7, l0.c(i4)) : 0;
        this.f36854f = iMax;
        if (iMax == 0) {
            jArr = l0.f36914a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            zj.m.W(jArr, -9187201950435737472L);
        }
        this.f36849a = jArr;
        int i10 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f36855h = l0.a(this.f36854f) - this.g;
        this.f36850b = iMax == 0 ? y.a.f37286c : new Object[iMax];
        if (iMax == 0) {
            jArr2 = p.f36929b;
        } else {
            jArr2 = new long[iMax];
            zj.m.W(jArr2, 4611686018427387903L);
        }
        this.f36851c = jArr2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r1.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f36854f
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f36849a
            int r8 = r3 >> 3
            r9 = r3 & 7
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
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.f36850b
            r15 = r15[r11]
            boolean r15 = nk.k.a(r15, r1)
            if (r15 == 0) goto L61
            goto L71
        L61:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L67:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7a
            r11 = -1
        L71:
            if (r11 < 0) goto L74
            r2 = r12
        L74:
            if (r2 == 0) goto L79
            r0.h(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: x.b0.g(java.lang.Object):boolean");
    }

    public final void h(int i4) {
        this.g--;
        long[] jArr = this.f36849a;
        int i10 = this.f36854f;
        int i11 = i4 >> 3;
        int i12 = (i4 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i4 - 7) & i10) + (i10 & 7)) >> 3] = j;
        this.f36850b[i4] = null;
        long[] jArr2 = this.f36851c;
        long j8 = jArr2[i4];
        int i13 = (int) ((j8 >> 31) & 2147483647L);
        int i14 = (int) (j8 & 2147483647L);
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = (jArr2[i13] & (-2147483648L)) | (i14 & 2147483647L);
        } else {
            this.f36852d = i14;
        }
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = ((i13 & 2147483647L) << 31) | (jArr2[i14] & (-4611686016279904257L));
        } else {
            this.f36853e = i13;
        }
        jArr2[i4] = 4611686018427387903L;
    }

    public final int hashCode() {
        int iHashCode = (this.f36854f * 31) + this.g;
        Object[] objArr = this.f36850b;
        long[] jArr = this.f36849a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j = jArr[i4];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i4 << 3) + i11];
                            if (!nk.k.a(obj, this)) {
                                iHashCode += obj != null ? obj.hashCode() : 0;
                            }
                        }
                        j >>= 8;
                    }
                    if (i10 != 8) {
                        return iHashCode;
                    }
                }
                if (i4 == length) {
                    break;
                }
                i4++;
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean i(java.util.Collection r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "elements"
            nk.k.e(r1, r2)
            java.lang.Object[] r2 = r0.f36850b
            int r3 = r0.g
            long[] r4 = r0.f36849a
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L57
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L52
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L50
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4c
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r1
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            r15 = r2[r13]
            boolean r14 = zj.n.Z(r14, r15)
            if (r14 != 0) goto L4c
            r0.h(r13)
        L4c:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L50:
            if (r10 != r11) goto L57
        L52:
            if (r7 == r5) goto L57
            int r7 = r7 + 1
            goto L16
        L57:
            int r1 = r0.g
            if (r3 == r1) goto L5d
            r1 = 1
            return r1
        L5d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x.b0.i(java.util.Collection):boolean");
    }

    public final String toString() {
        c2.l0 l0Var = new c2.l0(28, this);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f36850b;
        long[] jArr = this.f36851c;
        int i4 = this.f36853e;
        int i10 = 0;
        while (true) {
            if (i4 == Integer.MAX_VALUE) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i11 = (int) ((jArr[i4] >> 31) & 2147483647L);
            Object obj = objArr[i4];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) l0Var.invoke(obj));
            i10++;
            i4 = i11;
        }
        String string = sb2.toString();
        nk.k.d(string, "toString(...)");
        return string;
    }
}
