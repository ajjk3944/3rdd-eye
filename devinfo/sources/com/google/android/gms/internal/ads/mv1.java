package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mv1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f14030a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14031b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14032c;

    /* renamed from: d, reason: collision with root package name */
    public int f14033d = 0;

    public final nv1 a() {
        if (this.f14030a || !(this.f14031b || this.f14032c)) {
            return new nv1(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
