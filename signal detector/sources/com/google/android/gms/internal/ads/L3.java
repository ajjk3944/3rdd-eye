package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class L3 {

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f9610f = {0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public boolean f9611a;

    /* renamed from: b, reason: collision with root package name */
    public int f9612b;

    /* renamed from: c, reason: collision with root package name */
    public int f9613c;

    /* renamed from: d, reason: collision with root package name */
    public int f9614d;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f9615e;

    public final void a(int i, int i3, byte[] bArr) {
        if (this.f9611a) {
            int i6 = i3 - i;
            byte[] bArr2 = this.f9615e;
            int length = bArr2.length;
            int i7 = this.f9613c + i6;
            if (length < i7) {
                this.f9615e = Arrays.copyOf(bArr2, i7 + i7);
            }
            System.arraycopy(bArr, i, this.f9615e, this.f9613c, i6);
            this.f9613c += i6;
        }
    }
}
