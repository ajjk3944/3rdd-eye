package com.applovin.impl.sdk.ad;

import com.applovin.impl.h5;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements d4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5441a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5442b;

    public /* synthetic */ d(int i4, Object obj) {
        this.f5441a = i4;
        this.f5442b = obj;
    }

    @Override // d4.a
    public final void accept(Object obj) {
        switch (this.f5441a) {
            case 0:
                ((a) this.f5442b).s((h5) obj);
                break;
            default:
                b.a((String) this.f5442b, (h5) obj);
                break;
        }
    }
}
