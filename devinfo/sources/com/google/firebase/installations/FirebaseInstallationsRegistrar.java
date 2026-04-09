package com.google.firebase.installations;

import androidx.annotation.Keep;
import bf.g;
import ce.a;
import com.google.android.gms.internal.ads.sh0;
import com.google.firebase.components.ComponentRegistrar;
import de.b;
import de.i;
import de.q;
import df.c;
import df.d;
import ee.k;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import wd.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static d lambda$getComponents$0(b bVar) {
        return new c((f) bVar.a(f.class), bVar.j(g.class), (ExecutorService) bVar.l(new q(a.class, ExecutorService.class)), new k((Executor) bVar.l(new q(ce.b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<de.a> getComponents() {
        sh0 sh0VarB = de.a.b(d.class);
        sh0VarB.f16012a = LIBRARY_NAME;
        sh0VarB.a(i.b(f.class));
        sh0VarB.a(new i(0, 1, g.class));
        sh0VarB.a(new i(new q(a.class, ExecutorService.class), 1, 0));
        sh0VarB.a(new i(new q(ce.b.class, Executor.class), 1, 0));
        sh0VarB.f16017f = new com.google.gson.internal.b(9);
        de.a aVarC = sh0VarB.c();
        bf.f fVar = new bf.f(0);
        sh0 sh0VarB2 = de.a.b(bf.f.class);
        sh0VarB2.f16014c = 1;
        sh0VarB2.f16017f = new ca.b(6, fVar);
        return Arrays.asList(aVarC, sh0VarB2.c(), a.a.f(LIBRARY_NAME, "19.0.1"));
    }
}
