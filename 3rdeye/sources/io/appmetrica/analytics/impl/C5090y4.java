package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* renamed from: io.appmetrica.analytics.impl.y4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5090y4 implements ClientStorageProvider {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC4930rl f42106a;

    public C5090y4(InterfaceC4930rl interfaceC4930rl) {
        this.f42106a = interfaceC4930rl;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider
    public final ModulePreferences modulePreferences(String str) {
        return new C4897qd(str, this.f42106a);
    }
}
