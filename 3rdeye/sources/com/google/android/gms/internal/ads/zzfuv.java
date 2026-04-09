package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfuv extends zzfur implements Serializable {
    private final Pattern zza;

    public zzfuv(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfur
    public final zzfuq zza(CharSequence charSequence) {
        return new zzfuu(this.zza.matcher(charSequence));
    }
}
