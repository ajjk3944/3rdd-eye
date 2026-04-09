package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class c43 implements n53 {
    public final double a;
    public final boolean b;

    public c43(double d, boolean z) {
        this.a = d;
        this.b = z;
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((jm2) obj).a;
        Bundle bundleY = i30.Y(bundle, "device");
        bundle.putBundle("device", bundleY);
        Bundle bundleY2 = i30.Y(bundleY, "battery");
        bundleY.putBundle("battery", bundleY2);
        bundleY2.putBoolean("is_charging", this.b);
        bundleY2.putDouble("battery_level", this.a);
    }
}
