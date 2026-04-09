package l4;

import E.u;
import T1.B;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: ShapeAppearanceModel.java */
/* renamed from: l4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5290i {

    /* renamed from: m, reason: collision with root package name */
    public static final C5288g f43799m = new C5288g(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public B f43800a = new C5289h();

    /* renamed from: b, reason: collision with root package name */
    public B f43801b = new C5289h();

    /* renamed from: c, reason: collision with root package name */
    public B f43802c = new C5289h();

    /* renamed from: d, reason: collision with root package name */
    public B f43803d = new C5289h();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC5284c f43804e = new C5282a(0.0f);

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC5284c f43805f = new C5282a(0.0f);

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC5284c f43806g = new C5282a(0.0f);

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC5284c f43807h = new C5282a(0.0f);
    public C5286e i = new C5286e();

    /* renamed from: j, reason: collision with root package name */
    public C5286e f43808j = new C5286e();

    /* renamed from: k, reason: collision with root package name */
    public C5286e f43809k = new C5286e();

    /* renamed from: l, reason: collision with root package name */
    public C5286e f43810l = new C5286e();

    /* compiled from: ShapeAppearanceModel.java */
    /* renamed from: l4.i$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public B f43811a = new C5289h();

        /* renamed from: b, reason: collision with root package name */
        public B f43812b = new C5289h();

        /* renamed from: c, reason: collision with root package name */
        public B f43813c = new C5289h();

        /* renamed from: d, reason: collision with root package name */
        public B f43814d = new C5289h();

        /* renamed from: e, reason: collision with root package name */
        public InterfaceC5284c f43815e = new C5282a(0.0f);

        /* renamed from: f, reason: collision with root package name */
        public InterfaceC5284c f43816f = new C5282a(0.0f);

        /* renamed from: g, reason: collision with root package name */
        public InterfaceC5284c f43817g = new C5282a(0.0f);

        /* renamed from: h, reason: collision with root package name */
        public InterfaceC5284c f43818h = new C5282a(0.0f);
        public C5286e i = new C5286e();

        /* renamed from: j, reason: collision with root package name */
        public C5286e f43819j = new C5286e();

        /* renamed from: k, reason: collision with root package name */
        public C5286e f43820k = new C5286e();

        /* renamed from: l, reason: collision with root package name */
        public C5286e f43821l = new C5286e();

        public static float b(B b10) {
            if (b10 instanceof C5289h) {
                ((C5289h) b10).getClass();
                return -1.0f;
            }
            if (b10 instanceof C5285d) {
                ((C5285d) b10).getClass();
            }
            return -1.0f;
        }

        public final C5290i a() {
            C5290i c5290i = new C5290i();
            c5290i.f43800a = this.f43811a;
            c5290i.f43801b = this.f43812b;
            c5290i.f43802c = this.f43813c;
            c5290i.f43803d = this.f43814d;
            c5290i.f43804e = this.f43815e;
            c5290i.f43805f = this.f43816f;
            c5290i.f43806g = this.f43817g;
            c5290i.f43807h = this.f43818h;
            c5290i.i = this.i;
            c5290i.f43808j = this.f43819j;
            c5290i.f43809k = this.f43820k;
            c5290i.f43810l = this.f43821l;
            return c5290i;
        }
    }

    public static a a(Context context, int i, int i10, InterfaceC5284c interfaceC5284c) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i10 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i10);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(K3.a.f3136x);
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i12 = typedArrayObtainStyledAttributes.getInt(3, i11);
            int i13 = typedArrayObtainStyledAttributes.getInt(4, i11);
            int i14 = typedArrayObtainStyledAttributes.getInt(2, i11);
            int i15 = typedArrayObtainStyledAttributes.getInt(1, i11);
            InterfaceC5284c interfaceC5284cC = c(typedArrayObtainStyledAttributes, 5, interfaceC5284c);
            InterfaceC5284c interfaceC5284cC2 = c(typedArrayObtainStyledAttributes, 8, interfaceC5284cC);
            InterfaceC5284c interfaceC5284cC3 = c(typedArrayObtainStyledAttributes, 9, interfaceC5284cC);
            InterfaceC5284c interfaceC5284cC4 = c(typedArrayObtainStyledAttributes, 7, interfaceC5284cC);
            InterfaceC5284c interfaceC5284cC5 = c(typedArrayObtainStyledAttributes, 6, interfaceC5284cC);
            a aVar = new a();
            B bT = u.t(i12);
            aVar.f43811a = bT;
            a.b(bT);
            aVar.f43815e = interfaceC5284cC2;
            B bT2 = u.t(i13);
            aVar.f43812b = bT2;
            a.b(bT2);
            aVar.f43816f = interfaceC5284cC3;
            B bT3 = u.t(i14);
            aVar.f43813c = bT3;
            a.b(bT3);
            aVar.f43817g = interfaceC5284cC4;
            B bT4 = u.t(i15);
            aVar.f43814d = bT4;
            a.b(bT4);
            aVar.f43818h = interfaceC5284cC5;
            return aVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i, int i10) {
        C5282a c5282a = new C5282a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, K3.a.f3130r, i, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, c5282a);
    }

    public static InterfaceC5284c c(TypedArray typedArray, int i, InterfaceC5284c interfaceC5284c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i10 = typedValuePeekValue.type;
            if (i10 == 5) {
                return new C5282a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i10 == 6) {
                return new C5288g(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC5284c;
    }

    public final boolean d(RectF rectF) {
        boolean z10 = this.f43810l.getClass().equals(C5286e.class) && this.f43808j.getClass().equals(C5286e.class) && this.i.getClass().equals(C5286e.class) && this.f43809k.getClass().equals(C5286e.class);
        float fA = this.f43804e.a(rectF);
        return z10 && ((this.f43805f.a(rectF) > fA ? 1 : (this.f43805f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f43807h.a(rectF) > fA ? 1 : (this.f43807h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f43806g.a(rectF) > fA ? 1 : (this.f43806g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f43801b instanceof C5289h) && (this.f43800a instanceof C5289h) && (this.f43802c instanceof C5289h) && (this.f43803d instanceof C5289h));
    }

    public final a e() {
        a aVar = new a();
        aVar.f43811a = new C5289h();
        aVar.f43812b = new C5289h();
        aVar.f43813c = new C5289h();
        aVar.f43814d = new C5289h();
        aVar.f43815e = new C5282a(0.0f);
        aVar.f43816f = new C5282a(0.0f);
        aVar.f43817g = new C5282a(0.0f);
        aVar.f43818h = new C5282a(0.0f);
        aVar.i = new C5286e();
        aVar.f43819j = new C5286e();
        aVar.f43820k = new C5286e();
        new C5286e();
        aVar.f43811a = this.f43800a;
        aVar.f43812b = this.f43801b;
        aVar.f43813c = this.f43802c;
        aVar.f43814d = this.f43803d;
        aVar.f43815e = this.f43804e;
        aVar.f43816f = this.f43805f;
        aVar.f43817g = this.f43806g;
        aVar.f43818h = this.f43807h;
        aVar.i = this.i;
        aVar.f43819j = this.f43808j;
        aVar.f43820k = this.f43809k;
        aVar.f43821l = this.f43810l;
        return aVar;
    }
}
