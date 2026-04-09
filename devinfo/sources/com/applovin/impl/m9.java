package com.applovin.impl;

import com.applovin.impl.i2;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class m9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4508a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4509b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4510c;

    public /* synthetic */ m9(Object obj, int i4, int i10) {
        this.f4508a = i10;
        this.f4510c = obj;
        this.f4509b = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4508a) {
            case 0:
                ((i2.b) this.f4510c).a(this.f4509b);
                break;
            default:
                ((n2) this.f4510c).a(this.f4509b);
                break;
        }
    }
}
