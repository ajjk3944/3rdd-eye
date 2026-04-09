package x;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f36882a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f36883b;

    /* renamed from: c, reason: collision with root package name */
    public int f36884c;

    /* renamed from: d, reason: collision with root package name */
    public int f36885d;

    /* renamed from: e, reason: collision with root package name */
    public int f36886e;

    public f0(int i4) {
        this.f36882a = l0.f36914a;
        this.f36883b = y.a.f37286c;
        if (i4 >= 0) {
            f(l0.d(i4));
        } else {
            y.a.c("Capacity must be a positive value.");
            throw null;
        }
    }

    public final boolean a(Object obj) {
        int i4 = this.f36885d;
        this.f36883b[d(obj)] = obj;
        return this.f36885d != i4;
    }

    public final void b() {
        this.f36885d = 0;
        long[] jArr = this.f36882a;
        if (jArr != l0.f36914a) {
            zj.m.W(jArr, -9187201950435737472L);
            long[] jArr2 = this.f36882a;
            int i4 = this.f36884c;
            int i10 = i4 >> 3;
            long j = 255 << ((i4 & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j)) | j;
        }
        zj.m.U(0, this.f36884c, null, this.f36883b);
        this.f36886e = l0.a(this.f36884c) - this.f36885d;
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
            int r5 = r0.f36884c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f36882a
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
            java.lang.Object[] r15 = r0.f36883b
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
        throw new UnsupportedOperationException("Method not decompiled: x.f0.c(java.lang.Object):boolean");
    }

    public final int d(Object obj) {
        long j;
        long j8;
        long j9;
        long[] jArr;
        long[] jArr2;
        int i4;
        Object[] objArr;
        int i10;
        int i11 = -862048943;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i12 = iHashCode ^ (iHashCode << 16);
        int i13 = i12 >>> 7;
        int i14 = i12 & 127;
        int i15 = this.f36884c;
        int i16 = i13 & i15;
        int i17 = 0;
        while (true) {
            long[] jArr3 = this.f36882a;
            int i18 = i16 >> 3;
            int i19 = (i16 & 7) << 3;
            long j10 = ((jArr3[i18 + 1] << (64 - i19)) & ((-i19) >> 63)) | (jArr3[i18] >>> i19);
            long j11 = i14;
            int i20 = i14;
            long j12 = j10 ^ (j11 * 72340172838076673L);
            long j13 = (~j12) & (j12 - 72340172838076673L) & (-9187201950435737472L);
            while (j13 != 0) {
                int iNumberOfTrailingZeros = (i16 + (Long.numberOfTrailingZeros(j13) >> 3)) & i15;
                int i21 = i11;
                if (nk.k.a(this.f36883b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
                j13 &= j13 - 1;
                i11 = i21;
            }
            int i22 = i11;
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iE = e(i13);
                long j14 = 255;
                if (this.f36886e != 0 || ((this.f36882a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j = 255;
                    j8 = j11;
                    j9 = 128;
                } else {
                    int i23 = this.f36884c;
                    if (i23 > 8) {
                        int i24 = 8;
                        if (Long.compare((this.f36885d * 32) ^ Long.MIN_VALUE, (i23 * 25) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f36882a;
                            int i25 = this.f36884c;
                            Object[] objArr2 = this.f36883b;
                            int i26 = (i25 + 7) >> 3;
                            int i27 = 0;
                            j9 = 128;
                            while (i27 < i26) {
                                long j15 = j14;
                                long j16 = jArr4[i27] & (-9187201950435737472L);
                                jArr4[i27] = (-72340172838076674L) & ((~j16) + (j16 >>> 7));
                                i27++;
                                i24 = i24;
                                j11 = j11;
                                j14 = j15;
                            }
                            j = j14;
                            j8 = j11;
                            int i28 = i24;
                            int iZ = zj.m.Z(jArr4);
                            int i29 = iZ - 1;
                            long j17 = 72057594037927935L;
                            jArr4[i29] = (jArr4[i29] & 72057594037927935L) | (-72057594037927936L);
                            jArr4[iZ] = jArr4[0];
                            int i30 = 0;
                            while (i30 != i25) {
                                int i31 = i30 >> 3;
                                int i32 = (i30 & 7) << 3;
                                long j18 = (jArr4[i31] >> i32) & j;
                                if (j18 != 128 && j18 == 254) {
                                    Object obj2 = objArr2[i30];
                                    int iHashCode2 = (obj2 != null ? obj2.hashCode() : 0) * i22;
                                    int i33 = (iHashCode2 ^ (iHashCode2 << 16)) >>> 7;
                                    int iE2 = e(i33);
                                    int i34 = i33 & i25;
                                    if (((iE2 - i34) & i25) / i28 == ((i30 - i34) & i25) / i28) {
                                        long j19 = j17;
                                        jArr4[i31] = ((r7 & 127) << i32) | ((~(j << i32)) & jArr4[i31]);
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j19) | Long.MIN_VALUE;
                                        i30++;
                                        j17 = j19;
                                    } else {
                                        long j20 = j17;
                                        int i35 = iE2 >> 3;
                                        long j21 = jArr4[i35];
                                        int i36 = (iE2 & 7) << 3;
                                        if (((j21 >> i36) & j) == 128) {
                                            i10 = i28;
                                            i4 = i25;
                                            objArr = objArr2;
                                            jArr4[i35] = ((~(j << i36)) & j21) | ((r7 & 127) << i36);
                                            jArr4[i31] = (jArr4[i31] & (~(j << i32))) | (128 << i32);
                                            objArr[iE2] = objArr[i30];
                                            objArr[i30] = null;
                                        } else {
                                            i4 = i25;
                                            objArr = objArr2;
                                            i10 = i28;
                                            jArr4[i35] = ((r7 & 127) << i36) | ((~(j << i36)) & j21);
                                            Object obj3 = objArr[iE2];
                                            objArr[iE2] = objArr[i30];
                                            objArr[i30] = obj3;
                                            i30--;
                                        }
                                        jArr4[jArr4.length - 1] = (jArr4[0] & j20) | Long.MIN_VALUE;
                                        i30++;
                                        j17 = j20;
                                        i28 = i10;
                                        i25 = i4;
                                        objArr2 = objArr;
                                    }
                                } else {
                                    i30++;
                                }
                            }
                            this.f36886e = l0.a(this.f36884c) - this.f36885d;
                        }
                        iE = e(i13);
                    }
                    j = 255;
                    j8 = j11;
                    j9 = 128;
                    int iB = l0.b(this.f36884c);
                    long[] jArr5 = this.f36882a;
                    Object[] objArr3 = this.f36883b;
                    int i37 = this.f36884c;
                    f(iB);
                    long[] jArr6 = this.f36882a;
                    Object[] objArr4 = this.f36883b;
                    int i38 = this.f36884c;
                    int i39 = 0;
                    while (i39 < i37) {
                        if (((jArr5[i39 >> 3] >> ((i39 & 7) << 3)) & 255) < 128) {
                            Object obj4 = objArr3[i39];
                            int iHashCode3 = (obj4 != null ? obj4.hashCode() : 0) * i22;
                            int i40 = iHashCode3 ^ (iHashCode3 << 16);
                            int iE3 = e(i40 >>> 7);
                            long j22 = i40 & 127;
                            int i41 = iE3 >> 3;
                            int i42 = (iE3 & 7) << 3;
                            jArr = jArr6;
                            jArr2 = jArr5;
                            long j23 = (jArr6[i41] & (~(255 << i42))) | (j22 << i42);
                            jArr[i41] = j23;
                            jArr[(((iE3 - 7) & i38) + (i38 & 7)) >> 3] = j23;
                            objArr4[iE3] = obj4;
                        } else {
                            jArr = jArr6;
                            jArr2 = jArr5;
                        }
                        i39++;
                        jArr5 = jArr2;
                        jArr6 = jArr;
                    }
                    iE = e(i13);
                }
                this.f36885d++;
                int i43 = this.f36886e;
                long[] jArr7 = this.f36882a;
                int i44 = iE >> 3;
                long j24 = jArr7[i44];
                int i45 = (iE & 7) << 3;
                this.f36886e = i43 - (((j24 >> i45) & j) == j9 ? 1 : 0);
                int i46 = this.f36884c;
                long j25 = (j24 & (~(j << i45))) | (j8 << i45);
                jArr7[i44] = j25;
                jArr7[(((iE - 7) & i46) + (i46 & 7)) >> 3] = j25;
                return iE;
            }
            i17 += 8;
            i16 = (i16 + i17) & i15;
            i14 = i20;
            i11 = i22;
        }
    }

    public final int e(int i4) {
        int i10 = this.f36884c;
        int i11 = i4 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.f36882a;
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
            boolean r3 = r1 instanceof x.f0
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            x.f0 r1 = (x.f0) r1
            int r3 = r1.f36885d
            int r5 = r0.f36885d
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f36883b
            long[] r5 = r0.f36882a
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
        throw new UnsupportedOperationException("Method not decompiled: x.f0.equals(java.lang.Object):boolean");
    }

    public final void f(int i4) {
        long[] jArr;
        int iMax = i4 > 0 ? Math.max(7, l0.c(i4)) : 0;
        this.f36884c = iMax;
        if (iMax == 0) {
            jArr = l0.f36914a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            zj.m.W(jArr, -9187201950435737472L);
        }
        this.f36882a = jArr;
        int i10 = iMax >> 3;
        long j = 255 << ((iMax & 7) << 3);
        jArr[i10] = (jArr[i10] & (~j)) | j;
        this.f36886e = l0.a(this.f36884c) - this.f36885d;
        this.f36883b = iMax == 0 ? y.a.f37286c : new Object[iMax];
    }

    public final boolean g() {
        return this.f36885d == 0;
    }

    public final boolean h() {
        return this.f36885d != 0;
    }

    public final int hashCode() {
        int iHashCode = (this.f36884c * 31) + this.f36885d;
        Object[] objArr = this.f36883b;
        long[] jArr = this.f36882a;
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f36884c
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f36882a
            int r5 = r1 >> 3
            r6 = r1 & 7
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
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f36883b
            r11 = r11[r10]
            boolean r11 = nk.k.a(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L72
            r10 = -1
        L6c:
            if (r10 < 0) goto L71
            r13.m(r10)
        L71:
            return
        L72:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: x.f0.i(java.lang.Object):void");
    }

    public final void j(Object obj) {
        this.f36883b[d(obj)] = obj;
    }

    public final void k(f0 f0Var) {
        nk.k.e(f0Var, "elements");
        Object[] objArr = f0Var.f36883b;
        long[] jArr = f0Var.f36882a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j = jArr[i4];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i4 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j) < 128) {
                        j(objArr[(i4 << 3) + i11]);
                    }
                    j >>= 8;
                }
                if (i10 != 8) {
                    return;
                }
            }
            if (i4 == length) {
                return;
            } else {
                i4++;
            }
        }
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
    public final boolean l(java.lang.Object r18) {
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
            int r5 = r0.f36884c
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.f36882a
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
            java.lang.Object[] r15 = r0.f36883b
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
            r0.m(r11)
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: x.f0.l(java.lang.Object):boolean");
    }

    public final void m(int i4) {
        this.f36885d--;
        long[] jArr = this.f36882a;
        int i10 = this.f36884c;
        int i11 = i4 >> 3;
        int i12 = (i4 & 7) << 3;
        long j = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j;
        jArr[(((i4 - 7) & i10) + (i10 & 7)) >> 3] = j;
        this.f36883b[i4] = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[PHI: r8
  0x0067: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:6:0x002a, B:18:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r18 = this;
            r0 = r18
            c2.l0 r1 = new c2.l0
            r2 = 29
            r1.<init>(r2, r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            java.lang.Object[] r3 = r0.f36883b
            long[] r4 = r0.f36882a
            int r5 = r4.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6c
            r6 = 0
            r7 = r6
            r8 = r7
        L1c:
            r9 = r4[r7]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L67
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r6
        L36:
            if (r13 >= r11) goto L65
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L61
            int r14 = r7 << 3
            int r14 = r14 + r13
            r14 = r3[r14]
            r15 = -1
            if (r8 != r15) goto L4f
            java.lang.String r1 = "..."
            r2.append(r1)
            goto L71
        L4f:
            if (r8 == 0) goto L56
            java.lang.String r15 = ", "
            r2.append(r15)
        L56:
            java.lang.Object r14 = r1.invoke(r14)
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            r2.append(r14)
            int r8 = r8 + 1
        L61:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L36
        L65:
            if (r11 != r12) goto L6c
        L67:
            if (r7 == r5) goto L6c
            int r7 = r7 + 1
            goto L1c
        L6c:
            java.lang.String r1 = "]"
            r2.append(r1)
        L71:
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "toString(...)"
            nk.k.d(r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x.f0.toString():java.lang.String");
    }

    public /* synthetic */ f0() {
        this(6);
    }
}
