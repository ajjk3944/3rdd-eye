package io.appmetrica.analytics.screenshot.impl;

import c9.C2077A;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.common.InternalModuleEvent;

/* renamed from: io.appmetrica.analytics.screenshot.impl.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5155v implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f42588a;

    public C5155v(ClientContext clientContext) {
        this.f42588a = clientContext;
    }

    public final void a(String str) {
        this.f42588a.getInternalClientModuleFacade().reportEvent(InternalModuleEvent.Companion.newBuilder(4).withName("appmetrica_system_event_screenshot").withAttributes(C2077A.m(new b9.l("type", str))).withCategory(InternalModuleEvent.Category.SYSTEM).build());
    }
}
