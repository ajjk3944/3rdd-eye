package j3;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.Log;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j3.b;
import j3.e;
import j3.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;
import kotlin.KotlinVersion;

/* compiled from: SVGAndroidRenderer.java */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: g, reason: collision with root package name */
    public static HashSet<String> f42877g;

    /* renamed from: a, reason: collision with root package name */
    public Canvas f42878a;

    /* renamed from: b, reason: collision with root package name */
    public j3.f f42879b;

    /* renamed from: c, reason: collision with root package name */
    public h f42880c;

    /* renamed from: d, reason: collision with root package name */
    public Stack<h> f42881d;

    /* renamed from: e, reason: collision with root package name */
    public Stack<f.J> f42882e;

    /* renamed from: f, reason: collision with root package name */
    public Stack<Matrix> f42883f;

    /* compiled from: SVGAndroidRenderer.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42884a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f42885b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f42886c;

        static {
            int[] iArr = new int[f.E.d.values().length];
            f42886c = iArr;
            try {
                iArr[f.E.d.Miter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42886c[f.E.d.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42886c[f.E.d.Bevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[f.E.c.values().length];
            f42885b = iArr2;
            try {
                iArr2[f.E.c.Butt.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42885b[f.E.c.Round.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42885b[f.E.c.Square.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[e.a.values().length];
            f42884a = iArr3;
            try {
                iArr3[e.a.xMidYMin.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42884a[e.a.xMidYMid.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42884a[e.a.xMidYMax.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f42884a[e.a.xMaxYMin.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f42884a[e.a.xMaxYMid.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f42884a[e.a.xMaxYMax.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f42884a[e.a.xMinYMid.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f42884a[e.a.xMinYMax.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class b implements f.InterfaceC5191x {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f42887a;

        /* renamed from: b, reason: collision with root package name */
        public float f42888b;

        /* renamed from: c, reason: collision with root package name */
        public float f42889c;

        /* renamed from: d, reason: collision with root package name */
        public c f42890d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f42891e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f42892f;

        /* renamed from: g, reason: collision with root package name */
        public int f42893g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f42894h;

        public b(g gVar, f.C5190w c5190w) {
            ArrayList arrayList = new ArrayList();
            this.f42887a = arrayList;
            this.f42890d = null;
            this.f42891e = false;
            this.f42892f = true;
            this.f42893g = -1;
            if (c5190w == null) {
                return;
            }
            c5190w.h(this);
            if (this.f42894h) {
                this.f42890d.b((c) arrayList.get(this.f42893g));
                arrayList.set(this.f42893g, this.f42890d);
                this.f42894h = false;
            }
            c cVar = this.f42890d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }

        @Override // j3.f.InterfaceC5191x
        public final void a(float f10, float f11, float f12, float f13) {
            this.f42890d.a(f10, f11);
            this.f42887a.add(this.f42890d);
            this.f42890d = new c(f12, f13, f12 - f10, f13 - f11);
            this.f42894h = false;
        }

        @Override // j3.f.InterfaceC5191x
        public final void b(float f10, float f11) {
            boolean z10 = this.f42894h;
            ArrayList arrayList = this.f42887a;
            if (z10) {
                this.f42890d.b((c) arrayList.get(this.f42893g));
                arrayList.set(this.f42893g, this.f42890d);
                this.f42894h = false;
            }
            c cVar = this.f42890d;
            if (cVar != null) {
                arrayList.add(cVar);
            }
            this.f42888b = f10;
            this.f42889c = f11;
            this.f42890d = new c(f10, f11, 0.0f, 0.0f);
            this.f42893g = arrayList.size();
        }

        @Override // j3.f.InterfaceC5191x
        public final void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            if (this.f42892f || this.f42891e) {
                this.f42890d.a(f10, f11);
                this.f42887a.add(this.f42890d);
                this.f42891e = false;
            }
            this.f42890d = new c(f14, f15, f14 - f12, f15 - f13);
            this.f42894h = false;
        }

        @Override // j3.f.InterfaceC5191x
        public final void close() {
            this.f42887a.add(this.f42890d);
            e(this.f42888b, this.f42889c);
            this.f42894h = true;
        }

        @Override // j3.f.InterfaceC5191x
        public final void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            this.f42891e = true;
            this.f42892f = false;
            c cVar = this.f42890d;
            g.a(cVar.f42895a, cVar.f42896b, f10, f11, f12, z10, z11, f13, f14, this);
            this.f42892f = true;
            this.f42894h = false;
        }

        @Override // j3.f.InterfaceC5191x
        public final void e(float f10, float f11) {
            this.f42890d.a(f10, f11);
            this.f42887a.add(this.f42890d);
            c cVar = this.f42890d;
            this.f42890d = new c(f10, f11, f10 - cVar.f42895a, f11 - cVar.f42896b);
            this.f42894h = false;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class c {

        /* renamed from: a, reason: collision with root package name */
        public final float f42895a;

        /* renamed from: b, reason: collision with root package name */
        public final float f42896b;

        /* renamed from: c, reason: collision with root package name */
        public float f42897c;

        /* renamed from: d, reason: collision with root package name */
        public float f42898d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f42899e = false;

        public c(float f10, float f11, float f12, float f13) {
            this.f42897c = 0.0f;
            this.f42898d = 0.0f;
            this.f42895a = f10;
            this.f42896b = f11;
            double dSqrt = Math.sqrt((f13 * f13) + (f12 * f12));
            if (dSqrt != 0.0d) {
                this.f42897c = (float) (f12 / dSqrt);
                this.f42898d = (float) (f13 / dSqrt);
            }
        }

        public final void a(float f10, float f11) {
            float f12 = f10 - this.f42895a;
            float f13 = f11 - this.f42896b;
            double dSqrt = Math.sqrt((f13 * f13) + (f12 * f12));
            if (dSqrt != 0.0d) {
                f12 = (float) (f12 / dSqrt);
                f13 = (float) (f13 / dSqrt);
            }
            float f14 = this.f42897c;
            if (f12 != (-f14) || f13 != (-this.f42898d)) {
                this.f42897c = f14 + f12;
                this.f42898d += f13;
            } else {
                this.f42899e = true;
                this.f42897c = -f13;
                this.f42898d = f12;
            }
        }

        public final void b(c cVar) {
            float f10 = cVar.f42897c;
            float f11 = this.f42897c;
            if (f10 == (-f11)) {
                float f12 = cVar.f42898d;
                if (f12 == (-this.f42898d)) {
                    this.f42899e = true;
                    this.f42897c = -f12;
                    this.f42898d = cVar.f42897c;
                    return;
                }
            }
            this.f42897c = f11 + f10;
            this.f42898d += cVar.f42898d;
        }

        public final String toString() {
            return "(" + this.f42895a + StringUtils.COMMA + this.f42896b + " " + this.f42897c + StringUtils.COMMA + this.f42898d + ")";
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class d implements f.InterfaceC5191x {

        /* renamed from: a, reason: collision with root package name */
        public final Path f42900a = new Path();

        /* renamed from: b, reason: collision with root package name */
        public float f42901b;

        /* renamed from: c, reason: collision with root package name */
        public float f42902c;

        public d(f.C5190w c5190w) {
            if (c5190w == null) {
                return;
            }
            c5190w.h(this);
        }

        @Override // j3.f.InterfaceC5191x
        public final void a(float f10, float f11, float f12, float f13) {
            this.f42900a.quadTo(f10, f11, f12, f13);
            this.f42901b = f12;
            this.f42902c = f13;
        }

        @Override // j3.f.InterfaceC5191x
        public final void b(float f10, float f11) {
            this.f42900a.moveTo(f10, f11);
            this.f42901b = f10;
            this.f42902c = f11;
        }

        @Override // j3.f.InterfaceC5191x
        public final void c(float f10, float f11, float f12, float f13, float f14, float f15) {
            this.f42900a.cubicTo(f10, f11, f12, f13, f14, f15);
            this.f42901b = f14;
            this.f42902c = f15;
        }

        @Override // j3.f.InterfaceC5191x
        public final void close() {
            this.f42900a.close();
        }

        @Override // j3.f.InterfaceC5191x
        public final void d(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            g.a(this.f42901b, this.f42902c, f10, f11, f12, z10, z11, f13, f14, this);
            this.f42901b = f13;
            this.f42902c = f14;
        }

        @Override // j3.f.InterfaceC5191x
        public final void e(float f10, float f11) {
            this.f42900a.lineTo(f10, f11);
            this.f42901b = f10;
            this.f42902c = f11;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class e extends f {

        /* renamed from: d, reason: collision with root package name */
        public final Path f42903d;

        public e(Path path, float f10) {
            super(f10, 0.0f);
            this.f42903d = path;
        }

        @Override // j3.g.f, j3.g.j
        public final void b(String str) {
            g gVar = g.this;
            if (gVar.V()) {
                h hVar = gVar.f42880c;
                if (hVar.f42913b) {
                    gVar.f42878a.drawTextOnPath(str, this.f42903d, this.f42905a, this.f42906b, hVar.f42915d);
                }
                h hVar2 = gVar.f42880c;
                if (hVar2.f42914c) {
                    gVar.f42878a.drawTextOnPath(str, this.f42903d, this.f42905a, this.f42906b, hVar2.f42916e);
                }
            }
            this.f42905a = gVar.f42880c.f42915d.measureText(str) + this.f42905a;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class f extends j {

        /* renamed from: a, reason: collision with root package name */
        public float f42905a;

        /* renamed from: b, reason: collision with root package name */
        public float f42906b;

        public f(float f10, float f11) {
            this.f42905a = f10;
            this.f42906b = f11;
        }

        @Override // j3.g.j
        public void b(String str) {
            g gVar = g.this;
            if (gVar.V()) {
                h hVar = gVar.f42880c;
                if (hVar.f42913b) {
                    gVar.f42878a.drawText(str, this.f42905a, this.f42906b, hVar.f42915d);
                }
                h hVar2 = gVar.f42880c;
                if (hVar2.f42914c) {
                    gVar.f42878a.drawText(str, this.f42905a, this.f42906b, hVar2.f42916e);
                }
            }
            this.f42905a = gVar.f42880c.f42915d.measureText(str) + this.f42905a;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    /* renamed from: j3.g$g, reason: collision with other inner class name */
    public class C0475g extends j {

        /* renamed from: a, reason: collision with root package name */
        public float f42908a;

        /* renamed from: b, reason: collision with root package name */
        public final float f42909b;

        /* renamed from: c, reason: collision with root package name */
        public final Path f42910c;

        public C0475g(float f10, float f11, Path path) {
            this.f42908a = f10;
            this.f42909b = f11;
            this.f42910c = path;
        }

        @Override // j3.g.j
        public final boolean a(f.Y y10) {
            if (!(y10 instanceof f.Z)) {
                return true;
            }
            Log.w("SVGAndroidRenderer", "Using <textPath> elements in a clip path is not supported.");
            return false;
        }

        @Override // j3.g.j
        public final void b(String str) {
            String str2;
            g gVar = g.this;
            if (gVar.V()) {
                Path path = new Path();
                str2 = str;
                gVar.f42880c.f42915d.getTextPath(str2, 0, str.length(), this.f42908a, this.f42909b, path);
                this.f42910c.addPath(path);
            } else {
                str2 = str;
            }
            this.f42908a = gVar.f42880c.f42915d.measureText(str2) + this.f42908a;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class i extends j {

        /* renamed from: a, reason: collision with root package name */
        public float f42920a;

        /* renamed from: b, reason: collision with root package name */
        public final float f42921b;

        /* renamed from: c, reason: collision with root package name */
        public final RectF f42922c = new RectF();

        public i(float f10, float f11) {
            this.f42920a = f10;
            this.f42921b = f11;
        }

        @Override // j3.g.j
        public final boolean a(f.Y y10) {
            if (!(y10 instanceof f.Z)) {
                return true;
            }
            f.Z z10 = (f.Z) y10;
            f.L lF = y10.f42786a.f(z10.f42799n);
            if (lF == null) {
                g.o("TextPath path reference '%s' not found", z10.f42799n);
                return false;
            }
            f.C5189v c5189v = (f.C5189v) lF;
            Path path = new d(c5189v.f42863o).f42900a;
            Matrix matrix = c5189v.f42837n;
            if (matrix != null) {
                path.transform(matrix);
            }
            RectF rectF = new RectF();
            path.computeBounds(rectF, true);
            this.f42922c.union(rectF);
            return false;
        }

        @Override // j3.g.j
        public final void b(String str) {
            g gVar = g.this;
            if (gVar.V()) {
                Rect rect = new Rect();
                gVar.f42880c.f42915d.getTextBounds(str, 0, str.length(), rect);
                RectF rectF = new RectF(rect);
                rectF.offset(this.f42920a, this.f42921b);
                this.f42922c.union(rectF);
            }
            this.f42920a = gVar.f42880c.f42915d.measureText(str) + this.f42920a;
        }
    }

    /* compiled from: SVGAndroidRenderer.java */
    public abstract class j {
        public boolean a(f.Y y10) {
            return true;
        }

        public abstract void b(String str);
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class k extends j {

        /* renamed from: a, reason: collision with root package name */
        public float f42924a = 0.0f;

        public k() {
        }

        @Override // j3.g.j
        public final void b(String str) {
            this.f42924a = g.this.f42880c.f42915d.measureText(str) + this.f42924a;
        }
    }

    public static Path A(f.C5193z c5193z) {
        Path path = new Path();
        float[] fArr = c5193z.f42876o;
        path.moveTo(fArr[0], fArr[1]);
        int i10 = 2;
        while (true) {
            float[] fArr2 = c5193z.f42876o;
            if (i10 >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i10], fArr2[i10 + 1]);
            i10 += 2;
        }
        if (c5193z instanceof f.A) {
            path.close();
        }
        if (c5193z.f42776h == null) {
            c5193z.f42776h = c(path);
        }
        return path;
    }

    public static void N(h hVar, boolean z10, f.O o10) {
        int i10;
        f.E e4 = hVar.f42912a;
        float fFloatValue = (z10 ? e4.f42743e : e4.f42745g).floatValue();
        if (o10 instanceof f.C0474f) {
            i10 = ((f.C0474f) o10).f42827b;
        } else if (!(o10 instanceof f.C5174g)) {
            return;
        } else {
            i10 = hVar.f42912a.f42752o.f42827b;
        }
        int i11 = i(fFloatValue, i10);
        if (z10) {
            hVar.f42915d.setColor(i11);
        } else {
            hVar.f42916e.setColor(i11);
        }
    }

    public static void a(float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, f.InterfaceC5191x interfaceC5191x) {
        if (f10 == f15 && f11 == f16) {
            return;
        }
        if (f12 == 0.0f || f13 == 0.0f) {
            interfaceC5191x.e(f15, f16);
            return;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        double radians = Math.toRadians(f14 % 360.0d);
        double dCos = Math.cos(radians);
        double dSin = Math.sin(radians);
        double d10 = (f10 - f15) / 2.0d;
        double d11 = (f11 - f16) / 2.0d;
        double d12 = (dSin * d11) + (dCos * d10);
        double d13 = (dCos * d11) + ((-dSin) * d10);
        double d14 = fAbs * fAbs;
        double d15 = fAbs2 * fAbs2;
        double d16 = d12 * d12;
        double d17 = d13 * d13;
        double d18 = (d17 / d15) + (d16 / d14);
        if (d18 > 0.99999d) {
            double dSqrt = Math.sqrt(d18) * 1.00001d;
            fAbs = (float) (fAbs * dSqrt);
            fAbs2 = (float) (dSqrt * fAbs2);
            d14 = fAbs * fAbs;
            d15 = fAbs2 * fAbs2;
        }
        double d19 = z10 == z11 ? -1.0d : 1.0d;
        double d20 = d14 * d15;
        double d21 = d14 * d17;
        double d22 = d15 * d16;
        double d23 = ((d20 - d21) - d22) / (d21 + d22);
        if (d23 < 0.0d) {
            d23 = 0.0d;
        }
        double dSqrt2 = Math.sqrt(d23) * d19;
        double d24 = fAbs;
        double d25 = fAbs2;
        double d26 = ((d24 * d13) / d25) * dSqrt2;
        double d27 = dSqrt2 * (-((d25 * d12) / d24));
        double d28 = ((dCos * d26) - (dSin * d27)) + ((f10 + f15) / 2.0d);
        double d29 = (dCos * d27) + (dSin * d26) + ((f11 + f16) / 2.0d);
        double d30 = (d12 - d26) / d24;
        double d31 = (d13 - d27) / d25;
        double d32 = ((-d12) - d26) / d24;
        double d33 = ((-d13) - d27) / d25;
        double d34 = (d31 * d31) + (d30 * d30);
        double dAcos = Math.acos(d30 / Math.sqrt(d34)) * (d31 < 0.0d ? -1.0d : 1.0d);
        double dSqrt3 = ((d31 * d33) + (d30 * d32)) / Math.sqrt(((d33 * d33) + (d32 * d32)) * d34);
        double dAcos2 = ((d30 * d33) - (d31 * d32) < 0.0d ? -1.0d : 1.0d) * (dSqrt3 < -1.0d ? 3.141592653589793d : dSqrt3 > 1.0d ? 0.0d : Math.acos(dSqrt3));
        if (!z11 && dAcos2 > 0.0d) {
            dAcos2 -= 6.283185307179586d;
        } else if (z11 && dAcos2 < 0.0d) {
            dAcos2 += 6.283185307179586d;
        }
        double d35 = dAcos2 % 6.283185307179586d;
        double d36 = dAcos % 6.283185307179586d;
        int iCeil = (int) Math.ceil((Math.abs(d35) * 2.0d) / 3.141592653589793d);
        double d37 = d35 / iCeil;
        double d38 = d37 / 2.0d;
        double dSin2 = (Math.sin(d38) * 1.3333333333333333d) / (Math.cos(d38) + 1.0d);
        int i10 = iCeil * 6;
        float[] fArr = new float[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < iCeil) {
            double d39 = d36;
            double d40 = (i11 * d37) + d39;
            double dCos2 = Math.cos(d40);
            double dSin3 = Math.sin(d40);
            int i13 = i11;
            int i14 = i12;
            fArr[i14] = (float) (dCos2 - (dSin2 * dSin3));
            fArr[i12 + 1] = (float) ((dCos2 * dSin2) + dSin3);
            double d41 = d40 + d37;
            double dCos3 = Math.cos(d41);
            double dSin4 = Math.sin(d41);
            fArr[i14 + 2] = (float) ((dSin2 * dSin4) + dCos3);
            fArr[i14 + 3] = (float) (dSin4 - (dSin2 * dCos3));
            fArr[i14 + 4] = (float) dCos3;
            i12 = i14 + 6;
            fArr[i14 + 5] = (float) dSin4;
            i11 = i13 + 1;
            d36 = d39;
            iCeil = iCeil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(fAbs, fAbs2);
        matrix.postRotate(f14);
        matrix.postTranslate((float) d28, (float) d29);
        matrix.mapPoints(fArr);
        fArr[i10 - 2] = f15;
        fArr[i10 - 1] = f16;
        for (int i15 = 0; i15 < i10; i15 += 6) {
            interfaceC5191x.c(fArr[i15], fArr[i15 + 1], fArr[i15 + 2], fArr[i15 + 3], fArr[i15 + 4], fArr[i15 + 5]);
        }
    }

    public static f.C5170b c(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new f.C5170b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:
    
        if (r1 != 8) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Matrix e(j3.f.C5170b r9, j3.f.C5170b r10, j3.e r11) {
        /*
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            if (r11 == 0) goto L91
            j3.e$a r1 = r11.f42714a
            if (r1 != 0) goto Ld
            goto L91
        Ld:
            float r2 = r9.f42809c
            float r3 = r10.f42809c
            float r2 = r2 / r3
            float r3 = r9.f42810d
            float r4 = r10.f42810d
            float r3 = r3 / r4
            float r4 = r10.f42807a
            float r4 = -r4
            float r5 = r10.f42808b
            float r5 = -r5
            j3.e r6 = j3.e.f42712c
            boolean r6 = r11.equals(r6)
            if (r6 == 0) goto L33
            float r10 = r9.f42807a
            float r9 = r9.f42808b
            r0.preTranslate(r10, r9)
            r0.preScale(r2, r3)
            r0.preTranslate(r4, r5)
            return r0
        L33:
            j3.e$b r6 = j3.e.b.slice
            j3.e$b r11 = r11.f42715b
            if (r11 != r6) goto L3e
            float r11 = java.lang.Math.max(r2, r3)
            goto L42
        L3e:
            float r11 = java.lang.Math.min(r2, r3)
        L42:
            float r2 = r9.f42809c
            float r2 = r2 / r11
            float r3 = r9.f42810d
            float r3 = r3 / r11
            int[] r6 = j3.g.a.f42884a
            int r7 = r1.ordinal()
            r7 = r6[r7]
            r8 = 1073741824(0x40000000, float:2.0)
            switch(r7) {
                case 1: goto L5b;
                case 2: goto L5b;
                case 3: goto L5b;
                case 4: goto L56;
                case 5: goto L56;
                case 6: goto L56;
                default: goto L55;
            }
        L55:
            goto L60
        L56:
            float r7 = r10.f42809c
            float r7 = r7 - r2
        L59:
            float r4 = r4 - r7
            goto L60
        L5b:
            float r7 = r10.f42809c
            float r7 = r7 - r2
            float r7 = r7 / r8
            goto L59
        L60:
            int r1 = r1.ordinal()
            r1 = r6[r1]
            r2 = 2
            if (r1 == r2) goto L7f
            r2 = 3
            if (r1 == r2) goto L7a
            r2 = 5
            if (r1 == r2) goto L7f
            r2 = 6
            if (r1 == r2) goto L7a
            r2 = 7
            if (r1 == r2) goto L7f
            r2 = 8
            if (r1 == r2) goto L7a
            goto L84
        L7a:
            float r10 = r10.f42810d
            float r10 = r10 - r3
        L7d:
            float r5 = r5 - r10
            goto L84
        L7f:
            float r10 = r10.f42810d
            float r10 = r10 - r3
            float r10 = r10 / r8
            goto L7d
        L84:
            float r10 = r9.f42807a
            float r9 = r9.f42808b
            r0.preTranslate(r10, r9)
            r0.preScale(r11, r11)
            r0.preTranslate(r4, r5)
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.g.e(j3.f$b, j3.f$b, j3.e):android.graphics.Matrix");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface h(java.lang.String r5, java.lang.Integer r6, j3.f.E.b r7) {
        /*
            r0 = 2
            r1 = 3
            j3.f$E$b r2 = j3.f.E.b.Italic
            r3 = 0
            r4 = 1
            if (r7 != r2) goto La
            r7 = r4
            goto Lb
        La:
            r7 = r3
        Lb:
            int r6 = r6.intValue()
            r2 = 500(0x1f4, float:7.0E-43)
            if (r6 <= r2) goto L19
            if (r7 == 0) goto L17
            r6 = r1
            goto L1e
        L17:
            r6 = r4
            goto L1e
        L19:
            if (r7 == 0) goto L1d
            r6 = r0
            goto L1e
        L1d:
            r6 = r3
        L1e:
            r5.getClass()
            r7 = -1
            int r2 = r5.hashCode()
            switch(r2) {
                case -1536685117: goto L55;
                case -1431958525: goto L4a;
                case -1081737434: goto L41;
                case 109326717: goto L36;
                case 1126973893: goto L2b;
                default: goto L29;
            }
        L29:
            r0 = r7
            goto L5f
        L2b:
            java.lang.String r0 = "cursive"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L34
            goto L29
        L34:
            r0 = 4
            goto L5f
        L36:
            java.lang.String r0 = "serif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L3f
            goto L29
        L3f:
            r0 = r1
            goto L5f
        L41:
            java.lang.String r1 = "fantasy"
            boolean r5 = r5.equals(r1)
            if (r5 != 0) goto L5f
            goto L29
        L4a:
            java.lang.String r0 = "monospace"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L53
            goto L29
        L53:
            r0 = r4
            goto L5f
        L55:
            java.lang.String r0 = "sans-serif"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L5e
            goto L29
        L5e:
            r0 = r3
        L5f:
            switch(r0) {
                case 0: goto L80;
                case 1: goto L79;
                case 2: goto L72;
                case 3: goto L6b;
                case 4: goto L64;
                default: goto L62;
            }
        L62:
            r5 = 0
            return r5
        L64:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        L6b:
            android.graphics.Typeface r5 = android.graphics.Typeface.SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        L72:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        L79:
            android.graphics.Typeface r5 = android.graphics.Typeface.MONOSPACE
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        L80:
            android.graphics.Typeface r5 = android.graphics.Typeface.SANS_SERIF
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.g.h(java.lang.String, java.lang.Integer, j3.f$E$b):android.graphics.Typeface");
    }

    public static int i(float f10, int i10) {
        int i11 = KotlinVersion.MAX_COMPONENT_VALUE;
        int iRound = Math.round(((i10 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) * f10);
        if (iRound < 0) {
            i11 = 0;
        } else if (iRound <= 255) {
            i11 = iRound;
        }
        return (i11 << 24) | (i10 & 16777215);
    }

    public static void o(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void q(f.AbstractC5177j abstractC5177j, String str) {
        f.L lF = abstractC5177j.f42786a.f(str);
        if (lF == null) {
            Log.w("SVGAndroidRenderer", "Gradient reference '" + str + "' not found");
            return;
        }
        if (!(lF instanceof f.AbstractC5177j)) {
            o("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (lF == abstractC5177j) {
            o("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        f.AbstractC5177j abstractC5177j2 = (f.AbstractC5177j) lF;
        if (abstractC5177j.i == null) {
            abstractC5177j.i = abstractC5177j2.i;
        }
        if (abstractC5177j.f42834j == null) {
            abstractC5177j.f42834j = abstractC5177j2.f42834j;
        }
        if (abstractC5177j.f42835k == null) {
            abstractC5177j.f42835k = abstractC5177j2.f42835k;
        }
        if (abstractC5177j.f42833h.isEmpty()) {
            abstractC5177j.f42833h = abstractC5177j2.f42833h;
        }
        try {
            if (abstractC5177j instanceof f.M) {
                f.M m10 = (f.M) abstractC5177j;
                f.M m11 = (f.M) lF;
                if (m10.f42782m == null) {
                    m10.f42782m = m11.f42782m;
                }
                if (m10.f42783n == null) {
                    m10.f42783n = m11.f42783n;
                }
                if (m10.f42784o == null) {
                    m10.f42784o = m11.f42784o;
                }
                if (m10.f42785p == null) {
                    m10.f42785p = m11.f42785p;
                }
            } else {
                r((f.Q) abstractC5177j, (f.Q) lF);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = abstractC5177j2.f42836l;
        if (str2 != null) {
            q(abstractC5177j, str2);
        }
    }

    public static void r(f.Q q10, f.Q q11) {
        if (q10.f42789m == null) {
            q10.f42789m = q11.f42789m;
        }
        if (q10.f42790n == null) {
            q10.f42790n = q11.f42790n;
        }
        if (q10.f42791o == null) {
            q10.f42791o = q11.f42791o;
        }
        if (q10.f42792p == null) {
            q10.f42792p = q11.f42792p;
        }
        if (q10.f42793q == null) {
            q10.f42793q = q11.f42793q;
        }
    }

    public static void s(f.C5192y c5192y, String str) {
        f.L lF = c5192y.f42786a.f(str);
        if (lF == null) {
            Log.w("SVGAndroidRenderer", "Pattern reference '" + str + "' not found");
            return;
        }
        if (!(lF instanceof f.C5192y)) {
            o("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (lF == c5192y) {
            o("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        f.C5192y c5192y2 = (f.C5192y) lF;
        if (c5192y.f42868p == null) {
            c5192y.f42868p = c5192y2.f42868p;
        }
        if (c5192y.f42869q == null) {
            c5192y.f42869q = c5192y2.f42869q;
        }
        if (c5192y.f42870r == null) {
            c5192y.f42870r = c5192y2.f42870r;
        }
        if (c5192y.f42871s == null) {
            c5192y.f42871s = c5192y2.f42871s;
        }
        if (c5192y.f42872t == null) {
            c5192y.f42872t = c5192y2.f42872t;
        }
        if (c5192y.f42873u == null) {
            c5192y.f42873u = c5192y2.f42873u;
        }
        if (c5192y.f42874v == null) {
            c5192y.f42874v = c5192y2.f42874v;
        }
        if (c5192y.i.isEmpty()) {
            c5192y.i = c5192y2.i;
        }
        if (c5192y.f42794o == null) {
            c5192y.f42794o = c5192y2.f42794o;
        }
        if (c5192y.f42788n == null) {
            c5192y.f42788n = c5192y2.f42788n;
        }
        String str2 = c5192y2.f42875w;
        if (str2 != null) {
            s(c5192y, str2);
        }
    }

    public static boolean x(f.E e4, long j4) {
        return (j4 & e4.f42740b) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Path B(j3.f.B r20) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.g.B(j3.f$B):android.graphics.Path");
    }

    public final f.C5170b C(f.C5183p c5183p, f.C5183p c5183p2, f.C5183p c5183p3, f.C5183p c5183p4) {
        float fE = c5183p != null ? c5183p.e(this) : 0.0f;
        float f10 = c5183p2 != null ? c5183p2.f(this) : 0.0f;
        h hVar = this.f42880c;
        f.C5170b c5170b = hVar.f42918g;
        if (c5170b == null) {
            c5170b = hVar.f42917f;
        }
        return new f.C5170b(fE, f10, c5183p3 != null ? c5183p3.e(this) : c5170b.f42809c, c5183p4 != null ? c5183p4.f(this) : c5170b.f42810d);
    }

    @TargetApi(19)
    public final Path D(f.K k10, boolean z10) {
        Path pathB;
        Path pathB2;
        this.f42881d.push(this.f42880c);
        h hVar = new h(this.f42880c);
        this.f42880c = hVar;
        T(k10, hVar);
        if (!k() || !V()) {
            this.f42880c = this.f42881d.pop();
            return null;
        }
        if (k10 instanceof f.e0) {
            if (!z10) {
                o("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            f.e0 e0Var = (f.e0) k10;
            f.L lF = k10.f42786a.f(e0Var.f42820o);
            if (lF == null) {
                o("Use reference '%s' not found", e0Var.f42820o);
                this.f42880c = this.f42881d.pop();
                return null;
            }
            if (!(lF instanceof f.K)) {
                this.f42880c = this.f42881d.pop();
                return null;
            }
            pathB = D((f.K) lF, false);
            if (pathB != null) {
                if (e0Var.f42776h == null) {
                    e0Var.f42776h = c(pathB);
                }
                Matrix matrix = e0Var.f42838n;
                if (matrix != null) {
                    pathB.transform(matrix);
                }
                if (this.f42880c.f42912a.f42731F != null && (pathB2 = b(k10, k10.f42776h)) != null) {
                    pathB.op(pathB2, Path.Op.INTERSECT);
                }
                this.f42880c = this.f42881d.pop();
                return pathB;
            }
            return null;
        }
        if (k10 instanceof f.AbstractC5179l) {
            f.AbstractC5179l abstractC5179l = (f.AbstractC5179l) k10;
            if (k10 instanceof f.C5189v) {
                pathB = new d(((f.C5189v) k10).f42863o).f42900a;
                if (k10.f42776h == null) {
                    k10.f42776h = c(pathB);
                }
            } else {
                pathB = k10 instanceof f.B ? B((f.B) k10) : k10 instanceof f.C5172d ? y((f.C5172d) k10) : k10 instanceof f.C5176i ? z((f.C5176i) k10) : k10 instanceof f.C5193z ? A((f.C5193z) k10) : null;
            }
            if (pathB != null) {
                if (abstractC5179l.f42776h == null) {
                    abstractC5179l.f42776h = c(pathB);
                }
                Matrix matrix2 = abstractC5179l.f42837n;
                if (matrix2 != null) {
                    pathB.transform(matrix2);
                }
                pathB.setFillType(w());
            }
            return null;
        }
        if (!(k10 instanceof f.W)) {
            o("Invalid %s element found in clipPath definition", k10.n());
            return null;
        }
        f.W w10 = (f.W) k10;
        ArrayList arrayList = w10.f42803n;
        float f10 = 0.0f;
        float fE = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((f.C5183p) w10.f42803n.get(0)).e(this);
        ArrayList arrayList2 = w10.f42804o;
        float f11 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((f.C5183p) w10.f42804o.get(0)).f(this);
        ArrayList arrayList3 = w10.f42805p;
        float fE2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((f.C5183p) w10.f42805p.get(0)).e(this);
        ArrayList arrayList4 = w10.f42806q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            f10 = ((f.C5183p) w10.f42806q.get(0)).f(this);
        }
        if (this.f42880c.f42912a.f42759v != f.E.EnumC0473f.Start) {
            float fD = d(w10);
            if (this.f42880c.f42912a.f42759v == f.E.EnumC0473f.Middle) {
                fD /= 2.0f;
            }
            fE -= fD;
        }
        if (w10.f42776h == null) {
            i iVar = new i(fE, f11);
            RectF rectF = iVar.f42922c;
            n(w10, iVar);
            w10.f42776h = new f.C5170b(rectF.left, rectF.top, rectF.width(), rectF.height());
        }
        Path path = new Path();
        n(w10, new C0475g(fE + fE2, f11 + f10, path));
        Matrix matrix3 = w10.f42798r;
        if (matrix3 != null) {
            path.transform(matrix3);
        }
        path.setFillType(w());
        pathB = path;
        if (this.f42880c.f42912a.f42731F != null) {
            pathB.op(pathB2, Path.Op.INTERSECT);
        }
        this.f42880c = this.f42881d.pop();
        return pathB;
    }

    public final void E(f.C5170b c5170b) {
        if (this.f42880c.f42912a.f42733H != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.f42878a;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            f.C5186s c5186s = (f.C5186s) this.f42879b.f(this.f42880c.f42912a.f42733H);
            L(c5186s, c5170b);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            L(c5186s, c5170b);
            canvas.restore();
            canvas.restore();
        }
        O();
    }

    public final boolean F() {
        f.L lF;
        if (this.f42880c.f42912a.f42751n.floatValue() >= 1.0f && this.f42880c.f42912a.f42733H == null) {
            return false;
        }
        int iFloatValue = (int) (this.f42880c.f42912a.f42751n.floatValue() * 256.0f);
        if (iFloatValue < 0) {
            iFloatValue = 0;
        } else if (iFloatValue > 255) {
            iFloatValue = 255;
        }
        this.f42878a.saveLayerAlpha(null, iFloatValue, 31);
        this.f42881d.push(this.f42880c);
        h hVar = new h(this.f42880c);
        this.f42880c = hVar;
        String str = hVar.f42912a.f42733H;
        if (str != null && ((lF = this.f42879b.f(str)) == null || !(lF instanceof f.C5186s))) {
            o("Mask reference '%s' not found", this.f42880c.f42912a.f42733H);
            this.f42880c.f42912a.f42733H = null;
        }
        return true;
    }

    public final void G(f.F f10, f.C5170b c5170b, f.C5170b c5170b2, j3.e eVar) {
        if (c5170b.f42809c == 0.0f || c5170b.f42810d == 0.0f) {
            return;
        }
        if (eVar == null && (eVar = f10.f42788n) == null) {
            eVar = j3.e.f42713d;
        }
        T(f10, this.f42880c);
        if (k()) {
            h hVar = this.f42880c;
            hVar.f42917f = c5170b;
            if (!hVar.f42912a.f42760w.booleanValue()) {
                f.C5170b c5170b3 = this.f42880c.f42917f;
                M(c5170b3.f42807a, c5170b3.f42808b, c5170b3.f42809c, c5170b3.f42810d);
            }
            f(f10, this.f42880c.f42917f);
            Canvas canvas = this.f42878a;
            if (c5170b2 != null) {
                canvas.concat(e(this.f42880c.f42917f, c5170b2, eVar));
                this.f42880c.f42918g = f10.f42794o;
            } else {
                f.C5170b c5170b4 = this.f42880c.f42917f;
                canvas.translate(c5170b4.f42807a, c5170b4.f42808b);
            }
            boolean zF = F();
            U();
            I(f10, true);
            if (zF) {
                E(f10.f42776h);
            }
            R(f10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(f.N n9) {
        f.C5183p c5183p;
        String str;
        int iIndexOf;
        Set<String> setC;
        f.C5183p c5183p2;
        Boolean bool;
        if (n9 instanceof f.InterfaceC5187t) {
            return;
        }
        P();
        if ((n9 instanceof f.L) && (bool = ((f.L) n9).f42778d) != null) {
            this.f42880c.f42919h = bool.booleanValue();
        }
        if (n9 instanceof f.F) {
            f.F f10 = (f.F) n9;
            G(f10, C(f10.f42764p, f10.f42765q, f10.f42766r, f10.f42767s), f10.f42794o, f10.f42788n);
        } else {
            Bitmap bitmapDecodeByteArray = null;
            if (n9 instanceof f.e0) {
                f.e0 e0Var = (f.e0) n9;
                f.C5183p c5183p3 = e0Var.f42823r;
                if ((c5183p3 == null || !c5183p3.h()) && ((c5183p2 = e0Var.f42824s) == null || !c5183p2.h())) {
                    T(e0Var, this.f42880c);
                    if (k()) {
                        f.N nF = e0Var.f42786a.f(e0Var.f42820o);
                        if (nF == null) {
                            o("Use reference '%s' not found", e0Var.f42820o);
                        } else {
                            Matrix matrix = e0Var.f42838n;
                            Canvas canvas = this.f42878a;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            f.C5183p c5183p4 = e0Var.f42821p;
                            float fE = c5183p4 != null ? c5183p4.e(this) : 0.0f;
                            f.C5183p c5183p5 = e0Var.f42822q;
                            canvas.translate(fE, c5183p5 != null ? c5183p5.f(this) : 0.0f);
                            f(e0Var, e0Var.f42776h);
                            boolean zF = F();
                            this.f42882e.push(e0Var);
                            this.f42883f.push(this.f42878a.getMatrix());
                            if (nF instanceof f.F) {
                                f.F f11 = (f.F) nF;
                                f.C5170b c5170bC = C(null, null, e0Var.f42823r, e0Var.f42824s);
                                P();
                                G(f11, c5170bC, f11.f42794o, f11.f42788n);
                                O();
                            } else if (nF instanceof f.T) {
                                f.C5183p c5183p6 = e0Var.f42823r;
                                if (c5183p6 == null) {
                                    c5183p6 = new f.C5183p(100.0f, f.d0.percent);
                                }
                                f.C5183p c5183p7 = e0Var.f42824s;
                                if (c5183p7 == null) {
                                    c5183p7 = new f.C5183p(100.0f, f.d0.percent);
                                }
                                f.C5170b c5170bC2 = C(null, null, c5183p6, c5183p7);
                                P();
                                f.T t10 = (f.T) nF;
                                if (c5170bC2.f42809c != 0.0f && c5170bC2.f42810d != 0.0f) {
                                    j3.e eVar = t10.f42788n;
                                    if (eVar == null) {
                                        eVar = j3.e.f42713d;
                                    }
                                    T(t10, this.f42880c);
                                    h hVar = this.f42880c;
                                    hVar.f42917f = c5170bC2;
                                    if (!hVar.f42912a.f42760w.booleanValue()) {
                                        f.C5170b c5170b = this.f42880c.f42917f;
                                        M(c5170b.f42807a, c5170b.f42808b, c5170b.f42809c, c5170b.f42810d);
                                    }
                                    f.C5170b c5170b2 = t10.f42794o;
                                    if (c5170b2 != null) {
                                        canvas.concat(e(this.f42880c.f42917f, c5170b2, eVar));
                                        this.f42880c.f42918g = t10.f42794o;
                                    } else {
                                        f.C5170b c5170b3 = this.f42880c.f42917f;
                                        canvas.translate(c5170b3.f42807a, c5170b3.f42808b);
                                    }
                                    boolean zF2 = F();
                                    I(t10, true);
                                    if (zF2) {
                                        E(t10.f42776h);
                                    }
                                    R(t10);
                                }
                                O();
                            } else {
                                H(nF);
                            }
                            this.f42882e.pop();
                            this.f42883f.pop();
                            if (zF) {
                                E(e0Var.f42776h);
                            }
                            R(e0Var);
                        }
                    }
                }
            } else if (n9 instanceof f.S) {
                f.S s10 = (f.S) n9;
                T(s10, this.f42880c);
                if (k()) {
                    Matrix matrix2 = s10.f42838n;
                    if (matrix2 != null) {
                        this.f42878a.concat(matrix2);
                    }
                    f(s10, s10.f42776h);
                    boolean zF3 = F();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = s10.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        f.N n10 = (f.N) it.next();
                        if (n10 instanceof f.G) {
                            f.G g10 = (f.G) n10;
                            if (g10.d() == null && ((setC = g10.c()) == null || (!setC.isEmpty() && setC.contains(language)))) {
                                Set<String> requiredFeatures = g10.getRequiredFeatures();
                                if (requiredFeatures != null) {
                                    if (f42877g == null) {
                                        synchronized (g.class) {
                                            HashSet<String> hashSet = new HashSet<>();
                                            f42877g = hashSet;
                                            hashSet.add("Structure");
                                            f42877g.add("BasicStructure");
                                            f42877g.add("ConditionalProcessing");
                                            f42877g.add("Image");
                                            f42877g.add("Style");
                                            f42877g.add("ViewportAttribute");
                                            f42877g.add("Shape");
                                            f42877g.add("BasicText");
                                            f42877g.add("PaintAttribute");
                                            f42877g.add("BasicPaintAttribute");
                                            f42877g.add("OpacityAttribute");
                                            f42877g.add("BasicGraphicsAttribute");
                                            f42877g.add("Marker");
                                            f42877g.add("Gradient");
                                            f42877g.add("Pattern");
                                            f42877g.add("Clip");
                                            f42877g.add("BasicClip");
                                            f42877g.add("Mask");
                                            f42877g.add("View");
                                        }
                                    }
                                    if (requiredFeatures.isEmpty() || !f42877g.containsAll(requiredFeatures)) {
                                    }
                                }
                                Set<String> setL = g10.l();
                                if (setL == null) {
                                    Set<String> setM = g10.m();
                                    if (setM == null) {
                                        H(n10);
                                        break;
                                    }
                                    setM.isEmpty();
                                } else {
                                    setL.isEmpty();
                                }
                            }
                        }
                    }
                    if (zF3) {
                        E(s10.f42776h);
                    }
                    R(s10);
                }
            } else if (n9 instanceof f.C5180m) {
                f.C5180m c5180m = (f.C5180m) n9;
                T(c5180m, this.f42880c);
                if (k()) {
                    Matrix matrix3 = c5180m.f42838n;
                    if (matrix3 != null) {
                        this.f42878a.concat(matrix3);
                    }
                    f(c5180m, c5180m.f42776h);
                    boolean zF4 = F();
                    I(c5180m, true);
                    if (zF4) {
                        E(c5180m.f42776h);
                    }
                    R(c5180m);
                }
            } else if (n9 instanceof f.C5182o) {
                f.C5182o c5182o = (f.C5182o) n9;
                f.C5183p c5183p8 = c5182o.f42842r;
                if (c5183p8 != null && !c5183p8.h() && (c5183p = c5182o.f42843s) != null && !c5183p.h() && (str = c5182o.f42839o) != null) {
                    j3.e eVar2 = c5182o.f42788n;
                    if (eVar2 == null) {
                        eVar2 = j3.e.f42713d;
                    }
                    if (str.startsWith("data:") && str.length() >= 14 && (iIndexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(iIndexOf - 7, iIndexOf))) {
                        try {
                            byte[] bArrDecode = Base64.decode(str.substring(iIndexOf + 1), 0);
                            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                        } catch (Exception e4) {
                            Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e4);
                        }
                    }
                    if (bitmapDecodeByteArray != null) {
                        f.C5170b c5170b4 = new f.C5170b(0.0f, 0.0f, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight());
                        T(c5182o, this.f42880c);
                        if (k() && V()) {
                            Matrix matrix4 = c5182o.f42844t;
                            Canvas canvas2 = this.f42878a;
                            if (matrix4 != null) {
                                canvas2.concat(matrix4);
                            }
                            f.C5183p c5183p9 = c5182o.f42840p;
                            float fE2 = c5183p9 != null ? c5183p9.e(this) : 0.0f;
                            f.C5183p c5183p10 = c5182o.f42841q;
                            float f12 = c5183p10 != null ? c5183p10.f(this) : 0.0f;
                            float fE3 = c5182o.f42842r.e(this);
                            float fE4 = c5182o.f42843s.e(this);
                            h hVar2 = this.f42880c;
                            hVar2.f42917f = new f.C5170b(fE2, f12, fE3, fE4);
                            if (!hVar2.f42912a.f42760w.booleanValue()) {
                                f.C5170b c5170b5 = this.f42880c.f42917f;
                                M(c5170b5.f42807a, c5170b5.f42808b, c5170b5.f42809c, c5170b5.f42810d);
                            }
                            c5182o.f42776h = this.f42880c.f42917f;
                            R(c5182o);
                            f(c5182o, c5182o.f42776h);
                            boolean zF5 = F();
                            U();
                            canvas2.save();
                            canvas2.concat(e(this.f42880c.f42917f, c5170b4, eVar2));
                            canvas2.drawBitmap(bitmapDecodeByteArray, 0.0f, 0.0f, new Paint(this.f42880c.f42912a.f42739N != f.E.e.optimizeSpeed ? 2 : 0));
                            canvas2.restore();
                            if (zF5) {
                                E(c5182o.f42776h);
                            }
                        }
                    }
                }
            } else if (n9 instanceof f.C5189v) {
                f.C5189v c5189v = (f.C5189v) n9;
                if (c5189v.f42863o != null) {
                    T(c5189v, this.f42880c);
                    if (k() && V()) {
                        h hVar3 = this.f42880c;
                        if (hVar3.f42914c || hVar3.f42913b) {
                            Matrix matrix5 = c5189v.f42837n;
                            if (matrix5 != null) {
                                this.f42878a.concat(matrix5);
                            }
                            Path path = new d(c5189v.f42863o).f42900a;
                            if (c5189v.f42776h == null) {
                                c5189v.f42776h = c(path);
                            }
                            R(c5189v);
                            g(c5189v);
                            f(c5189v, c5189v.f42776h);
                            boolean zF6 = F();
                            h hVar4 = this.f42880c;
                            if (hVar4.f42913b) {
                                f.E.a aVar = hVar4.f42912a.f42742d;
                                path.setFillType((aVar == null || aVar != f.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                l(c5189v, path);
                            }
                            if (this.f42880c.f42914c) {
                                m(path);
                            }
                            K(c5189v);
                            if (zF6) {
                                E(c5189v.f42776h);
                            }
                        }
                    }
                }
            } else if (n9 instanceof f.B) {
                f.B b10 = (f.B) n9;
                f.C5183p c5183p11 = b10.f42721q;
                if (c5183p11 != null && b10.f42722r != null && !c5183p11.h() && !b10.f42722r.h()) {
                    T(b10, this.f42880c);
                    if (k() && V()) {
                        Matrix matrix6 = b10.f42837n;
                        if (matrix6 != null) {
                            this.f42878a.concat(matrix6);
                        }
                        Path pathB = B(b10);
                        R(b10);
                        g(b10);
                        f(b10, b10.f42776h);
                        boolean zF7 = F();
                        if (this.f42880c.f42913b) {
                            l(b10, pathB);
                        }
                        if (this.f42880c.f42914c) {
                            m(pathB);
                        }
                        if (zF7) {
                            E(b10.f42776h);
                        }
                    }
                }
            } else if (n9 instanceof f.C5172d) {
                f.C5172d c5172d = (f.C5172d) n9;
                f.C5183p c5183p12 = c5172d.f42818q;
                if (c5183p12 != null && !c5183p12.h()) {
                    T(c5172d, this.f42880c);
                    if (k() && V()) {
                        Matrix matrix7 = c5172d.f42837n;
                        if (matrix7 != null) {
                            this.f42878a.concat(matrix7);
                        }
                        Path pathY = y(c5172d);
                        R(c5172d);
                        g(c5172d);
                        f(c5172d, c5172d.f42776h);
                        boolean zF8 = F();
                        if (this.f42880c.f42913b) {
                            l(c5172d, pathY);
                        }
                        if (this.f42880c.f42914c) {
                            m(pathY);
                        }
                        if (zF8) {
                            E(c5172d.f42776h);
                        }
                    }
                }
            } else if (n9 instanceof f.C5176i) {
                f.C5176i c5176i = (f.C5176i) n9;
                f.C5183p c5183p13 = c5176i.f42831q;
                if (c5183p13 != null && c5176i.f42832r != null && !c5183p13.h() && !c5176i.f42832r.h()) {
                    T(c5176i, this.f42880c);
                    if (k() && V()) {
                        Matrix matrix8 = c5176i.f42837n;
                        if (matrix8 != null) {
                            this.f42878a.concat(matrix8);
                        }
                        Path pathZ = z(c5176i);
                        R(c5176i);
                        g(c5176i);
                        f(c5176i, c5176i.f42776h);
                        boolean zF9 = F();
                        if (this.f42880c.f42913b) {
                            l(c5176i, pathZ);
                        }
                        if (this.f42880c.f42914c) {
                            m(pathZ);
                        }
                        if (zF9) {
                            E(c5176i.f42776h);
                        }
                    }
                }
            } else if (n9 instanceof f.C5184q) {
                f.C5184q c5184q = (f.C5184q) n9;
                T(c5184q, this.f42880c);
                if (k() && V() && this.f42880c.f42914c) {
                    Matrix matrix9 = c5184q.f42837n;
                    if (matrix9 != null) {
                        this.f42878a.concat(matrix9);
                    }
                    f.C5183p c5183p14 = c5184q.f42847o;
                    float fE5 = c5183p14 == null ? 0.0f : c5183p14.e(this);
                    f.C5183p c5183p15 = c5184q.f42848p;
                    float f13 = c5183p15 == null ? 0.0f : c5183p15.f(this);
                    f.C5183p c5183p16 = c5184q.f42849q;
                    float fE6 = c5183p16 == null ? 0.0f : c5183p16.e(this);
                    f.C5183p c5183p17 = c5184q.f42850r;
                    f = c5183p17 != null ? c5183p17.f(this) : 0.0f;
                    if (c5184q.f42776h == null) {
                        c5184q.f42776h = new f.C5170b(Math.min(fE5, fE6), Math.min(f13, f), Math.abs(fE6 - fE5), Math.abs(f - f13));
                    }
                    Path path2 = new Path();
                    path2.moveTo(fE5, f13);
                    path2.lineTo(fE6, f);
                    R(c5184q);
                    g(c5184q);
                    f(c5184q, c5184q.f42776h);
                    boolean zF10 = F();
                    m(path2);
                    K(c5184q);
                    if (zF10) {
                        E(c5184q.f42776h);
                    }
                }
            } else if (n9 instanceof f.A) {
                f.A a10 = (f.A) n9;
                T(a10, this.f42880c);
                if (k() && V()) {
                    h hVar5 = this.f42880c;
                    if (hVar5.f42914c || hVar5.f42913b) {
                        Matrix matrix10 = a10.f42837n;
                        if (matrix10 != null) {
                            this.f42878a.concat(matrix10);
                        }
                        if (a10.f42876o.length >= 2) {
                            Path pathA = A(a10);
                            R(a10);
                            g(a10);
                            f(a10, a10.f42776h);
                            boolean zF11 = F();
                            if (this.f42880c.f42913b) {
                                l(a10, pathA);
                            }
                            if (this.f42880c.f42914c) {
                                m(pathA);
                            }
                            K(a10);
                            if (zF11) {
                                E(a10.f42776h);
                            }
                        }
                    }
                }
            } else if (n9 instanceof f.C5193z) {
                f.C5193z c5193z = (f.C5193z) n9;
                T(c5193z, this.f42880c);
                if (k() && V()) {
                    h hVar6 = this.f42880c;
                    if (hVar6.f42914c || hVar6.f42913b) {
                        Matrix matrix11 = c5193z.f42837n;
                        if (matrix11 != null) {
                            this.f42878a.concat(matrix11);
                        }
                        if (c5193z.f42876o.length >= 2) {
                            Path pathA2 = A(c5193z);
                            R(c5193z);
                            f.E.a aVar2 = this.f42880c.f42912a.f42742d;
                            pathA2.setFillType((aVar2 == null || aVar2 != f.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            g(c5193z);
                            f(c5193z, c5193z.f42776h);
                            boolean zF12 = F();
                            if (this.f42880c.f42913b) {
                                l(c5193z, pathA2);
                            }
                            if (this.f42880c.f42914c) {
                                m(pathA2);
                            }
                            K(c5193z);
                            if (zF12) {
                                E(c5193z.f42776h);
                            }
                        }
                    }
                }
            } else if (n9 instanceof f.W) {
                f.W w10 = (f.W) n9;
                T(w10, this.f42880c);
                if (k()) {
                    Matrix matrix12 = w10.f42798r;
                    if (matrix12 != null) {
                        this.f42878a.concat(matrix12);
                    }
                    ArrayList arrayList = w10.f42803n;
                    float fE7 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((f.C5183p) w10.f42803n.get(0)).e(this);
                    ArrayList arrayList2 = w10.f42804o;
                    float f14 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((f.C5183p) w10.f42804o.get(0)).f(this);
                    ArrayList arrayList3 = w10.f42805p;
                    float fE8 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((f.C5183p) w10.f42805p.get(0)).e(this);
                    ArrayList arrayList4 = w10.f42806q;
                    if (arrayList4 != null && arrayList4.size() != 0) {
                        f = ((f.C5183p) w10.f42806q.get(0)).f(this);
                    }
                    f.E.EnumC0473f enumC0473fV = v();
                    if (enumC0473fV != f.E.EnumC0473f.Start) {
                        float fD = d(w10);
                        if (enumC0473fV == f.E.EnumC0473f.Middle) {
                            fD /= 2.0f;
                        }
                        fE7 -= fD;
                    }
                    if (w10.f42776h == null) {
                        i iVar = new i(fE7, f14);
                        n(w10, iVar);
                        RectF rectF = iVar.f42922c;
                        w10.f42776h = new f.C5170b(rectF.left, rectF.top, rectF.width(), iVar.f42922c.height());
                    }
                    R(w10);
                    g(w10);
                    f(w10, w10.f42776h);
                    boolean zF13 = F();
                    n(w10, new f(fE7 + fE8, f14 + f));
                    if (zF13) {
                        E(w10.f42776h);
                    }
                }
            }
        }
        O();
    }

    public final void I(f.H h10, boolean z10) {
        if (z10) {
            this.f42882e.push(h10);
            this.f42883f.push(this.f42878a.getMatrix());
        }
        Iterator it = h10.i.iterator();
        while (it.hasNext()) {
            H((f.N) it.next());
        }
        if (z10) {
            this.f42882e.pop();
            this.f42883f.pop();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f7, code lost:
    
        if (r8 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J(j3.f.C5185r r13, j3.g.c r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.g.J(j3.f$r, j3.g$c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(j3.f.AbstractC5179l r20) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.g.K(j3.f$l):void");
    }

    public final void L(f.C5186s c5186s, f.C5170b c5170b) {
        float fE;
        float f10;
        Boolean bool = c5186s.f42857n;
        if (bool == null || !bool.booleanValue()) {
            f.C5183p c5183p = c5186s.f42859p;
            float fB = c5183p != null ? c5183p.b(this, 1.0f) : 1.2f;
            f.C5183p c5183p2 = c5186s.f42860q;
            float fB2 = c5183p2 != null ? c5183p2.b(this, 1.0f) : 1.2f;
            fE = fB * c5170b.f42809c;
            f10 = fB2 * c5170b.f42810d;
        } else {
            f.C5183p c5183p3 = c5186s.f42859p;
            fE = c5183p3 != null ? c5183p3.e(this) : c5170b.f42809c;
            f.C5183p c5183p4 = c5186s.f42860q;
            f10 = c5183p4 != null ? c5183p4.f(this) : c5170b.f42810d;
        }
        if (fE == 0.0f || f10 == 0.0f) {
            return;
        }
        P();
        h hVarT = t(c5186s);
        this.f42880c = hVarT;
        hVarT.f42912a.f42751n = Float.valueOf(1.0f);
        boolean zF = F();
        Canvas canvas = this.f42878a;
        canvas.save();
        Boolean bool2 = c5186s.f42858o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(c5170b.f42807a, c5170b.f42808b);
            canvas.scale(c5170b.f42809c, c5170b.f42810d);
        }
        I(c5186s, false);
        canvas.restore();
        if (zF) {
            E(c5170b);
        }
        O();
    }

    public final void M(float f10, float f11, float f12, float f13) {
        float fE = f12 + f10;
        float f14 = f13 + f11;
        f.C5171c c5171c = this.f42880c.f42912a.f42761x;
        if (c5171c != null) {
            f10 += c5171c.f42814d.e(this);
            f11 += this.f42880c.f42912a.f42761x.f42811a.f(this);
            fE -= this.f42880c.f42912a.f42761x.f42812b.e(this);
            f14 -= this.f42880c.f42912a.f42761x.f42813c.f(this);
        }
        this.f42878a.clipRect(f10, f11, fE, f14);
    }

    public final void O() {
        this.f42878a.restore();
        this.f42880c = this.f42881d.pop();
    }

    public final void P() {
        this.f42878a.save();
        this.f42881d.push(this.f42880c);
        this.f42880c = new h(this.f42880c);
    }

    public final String Q(String str, boolean z10, boolean z11) {
        if (this.f42880c.f42919h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String strReplaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z10) {
            strReplaceAll = strReplaceAll.replaceAll("^\\s+", "");
        }
        if (z11) {
            strReplaceAll = strReplaceAll.replaceAll("\\s+$", "");
        }
        return strReplaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void R(f.K k10) {
        if (k10.f42787b == null || k10.f42776h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (this.f42883f.peek().invert(matrix)) {
            f.C5170b c5170b = k10.f42776h;
            float f10 = c5170b.f42807a;
            float f11 = c5170b.f42808b;
            float fA = c5170b.a();
            f.C5170b c5170b2 = k10.f42776h;
            float f12 = c5170b2.f42808b;
            float fA2 = c5170b2.a();
            float fB = k10.f42776h.b();
            f.C5170b c5170b3 = k10.f42776h;
            float[] fArr = {f10, f11, fA, f12, fA2, fB, c5170b3.f42807a, c5170b3.b()};
            matrix.preConcat(this.f42878a.getMatrix());
            matrix.mapPoints(fArr);
            float f13 = fArr[0];
            float f14 = fArr[1];
            RectF rectF = new RectF(f13, f14, f13, f14);
            for (int i10 = 2; i10 <= 6; i10 += 2) {
                float f15 = fArr[i10];
                if (f15 < rectF.left) {
                    rectF.left = f15;
                }
                if (f15 > rectF.right) {
                    rectF.right = f15;
                }
                float f16 = fArr[i10 + 1];
                if (f16 < rectF.top) {
                    rectF.top = f16;
                }
                if (f16 > rectF.bottom) {
                    rectF.bottom = f16;
                }
            }
            f.K k11 = (f.K) this.f42882e.peek();
            f.C5170b c5170b4 = k11.f42776h;
            if (c5170b4 == null) {
                float f17 = rectF.left;
                float f18 = rectF.top;
                k11.f42776h = new f.C5170b(f17, f18, rectF.right - f17, rectF.bottom - f18);
                return;
            }
            float f19 = rectF.left;
            float f20 = rectF.top;
            float f21 = rectF.right - f19;
            float f22 = rectF.bottom - f20;
            if (f19 < c5170b4.f42807a) {
                c5170b4.f42807a = f19;
            }
            if (f20 < c5170b4.f42808b) {
                c5170b4.f42808b = f20;
            }
            if (f19 + f21 > c5170b4.a()) {
                c5170b4.f42809c = (f19 + f21) - c5170b4.f42807a;
            }
            if (f20 + f22 > c5170b4.b()) {
                c5170b4.f42810d = (f20 + f22) - c5170b4.f42808b;
            }
        }
    }

    public final void S(h hVar, f.E e4) {
        f.E e10;
        if (x(e4, 4096L)) {
            hVar.f42912a.f42752o = e4.f42752o;
        }
        if (x(e4, 2048L)) {
            hVar.f42912a.f42751n = e4.f42751n;
        }
        boolean zX = x(e4, 1L);
        f.C0474f c0474f = f.C0474f.f42826d;
        if (zX) {
            hVar.f42912a.f42741c = e4.f42741c;
            f.O o10 = e4.f42741c;
            hVar.f42913b = (o10 == null || o10 == c0474f) ? false : true;
        }
        if (x(e4, 4L)) {
            hVar.f42912a.f42743e = e4.f42743e;
        }
        if (x(e4, 6149L)) {
            N(hVar, true, hVar.f42912a.f42741c);
        }
        if (x(e4, 2L)) {
            hVar.f42912a.f42742d = e4.f42742d;
        }
        if (x(e4, 8L)) {
            hVar.f42912a.f42744f = e4.f42744f;
            f.O o11 = e4.f42744f;
            hVar.f42914c = (o11 == null || o11 == c0474f) ? false : true;
        }
        if (x(e4, 16L)) {
            hVar.f42912a.f42745g = e4.f42745g;
        }
        if (x(e4, 6168L)) {
            N(hVar, false, hVar.f42912a.f42744f);
        }
        if (x(e4, 34359738368L)) {
            hVar.f42912a.f42738M = e4.f42738M;
        }
        if (x(e4, 32L)) {
            f.E e11 = hVar.f42912a;
            f.C5183p c5183p = e4.f42746h;
            e11.f42746h = c5183p;
            hVar.f42916e.setStrokeWidth(c5183p.a(this));
        }
        if (x(e4, 64L)) {
            hVar.f42912a.i = e4.i;
            int i10 = a.f42885b[e4.i.ordinal()];
            Paint paint = hVar.f42916e;
            if (i10 == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i10 == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i10 == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (x(e4, 128L)) {
            hVar.f42912a.f42747j = e4.f42747j;
            int i11 = a.f42886c[e4.f42747j.ordinal()];
            Paint paint2 = hVar.f42916e;
            if (i11 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i11 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i11 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (x(e4, 256L)) {
            hVar.f42912a.f42748k = e4.f42748k;
            hVar.f42916e.setStrokeMiter(e4.f42748k.floatValue());
        }
        if (x(e4, 512L)) {
            hVar.f42912a.f42749l = e4.f42749l;
        }
        if (x(e4, 1024L)) {
            hVar.f42912a.f42750m = e4.f42750m;
        }
        Typeface typefaceH = null;
        if (x(e4, 1536L)) {
            f.C5183p[] c5183pArr = hVar.f42912a.f42749l;
            Paint paint3 = hVar.f42916e;
            if (c5183pArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = c5183pArr.length;
                int i12 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i12];
                int i13 = 0;
                float f10 = 0.0f;
                while (true) {
                    e10 = hVar.f42912a;
                    if (i13 >= i12) {
                        break;
                    }
                    float fA = e10.f42749l[i13 % length].a(this);
                    fArr[i13] = fA;
                    f10 += fA;
                    i13++;
                }
                if (f10 == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float fA2 = e10.f42750m.a(this);
                    if (fA2 < 0.0f) {
                        fA2 = (fA2 % f10) + f10;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, fA2));
                }
            }
        }
        if (x(e4, 16384L)) {
            float textSize = this.f42880c.f42915d.getTextSize();
            hVar.f42912a.f42754q = e4.f42754q;
            hVar.f42915d.setTextSize(e4.f42754q.b(this, textSize));
            hVar.f42916e.setTextSize(e4.f42754q.b(this, textSize));
        }
        if (x(e4, 8192L)) {
            hVar.f42912a.f42753p = e4.f42753p;
        }
        if (x(e4, 32768L)) {
            if (e4.f42755r.intValue() == -1 && hVar.f42912a.f42755r.intValue() > 100) {
                f.E e12 = hVar.f42912a;
                e12.f42755r = Integer.valueOf(e12.f42755r.intValue() - 100);
            } else if (e4.f42755r.intValue() != 1 || hVar.f42912a.f42755r.intValue() >= 900) {
                hVar.f42912a.f42755r = e4.f42755r;
            } else {
                f.E e13 = hVar.f42912a;
                e13.f42755r = Integer.valueOf(e13.f42755r.intValue() + 100);
            }
        }
        if (x(e4, 65536L)) {
            hVar.f42912a.f42756s = e4.f42756s;
        }
        if (x(e4, 106496L)) {
            f.E e14 = hVar.f42912a;
            ArrayList arrayList = e14.f42753p;
            if (arrayList != null && this.f42879b != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typefaceH = h((String) it.next(), e14.f42755r, e14.f42756s)) == null) {
                }
            }
            if (typefaceH == null) {
                typefaceH = h("serif", e14.f42755r, e14.f42756s);
            }
            hVar.f42915d.setTypeface(typefaceH);
            hVar.f42916e.setTypeface(typefaceH);
        }
        if (x(e4, 131072L)) {
            hVar.f42912a.f42757t = e4.f42757t;
            f.E.g gVar = e4.f42757t;
            f.E.g gVar2 = f.E.g.LineThrough;
            boolean z10 = gVar == gVar2;
            Paint paint4 = hVar.f42915d;
            paint4.setStrikeThruText(z10);
            f.E.g gVar3 = e4.f42757t;
            f.E.g gVar4 = f.E.g.Underline;
            paint4.setUnderlineText(gVar3 == gVar4);
            boolean z11 = e4.f42757t == gVar2;
            Paint paint5 = hVar.f42916e;
            paint5.setStrikeThruText(z11);
            paint5.setUnderlineText(e4.f42757t == gVar4);
        }
        if (x(e4, 68719476736L)) {
            hVar.f42912a.f42758u = e4.f42758u;
        }
        if (x(e4, 262144L)) {
            hVar.f42912a.f42759v = e4.f42759v;
        }
        if (x(e4, 524288L)) {
            hVar.f42912a.f42760w = e4.f42760w;
        }
        if (x(e4, 2097152L)) {
            hVar.f42912a.f42762y = e4.f42762y;
        }
        if (x(e4, 4194304L)) {
            hVar.f42912a.f42763z = e4.f42763z;
        }
        if (x(e4, 8388608L)) {
            hVar.f42912a.f42726A = e4.f42726A;
        }
        if (x(e4, 16777216L)) {
            hVar.f42912a.f42727B = e4.f42727B;
        }
        if (x(e4, 33554432L)) {
            hVar.f42912a.f42728C = e4.f42728C;
        }
        if (x(e4, 1048576L)) {
            hVar.f42912a.f42761x = e4.f42761x;
        }
        if (x(e4, 268435456L)) {
            hVar.f42912a.f42731F = e4.f42731F;
        }
        if (x(e4, 536870912L)) {
            hVar.f42912a.f42732G = e4.f42732G;
        }
        if (x(e4, 1073741824L)) {
            hVar.f42912a.f42733H = e4.f42733H;
        }
        if (x(e4, 67108864L)) {
            hVar.f42912a.f42729D = e4.f42729D;
        }
        if (x(e4, 134217728L)) {
            hVar.f42912a.f42730E = e4.f42730E;
        }
        if (x(e4, 8589934592L)) {
            hVar.f42912a.f42736K = e4.f42736K;
        }
        if (x(e4, 17179869184L)) {
            hVar.f42912a.f42737L = e4.f42737L;
        }
        if (x(e4, 137438953472L)) {
            hVar.f42912a.f42739N = e4.f42739N;
        }
    }

    public final void T(f.L l5, h hVar) {
        boolean z10 = l5.f42787b == null;
        f.E e4 = hVar.f42912a;
        Boolean bool = Boolean.TRUE;
        e4.f42727B = bool;
        if (!z10) {
            bool = Boolean.FALSE;
        }
        e4.f42760w = bool;
        e4.f42761x = null;
        e4.f42731F = null;
        e4.f42751n = Float.valueOf(1.0f);
        e4.f42729D = f.C0474f.f42825c;
        e4.f42730E = Float.valueOf(1.0f);
        e4.f42733H = null;
        e4.f42734I = null;
        e4.f42735J = Float.valueOf(1.0f);
        e4.f42736K = null;
        e4.f42737L = Float.valueOf(1.0f);
        e4.f42738M = f.E.i.None;
        f.E e10 = l5.f42779e;
        if (e10 != null) {
            S(hVar, e10);
        }
        ArrayList arrayList = this.f42879b.f42717b.f42700a;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.f42879b.f42717b.f42700a.iterator();
            while (it.hasNext()) {
                b.p pVar = (b.p) it.next();
                if (j3.b.g(pVar.f42697a, l5)) {
                    S(hVar, pVar.f42698b);
                }
            }
        }
        f.E e11 = l5.f42780f;
        if (e11 != null) {
            S(hVar, e11);
        }
    }

    public final void U() {
        int i10;
        f.E e4 = this.f42880c.f42912a;
        f.O o10 = e4.f42736K;
        if (o10 instanceof f.C0474f) {
            i10 = ((f.C0474f) o10).f42827b;
        } else if (!(o10 instanceof f.C5174g)) {
            return;
        } else {
            i10 = e4.f42752o.f42827b;
        }
        Float f10 = e4.f42737L;
        if (f10 != null) {
            i10 = i(f10.floatValue(), i10);
        }
        this.f42878a.drawColor(i10);
    }

    public final boolean V() {
        Boolean bool = this.f42880c.f42912a.f42728C;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    @TargetApi(19)
    public final Path b(f.K k10, f.C5170b c5170b) {
        Path pathD;
        f.L lF = k10.f42786a.f(this.f42880c.f42912a.f42731F);
        if (lF == null) {
            o("ClipPath reference '%s' not found", this.f42880c.f42912a.f42731F);
            return null;
        }
        f.C5173e c5173e = (f.C5173e) lF;
        this.f42881d.push(this.f42880c);
        this.f42880c = t(c5173e);
        Boolean bool = c5173e.f42819o;
        boolean z10 = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z10) {
            matrix.preTranslate(c5170b.f42807a, c5170b.f42808b);
            matrix.preScale(c5170b.f42809c, c5170b.f42810d);
        }
        Matrix matrix2 = c5173e.f42838n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        Iterator it = c5173e.i.iterator();
        while (it.hasNext()) {
            f.N n9 = (f.N) it.next();
            if ((n9 instanceof f.K) && (pathD = D((f.K) n9, true)) != null) {
                path.op(pathD, Path.Op.UNION);
            }
        }
        if (this.f42880c.f42912a.f42731F != null) {
            if (c5173e.f42776h == null) {
                c5173e.f42776h = c(path);
            }
            Path pathB = b(c5173e, c5173e.f42776h);
            if (pathB != null) {
                path.op(pathB, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.f42880c = this.f42881d.pop();
        return path;
    }

    public final float d(f.Y y10) {
        k kVar = new k();
        n(y10, kVar);
        return kVar.f42924a;
    }

    public final void f(f.K k10, f.C5170b c5170b) {
        Path pathB;
        if (this.f42880c.f42912a.f42731F == null || (pathB = b(k10, c5170b)) == null) {
            return;
        }
        this.f42878a.clipPath(pathB);
    }

    public final void g(f.K k10) {
        f.O o10 = this.f42880c.f42912a.f42741c;
        if (o10 instanceof f.C5188u) {
            j(true, k10.f42776h, (f.C5188u) o10);
        }
        f.O o11 = this.f42880c.f42912a.f42744f;
        if (o11 instanceof f.C5188u) {
            j(false, k10.f42776h, (f.C5188u) o11);
        }
    }

    public final void j(boolean z10, f.C5170b c5170b, f.C5188u c5188u) {
        float f10;
        float fB;
        float f11;
        float f12;
        float fB2;
        float f13;
        float fB3;
        float f14;
        f.L lF = this.f42879b.f(c5188u.f42861b);
        if (lF == null) {
            o("%s reference '%s' not found", z10 ? "Fill" : "Stroke", c5188u.f42861b);
            f.O o10 = c5188u.f42862c;
            if (o10 != null) {
                N(this.f42880c, z10, o10);
                return;
            } else if (z10) {
                this.f42880c.f42913b = false;
                return;
            } else {
                this.f42880c.f42914c = false;
                return;
            }
        }
        boolean z11 = lF instanceof f.M;
        f.C0474f c0474f = f.C0474f.f42825c;
        if (z11) {
            f.M m10 = (f.M) lF;
            String str = m10.f42836l;
            if (str != null) {
                q(m10, str);
            }
            Boolean bool = m10.i;
            boolean z12 = bool != null && bool.booleanValue();
            h hVar = this.f42880c;
            Paint paint = z10 ? hVar.f42915d : hVar.f42916e;
            if (z12) {
                h hVar2 = this.f42880c;
                f.C5170b c5170b2 = hVar2.f42918g;
                if (c5170b2 == null) {
                    c5170b2 = hVar2.f42917f;
                }
                f.C5183p c5183p = m10.f42782m;
                float fE = c5183p != null ? c5183p.e(this) : 0.0f;
                f.C5183p c5183p2 = m10.f42783n;
                fB2 = c5183p2 != null ? c5183p2.f(this) : 0.0f;
                f12 = 256.0f;
                f.C5183p c5183p3 = m10.f42784o;
                float fE2 = c5183p3 != null ? c5183p3.e(this) : c5170b2.f42809c;
                f.C5183p c5183p4 = m10.f42785p;
                f14 = fE2;
                f13 = fE;
                fB3 = c5183p4 != null ? c5183p4.f(this) : 0.0f;
            } else {
                f12 = 256.0f;
                f.C5183p c5183p5 = m10.f42782m;
                float fB4 = c5183p5 != null ? c5183p5.b(this, 1.0f) : 0.0f;
                f.C5183p c5183p6 = m10.f42783n;
                fB2 = c5183p6 != null ? c5183p6.b(this, 1.0f) : 0.0f;
                f.C5183p c5183p7 = m10.f42784o;
                float fB5 = c5183p7 != null ? c5183p7.b(this, 1.0f) : 1.0f;
                f.C5183p c5183p8 = m10.f42785p;
                f13 = fB4;
                fB3 = c5183p8 != null ? c5183p8.b(this, 1.0f) : 0.0f;
                f14 = fB5;
            }
            float f15 = fB2;
            P();
            this.f42880c = t(m10);
            Matrix matrix = new Matrix();
            if (!z12) {
                matrix.preTranslate(c5170b.f42807a, c5170b.f42808b);
                matrix.preScale(c5170b.f42809c, c5170b.f42810d);
            }
            Matrix matrix2 = m10.f42834j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = m10.f42833h.size();
            if (size == 0) {
                O();
                if (z10) {
                    this.f42880c.f42913b = false;
                    return;
                } else {
                    this.f42880c.f42914c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = m10.f42833h.iterator();
            int i10 = 0;
            float f16 = -1.0f;
            while (it.hasNext()) {
                f.D d10 = (f.D) ((f.N) it.next());
                Float f17 = d10.f42725h;
                float fFloatValue = f17 != null ? f17.floatValue() : 0.0f;
                if (i10 == 0 || fFloatValue >= f16) {
                    fArr[i10] = fFloatValue;
                    f16 = fFloatValue;
                } else {
                    fArr[i10] = f16;
                }
                P();
                T(d10, this.f42880c);
                f.E e4 = this.f42880c.f42912a;
                f.C0474f c0474f2 = (f.C0474f) e4.f42729D;
                if (c0474f2 == null) {
                    c0474f2 = c0474f;
                }
                iArr[i10] = i(e4.f42730E.floatValue(), c0474f2.f42827b);
                i10++;
                O();
            }
            if ((f13 == f14 && f15 == fB3) || size == 1) {
                O();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            f.EnumC5178k enumC5178k = m10.f42835k;
            if (enumC5178k != null) {
                if (enumC5178k == f.EnumC5178k.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (enumC5178k == f.EnumC5178k.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            O();
            LinearGradient linearGradient = new LinearGradient(f13, f15, f14, fB3, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int iFloatValue = (int) (this.f42880c.f42912a.f42743e.floatValue() * f12);
            paint.setAlpha(iFloatValue >= 0 ? iFloatValue > 255 ? 255 : iFloatValue : 0);
            return;
        }
        if (!(lF instanceof f.Q)) {
            if (lF instanceof f.C) {
                f.C c10 = (f.C) lF;
                if (z10) {
                    if (x(c10.f42779e, 2147483648L)) {
                        h hVar3 = this.f42880c;
                        f.E e10 = hVar3.f42912a;
                        f.O o11 = c10.f42779e.f42734I;
                        e10.f42741c = o11;
                        hVar3.f42913b = o11 != null;
                    }
                    if (x(c10.f42779e, 4294967296L)) {
                        this.f42880c.f42912a.f42743e = c10.f42779e.f42735J;
                    }
                    if (x(c10.f42779e, 6442450944L)) {
                        h hVar4 = this.f42880c;
                        N(hVar4, z10, hVar4.f42912a.f42741c);
                        return;
                    }
                    return;
                }
                if (x(c10.f42779e, 2147483648L)) {
                    h hVar5 = this.f42880c;
                    f.E e11 = hVar5.f42912a;
                    f.O o12 = c10.f42779e.f42734I;
                    e11.f42744f = o12;
                    hVar5.f42914c = o12 != null;
                }
                if (x(c10.f42779e, 4294967296L)) {
                    this.f42880c.f42912a.f42745g = c10.f42779e.f42735J;
                }
                if (x(c10.f42779e, 6442450944L)) {
                    h hVar6 = this.f42880c;
                    N(hVar6, z10, hVar6.f42912a.f42744f);
                    return;
                }
                return;
            }
            return;
        }
        f.Q q10 = (f.Q) lF;
        String str2 = q10.f42836l;
        if (str2 != null) {
            q(q10, str2);
        }
        Boolean bool2 = q10.i;
        boolean z13 = bool2 != null && bool2.booleanValue();
        h hVar7 = this.f42880c;
        Paint paint2 = z10 ? hVar7.f42915d : hVar7.f42916e;
        if (z13) {
            f.C5183p c5183p9 = new f.C5183p(50.0f, f.d0.percent);
            f.C5183p c5183p10 = q10.f42789m;
            float fE3 = c5183p10 != null ? c5183p10.e(this) : c5183p9.e(this);
            f.C5183p c5183p11 = q10.f42790n;
            float f18 = c5183p11 != null ? c5183p11.f(this) : c5183p9.f(this);
            f.C5183p c5183p12 = q10.f42791o;
            fB = c5183p12 != null ? c5183p12.a(this) : c5183p9.a(this);
            f10 = fE3;
            f11 = f18;
        } else {
            f.C5183p c5183p13 = q10.f42789m;
            float fB6 = c5183p13 != null ? c5183p13.b(this, 1.0f) : 0.5f;
            f.C5183p c5183p14 = q10.f42790n;
            float fB7 = c5183p14 != null ? c5183p14.b(this, 1.0f) : 0.5f;
            f.C5183p c5183p15 = q10.f42791o;
            f10 = fB6;
            fB = c5183p15 != null ? c5183p15.b(this, 1.0f) : 0.5f;
            f11 = fB7;
        }
        P();
        this.f42880c = t(q10);
        Matrix matrix3 = new Matrix();
        if (!z13) {
            matrix3.preTranslate(c5170b.f42807a, c5170b.f42808b);
            matrix3.preScale(c5170b.f42809c, c5170b.f42810d);
        }
        Matrix matrix4 = q10.f42834j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = q10.f42833h.size();
        if (size2 == 0) {
            O();
            if (z10) {
                this.f42880c.f42913b = false;
                return;
            } else {
                this.f42880c.f42914c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = q10.f42833h.iterator();
        int i11 = 0;
        float f19 = -1.0f;
        while (it2.hasNext()) {
            f.D d11 = (f.D) ((f.N) it2.next());
            Float f20 = d11.f42725h;
            float fFloatValue2 = f20 != null ? f20.floatValue() : 0.0f;
            if (i11 == 0 || fFloatValue2 >= f19) {
                fArr2[i11] = fFloatValue2;
                f19 = fFloatValue2;
            } else {
                fArr2[i11] = f19;
            }
            P();
            T(d11, this.f42880c);
            f.E e12 = this.f42880c.f42912a;
            f.C0474f c0474f3 = (f.C0474f) e12.f42729D;
            if (c0474f3 == null) {
                c0474f3 = c0474f;
            }
            iArr2[i11] = i(e12.f42730E.floatValue(), c0474f3.f42827b);
            i11++;
            O();
        }
        if (fB == 0.0f || size2 == 1) {
            O();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        f.EnumC5178k enumC5178k2 = q10.f42835k;
        if (enumC5178k2 != null) {
            if (enumC5178k2 == f.EnumC5178k.reflect) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (enumC5178k2 == f.EnumC5178k.repeat) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        O();
        RadialGradient radialGradient = new RadialGradient(f10, f11, fB, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int iFloatValue2 = (int) (this.f42880c.f42912a.f42743e.floatValue() * 256.0f);
        paint2.setAlpha(iFloatValue2 >= 0 ? iFloatValue2 > 255 ? 255 : iFloatValue2 : 0);
    }

    public final boolean k() {
        Boolean bool = this.f42880c.f42912a.f42727B;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(j3.f.K r23, android.graphics.Path r24) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.g.l(j3.f$K, android.graphics.Path):void");
    }

    public final void m(Path path) {
        h hVar = this.f42880c;
        f.E.i iVar = hVar.f42912a.f42738M;
        f.E.i iVar2 = f.E.i.NonScalingStroke;
        Canvas canvas = this.f42878a;
        if (iVar != iVar2) {
            canvas.drawPath(path, hVar.f42916e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.f42880c.f42916e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.f42880c.f42916e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void n(f.Y y10, j jVar) {
        float f10;
        float f11;
        float fE;
        f.E.EnumC0473f enumC0473fV;
        if (k()) {
            Iterator it = y10.i.iterator();
            boolean z10 = true;
            while (it.hasNext()) {
                f.N n9 = (f.N) it.next();
                if (n9 instanceof f.c0) {
                    jVar.b(Q(((f.c0) n9).f42815c, z10, !it.hasNext()));
                } else if (jVar.a((f.Y) n9)) {
                    if (n9 instanceof f.Z) {
                        P();
                        f.Z z11 = (f.Z) n9;
                        T(z11, this.f42880c);
                        if (k() && V()) {
                            f.L lF = z11.f42786a.f(z11.f42799n);
                            if (lF == null) {
                                o("TextPath reference '%s' not found", z11.f42799n);
                            } else {
                                f.C5189v c5189v = (f.C5189v) lF;
                                Path path = new d(c5189v.f42863o).f42900a;
                                Matrix matrix = c5189v.f42837n;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                f.C5183p c5183p = z11.f42800o;
                                f = c5183p != null ? c5183p.b(this, pathMeasure.getLength()) : 0.0f;
                                f.E.EnumC0473f enumC0473fV2 = v();
                                if (enumC0473fV2 != f.E.EnumC0473f.Start) {
                                    float fD = d(z11);
                                    if (enumC0473fV2 == f.E.EnumC0473f.Middle) {
                                        fD /= 2.0f;
                                    }
                                    f -= fD;
                                }
                                g((f.K) z11.f42801p);
                                boolean zF = F();
                                n(z11, new e(path, f));
                                if (zF) {
                                    E(z11.f42776h);
                                }
                            }
                        }
                        O();
                    } else if (n9 instanceof f.V) {
                        P();
                        f.V v10 = (f.V) n9;
                        T(v10, this.f42880c);
                        if (k()) {
                            ArrayList arrayList = v10.f42803n;
                            boolean z12 = arrayList != null && arrayList.size() > 0;
                            boolean z13 = jVar instanceof f;
                            if (z13) {
                                float fE2 = !z12 ? ((f) jVar).f42905a : ((f.C5183p) v10.f42803n.get(0)).e(this);
                                ArrayList arrayList2 = v10.f42804o;
                                f11 = (arrayList2 == null || arrayList2.size() == 0) ? ((f) jVar).f42906b : ((f.C5183p) v10.f42804o.get(0)).f(this);
                                ArrayList arrayList3 = v10.f42805p;
                                fE = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((f.C5183p) v10.f42805p.get(0)).e(this);
                                ArrayList arrayList4 = v10.f42806q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    f = ((f.C5183p) v10.f42806q.get(0)).f(this);
                                }
                                float f12 = fE2;
                                f10 = f;
                                f = f12;
                            } else {
                                f10 = 0.0f;
                                f11 = 0.0f;
                                fE = 0.0f;
                            }
                            if (z12 && (enumC0473fV = v()) != f.E.EnumC0473f.Start) {
                                float fD2 = d(v10);
                                if (enumC0473fV == f.E.EnumC0473f.Middle) {
                                    fD2 /= 2.0f;
                                }
                                f -= fD2;
                            }
                            g((f.K) v10.f42797r);
                            if (z13) {
                                f fVar = (f) jVar;
                                fVar.f42905a = f + fE;
                                fVar.f42906b = f11 + f10;
                            }
                            boolean zF2 = F();
                            n(v10, jVar);
                            if (zF2) {
                                E(v10.f42776h);
                            }
                        }
                        O();
                    } else if (n9 instanceof f.U) {
                        P();
                        f.U u8 = (f.U) n9;
                        T(u8, this.f42880c);
                        if (k()) {
                            g((f.K) u8.f42796o);
                            f.L lF2 = n9.f42786a.f(u8.f42795n);
                            if (lF2 == null || !(lF2 instanceof f.Y)) {
                                o("Tref reference '%s' not found", u8.f42795n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                p((f.Y) lF2, sb);
                                if (sb.length() > 0) {
                                    jVar.b(sb.toString());
                                }
                            }
                        }
                        O();
                    }
                }
                z10 = false;
            }
        }
    }

    public final void p(f.Y y10, StringBuilder sb) {
        Iterator it = y10.i.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            f.N n9 = (f.N) it.next();
            if (n9 instanceof f.Y) {
                p((f.Y) n9, sb);
            } else if (n9 instanceof f.c0) {
                sb.append(Q(((f.c0) n9).f42815c, z10, !it.hasNext()));
            }
            z10 = false;
        }
    }

    public final h t(f.L l5) {
        h hVar = new h();
        S(hVar, f.E.a());
        u(l5, hVar);
        return hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [j3.f$N] */
    public final void u(f.L l5, h hVar) {
        ArrayList arrayList = new ArrayList();
        f.L l10 = l5;
        while (true) {
            if (l10 instanceof f.L) {
                arrayList.add(0, l10);
            }
            Object obj = l10.f42787b;
            if (obj == null) {
                break;
            } else {
                l10 = (f.N) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            T((f.L) it.next(), hVar);
        }
        h hVar2 = this.f42880c;
        hVar.f42918g = hVar2.f42918g;
        hVar.f42917f = hVar2.f42917f;
    }

    public final f.E.EnumC0473f v() {
        f.E.EnumC0473f enumC0473f;
        f.E e4 = this.f42880c.f42912a;
        if (e4.f42758u == f.E.h.LTR || (enumC0473f = e4.f42759v) == f.E.EnumC0473f.Middle) {
            return e4.f42759v;
        }
        f.E.EnumC0473f enumC0473f2 = f.E.EnumC0473f.Start;
        return enumC0473f == enumC0473f2 ? f.E.EnumC0473f.End : enumC0473f2;
    }

    public final Path.FillType w() {
        f.E.a aVar = this.f42880c.f42912a.f42732G;
        return (aVar == null || aVar != f.E.a.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
    }

    public final Path y(f.C5172d c5172d) {
        f.C5183p c5183p = c5172d.f42816o;
        float fE = c5183p != null ? c5183p.e(this) : 0.0f;
        f.C5183p c5183p2 = c5172d.f42817p;
        float f10 = c5183p2 != null ? c5183p2.f(this) : 0.0f;
        float fA = c5172d.f42818q.a(this);
        float f11 = fE - fA;
        float f12 = f10 - fA;
        float f13 = fE + fA;
        float f14 = f10 + fA;
        if (c5172d.f42776h == null) {
            float f15 = 2.0f * fA;
            c5172d.f42776h = new f.C5170b(f11, f12, f15, f15);
        }
        float f16 = fA * 0.5522848f;
        Path path = new Path();
        path.moveTo(fE, f12);
        float f17 = fE + f16;
        float f18 = f10 - f16;
        path.cubicTo(f17, f12, f13, f18, f13, f10);
        float f19 = f10 + f16;
        path.cubicTo(f13, f19, f17, f14, fE, f14);
        float f20 = fE - f16;
        path.cubicTo(f20, f14, f11, f19, f11, f10);
        path.cubicTo(f11, f18, f20, f12, fE, f12);
        path.close();
        return path;
    }

    public final Path z(f.C5176i c5176i) {
        f.C5183p c5183p = c5176i.f42829o;
        float fE = c5183p != null ? c5183p.e(this) : 0.0f;
        f.C5183p c5183p2 = c5176i.f42830p;
        float f10 = c5183p2 != null ? c5183p2.f(this) : 0.0f;
        float fE2 = c5176i.f42831q.e(this);
        float f11 = c5176i.f42832r.f(this);
        float f12 = fE - fE2;
        float f13 = f10 - f11;
        float f14 = fE + fE2;
        float f15 = f10 + f11;
        if (c5176i.f42776h == null) {
            c5176i.f42776h = new f.C5170b(f12, f13, fE2 * 2.0f, 2.0f * f11);
        }
        float f16 = fE2 * 0.5522848f;
        float f17 = f11 * 0.5522848f;
        Path path = new Path();
        path.moveTo(fE, f13);
        float f18 = fE + f16;
        float f19 = f10 - f17;
        path.cubicTo(f18, f13, f14, f19, f14, f10);
        float f20 = f10 + f17;
        path.cubicTo(f14, f20, f18, f15, fE, f15);
        float f21 = fE - f16;
        path.cubicTo(f21, f15, f12, f20, f12, f10);
        path.cubicTo(f12, f19, f21, f13, fE, f13);
        path.close();
        return path;
    }

    /* compiled from: SVGAndroidRenderer.java */
    public class h {

        /* renamed from: a, reason: collision with root package name */
        public final f.E f42912a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f42913b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f42914c;

        /* renamed from: d, reason: collision with root package name */
        public final Paint f42915d;

        /* renamed from: e, reason: collision with root package name */
        public final Paint f42916e;

        /* renamed from: f, reason: collision with root package name */
        public f.C5170b f42917f;

        /* renamed from: g, reason: collision with root package name */
        public f.C5170b f42918g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f42919h;

        public h() {
            Paint paint = new Paint();
            this.f42915d = paint;
            paint.setFlags(193);
            paint.setHinting(0);
            paint.setStyle(Paint.Style.FILL);
            Typeface typeface = Typeface.DEFAULT;
            paint.setTypeface(typeface);
            Paint paint2 = new Paint();
            this.f42916e = paint2;
            paint2.setFlags(193);
            paint2.setHinting(0);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setTypeface(typeface);
            this.f42912a = f.E.a();
        }

        public h(h hVar) {
            this.f42913b = hVar.f42913b;
            this.f42914c = hVar.f42914c;
            this.f42915d = new Paint(hVar.f42915d);
            this.f42916e = new Paint(hVar.f42916e);
            f.C5170b c5170b = hVar.f42917f;
            if (c5170b != null) {
                this.f42917f = new f.C5170b(c5170b);
            }
            f.C5170b c5170b2 = hVar.f42918g;
            if (c5170b2 != null) {
                this.f42918g = new f.C5170b(c5170b2);
            }
            this.f42919h = hVar.f42919h;
            try {
                this.f42912a = (f.E) hVar.f42912a.clone();
            } catch (CloneNotSupportedException e4) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", e4);
                this.f42912a = f.E.a();
            }
        }
    }
}
