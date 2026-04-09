package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public final class zzq {
    public static final zzq zza = new zzq();

    public final zzm zza(Context context, zzek zzekVar) {
        String strZzv;
        String strZzi = zzekVar.zzi();
        Set setZzn = zzekVar.zzn();
        List listUnmodifiableList = !setZzn.isEmpty() ? Collections.unmodifiableList(new ArrayList(setZzn)) : null;
        boolean zZzq = zzekVar.zzq(context);
        Bundle bundleZzf = zzekVar.zzf(AdMobAdapter.class);
        String strZzj = zzekVar.zzj();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            zzbb.zzb();
            strZzv = com.google.android.gms.ads.internal.util.client.zzf.zzv(Thread.currentThread().getStackTrace(), packageName);
        } else {
            strZzv = null;
        }
        boolean zZzp = zzekVar.zzp();
        RequestConfiguration requestConfigurationZzc = zzey.zzf().zzc();
        return new zzm(8, -1L, bundleZzf, -1, listUnmodifiableList, zZzq, Math.max(zzekVar.zzb(), requestConfigurationZzc.getTagForChildDirectedTreatment()), false, strZzj, null, null, strZzi, zzekVar.zzg(), zzekVar.zze(), Collections.unmodifiableList(new ArrayList(zzekVar.zzm())), zzekVar.zzk(), strZzv, zZzp, null, requestConfigurationZzc.getTagForUnderAgeOfConsent(), (String) Collections.max(Arrays.asList(null, requestConfigurationZzc.getMaxAdContentRating()), new Comparator() { // from class: com.google.android.gms.ads.internal.client.zzp
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = RequestConfiguration.zza;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            }
        }), zzekVar.zzl(), zzekVar.zza(), zzekVar.zzh(), requestConfigurationZzc.getPublisherPrivacyPersonalizationState().getValue(), zzekVar.zzc());
    }
}
