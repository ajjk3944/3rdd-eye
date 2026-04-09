package p1;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final int f22738e;

    /* renamed from: a, reason: collision with root package name */
    public final Context f22739a;

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f22740b;

    /* renamed from: c, reason: collision with root package name */
    public final h2.d f22741c;

    /* renamed from: d, reason: collision with root package name */
    public final float f22742d;

    static {
        f22738e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public d(Context context) {
        this.f22742d = f22738e;
        this.f22739a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f22740b = activityManager;
        this.f22741c = new h2.d(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f22742d = 0.0f;
    }
}
