package w1;

import B1.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import java.util.List;
import o.C7030v;
import v1.e;
import v1.h;
import v2.AbstractC8187a;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    private static final q f64345a;

    /* renamed from: b, reason: collision with root package name */
    private static final C7030v f64346b;

    public static class a extends k.c {

        /* renamed from: a, reason: collision with root package name */
        private h.e f64347a;

        public a(h.e eVar) {
            this.f64347a = eVar;
        }

        @Override // B1.k.c
        public void a(int i10) {
            h.e eVar = this.f64347a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // B1.k.c
        public void b(Typeface typeface) {
            h.e eVar = this.f64347a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        AbstractC8187a.a("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f64345a = new p();
        } else if (i10 >= 28) {
            f64345a = new o();
        } else {
            f64345a = new n();
        }
        f64346b = new C7030v(16);
        AbstractC8187a.b();
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10) {
        AbstractC8187a.a("TypefaceCompat.createFromFontInfo");
        try {
            return f64345a.b(context, cancellationSignal, bVarArr, i10);
        } finally {
            AbstractC8187a.b();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        AbstractC8187a.a("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f64345a.c(context, cancellationSignal, list, i10);
        } finally {
            AbstractC8187a.b();
        }
    }

    public static Typeface d(Context context, e.b bVar, Resources resources, int i10, String str, int i11, int i12, h.e eVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof e.C2245e) {
            e.C2245e c2245e = (e.C2245e) bVar;
            Typeface typefaceH = h(c2245e.d());
            if (typefaceH != null) {
                if (eVar != null) {
                    eVar.d(typefaceH, handler);
                }
                return typefaceH;
            }
            typefaceA = B1.k.c(context, c2245e.a() != null ? k.a(new Object[]{c2245e.c(), c2245e.a()}) : k.a(new Object[]{c2245e.c()}), i12, !z10 ? eVar != null : c2245e.b() != 0, z10 ? c2245e.e() : -1, h.e.e(handler), new a(eVar));
        } else {
            typefaceA = f64345a.a(context, (e.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f64346b.d(f(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceD = f64345a.d(context, resources, i10, str, i12);
        if (typefaceD != null) {
            f64346b.d(f(resources, i10, str, i11, i12), typefaceD);
        }
        return typefaceD;
    }

    private static String f(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface g(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f64346b.c(f(resources, i10, str, i11, i12));
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
