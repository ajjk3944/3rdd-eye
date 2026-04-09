package com.google.firebase.dynamiclinks.internal;

import F4.c;
import F4.d;
import F4.q;
import V4.a;
import W4.g;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinkRegistrar;
import com.google.firebase.f;
import java.util.Arrays;
import java.util.List;
import m5.h;

@Keep
/* loaded from: classes3.dex */
public final class FirebaseDynamicLinkRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-dl";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(d dVar) {
        return new g((f) dVar.a(f.class), dVar.e(D4.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<c> getComponents() {
        return Arrays.asList(c.e(a.class).g(LIBRARY_NAME).b(q.j(f.class)).b(q.h(D4.a.class)).e(new F4.g() { // from class: W4.f
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return FirebaseDynamicLinkRegistrar.lambda$getComponents$0(dVar);
            }
        }).c(), h.b(LIBRARY_NAME, "22.1.0"));
    }
}
