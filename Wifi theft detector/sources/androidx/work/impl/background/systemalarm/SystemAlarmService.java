package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.impl.background.systemalarm.d;
import androidx.work.k;
import m2.n;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemAlarmService extends LifecycleService implements d.c {

    /* renamed from: d, reason: collision with root package name */
    public static final String f4407d = k.f("SystemAlarmService");

    /* renamed from: b, reason: collision with root package name */
    public d f4408b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4409c;

    @Override // androidx.work.impl.background.systemalarm.d.c
    public void b() {
        this.f4409c = true;
        k.c().a(f4407d, "All commands completed in dispatcher", new Throwable[0]);
        n.a();
        stopSelf();
    }

    public final void e() {
        d dVar = new d(this);
        this.f4408b = dVar;
        dVar.m(this);
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        e();
        this.f4409c = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f4409c = true;
        this.f4408b.j();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f4409c) {
            k.c().d(f4407d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f4408b.j();
            e();
            this.f4409c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f4408b.a(intent, i11);
        return 3;
    }
}
