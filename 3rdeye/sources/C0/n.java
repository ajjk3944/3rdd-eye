package C0;

import B0.e;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: TypefaceCompatBaseImpl.java */
/* loaded from: classes.dex */
public class n {

    /* compiled from: TypefaceCompatBaseImpl.java */
    public class a implements b<H0.m> {
        @Override // C0.n.b
        public final int a(H0.m mVar) {
            return mVar.f2008c;
        }

        @Override // C0.n.b
        public final boolean b(H0.m mVar) {
            return mVar.f2009d;
        }
    }

    /* compiled from: TypefaceCompatBaseImpl.java */
    public interface b<T> {
        int a(T t10);

        boolean b(T t10);
    }

    public n() {
        new ConcurrentHashMap();
    }

    public Typeface a(Context context, e.c cVar, Resources resources, int i) {
        throw null;
    }

    public Typeface b(Context context, H0.m[] mVarArr, int i) {
        throw null;
    }

    public Typeface c(Context context, InputStream inputStream) {
        File fileD = o.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (o.c(fileD, inputStream)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i10) {
        File fileD = o.d(context);
        if (fileD == null) {
            return null;
        }
        try {
            if (o.b(fileD, resources, i)) {
                return Typeface.createFromFile(fileD.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileD.delete();
        }
    }

    public H0.m e(int i, H0.m[] mVarArr) {
        a aVar = new a();
        int i10 = (i & 1) == 0 ? 400 : 700;
        boolean z10 = (i & 2) != 0;
        H0.m mVar = null;
        int i11 = Integer.MAX_VALUE;
        for (H0.m mVar2 : mVarArr) {
            int iAbs = (Math.abs(aVar.a(mVar2) - i10) * 2) + (aVar.b(mVar2) == z10 ? 0 : 1);
            if (mVar == null || i11 > iAbs) {
                mVar = mVar2;
                i11 = iAbs;
            }
        }
        return mVar;
    }
}
