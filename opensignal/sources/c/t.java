package c;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final t f3047a = new t();

    public final OnBackInvokedCallback a(ar.k kVar, ar.k kVar2, ar.a aVar, ar.a aVar2) {
        br.l.e(kVar, "onBackStarted");
        br.l.e(kVar2, "onBackProgressed");
        br.l.e(aVar, "onBackInvoked");
        br.l.e(aVar2, "onBackCancelled");
        return new s(kVar, kVar2, aVar, aVar2);
    }
}
