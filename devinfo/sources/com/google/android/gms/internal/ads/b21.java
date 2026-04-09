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

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b21 implements w11 {

    /* renamed from: a, reason: collision with root package name */
    public long f9553a = -1;

    /* renamed from: b, reason: collision with root package name */
    public long f9554b = -1;

    /* renamed from: c, reason: collision with root package name */
    public long f9555c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f9556d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f9557e = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f9558f = -1;
    public long g = -1;

    /* renamed from: h, reason: collision with root package name */
    public long f9559h = -1;

    /* renamed from: i, reason: collision with root package name */
    public final long f9560i = SystemClock.uptimeMillis();

    public static boolean b(View view) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
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

    @Override // com.google.android.gms.internal.ads.w11
    public final synchronized void a(HashMap map) {
        this.f9559h = this.g;
        this.g = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final synchronized void c(HashMap map) {
        this.f9554b = this.f9553a;
        this.f9553a = SystemClock.uptimeMillis();
        e(map);
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final synchronized void d(HashMap map, Context context, View view) {
        WindowManager windowManager;
        try {
            this.f9556d = this.f9555c;
            this.f9555c = SystemClock.uptimeMillis();
            long j = this.f9557e;
            if (j != -1) {
                this.f9558f = j;
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
                int i4 = displayMetrics.widthPixels * displayMetrics.heightPixels;
                if (view != null) {
                    int iMin = Math.min(view.getWidth(), displayMetrics.widthPixels) * Math.min(view.getHeight(), displayMetrics.heightPixels);
                    if (iMin + iMin >= i4 || (iMin == 0 && b(view))) {
                        this.f9557e = this.f9555c;
                    }
                }
                e(map);
            }
            this.f9557e = -1L;
            e(map);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void e(HashMap map) {
        map.put("tcq", Long.valueOf(this.f9553a));
        map.put("tpq", Long.valueOf(this.f9554b));
        map.put("tcc", Long.valueOf(this.g));
        map.put("tpc", Long.valueOf(this.f9559h));
        map.put("tpv", Long.valueOf(this.f9556d));
        map.put("tcv", Long.valueOf(this.f9555c));
        map.put("tchv", Long.valueOf(this.f9557e));
        map.put("tphv", Long.valueOf(this.f9558f));
        map.put("tst", Long.valueOf(this.f9560i));
    }
}
