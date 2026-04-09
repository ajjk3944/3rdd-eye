package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class qv {
    public static final t90 a = new t90(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final bw0 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new rp0(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new bw0(0);
    }

    public static pv a(String str, Context context, g4 g4Var, int i) {
        t90 t90Var = a;
        Typeface typeface = (Typeface) t90Var.h(str);
        if (typeface != null) {
            return new pv(typeface);
        }
        try {
            t3 t3VarM = gi2.m(context, g4Var);
            wv[] wvVarArr = (wv[]) t3VarM.h;
            int i2 = t3VarM.g;
            int i3 = 1;
            if (i2 != 0) {
                i3 = i2 != 1 ? -3 : -2;
            } else if (wvVarArr != null && wvVarArr.length != 0) {
                int length = wvVarArr.length;
                i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i4 >= length) {
                        break;
                    }
                    int i5 = wvVarArr[i4].e;
                    if (i5 == 0) {
                        i4++;
                    } else if (i5 >= 0) {
                        i3 = i5;
                    }
                }
            }
            if (i3 != 0) {
                return new pv(i3);
            }
            Typeface typefaceL = m31.a.l(context, wvVarArr, i);
            if (typefaceL == null) {
                return new pv(-3);
            }
            t90Var.m(str, typefaceL);
            return new pv(typefaceL);
        } catch (PackageManager.NameNotFoundException unused) {
            return new pv(-1);
        }
    }
}
