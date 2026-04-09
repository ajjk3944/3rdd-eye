package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n52;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class v62 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f34400a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    private boolean f34401b;

    /* renamed from: c, reason: collision with root package name */
    private int f34402c;

    /* renamed from: d, reason: collision with root package name */
    private long f34403d;

    /* renamed from: e, reason: collision with root package name */
    private int f34404e;

    /* renamed from: f, reason: collision with root package name */
    private int f34405f;

    /* renamed from: g, reason: collision with root package name */
    private int f34406g;

    public final void a(n52 n52Var, n52.a aVar) {
        if (this.f34402c > 0) {
            n52Var.a(this.f34403d, this.f34404e, this.f34405f, this.f34406g, aVar);
            this.f34402c = 0;
        }
    }

    public final void a() {
        this.f34401b = false;
        this.f34402c = 0;
    }

    public final void a(n52 n52Var, long j4, int i, int i10, int i11, n52.a aVar) {
        if (this.f34406g <= i10 + i11) {
            if (this.f34401b) {
                int i12 = this.f34402c;
                int i13 = i12 + 1;
                this.f34402c = i13;
                if (i12 == 0) {
                    this.f34403d = j4;
                    this.f34404e = i;
                    this.f34405f = 0;
                }
                this.f34405f += i10;
                this.f34406g = i11;
                if (i13 >= 16) {
                    a(n52Var, aVar);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void a(v70 v70Var) throws IOException {
        if (this.f34401b) {
            return;
        }
        v70Var.a(this.f34400a, 0, 10);
        v70Var.c();
        byte[] bArr = this.f34400a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) != 186) {
                return;
            }
            if ((40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7)) == 0) {
                return;
            }
            this.f34401b = true;
        }
    }
}
