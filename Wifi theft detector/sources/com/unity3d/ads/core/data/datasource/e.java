package com.unity3d.ads.core.data.datasource;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class e {
    public static /* synthetic */ int a(double d10) {
        long jDoubleToLongBits = Double.doubleToLongBits(d10);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }
}
