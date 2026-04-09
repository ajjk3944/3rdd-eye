package A3;

import A2.C0117e;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.apm.insight.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import d3.AbstractC2266a;
import j3.C2562b;
import o.a1;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public abstract class y extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final l f504a;

    /* renamed from: b, reason: collision with root package name */
    public final C2562b f505b;

    /* renamed from: c, reason: collision with root package name */
    public final s f506c;

    /* renamed from: d, reason: collision with root package name */
    public m.h f507d;

    /* renamed from: e, reason: collision with root package name */
    public v f508e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    public y(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        ?? r10;
        super(O3.a.a(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        s sVar = new s();
        sVar.f495b = false;
        this.f506c = sVar;
        Context context2 = getContext();
        a1 a1VarJ = AbstractC2993B.j(context2, attributeSet, AbstractC2266a.f19731I, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 17, 15);
        l lVar = new l(context2, getClass(), getMaxItemCount());
        this.f504a = lVar;
        C2562b c2562b = new C2562b(context2);
        this.f505b = c2562b;
        c2562b.setMinimumHeight(getSuggestedMinimumHeight());
        c2562b.setCollapsedMaxItemCount(getCollapsedMaxItemCount());
        sVar.f494a = c2562b;
        sVar.f496c = 1;
        c2562b.setPresenter(sVar);
        lVar.b(sVar, lVar.f22076a);
        sVar.d(getContext(), lVar);
        TypedArray typedArray = (TypedArray) a1VarJ.f22480c;
        if (typedArray.hasValue(11)) {
            c2562b.setIconTintList(a1VarJ.c(11));
        } else {
            c2562b.setIconTintList(c2562b.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(10, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(17)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(17, 0));
        }
        if (typedArray.hasValue(15)) {
            setItemTextAppearanceActive(typedArray.getResourceId(15, 0));
        }
        if (typedArray.hasValue(4)) {
            setHorizontalItemTextAppearanceInactive(typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(3)) {
            setHorizontalItemTextAppearanceActive(typedArray.getResourceId(3, 0));
        }
        setItemTextAppearanceActiveBoldEnabled(typedArray.getBoolean(16, true));
        if (typedArray.hasValue(18)) {
            setItemTextColor(a1VarJ.c(18));
        }
        Drawable background = getBackground();
        ColorStateList colorStateListN = R2.a.n(background);
        if (background == null || colorStateListN != null) {
            G3.j jVar = new G3.j(G3.o.c(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView).a());
            if (colorStateListN != null) {
                jVar.q(colorStateListN);
            }
            jVar.m(context2);
            setBackground(jVar);
        }
        if (typedArray.hasValue(13)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(13, 0));
        }
        if (typedArray.hasValue(12)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(12, 0));
        }
        if (typedArray.hasValue(0)) {
            setActiveIndicatorLabelPadding(typedArray.getDimensionPixelSize(0, 0));
        }
        if (typedArray.hasValue(5)) {
            setIconLabelHorizontalSpacing(typedArray.getDimensionPixelSize(5, 0));
        }
        if (typedArray.hasValue(2)) {
            setElevation(typedArray.getDimensionPixelSize(2, 0));
        }
        getBackground().mutate().setTintList(com.bumptech.glide.c.o(context2, a1VarJ, 1));
        setLabelVisibilityMode(typedArray.getInteger(21, -1));
        setItemIconGravity(typedArray.getInteger(9, 0));
        setItemGravity(typedArray.getInteger(8, 49));
        int resourceId = typedArray.getResourceId(7, 0);
        if (resourceId != 0) {
            c2562b.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(com.bumptech.glide.c.o(context2, a1VarJ, 14));
        }
        setMeasureBottomPaddingFromLabelBaseline(typedArray.getBoolean(22, true));
        setLabelFontScalingEnabled(typedArray.getBoolean(19, false));
        setLabelMaxLines(typedArray.getInteger(20, 1));
        int resourceId2 = typedArray.getResourceId(6, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, AbstractC2266a.f19730H);
            int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
            setItemActiveIndicatorWidth(dimensionPixelSize);
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(10, 0);
            setItemActiveIndicatorMarginHorizontal(dimensionPixelOffset);
            String string = typedArrayObtainStyledAttributes.getString(9);
            int dimensionPixelSize2 = -2;
            if (string != null) {
                if (String.valueOf(-1).equals(string)) {
                    dimensionPixelSize2 = -1;
                } else if (!String.valueOf(-2).equals(string)) {
                    dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, -2);
                }
            }
            setItemActiveIndicatorExpandedWidth(dimensionPixelSize2);
            setItemActiveIndicatorExpandedHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize));
            setItemActiveIndicatorExpandedMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(8, dimensionPixelOffset));
            int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.m3_navigation_item_leading_trailing_space);
            int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, dimensionPixelSize3);
            int dimensionPixelOffset3 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, dimensionPixelSize3);
            int i = getLayoutDirection() == 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset4 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0);
            dimensionPixelOffset2 = getLayoutDirection() != 1 ? dimensionPixelOffset3 : dimensionPixelOffset2;
            int dimensionPixelOffset5 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            Rect rect = c2562b.f489m0;
            rect.left = i;
            rect.top = dimensionPixelOffset4;
            rect.right = dimensionPixelOffset2;
            rect.bottom = dimensionPixelOffset5;
            n[] nVarArr = c2562b.f477g;
            if (nVarArr != null) {
                for (n nVar : nVarArr) {
                    if (nVar instanceof k) {
                        ((k) nVar).setActiveIndicatorExpandedPadding(rect);
                    }
                }
            }
            setItemActiveIndicatorColor(com.bumptech.glide.c.n(context2, typedArrayObtainStyledAttributes, 2));
            r10 = 0;
            setItemActiveIndicatorShapeAppearance(G3.o.a(context2, typedArrayObtainStyledAttributes.getResourceId(11, 0), 0).a());
            typedArrayObtainStyledAttributes.recycle();
        } else {
            r10 = 0;
        }
        if (typedArray.hasValue(23)) {
            int resourceId3 = typedArray.getResourceId(23, r10);
            s sVar2 = this.f506c;
            sVar2.f495b = true;
            getMenuInflater().inflate(resourceId3, this.f504a);
            sVar2.f495b = r10;
            sVar2.b(true);
        }
        a1VarJ.j();
        addView(this.f505b);
        this.f504a.f22080e = new C0117e(1, (BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.f507d == null) {
            this.f507d = new m.h(getContext());
        }
        return this.f507d;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z6) {
        this.f505b.setMeasurePaddingFromLabelBaseline(z6);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f505b.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f505b.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f505b.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f505b.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f505b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f505b.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f505b.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f505b.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f505b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f505b.getItemActiveIndicatorMarginHorizontal();
    }

    public G3.o getItemActiveIndicatorShapeAppearance() {
        return this.f505b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f505b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f505b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f505b.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f505b.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f505b.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f505b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f505b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f505b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f505b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f505b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f505b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f505b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f505b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f505b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f504a;
    }

    public n.y getMenuView() {
        return this.f505b;
    }

    public ViewGroup getMenuViewGroup() {
        return this.f505b;
    }

    public s getPresenter() {
        return this.f506c;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f505b.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f505b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a4.p.s(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        super.onRestoreInstanceState(xVar.f3954a);
        this.f504a.t(xVar.f503c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        xVar.f503c = bundle;
        this.f504a.v(bundle);
        return xVar;
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.f505b.setActiveIndicatorLabelPadding(i);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        a4.p.q(this, f2);
    }

    public void setHorizontalItemTextAppearanceActive(int i) throws Resources.NotFoundException {
        this.f505b.setHorizontalItemTextAppearanceActive(i);
    }

    public void setHorizontalItemTextAppearanceInactive(int i) throws Resources.NotFoundException {
        this.f505b.setHorizontalItemTextAppearanceInactive(i);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.f505b.setIconLabelHorizontalSpacing(i);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f505b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z6) {
        this.f505b.setItemActiveIndicatorEnabled(z6);
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.f505b.setItemActiveIndicatorExpandedHeight(i);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.f505b.setItemActiveIndicatorExpandedMarginHorizontal(i);
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.f505b.setItemActiveIndicatorExpandedWidth(i);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.f505b.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.f505b.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(G3.o oVar) {
        this.f505b.setItemActiveIndicatorShapeAppearance(oVar);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.f505b.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.f505b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.f505b.setItemBackgroundRes(i);
    }

    public void setItemGravity(int i) {
        C2562b c2562b = this.f505b;
        if (c2562b.getItemGravity() != i) {
            c2562b.setItemGravity(i);
            this.f506c.b(false);
        }
    }

    public void setItemIconGravity(int i) {
        C2562b c2562b = this.f505b;
        if (c2562b.getItemIconGravity() != i) {
            c2562b.setItemIconGravity(i);
            this.f506c.b(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f505b.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f505b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.f505b.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.f505b.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f505b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) throws Resources.NotFoundException {
        this.f505b.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z6) throws Resources.NotFoundException {
        this.f505b.setItemTextAppearanceActiveBoldEnabled(z6);
    }

    public void setItemTextAppearanceInactive(int i) throws Resources.NotFoundException {
        this.f505b.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f505b.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z6) throws Resources.NotFoundException {
        this.f505b.setLabelFontScalingEnabled(z6);
    }

    public void setLabelMaxLines(int i) {
        this.f505b.setLabelMaxLines(i);
    }

    public void setLabelVisibilityMode(int i) {
        C2562b c2562b = this.f505b;
        if (c2562b.getLabelVisibilityMode() != i) {
            c2562b.setLabelVisibilityMode(i);
            this.f506c.b(false);
        }
    }

    public void setOnItemSelectedListener(v vVar) {
        this.f508e = vVar;
    }

    public void setSelectedItemId(int i) {
        l lVar = this.f504a;
        MenuItem menuItemFindItem = lVar.findItem(i);
        if (menuItemFindItem != null) {
            boolean zQ = lVar.q(menuItemFindItem, this.f506c, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zQ || menuItemFindItem.isChecked()) {
                    this.f505b.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }

    public void setOnItemReselectedListener(u uVar) {
    }
}
