package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public float f11025a;

    /* renamed from: b, reason: collision with root package name */
    public float f11026b;

    /* renamed from: c, reason: collision with root package name */
    public float f11027c;

    /* renamed from: d, reason: collision with root package name */
    public float f11028d;

    /* renamed from: e, reason: collision with root package name */
    public float f11029e;

    /* renamed from: f, reason: collision with root package name */
    public float f11030f;

    /* renamed from: g, reason: collision with root package name */
    public final List f11031g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final List f11032h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public boolean f11033i;

    public class a extends g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List f11034c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Matrix f11035d;

        public a(List list, Matrix matrix) {
            this.f11034c = list;
            this.f11035d = matrix;
        }

        @Override // com.google.android.material.shape.c.g
        public void a(Matrix matrix, f5.a aVar, int i10, Canvas canvas) {
            Iterator it = this.f11034c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f11035d, aVar, i10, canvas);
            }
        }
    }

    public static class b extends g {

        /* renamed from: c, reason: collision with root package name */
        public final d f11037c;

        public b(d dVar) {
            this.f11037c = dVar;
        }

        @Override // com.google.android.material.shape.c.g
        public void a(Matrix matrix, f5.a aVar, int i10, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f11037c.k(), this.f11037c.o(), this.f11037c.l(), this.f11037c.j()), i10, this.f11037c.m(), this.f11037c.n());
        }
    }

    /* renamed from: com.google.android.material.shape.c$c, reason: collision with other inner class name */
    public static class C0212c extends g {

        /* renamed from: c, reason: collision with root package name */
        public final e f11038c;

        /* renamed from: d, reason: collision with root package name */
        public final float f11039d;

        /* renamed from: e, reason: collision with root package name */
        public final float f11040e;

        public C0212c(e eVar, float f10, float f11) {
            this.f11038c = eVar;
            this.f11039d = f10;
            this.f11040e = f11;
        }

        @Override // com.google.android.material.shape.c.g
        public void a(Matrix matrix, f5.a aVar, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f11038c.f11049c - this.f11040e, this.f11038c.f11048b - this.f11039d), 0.0f);
            this.f11052a.set(matrix);
            this.f11052a.preTranslate(this.f11039d, this.f11040e);
            this.f11052a.preRotate(c());
            aVar.b(canvas, this.f11052a, rectF, i10);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f11038c.f11049c - this.f11040e) / (this.f11038c.f11048b - this.f11039d)));
        }
    }

    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        public static final RectF f11041h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public float f11042b;

        /* renamed from: c, reason: collision with root package name */
        public float f11043c;

        /* renamed from: d, reason: collision with root package name */
        public float f11044d;

        /* renamed from: e, reason: collision with root package name */
        public float f11045e;

        /* renamed from: f, reason: collision with root package name */
        public float f11046f;

        /* renamed from: g, reason: collision with root package name */
        public float f11047g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        @Override // com.google.android.material.shape.c.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f11050a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f11041h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f11045e;
        }

        public final float k() {
            return this.f11042b;
        }

        public final float l() {
            return this.f11044d;
        }

        public final float m() {
            return this.f11046f;
        }

        public final float n() {
            return this.f11047g;
        }

        public final float o() {
            return this.f11043c;
        }

        public final void p(float f10) {
            this.f11045e = f10;
        }

        public final void q(float f10) {
            this.f11042b = f10;
        }

        public final void r(float f10) {
            this.f11044d = f10;
        }

        public final void s(float f10) {
            this.f11046f = f10;
        }

        public final void t(float f10) {
            this.f11047g = f10;
        }

        public final void u(float f10) {
            this.f11043c = f10;
        }
    }

    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        public float f11048b;

        /* renamed from: c, reason: collision with root package name */
        public float f11049c;

        @Override // com.google.android.material.shape.c.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f11050a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f11048b, this.f11049c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f11050a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class g {

        /* renamed from: b, reason: collision with root package name */
        public static final Matrix f11051b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        public final Matrix f11052a = new Matrix();

        public abstract void a(Matrix matrix, f5.a aVar, int i10, Canvas canvas);

        public final void b(f5.a aVar, int i10, Canvas canvas) {
            a(f11051b, aVar, i10, canvas);
        }
    }

    public c() {
        n(0.0f, 0.0f);
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f11031g.add(dVar);
        b bVar = new b(dVar);
        float f16 = f14 + f15;
        boolean z10 = f15 < 0.0f;
        if (z10) {
            f14 = (f14 + 180.0f) % 360.0f;
        }
        c(bVar, f14, z10 ? (180.0f + f16) % 360.0f : f16);
        double d10 = f16;
        r(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))));
        s(((f11 + f13) * 0.5f) + (((f13 - f11) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))));
    }

    public final void b(float f10) {
        if (g() == f10) {
            return;
        }
        float fG = ((f10 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f11032h.add(new b(dVar));
        p(f10);
    }

    public final void c(g gVar, float f10, float f11) {
        b(f10);
        this.f11032h.add(gVar);
        p(f11);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f11031g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f11031g.get(i10)).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f11033i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f11032h), new Matrix(matrix));
    }

    public final float g() {
        return this.f11029e;
    }

    public final float h() {
        return this.f11030f;
    }

    public float i() {
        return this.f11027c;
    }

    public float j() {
        return this.f11028d;
    }

    public float k() {
        return this.f11025a;
    }

    public float l() {
        return this.f11026b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f11048b = f10;
        eVar.f11049c = f11;
        this.f11031g.add(eVar);
        C0212c c0212c = new C0212c(eVar, i(), j());
        c(c0212c, c0212c.c() + 270.0f, c0212c.c() + 270.0f);
        r(f10);
        s(f11);
    }

    public void n(float f10, float f11) {
        o(f10, f11, 270.0f, 0.0f);
    }

    public void o(float f10, float f11, float f12, float f13) {
        t(f10);
        u(f11);
        r(f10);
        s(f11);
        p(f12);
        q((f12 + f13) % 360.0f);
        this.f11031g.clear();
        this.f11032h.clear();
        this.f11033i = false;
    }

    public final void p(float f10) {
        this.f11029e = f10;
    }

    public final void q(float f10) {
        this.f11030f = f10;
    }

    public final void r(float f10) {
        this.f11027c = f10;
    }

    public final void s(float f10) {
        this.f11028d = f10;
    }

    public final void t(float f10) {
        this.f11025a = f10;
    }

    public final void u(float f10) {
        this.f11026b = f10;
    }
}
