package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.shape.e;
import j4.k;
import j4.l;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class d extends LinearLayout {

    /* renamed from: k, reason: collision with root package name */
    public static final int f10089k = k.Widget_Material3_MaterialButtonGroup;

    /* renamed from: a, reason: collision with root package name */
    public final List f10090a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10091b;

    /* renamed from: c, reason: collision with root package name */
    public final b f10092c;

    /* renamed from: d, reason: collision with root package name */
    public final Comparator f10093d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f10094e;

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.material.shape.d f10095f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.material.shape.e f10096g;

    /* renamed from: h, reason: collision with root package name */
    public int f10097h;

    /* renamed from: i, reason: collision with root package name */
    public StateListSizeChange f10098i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10099j;

    public class b implements MaterialButton.b {
        public b() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(MaterialButton materialButton, boolean z10) {
            d.this.invalidate();
        }
    }

    public d(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ int a(d dVar, MaterialButton materialButton, MaterialButton materialButton2) {
        dVar.getClass();
        int iCompareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
        return iCompareTo2 != 0 ? iCompareTo2 : Integer.compare(dVar.indexOfChild(materialButton), dVar.indexOfChild(materialButton2));
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (j(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (j(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private boolean j(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        l();
        this.f10099j = true;
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f10092c);
        this.f10090a.add(materialButton.getShapeAppearanceModel());
        this.f10091b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButtonF = f(i10);
            MaterialButton materialButtonF2 = f(i10 - 1);
            if (this.f10097h <= 0) {
                iMin = Math.min(materialButtonF.getStrokeWidth(), materialButtonF2.getStrokeWidth());
                materialButtonF.setShouldDrawSurfaceColorStroke(true);
                materialButtonF2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButtonF.setShouldDrawSurfaceColorStroke(false);
                materialButtonF2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsD = d(materialButtonF);
            if (getOrientation() == 0) {
                layoutParamsD.setMarginEnd(0);
                layoutParamsD.setMarginStart(this.f10097h - iMin);
                layoutParamsD.topMargin = 0;
            } else {
                layoutParamsD.bottomMargin = 0;
                layoutParamsD.topMargin = this.f10097h - iMin;
                layoutParamsD.setMarginStart(0);
            }
            materialButtonF.setLayoutParams(layoutParamsD);
        }
        m(firstVisibleChildIndex);
    }

    public final void c() {
        if (this.f10098i == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i10 = firstVisibleChildIndex; i10 <= lastVisibleChildIndex; i10++) {
            if (j(i10)) {
                int iE = e(i10);
                if (i10 != firstVisibleChildIndex && i10 != lastVisibleChildIndex) {
                    iE /= 2;
                }
                iMin = Math.min(iMin, iE);
            }
        }
        int i11 = firstVisibleChildIndex;
        while (i11 <= lastVisibleChildIndex) {
            if (j(i11)) {
                f(i11).setSizeChange(this.f10098i);
                f(i11).setWidthChangeMax((i11 == firstVisibleChildIndex || i11 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i11++;
        }
    }

    public LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        n();
        super.dispatchDraw(canvas);
    }

    public final int e(int i10) {
        if (!j(i10) || this.f10098i == null) {
            return 0;
        }
        int iMax = Math.max(0, this.f10098i.c(f(i10).getWidth()));
        MaterialButton materialButtonI = i(i10);
        int allowedWidthDecrease = materialButtonI == null ? 0 : materialButtonI.getAllowedWidthDecrease();
        MaterialButton materialButtonG = g(i10);
        return Math.min(iMax, allowedWidthDecrease + (materialButtonG != null ? materialButtonG.getAllowedWidthDecrease() : 0));
    }

    public MaterialButton f(int i10) {
        return (MaterialButton) getChildAt(i10);
    }

    public final MaterialButton g(int i10) {
        int childCount = getChildCount();
        do {
            i10++;
            if (i10 >= childCount) {
                return null;
            }
        } while (!j(i10));
        return f(i10);
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public StateListSizeChange getButtonSizeChange() {
        return this.f10098i;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f10094e;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i11;
    }

    @NonNull
    public g5.d getInnerCornerSize() {
        return this.f10095f.e();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public com.google.android.material.shape.d getInnerCornerSizeStateList() {
        return this.f10095f;
    }

    @Nullable
    public com.google.android.material.shape.a getShapeAppearance() {
        com.google.android.material.shape.e eVar = this.f10096g;
        if (eVar == null) {
            return null;
        }
        return eVar.c(true);
    }

    @Px
    public int getSpacing() {
        return this.f10097h;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public com.google.android.material.shape.e getStateListShapeAppearance() {
        return this.f10096g;
    }

    public final e.b h(boolean z10, boolean z11, int i10) {
        com.google.android.material.shape.e eVar = this.f10096g;
        if (eVar == null || (!z10 && !z11)) {
            eVar = (com.google.android.material.shape.e) this.f10091b.get(i10);
        }
        return eVar == null ? new e.b((com.google.android.material.shape.a) this.f10090a.get(i10)) : eVar.i();
    }

    public final MaterialButton i(int i10) {
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (j(i11)) {
                return f(i11);
            }
        }
        return null;
    }

    public void k(MaterialButton materialButton, int i10) {
        int iIndexOfChild = indexOfChild(materialButton);
        if (iIndexOfChild < 0) {
            return;
        }
        MaterialButton materialButtonI = i(iIndexOfChild);
        MaterialButton materialButtonG = g(iIndexOfChild);
        if (materialButtonI == null && materialButtonG == null) {
            return;
        }
        if (materialButtonI == null) {
            materialButtonG.setDisplayedWidthDecrease(i10);
        }
        if (materialButtonG == null) {
            materialButtonI.setDisplayedWidthDecrease(i10);
        }
        if (materialButtonI == null || materialButtonG == null) {
            return;
        }
        materialButtonI.setDisplayedWidthDecrease(i10 / 2);
        materialButtonG.setDisplayedWidthDecrease((i10 + 1) / 2);
    }

    public final void l() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).o();
        }
    }

    public final void m(int i10) {
        if (getChildCount() == 0 || i10 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) f(i10).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void n() {
        TreeMap treeMap = new TreeMap(this.f10093d);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put(f(i10), Integer.valueOf(i10));
        }
        this.f10094e = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void o() {
        int iH;
        if (!(this.f10095f == null && this.f10096g == null) && this.f10099j) {
            this.f10099j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i10 = 0;
            while (i10 < childCount) {
                MaterialButton materialButtonF = f(i10);
                if (materialButtonF.getVisibility() != 8) {
                    boolean z10 = i10 == firstVisibleChildIndex;
                    boolean z11 = i10 == lastVisibleChildIndex;
                    e.b bVarH = h(z10, z11, i10);
                    boolean z12 = getOrientation() == 0;
                    boolean zL = d0.l(this);
                    if (z12) {
                        iH = z10 ? 5 : 0;
                        if (z11) {
                            iH |= 10;
                        }
                        if (zL) {
                            iH = com.google.android.material.shape.e.h(iH);
                        }
                    } else {
                        iH = z10 ? 3 : 0;
                        if (z11) {
                            iH |= 12;
                        }
                    }
                    com.google.android.material.shape.e eVarJ = bVarH.n(this.f10095f, ~iH).j();
                    if (eVarJ.f()) {
                        materialButtonF.setStateListShapeAppearanceModel(eVarJ);
                    } else {
                        materialButtonF.setShapeAppearanceModel(eVarJ.c(true));
                    }
                }
                i10++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            l();
            c();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        o();
        b();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f10090a.remove(iIndexOfChild);
            this.f10091b.remove(iIndexOfChild);
        }
        this.f10099j = true;
        o();
        l();
        b();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setButtonSizeChange(@NonNull StateListSizeChange stateListSizeChange) {
        if (this.f10098i != stateListSizeChange) {
            this.f10098i = stateListSizeChange;
            c();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).setEnabled(z10);
        }
    }

    public void setInnerCornerSize(@NonNull g5.d dVar) {
        this.f10095f = com.google.android.material.shape.d.c(dVar);
        this.f10099j = true;
        o();
        invalidate();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInnerCornerSizeStateList(@NonNull com.google.android.material.shape.d dVar) {
        this.f10095f = dVar;
        this.f10099j = true;
        o();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (getOrientation() != i10) {
            this.f10099j = true;
        }
        super.setOrientation(i10);
    }

    public void setShapeAppearance(@Nullable com.google.android.material.shape.a aVar) {
        this.f10096g = new e.b(aVar).j();
        this.f10099j = true;
        o();
        invalidate();
    }

    public void setSpacing(@Px int i10) {
        this.f10097h = i10;
        invalidate();
        requestLayout();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setStateListShapeAppearance(@Nullable com.google.android.material.shape.e eVar) {
        this.f10096g = eVar;
        this.f10099j = true;
        o();
        invalidate();
    }

    public d(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.materialButtonGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f10089k;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f10090a = new ArrayList();
        this.f10091b = new ArrayList();
        this.f10092c = new b();
        this.f10093d = new Comparator() { // from class: com.google.android.material.button.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return d.a(this.f10088a, (MaterialButton) obj, (MaterialButton) obj2);
            }
        };
        this.f10099j = true;
        Context context2 = getContext();
        TypedArray typedArrayI = a0.i(context2, attributeSet, l.MaterialButtonGroup, i10, i11, new int[0]);
        int i12 = l.MaterialButtonGroup_buttonSizeChange;
        if (typedArrayI.hasValue(i12)) {
            this.f10098i = StateListSizeChange.b(context2, typedArrayI, i12);
        }
        int i13 = l.MaterialButtonGroup_shapeAppearance;
        if (typedArrayI.hasValue(i13)) {
            com.google.android.material.shape.e eVarB = com.google.android.material.shape.e.b(context2, typedArrayI, i13);
            this.f10096g = eVarB;
            if (eVarB == null) {
                this.f10096g = new e.b(com.google.android.material.shape.a.b(context2, typedArrayI.getResourceId(i13, 0), typedArrayI.getResourceId(l.MaterialButtonGroup_shapeAppearanceOverlay, 0)).m()).j();
            }
        }
        int i14 = l.MaterialButtonGroup_innerCornerSize;
        if (typedArrayI.hasValue(i14)) {
            this.f10095f = com.google.android.material.shape.d.b(context2, typedArrayI, i14, new g5.a(0.0f));
        }
        this.f10097h = typedArrayI.getDimensionPixelSize(l.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(l.MaterialButtonGroup_android_enabled, true));
        typedArrayI.recycle();
    }
}
