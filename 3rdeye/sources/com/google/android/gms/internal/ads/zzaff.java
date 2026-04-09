package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaff {
    public static int zza(int i) {
        int i10 = 0;
        while (i > 0) {
            i >>>= 1;
            i10++;
        }
        return i10;
    }

    public static zzav zzb(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = (String) list.get(i);
            String str2 = zzex.zza;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                zzea.zzf("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (strArrSplit[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(zzagr.zzb(new zzen(Base64.decode(strArrSplit[1], 0))));
                } catch (RuntimeException e4) {
                    zzea.zzg("VorbisUtil", "Failed to parse vorbis picture", e4);
                }
            } else {
                arrayList.add(new zzaho(strArrSplit[0], strArrSplit[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzav(arrayList);
    }

    public static zzafc zzc(zzen zzenVar, boolean z10, boolean z11) throws zzaz {
        if (z10) {
            zzd(3, zzenVar, false);
        }
        String strZzB = zzenVar.zzB((int) zzenVar.zzs(), StandardCharsets.UTF_8);
        int length = strZzB.length();
        long jZzs = zzenVar.zzs();
        String[] strArr = new String[(int) jZzs];
        int length2 = length + 15;
        for (int i = 0; i < jZzs; i++) {
            String strZzB2 = zzenVar.zzB((int) zzenVar.zzs(), StandardCharsets.UTF_8);
            strArr[i] = strZzB2;
            length2 = length2 + 4 + strZzB2.length();
        }
        if (z11 && (zzenVar.zzm() & 1) == 0) {
            throw zzaz.zza("framing bit expected to be set", null);
        }
        return new zzafc(strZzB, strArr, length2 + 1);
    }

    public static boolean zzd(int i, zzen zzenVar, boolean z10) throws zzaz {
        if (zzenVar.zza() < 7) {
            if (z10) {
                return false;
            }
            throw zzaz.zza("too short header: " + zzenVar.zza(), null);
        }
        if (zzenVar.zzm() != i) {
            if (z10) {
                return false;
            }
            throw zzaz.zza("expected header type ".concat(String.valueOf(Integer.toHexString(i))), null);
        }
        if (zzenVar.zzm() == 118 && zzenVar.zzm() == 111 && zzenVar.zzm() == 114 && zzenVar.zzm() == 98 && zzenVar.zzm() == 105 && zzenVar.zzm() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw zzaz.zza("expected characters 'vorbis'", null);
    }
}
