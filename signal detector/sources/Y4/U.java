package Y4;

import android.net.wifi.WifiInfo;
import androidx.lifecycle.X;

/* loaded from: classes.dex */
public final class U extends X {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.D f4441b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.D f4442c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.D f4443d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.D f4444e;

    public U() {
        androidx.lifecycle.D d6 = new androidx.lifecycle.D();
        this.f4441b = d6;
        this.f4442c = d6;
        androidx.lifecycle.D d7 = new androidx.lifecycle.D();
        this.f4443d = d7;
        this.f4444e = d7;
        new androidx.lifecycle.D();
    }

    public final void e(WifiInfo wifiInfo) {
        androidx.lifecycle.D d6 = this.f4441b;
        if (wifiInfo == null || !wifiInfo.equals(d6.d())) {
            d6.j(wifiInfo);
        }
    }
}
