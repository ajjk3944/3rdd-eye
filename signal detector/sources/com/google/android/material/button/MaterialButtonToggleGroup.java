package com.google.android.material.button;

import G3.C0147a;
import G3.E;
import J3.e;
import O3.a;
import R.O;
import U0.j;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.apm.insight.R;
import com.google.android.material.timepicker.i;
import d3.AbstractC2266a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import l3.AbstractC2645d;
import x3.AbstractC2993B;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends AbstractC2645d {

    /* renamed from: E, reason: collision with root package name */
    public static final /* synthetic */ int f18199E = 0;

    /* renamed from: C, reason: collision with root package name */
    public final int f18200C;

    /* renamed from: D, reason: collision with root package name */
    public HashSet f18201D;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f18202k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18203l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18204m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18205n;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f18202k = new LinkedHashSet();
        this.f18203l = false;
        this.f18201D = new HashSet();
        TypedArray typedArrayI = AbstractC2993B.i(getContext(), attributeSet, AbstractC2266a.f19767v, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(7, false));
        this.f18200C = typedArrayI.getResourceId(2, -1);
        this.f18205n = typedArrayI.getBoolean(4, false);
        if (this.f21833f == null) {
            this.f21833f = E.b(new C0147a(0.0f));
        }
        setEnabled(typedArrayI.getBoolean(0, true));
        typedArrayI.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f18204m ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            if ((getChildAt(i3) instanceof MaterialButton) && getChildAt(i3).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // l3.AbstractC2645d, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.f18173C);
        O.m(materialButton, new e(3, this));
    }

    public final void f(int i, boolean z6) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f18201D);
        if (z6 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f18204m && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z6 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f18205n || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.f18201D;
        this.f18201D = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f18203l = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f18203l = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f18202k.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.f18204m || this.f18201D.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f18201D.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f18201D.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f18200C;
        if (i != -1) {
            g(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) j.q(1, getVisibleButtonCount(), this.f18204m ? 1 : 2, false).f3677b);
    }

    public void setSelectionRequired(boolean z6) {
        this.f18205n = z6;
    }

    public void setSingleSelection(boolean z6) {
        if (this.f18204m != z6) {
            this.f18204m = z6;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
