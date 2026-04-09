package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import g5.f;
import g5.g;
import g5.h;
import g5.i;
import g5.j;
import j4.l;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: m, reason: collision with root package name */
    public static final g5.d f10982m = new i(0.5f);

    /* renamed from: a, reason: collision with root package name */
    public g5.e f10983a;

    /* renamed from: b, reason: collision with root package name */
    public g5.e f10984b;

    /* renamed from: c, reason: collision with root package name */
    public g5.e f10985c;

    /* renamed from: d, reason: collision with root package name */
    public g5.e f10986d;

    /* renamed from: e, reason: collision with root package name */
    public g5.d f10987e;

    /* renamed from: f, reason: collision with root package name */
    public g5.d f10988f;

    /* renamed from: g, reason: collision with root package name */
    public g5.d f10989g;

    /* renamed from: h, reason: collision with root package name */
    public g5.d f10990h;

    /* renamed from: i, reason: collision with root package name */
    public g f10991i;

    /* renamed from: j, reason: collision with root package name */
    public g f10992j;

    /* renamed from: k, reason: collision with root package name */
    public g f10993k;

    /* renamed from: l, reason: collision with root package name */
    public g f10994l;

    public interface c {
        g5.d a(g5.d dVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    public static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new g5.a(i12));
    }

    public static b d(Context context, int i10, int i11, g5.d dVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i11, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(l.ShapeAppearance);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(l.ShapeAppearance_cornerFamily, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(l.ShapeAppearance_cornerFamilyTopLeft, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(l.ShapeAppearance_cornerFamilyTopRight, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(l.ShapeAppearance_cornerFamilyBottomRight, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(l.ShapeAppearance_cornerFamilyBottomLeft, i12);
            g5.d dVarM = m(typedArrayObtainStyledAttributes, l.ShapeAppearance_cornerSize, dVar);
            g5.d dVarM2 = m(typedArrayObtainStyledAttributes, l.ShapeAppearance_cornerSizeTopLeft, dVarM);
            g5.d dVarM3 = m(typedArrayObtainStyledAttributes, l.ShapeAppearance_cornerSizeTopRight, dVarM);
            g5.d dVarM4 = m(typedArrayObtainStyledAttributes, l.ShapeAppearance_cornerSizeBottomRight, dVarM);
            return new b().B(i13, dVarM2).F(i14, dVarM3).w(i15, dVarM4).s(i16, m(typedArrayObtainStyledAttributes, l.ShapeAppearance_cornerSizeBottomLeft, dVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new g5.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, g5.d dVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.MaterialShape, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(l.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, dVar);
    }

    public static g5.d m(TypedArray typedArray, int i10, g5.d dVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue != null) {
            int i11 = typedValuePeekValue.type;
            if (i11 == 5) {
                return new g5.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i11 == 6) {
                return new i(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return dVar;
    }

    public g h() {
        return this.f10993k;
    }

    public g5.e i() {
        return this.f10986d;
    }

    public g5.d j() {
        return this.f10990h;
    }

    public g5.e k() {
        return this.f10985c;
    }

    public g5.d l() {
        return this.f10989g;
    }

    public g n() {
        return this.f10994l;
    }

    public g o() {
        return this.f10992j;
    }

    public g p() {
        return this.f10991i;
    }

    public g5.e q() {
        return this.f10983a;
    }

    public g5.d r() {
        return this.f10987e;
    }

    public g5.e s() {
        return this.f10984b;
    }

    public g5.d t() {
        return this.f10988f;
    }

    public String toString() {
        return "[" + r() + ", " + t() + ", " + l() + ", " + j() + "]";
    }

    public boolean u() {
        return (this.f10984b instanceof j) && (this.f10983a instanceof j) && (this.f10985c instanceof j) && (this.f10986d instanceof j);
    }

    public boolean v(RectF rectF) {
        boolean z10 = this.f10994l.getClass().equals(g.class) && this.f10992j.getClass().equals(g.class) && this.f10991i.getClass().equals(g.class) && this.f10993k.getClass().equals(g.class);
        float fA = this.f10987e.a(rectF);
        return z10 && ((this.f10988f.a(rectF) > fA ? 1 : (this.f10988f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f10990h.a(rectF) > fA ? 1 : (this.f10990h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f10989g.a(rectF) > fA ? 1 : (this.f10989g.a(rectF) == fA ? 0 : -1)) == 0) && u();
    }

    public b w() {
        return new b(this);
    }

    public a x(float f10) {
        return w().o(f10).m();
    }

    public a y(g5.d dVar) {
        return w().p(dVar).m();
    }

    public a z(c cVar) {
        return w().E(cVar.a(r())).I(cVar.a(t())).v(cVar.a(j())).z(cVar.a(l())).m();
    }

    public a(b bVar) {
        this.f10983a = bVar.f10995a;
        this.f10984b = bVar.f10996b;
        this.f10985c = bVar.f10997c;
        this.f10986d = bVar.f10998d;
        this.f10987e = bVar.f10999e;
        this.f10988f = bVar.f11000f;
        this.f10989g = bVar.f11001g;
        this.f10990h = bVar.f11002h;
        this.f10991i = bVar.f11003i;
        this.f10992j = bVar.f11004j;
        this.f10993k = bVar.f11005k;
        this.f10994l = bVar.f11006l;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public g5.e f10995a;

        /* renamed from: b, reason: collision with root package name */
        public g5.e f10996b;

        /* renamed from: c, reason: collision with root package name */
        public g5.e f10997c;

        /* renamed from: d, reason: collision with root package name */
        public g5.e f10998d;

        /* renamed from: e, reason: collision with root package name */
        public g5.d f10999e;

        /* renamed from: f, reason: collision with root package name */
        public g5.d f11000f;

        /* renamed from: g, reason: collision with root package name */
        public g5.d f11001g;

        /* renamed from: h, reason: collision with root package name */
        public g5.d f11002h;

        /* renamed from: i, reason: collision with root package name */
        public g f11003i;

        /* renamed from: j, reason: collision with root package name */
        public g f11004j;

        /* renamed from: k, reason: collision with root package name */
        public g f11005k;

        /* renamed from: l, reason: collision with root package name */
        public g f11006l;

        public b() {
            this.f10995a = h.b();
            this.f10996b = h.b();
            this.f10997c = h.b();
            this.f10998d = h.b();
            this.f10999e = new g5.a(0.0f);
            this.f11000f = new g5.a(0.0f);
            this.f11001g = new g5.a(0.0f);
            this.f11002h = new g5.a(0.0f);
            this.f11003i = h.c();
            this.f11004j = h.c();
            this.f11005k = h.c();
            this.f11006l = h.c();
        }

        public static float n(g5.e eVar) {
            if (eVar instanceof j) {
                return ((j) eVar).f21195a;
            }
            if (eVar instanceof f) {
                return ((f) eVar).f21193a;
            }
            return -1.0f;
        }

        public b A(g gVar) {
            this.f11003i = gVar;
            return this;
        }

        public b B(int i10, g5.d dVar) {
            return C(h.a(i10)).E(dVar);
        }

        public b C(g5.e eVar) {
            this.f10995a = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                D(fN);
            }
            return this;
        }

        public b D(float f10) {
            this.f10999e = new g5.a(f10);
            return this;
        }

        public b E(g5.d dVar) {
            this.f10999e = dVar;
            return this;
        }

        public b F(int i10, g5.d dVar) {
            return G(h.a(i10)).I(dVar);
        }

        public b G(g5.e eVar) {
            this.f10996b = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                H(fN);
            }
            return this;
        }

        public b H(float f10) {
            this.f11000f = new g5.a(f10);
            return this;
        }

        public b I(g5.d dVar) {
            this.f11000f = dVar;
            return this;
        }

        public a m() {
            return new a(this);
        }

        public b o(float f10) {
            return D(f10).H(f10).y(f10).u(f10);
        }

        public b p(g5.d dVar) {
            return E(dVar).I(dVar).z(dVar).v(dVar);
        }

        public b q(int i10, float f10) {
            return r(h.a(i10)).o(f10);
        }

        public b r(g5.e eVar) {
            return C(eVar).G(eVar).x(eVar).t(eVar);
        }

        public b s(int i10, g5.d dVar) {
            return t(h.a(i10)).v(dVar);
        }

        public b t(g5.e eVar) {
            this.f10998d = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                u(fN);
            }
            return this;
        }

        public b u(float f10) {
            this.f11002h = new g5.a(f10);
            return this;
        }

        public b v(g5.d dVar) {
            this.f11002h = dVar;
            return this;
        }

        public b w(int i10, g5.d dVar) {
            return x(h.a(i10)).z(dVar);
        }

        public b x(g5.e eVar) {
            this.f10997c = eVar;
            float fN = n(eVar);
            if (fN != -1.0f) {
                y(fN);
            }
            return this;
        }

        public b y(float f10) {
            this.f11001g = new g5.a(f10);
            return this;
        }

        public b z(g5.d dVar) {
            this.f11001g = dVar;
            return this;
        }

        public b(a aVar) {
            this.f10995a = h.b();
            this.f10996b = h.b();
            this.f10997c = h.b();
            this.f10998d = h.b();
            this.f10999e = new g5.a(0.0f);
            this.f11000f = new g5.a(0.0f);
            this.f11001g = new g5.a(0.0f);
            this.f11002h = new g5.a(0.0f);
            this.f11003i = h.c();
            this.f11004j = h.c();
            this.f11005k = h.c();
            this.f11006l = h.c();
            this.f10995a = aVar.f10983a;
            this.f10996b = aVar.f10984b;
            this.f10997c = aVar.f10985c;
            this.f10998d = aVar.f10986d;
            this.f10999e = aVar.f10987e;
            this.f11000f = aVar.f10988f;
            this.f11001g = aVar.f10989g;
            this.f11002h = aVar.f10990h;
            this.f11003i = aVar.f10991i;
            this.f11004j = aVar.f10992j;
            this.f11005k = aVar.f10993k;
            this.f11006l = aVar.f10994l;
        }
    }

    public a() {
        this.f10983a = h.b();
        this.f10984b = h.b();
        this.f10985c = h.b();
        this.f10986d = h.b();
        this.f10987e = new g5.a(0.0f);
        this.f10988f = new g5.a(0.0f);
        this.f10989g = new g5.a(0.0f);
        this.f10990h = new g5.a(0.0f);
        this.f10991i = h.c();
        this.f10992j = h.c();
        this.f10993k = h.c();
        this.f10994l = h.c();
    }
}
