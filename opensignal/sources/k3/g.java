package k3;

import android.content.res.Resources;
import android.os.Build;
import android.os.Trace;
import com.google.android.gms.internal.measurement.y3;
import h7.w1;
import io.sentry.android.core.e0;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final y3 f14021a;

    /* renamed from: b, reason: collision with root package name */
    public static final w1 f14022b;

    static {
        xu.d.e("TypefaceCompat static init");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f14021a = new l();
        } else if (i10 >= 28) {
            f14021a = new k();
        } else if (i10 >= 26) {
            f14021a = new j();
        } else {
            Method method = i.f14030d;
            if (method == null) {
                e0.p("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                f14021a = new i();
            } else {
                f14021a = new h();
            }
        }
        f14022b = new w1(16);
        Trace.endSection();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface a(android.content.Context r16, j3.d r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, j3.b r23, boolean r24) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.g.a(android.content.Context, j3.d, android.content.res.Resources, int, java.lang.String, int, int, j3.b, boolean):android.graphics.Typeface");
    }

    public static String b(Resources resources, int i10, String str, int i11, int i12) {
        return resources.getResourcePackageName(i10) + '-' + str + '-' + i11 + '-' + i10 + '-' + i12;
    }
}
