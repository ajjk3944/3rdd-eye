package n;

import android.view.View;
import android.view.animation.Interpolator;
import e4.c1;
import e4.d1;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f29493c;

    /* renamed from: d, reason: collision with root package name */
    public d1 f29494d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f29495e;

    /* renamed from: b, reason: collision with root package name */
    public long f29492b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final i f29496f = new i(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f29491a = new ArrayList();

    public final void a() {
        if (this.f29495e) {
            ArrayList arrayList = this.f29491a;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                ((c1) obj).b();
            }
            this.f29495e = false;
        }
    }

    public final void b() {
        View view;
        if (this.f29495e) {
            return;
        }
        ArrayList arrayList = this.f29491a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            c1 c1Var = (c1) obj;
            long j = this.f29492b;
            if (j >= 0) {
                c1Var.c(j);
            }
            Interpolator interpolator = this.f29493c;
            if (interpolator != null && (view = (View) c1Var.f22313a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f29494d != null) {
                c1Var.d(this.f29496f);
            }
            View view2 = (View) c1Var.f22313a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f29495e = true;
    }
}
