package w5;

import android.content.Context;
import android.content.Intent;
import android.os.Messenger;
import android.os.Process;
import android.util.Log;
import b9.C1992A;
import com.google.firebase.sessions.SessionLifecycleService;
import w5.F;

/* compiled from: SessionLifecycleServiceBinder.kt */
/* loaded from: classes2.dex */
public final class I implements H {

    /* renamed from: a, reason: collision with root package name */
    public final B4.e f47372a;

    public I(B4.e eVar) {
        this.f47372a = eVar;
    }

    @Override // w5.H
    public final void a(Messenger messenger, F.b serviceConnection) {
        boolean zBindService;
        kotlin.jvm.internal.l.f(serviceConnection, "serviceConnection");
        B4.e eVar = this.f47372a;
        eVar.a();
        Context appContext = eVar.f487a.getApplicationContext();
        Intent intent = new Intent(appContext, (Class<?>) SessionLifecycleService.class);
        Log.d("LifecycleServiceBinder", "Binding service to application.");
        intent.setAction(String.valueOf(Process.myPid()));
        intent.putExtra("ClientCallbackMessenger", messenger);
        try {
            zBindService = appContext.bindService(intent, serviceConnection, 65);
        } catch (SecurityException e4) {
            Log.w("LifecycleServiceBinder", "Failed to bind session lifecycle service to application.", e4);
            zBindService = false;
        }
        if (zBindService) {
            return;
        }
        kotlin.jvm.internal.l.e(appContext, "appContext");
        try {
            appContext.unbindService(serviceConnection);
            C1992A c1992a = C1992A.f18074a;
        } catch (IllegalArgumentException e10) {
            Log.w("LifecycleServiceBinder", "Session lifecycle service binding failed.", e10);
        }
        Log.i("LifecycleServiceBinder", "Session lifecycle service binding failed.");
    }
}
