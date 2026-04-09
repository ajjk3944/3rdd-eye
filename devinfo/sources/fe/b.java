package fe;

import com.google.android.gms.internal.play_billing.u;
import com.liuzh.deviceinfo.DeviceInfoApp;
import de.o;
import ec.z;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f24015a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f24016b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f24017c;

    public /* synthetic */ b(Object obj) {
        this.f24016b = obj;
    }

    public boolean a() {
        try {
            DeviceInfoApp deviceInfoApp = (DeviceInfoApp) this.f24016b;
            return deviceInfoApp.getPackageManager().getApplicationInfo(deviceInfoApp.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception e2) {
            u.i("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e2);
            return false;
        }
    }

    public b(o oVar) {
        ie.b bVar = new ie.b();
        z zVar = new z(28);
        this.f24017c = bVar;
        this.f24016b = new ArrayList();
        this.f24015a = zVar;
        oVar.a(new a(this));
    }
}
