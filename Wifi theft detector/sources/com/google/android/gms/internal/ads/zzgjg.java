package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzgjg extends RuntimeException {
    public zzgjg() {
        this(0);
    }

    public zzgjg(int i10) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 3);
        sb.append("r: ");
        sb.append(i10);
        super(sb.toString());
    }

    public zzgjg(int i10, Throwable th) {
        super("r: 2", th);
    }
}
