package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vr {

    /* renamed from: d, reason: collision with root package name */
    public static final vr f17692d = new vr(0, 0, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final int f17693a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17694b;

    /* renamed from: c, reason: collision with root package name */
    public final float f17695c;

    static {
        String str = bq0.f9768a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(3, 36);
    }

    public vr(int i4, int i10, float f10) {
        this.f17693a = i4;
        this.f17694b = i10;
        this.f17695c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vr) {
            vr vrVar = (vr) obj;
            if (this.f17693a == vrVar.f17693a && this.f17694b == vrVar.f17694b && this.f17695c == vrVar.f17695c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f17695c) + ((((this.f17693a + 217) * 31) + this.f17694b) * 31);
    }
}
