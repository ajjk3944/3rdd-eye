package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.g;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfbt {
    public final zzbxv zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfcr zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final List zzaA;
    public final boolean zzaB;
    public final boolean zzaC;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbtu zzad;
    public final com.google.android.gms.ads.internal.client.zzt zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;
    public final com.google.android.gms.ads.internal.util.client.zzv zzax;
    public final com.google.android.gms.ads.internal.util.client.zzw zzay;
    public final double zzaz;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;
    public final zzbwm zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfby zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x06bb A[PHI: r85 r87
  0x06bb: PHI (r85v91 java.util.List) = 
  (r85v4 java.util.List)
  (r85v5 java.util.List)
  (r85v6 java.util.List)
  (r85v7 java.util.List)
  (r85v8 java.util.List)
  (r85v9 java.util.List)
  (r85v10 java.util.List)
  (r85v11 java.util.List)
  (r85v12 java.util.List)
  (r85v13 java.util.List)
  (r85v14 java.util.List)
  (r85v15 java.util.List)
  (r85v16 java.util.List)
  (r85v17 java.util.List)
  (r85v18 java.util.List)
  (r85v19 java.util.List)
  (r85v20 java.util.List)
  (r85v21 java.util.List)
  (r85v22 java.util.List)
  (r85v23 java.util.List)
  (r85v24 java.util.List)
  (r85v25 java.util.List)
  (r85v26 java.util.List)
  (r85v27 java.util.List)
  (r85v28 java.util.List)
  (r85v29 java.util.List)
  (r85v30 java.util.List)
  (r85v31 java.util.List)
  (r85v32 java.util.List)
  (r85v33 java.util.List)
  (r85v34 java.util.List)
  (r85v35 java.util.List)
  (r85v36 java.util.List)
  (r85v37 java.util.List)
  (r85v38 java.util.List)
  (r85v39 java.util.List)
  (r85v40 java.util.List)
  (r85v41 java.util.List)
  (r85v42 java.util.List)
  (r85v43 java.util.List)
  (r85v44 java.util.List)
  (r85v45 java.util.List)
  (r85v46 java.util.List)
  (r85v47 java.util.List)
  (r85v48 java.util.List)
  (r85v49 java.util.List)
  (r85v50 java.util.List)
  (r85v51 java.util.List)
  (r85v52 java.util.List)
  (r85v53 java.util.List)
  (r85v54 java.util.List)
  (r85v55 java.util.List)
  (r85v56 java.util.List)
  (r85v57 java.util.List)
  (r85v58 java.util.List)
  (r85v59 java.util.List)
  (r85v60 java.util.List)
  (r85v61 java.util.List)
  (r85v62 java.util.List)
  (r85v63 java.util.List)
  (r85v64 java.util.List)
  (r85v65 java.util.List)
  (r85v66 java.util.List)
  (r85v67 java.util.List)
  (r85v68 java.util.List)
  (r85v69 java.util.List)
  (r85v70 java.util.List)
  (r85v71 java.util.List)
  (r85v72 java.util.List)
  (r85v73 java.util.List)
  (r85v74 java.util.List)
  (r85v75 java.util.List)
  (r85v76 java.util.List)
  (r85v77 java.util.List)
  (r85v78 java.util.List)
  (r85v79 java.util.List)
  (r85v80 java.util.List)
  (r85v81 java.util.List)
  (r85v82 java.util.List)
  (r85v83 java.util.List)
  (r85v84 java.util.List)
  (r85v85 java.util.List)
  (r85v86 java.util.List)
  (r85v92 java.util.List)
 binds: [B:259:0x06b6, B:256:0x06a5, B:253:0x0694, B:250:0x0683, B:247:0x0672, B:244:0x0661, B:241:0x064f, B:238:0x063d, B:235:0x062b, B:232:0x0619, B:229:0x0607, B:226:0x05f5, B:223:0x05e3, B:220:0x05d1, B:217:0x05bf, B:214:0x05ad, B:211:0x059b, B:208:0x0589, B:205:0x0577, B:202:0x0565, B:199:0x0553, B:196:0x0541, B:193:0x052f, B:190:0x051d, B:187:0x050b, B:184:0x04f9, B:181:0x04e7, B:178:0x04d6, B:175:0x04c4, B:172:0x04b2, B:169:0x04a0, B:166:0x048e, B:163:0x047c, B:160:0x046a, B:157:0x0458, B:154:0x0447, B:151:0x0435, B:148:0x0423, B:145:0x0412, B:142:0x0400, B:139:0x03ee, B:136:0x03dc, B:133:0x03ca, B:130:0x03b8, B:127:0x03a6, B:124:0x0394, B:121:0x0382, B:118:0x0370, B:115:0x035e, B:112:0x034c, B:109:0x033a, B:106:0x0328, B:103:0x0316, B:100:0x0304, B:97:0x02f2, B:94:0x02e1, B:91:0x02cf, B:88:0x02bd, B:85:0x02ab, B:82:0x0299, B:79:0x0287, B:76:0x0276, B:73:0x0264, B:70:0x0252, B:67:0x0240, B:64:0x022e, B:61:0x021c, B:58:0x020a, B:55:0x01f8, B:52:0x01e6, B:49:0x01d4, B:46:0x01c2, B:43:0x01b0, B:40:0x019f, B:37:0x018d, B:34:0x017c, B:31:0x016a, B:28:0x0159, B:25:0x0147, B:22:0x0135, B:19:0x0123, B:16:0x0111, B:13:0x00ff, B:11:0x00ed] A[DONT_GENERATE, DONT_INLINE]
  0x06bb: PHI (r87v85 java.util.List) = 
  (r87v1 java.util.List)
  (r87v2 java.util.List)
  (r87v3 java.util.List)
  (r87v4 java.util.List)
  (r87v5 java.util.List)
  (r87v6 java.util.List)
  (r87v7 java.util.List)
  (r87v8 java.util.List)
  (r87v9 java.util.List)
  (r87v10 java.util.List)
  (r87v11 java.util.List)
  (r87v12 java.util.List)
  (r87v13 java.util.List)
  (r87v14 java.util.List)
  (r87v15 java.util.List)
  (r87v16 java.util.List)
  (r87v17 java.util.List)
  (r87v18 java.util.List)
  (r87v19 java.util.List)
  (r87v20 java.util.List)
  (r87v21 java.util.List)
  (r87v22 java.util.List)
  (r87v23 java.util.List)
  (r87v24 java.util.List)
  (r87v25 java.util.List)
  (r87v26 java.util.List)
  (r87v27 java.util.List)
  (r87v28 java.util.List)
  (r87v29 java.util.List)
  (r87v30 java.util.List)
  (r87v31 java.util.List)
  (r87v32 java.util.List)
  (r87v33 java.util.List)
  (r87v34 java.util.List)
  (r87v35 java.util.List)
  (r87v36 java.util.List)
  (r87v37 java.util.List)
  (r87v38 java.util.List)
  (r87v39 java.util.List)
  (r87v40 java.util.List)
  (r87v41 java.util.List)
  (r87v42 java.util.List)
  (r87v43 java.util.List)
  (r87v44 java.util.List)
  (r87v45 java.util.List)
  (r87v46 java.util.List)
  (r87v47 java.util.List)
  (r87v48 java.util.List)
  (r87v49 java.util.List)
  (r87v50 java.util.List)
  (r87v51 java.util.List)
  (r87v52 java.util.List)
  (r87v53 java.util.List)
  (r87v54 java.util.List)
  (r87v55 java.util.List)
  (r87v56 java.util.List)
  (r87v57 java.util.List)
  (r87v58 java.util.List)
  (r87v59 java.util.List)
  (r87v60 java.util.List)
  (r87v61 java.util.List)
  (r87v62 java.util.List)
  (r87v63 java.util.List)
  (r87v64 java.util.List)
  (r87v65 java.util.List)
  (r87v66 java.util.List)
  (r87v67 java.util.List)
  (r87v68 java.util.List)
  (r87v69 java.util.List)
  (r87v70 java.util.List)
  (r87v71 java.util.List)
  (r87v72 java.util.List)
  (r87v73 java.util.List)
  (r87v74 java.util.List)
  (r87v75 java.util.List)
  (r87v76 java.util.List)
  (r87v77 java.util.List)
  (r87v78 java.util.List)
  (r87v79 java.util.List)
  (r87v80 java.util.List)
  (r87v81 java.util.List)
  (r87v82 java.util.List)
  (r87v83 java.util.List)
  (r87v86 java.util.List)
 binds: [B:259:0x06b6, B:256:0x06a5, B:253:0x0694, B:250:0x0683, B:247:0x0672, B:244:0x0661, B:241:0x064f, B:238:0x063d, B:235:0x062b, B:232:0x0619, B:229:0x0607, B:226:0x05f5, B:223:0x05e3, B:220:0x05d1, B:217:0x05bf, B:214:0x05ad, B:211:0x059b, B:208:0x0589, B:205:0x0577, B:202:0x0565, B:199:0x0553, B:196:0x0541, B:193:0x052f, B:190:0x051d, B:187:0x050b, B:184:0x04f9, B:181:0x04e7, B:178:0x04d6, B:175:0x04c4, B:172:0x04b2, B:169:0x04a0, B:166:0x048e, B:163:0x047c, B:160:0x046a, B:157:0x0458, B:154:0x0447, B:151:0x0435, B:148:0x0423, B:145:0x0412, B:142:0x0400, B:139:0x03ee, B:136:0x03dc, B:133:0x03ca, B:130:0x03b8, B:127:0x03a6, B:124:0x0394, B:121:0x0382, B:118:0x0370, B:115:0x035e, B:112:0x034c, B:109:0x033a, B:106:0x0328, B:103:0x0316, B:100:0x0304, B:97:0x02f2, B:94:0x02e1, B:91:0x02cf, B:88:0x02bd, B:85:0x02ab, B:82:0x0299, B:79:0x0287, B:76:0x0276, B:73:0x0264, B:70:0x0252, B:67:0x0240, B:64:0x022e, B:61:0x021c, B:58:0x020a, B:55:0x01f8, B:52:0x01e6, B:49:0x01d4, B:46:0x01c2, B:43:0x01b0, B:40:0x019f, B:37:0x018d, B:34:0x017c, B:31:0x016a, B:28:0x0159, B:25:0x0147, B:22:0x0135, B:19:0x0123, B:16:0x0111, B:13:0x00ff, B:11:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r9v280, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v287, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v300, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zzfbt(android.util.JsonReader r89) throws java.lang.IllegalStateException, org.json.JSONException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 3264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfbt.<init>(android.util.JsonReader):void");
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzc(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if (g.PLACEMENT_TYPE_INTERSTITIAL.equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if (g.PLACEMENT_TYPE_REWARDED.equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }

    private static int zze(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 4) {
            return i;
        }
        return 0;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}
