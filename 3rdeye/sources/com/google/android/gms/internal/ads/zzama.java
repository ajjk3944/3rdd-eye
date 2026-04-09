package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzama {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzen zzc = new zzen();
    private final StringBuilder zzd = new StringBuilder();

    public static String zza(zzen zzenVar, StringBuilder sb) {
        zzc(zzenVar);
        if (zzenVar.zza() == 0) {
            return null;
        }
        String strZzd = zzd(zzenVar, sb);
        if (!"".equals(strZzd)) {
            return strZzd;
        }
        char cZzm = (char) zzenVar.zzm();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(cZzm);
        return sb2.toString();
    }

    public static void zzc(zzen zzenVar) {
        while (true) {
            for (boolean z10 = true; zzenVar.zza() > 0 && z10; z10 = false) {
                char c10 = (char) zzenVar.zzN()[zzenVar.zzc()];
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    zzenVar.zzM(1);
                } else {
                    int iZzc = zzenVar.zzc();
                    int iZzd = zzenVar.zzd();
                    byte[] bArrZzN = zzenVar.zzN();
                    if (iZzc + 2 <= iZzd) {
                        int i = iZzc + 1;
                        if (bArrZzN[iZzc] == 47) {
                            int i10 = iZzc + 2;
                            if (bArrZzN[i] == 42) {
                                while (true) {
                                    int i11 = i10 + 1;
                                    if (i11 >= iZzd) {
                                        break;
                                    }
                                    if (((char) bArrZzN[i10]) == '*' && ((char) bArrZzN[i11]) == '/') {
                                        iZzd = i10 + 2;
                                        i10 = iZzd;
                                    } else {
                                        i10 = i11;
                                    }
                                }
                                zzenVar.zzM(iZzd - zzenVar.zzc());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    private static String zzd(zzen zzenVar, StringBuilder sb) {
        boolean z10;
        char c10;
        sb.setLength(0);
        int iZzc = zzenVar.zzc();
        int iZzd = zzenVar.zzd();
        loop0: while (true) {
            for (false; iZzc < iZzd && !z10; true) {
                c10 = (char) zzenVar.zzN()[iZzc];
                z10 = (c10 < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_');
            }
            sb.append(c10);
            iZzc++;
        }
        zzenVar.zzM(iZzc - zzenVar.zzc());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x0301, code lost:
    
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzen r18) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzama.zzb(com.google.android.gms.internal.ads.zzen):java.util.List");
    }
}
