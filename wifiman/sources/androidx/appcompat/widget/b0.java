package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import i.AbstractC6050a;
import v1.h;

/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f27325a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f27326b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f27327c;

    private b0(Context context, TypedArray typedArray) {
        this.f27325a = context;
        this.f27326b = typedArray;
    }

    public static b0 t(Context context, int i10, int[] iArr) {
        return new b0(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static b0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new b0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static b0 v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new b0(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f27326b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f27326b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f27326b.hasValue(i10) || (resourceId = this.f27326b.getResourceId(i10, 0)) == 0 || (colorStateListA = AbstractC6050a.a(this.f27325a, resourceId)) == null) ? this.f27326b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f27326b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f27326b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f27326b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f27326b.hasValue(i10) || (resourceId = this.f27326b.getResourceId(i10, 0)) == 0) ? this.f27326b.getDrawable(i10) : AbstractC6050a.b(this.f27325a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f27326b.hasValue(i10) || (resourceId = this.f27326b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C3886k.b().d(this.f27325a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f27326b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, h.e eVar) {
        int resourceId = this.f27326b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f27327c == null) {
            this.f27327c = new TypedValue();
        }
        return v1.h.h(this.f27325a, resourceId, this.f27327c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f27326b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f27326b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f27326b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f27326b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f27326b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f27326b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f27326b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f27326b;
    }

    public boolean s(int i10) {
        return this.f27326b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f27326b.peekValue(i10);
    }

    public void x() {
        this.f27326b.recycle();
    }
}
