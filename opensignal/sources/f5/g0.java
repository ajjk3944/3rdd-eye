package f5;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8489a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8490b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8491c;

    /* renamed from: d, reason: collision with root package name */
    public final float f8492d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8493e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8494f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8495g;

    /* renamed from: h, reason: collision with root package name */
    public final int f8496h;

    /* renamed from: i, reason: collision with root package name */
    public final int f8497i;
    public final short[] j;
    public short[] k;

    /* renamed from: l, reason: collision with root package name */
    public int f8498l;

    /* renamed from: m, reason: collision with root package name */
    public short[] f8499m;

    /* renamed from: n, reason: collision with root package name */
    public int f8500n;

    /* renamed from: o, reason: collision with root package name */
    public short[] f8501o;

    /* renamed from: p, reason: collision with root package name */
    public int f8502p;

    /* renamed from: q, reason: collision with root package name */
    public int f8503q;

    /* renamed from: r, reason: collision with root package name */
    public int f8504r;

    /* renamed from: s, reason: collision with root package name */
    public int f8505s;

    /* renamed from: t, reason: collision with root package name */
    public int f8506t;

    /* renamed from: u, reason: collision with root package name */
    public int f8507u;

    /* renamed from: v, reason: collision with root package name */
    public int f8508v;

    /* renamed from: w, reason: collision with root package name */
    public int f8509w;

    public g0(int i10, int i11, float f10, float f11, int i12, int i13) {
        this.f8489a = i13;
        switch (i13) {
            case 1:
                this.f8490b = i10;
                this.f8491c = i11;
                this.f8492d = f10;
                this.f8493e = f11;
                this.f8494f = i10 / i12;
                this.f8495g = i10 / 400;
                int i14 = i10 / 65;
                this.f8496h = i14;
                int i15 = i14 * 2;
                this.f8497i = i15;
                this.j = new short[i15];
                this.k = new short[i15 * i11];
                this.f8499m = new short[i15 * i11];
                this.f8501o = new short[i15 * i11];
                break;
            default:
                this.f8490b = i10;
                this.f8491c = i11;
                this.f8492d = f10;
                this.f8493e = f11;
                this.f8494f = i10 / i12;
                this.f8495g = i10 / 400;
                int i16 = i10 / 65;
                this.f8496h = i16;
                int i17 = i16 * 2;
                this.f8497i = i17;
                this.j = new short[i17];
                this.k = new short[i17 * i11];
                this.f8499m = new short[i17 * i11];
                this.f8501o = new short[i17 * i11];
                break;
        }
    }

    public static void e(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public static void f(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i12 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i13 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i16] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i18])) / i10);
                i16 += i11;
                i18 += i11;
                i17 += i11;
            }
        }
    }

    public final void a(short[] sArr, int i10, int i11) {
        switch (this.f8489a) {
            case 0:
                short[] sArrC = c(this.f8499m, this.f8500n, i11);
                this.f8499m = sArrC;
                int i12 = this.f8491c;
                System.arraycopy(sArr, i10 * i12, sArrC, this.f8500n * i12, i12 * i11);
                this.f8500n += i11;
                break;
            default:
                short[] sArrC2 = c(this.f8499m, this.f8500n, i11);
                this.f8499m = sArrC2;
                int i13 = this.f8491c;
                System.arraycopy(sArr, i10 * i13, sArrC2, this.f8500n * i13, i13 * i11);
                this.f8500n += i11;
                break;
        }
    }

    public final void b(short[] sArr, int i10, int i11) {
        switch (this.f8489a) {
            case 0:
                int i12 = this.f8497i / i11;
                int i13 = this.f8491c;
                int i14 = i11 * i13;
                int i15 = i10 * i13;
                for (int i16 = 0; i16 < i12; i16++) {
                    int i17 = 0;
                    for (int i18 = 0; i18 < i14; i18++) {
                        i17 += sArr[(i16 * i14) + i15 + i18];
                    }
                    this.j[i16] = (short) (i17 / i14);
                }
                break;
            default:
                int i19 = this.f8497i / i11;
                int i20 = this.f8491c;
                int i21 = i11 * i20;
                int i22 = i10 * i20;
                for (int i23 = 0; i23 < i19; i23++) {
                    int i24 = 0;
                    for (int i25 = 0; i25 < i21; i25++) {
                        i24 += sArr[(i23 * i21) + i22 + i25];
                    }
                    this.j[i23] = (short) (i24 / i21);
                }
                break;
        }
    }

    public final short[] c(short[] sArr, int i10, int i11) {
        switch (this.f8489a) {
            case 0:
                int length = sArr.length;
                int i12 = this.f8491c;
                int i13 = length / i12;
                return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
            default:
                int length2 = sArr.length;
                int i14 = this.f8491c;
                int i15 = length2 / i14;
                return i10 + i11 <= i15 ? sArr : Arrays.copyOf(sArr, (((i15 * 3) / 2) + i11) * i14);
        }
    }

    public final int d(short[] sArr, int i10, int i11, int i12) {
        switch (this.f8489a) {
            case 0:
                int i13 = i10 * this.f8491c;
                int i14 = 255;
                int i15 = 1;
                int i16 = 0;
                int i17 = 0;
                while (i11 <= i12) {
                    int iAbs = 0;
                    for (int i18 = 0; i18 < i11; i18++) {
                        iAbs += Math.abs(sArr[i13 + i18] - sArr[(i13 + i11) + i18]);
                    }
                    if (iAbs * i16 < i15 * i11) {
                        i16 = i11;
                        i15 = iAbs;
                    }
                    if (iAbs * i14 > i17 * i11) {
                        i14 = i11;
                        i17 = iAbs;
                    }
                    i11++;
                }
                this.f8508v = i15 / i16;
                this.f8509w = i17 / i14;
                return i16;
            default:
                int i19 = i10 * this.f8491c;
                int i20 = 255;
                int i21 = 1;
                int i22 = 0;
                int i23 = 0;
                while (i11 <= i12) {
                    int iAbs2 = 0;
                    for (int i24 = 0; i24 < i11; i24++) {
                        iAbs2 += Math.abs(sArr[i19 + i24] - sArr[(i19 + i11) + i24]);
                    }
                    if (iAbs2 * i22 < i21 * i11) {
                        i22 = i11;
                        i21 = iAbs2;
                    }
                    if (iAbs2 * i20 > i23 * i11) {
                        i20 = i11;
                        i23 = iAbs2;
                    }
                    i11++;
                }
                this.f8508v = i21 / i22;
                this.f8509w = i23 / i20;
                return i22;
        }
    }

    public final void g() {
        float f10;
        float f11;
        float f12;
        double d6;
        int iD;
        int i10;
        int i11;
        int i12;
        float f13;
        float f14;
        float f15;
        double d10;
        int iD2;
        int i13;
        int i14;
        int i15;
        switch (this.f8489a) {
            case 0:
                int i16 = this.f8500n;
                float f16 = this.f8492d;
                float f17 = this.f8493e;
                float f18 = f16 / f17;
                float f19 = this.f8494f * f17;
                double d11 = f18;
                int i17 = this.f8490b;
                int i18 = 1;
                int i19 = this.f8491c;
                if (d11 > 1.00001d || d11 < 0.99999d) {
                    int i20 = this.f8498l;
                    int i21 = this.f8497i;
                    if (i20 >= i21) {
                        int i22 = 0;
                        while (true) {
                            int i23 = this.f8505s;
                            if (i23 > 0) {
                                int iMin = Math.min(i21, i23);
                                a(this.k, i22, iMin);
                                this.f8505s -= iMin;
                                i22 += iMin;
                                f11 = f18;
                                f12 = f19;
                                d6 = d11;
                                f10 = 1.0f;
                            } else {
                                short[] sArr = this.k;
                                int i24 = i17 > 4000 ? i17 / 4000 : i18;
                                f10 = 1.0f;
                                int i25 = this.f8496h;
                                int i26 = this.f8495g;
                                if (i19 == i18 && i24 == i18) {
                                    iD = d(sArr, i22, i26, i25);
                                    f11 = f18;
                                    f12 = f19;
                                    d6 = d11;
                                } else {
                                    b(sArr, i22, i24);
                                    f11 = f18;
                                    f12 = f19;
                                    short[] sArr2 = this.j;
                                    d6 = d11;
                                    int iD3 = d(sArr2, 0, i26 / i24, i25 / i24);
                                    if (i24 != 1) {
                                        int i27 = iD3 * i24;
                                        int i28 = i24 * 4;
                                        int i29 = i27 - i28;
                                        int i30 = i27 + i28;
                                        if (i29 >= i26) {
                                            i26 = i29;
                                        }
                                        if (i30 <= i25) {
                                            i25 = i30;
                                        }
                                        if (i19 == 1) {
                                            iD = d(sArr, i22, i26, i25);
                                        } else {
                                            b(sArr, i22, 1);
                                            iD = d(sArr2, 0, i26, i25);
                                        }
                                    } else {
                                        iD = iD3;
                                    }
                                }
                                int i31 = this.f8508v;
                                int i32 = this.f8509w;
                                if (i31 == 0 || (i10 = this.f8506t) == 0 || i32 > i31 * 3 || i31 * 2 <= this.f8507u * 3) {
                                    i10 = iD;
                                }
                                this.f8507u = i31;
                                this.f8506t = iD;
                                if (d6 > 1.0d) {
                                    short[] sArr3 = this.k;
                                    if (f11 >= 2.0f) {
                                        i12 = (int) (i10 / (f11 - 1.0f));
                                    } else {
                                        this.f8505s = (int) (((2.0f - f11) * i10) / (f11 - 1.0f));
                                        i12 = i10;
                                    }
                                    short[] sArrC = c(this.f8499m, this.f8500n, i12);
                                    this.f8499m = sArrC;
                                    int i33 = i22 + i10;
                                    int i34 = i22;
                                    int i35 = i12;
                                    e(i35, this.f8491c, sArrC, this.f8500n, sArr3, i34, sArr3, i33);
                                    this.f8500n += i35;
                                    i22 = i10 + i35 + i34;
                                } else {
                                    int i36 = i22;
                                    short[] sArr4 = this.k;
                                    if (f11 < 0.5f) {
                                        i11 = (int) ((i10 * f11) / (1.0f - f11));
                                    } else {
                                        this.f8505s = (int) ((((2.0f * f11) - 1.0f) * i10) / (1.0f - f11));
                                        i11 = i10;
                                    }
                                    int i37 = i10 + i11;
                                    short[] sArrC2 = c(this.f8499m, this.f8500n, i37);
                                    this.f8499m = sArrC2;
                                    System.arraycopy(sArr4, i36 * i19, sArrC2, this.f8500n * i19, i10 * i19);
                                    e(i11, this.f8491c, this.f8499m, this.f8500n + i10, sArr4, i36 + i10, sArr4, i36);
                                    this.f8500n += i37;
                                    i22 = i36 + i11;
                                }
                            }
                            if (i22 + i21 > i20) {
                                int i38 = this.f8498l - i22;
                                short[] sArr5 = this.k;
                                System.arraycopy(sArr5, i22 * i19, sArr5, 0, i38 * i19);
                                this.f8498l = i38;
                            } else {
                                i18 = 1;
                                f18 = f11;
                                f19 = f12;
                                d11 = d6;
                            }
                        }
                    }
                    if (f12 == f10 && this.f8500n != i16) {
                        int i39 = (int) (i17 / f12);
                        while (true) {
                            if (i39 <= 16384 && i17 <= 16384) {
                                int i40 = this.f8500n - i16;
                                short[] sArrC3 = c(this.f8501o, this.f8502p, i40);
                                this.f8501o = sArrC3;
                                System.arraycopy(this.f8499m, i16 * i19, sArrC3, this.f8502p * i19, i40 * i19);
                                this.f8500n = i16;
                                this.f8502p += i40;
                                int i41 = 0;
                                while (true) {
                                    int i42 = this.f8502p;
                                    int i43 = i42 - 1;
                                    if (i41 < i43) {
                                        while (true) {
                                            int i44 = this.f8503q + 1;
                                            int i45 = i44 * i39;
                                            int i46 = this.f8504r;
                                            if (i45 > i46 * i17) {
                                                this.f8499m = c(this.f8499m, this.f8500n, 1);
                                                for (int i47 = 0; i47 < i19; i47++) {
                                                    short[] sArr6 = this.f8499m;
                                                    int i48 = (this.f8500n * i19) + i47;
                                                    short[] sArr7 = this.f8501o;
                                                    int i49 = (i41 * i19) + i47;
                                                    short s8 = sArr7[i49];
                                                    short s10 = sArr7[i49 + i19];
                                                    int i50 = this.f8504r * i17;
                                                    int i51 = this.f8503q;
                                                    int i52 = i51 * i39;
                                                    int i53 = (i51 + 1) * i39;
                                                    int i54 = i53 - i50;
                                                    int i55 = i53 - i52;
                                                    sArr6[i48] = (short) ((((i55 - i54) * s10) + (s8 * i54)) / i55);
                                                }
                                                this.f8504r++;
                                                this.f8500n++;
                                            } else {
                                                this.f8503q = i44;
                                                if (i44 == i17) {
                                                    this.f8503q = 0;
                                                    a5.a.i(i46 == i39);
                                                    this.f8504r = 0;
                                                }
                                                i41++;
                                            }
                                        }
                                    } else if (i43 != 0) {
                                        short[] sArr8 = this.f8501o;
                                        System.arraycopy(sArr8, i43 * i19, sArr8, 0, (i42 - i43) * i19);
                                        this.f8502p -= i43;
                                        break;
                                    }
                                }
                            } else {
                                i39 /= 2;
                                i17 /= 2;
                            }
                        }
                    }
                } else {
                    a(this.k, 0, this.f8498l);
                    this.f8498l = 0;
                }
                f12 = f19;
                f10 = 1.0f;
                if (f12 == f10) {
                }
                break;
            default:
                int i56 = this.f8500n;
                float f20 = this.f8492d;
                float f21 = this.f8493e;
                float f22 = f20 / f21;
                float f23 = this.f8494f * f21;
                double d12 = f22;
                int i57 = this.f8490b;
                int i58 = 1;
                int i59 = this.f8491c;
                if (d12 > 1.00001d || d12 < 0.99999d) {
                    int i60 = this.f8498l;
                    int i61 = this.f8497i;
                    if (i60 >= i61) {
                        int i62 = 0;
                        while (true) {
                            int i63 = this.f8505s;
                            if (i63 > 0) {
                                int iMin2 = Math.min(i61, i63);
                                a(this.k, i62, iMin2);
                                this.f8505s -= iMin2;
                                i62 += iMin2;
                                f14 = f22;
                                f15 = f23;
                                d10 = d12;
                                f13 = 1.0f;
                            } else {
                                short[] sArr9 = this.k;
                                int i64 = i57 > 4000 ? i57 / 4000 : i58;
                                f13 = 1.0f;
                                int i65 = this.f8496h;
                                int i66 = this.f8495g;
                                if (i59 == i58 && i64 == i58) {
                                    iD2 = d(sArr9, i62, i66, i65);
                                    f14 = f22;
                                    f15 = f23;
                                    d10 = d12;
                                } else {
                                    b(sArr9, i62, i64);
                                    f14 = f22;
                                    f15 = f23;
                                    short[] sArr10 = this.j;
                                    d10 = d12;
                                    int iD4 = d(sArr10, 0, i66 / i64, i65 / i64);
                                    if (i64 != 1) {
                                        int i67 = iD4 * i64;
                                        int i68 = i64 * 4;
                                        int i69 = i67 - i68;
                                        int i70 = i67 + i68;
                                        if (i69 >= i66) {
                                            i66 = i69;
                                        }
                                        if (i70 <= i65) {
                                            i65 = i70;
                                        }
                                        if (i59 == 1) {
                                            iD2 = d(sArr9, i62, i66, i65);
                                        } else {
                                            b(sArr9, i62, 1);
                                            iD2 = d(sArr10, 0, i66, i65);
                                        }
                                    } else {
                                        iD2 = iD4;
                                    }
                                }
                                int i71 = this.f8508v;
                                int i72 = this.f8509w;
                                if (i71 == 0 || (i13 = this.f8506t) == 0 || i72 > i71 * 3 || i71 * 2 <= this.f8507u * 3) {
                                    i13 = iD2;
                                }
                                this.f8507u = i71;
                                this.f8506t = iD2;
                                if (d10 > 1.0d) {
                                    short[] sArr11 = this.k;
                                    if (f14 >= 2.0f) {
                                        i15 = (int) (i13 / (f14 - 1.0f));
                                    } else {
                                        this.f8505s = (int) (((2.0f - f14) * i13) / (f14 - 1.0f));
                                        i15 = i13;
                                    }
                                    short[] sArrC4 = c(this.f8499m, this.f8500n, i15);
                                    this.f8499m = sArrC4;
                                    int i73 = i62 + i13;
                                    int i74 = i62;
                                    int i75 = i15;
                                    f(i75, this.f8491c, sArrC4, this.f8500n, sArr11, i74, sArr11, i73);
                                    this.f8500n += i75;
                                    i62 = i13 + i75 + i74;
                                } else {
                                    int i76 = i62;
                                    short[] sArr12 = this.k;
                                    if (f14 < 0.5f) {
                                        i14 = (int) ((i13 * f14) / (1.0f - f14));
                                    } else {
                                        this.f8505s = (int) ((((2.0f * f14) - 1.0f) * i13) / (1.0f - f14));
                                        i14 = i13;
                                    }
                                    int i77 = i13 + i14;
                                    short[] sArrC5 = c(this.f8499m, this.f8500n, i77);
                                    this.f8499m = sArrC5;
                                    System.arraycopy(sArr12, i76 * i59, sArrC5, this.f8500n * i59, i13 * i59);
                                    f(i14, this.f8491c, this.f8499m, this.f8500n + i13, sArr12, i76 + i13, sArr12, i76);
                                    this.f8500n += i77;
                                    i62 = i76 + i14;
                                }
                            }
                            if (i62 + i61 > i60) {
                                int i78 = this.f8498l - i62;
                                short[] sArr13 = this.k;
                                System.arraycopy(sArr13, i62 * i59, sArr13, 0, i78 * i59);
                                this.f8498l = i78;
                            } else {
                                i58 = 1;
                                f22 = f14;
                                f23 = f15;
                                d12 = d10;
                            }
                        }
                    }
                    if (f15 == f13 && this.f8500n != i56) {
                        int i79 = (int) (i57 / f15);
                        while (true) {
                            if (i79 <= 16384 && i57 <= 16384) {
                                int i80 = this.f8500n - i56;
                                short[] sArrC6 = c(this.f8501o, this.f8502p, i80);
                                this.f8501o = sArrC6;
                                System.arraycopy(this.f8499m, i56 * i59, sArrC6, this.f8502p * i59, i80 * i59);
                                this.f8500n = i56;
                                this.f8502p += i80;
                                int i81 = 0;
                                while (true) {
                                    int i82 = this.f8502p;
                                    int i83 = i82 - 1;
                                    if (i81 < i83) {
                                        while (true) {
                                            int i84 = this.f8503q + 1;
                                            int i85 = i84 * i79;
                                            int i86 = this.f8504r;
                                            if (i85 > i86 * i57) {
                                                this.f8499m = c(this.f8499m, this.f8500n, 1);
                                                for (int i87 = 0; i87 < i59; i87++) {
                                                    short[] sArr14 = this.f8499m;
                                                    int i88 = (this.f8500n * i59) + i87;
                                                    short[] sArr15 = this.f8501o;
                                                    int i89 = (i81 * i59) + i87;
                                                    short s11 = sArr15[i89];
                                                    short s12 = sArr15[i89 + i59];
                                                    int i90 = this.f8504r * i57;
                                                    int i91 = this.f8503q;
                                                    int i92 = i91 * i79;
                                                    int i93 = (i91 + 1) * i79;
                                                    int i94 = i93 - i90;
                                                    int i95 = i93 - i92;
                                                    sArr14[i88] = (short) ((((i95 - i94) * s12) + (s11 * i94)) / i95);
                                                }
                                                this.f8504r++;
                                                this.f8500n++;
                                            } else {
                                                this.f8503q = i84;
                                                if (i84 == i57) {
                                                    this.f8503q = 0;
                                                    qb.b.j(i86 == i79);
                                                    this.f8504r = 0;
                                                }
                                                i81++;
                                            }
                                        }
                                    } else if (i83 != 0) {
                                        short[] sArr16 = this.f8501o;
                                        System.arraycopy(sArr16, i83 * i59, sArr16, 0, (i82 - i83) * i59);
                                        this.f8502p -= i83;
                                        break;
                                    }
                                }
                            } else {
                                i79 /= 2;
                                i57 /= 2;
                            }
                        }
                    }
                } else {
                    a(this.k, 0, this.f8498l);
                    this.f8498l = 0;
                }
                f15 = f23;
                f13 = 1.0f;
                if (f15 == f13) {
                }
                break;
        }
    }
}
