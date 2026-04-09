package com.google.android.gms.internal.ads;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nf {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f14281e = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public long f14282a;

    /* renamed from: b, reason: collision with root package name */
    public long f14283b;

    /* renamed from: c, reason: collision with root package name */
    public long f14284c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f14285d;

    public static nf a(Context context, Executor executor) {
        String[] strArr = f14281e;
        nf nfVar = new nf();
        nfVar.f14282a = 0L;
        nfVar.f14283b = 0L;
        nfVar.f14284c = -1L;
        nfVar.f14285d = false;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new mf(0, nfVar));
            } catch (IllegalArgumentException | NoSuchMethodError unused) {
            }
        }
        return nfVar;
    }
}
