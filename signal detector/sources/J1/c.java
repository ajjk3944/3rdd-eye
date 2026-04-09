package J1;

import android.content.Context;
import com.bytedance.sdk.component.ypw.emc.gbl;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static Context f2036a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f2037b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f2038c = false;

    /* renamed from: d, reason: collision with root package name */
    public static gbl f2039d = null;

    /* renamed from: e, reason: collision with root package name */
    public static int f2040e = 1;

    public static gbl a() {
        if (f2039d == null) {
            gbl.emc emcVar = new gbl.emc("v_config");
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            f2039d = emcVar.emc(10000L, timeUnit).ypw(10000L, timeUnit).xq(10000L, timeUnit).emc();
        }
        return f2039d;
    }
}
