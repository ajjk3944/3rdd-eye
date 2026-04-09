package G3;

import a.AbstractC0241a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import d3.AbstractC2266a;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: m, reason: collision with root package name */
    public static final l f1623m = new l(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0241a f1624a = new m();

    /* renamed from: b, reason: collision with root package name */
    public AbstractC0241a f1625b = new m();

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0241a f1626c = new m();

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0241a f1627d = new m();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0150d f1628e = new C0147a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC0150d f1629f = new C0147a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0150d f1630g = new C0147a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0150d f1631h = new C0147a(0.0f);
    public C0152f i;

    /* renamed from: j, reason: collision with root package name */
    public C0152f f1632j;

    /* renamed from: k, reason: collision with root package name */
    public C0152f f1633k;

    /* renamed from: l, reason: collision with root package name */
    public C0152f f1634l;

    public o() {
        int i = 0;
        this.i = new C0152f(i);
        this.f1632j = new C0152f(i);
        this.f1633k = new C0152f(i);
        this.f1634l = new C0152f(i);
    }

    public static n a(Context context, int i, int i3) {
        return b(context, i, i3, new C0147a(0));
    }

    public static n b(Context context, int i, int i3, InterfaceC0150d interfaceC0150d) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i3 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i3, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC2266a.f19735N);
        try {
            int i6 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i7 = typedArrayObtainStyledAttributes.getInt(3, i6);
            int i8 = typedArrayObtainStyledAttributes.getInt(4, i6);
            int i9 = typedArrayObtainStyledAttributes.getInt(2, i6);
            int i10 = typedArrayObtainStyledAttributes.getInt(1, i6);
            InterfaceC0150d interfaceC0150dD = d(typedArrayObtainStyledAttributes, 5, interfaceC0150d);
            InterfaceC0150d interfaceC0150dD2 = d(typedArrayObtainStyledAttributes, 8, interfaceC0150dD);
            InterfaceC0150d interfaceC0150dD3 = d(typedArrayObtainStyledAttributes, 9, interfaceC0150dD);
            InterfaceC0150d interfaceC0150dD4 = d(typedArrayObtainStyledAttributes, 7, interfaceC0150dD);
            InterfaceC0150d interfaceC0150dD5 = d(typedArrayObtainStyledAttributes, 6, interfaceC0150dD);
            n nVar = new n();
            AbstractC0241a abstractC0241aD = a4.p.d(i7);
            nVar.f1612a = abstractC0241aD;
            n.b(abstractC0241aD);
            nVar.f1616e = interfaceC0150dD2;
            AbstractC0241a abstractC0241aD2 = a4.p.d(i8);
            nVar.f1613b = abstractC0241aD2;
            n.b(abstractC0241aD2);
            nVar.f1617f = interfaceC0150dD3;
            AbstractC0241a abstractC0241aD3 = a4.p.d(i9);
            nVar.f1614c = abstractC0241aD3;
            n.b(abstractC0241aD3);
            nVar.f1618g = interfaceC0150dD4;
            AbstractC0241a abstractC0241aD4 = a4.p.d(i10);
            nVar.f1615d = abstractC0241aD4;
            n.b(abstractC0241aD4);
            nVar.f1619h = interfaceC0150dD5;
            return nVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static n c(Context context, AttributeSet attributeSet, int i, int i3) {
        C0147a c0147a = new C0147a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2266a.f19725C, i, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, c0147a);
    }

    public static InterfaceC0150d d(TypedArray typedArray, int i, InterfaceC0150d interfaceC0150d) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i3 = typedValuePeekValue.type;
            if (i3 == 5) {
                return new C0147a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i3 == 6) {
                return new l(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC0150d;
    }

    public final boolean e() {
        return (this.f1625b instanceof m) && (this.f1624a instanceof m) && (this.f1626c instanceof m) && (this.f1627d instanceof m);
    }

    public final boolean f(RectF rectF) {
        boolean z6 = this.f1634l.getClass().equals(C0152f.class) && this.f1632j.getClass().equals(C0152f.class) && this.i.getClass().equals(C0152f.class) && this.f1633k.getClass().equals(C0152f.class);
        float fA = this.f1628e.a(rectF);
        return z6 && ((this.f1629f.a(rectF) > fA ? 1 : (this.f1629f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f1631h.a(rectF) > fA ? 1 : (this.f1631h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f1630g.a(rectF) > fA ? 1 : (this.f1630g.a(rectF) == fA ? 0 : -1)) == 0) && e();
    }

    public final n g() {
        n nVar = new n();
        nVar.f1612a = this.f1624a;
        nVar.f1613b = this.f1625b;
        nVar.f1614c = this.f1626c;
        nVar.f1615d = this.f1627d;
        nVar.f1616e = this.f1628e;
        nVar.f1617f = this.f1629f;
        nVar.f1618g = this.f1630g;
        nVar.f1619h = this.f1631h;
        nVar.i = this.i;
        nVar.f1620j = this.f1632j;
        nVar.f1621k = this.f1633k;
        nVar.f1622l = this.f1634l;
        return nVar;
    }

    public final String toString() {
        return "[" + this.f1628e + ", " + this.f1629f + ", " + this.f1630g + ", " + this.f1631h + "]";
    }
}
