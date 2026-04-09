package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class aq extends Drawable implements Animatable {
    public static final ae r = new ae(5, Float.class, "growFraction");
    public final Context f;
    public final v60 g;
    public ObjectAnimator i;
    public ObjectAnimator j;
    public ArrayList l;
    public boolean m;
    public float n;
    public int p;
    public final float k = -1.0f;
    public final Paint o = new Paint();
    public final Rect q = new Rect();
    public s4 h = new s4();

    public aq(Context context, v60 v60Var) {
        this.f = context;
        this.g = v60Var;
        setAlpha(255);
    }

    public final float b() {
        v60 v60Var = this.g;
        if (v60Var.g == 0 && v60Var.h == 0) {
            return 1.0f;
        }
        return this.n;
    }

    public final float c() {
        float f = this.k;
        if (f > 0.0f) {
            return f;
        }
        boolean z = this instanceof oo;
        v60 v60Var = this.g;
        if (v60Var.c(z) && v60Var.m != 0) {
            s4 s4Var = this.h;
            ContentResolver contentResolver = this.f.getContentResolver();
            s4Var.getClass();
            float f2 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f2 > 0.0f) {
                float fUptimeMillis = (SystemClock.uptimeMillis() % r0) / ((int) ((((z ? v60Var.j : v60Var.k) * 1000.0f) / v60Var.m) * f2));
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    public final boolean d(boolean z, boolean z2, boolean z3) {
        s4 s4Var = this.h;
        ContentResolver contentResolver = this.f.getContentResolver();
        s4Var.getClass();
        return e(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean e(boolean z, boolean z2, boolean z3) {
        ObjectAnimator objectAnimator = this.i;
        int i = 0;
        ae aeVar = r;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, aeVar, 0.0f, 1.0f);
            this.i = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.i.setInterpolator(r4.b);
            ObjectAnimator objectAnimator2 = this.i;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.i = objectAnimator2;
            objectAnimator2.addListener(new zp(this, i));
        }
        int i2 = 1;
        if (this.j == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, aeVar, 1.0f, 0.0f);
            this.j = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.j.setInterpolator(r4.b);
            ObjectAnimator objectAnimator3 = this.j;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.j = objectAnimator3;
            objectAnimator3.addListener(new zp(this, i2));
        }
        if (isVisible() || z) {
            ObjectAnimator objectAnimator4 = z ? this.i : this.j;
            ObjectAnimator objectAnimator5 = z ? this.j : this.i;
            if (!z3) {
                if (objectAnimator5.isRunning()) {
                    boolean z4 = this.m;
                    this.m = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.m = z4;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z5 = this.m;
                    this.m = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.m = z5;
                }
                return super.setVisible(z, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z6 = !z || super.setVisible(z, false);
                v60 v60Var = this.g;
                if (!z ? v60Var.h != 0 : v60Var.g != 0) {
                    boolean z7 = this.m;
                    this.m = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.m = z7;
                    return z6;
                }
                if (z2 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z6;
                }
                objectAnimator4.resume();
                return z6;
            }
        }
        return false;
    }

    public final void f(fa faVar) {
        ArrayList arrayList = this.l;
        if (arrayList == null || !arrayList.contains(faVar)) {
            return;
        }
        this.l.remove(faVar);
        if (this.l.isEmpty()) {
            this.l = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.j;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.p = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.o.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return d(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        e(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        e(false, true, false);
    }
}
