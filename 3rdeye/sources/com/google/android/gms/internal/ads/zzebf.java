package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbch;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzebf {
    private final zzbca zza;
    private final Context zzb;
    private final zzeak zzc;
    private final VersionInfoParcel zzd;

    public zzebf(Context context, VersionInfoParcel versionInfoParcel, zzbca zzbcaVar, zzeak zzeakVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbcaVar;
        this.zzc = zzeakVar;
    }

    public static /* synthetic */ Void zza(zzebf zzebfVar, boolean z10, SQLiteDatabase sQLiteDatabase) {
        if (z10) {
            zzebfVar.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(zzbch.zzaf.zza.zzx(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgzk e4) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(e4.getMessage());
                }
            }
            cursorQuery.close();
            Context context = zzebfVar.zzb;
            zzbch.zzaf.zzc zzcVarZzi = zzbch.zzaf.zzi();
            zzcVarZzi.zzv(context.getPackageName());
            zzcVarZzi.zzy(Build.MODEL);
            zzcVarZzi.zzA(zzeaz.zza(sQLiteDatabase, 0));
            zzcVarZzi.zzh(arrayList);
            zzcVarZzi.zzE(zzeaz.zza(sQLiteDatabase, 1));
            zzcVarZzi.zzx(zzeaz.zza(sQLiteDatabase, 3));
            zzcVarZzi.zzF(com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis());
            zzcVarZzi.zzB(zzeaz.zzb(sQLiteDatabase, 2));
            final zzbch.zzaf zzafVarZzbr = zzcVarZzi.zzbr();
            int size = arrayList.size();
            long jZze = 0;
            for (int i10 = 0; i10 < size; i10++) {
                zzbch.zzaf.zza zzaVar = (zzbch.zzaf.zza) arrayList.get(i10);
                if (zzaVar.zzk() == zzbch.zzq.ENUM_TRUE && zzaVar.zze() > jZze) {
                    jZze = zzaVar.zze();
                }
            }
            if (jZze != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(jZze));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            zzbca zzbcaVar = zzebfVar.zza;
            zzbcaVar.zzb(new zzbbz() { // from class: com.google.android.gms.internal.ads.zzebd
                @Override // com.google.android.gms.internal.ads.zzbbz
                public final void zza(zzbch.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzafVarZzbr);
                }
            });
            VersionInfoParcel versionInfoParcel = zzebfVar.zzd;
            zzbch.zzar.zza zzaVarZzd = zzbch.zzar.zzd();
            zzaVarZzd.zzg(versionInfoParcel.buddyApkVersion);
            zzaVarZzd.zzi(versionInfoParcel.clientJarVersion);
            zzaVarZzd.zzh(true == versionInfoParcel.isClientJar ? 0 : 2);
            final zzbch.zzar zzarVarZzbr = zzaVarZzd.zzbr();
            zzbcaVar.zzb(new zzbbz() { // from class: com.google.android.gms.internal.ads.zzebe
                @Override // com.google.android.gms.internal.ads.zzbbz
                public final void zza(zzbch.zzt.zza zzaVar2) {
                    zzbch.zzm.zza zzaVarZzbM = zzaVar2.zzg().zzbM();
                    zzaVarZzbM.zzw(zzarVarZzbr);
                    zzaVar2.zzK(zzaVarZzbM);
                }
            });
            zzbcaVar.zzc(10004);
            zzeaz.zze(sQLiteDatabase);
        }
        return null;
    }

    public final void zzb(final boolean z10) {
        try {
            this.zzc.zza(new zzffw() { // from class: com.google.android.gms.internal.ads.zzebc
                @Override // com.google.android.gms.internal.ads.zzffw
                public final Object zza(Object obj) {
                    zzebf.zza(this.zza, z10, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e4) {
            String strValueOf = String.valueOf(e4.getMessage());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in offline signals database startup: ".concat(strValueOf));
        }
    }
}
