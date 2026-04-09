package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes2.dex */
final class zzakq {
    public static void zza(int i10, @Nullable zzap zzapVar, zzt zztVar, @Nullable zzap zzapVar2, zzap... zzapVarArr) {
        if (zzapVar2 == null) {
            zzapVar2 = new zzap(C.TIME_UNSET, new zzao[0]);
        }
        if (zzapVar != null) {
            zzguf zzgufVarZzd = zzapVar.zzd(zzfs.class);
            int size = zzgufVarZzd.size();
            for (int i11 = 0; i11 < size; i11++) {
                zzfs zzfsVar = (zzfs) zzgufVarZzd.get(i11);
                if (!zzfsVar.zza.equals("com.android.capture.fps") || i10 == 2) {
                    zzapVar2 = zzapVar2.zzg(zzfsVar);
                }
            }
        }
        for (zzap zzapVar3 : zzapVarArr) {
            zzapVar2 = zzapVar2.zzf(zzapVar3);
        }
        if (zzapVar2.zza() > 0) {
            zztVar.zzk(zzapVar2);
        }
    }

    public static void zzb(int i10, zzafn zzafnVar, zzt zztVar) {
        if (i10 == 1 && zzafnVar.zzb()) {
            zztVar.zzH(zzafnVar.zza);
            zztVar.zzI(zzafnVar.zzb);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x0281 A[Catch: all -> 0x0047, TryCatch #0 {all -> 0x0047, blocks: (B:9:0x0030, B:11:0x003b, B:15:0x004a, B:18:0x0056, B:21:0x0063, B:24:0x0070, B:27:0x007d, B:30:0x008b, B:32:0x0097, B:40:0x00b2, B:41:0x00d0, B:42:0x00e2, B:45:0x00ee, B:48:0x00fb, B:51:0x0108, B:54:0x0115, B:57:0x0122, B:60:0x012f, B:63:0x013c, B:66:0x0149, B:69:0x0156, B:72:0x0163, B:76:0x0174, B:78:0x017a, B:80:0x018e, B:81:0x0195, B:83:0x019c, B:88:0x01a7, B:93:0x01b3, B:137:0x0281, B:94:0x01c8, B:96:0x01cf, B:98:0x01db, B:99:0x01ef, B:112:0x0219, B:115:0x0226, B:118:0x0233, B:121:0x0240, B:124:0x024c, B:127:0x0258, B:130:0x0262, B:133:0x026e, B:136:0x027a, B:138:0x029e, B:139:0x02a5), top: B:144:0x0022 }] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzao zzc(com.google.android.gms.internal.ads.zzer r15) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzakq.zzc(com.google.android.gms.internal.ads.zzer):com.google.android.gms.internal.ads.zzao");
    }

    @Nullable
    private static zzais zzd(int i10, String str, zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            return new zzais(str, null, zzguf.zzj(zzerVar.zzL(iZzB - 16)));
        }
        zzee.zzc("MetadataUtil", "Failed to parse text attribute: ".concat(zzfw.zze(i10)));
        return null;
    }

    @Nullable
    private static zzain zze(int i10, String str, zzer zzerVar, boolean z10, boolean z11) {
        int iZzf = zzf(zzerVar);
        if (z11) {
            iZzf = Math.min(1, iZzf);
        }
        if (iZzf >= 0) {
            return z10 ? new zzais(str, null, zzguf.zzj(Integer.toString(iZzf))) : new zzaih(C.LANGUAGE_UNDETERMINED, str, Integer.toString(iZzf));
        }
        zzee.zzc("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzfw.zze(i10)));
        return null;
    }

    private static int zzf(zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385) {
            zzerVar.zzk(8);
            int i10 = iZzB - 16;
            if (i10 == 1) {
                return zzerVar.zzs();
            }
            if (i10 == 2) {
                return zzerVar.zzt();
            }
            if (i10 == 3) {
                return zzerVar.zzx();
            }
            if (i10 == 4 && (zzerVar.zzn() & 128) == 0) {
                return zzerVar.zzH();
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    @Nullable
    private static zzais zzg(int i10, String str, zzer zzerVar) {
        int iZzB = zzerVar.zzB();
        if (zzerVar.zzB() == 1684108385 && iZzB >= 22) {
            zzerVar.zzk(10);
            int iZzt = zzerVar.zzt();
            if (iZzt > 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(iZzt).length());
                sb.append(iZzt);
                String string = sb.toString();
                int iZzt2 = zzerVar.zzt();
                if (iZzt2 > 0) {
                    StringBuilder sb2 = new StringBuilder(string.length() + 1 + String.valueOf(iZzt2).length());
                    sb2.append(string);
                    sb2.append("/");
                    sb2.append(iZzt2);
                    string = sb2.toString();
                }
                return new zzais(str, null, zzguf.zzj(string));
            }
        }
        zzee.zzc("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzfw.zze(i10)));
        return null;
    }
}
