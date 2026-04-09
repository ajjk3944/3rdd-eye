package com.google.android.gms.internal.ads;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1937u extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public C1937u(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String strConcat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
        super(AbstractC1135f5.n(new StringBuilder(strConcat.length() + simpleName.length() + 11), "Unexpected ", simpleName, strConcat), th);
    }
}
