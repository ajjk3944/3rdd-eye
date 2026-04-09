package x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class u extends j {

    /* renamed from: f, reason: collision with root package name */
    public int f36946f;

    public u(int i4) {
        this.f36904a = l0.f36914a;
        this.f36905b = l.f36913a;
        this.f36906c = y.a.f37286c;
        if (i4 >= 0) {
            f(l0.d(i4));
        } else {
            y.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f36908e = 0;
        long[] jArr = this.f36904a;
        if (jArr != l0.f36914a) {
            zj.m.W(jArr, -9187201950435737472L);
            long[] jArr2 = this.f36904a;
            int i4 = this.f36907d;
            int i10 = i4 >> 3;
            long j = 255 << ((i4 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        zj.m.U(0, this.f36907d, null, this.f36906c);
        this.f36946f = l0.a(this.f36907d) - this.f36908e;
    }

    public final int d(int i4) {
        long j;
        int i10;
        int i11;
        long j8;
        long[] jArr;
        long[] jArr2;
        int i12;
        int i13;
        int i14;
        int i15 = -862048943;
        int i16 = i4 * (-862048943);
        int i17 = i16 ^ (i16 << 16);
        int i18 = i17 >>> 7;
        int i19 = i17 & 127;
        int i20 = this.f36907d;
        int i21 = i18 & i20;
        int i22 = 0;
        while (true) {
            long[] jArr3 = this.f36904a;
            int i23 = i21 >> 3;
            int i24 = (i21 & 7) << 3;
            int i25 = 1;
            int i26 = i22;
            int i27 = 0;
            long j9 = (((-i24) >> 63) & (jArr3[i23 + 1] << (64 - i24))) | (jArr3[i23] >>> i24);
            long j10 = i19;
            int i28 = i15;
            int i29 = i19;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            long j12 = -9187201950435737472L;
            long j13 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = (i21 + (Long.numberOfTrailingZeros(j13) >> 3)) & i20;
                long j14 = j12;
                if (this.f36905b[iNumberOfTrailingZeros] == i4) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                j12 = j14;
            }
            long j15 = j12;
            if ((((~j9) << 6) & j9 & j15) != 0) {
                int iE = e(i18);
                long j16 = 255;
                if (this.f36946f != 0 || ((this.f36904a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    i10 = 1;
                    i11 = 0;
                    j8 = 128;
                } else {
                    int i30 = this.f36907d;
                    if (i30 > 8) {
                        j8 = 128;
                        if (Long.compare((this.f36908e * 32) ^ Long.MIN_VALUE, (i30 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f36904a;
                            int i31 = this.f36907d;
                            int[] iArr = this.f36905b;
                            Object[] objArr = this.f36906c;
                            int i32 = (i31 + 7) >> 3;
                            int i33 = 0;
                            while (i33 < i32) {
                                long j17 = j16;
                                long j18 = jArr4[i33] & j15;
                                jArr4[i33] = (-72340172838076674L) & ((~j18) + (j18 >>> 7));
                                i33++;
                                i32 = i32;
                                j16 = j17;
                            }
                            j = j16;
                            int iZ = zj.m.Z(jArr4);
                            int i34 = iZ - 1;
                            jArr4[i34] = (jArr4[i34] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iZ] = jArr4[0];
                            int i35 = 0;
                            while (i35 != i31) {
                                int i36 = i35 >> 3;
                                int i37 = (i35 & 7) << 3;
                                long j19 = (jArr4[i36] >> i37) & j;
                                if (j19 != 128 && j19 == 254) {
                                    int i38 = iArr[i35] * i28;
                                    int i39 = (i38 ^ (i38 << 16)) >>> 7;
                                    int iE2 = e(i39);
                                    int i40 = i39 & i31;
                                    int i41 = i28;
                                    if (((iE2 - i40) & i31) / 8 == ((i35 - i40) & i31) / 8) {
                                        int i42 = i25;
                                        int i43 = i27;
                                        jArr4[i36] = ((r11 & 127) << i37) | (jArr4[i36] & (~(j << i37)));
                                        jArr4[jArr4.length - i42] = (jArr4[i43] & 72057594037927935L) | Long.MIN_VALUE;
                                        i35++;
                                        i25 = i42;
                                        i28 = i41;
                                        i27 = i43;
                                    } else {
                                        int i44 = i25;
                                        int i45 = i27;
                                        int i46 = iE2 >> 3;
                                        long j20 = jArr4[i46];
                                        int i47 = (iE2 & 7) << 3;
                                        if (((j20 >> i47) & j) == 128) {
                                            i12 = i44;
                                            i13 = i31;
                                            int i48 = i35;
                                            jArr4[i46] = (j20 & (~(j << i47))) | ((r11 & 127) << i47);
                                            jArr4[i36] = (jArr4[i36] & (~(j << i37))) | (128 << i37);
                                            iArr[iE2] = iArr[i48];
                                            iArr[i48] = i45;
                                            objArr[iE2] = objArr[i48];
                                            objArr[i48] = null;
                                            i14 = i48;
                                        } else {
                                            int i49 = i35;
                                            i12 = i44;
                                            i13 = i31;
                                            jArr4[i46] = ((r11 & 127) << i47) | (j20 & (~(j << i47)));
                                            int i50 = iArr[iE2];
                                            iArr[iE2] = iArr[i49];
                                            iArr[i49] = i50;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i49];
                                            objArr[i49] = obj;
                                            i14 = i49 - 1;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i45] & 72057594037927935L) | Long.MIN_VALUE;
                                        i35 = i14 + 1;
                                        i31 = i13;
                                        i28 = i41;
                                        i27 = i45;
                                        i25 = i12;
                                    }
                                } else {
                                    i35++;
                                }
                            }
                            i10 = i25;
                            i11 = i27;
                            this.f36946f = l0.a(this.f36907d) - this.f36908e;
                        }
                        iE = e(i18);
                    } else {
                        j8 = 128;
                    }
                    j = 255;
                    i10 = 1;
                    i11 = 0;
                    int iB = l0.b(this.f36907d);
                    long[] jArr5 = this.f36904a;
                    int[] iArr2 = this.f36905b;
                    Object[] objArr2 = this.f36906c;
                    int i51 = this.f36907d;
                    f(iB);
                    long[] jArr6 = this.f36904a;
                    int[] iArr3 = this.f36905b;
                    Object[] objArr3 = this.f36906c;
                    int i52 = this.f36907d;
                    int i53 = 0;
                    while (i53 < i51) {
                        if (((jArr5[i53 >> 3] >> ((i53 & 7) << 3)) & 255) < j8) {
                            int i54 = iArr2[i53];
                            int i55 = i54 * i28;
                            int i56 = i55 ^ (i55 << 16);
                            int iE3 = e(i56 >>> 7);
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j21 = i56 & 127;
                            int i57 = iE3 >> 3;
                            int i58 = (iE3 & 7) << 3;
                            long j22 = (jArr[i57] & (~(255 << i58))) | (j21 << i58);
                            jArr[i57] = j22;
                            jArr[(((iE3 - 7) & i52) + (i52 & 7)) >> 3] = j22;
                            iArr3[iE3] = i54;
                            objArr3[iE3] = objArr2[i53];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i53++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iE = e(i18);
                }
                this.f36908e++;
                int i59 = this.f36946f;
                long[] jArr7 = this.f36904a;
                int i60 = iE >> 3;
                long j23 = jArr7[i60];
                int i61 = (iE & 7) << 3;
                if (((j23 >> i61) & j) == j8) {
                    i11 = i10;
                }
                this.f36946f = i59 - i11;
                int i62 = this.f36907d;
                long j24 = (j23 & (~(j << i61))) | (j10 << i61);
                jArr7[i60] = j24;
                jArr7[(((iE - 7) & i62) + (i62 & 7)) >> 3] = j24;
                return iE;
            }
            i22 = i26 + 8;
            i21 = (i21 + i22) & i20;
            i19 = i29;
            i15 = i28;
        }
    }

    public final int e(int i4) {
        int i10 = this.f36907d;
        int i11 = i4 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f36904a;
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

    public final void f(int i4) {
        long[] jArr;
        int iMax = i4 > 0 ? Math.max(7, l0.c(i4)) : 0;
        this.f36907d = iMax;
        if (iMax == 0) {
            jArr = l0.f36914a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            zj.m.W(jArr, -9187201950435737472L);
        }
        this.f36904a = jArr;
        int i10 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f36946f = l0.a(this.f36907d) - this.f36908e;
        this.f36905b = new int[iMax];
        this.f36906c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(int r14) {
        /*
            r13 = this;
            r0 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r14
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f36907d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        Lf:
            long[] r4 = r13.f36904a
            int r5 = r0 >> 3
            r6 = r0 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L3b:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L56
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f36905b
            r11 = r11[r10]
            if (r11 != r14) goto L50
            goto L60
        L50:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3b
        L56:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L92
            r10 = -1
        L60:
            r14 = 0
            if (r10 < 0) goto L91
            int r0 = r13.f36908e
            int r0 = r0 + (-1)
            r13.f36908e = r0
            long[] r0 = r13.f36904a
            int r1 = r13.f36907d
            int r2 = r10 >> 3
            r3 = r10 & 7
            int r3 = r3 << 3
            r4 = r0[r2]
            r6 = 255(0xff, double:1.26E-321)
            long r6 = r6 << r3
            long r6 = ~r6
            long r4 = r4 & r6
            r6 = 254(0xfe, double:1.255E-321)
            long r6 = r6 << r3
            long r4 = r4 | r6
            r0[r2] = r4
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r4
            java.lang.Object[] r0 = r13.f36906c
            r1 = r0[r10]
            r0[r10] = r14
            return r1
        L91:
            return r14
        L92:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: x.u.g(int):java.lang.Object");
    }

    public final void h(int i4, Object obj) {
        int iD = d(i4);
        this.f36905b[iD] = i4;
        this.f36906c[iD] = obj;
    }

    public /* synthetic */ u() {
        this(6);
    }
}
