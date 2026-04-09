package h7;

import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public int f10079a;

    /* renamed from: b, reason: collision with root package name */
    public int f10080b;

    /* renamed from: c, reason: collision with root package name */
    public int f10081c;

    /* renamed from: d, reason: collision with root package name */
    public int f10082d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f10083e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10084f;

    /* renamed from: g, reason: collision with root package name */
    public int f10085g;

    public final void a(RecyclerView recyclerView) {
        int i10 = this.f10082d;
        if (i10 >= 0) {
            this.f10082d = -1;
            recyclerView.S(i10);
            this.f10084f = false;
            return;
        }
        if (!this.f10084f) {
            this.f10085g = 0;
            return;
        }
        Interpolator interpolator = this.f10083e;
        if (interpolator != null && this.f10081c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i11 = this.f10081c;
        if (i11 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.A0.c(this.f10079a, this.f10080b, i11, interpolator);
        int i12 = this.f10085g + 1;
        this.f10085g = i12;
        if (i12 > 10) {
            io.sentry.android.core.e0.d("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f10084f = false;
    }
}
