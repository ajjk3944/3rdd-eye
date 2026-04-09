package c;

import android.window.OnBackInvokedCallback;

/* renamed from: c.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367G {

    /* renamed from: a, reason: collision with root package name */
    public static final C0367G f5795a = new C0367G();

    public final OnBackInvokedCallback a(p5.l lVar, p5.l lVar2, p5.a aVar, p5.a aVar2) {
        q5.i.e(lVar, "onBackStarted");
        q5.i.e(lVar2, "onBackProgressed");
        q5.i.e(aVar, "onBackInvoked");
        q5.i.e(aVar2, "onBackCancelled");
        return new C0366F(lVar, lVar2, aVar, aVar2);
    }
}
