package nb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f29901b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f29902c = false;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f29904e = 0;

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f29900a = new AtomicBoolean();

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f29903d = new AtomicBoolean();

    public static boolean a(Context context) {
        try {
            if (!f29902c) {
                try {
                    PackageInfo packageInfoE = ub.b.a(context).e(Build.VERSION.SDK_INT >= 28 ? 134217792 : 64, "com.google.android.gms");
                    j.a(context);
                    if (packageInfoE == null || j.c(packageInfoE, false) || !j.c(packageInfoE, true)) {
                        f29901b = false;
                    } else {
                        f29901b = true;
                    }
                    f29902c = true;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                    f29902c = true;
                }
            }
            return f29901b || !"user".equals(Build.TYPE);
        } catch (Throwable th2) {
            f29902c = true;
            throw th2;
        }
    }
}
