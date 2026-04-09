package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class v53 implements n53 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public v53(String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    @Override // defpackage.n53
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Bundle bundle = ((jm2) obj).a;
        i30.h0(bundle, "carrier", this.a, !TextUtils.isEmpty(r0));
        int i = this.b;
        i30.j0(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.c);
        bundle.putInt("pt", this.d);
        Bundle bundleY = i30.Y(bundle, "device");
        bundle.putBundle("device", bundleY);
        Bundle bundleY2 = i30.Y(bundleY, "network");
        bundleY.putBundle("network", bundleY2);
        bundleY2.putInt("active_network_state", this.f);
        bundleY2.putBoolean("active_network_metered", this.e);
    }
}
