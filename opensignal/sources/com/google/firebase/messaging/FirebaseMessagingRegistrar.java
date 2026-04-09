package com.google.firebase.messaging;

import androidx.annotation.Keep;
import bf.d;
import bf.l;
import bf.u;
import bg.c;
import cg.h;
import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.components.ComponentRegistrar;
import dg.a;
import fg.e;
import java.util.Arrays;
import java.util.List;
import ng.b;
import se.f;

@Keep
/* loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(u uVar, d dVar) {
        f fVar = (f) dVar.a(f.class);
        if (dVar.a(a.class) == null) {
            return new FirebaseMessaging(fVar, dVar.g(b.class), dVar.g(h.class), (e) dVar.a(e.class), dVar.k(uVar), (c) dVar.a(c.class));
        }
        throw new ClassCastException();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<bf.c> getComponents() {
        u uVar = new u(vf.b.class, j9.f.class);
        bf.b bVarB = bf.c.b(FirebaseMessaging.class);
        bVarB.f2696a = LIBRARY_NAME;
        bVarB.a(l.b(f.class));
        bVarB.a(new l(0, 0, a.class));
        bVarB.a(new l(0, 1, b.class));
        bVarB.a(new l(0, 1, h.class));
        bVarB.a(l.b(e.class));
        bVarB.a(new l(uVar, 0, 1));
        bVarB.a(l.b(c.class));
        bVarB.f2701f = new cg.b(uVar, 1);
        bVarB.c(1);
        return Arrays.asList(bVarB.b(), b4.q(LIBRARY_NAME, "25.0.1"));
    }
}
