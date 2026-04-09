package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzrh extends Exception {
    public zzrh(long j10, long j11) {
        StringBuilder sb = new StringBuilder(String.valueOf(j11).length() + 63 + String.valueOf(j10).length());
        sb.append("Unexpected audio track timestamp discontinuity: expected ");
        sb.append(j11);
        sb.append(", got ");
        sb.append(j10);
        super(sb.toString());
    }
}
