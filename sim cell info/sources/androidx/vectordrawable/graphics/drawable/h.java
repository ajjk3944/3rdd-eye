package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t.c;

/* loaded from: classes.dex */
public class h extends androidx.vectordrawable.graphics.drawable.g {

    /* renamed from: l, reason: collision with root package name */
    static final PorterDuff.Mode f2265l = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private C0021h f2266c;

    /* renamed from: d, reason: collision with root package name */
    private PorterDuffColorFilter f2267d;

    /* renamed from: e, reason: collision with root package name */
    private ColorFilter f2268e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2269f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2270g;

    /* renamed from: h, reason: collision with root package name */
    private Drawable.ConstantState f2271h;

    /* renamed from: i, reason: collision with root package name */
    private final float[] f2272i;

    /* renamed from: j, reason: collision with root package name */
    private final Matrix f2273j;

    /* renamed from: k, reason: collision with root package name */
    private final Rect f2274k;

    private static class b extends f {
        b() {
        }

        b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2301b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f2300a = t.c.d(string2);
            }
            this.f2302c = s.g.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (s.g.j(xmlPullParser, "pathData")) {
                TypedArray typedArrayK = s.g.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2238d);
                f(typedArrayK, xmlPullParser);
                typedArrayK.recycle();
            }
        }
    }

    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f2275e;

        /* renamed from: f, reason: collision with root package name */
        s.b f2276f;

        /* renamed from: g, reason: collision with root package name */
        float f2277g;

        /* renamed from: h, reason: collision with root package name */
        s.b f2278h;

        /* renamed from: i, reason: collision with root package name */
        float f2279i;

        /* renamed from: j, reason: collision with root package name */
        float f2280j;

        /* renamed from: k, reason: collision with root package name */
        float f2281k;

        /* renamed from: l, reason: collision with root package name */
        float f2282l;

        /* renamed from: m, reason: collision with root package name */
        float f2283m;

        /* renamed from: n, reason: collision with root package name */
        Paint.Cap f2284n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Join f2285o;

        /* renamed from: p, reason: collision with root package name */
        float f2286p;

        c() {
            this.f2277g = 0.0f;
            this.f2279i = 1.0f;
            this.f2280j = 1.0f;
            this.f2281k = 0.0f;
            this.f2282l = 1.0f;
            this.f2283m = 0.0f;
            this.f2284n = Paint.Cap.BUTT;
            this.f2285o = Paint.Join.MITER;
            this.f2286p = 4.0f;
        }

        c(c cVar) {
            super(cVar);
            this.f2277g = 0.0f;
            this.f2279i = 1.0f;
            this.f2280j = 1.0f;
            this.f2281k = 0.0f;
            this.f2282l = 1.0f;
            this.f2283m = 0.0f;
            this.f2284n = Paint.Cap.BUTT;
            this.f2285o = Paint.Join.MITER;
            this.f2286p = 4.0f;
            this.f2275e = cVar.f2275e;
            this.f2276f = cVar.f2276f;
            this.f2277g = cVar.f2277g;
            this.f2279i = cVar.f2279i;
            this.f2278h = cVar.f2278h;
            this.f2302c = cVar.f2302c;
            this.f2280j = cVar.f2280j;
            this.f2281k = cVar.f2281k;
            this.f2282l = cVar.f2282l;
            this.f2283m = cVar.f2283m;
            this.f2284n = cVar.f2284n;
            this.f2285o = cVar.f2285o;
            this.f2286p = cVar.f2286p;
        }

        private Paint.Cap e(int i2, Paint.Cap cap) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i2, Paint.Join join) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f2275e = null;
            if (s.g.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f2301b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f2300a = t.c.d(string2);
                }
                this.f2278h = s.g.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f2280j = s.g.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f2280j);
                this.f2284n = e(s.g.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f2284n);
                this.f2285o = f(s.g.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f2285o);
                this.f2286p = s.g.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f2286p);
                this.f2276f = s.g.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f2279i = s.g.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f2279i);
                this.f2277g = s.g.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f2277g);
                this.f2282l = s.g.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f2282l);
                this.f2283m = s.g.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f2283m);
                this.f2281k = s.g.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f2281k);
                this.f2302c = s.g.g(typedArray, xmlPullParser, "fillType", 13, this.f2302c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            return this.f2278h.i() || this.f2276f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            return this.f2276f.j(iArr) | this.f2278h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayK = s.g.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2237c);
            h(typedArrayK, xmlPullParser, theme);
            typedArrayK.recycle();
        }

        float getFillAlpha() {
            return this.f2280j;
        }

        int getFillColor() {
            return this.f2278h.e();
        }

        float getStrokeAlpha() {
            return this.f2279i;
        }

        int getStrokeColor() {
            return this.f2276f.e();
        }

        float getStrokeWidth() {
            return this.f2277g;
        }

        float getTrimPathEnd() {
            return this.f2282l;
        }

        float getTrimPathOffset() {
            return this.f2283m;
        }

        float getTrimPathStart() {
            return this.f2281k;
        }

        void setFillAlpha(float f2) {
            this.f2280j = f2;
        }

        void setFillColor(int i2) {
            this.f2278h.k(i2);
        }

        void setStrokeAlpha(float f2) {
            this.f2279i = f2;
        }

        void setStrokeColor(int i2) {
            this.f2276f.k(i2);
        }

        void setStrokeWidth(float f2) {
            this.f2277g = f2;
        }

        void setTrimPathEnd(float f2) {
            this.f2282l = f2;
        }

        void setTrimPathOffset(float f2) {
            this.f2283m = f2;
        }

        void setTrimPathStart(float f2) {
            this.f2281k = f2;
        }
    }

    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f2287a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<e> f2288b;

        /* renamed from: c, reason: collision with root package name */
        float f2289c;

        /* renamed from: d, reason: collision with root package name */
        private float f2290d;

        /* renamed from: e, reason: collision with root package name */
        private float f2291e;

        /* renamed from: f, reason: collision with root package name */
        private float f2292f;

        /* renamed from: g, reason: collision with root package name */
        private float f2293g;

        /* renamed from: h, reason: collision with root package name */
        private float f2294h;

        /* renamed from: i, reason: collision with root package name */
        private float f2295i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f2296j;

        /* renamed from: k, reason: collision with root package name */
        int f2297k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f2298l;

        /* renamed from: m, reason: collision with root package name */
        private String f2299m;

        public d() {
            super();
            this.f2287a = new Matrix();
            this.f2288b = new ArrayList<>();
            this.f2289c = 0.0f;
            this.f2290d = 0.0f;
            this.f2291e = 0.0f;
            this.f2292f = 1.0f;
            this.f2293g = 1.0f;
            this.f2294h = 0.0f;
            this.f2295i = 0.0f;
            this.f2296j = new Matrix();
            this.f2299m = null;
        }

        public d(d dVar, k.a<String, Object> aVar) {
            f bVar;
            super();
            this.f2287a = new Matrix();
            this.f2288b = new ArrayList<>();
            this.f2289c = 0.0f;
            this.f2290d = 0.0f;
            this.f2291e = 0.0f;
            this.f2292f = 1.0f;
            this.f2293g = 1.0f;
            this.f2294h = 0.0f;
            this.f2295i = 0.0f;
            Matrix matrix = new Matrix();
            this.f2296j = matrix;
            this.f2299m = null;
            this.f2289c = dVar.f2289c;
            this.f2290d = dVar.f2290d;
            this.f2291e = dVar.f2291e;
            this.f2292f = dVar.f2292f;
            this.f2293g = dVar.f2293g;
            this.f2294h = dVar.f2294h;
            this.f2295i = dVar.f2295i;
            this.f2298l = dVar.f2298l;
            String str = dVar.f2299m;
            this.f2299m = str;
            this.f2297k = dVar.f2297k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f2296j);
            ArrayList<e> arrayList = dVar.f2288b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                e eVar = arrayList.get(i2);
                if (eVar instanceof d) {
                    this.f2288b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f2288b.add(bVar);
                    String str2 = bVar.f2301b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f2296j.reset();
            this.f2296j.postTranslate(-this.f2290d, -this.f2291e);
            this.f2296j.postScale(this.f2292f, this.f2293g);
            this.f2296j.postRotate(this.f2289c, 0.0f, 0.0f);
            this.f2296j.postTranslate(this.f2294h + this.f2290d, this.f2295i + this.f2291e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f2298l = null;
            this.f2289c = s.g.f(typedArray, xmlPullParser, "rotation", 5, this.f2289c);
            this.f2290d = typedArray.getFloat(1, this.f2290d);
            this.f2291e = typedArray.getFloat(2, this.f2291e);
            this.f2292f = s.g.f(typedArray, xmlPullParser, "scaleX", 3, this.f2292f);
            this.f2293g = s.g.f(typedArray, xmlPullParser, "scaleY", 4, this.f2293g);
            this.f2294h = s.g.f(typedArray, xmlPullParser, "translateX", 6, this.f2294h);
            this.f2295i = s.g.f(typedArray, xmlPullParser, "translateY", 7, this.f2295i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2299m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean a() {
            for (int i2 = 0; i2 < this.f2288b.size(); i2++) {
                if (this.f2288b.get(i2).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.h.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i2 = 0; i2 < this.f2288b.size(); i2++) {
                zB |= this.f2288b.get(i2).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayK = s.g.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2236b);
            e(typedArrayK, xmlPullParser);
            typedArrayK.recycle();
        }

        public String getGroupName() {
            return this.f2299m;
        }

        public Matrix getLocalMatrix() {
            return this.f2296j;
        }

        public float getPivotX() {
            return this.f2290d;
        }

        public float getPivotY() {
            return this.f2291e;
        }

        public float getRotation() {
            return this.f2289c;
        }

        public float getScaleX() {
            return this.f2292f;
        }

        public float getScaleY() {
            return this.f2293g;
        }

        public float getTranslateX() {
            return this.f2294h;
        }

        public float getTranslateY() {
            return this.f2295i;
        }

        public void setPivotX(float f2) {
            if (f2 != this.f2290d) {
                this.f2290d = f2;
                d();
            }
        }

        public void setPivotY(float f2) {
            if (f2 != this.f2291e) {
                this.f2291e = f2;
                d();
            }
        }

        public void setRotation(float f2) {
            if (f2 != this.f2289c) {
                this.f2289c = f2;
                d();
            }
        }

        public void setScaleX(float f2) {
            if (f2 != this.f2292f) {
                this.f2292f = f2;
                d();
            }
        }

        public void setScaleY(float f2) {
            if (f2 != this.f2293g) {
                this.f2293g = f2;
                d();
            }
        }

        public void setTranslateX(float f2) {
            if (f2 != this.f2294h) {
                this.f2294h = f2;
                d();
            }
        }

        public void setTranslateY(float f2) {
            if (f2 != this.f2295i) {
                this.f2295i = f2;
                d();
            }
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        protected c.b[] f2300a;

        /* renamed from: b, reason: collision with root package name */
        String f2301b;

        /* renamed from: c, reason: collision with root package name */
        int f2302c;

        /* renamed from: d, reason: collision with root package name */
        int f2303d;

        public f() {
            super();
            this.f2300a = null;
            this.f2302c = 0;
        }

        public f(f fVar) {
            super();
            this.f2300a = null;
            this.f2302c = 0;
            this.f2301b = fVar.f2301b;
            this.f2303d = fVar.f2303d;
            this.f2300a = t.c.f(fVar.f2300a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.f2300a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.f2300a;
        }

        public String getPathName() {
            return this.f2301b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (t.c.b(this.f2300a, bVarArr)) {
                t.c.j(this.f2300a, bVarArr);
            } else {
                this.f2300a = t.c.f(bVarArr);
            }
        }
    }

    private static class g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f2304q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f2305a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f2306b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f2307c;

        /* renamed from: d, reason: collision with root package name */
        Paint f2308d;

        /* renamed from: e, reason: collision with root package name */
        Paint f2309e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f2310f;

        /* renamed from: g, reason: collision with root package name */
        private int f2311g;

        /* renamed from: h, reason: collision with root package name */
        final d f2312h;

        /* renamed from: i, reason: collision with root package name */
        float f2313i;

        /* renamed from: j, reason: collision with root package name */
        float f2314j;

        /* renamed from: k, reason: collision with root package name */
        float f2315k;

        /* renamed from: l, reason: collision with root package name */
        float f2316l;

        /* renamed from: m, reason: collision with root package name */
        int f2317m;

        /* renamed from: n, reason: collision with root package name */
        String f2318n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f2319o;

        /* renamed from: p, reason: collision with root package name */
        final k.a<String, Object> f2320p;

        public g() {
            this.f2307c = new Matrix();
            this.f2313i = 0.0f;
            this.f2314j = 0.0f;
            this.f2315k = 0.0f;
            this.f2316l = 0.0f;
            this.f2317m = 255;
            this.f2318n = null;
            this.f2319o = null;
            this.f2320p = new k.a<>();
            this.f2312h = new d();
            this.f2305a = new Path();
            this.f2306b = new Path();
        }

        public g(g gVar) {
            this.f2307c = new Matrix();
            this.f2313i = 0.0f;
            this.f2314j = 0.0f;
            this.f2315k = 0.0f;
            this.f2316l = 0.0f;
            this.f2317m = 255;
            this.f2318n = null;
            this.f2319o = null;
            k.a<String, Object> aVar = new k.a<>();
            this.f2320p = aVar;
            this.f2312h = new d(gVar.f2312h, aVar);
            this.f2305a = new Path(gVar.f2305a);
            this.f2306b = new Path(gVar.f2306b);
            this.f2313i = gVar.f2313i;
            this.f2314j = gVar.f2314j;
            this.f2315k = gVar.f2315k;
            this.f2316l = gVar.f2316l;
            this.f2311g = gVar.f2311g;
            this.f2317m = gVar.f2317m;
            this.f2318n = gVar.f2318n;
            String str = gVar.f2318n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f2319o = gVar.f2319o;
        }

        private static float a(float f2, float f3, float f4, float f5) {
            return (f2 * f5) - (f3 * f4);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            dVar.f2287a.set(matrix);
            dVar.f2287a.preConcat(dVar.f2296j);
            canvas.save();
            for (int i4 = 0; i4 < dVar.f2288b.size(); i4++) {
                e eVar = dVar.f2288b.get(i4);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f2287a, canvas, i2, i3, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i2, i3, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            float f2 = i2 / this.f2315k;
            float f3 = i3 / this.f2316l;
            float fMin = Math.min(f2, f3);
            Matrix matrix = dVar.f2287a;
            this.f2307c.set(matrix);
            this.f2307c.postScale(f2, f3);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.f2305a);
            Path path = this.f2305a;
            this.f2306b.reset();
            if (fVar.c()) {
                this.f2306b.setFillType(fVar.f2302c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f2306b.addPath(path, this.f2307c);
                canvas.clipPath(this.f2306b);
                return;
            }
            c cVar = (c) fVar;
            float f4 = cVar.f2281k;
            if (f4 != 0.0f || cVar.f2282l != 1.0f) {
                float f5 = cVar.f2283m;
                float f6 = (f4 + f5) % 1.0f;
                float f7 = (cVar.f2282l + f5) % 1.0f;
                if (this.f2310f == null) {
                    this.f2310f = new PathMeasure();
                }
                this.f2310f.setPath(this.f2305a, false);
                float length = this.f2310f.getLength();
                float f8 = f6 * length;
                float f9 = f7 * length;
                path.reset();
                if (f8 > f9) {
                    this.f2310f.getSegment(f8, length, path, true);
                    this.f2310f.getSegment(0.0f, f9, path, true);
                } else {
                    this.f2310f.getSegment(f8, f9, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f2306b.addPath(path, this.f2307c);
            if (cVar.f2278h.l()) {
                s.b bVar = cVar.f2278h;
                if (this.f2309e == null) {
                    Paint paint = new Paint(1);
                    this.f2309e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f2309e;
                if (bVar.h()) {
                    Shader shaderF = bVar.f();
                    shaderF.setLocalMatrix(this.f2307c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f2280j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(h.a(bVar.e(), cVar.f2280j));
                }
                paint2.setColorFilter(colorFilter);
                this.f2306b.setFillType(cVar.f2302c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f2306b, paint2);
            }
            if (cVar.f2276f.l()) {
                s.b bVar2 = cVar.f2276f;
                if (this.f2308d == null) {
                    Paint paint3 = new Paint(1);
                    this.f2308d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f2308d;
                Paint.Join join = cVar.f2285o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f2284n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f2286p);
                if (bVar2.h()) {
                    Shader shaderF2 = bVar2.f();
                    shaderF2.setLocalMatrix(this.f2307c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f2279i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(h.a(bVar2.e(), cVar.f2279i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f2277g * fMin * fE);
                canvas.drawPath(this.f2306b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i2, int i3, ColorFilter colorFilter) {
            c(this.f2312h, f2304q, canvas, i2, i3, colorFilter);
        }

        public boolean f() {
            if (this.f2319o == null) {
                this.f2319o = Boolean.valueOf(this.f2312h.a());
            }
            return this.f2319o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f2312h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f2317m;
        }

        public void setAlpha(float f2) {
            setRootAlpha((int) (f2 * 255.0f));
        }

        public void setRootAlpha(int i2) {
            this.f2317m = i2;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.h$h, reason: collision with other inner class name */
    private static class C0021h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f2321a;

        /* renamed from: b, reason: collision with root package name */
        g f2322b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f2323c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f2324d;

        /* renamed from: e, reason: collision with root package name */
        boolean f2325e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f2326f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f2327g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f2328h;

        /* renamed from: i, reason: collision with root package name */
        int f2329i;

        /* renamed from: j, reason: collision with root package name */
        boolean f2330j;

        /* renamed from: k, reason: collision with root package name */
        boolean f2331k;

        /* renamed from: l, reason: collision with root package name */
        Paint f2332l;

        public C0021h() {
            this.f2323c = null;
            this.f2324d = h.f2265l;
            this.f2322b = new g();
        }

        public C0021h(C0021h c0021h) {
            this.f2323c = null;
            this.f2324d = h.f2265l;
            if (c0021h != null) {
                this.f2321a = c0021h.f2321a;
                g gVar = new g(c0021h.f2322b);
                this.f2322b = gVar;
                if (c0021h.f2322b.f2309e != null) {
                    gVar.f2309e = new Paint(c0021h.f2322b.f2309e);
                }
                if (c0021h.f2322b.f2308d != null) {
                    this.f2322b.f2308d = new Paint(c0021h.f2322b.f2308d);
                }
                this.f2323c = c0021h.f2323c;
                this.f2324d = c0021h.f2324d;
                this.f2325e = c0021h.f2325e;
            }
        }

        public boolean a(int i2, int i3) {
            return i2 == this.f2326f.getWidth() && i3 == this.f2326f.getHeight();
        }

        public boolean b() {
            return !this.f2331k && this.f2327g == this.f2323c && this.f2328h == this.f2324d && this.f2330j == this.f2325e && this.f2329i == this.f2322b.getRootAlpha();
        }

        public void c(int i2, int i3) {
            if (this.f2326f == null || !a(i2, i3)) {
                this.f2326f = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
                this.f2331k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f2326f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f2332l == null) {
                Paint paint = new Paint();
                this.f2332l = paint;
                paint.setFilterBitmap(true);
            }
            this.f2332l.setAlpha(this.f2322b.getRootAlpha());
            this.f2332l.setColorFilter(colorFilter);
            return this.f2332l;
        }

        public boolean f() {
            return this.f2322b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f2322b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2321a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f2322b.g(iArr);
            this.f2331k |= zG;
            return zG;
        }

        public void i() {
            this.f2327g = this.f2323c;
            this.f2328h = this.f2324d;
            this.f2329i = this.f2322b.getRootAlpha();
            this.f2330j = this.f2325e;
            this.f2331k = false;
        }

        public void j(int i2, int i3) {
            this.f2326f.eraseColor(0);
            this.f2322b.b(new Canvas(this.f2326f), i2, i3, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new h(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new h(this);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f2333a;

        public i(Drawable.ConstantState constantState) {
            this.f2333a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2333a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2333a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            h hVar = new h();
            hVar.f2264b = (VectorDrawable) this.f2333a.newDrawable();
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            h hVar = new h();
            hVar.f2264b = (VectorDrawable) this.f2333a.newDrawable(resources);
            return hVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            h hVar = new h();
            hVar.f2264b = (VectorDrawable) this.f2333a.newDrawable(resources, theme);
            return hVar;
        }
    }

    h() {
        this.f2270g = true;
        this.f2272i = new float[9];
        this.f2273j = new Matrix();
        this.f2274k = new Rect();
        this.f2266c = new C0021h();
    }

    h(C0021h c0021h) {
        this.f2270g = true;
        this.f2272i = new float[9];
        this.f2273j = new Matrix();
        this.f2274k = new Rect();
        this.f2266c = c0021h;
        this.f2267d = j(this.f2267d, c0021h.f2323c, c0021h.f2324d);
    }

    static int a(int i2, float f2) {
        return (i2 & 16777215) | (((int) (Color.alpha(i2) * f2)) << 24);
    }

    public static h b(Resources resources, int i2, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            h hVar = new h();
            hVar.f2264b = s.f.a(resources, i2, theme);
            hVar.f2271h = new i(hVar.f2264b.getConstantState());
            return hVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i2);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static h c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = new h();
        hVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i2;
        int i3;
        b bVar;
        C0021h c0021h = this.f2266c;
        g gVar = c0021h.f2322b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f2312h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z2 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2288b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f2320p.put(cVar.getPathName(), cVar);
                    }
                    z2 = false;
                    bVar = cVar;
                } else if ("clip-path".equals(name)) {
                    b bVar2 = new b();
                    bVar2.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2288b.add(bVar2);
                    String pathName = bVar2.getPathName();
                    bVar = bVar2;
                    if (pathName != null) {
                        gVar.f2320p.put(bVar2.getPathName(), bVar2);
                        bVar = bVar2;
                    }
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2288b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f2320p.put(dVar2.getGroupName(), dVar2);
                    }
                    i2 = c0021h.f2321a;
                    i3 = dVar2.f2297k;
                    c0021h.f2321a = i3 | i2;
                }
                i2 = c0021h.f2321a;
                i3 = bVar.f2303d;
                c0021h.f2321a = i3 | i2;
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z2) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && u.a.e(this) == 1;
    }

    private static PorterDuff.Mode g(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        C0021h c0021h = this.f2266c;
        g gVar = c0021h.f2322b;
        c0021h.f2324d = g(s.g.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = s.g.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            c0021h.f2323c = colorStateListC;
        }
        c0021h.f2325e = s.g.a(typedArray, xmlPullParser, "autoMirrored", 5, c0021h.f2325e);
        gVar.f2315k = s.g.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f2315k);
        float f2 = s.g.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f2316l);
        gVar.f2316l = f2;
        if (gVar.f2315k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f2313i = typedArray.getDimension(3, gVar.f2313i);
        float dimension = typedArray.getDimension(2, gVar.f2314j);
        gVar.f2314j = dimension;
        if (gVar.f2313i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(s.g.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f2318n = string;
            gVar.f2320p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2264b;
        if (drawable == null) {
            return false;
        }
        u.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    Object d(String str) {
        return this.f2266c.f2322b.f2320p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f2274k);
        if (this.f2274k.width() <= 0 || this.f2274k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2268e;
        if (colorFilter == null) {
            colorFilter = this.f2267d;
        }
        canvas.getMatrix(this.f2273j);
        this.f2273j.getValues(this.f2272i);
        float fAbs = Math.abs(this.f2272i[0]);
        float fAbs2 = Math.abs(this.f2272i[4]);
        float fAbs3 = Math.abs(this.f2272i[1]);
        float fAbs4 = Math.abs(this.f2272i[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f2274k.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f2274k.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f2274k;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f2274k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f2274k.offsetTo(0, 0);
        this.f2266c.c(iMin, iMin2);
        if (!this.f2270g) {
            this.f2266c.j(iMin, iMin2);
        } else if (!this.f2266c.b()) {
            this.f2266c.j(iMin, iMin2);
            this.f2266c.i();
        }
        this.f2266c.d(canvas, colorFilter, this.f2274k);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2264b;
        return drawable != null ? u.a.c(drawable) : this.f2266c.f2322b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2264b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2266c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2264b;
        return drawable != null ? u.a.d(drawable) : this.f2268e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2264b != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f2264b.getConstantState());
        }
        this.f2266c.f2321a = getChangingConfigurations();
        return this.f2266c;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2264b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2266c.f2322b.f2314j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2264b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2266c.f2322b.f2313i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    void h(boolean z2) {
        this.f2270g = z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            u.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0021h c0021h = this.f2266c;
        c0021h.f2322b = new g();
        TypedArray typedArrayK = s.g.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2235a);
        i(typedArrayK, xmlPullParser, theme);
        typedArrayK.recycle();
        c0021h.f2321a = getChangingConfigurations();
        c0021h.f2331k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f2267d = j(this.f2267d, c0021h.f2323c, c0021h.f2324d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2264b;
        return drawable != null ? u.a.g(drawable) : this.f2266c.f2325e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        C0021h c0021h;
        ColorStateList colorStateList;
        Drawable drawable = this.f2264b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((c0021h = this.f2266c) != null && (c0021h.g() || ((colorStateList = this.f2266c.f2323c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2269f && super.mutate() == this) {
            this.f2266c = new C0021h(this.f2266c);
            this.f2269f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z2 = false;
        C0021h c0021h = this.f2266c;
        ColorStateList colorStateList = c0021h.f2323c;
        if (colorStateList != null && (mode = c0021h.f2324d) != null) {
            this.f2267d = j(this.f2267d, colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        if (!c0021h.g() || !c0021h.h(iArr)) {
            return z2;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else if (this.f2266c.f2322b.getRootAlpha() != i2) {
            this.f2266c.f2322b.setRootAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            u.a.i(drawable, z2);
        } else {
            this.f2266c.f2325e = z2;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i2) {
        super.setChangingConfigurations(i2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i2, PorterDuff.Mode mode) {
        super.setColorFilter(i2, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2268e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z2) {
        super.setFilterBitmap(z2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f2, float f3) {
        super.setHotspot(f2, f3);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i2, int i3, int i4, int i5) {
        super.setHotspotBounds(i2, i3, i4, i5);
    }

    @Override // androidx.vectordrawable.graphics.drawable.g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, u.b
    public void setTint(int i2) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            u.a.m(drawable, i2);
        } else {
            setTintList(ColorStateList.valueOf(i2));
        }
    }

    @Override // android.graphics.drawable.Drawable, u.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            u.a.n(drawable, colorStateList);
            return;
        }
        C0021h c0021h = this.f2266c;
        if (c0021h.f2323c != colorStateList) {
            c0021h.f2323c = colorStateList;
            this.f2267d = j(this.f2267d, colorStateList, c0021h.f2324d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, u.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            u.a.o(drawable, mode);
            return;
        }
        C0021h c0021h = this.f2266c;
        if (c0021h.f2324d != mode) {
            c0021h.f2324d = mode;
            this.f2267d = j(this.f2267d, c0021h.f2323c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f2264b;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2264b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
