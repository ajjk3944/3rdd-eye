package e3;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: ImageViewTarget.java */
/* renamed from: e3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4311e<Z> extends AbstractC4314h<ImageView, Z> {

    /* renamed from: d, reason: collision with root package name */
    public Animatable f37708d;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e3.InterfaceC4313g
    public final void c(Object obj) {
        i(obj);
        if (!(obj instanceof Animatable)) {
            this.f37708d = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f37708d = animatable;
        animatable.start();
    }

    @Override // e3.InterfaceC4313g
    public final void e(Drawable drawable) {
        i(null);
        this.f37708d = null;
        this.f37709b.setImageDrawable(drawable);
    }

    @Override // e3.InterfaceC4313g
    public final void f(Drawable drawable) {
        i(null);
        this.f37708d = null;
        this.f37709b.setImageDrawable(drawable);
    }

    @Override // e3.AbstractC4314h, e3.InterfaceC4313g
    public final void h(Drawable drawable) {
        super.h(drawable);
        Animatable animatable = this.f37708d;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        this.f37708d = null;
        this.f37709b.setImageDrawable(drawable);
    }

    public abstract void i(Z z10);

    @Override // a3.i
    public final void onStart() {
        Animatable animatable = this.f37708d;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // a3.i
    public final void onStop() {
        Animatable animatable = this.f37708d;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
