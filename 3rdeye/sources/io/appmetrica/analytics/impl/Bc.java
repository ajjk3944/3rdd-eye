package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AnrListener;

/* loaded from: classes3.dex */
public final class Bc {

    /* renamed from: a, reason: collision with root package name */
    public int f39168a = 5;

    /* renamed from: b, reason: collision with root package name */
    public final C4572e f39169b;

    public Bc(InterfaceC4573e0 interfaceC4573e0) {
        this.f39169b = new C4572e(new Wb(interfaceC4573e0));
    }

    public static final void b(AnrListener anrListener) {
        anrListener.onAppNotResponding();
    }

    public final void a(final AnrListener anrListener) {
        C4572e c4572e = this.f39169b;
        c4572e.f40769a.add(new InterfaceC4521c() { // from class: io.appmetrica.analytics.impl.Do
            @Override // io.appmetrica.analytics.impl.InterfaceC4521c
            public final void onAppNotResponding() {
                Bc.b(anrListener);
            }
        });
    }
}
