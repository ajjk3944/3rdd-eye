package com.google.firebase.analytics.connector.internal;

import ae.b;
import ae.c;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.sh0;
import com.google.android.gms.internal.measurement.k1;
import com.google.firebase.components.ComponentRegistrar;
import de.a;
import de.i;
import de.k;
import java.util.Arrays;
import java.util.List;
import pb.y;
import wd.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static b lambda$getComponents$0(de.b bVar) {
        f fVar = (f) bVar.a(f.class);
        Context context = (Context) bVar.a(Context.class);
        af.b bVar2 = (af.b) bVar.a(af.b.class);
        y.h(fVar);
        y.h(context);
        y.h(bVar2);
        y.h(context.getApplicationContext());
        if (c.f353c == null) {
            synchronized (c.class) {
                try {
                    if (c.f353c == null) {
                        Bundle bundle = new Bundle(1);
                        fVar.a();
                        if ("[DEFAULT]".equals(fVar.f36615b)) {
                            ((k) bVar2).a();
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.g());
                        }
                        c.f353c = new c(k1.e(context, bundle).f19795b);
                    }
                } finally {
                }
            }
        }
        return c.f353c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<a> getComponents() {
        sh0 sh0VarB = a.b(b.class);
        sh0VarB.a(i.b(f.class));
        sh0VarB.a(i.b(Context.class));
        sh0VarB.a(i.b(af.b.class));
        sh0VarB.f16017f = bf.f.f2162b;
        sh0VarB.d();
        return Arrays.asList(sh0VarB.c(), a.a.f("fire-analytics", "23.0.0"));
    }
}
