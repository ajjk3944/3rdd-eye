package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.foreground.a;
import androidx.work.k;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService implements a.b {

    /* renamed from: f, reason: collision with root package name */
    public static final String f4449f = k.f("SystemFgService");

    /* renamed from: g, reason: collision with root package name */
    public static SystemForegroundService f4450g = null;

    /* renamed from: b, reason: collision with root package name */
    public Handler f4451b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4452c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.work.impl.foreground.a f4453d;

    /* renamed from: e, reason: collision with root package name */
    public NotificationManager f4454e;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4455a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Notification f4456b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f4457c;

        public a(int i10, Notification notification, int i11) {
            this.f4455a = i10;
            this.f4456b = notification;
            this.f4457c = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f4455a, this.f4456b, this.f4457c);
            } else {
                SystemForegroundService.this.startForeground(this.f4455a, this.f4456b);
            }
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4459a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Notification f4460b;

        public b(int i10, Notification notification) {
            this.f4459a = i10;
            this.f4460b = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f4454e.notify(this.f4459a, this.f4460b);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f4462a;

        public c(int i10) {
            this.f4462a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f4454e.cancel(this.f4462a);
        }
    }

    private void e() {
        this.f4451b = new Handler(Looper.getMainLooper());
        this.f4454e = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f4453d = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i10, Notification notification) {
        this.f4451b.post(new b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void c(int i10, int i11, Notification notification) {
        this.f4451b.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void d(int i10) {
        this.f4451b.post(new c(i10));
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f4450g = this;
        e();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4453d.k();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4452c) {
            k.c().d(f4449f, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f4453d.k();
            e();
            this.f4452c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4453d.l(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f4452c = true;
        k.c().a(f4449f, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f4450g = null;
        stopSelf();
    }
}
