package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.oA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1625oA implements InterfaceC1409kA {

    /* renamed from: a, reason: collision with root package name */
    public long f15905a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f15906b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f15907c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f15908d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f15909e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f15910f = -1;

    /* renamed from: g, reason: collision with root package name */
    public long f15911g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f15912h = -1;
    public final long i = SystemClock.uptimeMillis();

    public static boolean a(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object objInvoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) objInvoke.getClass().getField("adType").get(objInvoke);
            num.intValue();
            String str = (String) objInvoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (!str.contains("INTERSTITIAL") && !str.contains("APP_OPEN")) {
                if (!str.contains("REWARDED")) {
                    return false;
                }
            }
            return true;
        } catch (NullPointerException | ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final synchronized void b(HashMap map) {
        this.f15912h = this.f15911g;
        this.f15911g = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final synchronized void c(HashMap map) {
        this.f15906b = this.f15905a;
        this.f15905a = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final synchronized void d(HashMap map, Context context, View view) {
        WindowManager windowManager;
        try {
            this.f15908d = this.f15907c;
            this.f15907c = SystemClock.uptimeMillis();
            long j6 = this.f15909e;
            if (j6 != -1) {
                this.f15910f = j6;
            }
            DisplayMetrics displayMetrics = null;
            if ((Build.VERSION.SDK_INT < 33 || context.isUiContext()) && (windowManager = (WindowManager) context.getSystemService("window")) != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                displayMetrics = new DisplayMetrics();
                try {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } catch (NoSuchMethodError unused) {
                    defaultDisplay.getMetrics(displayMetrics);
                }
            }
            if (displayMetrics != null) {
                int i = displayMetrics.widthPixels * displayMetrics.heightPixels;
                if (view != null) {
                    int iMin = Math.min(view.getWidth(), displayMetrics.widthPixels) * Math.min(view.getHeight(), displayMetrics.heightPixels);
                    if (iMin + iMin >= i || (iMin == 0 && a(view))) {
                        this.f15909e = this.f15907c;
                    }
                }
                e(map);
            }
            this.f15909e = -1L;
            e(map);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e(HashMap map) {
        map.put("tcq", Long.valueOf(this.f15905a));
        map.put("tpq", Long.valueOf(this.f15906b));
        map.put("tcc", Long.valueOf(this.f15911g));
        map.put("tpc", Long.valueOf(this.f15912h));
        map.put("tpv", Long.valueOf(this.f15908d));
        map.put("tcv", Long.valueOf(this.f15907c));
        map.put("tchv", Long.valueOf(this.f15909e));
        map.put("tphv", Long.valueOf(this.f15910f));
        map.put("tst", Long.valueOf(this.i));
    }
}
