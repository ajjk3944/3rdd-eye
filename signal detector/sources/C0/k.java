package C0;

import A2.C0117e;
import R.O;
import Y2.C0206h;
import Y2.C0207i;
import Y2.C0209k;
import Y2.Q;
import a1.C0264c;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.C;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.bytedance.sdk.openadsdk.core.sz.dg.xq;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e5.C2313i;
import f4.InterfaceFutureC2326a;
import j.C2539e;
import java.io.IOException;
import java.lang.ref.Reference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import k0.AbstractComponentCallbacksC2617v;
import k0.DialogInterfaceOnCancelListenerC2610n;
import k0.K;
import n.MenuC2677k;
import o.C2732p0;
import q.C2784b;

/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1052a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1053b;

    public /* synthetic */ k(int i, Object obj) {
        this.f1052a = i;
        this.f1053b = obj;
    }

    private final void b() {
        synchronized (this) {
            ((Y.h) this.f1053b).f4210c = false;
        }
        while (true) {
            Reference referencePoll = Y.h.f4207l.poll();
            if (referencePoll == null) {
                break;
            } else if (referencePoll instanceof Y.i) {
                ((Y.i) referencePoll).a();
            }
        }
        if (((Y.h) this.f1053b).f4212e.isAttachedToWindow()) {
            ((Y.h) this.f1053b).c();
            return;
        }
        View view = ((Y.h) this.f1053b).f4212e;
        Y.e eVar = Y.h.f4208m;
        view.removeOnAttachStateChangeListener(eVar);
        ((Y.h) this.f1053b).f4212e.addOnAttachStateChangeListener(eVar);
    }

    private final void c() {
        Context context = (Context) this.f1053b;
        AtomicReference atomicReference = Z3.a.f4523e;
        try {
            a4.v vVarE = a4.v.e(context);
            synchronized (vVarE) {
                vVarE.f4737f = true;
                vVarE.d();
            }
        } catch (SecurityException unused) {
            Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
        }
    }

    private final void d() {
        Object obj;
        synchronized (((C) this.f1053b).f5177a) {
            obj = ((C) this.f1053b).f5182f;
            ((C) this.f1053b).f5182f = C.f5176k;
        }
        ((C) this.f1053b).j(obj);
    }

    private final void e() {
        synchronized (((c3.h) this.f1053b).f5908d) {
            ((c3.j) ((c3.h) ((c3.h) this.f1053b).f5907c).f5907c).h();
        }
    }

    private final void f() {
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f1053b;
        String strB = constraintTrackingWorker.getInputData().b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        boolean z6 = false;
        if (TextUtils.isEmpty(strB)) {
            V0.m.f().e(ConstraintTrackingWorker.f5699k, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.i.i(new V0.i());
            return;
        }
        ListenableWorker listenableWorkerA = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), strB, constraintTrackingWorker.f5700f);
        constraintTrackingWorker.f5703j = listenableWorkerA;
        if (listenableWorkerA == null) {
            V0.m.f().a(ConstraintTrackingWorker.f5699k, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.i.i(new V0.i());
            return;
        }
        e1.h hVarH = W0.k.G(constraintTrackingWorker.getApplicationContext()).f3992k.t().h(constraintTrackingWorker.getId().toString());
        if (hVarH == null) {
            constraintTrackingWorker.i.i(new V0.i());
            return;
        }
        C0264c c0264c = new C0264c(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
        c0264c.c(Collections.singletonList(hVarH));
        if (!c0264c.a(constraintTrackingWorker.getId().toString())) {
            V0.m.f().a(ConstraintTrackingWorker.f5699k, A.f.m("Constraints not met for delegate ", strB, ". Requesting retry."), new Throwable[0]);
            constraintTrackingWorker.i.i(new V0.j());
            return;
        }
        V0.m.f().a(ConstraintTrackingWorker.f5699k, A.f.l("Constraints met for delegate ", strB), new Throwable[0]);
        int i = 1;
        try {
            InterfaceFutureC2326a interfaceFutureC2326aStartWork = constraintTrackingWorker.f5703j.startWork();
            interfaceFutureC2326aStartWork.a(new f1.i(constraintTrackingWorker, interfaceFutureC2326aStartWork, i, z6), constraintTrackingWorker.getBackgroundExecutor());
        } catch (Throwable th) {
            V0.m mVarF = V0.m.f();
            String str = ConstraintTrackingWorker.f5699k;
            mVarF.a(str, A.f.m("Delegated worker ", strB, " threw exception in startWork."), th);
            synchronized (constraintTrackingWorker.f5701g) {
                try {
                    if (constraintTrackingWorker.f5702h) {
                        V0.m.f().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        constraintTrackingWorker.i.i(new V0.j());
                    } else {
                        constraintTrackingWorker.i.i(new V0.i());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public C2313i a() throws IOException {
        l lVar = (l) this.f1053b;
        C2313i c2313i = new C2313i();
        Cursor cursorL = lVar.f1055a.l(new C0117e("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (cursorL.moveToNext()) {
            try {
                c2313i.add(Integer.valueOf(cursorL.getInt(0)));
            } finally {
            }
        }
        cursorL.close();
        C2313i c2313iB = d5.y.b(c2313i);
        if (c2313iB.f19976a.isEmpty()) {
            return c2313iB;
        }
        if (((l) this.f1053b).f1062h == null) {
            throw new IllegalStateException("Required value was null.");
        }
        H0.j jVar = ((l) this.f1053b).f1062h;
        if (jVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        jVar.b();
        return c2313iB;
    }

    @Override // java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Set setA;
        View viewD;
        int width;
        switch (this.f1052a) {
            case 0:
                ReentrantReadWriteLock.ReadLock lock = ((l) this.f1053b).f1055a.f1094h.readLock();
                q5.i.d(lock, "readWriteLock.readLock()");
                lock.lock();
                try {
                    try {
                        try {
                        } catch (IllegalStateException e6) {
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e6);
                            setA = d5.u.f19826a;
                        }
                    } catch (SQLiteException e7) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e7);
                        setA = d5.u.f19826a;
                    }
                    if (((l) this.f1053b).b() && ((l) this.f1053b).f1060f.compareAndSet(true, false) && !((l) this.f1053b).f1055a.g().i().m()) {
                        H0.c cVarI = ((l) this.f1053b).f1055a.g().i();
                        cVarI.b();
                        try {
                            setA = a();
                            cVarI.q();
                            if (setA.isEmpty()) {
                                return;
                            }
                            l lVar = (l) this.f1053b;
                            synchronized (lVar.f1064k) {
                                Iterator it = lVar.f1064k.iterator();
                                while (true) {
                                    C2784b c2784b = (C2784b) it;
                                    if (c2784b.hasNext()) {
                                        ((i) ((Map.Entry) c2784b.next()).getValue()).a(setA);
                                    }
                                }
                            }
                            return;
                        } finally {
                            cVarI.e();
                        }
                    }
                    return;
                } finally {
                    lock.unlock();
                }
            case 1:
                ((L2.k) this.f1053b).e();
                return;
            case 2:
                K2.c cVar = ((L2.k) ((A0.e) this.f1053b).f73b).f2523b;
                cVar.c(cVar.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 3:
                ((L2.t) this.f1053b).f2563h.d(new J2.b(4, null, null));
                return;
            case 4:
                throw null;
            case 5:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f1053b).f18532c.f2888g;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 6:
                U4.m mVar = (U4.m) this.f1053b;
                mVar.f3755g = false;
                mVar.c();
                return;
            case 7:
                U.d dVar = (U.d) this.f1053b;
                C2732p0 c2732p0 = dVar.f3647c;
                U.a aVar = dVar.f3645a;
                if (dVar.f3642C) {
                    if (dVar.f3656m) {
                        dVar.f3656m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.f3637e = jCurrentAnimationTimeMillis;
                        aVar.f3639g = -1L;
                        aVar.f3638f = jCurrentAnimationTimeMillis;
                        aVar.f3640h = 0.5f;
                    }
                    if ((aVar.f3639g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.f3639g + aVar.i) || !dVar.e()) {
                        dVar.f3642C = false;
                        return;
                    }
                    if (dVar.f3657n) {
                        dVar.f3657n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        c2732p0.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar.f3638f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar.a(jCurrentAnimationTimeMillis2);
                    long j6 = jCurrentAnimationTimeMillis2 - aVar.f3638f;
                    aVar.f3638f = jCurrentAnimationTimeMillis2;
                    dVar.f3644E.scrollListBy((int) (j6 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar.f3636d));
                    WeakHashMap weakHashMap = O.f3270a;
                    c2732p0.postOnAnimation(this);
                    return;
                }
                return;
            case 8:
                Worker worker = (Worker) this.f1053b;
                try {
                    worker.f5664f.i(worker.doWork());
                    return;
                } catch (Throwable th) {
                    worker.f5664f.j(th);
                    return;
                }
            case 9:
                xq xqVar = (xq) this.f1053b;
                if (((V1.e) xqVar).ru == null) {
                    return;
                }
                long jSba = xqVar.sba();
                if (jSba > 0 && xqVar.ycc() && ((V1.e) xqVar).yzg != Long.MIN_VALUE) {
                    try {
                        if (((V1.e) xqVar).yzg == jSba) {
                            if (!((V1.e) xqVar).aa && ((V1.e) xqVar).ul >= 400) {
                                xqVar.i(701);
                                ((V1.e) xqVar).aa = true;
                            }
                            ((V1.e) xqVar).ul += ((V1.e) xqVar).lt;
                        } else {
                            if (((V1.e) xqVar).aa) {
                                ((V1.e) xqVar).sba += ((V1.e) xqVar).ul;
                                xqVar.i(702);
                                long unused = ((V1.e) xqVar).sba;
                                int unused2 = ((V1.e) xqVar).uym;
                            }
                            ((V1.e) xqVar).ul = 0L;
                            ((V1.e) xqVar).aa = false;
                        }
                    } catch (Throwable th2) {
                        th2.getMessage();
                    }
                }
                if (xqVar.aa() > 0) {
                    if (((V1.e) xqVar).yzg != jSba) {
                        V1.e.emc(xqVar, jSba, xqVar.aa());
                    }
                    ((V1.e) xqVar).yzg = jSba;
                }
                if (xqVar.ypw()) {
                    V1.e.emc(xqVar, xqVar.aa(), xqVar.aa());
                    return;
                } else {
                    if (((V1.e) xqVar).vk != null) {
                        ((V1.e) xqVar).vk.postDelayed(this, ((V1.e) xqVar).lt);
                        return;
                    }
                    return;
                }
            case 10:
                Context context = (Context) ((V2.e) this.f1053b).f3868b;
                long j7 = V2.e.D(context).getLong("app_set_id_last_used_time", -1L);
                long j8 = j7 != -1 ? j7 + 33696000000L : -1L;
                if (j8 == -1 || System.currentTimeMillis() <= j8) {
                    return;
                }
                if (!V2.e.D(context).edit().remove("app_set_id").commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String strValueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 11:
                ((X.f) this.f1053b).p(0);
                return;
            case 12:
                b();
                return;
            case 13:
                Q q3 = new Q(4, "Web view timed out.");
                C0206h c0206h = (C0206h) ((C0207i) this.f1053b).i.getAndSet(null);
                if (c0206h == null) {
                    return;
                }
                c0206h.k(q3.a());
                return;
            case 14:
                ((C0209k) this.f1053b).a();
                return;
            case 15:
                ((e4.b) this.f1053b).h();
                return;
            case 16:
                c();
                return;
            case 17:
                try {
                    ((Z3.a) this.f1053b).f4524a.d();
                    return;
                } catch (Exception e8) {
                    Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e8);
                    return;
                }
            case 18:
                d();
                return;
            case 19:
                e();
                return;
            case 20:
                com.bumptech.glide.n nVar = (com.bumptech.glide.n) this.f1053b;
                nVar.f6570c.f(nVar);
                return;
            case 21:
                d0.e eVar = (d0.e) this.f1053b;
                DrawerLayout drawerLayout = eVar.f19712g;
                int i = eVar.f19710e.f4137o;
                int i3 = eVar.f19709d;
                boolean z6 = i3 == 3;
                if (z6) {
                    viewD = drawerLayout.d(3);
                    width = (viewD != null ? -viewD.getWidth() : 0) + i;
                } else {
                    viewD = drawerLayout.d(5);
                    width = drawerLayout.getWidth() - i;
                }
                if (viewD != null) {
                    if (((!z6 || viewD.getLeft() >= width) && (z6 || viewD.getLeft() <= width)) || drawerLayout.f(viewD) != 0) {
                        return;
                    }
                    d0.c cVar2 = (d0.c) viewD.getLayoutParams();
                    eVar.f19710e.s(viewD, width, viewD.getTop());
                    cVar2.f19702c = true;
                    drawerLayout.invalidate();
                    View viewD2 = drawerLayout.d(i3 == 3 ? 5 : 3);
                    if (viewD2 != null) {
                        drawerLayout.b(viewD2, true);
                    }
                    if (drawerLayout.f5142F) {
                        return;
                    }
                    long jUptimeMillis2 = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain2 = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
                    int childCount = drawerLayout.getChildCount();
                    for (int i6 = 0; i6 < childCount; i6++) {
                        drawerLayout.getChildAt(i6).dispatchTouchEvent(motionEventObtain2);
                    }
                    motionEventObtain2.recycle();
                    drawerLayout.f5142F = true;
                    return;
                }
                return;
            case 22:
                h.C c6 = (h.C) this.f1053b;
                Window.Callback callback = c6.f20260b;
                Menu menuD0 = c6.d0();
                MenuC2677k menuC2677k = menuD0 instanceof MenuC2677k ? (MenuC2677k) menuD0 : null;
                if (menuC2677k != null) {
                    menuC2677k.y();
                }
                try {
                    menuD0.clear();
                    if (!callback.onCreatePanelMenu(0, menuD0) || !callback.onPreparePanel(0, null, menuD0)) {
                        menuD0.clear();
                    }
                    if (menuC2677k != null) {
                        menuC2677k.x();
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    if (menuC2677k != null) {
                        menuC2677k.x();
                    }
                    throw th3;
                }
            case 23:
                f();
                return;
            case 24:
                C2539e c2539e = (C2539e) this.f1053b;
                c2539e.a(true);
                c2539e.invalidateSelf();
                return;
            case 25:
                DialogInterfaceOnCancelListenerC2610n dialogInterfaceOnCancelListenerC2610n = (DialogInterfaceOnCancelListenerC2610n) this.f1053b;
                dialogInterfaceOnCancelListenerC2610n.f21649n0.onDismiss(dialogInterfaceOnCancelListenerC2610n.v0);
                return;
            case 26:
                AbstractComponentCallbacksC2617v abstractComponentCallbacksC2617v = (AbstractComponentCallbacksC2617v) this.f1053b;
                if (abstractComponentCallbacksC2617v.f21699W != null) {
                    abstractComponentCallbacksC2617v.g().getClass();
                    return;
                }
                return;
            case 27:
                ((K) this.f1053b).x(true);
                return;
            case 28:
                H3.g gVar = (H3.g) this.f1053b;
                gVar.f1797b = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) gVar.f1800e;
                X.f fVar = bottomSheetBehavior.f18141c0;
                if (fVar != null && fVar.g()) {
                    gVar.b(gVar.f1798c);
                    return;
                } else {
                    if (bottomSheetBehavior.b0 == 2) {
                        bottomSheetBehavior.J(gVar.f1798c);
                        return;
                    }
                    return;
                }
            default:
                Process.setThreadPriority(10);
                ((Runnable) this.f1053b).run();
                return;
        }
    }

    public k(L2.h hVar, L2.w wVar) {
        this.f1052a = 4;
        this.f1053b = wVar;
    }
}
