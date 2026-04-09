package com.google.gson.internal;

import com.google.android.gms.internal.ads.im1;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j extends im1 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f20845f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(m mVar, int i4) {
        super(mVar);
        this.f20845f = i4;
    }

    @Override // com.google.android.gms.internal.ads.im1, java.util.Iterator
    public Object next() {
        switch (this.f20845f) {
            case 1:
                return a().f20853f;
            default:
                return super.next();
        }
    }
}
