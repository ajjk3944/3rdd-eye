package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import r0.C5508e;
import r0.C5512i;

/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: b, reason: collision with root package name */
    public int[] f15304b;

    /* renamed from: c, reason: collision with root package name */
    public int f15305c;

    /* renamed from: d, reason: collision with root package name */
    public Context f15306d;

    /* renamed from: e, reason: collision with root package name */
    public C5512i f15307e;

    /* renamed from: f, reason: collision with root package name */
    public String f15308f;

    /* renamed from: g, reason: collision with root package name */
    public String f15309g;

    /* renamed from: h, reason: collision with root package name */
    public View[] f15310h;
    public HashMap<Integer, String> i;

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15304b = new int[32];
        this.f15310h = null;
        this.i = new HashMap<>();
        this.f15306d = context;
        g(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            if (r6 == 0) goto Laa
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto Laa
        La:
            android.content.Context r0 = r5.f15306d
            if (r0 != 0) goto L10
            goto Laa
        L10:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L22
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L22:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L32
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L33
        L32:
            r1 = r2
        L33:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5e
            if (r1 == 0) goto L5e
            boolean r3 = androidx.work.s.n(r6)
            if (r3 == 0) goto L52
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.f15208n
            if (r3 == 0) goto L52
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L52
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r1.f15208n
            java.lang.Object r3 = r3.get(r6)
            goto L53
        L52:
            r3 = r2
        L53:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5e
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5f
        L5e:
            r3 = 0
        L5f:
            if (r3 != 0) goto L67
            if (r1 == 0) goto L67
            int r3 = r5.f(r1, r6)
        L67:
            if (r3 != 0) goto L73
            java.lang.Class<u0.c> r1 = u0.c.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L73
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L73
        L73:
            if (r3 != 0) goto L83
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L83:
            if (r3 == 0) goto L92
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.util.HashMap<java.lang.Integer, java.lang.String> r1 = r5.i
            r1.put(r0, r6)
            r5.b(r3)
            goto Laa
        L92:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.c.a(java.lang.String):void");
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i10 = this.f15305c + 1;
        int[] iArr = this.f15304b;
        if (i10 > iArr.length) {
            this.f15304b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f15304b;
        int i11 = this.f15305c;
        iArr2[i11] = i;
        this.f15305c = i11 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f15306d == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).f15238Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f15305c; i++) {
            View view = constraintLayout.f15197b.get(this.f15304b[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f15306d.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
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
        }
        return 0;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, u0.d.f46499b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f15308f = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f15309g = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f15304b, this.f15305c);
    }

    public final void i() {
        if (this.f15307e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f15272q0 = this.f15307e;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f15308f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f15309g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f15308f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f15305c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f15309g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f15305c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f15308f = null;
        this.f15305c = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f15308f == null) {
            b(i);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void h(C5508e c5508e, boolean z10) {
    }
}
