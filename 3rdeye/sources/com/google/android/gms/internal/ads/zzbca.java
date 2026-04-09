package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbch;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzbca {
    private final zzbcg zza;
    private final zzbch.zzt.zza zzb;
    private final boolean zzc;

    private zzbca() {
        this.zzb = zzbch.zzt.zzj();
        this.zzc = false;
        this.zza = new zzbcg();
    }

    public static zzbca zza() {
        return new zzbca();
    }

    private final synchronized String zzd(int i) {
        StringBuilder sb;
        zzbch.zzt.zza zzaVar = this.zzb;
        String strZzah = zzaVar.zzah();
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzD().elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(zzaVar.zzbr().zzaV(), 3);
        sb = new StringBuilder("id=");
        sb.append(strZzah);
        sb.append(",timestamp=");
        sb.append(jElapsedRealtime);
        sb.append(",event=");
        sb.append(i - 1);
        sb.append(",data=");
        sb.append(strEncodeToString);
        sb.append("\n");
        return sb.toString();
    }

    private final synchronized void zze(int i) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzfqk.zza(zzfqj.zza(), externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzd(i).getBytes());
                } finally {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } catch (IOException unused2) {
                com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized void zzf(int i) {
        zzbch.zzt.zza zzaVar = this.zzb;
        zzaVar.zzq();
        zzaVar.zzj(com.google.android.gms.ads.internal.util.zzs.zzd());
        zzbce zzbceVar = new zzbce(this.zza, zzaVar.zzbr().zzaV(), null);
        int i10 = i - 1;
        zzbceVar.zza(i10);
        zzbceVar.zzc();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i10, 10))));
    }

    public final synchronized void zzb(zzbbz zzbbzVar) {
        if (this.zzc) {
            try {
                zzbbzVar.zza(this.zzb);
            } catch (NullPointerException e4) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e4, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfp)).booleanValue()) {
                zze(i);
            } else {
                zzf(i);
            }
        }
    }

    public zzbca(zzbcg zzbcgVar) {
        this.zzb = zzbch.zzt.zzj();
        this.zza = zzbcgVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbdc.zzfo)).booleanValue();
    }
}
