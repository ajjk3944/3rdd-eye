package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class og4 {
    public static final HashMap a = new HashMap();

    public static synchronized List a(String str, boolean z, boolean z2) {
        try {
            lg4 lg4Var = new lg4(str, z, z2);
            HashMap map = a;
            List list = (List) map.get(lg4Var);
            if (list != null) {
                return list;
            }
            ArrayList arrayListD = d(lg4Var, new t3(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListD.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                Collections.sort(arrayListD, new sb3(1, id4.h));
            }
            if (Build.VERSION.SDK_INT < 32 && arrayListD.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((bg4) arrayListD.get(0)).a)) {
                arrayListD.add((bg4) arrayListD.remove(0));
            }
            xm3 xm3VarM = xm3.m(arrayListD);
            map.put(lg4Var, xm3VarM);
            return xm3VarM;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static sn3 b(hd4 hd4Var, ph4 ph4Var, boolean z, boolean z2) {
        Iterable iterableA;
        String str = ph4Var.m;
        hd4Var.getClass();
        List listA = a(str, z, z2);
        String strC = c(ph4Var);
        if (strC == null) {
            iterableA = sn3.j;
        } else {
            hd4Var.getClass();
            iterableA = a(strC, z, z2);
        }
        vm3 vm3Var = xm3.g;
        um3 um3Var = new um3(4);
        um3Var.b(listA);
        um3Var.b(iterableA);
        return um3Var.f();
    }

    public static String c(ph4 ph4Var) {
        Pair pairB;
        String str = ph4Var.m;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (pairB = mo2.b(ph4Var)) != null) {
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

    /* JADX WARN: Removed duplicated region for block: B:105:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118 A[PHI: r18
  0x0118: PHI (r18v3 int) = (r18v2 int), (r18v5 int) binds: [B:66:0x0116, B:94:0x017d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013f A[Catch: Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:62:0x010f, B:70:0x011e, B:77:0x0137, B:79:0x013f, B:86:0x0153, B:88:0x015c, B:89:0x0160, B:91:0x0170, B:93:0x0178, B:82:0x0148), top: B:117:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0148 A[Catch: Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:62:0x010f, B:70:0x011e, B:77:0x0137, B:79:0x013f, B:86:0x0153, B:88:0x015c, B:89:0x0160, B:91:0x0170, B:93:0x0178, B:82:0x0148), top: B:117:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015c A[Catch: Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:62:0x010f, B:70:0x011e, B:77:0x0137, B:79:0x013f, B:86:0x0153, B:88:0x015c, B:89:0x0160, B:91:0x0170, B:93:0x0178, B:82:0x0148), top: B:117:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0160 A[Catch: Exception -> 0x0144, TryCatch #3 {Exception -> 0x0144, blocks: (B:62:0x010f, B:70:0x011e, B:77:0x0137, B:79:0x013f, B:86:0x0153, B:88:0x015c, B:89:0x0160, B:91:0x0170, B:93:0x0178, B:82:0x0148), top: B:117:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList d(defpackage.lg4 r21, defpackage.t3 r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og4.d(lg4, t3):java.util.ArrayList");
    }

    public static boolean e(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (pp1.a(str)) {
            return true;
        }
        String strD = um.D(mediaCodecInfo.getName());
        if (strD.startsWith("arc.")) {
            return false;
        }
        if (strD.startsWith("omx.google.") || strD.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((strD.startsWith("omx.sec.") && strD.contains(".sw.")) || strD.equals("omx.qcom.video.decoder.hevcswvdec") || strD.startsWith("c2.android.") || strD.startsWith("c2.google.")) {
            return true;
        }
        return (strD.startsWith("omx.") || strD.startsWith("c2.")) ? false : true;
    }
}
