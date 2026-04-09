package com.google.android.material.appbar;

import a4.l;
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
import com.liuzh.deviceinfo.R;
import ed.j;
import java.util.ArrayList;
import java.util.Collections;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: c0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f20313c0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer U;
    public boolean V;
    public boolean W;

    /* renamed from: a0, reason: collision with root package name */
    public ImageView.ScaleType f20314a0;

    /* renamed from: b0, reason: collision with root package name */
    public Boolean f20315b0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(md.a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayG = m.g(context2, attributeSet, ic.a.B, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayG.hasValue(2)) {
            setNavigationIconTint(typedArrayG.getColor(2, -1));
        }
        this.V = typedArrayG.getBoolean(4, false);
        this.W = typedArrayG.getBoolean(3, false);
        int i4 = typedArrayG.getInt(1, -1);
        if (i4 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f20313c0;
            if (i4 < scaleTypeArr.length) {
                this.f20314a0 = scaleTypeArr[i4];
            }
        }
        if (typedArrayG.hasValue(0)) {
            this.f20315b0 = Boolean.valueOf(typedArrayG.getBoolean(0, false));
        }
        typedArrayG.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : l.a(background);
        if (colorStateListValueOf != null) {
            j jVar = new j();
            jVar.o(colorStateListValueOf);
            jVar.l(context2);
            jVar.n(getElevation());
            setBackground(jVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f20314a0;
    }

    public Integer getNavigationIconTint() {
        return this.U;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof j) {
            ii.a.E(this, (j) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z3, i4, i10, i11, i12);
        androidx.recyclerview.widget.m mVar = m.f38236c;
        int i13 = 0;
        ImageView imageView2 = null;
        if (this.V || this.W) {
            ArrayList arrayListF = m.f(this, getTitle());
            TextView textView = arrayListF.isEmpty() ? null : (TextView) Collections.min(arrayListF, mVar);
            ArrayList arrayListF2 = m.f(this, getSubtitle());
            TextView textView2 = arrayListF2.isEmpty() ? null : (TextView) Collections.max(arrayListF2, mVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.V && textView != null) {
                    w(textView, pair);
                }
                if (this.W && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i13 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i13);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i13++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f20315b0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f20314a0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof j) {
            ((j) background).n(f10);
        }
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.f20315b0;
        if (bool == null || bool.booleanValue() != z3) {
            this.f20315b0 = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f20314a0 != scaleType) {
            this.f20314a0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.U != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.U.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i4) {
        this.U = Integer.valueOf(i4);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.W != z3) {
            this.W = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.V != z3) {
            this.V = z3;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i4 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i4;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i4, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i4 += iMax;
            i10 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i10 - i4, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i4, textView.getTop(), i10, textView.getBottom());
    }
}
