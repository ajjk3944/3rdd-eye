package io.appmetrica.analytics.impl;

import b9.C1992A;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;

/* renamed from: io.appmetrica.analytics.impl.jc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4714jc extends kotlin.jvm.internal.m implements p9.l {

    /* renamed from: a, reason: collision with root package name */
    public static final C4714jc f41113a = new C4714jc();

    public C4714jc() {
        super(1);
    }

    @Override // p9.l
    public final Object invoke(Object obj) {
        ((LocationControllerObserver) obj).startLocationTracking();
        return C1992A.f18074a;
    }
}
