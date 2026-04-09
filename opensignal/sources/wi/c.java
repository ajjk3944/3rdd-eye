package wi;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import br.l;
import ch.n;

/* loaded from: classes.dex */
public final class c extends a implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final IntentFilter f24532d;

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f24533a = f24532d;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        f24532d = intentFilter;
    }

    @Override // wi.f
    public final IntentFilter getIntentFilter() {
        return this.f24533a;
    }

    @Override // wi.a
    public final void onReceiveIntent(Context context, Intent intent) {
        if (!l.a(intent.getAction(), "android.os.action.DEVICE_IDLE_MODE_CHANGED") || ch.l.f3962t5.q0().isDeviceIdleMode()) {
            return;
        }
        n.b("BucketReceiver", "============================================================");
        n.b("BucketReceiver", "===== Woken up from doze mode. Re-scheduling tasks.");
        n.b("BucketReceiver", "============================================================");
        n.f("BucketReceiver", intent);
        getServiceLocator().I().execute(new ah.a(context, 4));
    }
}
