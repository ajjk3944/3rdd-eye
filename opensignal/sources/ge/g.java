package ge;

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
import kg.r;

/* loaded from: classes.dex */
public abstract class g extends FrameLayout {
    public static final f H = new f();
    public final int B;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public Rect F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public h f9526a;

    /* renamed from: d, reason: collision with root package name */
    public final ee.l f9527d;

    /* renamed from: g, reason: collision with root package name */
    public int f9528g;

    /* renamed from: r, reason: collision with root package name */
    public final float f9529r;

    /* renamed from: x, reason: collision with root package name */
    public final float f9530x;

    /* renamed from: y, reason: collision with root package name */
    public final int f9531y;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        GradientDrawable gradientDrawable;
        super(le.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, ed.l.SnackbarLayout);
        if (typedArrayObtainStyledAttributes.hasValue(ed.l.SnackbarLayout_elevation)) {
            setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(ed.l.SnackbarLayout_elevation, 0));
        }
        this.f9528g = typedArrayObtainStyledAttributes.getInt(ed.l.SnackbarLayout_animationMode, 0);
        if (typedArrayObtainStyledAttributes.hasValue(ed.l.SnackbarLayout_shapeAppearance) || typedArrayObtainStyledAttributes.hasValue(ed.l.SnackbarLayout_shapeAppearanceOverlay)) {
            this.f9527d = ee.l.c(context2, attributeSet, 0, 0).b();
        }
        this.f9529r = typedArrayObtainStyledAttributes.getFloat(ed.l.SnackbarLayout_backgroundOverlayColorAlpha, 1.0f);
        setBackgroundTintList(xu.l.q(context2, typedArrayObtainStyledAttributes, ed.l.SnackbarLayout_backgroundTint));
        setBackgroundTintMode(xd.l.d(typedArrayObtainStyledAttributes.getInt(ed.l.SnackbarLayout_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN));
        this.f9530x = typedArrayObtainStyledAttributes.getFloat(ed.l.SnackbarLayout_actionTextColorAlpha, 1.0f);
        this.f9531y = typedArrayObtainStyledAttributes.getDimensionPixelSize(ed.l.SnackbarLayout_android_maxWidth, -1);
        this.B = typedArrayObtainStyledAttributes.getDimensionPixelSize(ed.l.SnackbarLayout_maxActionInlineWidth, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(H);
        setFocusable(true);
        if (getBackground() == null) {
            int iB0 = io.sentry.config.a.b0(io.sentry.config.a.V(this, ed.b.colorSurface), getBackgroundOverlayColorAlpha(), io.sentry.config.a.V(this, ed.b.colorOnSurface));
            ee.l lVar = this.f9527d;
            if (lVar != null) {
                q4.a aVar = h.f9532t;
                ee.i iVar = new ee.i(lVar);
                iVar.q(ColorStateList.valueOf(iB0));
                gradientDrawable = iVar;
            } else {
                Resources resources = getResources();
                q4.a aVar2 = h.f9532t;
                float dimension = resources.getDimension(ed.d.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(iB0);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(h hVar) {
        this.f9526a = hVar;
    }

    public float getActionTextColorAlpha() {
        return this.f9530x;
    }

    public int getAnimationMode() {
        return this.f9528g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f9529r;
    }

    public int getMaxInlineActionWidth() {
        return this.B;
    }

    public int getMaxWidth() {
        return this.f9531y;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        super.onAttachedToWindow();
        h hVar = this.f9526a;
        if (hVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = hVar.f9546i.getRootWindowInsets()) != null) {
            hVar.f9550o = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
            hVar.e();
        }
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z10;
        super.onDetachedFromWindow();
        h hVar = this.f9526a;
        if (hVar != null) {
            r rVarJ = r.j();
            e eVar = hVar.f9554s;
            synchronized (rVarJ.f14395a) {
                z10 = true;
                if (!rVarJ.o(eVar)) {
                    l lVar = (l) rVarJ.f14398r;
                    if (!(lVar != null && lVar.f9558a.get() == eVar)) {
                        z10 = false;
                    }
                }
            }
            if (z10) {
                h.f9535w.post(new d(hVar, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        h hVar = this.f9526a;
        if (hVar == null || !hVar.f9552q) {
            return;
        }
        hVar.d();
        hVar.f9552q = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f9531y;
        if (i12 <= 0 || getMeasuredWidth() <= i12) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
    }

    public void setAnimationMode(int i10) {
        this.f9528g = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.D != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.D);
            drawable.setTintMode(this.E);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.D = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            drawableMutate.setTintList(colorStateList);
            drawableMutate.setTintMode(this.E);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.E = mode;
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
        if (this.G || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.F = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        h hVar = this.f9526a;
        if (hVar != null) {
            q4.a aVar = h.f9532t;
            hVar.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : H);
        super.setOnClickListener(onClickListener);
    }
}
