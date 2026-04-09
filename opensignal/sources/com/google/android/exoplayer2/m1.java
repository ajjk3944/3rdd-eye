package com.google.android.exoplayer2;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: b, reason: collision with root package name */
    public static final m1 f4239b = new m1(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4240a;

    public m1(boolean z10) {
        this.f4240a = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m1.class == obj.getClass() && this.f4240a == ((m1) obj).f4240a;
    }

    public final int hashCode() {
        return !this.f4240a ? 1 : 0;
    }
}
