package com.google.firebase.abt.component;

import B4.h;
import D4.a;
import I4.a;
import I4.b;
import I4.i;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import q5.e;

@Keep
/* loaded from: classes2.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a lambda$getComponents$0(b bVar) {
        return new a((Context) bVar.a(Context.class), bVar.c(F4.a.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<I4.a<?>> getComponents() {
        a.C0043a c0043aB = I4.a.b(D4.a.class);
        c0043aB.f2440a = LIBRARY_NAME;
        c0043aB.a(i.b(Context.class));
        c0043aB.a(new i(0, 1, F4.a.class));
        c0043aB.f2445f = new h(1);
        return Arrays.asList(c0043aB.b(), e.a(LIBRARY_NAME, "21.1.1"));
    }
}
