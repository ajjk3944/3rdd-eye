package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import o.C5404w;
import z0.C5848a;

/* compiled from: TintTypedArray.java */
/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public final Context f44607a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f44608b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f44609c;

    public X(Context context, TypedArray typedArray) {
        this.f44607a = context;
        this.f44608b = typedArray;
    }

    public static X e(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new X(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final ColorStateList a(int i) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.f44608b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateList = C5848a.getColorStateList(this.f44607a, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateList;
    }

    public final Drawable b(int i) {
        int resourceId;
        TypedArray typedArray = this.f44608b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : A9.I.w(this.f44607a, resourceId);
    }

    public final Drawable c(int i) {
        int resourceId;
        Drawable drawableF;
        if (!this.f44608b.hasValue(i) || (resourceId = this.f44608b.getResourceId(i, 0)) == 0) {
            return null;
        }
        C5390h c5390hA = C5390h.a();
        Context context = this.f44607a;
        synchronized (c5390hA) {
            drawableF = c5390hA.f44676a.f(resourceId, context, true);
        }
        return drawableF;
    }

    public final Typeface d(int i, int i10, C5404w.a aVar) {
        int resourceId = this.f44608b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f44609c == null) {
            this.f44609c = new TypedValue();
        }
        TypedValue typedValue = this.f44609c;
        ThreadLocal<TypedValue> threadLocal = B0.g.f359a;
        Context context = this.f44607a;
        if (context.isRestricted()) {
            return null;
        }
        return B0.g.c(context, resourceId, typedValue, i10, aVar, true, false);
    }

    public final void f() {
        this.f44608b.recycle();
    }
}
