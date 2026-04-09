package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lm1 implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public char[] f13551a;

    /* renamed from: b, reason: collision with root package name */
    public String f13552b;

    @Override // java.lang.CharSequence
    public final char charAt(int i4) {
        return this.f13551a[i4];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13551a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i4, int i10) {
        return new String(this.f13551a, i4, i10 - i4);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f13552b == null) {
            this.f13552b = new String(this.f13551a);
        }
        return this.f13552b;
    }
}
