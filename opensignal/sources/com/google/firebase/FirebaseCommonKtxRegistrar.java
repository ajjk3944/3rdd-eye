package com.google.firebase;

import androidx.annotation.Keep;
import bf.b;
import bf.c;
import bf.l;
import bf.u;
import com.google.android.gms.internal.measurement.e5;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import se.g;
import wt.q;
import ye.a;
import ye.d;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/google/firebase/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "<init>", "()V", "", "Lbf/c;", "getComponents", "()Ljava/util/List;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        b bVarA = c.a(new u(a.class, q.class));
        bVarA.a(new l(new u(a.class, Executor.class), 1, 0));
        bVarA.f2701f = g.f22016d;
        c cVarB = bVarA.b();
        b bVarA2 = c.a(new u(ye.c.class, q.class));
        bVarA2.a(new l(new u(ye.c.class, Executor.class), 1, 0));
        bVarA2.f2701f = g.f22017g;
        c cVarB2 = bVarA2.b();
        b bVarA3 = c.a(new u(ye.b.class, q.class));
        bVarA3.a(new l(new u(ye.b.class, Executor.class), 1, 0));
        bVarA3.f2701f = g.f22018r;
        c cVarB3 = bVarA3.b();
        b bVarA4 = c.a(new u(d.class, q.class));
        bVarA4.a(new l(new u(d.class, Executor.class), 1, 0));
        bVarA4.f2701f = g.f22019x;
        return e5.I(cVarB, cVarB2, cVarB3, bVarA4.b());
    }
}
