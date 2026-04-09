package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzalr implements zzakr {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzalp zzh = new zzalp(30.0f, 1, 1);

    public zzalr() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e4) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long zzc(java.lang.String r13, com.google.android.gms.internal.ads.zzalp r14) throws com.google.android.gms.internal.ads.zzakn, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zzc(java.lang.String, com.google.android.gms.internal.ads.zzalp):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.text.Layout.Alignment zzd(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.zzfuk.zza(r5)
            int r0 = r5.hashCode()
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L38;
                case 100571: goto L2e;
                case 3317767: goto L24;
                case 108511772: goto L1a;
                case 109757538: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L42
        L10:
            java.lang.String r0 = "start"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r4
            goto L43
        L1a:
            java.lang.String r0 = "right"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r3
            goto L43
        L24:
            java.lang.String r0 = "left"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = 0
            goto L43
        L2e:
            java.lang.String r0 = "end"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r2
            goto L43
        L38:
            java.lang.String r0 = "center"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L42
            r5 = r1
            goto L43
        L42:
            r5 = -1
        L43:
            if (r5 == 0) goto L55
            if (r5 == r4) goto L55
            if (r5 == r3) goto L52
            if (r5 == r2) goto L52
            if (r5 == r1) goto L4f
            r5 = 0
            return r5
        L4f:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
            return r5
        L52:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            return r5
        L55:
            android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zzd(java.lang.String):android.text.Layout$Alignment");
    }

    private static zzalu zze(zzalu zzaluVar) {
        return zzaluVar == null ? new zzalu() : zzaluVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v29 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v34 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r11v36 */
    /* JADX WARN: Type inference failed for: r11v37 */
    /* JADX WARN: Type inference failed for: r11v38 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v43 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v71 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzalu zzf(org.xmlpull.v1.XmlPullParser r16, com.google.android.gms.internal.ads.zzalu r17) throws com.google.android.gms.internal.ads.zzakn {
        /*
            Method dump skipped, instructions count: 1168
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zzf(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzalu):com.google.android.gms.internal.ads.zzalu");
    }

    private static String[] zzg(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzex.zza;
        return strTrim.split("\\s+", -1);
    }

    @Override // com.google.android.gms.internal.ads.zzakr
    public final void zza(byte[] bArr, int i, int i10, zzakq zzakqVar, zzdn zzdnVar) {
        zzakl.zza(zzb(bArr, i, i10), zzakqVar, zzdnVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0579 A[Catch: IOException -> 0x00a3, XmlPullParserException -> 0x00a6, TRY_LEAVE, TryCatch #18 {IOException -> 0x00a3, XmlPullParserException -> 0x00a6, blocks: (B:3:0x0010, B:5:0x0071, B:7:0x007b, B:10:0x0086, B:13:0x0094, B:15:0x009c, B:22:0x00ac, B:25:0x00b8, B:29:0x00cb, B:31:0x00e6, B:33:0x00f2, B:34:0x00f6, B:36:0x0102, B:39:0x010c, B:72:0x01af, B:90:0x020e, B:93:0x021c, B:95:0x0222, B:97:0x022a, B:99:0x0232, B:101:0x023a, B:103:0x0242, B:105:0x024a, B:107:0x0250, B:109:0x0258, B:111:0x0260, B:113:0x0266, B:115:0x026c, B:117:0x0272, B:119:0x027a, B:122:0x0283, B:423:0x07d5, B:123:0x02b9, B:125:0x02bf, B:127:0x02c8, B:129:0x02d7, B:131:0x02e2, B:133:0x02f6, B:135:0x02fc, B:294:0x05d7, B:138:0x0311, B:140:0x0319, B:142:0x031f, B:144:0x0328, B:146:0x032e, B:148:0x033a, B:153:0x034f, B:292:0x05cd, B:156:0x0367, B:158:0x036f, B:160:0x0375, B:162:0x037d, B:164:0x0383, B:167:0x039a, B:169:0x03a0, B:171:0x03ad, B:199:0x044f, B:201:0x0455, B:203:0x045b, B:205:0x0463, B:207:0x0469, B:210:0x047e, B:212:0x0484, B:214:0x0491, B:240:0x0522, B:242:0x052a, B:262:0x0571, B:264:0x0579, B:290:0x05c0, B:215:0x04a1, B:216:0x04a2, B:217:0x04a3, B:219:0x04b4, B:222:0x04be, B:225:0x04cb, B:227:0x04d1, B:229:0x04d8, B:231:0x04de, B:232:0x04f2, B:236:0x04f9, B:235:0x04f8, B:238:0x0508, B:173:0x03c3, B:174:0x03c4, B:175:0x03c5, B:178:0x03da, B:181:0x03e6, B:184:0x03fb, B:186:0x0401, B:188:0x0408, B:190:0x040e, B:191:0x041f, B:195:0x0426, B:194:0x0425, B:197:0x0430, B:299:0x0608, B:302:0x062b, B:336:0x068c, B:338:0x0694, B:344:0x06a8, B:347:0x06b2, B:351:0x06c0, B:400:0x0755, B:354:0x06c8, B:355:0x06d0, B:363:0x06f0, B:367:0x06fa, B:371:0x0703, B:381:0x0719, B:390:0x0731, B:392:0x073d, B:394:0x0742, B:385:0x0722, B:75:0x01b8, B:77:0x01c4, B:80:0x01cf, B:82:0x01d5, B:84:0x01e0, B:85:0x01ec, B:86:0x01ed, B:87:0x01ee, B:43:0x0128, B:46:0x0138, B:49:0x0143, B:51:0x0149, B:53:0x0150, B:55:0x0156, B:61:0x016c, B:63:0x0173, B:71:0x01a6, B:67:0x0197, B:70:0x01a5, B:404:0x0782, B:406:0x078f, B:409:0x0793, B:411:0x079d, B:413:0x07a7, B:415:0x07ae, B:416:0x07af, B:419:0x07c5, B:422:0x07d3, B:427:0x07f9), top: B:461:0x0010, inners: #3, #5, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x05cd A[Catch: IOException -> 0x00a3, XmlPullParserException -> 0x00a6, TryCatch #18 {IOException -> 0x00a3, XmlPullParserException -> 0x00a6, blocks: (B:3:0x0010, B:5:0x0071, B:7:0x007b, B:10:0x0086, B:13:0x0094, B:15:0x009c, B:22:0x00ac, B:25:0x00b8, B:29:0x00cb, B:31:0x00e6, B:33:0x00f2, B:34:0x00f6, B:36:0x0102, B:39:0x010c, B:72:0x01af, B:90:0x020e, B:93:0x021c, B:95:0x0222, B:97:0x022a, B:99:0x0232, B:101:0x023a, B:103:0x0242, B:105:0x024a, B:107:0x0250, B:109:0x0258, B:111:0x0260, B:113:0x0266, B:115:0x026c, B:117:0x0272, B:119:0x027a, B:122:0x0283, B:423:0x07d5, B:123:0x02b9, B:125:0x02bf, B:127:0x02c8, B:129:0x02d7, B:131:0x02e2, B:133:0x02f6, B:135:0x02fc, B:294:0x05d7, B:138:0x0311, B:140:0x0319, B:142:0x031f, B:144:0x0328, B:146:0x032e, B:148:0x033a, B:153:0x034f, B:292:0x05cd, B:156:0x0367, B:158:0x036f, B:160:0x0375, B:162:0x037d, B:164:0x0383, B:167:0x039a, B:169:0x03a0, B:171:0x03ad, B:199:0x044f, B:201:0x0455, B:203:0x045b, B:205:0x0463, B:207:0x0469, B:210:0x047e, B:212:0x0484, B:214:0x0491, B:240:0x0522, B:242:0x052a, B:262:0x0571, B:264:0x0579, B:290:0x05c0, B:215:0x04a1, B:216:0x04a2, B:217:0x04a3, B:219:0x04b4, B:222:0x04be, B:225:0x04cb, B:227:0x04d1, B:229:0x04d8, B:231:0x04de, B:232:0x04f2, B:236:0x04f9, B:235:0x04f8, B:238:0x0508, B:173:0x03c3, B:174:0x03c4, B:175:0x03c5, B:178:0x03da, B:181:0x03e6, B:184:0x03fb, B:186:0x0401, B:188:0x0408, B:190:0x040e, B:191:0x041f, B:195:0x0426, B:194:0x0425, B:197:0x0430, B:299:0x0608, B:302:0x062b, B:336:0x068c, B:338:0x0694, B:344:0x06a8, B:347:0x06b2, B:351:0x06c0, B:400:0x0755, B:354:0x06c8, B:355:0x06d0, B:363:0x06f0, B:367:0x06fa, B:371:0x0703, B:381:0x0719, B:390:0x0731, B:392:0x073d, B:394:0x0742, B:385:0x0722, B:75:0x01b8, B:77:0x01c4, B:80:0x01cf, B:82:0x01d5, B:84:0x01e0, B:85:0x01ec, B:86:0x01ed, B:87:0x01ee, B:43:0x0128, B:46:0x0138, B:49:0x0143, B:51:0x0149, B:53:0x0150, B:55:0x0156, B:61:0x016c, B:63:0x0173, B:71:0x01a6, B:67:0x0197, B:70:0x01a5, B:404:0x0782, B:406:0x078f, B:409:0x0793, B:411:0x079d, B:413:0x07a7, B:415:0x07ae, B:416:0x07af, B:419:0x07c5, B:422:0x07d3, B:427:0x07f9), top: B:461:0x0010, inners: #3, #5, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x05e4 A[LOOP:1: B:125:0x02bf->B:297:0x05e4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0742 A[Catch: IOException -> 0x00a3, XmlPullParserException -> 0x00a6, zzakn -> 0x0746, TRY_LEAVE, TryCatch #14 {zzakn -> 0x0746, blocks: (B:392:0x073d, B:394:0x0742), top: B:455:0x073d }] */
    /* JADX WARN: Removed duplicated region for block: B:483:0x05dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b8 A[Catch: IOException -> 0x00a3, XmlPullParserException -> 0x00a6, TryCatch #18 {IOException -> 0x00a3, XmlPullParserException -> 0x00a6, blocks: (B:3:0x0010, B:5:0x0071, B:7:0x007b, B:10:0x0086, B:13:0x0094, B:15:0x009c, B:22:0x00ac, B:25:0x00b8, B:29:0x00cb, B:31:0x00e6, B:33:0x00f2, B:34:0x00f6, B:36:0x0102, B:39:0x010c, B:72:0x01af, B:90:0x020e, B:93:0x021c, B:95:0x0222, B:97:0x022a, B:99:0x0232, B:101:0x023a, B:103:0x0242, B:105:0x024a, B:107:0x0250, B:109:0x0258, B:111:0x0260, B:113:0x0266, B:115:0x026c, B:117:0x0272, B:119:0x027a, B:122:0x0283, B:423:0x07d5, B:123:0x02b9, B:125:0x02bf, B:127:0x02c8, B:129:0x02d7, B:131:0x02e2, B:133:0x02f6, B:135:0x02fc, B:294:0x05d7, B:138:0x0311, B:140:0x0319, B:142:0x031f, B:144:0x0328, B:146:0x032e, B:148:0x033a, B:153:0x034f, B:292:0x05cd, B:156:0x0367, B:158:0x036f, B:160:0x0375, B:162:0x037d, B:164:0x0383, B:167:0x039a, B:169:0x03a0, B:171:0x03ad, B:199:0x044f, B:201:0x0455, B:203:0x045b, B:205:0x0463, B:207:0x0469, B:210:0x047e, B:212:0x0484, B:214:0x0491, B:240:0x0522, B:242:0x052a, B:262:0x0571, B:264:0x0579, B:290:0x05c0, B:215:0x04a1, B:216:0x04a2, B:217:0x04a3, B:219:0x04b4, B:222:0x04be, B:225:0x04cb, B:227:0x04d1, B:229:0x04d8, B:231:0x04de, B:232:0x04f2, B:236:0x04f9, B:235:0x04f8, B:238:0x0508, B:173:0x03c3, B:174:0x03c4, B:175:0x03c5, B:178:0x03da, B:181:0x03e6, B:184:0x03fb, B:186:0x0401, B:188:0x0408, B:190:0x040e, B:191:0x041f, B:195:0x0426, B:194:0x0425, B:197:0x0430, B:299:0x0608, B:302:0x062b, B:336:0x068c, B:338:0x0694, B:344:0x06a8, B:347:0x06b2, B:351:0x06c0, B:400:0x0755, B:354:0x06c8, B:355:0x06d0, B:363:0x06f0, B:367:0x06fa, B:371:0x0703, B:381:0x0719, B:390:0x0731, B:392:0x073d, B:394:0x0742, B:385:0x0722, B:75:0x01b8, B:77:0x01c4, B:80:0x01cf, B:82:0x01d5, B:84:0x01e0, B:85:0x01ec, B:86:0x01ed, B:87:0x01ee, B:43:0x0128, B:46:0x0138, B:49:0x0143, B:51:0x0149, B:53:0x0150, B:55:0x0156, B:61:0x016c, B:63:0x0173, B:71:0x01a6, B:67:0x0197, B:70:0x01a5, B:404:0x0782, B:406:0x078f, B:409:0x0793, B:411:0x079d, B:413:0x07a7, B:415:0x07ae, B:416:0x07af, B:419:0x07c5, B:422:0x07d3, B:427:0x07f9), top: B:461:0x0010, inners: #3, #5, #13 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzakm zzb(byte[] r49, int r50, int r51) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2084
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalr.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzakm");
    }
}
