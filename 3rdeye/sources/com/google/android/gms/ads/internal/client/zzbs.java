package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzays;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzbhl;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbhq;
import com.google.android.gms.internal.ads.zzbhr;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhu;
import com.google.android.gms.internal.ads.zzbhx;
import com.google.android.gms.internal.ads.zzbhy;
import com.google.android.gms.internal.ads.zzbia;
import com.google.android.gms.internal.ads.zzbib;
import com.google.android.gms.internal.ads.zzbmn;
import com.google.android.gms.internal.ads.zzbmv;
import com.google.android.gms.internal.ads.zzbmw;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes.dex */
public abstract class zzbs extends zzays implements zzbt {
    public zzbs() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzays
    public final boolean zzde(int i, Parcel parcel, Parcel parcel2, int i10) throws RemoteException {
        zzbk zzbiVar = null;
        zzcs zzcsVar = null;
        switch (i) {
            case 1:
                zzbq zzbqVarZze = zze();
                parcel2.writeNoException();
                zzayt.zzf(parcel2, zzbqVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbiVar = iInterfaceQueryLocalInterface instanceof zzbk ? (zzbk) iInterfaceQueryLocalInterface : new zzbi(strongBinder);
                }
                zzayt.zzc(parcel);
                zzl(zzbiVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbhl zzbhlVarZzb = zzbhk.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzf(zzbhlVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbho zzbhoVarZzb = zzbhn.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzg(zzbhoVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbhu zzbhuVarZzb = zzbht.zzb(parcel.readStrongBinder());
                zzbhr zzbhrVarZzb = zzbhq.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzh(string, zzbhuVarZzb, zzbhrVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbgc zzbgcVar = (zzbgc) zzayt.zza(parcel, zzbgc.CREATOR);
                zzayt.zzc(parcel);
                zzo(zzbgcVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcsVar = iInterfaceQueryLocalInterface2 instanceof zzcs ? (zzcs) iInterfaceQueryLocalInterface2 : new zzcs(strongBinder2);
                }
                zzayt.zzc(parcel);
                zzq(zzcsVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbhy zzbhyVarZzb = zzbhx.zzb(parcel.readStrongBinder());
                zzr zzrVar = (zzr) zzayt.zza(parcel, zzr.CREATOR);
                zzayt.zzc(parcel);
                zzj(zzbhyVarZzb, zzrVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzayt.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzayt.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbib zzbibVarZzb = zzbia.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzk(zzbibVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbmn zzbmnVar = (zzbmn) zzayt.zza(parcel, zzbmn.CREATOR);
                zzayt.zzc(parcel);
                zzn(zzbmnVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmw zzbmwVarZzb = zzbmv.zzb(parcel.readStrongBinder());
                zzayt.zzc(parcel);
                zzi(zzbmwVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzayt.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzayt.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
