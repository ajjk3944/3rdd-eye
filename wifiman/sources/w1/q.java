package w1;

import B1.k;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.snmp4j.mp.MPv3;
import v1.e;

/* loaded from: classes.dex */
abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f64360a = new ConcurrentHashMap();

    class a implements b {
        a() {
        }

        @Override // w1.q.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(k.b bVar) {
            return bVar.e();
        }

        @Override // w1.q.b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(k.b bVar) {
            return bVar.f();
        }
    }

    private interface b {
        int a(Object obj);

        boolean b(Object obj);
    }

    q() {
    }

    private static Object e(Object[] objArr, int i10, b bVar) {
        return f(objArr, (i10 & 1) == 0 ? 400 : 700, (i10 & 2) != 0, bVar);
    }

    private static Object f(Object[] objArr, int i10, boolean z10, b bVar) {
        Object obj = null;
        int i11 = MPv3.MAX_MESSAGE_ID;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.a(obj2) - i10) * 2) + (bVar.b(obj2) == z10 ? 0 : 1);
            if (obj == null || i11 > iAbs) {
                obj = obj2;
                i11 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, e.c cVar, Resources resources, int i10);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, k.b[] bVarArr, int i10);

    public Typeface c(Context context, CancellationSignal cancellationSignal, List list, int i10) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File fileD = r.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (r.b(fileD, resources, i10)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    protected k.b g(k.b[] bVarArr, int i10) {
        return (k.b) e(bVarArr, i10, new a());
    }
}
