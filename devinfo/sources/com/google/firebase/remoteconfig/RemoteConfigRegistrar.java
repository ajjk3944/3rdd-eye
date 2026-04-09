package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.sh0;
import com.google.firebase.components.ComponentRegistrar;
import de.b;
import de.q;
import df.d;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kf.i;
import wd.f;
import xd.c;
import yd.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static i lambda$getComponents$0(q qVar, b bVar) {
        c cVar;
        Context context = (Context) bVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) bVar.l(qVar);
        f fVar = (f) bVar.a(f.class);
        d dVar = (d) bVar.a(d.class);
        a aVar = (a) bVar.a(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f37568a.containsKey("frc")) {
                    aVar.f37568a.put("frc", new c(aVar.f37570c));
                }
                cVar = (c) aVar.f37568a.get("frc");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new i(context, scheduledExecutorService, fVar, dVar, cVar, bVar.j(ae.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<de.a> getComponents() {
        q qVar = new q(ce.b.class, ScheduledExecutorService.class);
        sh0 sh0Var = new sh0(i.class, new Class[]{nf.a.class});
        sh0Var.f16012a = LIBRARY_NAME;
        sh0Var.a(de.i.b(Context.class));
        sh0Var.a(new de.i(qVar, 1, 0));
        sh0Var.a(de.i.b(f.class));
        sh0Var.a(de.i.b(d.class));
        sh0Var.a(de.i.b(a.class));
        sh0Var.a(new de.i(0, 1, ae.b.class));
        sh0Var.f16017f = new bf.b(qVar, 1);
        sh0Var.d();
        return Arrays.asList(sh0Var.c(), a.a.f(LIBRARY_NAME, "23.0.1"));
    }
}
