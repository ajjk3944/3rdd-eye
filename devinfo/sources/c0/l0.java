package c0;

import android.content.Context;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class l0 extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    public final float f2460a;

    /* renamed from: b, reason: collision with root package name */
    public float f2461b;

    public l0(Context context) {
        super(context);
        this.f2460a = com.bumptech.glide.f.a(context).f21954a * 1;
    }

    @Override // android.widget.EdgeEffect
    public final void onAbsorb(int i4) {
        this.f2461b = 0.0f;
        super.onAbsorb(i4);
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10, float f11) {
        this.f2461b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public final void onRelease() {
        this.f2461b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public final void onPull(float f10) {
        this.f2461b = 0.0f;
        super.onPull(f10);
    }
}
