package com.google.firebase.installations;

import androidx.annotation.Keep;
import bf.c;
import bf.d;
import bf.l;
import bf.u;
import cf.m;
import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.components.ComponentRegistrar;
import d5.v;
import fg.e;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import se.f;
import ye.a;
import ye.b;

@Keep
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static e lambda$getComponents$0(d dVar) {
        return new fg.d((f) dVar.a(f.class), dVar.g(cg.f.class), (ExecutorService) dVar.i(new u(a.class, ExecutorService.class)), new m((Executor) dVar.i(new u(b.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        bf.b bVarB = c.b(e.class);
        bVarB.f2696a = LIBRARY_NAME;
        bVarB.a(l.b(f.class));
        bVarB.a(new l(0, 1, cg.f.class));
        bVarB.a(new l(new u(a.class, ExecutorService.class), 1, 0));
        bVarB.a(new l(new u(b.class, Executor.class), 1, 0));
        bVarB.f2701f = new v(5);
        c cVarB = bVarB.b();
        cg.e eVar = new cg.e();
        bf.b bVarB2 = c.b(cg.e.class);
        bVarB2.f2700e = 1;
        bVarB2.f2701f = new bf.a(0, eVar);
        return Arrays.asList(cVarB, bVarB2.b(), b4.q(LIBRARY_NAME, "19.0.1"));
    }
}
