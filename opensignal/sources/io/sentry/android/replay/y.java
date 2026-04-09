package io.sentry.android.replay;

import android.graphics.Point;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class y implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a0 f12038a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f12039d;

    public y(a0 a0Var, View view) {
        this.f12038a = a0Var;
        this.f12039d = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a0 a0Var = this.f12038a;
        Point point = a0Var.D;
        WeakReference weakReference = (WeakReference) mq.o.A0(a0Var.B);
        View view = weakReference != null ? (View) weakReference.get() : null;
        View view2 = this.f12039d;
        if (!br.l.a(view2, view)) {
            se.b.P(view2, this);
            return true;
        }
        br.l.e(view2, "<this>");
        if (view2.getWidth() > 0 && view2.getHeight() > 0) {
            se.b.P(view2, this);
            if (view2.getWidth() != point.x && view2.getHeight() != point.y) {
                point.set(view2.getWidth(), view2.getHeight());
                a0Var.f11840g.Y(view2.getWidth(), view2.getHeight());
            }
        }
        return true;
    }
}
