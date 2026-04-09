package com.applovin.sdk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.TypedValue;
import android.widget.ImageView;
import com.applovin.impl.n7;
import com.applovin.impl.o0;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public class AppLovinSdkUtils {

    /* renamed from: a, reason: collision with root package name */
    private static final Handler f6453a = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class Size {
        public static final Size ZERO = new Size(0, 0);

        /* renamed from: a, reason: collision with root package name */
        private int f6454a;

        /* renamed from: b, reason: collision with root package name */
        private int f6455b;

        public Size(int i4, int i10) {
            this.f6454a = i4;
            this.f6455b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Size)) {
                return false;
            }
            Size size = (Size) obj;
            return this.f6454a == size.getWidth() && this.f6455b == size.getHeight();
        }

        public int getHeight() {
            return this.f6455b;
        }

        public int getWidth() {
            return this.f6454a;
        }

        public int hashCode() {
            int i4 = this.f6455b;
            int i10 = this.f6454a;
            return i4 ^ ((i10 >>> 16) | (i10 << 16));
        }

        public String toString() {
            return this.f6454a + "x" + this.f6455b;
        }
    }

    private static boolean a(String str, String str2) {
        return StringUtils.startsWithAtLeastOnePrefix(str, CollectionUtils.explode(str2));
    }

    public static int dpToPx(Context context, int i4) {
        return (int) TypedValue.applyDimension(1, i4, context.getResources().getDisplayMetrics());
    }

    public static int getOrientation(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    public static boolean isEmulator() {
        return a(Build.DEVICE, "goldfish,vbox") || a(Build.HARDWARE, "ranchu,generic,vbox") || a(Build.MANUFACTURER, "Genymotion") || a(Build.MODEL, "Android SDK built for x86");
    }

    public static boolean isFireOS(Context context) {
        return "amazon".equalsIgnoreCase(Build.MANUFACTURER) || isFireTv(context);
    }

    public static boolean isFireTv(Context context) {
        return context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
    }

    public static boolean isInclusiveVersion(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int iG = n7.g(str);
        if (str2 == null || iG >= n7.g(str2)) {
            return str3 == null || iG <= n7.g(str3);
        }
        return false;
    }

    public static boolean isSdkVersionGreaterThanOrEqualTo(String str) {
        return AppLovinSdk.VERSION_CODE >= n7.g(str);
    }

    public static boolean isTablet(Context context) {
        Point pointB = o0.b(context);
        return Math.min(pointB.x, pointB.y) >= dpToPx(context, 600);
    }

    public static boolean isTv(Context context) {
        if (isFireTv(context)) {
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        return o0.d() ? packageManager.hasSystemFeature("android.software.leanback") : packageManager.hasSystemFeature("android.hardware.type.television");
    }

    public static boolean isValidString(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static int pxToDp(Context context, int i4) {
        return (int) Math.ceil(i4 / context.getResources().getDisplayMetrics().density);
    }

    public static void runOnUiThread(Runnable runnable) {
        runOnUiThread(false, runnable);
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j) {
        runOnUiThreadDelayed(runnable, j, f6453a);
    }

    public static void setImageUrl(String str, ImageView imageView, AppLovinSdk appLovinSdk) {
        ImageViewUtils.setImageUri(imageView, Uri.parse(str), appLovinSdk.a());
    }

    public static Map<String, String> toMap(JSONObject jSONObject) throws JSONException {
        return JsonUtils.toStringMap(jSONObject);
    }

    public static void runOnUiThread(boolean z3, Runnable runnable) {
        if (z3 || !n7.i()) {
            f6453a.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static void runOnUiThreadDelayed(Runnable runnable, long j, Handler handler) {
        if (j > 0) {
            handler.postDelayed(runnable, j);
        } else if (n7.i()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
