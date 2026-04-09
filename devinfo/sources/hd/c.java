package hd;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.liuzh.deviceinfo.R;
import ed.j;
import ed.o;
import t6.i0;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class c extends FrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final b f25053i = new b(0);

    /* renamed from: a, reason: collision with root package name */
    public final o f25054a;

    /* renamed from: b, reason: collision with root package name */
    public int f25055b;

    /* renamed from: c, reason: collision with root package name */
    public final float f25056c;

    /* renamed from: d, reason: collision with root package name */
    public final float f25057d;

    /* renamed from: e, reason: collision with root package name */
    public final int f25058e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25059f;
    public ColorStateList g;

    /* renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f25060h;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(md.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ic.a.H);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f25055b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f25054a = o.c(context2, attributeSet, 0, 0).a();
        }
        this.f25056c = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(jm.a.j(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(m.h(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f25057d = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f25058e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f25059f = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f25053i);
        setFocusable(true);
        if (getBackground() == null) {
            int iO = i0.o(getBackgroundOverlayColorAlpha(), i0.i(R.attr.colorSurface, this), i0.i(R.attr.colorOnSurface, this));
            o oVar = this.f25054a;
            if (oVar != null) {
                int i4 = d.f25061a;
                j jVar = new j(oVar);
                jVar.o(ColorStateList.valueOf(iO));
                gradientDrawable = jVar;
            } else {
                Resources resources = getResources();
                int i10 = d.f25061a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iO);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.g;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f25057d;
    }

    public int getAnimationMode() {
        return this.f25055b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f25056c;
    }

    public int getMaxInlineActionWidth() {
        return this.f25059f;
    }

    public int getMaxWidth() {
        return this.f25058e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i10) {
        super.onMeasure(i4, i10);
        int i11 = this.f25058e;
        if (i11 <= 0 || getMeasuredWidth() <= i11) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
    }

    public void setAnimationMode(int i4) {
        this.f25055b = i4;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.g != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.g);
            drawable.setTintMode(this.f25060h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.f25060h);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f25060h = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintMode(mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f25053i);
        super.setOnClickListener(onClickListener);
    }

    private void setBaseTransientBottomBar(d dVar) {
    }
}
