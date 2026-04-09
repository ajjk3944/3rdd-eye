package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import b9.e;
import e2.t;
import ed.k;
import ed.l;
import ee.a0;
import ee.b0;
import ee.d;
import ee.w;
import ee.x;
import ee.y;
import ee.z;
import h7.r1;
import io.sentry.android.core.e0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public abstract class b extends LinearLayout {
    public static final int G = k.Widget_Material3_MaterialButtonGroup;
    public y B;
    public int D;
    public b0 E;
    public boolean F;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5556a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5557d;

    /* renamed from: g, reason: collision with root package name */
    public final r1 f5558g;

    /* renamed from: r, reason: collision with root package name */
    public final t f5559r;

    /* renamed from: x, reason: collision with root package name */
    public Integer[] f5560x;

    /* renamed from: y, reason: collision with root package name */
    public w f5561y;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        w wVarB;
        XmlResourceParser xml;
        int next;
        b0 b0Var;
        AttributeSet attributeSetAsAttributeSet;
        int next2;
        int i11 = G;
        super(le.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        this.f5556a = new ArrayList();
        this.f5557d = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f5558g = new r1(20, materialButtonToggleGroup);
        this.f5559r = new t(2, materialButtonToggleGroup);
        this.F = true;
        Context context2 = getContext();
        TypedArray typedArrayD = xd.k.d(context2, attributeSet, l.MaterialButtonGroup, i10, i11, new int[0]);
        if (typedArrayD.hasValue(l.MaterialButtonGroup_buttonSizeChange)) {
            int resourceId = typedArrayD.getResourceId(l.MaterialButtonGroup_buttonSizeChange, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        b0Var = new b0();
                        b0Var.f8091c = new int[10][];
                        b0Var.f8092d = new e[10];
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
                    b0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                }
                xml.close();
                this.E = b0Var;
            } else {
                b0Var = null;
                this.E = b0Var;
            }
        }
        if (typedArrayD.hasValue(l.MaterialButtonGroup_shapeAppearance)) {
            y yVarB = y.b(context2, typedArrayD, l.MaterialButtonGroup_shapeAppearance);
            this.B = yVarB;
            if (yVarB == null) {
                x xVar = new x(ee.l.a(context2, typedArrayD.getResourceId(l.MaterialButtonGroup_shapeAppearance, 0), typedArrayD.getResourceId(l.MaterialButtonGroup_shapeAppearanceOverlay, 0)).b());
                this.B = xVar.f8165b != 0 ? new y(xVar) : null;
            }
        }
        if (typedArrayD.hasValue(l.MaterialButtonGroup_innerCornerSize)) {
            int i12 = l.MaterialButtonGroup_innerCornerSize;
            ee.a aVar = new ee.a(0.0f);
            int resourceId2 = typedArrayD.getResourceId(i12, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        w wVar = new w();
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
                            wVar.d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                        wVarB = wVar;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    wVarB = w.b(aVar);
                }
            } else {
                wVarB = w.b(ee.l.d(typedArrayD, i12, aVar));
            }
            this.f5561y = wVarB;
        }
        this.D = typedArrayD.getDimensionPixelSize(l.MaterialButtonGroup_android_spacing, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayD.getBoolean(l.MaterialButtonGroup_android_enabled, true));
        typedArrayD.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(i10)) {
                return i10;
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
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i10 - 1);
            if (this.D <= 0) {
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
                layoutParams2.setMarginStart(this.D - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.D - iMin;
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
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            e0.d("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.F = true;
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f5558g);
        this.f5556a.add(materialButton.getShapeAppearanceModel());
        this.f5557d.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.E == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i10 = firstVisibleChildIndex; i10 <= lastVisibleChildIndex; i10++) {
            if (c(i10)) {
                if (c(i10) && this.E != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i10);
                    b0 b0Var = this.E;
                    int width = materialButton3.getWidth();
                    int i11 = -width;
                    for (int i12 = 0; i12 < b0Var.f8089a; i12++) {
                        z zVar = (z) b0Var.f8092d[i12].f2481d;
                        a0 a0Var = (a0) zVar.f8182d;
                        float f10 = zVar.f8181a;
                        if (a0Var == a0.PIXELS) {
                            fMax = Math.max(i11, f10);
                        } else if (a0Var == a0.PERCENT) {
                            fMax = Math.max(i11, width * f10);
                        }
                        i11 = (int) fMax;
                    }
                    int iMax = Math.max(0, i11);
                    int i13 = i10 - 1;
                    while (true) {
                        materialButton = null;
                        if (i13 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i13)) {
                                materialButton2 = (MaterialButton) getChildAt(i13);
                                break;
                            }
                            i13--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i14 = i10 + 1;
                    while (true) {
                        if (i14 >= childCount) {
                            break;
                        }
                        if (c(i14)) {
                            materialButton = (MaterialButton) getChildAt(i14);
                            break;
                        }
                        i14++;
                    }
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i10 != firstVisibleChildIndex && i10 != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i15 = firstVisibleChildIndex;
        while (i15 <= lastVisibleChildIndex) {
            if (c(i15)) {
                ((MaterialButton) getChildAt(i15)).setSizeChange(this.E);
                ((MaterialButton) getChildAt(i15)).setWidthChangeMax((i15 == firstVisibleChildIndex || i15 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i15++;
        }
    }

    public final boolean c(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public final void d() {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = materialButton.R;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.R = null;
                materialButton.O = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f5559r);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f5560x = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        x xVar;
        int i10;
        if (!(this.f5561y == null && this.B == null) && this.F) {
            this.F = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i11 = 0;
            while (i11 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i11);
                if (materialButton.getVisibility() != 8) {
                    boolean z10 = i11 == firstVisibleChildIndex;
                    boolean z11 = i11 == lastVisibleChildIndex;
                    y yVar = this.B;
                    if (yVar == null || (!z10 && !z11)) {
                        yVar = (y) this.f5557d.get(i11);
                    }
                    if (yVar == null) {
                        xVar = new x((ee.l) this.f5556a.get(i11));
                    } else {
                        x xVar2 = new x(0);
                        int i12 = yVar.f8173a;
                        xVar2.f8165b = i12;
                        xVar2.f8166c = yVar.f8174b;
                        int[][] iArr = yVar.f8175c;
                        int[][] iArr2 = new int[iArr.length][];
                        xVar2.f8167d = iArr2;
                        ee.l[] lVarArr = yVar.f8176d;
                        xVar2.f8168e = new ee.l[lVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i12);
                        System.arraycopy(lVarArr, 0, (ee.l[]) xVar2.f8168e, 0, xVar2.f8165b);
                        xVar2.f8169f = yVar.f8177e;
                        xVar2.f8170g = yVar.f8178f;
                        xVar2.f8171h = yVar.f8179g;
                        xVar2.f8172i = yVar.f8180h;
                        xVar = xVar2;
                    }
                    boolean z12 = getOrientation() == 0;
                    boolean z13 = getLayoutDirection() == 1;
                    if (z12) {
                        i10 = z10 ? 5 : 0;
                        if (z11) {
                            i10 |= 10;
                        }
                        if (z13) {
                            i10 = ((i10 & 10) >> 1) | ((i10 & 5) << 1);
                        }
                    } else {
                        i10 = z10 ? 3 : 0;
                        if (z11) {
                            i10 |= 12;
                        }
                    }
                    int i13 = ~i10;
                    w wVar = this.f5561y;
                    if ((i13 | 1) == i13) {
                        xVar.f8169f = wVar;
                    }
                    if ((i13 | 2) == i13) {
                        xVar.f8170g = wVar;
                    }
                    if ((i13 | 4) == i13) {
                        xVar.f8171h = wVar;
                    }
                    if ((i13 | 8) == i13) {
                        xVar.f8172i = wVar;
                    }
                    y yVar2 = xVar.f8165b == 0 ? null : new y(xVar);
                    if (yVar2.d()) {
                        materialButton.setStateListShapeAppearanceModel(yVar2);
                    } else {
                        materialButton.setShapeAppearanceModel(yVar2.c());
                    }
                }
                i11++;
            }
        }
    }

    public b0 getButtonSizeChange() {
        return this.E;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f5560x;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        e0.p("MButtonGroup", "Child order wasn't updated");
        return i11;
    }

    public d getInnerCornerSize() {
        return this.f5561y.f8161b;
    }

    public w getInnerCornerSizeStateList() {
        return this.f5561y;
    }

    public ee.l getShapeAppearance() {
        y yVar = this.B;
        if (yVar == null) {
            return null;
        }
        return yVar.c();
    }

    public int getSpacing() {
        return this.D;
    }

    public y getStateListShapeAppearance() {
        return this.B;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        e();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f5556a.remove(iIndexOfChild);
            this.f5557d.remove(iIndexOfChild);
        }
        this.F = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(b0 b0Var) {
        if (this.E != b0Var) {
            this.E = b0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z10);
        }
    }

    public void setInnerCornerSize(d dVar) {
        this.f5561y = w.b(dVar);
        this.F = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(w wVar) {
        this.f5561y = wVar;
        this.F = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i10) {
        if (getOrientation() != i10) {
            this.F = true;
        }
        super.setOrientation(i10);
    }

    public void setShapeAppearance(ee.l lVar) {
        x xVar = new x(lVar);
        this.B = xVar.f8165b == 0 ? null : new y(xVar);
        this.F = true;
        e();
        invalidate();
    }

    public void setSpacing(int i10) {
        this.D = i10;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(y yVar) {
        this.B = yVar;
        this.F = true;
        e();
        invalidate();
    }
}
