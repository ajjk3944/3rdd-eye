package com.google.firebase.analytics.connector.internal;

import B4.e;
import F4.a;
import F4.c;
import I4.a;
import I4.b;
import I4.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzee;
import com.google.firebase.components.ComponentRegistrar;
import d5.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.1.1 */
@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static a lambda$getComponents$0(b bVar) {
        e eVar = (e) bVar.a(e.class);
        Context context = (Context) bVar.a(Context.class);
        d dVar = (d) bVar.a(d.class);
        Preconditions.checkNotNull(eVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (F4.b.f1649c == null) {
            synchronized (F4.b.class) {
                try {
                    if (F4.b.f1649c == null) {
                        Bundle bundle = new Bundle(1);
                        eVar.a();
                        if ("[DEFAULT]".equals(eVar.f488b)) {
                            dVar.a(c.f1652b, F4.d.f1653a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", eVar.h());
                        }
                        F4.b.f1649c = new F4.b(zzee.zzg(context, null, null, null, bundle).zzd());
                    }
                } finally {
                }
            }
        }
        return F4.b.f1649c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @KeepForSdk
    @SuppressLint({"MissingPermission"})
    public List<I4.a<?>> getComponents() {
        a.C0043a c0043aB = I4.a.b(F4.a.class);
        c0043aB.a(i.b(e.class));
        c0043aB.a(i.b(Context.class));
        c0043aB.a(i.b(d.class));
        c0043aB.f2445f = G4.a.f1897b;
        c0043aB.c(2);
        return Arrays.asList(c0043aB.b(), q5.e.a("fire-analytics", "21.1.1"));
    }
}
