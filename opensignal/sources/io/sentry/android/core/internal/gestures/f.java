package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.u0;
import io.sentry.b1;
import io.sentry.b5;
import io.sentry.h0;
import io.sentry.k1;
import io.sentry.o6;
import io.sentry.protocol.c0;
import io.sentry.s6;
import io.sentry.t6;
import io.sentry.v3;
import ir.f0;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class f implements GestureDetector.OnGestureListener {
    public final e B;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f11607a;

    /* renamed from: d, reason: collision with root package name */
    public final b1 f11608d;

    /* renamed from: g, reason: collision with root package name */
    public final SentryAndroidOptions f11609g;

    /* renamed from: r, reason: collision with root package name */
    public io.sentry.internal.gestures.c f11610r = null;

    /* renamed from: x, reason: collision with root package name */
    public k1 f11611x = null;

    /* renamed from: y, reason: collision with root package name */
    public d f11612y;

    public f(Activity activity, v3 v3Var, SentryAndroidOptions sentryAndroidOptions) {
        d dVar = d.Unknown;
        this.f11612y = dVar;
        e eVar = new e();
        eVar.f11603a = dVar;
        eVar.f11605c = 0.0f;
        eVar.f11606d = 0.0f;
        this.B = eVar;
        this.f11607a = new WeakReference(activity);
        this.f11608d = v3Var;
        this.f11609g = sentryAndroidOptions;
    }

    public final void a(io.sentry.internal.gestures.c cVar, d dVar, Map map, MotionEvent motionEvent) {
        if (this.f11609g.isEnableUserInteractionBreadcrumbs()) {
            int i10 = c.f11602a[dVar.ordinal()];
            String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? "unknown" : "swipe" : "scroll" : "click";
            h0 h0Var = new h0();
            h0Var.c(motionEvent, "android:motionEvent");
            h0Var.c(cVar.f12355a.get(), "android:view");
            String str2 = cVar.f12357c;
            String str3 = cVar.f12356b;
            String str4 = cVar.f12358d;
            io.sentry.e eVar = new io.sentry.e();
            eVar.f12204x = "user";
            eVar.B = "ui.".concat(str);
            if (str2 != null) {
                eVar.b(str2, "view.id");
            }
            if (str3 != null) {
                eVar.b(str3, "view.class");
            }
            if (str4 != null) {
                eVar.b(str4, "view.tag");
            }
            for (Map.Entry entry : map.entrySet()) {
                eVar.f12205y.put((String) entry.getKey(), entry.getValue());
            }
            eVar.E = b5.INFO;
            this.f11608d.g(eVar, h0Var);
        }
    }

    public final View b(String str) {
        Activity activity = (Activity) this.f11607a.get();
        SentryAndroidOptions sentryAndroidOptions = this.f11609g;
        if (activity == null) {
            sentryAndroidOptions.getLogger().m(b5.DEBUG, h0.b.o("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().m(b5.DEBUG, h0.b.o("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView != null) {
            return decorView;
        }
        sentryAndroidOptions.getLogger().m(b5.DEBUG, h0.b.o("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void c(io.sentry.internal.gestures.c cVar, d dVar) {
        boolean z10 = dVar == d.Click || !(dVar == this.f11612y && cVar.equals(this.f11610r));
        SentryAndroidOptions sentryAndroidOptions = this.f11609g;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        b1 b1Var = this.f11608d;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z10) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    b1Var.r(new u0(4));
                }
                this.f11610r = cVar;
                this.f11612y = dVar;
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f11607a.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().m(b5.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str = cVar.f12357c;
        if (str == null) {
            str = cVar.f12358d;
            f0.T(str, "UiElement.tag can't be null");
        }
        k1 k1Var = this.f11611x;
        if (k1Var != null) {
            if (!z10 && !k1Var.d()) {
                sentryAndroidOptions.getLogger().m(b5.DEBUG, h0.b.o("The view with id: ", str, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.f11611x.r();
                    return;
                }
                return;
            }
            d(o6.OK);
        }
        String str2 = activity.getClass().getSimpleName() + "." + str;
        int i10 = c.f11602a[dVar.ordinal()];
        String strConcat = "ui.action.".concat(i10 != 1 ? i10 != 2 ? i10 != 3 ? "unknown" : "swipe" : "scroll" : "click");
        t6 t6Var = new t6();
        t6Var.f12742f = true;
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        t6Var.f12744h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        t6Var.f12743g = sentryAndroidOptions.getIdleTimeout();
        t6Var.f7148b = true;
        t6Var.f7150d = "auto.ui.gesture_listener." + cVar.f12359e;
        k1 k1VarQ = b1Var.q(new s6(str2, c0.COMPONENT, strConcat, null), t6Var);
        b1Var.r(new androidx.media3.exoplayer.trackselection.h(this, 22, k1VarQ));
        this.f11611x = k1VarQ;
        this.f11610r = cVar;
        this.f11612y = dVar;
    }

    public final void d(o6 o6Var) {
        k1 k1Var = this.f11611x;
        if (k1Var != null) {
            if (k1Var.u() == null) {
                this.f11611x.g(o6Var);
            } else {
                this.f11611x.k();
            }
        }
        this.f11608d.r(new bf.a(28, this));
        this.f11611x = null;
        if (this.f11610r != null) {
            this.f11610r = null;
        }
        this.f11612y = d.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        e eVar = this.B;
        eVar.f11604b = null;
        eVar.f11603a = d.Unknown;
        eVar.f11605c = 0.0f;
        eVar.f11606d = 0.0f;
        eVar.f11605c = motionEvent.getX();
        eVar.f11606d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        this.B.f11603a = d.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        View viewB = b("onScroll");
        if (viewB != null && motionEvent != null) {
            e eVar = this.B;
            if (eVar.f11603a == d.Unknown) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                io.sentry.internal.gestures.b bVar = io.sentry.internal.gestures.b.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.f11609g;
                io.sentry.internal.gestures.c cVarA = h.a(sentryAndroidOptions, viewB, x10, y10, bVar);
                if (cVarA == null) {
                    sentryAndroidOptions.getLogger().m(b5.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    eVar.f11603a = d.Scroll;
                    return false;
                }
                io.sentry.u0 logger = sentryAndroidOptions.getLogger();
                b5 b5Var = b5.DEBUG;
                String str = cVarA.f12357c;
                if (str == null) {
                    str = cVarA.f12358d;
                    f0.T(str, "UiElement.tag can't be null");
                }
                logger.m(b5Var, "Scroll target found: ".concat(str), new Object[0]);
                eVar.f11604b = cVarA;
                eVar.f11603a = d.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        View viewB = b("onSingleTapUp");
        if (viewB != null && motionEvent != null) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            io.sentry.internal.gestures.b bVar = io.sentry.internal.gestures.b.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.f11609g;
            io.sentry.internal.gestures.c cVarA = h.a(sentryAndroidOptions, viewB, x10, y10, bVar);
            if (cVarA == null) {
                sentryAndroidOptions.getLogger().m(b5.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            d dVar = d.Click;
            a(cVarA, dVar, Collections.EMPTY_MAP, motionEvent);
            c(cVarA, dVar);
        }
        return false;
    }
}
