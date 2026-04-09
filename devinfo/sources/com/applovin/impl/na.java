package com.applovin.impl;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class na implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4905a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f4906b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4907c;

    public /* synthetic */ na(w1 w1Var, String str, int i4) {
        this.f4905a = i4;
        this.f4906b = w1Var;
        this.f4907c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4905a) {
            case 0:
                this.f4906b.b(this.f4907c);
                break;
            default:
                this.f4906b.c(this.f4907c);
                break;
        }
    }
}
