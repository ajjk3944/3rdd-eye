package com.yandex.mobile.ads.impl;

import y9.C5819a;

/* loaded from: classes3.dex */
public final class qc1 implements pc1 {

    /* renamed from: a, reason: collision with root package name */
    private final lj f32138a;

    public /* synthetic */ qc1() {
        this(new lj());
    }

    @Override // com.yandex.mobile.ads.impl.pc1
    public final String a(qq1 networkResponse) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        byte[] bArrA = networkResponse.a().a();
        if (bArrA == null) {
            return null;
        }
        if (!hf0.a(networkResponse.b(), gh0.f27718d0, true)) {
            return new String(bArrA, C5819a.f48359b);
        }
        this.f32138a.getClass();
        return lj.a(bArrA);
    }

    public qc1(lj base64Decoder) {
        kotlin.jvm.internal.l.f(base64Decoder, "base64Decoder");
        this.f32138a = base64Decoder;
    }
}
