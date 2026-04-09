package com.vungle.ads.internal;

import com.vungle.ads.internal.c;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f23800b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f23801c;

    public /* synthetic */ b(c cVar, int i) {
        this.f23800b = i;
        this.f23801c = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23800b) {
            case 0:
                c.a.m34onAdClick$lambda3(this.f23801c);
                break;
            default:
                c.a.m38onAdStart$lambda0(this.f23801c);
                break;
        }
    }
}
