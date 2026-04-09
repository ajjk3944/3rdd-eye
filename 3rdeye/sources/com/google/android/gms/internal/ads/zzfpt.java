package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.util.Hex;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfpt {
    private static final Object zza = new Object();
    private final Context zzb;
    private final SharedPreferences zzc;
    private final String zzd;
    private final zzfpa zze;
    private boolean zzf;

    public zzfpt(Context context, int i, zzfpa zzfpaVar, boolean z10) {
        this.zzf = false;
        this.zzb = context;
        this.zzd = Integer.toString(i - 1);
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        this.zze = zzfpaVar;
        this.zzf = z10;
    }

    private final File zze(String str) {
        return new File(new File(this.zzb.getDir("pccache", 0), this.zzd), str);
    }

    private static String zzf(zzayn zzaynVar) {
        zzayo zzayoVarZzd = zzayq.zzd();
        zzayoVarZzd.zze(zzaynVar.zzc().zzk());
        zzayoVarZzd.zza(zzaynVar.zzc().zzj());
        zzayoVarZzd.zzb(zzaynVar.zzc().zza());
        zzayoVarZzd.zzd(zzaynVar.zzc().zzc());
        zzayoVarZzd.zzc(zzaynVar.zzc().zzb());
        return Hex.bytesToStringLowercase(((zzayq) zzayoVarZzd.zzbr()).zzaV());
    }

    private final String zzg() {
        return "FBAMTD".concat(String.valueOf(this.zzd));
    }

    private final String zzh() {
        return "LATMTD".concat(String.valueOf(this.zzd));
    }

    private final void zzi(int i, long j4) {
        this.zze.zza(i, j4);
    }

    private final void zzj(int i, long j4, String str) {
        this.zze.zzb(i, j4, str);
    }

    private final zzayq zzk(int i) {
        String string = i == 1 ? this.zzc.getString(zzh(), null) : this.zzc.getString(zzg(), null);
        if (string == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgxn zzgxnVar = zzgxn.zzb;
            return zzayq.zzi(zzgxn.zzv(bArrStringToBytes, 0, bArrStringToBytes.length), this.zzf ? zzgyf.zza() : zzgyf.zzb());
        } catch (zzgzk unused) {
            return null;
        } catch (NullPointerException unused2) {
            zzi(2029, jCurrentTimeMillis);
            return null;
        } catch (RuntimeException unused3) {
            zzi(2032, jCurrentTimeMillis);
            return null;
        }
    }

    public final boolean zza(zzayn zzaynVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                if (!zzfpn.zze(new File(zze(zzaynVar.zzc().zzk()), "pcbc"), zzaynVar.zzd().zzA())) {
                    zzi(4020, jCurrentTimeMillis);
                    return false;
                }
                String strZzf = zzf(zzaynVar);
                SharedPreferences.Editor editorEdit = this.zzc.edit();
                editorEdit.putString(zzh(), strZzf);
                boolean zCommit = editorEdit.commit();
                if (zCommit) {
                    zzi(5015, jCurrentTimeMillis);
                } else {
                    zzi(4021, jCurrentTimeMillis);
                }
                return zCommit;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzb(zzayn zzaynVar, zzfps zzfpsVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzayq zzayqVarZzk = zzk(1);
                String strZzk = zzaynVar.zzc().zzk();
                if (zzayqVarZzk != null && zzayqVarZzk.zzk().equals(strZzk)) {
                    zzi(4014, jCurrentTimeMillis);
                    return false;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                File fileZze = zze(strZzk);
                if (fileZze.exists()) {
                    zzj(4023, jCurrentTimeMillis2, "d:" + (true != fileZze.isDirectory() ? CommonUrlParts.Values.FALSE_INTEGER : "1") + ",f:" + (true != fileZze.isFile() ? CommonUrlParts.Values.FALSE_INTEGER : "1"));
                    zzi(4015, jCurrentTimeMillis2);
                } else if (!fileZze.mkdirs()) {
                    zzj(4024, jCurrentTimeMillis2, "cw:".concat(true != fileZze.canWrite() ? CommonUrlParts.Values.FALSE_INTEGER : "1"));
                    zzi(4015, jCurrentTimeMillis2);
                    return false;
                }
                File fileZze2 = zze(strZzk);
                File file = new File(fileZze2, "pcam.jar");
                File file2 = new File(fileZze2, "pcbc");
                if (!zzfpn.zze(file, zzaynVar.zzf().zzA())) {
                    zzi(4016, jCurrentTimeMillis);
                    return false;
                }
                if (!zzfpn.zze(file2, zzaynVar.zzd().zzA())) {
                    zzi(4017, jCurrentTimeMillis);
                    return false;
                }
                if (zzfpsVar != null && !zzfpsVar.zza(file)) {
                    zzi(4018, jCurrentTimeMillis);
                    zzfpn.zzd(fileZze2);
                    return false;
                }
                String strZzf = zzf(zzaynVar);
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                SharedPreferences sharedPreferences = this.zzc;
                String string = sharedPreferences.getString(zzh(), null);
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(zzh(), strZzf);
                if (string != null) {
                    editorEdit.putString(zzg(), string);
                }
                if (!editorEdit.commit()) {
                    zzi(4019, jCurrentTimeMillis3);
                    return false;
                }
                HashSet hashSet = new HashSet();
                zzayq zzayqVarZzk2 = zzk(1);
                if (zzayqVarZzk2 != null) {
                    hashSet.add(zzayqVarZzk2.zzk());
                }
                zzayq zzayqVarZzk3 = zzk(2);
                if (zzayqVarZzk3 != null) {
                    hashSet.add(zzayqVarZzk3.zzk());
                }
                for (File file3 : new File(this.zzb.getDir("pccache", 0), this.zzd).listFiles()) {
                    if (!hashSet.contains(file3.getName())) {
                        zzfpn.zzd(file3);
                    }
                }
                zzi(5014, jCurrentTimeMillis);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzfpl zzc(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzayq zzayqVarZzk = zzk(1);
                if (zzayqVarZzk == null) {
                    zzi(4022, jCurrentTimeMillis);
                    return null;
                }
                File fileZze = zze(zzayqVarZzk.zzk());
                File file = new File(fileZze, "pcam.jar");
                if (!file.exists()) {
                    file = new File(fileZze, "pcam");
                }
                File file2 = new File(fileZze, "pcbc");
                File file3 = new File(fileZze, "pcopt");
                zzi(5016, jCurrentTimeMillis);
                return new zzfpl(zzayqVarZzk, file, file2, file3);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzd(int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (zza) {
            try {
                zzayq zzayqVarZzk = zzk(1);
                if (zzayqVarZzk == null) {
                    zzi(4025, jCurrentTimeMillis);
                    return false;
                }
                File fileZze = zze(zzayqVarZzk.zzk());
                if (!new File(fileZze, "pcam.jar").exists()) {
                    zzi(4026, jCurrentTimeMillis);
                    return false;
                }
                if (new File(fileZze, "pcbc").exists()) {
                    zzi(5019, jCurrentTimeMillis);
                    return true;
                }
                zzi(4027, jCurrentTimeMillis);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
