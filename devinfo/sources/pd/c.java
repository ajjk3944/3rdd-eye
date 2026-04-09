package pd;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Context f31717a;

    public c(Context context) {
        r5.c.i(Process.myUid(), "UID: [", "]  PID: [", Process.myPid(), "] ").concat("AppUpdateListenerRegistry");
        new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        new HashSet();
        Context applicationContext = context.getApplicationContext();
        this.f31717a = applicationContext != null ? applicationContext : context;
    }
}
