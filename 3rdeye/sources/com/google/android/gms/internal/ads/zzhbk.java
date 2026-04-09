package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzhbk extends RuntimeException {
    public zzhbk(zzhag zzhagVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgzk zza() {
        return new zzgzk(getMessage());
    }
}
