package n;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import u3.l0;
import u3.m0;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f17123c;

    /* renamed from: d, reason: collision with root package name */
    public m0 f17124d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17125e;

    /* renamed from: b, reason: collision with root package name */
    public long f17122b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f17126f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f17121a = new ArrayList();

    public final void a() {
        if (this.f17125e) {
            Iterator it = this.f17121a.iterator();
            while (it.hasNext()) {
                ((l0) it.next()).b();
            }
            this.f17125e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f17125e) {
            return;
        }
        Iterator it = this.f17121a.iterator();
        while (it.hasNext()) {
            l0 l0Var = (l0) it.next();
            long j = this.f17122b;
            if (j >= 0) {
                l0Var.c(j);
            }
            Interpolator interpolator = this.f17123c;
            if (interpolator != null && (view = (View) l0Var.f23192a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f17124d != null) {
                l0Var.d(this.f17126f);
            }
            View view2 = (View) l0Var.f23192a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f17125e = true;
    }
}
