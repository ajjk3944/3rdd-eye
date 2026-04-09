package l5;

import a5.d0;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.j0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import oe.h0;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f14773a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f14774b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f14775c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (d0.f105a < 26 && d0.f106b.equals("R9") && arrayList.size() == 1 && ((n) arrayList.get(0)).f14723a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(n.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
            }
            Collections.sort(arrayList, new e2.t(1, new s(1)));
        }
        int i10 = d0.f105a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((n) arrayList.get(0)).f14723a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new e2.t(1, new s(2)));
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((n) arrayList.get(0)).f14723a)) {
            return;
        }
        arrayList.add((n) arrayList.remove(0));
    }

    public static String b(androidx.media3.common.r rVar) {
        Pair pairD;
        if ("audio/eac3-joc".equals(rVar.H)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(rVar.H) || (pairD = d(rVar)) == null) {
            return null;
        }
        int iIntValue = ((Integer) pairD.first).intValue();
        if (iIntValue == 16 || iIntValue == 256) {
            return "video/hevc";
        }
        if (iIntValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0378 A[PHI: r2
  0x0378: PHI (r2v55 int) = (r2v54 int), (r2v57 int), (r2v58 int), (r2v59 int), (r2v60 int) binds: [B:258:0x0351, B:261:0x0357, B:263:0x035b, B:265:0x035f, B:267:0x0363] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x037c A[Catch: NumberFormatException -> 0x038a, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x038a, blocks: (B:255:0x0333, B:257:0x0347, B:268:0x0365, B:279:0x037c), top: B:576:0x0333 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0150  */
    /* JADX WARN: Type inference failed for: r1v165 */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v169 */
    /* JADX WARN: Type inference failed for: r1v171 */
    /* JADX WARN: Type inference failed for: r1v174 */
    /* JADX WARN: Type inference failed for: r1v177 */
    /* JADX WARN: Type inference failed for: r1v180 */
    /* JADX WARN: Type inference failed for: r1v183 */
    /* JADX WARN: Type inference failed for: r1v186 */
    /* JADX WARN: Type inference failed for: r1v189 */
    /* JADX WARN: Type inference failed for: r1v192 */
    /* JADX WARN: Type inference failed for: r1v195 */
    /* JADX WARN: Type inference failed for: r1v198 */
    /* JADX WARN: Type inference failed for: r1v199 */
    /* JADX WARN: Type inference failed for: r1v200 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair d(androidx.media3.common.r r34) {
        /*
            Method dump skipped, instructions count: 2374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l5.z.d(androidx.media3.common.r):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z10, boolean z11) {
        try {
            u uVar = new u(str, z10, z11);
            HashMap map = f14774b;
            List list = (List) map.get(uVar);
            if (list != null) {
                return list;
            }
            int i10 = d0.f105a;
            ArrayList arrayListF = f(uVar, i10 >= 21 ? new x(0, z10, z11) : new sm.f(14));
            if (z10 && arrayListF.isEmpty() && 21 <= i10 && i10 <= 23) {
                arrayListF = f(uVar, new sm.f(14));
                if (!arrayListF.isEmpty()) {
                    a5.a.B("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((n) arrayListF.get(0)).f14723a);
                }
            }
            a(str, arrayListF);
            h0 h0VarL = h0.l(arrayListF);
            map.put(uVar, h0VarL);
            return h0VarL;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static ArrayList f(u uVar, w wVar) throws Exception {
        String strC;
        String str;
        String str2;
        u uVar2 = uVar;
        boolean z10 = uVar2.f14768b;
        try {
            ArrayList arrayList = new ArrayList();
            String str3 = uVar2.f14767a;
            int iD = wVar.d();
            boolean zE = wVar.e();
            int i10 = 0;
            while (i10 < iD) {
                MediaCodecInfo mediaCodecInfoA = wVar.a(i10);
                int i11 = d0.f105a;
                if (i11 < 29 || !mediaCodecInfoA.isAlias()) {
                    String name = mediaCodecInfoA.getName();
                    if (g(mediaCodecInfoA, name, zE, str3) && (strC = c(mediaCodecInfoA, name, str3)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(strC);
                            boolean zB = wVar.b("tunneled-playback", strC, capabilitiesForType);
                            boolean zC = wVar.c("tunneled-playback", capabilitiesForType);
                            boolean z11 = uVar2.f14769c;
                            if ((z11 || !zC) && (!z11 || zB)) {
                                boolean zB2 = wVar.b("secure-playback", strC, capabilitiesForType);
                                boolean zC2 = wVar.c("secure-playback", capabilitiesForType);
                                if ((z10 || !zC2) && (!z10 || zB2)) {
                                    boolean zIsHardwareAccelerated = i11 >= 29 ? mediaCodecInfoA.isHardwareAccelerated() : !h(mediaCodecInfoA, str3);
                                    h(mediaCodecInfoA, str3);
                                    if (i11 >= 29) {
                                        mediaCodecInfoA.isVendor();
                                    } else {
                                        String strA0 = xu.l.a0(mediaCodecInfoA.getName());
                                        if (!strA0.startsWith("omx.google.") && !strA0.startsWith("c2.android.")) {
                                            strA0.startsWith("c2.google.");
                                        }
                                    }
                                    if (!(zE && z10 == zB2) && (zE || z10)) {
                                        boolean z12 = zIsHardwareAccelerated;
                                        str2 = name;
                                        if (!zE && zB2) {
                                            str = strC;
                                            try {
                                                arrayList.add(n.h(str2 + ".secure", str3, str, capabilitiesForType, z12, true));
                                                break;
                                            } catch (Exception e4) {
                                                e = e4;
                                                if (d0.f105a <= 23 || arrayList.isEmpty()) {
                                                    a5.a.m("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                                a5.a.m("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                                i10++;
                                                uVar2 = uVar;
                                            }
                                        }
                                    } else {
                                        str = strC;
                                        try {
                                            n nVarH = n.h(name, str3, str, capabilitiesForType, zIsHardwareAccelerated, false);
                                            str2 = name;
                                            try {
                                                arrayList.add(nVarH);
                                            } catch (Exception e10) {
                                                e = e10;
                                                str = str;
                                                if (d0.f105a <= 23) {
                                                }
                                                a5.a.m("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            str2 = name;
                                        }
                                    }
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            str = strC;
                            str2 = name;
                        }
                    }
                }
                i10++;
                uVar2 = uVar;
            }
            return arrayList;
        } catch (Exception e13) {
            throw new v("Failed to query underlying media codecs", e13);
        }
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z10 && str.endsWith(".secure")) {
            return false;
        }
        int i10 = d0.f105a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = d0.f106b;
            if ("a70".equals(str3)) {
                return false;
            }
            if ("Xiaomi".equals(d0.f107c) && str3.startsWith("HM")) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = d0.f106b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = d0.f106b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(d0.f107c))) {
            String str6 = d0.f106b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(d0.f107c)) {
            String str7 = d0.f106b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && d0.f106b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return (i10 <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        if (d0.f105a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (j0.h(str)) {
            return true;
        }
        String strA0 = xu.l.a0(mediaCodecInfo.getName());
        if (strA0.startsWith("arc.")) {
            return false;
        }
        if (strA0.startsWith("omx.google.") || strA0.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strA0.startsWith("omx.sec.") && strA0.contains(".sw.")) || strA0.equals("omx.qcom.video.decoder.hevcswvdec") || strA0.startsWith("c2.android.") || strA0.startsWith("c2.google.")) {
            return true;
        }
        return (strA0.startsWith("omx.") || strA0.startsWith("c2.")) ? false : true;
    }

    public static int i() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f14775c == -1) {
            int iMax = 0;
            List listE = e("video/avc", false, false);
            n nVar = listE.isEmpty() ? null : (n) listE.get(0);
            if (nVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f14726d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int iMax2 = 0;
                while (iMax < length) {
                    int i11 = codecProfileLevelArr[iMax].level;
                    if (i11 != 1 && i11 != 2) {
                        switch (i11) {
                            case g4.j.BYTES_FIELD_NUMBER /* 8 */:
                            case 16:
                            case 32:
                                i10 = 101376;
                                break;
                            case 64:
                                i10 = 202752;
                                break;
                            case 128:
                            case 256:
                                i10 = 414720;
                                break;
                            case 512:
                                i10 = 921600;
                                break;
                            case 1024:
                                i10 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i10 = 2097152;
                                break;
                            case 8192:
                                i10 = 2228224;
                                break;
                            case 16384:
                                i10 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i10 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i10 = 35651584;
                                break;
                            default:
                                i10 = -1;
                                break;
                        }
                    } else {
                        i10 = 25344;
                    }
                    iMax2 = Math.max(i10, iMax2);
                    iMax++;
                }
                iMax = Math.max(iMax2, d0.f105a >= 21 ? 345600 : 172800);
            }
            f14775c = iMax;
        }
        return f14775c;
    }
}
