package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class h extends j {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f978c;

    /* renamed from: d, reason: collision with root package name */
    public int f979d;

    /* renamed from: e, reason: collision with root package name */
    public int f980e;

    /* renamed from: f, reason: collision with root package name */
    public int f981f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public int f982h;

    /* renamed from: i, reason: collision with root package name */
    public int f983i = Integer.MAX_VALUE;

    public h(byte[] bArr, int i4, int i10, boolean z3) {
        this.f978c = bArr;
        this.f979d = i10 + i4;
        this.f981f = i4;
        this.g = i4;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int A() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long B() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean C(int i4) throws a0 {
        int i10 = i4 & 7;
        int i11 = 0;
        if (i10 != 0) {
            if (i10 == 1) {
                N(8);
                return true;
            }
            if (i10 == 2) {
                N(J());
                return true;
            }
            if (i10 == 3) {
                D();
                a(((i4 >>> 3) << 3) | 4);
                return true;
            }
            if (i10 == 4) {
                return false;
            }
            if (i10 != 5) {
                throw a0.b();
            }
            N(4);
            return true;
        }
        int i12 = this.f979d - this.f981f;
        byte[] bArr = this.f978c;
        if (i12 >= 10) {
            while (i11 < 10) {
                int i13 = this.f981f;
                this.f981f = i13 + 1;
                if (bArr[i13] < 0) {
                    i11++;
                }
            }
            throw a0.c();
        }
        while (i11 < 10) {
            int i14 = this.f981f;
            if (i14 == this.f979d) {
                throw a0.e();
            }
            this.f981f = i14 + 1;
            if (bArr[i14] < 0) {
                i11++;
            }
        }
        throw a0.c();
        return true;
    }

    public final int H() throws a0 {
        int i4 = this.f981f;
        if (this.f979d - i4 < 4) {
            throw a0.e();
        }
        this.f981f = i4 + 4;
        byte[] bArr = this.f978c;
        return ((bArr[i4 + 3] & 255) << 24) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16);
    }

    public final long I() throws a0 {
        int i4 = this.f981f;
        if (this.f979d - i4 < 8) {
            throw a0.e();
        }
        this.f981f = i4 + 8;
        byte[] bArr = this.f978c;
        return ((bArr[i4 + 7] & 255) << 56) | (bArr[i4] & 255) | ((bArr[i4 + 1] & 255) << 8) | ((bArr[i4 + 2] & 255) << 16) | ((bArr[i4 + 3] & 255) << 24) | ((bArr[i4 + 4] & 255) << 32) | ((bArr[i4 + 5] & 255) << 40) | ((bArr[i4 + 6] & 255) << 48);
    }

    public final int J() {
        int i4;
        int i10 = this.f981f;
        int i11 = this.f979d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f978c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f981f = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    i4 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        i4 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            i4 = (-2080896) ^ i18;
                        } else {
                            i15 = i10 + 5;
                            byte b11 = bArr[i17];
                            int i19 = (i18 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i17 = i10 + 6;
                                if (bArr[i15] < 0) {
                                    i15 = i10 + 7;
                                    if (bArr[i17] < 0) {
                                        i17 = i10 + 8;
                                        if (bArr[i15] < 0) {
                                            i15 = i10 + 9;
                                            if (bArr[i17] < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    i13 = i20;
                                                    i4 = i19;
                                                }
                                            }
                                        }
                                    }
                                }
                                i4 = i19;
                            }
                            i4 = i19;
                        }
                        i13 = i17;
                    }
                    i13 = i15;
                }
                this.f981f = i13;
                return i4;
            }
        }
        return (int) L();
    }

    public final long K() {
        long j;
        long j8;
        long j9;
        long j10;
        int i4 = this.f981f;
        int i10 = this.f979d;
        if (i10 != i4) {
            int i11 = i4 + 1;
            byte[] bArr = this.f978c;
            byte b10 = bArr[i4];
            if (b10 >= 0) {
                this.f981f = i11;
                return b10;
            }
            if (i10 - i11 >= 9) {
                int i12 = i4 + 2;
                int i13 = (bArr[i11] << 7) ^ b10;
                if (i13 < 0) {
                    j = i13 ^ (-128);
                } else {
                    int i14 = i4 + 3;
                    int i15 = (bArr[i12] << 14) ^ i13;
                    if (i15 >= 0) {
                        j = i15 ^ 16256;
                        i12 = i14;
                    } else {
                        int i16 = i4 + 4;
                        int i17 = i15 ^ (bArr[i14] << 21);
                        if (i17 < 0) {
                            j10 = (-2080896) ^ i17;
                        } else {
                            long j11 = i17;
                            i12 = i4 + 5;
                            long j12 = j11 ^ (bArr[i16] << 28);
                            if (j12 >= 0) {
                                j9 = 266354560;
                            } else {
                                i16 = i4 + 6;
                                long j13 = j12 ^ (bArr[i12] << 35);
                                if (j13 < 0) {
                                    j8 = -34093383808L;
                                } else {
                                    i12 = i4 + 7;
                                    j12 = j13 ^ (bArr[i16] << 42);
                                    if (j12 >= 0) {
                                        j9 = 4363953127296L;
                                    } else {
                                        i16 = i4 + 8;
                                        j13 = j12 ^ (bArr[i12] << 49);
                                        if (j13 < 0) {
                                            j8 = -558586000294016L;
                                        } else {
                                            i12 = i4 + 9;
                                            long j14 = (j13 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
                                            if (j14 < 0) {
                                                int i18 = i4 + 10;
                                                if (bArr[i12] >= 0) {
                                                    i12 = i18;
                                                }
                                            }
                                            j = j14;
                                        }
                                    }
                                }
                                j10 = j8 ^ j13;
                            }
                            j = j9 ^ j12;
                        }
                        i12 = i16;
                        j = j10;
                    }
                }
                this.f981f = i12;
                return j;
            }
        }
        return L();
    }

    public final long L() throws a0 {
        long j = 0;
        for (int i4 = 0; i4 < 64; i4 += 7) {
            int i10 = this.f981f;
            if (i10 == this.f979d) {
                throw a0.e();
            }
            this.f981f = i10 + 1;
            j |= (r3 & 127) << i4;
            if ((this.f978c[i10] & 128) == 0) {
                return j;
            }
        }
        throw a0.c();
    }

    public final void M() {
        int i4 = this.f979d + this.f980e;
        this.f979d = i4;
        int i10 = i4 - this.g;
        int i11 = this.f983i;
        if (i10 <= i11) {
            this.f980e = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f980e = i12;
        this.f979d = i4 - i12;
    }

    public final void N(int i4) throws a0 {
        if (i4 >= 0) {
            int i10 = this.f979d;
            int i11 = this.f981f;
            if (i4 <= i10 - i11) {
                this.f981f = i11 + i4;
                return;
            }
        }
        if (i4 >= 0) {
            throw a0.e();
        }
        throw a0.d();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void a(int i4) throws a0 {
        if (this.f982h != i4) {
            throw new a0("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int b() {
        return this.f981f - this.g;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean c() {
        return this.f981f == this.f979d;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final void h(int i4) {
        this.f983i = i4;
        M();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int i(int i4) throws a0 {
        if (i4 < 0) {
            throw a0.d();
        }
        int iB = b() + i4;
        if (iB < 0) {
            throw new a0("Failed to parse the message.");
        }
        int i10 = this.f983i;
        if (iB > i10) {
            throw a0.e();
        }
        this.f983i = iB;
        M();
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final boolean k() {
        return K() != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    @Override // androidx.datastore.preferences.protobuf.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.datastore.preferences.protobuf.g l() throws androidx.datastore.preferences.protobuf.a0 {
        /*
            r4 = this;
            int r0 = r4.J()
            byte[] r1 = r4.f978c
            if (r0 <= 0) goto L19
            int r2 = r4.f979d
            int r3 = r4.f981f
            int r2 = r2 - r3
            if (r0 > r2) goto L19
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.g.d(r3, r0, r1)
            int r2 = r4.f981f
            int r2 = r2 + r0
            r4.f981f = r2
            return r1
        L19:
            if (r0 != 0) goto L1e
            androidx.datastore.preferences.protobuf.g r0 = androidx.datastore.preferences.protobuf.g.f972c
            return r0
        L1e:
            if (r0 <= 0) goto L2f
            int r2 = r4.f979d
            int r3 = r4.f981f
            int r2 = r2 - r3
            if (r0 > r2) goto L2f
            int r0 = r0 + r3
            r4.f981f = r0
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            goto L35
        L2f:
            if (r0 > 0) goto L42
            if (r0 != 0) goto L3d
            byte[] r0 = androidx.datastore.preferences.protobuf.y.f1082b
        L35:
            androidx.datastore.preferences.protobuf.g r1 = androidx.datastore.preferences.protobuf.g.f972c
            androidx.datastore.preferences.protobuf.g r1 = new androidx.datastore.preferences.protobuf.g
            r1.<init>(r0)
            return r1
        L3d:
            androidx.datastore.preferences.protobuf.a0 r0 = androidx.datastore.preferences.protobuf.a0.d()
            throw r0
        L42:
            androidx.datastore.preferences.protobuf.a0 r0 = androidx.datastore.preferences.protobuf.a0.e()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.h.l():androidx.datastore.preferences.protobuf.g");
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final double m() {
        return Double.longBitsToDouble(I());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int n() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int o() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long p() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final float q() {
        return Float.intBitsToFloat(H());
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int r() {
        return J();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long s() {
        return K();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int t() {
        return H();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long u() {
        return I();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int v() {
        int iJ = J();
        return (-(iJ & 1)) ^ (iJ >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final long w() {
        long jK = K();
        return (-(jK & 1)) ^ (jK >>> 1);
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String x() throws a0 {
        int iJ = J();
        if (iJ > 0) {
            int i4 = this.f979d;
            int i10 = this.f981f;
            if (iJ <= i4 - i10) {
                String str = new String(this.f978c, i10, iJ, y.f1081a);
                this.f981f += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ < 0) {
            throw a0.d();
        }
        throw a0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final String y() throws a0 {
        int iJ = J();
        if (iJ > 0) {
            int i4 = this.f979d;
            int i10 = this.f981f;
            if (iJ <= i4 - i10) {
                String strI = n1.f1021a.i(i10, iJ, this.f978c);
                this.f981f += iJ;
                return strI;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ <= 0) {
            throw a0.d();
        }
        throw a0.e();
    }

    @Override // androidx.datastore.preferences.protobuf.j
    public final int z() throws a0 {
        if (c()) {
            this.f982h = 0;
            return 0;
        }
        int iJ = J();
        this.f982h = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw new a0("Protocol message contained an invalid tag (zero).");
    }
}
