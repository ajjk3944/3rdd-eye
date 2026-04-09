package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import br.l;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.f;
import io.sentry.android.replay.z;
import io.sentry.b5;
import io.sentry.q;
import io.sentry.x5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import lf.t1;
import mq.t;
import vc.e;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final x5 f11916a;

    /* renamed from: d, reason: collision with root package name */
    public final ReplayIntegration f11917d;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f11918g = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final io.sentry.util.a f11919r = new io.sentry.util.a();

    public b(x5 x5Var, ReplayIntegration replayIntegration) {
        this.f11916a = x5Var;
        this.f11917d = replayIntegration;
    }

    public final void a() throws InterruptedException {
        ArrayList arrayList = this.f11918g;
        q qVarA = this.f11919r.a();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    c(view);
                }
            }
            arrayList.clear();
            e.e(qVarA, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.f
    public final void b(View view, boolean z10) throws InterruptedException {
        l.e(view, "root");
        q qVarA = this.f11919r.a();
        ArrayList arrayList = this.f11918g;
        try {
            if (z10) {
                arrayList.add(new WeakReference(view));
                x5 x5Var = this.f11916a;
                Window windowT = t1.t(view);
                if (windowT == null) {
                    x5Var.getLogger().m(b5.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
                } else {
                    Window.Callback callback = windowT.getCallback();
                    if (!(callback instanceof a)) {
                        windowT.setCallback(new a(x5Var, this.f11917d, callback));
                    }
                }
            } else {
                c(view);
                t.e0(arrayList, new z(view, 1));
            }
            e.e(qVarA, null);
        } finally {
        }
    }

    public final void c(View view) throws IllegalAccessException, IllegalArgumentException {
        Window windowT = t1.t(view);
        if (windowT == null) {
            this.f11916a.getLogger().m(b5.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowT.getCallback();
        if (callback instanceof a) {
            windowT.setCallback(((a) callback).f11913a);
        }
    }
}
