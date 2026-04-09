package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkServiceLocator;
import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* loaded from: classes3.dex */
public final class Tg implements Hl {

    /* renamed from: a, reason: collision with root package name */
    public final C5108ym f40179a;

    public Tg(C5108ym c5108ym) {
        this.f40179a = c5108ym;
    }

    @Override // io.appmetrica.analytics.impl.Hl
    public final void a() throws Throwable {
        NetworkTask networkTaskC = this.f40179a.c();
        if (networkTaskC != null) {
            Ga.f39501F.getClass();
            NetworkServiceLocator.getInstance().getNetworkCore().startTask(networkTaskC);
        }
    }
}
