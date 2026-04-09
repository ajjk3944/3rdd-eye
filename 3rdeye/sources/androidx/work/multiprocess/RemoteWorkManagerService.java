package androidx.work.multiprocess;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.work.m;

/* loaded from: classes.dex */
public class RemoteWorkManagerService extends Service {

    /* renamed from: c, reason: collision with root package name */
    public static final String f16977c = m.g("RemoteWorkManagerService");

    /* renamed from: b, reason: collision with root package name */
    public i f16978b;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        m.e().f(f16977c, "Binding to RemoteWorkManager");
        return this.f16978b;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.f16978b = new i(this);
    }
}
