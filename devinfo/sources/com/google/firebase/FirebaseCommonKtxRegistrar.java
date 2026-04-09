package com.google.firebase;

import androidx.annotation.Keep;
import ce.b;
import ce.c;
import ce.d;
import com.google.android.gms.internal.ads.sh0;
import com.google.firebase.components.ComponentRegistrar;
import de.a;
import de.i;
import de.q;
import java.util.List;
import java.util.concurrent.Executor;
import wd.g;
import xk.r;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        sh0 sh0VarA = a.a(new q(ce.a.class, r.class));
        sh0VarA.a(new i(new q(ce.a.class, Executor.class), 1, 0));
        sh0VarA.f16017f = g.f36622b;
        a aVarC = sh0VarA.c();
        sh0 sh0VarA2 = a.a(new q(c.class, r.class));
        sh0VarA2.a(new i(new q(c.class, Executor.class), 1, 0));
        sh0VarA2.f16017f = g.f36623c;
        a aVarC2 = sh0VarA2.c();
        sh0 sh0VarA3 = a.a(new q(b.class, r.class));
        sh0VarA3.a(new i(new q(b.class, Executor.class), 1, 0));
        sh0VarA3.f16017f = g.f36624d;
        a aVarC3 = sh0VarA3.c();
        sh0 sh0VarA4 = a.a(new q(d.class, r.class));
        sh0VarA4.a(new i(new q(d.class, Executor.class), 1, 0));
        sh0VarA4.f16017f = g.f36625e;
        return cm.g.t(aVarC, aVarC2, aVarC3, sh0VarA4.c());
    }
}
