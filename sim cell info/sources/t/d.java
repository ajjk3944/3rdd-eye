package t;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import s.c;
import s.f;
import x.b;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final j f3317a;

    /* renamed from: b, reason: collision with root package name */
    private static final k.e<String, Typeface> f3318b;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f3317a = i2 >= 29 ? new i() : i2 >= 28 ? new h() : i2 >= 26 ? new g() : (i2 < 24 || !f.m()) ? i2 >= 21 ? new e() : new j() : new f();
        f3318b = new k.e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i2) {
        Typeface typefaceG;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (typefaceG = g(context, typeface, i2)) == null) ? Typeface.create(typeface, i2) : typefaceG;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) {
        return f3317a.c(context, cancellationSignal, fVarArr, i2);
    }

    public static Typeface c(Context context, c.a aVar, Resources resources, int i2, int i3, f.a aVar2, Handler handler, boolean z2) throws NoSuchFieldException {
        Typeface typefaceB;
        if (aVar instanceof c.d) {
            c.d dVar = (c.d) aVar;
            boolean z3 = false;
            if (!z2 ? aVar2 == null : dVar.a() == 0) {
                z3 = true;
            }
            typefaceB = x.b.g(context, dVar.b(), aVar2, handler, z3, z2 ? dVar.c() : -1, i3);
        } else {
            typefaceB = f3317a.b(context, (c.b) aVar, resources, i3);
            if (aVar2 != null) {
                if (typefaceB != null) {
                    aVar2.b(typefaceB, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typefaceB != null) {
            f3318b.d(e(resources, i2, i3), typefaceB);
        }
        return typefaceB;
    }

    public static Typeface d(Context context, Resources resources, int i2, String str, int i3) {
        Typeface typefaceE = f3317a.e(context, resources, i2, str, i3);
        if (typefaceE != null) {
            f3318b.d(e(resources, i2, i3), typefaceE);
        }
        return typefaceE;
    }

    private static String e(Resources resources, int i2, int i3) {
        return resources.getResourcePackageName(i2) + "-" + i2 + "-" + i3;
    }

    public static Typeface f(Resources resources, int i2, int i3) {
        return f3318b.c(e(resources, i2, i3));
    }

    private static Typeface g(Context context, Typeface typeface, int i2) throws NoSuchFieldException {
        j jVar = f3317a;
        c.b bVarI = jVar.i(typeface);
        if (bVarI == null) {
            return null;
        }
        return jVar.b(context, bVarI, context.getResources(), i2);
    }
}
