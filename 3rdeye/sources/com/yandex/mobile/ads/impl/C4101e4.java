package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C4094d4;

/* renamed from: com.yandex.mobile.ads.impl.e4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4101e4 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4087c4 f26658a;

    /* renamed from: b, reason: collision with root package name */
    private final C4094d4 f26659b;

    public /* synthetic */ C4101e4(InterfaceC4087c4 interfaceC4087c4) {
        this(interfaceC4087c4, C4094d4.a.a());
    }

    public final void a() {
        String strA = this.f26658a.a();
        if (strA == null || strA.length() == 0) {
            return;
        }
        this.f26659b.a(strA);
    }

    public final void b() {
        String strA = this.f26658a.a();
        if (strA == null || strA.length() == 0) {
            return;
        }
        this.f26659b.b(strA);
    }

    public C4101e4(InterfaceC4087c4 adIdProvider, C4094d4 adIdStorage) {
        kotlin.jvm.internal.l.f(adIdProvider, "adIdProvider");
        kotlin.jvm.internal.l.f(adIdStorage, "adIdStorage");
        this.f26658a = adIdProvider;
        this.f26659b = adIdStorage;
    }
}
