package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.internal.ads.ur0;
import com.liuzh.deviceinfo.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import km.i;
import md.a;
import mi.e;
import nm.d0;
import sc.f;
import sc.h;
import zc.d;
import zc.g;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ChipGroup extends d {

    /* renamed from: e, reason: collision with root package name */
    public int f20432e;

    /* renamed from: f, reason: collision with root package name */
    public int f20433f;
    public h g;

    /* renamed from: h, reason: collision with root package name */
    public final ur0 f20434h;

    /* renamed from: i, reason: collision with root package name */
    public final int f20435i;
    public final e j;

    /* JADX WARN: Illegal instructions before constructor call */
    public ChipGroup(Context context, AttributeSet attributeSet) {
        Context contextA = a.a(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup);
        super(contextA, attributeSet, R.attr.chipGroupStyle);
        this.f38209c = false;
        TypedArray typedArrayObtainStyledAttributes = contextA.getTheme().obtainStyledAttributes(attributeSet, ic.a.f25952m, 0, 0);
        this.f38207a = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f38208b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        ur0 ur0Var = new ur0(4);
        this.f20434h = ur0Var;
        e eVar = new e(this, 1);
        this.j = eVar;
        TypedArray typedArrayG = m.g(getContext(), attributeSet, ic.a.g, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayG.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayG.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayG.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayG.getBoolean(5, false));
        setSingleSelection(typedArrayG.getBoolean(6, false));
        setSelectionRequired(typedArrayG.getBoolean(4, false));
        this.f20435i = typedArrayG.getResourceId(0, -1);
        typedArrayG.recycle();
        ur0Var.f17306f = new i(18, this);
        super.setOnHierarchyChangeListener(eVar);
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i4 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof Chip) && getChildAt(i10).getVisibility() == 0) {
                i4++;
            }
        }
        return i4;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof f);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.f20434h.c();
    }

    public List<Integer> getCheckedChipIds() {
        return this.f20434h.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.f20432e;
    }

    public int getChipSpacingVertical() {
        return this.f20433f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f20435i;
        if (i4 != -1) {
            ur0 ur0Var = this.f20434h;
            g gVar = (g) ((HashMap) ur0Var.f17304d).get(Integer.valueOf(i4));
            if (gVar != null && ur0Var.a(gVar)) {
                ur0Var.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) o7.d.n(getRowCount(), this.f38209c ? getVisibleChipCount() : -1, this.f20434h.f17302b ? 1 : 2, false).f30421b);
    }

    public void setChipSpacing(int i4) {
        setChipSpacingHorizontal(i4);
        setChipSpacingVertical(i4);
    }

    public void setChipSpacingHorizontal(int i4) {
        if (this.f20432e != i4) {
            this.f20432e = i4;
            setItemSpacing(i4);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i4) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i4));
    }

    public void setChipSpacingResource(int i4) {
        setChipSpacing(getResources().getDimensionPixelOffset(i4));
    }

    public void setChipSpacingVertical(int i4) {
        if (this.f20433f != i4) {
            this.f20433f = i4;
            setLineSpacing(i4);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i4) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i4));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i4) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(sc.g gVar) {
        if (gVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new d0(11, this));
        }
    }

    public void setOnCheckedStateChangeListener(h hVar) {
        this.g = hVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.j.f29392b = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z3) {
        this.f20434h.f17303c = z3;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i4) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i4) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // zc.d
    public void setSingleLine(boolean z3) {
        super.setSingleLine(z3);
    }

    public void setSingleSelection(boolean z3) {
        ur0 ur0Var = this.f20434h;
        if (ur0Var.f17302b != z3) {
            ur0Var.f17302b = z3;
            boolean zIsEmpty = ((HashSet) ur0Var.f17305e).isEmpty();
            Iterator it = ((HashMap) ur0Var.f17304d).values().iterator();
            while (it.hasNext()) {
                ur0Var.e((g) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            ur0Var.d();
        }
    }

    public void setSingleLine(int i4) {
        setSingleLine(getResources().getBoolean(i4));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f(layoutParams);
    }

    public void setSingleSelection(int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }
}
