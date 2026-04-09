package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import s3.AbstractC7901p;

/* renamed from: com.google.android.gms.measurement.internal.g3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4856g3 {

    /* renamed from: a, reason: collision with root package name */
    private final a f36461a;

    /* renamed from: com.google.android.gms.measurement.internal.g3$a */
    public interface a {
        void a(Context context, Intent intent);
    }

    public C4856g3(a aVar) {
        AbstractC7901p.l(aVar);
        this.f36461a = aVar;
    }

    public final void a(Context context, Intent intent) {
        L2 l2Zzj = C4976v3.a(context, null, null).zzj();
        if (intent == null) {
            l2Zzj.H().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        l2Zzj.G().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                l2Zzj.H().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            l2Zzj.G().a("Starting wakeful intent.");
            this.f36461a.a(context, className);
        }
    }
}
