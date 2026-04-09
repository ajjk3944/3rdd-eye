package m0;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import m0.k1;
import m0.l1;

/* renamed from: m0.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6682S {

    /* renamed from: m0.S$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f52846a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f52847b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f52848c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f52846a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f52847b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f52848c = iArr3;
        }
    }

    public static final S0 a() {
        return new C6681Q();
    }

    public static final S0 b(Paint paint) {
        return new C6681Q(paint);
    }

    public static final float c(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(Paint paint) {
        return AbstractC6737x0.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        return !paint.isFilterBitmap() ? AbstractC6665E0.f52788a.b() : AbstractC6665E0.f52788a.a();
    }

    public static final int f(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : a.f52847b[strokeCap.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? k1.f52924a.a() : k1.f52924a.c() : k1.f52924a.b() : k1.f52924a.a();
    }

    public static final int g(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : a.f52848c[strokeJoin.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? l1.f52930a.b() : l1.f52930a.c() : l1.f52930a.a() : l1.f52930a.b();
    }

    public static final float h(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f10) {
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void l(Paint paint, boolean z10) {
        paint.setAntiAlias(z10);
    }

    public static final void m(Paint paint, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            r1.f52946a.a(paint, i10);
        } else {
            paint.setXfermode(new PorterDuffXfermode(AbstractC6666F.c(i10)));
        }
    }

    public static final void n(Paint paint, long j10) {
        paint.setColor(AbstractC6737x0.j(j10));
    }

    public static final void o(Paint paint, AbstractC6735w0 abstractC6735w0) {
        paint.setColorFilter(abstractC6735w0 != null ? AbstractC6672I.b(abstractC6735w0) : null);
    }

    public static final void p(Paint paint, int i10) {
        paint.setFilterBitmap(!AbstractC6665E0.d(i10, AbstractC6665E0.f52788a.b()));
    }

    public static final void q(Paint paint, V0 v02) {
        C6684U c6684u = (C6684U) v02;
        paint.setPathEffect(c6684u != null ? c6684u.a() : null);
    }

    public static final void r(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void s(Paint paint, int i10) {
        k1.a aVar = k1.f52924a;
        paint.setStrokeCap(k1.e(i10, aVar.c()) ? Paint.Cap.SQUARE : k1.e(i10, aVar.b()) ? Paint.Cap.ROUND : k1.e(i10, aVar.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public static final void t(Paint paint, int i10) {
        l1.a aVar = l1.f52930a;
        paint.setStrokeJoin(l1.e(i10, aVar.b()) ? Paint.Join.MITER : l1.e(i10, aVar.a()) ? Paint.Join.BEVEL : l1.e(i10, aVar.c()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void u(Paint paint, float f10) {
        paint.setStrokeMiter(f10);
    }

    public static final void v(Paint paint, float f10) {
        paint.setStrokeWidth(f10);
    }

    public static final void w(Paint paint, int i10) {
        paint.setStyle(T0.d(i10, T0.f52853a.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
