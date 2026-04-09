package com.google.android.gms.internal.ads;

import androidx.work.s;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzqm extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzqm(long j4, long j10) {
        StringBuilder sbJ = s.j("Unexpected audio track timestamp discontinuity: expected ", ", got ", j10);
        sbJ.append(j4);
        super(sbJ.toString());
    }
}
