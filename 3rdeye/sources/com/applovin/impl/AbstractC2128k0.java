package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowManager;
import com.applovin.sdk.AppLovinSdkUtils;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2128k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f19634a = new HashMap(2);

    /* renamed from: com.applovin.impl.k0$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f19635a;

        /* renamed from: b, reason: collision with root package name */
        private int f19636b;

        /* renamed from: c, reason: collision with root package name */
        private int f19637c;

        /* renamed from: d, reason: collision with root package name */
        private int f19638d;

        /* renamed from: com.applovin.impl.k0$a$a, reason: collision with other inner class name */
        public static class C0309a {

            /* renamed from: a, reason: collision with root package name */
            private int f19639a;

            /* renamed from: b, reason: collision with root package name */
            private int f19640b;

            /* renamed from: c, reason: collision with root package name */
            private int f19641c;

            /* renamed from: d, reason: collision with root package name */
            private int f19642d;

            public C0309a a(int i) {
                this.f19641c = i;
                return this;
            }

            public C0309a b(int i) {
                this.f19642d = i;
                return this;
            }

            public C0309a c(int i) {
                this.f19639a = i;
                return this;
            }

            public C0309a d(int i) {
                this.f19640b = i;
                return this;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder("CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=");
                sb.append(this.f19639a);
                sb.append(", topRight=");
                sb.append(this.f19640b);
                sb.append(", bottomLeft=");
                sb.append(this.f19641c);
                sb.append(", bottomRight=");
                return B4.i.j(sb, this.f19642d, ")");
            }

            public a a() {
                return new a(this.f19639a, this.f19640b, this.f19641c, this.f19642d);
            }
        }

        public a(int i, int i10, int i11, int i12) {
            this.f19635a = i;
            this.f19636b = i10;
            this.f19637c = i11;
            this.f19638d = i12;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f19638d;
        }

        public int c() {
            return this.f19635a;
        }

        public int d() {
            return this.f19636b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && c() == aVar.c() && d() == aVar.d() && a() == aVar.a() && b() == aVar.b();
        }

        public int hashCode() {
            return b() + ((a() + ((d() + ((c() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public int a() {
            return this.f19637c;
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.f21161C0;
        boolean z10 = kVar == null || ((Boolean) kVar.a(l4.f19886a6)).booleanValue();
        if (!c(context) || z10) {
            Map map = f19634a;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = 480;
        point.y = Sdk$SDKError.b.WEBVIEW_ERROR_VALUE;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManager.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        StrictMode.setVmPolicy(vmPolicy);
        f19634a.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean d() {
        return true;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean g() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static Point a(Context context) {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        Point point = new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        StrictMode.setVmPolicy(vmPolicy);
        return point;
    }

    public static a a(Context context, com.applovin.impl.sdk.k kVar) {
        a aVarA = null;
        if (((Boolean) kVar.a(l4.f19802O3)).booleanValue() && k()) {
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                try {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    aVarA = new a.C0309a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
                } catch (Throwable unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        }
        return aVarA;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static int a(int i, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}
