package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class rd1 {

    /* renamed from: a, reason: collision with root package name */
    private final sd1 f32592a = new sd1();

    /* renamed from: b, reason: collision with root package name */
    private final uf1 f32593b = new uf1(0, new byte[65025]);

    /* renamed from: c, reason: collision with root package name */
    private int f32594c = -1;

    /* renamed from: d, reason: collision with root package name */
    private int f32595d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f32596e;

    public final sd1 a() {
        return this.f32592a;
    }

    public final uf1 b() {
        return this.f32593b;
    }

    public final void c() {
        sd1 sd1Var = this.f32592a;
        sd1Var.f32939a = 0;
        sd1Var.f32940b = 0L;
        sd1Var.f32941c = 0;
        sd1Var.f32942d = 0;
        sd1Var.f32943e = 0;
        this.f32593b.c(0);
        this.f32594c = -1;
        this.f32596e = false;
    }

    public final void d() {
        if (this.f32593b.c().length == 65025) {
            return;
        }
        uf1 uf1Var = this.f32593b;
        uf1Var.a(this.f32593b.e(), Arrays.copyOf(uf1Var.c(), Math.max(65025, this.f32593b.e())));
    }

    public final boolean a(rz rzVar) throws IOException {
        int i;
        int i10;
        int i11;
        if (this.f32596e) {
            this.f32596e = false;
            this.f32593b.c(0);
        }
        while (true) {
            if (this.f32596e) {
                return true;
            }
            if (this.f32594c < 0) {
                if (!this.f32592a.a(rzVar, -1L) || !this.f32592a.a(rzVar, true)) {
                    break;
                }
                sd1 sd1Var = this.f32592a;
                int i12 = sd1Var.f32942d;
                if ((sd1Var.f32939a & 1) == 1 && this.f32593b.e() == 0) {
                    this.f32595d = 0;
                    int i13 = 0;
                    do {
                        int i14 = this.f32595d;
                        sd1 sd1Var2 = this.f32592a;
                        if (i14 >= sd1Var2.f32941c) {
                            break;
                        }
                        int[] iArr = sd1Var2.f32944f;
                        this.f32595d = i14 + 1;
                        i11 = iArr[i14];
                        i13 += i11;
                    } while (i11 == 255);
                    i12 += i13;
                    i10 = this.f32595d;
                } else {
                    i10 = 0;
                }
                try {
                    rzVar.a(i12);
                    this.f32594c = i10;
                } catch (EOFException unused) {
                }
            }
            int i15 = this.f32594c;
            this.f32595d = 0;
            int i16 = 0;
            do {
                int i17 = this.f32595d;
                int i18 = i15 + i17;
                sd1 sd1Var3 = this.f32592a;
                if (i18 >= sd1Var3.f32941c) {
                    break;
                }
                int[] iArr2 = sd1Var3.f32944f;
                this.f32595d = i17 + 1;
                i = iArr2[i18];
                i16 += i;
            } while (i == 255);
            int i19 = this.f32594c + this.f32595d;
            if (i16 > 0) {
                uf1 uf1Var = this.f32593b;
                uf1Var.a(uf1Var.e() + i16);
                try {
                    rzVar.a(this.f32593b.c(), this.f32593b.e(), i16, false);
                    uf1 uf1Var2 = this.f32593b;
                    uf1Var2.d(uf1Var2.e() + i16);
                    this.f32596e = this.f32592a.f32944f[i19 + (-1)] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i19 == this.f32592a.f32941c) {
                i19 = -1;
            }
            this.f32594c = i19;
        }
        return false;
    }
}
