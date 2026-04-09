package com.google.android.material.button;

import L0.C0770a;
import L0.I;
import L0.S;
import M0.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.ashnatech.thirdeye.intruderselfie.backgroundvideorecording.R;
import com.google.android.material.button.MaterialButton;
import d4.j;
import d4.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import l4.C5282a;
import l4.C5290i;
import l4.InterfaceC5284c;
import r4.C5522a;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f22619l = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22620b;

    /* renamed from: c, reason: collision with root package name */
    public final e f22621c;

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashSet<d> f22622d;

    /* renamed from: e, reason: collision with root package name */
    public final a f22623e;

    /* renamed from: f, reason: collision with root package name */
    public Integer[] f22624f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f22625g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f22626h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final int f22627j;

    /* renamed from: k, reason: collision with root package name */
    public HashSet f22628k;

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int iCompareTo = Boolean.valueOf(materialButton3.f22615p).compareTo(Boolean.valueOf(materialButton4.f22615p));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    public class b extends C0770a {
        public b() {
        }

        @Override // L0.C0770a
        public final void d(View view, g gVar) {
            int i;
            this.f3883a.onInitializeAccessibilityNodeInfo(view, gVar.f4122a);
            int i10 = MaterialButtonToggleGroup.f22619l;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (view instanceof MaterialButton) {
                i = 0;
                for (int i11 = 0; i11 < materialButtonToggleGroup.getChildCount(); i11++) {
                    if (materialButtonToggleGroup.getChildAt(i11) == view) {
                        break;
                    }
                    if ((materialButtonToggleGroup.getChildAt(i11) instanceof MaterialButton) && materialButtonToggleGroup.c(i11)) {
                        i++;
                    }
                }
                i = -1;
            } else {
                i = -1;
            }
            gVar.k(g.e.a(((MaterialButton) view).f22615p, 0, 1, i, 1));
        }
    }

    public static class c {

        /* renamed from: e, reason: collision with root package name */
        public static final C5282a f22631e = new C5282a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC5284c f22632a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC5284c f22633b;

        /* renamed from: c, reason: collision with root package name */
        public final InterfaceC5284c f22634c;

        /* renamed from: d, reason: collision with root package name */
        public final InterfaceC5284c f22635d;

        public c(InterfaceC5284c interfaceC5284c, InterfaceC5284c interfaceC5284c2, InterfaceC5284c interfaceC5284c3, InterfaceC5284c interfaceC5284c4) {
            this.f22632a = interfaceC5284c;
            this.f22633b = interfaceC5284c3;
            this.f22634c = interfaceC5284c4;
            this.f22635d = interfaceC5284c2;
        }
    }

    public interface d {
        void a();
    }

    public class e implements MaterialButton.b {
        public e() {
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(C5522a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f22620b = new ArrayList();
        this.f22621c = new e();
        this.f22622d = new LinkedHashSet<>();
        this.f22623e = new a();
        this.f22625g = false;
        this.f22628k = new HashSet();
        TypedArray typedArrayD = j.d(getContext(), attributeSet, K3.a.f3125m, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayD.getBoolean(3, false));
        this.f22627j = typedArrayD.getResourceId(1, -1);
        this.i = typedArrayD.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayD.getBoolean(0, true));
        typedArrayD.recycle();
        WeakHashMap<View, S> weakHashMap = I.f3792a;
        setImportantForAccessibility(1);
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

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && c(i10)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap<View, S> weakHashMap = I.f3792a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f22621c);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
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
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        b(materialButton.getId(), materialButton.f22615p);
        C5290i shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f22620b.add(new c(shapeAppearanceModel.f43804e, shapeAppearanceModel.f43807h, shapeAppearanceModel.f43805f, shapeAppearanceModel.f43806g));
        materialButton.setEnabled(isEnabled());
        I.o(materialButton, new b());
    }

    public final void b(int i, boolean z10) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f22628k);
        if (z10 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f22626h && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.i || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void d(Set<Integer> set) {
        HashSet hashSet = this.f22628k;
        this.f22628k = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f22625g = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f22625g = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator<d> it = this.f22622d.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f22623e);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f22624f = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final void e() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                C5290i.a aVarE = materialButton.getShapeAppearanceModel().e();
                c cVar2 = (c) this.f22620b.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z10 = getOrientation() == 0;
                    C5282a c5282a = c.f22631e;
                    if (i == firstVisibleChildIndex) {
                        cVar = z10 ? n.a(this) ? new c(c5282a, c5282a, cVar2.f22633b, cVar2.f22634c) : new c(cVar2.f22632a, cVar2.f22635d, c5282a, c5282a) : new c(cVar2.f22632a, c5282a, cVar2.f22633b, c5282a);
                    } else if (i == lastVisibleChildIndex) {
                        cVar = z10 ? n.a(this) ? new c(cVar2.f22632a, cVar2.f22635d, c5282a, c5282a) : new c(c5282a, c5282a, cVar2.f22633b, cVar2.f22634c) : new c(c5282a, cVar2.f22635d, c5282a, cVar2.f22634c);
                    } else {
                        cVar2 = null;
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    aVarE.f43815e = new C5282a(0.0f);
                    aVarE.f43816f = new C5282a(0.0f);
                    aVarE.f43817g = new C5282a(0.0f);
                    aVarE.f43818h = new C5282a(0.0f);
                } else {
                    aVarE.f43815e = cVar2.f22632a;
                    aVarE.f43818h = cVar2.f22635d;
                    aVarE.f43816f = cVar2.f22633b;
                    aVarE.f43817g = cVar2.f22634c;
                }
                materialButton.setShapeAppearanceModel(aVarE.a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f22626h || this.f22628k.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f22628k.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f22628k.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i10) {
        Integer[] numArr = this.f22624f;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i10;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f22627j;
        if (i != -1) {
            d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f22626h ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        e();
        a();
        super.onMeasure(i, i10);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f22620b.remove(iIndexOfChild);
        }
        e();
        a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.i = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f22626h != z10) {
            this.f22626h = z10;
            d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f22626h ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
