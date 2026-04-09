package oa;

import android.media.MediaCodecInfo;
import e2.t;
import io.sentry.android.core.e0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import l5.x;
import qb.v;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f19211a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f19212b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static int f19213c = -1;

    public static void a(String str, ArrayList arrayList) {
        if ("audio/raw".equals(str)) {
            if (v.f20828a < 26 && v.f20829b.equals("R9") && arrayList.size() == 1 && ((c) arrayList.get(0)).f19169a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(c.g("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false));
            }
            Collections.sort(arrayList, new t(3, new f(1)));
        }
        int i10 = v.f20828a;
        if (i10 < 21 && arrayList.size() > 1) {
            String str2 = ((c) arrayList.get(0)).f19169a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new t(3, new f(2)));
            }
        }
        if (i10 >= 32 || arrayList.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((c) arrayList.get(0)).f19169a)) {
            return;
        }
        arrayList.add((c) arrayList.remove(0));
    }

    public static String b(MediaCodecInfo mediaCodecInfo, String str, String str2) {
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
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:173:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x041a A[PHI: r2
  0x041a: PHI (r2v136 int) = (r2v9 int), (r2v137 int), (r2v138 int), (r2v139 int), (r2v140 int) binds: [B:288:0x03f5, B:290:0x03f9, B:292:0x03fd, B:294:0x0401, B:296:0x0405] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair c(com.google.android.exoplayer2.Format r41) {
        /*
            Method dump skipped, instructions count: 2708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.k.c(com.google.android.exoplayer2.Format):android.util.Pair");
    }

    public static synchronized List d(String str, boolean z10, boolean z11) {
        try {
            g gVar = new g(str, z10, z11);
            HashMap map = f19212b;
            List list = (List) map.get(gVar);
            if (list != null) {
                return list;
            }
            int i10 = v.f20828a;
            ArrayList arrayListE = e(gVar, i10 >= 21 ? new x(1, z10, z11) : new l());
            if (z10 && arrayListE.isEmpty() && 21 <= i10 && i10 <= 23) {
                arrayListE = e(gVar, new l());
                if (!arrayListE.isEmpty()) {
                    String str2 = ((c) arrayListE.get(0)).f19169a;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb2.append("MediaCodecList API didn't list secure decoder for: ");
                    sb2.append(str);
                    sb2.append(". Assuming: ");
                    sb2.append(str2);
                    e0.p("MediaCodecUtil", sb2.toString());
                }
            }
            a(str, arrayListE);
            List listUnmodifiableList = Collections.unmodifiableList(arrayListE);
            map.put(gVar, listUnmodifiableList);
            return listUnmodifiableList;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static ArrayList e(g gVar, i iVar) throws Exception {
        String strB;
        boolean z10 = gVar.f19209b;
        try {
            ArrayList arrayList = new ArrayList();
            String str = gVar.f19208a;
            int iD = iVar.d();
            boolean zE = iVar.e();
            for (int i10 = 0; i10 < iD; i10++) {
                MediaCodecInfo mediaCodecInfoA = iVar.a(i10);
                int i11 = v.f20828a;
                if (i11 < 29 || !mediaCodecInfoA.isAlias()) {
                    String name = mediaCodecInfoA.getName();
                    if (f(mediaCodecInfoA, name, zE, str) && (strB = b(mediaCodecInfoA, name, str)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(strB);
                            boolean zB = iVar.b("tunneled-playback", strB, capabilitiesForType);
                            boolean zC = iVar.c("tunneled-playback", capabilitiesForType);
                            boolean z11 = gVar.f19210c;
                            if ((z11 || !zC) && (!z11 || zB)) {
                                boolean zB2 = iVar.b("secure-playback", strB, capabilitiesForType);
                                boolean zC2 = iVar.c("secure-playback", capabilitiesForType);
                                if ((z10 || !zC2) && (!z10 || zB2)) {
                                    if (i11 >= 29) {
                                        mediaCodecInfoA.isHardwareAccelerated();
                                    } else {
                                        g(mediaCodecInfoA);
                                    }
                                    g(mediaCodecInfoA);
                                    if (i11 >= 29) {
                                        mediaCodecInfoA.isVendor();
                                    } else {
                                        String strA0 = xu.l.a0(mediaCodecInfoA.getName());
                                        if (!strA0.startsWith("omx.google.") && !strA0.startsWith("c2.android.")) {
                                            strA0.startsWith("c2.google.");
                                        }
                                    }
                                    if ((!zE || z10 != zB2) && (zE || z10)) {
                                        if (!zE && zB2) {
                                            arrayList.add(c.g(String.valueOf(name).concat(".secure"), str, strB, capabilitiesForType, true));
                                            break;
                                        }
                                    } else {
                                        try {
                                            arrayList.add(c.g(name, str, strB, capabilitiesForType, false));
                                        } catch (Exception e4) {
                                            e = e4;
                                            if (v.f20828a > 23 || arrayList.isEmpty()) {
                                                StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 25 + strB.length());
                                                sb2.append("Failed to query codec ");
                                                sb2.append(name);
                                                sb2.append(" (");
                                                sb2.append(strB);
                                                sb2.append(")");
                                                e0.d("MediaCodecUtil", sb2.toString());
                                                throw e;
                                            }
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 46);
                                            sb3.append("Skipping codec ");
                                            sb3.append(name);
                                            sb3.append(" (failed to query capabilities)");
                                            e0.d("MediaCodecUtil", sb3.toString());
                                        }
                                    }
                                }
                            }
                        } catch (Exception e10) {
                            e = e10;
                        }
                    }
                }
            }
            return arrayList;
        } catch (Exception e11) {
            throw new h("Failed to query underlying media codecs", e11);
        }
    }

    public static boolean f(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        if (!z10 && str.endsWith(".secure")) {
            return false;
        }
        int i10 = v.f20828a;
        if (i10 < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i10 < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = v.f20829b;
            if ("a70".equals(str3)) {
                return false;
            }
            if ("Xiaomi".equals(v.f20830c) && str3.startsWith("HM")) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = v.f20829b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i10 == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = v.f20829b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i10 < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(v.f20830c))) {
            String str6 = v.f20829b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i10 <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(v.f20830c)) {
            String str7 = v.f20829b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i10 <= 19 && v.f20829b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo) {
        if (v.f20828a >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
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

    public static int h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i10;
        if (f19213c == -1) {
            int iMax = 0;
            List listD = d("video/avc", false, false);
            c cVar = listD.isEmpty() ? null : (c) listD.get(0);
            if (cVar != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = cVar.f19172d;
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
                iMax = Math.max(iMax2, v.f20828a >= 21 ? 345600 : 172800);
            }
            f19213c = iMax;
        }
        return f19213c;
    }
}
