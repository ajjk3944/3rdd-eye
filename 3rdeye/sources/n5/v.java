package n5;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;

/* compiled from: ServiceStarter.java */
@KeepForSdk
/* loaded from: classes2.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static v f44375e;

    /* renamed from: a, reason: collision with root package name */
    public String f44376a = null;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f44377b = null;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f44378c = null;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f44379d = new ArrayDeque();

    public static synchronized v a() {
        try {
            if (f44375e == null) {
                f44375e = new v();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f44375e;
    }

    public final boolean b(Context context) {
        if (this.f44378c == null) {
            this.f44378c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f44377b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f44378c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f44377b == null) {
            this.f44377b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f44377b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f44377b.booleanValue();
    }
}
