package io.appmetrica.analytics.impl;

import b9.C1992A;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* renamed from: io.appmetrica.analytics.impl.kc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4740kc extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: a, reason: collision with root package name */
    public static final C4740kc f41139a = new C4740kc();

    public C4740kc() {
        super(1);
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).stopLocationTracking();
        return C1992A.f18074a;
    }
}
