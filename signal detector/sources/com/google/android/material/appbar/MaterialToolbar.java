package com.google.android.material.appbar;

import E.h;
import G3.j;
import a4.p;
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
import com.apm.insight.R;
import d3.AbstractC2266a;
import java.util.ArrayList;
import java.util.Collections;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: q0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f18069q0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: l0, reason: collision with root package name */
    public Integer f18070l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f18071m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f18072n0;

    /* renamed from: o0, reason: collision with root package name */
    public ImageView.ScaleType f18073o0;

    /* renamed from: p0, reason: collision with root package name */
    public Boolean f18074p0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(O3.a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayI = AbstractC2993B.i(context2, attributeSet, AbstractC2266a.f19729G, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayI.hasValue(2)) {
            setNavigationIconTint(typedArrayI.getColor(2, -1));
        }
        this.f18071m0 = typedArrayI.getBoolean(4, false);
        this.f18072n0 = typedArrayI.getBoolean(3, false);
        int i = typedArrayI.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f18069q0;
            if (i < scaleTypeArr.length) {
                this.f18073o0 = scaleTypeArr[i];
            }
        }
        if (typedArrayI.hasValue(0)) {
            this.f18074p0 = Boolean.valueOf(typedArrayI.getBoolean(0, false));
        }
        typedArrayI.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : R2.a.n(background);
        if (colorStateListValueOf != null) {
            j jVar = new j();
            jVar.q(colorStateListValueOf);
            jVar.m(context2);
            jVar.p(getElevation());
            setBackground(jVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f18073o0;
    }

    public Integer getNavigationIconTint() {
        return this.f18070l0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p.s(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z6, i, i3, i6, i7);
        h hVar = AbstractC2993B.f24037c;
        int i8 = 0;
        ImageView imageView2 = null;
        if (this.f18071m0 || this.f18072n0) {
            ArrayList arrayListH = AbstractC2993B.h(this, getTitle());
            TextView textView = arrayListH.isEmpty() ? null : (TextView) Collections.min(arrayListH, hVar);
            ArrayList arrayListH2 = AbstractC2993B.h(this, getSubtitle());
            TextView textView2 = arrayListH2.isEmpty() ? null : (TextView) Collections.max(arrayListH2, hVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i9 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i10 = 0; i10 < getChildCount(); i10++) {
                    View childAt = getChildAt(i10);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i9 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i9 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f18071m0 && textView != null) {
                    w(textView, pair);
                }
                if (this.f18072n0 && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i8 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i8);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i8++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f18074p0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f18073o0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        p.q(this, f2);
    }

    public void setLogoAdjustViewBounds(boolean z6) {
        Boolean bool = this.f18074p0;
        if (bool == null || bool.booleanValue() != z6) {
            this.f18074p0 = Boolean.valueOf(z6);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f18073o0 != scaleType) {
            this.f18073o0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f18070l0 != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.f18070l0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f18070l0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z6) {
        if (this.f18072n0 != z6) {
            this.f18072n0 = z6;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z6) {
        if (this.f18071m0 != z6) {
            this.f18071m0 = z6;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i3 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i3 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i3 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i3 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i3, textView.getBottom());
    }
}
