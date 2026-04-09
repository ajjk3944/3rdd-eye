package v8;

import android.content.Context;
import com.bytedance.sdk.component.vt.ouw.cf;
import com.bytedance.sdk.component.vt.ouw.ouw.ouw;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f35974a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f35975b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f35976c = false;

    /* renamed from: d, reason: collision with root package name */
    public static cf f35977d = null;

    /* renamed from: e, reason: collision with root package name */
    public static int f35978e = 1;

    public static cf a() {
        if (f35977d == null) {
            cf.ouw ouwVar = new cf.ouw((byte) 0);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            f35977d = ouw.ouw(ouwVar.ouw(10000L, timeUnit).vt(10000L, timeUnit).lh(10000L, timeUnit));
        }
        return f35977d;
    }
}
