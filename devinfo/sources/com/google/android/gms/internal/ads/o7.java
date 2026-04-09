package com.google.android.gms.internal.ads;

import android.text.Layout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class o7 implements s6 {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f14591b = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f14592c = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f14593d = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f14594e = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f14595f = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern g = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f14596h = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: i, reason: collision with root package name */
    public static final n7 f14597i = new n7(30.0f, 1, 1);

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f14598a;

    public o7() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f14598a = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0202 A[Catch: q6 -> 0x026a, TryCatch #1 {q6 -> 0x026a, blocks: (B:85:0x0191, B:88:0x01ac, B:91:0x01be, B:93:0x01c4, B:95:0x01cb, B:104:0x01e3, B:114:0x01fc, B:116:0x0202, B:117:0x020a, B:118:0x020b, B:119:0x0228, B:108:0x01ee, B:113:0x01fa, B:120:0x0229, B:121:0x022a, B:122:0x0247, B:90:0x01b3, B:123:0x0248, B:124:0x0269), top: B:224:0x0191 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.q7 b(org.xmlpull.v1.XmlPullParser r16, com.google.android.gms.internal.ads.q7 r17) throws com.google.android.gms.internal.ads.q6 {
        /*
            Method dump skipped, instructions count: 1232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o7.b(org.xmlpull.v1.XmlPullParser, com.google.android.gms.internal.ads.q7):com.google.android.gms.internal.ads.q7");
    }

    public static q7 c(q7 q7Var) {
        return q7Var == null ? new q7() : q7Var;
    }

    public static Layout.Alignment e(String str) {
        String strH = mq0.h(str);
        switch (strH.hashCode()) {
            case -1364013995:
                if (strH.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strH.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!strH.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strH.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!strH.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static long f(String str, n7 n7Var) throws q6, NumberFormatException {
        double d10;
        double d11;
        Matcher matcher = f14591b.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j8 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d12 = j + j8;
            double d13 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d14 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d15 = d12 + d13;
            return (long) ((d15 + d14 + (matcher.group(5) != null ? Long.parseLong(r12) / n7Var.f14165a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r12) / n7Var.f14166b) / n7Var.f14165a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = f14592c.matcher(str);
        if (!matcher2.matches()) {
            throw new q6("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup5 = matcher2.group(1);
        strGroup5.getClass();
        double d16 = Double.parseDouble(strGroup5);
        String strGroup6 = matcher2.group(2);
        strGroup6.getClass();
        int iHashCode = strGroup6.hashCode();
        if (iHashCode != 102) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 3494) {
                        if (iHashCode == 115) {
                            strGroup6.equals("s");
                        } else if (iHashCode == 116 && strGroup6.equals("t")) {
                            d10 = n7Var.f14167c;
                            d16 /= d10;
                        }
                    } else if (strGroup6.equals("ms")) {
                        d10 = 1000.0d;
                        d16 /= d10;
                    }
                } else if (strGroup6.equals("m")) {
                    d11 = 60.0d;
                    d16 *= d11;
                }
            } else if (strGroup6.equals("h")) {
                d11 = 3600.0d;
                d16 *= d11;
            }
        } else if (strGroup6.equals("f")) {
            d10 = n7Var.f14165a;
            d16 /= d10;
        }
        return (long) (d16 * 1000000.0d);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:289:0x05de. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0408 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x0195, B:90:0x01ee, B:93:0x0202, B:95:0x0208, B:97:0x0210, B:99:0x0218, B:101:0x0220, B:103:0x0228, B:105:0x0230, B:107:0x0236, B:109:0x023e, B:111:0x0246, B:113:0x024c, B:115:0x0252, B:117:0x0258, B:119:0x0260, B:122:0x0269, B:411:0x07c3, B:124:0x029c, B:127:0x02a4, B:129:0x02ad, B:131:0x02be, B:133:0x02c8, B:135:0x02d8, B:137:0x02de, B:139:0x02f4, B:141:0x02fa, B:280:0x0589, B:134:0x02cf, B:143:0x0309, B:146:0x0317, B:264:0x0539, B:149:0x0334, B:151:0x033c, B:153:0x0344, B:155:0x034c, B:162:0x0360, B:165:0x0373, B:167:0x0379, B:169:0x0386, B:191:0x03ee, B:193:0x03f4, B:195:0x03fa, B:197:0x0402, B:199:0x0408, B:202:0x0417, B:204:0x041d, B:206:0x042a, B:226:0x04a1, B:228:0x04a9, B:242:0x04ea, B:244:0x04f4, B:262:0x052c, B:207:0x0435, B:208:0x0436, B:209:0x0437, B:210:0x0444, B:213:0x044c, B:216:0x045a, B:218:0x0460, B:220:0x046b, B:221:0x047f, B:222:0x0480, B:223:0x0481, B:224:0x048e, B:171:0x038f, B:172:0x0390, B:173:0x0391, B:175:0x039e, B:178:0x03a8, B:181:0x03b1, B:183:0x03b7, B:185:0x03c2, B:186:0x03d2, B:187:0x03d3, B:188:0x03d4, B:189:0x03dc, B:267:0x054c, B:269:0x0559, B:271:0x0564, B:273:0x056a, B:275:0x0576, B:285:0x05b0, B:288:0x05d2, B:293:0x05ea, B:296:0x05f3, B:383:0x0742, B:305:0x0619, B:308:0x0624, B:310:0x063d, B:342:0x06be, B:309:0x062f, B:325:0x066f, B:331:0x0688, B:335:0x069f, B:339:0x06b6, B:347:0x06d8, B:351:0x06e4, B:355:0x06ed, B:363:0x0700, B:372:0x0716, B:374:0x0722, B:376:0x0727, B:378:0x072b, B:379:0x0732, B:367:0x0709, B:74:0x01a2, B:76:0x01ac, B:79:0x01b5, B:81:0x01bb, B:83:0x01c6, B:84:0x01d0, B:85:0x01d1, B:86:0x01d2, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x016d, B:63:0x017c, B:70:0x018c, B:67:0x0186, B:69:0x018b, B:387:0x0766, B:389:0x0772, B:390:0x0779, B:392:0x0780, B:395:0x0784, B:397:0x078e, B:399:0x0798, B:403:0x07a0, B:401:0x079d, B:406:0x07b8, B:410:0x07c0, B:416:0x07e2), top: B:447:0x0008, inners: #1, #8, #9, #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04a9 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x0195, B:90:0x01ee, B:93:0x0202, B:95:0x0208, B:97:0x0210, B:99:0x0218, B:101:0x0220, B:103:0x0228, B:105:0x0230, B:107:0x0236, B:109:0x023e, B:111:0x0246, B:113:0x024c, B:115:0x0252, B:117:0x0258, B:119:0x0260, B:122:0x0269, B:411:0x07c3, B:124:0x029c, B:127:0x02a4, B:129:0x02ad, B:131:0x02be, B:133:0x02c8, B:135:0x02d8, B:137:0x02de, B:139:0x02f4, B:141:0x02fa, B:280:0x0589, B:134:0x02cf, B:143:0x0309, B:146:0x0317, B:264:0x0539, B:149:0x0334, B:151:0x033c, B:153:0x0344, B:155:0x034c, B:162:0x0360, B:165:0x0373, B:167:0x0379, B:169:0x0386, B:191:0x03ee, B:193:0x03f4, B:195:0x03fa, B:197:0x0402, B:199:0x0408, B:202:0x0417, B:204:0x041d, B:206:0x042a, B:226:0x04a1, B:228:0x04a9, B:242:0x04ea, B:244:0x04f4, B:262:0x052c, B:207:0x0435, B:208:0x0436, B:209:0x0437, B:210:0x0444, B:213:0x044c, B:216:0x045a, B:218:0x0460, B:220:0x046b, B:221:0x047f, B:222:0x0480, B:223:0x0481, B:224:0x048e, B:171:0x038f, B:172:0x0390, B:173:0x0391, B:175:0x039e, B:178:0x03a8, B:181:0x03b1, B:183:0x03b7, B:185:0x03c2, B:186:0x03d2, B:187:0x03d3, B:188:0x03d4, B:189:0x03dc, B:267:0x054c, B:269:0x0559, B:271:0x0564, B:273:0x056a, B:275:0x0576, B:285:0x05b0, B:288:0x05d2, B:293:0x05ea, B:296:0x05f3, B:383:0x0742, B:305:0x0619, B:308:0x0624, B:310:0x063d, B:342:0x06be, B:309:0x062f, B:325:0x066f, B:331:0x0688, B:335:0x069f, B:339:0x06b6, B:347:0x06d8, B:351:0x06e4, B:355:0x06ed, B:363:0x0700, B:372:0x0716, B:374:0x0722, B:376:0x0727, B:378:0x072b, B:379:0x0732, B:367:0x0709, B:74:0x01a2, B:76:0x01ac, B:79:0x01b5, B:81:0x01bb, B:83:0x01c6, B:84:0x01d0, B:85:0x01d1, B:86:0x01d2, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x016d, B:63:0x017c, B:70:0x018c, B:67:0x0186, B:69:0x018b, B:387:0x0766, B:389:0x0772, B:390:0x0779, B:392:0x0780, B:395:0x0784, B:397:0x078e, B:399:0x0798, B:403:0x07a0, B:401:0x079d, B:406:0x07b8, B:410:0x07c0, B:416:0x07e2), top: B:447:0x0008, inners: #1, #8, #9, #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04f4 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TRY_LEAVE, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x0195, B:90:0x01ee, B:93:0x0202, B:95:0x0208, B:97:0x0210, B:99:0x0218, B:101:0x0220, B:103:0x0228, B:105:0x0230, B:107:0x0236, B:109:0x023e, B:111:0x0246, B:113:0x024c, B:115:0x0252, B:117:0x0258, B:119:0x0260, B:122:0x0269, B:411:0x07c3, B:124:0x029c, B:127:0x02a4, B:129:0x02ad, B:131:0x02be, B:133:0x02c8, B:135:0x02d8, B:137:0x02de, B:139:0x02f4, B:141:0x02fa, B:280:0x0589, B:134:0x02cf, B:143:0x0309, B:146:0x0317, B:264:0x0539, B:149:0x0334, B:151:0x033c, B:153:0x0344, B:155:0x034c, B:162:0x0360, B:165:0x0373, B:167:0x0379, B:169:0x0386, B:191:0x03ee, B:193:0x03f4, B:195:0x03fa, B:197:0x0402, B:199:0x0408, B:202:0x0417, B:204:0x041d, B:206:0x042a, B:226:0x04a1, B:228:0x04a9, B:242:0x04ea, B:244:0x04f4, B:262:0x052c, B:207:0x0435, B:208:0x0436, B:209:0x0437, B:210:0x0444, B:213:0x044c, B:216:0x045a, B:218:0x0460, B:220:0x046b, B:221:0x047f, B:222:0x0480, B:223:0x0481, B:224:0x048e, B:171:0x038f, B:172:0x0390, B:173:0x0391, B:175:0x039e, B:178:0x03a8, B:181:0x03b1, B:183:0x03b7, B:185:0x03c2, B:186:0x03d2, B:187:0x03d3, B:188:0x03d4, B:189:0x03dc, B:267:0x054c, B:269:0x0559, B:271:0x0564, B:273:0x056a, B:275:0x0576, B:285:0x05b0, B:288:0x05d2, B:293:0x05ea, B:296:0x05f3, B:383:0x0742, B:305:0x0619, B:308:0x0624, B:310:0x063d, B:342:0x06be, B:309:0x062f, B:325:0x066f, B:331:0x0688, B:335:0x069f, B:339:0x06b6, B:347:0x06d8, B:351:0x06e4, B:355:0x06ed, B:363:0x0700, B:372:0x0716, B:374:0x0722, B:376:0x0727, B:378:0x072b, B:379:0x0732, B:367:0x0709, B:74:0x01a2, B:76:0x01ac, B:79:0x01b5, B:81:0x01bb, B:83:0x01c6, B:84:0x01d0, B:85:0x01d1, B:86:0x01d2, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x016d, B:63:0x017c, B:70:0x018c, B:67:0x0186, B:69:0x018b, B:387:0x0766, B:389:0x0772, B:390:0x0779, B:392:0x0780, B:395:0x0784, B:397:0x078e, B:399:0x0798, B:403:0x07a0, B:401:0x079d, B:406:0x07b8, B:410:0x07c0, B:416:0x07e2), top: B:447:0x0008, inners: #1, #8, #9, #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a2 A[Catch: IOException -> 0x0096, XmlPullParserException -> 0x0099, TryCatch #17 {IOException -> 0x0096, XmlPullParserException -> 0x0099, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0087, B:16:0x008f, B:23:0x009f, B:25:0x00a7, B:29:0x00bd, B:31:0x00d8, B:33:0x00e2, B:34:0x00e6, B:36:0x00f2, B:37:0x00f6, B:71:0x0195, B:90:0x01ee, B:93:0x0202, B:95:0x0208, B:97:0x0210, B:99:0x0218, B:101:0x0220, B:103:0x0228, B:105:0x0230, B:107:0x0236, B:109:0x023e, B:111:0x0246, B:113:0x024c, B:115:0x0252, B:117:0x0258, B:119:0x0260, B:122:0x0269, B:411:0x07c3, B:124:0x029c, B:127:0x02a4, B:129:0x02ad, B:131:0x02be, B:133:0x02c8, B:135:0x02d8, B:137:0x02de, B:139:0x02f4, B:141:0x02fa, B:280:0x0589, B:134:0x02cf, B:143:0x0309, B:146:0x0317, B:264:0x0539, B:149:0x0334, B:151:0x033c, B:153:0x0344, B:155:0x034c, B:162:0x0360, B:165:0x0373, B:167:0x0379, B:169:0x0386, B:191:0x03ee, B:193:0x03f4, B:195:0x03fa, B:197:0x0402, B:199:0x0408, B:202:0x0417, B:204:0x041d, B:206:0x042a, B:226:0x04a1, B:228:0x04a9, B:242:0x04ea, B:244:0x04f4, B:262:0x052c, B:207:0x0435, B:208:0x0436, B:209:0x0437, B:210:0x0444, B:213:0x044c, B:216:0x045a, B:218:0x0460, B:220:0x046b, B:221:0x047f, B:222:0x0480, B:223:0x0481, B:224:0x048e, B:171:0x038f, B:172:0x0390, B:173:0x0391, B:175:0x039e, B:178:0x03a8, B:181:0x03b1, B:183:0x03b7, B:185:0x03c2, B:186:0x03d2, B:187:0x03d3, B:188:0x03d4, B:189:0x03dc, B:267:0x054c, B:269:0x0559, B:271:0x0564, B:273:0x056a, B:275:0x0576, B:285:0x05b0, B:288:0x05d2, B:293:0x05ea, B:296:0x05f3, B:383:0x0742, B:305:0x0619, B:308:0x0624, B:310:0x063d, B:342:0x06be, B:309:0x062f, B:325:0x066f, B:331:0x0688, B:335:0x069f, B:339:0x06b6, B:347:0x06d8, B:351:0x06e4, B:355:0x06ed, B:363:0x0700, B:372:0x0716, B:374:0x0722, B:376:0x0727, B:378:0x072b, B:379:0x0732, B:367:0x0709, B:74:0x01a2, B:76:0x01ac, B:79:0x01b5, B:81:0x01bb, B:83:0x01c6, B:84:0x01d0, B:85:0x01d1, B:86:0x01d2, B:41:0x0112, B:43:0x011e, B:46:0x012a, B:48:0x0130, B:50:0x013d, B:60:0x015e, B:62:0x016d, B:63:0x017c, B:70:0x018c, B:67:0x0186, B:69:0x018b, B:387:0x0766, B:389:0x0772, B:390:0x0779, B:392:0x0780, B:395:0x0784, B:397:0x078e, B:399:0x0798, B:403:0x07a0, B:401:0x079d, B:406:0x07b8, B:410:0x07c0, B:416:0x07e2), top: B:447:0x0008, inners: #1, #8, #9, #10, #14 }] */
    /* JADX WARN: Type inference failed for: r50v1, types: [com.google.android.gms.internal.ads.q7, java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.r7 a(int r49, int r50, byte[] r51) throws org.xmlpull.v1.XmlPullParserException, com.google.android.gms.internal.ads.q6, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 2062
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.o7.a(int, int, byte[]):com.google.android.gms.internal.ads.r7");
    }

    @Override // com.google.android.gms.internal.ads.s6
    public final void d(byte[] bArr, int i4, int i10, ca.c cVar) {
        nn1.c(a(i4, i10, bArr), cVar);
    }
}
