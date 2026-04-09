package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ii f9885a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f9886b;

    public c(ii iiVar, int[] iArr) {
        if (iArr.length == 0) {
            ls.H("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f9885a = iiVar;
        this.f9886b = iArr;
    }
}
