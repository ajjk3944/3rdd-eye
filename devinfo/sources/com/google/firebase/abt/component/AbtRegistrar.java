package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.internal.ads.sh0;
import com.google.firebase.components.ComponentRegistrar;
import de.b;
import de.i;
import java.util.Arrays;
import java.util.List;
import wg.p;
import yd.a;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
@Keep
/* loaded from: classes3.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(b bVar) {
        return new a((Context) bVar.a(Context.class), bVar.j(ae.b.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<de.a> getComponents() {
        sh0 sh0VarB = de.a.b(a.class);
        sh0VarB.f16012a = LIBRARY_NAME;
        sh0VarB.a(i.b(Context.class));
        sh0VarB.a(new i(0, 1, ae.b.class));
        sh0VarB.f16017f = new p(8);
        return Arrays.asList(sh0VarB.c(), a.a.f(LIBRARY_NAME, "21.1.1"));
    }
}
