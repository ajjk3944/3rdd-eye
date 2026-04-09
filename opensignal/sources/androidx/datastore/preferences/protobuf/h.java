package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public final class h extends j {
    public final int B;
    public int D;
    public int E = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f1283g;

    /* renamed from: r, reason: collision with root package name */
    public int f1284r;

    /* renamed from: x, reason: collision with root package name */
    public int f1285x;

    /* renamed from: y, reason: collision with root package name */
    public int f1286y;

    public h(byte[] bArr, int i10, int i11, boolean z10) {
        this.f1283g = bArr;
        this.f1284r = i11 + i10;
        this.f1286y = i10;
        this.B = i10;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long A() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean B(int i10) throws e0 {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 == 1) {
                J(8);
                return true;
            }
            if (i11 == 2) {
                J(F());
                return true;
            }
            if (i11 == 3) {
                C();
                a(((i10 >>> 3) << 3) | 4);
                return true;
            }
            if (i11 == 4) {
                return false;
            }
            if (i11 != 5) {
                throw e0.b();
            }
            J(4);
            return true;
        }
        int i13 = this.f1284r - this.f1286y;
        byte[] bArr = this.f1283g;
        if (i13 >= 10) {
            while (i12 < 10) {
                int i14 = this.f1286y;
                this.f1286y = i14 + 1;
                if (bArr[i14] < 0) {
                    i12++;
                }
            }
            throw e0.c();
        }
        while (i12 < 10) {
            int i15 = this.f1286y;
            if (i15 == this.f1284r) {
                throw e0.e();
            }
            this.f1286y = i15 + 1;
            if (bArr[i15] < 0) {
                i12++;
            }
        }
        throw e0.c();
        return true;
    }

    public final int D() throws e0 {
        int i10 = this.f1286y;
        if (this.f1284r - i10 < 4) {
            throw e0.e();
        }
        this.f1286y = i10 + 4;
        byte[] bArr = this.f1283g;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long E() throws e0 {
        int i10 = this.f1286y;
        if (this.f1284r - i10 < 8) {
            throw e0.e();
        }
        this.f1286y = i10 + 8;
        byte[] bArr = this.f1283g;
        return ((bArr[i10 + 7] & 255) << 56) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final int F() {
        int i10;
        int i11 = this.f1286y;
        int i12 = this.f1284r;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f1283g;
            byte b2 = bArr[i11];
            if (b2 >= 0) {
                this.f1286y = i13;
                return b2;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b2;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b10 = bArr[i18];
                            int i20 = (i19 ^ (b10 << 28)) ^ 266354560;
                            if (b10 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f1286y = i14;
                return i10;
            }
        }
        return (int) H();
    }

    public final long G() {
        long j;
        long j7;
        long j10;
        long j11;
        int i10 = this.f1286y;
        int i11 = this.f1284r;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f1283g;
            byte b2 = bArr[i10];
            if (b2 >= 0) {
                this.f1286y = i12;
                return b2;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b2;
                if (i14 < 0) {
                    j = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j11 = (-2080896) ^ i18;
                        } else {
                            long j12 = i18;
                            i13 = i10 + 5;
                            long j13 = j12 ^ (bArr[i17] << 28);
                            if (j13 >= 0) {
                                j10 = 266354560;
                            } else {
                                i17 = i10 + 6;
                                long j14 = j13 ^ (bArr[i13] << 35);
                                if (j14 < 0) {
                                    j7 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j13 = j14 ^ (bArr[i17] << 42);
                                    if (j13 >= 0) {
                                        j10 = 4363953127296L;
                                    } else {
                                        i17 = i10 + 8;
                                        j14 = j13 ^ (bArr[i13] << 49);
                                        if (j14 < 0) {
                                            j7 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j15 = (j14 ^ (bArr[i17] << 56)) ^ 71499008037633920L;
                                            if (j15 < 0) {
                                                int i19 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i19;
                                                }
                                            }
                                            j = j15;
                                        }
                                    }
                                }
                                j11 = j7 ^ j14;
                            }
                            j = j10 ^ j13;
                        }
                        i13 = i17;
                        j = j11;
                    }
                }
                this.f1286y = i13;
                return j;
            }
        }
        return H();
    }

    public final long H() throws e0 {
        long j = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f1286y;
            if (i11 == this.f1284r) {
                throw e0.e();
            }
            this.f1286y = i11 + 1;
            j |= (r3 & 127) << i10;
            if ((this.f1283g[i11] & 128) == 0) {
                return j;
            }
        }
        throw e0.c();
    }

    public final void I() {
        int i10 = this.f1284r + this.f1285x;
        this.f1284r = i10;
        int i11 = i10 - this.B;
        int i12 = this.E;
        if (i11 <= i12) {
            this.f1285x = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f1285x = i13;
        this.f1284r = i10 - i13;
    }

    public final void J(int i10) throws e0 {
        if (i10 >= 0) {
            int i11 = this.f1284r;
            int i12 = this.f1286y;
            if (i10 <= i11 - i12) {
                this.f1286y = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw e0.e();
        }
        throw e0.d();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void a(int i10) throws e0 {
        if (this.D != i10) {
            throw new e0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int b() {
        return this.f1286y - this.B;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean c() {
        return this.f1286y == this.f1284r;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void h(int i10) {
        this.E = i10;
        I();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int i(int i10) throws e0 {
        if (i10 < 0) {
            throw e0.d();
        }
        int iB = b() + i10;
        if (iB < 0) {
            throw new e0("Failed to parse the message.");
        }
        int i11 = this.E;
        if (iB > i11) {
            throw e0.e();
        }
        this.E = iB;
        I();
        return i11;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean j() {
        return G() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // androidx.datastore.preferences.protobuf.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.datastore.preferences.protobuf.g k() throws androidx.datastore.preferences.protobuf.e0 {
        /*
            r4 = this;
            int r0 = r4.F()
            byte[] r1 = r4.f1283g
            if (r0 <= 0) goto L19
            int r2 = r4.f1284r
            int r3 = r4.f1286y
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.g.c(r1, r3, r0)
            int r2 = r4.f1286y
            int r2 = r2 + r0
            r4.f1286y = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            androidx.datastore.preferences.protobuf.g r0 = androidx.datastore.preferences.protobuf.g.f1276g
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f1284r
            int r3 = r4.f1286y
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f1286y = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = androidx.datastore.preferences.protobuf.c0.f1254b
        L35:
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.g.f1276g
            androidx.datastore.preferences.protobuf.g r1 = new androidx.datastore.preferences.protobuf.g
            r1.<init>(r0)
            return r1
        L3d:
            androidx.datastore.preferences.protobuf.e0 r0 = androidx.datastore.preferences.protobuf.e0.d()
            throw r0
        L42:
            androidx.datastore.preferences.protobuf.e0 r0 = androidx.datastore.preferences.protobuf.e0.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.k():androidx.datastore.preferences.protobuf.g");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final double l() {
        return Double.longBitsToDouble(E());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int m() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int n() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long o() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final float p() {
        return Float.intBitsToFloat(D());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int q() {
        return F();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long r() {
        return G();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int s() {
        return D();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long t() {
        return E();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int u() {
        int iF = F();
        return (-(iF & 1)) ^ (iF >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long v() {
        long jG = G();
        return (-(jG & 1)) ^ (jG >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String w() throws e0 {
        int iF = F();
        if (iF > 0) {
            int i10 = this.f1284r;
            int i11 = this.f1286y;
            if (iF <= i10 - i11) {
                String str = new String(this.f1283g, i11, iF, c0.f1253a);
                this.f1286y += iF;
                return str;
            }
        }
        if (iF == 0) {
            return "";
        }
        if (iF < 0) {
            throw e0.d();
        }
        throw e0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String x() throws e0 {
        int iF = F();
        if (iF > 0) {
            int i10 = this.f1284r;
            int i11 = this.f1286y;
            if (iF <= i10 - i11) {
                String strJ = t1.f1366a.J(this.f1283g, i11, iF);
                this.f1286y += iF;
                return strJ;
            }
        }
        if (iF == 0) {
            return "";
        }
        if (iF <= 0) {
            throw e0.d();
        }
        throw e0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int y() throws e0 {
        if (c()) {
            this.D = 0;
            return 0;
        }
        int iF = F();
        this.D = iF;
        if ((iF >>> 3) != 0) {
            return iF;
        }
        throw new e0("Protocol message contained an invalid tag (zero).");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int z() {
        return F();
    }
}
