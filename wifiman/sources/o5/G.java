package o5;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import com.google.firebase.sessions.SessionLifecycleService;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class G implements F {

    /* renamed from: b, reason: collision with root package name */
    private static final a f55362b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.f f55363a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public G(com.google.firebase.f firebaseApp) {
        AbstractC6492s.i(firebaseApp, "firebaseApp");
        this.f55363a = firebaseApp;
    }

    private final Object b(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
            return Yg.J.f24997a;
        } catch (IllegalArgumentException e10) {
            return Integer.valueOf(Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e10));
        }
    }

    @Override // o5.F
    public void a(Messenger callback, ServiceConnection serviceConnection) {
        boolean zBindService;
        AbstractC6492s.i(callback, "callback");
        AbstractC6492s.i(serviceConnection, "serviceConnection");
        Context applicationContext = this.f55363a.k().getApplicationContext();
        AbstractC6492s.h(applicationContext, "firebaseApp.applicationContext.applicationContext");
        Intent intent = new Intent(applicationContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", callback);
        intent.setPackage(applicationContext.getPackageName());
        try {
            zBindService = applicationContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e10) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e10);
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        b(applicationContext, serviceConnection);
        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
    }
}
