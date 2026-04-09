package io.appmetrica.analytics.network.impl;

import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.m;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
public final class a extends m implements InterfaceC5480a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HttpsURLConnection f42346a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(HttpsURLConnection httpsURLConnection) {
        super(0);
        this.f42346a = httpsURLConnection;
    }

    @Override // p9.InterfaceC5480a
    public final Object invoke() {
        return this.f42346a.getInputStream();
    }
}
