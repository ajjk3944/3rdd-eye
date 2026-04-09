package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import bf.d;
import bf.l;
import bf.u;
import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.components.ComponentRegistrar;
import fg.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import og.j;
import se.f;
import te.c;
import ue.a;
import we.b;

@Keep
/* loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static j lambda$getComponents$0(u uVar, d dVar) {
        c cVar;
        Context context = (Context) dVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) dVar.i(uVar);
        f fVar = (f) dVar.a(f.class);
        e eVar = (e) dVar.a(e.class);
        a aVar = (a) dVar.a(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f23545a.containsKey("frc")) {
                    aVar.f23545a.put("frc", new c(aVar.f23546b));
                }
                cVar = (c) aVar.f23545a.get("frc");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return new j(context, scheduledExecutorService, fVar, eVar, cVar, dVar.g(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<bf.c> getComponents() {
        u uVar = new u(ye.b.class, ScheduledExecutorService.class);
        bf.b bVar = new bf.b(j.class, new Class[]{rg.a.class});
        bVar.f2696a = LIBRARY_NAME;
        bVar.a(l.b(Context.class));
        bVar.a(new l(uVar, 1, 0));
        bVar.a(l.b(f.class));
        bVar.a(l.b(e.class));
        bVar.a(l.b(a.class));
        bVar.a(new l(0, 1, b.class));
        bVar.f2701f = new cg.b(uVar, 2);
        bVar.c(2);
        return Arrays.asList(bVar.b(), b4.q(LIBRARY_NAME, "23.0.1"));
    }
}
