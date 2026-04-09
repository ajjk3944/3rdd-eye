package i8;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import t8.m;
import z7.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class a implements y {

    /* renamed from: a, reason: collision with root package name */
    public final AnimatedImageDrawable f25932a;

    public a(AnimatedImageDrawable animatedImageDrawable) {
        this.f25932a = animatedImageDrawable;
    }

    @Override // z7.y
    public final void a() {
        this.f25932a.stop();
        this.f25932a.clearAnimationCallbacks();
    }

    @Override // z7.y
    public final Class b() {
        return Drawable.class;
    }

    @Override // z7.y
    public final Object get() {
        return this.f25932a;
    }

    @Override // z7.y
    public final int getSize() {
        return m.d(Bitmap.Config.ARGB_8888) * this.f25932a.getIntrinsicHeight() * this.f25932a.getIntrinsicWidth() * 2;
    }
}
