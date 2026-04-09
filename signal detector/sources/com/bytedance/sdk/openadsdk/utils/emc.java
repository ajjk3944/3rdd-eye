package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* loaded from: classes.dex */
public class emc implements Application.ActivityLifecycleCallbacks {
    public static boolean emc = false;
    public static long xq;
    public static long ypw;
    private final dg msw;
    private volatile WeakReference<Activity> qh;
    private final dg zz;
    private final AtomicBoolean dg = new AtomicBoolean(false);
    private final RunnableC0100emc bw = new RunnableC0100emc();
    private final ycc ycc = new ycc();
    private final bw uym = new bw();
    private int ru = 0;
    private volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.emc>> gbl = new CopyOnWriteArrayList<>();
    private HandlerThread sup = null;
    private Handler sz = null;
    private final LinkedList<Activity> cf = new LinkedList<>();

    public class bw implements Runnable {
        public bw() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerYpw = com.bytedance.sdk.openadsdk.core.qh.ypw();
                Message messageObtain = Message.obtain(handlerYpw, emc.this.bw);
                messageObtain.what = BackupConstant.SCENE_RENDER_FAIL;
                handlerYpw.sendMessageDelayed(messageObtain, 30000L);
            }
        }
    }

    public static class dg implements Runnable {
        private dg() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.dg.emc.gbl gblVarXxs = com.bytedance.sdk.openadsdk.core.settings.gbl.xq().xxs();
            if (gblVarXxs == null || gblVarXxs.emc() || !com.bytedance.sdk.component.utils.sba.msw(com.bytedance.sdk.openadsdk.core.aa.emc())) {
                return;
            }
            com.bytedance.sdk.openadsdk.dg.emc.ypw.emc(com.bytedance.sdk.openadsdk.core.sup.emc(com.bytedance.sdk.openadsdk.core.aa.emc()));
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.utils.emc$emc, reason: collision with other inner class name */
    public static class RunnableC0100emc implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            iyl.xq(new com.bytedance.sdk.component.msw.msw("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.emc.emc.1
                @Override // java.lang.Runnable
                public void run() throws JSONException {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    public class uym implements Runnable {
        private boolean dg;
        private long xq;
        private long ypw;

        public uym(long j6, long j7, boolean z6) {
            this.ypw = j6;
            this.xq = j7;
            this.dg = z6;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.dg) {
                com.bytedance.sdk.openadsdk.vk.xq.emc().emc(this.ypw / 1000, this.xq / 1000);
            }
        }
    }

    public static class xq extends dg {
        private xq() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.emc.dg, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.utils.bw.emc();
        }
    }

    public class ycc implements Runnable {
        public ycc() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.core.qh.ypw().removeMessages(BackupConstant.SCENE_RENDER_FAIL);
            com.bytedance.sdk.openadsdk.core.aa.emc();
        }
    }

    public static class ypw extends dg {
        private ypw() {
            super();
        }

        @Override // com.bytedance.sdk.openadsdk.utils.emc.dg, java.lang.Runnable
        public void run() {
            super.run();
            com.bytedance.sdk.openadsdk.ycc.ypw.emc().ypw();
            com.bytedance.sdk.openadsdk.utils.bw.ypw();
            com.bytedance.sdk.openadsdk.component.uym.emc.emc(3);
        }
    }

    public emc() {
        this.msw = new ypw();
        this.zz = new xq();
        xq();
    }

    private void xq() {
        this.sup = com.bytedance.sdk.component.utils.msw.emc("lifecycle", 10);
        this.sz = new Handler(this.sup.getLooper());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.cf.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.gbl != null && this.gbl.size() > 0) {
            Iterator<WeakReference<com.bytedance.sdk.component.adexpress.emc>> it = this.gbl.iterator();
            while (it.hasNext()) {
                WeakReference<com.bytedance.sdk.component.adexpress.emc> next = it.next();
                if (next != null && next.get() != null) {
                    try {
                        next.get().emc(activity);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        if (this.qh != null && this.qh.get() == activity) {
            this.qh = null;
        }
        this.cf.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        int i = this.ru - 1;
        this.ru = i;
        if (i < 0) {
            this.ru = 0;
        }
        if (ApmHelper.isIsInit()) {
            emc(this.uym);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        emc(this.ycc);
        if (!emc) {
            ypw = System.currentTimeMillis();
            emc = true;
        }
        this.qh = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (vw.ypw() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                if (!decorView.isAttachedToWindow()) {
                    decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.emc.1
                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewAttachedToWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                            if (vw.dg(activity)) {
                                vw.emc(true);
                            }
                        }

                        @Override // android.view.View.OnAttachStateChangeListener
                        public void onViewDetachedFromWindow(View view) {
                            decorView.removeOnAttachStateChangeListener(this);
                        }
                    });
                } else if (vw.dg(activity)) {
                    vw.emc(true);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.ul.emc("TTAD.ActivityLifecycle", th);
        }
        this.ru++;
        if (this.dg.get()) {
            this.sz.removeCallbacks(this.zz);
            this.sz.removeCallbacks(this.msw);
            emc(this.zz);
        }
        this.dg.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (this.ru <= 0) {
            this.dg.set(true);
        }
        if (emc()) {
            emc = false;
            com.bytedance.sdk.openadsdk.core.qh.ypw.set(false);
            xq = System.currentTimeMillis();
            this.sz.removeCallbacks(this.zz);
            this.sz.removeCallbacks(this.msw);
            emc(this.msw);
        }
        emc(new uym(ypw, xq, emc()));
    }

    public boolean ypw(com.bytedance.sdk.component.adexpress.emc emcVar) {
        return this.gbl.remove(new WeakReference(emcVar));
    }

    private void emc(Runnable runnable) {
        if (!this.sup.isAlive()) {
            xq();
        }
        this.sz.postDelayed(runnable, 1000L);
    }

    public Activity ypw() {
        if (this.cf.isEmpty()) {
            return null;
        }
        return this.cf.getFirst();
    }

    public void emc(com.bytedance.sdk.component.adexpress.emc emcVar) {
        this.gbl.add(new WeakReference<>(emcVar));
    }

    public boolean emc() {
        return this.dg.get();
    }

    public boolean emc(boolean z6) {
        Activity activity;
        Window window;
        return (this.qh == null || (activity = this.qh.get()) == null || (window = activity.getWindow()) == null) ? z6 : window.getDecorView().hasWindowFocus();
    }
}
