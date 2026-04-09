package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import f4.InterfaceFutureC2326a;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.ads.pA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1679pA extends BroadcastReceiver implements InterfaceC1409kA, InterfaceC2151xy {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16143a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f16144b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16145c = true;

    public C1679pA(Context context, ExecutorService executorService) {
        this.f16143a = context;
        this.f16144b = executorService;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2151xy
    public final InterfaceFutureC2326a a() {
        return AbstractC1984ut.z(new Zs(10, this), this.f16144b);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final void b(HashMap map) {
        boolean z6;
        synchronized (this) {
            z6 = this.f16145c;
        }
        map.put("up", Boolean.valueOf(z6));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final void c(HashMap map) {
        boolean z6;
        synchronized (this) {
            z6 = this.f16145c;
        }
        map.put("up", Boolean.valueOf(z6));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1409kA
    public final void d(HashMap map, Context context, View view) {
        boolean z6;
        synchronized (this) {
            z6 = this.f16145c;
        }
        map.put("up", Boolean.valueOf(z6));
    }

    public final synchronized void e(boolean z6) {
        this.f16145c = z6;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.f16145c = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            e(false);
        }
    }
}
