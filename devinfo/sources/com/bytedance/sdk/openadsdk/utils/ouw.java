package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.rn.ouw.yu;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw implements Application.ActivityLifecycleCallbacks {

    /* renamed from: lh, reason: collision with root package name */
    public static long f8705lh = 0;
    public static boolean vt = false;
    public static long yu;

    /* renamed from: cf, reason: collision with root package name */
    private final yu f8706cf;

    /* renamed from: le, reason: collision with root package name */
    public volatile WeakReference<Activity> f8708le;
    private final yu tlj;
    public final AtomicBoolean ouw = new AtomicBoolean(false);
    private final RunnableC0115ouw ra = new RunnableC0115ouw();
    private final le pno = new le();
    private final fkw bly = new fkw();
    private int ryl = 0;
    public volatile CopyOnWriteArrayList<WeakReference<com.bytedance.sdk.component.adexpress.ouw>> fkw = new CopyOnWriteArrayList<>();
    private HandlerThread mwh = null;

    /* renamed from: jg, reason: collision with root package name */
    private Handler f8707jg = null;
    private final LinkedList<Activity> ko = new LinkedList<>();

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class fkw implements Runnable {
        public fkw() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (ApmHelper.isIsInit()) {
                Handler handlerVt = com.bytedance.sdk.openadsdk.core.jg.vt();
                Message messageObtain = Message.obtain(handlerVt, ouw.this.ra);
                messageObtain.what = 1001;
                handlerVt.sendMessageDelayed(messageObtain, 30000L);
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class le implements Runnable {
        public le() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.bytedance.sdk.openadsdk.core.jg.vt().removeMessages(1001);
            com.bytedance.sdk.openadsdk.core.zih.ouw();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class lh extends yu {
        private lh() {
            super((byte) 0);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.ouw.yu, java.lang.Runnable
        public final void run() {
            super.run();
            if (com.bytedance.sdk.openadsdk.utils.fkw.ouw == null || com.bytedance.sdk.openadsdk.utils.fkw.f8696lh) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.utils.fkw.vt > 0) {
                com.bytedance.sdk.openadsdk.utils.fkw.ouw(SystemClock.elapsedRealtime() - com.bytedance.sdk.openadsdk.utils.fkw.vt);
            }
            com.bytedance.sdk.openadsdk.utils.fkw.ouw = null;
            com.bytedance.sdk.openadsdk.utils.fkw.vt = 0L;
        }

        public /* synthetic */ lh(byte b10) {
            this();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.bytedance.sdk.openadsdk.utils.ouw$ouw, reason: collision with other inner class name */
    public static class RunnableC0115ouw implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            bs.lh(new com.bytedance.sdk.component.pno.pno("reportPvFromBackGround") { // from class: com.bytedance.sdk.openadsdk.utils.ouw.ouw.1
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    ApmHelper.reportPvFromBackGround();
                }
            });
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public class ra implements Runnable {

        /* renamed from: lh, reason: collision with root package name */
        private long f8710lh;
        private long vt;
        private boolean yu;

        public ra(long j, long j8, boolean z3) {
            this.vt = j;
            this.f8710lh = j8;
            this.yu = z3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.yu) {
                com.bytedance.sdk.openadsdk.rn.lh lhVarOuw = com.bytedance.sdk.openadsdk.rn.lh.ouw();
                long j = this.vt / 1000;
                long j8 = this.f8710lh / 1000;
                com.bytedance.sdk.openadsdk.rn.lh.ouw("general_label", false, new com.bytedance.sdk.openadsdk.rn.vt() { // from class: com.bytedance.sdk.openadsdk.rn.lh.4

                    /* renamed from: lh */
                    final /* synthetic */ long f8630lh;
                    final /* synthetic */ long ouw;
                    final /* synthetic */ long vt;

                    public AnonymousClass4(long j9, long j82, long j10) {
                        j = j9;
                        j = j82;
                        j = j10;
                    }

                    @Override // com.bytedance.sdk.openadsdk.rn.vt
                    public final com.bytedance.sdk.openadsdk.rn.ouw.lh ouw() throws Exception {
                        int i4 = !jg.vt.get() ? 1 : 0;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("starttime", j);
                            jSONObject.put("endtime", j);
                            jSONObject.put("start_type", i4);
                        } catch (Throwable unused) {
                        }
                        yu yuVar = new yu();
                        yuVar.ouw = "general_label";
                        yuVar.tlj = String.valueOf(j);
                        yuVar.bly = jSONObject.toString();
                        return yuVar;
                    }
                });
            }
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class vt extends yu {
        private vt() {
            super((byte) 0);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.ouw.yu, java.lang.Runnable
        public final void run() {
            super.run();
            final com.bytedance.sdk.openadsdk.le.vt vtVarOuw = com.bytedance.sdk.openadsdk.le.vt.ouw();
            try {
                if (com.bytedance.sdk.openadsdk.le.ouw.ouw().mwh) {
                    vtVarOuw.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.le.vt.7
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (!ouw.ouw().ko) {
                                if (vt.this.f8566lh != null) {
                                    vt.this.f8566lh.ouw();
                                }
                            } else {
                                Iterator it = vt.this.vt.keySet().iterator();
                                while (it.hasNext()) {
                                    com.bytedance.sdk.openadsdk.zih.ouw ouwVar = (com.bytedance.sdk.openadsdk.zih.ouw) vt.this.vt.get((String) it.next());
                                    if (ouwVar != null) {
                                        ouwVar.ouw();
                                    }
                                }
                            }
                        }
                    });
                }
            } catch (OutOfMemoryError e2) {
                com.bytedance.sdk.component.utils.qbp.yu(e2.getMessage(), new Object[0]);
            }
            if (com.bytedance.sdk.openadsdk.utils.fkw.ouw == null || com.bytedance.sdk.openadsdk.utils.fkw.f8696lh) {
                return;
            }
            com.bytedance.sdk.openadsdk.utils.fkw.vt = SystemClock.elapsedRealtime();
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static class yu implements Runnable {
        private yu() {
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.openadsdk.yu.ouw.cf cfVarFqk = com.bytedance.sdk.openadsdk.core.settings.cf.vt().fqk();
            if (cfVarFqk == null || cfVarFqk.yu || !com.bytedance.sdk.component.utils.vm.vt(com.bytedance.sdk.openadsdk.core.zih.ouw())) {
                return;
            }
            com.bytedance.sdk.openadsdk.yu.ouw.vt.ouw(com.bytedance.sdk.openadsdk.core.ryl.ouw(com.bytedance.sdk.openadsdk.core.zih.ouw()));
        }

        public /* synthetic */ yu(byte b10) {
            this();
        }
    }

    public ouw() {
        byte b10 = 0;
        this.tlj = new vt(b10);
        this.f8706cf = new lh(b10);
        vt();
    }

    private void vt() {
        this.mwh = com.bytedance.sdk.component.utils.pno.ouw("lifecycle", 10);
        this.f8707jg = new Handler(this.mwh.getLooper());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.ko.addFirst(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.fkw != null && this.fkw.size() > 0) {
            Iterator<WeakReference<com.bytedance.sdk.component.adexpress.ouw>> it = this.fkw.iterator();
            while (it.hasNext()) {
                WeakReference<com.bytedance.sdk.component.adexpress.ouw> next = it.next();
                if (next != null && next.get() != null) {
                    try {
                        next.get().ouw(activity);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                }
            }
        }
        if (this.f8708le != null && this.f8708le.get() == activity) {
            this.f8708le = null;
        }
        this.ko.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i4 = this.ryl - 1;
        this.ryl = i4;
        if (i4 < 0) {
            this.ryl = 0;
        }
        if (ApmHelper.isIsInit()) {
            ouw(this.bly);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        ouw(this.pno);
        if (!vt) {
            f8705lh = System.currentTimeMillis();
            vt = true;
        }
        this.f8708le = new WeakReference<>(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(final Activity activity) {
        Window window;
        try {
            if (osn.vt() && (window = activity.getWindow()) != null) {
                final View decorView = window.getDecorView();
                decorView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.ouw.1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                        if (osn.yu(activity)) {
                            osn.lh();
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                        decorView.removeOnAttachStateChangeListener(this);
                    }
                });
            }
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.qbp.ouw("TTAD.ActivityLifecycle", th2);
        }
        this.ryl++;
        if (this.ouw.get()) {
            this.f8707jg.removeCallbacks(this.f8706cf);
            this.f8707jg.removeCallbacks(this.tlj);
            ouw(this.f8706cf);
        }
        this.ouw.set(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.ryl <= 0) {
            this.ouw.set(true);
        }
        if (this.ouw.get()) {
            vt = false;
            com.bytedance.sdk.openadsdk.core.jg.vt.set(false);
            yu = System.currentTimeMillis();
            this.f8707jg.removeCallbacks(this.f8706cf);
            this.f8707jg.removeCallbacks(this.tlj);
            ouw(this.tlj);
        }
        ouw(new ra(f8705lh, yu, this.ouw.get()));
    }

    private void ouw(Runnable runnable) {
        if (!this.mwh.isAlive()) {
            vt();
        }
        this.f8707jg.postDelayed(runnable, 1000L);
    }

    public final void ouw(com.bytedance.sdk.component.adexpress.ouw ouwVar) {
        this.fkw.add(new WeakReference<>(ouwVar));
    }

    public final Activity ouw() {
        if (this.ko.isEmpty()) {
            return null;
        }
        return this.ko.getFirst();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
