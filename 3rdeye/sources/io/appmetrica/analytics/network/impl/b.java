package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class b extends m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HttpsURLConnection f42347a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f42347a = httpsURLConnection;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        return this.f42347a.getErrorStream();
    }
}
