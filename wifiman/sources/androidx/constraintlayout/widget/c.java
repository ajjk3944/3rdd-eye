package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import o1.C7049e;
import o1.InterfaceC7053i;

/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: a, reason: collision with root package name */
    protected int[] f30153a;

    /* renamed from: b, reason: collision with root package name */
    protected int f30154b;

    /* renamed from: c, reason: collision with root package name */
    protected Context f30155c;

    /* renamed from: d, reason: collision with root package name */
    protected InterfaceC7053i f30156d;

    /* renamed from: e, reason: collision with root package name */
    protected boolean f30157e;

    /* renamed from: f, reason: collision with root package name */
    protected String f30158f;

    /* renamed from: g, reason: collision with root package name */
    private View[] f30159g;

    /* renamed from: h, reason: collision with root package name */
    private HashMap f30160h;

    public c(Context context) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context);
        this.f30153a = new int[32];
        this.f30157e = false;
        this.f30159g = null;
        this.f30160h = new HashMap();
        this.f30155c = context;
        g(null);
    }

    private void a(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (str == null || str.length() == 0 || this.f30155c == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iF = f(strTrim);
        if (iF != 0) {
            this.f30160h.put(Integer.valueOf(iF), strTrim);
            b(iF);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f30154b + 1;
        int[] iArr = this.f30153a;
        if (i11 > iArr.length) {
            this.f30153a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f30153a;
        int i12 = this.f30154b;
        iArr2[i12] = i10;
        this.f30154b = i12 + 1;
    }

    private int e(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str == null || constraintLayout == null || (resources = this.f30155c.getResources()) == null) {
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

    private int f(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iE = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objF = constraintLayout.f(0, str);
            if (objF instanceof Integer) {
                iE = ((Integer) objF).intValue();
            }
        }
        if (iE == 0 && constraintLayout != null) {
            iE = e(constraintLayout, str);
        }
        if (iE == 0) {
            try {
                iE = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iE == 0 ? this.f30155c.getResources().getIdentifier(str, "id", this.f30155c.getPackageName()) : iE;
    }

    protected void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    protected void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f30154b; i10++) {
            View viewH = constraintLayout.h(this.f30153a[i10]);
            if (viewH != null) {
                viewH.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewH.setTranslationZ(viewH.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void g(AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f30435a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f30568t1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f30158f = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f30153a, this.f30154b);
    }

    public abstract void h(C7049e c7049e, boolean z10);

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        String str;
        int iE;
        if (isInEditMode()) {
            setIds(this.f30158f);
        }
        InterfaceC7053i interfaceC7053i = this.f30156d;
        if (interfaceC7053i == null) {
            return;
        }
        interfaceC7053i.b();
        for (int i10 = 0; i10 < this.f30154b; i10++) {
            int i11 = this.f30153a[i10];
            View viewH = constraintLayout.h(i11);
            if (viewH == null && (iE = e(constraintLayout, (str = (String) this.f30160h.get(Integer.valueOf(i11))))) != 0) {
                this.f30153a[i10] = iE;
                this.f30160h.put(Integer.valueOf(iE), str);
                viewH = constraintLayout.h(iE);
            }
            if (viewH != null) {
                this.f30156d.a(constraintLayout.i(viewH));
            }
        }
        this.f30156d.c(constraintLayout.f30044c);
    }

    public void m() {
        if (this.f30156d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f30119n0 = (C7049e) this.f30156d;
        }
    }

    @Override // android.view.View
    protected void onAttachedToWindow() throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super.onAttachedToWindow();
        String str = this.f30158f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f30157e) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        this.f30158f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f30154b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i10);
            if (iIndexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, iIndexOf));
                i10 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f30158f = null;
        this.f30154b = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    public c(Context context, AttributeSet attributeSet) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        super(context, attributeSet);
        this.f30153a = new int[32];
        this.f30157e = false;
        this.f30159g = null;
        this.f30160h = new HashMap();
        this.f30155c = context;
        g(attributeSet);
    }
}
