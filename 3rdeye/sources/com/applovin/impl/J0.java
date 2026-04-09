package com.applovin.impl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class J0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f18814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r1 f18815c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f18816d;

    public /* synthetic */ J0(r1 r1Var, String str, int i) {
        this.f18814b = i;
        this.f18815c = r1Var;
        this.f18816d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18814b) {
            case 0:
                this.f18815c.c(this.f18816d);
                break;
            default:
                this.f18815c.b(this.f18816d);
                break;
        }
    }
}
