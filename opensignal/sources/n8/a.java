package n8;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.v;

/* loaded from: classes.dex */
public abstract class a implements DefaultLifecycleObserver {
    private boolean isStarted;

    public abstract Drawable getDrawable();

    public abstract View getView();

    public void onError(Drawable drawable) {
        updateDrawable(drawable);
    }

    public void onStart(Drawable drawable) {
        updateDrawable(drawable);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(v vVar) {
        this.isStarted = false;
        updateAnimation();
    }

    public void onSuccess(Drawable drawable) {
        updateDrawable(drawable);
    }

    public abstract void setDrawable(Drawable drawable);

    public final void updateAnimation() {
        Object drawable = getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }

    public final void updateDrawable(Drawable drawable) {
        Object drawable2 = getDrawable();
        Animatable animatable = drawable2 instanceof Animatable ? (Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        setDrawable(drawable);
        updateAnimation();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(v vVar) {
        this.isStarted = true;
        updateAnimation();
    }
}
