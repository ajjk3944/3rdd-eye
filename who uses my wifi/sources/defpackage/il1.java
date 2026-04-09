package defpackage;

import android.text.Layout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class il1 implements kk1 {
    public static final Pattern g = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern h = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern i = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern j = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern k = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    public static final Pattern l = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    public static final Pattern m = Pattern.compile("^(\\d+) (\\d+)$");
    public static final hl1 n = new hl1(30.0f, 1, 1);
    public final XmlPullParserFactory f;

    public il1() throws XmlPullParserException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            this.f = xmlPullParserFactoryNewInstance;
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
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
    /* JADX WARN: Removed duplicated region for block: B:122:0x0217 A[Catch: ik1 -> 0x027f, TryCatch #2 {ik1 -> 0x027f, blocks: (B:91:0x01a6, B:94:0x01c1, B:97:0x01d3, B:99:0x01d9, B:101:0x01e0, B:110:0x01f8, B:120:0x0211, B:122:0x0217, B:123:0x021f, B:124:0x0220, B:125:0x023d, B:114:0x0203, B:119:0x020f, B:126:0x023e, B:127:0x023f, B:128:0x025c, B:96:0x01c8, B:129:0x025d, B:130:0x027e), top: B:232:0x01a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x021f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.kl1 b(org.xmlpull.v1.XmlPullParser r16, defpackage.kl1 r17) throws defpackage.ik1 {
        /*
            Method dump skipped, instructions count: 1254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il1.b(org.xmlpull.v1.XmlPullParser, kl1):kl1");
    }

    public static kl1 c(kl1 kl1Var) {
        return kl1Var == null ? new kl1() : kl1Var;
    }

    public static Layout.Alignment d(String str) {
        String strD = um.D(str);
        switch (strD.hashCode()) {
            case -1364013995:
                if (strD.equals("center")) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                return null;
            case 100571:
                if (!strD.equals("end")) {
                    return null;
                }
                break;
            case 3317767:
                if (!strD.equals("left")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            case 108511772:
                if (!strD.equals("right")) {
                    return null;
                }
                break;
            case 109757538:
                if (!strD.equals("start")) {
                    return null;
                }
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
        return Layout.Alignment.ALIGN_OPPOSITE;
    }

    public static long e(String str, hl1 hl1Var) throws NumberFormatException, ik1 {
        double d;
        double d2;
        Matcher matcher = g.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            long j2 = Long.parseLong(strGroup) * 3600;
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            long j3 = Long.parseLong(strGroup2) * 60;
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            double d3 = j2 + j3;
            double d4 = Long.parseLong(strGroup3);
            String strGroup4 = matcher.group(4);
            double d5 = strGroup4 != null ? Double.parseDouble(strGroup4) : 0.0d;
            double d6 = d3 + d4;
            return (long) ((d6 + d5 + (matcher.group(5) != null ? Long.parseLong(r12) / hl1Var.a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r12) / hl1Var.b) / hl1Var.a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = h.matcher(str);
        if (!matcher2.matches()) {
            throw new ik1("Malformed time expression: ".concat(String.valueOf(str)));
        }
        String strGroup5 = matcher2.group(1);
        strGroup5.getClass();
        double d7 = Double.parseDouble(strGroup5);
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
                            d = hl1Var.c;
                            d7 /= d;
                        }
                    } else if (strGroup6.equals("ms")) {
                        d = 1000.0d;
                        d7 /= d;
                    }
                } else if (strGroup6.equals("m")) {
                    d2 = 60.0d;
                    d7 *= d2;
                }
            } else if (strGroup6.equals("h")) {
                d2 = 3600.0d;
                d7 *= d2;
            }
        } else if (strGroup6.equals("f")) {
            d = hl1Var.a;
            d7 /= d;
        }
        return (long) (d7 * 1000000.0d);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:283|(2:423|284)|(3:286|287|404)|459|338|(3:340|(1:349)(4:342|(1:344)(1:345)|346|(2:348|349)(1:350))|404)(1:351)|352|(3:354|(1:356)(2:(2:359|(1:361))|362)|357)(1:363)|364|365|432|366|(3:368|(1:370)|371)) */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0717, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:287:0x05ca. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03f9 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #15 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:71:0x0189, B:90:0x01e2, B:93:0x01f6, B:95:0x01fc, B:97:0x0204, B:99:0x020c, B:101:0x0214, B:103:0x021c, B:105:0x0224, B:107:0x022a, B:109:0x0232, B:111:0x023a, B:113:0x0240, B:115:0x0246, B:117:0x024c, B:119:0x0254, B:122:0x025d, B:404:0x0793, B:124:0x028b, B:127:0x0293, B:129:0x029c, B:131:0x02ad, B:133:0x02b7, B:135:0x02c7, B:137:0x02cd, B:139:0x02e3, B:141:0x02e9, B:279:0x0579, B:134:0x02be, B:143:0x02f6, B:146:0x0304, B:263:0x0528, B:149:0x0323, B:151:0x032b, B:153:0x0333, B:155:0x033b, B:162:0x034f, B:165:0x0362, B:167:0x0368, B:169:0x0375, B:190:0x03df, B:192:0x03e5, B:194:0x03eb, B:196:0x03f3, B:198:0x03f9, B:201:0x0408, B:203:0x040e, B:205:0x041b, B:225:0x0490, B:227:0x0498, B:241:0x04d9, B:243:0x04e3, B:261:0x051b, B:206:0x0426, B:207:0x0427, B:208:0x0428, B:209:0x0435, B:212:0x043d, B:215:0x044b, B:217:0x0451, B:219:0x045c, B:220:0x0470, B:221:0x0471, B:222:0x0472, B:223:0x047f, B:170:0x037e, B:171:0x037f, B:172:0x0380, B:174:0x038d, B:177:0x0397, B:180:0x03a0, B:182:0x03a6, B:184:0x03b1, B:185:0x03c3, B:186:0x03c4, B:187:0x03c5, B:188:0x03cd, B:266:0x053b, B:268:0x0549, B:270:0x0554, B:272:0x055a, B:274:0x0566, B:284:0x059c, B:286:0x05be, B:291:0x05d6, B:294:0x05df, B:376:0x0718, B:304:0x0603, B:307:0x060e, B:309:0x0627, B:337:0x069b, B:308:0x0618, B:320:0x064f, B:326:0x0667, B:330:0x067d, B:334:0x0693, B:340:0x06ae, B:344:0x06ba, B:348:0x06c3, B:356:0x06d5, B:364:0x06e8, B:366:0x06f6, B:368:0x06fb, B:370:0x06ff, B:371:0x0706, B:359:0x06dc, B:74:0x0196, B:76:0x01a0, B:79:0x01a9, B:81:0x01af, B:83:0x01ba, B:84:0x01c4, B:85:0x01c5, B:86:0x01c6, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0139, B:60:0x015a, B:62:0x015e, B:63:0x0171, B:70:0x0181, B:67:0x017b, B:69:0x0180, B:380:0x0739, B:382:0x0745, B:383:0x074c, B:385:0x0753, B:388:0x0757, B:390:0x0761, B:392:0x076b, B:396:0x0773, B:394:0x0770, B:399:0x0788, B:403:0x0790, B:409:0x07af), top: B:436:0x0008, inners: #0, #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0498 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #15 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:71:0x0189, B:90:0x01e2, B:93:0x01f6, B:95:0x01fc, B:97:0x0204, B:99:0x020c, B:101:0x0214, B:103:0x021c, B:105:0x0224, B:107:0x022a, B:109:0x0232, B:111:0x023a, B:113:0x0240, B:115:0x0246, B:117:0x024c, B:119:0x0254, B:122:0x025d, B:404:0x0793, B:124:0x028b, B:127:0x0293, B:129:0x029c, B:131:0x02ad, B:133:0x02b7, B:135:0x02c7, B:137:0x02cd, B:139:0x02e3, B:141:0x02e9, B:279:0x0579, B:134:0x02be, B:143:0x02f6, B:146:0x0304, B:263:0x0528, B:149:0x0323, B:151:0x032b, B:153:0x0333, B:155:0x033b, B:162:0x034f, B:165:0x0362, B:167:0x0368, B:169:0x0375, B:190:0x03df, B:192:0x03e5, B:194:0x03eb, B:196:0x03f3, B:198:0x03f9, B:201:0x0408, B:203:0x040e, B:205:0x041b, B:225:0x0490, B:227:0x0498, B:241:0x04d9, B:243:0x04e3, B:261:0x051b, B:206:0x0426, B:207:0x0427, B:208:0x0428, B:209:0x0435, B:212:0x043d, B:215:0x044b, B:217:0x0451, B:219:0x045c, B:220:0x0470, B:221:0x0471, B:222:0x0472, B:223:0x047f, B:170:0x037e, B:171:0x037f, B:172:0x0380, B:174:0x038d, B:177:0x0397, B:180:0x03a0, B:182:0x03a6, B:184:0x03b1, B:185:0x03c3, B:186:0x03c4, B:187:0x03c5, B:188:0x03cd, B:266:0x053b, B:268:0x0549, B:270:0x0554, B:272:0x055a, B:274:0x0566, B:284:0x059c, B:286:0x05be, B:291:0x05d6, B:294:0x05df, B:376:0x0718, B:304:0x0603, B:307:0x060e, B:309:0x0627, B:337:0x069b, B:308:0x0618, B:320:0x064f, B:326:0x0667, B:330:0x067d, B:334:0x0693, B:340:0x06ae, B:344:0x06ba, B:348:0x06c3, B:356:0x06d5, B:364:0x06e8, B:366:0x06f6, B:368:0x06fb, B:370:0x06ff, B:371:0x0706, B:359:0x06dc, B:74:0x0196, B:76:0x01a0, B:79:0x01a9, B:81:0x01af, B:83:0x01ba, B:84:0x01c4, B:85:0x01c5, B:86:0x01c6, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0139, B:60:0x015a, B:62:0x015e, B:63:0x0171, B:70:0x0181, B:67:0x017b, B:69:0x0180, B:380:0x0739, B:382:0x0745, B:383:0x074c, B:385:0x0753, B:388:0x0757, B:390:0x0761, B:392:0x076b, B:396:0x0773, B:394:0x0770, B:399:0x0788, B:403:0x0790, B:409:0x07af), top: B:436:0x0008, inners: #0, #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04e3 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TRY_LEAVE, TryCatch #15 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:71:0x0189, B:90:0x01e2, B:93:0x01f6, B:95:0x01fc, B:97:0x0204, B:99:0x020c, B:101:0x0214, B:103:0x021c, B:105:0x0224, B:107:0x022a, B:109:0x0232, B:111:0x023a, B:113:0x0240, B:115:0x0246, B:117:0x024c, B:119:0x0254, B:122:0x025d, B:404:0x0793, B:124:0x028b, B:127:0x0293, B:129:0x029c, B:131:0x02ad, B:133:0x02b7, B:135:0x02c7, B:137:0x02cd, B:139:0x02e3, B:141:0x02e9, B:279:0x0579, B:134:0x02be, B:143:0x02f6, B:146:0x0304, B:263:0x0528, B:149:0x0323, B:151:0x032b, B:153:0x0333, B:155:0x033b, B:162:0x034f, B:165:0x0362, B:167:0x0368, B:169:0x0375, B:190:0x03df, B:192:0x03e5, B:194:0x03eb, B:196:0x03f3, B:198:0x03f9, B:201:0x0408, B:203:0x040e, B:205:0x041b, B:225:0x0490, B:227:0x0498, B:241:0x04d9, B:243:0x04e3, B:261:0x051b, B:206:0x0426, B:207:0x0427, B:208:0x0428, B:209:0x0435, B:212:0x043d, B:215:0x044b, B:217:0x0451, B:219:0x045c, B:220:0x0470, B:221:0x0471, B:222:0x0472, B:223:0x047f, B:170:0x037e, B:171:0x037f, B:172:0x0380, B:174:0x038d, B:177:0x0397, B:180:0x03a0, B:182:0x03a6, B:184:0x03b1, B:185:0x03c3, B:186:0x03c4, B:187:0x03c5, B:188:0x03cd, B:266:0x053b, B:268:0x0549, B:270:0x0554, B:272:0x055a, B:274:0x0566, B:284:0x059c, B:286:0x05be, B:291:0x05d6, B:294:0x05df, B:376:0x0718, B:304:0x0603, B:307:0x060e, B:309:0x0627, B:337:0x069b, B:308:0x0618, B:320:0x064f, B:326:0x0667, B:330:0x067d, B:334:0x0693, B:340:0x06ae, B:344:0x06ba, B:348:0x06c3, B:356:0x06d5, B:364:0x06e8, B:366:0x06f6, B:368:0x06fb, B:370:0x06ff, B:371:0x0706, B:359:0x06dc, B:74:0x0196, B:76:0x01a0, B:79:0x01a9, B:81:0x01af, B:83:0x01ba, B:84:0x01c4, B:85:0x01c5, B:86:0x01c6, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0139, B:60:0x015a, B:62:0x015e, B:63:0x0171, B:70:0x0181, B:67:0x017b, B:69:0x0180, B:380:0x0739, B:382:0x0745, B:383:0x074c, B:385:0x0753, B:388:0x0757, B:390:0x0761, B:392:0x076b, B:396:0x0773, B:394:0x0770, B:399:0x0788, B:403:0x0790, B:409:0x07af), top: B:436:0x0008, inners: #0, #1, #2, #5, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0196 A[Catch: IOException -> 0x0092, XmlPullParserException -> 0x0095, TryCatch #15 {IOException -> 0x0092, XmlPullParserException -> 0x0095, blocks: (B:3:0x0008, B:6:0x005c, B:8:0x006b, B:11:0x0077, B:14:0x0083, B:16:0x008b, B:23:0x009b, B:25:0x00a3, B:29:0x00b9, B:31:0x00d4, B:33:0x00de, B:34:0x00e2, B:36:0x00ee, B:37:0x00f2, B:71:0x0189, B:90:0x01e2, B:93:0x01f6, B:95:0x01fc, B:97:0x0204, B:99:0x020c, B:101:0x0214, B:103:0x021c, B:105:0x0224, B:107:0x022a, B:109:0x0232, B:111:0x023a, B:113:0x0240, B:115:0x0246, B:117:0x024c, B:119:0x0254, B:122:0x025d, B:404:0x0793, B:124:0x028b, B:127:0x0293, B:129:0x029c, B:131:0x02ad, B:133:0x02b7, B:135:0x02c7, B:137:0x02cd, B:139:0x02e3, B:141:0x02e9, B:279:0x0579, B:134:0x02be, B:143:0x02f6, B:146:0x0304, B:263:0x0528, B:149:0x0323, B:151:0x032b, B:153:0x0333, B:155:0x033b, B:162:0x034f, B:165:0x0362, B:167:0x0368, B:169:0x0375, B:190:0x03df, B:192:0x03e5, B:194:0x03eb, B:196:0x03f3, B:198:0x03f9, B:201:0x0408, B:203:0x040e, B:205:0x041b, B:225:0x0490, B:227:0x0498, B:241:0x04d9, B:243:0x04e3, B:261:0x051b, B:206:0x0426, B:207:0x0427, B:208:0x0428, B:209:0x0435, B:212:0x043d, B:215:0x044b, B:217:0x0451, B:219:0x045c, B:220:0x0470, B:221:0x0471, B:222:0x0472, B:223:0x047f, B:170:0x037e, B:171:0x037f, B:172:0x0380, B:174:0x038d, B:177:0x0397, B:180:0x03a0, B:182:0x03a6, B:184:0x03b1, B:185:0x03c3, B:186:0x03c4, B:187:0x03c5, B:188:0x03cd, B:266:0x053b, B:268:0x0549, B:270:0x0554, B:272:0x055a, B:274:0x0566, B:284:0x059c, B:286:0x05be, B:291:0x05d6, B:294:0x05df, B:376:0x0718, B:304:0x0603, B:307:0x060e, B:309:0x0627, B:337:0x069b, B:308:0x0618, B:320:0x064f, B:326:0x0667, B:330:0x067d, B:334:0x0693, B:340:0x06ae, B:344:0x06ba, B:348:0x06c3, B:356:0x06d5, B:364:0x06e8, B:366:0x06f6, B:368:0x06fb, B:370:0x06ff, B:371:0x0706, B:359:0x06dc, B:74:0x0196, B:76:0x01a0, B:79:0x01a9, B:81:0x01af, B:83:0x01ba, B:84:0x01c4, B:85:0x01c5, B:86:0x01c6, B:41:0x010e, B:43:0x011a, B:46:0x0126, B:48:0x012c, B:50:0x0139, B:60:0x015a, B:62:0x015e, B:63:0x0171, B:70:0x0181, B:67:0x017b, B:69:0x0180, B:380:0x0739, B:382:0x0745, B:383:0x074c, B:385:0x0753, B:388:0x0757, B:390:0x0761, B:392:0x076b, B:396:0x0773, B:394:0x0770, B:399:0x0788, B:403:0x0790, B:409:0x07af), top: B:436:0x0008, inners: #0, #1, #2, #5, #10 }] */
    /* JADX WARN: Type inference failed for: r50v1, types: [java.lang.Throwable, kl1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.g4 a(byte[] r49, int r50, int r51) throws org.xmlpull.v1.XmlPullParserException, java.lang.NumberFormatException, java.io.IOException, defpackage.ik1 {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il1.a(byte[], int, int):g4");
    }

    @Override // defpackage.kk1
    public final void g(byte[] bArr, int i2, int i3, lk1 lk1Var) {
        a30.p(a(bArr, i2, i3), lk1Var);
    }
}
