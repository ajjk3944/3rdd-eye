package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class np1 extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np1(String str) {
        super(str);
        pb.y.f(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np1(String str, Throwable th2) {
        super(str, th2);
        pb.y.f(str, "Detail message must not be empty");
    }
}
