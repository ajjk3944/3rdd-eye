package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class t31 {

    /* renamed from: a, reason: collision with root package name */
    private final int f33425a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f33426b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f33427c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f33428d;

    /* renamed from: e, reason: collision with root package name */
    public int f33429e;

    public t31(int i) {
        this.f33425a = i;
        byte[] bArr = new byte[131];
        this.f33428d = bArr;
        bArr[2] = 1;
    }

    public final void a(byte[] bArr, int i, int i10) {
        if (this.f33426b) {
            int i11 = i10 - i;
            byte[] bArr2 = this.f33428d;
            int length = bArr2.length;
            int i12 = this.f33429e + i11;
            if (length < i12) {
                this.f33428d = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i, this.f33428d, this.f33429e, i11);
            this.f33429e += i11;
        }
    }

    public final void b() {
        this.f33426b = false;
        this.f33427c = false;
    }

    public final void b(int i) {
        if (!this.f33426b) {
            boolean z10 = i == this.f33425a;
            this.f33426b = z10;
            if (z10) {
                this.f33429e = 3;
                this.f33427c = false;
                return;
            }
            return;
        }
        throw new IllegalStateException();
    }

    public final boolean a(int i) {
        if (!this.f33426b) {
            return false;
        }
        this.f33429e -= i;
        this.f33426b = false;
        this.f33427c = true;
        return true;
    }

    public final boolean a() {
        return this.f33427c;
    }
}
