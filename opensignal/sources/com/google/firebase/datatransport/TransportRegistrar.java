package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import bf.b;
import bf.c;
import bf.d;
import bf.l;
import bf.u;
import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.components.ComponentRegistrar;
import j9.f;
import java.util.Arrays;
import java.util.List;
import k9.a;
import m9.o;

@Keep
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$0(d dVar) {
        o.b((Context) dVar.a(Context.class));
        return o.a().c(a.f14214f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$1(d dVar) {
        o.b((Context) dVar.a(Context.class));
        return o.a().c(a.f14214f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ f lambda$getComponents$2(d dVar) {
        o.b((Context) dVar.a(Context.class));
        return o.a().c(a.f14213e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        b bVarB = c.b(f.class);
        bVarB.f2696a = LIBRARY_NAME;
        bVarB.a(l.b(Context.class));
        bVarB.f2701f = new p5.b(24);
        c cVarB = bVarB.b();
        b bVarA = c.a(new u(vf.a.class, f.class));
        bVarA.a(l.b(Context.class));
        bVarA.f2701f = new p5.b(25);
        c cVarB2 = bVarA.b();
        b bVarA2 = c.a(new u(vf.b.class, f.class));
        bVarA2.a(l.b(Context.class));
        bVarA2.f2701f = new p5.b(26);
        return Arrays.asList(cVarB, cVarB2, bVarA2.b(), b4.q(LIBRARY_NAME, "19.0.0"));
    }
}
