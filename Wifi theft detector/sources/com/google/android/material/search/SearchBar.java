package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes2.dex */
public class SearchBar extends Toolbar {

    /* renamed from: u0, reason: collision with root package name */
    public static final int f10807u0 = j4.k.Widget_Material3_SearchBar;
    public final TextView U;
    public final TextView V;
    public final FrameLayout W;

    /* renamed from: a0, reason: collision with root package name */
    public final int f10808a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f10809b0;

    /* renamed from: c0, reason: collision with root package name */
    public final ColorStateList f10810c0;

    /* renamed from: d0, reason: collision with root package name */
    public final boolean f10811d0;

    /* renamed from: e0, reason: collision with root package name */
    public final boolean f10812e0;

    /* renamed from: f0, reason: collision with root package name */
    public final b f10813f0;

    /* renamed from: g0, reason: collision with root package name */
    public final Drawable f10814g0;

    /* renamed from: h0, reason: collision with root package name */
    public final boolean f10815h0;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f10816i0;

    /* renamed from: j0, reason: collision with root package name */
    public View f10817j0;

    /* renamed from: k0, reason: collision with root package name */
    public Integer f10818k0;

    /* renamed from: l0, reason: collision with root package name */
    public Drawable f10819l0;

    /* renamed from: m0, reason: collision with root package name */
    public int f10820m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f10821n0;

    /* renamed from: o0, reason: collision with root package name */
    public MaterialShapeDrawable f10822o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f10823p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f10824q0;

    /* renamed from: r0, reason: collision with root package name */
    public ActionMenuView f10825r0;

    /* renamed from: s0, reason: collision with root package name */
    public ImageButton f10826s0;

