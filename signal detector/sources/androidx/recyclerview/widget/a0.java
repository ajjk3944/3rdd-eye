package androidx.recyclerview.widget;

import android.util.Log;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public int f5423a;

    /* renamed from: b, reason: collision with root package name */
    public int f5424b;

    /* renamed from: c, reason: collision with root package name */
    public int f5425c;

    /* renamed from: d, reason: collision with root package name */
    public int f5426d;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f5427e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5428f;

    /* renamed from: g, reason: collision with root package name */
    public int f5429g;

    public final void a(RecyclerView recyclerView) {
        int i = this.f5426d;
        if (i >= 0) {
            this.f5426d = -1;
            recyclerView.O(i);
            this.f5428f = false;
            return;
        }
        if (!this.f5428f) {
            this.f5429g = 0;
            return;
        }
        Interpolator interpolator = this.f5427e;
        if (interpolator != null && this.f5425c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i3 = this.f5425c;
        if (i3 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f5369r0.b(this.f5423a, this.f5424b, i3, interpolator);
        int i6 = this.f5429g + 1;
        this.f5429g = i6;
        if (i6 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f5428f = false;
    }

    public final void b(int i, int i3, int i6, Interpolator interpolator) {
        this.f5423a = i;
        this.f5424b = i3;
        this.f5425c = i6;
        this.f5427e = interpolator;
        this.f5428f = true;
    }
}
