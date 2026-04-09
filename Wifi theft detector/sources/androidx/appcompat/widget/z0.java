package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.a;

/* loaded from: classes.dex */
public class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1421a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f1422b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f1423c;

    public z0(Context context, TypedArray typedArray) {
        this.f1421a = context;
        this.f1422b = typedArray;
    }

    public static z0 t(Context context, int i10, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static z0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static z0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new z0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f1422b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f1422b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f1422b.hasValue(i10) || (resourceId = this.f1422b.getResourceId(i10, 0)) == 0 || (colorStateListA = d.a.a(this.f1421a, resourceId)) == null) ? this.f1422b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f1422b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f1422b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f1422b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f1422b.hasValue(i10) || (resourceId = this.f1422b.getResourceId(i10, 0)) == 0) ? this.f1422b.getDrawable(i10) : d.a.b(this.f1421a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f1422b.hasValue(i10) || (resourceId = this.f1422b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return i.b().d(this.f1421a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f1422b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, a.e eVar) {
        int resourceId = this.f1422b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1423c == null) {
            this.f1423c = new TypedValue();
        }
        return androidx.core.content.res.a.h(this.f1421a, resourceId, this.f1423c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f1422b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f1422b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f1422b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f1422b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f1422b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f1422b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f1422b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f1422b;
    }

    public boolean s(int i10) {
        return this.f1422b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f1422b.peekValue(i10);
    }

    public void x() {
        this.f1422b.recycle();
    }
}
