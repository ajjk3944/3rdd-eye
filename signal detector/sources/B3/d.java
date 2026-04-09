package B3;

import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.apm.insight.R;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import d3.AbstractC2266a;
import java.util.ArrayList;
import java.util.Arrays;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public abstract class d extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    public final e f546a;

    /* renamed from: b, reason: collision with root package name */
    public int f547b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f548c;

    /* renamed from: d, reason: collision with root package name */
    public final int f549d;

    /* renamed from: e, reason: collision with root package name */
    public final int f550e;

    /* renamed from: f, reason: collision with root package name */
    public long f551f;

    /* renamed from: g, reason: collision with root package name */
    public C0137a f552g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f553h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f554j;

    /* renamed from: k, reason: collision with root package name */
    public final RunnableC0138b f555k;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC0138b f556l;

    /* renamed from: m, reason: collision with root package name */
    public final c f557m;

    /* renamed from: n, reason: collision with root package name */
    public final c f558n;

    public d(Context context, AttributeSet attributeSet, int i, int i3) {
        super(O3.a.a(context, attributeSet, i, R.style.Widget_MaterialComponents_ProgressIndicator), attributeSet, i);
        this.f551f = -1L;
        this.f553h = false;
        this.i = 4;
        this.f555k = new RunnableC0138b(this, 0);
        this.f556l = new RunnableC0138b(this, 1);
        this.f557m = new c(0, this);
        this.f558n = new c(1, this);
        Context context2 = getContext();
        this.f546a = a(context2, attributeSet);
        TypedArray typedArrayI = AbstractC2993B.i(context2, attributeSet, AbstractC2266a.f19750d, i, i3, new int[0]);
        this.f549d = typedArrayI.getInt(7, -1);
        this.f550e = Math.min(typedArrayI.getInt(5, -1), TTAdConstant.STYLE_SIZE_RADIO_1_1);
        typedArrayI.recycle();
        this.f552g = new C0137a();
        this.f548c = true;
    }

    private t getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f667n;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().f631n;
    }

    public abstract e a(Context context, AttributeSet attributeSet);

    public final void b() {
        if (getVisibility() != 0) {
            removeCallbacks(this.f555k);
            return;
        }
        RunnableC0138b runnableC0138b = this.f556l;
        removeCallbacks(runnableC0138b);
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f551f;
        long j6 = this.f550e;
        if (jUptimeMillis >= j6) {
            runnableC0138b.run();
        } else {
            postDelayed(runnableC0138b, j6 - jUptimeMillis);
        }
    }

    public final void c() {
        if (getProgressDrawable() == null || getIndeterminateDrawable() == null) {
            return;
        }
        getIndeterminateDrawable().f665C.t(this.f557m);
    }

    public void d(int i) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() != null) {
                getProgressDrawable().jumpToCurrentState();
                return;
            }
            return;
        }
        if (getProgressDrawable() != null) {
            this.f547b = i;
            this.f553h = true;
            if (getIndeterminateDrawable().isVisible()) {
                C0137a c0137a = this.f552g;
                ContentResolver contentResolver = getContext().getContentResolver();
                c0137a.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f665C.u();
                    return;
                }
            }
            this.f557m.a(getIndeterminateDrawable());
        }
    }

    public final void e() {
        RunnableC0138b runnableC0138b = this.f555k;
        int i = this.f549d;
        if (i <= 0) {
            runnableC0138b.run();
        } else {
            removeCallbacks(runnableC0138b);
            postDelayed(runnableC0138b, i);
        }
    }

    public final boolean f() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f546a.f566h;
    }

    public int[] getIndicatorColor() {
        return this.f546a.f563e;
    }

    public int getIndicatorTrackGapSize() {
        return this.f546a.i;
    }

    public int getShowAnimationBehavior() {
        return this.f546a.f565g;
    }

    public int getTrackColor() {
        return this.f546a.f564f;
    }

    public int getTrackCornerRadius() {
        return this.f546a.f560b;
    }

    public float getTrackCornerRadiusFraction() {
        return this.f546a.f561c;
    }

    public int getTrackThickness() {
        return this.f546a.f559a;
    }

    public int getWaveAmplitude() {
        return this.f546a.f569l;
    }

    public int getWaveSpeed() {
        return this.f546a.f570m;
    }

    public int getWavelengthDeterminate() {
        return this.f546a.f567j;
    }

    public int getWavelengthIndeterminate() {
        return this.f546a.f568k;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
        o progressDrawable = getProgressDrawable();
        c cVar = this.f558n;
        if (progressDrawable != null) {
            o progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f641g == null) {
                progressDrawable2.f641g = new ArrayList();
            }
            if (!progressDrawable2.f641g.contains(cVar)) {
                progressDrawable2.f641g.add(cVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            v indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f641g == null) {
                indeterminateDrawable.f641g = new ArrayList();
            }
            if (!indeterminateDrawable.f641g.contains(cVar)) {
                indeterminateDrawable.f641g.add(cVar);
            }
        }
        if (f()) {
            if (this.f550e > 0) {
                this.f551f = SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f556l);
        removeCallbacks(this.f555k);
        ((q) getCurrentDrawable()).d(false, false, false);
        v indeterminateDrawable = getIndeterminateDrawable();
        c cVar = this.f558n;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().f(cVar);
            getIndeterminateDrawable().f665C.x();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().f(cVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        getCurrentDrawingDelegate().g();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i3) {
        try {
            t currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i3) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z6 = i == 0;
        if (this.f548c) {
            ((q) getCurrentDrawable()).d(f(), false, z6);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.f548c) {
            ((q) getCurrentDrawable()).d(f(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(C0137a c0137a) {
        this.f552g = c0137a;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f637c = c0137a;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f637c = c0137a;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.f546a.f566h = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z6) {
        try {
            if (z6 == isIndeterminate()) {
                return;
            }
            q qVar = (q) getCurrentDrawable();
            if (qVar != null) {
                qVar.d(false, false, false);
            }
            super.setIndeterminate(z6);
            q qVar2 = (q) getCurrentDrawable();
            if (qVar2 != null) {
                qVar2.d(f(), false, false);
            }
            if ((qVar2 instanceof v) && f()) {
                ((v) qVar2).f665C.w();
            }
            this.f553h = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setIndeterminateAnimatorDurationScale(float f2) {
        e eVar = this.f546a;
        if (eVar.f571n != f2) {
            eVar.f571n = f2;
            getIndeterminateDrawable().f665C.q();
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable instanceof v) {
            ((q) drawable).d(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            if (this.f554j) {
                throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
            }
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{com.bumptech.glide.e.n(getContext(), R.attr.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.f546a.f563e = iArr;
        getIndeterminateDrawable().f665C.q();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        e eVar = this.f546a;
        if (eVar.i != i) {
            eVar.i = i;
            eVar.d();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        d(i);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (!(drawable instanceof o)) {
            if (this.f554j) {
                throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
            }
            super.setProgressDrawable(drawable);
        } else {
            o oVar = (o) drawable;
            oVar.d(false, false, false);
            super.setProgressDrawable(oVar);
            oVar.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.f546a.f565g = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        e eVar = this.f546a;
        if (eVar.f564f != i) {
            eVar.f564f = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        e eVar = this.f546a;
        if (eVar.f560b != i) {
            eVar.f560b = Math.min(i, eVar.f559a / 2);
            eVar.f562d = false;
            invalidate();
        }
    }

    public void setTrackCornerRadiusFraction(float f2) {
        e eVar = this.f546a;
        if (eVar.f561c != f2) {
            eVar.f561c = Math.min(f2, 0.5f);
            eVar.f562d = true;
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        e eVar = this.f546a;
        if (eVar.f559a != i) {
            eVar.f559a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.i = i;
    }

    public void setWaveAmplitude(int i) {
        e eVar = this.f546a;
        if (eVar.f569l != i) {
            eVar.f569l = Math.abs(i);
            requestLayout();
        }
    }

    public void setWaveSpeed(int i) {
        e eVar = this.f546a;
        eVar.f570m = i;
        o progressDrawable = getProgressDrawable();
        boolean z6 = eVar.f570m != 0;
        ValueAnimator valueAnimator = progressDrawable.f626H;
        if (z6 && !valueAnimator.isRunning()) {
            valueAnimator.start();
        } else {
            if (z6 || !valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.cancel();
        }
    }

    public void setWavelength(int i) {
        setWavelengthDeterminate(i);
        setWavelengthIndeterminate(i);
    }

    public void setWavelengthDeterminate(int i) {
        e eVar = this.f546a;
        if (eVar.f567j != i) {
            eVar.f567j = Math.abs(i);
            if (isIndeterminate()) {
                return;
            }
            requestLayout();
        }
    }

    public void setWavelengthIndeterminate(int i) {
        e eVar = this.f546a;
        if (eVar.f568k != i) {
            eVar.f568k = Math.abs(i);
            if (isIndeterminate()) {
                requestLayout();
            }
        }
    }

    @Override // android.widget.ProgressBar
    public v getIndeterminateDrawable() {
        return (v) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public o getProgressDrawable() {
        return (o) super.getProgressDrawable();
    }
}
