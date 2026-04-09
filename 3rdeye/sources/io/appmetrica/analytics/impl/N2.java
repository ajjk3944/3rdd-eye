package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import y9.C5819a;

/* loaded from: classes3.dex */
public class N2 implements ExternalAttribution {

    /* renamed from: a, reason: collision with root package name */
    public final T9 f39887a;

    public N2(T9 t92) {
        this.f39887a = t92;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f39887a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExternalAttribution(type=`");
        sb.append(AbstractC4558da.a(this.f39887a.f40168a));
        sb.append("`value=`");
        return B4.f.c(sb, new String(this.f39887a.f40169b, C5819a.f48359b), "`)");
    }
}
