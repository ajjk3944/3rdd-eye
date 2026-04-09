package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import e5.a;
import ec.o1;
import ec.s0;
import p6.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class AppMeasurementReceiver extends a {

    /* renamed from: c, reason: collision with root package name */
    public i f20281c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f20281c == null) {
            this.f20281c = new i(this);
        }
        i iVar = this.f20281c;
        iVar.getClass();
        s0 s0Var = o1.s(context, null, null).f22954f;
        o1.m(s0Var);
        if (intent == null) {
            s0Var.j.d("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        s0Var.f23060o.e(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                s0Var.j.d("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        s0Var.f23060o.d("Starting wakeful intent.");
        ((AppMeasurementReceiver) iVar.f31385a).getClass();
        SparseArray sparseArray = a.f22427a;
        synchronized (sparseArray) {
            try {
                int i4 = a.f22428b;
                int i10 = i4 + 1;
                a.f22428b = i10;
                if (i10 <= 0) {
                    a.f22428b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i4);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i4, wakeLockNewWakeLock);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
