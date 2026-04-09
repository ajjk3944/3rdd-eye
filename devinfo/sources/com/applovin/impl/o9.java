package com.applovin.impl;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class o9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j4 f5022b;

    public /* synthetic */ o9(j4 j4Var, int i4) {
        this.f5021a = i4;
        this.f5022b = j4Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f5021a) {
            case 0:
                this.f5022b.g();
                break;
            default:
                this.f5022b.f();
                break;
        }
    }
}
