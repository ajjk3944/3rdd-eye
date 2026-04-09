package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class e21 implements w11, my0 {
    public static final String[] g = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f10679a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f10680b;

    /* renamed from: c, reason: collision with root package name */
    public long f10681c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f10682d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f10683e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10684f = false;

    public e21(Context context, ExecutorService executorService, String[] strArr) {
        this.f10679a = context;
        this.f10680b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final void a(HashMap map) {
        e();
    }

    @Override // com.google.android.gms.internal.ads.my0
    public final vd.b b() {
        if (Build.VERSION.SDK_INT < 30) {
            return s81.f15906b;
        }
        h91 h91Var = new h91(Executors.callable(new du0(9, this), null));
        this.f10680b.execute(h91Var);
        return h91Var;
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final void c(HashMap map) {
        long j;
        long j8;
        e();
        synchronized (this) {
            try {
                j = this.f10684f ? this.f10682d - this.f10681c : -1L;
            } finally {
            }
        }
        map.put("vs", Long.valueOf(j));
        synchronized (this) {
            j8 = this.f10683e;
            this.f10683e = -1L;
        }
        map.put("vf", Long.valueOf(j8));
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final void d(HashMap map, Context context, View view) {
        e();
    }

    public final void e() {
        synchronized (this) {
            try {
                if (this.f10684f) {
                    this.f10682d = System.currentTimeMillis();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final /* synthetic */ void f() {
        mf mfVar = new mf(1, this);
        try {
            Object systemService = this.f10679a.getSystemService("appops");
            if (systemService == null) {
                throw null;
            }
            ((AppOpsManager) systemService).startWatchingActive(g, this.f10680b, mfVar);
        } catch (Throwable unused) {
        }
    }
}