    /* renamed from: t0, reason: collision with root package name */
    public final AppBarLayout.d f10827t0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        public String f10828c;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f10828c);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f10828c = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public class a extends AppBarLayout.d {
        public a() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.d
        public void a(float f10, int i10, float f11) {
            if (SearchBar.this.f10810c0 != null) {
                SearchBar.this.f10822o0.i0(ColorStateList.valueOf(u4.a.j(SearchBar.this.f10808a0, SearchBar.this.f10810c0.getDefaultColor(), f11)));
            }
        }
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }

    private Drawable f0(Drawable drawable) {
        int iD;
        if (!this.f10815h0 || drawable == null) {
            return drawable;
        }
        Integer num = this.f10818k0;
        if (num != null) {
            iD = num.intValue();
        } else {
            iD = u4.a.d(this, drawable == this.f10814g0 ? j4.b.colorOnSurfaceVariant : j4.b.colorOnSurface);
        }
        Drawable drawableR = k0.a.r(drawable.mutate());
        drawableR.setTint(iD);
        return drawableR;
    }

    @Nullable
    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton imageButtonD = com.google.android.material.internal.b0.d(this);
        if (imageButtonD == null) {
            return;
        }
        imageButtonD.setClickable(!z10);
        imageButtonD.setFocusable(!z10);
        Drawable background = imageButtonD.getBackground();
        if (background != null) {
            this.f10819l0 = background;
        }
        imageButtonD.setBackgroundDrawable(z10 ? null : this.f10819l0);
        j0();
    }

    public final void V() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists == null || this.f10810c0 == null) {
            return;
        }
        appBarLayoutParentIfExists.c(this.f10827t0);
    }

    public final int W(int i10, int i11) {
        return i10 == 0 ? i11 : i10;
    }

    public final ActionMenuView X() {
        if (this.f10825r0 == null) {
            this.f10825r0 = com.google.android.material.internal.b0.a(this);
        }
        return this.f10825r0;
    }

    public final ImageButton Y() {
        if (this.f10826s0 == null) {
            this.f10826s0 = com.google.android.material.internal.b0.d(this);
        }
        return this.f10826s0;
    }

    public final void Z(com.google.android.material.shape.a aVar, int i10, float f10, float f11, int i11) {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(aVar);
        this.f10822o0 = materialShapeDrawable;
        materialShapeDrawable.W(getContext());
        this.f10822o0.h0(f10);
        if (f11 >= 0.0f) {
            this.f10822o0.s0(f11, i11);
        }
        int iD = u4.a.d(this, c.a.colorControlHighlight);
        this.f10822o0.i0(ColorStateList.valueOf(i10));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD);
        MaterialShapeDrawable materialShapeDrawable2 = this.f10822o0;
        setBackground(new RippleDrawable(colorStateListValueOf, materialShapeDrawable2, materialShapeDrawable2));
    }

    public final void a0() {
        setNavigationIcon(getNavigationIcon() == null ? this.f10814g0 : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f10811d0 && this.f10817j0 == null && !(view instanceof ActionMenuView)) {
            this.f10817j0 = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public final void b0(int i10, String str, String str2) {
        if (i10 != -1) {
            TextViewCompat.m(this.U, i10);
            TextViewCompat.m(this.V, i10);
        }
        setText(str);
        setHint(str2);
        setTextCentered(this.f10823p0);
    }

    public final void c0(View view, int i10, int i11, int i12, int i13) {
        if (getLayoutDirection() == 1) {
            view.layout(getMeasuredWidth() - i12, i11, getMeasuredWidth() - i10, i13);
        } else {
            view.layout(i10, i11, i12, i13);
        }
    }

    public final void d0() {
        int measuredWidth = (getMeasuredWidth() / 2) - (this.W.getMeasuredWidth() / 2);
        int measuredWidth2 = this.W.getMeasuredWidth() + measuredWidth;
        int measuredHeight = (getMeasuredHeight() / 2) - (this.W.getMeasuredHeight() / 2);
        int measuredHeight2 = this.W.getMeasuredHeight() + measuredHeight;
        boolean z10 = getLayoutDirection() == 1;
        ActionMenuView actionMenuViewX = X();
        ImageButton imageButtonY = Y();
        int measuredWidth3 = (this.W.getMeasuredWidth() / 2) - (this.U.getMeasuredWidth() / 2);
        int measuredWidth4 = this.U.getMeasuredWidth() + measuredWidth3;
        int i10 = measuredWidth3 + measuredWidth;
        int i11 = measuredWidth4 + measuredWidth;
        ActionMenuView actionMenuView = z10 ? actionMenuViewX : imageButtonY;
        if (z10) {
            actionMenuViewX = imageButtonY;
        }
        int iMax = actionMenuView != null ? Math.max(actionMenuView.getRight() - i10, 0) : 0;
        int i12 = i10 + iMax;
        int i13 = i11 + iMax;
        int iMax2 = actionMenuViewX != null ? Math.max(i13 - actionMenuViewX.getLeft(), 0) : 0;
        int i14 = i12 - iMax2;
        int i15 = i13 - iMax2;
        int iMax3 = ((iMax - iMax2) + Math.max(Math.max(getPaddingLeft() - i14, getContentInsetLeft() - i14), 0)) - Math.max(Math.max(i15 - (getMeasuredWidth() - getPaddingRight()), i15 - (getMeasuredWidth() - getContentInsetRight())), 0);
        this.W.layout(measuredWidth + iMax3, measuredHeight, measuredWidth2 + iMax3, measuredHeight2);
    }

    public final void e0(View view) {
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i10 = measuredWidth2 + measuredWidth;
        int measuredHeight = view.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        c0(view, measuredWidth2, measuredHeight2, i10, measuredHeight2 + measuredHeight);
    }

    public final void g0(int i10, int i11) {
        View view = this.f10817j0;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    @Nullable
    public View getCenterView() {
        return this.f10817j0;
    }

    public float getCompatElevation() {
        MaterialShapeDrawable materialShapeDrawable = this.f10822o0;
        return materialShapeDrawable != null ? materialShapeDrawable.C() : getElevation();
    }

    public float getCornerSize() {
        return this.f10822o0.P();
    }

    @DimenRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultMarginVerticalResource() {
        return j4.d.m3_searchbar_margin_vertical;
    }

    @DrawableRes
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int getDefaultNavigationIconResource() {
        return j4.e.ic_search_black_24;
    }

    @Nullable
    public CharSequence getHint() {
        return this.U.getHint();
    }

    @Px
    public int getMaxWidth() {
        return this.f10824q0;
    }

    public int getMenuResId() {
        return this.f10820m0;
    }

    public TextView getPlaceholderTextView() {
        return this.V;
    }

    @ColorInt
    public int getStrokeColor() {
        return this.f10822o0.L().getDefaultColor();
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f10822o0.N();
    }

    @NonNull
    public CharSequence getText() {
        return this.U.getText();
    }

    public boolean getTextCentered() {
        return this.f10823p0;
    }

    @NonNull
    public TextView getTextView() {
        return this.U;
    }

    public final void h0() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.w(this.f10827t0);
        }
    }

    public final void i0() throws Resources.NotFoundException {
        if (this.f10812e0 && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(j4.d.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = W(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = W(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = W(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = W(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    public final void j0() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z10 = getLayoutDirection() == 1;
        ImageButton imageButtonD = com.google.android.material.internal.b0.d(this);
        int width = (imageButtonD == null || !imageButtonD.isClickable()) ? 0 : z10 ? getWidth() - imageButtonD.getLeft() : imageButtonD.getRight();
        ActionMenuView actionMenuViewA = com.google.android.material.internal.b0.a(this);
        int right = actionMenuViewA != null ? z10 ? actionMenuViewA.getRight() : getWidth() - actionMenuViewA.getLeft() : 0;
        float f10 = -(z10 ? right : width);
        if (!z10) {
            width = right;
        }
        setHandwritingBoundsOffsets(f10, 0.0f, -width, 0.0f);
    }

    public final void k0() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.f10821n0) {
                if (layoutParams.c() == 0) {
                    layoutParams.g(53);
                }
            } else if (layoutParams.c() == 53) {
                layoutParams.g(0);
            }
        }
    }

    public void l0() {
        this.f10813f0.b(this);
    }

    public final void m0(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", CampaignEx.JSON_KEY_TITLE) != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() throws Resources.NotFoundException {
        super.onAttachedToWindow();
        g5.h.f(this, this.f10822o0);
        i0();
        k0();
        if (this.f10809b0) {
            V();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f10817j0;
        if (view != null) {
            e0(view);
        }
        j0();
        if (this.U == null || !this.f10823p0) {
            return;
        }
        d0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12 = this.f10824q0;
        if (i12 >= 0 && i12 < View.MeasureSpec.getSize(i10)) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f10824q0, View.MeasureSpec.getMode(i10));
        }
        super.onMeasure(i10, i11);
        g0(i10, i11);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.c());
        setText(savedState.f10828c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f10828c = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(@Nullable View view) {
        View view2 = this.f10817j0;
        if (view2 != null) {
            removeView(view2);
            this.f10817j0 = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f10821n0 = z10;
        k0();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        MaterialShapeDrawable materialShapeDrawable = this.f10822o0;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.h0(f10);
        }
    }

    public void setHint(@Nullable CharSequence charSequence) {
        this.U.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z10) {
        this.f10809b0 = z10;
        if (z10) {
            V();
        } else {
            h0();
        }
    }

    public void setMaxWidth(@Px int i10) {
        if (this.f10824q0 != i10) {
            this.f10824q0 = i10;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(f0(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f10816i0) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        this.f10813f0.a(z10);
    }

    public void setPlaceholderText(String str) {
        this.V.setText(str);
    }

    public void setStrokeColor(@ColorInt int i10) {
        if (getStrokeColor() != i10) {
            this.f10822o0.u0(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(@Dimension float f10) {
        if (getStrokeWidth() != f10) {
            this.f10822o0.v0(f10);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(@Nullable CharSequence charSequence) {
        this.U.setText(charSequence);
        this.V.setText(charSequence);
    }

    public void setTextCentered(boolean z10) {
        this.f10823p0 = z10;
        TextView textView = this.U;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z10) {
            layoutParams.gravity = 1;
            this.U.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            this.U.setGravity(0);
        }
        this.U.setLayoutParams(layoutParams);
        this.V.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void x(int i10) {
        super.x(i10);
        this.f10820m0 = i10;
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* renamed from: h, reason: collision with root package name */
        public boolean f10829h;

        public ScrollingViewBehavior() {
            this.f10829h = false;
        }

        @Override // l4.e
        public boolean T() {
            return true;
        }

        public final void Y(AppBarLayout appBarLayout) throws Resources.NotFoundException {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) throws Resources.NotFoundException {
            boolean zL = super.l(coordinatorLayout, view, view2);
            if (!this.f10829h && (view2 instanceof AppBarLayout)) {
                this.f10829h = true;
                Y((AppBarLayout) view2);
            }
            return zL;
        }

        public ScrollingViewBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f10829h = false;
        }
    }

    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.materialSearchBarStyle);
    }

    public void setHint(@StringRes int i10) {
        this.U.setHint(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f10807u0;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f10820m0 = -1;
        this.f10827t0 = new a();
        Context context2 = getContext();
        m0(attributeSet);
        this.f10814g0 = d.a.b(context2, getDefaultNavigationIconResource());
        this.f10813f0 = new b();
        TypedArray typedArrayI = com.google.android.material.internal.a0.i(context2, attributeSet, j4.l.SearchBar, i10, i11, new int[0]);
        com.google.android.material.shape.a aVarM = com.google.android.material.shape.a.e(context2, attributeSet, i10, i11).m();
        int color = typedArrayI.getColor(j4.l.SearchBar_backgroundTint, 0);
        this.f10808a0 = color;
        this.f10810c0 = d5.c.a(context2, typedArrayI, j4.l.SearchBar_liftOnScrollColor);
        float dimension = typedArrayI.getDimension(j4.l.SearchBar_elevation, 0.0f);
        this.f10812e0 = typedArrayI.getBoolean(j4.l.SearchBar_defaultMarginsEnabled, true);
        this.f10821n0 = typedArrayI.getBoolean(j4.l.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z10 = typedArrayI.getBoolean(j4.l.SearchBar_hideNavigationIcon, false);
        this.f10816i0 = typedArrayI.getBoolean(j4.l.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.f10815h0 = typedArrayI.getBoolean(j4.l.SearchBar_tintNavigationIcon, true);
        int i12 = j4.l.SearchBar_navigationIconTint;
        if (typedArrayI.hasValue(i12)) {
            this.f10818k0 = Integer.valueOf(typedArrayI.getColor(i12, -1));
        }
        int resourceId = typedArrayI.getResourceId(j4.l.SearchBar_android_textAppearance, -1);
        String string = typedArrayI.getString(j4.l.SearchBar_android_text);
        String string2 = typedArrayI.getString(j4.l.SearchBar_android_hint);
        float dimension2 = typedArrayI.getDimension(j4.l.SearchBar_strokeWidth, -1.0f);
        int color2 = typedArrayI.getColor(j4.l.SearchBar_strokeColor, 0);
        this.f10823p0 = typedArrayI.getBoolean(j4.l.SearchBar_textCentered, false);
        this.f10809b0 = typedArrayI.getBoolean(j4.l.SearchBar_liftOnScroll, false);
        this.f10824q0 = typedArrayI.getDimensionPixelSize(j4.l.SearchBar_android_maxWidth, -1);
        typedArrayI.recycle();
        if (!z10) {
            a0();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(j4.h.mtrl_search_bar, this);
        this.f10811d0 = true;
        this.U = (TextView) findViewById(j4.f.open_search_bar_text_view);
        this.V = (TextView) findViewById(j4.f.open_search_bar_placeholder_text_view);
        this.W = (FrameLayout) findViewById(j4.f.open_search_bar_text_view_container);
        setElevation(dimension);
        b0(resourceId, string, string2);
        Z(aVarM, color, dimension, dimension2, color2);
    }

    public void setText(@StringRes int i10) {
        this.U.setText(i10);
        this.V.setText(i10);
    }
}
