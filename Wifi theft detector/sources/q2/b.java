package q2;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.ypw.emc.gbl;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static Context f24009a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f24010b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f24011c = false;

    /* renamed from: d, reason: collision with root package name */
    public static gbl f24012d = null;

    /* renamed from: e, reason: collision with root package name */
    public static int f24013e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f24014f = false;

    public static boolean a() {
        return f24014f;
    }

    public static gbl b() {
        if (f24012d == null) {
            gbl.emc emcVar = new gbl.emc("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            f24012d = emcVar.emc(10000L, timeUnit).ypw(10000L, timeUnit).xq(10000L, timeUnit).emc();
        }
        return f24012d;
    }

    public static Context c() {
        return f24009a;
    }

    public static void d(int i10) {
        f24013e = i10;
    }

    public static void e(Context context, String str) {
        f24009a = context;
        f24010b = str;
    }

    public static void f(gbl gblVar) {
        f24012d = gblVar;
    }

    public static void g(boolean z10) {
        f24011c = z10;
    }

    public static boolean h() {
        return f24011c;
    }

    public static int i() {
        return f24013e;
    }

    public static String j() {
        if (TextUtils.isEmpty(f24010b)) {
            try {
                File file = new File(c().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f24010b = file.getAbsolutePath();
            } catch (Throwable unused) {
            }
        }
        return f24010b;
    }
}
