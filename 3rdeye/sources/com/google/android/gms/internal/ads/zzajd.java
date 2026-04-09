package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzajd {
    /* JADX WARN: Removed duplicated region for block: B:127:0x0263 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:9:0x003b, B:11:0x0046, B:14:0x0055, B:17:0x0061, B:20:0x006e, B:23:0x007d, B:26:0x008a, B:29:0x009b, B:31:0x00a5, B:39:0x00c3, B:40:0x00d4, B:41:0x00e7, B:44:0x00f3, B:47:0x0100, B:50:0x010d, B:53:0x011a, B:56:0x0127, B:59:0x0134, B:62:0x0141, B:64:0x014b, B:66:0x0155, B:68:0x015f, B:72:0x0170, B:74:0x0176, B:76:0x018a, B:77:0x0191, B:79:0x0198, B:84:0x01a3, B:89:0x01af, B:127:0x0263, B:90:0x01c4, B:92:0x01cb, B:94:0x01d5, B:95:0x01e9, B:108:0x0215, B:111:0x0222, B:114:0x022e, B:117:0x023a, B:120:0x0246, B:123:0x0252, B:126:0x025c, B:128:0x0277, B:129:0x027e), top: B:134:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzau zza(com.google.android.gms.internal.ads.zzen r18) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajd.zza(com.google.android.gms.internal.ads.zzen):com.google.android.gms.internal.ads.zzau");
    }

    private static int zzb(zzen zzenVar) {
        int iZzg = zzenVar.zzg();
        if (zzenVar.zzg() == 1684108385) {
            zzenVar.zzM(8);
            int i = iZzg - 16;
            if (i == 1) {
                return zzenVar.zzm();
            }
            if (i == 2) {
                return zzenVar.zzq();
            }
            if (i == 3) {
                return zzenVar.zzo();
            }
            if (i == 4 && (zzenVar.zzf() & 128) == 0) {
                return zzenVar.zzp();
            }
        }
        zzea.zzf("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static zzahd zzc(int i, String str, zzen zzenVar, boolean z10, boolean z11) {
        int iZzb = zzb(zzenVar);
        if (z11) {
            iZzb = Math.min(1, iZzb);
        }
        if (iZzb >= 0) {
            return z10 ? new zzahi(str, null, zzfyf.zzo(Integer.toString(iZzb))) : new zzagy("und", str, Integer.toString(iZzb));
        }
        zzea.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzff.zze(i)));
        return null;
    }

    private static zzahi zzd(int i, String str, zzen zzenVar) {
        int iZzg = zzenVar.zzg();
        if (zzenVar.zzg() == 1684108385 && iZzg >= 22) {
            zzenVar.zzM(10);
            int iZzq = zzenVar.zzq();
            if (iZzq > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(iZzq);
                String string = sb.toString();
                int iZzq2 = zzenVar.zzq();
                if (iZzq2 > 0) {
                    string = string + "/" + iZzq2;
                }
                return new zzahi(str, null, zzfyf.zzo(string));
            }
        }
        zzea.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzff.zze(i)));
        return null;
    }

    private static zzahi zze(int i, String str, zzen zzenVar) {
        int iZzg = zzenVar.zzg();
        if (zzenVar.zzg() == 1684108385) {
            zzenVar.zzM(8);
            return new zzahi(str, null, zzfyf.zzo(zzenVar.zzA(iZzg - 16)));
        }
        zzea.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzff.zze(i)));
        return null;
    }
}
