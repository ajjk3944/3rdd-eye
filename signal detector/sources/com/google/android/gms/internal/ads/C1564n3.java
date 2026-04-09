package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: com.google.android.gms.internal.ads.n3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1564n3 implements S2 {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f15735b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f15736c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f15737d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f15738e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f15739f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: g, reason: collision with root package name */
    public static final Pattern f15740g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f15741h = Pattern.compile("^(\\d+) (\\d+)$");
    public static final S0.c i = new S0.c(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f15742a;

    public C1564n3() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f15742a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e6) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e6);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0455 A[Catch: Q2 -> 0x04a7, TryCatch #1 {Q2 -> 0x04a7, blocks: (B:233:0x03bf, B:236:0x03db, B:239:0x03ed, B:241:0x03f3, B:243:0x03fa, B:265:0x0431, B:270:0x0457, B:272:0x045d, B:273:0x0465, B:266:0x0434, B:267:0x0451, B:268:0x0452, B:269:0x0455, B:274:0x0466, B:275:0x0467, B:276:0x0484, B:238:0x03e2, B:277:0x0485, B:278:0x04a6), top: B:296:0x03bf }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x045d A[Catch: Q2 -> 0x04a7, TryCatch #1 {Q2 -> 0x04a7, blocks: (B:233:0x03bf, B:236:0x03db, B:239:0x03ed, B:241:0x03f3, B:243:0x03fa, B:265:0x0431, B:270:0x0457, B:272:0x045d, B:273:0x0465, B:266:0x0434, B:267:0x0451, B:268:0x0452, B:269:0x0455, B:274:0x0466, B:275:0x0467, B:276:0x0484, B:238:0x03e2, B:277:0x0485, B:278:0x04a6), top: B:296:0x03bf }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0465 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.C1672p3 b(org.xmlpull.v1.XmlPullParser r17, com.google.android.gms.internal.ads.C1672p3 r18) throws com.google.android.gms.internal.ads.Q2 {
        /*
            Method dump skipped, instructions count: 1424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1564n3.b(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.p3):com.google.android.gms.internal.ads.p3");
    }

    public static C1672p3 c(C1672p3 c1672p3) {
        return c1672p3 == null ? new C1672p3() : c1672p3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.text.Layout.Alignment d(java.lang.String r5) {
        /*
            java.lang.String r5 = com.google.android.gms.internal.ads.AbstractC0582Jp.h(r5)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1564n3.d(java.lang.String):android.text.Layout$Alignment");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long e(java.lang.String r13, S0.c r14) throws com.google.android.gms.internal.ads.Q2, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1564n3.e(java.lang.String, S0.c):long");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0407 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x0195, B:90:0x01ee, B:93:0x0202, B:95:0x0208, B:97:0x0210, B:99:0x0218, B:101:0x0220, B:103:0x0228, B:105:0x0230, B:107:0x0236, B:109:0x023e, B:111:0x0246, B:113:0x024c, B:115:0x0252, B:117:0x0258, B:119:0x0260, B:122:0x0269, B:437:0x07e6, B:123:0x029b, B:126:0x02a3, B:128:0x02ac, B:130:0x02bd, B:132:0x02c7, B:134:0x02d7, B:136:0x02dd, B:138:0x02f3, B:140:0x02f9, B:293:0x05a0, B:133:0x02ce, B:142:0x0308, B:145:0x0316, B:277:0x0550, B:148:0x0333, B:150:0x033b, B:152:0x0343, B:154:0x034b, B:161:0x035f, B:164:0x0372, B:166:0x0378, B:168:0x0385, B:190:0x03ed, B:192:0x03f3, B:194:0x03f9, B:196:0x0401, B:198:0x0407, B:201:0x0416, B:203:0x041c, B:205:0x0429, B:225:0x04a0, B:227:0x04a8, B:247:0x04f3, B:249:0x04fd, B:275:0x0543, B:206:0x0434, B:207:0x0435, B:208:0x0436, B:209:0x0443, B:212:0x044b, B:215:0x0459, B:217:0x045f, B:219:0x046a, B:220:0x047e, B:221:0x047f, B:222:0x0480, B:223:0x048d, B:170:0x038e, B:171:0x038f, B:172:0x0390, B:174:0x039d, B:177:0x03a7, B:180:0x03b0, B:182:0x03b6, B:184:0x03c1, B:185:0x03d1, B:186:0x03d2, B:187:0x03d3, B:188:0x03db, B:280:0x0563, B:282:0x0570, B:284:0x057b, B:286:0x0581, B:288:0x058d, B:298:0x05c7, B:301:0x05e9, B:366:0x06d8, B:335:0x065a, B:337:0x0662, B:409:0x0766, B:343:0x0679, B:346:0x0682, B:349:0x068d, B:351:0x069b, B:350:0x0692, B:361:0x06b4, B:364:0x06bb, B:365:0x06c7, B:371:0x06f3, B:375:0x06ff, B:379:0x0708, B:387:0x071b, B:394:0x072b, B:396:0x073b, B:398:0x0740, B:400:0x0744, B:401:0x074b, B:390:0x0722, B:74:0x01a2, B:76:0x01ac, B:79:0x01b5, B:81:0x01bb, B:83:0x01c6, B:84:0x01d0, B:85:0x01d1, B:86:0x01d2, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x016d, B:63:0x017c, B:70:0x018c, B:67:0x0186, B:69:0x018b, B:414:0x078b, B:416:0x0797, B:417:0x079e, B:419:0x07a5, B:422:0x07a9, B:424:0x07b3, B:426:0x07bd, B:430:0x07c5, B:428:0x07c2, B:433:0x07dd, B:436:0x07e3, B:442:0x0803), top: B:473:0x0008, inners: #4, #7, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04a8 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x0195, B:90:0x01ee, B:93:0x0202, B:95:0x0208, B:97:0x0210, B:99:0x0218, B:101:0x0220, B:103:0x0228, B:105:0x0230, B:107:0x0236, B:109:0x023e, B:111:0x0246, B:113:0x024c, B:115:0x0252, B:117:0x0258, B:119:0x0260, B:122:0x0269, B:437:0x07e6, B:123:0x029b, B:126:0x02a3, B:128:0x02ac, B:130:0x02bd, B:132:0x02c7, B:134:0x02d7, B:136:0x02dd, B:138:0x02f3, B:140:0x02f9, B:293:0x05a0, B:133:0x02ce, B:142:0x0308, B:145:0x0316, B:277:0x0550, B:148:0x0333, B:150:0x033b, B:152:0x0343, B:154:0x034b, B:161:0x035f, B:164:0x0372, B:166:0x0378, B:168:0x0385, B:190:0x03ed, B:192:0x03f3, B:194:0x03f9, B:196:0x0401, B:198:0x0407, B:201:0x0416, B:203:0x041c, B:205:0x0429, B:225:0x04a0, B:227:0x04a8, B:247:0x04f3, B:249:0x04fd, B:275:0x0543, B:206:0x0434, B:207:0x0435, B:208:0x0436, B:209:0x0443, B:212:0x044b, B:215:0x0459, B:217:0x045f, B:219:0x046a, B:220:0x047e, B:221:0x047f, B:222:0x0480, B:223:0x048d, B:170:0x038e, B:171:0x038f, B:172:0x0390, B:174:0x039d, B:177:0x03a7, B:180:0x03b0, B:182:0x03b6, B:184:0x03c1, B:185:0x03d1, B:186:0x03d2, B:187:0x03d3, B:188:0x03db, B:280:0x0563, B:282:0x0570, B:284:0x057b, B:286:0x0581, B:288:0x058d, B:298:0x05c7, B:301:0x05e9, B:366:0x06d8, B:335:0x065a, B:337:0x0662, B:409:0x0766, B:343:0x0679, B:346:0x0682, B:349:0x068d, B:351:0x069b, B:350:0x0692, B:361:0x06b4, B:364:0x06bb, B:365:0x06c7, B:371:0x06f3, B:375:0x06ff, B:379:0x0708, B:387:0x071b, B:394:0x072b, B:396:0x073b, B:398:0x0740, B:400:0x0744, B:401:0x074b, B:390:0x0722, B:74:0x01a2, B:76:0x01ac, B:79:0x01b5, B:81:0x01bb, B:83:0x01c6, B:84:0x01d0, B:85:0x01d1, B:86:0x01d2, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x016d, B:63:0x017c, B:70:0x018c, B:67:0x0186, B:69:0x018b, B:414:0x078b, B:416:0x0797, B:417:0x079e, B:419:0x07a5, B:422:0x07a9, B:424:0x07b3, B:426:0x07bd, B:430:0x07c5, B:428:0x07c2, B:433:0x07dd, B:436:0x07e3, B:442:0x0803), top: B:473:0x0008, inners: #4, #7, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04fd A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x0195, B:90:0x01ee, B:93:0x0202, B:95:0x0208, B:97:0x0210, B:99:0x0218, B:101:0x0220, B:103:0x0228, B:105:0x0230, B:107:0x0236, B:109:0x023e, B:111:0x0246, B:113:0x024c, B:115:0x0252, B:117:0x0258, B:119:0x0260, B:122:0x0269, B:437:0x07e6, B:123:0x029b, B:126:0x02a3, B:128:0x02ac, B:130:0x02bd, B:132:0x02c7, B:134:0x02d7, B:136:0x02dd, B:138:0x02f3, B:140:0x02f9, B:293:0x05a0, B:133:0x02ce, B:142:0x0308, B:145:0x0316, B:277:0x0550, B:148:0x0333, B:150:0x033b, B:152:0x0343, B:154:0x034b, B:161:0x035f, B:164:0x0372, B:166:0x0378, B:168:0x0385, B:190:0x03ed, B:192:0x03f3, B:194:0x03f9, B:196:0x0401, B:198:0x0407, B:201:0x0416, B:203:0x041c, B:205:0x0429, B:225:0x04a0, B:227:0x04a8, B:247:0x04f3, B:249:0x04fd, B:275:0x0543, B:206:0x0434, B:207:0x0435, B:208:0x0436, B:209:0x0443, B:212:0x044b, B:215:0x0459, B:217:0x045f, B:219:0x046a, B:220:0x047e, B:221:0x047f, B:222:0x0480, B:223:0x048d, B:170:0x038e, B:171:0x038f, B:172:0x0390, B:174:0x039d, B:177:0x03a7, B:180:0x03b0, B:182:0x03b6, B:184:0x03c1, B:185:0x03d1, B:186:0x03d2, B:187:0x03d3, B:188:0x03db, B:280:0x0563, B:282:0x0570, B:284:0x057b, B:286:0x0581, B:288:0x058d, B:298:0x05c7, B:301:0x05e9, B:366:0x06d8, B:335:0x065a, B:337:0x0662, B:409:0x0766, B:343:0x0679, B:346:0x0682, B:349:0x068d, B:351:0x069b, B:350:0x0692, B:361:0x06b4, B:364:0x06bb, B:365:0x06c7, B:371:0x06f3, B:375:0x06ff, B:379:0x0708, B:387:0x071b, B:394:0x072b, B:396:0x073b, B:398:0x0740, B:400:0x0744, B:401:0x074b, B:390:0x0722, B:74:0x01a2, B:76:0x01ac, B:79:0x01b5, B:81:0x01bb, B:83:0x01c6, B:84:0x01d0, B:85:0x01d1, B:86:0x01d2, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x016d, B:63:0x017c, B:70:0x018c, B:67:0x0186, B:69:0x018b, B:414:0x078b, B:416:0x0797, B:417:0x079e, B:419:0x07a5, B:422:0x07a9, B:424:0x07b3, B:426:0x07bd, B:430:0x07c5, B:428:0x07c2, B:433:0x07dd, B:436:0x07e3, B:442:0x0803), top: B:473:0x0008, inners: #4, #7, #10, #11, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a2 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x0195, B:90:0x01ee, B:93:0x0202, B:95:0x0208, B:97:0x0210, B:99:0x0218, B:101:0x0220, B:103:0x0228, B:105:0x0230, B:107:0x0236, B:109:0x023e, B:111:0x0246, B:113:0x024c, B:115:0x0252, B:117:0x0258, B:119:0x0260, B:122:0x0269, B:437:0x07e6, B:123:0x029b, B:126:0x02a3, B:128:0x02ac, B:130:0x02bd, B:132:0x02c7, B:134:0x02d7, B:136:0x02dd, B:138:0x02f3, B:140:0x02f9, B:293:0x05a0, B:133:0x02ce, B:142:0x0308, B:145:0x0316, B:277:0x0550, B:148:0x0333, B:150:0x033b, B:152:0x0343, B:154:0x034b, B:161:0x035f, B:164:0x0372, B:166:0x0378, B:168:0x0385, B:190:0x03ed, B:192:0x03f3, B:194:0x03f9, B:196:0x0401, B:198:0x0407, B:201:0x0416, B:203:0x041c, B:205:0x0429, B:225:0x04a0, B:227:0x04a8, B:247:0x04f3, B:249:0x04fd, B:275:0x0543, B:206:0x0434, B:207:0x0435, B:208:0x0436, B:209:0x0443, B:212:0x044b, B:215:0x0459, B:217:0x045f, B:219:0x046a, B:220:0x047e, B:221:0x047f, B:222:0x0480, B:223:0x048d, B:170:0x038e, B:171:0x038f, B:172:0x0390, B:174:0x039d, B:177:0x03a7, B:180:0x03b0, B:182:0x03b6, B:184:0x03c1, B:185:0x03d1, B:186:0x03d2, B:187:0x03d3, B:188:0x03db, B:280:0x0563, B:282:0x0570, B:284:0x057b, B:286:0x0581, B:288:0x058d, B:298:0x05c7, B:301:0x05e9, B:366:0x06d8, B:335:0x065a, B:337:0x0662, B:409:0x0766, B:343:0x0679, B:346:0x0682, B:349:0x068d, B:351:0x069b, B:350:0x0692, B:361:0x06b4, B:364:0x06bb, B:365:0x06c7, B:371:0x06f3, B:375:0x06ff, B:379:0x0708, B:387:0x071b, B:394:0x072b, B:396:0x073b, B:398:0x0740, B:400:0x0744, B:401:0x074b, B:390:0x0722, B:74:0x01a2, B:76:0x01ac, B:79:0x01b5, B:81:0x01bb, B:83:0x01c6, B:84:0x01d0, B:85:0x01d1, B:86:0x01d2, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x016d, B:63:0x017c, B:70:0x018c, B:67:0x0186, B:69:0x018b, B:414:0x078b, B:416:0x0797, B:417:0x079e, B:419:0x07a5, B:422:0x07a9, B:424:0x07b3, B:426:0x07bd, B:430:0x07c5, B:428:0x07c2, B:433:0x07dd, B:436:0x07e3, B:442:0x0803), top: B:473:0x0008, inners: #4, #7, #10, #11, #14 }] */
    /* JADX WARN: Type inference failed for: r51v1, types: [com.google.android.gms.internal.ads.p3, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.C1726q3 a(int r50, int r51, byte[] r52) throws org.xmlpull.v1.XmlPullParserException, com.google.android.gms.internal.ads.Q2, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 2094
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1564n3.a(int, int, byte[]):com.google.android.gms.internal.ads.q3");
    }

    @Override // com.google.android.gms.internal.ads.S2
    public final void h(byte[] bArr, int i3, int i6, T2 t22) {
        AbstractC2022vd.f(a(i3, i6, bArr), t22);
    }
}
