package j0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.content.res.a;
import androidx.core.provider.FontsContractCompat;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f21695a;

    /* renamed from: b, reason: collision with root package name */
    public static final r.j f21696b;

    public static class a extends FontsContractCompat.FontRequestCallback {

        /* renamed from: a, reason: collision with root package name */
        public a.e f21697a;

        public a(a.e eVar) {
            this.f21697a = eVar;
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void a(int i10) {
            a.e eVar = this.f21697a;
            if (eVar != null) {
                eVar.f(i10);
            }
        }

        @Override // androidx.core.provider.FontsContractCompat.FontRequestCallback
        public void b(Typeface typeface) {
            a.e eVar = this.f21697a;
            if (eVar != null) {
                eVar.g(typeface);
            }
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f21695a = new j();
        } else if (i10 >= 28) {
            f21695a = new i();
        } else if (i10 >= 26) {
            f21695a = new h();
        } else if (i10 < 24 || !g.j()) {
            f21695a = new f();
        } else {
            f21695a = new g();
        }
        f21696b = new r.j(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i10) {
        if (context != null) {
            return Typeface.create(typeface, i10);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, FontsContractCompat.b[] bVarArr, int i10) {
        return f21695a.b(context, cancellationSignal, bVarArr, i10);
    }

    public static Typeface c(Context context, FontResourcesParserCompat.b bVar, Resources resources, int i10, String str, int i11, int i12, a.e eVar, Handler handler, boolean z10) {
        Typeface typefaceA;
        if (bVar instanceof FontResourcesParserCompat.e) {
            FontResourcesParserCompat.e eVar2 = (FontResourcesParserCompat.e) bVar;
            Typeface typefaceG = g(eVar2.c());
            if (typefaceG != null) {
                if (eVar != null) {
                    eVar.d(typefaceG, handler);
                }
                return typefaceG;
            }
            typefaceA = FontsContractCompat.c(context, eVar2.b(), i12, !z10 ? eVar != null : eVar2.a() != 0, z10 ? eVar2.d() : -1, a.e.e(handler), new a(eVar));
        } else {
            typefaceA = f21695a.a(context, (FontResourcesParserCompat.c) bVar, resources, i12);
            if (eVar != null) {
                if (typefaceA != null) {
                    eVar.d(typefaceA, handler);
                } else {
                    eVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f21696b.put(e(resources, i10, str, i11, i12), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface d(Context context, Resources resources, int i10, String str, int i11, int i12) {
        Typeface typefaceD = f21695a.d(context, resources, i10, str, i12);
        if (typefaceD != null) {
            f21696b.put(e(resources, i10, str, i11, i12), typefaceD);
        }
        return typefaceD;
    }

    public static String e(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }

    public static Typeface f(Resources resources, int i10, String str, int i11, int i12) {
        return (Typeface) f21696b.get(e(resources, i10, str, i11, i12));
    }

    public static Typeface g(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }
}
