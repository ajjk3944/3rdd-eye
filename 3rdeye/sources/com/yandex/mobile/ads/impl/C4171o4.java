package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.o4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4171o4 implements InterfaceC4086c3 {

    /* renamed from: a, reason: collision with root package name */
    private final f8 f31161a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference<g51> f31162b;

    public /* synthetic */ C4171o4(g51 g51Var) {
        this(g51Var, new f8(), new WeakReference(g51Var));
    }

    public final f8 a() {
        return this.f31161a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4086c3
    public final void a(int i, Bundle bundle) {
        g51 g51Var = this.f31162b.get();
        if (g51Var != null) {
            if (i == 19) {
                g51Var.g();
                return;
            }
            if (i == 20) {
                g51Var.f();
                return;
            }
            switch (i) {
                case 6:
                    g51Var.e();
                    break;
                case 7:
                    g51Var.d();
                    break;
                case 8:
                    g51Var.c();
                    break;
                case 9:
                    g51Var.b();
                    break;
            }
        }
    }

    public C4171o4(g51 nativeAdEventController, f8 adResultReceiver, WeakReference<g51> eventControllerReference) {
        kotlin.jvm.internal.l.f(nativeAdEventController, "nativeAdEventController");
        kotlin.jvm.internal.l.f(adResultReceiver, "adResultReceiver");
        kotlin.jvm.internal.l.f(eventControllerReference, "eventControllerReference");
        this.f31161a = adResultReceiver;
        this.f31162b = eventControllerReference;
        adResultReceiver.a(this);
    }
}
