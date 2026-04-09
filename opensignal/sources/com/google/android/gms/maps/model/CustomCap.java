package com.google.android.gms.maps.model;

import c7.a;
import cc.s;
import wc.b;

/* loaded from: classes.dex */
public final class CustomCap extends Cap {

    /* renamed from: r, reason: collision with root package name */
    public final b f5345r;

    /* renamed from: x, reason: collision with root package name */
    public final float f5346x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCap(b bVar, float f10) {
        super(3, bVar, Float.valueOf(f10));
        s.i(bVar, "bitmapDescriptor must not be null");
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        this.f5345r = bVar;
        this.f5346x = f10;
    }

    @Override // com.google.android.gms.maps.model.Cap
    public final String toString() {
        StringBuilder sbU = a.u("[CustomCap: bitmapDescriptor=", String.valueOf(this.f5345r), " refWidth=");
        sbU.append(this.f5346x);
        sbU.append("]");
        return sbU.toString();
    }
}
