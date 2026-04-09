package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.d7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1028d7 {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f13727e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public long f13728a;

    /* renamed from: b, reason: collision with root package name */
    public long f13729b;

    /* renamed from: c, reason: collision with root package name */
    public long f13730c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13731d;

    public static C1028d7 a(Context context, Executor executor) {
        String[] strArr = f13727e;
        C1028d7 c1028d7 = new C1028d7();
        c1028d7.f13728a = 0L;
        c1028d7.f13729b = 0L;
        c1028d7.f13730c = -1L;
        c1028d7.f13731d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new C0973c7(0, c1028d7));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return c1028d7;
    }
}
