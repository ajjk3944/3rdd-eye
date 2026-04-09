package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.c4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0970c4 implements InterfaceC1243h4 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0916b4 f13527a;

    /* renamed from: b, reason: collision with root package name */
    public final C2036vr f13528b = new C2036vr(32);

    /* renamed from: c, reason: collision with root package name */
    public int f13529c;

    /* renamed from: d, reason: collision with root package name */
    public int f13530d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13531e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13532f;

    public C0970c4(InterfaceC0916b4 interfaceC0916b4) {
        this.f13527a = interfaceC0916b4;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243h4
    public final void a(int i, C2036vr c2036vr) {
        int i3 = i & 1;
        int iK = i3 != 0 ? c2036vr.f17355b + c2036vr.K() : -1;
        if (this.f13532f) {
            if (i3 == 0) {
                return;
            }
            this.f13532f = false;
            c2036vr.E(iK);
            this.f13530d = 0;
        }
        while (c2036vr.B() > 0) {
            int i6 = this.f13530d;
            C2036vr c2036vr2 = this.f13528b;
            if (i6 < 3) {
                if (i6 == 0) {
                    int iK2 = c2036vr.K();
                    c2036vr.E(c2036vr.f17355b - 1);
                    if (iK2 == 255) {
                        this.f13532f = true;
                        return;
                    }
                }
                int iMin = Math.min(c2036vr.B(), 3 - this.f13530d);
                c2036vr.H(this.f13530d, iMin, c2036vr2.f17354a);
                int i7 = this.f13530d + iMin;
                this.f13530d = i7;
                if (i7 == 3) {
                    c2036vr2.E(0);
                    c2036vr2.C(3);
                    c2036vr2.G(1);
                    int iK3 = c2036vr2.K();
                    boolean z6 = (iK3 & 128) != 0;
                    int iK4 = c2036vr2.K();
                    this.f13531e = z6;
                    int i8 = (((iK3 & 15) << 8) | iK4) + 3;
                    this.f13529c = i8;
                    byte[] bArr = c2036vr2.f17354a;
                    if (bArr.length < i8) {
                        int length = bArr.length;
                        c2036vr2.A(Math.min(4098, Math.max(i8, length + length)));
                    }
                }
            } else {
                int iMin2 = Math.min(c2036vr.B(), this.f13529c - this.f13530d);
                c2036vr.H(this.f13530d, iMin2, c2036vr2.f17354a);
                int i9 = this.f13530d + iMin2;
                this.f13530d = i9;
                int i10 = this.f13529c;
                if (i9 != i10) {
                    continue;
                } else {
                    if (!this.f13531e) {
                        c2036vr2.C(i10);
                    } else {
                        if (Vt.f(0, c2036vr2.f17354a, i10, -1) != 0) {
                            this.f13532f = true;
                            return;
                        }
                        c2036vr2.C(this.f13529c - 4);
                    }
                    c2036vr2.E(0);
                    this.f13527a.f(c2036vr2);
                    this.f13530d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243h4
    public final void c() {
        this.f13532f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1243h4
    public final void e(C2038vt c2038vt, InterfaceC2100x0 interfaceC2100x0, C1189g4 c1189g4) {
        this.f13527a.e(c2038vt, interfaceC2100x0, c1189g4);
        this.f13532f = true;
    }
}
