package com.google.firebase.datatransport;

import F4.A;
import F4.c;
import F4.d;
import F4.g;
import F4.q;
import U4.b;
import a3.i;
import android.content.Context;
import androidx.annotation.Keep;
import c3.C4220u;
import com.google.android.datatransport.cct.a;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import java.util.Arrays;
import java.util.List;
import m5.h;

@Keep
/* loaded from: classes3.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$0(d dVar) {
        C4220u.f((Context) dVar.a(Context.class));
        return C4220u.c().g(a.f34675h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$1(d dVar) {
        C4220u.f((Context) dVar.a(Context.class));
        return C4220u.c().g(a.f34675h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$2(d dVar) {
        C4220u.f((Context) dVar.a(Context.class));
        return C4220u.c().g(a.f34674g);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        return Arrays.asList(c.e(i.class).g(LIBRARY_NAME).b(q.j(Context.class)).e(new g() { // from class: U4.c
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return TransportRegistrar.lambda$getComponents$0(dVar);
            }
        }).c(), c.c(A.a(U4.a.class, i.class)).b(q.j(Context.class)).e(new g() { // from class: U4.d
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return TransportRegistrar.lambda$getComponents$1(dVar);
            }
        }).c(), c.c(A.a(b.class, i.class)).b(q.j(Context.class)).e(new g() { // from class: U4.e
            @Override // F4.g
            public final Object a(F4.d dVar) {
                return TransportRegistrar.lambda$getComponents$2(dVar);
            }
        }).c(), h.b(LIBRARY_NAME, "19.0.0"));
    }
}
