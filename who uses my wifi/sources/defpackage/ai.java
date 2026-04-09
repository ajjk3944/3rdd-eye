package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ai extends View {
    public int[] f;
    public int g;
    public Context h;
    public s00 i;
    public String j;
    public String k;
    public HashMap l;

    public ai(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = new int[32];
        this.l = new HashMap();
        this.h = context;
        h(attributeSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.String r6) throws java.lang.IllegalAccessException, android.content.res.Resources.NotFoundException, java.lang.IllegalArgumentException {
        /*
            r5 = this;
            android.content.Context r0 = r5.h
            if (r6 == 0) goto L7f
            int r1 = r6.length()
            if (r1 != 0) goto Lc
            goto L7f
        Lc:
            if (r0 != 0) goto L10
            goto L7f
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
            if (r3 == 0) goto L4c
            if (r1 == 0) goto L4c
            if (r6 == 0) goto L40
            java.util.HashMap r3 = r1.r
            if (r3 == 0) goto L40
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L40
            java.util.HashMap r3 = r1.r
            java.lang.Object r3 = r3.get(r6)
            goto L41
        L40:
            r3 = r2
        L41:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L4c
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L4d
        L4c:
            r3 = 0
        L4d:
            if (r3 != 0) goto L55
            if (r1 == 0) goto L55
            int r3 = r5.g(r1, r6)
        L55:
            if (r3 != 0) goto L61
            java.lang.Class<xm0> r1 = defpackage.xm0.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L61
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L61
        L61:
            if (r3 != 0) goto L71
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L71:
            if (r3 == 0) goto L7f
            java.util.HashMap r0 = r5.l
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.b(r3)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai.a(java.lang.String):void");
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.g + 1;
        int[] iArr = this.f;
        if (i2 > iArr.length) {
            this.f = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f;
        int i3 = this.g;
        iArr2[i3] = i;
        this.g = i3 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.h == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ci) && strTrim.equals(((ci) layoutParams).Y) && childAt.getId() != -1) {
                b(childAt.getId());
            }
        }
    }

    public final void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    public final void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.g; i++) {
            View view = (View) constraintLayout.f.get(this.f[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int g(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.h.getResources()) != null) {
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

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f, this.g);
    }

    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, zm0.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.j = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.k = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void k() {
        if (this.i == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ci) {
            ((ci) layoutParams).p0 = this.i;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.j;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.k;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.j = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.g = 0;
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
        this.k = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.g = 0;
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
        this.j = null;
        this.g = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.j == null) {
            b(i);
        }
    }

    public void j() {
    }

    public void f(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void i(pi piVar, boolean z) {
    }
}
