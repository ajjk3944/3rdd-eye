package f4;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: f4.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5531k {

    /* renamed from: m, reason: collision with root package name */
    public static final InterfaceC5523c f47045m = new C5529i(0.5f);

    /* renamed from: a, reason: collision with root package name */
    AbstractC5524d f47046a;

    /* renamed from: b, reason: collision with root package name */
    AbstractC5524d f47047b;

    /* renamed from: c, reason: collision with root package name */
    AbstractC5524d f47048c;

    /* renamed from: d, reason: collision with root package name */
    AbstractC5524d f47049d;

    /* renamed from: e, reason: collision with root package name */
    InterfaceC5523c f47050e;

    /* renamed from: f, reason: collision with root package name */
    InterfaceC5523c f47051f;

    /* renamed from: g, reason: collision with root package name */
    InterfaceC5523c f47052g;

    /* renamed from: h, reason: collision with root package name */
    InterfaceC5523c f47053h;

    /* renamed from: i, reason: collision with root package name */
    C5526f f47054i;

    /* renamed from: j, reason: collision with root package name */
    C5526f f47055j;

    /* renamed from: k, reason: collision with root package name */
    C5526f f47056k;

    /* renamed from: l, reason: collision with root package name */
    C5526f f47057l;

    /* renamed from: f4.k$c */
    public interface c {
        InterfaceC5523c a(InterfaceC5523c interfaceC5523c);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new C5521a(i12));
    }

    private static b d(Context context, int i10, int i11, InterfaceC5523c interfaceC5523c) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(O3.j.f17425i4);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(O3.j.f17433j4, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(O3.j.f17457m4, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(O3.j.f17465n4, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(O3.j.f17449l4, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(O3.j.f17441k4, i12);
            InterfaceC5523c interfaceC5523cM = m(typedArrayObtainStyledAttributes, O3.j.f17473o4, interfaceC5523c);
            InterfaceC5523c interfaceC5523cM2 = m(typedArrayObtainStyledAttributes, O3.j.f17497r4, interfaceC5523cM);
            InterfaceC5523c interfaceC5523cM3 = m(typedArrayObtainStyledAttributes, O3.j.f17505s4, interfaceC5523cM);
            InterfaceC5523c interfaceC5523cM4 = m(typedArrayObtainStyledAttributes, O3.j.f17489q4, interfaceC5523cM);
            return new b().y(i13, interfaceC5523cM2).C(i14, interfaceC5523cM3).u(i15, interfaceC5523cM4).q(i16, m(typedArrayObtainStyledAttributes, O3.j.f17481p4, interfaceC5523cM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new C5521a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, InterfaceC5523c interfaceC5523c) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O3.j.f17456m3, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(O3.j.f17464n3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(O3.j.f17472o3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, interfaceC5523c);
    }

    private static InterfaceC5523c m(TypedArray typedArray, int i10, InterfaceC5523c interfaceC5523c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue == null) {
            return interfaceC5523c;
        }
        int i11 = typedValuePeekValue.type;
        return i11 == 5 ? new C5521a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new C5529i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC5523c;
    }

    public C5526f h() {
        return this.f47056k;
    }

    public AbstractC5524d i() {
        return this.f47049d;
    }

    public InterfaceC5523c j() {
        return this.f47053h;
    }

    public AbstractC5524d k() {
        return this.f47048c;
    }

    public InterfaceC5523c l() {
        return this.f47052g;
    }

    public C5526f n() {
        return this.f47057l;
    }

    public C5526f o() {
        return this.f47055j;
    }

    public C5526f p() {
        return this.f47054i;
    }

    public AbstractC5524d q() {
        return this.f47046a;
    }

    public InterfaceC5523c r() {
        return this.f47050e;
    }

    public AbstractC5524d s() {
        return this.f47047b;
    }

    public InterfaceC5523c t() {
        return this.f47051f;
    }

    public boolean u(RectF rectF) {
        boolean z10 = this.f47057l.getClass().equals(C5526f.class) && this.f47055j.getClass().equals(C5526f.class) && this.f47054i.getClass().equals(C5526f.class) && this.f47056k.getClass().equals(C5526f.class);
        float fA = this.f47050e.a(rectF);
        return z10 && ((this.f47051f.a(rectF) > fA ? 1 : (this.f47051f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f47053h.a(rectF) > fA ? 1 : (this.f47053h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f47052g.a(rectF) > fA ? 1 : (this.f47052g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f47047b instanceof C5530j) && (this.f47046a instanceof C5530j) && (this.f47048c instanceof C5530j) && (this.f47049d instanceof C5530j));
    }

    public b v() {
        return new b(this);
    }

    public C5531k w(float f10) {
        return v().o(f10).m();
    }

    public C5531k x(InterfaceC5523c interfaceC5523c) {
        return v().p(interfaceC5523c).m();
    }

    public C5531k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private C5531k(b bVar) {
        this.f47046a = bVar.f47058a;
        this.f47047b = bVar.f47059b;
        this.f47048c = bVar.f47060c;
        this.f47049d = bVar.f47061d;
        this.f47050e = bVar.f47062e;
        this.f47051f = bVar.f47063f;
        this.f47052g = bVar.f47064g;
        this.f47053h = bVar.f47065h;
        this.f47054i = bVar.f47066i;
        this.f47055j = bVar.f47067j;
        this.f47056k = bVar.f47068k;
        this.f47057l = bVar.f47069l;
    }

    /* renamed from: f4.k$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC5524d f47058a;

        /* renamed from: b, reason: collision with root package name */
        private AbstractC5524d f47059b;

        /* renamed from: c, reason: collision with root package name */
        private AbstractC5524d f47060c;

        /* renamed from: d, reason: collision with root package name */
        private AbstractC5524d f47061d;

        /* renamed from: e, reason: collision with root package name */
        private InterfaceC5523c f47062e;

        /* renamed from: f, reason: collision with root package name */
        private InterfaceC5523c f47063f;

        /* renamed from: g, reason: collision with root package name */
        private InterfaceC5523c f47064g;

        /* renamed from: h, reason: collision with root package name */
        private InterfaceC5523c f47065h;

        /* renamed from: i, reason: collision with root package name */
        private C5526f f47066i;

        /* renamed from: j, reason: collision with root package name */
        private C5526f f47067j;

        /* renamed from: k, reason: collision with root package name */
        private C5526f f47068k;

        /* renamed from: l, reason: collision with root package name */
        private C5526f f47069l;

        public b() {
            this.f47058a = AbstractC5528h.b();
            this.f47059b = AbstractC5528h.b();
            this.f47060c = AbstractC5528h.b();
            this.f47061d = AbstractC5528h.b();
            this.f47062e = new C5521a(0.0f);
            this.f47063f = new C5521a(0.0f);
            this.f47064g = new C5521a(0.0f);
            this.f47065h = new C5521a(0.0f);
            this.f47066i = AbstractC5528h.c();
            this.f47067j = AbstractC5528h.c();
            this.f47068k = AbstractC5528h.c();
            this.f47069l = AbstractC5528h.c();
        }

        private static float n(AbstractC5524d abstractC5524d) {
            if (abstractC5524d instanceof C5530j) {
                return ((C5530j) abstractC5524d).f47044a;
            }
            if (abstractC5524d instanceof C5525e) {
                return ((C5525e) abstractC5524d).f46992a;
            }
            return -1.0f;
        }

        public b A(float f10) {
            this.f47062e = new C5521a(f10);
            return this;
        }

        public b B(InterfaceC5523c interfaceC5523c) {
            this.f47062e = interfaceC5523c;
            return this;
        }

        public b C(int i10, InterfaceC5523c interfaceC5523c) {
            return D(AbstractC5528h.a(i10)).F(interfaceC5523c);
        }

        public b D(AbstractC5524d abstractC5524d) {
            this.f47059b = abstractC5524d;
            float fN = n(abstractC5524d);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f10) {
            this.f47063f = new C5521a(f10);
            return this;
        }

        public b F(InterfaceC5523c interfaceC5523c) {
            this.f47063f = interfaceC5523c;
            return this;
        }

        public C5531k m() {
            return new C5531k(this);
        }

        public b o(float f10) {
            return A(f10).E(f10).w(f10).s(f10);
        }

        public b p(InterfaceC5523c interfaceC5523c) {
            return B(interfaceC5523c).F(interfaceC5523c).x(interfaceC5523c).t(interfaceC5523c);
        }

        public b q(int i10, InterfaceC5523c interfaceC5523c) {
            return r(AbstractC5528h.a(i10)).t(interfaceC5523c);
        }

        public b r(AbstractC5524d abstractC5524d) {
            this.f47061d = abstractC5524d;
            float fN = n(abstractC5524d);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f10) {
            this.f47065h = new C5521a(f10);
            return this;
        }

        public b t(InterfaceC5523c interfaceC5523c) {
            this.f47065h = interfaceC5523c;
            return this;
        }

        public b u(int i10, InterfaceC5523c interfaceC5523c) {
            return v(AbstractC5528h.a(i10)).x(interfaceC5523c);
        }

        public b v(AbstractC5524d abstractC5524d) {
            this.f47060c = abstractC5524d;
            float fN = n(abstractC5524d);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f10) {
            this.f47064g = new C5521a(f10);
            return this;
        }

        public b x(InterfaceC5523c interfaceC5523c) {
            this.f47064g = interfaceC5523c;
            return this;
        }

        public b y(int i10, InterfaceC5523c interfaceC5523c) {
            return z(AbstractC5528h.a(i10)).B(interfaceC5523c);
        }

        public b z(AbstractC5524d abstractC5524d) {
            this.f47058a = abstractC5524d;
            float fN = n(abstractC5524d);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }

        public b(C5531k c5531k) {
            this.f47058a = AbstractC5528h.b();
            this.f47059b = AbstractC5528h.b();
            this.f47060c = AbstractC5528h.b();
            this.f47061d = AbstractC5528h.b();
            this.f47062e = new C5521a(0.0f);
            this.f47063f = new C5521a(0.0f);
            this.f47064g = new C5521a(0.0f);
            this.f47065h = new C5521a(0.0f);
            this.f47066i = AbstractC5528h.c();
            this.f47067j = AbstractC5528h.c();
            this.f47068k = AbstractC5528h.c();
            this.f47069l = AbstractC5528h.c();
            this.f47058a = c5531k.f47046a;
            this.f47059b = c5531k.f47047b;
            this.f47060c = c5531k.f47048c;
            this.f47061d = c5531k.f47049d;
            this.f47062e = c5531k.f47050e;
            this.f47063f = c5531k.f47051f;
            this.f47064g = c5531k.f47052g;
            this.f47065h = c5531k.f47053h;
            this.f47066i = c5531k.f47054i;
            this.f47067j = c5531k.f47055j;
            this.f47068k = c5531k.f47056k;
            this.f47069l = c5531k.f47057l;
        }
    }

    public C5531k() {
        this.f47046a = AbstractC5528h.b();
        this.f47047b = AbstractC5528h.b();
        this.f47048c = AbstractC5528h.b();
        this.f47049d = AbstractC5528h.b();
        this.f47050e = new C5521a(0.0f);
        this.f47051f = new C5521a(0.0f);
        this.f47052g = new C5521a(0.0f);
        this.f47053h = new C5521a(0.0f);
        this.f47054i = AbstractC5528h.c();
        this.f47055j = AbstractC5528h.c();
        this.f47056k = AbstractC5528h.c();
        this.f47057l = AbstractC5528h.c();
    }
}
