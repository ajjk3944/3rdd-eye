package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f2179a;

    /* renamed from: b, reason: collision with root package name */
    public int f2180b;

    /* renamed from: c, reason: collision with root package name */
    public Context f2181c;

    /* renamed from: d, reason: collision with root package name */
    public x.a f2182d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2183e;

    /* renamed from: f, reason: collision with root package name */
    public String f2184f;

    /* renamed from: g, reason: collision with root package name */
    public String f2185g;

    /* renamed from: h, reason: collision with root package name */
    public View[] f2186h;

    /* renamed from: i, reason: collision with root package name */
    public HashMap f2187i;

    public b(Context context) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context);
        this.f2179a = new int[32];
        this.f2183e = false;
        this.f2186h = null;
        this.f2187i = new HashMap();
        this.f2181c = context;
        n(null);
    }

    public final void d(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f2181c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iL = l(strTrim);
        if (iL != 0) {
            this.f2187i.put(Integer.valueOf(iL), strTrim);
            e(iL);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    public final void e(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f2180b + 1;
        int[] iArr = this.f2179a;
        if (i11 > iArr.length) {
            this.f2179a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2179a;
        int i12 = this.f2180b;
        iArr2[i12] = i10;
        this.f2180b = i12 + 1;
    }

    public final void f(String str) {
        if (str == null || str.length() == 0 || this.f2181c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f2122b0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    e(childAt.getId());
                }
            }
        }
    }

    public void g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2179a, this.f2180b);
    }

    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f2180b; i10++) {
            View viewL = constraintLayout.l(this.f2179a[i10]);
            if (viewL != null) {
                viewL.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewL.setTranslationZ(viewL.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public final int[] j(View view, String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String[] strArrSplit = str.split(",");
        view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        for (String str2 : strArrSplit) {
            int iL = l(str2.trim());
            if (iL != 0) {
                iArr[i10] = iL;
                i10++;
            }
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    public final int k(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f2181c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    resourceEntryName = null;
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int l(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iK = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objG = constraintLayout.g(0, str);
            if (objG instanceof Integer) {
                iK = ((Integer) objG).intValue();
            }
        }
        if (iK == 0 && constraintLayout != null) {
            iK = k(constraintLayout, str);
        }
        if (iK == 0) {
            try {
                iK = b0.c.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iK == 0 ? this.f2181c.getResources().getIdentifier(str, "id", this.f2181c.getPackageName()) : iK;
    }

    public View[] m(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2186h;
        if (viewArr == null || viewArr.length != this.f2180b) {
            this.f2186h = new View[this.f2180b];
        }
        for (int i10 = 0; i10 < this.f2180b; i10++) {
            this.f2186h[i10] = constraintLayout.l(this.f2179a[i10]);
        }
        return this.f2186h;
    }

    public void n(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b0.d.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == b0.d.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f2184f = string;
                    setIds(string);
                } else if (index == b0.d.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f2185g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void o(c.a aVar, x.b bVar, ConstraintLayout.b bVar2, SparseArray sparseArray) {
        c.b bVar3 = aVar.f2202e;
        int[] iArr = bVar3.f2238j0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar3.f2240k0;
            if (str != null && str.length() > 0) {
                c.b bVar4 = aVar.f2202e;
                bVar4.f2238j0 = j(this, bVar4.f2240k0);
            }
        }
        bVar.b();
        if (aVar.f2202e.f2238j0 == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            int[] iArr2 = aVar.f2202e.f2238j0;
            if (i10 >= iArr2.length) {
                return;
            }
            ConstraintWidget constraintWidget = (ConstraintWidget) sparseArray.get(iArr2[i10]);
            if (constraintWidget != null) {
                bVar.a(constraintWidget);
            }
            i10++;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f2184f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f2185g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f2183e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintWidget constraintWidget, boolean z10) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void s(ConstraintLayout constraintLayout) {
    }

    public void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f2184f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2180b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                d(str.substring(i10));
                return;
            } else {
                d(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f2185g = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2180b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                f(str.substring(i10));
                return;
            } else {
                f(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2184f = null;
        this.f2180b = 0;
        for (int i10 : iArr) {
            e(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f2184f == null) {
            e(i10);
        }
    }

    public void t(androidx.constraintlayout.core.widgets.d dVar, x.a aVar, SparseArray sparseArray) {
        aVar.b();
        for (int i10 = 0; i10 < this.f2180b; i10++) {
            aVar.a((ConstraintWidget) sparseArray.get(this.f2179a[i10]));
        }
    }

    public void u(ConstraintLayout constraintLayout) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String str;
        int iK;
        if (isInEditMode()) {
            setIds(this.f2184f);
        }
        x.a aVar = this.f2182d;
        if (aVar == null) {
            return;
        }
        aVar.b();
        for (int i10 = 0; i10 < this.f2180b; i10++) {
            int i11 = this.f2179a[i10];
            View viewL = constraintLayout.l(i11);
            if (viewL == null && (iK = k(constraintLayout, (str = (String) this.f2187i.get(Integer.valueOf(i11))))) != 0) {
                this.f2179a[i10] = iK;
                this.f2187i.put(Integer.valueOf(iK), str);
                viewL = constraintLayout.l(iK);
            }
            if (viewL != null) {
                this.f2182d.a(constraintLayout.p(viewL));
            }
        }
        this.f2182d.c(constraintLayout.f2097c);
    }

    public void v() {
        if (this.f2182d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f2160u0 = (ConstraintWidget) this.f2182d;
        }
    }

    public b(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f2179a = new int[32];
        this.f2183e = false;
        this.f2186h = null;
        this.f2187i = new HashMap();
        this.f2181c = context;
        n(attributeSet);
    }

    public b(Context context, AttributeSet attributeSet, int i10) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet, i10);
        this.f2179a = new int[32];
        this.f2183e = false;
        this.f2186h = null;
        this.f2187i = new HashMap();
        this.f2181c = context;
        n(attributeSet);
    }
}
