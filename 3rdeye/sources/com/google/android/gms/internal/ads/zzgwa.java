package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzgwa {
    public static final zzgwa zza = new zzgwa(new zzgwb());
    public static final zzgwa zzb = new zzgwa(new zzgwf());
    private final zzgvy zzc;

    static {
        new zzgwa(new zzgwh());
        new zzgwa(new zzgwg());
        new zzgwa(new zzgwc());
        new zzgwa(new zzgwe());
        new zzgwa(new zzgwd());
    }

    public zzgwa(zzgwi zzgwiVar) {
        this.zzc = !zzglv.zzb() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzgvv(zzgwiVar, null) : new zzgvw(zzgwiVar, null) : new zzgvx(zzgwiVar, null);
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzc.zza(str);
    }
}
