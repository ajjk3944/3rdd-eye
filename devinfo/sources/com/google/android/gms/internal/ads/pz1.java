package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pz1 extends ua {

    /* renamed from: c, reason: collision with root package name */
    public final x41 f15158c;

    public pz1(String str, u51 u51Var) {
        super(false, 1, str, null);
        this.f15158c = x41.q(u51Var);
    }

    @Override // com.google.android.gms.internal.ads.ua, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        x41 x41Var = this.f15158c;
        if (x41Var.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(x41Var);
        return r5.c.m(new StringBuilder(length + 17 + strValueOf.length()), message, "\nsniff failures: ", strValueOf);
    }
}
