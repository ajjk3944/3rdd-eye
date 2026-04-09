package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* renamed from: io.appmetrica.analytics.impl.e6, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4579e6 extends BaseRequestConfig.DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final C4544cm f40791a;

    /* renamed from: b, reason: collision with root package name */
    public final SdkEnvironmentProvider f40792b;

    public C4579e6(C4544cm c4544cm, SdkEnvironmentProvider sdkEnvironmentProvider, PlatformIdentifiers platformIdentifiers, Object obj) {
        super(new SdkIdentifiers(c4544cm.e(), c4544cm.a(), c4544cm.b()), sdkEnvironmentProvider, platformIdentifiers, obj);
        this.f40791a = c4544cm;
        this.f40792b = sdkEnvironmentProvider;
    }
}
