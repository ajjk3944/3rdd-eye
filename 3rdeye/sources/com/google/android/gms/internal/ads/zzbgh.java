package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbgh extends NativeAd.AdChoicesInfo {
    private final zzbgg zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbgh(zzbgg zzbggVar) {
        IBinder iBinder;
        this.zza = zzbggVar;
        try {
            this.zzc = zzbggVar.zzg();
        } catch (RemoteException e4) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e4);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbggVar.zzh()) {
                zzbgn zzbglVar = null;
                if ((obj instanceof IBinder) && (iBinder = (IBinder) obj) != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbglVar = iInterfaceQueryLocalInterface instanceof zzbgn ? (zzbgn) iInterfaceQueryLocalInterface : new zzbgl(iBinder);
                }
                if (zzbglVar != null) {
                    this.zzb.add(new zzbgo(zzbglVar));
                }
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e10);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
