package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import r4.a;
import z7.j;
import zc.c1;
import zc.j0;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends a {

    /* renamed from: c, reason: collision with root package name */
    public j f5390c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f5390c == null) {
            this.f5390c = new j(2, this);
        }
        j jVar = this.f5390c;
        jVar.getClass();
        j0 j0Var = c1.m(context, null, null).f26889y;
        c1.g(j0Var);
        if (intent == null) {
            j0Var.F.b("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        j0Var.K.c(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                j0Var.F.b("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        j0Var.K.b("Starting wakeful intent.");
        ((AppMeasurementReceiver) jVar.f26706d).getClass();
        SparseArray sparseArray = a.f21225a;
        synchronized (sparseArray) {
            try {
                int i10 = a.f21226b;
                int i11 = i10 + 1;
                a.f21226b = i11;
                if (i11 <= 0) {
                    a.f21226b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i10);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i10, wakeLockNewWakeLock);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
