package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4897qd extends P2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f41476b;

    public C4897qd(String str, InterfaceC4930rl interfaceC4930rl) {
        super(interfaceC4930rl);
        this.f41476b = str;
    }

    @Override // io.appmetrica.analytics.impl.P2
    public final String a(String str) {
        return str + '-' + this.f41476b;
    }
}
