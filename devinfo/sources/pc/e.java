package pc;

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
import com.liuzh.deviceinfo.R;
import ed.a0;
import ed.b0;
import ed.c0;
import ed.d0;
import ed.o;
import ed.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import km.i;
import org.xmlpull.v1.XmlPullParserException;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class e extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f31683a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f31684b;

    /* renamed from: c, reason: collision with root package name */
    public final i f31685c;

    /* renamed from: d, reason: collision with root package name */
    public final bk.a f31686d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f31687e;

    /* renamed from: f, reason: collision with root package name */
    public z f31688f;
    public b0 g;

    /* renamed from: h, reason: collision with root package name */
    public int f31689h;

    /* renamed from: i, reason: collision with root package name */
    public d0 f31690i;
    public boolean j;

    public e(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        z zVarB;
        XmlResourceParser xml;
        int next;
        d0 d0Var;
        int next2;
        super(md.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f31683a = new ArrayList();
        this.f31684b = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f31685c = new i(8, materialButtonToggleGroup);
        this.f31686d = new bk.a(2, materialButtonToggleGroup);
        this.j = true;
        Context context2 = getContext();
        TypedArray typedArrayG = m.g(context2, attributeSet, ic.a.f25956q, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayG.hasValue(2)) {
            int resourceId = typedArrayG.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                try {
                    d0Var = new d0();
                    d0Var.f23278c = new int[10][];
                    d0Var.f23279d = new jf.c[10];
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next2 = xml.next();
                        if (next2 == 2) {
                            break;
                        }
                    } while (next2 != 1);
                    if (next2 != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (xml.getName().equals("selector")) {
                        d0Var.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                    }
                    xml.close();
                    this.f31690i = d0Var;
                } finally {
                }
            } else {
                d0Var = null;
                this.f31690i = d0Var;
            }
        }
        if (typedArrayG.hasValue(4)) {
            b0 b0VarB = b0.b(context2, typedArrayG, 4);
            this.g = b0VarB;
            if (b0VarB == null) {
                a0 a0Var = new a0(o.a(context2, typedArrayG.getResourceId(4, 0), typedArrayG.getResourceId(5, 0)).a());
                this.g = a0Var.f23257b != 0 ? new b0(a0Var) : null;
            }
        }
        if (typedArrayG.hasValue(3)) {
            ed.a aVar = new ed.a(0.0f);
            int resourceId2 = typedArrayG.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        zVarB = new z();
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
                            zVarB.d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    zVarB = z.b(aVar);
                }
            } else {
                zVarB = z.b(o.d(typedArrayG, 3, aVar));
            }
            this.f31688f = zVarB;
        }
        this.f31689h = typedArrayG.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayG.getBoolean(0, true));
        typedArrayG.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (c(i4)) {
                return i4;
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
        for (int i4 = firstVisibleChildIndex + 1; i4 < getChildCount(); i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            MaterialButton materialButton2 = (MaterialButton) getChildAt(i4 - 1);
            if (this.f31689h <= 0) {
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
                layoutParams2.setMarginStart(this.f31689h - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.f31689h - iMin;
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
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.j = true;
        super.addView(view, i4, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f31685c);
        this.f31683a.add(materialButton.getShapeAppearanceModel());
        this.f31684b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.f31690i == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i4 = firstVisibleChildIndex; i4 <= lastVisibleChildIndex; i4++) {
            if (c(i4)) {
                if (c(i4) && this.f31690i != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i4);
                    d0 d0Var = this.f31690i;
                    int width = materialButton3.getWidth();
                    int i10 = -width;
                    for (int i11 = 0; i11 < d0Var.f23276a; i11++) {
                        c0 c0Var = (c0) d0Var.f23279d[i11].f27642b;
                        int i12 = c0Var.f23274a;
                        float f10 = c0Var.f23275b;
                        if (i12 == 2) {
                            fMax = Math.max(i10, f10);
                        } else if (i12 == 1) {
                            fMax = Math.max(i10, width * f10);
                        }
                        i10 = (int) fMax;
                    }
                    int iMax = Math.max(0, i10);
                    int i13 = i4 - 1;
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
                    int i14 = i4 + 1;
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
                if (i4 != firstVisibleChildIndex && i4 != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i15 = firstVisibleChildIndex;
        while (i15 <= lastVisibleChildIndex) {
            if (c(i15)) {
                ((MaterialButton) getChildAt(i15)).setSizeChange(this.f31690i);
                ((MaterialButton) getChildAt(i15)).setWidthChangeMax((i15 == firstVisibleChildIndex || i15 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i15++;
        }
    }

    public final boolean c(int i4) {
        return getChildAt(i4).getVisibility() != 8;
    }

    public final void d() {
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            LinearLayout.LayoutParams layoutParams = materialButton.f20397v;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f20397v = null;
                materialButton.f20394s = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f31686d);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            treeMap.put((MaterialButton) getChildAt(i4), Integer.valueOf(i4));
        }
        this.f31687e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [int[][], java.io.Serializable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [ed.o[], java.io.Serializable] */
    public final void e() {
        a0 a0Var;
        int i4;
        if (!(this.f31688f == null && this.g == null) && this.j) {
            this.j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i10 = 0;
            while (i10 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i10);
                if (materialButton.getVisibility() != 8) {
                    boolean z3 = i10 == firstVisibleChildIndex;
                    boolean z10 = i10 == lastVisibleChildIndex;
                    b0 b0Var = this.g;
                    if (b0Var == null || (!z3 && !z10)) {
                        b0Var = (b0) this.f31684b.get(i10);
                    }
                    if (b0Var == null) {
                        a0Var = new a0((o) this.f31683a.get(i10));
                    } else {
                        a0 a0Var2 = new a0(0);
                        int i11 = b0Var.f23266a;
                        a0Var2.f23257b = i11;
                        a0Var2.f23258c = b0Var.f23267b;
                        int[][] iArr = b0Var.f23268c;
                        ?? r14 = new int[iArr.length][];
                        a0Var2.f23259d = r14;
                        o[] oVarArr = b0Var.f23269d;
                        a0Var2.f23260e = new o[oVarArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i11);
                        System.arraycopy(oVarArr, 0, (o[]) a0Var2.f23260e, 0, a0Var2.f23257b);
                        a0Var2.f23261f = b0Var.f23270e;
                        a0Var2.g = b0Var.f23271f;
                        a0Var2.f23262h = b0Var.g;
                        a0Var2.f23263i = b0Var.f23272h;
                        a0Var = a0Var2;
                    }
                    boolean z11 = getOrientation() == 0;
                    boolean z12 = getLayoutDirection() == 1;
                    if (z11) {
                        i4 = z3 ? 5 : 0;
                        if (z10) {
                            i4 |= 10;
                        }
                        if (z12) {
                            i4 = ((i4 & 10) >> 1) | ((i4 & 5) << 1);
                        }
                    } else {
                        i4 = z3 ? 3 : 0;
                        if (z10) {
                            i4 |= 12;
                        }
                    }
                    int i12 = ~i4;
                    z zVar = this.f31688f;
                    if ((i12 | 1) == i12) {
                        a0Var.f23261f = zVar;
                    }
                    if ((i12 | 2) == i12) {
                        a0Var.g = zVar;
                    }
                    if ((i12 | 4) == i12) {
                        a0Var.f23262h = zVar;
                    }
                    if ((i12 | 8) == i12) {
                        a0Var.f23263i = zVar;
                    }
                    b0 b0Var2 = a0Var.f23257b == 0 ? null : new b0(a0Var);
                    if (b0Var2.d()) {
                        materialButton.setStateListShapeAppearanceModel(b0Var2);
                    } else {
                        materialButton.setShapeAppearanceModel(b0Var2.c());
                    }
                }
                i10++;
            }
        }
    }

    public d0 getButtonSizeChange() {
        return this.f31690i;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i4, int i10) {
        Integer[] numArr = this.f31687e;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i10;
    }

    public ed.d getInnerCornerSize() {
        return this.f31688f.f23389b;
    }

    public z getInnerCornerSizeStateList() {
        return this.f31688f;
    }

    public o getShapeAppearance() {
        b0 b0Var = this.g;
        if (b0Var == null) {
            return null;
        }
        return b0Var.c();
    }

    public int getSpacing() {
        return this.f31689h;
    }

    public b0 getStateListShapeAppearance() {
        return this.g;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i4, int i10, int i11, int i12) {
        super.onLayout(z3, i4, i10, i11, i12);
        if (z3) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i10) {
        e();
        a();
        super.onMeasure(i4, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f31683a.remove(iIndexOfChild);
            this.f31684b.remove(iIndexOfChild);
        }
        this.j = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(d0 d0Var) {
        if (this.f31690i != d0Var) {
            this.f31690i = d0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            ((MaterialButton) getChildAt(i4)).setEnabled(z3);
        }
    }

    public void setInnerCornerSize(ed.d dVar) {
        this.f31688f = z.b(dVar);
        this.j = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(z zVar) {
        this.f31688f = zVar;
        this.j = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i4) {
        if (getOrientation() != i4) {
            this.j = true;
        }
        super.setOrientation(i4);
    }

    public void setShapeAppearance(o oVar) {
        a0 a0Var = new a0(oVar);
        this.g = a0Var.f23257b == 0 ? null : new b0(a0Var);
        this.j = true;
        e();
        invalidate();
    }

    public void setSpacing(int i4) {
        this.f31689h = i4;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(b0 b0Var) {
        this.g = b0Var;
        this.j = true;
        e();
        invalidate();
    }
}
