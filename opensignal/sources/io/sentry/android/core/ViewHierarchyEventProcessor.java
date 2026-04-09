package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.node.Owner;
import androidx.media3.exoplayer.ExoPlayer;
import io.sentry.b5;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.t4;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final SentryAndroidOptions f11530a;

    /* renamed from: d, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.g f11531d;

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        ir.f0.T(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f11530a = sentryAndroidOptions;
        this.f11531d = new io.sentry.android.core.internal.util.g(3, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            ic.a.b("ViewHierarchy");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(View view, io.sentry.protocol.g0 g0Var, List list) throws InterruptedException {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ComposeViewHierarchyExporter composeViewHierarchyExporter = (ComposeViewHierarchyExporter) it.next();
                composeViewHierarchyExporter.getClass();
                if (view instanceof Owner) {
                    if (composeViewHierarchyExporter.f12170b == null) {
                        io.sentry.q qVarA = composeViewHierarchyExporter.f12171c.a();
                        try {
                            if (composeViewHierarchyExporter.f12170b == null) {
                                composeViewHierarchyExporter.f12170b = new io.sentry.compose.a(composeViewHierarchyExporter.f12169a);
                            }
                            vc.e.e(qVarA, null);
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                vc.e.e(qVarA, th2);
                                throw th3;
                            }
                        }
                    }
                    x1.f0 root = ((Owner) view).getRoot();
                    io.sentry.compose.a aVar = composeViewHierarchyExporter.f12170b;
                    br.l.b(aVar);
                    ComposeViewHierarchyExporter.a(aVar, g0Var, root);
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    io.sentry.protocol.g0 g0VarC = c(childAt);
                    arrayList.add(g0VarC);
                    a(childAt, g0VarC, list);
                }
            }
            g0Var.G = arrayList;
        }
    }

    public static io.sentry.protocol.g0 c(View view) {
        io.sentry.protocol.g0 g0Var = new io.sentry.protocol.g0();
        g0Var.f12561d = ir.f0.B(view);
        try {
            g0Var.f12562g = io.sentry.android.core.internal.gestures.h.b(view);
        } catch (Throwable unused) {
        }
        g0Var.B = Double.valueOf(view.getX());
        g0Var.D = Double.valueOf(view.getY());
        g0Var.f12564x = Double.valueOf(view.getWidth());
        g0Var.f12565y = Double.valueOf(view.getHeight());
        g0Var.F = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            g0Var.E = "visible";
        } else if (visibility == 4) {
            g0Var.E = "invisible";
        } else if (visibility == 8) {
            g0Var.E = "gone";
        }
        return g0Var;
    }

    @Override // io.sentry.c0
    public final t4 f(t4 t4Var, io.sentry.h0 h0Var) {
        if (t4Var.d()) {
            SentryAndroidOptions sentryAndroidOptions = this.f11530a;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().m(b5.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return t4Var;
            }
            if (!dr.a.C(h0Var)) {
                boolean zA = this.f11531d.a();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (!zA) {
                    WeakReference weakReference = (WeakReference) f0.f11568b.f11569a;
                    io.sentry.protocol.f0 f0Var = null;
                    Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
                    List<ComposeViewHierarchyExporter> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                    io.sentry.util.thread.a threadChecker = sentryAndroidOptions.getThreadChecker();
                    io.sentry.u0 logger = sentryAndroidOptions.getLogger();
                    if (activity == null) {
                        logger.m(b5.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                    } else {
                        Window window = activity.getWindow();
                        if (window == null) {
                            logger.m(b5.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                        } else {
                            View viewPeekDecorView = window.peekDecorView();
                            if (viewPeekDecorView == null) {
                                logger.m(b5.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                            } else {
                                try {
                                    if (threadChecker.c()) {
                                        ArrayList arrayList = new ArrayList(1);
                                        io.sentry.protocol.f0 f0Var2 = new io.sentry.protocol.f0("android_view_system", arrayList);
                                        io.sentry.protocol.g0 g0VarC = c(viewPeekDecorView);
                                        arrayList.add(g0VarC);
                                        a(viewPeekDecorView, g0VarC, viewHierarchyExporters);
                                        f0Var = f0Var2;
                                    } else {
                                        CountDownLatch countDownLatch = new CountDownLatch(1);
                                        AtomicReference atomicReference = new AtomicReference(null);
                                        activity.runOnUiThread(new f0.b(atomicReference, viewPeekDecorView, viewHierarchyExporters, countDownLatch, logger, 1));
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            f0Var = (io.sentry.protocol.f0) atomicReference.get();
                                        }
                                    }
                                } catch (Throwable th2) {
                                    logger.g(b5.ERROR, "Failed to process view hierarchy.", th2);
                                }
                            }
                        }
                    }
                    if (f0Var != null) {
                        h0Var.f12297e = new io.sentry.a(f0Var);
                    }
                }
            }
        }
        return t4Var;
    }

    @Override // io.sentry.c0
    public final io.sentry.protocol.a0 h(io.sentry.protocol.a0 a0Var, io.sentry.h0 h0Var) {
        return a0Var;
    }
}
