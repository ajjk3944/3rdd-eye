package io.appmetrica.analytics.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class Yj implements InterfaceC4713jb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40430a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f40431b;

    public Yj(String str, Map map) {
        this.f40430a = str;
        this.f40431b = map;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4713jb
    public final void a(InterfaceC4739kb interfaceC4739kb) {
        interfaceC4739kb.reportEvent(this.f40430a, this.f40431b);
    }
}
