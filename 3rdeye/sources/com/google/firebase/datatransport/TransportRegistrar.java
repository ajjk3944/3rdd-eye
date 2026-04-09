package com.google.firebase.datatransport;

import I4.a;
import I4.b;
import I4.s;
import N7.C1094a9;
import N7.G8;
import N7.H7;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import q5.e;
import v3.i;
import w3.C5719a;
import y3.u;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$0(b bVar) {
        u.b((Context) bVar.a(Context.class));
        return u.a().c(C5719a.f47326f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$1(b bVar) {
        u.b((Context) bVar.a(Context.class));
        return u.a().c(C5719a.f47326f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i lambda$getComponents$2(b bVar) {
        u.b((Context) bVar.a(Context.class));
        return u.a().c(C5719a.f47325e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a<?>> getComponents() {
        a.C0043a c0043aB = a.b(i.class);
        c0043aB.f2440a = LIBRARY_NAME;
        c0043aB.a(I4.i.b(Context.class));
        c0043aB.f2445f = new G8(23);
        a aVarB = c0043aB.b();
        a.C0043a c0043aA = a.a(new s(X4.a.class, i.class));
        c0043aA.a(I4.i.b(Context.class));
        c0043aA.f2445f = new C1094a9(18);
        a aVarB2 = c0043aA.b();
        a.C0043a c0043aA2 = a.a(new s(X4.b.class, i.class));
        c0043aA2.a(I4.i.b(Context.class));
        c0043aA2.f2445f = new H7(19);
        return Arrays.asList(aVarB, aVarB2, c0043aA2.b(), e.a(LIBRARY_NAME, "19.0.0"));
    }
}
