package com.google.android.material.button;

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
import com.google.android.material.datepicker.j;
import com.google.android.material.timepicker.i;
import com.liuzh.deviceinfo.R;
import e4.v0;
import ed.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import md.a;
import o7.d;
import pc.e;
import zc.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class MaterialButtonToggleGroup extends e {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f20402q = 0;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashSet f20403k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f20404l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f20405m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f20406n;

    /* renamed from: o, reason: collision with root package name */
    public final int f20407o;

    /* renamed from: p, reason: collision with root package name */
    public HashSet f20408p;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f20403k = new LinkedHashSet();
        this.f20404l = false;
        this.f20408p = new HashSet();
        TypedArray typedArrayG = m.g(getContext(), attributeSet, ic.a.f25957r, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayG.getBoolean(7, false));
        this.f20407o = typedArrayG.getResourceId(2, -1);
        this.f20406n = typedArrayG.getBoolean(4, false);
        if (this.f31688f == null) {
            this.f31688f = z.b(new ed.a(0.0f));
        }
        setEnabled(typedArrayG.getBoolean(0, true));
        typedArrayG.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f20405m ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i4 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && getChildAt(i10).getVisibility() != 8) {
                i4++;
            }
        }
        return i4;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // pc.e, android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i4, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.f20390o);
        v0.o(materialButton, new j(3, this));
    }

    public final void f(int i4, boolean z3) {
        if (i4 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i4);
            return;
        }
        HashSet hashSet = new HashSet(this.f20408p);
        if (z3 && !hashSet.contains(Integer.valueOf(i4))) {
            if (this.f20405m && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i4));
        } else {
            if (z3 || !hashSet.contains(Integer.valueOf(i4))) {
                return;
            }
            if (!this.f20406n || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i4));
            }
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.f20408p;
        this.f20408p = new HashSet(set);
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id2 = ((MaterialButton) getChildAt(i4)).getId();
            boolean zContains = set.contains(Integer.valueOf(id2));
            View viewFindViewById = findViewById(id2);
            if (viewFindViewById instanceof MaterialButton) {
                this.f20404l = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f20404l = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.f20403k.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (!this.f20405m || this.f20408p.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f20408p.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            int id2 = ((MaterialButton) getChildAt(i4)).getId();
            if (this.f20408p.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f20407o;
        if (i4 != -1) {
            g(Collections.singleton(Integer.valueOf(i4)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) d.n(1, getVisibleButtonCount(), this.f20405m ? 1 : 2, false).f30421b);
    }

    public void setSelectionRequired(boolean z3) {
        this.f20406n = z3;
    }

    public void setSingleSelection(boolean z3) {
        if (this.f20405m != z3) {
            this.f20405m = z3;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            ((MaterialButton) getChildAt(i4)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i4) {
        setSingleSelection(getResources().getBoolean(i4));
    }
}
