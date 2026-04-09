package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import bf.c;
import bf.d;
import bf.l;
import com.google.android.gms.internal.measurement.b4;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import ue.a;
import we.b;

@Keep
/* loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return new a((Context) dVar.a(Context.class), dVar.g(b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        bf.b bVarB = c.b(a.class);
        bVarB.f2696a = LIBRARY_NAME;
        bVarB.a(l.b(Context.class));
        bVarB.a(new l(0, 1, b.class));
        bVarB.f2701f = new p5.b(23);
        return Arrays.asList(bVarB.b(), b4.q(LIBRARY_NAME, "21.1.1"));
    }
}
