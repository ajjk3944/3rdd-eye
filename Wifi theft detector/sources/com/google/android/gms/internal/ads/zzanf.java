package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public final class zzanf implements zzamf {
    private final XmlPullParserFactory zzi;
    private static final Pattern zzc = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern zzd = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern zze = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern zza = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern zzb = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern zzf = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern zzg = Pattern.compile("^(\\d+) (\\d+)$");
    private static final zzand zzh = new zzand(30.0f, 1, 1);

    public zzanf() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.zzi = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    private static String[] zzc(String str) {
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return new String[0];
        }
        String str2 = zzfj.zza;
        return strTrim.split("\\s+", -1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x037b A[Catch: zzamb -> 0x03cf, TryCatch #0 {zzamb -> 0x03cf, blocks: (B:168:0x02e2, B:170:0x02fd, B:173:0x0313, B:175:0x0319, B:177:0x031f, B:198:0x0355, B:203:0x037e, B:205:0x0384, B:206:0x038d, B:199:0x0359, B:200:0x0376, B:201:0x0377, B:202:0x037b, B:207:0x038e, B:208:0x038f, B:209:0x03ac, B:172:0x0306, B:210:0x03ad, B:211:0x03ce), top: B:227:0x02e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0384 A[Catch: zzamb -> 0x03cf, TryCatch #0 {zzamb -> 0x03cf, blocks: (B:168:0x02e2, B:170:0x02fd, B:173:0x0313, B:175:0x0319, B:177:0x031f, B:198:0x0355, B:203:0x037e, B:205:0x0384, B:206:0x038d, B:199:0x0359, B:200:0x0376, B:201:0x0377, B:202:0x037b, B:207:0x038e, B:208:0x038f, B:209:0x03ac, B:172:0x0306, B:210:0x03ad, B:211:0x03ce), top: B:227:0x02e2 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x038d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00de  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v32 */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v34 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v44 */
    /* JADX WARN: Type inference failed for: r10v45 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.gms.internal.ads.zzani zzd(org.xmlpull.v1.XmlPullParser r17, com.google.android.gms.internal.ads.zzani r18) throws com.google.android.gms.internal.ads.zzamb {
        /*
            Method dump skipped, instructions count: 1226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzd(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.zzani):com.google.android.gms.internal.ads.zzani");
    }

    private static zzani zze(@Nullable zzani zzaniVar) {
        return zzaniVar == null ? new zzani() : zzaniVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.text.Layout.Alignment zzf(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.zzgql.zza(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzf(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static long zzg(java.lang.String r13, com.google.android.gms.internal.ads.zzand r14) throws com.google.android.gms.internal.ads.zzamb, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzg(java.lang.String, com.google.android.gms.internal.ads.zzand):long");
    }

    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i10, int i11, zzame zzameVar, zzdr zzdrVar) {
        zzalz.zza(zzb(bArr, i10, i11), zzameVar, zzdrVar);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(7:52|(1:(5:55|427|59|67|(0)(0))(1:56))(1:58)|57|427|59|67|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0311 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #6, #10, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03bf A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #6, #10, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0462 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #6, #10, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04b2 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #6, #10, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0562 A[LOOP:1: B:120:0x0276->B:284:0x0562, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x06af A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, zzamb -> 0x06b3, TRY_LEAVE, TryCatch #8 {zzamb -> 0x06b3, blocks: (B:376:0x06aa, B:378:0x06af), top: B:433:0x06aa }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x055c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0179 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #16 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:67:0x016c, B:85:0x01c7, B:88:0x01db, B:90:0x01e1, B:92:0x01e9, B:94:0x01f1, B:96:0x01f9, B:98:0x0201, B:100:0x0209, B:102:0x020f, B:104:0x0217, B:106:0x021f, B:108:0x0225, B:110:0x022b, B:112:0x0231, B:114:0x0239, B:117:0x0242, B:412:0x0734, B:118:0x0270, B:120:0x0276, B:122:0x027f, B:124:0x028e, B:126:0x029b, B:128:0x02b1, B:130:0x02b7, B:281:0x0556, B:133:0x02c2, B:136:0x02ce, B:265:0x0506, B:139:0x02ec, B:141:0x02f4, B:143:0x02fc, B:145:0x0304, B:150:0x0311, B:153:0x032a, B:155:0x0330, B:157:0x033d, B:178:0x03a5, B:180:0x03ab, B:182:0x03b1, B:184:0x03b9, B:186:0x03bf, B:189:0x03d2, B:191:0x03d8, B:193:0x03e5, B:213:0x045a, B:215:0x0462, B:235:0x04a8, B:237:0x04b2, B:263:0x04f9, B:194:0x03f0, B:195:0x03f1, B:196:0x03f2, B:197:0x03ff, B:200:0x0407, B:203:0x0415, B:205:0x041b, B:207:0x0426, B:208:0x043a, B:209:0x043b, B:210:0x043c, B:211:0x0449, B:158:0x0346, B:159:0x0347, B:160:0x0348, B:162:0x0353, B:165:0x035d, B:168:0x0366, B:170:0x036c, B:172:0x0377, B:173:0x0389, B:174:0x038a, B:175:0x038b, B:176:0x0393, B:268:0x0519, B:270:0x0526, B:272:0x0531, B:274:0x0537, B:276:0x0543, B:286:0x0570, B:289:0x0593, B:346:0x064c, B:324:0x0603, B:327:0x060c, B:387:0x06c7, B:334:0x061f, B:337:0x0629, B:341:0x0637, B:344:0x063e, B:345:0x0645, B:351:0x0663, B:355:0x066f, B:359:0x0678, B:367:0x068a, B:370:0x0693, B:374:0x069e, B:376:0x06aa, B:378:0x06af, B:70:0x0179, B:72:0x0185, B:75:0x018e, B:77:0x0194, B:79:0x019f, B:80:0x01ab, B:81:0x01ac, B:82:0x01ad, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0133, B:52:0x0139, B:59:0x014e, B:66:0x0164, B:62:0x015b, B:65:0x0163, B:392:0x06e9, B:394:0x06f6, B:397:0x06fa, B:399:0x0704, B:401:0x070e, B:405:0x0716, B:403:0x0713, B:408:0x072b, B:411:0x0731, B:417:0x0750), top: B:446:0x0008, inners: #0, #6, #10, #11, #15 }] */
    /* JADX WARN: Type inference failed for: r49v1, types: [com.google.android.gms.internal.ads.zzani, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.zzama zzb(byte[] r47, int r48, int r49) throws org.xmlpull.v1.XmlPullParserException, com.google.android.gms.internal.ads.zzamb, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 1916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzanf.zzb(byte[], int, int):com.google.android.gms.internal.ads.zzama");
    }
}
