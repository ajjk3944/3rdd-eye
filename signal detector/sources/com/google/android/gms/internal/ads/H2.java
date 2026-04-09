package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class H2 {

    /* renamed from: a, reason: collision with root package name */
    public final I2 f8538a = new I2();

    /* renamed from: b, reason: collision with root package name */
    public final C2036vr f8539b = new C2036vr(new byte[65025], 0);

    /* renamed from: c, reason: collision with root package name */
    public int f8540c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f8541d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8542e;

    public final boolean a(InterfaceC2046w0 interfaceC2046w0) {
        int i;
        boolean z6 = this.f8542e;
        C2036vr c2036vr = this.f8539b;
        if (z6) {
            this.f8542e = false;
            c2036vr.y(0);
        }
        while (true) {
            if (this.f8542e) {
                return true;
            }
            int i3 = this.f8540c;
            I2 i22 = this.f8538a;
            if (i3 < 0) {
                if (!i22.a(interfaceC2046w0, -1L) || !i22.b(interfaceC2046w0, true)) {
                    break;
                }
                int iB = i22.f9064d;
                if ((i22.f9061a & 1) == 1 && c2036vr.f17356c == 0) {
                    iB += b(0);
                    i = this.f8541d;
                } else {
                    i = 0;
                }
                try {
                    interfaceC2046w0.t(iB);
                    this.f8540c = i;
                    i3 = i;
                } catch (EOFException unused) {
                }
            }
            int iB2 = b(i3);
            int i6 = this.f8540c + this.f8541d;
            if (iB2 > 0) {
                c2036vr.A(c2036vr.f17356c + iB2);
                try {
                    interfaceC2046w0.s(c2036vr.f17356c, iB2, c2036vr.f17354a);
                    c2036vr.C(c2036vr.f17356c + iB2);
                    this.f8542e = i22.f9066f[i6 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i6 == i22.f9063c) {
                i6 = -1;
            }
            this.f8540c = i6;
        }
        return false;
    }

    public final int b(int i) {
        int i3;
        int i6 = 0;
        this.f8541d = 0;
        do {
            int i7 = this.f8541d;
            int i8 = i + i7;
            I2 i22 = this.f8538a;
            if (i8 >= i22.f9063c) {
                break;
            }
            this.f8541d = i7 + 1;
            i3 = i22.f9066f[i8];
            i6 += i3;
        } while (i3 == 255);
        return i6;
    }
}
