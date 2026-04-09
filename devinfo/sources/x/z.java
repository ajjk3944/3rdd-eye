package x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public long[] f36965a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f36966b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f36967c;

    /* renamed from: d, reason: collision with root package name */
    public int f36968d;

    /* renamed from: e, reason: collision with root package name */
    public int f36969e;

    /* renamed from: f, reason: collision with root package name */
    public int f36970f;

    public z(int i4) {
        this.f36965a = l0.f36914a;
        this.f36966b = y.a.f37286c;
        this.f36967c = l.f36913a;
        if (i4 >= 0) {
            e(l0.d(i4));
        } else {
            y.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void a() {
        this.f36969e = 0;
        long[] jArr = this.f36965a;
        if (jArr != l0.f36914a) {
            zj.m.W(jArr, -9187201950435737472L);
            long[] jArr2 = this.f36965a;
            int i4 = this.f36968d;
            int i10 = i4 >> 3;
            long j = 255 << ((i4 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        zj.m.U(0, this.f36968d, null, this.f36966b);
        this.f36970f = l0.a(this.f36968d) - this.f36969e;
    }

    public final int b(int i4) {
        int i10 = this.f36968d;
        int i11 = i4 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f36965a;
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

    public final int c(Object obj) {
        long j;
        long j8;
        long j9;
        long[] jArr;
        long[] jArr2;
        int i4;
        Object[] objArr;
        int i10 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 >>> 7;
        int i13 = i11 & 127;
        int i14 = this.f36968d;
        int i15 = i12 & i14;
        int i16 = 0;
        while (true) {
            long[] jArr3 = this.f36965a;
            int i17 = i15 >> 3;
            int i18 = (i15 & 7) << 3;
            long j10 = ((jArr3[i17 + 1] << (64 - i18)) & ((-i18) >> 63)) | (jArr3[i17] >>> i18);
            long j11 = i13;
            int i19 = i13;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = (i15 + (Long.numberOfTrailingZeros(j13) >> 3)) & i14;
                int i20 = i10;
                if (nk.k.a(this.f36966b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i10 = i20;
            }
            int i21 = i10;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iB = b(i12);
                long j14 = 255;
                if (this.f36970f != 0 || ((this.f36965a[iB >> 3] >> ((iB & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j8 = j11;
                    j9 = 128;
                } else {
                    int i22 = this.f36968d;
                    if (i22 > 8) {
                        int i23 = 8;
                        if (Long.compare((this.f36969e * 32) ^ Long.MIN_VALUE, (i22 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f36965a;
                            int i24 = this.f36968d;
                            Object[] objArr2 = this.f36966b;
                            int[] iArr = this.f36967c;
                            j9 = 128;
                            int i25 = (i24 + 7) >> 3;
                            int i26 = 0;
                            while (i26 < i25) {
                                long j15 = j14;
                                long j16 = jArr4[i26] & (-9187201950435737472L);
                                jArr4[i26] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
                                i26++;
                                i23 = i23;
                                j11 = j11;
                                j14 = j15;
                            }
                            j = j14;
                            j8 = j11;
                            int i27 = i23;
                            int iZ = zj.m.Z(jArr4);
                            int i28 = iZ - 1;
                            long j17 = 72057594037927935L;
                            jArr4[i28] = (jArr4[i28] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iZ] = jArr4[0];
                            int i29 = 0;
                            while (i29 != i24) {
                                int i30 = i29 >> 3;
                                int i31 = (i29 & 7) << 3;
                                long j18 = (jArr4[i30] >> i31) & j;
                                if (j18 != 128 && j18 == 254) {
                                    Object obj2 = objArr2[i29];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i21;
                                    int i32 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iB2 = b(i32);
                                    int i33 = i32 & i24;
                                    long j19 = j17;
                                    if (((iB2 - i33) & i24) / 8 == ((i29 - i33) & i24) / i27) {
                                        jArr4[i30] = ((r8 & 127) << i31) | (jArr4[i30] & (~(j << i31)));
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i29++;
                                        j17 = j19;
                                        i27 = i27;
                                    } else {
                                        int i34 = i27;
                                        int i35 = iB2 >> 3;
                                        long j20 = jArr4[i35];
                                        int i36 = (iB2 & 7) << 3;
                                        if (((j20 >> i36) & j) == 128) {
                                            i4 = i24;
                                            objArr = objArr2;
                                            jArr4[i35] = ((~(j << i36)) & j20) | ((r8 & 127) << i36);
                                            jArr4[i30] = (jArr4[i30] & (~(j << i31))) | (128 << i31);
                                            objArr[iB2] = objArr[i29];
                                            objArr[i29] = null;
                                            iArr[iB2] = iArr[i29];
                                            iArr[i29] = 0;
                                        } else {
                                            i4 = i24;
                                            objArr = objArr2;
                                            jArr4[i35] = ((r8 & 127) << i36) | ((~(j << i36)) & j20);
                                            Object obj3 = objArr[iB2];
                                            objArr[iB2] = objArr[i29];
                                            objArr[i29] = obj3;
                                            int i37 = iArr[iB2];
                                            iArr[iB2] = iArr[i29];
                                            iArr[i29] = i37;
                                            i29--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i29++;
                                        i24 = i4;
                                        j17 = j19;
                                        i27 = i34;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i29++;
                                }
                            }
                            this.f36970f = l0.a(this.f36968d) - this.f36969e;
                        }
                        iB = b(i12);
                    }
                    j = 255;
                    j8 = j11;
                    j9 = 128;
                    int iB3 = l0.b(this.f36968d);
                    long[] jArr5 = this.f36965a;
                    Object[] objArr3 = this.f36966b;
                    int[] iArr2 = this.f36967c;
                    int i38 = this.f36968d;
                    e(iB3);
                    long[] jArr6 = this.f36965a;
                    Object[] objArr4 = this.f36966b;
                    int[] iArr3 = this.f36967c;
                    int i39 = this.f36968d;
                    int i40 = 0;
                    while (i40 < i38) {
                        if (((jArr5[i40 >> 3] >> ((i40 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i40];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i21;
                            int i41 = iHashCode3 ^ (iHashCode3 << 16);
                            int iB4 = b(i41 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j21 = i41 & 127;
                            int i42 = iB4 >> 3;
                            int i43 = (iB4 & 7) << 3;
                            long j22 = (jArr[i42] & (~(255 << i43))) | (j21 << i43);
                            jArr[i42] = j22;
                            jArr[(((iB4 - 7) & i39) + (i39 & 7)) >> 3] = j22;
                            objArr4[iB4] = obj4;
                            iArr3[iB4] = iArr2[i40];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i40++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iB = b(i12);
                }
                this.f36969e++;
                int i44 = this.f36970f;
                long[] jArr7 = this.f36965a;
                int i45 = iB >> 3;
                long j23 = jArr7[i45];
                int i46 = (iB & 7) << 3;
                this.f36970f = i44 - (((j23 >> i46) & j) == j9 ? 1 : 0);
                int i47 = this.f36968d;
                long j24 = (j23 & (~(j << i46))) | (j8 << i46);
                jArr7[i45] = j24;
                jArr7[(((iB - 7) & i47) + (i47 & 7)) >> 3] = j24;
                return ~iB;
            }
            i16 += 8;
            i15 = (i15 + i16) & i14;
            i13 = i19;
            i10 = i21;
        }
    }

    public final int d(Object obj) {
        int i4 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 & 127;
        int i12 = this.f36968d;
        int i13 = i10 >>> 7;
        while (true) {
            int i14 = i13 & i12;
            long[] jArr = this.f36965a;
            int i15 = i14 >> 3;
            int i16 = (i14 & 7) << 3;
            long j = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j8 = (i11 * 72340172838076673L) ^ j;
            for (long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L); j9 != 0; j9 &= j9 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j9) >> 3) + i14) & i12;
                if (nk.k.a(this.f36966b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i4 += 8;
            i13 = i14 + i4;
        }
    }

    public final void e(int i4) {
        long[] jArr;
        int iMax = i4 > 0 ? Math.max(7, l0.c(i4)) : 0;
        this.f36968d = iMax;
        if (iMax == 0) {
            jArr = l0.f36914a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            zj.m.W(jArr, -9187201950435737472L);
        }
        this.f36965a = jArr;
        int i10 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f36970f = l0.a(this.f36968d) - this.f36969e;
        this.f36966b = new Object[iMax];
        this.f36967c = new int[iMax];
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
            boolean r3 = r1 instanceof x.z
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            x.z r1 = (x.z) r1
            int r3 = r1.f36969e
            int r5 = r0.f36969e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f36966b
            int[] r5 = r0.f36967c
            long[] r6 = r0.f36965a
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
            int[] r2 = r1.f36967c
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
        throw new UnsupportedOperationException("Method not decompiled: x.z.equals(java.lang.Object):boolean");
    }

    public final void f(int i4) {
        this.f36969e--;
        long[] jArr = this.f36965a;
        int i10 = this.f36968d;
        int i11 = i4 >> 3;
        int i12 = (i4 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i4 - 7) & i10) + (i10 & 7)) >> 3] = j;
        this.f36966b[i4] = null;
    }

    public final void g(int i4, Object obj) {
        int iC = c(obj);
        if (iC < 0) {
            iC = ~iC;
        }
        this.f36966b[iC] = obj;
        this.f36967c[iC] = i4;
    }

    public final int hashCode() {
        Object[] objArr = this.f36966b;
        int[] iArr = this.f36967c;
        long[] jArr = this.f36965a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i4 = 0;
        int iHashCode = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i4 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        int i12 = (i4 << 3) + i11;
                        Object obj = objArr[i12];
                        iHashCode += iArr[i12] ^ (obj != null ? obj.hashCode() : 0);
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return iHashCode;
                }
            }
            if (i4 == length) {
                return iHashCode;
            }
            i4++;
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
            int r1 = r0.f36969e
            if (r1 != 0) goto L9
            java.lang.String r1 = "{}"
            return r1
        L9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "{"
            r1.<init>(r2)
            java.lang.Object[] r2 = r0.f36966b
            int[] r3 = r0.f36967c
            long[] r4 = r0.f36965a
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
            int r14 = r0.f36969e
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
            nk.k.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x.z.toString():java.lang.String");
    }

    public /* synthetic */ z() {
        this(6);
    }
}
