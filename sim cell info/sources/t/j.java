package t;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import s.c;
import x.b;

/* loaded from: classes.dex */
class j {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<Long, c.b> f3335a = new ConcurrentHashMap<>();

    class a implements c<b.f> {
        a() {
        }

        @Override // t.j.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(b.f fVar) {
            return fVar.d();
        }

        @Override // t.j.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(b.f fVar) {
            return fVar.e();
        }
    }

    class b implements c<c.C0036c> {
        b() {
        }

        @Override // t.j.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(c.C0036c c0036c) {
            return c0036c.e();
        }

        @Override // t.j.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(c.C0036c c0036c) {
            return c0036c.f();
        }
    }

    private interface c<T> {
        int a(T t2);

        boolean b(T t2);
    }

    j() {
    }

    private void a(Typeface typeface, c.b bVar) throws NoSuchFieldException {
        long j2 = j(typeface);
        if (j2 != 0) {
            this.f3335a.put(Long.valueOf(j2), bVar);
        }
    }

    private c.C0036c f(c.b bVar, int i2) {
        return (c.C0036c) g(bVar.a(), i2, new b());
    }

    private static <T> T g(T[] tArr, int i2, c<T> cVar) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z2 = (i2 & 2) != 0;
        T t2 = null;
        int i4 = Integer.MAX_VALUE;
        for (T t3 : tArr) {
            int iAbs = (Math.abs(cVar.a(t3) - i3) * 2) + (cVar.b(t3) == z2 ? 0 : 1);
            if (t2 == null || i4 > iAbs) {
                t2 = t3;
                i4 = iAbs;
            }
        }
        return t2;
    }

    private static long j(Typeface typeface) throws NoSuchFieldException {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        } catch (NoSuchFieldException e3) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e3);
            return 0L;
        }
    }

    public Typeface b(Context context, c.b bVar, Resources resources, int i2) throws NoSuchFieldException {
        c.C0036c c0036cF = f(bVar, i2);
        if (c0036cF == null) {
            return null;
        }
        Typeface typefaceD = d.d(context, resources, c0036cF.b(), c0036cF.a(), i2);
        a(typefaceD, bVar);
        return typefaceD;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        InputStream inputStream = null;
        if (fVarArr.length < 1) {
            return null;
        }
        try {
            inputStreamOpenInputStream = context.getContentResolver().openInputStream(h(fVarArr, i2).c());
            try {
                Typeface typefaceD = d(context, inputStreamOpenInputStream);
                k.a(inputStreamOpenInputStream);
                return typefaceD;
            } catch (IOException unused) {
                k.a(inputStreamOpenInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpenInputStream;
                k.a(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    protected Typeface d(Context context, InputStream inputStream) {
        File fileE = k.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (k.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i2, String str, int i3) {
        File fileE = k.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (k.c(fileE, resources, i2)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected b.f h(b.f[] fVarArr, int i2) {
        return (b.f) g(fVarArr, i2, new a());
    }

    c.b i(Typeface typeface) throws NoSuchFieldException {
        long j2 = j(typeface);
        if (j2 == 0) {
            return null;
        }
        return this.f3335a.get(Long.valueOf(j2));
    }
}
