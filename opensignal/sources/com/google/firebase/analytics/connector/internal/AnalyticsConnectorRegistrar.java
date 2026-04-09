package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import bf.d;
import bf.l;
import bf.o;
import bg.c;
import cc.s;
import cg.e;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i1;
import com.google.firebase.components.ComponentRegistrar;
import io.sentry.hints.i;
import java.util.Arrays;
import java.util.List;
import se.f;
import we.b;

@Keep
/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static b lambda$getComponents$0(d dVar) {
        f fVar = (f) dVar.a(f.class);
        Context context = (Context) dVar.a(Context.class);
        c cVar = (c) dVar.a(c.class);
        s.h(fVar);
        s.h(context);
        s.h(cVar);
        s.h(context.getApplicationContext());
        if (we.c.f24484c == null) {
            synchronized (we.c.class) {
                try {
                    if (we.c.f24484c == null) {
                        Bundle bundle = new Bundle(1);
                        fVar.a();
                        if ("[DEFAULT]".equals(fVar.f22008b)) {
                            ((o) cVar).a(dd.o.f7313g, i.f12317g);
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.h());
                        }
                        we.c.f24484c = new we.c(i1.e(context, bundle).f5068b);
                    }
                } finally {
                }
            }
        }
        return we.c.f24484c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    @SuppressLint({"MissingPermission"})
    public List<bf.c> getComponents() {
        bf.b bVarB = bf.c.b(b.class);
        bVarB.a(l.b(f.class));
        bVarB.a(l.b(Context.class));
        bVarB.a(l.b(c.class));
        bVarB.f2701f = e.f3752a;
        bVarB.c(2);
        return Arrays.asList(bVarB.b(), b4.q("fire-analytics", "23.0.0"));
    }
}
