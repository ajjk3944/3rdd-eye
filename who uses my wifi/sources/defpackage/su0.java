package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class su0 {
    public static final fp0 m = new fp0(0.5f);
    public ou1 a = new wq0();
    public ou1 b = new wq0();
    public ou1 c = new wq0();
    public ou1 d = new wq0();
    public ck e = new l(0.0f);
    public ck f = new l(0.0f);
    public ck g = new l(0.0f);
    public ck h = new l(0.0f);
    public fr i;
    public fr j;
    public fr k;
    public fr l;

    public su0() {
        int i = 0;
        this.i = new fr(i);
        this.j = new fr(i);
        this.k = new fr(i);
        this.l = new fr(i);
    }

    public static f2 a(Context context, int i, int i2, ck ckVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(gn0.H);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            ck ckVarC = c(typedArrayObtainStyledAttributes, 5, ckVar);
            ck ckVarC2 = c(typedArrayObtainStyledAttributes, 8, ckVarC);
            ck ckVarC3 = c(typedArrayObtainStyledAttributes, 9, ckVarC);
            ck ckVarC4 = c(typedArrayObtainStyledAttributes, 7, ckVarC);
            ck ckVarC5 = c(typedArrayObtainStyledAttributes, 6, ckVarC);
            f2 f2Var = new f2();
            f2Var.a = ou1.l(i4);
            f2Var.e = ckVarC2;
            f2Var.b = ou1.l(i5);
            f2Var.f = ckVarC3;
            f2Var.c = ou1.l(i6);
            f2Var.g = ckVarC4;
            f2Var.d = ou1.l(i7);
            f2Var.h = ckVarC5;
            return f2Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static f2 b(Context context, AttributeSet attributeSet, int i, int i2) {
        l lVar = new l(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, gn0.A, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, lVar);
    }

    public static ck c(TypedArray typedArray, int i, ck ckVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new l(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new fp0(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return ckVar;
    }

    public final boolean d() {
        return (this.b instanceof wq0) && (this.a instanceof wq0) && (this.c instanceof wq0) && (this.d instanceof wq0);
    }

    public final boolean e(RectF rectF) {
        boolean z = this.l.getClass().equals(fr.class) && this.j.getClass().equals(fr.class) && this.i.getClass().equals(fr.class) && this.k.getClass().equals(fr.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && d();
    }

    public final f2 f() {
        f2 f2Var = new f2();
        f2Var.a = this.a;
        f2Var.b = this.b;
        f2Var.c = this.c;
        f2Var.d = this.d;
        f2Var.e = this.e;
        f2Var.f = this.f;
        f2Var.g = this.g;
        f2Var.h = this.h;
        f2Var.i = this.i;
        f2Var.j = this.j;
        f2Var.k = this.k;
        f2Var.l = this.l;
        return f2Var;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
