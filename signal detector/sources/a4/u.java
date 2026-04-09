package a4;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import androidx.work.impl.foreground.SystemForegroundService;
import r.BinderC2862e;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4726a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4728c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4730e;

    public u(v vVar, d dVar, int i, int i3) {
        this.f4730e = vVar;
        this.f4729d = dVar;
        this.f4727b = i;
        this.f4728c = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4726a) {
            case 0:
                v vVar = (v) this.f4730e;
                d dVar = (d) this.f4729d;
                vVar.f(new d(dVar.f4679a, this.f4727b, this.f4728c, dVar.f4682d, dVar.f4683e, dVar.f4684f, dVar.f4685g, dVar.f4686h, dVar.i));
                break;
            case 1:
                Notification notification = (Notification) this.f4729d;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f4730e;
                int i = Build.VERSION.SDK_INT;
                int i3 = this.f4727b;
                if (i < 29) {
                    systemForegroundService.startForeground(i3, notification);
                    break;
                } else {
                    systemForegroundService.startForeground(i3, notification, this.f4728c);
                    break;
                }
            default:
                ((BinderC2862e) this.f4730e).f23313b.c(this.f4727b, this.f4728c, (Bundle) this.f4729d);
                break;
        }
    }

    public u(SystemForegroundService systemForegroundService, int i, Notification notification, int i3) {
        this.f4730e = systemForegroundService;
        this.f4727b = i;
        this.f4729d = notification;
        this.f4728c = i3;
    }

    public u(BinderC2862e binderC2862e, int i, int i3, Bundle bundle) {
        this.f4730e = binderC2862e;
        this.f4727b = i;
        this.f4728c = i3;
        this.f4729d = bundle;
    }
}
