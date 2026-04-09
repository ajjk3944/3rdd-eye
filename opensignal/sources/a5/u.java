package a5;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f158b;

    /* renamed from: c, reason: collision with root package name */
    public int f159c;

    /* renamed from: d, reason: collision with root package name */
    public int f160d;

    /* renamed from: e, reason: collision with root package name */
    public int f161e;

    public /* synthetic */ u(byte[] bArr, int i10, int i11, byte b2) {
        this.f157a = i11;
        this.f158b = bArr;
        this.f161e = i10;
    }

    public void a() {
        int i10;
        int i11;
        int i12;
        int i13;
        switch (this.f157a) {
            case 0:
                int i14 = this.f159c;
                a.i(i14 >= 0 && (i14 < (i10 = this.f161e) || (i14 == i10 && this.f160d == 0)));
                break;
            case 1:
            case 2:
            default:
                int i15 = this.f160d;
                a.i(i15 >= 0 && (i15 < (i13 = this.f159c) || (i15 == i13 && this.f161e == 0)));
                break;
            case 3:
                int i16 = this.f159c;
                qb.b.j(i16 >= 0 && (i16 < (i11 = this.f161e) || (i16 == i11 && this.f160d == 0)));
                break;
            case 4:
                int i17 = this.f160d;
                qb.b.j(i17 >= 0 && (i17 < (i12 = this.f159c) || (i17 == i12 && this.f161e == 0)));
                break;
        }
    }

    public int b() {
        int i10;
        int i11;
        switch (this.f157a) {
            case 0:
                i10 = (this.f161e - this.f159c) * 8;
                i11 = this.f160d;
                break;
            default:
                i10 = (this.f161e - this.f159c) * 8;
                i11 = this.f160d;
                break;
        }
        return i10 - i11;
    }

    public void c() {
        switch (this.f157a) {
            case 0:
                if (this.f160d != 0) {
                    this.f160d = 0;
                    this.f159c++;
                    a();
                    break;
                }
                break;
            default:
                if (this.f160d != 0) {
                    this.f160d = 0;
                    this.f159c++;
                    a();
                    break;
                }
                break;
        }
    }

    public boolean d(int i10) {
        switch (this.f157a) {
            case 4:
                int i11 = this.f160d;
                int i12 = i10 / 8;
                int i13 = i11 + i12;
                int i14 = (this.f161e + i10) - (i12 * 8);
                if (i14 > 7) {
                    i13++;
                    i14 -= 8;
                }
                while (true) {
                    i11++;
                    if (i11 <= i13 && i13 < this.f159c) {
                        if (q(i11)) {
                            i13++;
                            i11 += 2;
                        }
                    }
                }
                int i15 = this.f159c;
                if (i13 >= i15) {
                    if (i13 != i15 || i14 != 0) {
                    }
                }
                break;
            default:
                int i16 = this.f160d;
                int i17 = i10 / 8;
                int i18 = i16 + i17;
                int i19 = (this.f161e + i10) - (i17 * 8);
                if (i19 > 7) {
                    i18++;
                    i19 -= 8;
                }
                while (true) {
                    i16++;
                    if (i16 <= i18 && i18 < this.f159c) {
                        if (q(i16)) {
                            i18++;
                            i16 += 2;
                        }
                    }
                }
                int i20 = this.f159c;
                if (i18 >= i20) {
                    if (i18 != i20 || i19 != 0) {
                    }
                }
                break;
        }
        return true;
    }

    public boolean e() {
        switch (this.f157a) {
            case 4:
                int i10 = this.f160d;
                int i11 = this.f161e;
                int i12 = 0;
                while (this.f160d < this.f159c && !h()) {
                    i12++;
                }
                boolean z10 = this.f160d == this.f159c;
                this.f160d = i10;
                this.f161e = i11;
                if (!z10 && d((i12 * 2) + 1)) {
                    break;
                }
                break;
            default:
                int i13 = this.f160d;
                int i14 = this.f161e;
                int i15 = 0;
                while (this.f160d < this.f159c && !h()) {
                    i15++;
                }
                boolean z11 = this.f160d == this.f159c;
                this.f160d = i13;
                this.f161e = i14;
                if (!z11 && d((i15 * 2) + 1)) {
                    break;
                }
                break;
        }
        return true;
    }

    public int f() {
        switch (this.f157a) {
            case 0:
                a.i(this.f160d == 0);
                break;
            default:
                qb.b.j(this.f160d == 0);
                break;
        }
        return this.f159c;
    }

    public int g() {
        return (this.f159c * 8) + this.f160d;
    }

    public boolean h() {
        switch (this.f157a) {
            case 0:
                boolean z10 = (this.f158b[this.f159c] & (128 >> this.f160d)) != 0;
                r();
                return z10;
            case 1:
                boolean z11 = (((this.f158b[this.f160d] & 255) >> this.f161e) & 1) == 1;
                s(1);
                return z11;
            case 2:
            default:
                boolean z12 = (((this.f158b[this.f160d] & 255) >> this.f161e) & 1) == 1;
                s(1);
                return z12;
            case 3:
                boolean z13 = (this.f158b[this.f159c] & (128 >> this.f160d)) != 0;
                r();
                return z13;
            case 4:
                boolean z14 = (this.f158b[this.f160d] & (128 >> this.f161e)) != 0;
                r();
                return z14;
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                boolean z15 = (this.f158b[this.f160d] & (128 >> this.f161e)) != 0;
                r();
                return z15;
        }
    }

    public int i(int i10) {
        switch (this.f157a) {
            case 0:
                if (i10 == 0) {
                    return 0;
                }
                this.f160d += i10;
                int i11 = 0;
                while (true) {
                    int i12 = this.f160d;
                    if (i12 <= 8) {
                        byte[] bArr = this.f158b;
                        int i13 = this.f159c;
                        int i14 = ((-1) >>> (32 - i10)) & (i11 | ((bArr[i13] & 255) >> (8 - i12)));
                        if (i12 == 8) {
                            this.f160d = 0;
                            this.f159c = i13 + 1;
                        }
                        a();
                        return i14;
                    }
                    int i15 = i12 - 8;
                    this.f160d = i15;
                    byte[] bArr2 = this.f158b;
                    int i16 = this.f159c;
                    this.f159c = i16 + 1;
                    i11 |= (bArr2[i16] & 255) << i15;
                }
            case 1:
                int i17 = this.f160d;
                int iMin = Math.min(i10, 8 - this.f161e);
                byte[] bArr3 = this.f158b;
                int i18 = i17 + 1;
                int i19 = ((bArr3[i17] & 255) >> this.f161e) & (255 >> (8 - iMin));
                while (iMin < i10) {
                    i19 |= (bArr3[i18] & 255) << iMin;
                    iMin += 8;
                    i18++;
                }
                int i20 = i19 & ((-1) >>> (32 - i10));
                s(i10);
                return i20;
            case 2:
            default:
                int i21 = this.f160d;
                int iMin2 = Math.min(i10, 8 - this.f161e);
                byte[] bArr4 = this.f158b;
                int i22 = i21 + 1;
                int i23 = ((bArr4[i21] & 255) >> this.f161e) & (255 >> (8 - iMin2));
                while (iMin2 < i10) {
                    i23 |= (bArr4[i22] & 255) << iMin2;
                    iMin2 += 8;
                    i22++;
                }
                int i24 = i23 & ((-1) >>> (32 - i10));
                s(i10);
                return i24;
            case 3:
                if (i10 == 0) {
                    return 0;
                }
                this.f160d += i10;
                int i25 = 0;
                while (true) {
                    int i26 = this.f160d;
                    if (i26 <= 8) {
                        byte[] bArr5 = this.f158b;
                        int i27 = this.f159c;
                        int i28 = ((-1) >>> (32 - i10)) & (i25 | ((bArr5[i27] & 255) >> (8 - i26)));
                        if (i26 == 8) {
                            this.f160d = 0;
                            this.f159c = i27 + 1;
                        }
                        a();
                        return i28;
                    }
                    int i29 = i26 - 8;
                    this.f160d = i29;
                    byte[] bArr6 = this.f158b;
                    int i30 = this.f159c;
                    this.f159c = i30 + 1;
                    i25 |= (bArr6[i30] & 255) << i29;
                }
            case 4:
                this.f161e += i10;
                int i31 = 0;
                while (true) {
                    int i32 = this.f161e;
                    if (i32 <= 8) {
                        byte[] bArr7 = this.f158b;
                        int i33 = this.f160d;
                        int i34 = ((-1) >>> (32 - i10)) & (i31 | ((bArr7[i33] & 255) >> (8 - i32)));
                        if (i32 == 8) {
                            this.f161e = 0;
                            this.f160d = i33 + (q(i33 + 1) ? 2 : 1);
                        }
                        a();
                        return i34;
                    }
                    int i35 = i32 - 8;
                    this.f161e = i35;
                    byte[] bArr8 = this.f158b;
                    int i36 = this.f160d;
                    i31 |= (bArr8[i36] & 255) << i35;
                    if (!q(i36 + 1)) {
                        i = 1;
                    }
                    this.f160d = i36 + i;
                }
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                this.f161e += i10;
                int i37 = 0;
                while (true) {
                    int i38 = this.f161e;
                    if (i38 <= 8) {
                        byte[] bArr9 = this.f158b;
                        int i39 = this.f160d;
                        int i40 = ((-1) >>> (32 - i10)) & (i37 | ((bArr9[i39] & 255) >> (8 - i38)));
                        if (i38 == 8) {
                            this.f161e = 0;
                            this.f160d = i39 + (q(i39 + 1) ? 2 : 1);
                        }
                        a();
                        return i40;
                    }
                    int i41 = i38 - 8;
                    this.f161e = i41;
                    byte[] bArr10 = this.f158b;
                    int i42 = this.f160d;
                    i37 |= (bArr10[i42] & 255) << i41;
                    if (!q(i42 + 1)) {
                        i = 1;
                    }
                    this.f160d = i42 + i;
                }
        }
    }

    public void j(int i10, byte[] bArr) {
        switch (this.f157a) {
            case 0:
                int i11 = i10 >> 3;
                for (int i12 = 0; i12 < i11; i12++) {
                    byte[] bArr2 = this.f158b;
                    int i13 = this.f159c;
                    int i14 = i13 + 1;
                    this.f159c = i14;
                    byte b2 = bArr2[i13];
                    int i15 = this.f160d;
                    byte b10 = (byte) (b2 << i15);
                    bArr[i12] = b10;
                    bArr[i12] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b10);
                }
                int i16 = i10 & 7;
                if (i16 != 0) {
                    byte b11 = (byte) (bArr[i11] & (255 >> i16));
                    bArr[i11] = b11;
                    int i17 = this.f160d;
                    if (i17 + i16 > 8) {
                        byte[] bArr3 = this.f158b;
                        int i18 = this.f159c;
                        this.f159c = i18 + 1;
                        bArr[i11] = (byte) (b11 | ((bArr3[i18] & 255) << i17));
                        this.f160d = i17 - 8;
                    }
                    int i19 = this.f160d + i16;
                    this.f160d = i19;
                    byte[] bArr4 = this.f158b;
                    int i20 = this.f159c;
                    bArr[i11] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i11]);
                    if (i19 == 8) {
                        this.f160d = 0;
                        this.f159c = i20 + 1;
                    }
                    a();
                    break;
                }
                break;
            default:
                int i21 = i10 >> 3;
                for (int i22 = 0; i22 < i21; i22++) {
                    byte[] bArr5 = this.f158b;
                    int i23 = this.f159c;
                    int i24 = i23 + 1;
                    this.f159c = i24;
                    byte b12 = bArr5[i23];
                    int i25 = this.f160d;
                    byte b13 = (byte) (b12 << i25);
                    bArr[i22] = b13;
                    bArr[i22] = (byte) (((255 & bArr5[i24]) >> (8 - i25)) | b13);
                }
                int i26 = i10 & 7;
                if (i26 != 0) {
                    byte b14 = (byte) (bArr[i21] & (255 >> i26));
                    bArr[i21] = b14;
                    int i27 = this.f160d;
                    if (i27 + i26 > 8) {
                        byte[] bArr6 = this.f158b;
                        int i28 = this.f159c;
                        this.f159c = i28 + 1;
                        bArr[i21] = (byte) (b14 | ((bArr6[i28] & 255) << i27));
                        this.f160d = i27 - 8;
                    }
                    int i29 = this.f160d + i26;
                    this.f160d = i29;
                    byte[] bArr7 = this.f158b;
                    int i30 = this.f159c;
                    bArr[i21] = (byte) (((byte) (((255 & bArr7[i30]) >> (8 - i29)) << (8 - i26))) | bArr[i21]);
                    if (i29 == 8) {
                        this.f160d = 0;
                        this.f159c = i30 + 1;
                    }
                    a();
                    break;
                }
                break;
        }
    }

    public void k(int i10, byte[] bArr) {
        switch (this.f157a) {
            case 0:
                a.i(this.f160d == 0);
                System.arraycopy(this.f158b, this.f159c, bArr, 0, i10);
                this.f159c += i10;
                a();
                break;
            default:
                qb.b.j(this.f160d == 0);
                System.arraycopy(this.f158b, this.f159c, bArr, 0, i10);
                this.f159c += i10;
                a();
                break;
        }
    }

    public int l() {
        switch (this.f157a) {
            case 4:
                int i10 = 0;
                while (!h()) {
                    i10++;
                }
                return ((1 << i10) - 1) + (i10 > 0 ? i(i10) : 0);
            default:
                int i11 = 0;
                while (!h()) {
                    i11++;
                }
                return ((1 << i11) - 1) + (i11 > 0 ? i(i11) : 0);
        }
    }

    public int m() {
        int i10;
        int i11;
        switch (this.f157a) {
            case 4:
                int iL = l();
                i10 = iL % 2 == 0 ? -1 : 1;
                i11 = (iL + 1) / 2;
                break;
            default:
                int iL2 = l();
                i10 = iL2 % 2 == 0 ? -1 : 1;
                i11 = (iL2 + 1) / 2;
                break;
        }
        return i11 * i10;
    }

    public void n(int i10, byte[] bArr) {
        switch (this.f157a) {
            case 0:
                this.f158b = bArr;
                this.f159c = 0;
                this.f160d = 0;
                this.f161e = i10;
                break;
            default:
                this.f158b = bArr;
                this.f159c = 0;
                this.f160d = 0;
                this.f161e = i10;
                break;
        }
    }

    public void o(v vVar) {
        n(vVar.f167c, vVar.f165a);
        p(vVar.f166b * 8);
    }

    public void p(int i10) {
        switch (this.f157a) {
            case 0:
                int i11 = i10 / 8;
                this.f159c = i11;
                this.f160d = i10 - (i11 * 8);
                a();
                break;
            default:
                int i12 = i10 / 8;
                this.f159c = i12;
                this.f160d = i10 - (i12 * 8);
                a();
                break;
        }
    }

    public boolean q(int i10) {
        switch (this.f157a) {
            case 4:
                if (2 <= i10 && i10 < this.f159c) {
                    byte[] bArr = this.f158b;
                    if (bArr[i10] != 3 || bArr[i10 - 2] != 0 || bArr[i10 - 1] != 0) {
                    }
                }
                break;
            default:
                if (2 <= i10 && i10 < this.f159c) {
                    byte[] bArr2 = this.f158b;
                    if (bArr2[i10] != 3 || bArr2[i10 - 2] != 0 || bArr2[i10 - 1] != 0) {
                    }
                }
                break;
        }
        return true;
    }

    public void r() {
        switch (this.f157a) {
            case 0:
                int i10 = this.f160d + 1;
                this.f160d = i10;
                if (i10 == 8) {
                    this.f160d = 0;
                    this.f159c++;
                }
                a();
                break;
            case 1:
            case 2:
            default:
                int i11 = this.f161e + 1;
                this.f161e = i11;
                if (i11 == 8) {
                    this.f161e = 0;
                    int i12 = this.f160d;
                    this.f160d = i12 + (q(i12 + 1) ? 2 : 1);
                }
                a();
                break;
            case 3:
                int i13 = this.f160d + 1;
                this.f160d = i13;
                if (i13 == 8) {
                    this.f160d = 0;
                    this.f159c++;
                }
                a();
                break;
            case 4:
                int i14 = this.f161e + 1;
                this.f161e = i14;
                if (i14 == 8) {
                    this.f161e = 0;
                    int i15 = this.f160d;
                    this.f160d = i15 + (q(i15 + 1) ? 2 : 1);
                }
                a();
                break;
        }
    }

    public void s(int i10) {
        int i11;
        int i12;
        switch (this.f157a) {
            case 0:
                int i13 = i10 / 8;
                int i14 = this.f159c + i13;
                this.f159c = i14;
                int i15 = (i10 - (i13 * 8)) + this.f160d;
                this.f160d = i15;
                if (i15 > 7) {
                    this.f159c = i14 + 1;
                    this.f160d = i15 - 8;
                }
                a();
                break;
            case 1:
                int i16 = i10 / 8;
                int i17 = this.f160d + i16;
                this.f160d = i17;
                int i18 = (i10 - (i16 * 8)) + this.f161e;
                this.f161e = i18;
                boolean z10 = true;
                if (i18 > 7) {
                    this.f160d = i17 + 1;
                    this.f161e = i18 - 8;
                }
                int i19 = this.f160d;
                if (i19 < 0 || (i19 >= (i11 = this.f159c) && (i19 != i11 || this.f161e != 0))) {
                    z10 = false;
                }
                qb.b.j(z10);
                break;
            case 2:
            default:
                int i20 = i10 / 8;
                int i21 = this.f160d + i20;
                this.f160d = i21;
                int i22 = (i10 - (i20 * 8)) + this.f161e;
                this.f161e = i22;
                boolean z11 = true;
                if (i22 > 7) {
                    this.f160d = i21 + 1;
                    this.f161e = i22 - 8;
                }
                int i23 = this.f160d;
                if (i23 < 0 || (i23 >= (i12 = this.f159c) && (i23 != i12 || this.f161e != 0))) {
                    z11 = false;
                }
                a.i(z11);
                break;
            case 3:
                int i24 = i10 / 8;
                int i25 = this.f159c + i24;
                this.f159c = i25;
                int i26 = (i10 - (i24 * 8)) + this.f160d;
                this.f160d = i26;
                if (i26 > 7) {
                    this.f159c = i25 + 1;
                    this.f160d = i26 - 8;
                }
                a();
                break;
            case 4:
                int i27 = this.f160d;
                int i28 = i10 / 8;
                int i29 = i27 + i28;
                this.f160d = i29;
                int i30 = (i10 - (i28 * 8)) + this.f161e;
                this.f161e = i30;
                if (i30 > 7) {
                    this.f160d = i29 + 1;
                    this.f161e = i30 - 8;
                }
                while (true) {
                    i27++;
                    if (i27 > this.f160d) {
                        a();
                        break;
                    } else if (q(i27)) {
                        this.f160d++;
                        i27 += 2;
                    }
                }
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                int i31 = this.f160d;
                int i32 = i10 / 8;
                int i33 = i31 + i32;
                this.f160d = i33;
                int i34 = (i10 - (i32 * 8)) + this.f161e;
                this.f161e = i34;
                if (i34 > 7) {
                    this.f160d = i33 + 1;
                    this.f161e = i34 - 8;
                }
                while (true) {
                    i31++;
                    if (i31 > this.f160d) {
                        a();
                        break;
                    } else if (q(i31)) {
                        this.f160d++;
                        i31 += 2;
                    }
                }
        }
    }

    public void t(int i10) {
        switch (this.f157a) {
            case 0:
                a.i(this.f160d == 0);
                this.f159c += i10;
                a();
                break;
            default:
                qb.b.j(this.f160d == 0);
                this.f159c += i10;
                a();
                break;
        }
    }

    public u(int i10) {
        this.f157a = i10;
        switch (i10) {
            case 3:
                this.f158b = qb.v.f20833f;
                break;
            default:
                this.f158b = d0.f109e;
                break;
        }
    }

    public u(int i10, int i11, int i12, byte[] bArr) {
        this.f157a = i12;
        switch (i12) {
            case g4.j.STRING_FIELD_NUMBER /* 5 */:
                this.f158b = bArr;
                this.f160d = i10;
                this.f159c = i11;
                this.f161e = 0;
                a();
                break;
            default:
                this.f158b = bArr;
                this.f160d = i10;
                this.f159c = i11;
                this.f161e = 0;
                a();
                break;
        }
    }

    public u(int i10, byte[] bArr) {
        this.f157a = i10;
        switch (i10) {
            case g4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                this.f158b = bArr;
                this.f159c = bArr.length;
                break;
            default:
                this.f158b = bArr;
                this.f159c = bArr.length;
                break;
        }
    }

    public u(int i10, int i11) {
        this.f157a = 2;
        this.f159c = i10;
        this.f160d = i11;
        this.f158b = new byte[(i11 * 2) - 1];
        this.f161e = 0;
    }
}
