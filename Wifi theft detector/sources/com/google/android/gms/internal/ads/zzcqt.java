package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final /* synthetic */ class zzcqt implements zzgyw {
    static final /* synthetic */ zzcqt zza = new zzcqt();

    private /* synthetic */ zzcqt() {
    }

    @Override // com.google.android.gms.internal.ads.zzgyw
    public final /* synthetic */ com.google.common.util.concurrent.a zza(Object obj) {
        Throwable th = (Throwable) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlS)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return zzgzo.zza(new androidx.privacysandbox.ads.adservices.topics.c(zzguf.zzi()));
    }
}
