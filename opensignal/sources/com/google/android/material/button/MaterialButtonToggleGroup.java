package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.timepicker.i;
import ed.k;
import ed.l;
import ee.w;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import u3.i0;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends b {
    public static final int N = k.Widget_MaterialComponents_MaterialButtonToggleGroup;
    public final LinkedHashSet H;
    public boolean I;
    public boolean J;
    public boolean K;
    public final int L;
    public HashSet M;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        int i10 = ed.b.materialButtonToggleGroupStyle;
        int i11 = N;
        super(le.a.a(context, attributeSet, i10, i11), attributeSet, i10);
        this.H = new LinkedHashSet();
        this.I = false;
        this.M = new HashSet();
        TypedArray typedArrayD = xd.k.d(getContext(), attributeSet, l.MaterialButtonToggleGroup, i10, i11, new int[0]);
        setSingleSelection(typedArrayD.getBoolean(l.MaterialButtonToggleGroup_singleSelection, false));
        this.L = typedArrayD.getResourceId(l.MaterialButtonToggleGroup_checkedButton, -1);
        this.K = typedArrayD.getBoolean(l.MaterialButtonToggleGroup_selectionRequired, false);
        if (this.f5561y == null) {
            this.f5561y = w.b(new ee.a(0.0f));
        }
        setEnabled(typedArrayD.getBoolean(l.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayD.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.J ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && getChildAt(i11).getVisibility() != 8) {
                i10++;
            }
        }
        return i10;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // com.google.android.material.button.b, android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            e0.d("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.K);
        i0.n(materialButton, new com.google.android.material.datepicker.k(2, this));
    }

    public final void f(int i10, boolean z10) {
        if (i10 == -1) {
            e0.d("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.M);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.J && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.K || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.M;
        this.M = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = ((MaterialButton) getChildAt(i10)).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.I = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.I = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.H.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.J || this.M.isEmpty()) {
            return -1;
        }
        return ((Integer) this.M.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id2 = ((MaterialButton) getChildAt(i10)).getId();
            if (this.M.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.L;
        if (i10 != -1) {
            g(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) a2.a.a(1, getVisibleButtonCount(), this.J ? 1 : 2).f28a);
    }

    public void setSelectionRequired(boolean z10) {
        this.K = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.J != z10) {
            this.J = z10;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
