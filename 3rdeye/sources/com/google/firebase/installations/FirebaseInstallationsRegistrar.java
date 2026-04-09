package com.google.firebase.installations;

import B4.e;
import H4.a;
import I4.a;
import I4.b;
import I4.i;
import I4.s;
import J4.o;
import N7.H7;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e5.f;
import h5.c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static c lambda$getComponents$0(b bVar) {
        return new h5.b((e) bVar.a(e.class), bVar.c(f.class), (ExecutorService) bVar.b(new s(a.class, ExecutorService.class)), new o((Executor) bVar.b(new s(H4.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<I4.a<?>> getComponents() {
        a.C0043a c0043aB = I4.a.b(c.class);
        c0043aB.f2440a = LIBRARY_NAME;
        c0043aB.a(i.b(e.class));
        c0043aB.a(new i(0, 1, f.class));
        c0043aB.a(new i((s<?>) new s(H4.a.class, ExecutorService.class), 1, 0));
        c0043aB.a(new i((s<?>) new s(H4.b.class, Executor.class), 1, 0));
        c0043aB.f2445f = new H7(28);
        I4.a aVarB = c0043aB.b();
        com.google.gson.internal.c cVar = new com.google.gson.internal.c();
        a.C0043a c0043aB2 = I4.a.b(e5.e.class);
        c0043aB2.f2444e = 1;
        c0043aB2.f2445f = new B.f(cVar, 6);
        return Arrays.asList(aVarB, c0043aB2.b(), q5.e.a(LIBRARY_NAME, "18.0.0"));
    }
}
