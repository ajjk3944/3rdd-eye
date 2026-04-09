package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import j4.b;
import j4.h;

/* loaded from: classes2.dex */
public class Snackbar extends BaseTransientBottomBar {
    public static final int[] H;
    public static final int[] I;
    public final AccessibilityManager F;
    public boolean G;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.r {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.r, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        int i10 = b.snackbarButtonStyle;
        H = new int[]{i10};
        I = new int[]{i10, b.snackbarTextViewStyle};
    }

    public Snackbar(Context context, ViewGroup viewGroup, View view, i5.a aVar) {
        super(context, viewGroup, view, aVar);
        this.F = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static /* synthetic */ void c0(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        snackbar.getClass();
        onClickListener.onClick(view);
        snackbar.x(1);
    }

    public static ViewGroup d0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    public static boolean h0(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(I);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    public static Snackbar i0(View view, CharSequence charSequence, int i10) {
        return j0(null, view, charSequence, i10);
    }

    public static Snackbar j0(Context context, View view, CharSequence charSequence, int i10) {
        ViewGroup viewGroupD0 = d0(view);
        if (viewGroupD0 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = viewGroupD0.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(h0(context) ? h.mtrl_layout_snackbar_include : h.design_layout_snackbar_include, viewGroupD0, false);
        Snackbar snackbar = new Snackbar(context, viewGroupD0, snackbarContentLayout, snackbarContentLayout);
        snackbar.m0(charSequence);
        snackbar.Q(i10);
        return snackbar;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int A() {
        int iA = super.A();
        if (iA == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            return this.F.getRecommendedTimeoutMillis(iA, (this.G ? 4 : 0) | 3);
        }
        if (this.G && this.F.isTouchExplorationEnabled()) {
            return -2;
        }
        return iA;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void U() {
        super.U();
    }

    public final Button e0() {
        return f0().getActionView();
    }

    public final SnackbarContentLayout f0() {
        return (SnackbarContentLayout) this.f11122i.getChildAt(0);
    }

    public final TextView g0() {
        return f0().getMessageView();
    }

    public Snackbar k0(CharSequence charSequence, final View.OnClickListener onClickListener) {
        Button buttonE0 = e0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            buttonE0.setVisibility(8);
            buttonE0.setOnClickListener(null);
            this.G = false;
            return this;
        }
        this.G = true;
        buttonE0.setVisibility(0);
        buttonE0.setText(charSequence);
        buttonE0.setOnClickListener(new View.OnClickListener() { // from class: i5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Snackbar.c0(this.f21600a, onClickListener, view);
            }
        });
        return this;
    }

    public Snackbar l0(int i10) {
        e0().setTextColor(i10);
        return this;
    }

    public Snackbar m0(CharSequence charSequence) {
        g0().setText(charSequence);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void w() {
        super.w();
    }
}
