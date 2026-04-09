package androidx.work.impl.foreground;

import B9.d;
import T1.z;
import a2.C1645b;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.A;
import androidx.work.m;
import c2.C2052b;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends A {

    /* renamed from: g, reason: collision with root package name */
    public static final String f16923g = m.g("SystemFgService");

    /* renamed from: c, reason: collision with root package name */
    public Handler f16924c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f16925d;

    /* renamed from: e, reason: collision with root package name */
    public C1645b f16926e;

    /* renamed from: f, reason: collision with root package name */
    public NotificationManager f16927f;

    public static class a {
        public static void a(Service service, int i, Notification notification, int i10) {
            service.startForeground(i, notification, i10);
        }
    }

    public static class b {
        public static void a(Service service, int i, Notification notification, int i10) {
            try {
                service.startForeground(i, notification, i10);
            } catch (ForegroundServiceStartNotAllowedException e4) {
                m mVarE = m.e();
                String str = SystemForegroundService.f16923g;
                if (((m.a) mVarE).f16950c <= 5) {
                    Log.w(str, "Unable to start foreground service", e4);
                }
            }
        }
    }

    public final void a() {
        this.f16924c = new Handler(Looper.getMainLooper());
        this.f16927f = (NotificationManager) getApplicationContext().getSystemService("notification");
        C1645b c1645b = new C1645b(getApplicationContext());
        this.f16926e = c1645b;
        if (c1645b.f14104j != null) {
            m.e().c(C1645b.f14096k, "A callback already exists.");
        } else {
            c1645b.f14104j = this;
        }
    }

    @Override // androidx.lifecycle.A, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.A, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f16926e.f();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        super.onStartCommand(intent, i, i10);
        boolean z10 = this.f16925d;
        String str = f16923g;
        if (z10) {
            m.e().f(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f16926e.f();
            a();
            this.f16925d = false;
        }
        if (intent == null) {
            return 3;
        }
        C1645b c1645b = this.f16926e;
        c1645b.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = C1645b.f14096k;
        if (zEquals) {
            m.e().f(str2, "Started foreground service " + intent);
            c1645b.f14098c.d(new d(2, c1645b, intent.getStringExtra("KEY_WORKSPEC_ID")));
            c1645b.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c1645b.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            m.e().f(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = c1645b.f14104j;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f16925d = true;
            m.e().a(str, "All commands completed.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
            return 3;
        }
        m.e().f(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        z zVar = c1645b.f14097b;
        UUID uuidFromString = UUID.fromString(stringExtra);
        zVar.getClass();
        zVar.f12233d.d(new C2052b(zVar, uuidFromString));
        return 3;
    }
}
