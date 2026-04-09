package H0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import m0.C5315h;
import m0.C5316i;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final C5315h<String, Typeface> f1998a = new C5315h<>(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f1999b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f2000c;

    /* renamed from: d, reason: collision with root package name */
    public static final C5316i<String, ArrayList<K0.b<a>>> f2001d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new n());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1999b = threadPoolExecutor;
        f2000c = new Object();
        f2001d = new C5316i<>();
    }

    public static a a(String str, Context context, f fVar, int i) throws Resources.NotFoundException {
        C5315h<String, Typeface> c5315h = f1998a;
        Typeface typeface = c5315h.get(str);
        if (typeface != null) {
            return new a(typeface);
        }
        try {
            l lVarA = e.a(context, fVar);
            int i10 = 1;
            m[] mVarArr = lVarA.f2005b;
            int i11 = lVarA.f2004a;
            if (i11 != 0) {
                i10 = i11 != 1 ? -3 : -2;
            } else if (mVarArr != null && mVarArr.length != 0) {
                int length = mVarArr.length;
                i10 = 0;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        break;
                    }
                    int i13 = mVarArr[i12].f2010e;
                    if (i13 == 0) {
                        i12++;
                    } else if (i13 >= 0) {
                        i10 = i13;
                    }
                }
            }
            if (i10 != 0) {
                return new a(i10);
            }
            Typeface typefaceB = C0.h.f808a.b(context, mVarArr, i);
            if (typefaceB == null) {
                return new a(-3);
            }
            c5315h.put(str, typefaceB);
            return new a(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new a(-1);
        }
    }

    /* compiled from: FontRequestWorker.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f2002a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2003b;

        public a(int i) {
            this.f2002a = null;
            this.f2003b = i;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f2002a = typeface;
            this.f2003b = 0;
        }
    }
}
