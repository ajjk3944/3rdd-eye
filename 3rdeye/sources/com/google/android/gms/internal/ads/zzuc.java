package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
@SuppressLint({"InlinedApi"})
/* loaded from: classes2.dex */
public final class zzuc {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzti zza() throws zztw {
        List listZzd = zzd("audio/raw", false, false);
        if (listZzd.isEmpty()) {
            return null;
        }
        return (zzti) listZzd.get(0);
    }

    public static String zzb(zzz zzzVar) {
        Pair pairZza;
        String str = zzzVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairZza = zzdk.zza(zzzVar)) != null) {
            int iIntValue = ((Integer) pairZza.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static List zzc(zztr zztrVar, zzz zzzVar, boolean z10, boolean z11) throws zztw {
        String strZzb = zzb(zzzVar);
        return strZzb == null ? zzfyf.zzn() : zztrVar.zza(strZzb, z10, z11);
    }

    public static synchronized List zzd(String str, boolean z10, boolean z11) throws zztw {
        try {
            zztv zztvVar = new zztv(str, z10, z11);
            HashMap map = zzb;
            List list = (List) map.get(zztvVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListZzg = zzg(zztvVar, new zztz(z10, z11, str.equals("video/mv-hevc")));
            if (z10 && arrayListZzg.isEmpty() && Build.VERSION.SDK_INT <= 23) {
                arrayListZzg = zzg(zztvVar, new zzty(null));
                if (!arrayListZzg.isEmpty()) {
                    zzea.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzti) arrayListZzg.get(0)).zza);
                }
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListZzg.size() == 1 && ((zzti) arrayListZzg.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListZzg.add(zzti.zzd("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzh(arrayListZzg, new zzua() { // from class: com.google.android.gms.internal.ads.zztt
                    @Override // com.google.android.gms.internal.ads.zzua
                    public final int zza(Object obj) {
                        int i = zzuc.zza;
                        String str2 = ((zzti) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (Build.VERSION.SDK_INT >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListZzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzti) arrayListZzg.get(0)).zza)) {
                arrayListZzg.add((zzti) arrayListZzg.remove(0));
            }
            zzfyf zzfyfVarZzl = zzfyf.zzl(arrayListZzg);
            map.put(zztvVar, zzfyfVarZzl);
            return zzfyfVarZzl;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static List zze(zztr zztrVar, zzz zzzVar, boolean z10, boolean z11) throws zztw {
        List listZza = zztrVar.zza(zzzVar.zzo, z10, z11);
        List listZzc = zzc(zztrVar, zzzVar, z10, z11);
        int i = zzfyf.zzd;
        zzfyc zzfycVar = new zzfyc();
        zzfycVar.zzh(listZza);
        zzfycVar.zzh(listZzc);
        return zzfycVar.zzi();
    }

    public static List zzf(List list, final zzz zzzVar) {
        ArrayList arrayList = new ArrayList(list);
        zzh(arrayList, new zzua() { // from class: com.google.android.gms.internal.ads.zztu
            @Override // com.google.android.gms.internal.ads.zzua
            public final int zza(Object obj) {
                int i = zzuc.zza;
                return ((zzti) obj).zze(zzzVar) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x018a A[Catch: Exception -> 0x0191, TryCatch #4 {Exception -> 0x0191, blocks: (B:92:0x015a, B:98:0x0171, B:104:0x0184, B:106:0x018a, B:110:0x019c), top: B:166:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x019c A[Catch: Exception -> 0x0191, TRY_LEAVE, TryCatch #4 {Exception -> 0x0191, blocks: (B:92:0x015a, B:98:0x0171, B:104:0x0184, B:106:0x018a, B:110:0x019c), top: B:166:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b2 A[Catch: Exception -> 0x01b7, TryCatch #1 {Exception -> 0x01b7, blocks: (B:115:0x01a8, B:117:0x01b2, B:120:0x01bc, B:122:0x01cc, B:124:0x01d4), top: B:160:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bc A[Catch: Exception -> 0x01b7, TryCatch #1 {Exception -> 0x01b7, blocks: (B:115:0x01a8, B:117:0x01b2, B:120:0x01bc, B:122:0x01cc, B:124:0x01d4), top: B:160:0x01a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x022d A[Catch: Exception -> 0x0034, TRY_ENTER, TryCatch #3 {Exception -> 0x0034, blocks: (B:3:0x0008, B:5:0x001d, B:7:0x0027, B:13:0x0037, B:17:0x0045, B:23:0x0055, B:25:0x005d, B:27:0x0065, B:29:0x006f, B:31:0x0079, B:33:0x0081, B:35:0x0089, B:37:0x0091, B:39:0x0099, B:41:0x00a1, B:43:0x00a9, B:47:0x00b5, B:49:0x00bd, B:51:0x00c5, B:53:0x00ce, B:146:0x0227, B:149:0x022d, B:151:0x0233, B:152:0x024f, B:153:0x0272, B:56:0x00d8, B:57:0x00db, B:59:0x00e3, B:62:0x00ef, B:64:0x00f7, B:69:0x0105, B:71:0x010d, B:73:0x0115, B:76:0x0120, B:78:0x0128, B:81:0x0133, B:83:0x013b, B:86:0x0146, B:88:0x014e), top: B:164:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x024f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzg(com.google.android.gms.internal.ads.zztv r22, com.google.android.gms.internal.ads.zztx r23) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuc.zzg(com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zztx):java.util.ArrayList");
    }

    private static void zzh(List list, final zzua zzuaVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzts
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zzuc.zza;
                zzua zzuaVar2 = zzuaVar;
                return zzuaVar2.zza(obj2) - zzuaVar2.zza(obj);
            }
        });
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzay.zzh(str)) {
            return true;
        }
        String strZza = zzfuk.zza(mediaCodecInfo.getName());
        if (strZza.startsWith("arc.")) {
            return false;
        }
        if (strZza.startsWith("omx.google.") || strZza.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strZza.startsWith("omx.sec.") && strZza.contains(".sw.")) || strZza.equals("omx.qcom.video.decoder.hevcswvdec") || strZza.startsWith("c2.android.") || strZza.startsWith("c2.google.")) {
            return true;
        }
        return (strZza.startsWith("omx.") || strZza.startsWith("c2.")) ? false : true;
    }
}
