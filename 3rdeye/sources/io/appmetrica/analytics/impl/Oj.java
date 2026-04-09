package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* loaded from: classes3.dex */
public final class Oj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ModuleEvent f39944a;

    public Oj(ModuleEvent moduleEvent) {
        this.f39944a = moduleEvent;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.reportEvent(this.f39944a);
    }
}
