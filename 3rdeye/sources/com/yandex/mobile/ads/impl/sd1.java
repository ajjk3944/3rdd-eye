package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
final class sd1 {

    /* renamed from: a, reason: collision with root package name */
    public int f32939a;

    /* renamed from: b, reason: collision with root package name */
    public long f32940b;

    /* renamed from: c, reason: collision with root package name */
    public int f32941c;

    /* renamed from: d, reason: collision with root package name */
    public int f32942d;

    /* renamed from: e, reason: collision with root package name */
    public int f32943e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f32944f = new int[KotlinVersion.MAX_COMPONENT_VALUE];

    /* renamed from: g, reason: collision with root package name */
    private final uf1 f32945g = new uf1(KotlinVersion.MAX_COMPONENT_VALUE);

    public final boolean a(rz rzVar, boolean z10) throws IOException {
        this.f32939a = 0;
        this.f32940b = 0L;
        this.f32941c = 0;
        this.f32942d = 0;
        this.f32943e = 0;
        this.f32945g.c(27);
        try {
            if (rzVar.b(this.f32945g.c(), 0, 27, z10) && this.f32945g.v() == 1332176723) {
                if (this.f32945g.t() != 0) {
                    if (z10) {
                        return false;
                    }
                    throw yf1.a("unsupported bit stream revision");
                }
                this.f32939a = this.f32945g.t();
                this.f32940b = this.f32945g.l();
                this.f32945g.n();
                this.f32945g.n();
                this.f32945g.n();
                int iT = this.f32945g.t();
                this.f32941c = iT;
                this.f32942d = iT + 27;
                this.f32945g.c(iT);
                try {
                    if (rzVar.b(this.f32945g.c(), 0, this.f32941c, z10)) {
                        for (int i = 0; i < this.f32941c; i++) {
                            this.f32944f[i] = this.f32945g.t();
                            this.f32943e += this.f32944f[i];
                        }
                        return true;
                    }
                } catch (EOFException e4) {
                    if (!z10) {
                        throw e4;
                    }
                }
                return false;
            }
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
        }
        return false;
    }

    public final boolean a(rz rzVar, long j4) throws IOException {
        if (rzVar.a() == rzVar.d()) {
            this.f32945g.c(4);
            while (true) {
                if (j4 != -1 && rzVar.a() + 4 >= j4) {
                    break;
                }
                try {
                    if (!rzVar.b(this.f32945g.c(), 0, 4, true)) {
                        break;
                    }
                    this.f32945g.e(0);
                    if (this.f32945g.v() == 1332176723) {
                        rzVar.c();
                        return true;
                    }
                    rzVar.a(1);
                } catch (EOFException unused) {
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
        do {
            if (j4 != -1 && rzVar.a() >= j4) {
                break;
            }
        } while (rzVar.c(1) != -1);
        return false;
    }
}
