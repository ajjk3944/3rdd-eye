package J3;

import G3.o;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.apm.insight.R;
import d3.AbstractC2266a;
import m0.C2650a;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public abstract class h extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final g f2093l = new g(0);

    /* renamed from: a, reason: collision with root package name */
    public i f2094a;

    /* renamed from: b, reason: collision with root package name */
    public final o f2095b;

    /* renamed from: c, reason: collision with root package name */
    public int f2096c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2097d;

    /* renamed from: e, reason: collision with root package name */
    public final float f2098e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2099f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2100g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f2101h;
    public PorterDuff.Mode i;

    /* renamed from: j, reason: collision with root package name */
    public Rect f2102j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2103k;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(O3.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC2266a.f19739R);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f2096c = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f2095b = o.c(context2, attributeSet, 0, 0).a();
        }
        this.f2097d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC2993B.k(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f2098e = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f2099f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f2100g = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f2093l);
        setFocusable(true);
        if (getBackground() == null) {
            int iT = com.bumptech.glide.e.t(getBackgroundOverlayColorAlpha(), com.bumptech.glide.e.m(R.attr.colorSurface, this), com.bumptech.glide.e.m(R.attr.colorOnSurface, this));
            o oVar = this.f2095b;
            if (oVar != null) {
                C2650a c2650a = i.f2104u;
                G3.j jVar = new G3.j(oVar);
                jVar.q(ColorStateList.valueOf(iT));
                gradientDrawable = jVar;
            } else {
                Resources resources = getResources();
                C2650a c2650a2 = i.f2104u;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iT);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f2101h;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(i iVar) {
        this.f2094a = iVar;
    }

    public float getActionTextColorAlpha() {
        return this.f2098e;
    }

    public int getAnimationMode() {
        return this.f2096c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f2097d;
    }

    public int getMaxInlineActionWidth() {
        return this.f2100g;
    }

    public int getMaxWidth() {
        return this.f2099f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        i iVar = this.f2094a;
        if (iVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = iVar.i.getRootWindowInsets()) != null) {
            iVar.f2124p = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            iVar.e();
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z6;
        super.onDetachedFromWindow();
        i iVar = this.f2094a;
        if (iVar != null) {
            c1.g gVarT = c1.g.t();
            f fVar = iVar.f2128t;
            synchronized (gVarT.f5896b) {
                z6 = true;
                if (!gVarT.v(fVar)) {
                    m mVar = (m) gVarT.f5899e;
                    if (!(mVar != null && mVar.f2134a.get() == fVar)) {
                        z6 = false;
                    }
                }
            }
            if (z6) {
                i.f2107x.post(new d(iVar, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        i iVar = this.f2094a;
        if (iVar == null || !iVar.f2126r) {
            return;
        }
        iVar.d();
        iVar.f2126r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        int i6 = this.f2099f;
        if (i6 <= 0 || getMeasuredWidth() <= i6) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), i3);
    }

    public void setAnimationMode(int i) {
        this.f2096c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f2101h != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.f2101h);
            drawable.setTintMode(this.i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f2101h = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.i);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.i = mode;
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
        if (this.f2103k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f2102j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        i iVar = this.f2094a;
        if (iVar != null) {
            C2650a c2650a = i.f2104u;
            iVar.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f2093l);
        super.setOnClickListener(onClickListener);
    }
}
