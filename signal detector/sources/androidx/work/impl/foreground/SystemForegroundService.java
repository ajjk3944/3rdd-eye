package androidx.work.impl.foreground;

import A2.C;
import V0.m;
import V2.e;
import W0.k;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.AbstractServiceC0301x;
import d1.C2264b;
import f1.C2323a;
import java.util.UUID;

/* loaded from: classes.dex */
public class SystemForegroundService extends AbstractServiceC0301x {

    /* renamed from: f, reason: collision with root package name */
    public static final String f5693f = m.h("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public Handler f5694b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5695c;

    /* renamed from: d, reason: collision with root package name */
    public C2264b f5696d;

    /* renamed from: e, reason: collision with root package name */
    public NotificationManager f5697e;

    public final void a() {
        this.f5694b = new Handler(Looper.getMainLooper());
        this.f5697e = (NotificationManager) getApplicationContext().getSystemService("notification");
        C2264b c2264b = new C2264b(getApplicationContext());
        this.f5696d = c2264b;
        if (c2264b.f19722j != null) {
            m.f().e(C2264b.f19713k, "A callback already exists.", new Throwable[0]);
        } else {
            c2264b.f19722j = this;
        }
    }

    @Override // androidx.lifecycle.AbstractServiceC0301x, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.AbstractServiceC0301x, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f5696d.g();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i3) {
        super.onStartCommand(intent, i, i3);
        boolean z6 = this.f5695c;
        String str = f5693f;
        if (z6) {
            m.f().g(str, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f5696d.g();
            a();
            this.f5695c = false;
        }
        if (intent == null) {
            return 3;
        }
        C2264b c2264b = this.f5696d;
        k kVar = c2264b.f19715b;
        String str2 = C2264b.f19713k;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            m.f().g(str2, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            ((e) c2264b.f19716c).o(new C(c2264b, kVar.f3992k, stringExtra, 13, false));
            c2264b.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            c2264b.e(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            m.f().g(str2, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            UUID uuidFromString = UUID.fromString(stringExtra2);
            kVar.getClass();
            kVar.f3993l.o(new C2323a(kVar, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        m.f().g(str2, "Stopping foreground service", new Throwable[0]);
        SystemForegroundService systemForegroundService = c2264b.f19722j;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.f5695c = true;
        m.f().a(str, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
