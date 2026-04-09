package n3;

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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f29572a;

    /* renamed from: b, reason: collision with root package name */
    public int f29573b;

    /* renamed from: c, reason: collision with root package name */
    public Context f29574c;

    /* renamed from: d, reason: collision with root package name */
    public k3.i f29575d;

    /* renamed from: e, reason: collision with root package name */
    public String f29576e;

    /* renamed from: f, reason: collision with root package name */
    public String f29577f;
    public HashMap g;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29572a = new int[32];
        this.g = new HashMap();
        this.f29574c = context;
        g(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            android.content.Context r0 = r5.f29574c
            if (r6 == 0) goto L9c
            int r1 = r6.length()
            if (r1 != 0) goto Lc
            goto L9c
        Lc:
            if (r0 != 0) goto L10
            goto L9c
        L10:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L24
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L25
        L24:
            r1 = r2
        L25:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L50
            if (r1 == 0) goto L50
            boolean r3 = a0.g.C(r6)
            if (r3 == 0) goto L44
            java.util.HashMap r3 = r1.f867m
            if (r3 == 0) goto L44
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L44
            java.util.HashMap r3 = r1.f867m
            java.lang.Object r3 = r3.get(r6)
            goto L45
        L44:
            r3 = r2
        L45:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L50
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L51
        L50:
            r3 = 0
        L51:
            if (r3 != 0) goto L59
            if (r1 == 0) goto L59
            int r3 = r5.f(r1, r6)
        L59:
            if (r3 != 0) goto L65
            java.lang.Class<n3.p> r1 = n3.p.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L65
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L65
        L65:
            if (r3 != 0) goto L75
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L75:
            if (r3 == 0) goto L84
            java.util.HashMap r0 = r5.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.b(r3)
            goto L9c
        L84:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.b.a(java.lang.String):void");
    }

    public final void b(int i4) {
        if (i4 == getId()) {
            return;
        }
        int i10 = this.f29573b + 1;
        int[] iArr = this.f29572a;
        if (i10 > iArr.length) {
            this.f29572a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f29572a;
        int i11 = this.f29573b;
        iArr2[i11] = i4;
        this.f29573b = i11 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f29574c == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = constraintLayout.getChildAt(i4);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof d) && strTrim.equals(((d) layoutParams).Y)) {
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
        for (int i4 = 0; i4 < this.f29573b; i4++) {
            View view = (View) constraintLayout.f857a.get(this.f29572a[i4]);
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
        if (str != null && (resources = this.f29574c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = constraintLayout.getChildAt(i4);
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
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f29721b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i4);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f29576e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f29577f = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f29572a, this.f29573b);
    }

    public abstract void h(k3.d dVar, boolean z3);

    public final void i() {
        if (this.f29575d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof d) {
            ((d) layoutParams).f29608p0 = this.f29575d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f29576e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f29577f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f29576e = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f29573b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i4);
            if (iIndexOf == -1) {
                a(str.substring(i4));
                return;
            } else {
                a(str.substring(i4, iIndexOf));
                i4 = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f29577f = str;
        if (str == null) {
            return;
        }
        int i4 = 0;
        this.f29573b = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i4);
            if (iIndexOf == -1) {
                c(str.substring(i4));
                return;
            } else {
                c(str.substring(i4, iIndexOf));
                i4 = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f29576e = null;
        this.f29573b = 0;
        for (int i4 : iArr) {
            b(i4);
        }
    }

    @Override // android.view.View
    public final void setTag(int i4, Object obj) {
        super.setTag(i4, obj);
        if (obj == null && this.f29576e == null) {
            b(i4);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
