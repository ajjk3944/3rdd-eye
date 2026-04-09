package com.google.android.material.appbar;

import D0.a;
import E.u;
import L0.I;
import L0.S;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.Toolbar;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import d4.j;
import d4.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import l4.C5287f;
import r4.C5522a;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: d0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f22478d0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: V, reason: collision with root package name */
    public Integer f22479V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f22480W;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f22481a0;

    /* renamed from: b0, reason: collision with root package name */
    public ImageView.ScaleType f22482b0;

    /* renamed from: c0, reason: collision with root package name */
    public Boolean f22483c0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(C5522a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayD = j.d(context2, attributeSet, K3.a.f3133u, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (typedArrayD.hasValue(2)) {
            setNavigationIconTint(typedArrayD.getColor(2, -1));
        }
        this.f22480W = typedArrayD.getBoolean(4, false);
        this.f22481a0 = typedArrayD.getBoolean(3, false);
        int i = typedArrayD.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f22478d0;
            if (i < scaleTypeArr.length) {
                this.f22482b0 = scaleTypeArr[i];
            }
        }
        if (typedArrayD.hasValue(0)) {
            this.f22483c0 = Boolean.valueOf(typedArrayD.getBoolean(0, false));
        }
        typedArrayD.recycle();
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : Z3.a.a(background);
        if (colorStateListValueOf != null) {
            C5287f c5287f = new C5287f();
            c5287f.k(colorStateListValueOf);
            c5287f.i(context2);
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            c5287f.j(I.d.i(this));
            setBackground(c5287f);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f22482b0;
    }

    public Integer getNavigationIconTint() {
        return this.f22479V;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void m(int i) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof f;
        if (z10) {
            ((f) menu).w();
        }
        super.m(i);
        if (z10) {
            ((f) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C5287f) {
            u.N(this, (C5287f) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i, int i10, int i11, int i12) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z10, i, i10, i11, i12);
        int i13 = 0;
        ImageView imageView2 = null;
        if (this.f22480W || this.f22481a0) {
            ArrayList arrayListB = k.b(this, getTitle());
            boolean zIsEmpty = arrayListB.isEmpty();
            k.a aVar = k.f37519a;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListB, aVar);
            ArrayList arrayListB2 = k.b(this, getSubtitle());
            TextView textView2 = arrayListB2.isEmpty() ? null : (TextView) Collections.max(arrayListB2, aVar);
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
                if (this.f22480W && textView != null) {
                    w(textView, pair);
                }
                if (this.f22481a0 && textView2 != null) {
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
            Boolean bool = this.f22483c0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f22482b0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof C5287f) {
            ((C5287f) background).j(f10);
        }
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f22483c0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f22483c0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f22482b0 != scaleType) {
            this.f22482b0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f22479V != null) {
            drawable = drawable.mutate();
            a.C0009a.g(drawable, this.f22479V.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f22479V = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f22481a0 != z10) {
            this.f22481a0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f22480W != z10) {
            this.f22480W = z10;
            requestLayout();
        }
    }

    public final void w(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i10 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i10 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i10, textView.getBottom());
    }
}
