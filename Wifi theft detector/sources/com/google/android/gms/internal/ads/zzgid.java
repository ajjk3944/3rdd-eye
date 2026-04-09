package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class zzgid extends RuntimeException {
    public zzgid(int i10) {
        StringBuilder sb = new StringBuilder(String.valueOf(i10).length() + 3);
        sb.append("r: ");
        sb.append(i10);
        super(sb.toString());
    }
}
