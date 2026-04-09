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
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.a0;
import j4.k;
import j4.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import s0.x;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends d {

    /* renamed from: r, reason: collision with root package name */
    public static final int f10078r = k.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f10079l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10080m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10081n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10082o;

    /* renamed from: p, reason: collision with root package name */
    public final int f10083p;

    /* renamed from: q, reason: collision with root package name */
    public Set f10084q;

    public class a extends androidx.core.view.a {
        public a() {
        }

        @Override // androidx.core.view.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.p0(x.f.a(0, 1, MaterialButtonToggleGroup.this.u(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public interface b {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10);
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private String getChildrenA11yClassName() {
        return (this.f10081n ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && j(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // com.google.android.material.button.d, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i10, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        r(materialButton.getId(), materialButton.isChecked());
        ViewCompat.j0(materialButton, new a());
    }

    @IdRes
    public int getCheckedButtonId() {
        if (!this.f10081n || this.f10084q.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f10084q.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = f(i10).getId();
            if (this.f10084q.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    public final boolean j(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f10083p;
        if (i10 != -1) {
            y(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        x.R0(accessibilityNodeInfo).o0(x.e.b(1, getVisibleButtonCount(), false, v() ? 1 : 2));
    }

    public void q(b bVar) {
        this.f10079l.add(bVar);
    }

    public final void r(int i10, boolean z10) {
        if (i10 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i10);
            return;
        }
        HashSet hashSet = new HashSet(this.f10084q);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.f10081n && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f10082o || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        y(hashSet);
    }

    public void s() {
        y(new HashSet());
    }

    public void setSelectionRequired(boolean z10) {
        this.f10082o = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f10081n != z10) {
            this.f10081n = z10;
            s();
        }
        z();
    }

    public final void t(int i10, boolean z10) {
        Iterator it = this.f10079l.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(this, i10, z10);
        }
    }

    public final int u(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if (getChildAt(i11) == view) {
                return i10;
            }
            if ((getChildAt(i11) instanceof MaterialButton) && j(i11)) {
                i10++;
            }
        }
        return -1;
    }

    public boolean v() {
        return this.f10081n;
    }

    public void w(MaterialButton materialButton, boolean z10) {
        if (this.f10080m) {
            return;
        }
        r(materialButton.getId(), z10);
    }

    public final void x(int i10, boolean z10) {
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById instanceof MaterialButton) {
            this.f10080m = true;
            ((MaterialButton) viewFindViewById).setChecked(z10);
            this.f10080m = false;
        }
    }

    public final void y(Set set) {
        Set set2 = this.f10084q;
        this.f10084q = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = f(i10).getId();
            x(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                t(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    public final void z() {
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            f(i10).setA11yClassName(childrenA11yClassName);
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, j4.b.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = f10078r;
        super(l5.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f10079l = new LinkedHashSet();
        this.f10080m = false;
        this.f10084q = new HashSet();
        TypedArray typedArrayI = a0.i(getContext(), attributeSet, l.MaterialButtonToggleGroup, i10, i11, new int[0]);
        setSingleSelection(typedArrayI.getBoolean(l.MaterialButtonToggleGroup_singleSelection, false));
        this.f10083p = typedArrayI.getResourceId(l.MaterialButtonToggleGroup_checkedButton, -1);
        this.f10082o = typedArrayI.getBoolean(l.MaterialButtonToggleGroup_selectionRequired, false);
        if (this.f10095f == null) {
            this.f10095f = com.google.android.material.shape.d.c(new g5.a(0.0f));
        }
        setEnabled(typedArrayI.getBoolean(l.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayI.recycle();
        setImportantForAccessibility(1);
    }

    public void setSingleSelection(@BoolRes int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
