package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class WP {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f12225a = new HashMap();

    public static synchronized List a(String str, boolean z6, boolean z7) {
        try {
            QP qp = new QP(str, z6, z7);
            HashMap map = f12225a;
            List list = (List) map.get(qp);
            if (list != null) {
                return list;
            }
            ArrayList arrayListE = e(qp, new L2.w(z6, z7, str.equals("video/mv-hevc")));
            if (z6 && arrayListE.isEmpty() && Build.VERSION.SDK_INT == 23) {
                arrayListE = e(qp, new EO(9));
                if (!arrayListE.isEmpty()) {
                    String str2 = ((LP) arrayListE.get(0)).f9690a;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + str2.length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    AbstractC2022vd.v("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && arrayListE.size() == 1 && ((LP) arrayListE.get(0)).f9690a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    arrayListE.add(LP.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
                }
                Collections.sort(arrayListE, new UP(EO.i));
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListE.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((LP) arrayListE.get(0)).f9690a)) {
                arrayListE.add((LP) arrayListE.remove(0));
            }
            LB lbM = LB.m(arrayListE);
            map.put(qp, lbM);
            return lbM;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static C1197gC b(EO eo, TP tp, boolean z6, boolean z7) {
        Iterable iterableA;
        String str = tp.f11397m;
        eo.getClass();
        List listA = a(str, z6, z7);
        String strD = d(tp);
        if (strD == null) {
            iterableA = C1197gC.f14227e;
        } else {
            eo.getClass();
            iterableA = a(strD, z6, z7);
        }
        JB jb = LB.f9635b;
        IB ib = new IB(4);
        ib.b(listA);
        ib.b(iterableA);
        return ib.f();
    }

    public static MediaCodecInfo.CodecProfileLevel c(int i, int i3) {
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = i;
        codecProfileLevel.level = i3;
        return codecProfileLevel;
    }

    public static String d(TP tp) {
        Pair pairB;
        String str = tp.f11397m;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairB = AbstractC1224gm.b(tp)) != null) {
            int iIntValue = ((Integer) pairB.first).intValue();
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

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c0 A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:111:0x01b5, B:118:0x01cb, B:120:0x01d4, B:121:0x01d8, B:123:0x01e8, B:125:0x01f0, B:114:0x01c0), top: B:163:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d4 A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:111:0x01b5, B:118:0x01cb, B:120:0x01d4, B:121:0x01d8, B:123:0x01e8, B:125:0x01f0, B:114:0x01c0), top: B:163:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01d8 A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:111:0x01b5, B:118:0x01cb, B:120:0x01d4, B:121:0x01d8, B:123:0x01e8, B:125:0x01f0, B:114:0x01c0), top: B:163:0x01b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ff A[PHI: r7
  0x01ff: PHI (r7v42 boolean) = (r7v41 boolean), (r7v44 boolean) binds: [B:126:0x01f5, B:128:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0257 A[Catch: Exception -> 0x02ba, TRY_ENTER, TryCatch #1 {Exception -> 0x02ba, blocks: (B:3:0x0012, B:5:0x0027, B:7:0x0031, B:10:0x003f, B:14:0x004f, B:20:0x0065, B:22:0x006f, B:50:0x00d9, B:52:0x00e1, B:54:0x00e9, B:56:0x00f2, B:150:0x024f, B:153:0x0257, B:155:0x025d, B:156:0x027e, B:157:0x02ac, B:59:0x00ff, B:60:0x0102, B:62:0x010b, B:65:0x0116, B:67:0x011e, B:70:0x0129, B:72:0x0131, B:74:0x0139, B:77:0x0144, B:79:0x014c, B:82:0x0157, B:84:0x015f, B:87:0x016a, B:89:0x0172, B:26:0x007b, B:28:0x0087, B:30:0x0091, B:32:0x0099, B:34:0x00a1, B:36:0x00a9, B:38:0x00b1, B:40:0x00b9, B:42:0x00c1), top: B:165:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x027e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca A[PHI: r22
  0x00ca: PHI (r22v2 int) = 
  (r22v3 int)
  (r22v3 int)
  (r22v3 int)
  (r22v3 int)
  (r22v3 int)
  (r22v3 int)
  (r22v5 int)
  (r22v5 int)
  (r22v5 int)
  (r22v5 int)
  (r22v5 int)
  (r22v5 int)
  (r22v5 int)
  (r22v5 int)
 binds: [B:93:0x017e, B:101:0x0197, B:106:0x01a9, B:104:0x01a5, B:98:0x0192, B:53:0x00e7, B:29:0x008f, B:31:0x0097, B:33:0x009f, B:35:0x00a7, B:37:0x00af, B:39:0x00b7, B:41:0x00bf, B:43:0x00c7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList e(com.google.android.gms.internal.ads.QP r26, com.google.android.gms.internal.ads.SP r27) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.WP.e(com.google.android.gms.internal.ads.QP, com.google.android.gms.internal.ads.SP):java.util.ArrayList");
    }

    public static boolean f(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (D4.a(str)) {
            return true;
        }
        String strH = AbstractC0582Jp.h(mediaCodecInfo.getName());
        if (strH.startsWith("arc.")) {
            return false;
        }
        if (strH.startsWith("omx.google.") || strH.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strH.startsWith("omx.sec.") && strH.contains(".sw.")) || strH.equals("omx.qcom.video.decoder.hevcswvdec") || strH.startsWith("c2.android.") || strH.startsWith("c2.google.")) {
            return true;
        }
        return (strH.startsWith("omx.") || strH.startsWith("c2.")) ? false : true;
    }
}
