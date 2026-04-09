package j0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap f21714a = new ConcurrentHashMap();

    public class a implements b {
        public a() {
        }

        @Override // j0.k.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(FontsContractCompat.b bVar) {
            return bVar.e();
        }

        @Override // j0.k.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(FontsContractCompat.b bVar) {
            return bVar.f();
        }
    }

    public interface b {
        boolean a(Object obj);

        int b(Object obj);
    }

    public static Object e(Object[] objArr, int i10, b bVar) {
        return f(objArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    public static Object f(Object[] objArr, int i10, boolean z10, b bVar) {
        Object obj = null;
        int i11 = Integer.MAX_VALUE;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.b(obj2) - i10) * 2) + (bVar.a(obj2) == z10 ? 0 : 1);
            if (obj == null || i11 > iAbs) {
                obj = obj2;
                i11 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, FontResourcesParserCompat.c cVar, Resources resources, int i10);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, FontsContractCompat.b[] bVarArr, int i10);

    public Typeface c(Context context, InputStream inputStream) {
        File fileE = l.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (l.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = l.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (l.c(fileE, resources, i10)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public FontsContractCompat.b g(FontsContractCompat.b[] bVarArr, int i10) {
        return (FontsContractCompat.b) e(bVarArr, i10, new a());
    }
}
