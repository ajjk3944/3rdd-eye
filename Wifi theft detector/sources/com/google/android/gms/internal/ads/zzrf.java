package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzrf extends Exception {
    public final boolean zza;

    public zzrf(int i10, int i11, int i12, int i13, int i14, zzv zzvVar, boolean z10, @Nullable Exception exc) {
        String strValueOf = String.valueOf(zzvVar);
        int length = String.valueOf(i11).length();
        int length2 = String.valueOf(i12).length();
        int length3 = String.valueOf(i13).length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 2 + length3 + 2 + String.valueOf(i14).length() + 2 + strValueOf.length());
        sb.append("AudioTrack init failed 0 Config(");
        sb.append(i11);
        sb.append(", ");
        sb.append(i12);
        sb.append(", ");
        sb.append(i13);
        sb.append(", ");
        sb.append(i14);
        sb.append(") ");
        sb.append(strValueOf);
        sb.append("");
        super(sb.toString(), exc);
        this.zza = false;
    }
}
