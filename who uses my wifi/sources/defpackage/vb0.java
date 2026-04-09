package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.phuongpn.whousemywifi.networkscanner.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class vb0 extends LinearLayout {
    public final ArrayList f;
    public final ArrayList g;
    public final kf3 h;
    public final ub0 i;
    public Integer[] j;
    public cy0 k;
    public dy0 l;
    public int m;
    public fy0 n;
    public boolean o;

    /* JADX WARN: Type inference failed for: r13v5, types: [ub0] */
    public vb0(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        cy0 cy0VarB;
        XmlResourceParser xml;
        int next;
        fy0 fy0Var;
        AttributeSet attributeSetAsAttributeSet;
        int next2;
        super(um.z(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f = new ArrayList();
        this.g = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.h = new kf3(5, materialButtonToggleGroup);
        this.i = new Comparator() { // from class: ub0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.t).compareTo(Boolean.valueOf(materialButton2.t));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup2 = materialButtonToggleGroup;
                return Integer.compare(materialButtonToggleGroup2.indexOfChild(materialButton), materialButtonToggleGroup2.indexOfChild(materialButton2));
            }
        };
        this.o = true;
        Context context2 = getContext();
        TypedArray typedArrayS = uk2.s(context2, attributeSet, gn0.s, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayS.hasValue(2)) {
            int resourceId = typedArrayS.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        fy0Var = new fy0();
                        fy0Var.c = new int[10][];
                        fy0Var.d = new f23[10];
                        attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                if (next2 != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    fy0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                }
                xml.close();
                this.n = fy0Var;
            } else {
                fy0Var = null;
                this.n = fy0Var;
            }
        }
        if (typedArrayS.hasValue(4)) {
            dy0 dy0VarB = dy0.b(context2, typedArrayS, 4);
            this.l = dy0VarB;
            if (dy0VarB == null) {
                q50 q50Var = new q50(su0.a(context2, typedArrayS.getResourceId(4, 0), typedArrayS.getResourceId(5, 0), new l(0)).a());
                this.l = q50Var.a != 0 ? new dy0(q50Var) : null;
            }
        }
        if (typedArrayS.hasValue(3)) {
            l lVar = new l(0.0f);
            int resourceId2 = typedArrayS.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        cy0VarB = new cy0();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            cy0VarB.d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    cy0VarB = cy0.b(lVar);
                }
            } else {
                cy0VarB = cy0.b(su0.c(typedArrayS, 3, lVar));
            }
            this.k = cy0VarB;
        }
        this.m = typedArrayS.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayS.getBoolean(0, true));
        typedArrayS.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i - 1);
            if (this.m <= 0) {
                iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                materialButton.setShouldDrawSurfaceColorStroke(true);
                materialButton2.setShouldDrawSurfaceColorStroke(true);
            } else {
                materialButton.setShouldDrawSurfaceColorStroke(false);
                materialButton2.setShouldDrawSurfaceColorStroke(false);
                iMin = 0;
            }
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(this.m - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.m - iMin;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.o = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.h);
        this.f.add(materialButton.getShapeAppearanceModel());
        this.g.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.n == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (c(i)) {
                if (c(i) && this.n != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i);
                    fy0 fy0Var = this.n;
                    int width = materialButton3.getWidth();
                    int i2 = -width;
                    for (int i3 = 0; i3 < fy0Var.a; i3++) {
                        ey0 ey0Var = (ey0) fy0Var.d[i3].g;
                        int i4 = ey0Var.a;
                        float f = ey0Var.b;
                        if (i4 == 2) {
                            fMax = Math.max(i2, f);
                        } else if (i4 == 1) {
                            fMax = Math.max(i2, width * f);
                        }
                        i2 = (int) fMax;
                    }
                    int iMax = Math.max(0, i2);
                    int i5 = i - 1;
                    while (true) {
                        materialButton = null;
                        if (i5 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i5)) {
                                materialButton2 = (MaterialButton) getChildAt(i5);
                                break;
                            }
                            i5--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i6 = i + 1;
                    while (true) {
                        if (i6 >= childCount) {
                            break;
                        }
                        if (c(i6)) {
                            materialButton = (MaterialButton) getChildAt(i6);
                            break;
                        }
                        i6++;
                    }
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i7 = firstVisibleChildIndex;
        while (i7 <= lastVisibleChildIndex) {
            if (c(i7)) {
                ((MaterialButton) getChildAt(i7)).setSizeChange(this.n);
                ((MaterialButton) getChildAt(i7)).setWidthChangeMax((i7 == firstVisibleChildIndex || i7 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i7++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.A;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.A = null;
                materialButton.x = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.i);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.j = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.Serializable, su0[]] */
    public final void e() {
        q50 q50Var;
        int i;
        if (!(this.k == null && this.l == null) && this.o) {
            this.o = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = 0;
            while (i2 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    boolean z = i2 == firstVisibleChildIndex;
                    boolean z2 = i2 == lastVisibleChildIndex;
                    dy0 dy0Var = this.l;
                    if (dy0Var == null || (!z && !z2)) {
                        dy0Var = (dy0) this.g.get(i2);
                    }
                    if (dy0Var == null) {
                        q50Var = new q50((su0) this.f.get(i2));
                    } else {
                        q50 q50Var2 = new q50();
                        int i3 = dy0Var.a;
                        q50Var2.a = i3;
                        q50Var2.b = dy0Var.b;
                        int[][] iArr = dy0Var.c;
                        ?? r14 = new int[iArr.length][];
                        q50Var2.c = r14;
                        su0[] su0VarArr = dy0Var.d;
                        q50Var2.d = new su0[su0VarArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i3);
                        System.arraycopy(su0VarArr, 0, (su0[]) q50Var2.d, 0, q50Var2.a);
                        q50Var2.e = dy0Var.e;
                        q50Var2.f = dy0Var.f;
                        q50Var2.g = dy0Var.g;
                        q50Var2.h = dy0Var.h;
                        q50Var = q50Var2;
                    }
                    boolean z3 = getOrientation() == 0;
                    boolean z4 = getLayoutDirection() == 1;
                    if (z3) {
                        i = z ? 5 : 0;
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z ? 3 : 0;
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    cy0 cy0Var = this.k;
                    if ((i4 | 1) == i4) {
                        q50Var.e = cy0Var;
                    }
                    if ((i4 | 2) == i4) {
                        q50Var.f = cy0Var;
                    }
                    if ((i4 | 4) == i4) {
                        q50Var.g = cy0Var;
                    }
                    if ((i4 | 8) == i4) {
                        q50Var.h = cy0Var;
                    }
                    dy0 dy0Var2 = q50Var.a == 0 ? null : new dy0(q50Var);
                    if (dy0Var2.d()) {
                        materialButton.setStateListShapeAppearanceModel(dy0Var2);
                    } else {
                        materialButton.setShapeAppearanceModel(dy0Var2.c());
                    }
                }
                i2++;
            }
        }
    }

    public fy0 getButtonSizeChange() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.j;
        return (numArr == null || i2 >= numArr.length) ? i2 : numArr[i2].intValue();
    }

    public ck getInnerCornerSize() {
        return this.k.b;
    }

    public cy0 getInnerCornerSizeStateList() {
        return this.k;
    }

    public su0 getShapeAppearance() {
        dy0 dy0Var = this.l;
        if (dy0Var == null) {
            return null;
        }
        return dy0Var.c();
    }

    public int getSpacing() {
        return this.m;
    }

    public dy0 getStateListShapeAppearance() {
        return this.l;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f.remove(iIndexOfChild);
            this.g.remove(iIndexOfChild);
        }
        this.o = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(fy0 fy0Var) {
        if (this.n != fy0Var) {
            this.n = fy0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(ck ckVar) {
        this.k = cy0.b(ckVar);
        this.o = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(cy0 cy0Var) {
        this.k = cy0Var;
        this.o = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.o = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(su0 su0Var) {
        q50 q50Var = new q50(su0Var);
        this.l = q50Var.a == 0 ? null : new dy0(q50Var);
        this.o = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.m = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(dy0 dy0Var) {
        this.l = dy0Var;
        this.o = true;
        e();
        invalidate();
    }
}
