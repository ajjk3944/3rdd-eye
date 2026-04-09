package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.yK, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2174yK implements CharSequence {

    /* renamed from: a, reason: collision with root package name */
    public char[] f17710a;

    /* renamed from: b, reason: collision with root package name */
    public String f17711b;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f17710a[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f17710a.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i3) {
        return new String(this.f17710a, i, i3 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.f17711b == null) {
            this.f17711b = new String(this.f17710a);
        }
        return this.f17711b;
    }
}
