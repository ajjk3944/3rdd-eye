package s;

import android.content.Context;
import android.widget.EdgeEffect;

/* renamed from: s.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C7832E extends EdgeEffect {

    /* renamed from: a, reason: collision with root package name */
    private final float f60626a;

    /* renamed from: b, reason: collision with root package name */
    private float f60627b;

    public C7832E(Context context) {
        super(context);
        this.f60626a = Y0.a.a(context).d1(Y0.h.j(1));
    }

    public final void a(float f10) {
        float f11 = this.f60627b + f10;
        this.f60627b = f11;
        if (Math.abs(f11) > this.f60626a) {
            onRelease();
        }
    }

    @Override // android.widget.EdgeEffect
    public void onAbsorb(int i10) {
        this.f60627b = 0.0f;
        super.onAbsorb(i10);
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10, float f11) {
        this.f60627b = 0.0f;
        super.onPull(f10, f11);
    }

    @Override // android.widget.EdgeEffect
    public void onRelease() {
        this.f60627b = 0.0f;
        super.onRelease();
    }

    @Override // android.widget.EdgeEffect
    public void onPull(float f10) {
        this.f60627b = 0.0f;
        super.onPull(f10);
    }
}
