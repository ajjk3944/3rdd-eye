package u5;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23323a;

    /* renamed from: b, reason: collision with root package name */
    public int f23324b;

    /* renamed from: c, reason: collision with root package name */
    public String f23325c;

    /* renamed from: d, reason: collision with root package name */
    public int f23326d;

    /* renamed from: e, reason: collision with root package name */
    public int f23327e;

    /* renamed from: f, reason: collision with root package name */
    public int f23328f;

    /* renamed from: g, reason: collision with root package name */
    public int f23329g;

    /* renamed from: h, reason: collision with root package name */
    public int f23330h;

    public final boolean a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        switch (this.f23323a) {
            case 0:
                if ((i10 & (-2097152)) != -2097152 || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                    return false;
                }
                this.f23324b = i11;
                this.f23325c = b.f23258m[3 - i12];
                int i19 = b.f23259n[i14];
                this.f23327e = i19;
                if (i11 == 2) {
                    this.f23327e = i19 / 2;
                } else if (i11 == 0) {
                    this.f23327e = i19 / 4;
                }
                int i20 = (i10 >>> 9) & 1;
                int i21 = 1152;
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            throw new IllegalArgumentException();
                        }
                        i21 = 384;
                    }
                } else if (i11 != 3) {
                    i21 = 576;
                }
                this.f23330h = i21;
                if (i12 == 3) {
                    int i22 = i11 == 3 ? b.f23260o[i13 - 1] : b.f23261p[i13 - 1];
                    this.f23329g = i22;
                    this.f23326d = (((i22 * 12) / this.f23327e) + i20) * 4;
                } else {
                    if (i11 == 3) {
                        int i23 = i12 == 2 ? b.f23262q[i13 - 1] : b.f23263r[i13 - 1];
                        this.f23329g = i23;
                        this.f23326d = ((i23 * 144) / this.f23327e) + i20;
                    } else {
                        int i24 = b.f23264s[i13 - 1];
                        this.f23329g = i24;
                        this.f23326d = (((i12 == 1 ? 72 : 144) * i24) / this.f23327e) + i20;
                    }
                }
                this.f23328f = ((i10 >> 6) & 3) == 3 ? 1 : 2;
                return true;
            default:
                if ((i10 & (-2097152)) != -2097152 || (i15 = (i10 >>> 19) & 3) == 1 || (i16 = (i10 >>> 17) & 3) == 0 || (i17 = (i10 >>> 12) & 15) == 0 || i17 == 15 || (i18 = (i10 >>> 10) & 3) == 3) {
                    return false;
                }
                this.f23324b = i15;
                this.f23325c = y9.a.f25903m[3 - i16];
                int i25 = y9.a.f25904n[i18];
                this.f23327e = i25;
                if (i15 == 2) {
                    this.f23327e = i25 / 2;
                } else if (i15 == 0) {
                    this.f23327e = i25 / 4;
                }
                int i26 = (i10 >>> 9) & 1;
                int i27 = 1152;
                if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 != 3) {
                            throw new IllegalArgumentException();
                        }
                        i27 = 384;
                    }
                } else if (i15 != 3) {
                    i27 = 576;
                }
                this.f23330h = i27;
                if (i16 == 3) {
                    int i28 = i15 == 3 ? y9.a.f25905o[i17 - 1] : y9.a.f25906p[i17 - 1];
                    this.f23329g = i28;
                    this.f23326d = (((i28 * 12) / this.f23327e) + i26) * 4;
                } else {
                    if (i15 == 3) {
                        int i29 = i16 == 2 ? y9.a.f25907q[i17 - 1] : y9.a.f25908r[i17 - 1];
                        this.f23329g = i29;
                        this.f23326d = ((i29 * 144) / this.f23327e) + i26;
                    } else {
                        int i30 = y9.a.f25909s[i17 - 1];
                        this.f23329g = i30;
                        this.f23326d = (((i16 == 1 ? 72 : 144) * i30) / this.f23327e) + i26;
                    }
                }
                this.f23328f = ((i10 >> 6) & 3) == 3 ? 1 : 2;
                return true;
        }
    }
}
