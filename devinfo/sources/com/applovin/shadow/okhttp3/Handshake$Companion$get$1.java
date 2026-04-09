package com.applovin.shadow.okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import mk.a;
import nk.l;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class Handshake$Companion$get$1 extends l implements a {
    final /* synthetic */ List<Certificate> $peerCertificatesCopy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$Companion$get$1(List<? extends Certificate> list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    @Override // mk.a
    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
