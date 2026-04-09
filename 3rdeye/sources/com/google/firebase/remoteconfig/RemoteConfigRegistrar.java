package com.google.firebase.remoteconfig;

import B4.e;
import C4.c;
import D4.a;
import I4.a;
import I4.b;
import I4.i;
import I4.s;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e5.C4317c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import r5.n;
import u5.InterfaceC5635a;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static n lambda$getComponents$0(s sVar, b bVar) {
        c cVar;
        Context context = (Context) bVar.a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) bVar.b(sVar);
        e eVar = (e) bVar.a(e.class);
        h5.c cVar2 = (h5.c) bVar.a(h5.c.class);
        a aVar = (a) bVar.a(a.class);
        synchronized (aVar) {
            try {
                if (!aVar.f1059a.containsKey("frc")) {
                    aVar.f1059a.put("frc", new c(aVar.f1060b));
                }
                cVar = (c) aVar.f1059a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new n(context, scheduledExecutorService, eVar, cVar2, cVar, bVar.c(F4.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<I4.a<?>> getComponents() {
        s sVar = new s(H4.b.class, ScheduledExecutorService.class);
        a.C0043a c0043a = new a.C0043a(n.class, new Class[]{InterfaceC5635a.class});
        c0043a.f2440a = LIBRARY_NAME;
        c0043a.a(i.b(Context.class));
        c0043a.a(new i((s<?>) sVar, 1, 0));
        c0043a.a(i.b(e.class));
        c0043a.a(i.b(h5.c.class));
        c0043a.a(i.b(D4.a.class));
        c0043a.a(new i(0, 1, F4.a.class));
        c0043a.f2445f = new C4317c(sVar, 1);
        c0043a.c(2);
        return Arrays.asList(c0043a.b(), q5.e.a(LIBRARY_NAME, "22.0.0"));
    }
}
