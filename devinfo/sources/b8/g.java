package b8;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import p6.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final int f2080e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2081a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f2082b;

    /* renamed from: c, reason: collision with root package name */
    public final i f2083c;

    /* renamed from: d, reason: collision with root package name */
    public final float f2084d;

    static {
        f2080e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public g(Context context) {
        this.f2084d = f2080e;
        this.f2081a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f2082b = activityManager;
        this.f2083c = new i(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f2084d = 0.0f;
    }
}
