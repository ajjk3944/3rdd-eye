package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class m8 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f13794f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f13795a;

    /* renamed from: b, reason: collision with root package name */
    public int f13796b;

    /* renamed from: c, reason: collision with root package name */
    public int f13797c;

    /* renamed from: d, reason: collision with root package name */
    public int f13798d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f13799e;

    public final void a(int i4, int i10, byte[] bArr) {
        if (this.f13795a) {
            int i11 = i10 - i4;
            byte[] bArr2 = this.f13799e;
            int length = bArr2.length;
            int i12 = this.f13797c + i11;
            if (length < i12) {
                this.f13799e = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i4, this.f13799e, this.f13797c, i11);
            this.f13797c += i11;
        }
    }
}
