package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import s.f;

/* loaded from: classes.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1167a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f1168b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f1169c;

    private w0(Context context, TypedArray typedArray) {
        this.f1167a = context;
        this.f1168b = typedArray;
    }

    public static w0 r(Context context, int i2, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(i2, iArr));
    }

    public static w0 s(Context context, AttributeSet attributeSet, int[] iArr) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static w0 t(Context context, AttributeSet attributeSet, int[] iArr, int i2, int i3) {
        return new w0(context, context.obtainStyledAttributes(attributeSet, iArr, i2, i3));
    }

    public boolean a(int i2, boolean z2) {
        return this.f1168b.getBoolean(i2, z2);
    }

    public int b(int i2, int i3) {
        return this.f1168b.getColor(i2, i3);
    }

    public ColorStateList c(int i2) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!this.f1168b.hasValue(i2) || (resourceId = this.f1168b.getResourceId(i2, 0)) == 0 || (colorStateListC = c.a.c(this.f1167a, resourceId)) == null) ? this.f1168b.getColorStateList(i2) : colorStateListC;
    }

    public int d(int i2, int i3) {
        return this.f1168b.getDimensionPixelOffset(i2, i3);
    }

    public int e(int i2, int i3) {
        return this.f1168b.getDimensionPixelSize(i2, i3);
    }

    public Drawable f(int i2) {
        int resourceId;
        return (!this.f1168b.hasValue(i2) || (resourceId = this.f1168b.getResourceId(i2, 0)) == 0) ? this.f1168b.getDrawable(i2) : c.a.d(this.f1167a, resourceId);
    }

    public Drawable g(int i2) {
        int resourceId;
        if (!this.f1168b.hasValue(i2) || (resourceId = this.f1168b.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f1167a, resourceId, true);
    }

    public float h(int i2, float f2) {
        return this.f1168b.getFloat(i2, f2);
    }

    public Typeface i(int i2, int i3, f.a aVar) {
        int resourceId = this.f1168b.getResourceId(i2, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1169c == null) {
            this.f1169c = new TypedValue();
        }
        return s.f.b(this.f1167a, resourceId, this.f1169c, i3, aVar);
    }

    public int j(int i2, int i3) {
        return this.f1168b.getInt(i2, i3);
    }

    public int k(int i2, int i3) {
        return this.f1168b.getInteger(i2, i3);
    }

    public int l(int i2, int i3) {
        return this.f1168b.getLayoutDimension(i2, i3);
    }

    public int m(int i2, int i3) {
        return this.f1168b.getResourceId(i2, i3);
    }

    public String n(int i2) {
        return this.f1168b.getString(i2);
    }

    public CharSequence o(int i2) {
        return this.f1168b.getText(i2);
    }

    public CharSequence[] p(int i2) {
        return this.f1168b.getTextArray(i2);
    }

    public boolean q(int i2) {
        return this.f1168b.hasValue(i2);
    }

    public void u() {
        this.f1168b.recycle();
    }
}
