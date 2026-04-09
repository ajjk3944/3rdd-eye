package u;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long[] f23128a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f23129b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f23130c;

    /* renamed from: d, reason: collision with root package name */
    public int f23131d;

    /* renamed from: e, reason: collision with root package name */
    public int f23132e;

    /* renamed from: f, reason: collision with root package name */
    public int f23133f;

    public y(int i10) {
        this.f23128a = g0.f23071a;
        this.f23129b = v.a.f23731c;
        this.f23130c = l.f23088a;
        if (i10 >= 0) {
            f(g0.d(i10));
        } else {
            v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f23132e = 0;
        long[] jArr = this.f23128a;
        if (jArr != g0.f23071a) {
            mq.l.j0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f23128a;
            int i10 = this.f23131d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        mq.l.i0(this.f23129b, 0, this.f23131d);
        this.f23133f = g0.a(this.f23131d) - this.f23132e;
    }

    public final int b(int i10) {
        int i11 = this.f23131d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f23128a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j7 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j7 != 0) {
                return (i12 + (Long.numberOfTrailingZeros(j7) >> 3)) & i11;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final int c(Object obj) {
        long j;
        long j7;
        long j10;
        long[] jArr;
        long[] jArr2;
        int i10;
        Object[] objArr;
        int i11 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f23131d;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f23128a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j11 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j12 = i14;
            int i20 = i14;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j14) >> 3)) & i15;
                int i21 = i11;
                if (br.l.a(this.f23129b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i11 = i21;
            }
            int i22 = i11;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iB = b(i13);
                long j15 = 255;
                if (this.f23133f != 0 || ((this.f23128a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j7 = j12;
                    j10 = 128;
                } else {
                    int i23 = this.f23131d;
                    if (i23 > 8) {
                        int i24 = 8;
                        if (Long.compare((this.f23132e * 32) ^ Long.MIN_VALUE, (i23 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f23128a;
                            int i25 = this.f23131d;
                            Object[] objArr2 = this.f23129b;
                            int[] iArr = this.f23130c;
                            j10 = 128;
                            int i26 = (i25 + 7) >> 3;
                            int i27 = 0;
                            while (i27 < i26) {
                                long j16 = j15;
                                long j17 = jArr4[i27] & (-9187201950435737472L);
                                jArr4[i27] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i27++;
                                i24 = i24;
                                j12 = j12;
                                j15 = j16;
                            }
                            j = j15;
                            j7 = j12;
                            int i28 = i24;
                            int iO0 = mq.l.o0(jArr4);
                            int i29 = iO0 - 1;
                            long j18 = 72057594037927935L;
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iO0] = jArr4[0];
                            int i30 = 0;
                            while (i30 != i25) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j19 = (jArr4[i31] >> i32) & j;
                                if (j19 != 128 && j19 == 254) {
                                    Object obj2 = objArr2[i30];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i22;
                                    int i33 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iB2 = b(i33);
                                    int i34 = i33 & i25;
                                    long j20 = j18;
                                    if (((iB2 - i34) & i25) / 8 == ((i30 - i34) & i25) / i28) {
                                        jArr4[i31] = ((r8 & 127) << i32) | (jArr4[i31] & (~(j << i32)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j20) | Long.MIN_VALUE;
                                        i30++;
                                        j18 = j20;
                                        i28 = i28;
                                    } else {
                                        int i35 = i28;
                                        int i36 = iB2 >> 3;
                                        long j21 = jArr4[i36];
                                        int i37 = (iB2 & 7) << 3;
                                        if (((j21 >> i37) & j) == 128) {
                                            i10 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((~(j << i37)) & j21) | ((r8 & 127) << i37);
                                            jArr4[i31] = (jArr4[i31] & (~(j << i32))) | (128 << i32);
                                            objArr[iB2] = objArr[i30];
                                            objArr[i30] = null;
                                            iArr[iB2] = iArr[i30];
                                            iArr[i30] = 0;
                                        } else {
                                            i10 = i25;
                                            objArr = objArr2;
                                            jArr4[i36] = ((r8 & 127) << i37) | ((~(j << i37)) & j21);
                                            Object obj3 = objArr[iB2];
                                            objArr[iB2] = objArr[i30];
                                            objArr[i30] = obj3;
                                            int i38 = iArr[iB2];
                                            iArr[iB2] = iArr[i30];
                                            iArr[i30] = i38;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j20) | Long.MIN_VALUE;
                                        i30++;
                                        i25 = i10;
                                        j18 = j20;
                                        i28 = i35;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            this.f23133f = g0.a(this.f23131d) - this.f23132e;
                        }
                        iB = b(i13);
                    }
                    j = 255;
                    j7 = j12;
                    j10 = 128;
                    int iB3 = g0.b(this.f23131d);
                    long[] jArr5 = this.f23128a;
                    Object[] objArr3 = this.f23129b;
                    int[] iArr2 = this.f23130c;
                    int i39 = this.f23131d;
                    f(iB3);
                    long[] jArr6 = this.f23128a;
                    Object[] objArr4 = this.f23129b;
                    int[] iArr3 = this.f23130c;
                    int i40 = this.f23131d;
                    int i41 = 0;
                    while (i41 < i39) {
                        if (((jArr5[i41 >> 3] >> ((i41 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i41];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i22;
                            int i42 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i42 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j22 = i42 & 127;
                            int i43 = iB4 >> 3;
                            int i44 = (iB4 & 7) << 3;
                            long j23 = (jArr[i43] & (~(255 << i44))) | (j22 << i44);
                            jArr[i43] = j23;
                            jArr[(((iB4 - 7) & i40) + (i40 & 7)) >> 3] = j23;
                            objArr4[iB4] = obj4;
                            iArr3[iB4] = iArr2[i41];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i41++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iB = b(i13);
                }
                this.f23132e++;
                int i45 = this.f23133f;
                long[] jArr7 = this.f23128a;
                int i46 = iB >> 3;
                long j24 = jArr7[i46];
                int i47 = (iB & 7) << 3;
                this.f23133f = i45 - (((j24 >> i47) & j) == j10 ? 1 : 0);
                int i48 = this.f23131d;
                long j25 = (j24 & (~(j << i47))) | (j7 << i47);
                jArr7[i46] = j25;
                jArr7[(((iB - 7) & i48) + (i48 & 7)) >> 3] = j25;
                return ~iB;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
            i11 = i22;
        }
    }

    public final int d(Object obj) {
        int i10 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.f23131d;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.f23128a;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j7 = (i12 * 72340172838076673L) ^ j;
            for (long j10 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i15) & i13;
                if (br.l.a(this.f23129b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    public final int e(Object obj) {
        int iD = d(obj);
        if (iD >= 0) {
            return this.f23130c[iD];
        }
        v.a.e("There is no key " + obj + " in the map");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof u.y
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            u.y r1 = (u.y) r1
            int r3 = r1.f23132e
            int r5 = r0.f23132e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f23129b
            int[] r5 = r0.f23130c
            long[] r6 = r0.f23128a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L74
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6b
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L66
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L5e
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r14 = r5[r14]
            int r15 = r1.d(r15)
            if (r15 < 0) goto L5d
            r16 = r2
            int[] r2 = r1.f23130c
            r2 = r2[r15]
            if (r14 == r2) goto L60
        L5d:
            return r4
        L5e:
            r16 = r2
        L60:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            r2 = r16
            goto L3d
        L66:
            r16 = r2
            if (r11 != r12) goto L76
            goto L6d
        L6b:
            r16 = r2
        L6d:
            if (r8 == r7) goto L76
            int r8 = r8 + 1
            r2 = r16
            goto L23
        L74:
            r16 = r2
        L76:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: u.y.equals(java.lang.Object):boolean");
    }

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, g0.c(i10)) : 0;
        this.f23131d = iMax;
        if (iMax == 0) {
            jArr = g0.f23071a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            mq.l.j0(jArr, -9187201950435737472L);
        }
        this.f23128a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f23133f = g0.a(this.f23131d) - this.f23132e;
        this.f23129b = new Object[iMax];
        this.f23130c = new int[iMax];
    }

    public final void g(int i10) {
        this.f23132e--;
        long[] jArr = this.f23128a;
        int i11 = this.f23131d;
        int i12 = i10 >> 3;
        int i13 = (i10 & 7) << 3;
        long j = (jArr[i12] & (~(255 << i13))) | (254 << i13);
        jArr[i12] = j;
        jArr[(((i10 - 7) & i11) + (i11 & 7)) >> 3] = j;
        this.f23129b[i10] = null;
    }

    public final void h(int i10, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.f23129b[iC] = obj;
        this.f23130c[iC] = i10;
    }

    public final int hashCode() {
        Object[] objArr = this.f23129b;
        int[] iArr = this.f23130c;
        long[] jArr = this.f23128a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i10];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        iHashCode += Integer.hashCode(iArr[i13]) ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[PHI: r8
  0x006a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x002c, B:22:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.f23132e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f23129b
            int[] r3 = r0.f23130c
            long[] r4 = r0.f23128a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
            r6 = 0
            r7 = r6
            r8 = r7
        L1e:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L6a
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L38:
            if (r13 >= r11) goto L68
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L64
            int r14 = r7 << 3
            int r14 = r14 + r13
            r15 = r2[r14]
            r14 = r3[r14]
            if (r15 != r0) goto L4e
            java.lang.String r15 = "(this)"
        L4e:
            r1.append(r15)
            java.lang.String r15 = "="
            r1.append(r15)
            r1.append(r14)
            int r8 = r8 + 1
            int r14 = r0.f23132e
            if (r8 >= r14) goto L64
            java.lang.String r14 = ", "
            r1.append(r14)
        L64:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L38
        L68:
            if (r11 != r12) goto L6f
        L6a:
            if (r7 == r5) goto L6f
            int r7 = r7 + 1
            goto L1e
        L6f:
            r2 = 125(0x7d, float:1.75E-43)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "toString(...)"
            br.l.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: u.y.toString():java.lang.String");
    }

    public /* synthetic */ y() {
        this(6);
    }
}
