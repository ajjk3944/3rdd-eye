package b4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import androidx.recyclerview.widget.g2;
import com.google.android.gms.internal.measurement.z3;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import x.n0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final g2 f1690a = new g2(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f1691b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1692c;

    /* renamed from: d, reason: collision with root package name */
    public static final n0 f1693d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m(0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1691b = threadPoolExecutor;
        f1692c = new Object();
        f1693d = new n0(0);
    }

    public static String a(int i4, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((f) list.get(i10)).g);
            sb2.append("-");
            sb2.append(i4);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    public static i b(String str, Context context, List list, int i4) {
        int i10;
        Typeface typefaceI;
        g2 g2Var = f1690a;
        Trace.beginSection(z3.w("getFontSync"));
        try {
            Typeface typeface = (Typeface) g2Var.g(str);
            if (typeface != null) {
                return new i(typeface);
            }
            t7.m mVarA = e.a(context, list);
            List list2 = (List) mVarA.f34474c;
            int i11 = mVarA.f34473b;
            if (i11 != 0) {
                i10 = i11 != 1 ? -3 : -2;
            } else {
                k[] kVarArr = (k[]) list2.get(0);
                if (kVarArr == null || kVarArr.length == 0) {
                    i10 = 1;
                } else {
                    int length = kVarArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            i10 = 0;
                            break;
                        }
                        int i13 = kVarArr[i12].f1699f;
                        if (i13 == 0) {
                            i12++;
                        } else if (i13 >= 0) {
                            i10 = i13;
                        }
                    }
                }
            }
            if (i10 != 0) {
                return new i(i10);
            }
            if (list2.size() <= 1 || Build.VERSION.SDK_INT < 29) {
                k[] kVarArr2 = (k[]) list2.get(0);
                wd.b bVar = v3.e.f35800a;
                Trace.beginSection(z3.w("TypefaceCompat.createFromFontInfo"));
                typefaceI = v3.e.f35800a.i(context, kVarArr2, i4);
                Trace.endSection();
            } else {
                wd.b bVar2 = v3.e.f35800a;
                Trace.beginSection(z3.w("TypefaceCompat.createFromFontInfoWithFallback"));
                typefaceI = v3.e.f35800a.j(context, list2, i4);
                Trace.endSection();
            }
            if (typefaceI == null) {
                return new i(-3);
            }
            g2Var.k(str, typefaceI);
            return new i(typefaceI);
        } catch (PackageManager.NameNotFoundException unused) {
            return new i(-1);
        } catch (Throwable th2) {
            throw th2;
        } finally {
            Trace.endSection();
        }
    }
}
