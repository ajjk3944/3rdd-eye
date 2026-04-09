package com.google.firebase.database;

import androidx.annotation.Keep;
import bf.b;
import bf.c;
import bf.d;
import bf.l;
import bf.s;
import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import o2.g;
import oh.p;
import se.f;
import sf.a;

@Keep
/* loaded from: classes.dex */
public class DatabaseRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rtdb";

    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(d dVar) {
        s sVarR = dVar.r(af.a.class);
        s sVarR2 = dVar.r(ze.a.class);
        a aVar = new a();
        new HashMap();
        new g(sVarR);
        new p(sVarR2);
        return aVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        b bVarB = c.b(a.class);
        bVarB.f2696a = LIBRARY_NAME;
        bVarB.a(l.b(f.class));
        bVarB.a(new l(0, 2, af.a.class));
        bVarB.a(new l(0, 2, ze.a.class));
        bVarB.f2701f = new p5.b(6);
        return Arrays.asList(bVarB.b(), b4.q(LIBRARY_NAME, "22.0.1"));
    }
}
