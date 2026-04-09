package k6;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rc.a f27969a;

    public b(rc.a aVar) {
        this.f27969a = aVar;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f27969a.f32902b.f32914o;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        rc.c cVar = this.f27969a.f32902b;
        ColorStateList colorStateList = cVar.f32914o;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(cVar.f32918s, colorStateList.getDefaultColor()));
        }
    }
}
