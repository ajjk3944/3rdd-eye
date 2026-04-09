package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public enum e3 {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f20115a;

    e3(int i4) {
        this.f20115a = i4;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f20115a);
    }
}
