package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfpm {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfpm(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfpn.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfpn.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb = new StringBuilder("FBAMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    private final String zzf() {
        StringBuilder sb = new StringBuilder("LATMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzayn r9, com.google.android.gms.internal.ads.zzfps r10) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfpm.zza(com.google.android.gms.internal.ads.zzayn, com.google.android.gms.internal.ads.zzfps):boolean");
    }

    public final zzayq zzb(int i) throws IllegalArgumentException {
        String string = i == 1 ? this.zzc.getString(zzf(), null) : this.zzc.getString(zze(), null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrStringToBytes = Hex.stringToBytes(string);
            zzgxn zzgxnVar = zzgxn.zzb;
            zzayq zzayqVarZzh = zzayq.zzh(zzgxn.zzv(bArrStringToBytes, 0, bArrStringToBytes.length));
            String strZzk = zzayqVarZzh.zzk();
            File fileZzb = zzfpn.zzb(strZzk, "pcam.jar", zzd());
            if (!fileZzb.exists()) {
                fileZzb = zzfpn.zzb(strZzk, "pcam", zzd());
            }
            File fileZzb2 = zzfpn.zzb(strZzk, "pcbc", zzd());
            if (fileZzb.exists()) {
                if (fileZzb2.exists()) {
                    return zzayqVarZzh;
                }
            }
        } catch (zzgzk unused) {
        }
        return null;
    }

    public final zzfpl zzc(int i) throws IllegalArgumentException {
        zzayq zzayqVarZzb = zzb(1);
        if (zzayqVarZzb == null) {
            return null;
        }
        String strZzk = zzayqVarZzb.zzk();
        File fileZzb = zzfpn.zzb(strZzk, "pcam.jar", zzd());
        if (!fileZzb.exists()) {
            fileZzb = zzfpn.zzb(strZzk, "pcam", zzd());
        }
        return new zzfpl(zzayqVarZzb, fileZzb, zzfpn.zzb(strZzk, "pcbc", zzd()), zzfpn.zzb(strZzk, "pcopt", zzd()));
    }
}
