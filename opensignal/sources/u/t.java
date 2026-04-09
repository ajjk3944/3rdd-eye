package u;

/* loaded from: classes.dex */
public final class t extends j {

    /* renamed from: f, reason: collision with root package name */
    public int f23109f;

    public t(int i10) {
        this.f23078a = g0.f23071a;
        this.f23079b = l.f23088a;
        this.f23080c = v.a.f23731c;
        if (i10 >= 0) {
            f(g0.d(i10));
        } else {
            v.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final void c() {
        this.f23082e = 0;
        long[] jArr = this.f23078a;
        if (jArr != g0.f23071a) {
            mq.l.j0(jArr, -9187201950435737472L);
            long[] jArr2 = this.f23078a;
            int i10 = this.f23081d;
            int i11 = i10 >> 3;
            long j = 255 << ((i10 & 7) << 3);
            jArr2[i11] = (jArr2[i11] & (~j)) | j;
        }
        mq.l.i0(this.f23080c, 0, this.f23081d);
        this.f23109f = g0.a(this.f23081d) - this.f23082e;
    }

    public final int d(int i10) {
        long j;
        long j7;
        int i11;
        long j10;
        long[] jArr;
        long[] jArr2;
        int[] iArr;
        Object[] objArr;
        int i12;
        int i13 = -862048943;
        int iHashCode = Integer.hashCode(i10) * (-862048943);
        int i14 = iHashCode ^ (iHashCode << 16);
        int i15 = i14 >>> 7;
        int i16 = i14 & 127;
        int i17 = this.f23081d;
        int i18 = i15 & i17;
        int i19 = 0;
        while (true) {
            long[] jArr3 = this.f23078a;
            int i20 = i18 >> 3;
            int i21 = (i18 & 7) << 3;
            int i22 = 1;
            long j11 = ((jArr3[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr3[i20] >>> i21);
            long j12 = i16;
            int i23 = i19;
            int i24 = 0;
            long j13 = j11 ^ (j12 * 72340172838076673L);
            long j14 = (~j13) & (j13 - 72340172838076673L) & (-9187201950435737472L);
            while (j14 != 0) {
                int iNumberOfTrailingZeros = (i18 + (Long.numberOfTrailingZeros(j14) >> 3)) & i17;
                int i25 = i13;
                int i26 = i24;
                if (this.f23079b[iNumberOfTrailingZeros] == i10) {
                    return iNumberOfTrailingZeros;
                }
                j14 &= j14 - 1;
                i13 = i25;
                i24 = i26;
            }
            int i27 = i13;
            int i28 = i24;
            if ((((~j11) << 6) & j11 & (-9187201950435737472L)) != 0) {
                int iE = e(i15);
                long j15 = 255;
                if (this.f23109f != 0 || ((this.f23078a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j7 = j12;
                    i11 = 1;
                    j10 = 128;
                } else {
                    int i29 = this.f23081d;
                    if (i29 > 8) {
                        j10 = 128;
                        if (Long.compare((this.f23082e * 32) ^ Long.MIN_VALUE, (i29 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f23078a;
                            int i30 = this.f23081d;
                            int[] iArr2 = this.f23079b;
                            Object[] objArr2 = this.f23080c;
                            int i31 = (i30 + 7) >> 3;
                            int i32 = i28;
                            while (i32 < i31) {
                                long j16 = j15;
                                long j17 = jArr4[i32] & (-9187201950435737472L);
                                jArr4[i32] = (-72340172838076674L) & ((~j17) + (j17 >>> 7));
                                i32++;
                                j12 = j12;
                                j15 = j16;
                            }
                            j = j15;
                            j7 = j12;
                            int iO0 = mq.l.o0(jArr4);
                            int i33 = iO0 - 1;
                            long j18 = 72057594037927935L;
                            jArr4[i33] = (jArr4[i33] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iO0] = jArr4[i28];
                            int i34 = i28;
                            while (i34 != i30) {
                                int i35 = i34 >> 3;
                                int i36 = (i34 & 7) << 3;
                                long j19 = (jArr4[i35] >> i36) & j;
                                if (j19 != 128 && j19 == 254) {
                                    int iHashCode2 = Integer.hashCode(iArr2[i34]) * i27;
                                    int i37 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iE2 = e(i37);
                                    int i38 = i37 & i30;
                                    if (((iE2 - i38) & i30) / 8 == ((i34 - i38) & i30) / 8) {
                                        long j20 = j18;
                                        jArr4[i35] = ((r8 & 127) << i36) | ((~(j << i36)) & jArr4[i35]);
                                        jArr4[jArr4.length - i22] = (jArr4[i28] & j20) | Long.MIN_VALUE;
                                        i34++;
                                        j18 = j20;
                                    } else {
                                        long j21 = j18;
                                        int i39 = iE2 >> 3;
                                        long j22 = jArr4[i39];
                                        int i40 = (iE2 & 7) << 3;
                                        if (((j22 >> i40) & j) == 128) {
                                            i12 = i22;
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            jArr4[i39] = ((~(j << i40)) & j22) | ((r8 & 127) << i40);
                                            jArr4[i35] = (jArr4[i35] & (~(j << i36))) | (128 << i36);
                                            iArr[iE2] = iArr[i34];
                                            iArr[i34] = i28;
                                            objArr[iE2] = objArr[i34];
                                            objArr[i34] = null;
                                        } else {
                                            iArr = iArr2;
                                            objArr = objArr2;
                                            i12 = i22;
                                            jArr4[i39] = ((r8 & 127) << i40) | ((~(j << i40)) & j22);
                                            int i41 = iArr[iE2];
                                            iArr[iE2] = iArr[i34];
                                            iArr[i34] = i41;
                                            Object obj = objArr[iE2];
                                            objArr[iE2] = objArr[i34];
                                            objArr[i34] = obj;
                                            i34--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[i28] & j21) | Long.MIN_VALUE;
                                        i34++;
                                        j18 = j21;
                                        i22 = i12;
                                        iArr2 = iArr;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i34++;
                                }
                            }
                            i11 = i22;
                            this.f23109f = g0.a(this.f23081d) - this.f23082e;
                        }
                        iE = e(i15);
                    } else {
                        j10 = 128;
                    }
                    j = 255;
                    j7 = j12;
                    i11 = 1;
                    int iB = g0.b(this.f23081d);
                    long[] jArr5 = this.f23078a;
                    int[] iArr3 = this.f23079b;
                    Object[] objArr3 = this.f23080c;
                    int i42 = this.f23081d;
                    f(iB);
                    long[] jArr6 = this.f23078a;
                    int[] iArr4 = this.f23079b;
                    Object[] objArr4 = this.f23080c;
                    int i43 = this.f23081d;
                    int i44 = i28;
                    while (i44 < i42) {
                        if (((jArr5[i44 >> 3] >> ((i44 & 7) << 3)) & 255) < j10) {
                            int i45 = iArr3[i44];
                            int iHashCode3 = Integer.hashCode(i45) * i27;
                            int i46 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i46 >>> 7);
                            long j23 = i46 & 127;
                            int i47 = iE3 >> 3;
                            int i48 = (iE3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j24 = (jArr6[i47] & (~(255 << i48))) | (j23 << i48);
                            jArr[i47] = j24;
                            jArr[(((iE3 - 7) & i43) + (i43 & 7)) >> 3] = j24;
                            iArr4[iE3] = i45;
                            objArr4[iE3] = objArr3[i44];
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i44++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iE = e(i15);
                }
                this.f23082e++;
                int i49 = this.f23109f;
                long[] jArr7 = this.f23078a;
                int i50 = iE >> 3;
                long j25 = jArr7[i50];
                int i51 = (iE & 7) << 3;
                if (((j25 >> i51) & j) != j10) {
                    i11 = i28;
                }
                this.f23109f = i49 - i11;
                int i52 = this.f23081d;
                long j26 = (j25 & (~(j << i51))) | (j7 << i51);
                jArr7[i50] = j26;
                jArr7[(((iE - 7) & i52) + (i52 & 7)) >> 3] = j26;
                return iE;
            }
            i19 = i23 + 8;
            i18 = (i18 + i19) & i17;
            i13 = i27;
        }
    }

    public final int e(int i10) {
        int i11 = this.f23081d;
        int i12 = i10 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f23078a;
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

    public final void f(int i10) {
        long[] jArr;
        int iMax = i10 > 0 ? Math.max(7, g0.c(i10)) : 0;
        this.f23081d = iMax;
        if (iMax == 0) {
            jArr = g0.f23071a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            mq.l.j0(jArr, -9187201950435737472L);
        }
        this.f23078a = jArr;
        int i11 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i11] = (jArr[i11] & (~j)) | j;
        this.f23109f = g0.a(this.f23081d) - this.f23082e;
        this.f23079b = new int[iMax];
        this.f23080c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0061, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(int r14) {
        /*
            r13 = this;
            int r0 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r0 = r0 * r1
            int r1 = r0 << 16
            r0 = r0 ^ r1
            r1 = r0 & 127(0x7f, float:1.78E-43)
            int r2 = r13.f23081d
            int r0 = r0 >>> 7
            r0 = r0 & r2
            r3 = 0
        L13:
            long[] r4 = r13.f23078a
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
        L3f:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L5a
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r0
            r10 = r10 & r2
            int[] r11 = r13.f23079b
            r11 = r11[r10]
            if (r11 != r14) goto L54
            goto L64
        L54:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L3f
        L5a:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L97
            r10 = -1
        L64:
            r14 = 0
            if (r10 < 0) goto L96
            int r0 = r13.f23082e
            int r0 = r0 + (-1)
            r13.f23082e = r0
            long[] r0 = r13.f23078a
            int r1 = r13.f23081d
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
            long r3 = r4 | r6
            r0[r2] = r3
            int r2 = r10 + (-7)
            r2 = r2 & r1
            r1 = r1 & 7
            int r2 = r2 + r1
            int r1 = r2 >> 3
            r0[r1] = r3
            java.lang.Object[] r0 = r13.f23080c
            r1 = r0[r10]
            r0[r10] = r14
            return r1
        L96:
            return r14
        L97:
            int r3 = r3 + 8
            int r0 = r0 + r3
            r0 = r0 & r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: u.t.g(int):java.lang.Object");
    }

    public final void h(int i10, Object obj) {
        int iD = d(i10);
        this.f23079b[iD] = i10;
        this.f23080c[iD] = obj;
    }

    public /* synthetic */ t() {
        this(6);
    }
}
