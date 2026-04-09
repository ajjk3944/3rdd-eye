package ed;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import com.google.android.gms.internal.play_billing.m1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o {

    /* renamed from: m, reason: collision with root package name */
    public static final l f23352m = new l(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public m1 f23353a = new m();

    /* renamed from: b, reason: collision with root package name */
    public m1 f23354b = new m();

    /* renamed from: c, reason: collision with root package name */
    public m1 f23355c = new m();

    /* renamed from: d, reason: collision with root package name */
    public m1 f23356d = new m();

    /* renamed from: e, reason: collision with root package name */
    public d f23357e = new a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public d f23358f = new a(0.0f);
    public d g = new a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public d f23359h = new a(0.0f);

    /* renamed from: i, reason: collision with root package name */
    public f f23360i;
    public f j;

    /* renamed from: k, reason: collision with root package name */
    public f f23361k;

    /* renamed from: l, reason: collision with root package name */
    public f f23362l;

    public o() {
        int i4 = 0;
        this.f23360i = new f(i4);
        this.j = new f(i4);
        this.f23361k = new f(i4);
        this.f23362l = new f(i4);
    }

    public static n a(Context context, int i4, int i10) {
        return b(context, i4, i10, new a(0));
    }

    public static n b(Context context, int i4, int i10, d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i4);
        if (i10 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i10, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ic.a.E);
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i12 = typedArrayObtainStyledAttributes.getInt(3, i11);
            int i13 = typedArrayObtainStyledAttributes.getInt(4, i11);
            int i14 = typedArrayObtainStyledAttributes.getInt(2, i11);
            int i15 = typedArrayObtainStyledAttributes.getInt(1, i11);
            d dVarD = d(typedArrayObtainStyledAttributes, 5, dVar);
            d dVarD2 = d(typedArrayObtainStyledAttributes, 8, dVarD);
            d dVarD3 = d(typedArrayObtainStyledAttributes, 9, dVarD);
            d dVarD4 = d(typedArrayObtainStyledAttributes, 7, dVarD);
            d dVarD5 = d(typedArrayObtainStyledAttributes, 6, dVarD);
            n nVar = new n();
            nVar.f23342a = ii.a.i(i12);
            nVar.f23346e = dVarD2;
            nVar.f23343b = ii.a.i(i13);
            nVar.f23347f = dVarD3;
            nVar.f23344c = ii.a.i(i14);
            nVar.g = dVarD4;
            nVar.f23345d = ii.a.i(i15);
            nVar.f23348h = dVarD5;
            return nVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static n c(Context context, AttributeSet attributeSet, int i4, int i10) {
        a aVar = new a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ic.a.f25963x, i4, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, aVar);
    }

    public static d d(TypedArray typedArray, int i4, d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i4);
        if (typedValuePeekValue != null) {
            int i10 = typedValuePeekValue.type;
            if (i10 == 5) {
                return new a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i10 == 6) {
                return new l(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public final boolean e() {
        return (this.f23354b instanceof m) && (this.f23353a instanceof m) && (this.f23355c instanceof m) && (this.f23356d instanceof m);
    }

    public final boolean f(RectF rectF) {
        boolean z3 = this.f23362l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.f23360i.getClass().equals(f.class) && this.f23361k.getClass().equals(f.class);
        float fA = this.f23357e.a(rectF);
        return z3 && ((this.f23358f.a(rectF) > fA ? 1 : (this.f23358f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f23359h.a(rectF) > fA ? 1 : (this.f23359h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && e();
    }

    public final n g() {
        n nVar = new n();
        nVar.f23342a = this.f23353a;
        nVar.f23343b = this.f23354b;
        nVar.f23344c = this.f23355c;
        nVar.f23345d = this.f23356d;
        nVar.f23346e = this.f23357e;
        nVar.f23347f = this.f23358f;
        nVar.g = this.g;
        nVar.f23348h = this.f23359h;
        nVar.f23349i = this.f23360i;
        nVar.j = this.j;
        nVar.f23350k = this.f23361k;
        nVar.f23351l = this.f23362l;
        return nVar;
    }

    public final String toString() {
        return "[" + this.f23357e + ", " + this.f23358f + ", " + this.g + ", " + this.f23359h + "]";
    }
}
