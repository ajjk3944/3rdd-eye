package com.google.android.material.navigation;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import n.h;
import o.a0;
import o.y;
import zd.f;
import zd.k;
import zd.l;

/* loaded from: classes.dex */
public abstract class d extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final f f5675a;

    /* renamed from: d, reason: collision with root package name */
    public final kd.b f5676d;

    /* renamed from: g, reason: collision with root package name */
    public final b f5677g;

    /* renamed from: r, reason: collision with root package name */
    public h f5678r;

    /* renamed from: x, reason: collision with root package name */
    public l f5679x;

    /* JADX WARN: Removed duplicated region for block: B:56:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(android.content.Context r10, android.util.AttributeSet r11, int r12, int r13) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.d.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    private MenuInflater getMenuInflater() {
        if (this.f5678r == null) {
            this.f5678r = new h(getContext());
        }
        return this.f5678r;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f5676d.setMeasurePaddingFromLabelBaseline(z10);
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f5676d.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f5676d.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f5676d.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f5676d.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f5676d.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f5676d.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f5676d.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f5676d.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f5676d.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f5676d.getItemActiveIndicatorMarginHorizontal();
    }

    public ee.l getItemActiveIndicatorShapeAppearance() {
        return this.f5676d.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f5676d.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f5676d.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f5676d.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f5676d.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f5676d.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f5676d.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f5676d.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f5676d.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f5676d.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f5676d.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f5676d.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f5676d.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f5676d.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f5676d.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f5675a;
    }

    public a0 getMenuView() {
        return this.f5676d;
    }

    public ViewGroup getMenuViewGroup() {
        return this.f5676d;
    }

    public b getPresenter() {
        return this.f5677g;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f5676d.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f5676d.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        se.b.V(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof NavigationBarView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        NavigationBarView$SavedState navigationBarView$SavedState = (NavigationBarView$SavedState) parcelable;
        super.onRestoreInstanceState(navigationBarView$SavedState.f1243a);
        Bundle bundle = navigationBarView$SavedState.f5671g;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5675a.f18631u;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id2 = yVar.getId();
                if (id2 > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    yVar.h(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableL;
        NavigationBarView$SavedState navigationBarView$SavedState = new NavigationBarView$SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        navigationBarView$SavedState.f5671g = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5675a.f18631u;
        if (copyOnWriteArrayList.isEmpty()) {
            return navigationBarView$SavedState;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            y yVar = (y) weakReference.get();
            if (yVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id2 = yVar.getId();
                if (id2 > 0 && (parcelableL = yVar.l()) != null) {
                    sparseArray.put(id2, parcelableL);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return navigationBarView$SavedState;
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f5676d.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        se.b.T(this, f10);
    }

    public void setHorizontalItemTextAppearanceActive(int i10) throws Resources.NotFoundException {
        this.f5676d.setHorizontalItemTextAppearanceActive(i10);
    }

    public void setHorizontalItemTextAppearanceInactive(int i10) throws Resources.NotFoundException {
        this.f5676d.setHorizontalItemTextAppearanceInactive(i10);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        this.f5676d.setIconLabelHorizontalSpacing(i10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f5676d.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f5676d.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorExpandedHeight(int i10) {
        this.f5676d.setItemActiveIndicatorExpandedHeight(i10);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f5676d.setItemActiveIndicatorExpandedMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorExpandedWidth(int i10) {
        this.f5676d.setItemActiveIndicatorExpandedWidth(i10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f5676d.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f5676d.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(ee.l lVar) {
        this.f5676d.setItemActiveIndicatorShapeAppearance(lVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f5676d.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f5676d.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f5676d.setItemBackgroundRes(i10);
    }

    public void setItemGravity(int i10) {
        kd.b bVar = this.f5676d;
        if (bVar.getItemGravity() != i10) {
            bVar.setItemGravity(i10);
            this.f5677g.b(false);
        }
    }

    public void setItemIconGravity(int i10) {
        kd.b bVar = this.f5676d;
        if (bVar.getItemIconGravity() != i10) {
            bVar.setItemIconGravity(i10);
            this.f5677g.b(false);
        }
    }

    public void setItemIconSize(int i10) {
        this.f5676d.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f5676d.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f5676d.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f5676d.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f5676d.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) throws Resources.NotFoundException {
        this.f5676d.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) throws Resources.NotFoundException {
        this.f5676d.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(int i10) throws Resources.NotFoundException {
        this.f5676d.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f5676d.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z10) throws Resources.NotFoundException {
        this.f5676d.setLabelFontScalingEnabled(z10);
    }

    public void setLabelMaxLines(int i10) {
        this.f5676d.setLabelMaxLines(i10);
    }

    public void setLabelVisibilityMode(int i10) {
        kd.b bVar = this.f5676d;
        if (bVar.getLabelVisibilityMode() != i10) {
            bVar.setLabelVisibilityMode(i10);
            this.f5677g.b(false);
        }
    }

    public void setOnItemSelectedListener(l lVar) {
        this.f5679x = lVar;
    }

    public void setSelectedItemId(int i10) {
        f fVar = this.f5675a;
        MenuItem menuItemFindItem = fVar.findItem(i10);
        if (menuItemFindItem != null) {
            boolean zQ = fVar.q(menuItemFindItem, this.f5677g, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zQ || menuItemFindItem.isChecked()) {
                    this.f5676d.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }

    public void setOnItemReselectedListener(k kVar) {
    }
}
