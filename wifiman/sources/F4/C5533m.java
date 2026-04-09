package f4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import e4.C5420a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: f4.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5533m {

    /* renamed from: a, reason: collision with root package name */
    public float f47088a;

    /* renamed from: b, reason: collision with root package name */
    public float f47089b;

    /* renamed from: c, reason: collision with root package name */
    public float f47090c;

    /* renamed from: d, reason: collision with root package name */
    public float f47091d;

    /* renamed from: e, reason: collision with root package name */
    public float f47092e;

    /* renamed from: f, reason: collision with root package name */
    public float f47093f;

    /* renamed from: g, reason: collision with root package name */
    private final List f47094g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private final List f47095h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private boolean f47096i;

    /* renamed from: f4.m$a */
    class a extends g {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f47097c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Matrix f47098d;

        a(List list, Matrix matrix) {
            this.f47097c = list;
            this.f47098d = matrix;
        }

        @Override // f4.C5533m.g
        public void a(Matrix matrix, C5420a c5420a, int i10, Canvas canvas) {
            Iterator it = this.f47097c.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f47098d, c5420a, i10, canvas);
            }
        }
    }

    /* renamed from: f4.m$b */
    static class b extends g {

        /* renamed from: c, reason: collision with root package name */
        private final d f47100c;

        public b(d dVar) {
            this.f47100c = dVar;
        }

        @Override // f4.C5533m.g
        public void a(Matrix matrix, C5420a c5420a, int i10, Canvas canvas) {
            c5420a.a(canvas, matrix, new RectF(this.f47100c.k(), this.f47100c.o(), this.f47100c.l(), this.f47100c.j()), i10, this.f47100c.m(), this.f47100c.n());
        }
    }

    /* renamed from: f4.m$c */
    static class c extends g {

        /* renamed from: c, reason: collision with root package name */
        private final e f47101c;

        /* renamed from: d, reason: collision with root package name */
        private final float f47102d;

        /* renamed from: e, reason: collision with root package name */
        private final float f47103e;

        public c(e eVar, float f10, float f11) {
            this.f47101c = eVar;
            this.f47102d = f10;
            this.f47103e = f11;
        }

        @Override // f4.C5533m.g
        public void a(Matrix matrix, C5420a c5420a, int i10, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f47101c.f47112c - this.f47103e, this.f47101c.f47111b - this.f47102d), 0.0f);
            this.f47115a.set(matrix);
            this.f47115a.preTranslate(this.f47102d, this.f47103e);
            this.f47115a.preRotate(c());
            c5420a.b(canvas, this.f47115a, rectF, i10);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f47101c.f47112c - this.f47103e) / (this.f47101c.f47111b - this.f47102d)));
        }
    }

    /* renamed from: f4.m$d */
    public static class d extends f {

        /* renamed from: h, reason: collision with root package name */
        private static final RectF f47104h = new RectF();

        /* renamed from: b, reason: collision with root package name */
        public float f47105b;

        /* renamed from: c, reason: collision with root package name */
        public float f47106c;

        /* renamed from: d, reason: collision with root package name */
        public float f47107d;

        /* renamed from: e, reason: collision with root package name */
        public float f47108e;

        /* renamed from: f, reason: collision with root package name */
        public float f47109f;

        /* renamed from: g, reason: collision with root package name */
        public float f47110g;

        public d(float f10, float f11, float f12, float f13) {
            q(f10);
            u(f11);
            r(f12);
            p(f13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f47108e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f47105b;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f47107d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.f47109f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.f47110g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f47106c;
        }

        private void p(float f10) {
            this.f47108e = f10;
        }

        private void q(float f10) {
            this.f47105b = f10;
        }

        private void r(float f10) {
            this.f47107d = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f10) {
            this.f47109f = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f10) {
            this.f47110g = f10;
        }

        private void u(float f10) {
            this.f47106c = f10;
        }

        @Override // f4.C5533m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f47113a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f47104h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    /* renamed from: f4.m$e */
    public static class e extends f {

        /* renamed from: b, reason: collision with root package name */
        private float f47111b;

        /* renamed from: c, reason: collision with root package name */
        private float f47112c;

        @Override // f4.C5533m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f47113a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f47111b, this.f47112c);
            path.transform(matrix);
        }
    }

    /* renamed from: f4.m$f */
    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected final Matrix f47113a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    /* renamed from: f4.m$g */
    static abstract class g {

        /* renamed from: b, reason: collision with root package name */
        static final Matrix f47114b = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        final Matrix f47115a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, C5420a c5420a, int i10, Canvas canvas);

        public final void b(C5420a c5420a, int i10, Canvas canvas) {
            a(f47114b, c5420a, i10, canvas);
        }
    }

    public C5533m() {
        n(0.0f, 0.0f);
    }

    private void b(float f10) {
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
        this.f47095h.add(new b(dVar));
        p(f10);
    }

    private void c(g gVar, float f10, float f11) {
        b(f10);
        this.f47095h.add(gVar);
        p(f11);
    }

    private float g() {
        return this.f47092e;
    }

    private float h() {
        return this.f47093f;
    }

    private void p(float f10) {
        this.f47092e = f10;
    }

    private void q(float f10) {
        this.f47093f = f10;
    }

    private void r(float f10) {
        this.f47090c = f10;
    }

    private void s(float f10) {
        this.f47091d = f10;
    }

    private void t(float f10) {
        this.f47088a = f10;
    }

    private void u(float f10) {
        this.f47089b = f10;
    }

    public void a(float f10, float f11, float f12, float f13, float f14, float f15) {
        d dVar = new d(f10, f11, f12, f13);
        dVar.s(f14);
        dVar.t(f15);
        this.f47094g.add(dVar);
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

    public void d(Matrix matrix, Path path) {
        int size = this.f47094g.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f) this.f47094g.get(i10)).a(matrix, path);
        }
    }

    boolean e() {
        return this.f47096i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f47095h), new Matrix(matrix));
    }

    float i() {
        return this.f47090c;
    }

    float j() {
        return this.f47091d;
    }

    float k() {
        return this.f47088a;
    }

    float l() {
        return this.f47089b;
    }

    public void m(float f10, float f11) {
        e eVar = new e();
        eVar.f47111b = f10;
        eVar.f47112c = f11;
        this.f47094g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
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
        this.f47094g.clear();
        this.f47095h.clear();
        this.f47096i = false;
    }
}
