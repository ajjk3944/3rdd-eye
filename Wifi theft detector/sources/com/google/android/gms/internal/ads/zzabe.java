package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
public final class zzabe extends IOException {
    public zzabe(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String strConcat = th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : "";
        StringBuilder sb = new StringBuilder(simpleName.length() + 11 + strConcat.length());
        sb.append("Unexpected ");
        sb.append(simpleName);
        sb.append(strConcat);
        super(sb.toString(), th);
    }
}
