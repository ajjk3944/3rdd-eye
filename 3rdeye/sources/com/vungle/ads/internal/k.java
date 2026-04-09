package com.vungle.ads.internal;

import e5.C4318d;
import f6.C4336a;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23809a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23810b;

    public /* synthetic */ k(Object obj, int i) {
        this.f23809a = i;
        this.f23810b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [b9.g, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f23809a) {
            case 0:
                return l.m71getAvailableBidTokens$lambda3(this.f23810b);
            case 1:
                C4318d c4318d = (C4318d) this.f23810b;
                synchronized (c4318d) {
                    ((e5.h) c4318d.f37722a.get()).k(System.currentTimeMillis(), c4318d.f37724c.get().getUserAgent());
                }
                return null;
            default:
                return C4336a.m136readUnclosedAdFromFile$lambda2((C4336a) this.f23810b);
        }
    }
}
