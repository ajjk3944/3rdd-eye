package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import ba.e;
import ca.a;
import com.google.android.gms.internal.ads.sh0;
import com.google.firebase.components.ComponentRegistrar;
import de.b;
import de.i;
import ea.q;
import java.util.Arrays;
import java.util.List;
import pf.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$0(b bVar) {
        q.b((Context) bVar.a(Context.class));
        return q.a().c(a.f2823f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$1(b bVar) {
        q.b((Context) bVar.a(Context.class));
        return q.a().c(a.f2823f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ e lambda$getComponents$2(b bVar) {
        q.b((Context) bVar.a(Context.class));
        return q.a().c(a.f2822e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<de.a> getComponents() {
        sh0 sh0VarB = de.a.b(e.class);
        sh0VarB.f16012a = LIBRARY_NAME;
        sh0VarB.a(i.b(Context.class));
        sh0VarB.f16017f = new u(18);
        de.a aVarC = sh0VarB.c();
        sh0 sh0VarA = de.a.a(new de.q(ue.a.class, e.class));
        sh0VarA.a(i.b(Context.class));
        sh0VarA.f16017f = new u(19);
        de.a aVarC2 = sh0VarA.c();
        sh0 sh0VarA2 = de.a.a(new de.q(ue.b.class, e.class));
        sh0VarA2.a(i.b(Context.class));
        sh0VarA2.f16017f = new u(20);
        return Arrays.asList(aVarC, aVarC2, sh0VarA2.c(), a.a.f(LIBRARY_NAME, "19.0.0"));
    }
}
