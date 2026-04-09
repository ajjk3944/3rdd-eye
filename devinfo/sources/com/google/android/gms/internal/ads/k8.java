package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k8 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f13076e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f13077a;

    /* renamed from: b, reason: collision with root package name */
    public int f13078b;

    /* renamed from: c, reason: collision with root package name */
    public int f13079c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f13080d;

    public final void a(int i4, int i10, byte[] bArr) {
        if (this.f13077a) {
            int i11 = i10 - i4;
            byte[] bArr2 = this.f13080d;
            int length = bArr2.length;
            int i12 = this.f13078b + i11;
            if (length < i12) {
                this.f13080d = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i4, this.f13080d, this.f13078b, i11);
            this.f13078b += i11;
        }
    }
}
