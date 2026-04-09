package bg;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Build;
import b5.o0;
import bh.c;
import com.applovin.impl.n7;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.alive.CoreService;
import com.liuzh.deviceinfo.notification.NotificationService;
import com.liuzh.deviceinfo.pro.account.AccountActivity;
import com.liuzh.deviceinfo.pro.account.AccountProActivity;
import com.liuzh.deviceinfo.pro.account.login.LogInActivity;
import com.liuzh.deviceinfo.pro.account.register.BindEmailActivity;
import com.liuzh.deviceinfo.pro.account.register.ResetPwdActivity;
import com.liuzh.deviceinfo.settings.SettingsActivity;
import ec.y;
import j2.d0;
import j2.r;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import nk.k;
import x.a0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2183a;

    public /* synthetic */ a(int i4) {
        this.f2183a = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity;
        switch (this.f2183a) {
            case 0:
                int i4 = CoreService.f21166a;
                CoreService.a(DeviceInfoApp.f21145f);
                return;
            case 1:
                Iterator it = c.f2190c.iterator();
                k.d(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    k.d(next, "next(...)");
                    bh.a aVar = (bh.a) next;
                    switch (aVar.f2184a) {
                        case 0:
                            ((AccountActivity) aVar.f2185b).finish();
                            break;
                        case 1:
                            AccountProActivity accountProActivity = (AccountProActivity) aVar.f2185b;
                            int i10 = AccountProActivity.H;
                            accountProActivity.D();
                            break;
                        case 2:
                            break;
                        case 3:
                            ((BindEmailActivity) aVar.f2185b).finish();
                            break;
                        case 4:
                            ((ResetPwdActivity) aVar.f2185b).finish();
                            break;
                        default:
                            SettingsActivity settingsActivity = (SettingsActivity) aVar.f2185b;
                            int i11 = SettingsActivity.J;
                            settingsActivity.E();
                            break;
                    }
                }
                return;
            case 2:
                WeakReference weakReference = DeviceInfoApp.f21147i;
                if (weakReference == null || (activity = (Activity) weakReference.get()) == null) {
                    return;
                }
                o0 o0Var = LogInActivity.D;
                y.h(activity, 2);
                return;
            case 3:
                n7.c();
                return;
            case 4:
                a0 a0Var = r.M0;
                synchronized (a0Var) {
                    try {
                        int i12 = 0;
                        if (Build.VERSION.SDK_INT < 30) {
                            Object[] objArr = a0Var.f36846a;
                            int i13 = a0Var.f36847b;
                            while (i12 < i13) {
                                r rVar = (r) objArr[i12];
                                boolean showLayoutBounds = rVar.getShowLayoutBounds();
                                Class cls = r.J0;
                                rVar.setShowLayoutBounds(d0.k());
                                if (showLayoutBounds != rVar.getShowLayoutBounds()) {
                                    r.q(rVar.getRoot());
                                }
                                i12++;
                            }
                        } else {
                            Object[] objArr2 = a0Var.f36846a;
                            int i14 = a0Var.f36847b;
                            while (i12 < i14) {
                                r.q(((r) objArr2[i12]).getRoot());
                                i12++;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 5:
                int i15 = AlarmManagerSchedulerBroadcastReceiver.f9011a;
                return;
            case 6:
                ii.a.p();
                return;
            default:
                if (NotificationService.f21235f && zg.c.c()) {
                    Notification notificationC = NotificationService.c(DeviceInfoApp.f21145f);
                    NotificationManager notificationManager = NotificationService.f21232c;
                    if (notificationManager != null) {
                        notificationManager.notify(19960101, notificationC);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
