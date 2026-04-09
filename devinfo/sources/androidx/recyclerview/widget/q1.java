package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public int f1486a;

    /* renamed from: b, reason: collision with root package name */
    public int f1487b;

    /* renamed from: c, reason: collision with root package name */
    public int f1488c;

    /* renamed from: d, reason: collision with root package name */
    public int f1489d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f1490e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1491f;
    public int g;

    public final void a(RecyclerView recyclerView) {
        int i4 = this.f1489d;
        if (i4 >= 0) {
            this.f1489d = -1;
            recyclerView.U(i4);
            this.f1491f = false;
            return;
        }
        if (!this.f1491f) {
            this.g = 0;
            return;
        }
        Interpolator interpolator = this.f1490e;
        if (interpolator != null && this.f1488c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i10 = this.f1488c;
        if (i10 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f1228e0.c(this.f1486a, this.f1487b, i10, interpolator);
        int i11 = this.g + 1;
        this.g = i11;
        if (i11 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f1491f = false;
    }

    public final void b(int i4, int i10, int i11, Interpolator interpolator) {
        this.f1486a = i4;
        this.f1487b = i10;
        this.f1488c = i11;
        this.f1490e = interpolator;
        this.f1491f = true;
    }
}
