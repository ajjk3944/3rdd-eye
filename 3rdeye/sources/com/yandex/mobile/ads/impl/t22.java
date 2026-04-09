package com.yandex.mobile.ads.impl;

import y9.C5819a;

/* loaded from: classes3.dex */
public final class t22 implements br1<String> {
    @Override // com.yandex.mobile.ads.impl.br1
    public final String a(qq1 networkResponse) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        byte[] bArrA = networkResponse.a().a();
        if (bArrA == null) {
            return null;
        }
        try {
            return new String(bArrA, hf0.a(networkResponse.b()));
        } catch (Exception unused) {
            return new String(bArrA, C5819a.f48359b);
        }
    }
}
