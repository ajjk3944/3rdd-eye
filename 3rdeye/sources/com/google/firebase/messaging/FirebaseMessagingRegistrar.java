package com.google.firebase.messaging;

import B4.e;
import I4.a;
import I4.b;
import I4.s;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import d5.d;
import e5.g;
import f5.InterfaceC4335a;
import h5.c;
import java.util.Arrays;
import java.util.List;
import q5.f;
import v3.i;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(s sVar, b bVar) {
        return new FirebaseMessaging((e) bVar.a(e.class), (InterfaceC4335a) bVar.a(InterfaceC4335a.class), bVar.c(f.class), bVar.c(g.class), (c) bVar.a(c.class), bVar.e(sVar), (d) bVar.a(d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<I4.a<?>> getComponents() {
        s sVar = new s(X4.b.class, i.class);
        a.C0043a c0043aB = I4.a.b(FirebaseMessaging.class);
        c0043aB.f2440a = LIBRARY_NAME;
        c0043aB.a(I4.i.b(e.class));
        c0043aB.a(new I4.i(0, 0, InterfaceC4335a.class));
        c0043aB.a(new I4.i(0, 1, f.class));
        c0043aB.a(new I4.i(0, 1, g.class));
        c0043aB.a(I4.i.b(c.class));
        c0043aB.a(new I4.i((s<?>) sVar, 0, 1));
        c0043aB.a(I4.i.b(d.class));
        c0043aB.f2445f = new B.d(sVar, 21);
        c0043aB.c(1);
        return Arrays.asList(c0043aB.b(), q5.e.a(LIBRARY_NAME, "24.0.0"));
    }
}
