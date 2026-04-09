package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class J3 {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f9217e = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f9218a;

    /* renamed from: b, reason: collision with root package name */
    public int f9219b;

    /* renamed from: c, reason: collision with root package name */
    public int f9220c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f9221d;

    public final void a(int i, int i3, byte[] bArr) {
        if (this.f9218a) {
            int i6 = i3 - i;
            byte[] bArr2 = this.f9221d;
            int length = bArr2.length;
            int i7 = this.f9219b + i6;
            if (length < i7) {
                this.f9221d = Arrays.copyOf(bArr2, i7 + i7);
            }
            System.arraycopy(bArr, i, this.f9221d, this.f9219b, i6);
            this.f9219b += i6;
        }
    }
}
