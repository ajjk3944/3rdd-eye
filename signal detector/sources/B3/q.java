package B3;

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
import e3.AbstractC2303a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class q extends Drawable implements Animatable {

    /* renamed from: m, reason: collision with root package name */
    public static final h f634m = new h(4, Float.class, "growFraction");

    /* renamed from: a, reason: collision with root package name */
    public final Context f635a;

    /* renamed from: b, reason: collision with root package name */
    public final e f636b;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f638d;

    /* renamed from: e, reason: collision with root package name */
    public ObjectAnimator f639e;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f641g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f642h;
    public float i;

    /* renamed from: k, reason: collision with root package name */
    public int f644k;

    /* renamed from: f, reason: collision with root package name */
    public final float f640f = -1.0f;

    /* renamed from: j, reason: collision with root package name */
    public final Paint f643j = new Paint();

    /* renamed from: l, reason: collision with root package name */
    public final Rect f645l = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public C0137a f637c = new C0137a();

    public q(Context context, e eVar) {
        this.f635a = context;
        this.f636b = eVar;
        setAlpha(255);
    }

    public final float b() {
        e eVar = this.f636b;
        if (eVar.f565g == 0 && eVar.f566h == 0) {
            return 1.0f;
        }
        return this.i;
    }

    public final float c() {
        float f2 = this.f640f;
        if (f2 > 0.0f) {
            return f2;
        }
        boolean z6 = this instanceof o;
        e eVar = this.f636b;
        if (eVar.b(z6) && eVar.f570m != 0) {
            C0137a c0137a = this.f637c;
            ContentResolver contentResolver = this.f635a.getContentResolver();
            c0137a.getClass();
            float f5 = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
            if (f5 > 0.0f) {
                float fUptimeMillis = (SystemClock.uptimeMillis() % r0) / ((int) ((((z6 ? eVar.f567j : eVar.f568k) * 1000.0f) / eVar.f570m) * f5));
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    public final boolean d(boolean z6, boolean z7, boolean z8) {
        C0137a c0137a = this.f637c;
        ContentResolver contentResolver = this.f635a.getContentResolver();
        c0137a.getClass();
        return e(z6, z7, z8 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean e(boolean z6, boolean z7, boolean z8) {
        ObjectAnimator objectAnimator = this.f638d;
        int i = 0;
        h hVar = f634m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, hVar, 0.0f, 1.0f);
            this.f638d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f638d.setInterpolator(AbstractC2303a.f19928b);
            ObjectAnimator objectAnimator2 = this.f638d;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f638d = objectAnimator2;
            objectAnimator2.addListener(new p(this, i));
        }
        int i3 = 1;
        if (this.f639e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, hVar, 1.0f, 0.0f);
            this.f639e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f639e.setInterpolator(AbstractC2303a.f19928b);
            ObjectAnimator objectAnimator3 = this.f639e;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f639e = objectAnimator3;
            objectAnimator3.addListener(new p(this, i3));
        }
        if (isVisible() || z6) {
            ObjectAnimator objectAnimator4 = z6 ? this.f638d : this.f639e;
            ObjectAnimator objectAnimator5 = z6 ? this.f639e : this.f638d;
            if (!z8) {
                if (objectAnimator5.isRunning()) {
                    boolean z9 = this.f642h;
                    this.f642h = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.f642h = z9;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z10 = this.f642h;
                    this.f642h = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f642h = z10;
                }
                return super.setVisible(z6, false);
            }
            if (!objectAnimator4.isRunning()) {
                boolean z11 = !z6 || super.setVisible(z6, false);
                e eVar = this.f636b;
                if (!z6 ? eVar.f566h != 0 : eVar.f565g != 0) {
                    boolean z12 = this.f642h;
                    this.f642h = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f642h = z12;
                    return z11;
                }
                if (z7 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z11;
                }
                objectAnimator4.resume();
                return z11;
            }
        }
        return false;
    }

    public final void f(c cVar) {
        ArrayList arrayList = this.f641g;
        if (arrayList == null || !arrayList.contains(cVar)) {
            return;
        }
        this.f641g.remove(cVar);
        if (this.f641g.isEmpty()) {
            this.f641g = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f644k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        ObjectAnimator objectAnimator = this.f638d;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            return true;
        }
        ObjectAnimator objectAnimator2 = this.f639e;
        return objectAnimator2 != null && objectAnimator2.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f644k = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f643j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z6, boolean z7) {
        return d(z6, z7, true);
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
