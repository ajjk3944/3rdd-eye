package androidx.work.impl.foreground;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: SystemForegroundService.java */
/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16928b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Notification f16929c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f16931e;

    public a(SystemForegroundService systemForegroundService, int i, Notification notification, int i10) {
        this.f16931e = systemForegroundService;
        this.f16928b = i;
        this.f16929c = notification;
        this.f16930d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        int i10 = this.f16930d;
        Notification notification = this.f16929c;
        int i11 = this.f16928b;
        SystemForegroundService systemForegroundService = this.f16931e;
        if (i >= 31) {
            SystemForegroundService.b.a(systemForegroundService, i11, notification, i10);
        } else if (i >= 29) {
            SystemForegroundService.a.a(systemForegroundService, i11, notification, i10);
        } else {
            systemForegroundService.startForeground(i11, notification);
        }
    }
}
