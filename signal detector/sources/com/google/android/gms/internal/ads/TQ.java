package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class TQ extends P4 {

    /* renamed from: c, reason: collision with root package name */
    public final LB f11411c;

    public TQ(String str, C1197gC c1197gC) {
        super(str, null, false, 1);
        this.f11411c = LB.m(c1197gC);
    }

    @Override // com.google.android.gms.internal.ads.P4, java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        LB lb = this.f11411c;
        if (lb.isEmpty()) {
            return message;
        }
        int length = message.length();
        String strValueOf = String.valueOf(lb);
        return AbstractC1135f5.n(new StringBuilder(length + 17 + strValueOf.length()), message, "\nsniff failures: ", strValueOf);
    }
}
