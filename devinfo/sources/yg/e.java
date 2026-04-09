package yg;

import com.liuzh.deviceinfo.notification.NotificationService;
import java.util.TimerTask;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f37617b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f37616a = i4;
        this.f37617b = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f37616a) {
            case 0:
                ((bg.a) this.f37617b).run();
                break;
            default:
                NotificationService notificationService = (NotificationService) this.f37617b;
                NotificationService.b();
                try {
                    try {
                        notificationService.startForeground(19960101, NotificationService.c(notificationService));
                        break;
                    } catch (Exception unused) {
                        notificationService.startForeground(19960101, NotificationService.c(notificationService));
                    }
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
