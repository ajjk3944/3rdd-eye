package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import ba.m;
import ed.k;
import ed.l;
import ee.i;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: y0, reason: collision with root package name */
    public static final int f5456y0 = k.Widget_MaterialComponents_Toolbar;

    /* renamed from: z0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f5457z0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: t0, reason: collision with root package name */
    public Integer f5458t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f5459u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f5460v0;

    /* renamed from: w0, reason: collision with root package name */
    public ImageView.ScaleType f5461w0;

    /* renamed from: x0, reason: collision with root package name */
    public Boolean f5462x0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        int i10 = h.a.toolbarStyle;
        int i11 = f5456y0;
        super(le.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayD = xd.k.d(context2, attributeSet, l.MaterialToolbar, i10, i11, new int[0]);
        if (typedArrayD.hasValue(l.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayD.getColor(l.MaterialToolbar_navigationIconTint, -1));
        }
        this.f5459u0 = typedArrayD.getBoolean(l.MaterialToolbar_titleCentered, false);
        this.f5460v0 = typedArrayD.getBoolean(l.MaterialToolbar_subtitleCentered, false);
        int i12 = typedArrayD.getInt(l.MaterialToolbar_logoScaleType, -1);
        if (i12 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f5457z0;
            if (i12 < scaleTypeArr.length) {
                this.f5461w0 = scaleTypeArr[i12];
            }
        }
        if (typedArrayD.hasValue(l.MaterialToolbar_logoAdjustViewBounds)) {
            this.f5462x0 = Boolean.valueOf(typedArrayD.getBoolean(l.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayD.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : m.y(background);
        if (colorStateListValueOf != null) {
            i iVar = new i();
            iVar.q(colorStateListValueOf);
            iVar.m(context2);
            iVar.p(getElevation());
            setBackground(iVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f5461w0;
    }

    public Integer getNavigationIconTint() {
        return this.f5458t0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        se.b.V(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView2 = null;
        if (this.f5459u0 || this.f5460v0) {
            ArrayList arrayListC = xd.l.c(this, getTitle());
            boolean zIsEmpty = arrayListC.isEmpty();
            sm.i iVar = xd.l.f25297a;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListC, iVar);
            ArrayList arrayListC2 = xd.l.c(this, getSubtitle());
            TextView textView2 = arrayListC2.isEmpty() ? null : (TextView) Collections.max(arrayListC2, iVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f5459u0 && textView != null) {
                    w(textView, pair);
                }
                if (this.f5460v0 && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i14 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i14++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f5462x0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f5461w0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        se.b.T(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f5462x0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f5462x0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f5461w0 != scaleType) {
            this.f5461w0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f5458t0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f5458t0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f5458t0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f5460v0 != z10) {
            this.f5460v0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f5459u0 != z10) {
            this.f5459u0 = z10;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
