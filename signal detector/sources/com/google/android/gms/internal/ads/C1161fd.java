package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1161fd {

    /* renamed from: d, reason: collision with root package name */
    public static final C1161fd f14102d = new C1161fd(0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f14103a;

    /* renamed from: b, reason: collision with root package name */
    public final int f14104b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14105c;

    static {
        String str = Vt.f12096a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public C1161fd(int i, int i3, float f2) {
        this.f14103a = i;
        this.f14104b = i3;
        this.f14105c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1161fd) {
            C1161fd c1161fd = (C1161fd) obj;
            if (this.f14103a == c1161fd.f14103a && this.f14104b == c1161fd.f14104b && this.f14105c == c1161fd.f14105c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f14105c) + ((((this.f14103a + 217) * 31) + this.f14104b) * 31);
    }
}
