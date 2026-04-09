package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.b5;
import io.sentry.x5;
import java.util.Collections;

/* loaded from: classes.dex */
public final class g extends i {

    /* renamed from: d, reason: collision with root package name */
    public final Window.Callback f11613d;

    /* renamed from: g, reason: collision with root package name */
    public final f f11614g;

    /* renamed from: r, reason: collision with root package name */
    public final GestureDetectorCompat f11615r;

    /* renamed from: x, reason: collision with root package name */
    public final x5 f11616x;

    /* renamed from: y, reason: collision with root package name */
    public final cg.e f11617y;

    public g(Window.Callback callback, Activity activity, f fVar, x5 x5Var) {
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(activity, fVar, new Handler(Looper.getMainLooper()));
        cg.e eVar = new cg.e();
        super(callback);
        this.f11613d = callback;
        this.f11614g = fVar;
        this.f11616x = x5Var;
        this.f11615r = gestureDetectorCompat;
        this.f11617y = eVar;
    }

    public final void a(MotionEvent motionEvent) {
        this.f11615r.f1231a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            f fVar = this.f11614g;
            View viewB = fVar.b("onUp");
            e eVar = fVar.B;
            io.sentry.internal.gestures.c cVar = eVar.f11604b;
            if (viewB == null || cVar == null) {
                return;
            }
            d dVar = eVar.f11603a;
            d dVar2 = d.Unknown;
            if (dVar == dVar2) {
                fVar.f11609g.getLogger().m(b5.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            float x10 = motionEvent.getX() - eVar.f11605c;
            float y10 = motionEvent.getY() - eVar.f11606d;
            fVar.a(cVar, eVar.f11603a, Collections.singletonMap("direction", Math.abs(x10) > Math.abs(y10) ? x10 > 0.0f ? "right" : "left" : y10 > 0.0f ? "down" : "up"), motionEvent);
            fVar.c(cVar, eVar.f11603a);
            eVar.f11604b = null;
            eVar.f11603a = dVar2;
            eVar.f11605c = 0.0f;
            eVar.f11606d = 0.0f;
        }
    }

    @Override // io.sentry.android.core.internal.gestures.i, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        x5 x5Var;
        if (motionEvent != null) {
            this.f11617y.getClass();
            try {
                a(MotionEvent.obtain(motionEvent));
            } finally {
                if (x5Var != null) {
                    try {
                    } finally {
                    }
                }
            }
        }
        return this.f11619a.dispatchTouchEvent(motionEvent);
    }
}
