package com.google.android.material.appbar;

import F1.W;
import O3.i;
import O3.j;
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
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.k;
import com.google.android.material.internal.l;
import f4.AbstractC5528h;
import f4.C5527g;
import i4.AbstractC6074a;
import x1.AbstractC8416a;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: s1, reason: collision with root package name */
    private static final int f36964s1 = i.f17153o;

    /* renamed from: t1, reason: collision with root package name */
    private static final ImageView.ScaleType[] f36965t1 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: n1, reason: collision with root package name */
    private Integer f36966n1;

    /* renamed from: o1, reason: collision with root package name */
    private boolean f36967o1;

    /* renamed from: p1, reason: collision with root package name */
    private boolean f36968p1;

    /* renamed from: q1, reason: collision with root package name */
    private ImageView.ScaleType f36969q1;

    /* renamed from: r1, reason: collision with root package name */
    private Boolean f36970r1;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, O3.a.f16961O);
    }

    private Pair T(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void U(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.d.f(background);
        if (colorStateListValueOf != null) {
            C5527g c5527g = new C5527g();
            c5527g.T(colorStateListValueOf);
            c5527g.J(context);
            c5527g.S(W.u(this));
            W.q0(this, c5527g);
        }
    }

    private void V(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void W() {
        if (this.f36967o1 || this.f36968p1) {
            TextView textViewE = l.e(this);
            TextView textViewC = l.c(this);
            if (textViewE == null && textViewC == null) {
                return;
            }
            Pair pairT = T(textViewE, textViewC);
            if (this.f36967o1 && textViewE != null) {
                V(textViewE, pairT);
            }
            if (!this.f36968p1 || textViewC == null) {
                return;
            }
            V(textViewC, pairT);
        }
    }

    private Drawable X(Drawable drawable) {
        if (drawable == null || this.f36966n1 == null) {
            return drawable;
        }
        Drawable drawableR = AbstractC8416a.r(drawable.mutate());
        AbstractC8416a.n(drawableR, this.f36966n1.intValue());
        return drawableR;
    }

    private void Y() {
        ImageView imageViewB = l.b(this);
        if (imageViewB != null) {
            Boolean bool = this.f36970r1;
            if (bool != null) {
                imageViewB.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f36969q1;
            if (scaleType != null) {
                imageViewB.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f36969q1;
    }

    public Integer getNavigationIconTint() {
        return this.f36966n1;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC5528h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        W();
        Y();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        AbstractC5528h.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f36970r1;
        if (bool == null || bool.booleanValue() != z10) {
            this.f36970r1 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f36969q1 != scaleType) {
            this.f36969q1 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(X(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f36966n1 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f36968p1 != z10) {
            this.f36968p1 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f36967o1 != z10) {
            this.f36967o1 = z10;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void y(int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof e;
        if (z10) {
            ((e) menu).e0();
        }
        super.y(i10);
        if (z10) {
            ((e) menu).d0();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f36964s1;
        super(AbstractC6074a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = k.i(context2, attributeSet, j.f17560z3, i10, i11, new int[0]);
        int i12 = j.f17174C3;
        if (typedArrayI.hasValue(i12)) {
            setNavigationIconTint(typedArrayI.getColor(i12, -1));
        }
        this.f36967o1 = typedArrayI.getBoolean(j.f17190E3, false);
        this.f36968p1 = typedArrayI.getBoolean(j.f17182D3, false);
        int i13 = typedArrayI.getInt(j.f17166B3, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f36965t1;
            if (i13 < scaleTypeArr.length) {
                this.f36969q1 = scaleTypeArr[i13];
            }
        }
        int i14 = j.f17158A3;
        if (typedArrayI.hasValue(i14)) {
            this.f36970r1 = Boolean.valueOf(typedArrayI.getBoolean(i14, false));
        }
        typedArrayI.recycle();
        U(context2);
    }
}
