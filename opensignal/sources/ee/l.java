package ee;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import lf.t1;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: m, reason: collision with root package name */
    public static final j f8123m = new j(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public t1 f8124a = new k();

    /* renamed from: b, reason: collision with root package name */
    public t1 f8125b = new k();

    /* renamed from: c, reason: collision with root package name */
    public t1 f8126c = new k();

    /* renamed from: d, reason: collision with root package name */
    public t1 f8127d = new k();

    /* renamed from: e, reason: collision with root package name */
    public d f8128e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public d f8129f = new a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public d f8130g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public d f8131h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public f f8132i;
    public f j;
    public f k;

    /* renamed from: l, reason: collision with root package name */
    public f f8133l;

    public l() {
        int i10 = 0;
        this.f8132i = new f(i10);
        this.j = new f(i10);
        this.k = new f(i10);
        this.f8133l = new f(i10);
    }

    public static bk.f a(Context context, int i10, int i11) {
        return b(context, i10, i11, new a(0));
    }

    public static bk.f b(Context context, int i10, int i11, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i11, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ed.l.ShapeAppearance);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(ed.l.ShapeAppearance_cornerFamily, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(ed.l.ShapeAppearance_cornerFamilyTopLeft, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(ed.l.ShapeAppearance_cornerFamilyTopRight, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(ed.l.ShapeAppearance_cornerFamilyBottomRight, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(ed.l.ShapeAppearance_cornerFamilyBottomLeft, i12);
            d dVarD = d(typedArrayObtainStyledAttributes, ed.l.ShapeAppearance_cornerSize, dVar);
            d dVarD2 = d(typedArrayObtainStyledAttributes, ed.l.ShapeAppearance_cornerSizeTopLeft, dVarD);
            d dVarD3 = d(typedArrayObtainStyledAttributes, ed.l.ShapeAppearance_cornerSizeTopRight, dVarD);
            d dVarD4 = d(typedArrayObtainStyledAttributes, ed.l.ShapeAppearance_cornerSizeBottomRight, dVarD);
            d dVarD5 = d(typedArrayObtainStyledAttributes, ed.l.ShapeAppearance_cornerSizeBottomLeft, dVarD);
            bk.f fVar = new bk.f();
            fVar.f2803a = se.b.p(i13);
            fVar.f2807e = dVarD2;
            fVar.f2804b = se.b.p(i14);
            fVar.f2808f = dVarD3;
            fVar.f2805c = se.b.p(i15);
            fVar.f2809g = dVarD4;
            fVar.f2806d = se.b.p(i16);
            fVar.f2810h = dVarD5;
            return fVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static bk.f c(Context context, AttributeSet attributeSet, int i10, int i11) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ed.l.MaterialShape, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(ed.l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(ed.l.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, aVar);
    }

    public static d d(TypedArray typedArray, int i10, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new j(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean e() {
        return (this.f8125b instanceof k) && (this.f8124a instanceof k) && (this.f8126c instanceof k) && (this.f8127d instanceof k);
    }

    public final boolean f(RectF rectF) {
        boolean z10 = this.f8133l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.f8132i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float fA = this.f8128e.a(rectF);
        return z10 && ((this.f8129f.a(rectF) > fA ? 1 : (this.f8129f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f8131h.a(rectF) > fA ? 1 : (this.f8131h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f8130g.a(rectF) > fA ? 1 : (this.f8130g.a(rectF) == fA ? 0 : -1)) == 0) && e();
    }

    public final bk.f g() {
        bk.f fVar = new bk.f();
        fVar.f2803a = this.f8124a;
        fVar.f2804b = this.f8125b;
        fVar.f2805c = this.f8126c;
        fVar.f2806d = this.f8127d;
        fVar.f2807e = this.f8128e;
        fVar.f2808f = this.f8129f;
        fVar.f2809g = this.f8130g;
        fVar.f2810h = this.f8131h;
        fVar.f2811i = this.f8132i;
        fVar.j = this.j;
        fVar.k = this.k;
        fVar.f2812l = this.f8133l;
        return fVar;
    }

    public final String toString() {
        return "[" + this.f8128e + ", " + this.f8129f + ", " + this.f8130g + ", " + this.f8131h + "]";
    }
}
