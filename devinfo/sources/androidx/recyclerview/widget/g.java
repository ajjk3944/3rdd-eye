package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.NotificationManager;
import android.content.Intent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.monitor.MonitorManager;
import com.liuzh.deviceinfo.monitor.MonitorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1365a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1367c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1369e;

    public g(l lVar, x1 x1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f1369e = lVar;
        this.f1366b = x1Var;
        this.f1368d = viewPropertyAnimator;
        this.f1367c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f1365a) {
            case 1:
                this.f1367c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f1365a) {
            case 0:
                ((ViewPropertyAnimator) this.f1368d).setListener(null);
                this.f1367c.setAlpha(1.0f);
                l lVar = (l) this.f1369e;
                x1 x1Var = (x1) this.f1366b;
                lVar.c(x1Var);
                lVar.f1444q.remove(x1Var);
                lVar.i();
                return;
            case 1:
                ((ViewPropertyAnimator) this.f1368d).setListener(null);
                l lVar2 = (l) this.f1369e;
                x1 x1Var2 = (x1) this.f1366b;
                lVar2.c(x1Var2);
                lVar2.f1442o.remove(x1Var2);
                lVar2.i();
                return;
            default:
                try {
                    ((MonitorManager) this.f1369e).f21225b.removeViewImmediate(this.f1367c);
                    ((wg.a) this.f1366b).e();
                    synchronized (((MonitorManager) this.f1369e).f21227d) {
                        ((MonitorManager) this.f1369e).f21227d.remove((String) this.f1368d);
                        if (((MonitorManager) this.f1369e).f21227d.isEmpty()) {
                            String str = MonitorService.f21229a;
                            if (wi.h.f36763i) {
                                NotificationManager notificationManager = MonitorService.f21230b;
                                if (notificationManager != null) {
                                    notificationManager.cancel(2110271338);
                                }
                            } else {
                                DeviceInfoApp deviceInfoApp = DeviceInfoApp.f21145f;
                                deviceInfoApp.stopService(new Intent(deviceInfoApp, (Class<?>) MonitorService.class));
                            }
                        }
                    }
                } catch (Throwable unused) {
                    this.f1367c.setAlpha(1.0f);
                }
                MonitorManager.f21223f.e();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f1365a) {
            case 0:
                ((l) this.f1369e).getClass();
                break;
            case 1:
                ((l) this.f1369e).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public g(l lVar, x1 x1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f1369e = lVar;
        this.f1366b = x1Var;
        this.f1367c = view;
        this.f1368d = viewPropertyAnimator;
    }

    public g(MonitorManager monitorManager, View view, wg.a aVar, String str) {
        this.f1369e = monitorManager;
        this.f1367c = view;
        this.f1366b = aVar;
        this.f1368d = str;
    }
}
