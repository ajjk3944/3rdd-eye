package com.applovin.impl.sdk;

import android.content.Context;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f5401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.ad.b f5402c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f5403d;

    public /* synthetic */ a0(m mVar, com.applovin.impl.sdk.ad.b bVar, Context context, int i4) {
        this.f5400a = i4;
        this.f5401b = mVar;
        this.f5402c = bVar;
        this.f5403d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5400a) {
            case 0:
                this.f5401b.a(this.f5402c, this.f5403d);
                break;
            default:
                this.f5401b.b(this.f5402c, this.f5403d);
                break;
        }
    }
}
