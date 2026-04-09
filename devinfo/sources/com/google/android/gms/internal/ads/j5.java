package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12633a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f12634b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f12635c;

    public /* synthetic */ j5(boolean z3, boolean z10, boolean z11) {
        this.f12633a = z3;
        this.f12634b = z10;
        this.f12635c = z11;
    }

    public boolean a() {
        return (this.f12635c || this.f12634b) && this.f12633a;
    }

    public hv1 b() {
        if (this.f12633a || !(this.f12634b || this.f12635c)) {
            return new hv1(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }
}
