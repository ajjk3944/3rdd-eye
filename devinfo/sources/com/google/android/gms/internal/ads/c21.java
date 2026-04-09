package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c21 extends BroadcastReceiver implements w11, my0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9939a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f9940b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9941c = true;

    public c21(Context context, ExecutorService executorService) {
        this.f9939a = context;
        this.f9940b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final void a(HashMap map) {
        boolean z3;
        synchronized (this) {
            z3 = this.f9941c;
        }
        map.put("up", Boolean.valueOf(z3));
    }

    @Override // com.google.android.gms.internal.ads.my0
    public final vd.b b() {
        return yo0.z(this.f9940b, new go0(10, this));
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final void c(HashMap map) {
        boolean z3;
        synchronized (this) {
            z3 = this.f9941c;
        }
        map.put("up", Boolean.valueOf(z3));
    }

    @Override // com.google.android.gms.internal.ads.w11
    public final void d(HashMap map, Context context, View view) {
        boolean z3;
        synchronized (this) {
            z3 = this.f9941c;
        }
        map.put("up", Boolean.valueOf(z3));
    }

    public final synchronized void e(boolean z3) {
        this.f9941c = z3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.f9941c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            e(false);
        }
    }
}
