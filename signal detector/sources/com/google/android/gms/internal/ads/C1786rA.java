package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.view.View;
import f4.InterfaceFutureC2326a;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.ads.rA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1786rA implements InterfaceC1409kA, InterfaceC2151xy {

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f16472g = {"android:establish_vpn_service", "android:establish_vpn_manager"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f16473a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f16474b;

    /* renamed from: c, reason: collision with root package name */
    public long f16475c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f16476d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f16477e = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16478f = false;

    public C1786rA(Context context, ExecutorService executorService, String[] strArr) {
        this.f16473a = context;
        this.f16474b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2151xy
    public final InterfaceFutureC2326a a() {
        if (Build.VERSION.SDK_INT < 30) {
            return ED.f7928b;
        }
        TD td = new TD(Executors.callable(new Fu(10, this), null));
        this.f16474b.execute(td);
        return td;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final void b(HashMap map) {
        e();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final void c(HashMap map) {
        long j6;
        long j7;
        e();
        synchronized (this) {
            try {
                j6 = this.f16478f ? this.f16476d - this.f16475c : -1L;
            } finally {
            }
        }
        map.put("vs", Long.valueOf(j6));
        synchronized (this) {
            j7 = this.f16477e;
            this.f16477e = -1L;
        }
        map.put("vf", Long.valueOf(j7));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final void d(HashMap map, Context context, View view) {
        e();
    }

    public final void e() {
        synchronized (this) {
            try {
                if (this.f16478f) {
                    this.f16476d = System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
