package l3;

import A2.C0117e;
import G3.C0147a;
import G3.E;
import G3.F;
import G3.G;
import G3.H;
import G3.I;
import G3.InterfaceC0150d;
import G3.o;
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
import com.apm.insight.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import d3.AbstractC2266a;
import h0.C2352b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import x3.AbstractC2993B;

/* renamed from: l3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2645d extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f21828a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f21829b;

    /* renamed from: c, reason: collision with root package name */
    public final C2352b f21830c;

    /* renamed from: d, reason: collision with root package name */
    public final C2644c f21831d;

    /* renamed from: e, reason: collision with root package name */
    public Integer[] f21832e;

    /* renamed from: f, reason: collision with root package name */
    public E f21833f;

    /* renamed from: g, reason: collision with root package name */
    public G f21834g;

    /* renamed from: h, reason: collision with root package name */
    public int f21835h;
    public I i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21836j;

    /* JADX WARN: Type inference failed for: r12v5, types: [l3.c] */
    public AbstractC2645d(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        E eB;
        XmlResourceParser xml;
        int next;
        I i;
        AttributeSet attributeSetAsAttributeSet;
        int next2;
        super(O3.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f21828a = new ArrayList();
        this.f21829b = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f21830c = new C2352b(5, materialButtonToggleGroup);
        this.f21831d = new Comparator() { // from class: l3.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f18173C).compareTo(Boolean.valueOf(materialButton2.f18173C));
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
        this.f21836j = true;
        Context context2 = getContext();
        TypedArray typedArrayI = AbstractC2993B.i(context2, attributeSet, AbstractC2266a.f19766u, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayI.hasValue(2)) {
            int resourceId = typedArrayI.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        i = new I();
                        i.f1552c = new int[10][];
                        i.f1553d = new C0117e[10];
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
                    i.a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                }
                xml.close();
                this.i = i;
            } else {
                i = null;
                this.i = i;
            }
        }
        if (typedArrayI.hasValue(4)) {
            G gB = G.b(context2, typedArrayI, 4);
            this.f21834g = gB;
            if (gB == null) {
                F f2 = new F(o.a(context2, typedArrayI.getResourceId(4, 0), typedArrayI.getResourceId(5, 0)).a());
                this.f21834g = f2.f1532a != 0 ? new G(f2) : null;
            }
        }
        if (typedArrayI.hasValue(3)) {
            C0147a c0147a = new C0147a(0.0f);
            int resourceId2 = typedArrayI.getResourceId(3, 0);
            if (resourceId2 != 0 && context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId2);
                    try {
                        eB = new E();
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
                            eB.d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    eB = E.b(c0147a);
                }
            } else {
                eB = E.b(o.d(typedArrayI, 3, c0147a));
            }
            this.f21833f = eB;
        }
        this.f21835h = typedArrayI.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayI.getBoolean(0, true));
        typedArrayI.recycle();
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
            if (this.f21835h <= 0) {
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
                layoutParams2.setMarginStart(this.f21835h - iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = this.f21835h - iMin;
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
        this.f21836j = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f21830c);
        this.f21828a.add(materialButton.getShapeAppearanceModel());
        this.f21829b.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        float fMax;
        if (this.i == null || getChildCount() == 0) {
            return;
        }
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        int iMin = Integer.MAX_VALUE;
        for (int i = firstVisibleChildIndex; i <= lastVisibleChildIndex; i++) {
            if (c(i)) {
                if (c(i) && this.i != null) {
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i);
                    I i3 = this.i;
                    int width = materialButton3.getWidth();
                    int i6 = -width;
                    for (int i7 = 0; i7 < i3.f1550a; i7++) {
                        H h6 = (H) i3.f1553d[i7].f245b;
                        int i8 = h6.f1548a;
                        float f2 = h6.f1549b;
                        if (i8 == 2) {
                            fMax = Math.max(i6, f2);
                        } else if (i8 == 1) {
                            fMax = Math.max(i6, width * f2);
                        }
                        i6 = (int) fMax;
                    }
                    int iMax = Math.max(0, i6);
                    int i9 = i - 1;
                    while (true) {
                        materialButton = null;
                        if (i9 < 0) {
                            materialButton2 = null;
                            break;
                        } else {
                            if (c(i9)) {
                                materialButton2 = (MaterialButton) getChildAt(i9);
                                break;
                            }
                            i9--;
                        }
                    }
                    int allowedWidthDecrease = materialButton2 == null ? 0 : materialButton2.getAllowedWidthDecrease();
                    int childCount = getChildCount();
                    int i10 = i + 1;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        }
                        if (c(i10)) {
                            materialButton = (MaterialButton) getChildAt(i10);
                            break;
                        }
                        i10++;
                    }
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButton != null ? materialButton.getAllowedWidthDecrease() : 0));
                }
                if (i != firstVisibleChildIndex && i != lastVisibleChildIndex) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
        }
        int i11 = firstVisibleChildIndex;
        while (i11 <= lastVisibleChildIndex) {
            if (c(i11)) {
                ((MaterialButton) getChildAt(i11)).setSizeChange(this.i);
                ((MaterialButton) getChildAt(i11)).setWidthChangeMax((i11 == firstVisibleChildIndex || i11 == lastVisibleChildIndex) ? iMin : iMin * 2);
            }
            i11++;
        }
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.f18180J;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f18180J = null;
                materialButton.f18177G = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f21831d);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f21832e = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        F f2;
        int i;
        if (!(this.f21833f == null && this.f21834g == null) && this.f21836j) {
            this.f21836j = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i3 = 0;
            while (i3 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i3);
                if (materialButton.getVisibility() != 8) {
                    boolean z6 = i3 == firstVisibleChildIndex;
                    boolean z7 = i3 == lastVisibleChildIndex;
                    G g2 = this.f21834g;
                    if (g2 == null || (!z6 && !z7)) {
                        g2 = (G) this.f21829b.get(i3);
                    }
                    if (g2 == null) {
                        f2 = new F((o) this.f21828a.get(i3));
                    } else {
                        F f5 = new F();
                        int i6 = g2.f1540a;
                        f5.f1532a = i6;
                        f5.f1533b = g2.f1541b;
                        int[][] iArr = g2.f1542c;
                        int[][] iArr2 = new int[iArr.length][];
                        f5.f1534c = iArr2;
                        o[] oVarArr = g2.f1543d;
                        f5.f1535d = new o[oVarArr.length];
                        System.arraycopy(iArr, 0, iArr2, 0, i6);
                        System.arraycopy(oVarArr, 0, f5.f1535d, 0, f5.f1532a);
                        f5.f1536e = g2.f1544e;
                        f5.f1537f = g2.f1545f;
                        f5.f1538g = g2.f1546g;
                        f5.f1539h = g2.f1547h;
                        f2 = f5;
                    }
                    boolean z8 = getOrientation() == 0;
                    boolean z9 = getLayoutDirection() == 1;
                    if (z8) {
                        i = z6 ? 5 : 0;
                        if (z7) {
                            i |= 10;
                        }
                        if (z9) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        i = z6 ? 3 : 0;
                        if (z7) {
                            i |= 12;
                        }
                    }
                    int i7 = ~i;
                    E e6 = this.f21833f;
                    if ((i7 | 1) == i7) {
                        f2.f1536e = e6;
                    }
                    if ((i7 | 2) == i7) {
                        f2.f1537f = e6;
                    }
                    if ((i7 | 4) == i7) {
                        f2.f1538g = e6;
                    }
                    if ((i7 | 8) == i7) {
                        f2.f1539h = e6;
                    }
                    G g6 = f2.f1532a == 0 ? null : new G(f2);
                    if (g6.d()) {
                        materialButton.setStateListShapeAppearanceModel(g6);
                    } else {
                        materialButton.setShapeAppearanceModel(g6.c());
                    }
                }
                i3++;
            }
        }
    }

    public I getButtonSizeChange() {
        return this.i;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i3) {
        Integer[] numArr = this.f21832e;
        if (numArr != null && i3 < numArr.length) {
            return numArr[i3].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i3;
    }

    public InterfaceC0150d getInnerCornerSize() {
        return this.f21833f.f1529b;
    }

    public E getInnerCornerSizeStateList() {
        return this.f21833f;
    }

    public o getShapeAppearance() {
        G g2 = this.f21834g;
        if (g2 == null) {
            return null;
        }
        return g2.c();
    }

    public int getSpacing() {
        return this.f21835h;
    }

    public G getStateListShapeAppearance() {
        return this.f21834g;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i3, int i6, int i7) {
        super.onLayout(z6, i, i3, i6, i7);
        if (z6) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i3) {
        e();
        a();
        super.onMeasure(i, i3);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f21828a.remove(iIndexOfChild);
            this.f21829b.remove(iIndexOfChild);
        }
        this.f21836j = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(I i) {
        if (this.i != i) {
            this.i = i;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z6);
        }
    }

    public void setInnerCornerSize(InterfaceC0150d interfaceC0150d) {
        this.f21833f = E.b(interfaceC0150d);
        this.f21836j = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(E e6) {
        this.f21833f = e6;
        this.f21836j = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.f21836j = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(o oVar) {
        F f2 = new F(oVar);
        this.f21834g = f2.f1532a == 0 ? null : new G(f2);
        this.f21836j = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f21835h = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(G g2) {
        this.f21834g = g2;
        this.f21836j = true;
        e();
        invalidate();
    }
}
