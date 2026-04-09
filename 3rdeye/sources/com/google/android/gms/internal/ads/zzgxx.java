package com.google.android.gms.internal.ads;

import androidx.work.s;
import java.io.IOException;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgxx extends IOException {
    public zzgxx() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzgxx(long j4, long j10, int i, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbJ = s.j("Pos: ", ", limit: ", j4);
        sbJ.append(j10);
        sbJ.append(", len: ");
        sbJ.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbJ.toString()), th);
    }

    public zzgxx(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
