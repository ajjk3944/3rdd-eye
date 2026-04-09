package com.google.firebase.installations;

import F4.A;
import F4.q;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import e5.i;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g5.e lambda$getComponents$0(F4.d dVar) {
        return new c((com.google.firebase.f) dVar.a(com.google.firebase.f.class), dVar.e(i.class), (ExecutorService) dVar.f(A.a(E4.a.class, ExecutorService.class)), G4.i.a((Executor) dVar.f(A.a(E4.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<F4.c> getComponents() {
        return Arrays.asList(F4.c.e(g5.e.class).g(LIBRARY_NAME).b(q.j(com.google.firebase.f.class)).b(q.h(i.class)).b(q.i(A.a(E4.a.class, ExecutorService.class))).b(q.i(A.a(E4.b.class, Executor.class))).e(new F4.g() { // from class: g5.f
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(dVar);
            }
        }).c(), e5.h.a(), m5.h.b(LIBRARY_NAME, "18.0.0"));
    }
}
