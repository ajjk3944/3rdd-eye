package com.bytedance.sdk.openadsdk.core.sup.emc.emc;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.sup.emc.emc.bw;
import com.bytedance.sdk.openadsdk.core.sup.xq.emc;
import com.bytedance.sdk.openadsdk.core.sup.ypw.xq;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.jmdns.impl.constants.DNSConstants;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class xq {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void emc(org.xmlpull.v1.XmlPullParser r8, com.bytedance.sdk.openadsdk.core.sup.emc r9, int r10, double r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.next()
            r3 = 3
            if (r2 != r3) goto L17
            java.lang.String r2 = r8.getName()
            java.lang.String r4 = "Linear"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L16
            goto L17
        L16:
            return
        L17:
            int r2 = r8.getEventType()
            r4 = 2
            if (r2 != r4) goto L2
            if (r1 == 0) goto L2d
            java.lang.String r2 = r9.uym()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L2d
            com.bytedance.sdk.openadsdk.core.sup.emc.emc.bw.emc(r8)
        L2d:
            java.lang.String r2 = r8.getName()
            r2.getClass()
            int r5 = r2.hashCode()
            r6 = 1
            r7 = -1
            switch(r5) {
                case -2049897434: goto L69;
                case -1927368268: goto L5e;
                case -385055469: goto L53;
                case 70476538: goto L4a;
                case 611554000: goto L3f;
                default: goto L3d;
            }
        L3d:
            r3 = r7
            goto L73
        L3f:
            java.lang.String r3 = "TrackingEvents"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L48
            goto L3d
        L48:
            r3 = 4
            goto L73
        L4a:
            java.lang.String r4 = "Icons"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L73
            goto L3d
        L53:
            java.lang.String r3 = "MediaFiles"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L5c
            goto L3d
        L5c:
            r3 = r4
            goto L73
        L5e:
            java.lang.String r3 = "Duration"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L67
            goto L3d
        L67:
            r3 = r6
            goto L73
        L69:
            java.lang.String r3 = "VideoClicks"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L72
            goto L3d
        L72:
            r3 = r0
        L73:
            switch(r3) {
                case 0: goto La2;
                case 1: goto L99;
                case 2: goto L93;
                case 3: goto L82;
                case 4: goto L7a;
                default: goto L76;
            }
        L76:
            com.bytedance.sdk.openadsdk.core.sup.emc.emc.bw.emc(r8)
            goto L2
        L7a:
            com.bytedance.sdk.openadsdk.core.sup.dg r2 = r9.emc()
            emc(r8, r2)
            goto L2
        L82:
            com.bytedance.sdk.openadsdk.core.sup.ypw r2 = emc(r8)
            if (r2 == 0) goto L2
            com.bytedance.sdk.openadsdk.core.sup.ypw r3 = r9.ypw()
            if (r3 != 0) goto L2
            r9.emc(r2)
            goto L2
        L93:
            emc(r8, r10, r11, r9)
            r1 = r6
            goto L2
        L99:
            double r2 = ypw(r8)
            r9.emc(r2)
            goto L2
        La2:
            emc(r8, r9)
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.sup.emc.emc.xq.emc(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.sup.emc, int, double):void");
    }

    private static List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> xq(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return emc(xmlPullParser, false);
    }

    public static double ypw(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (bw.ypw(xmlPullParser, "Duration").split(":").length != 3) {
            return 0.0d;
        }
        try {
            return (Integer.parseInt(r2[0].trim()) * DNSConstants.DNS_TTL) + (Integer.parseInt(r2[1].trim()) * 60) + Float.parseFloat(r2[2].trim());
        } catch (Exception unused) {
            return 0.0d;
        }
    }

    private static String emc(XmlPullParser xmlPullParser, int i10, double d10, com.bytedance.sdk.openadsdk.core.sup.emc emcVar) throws XmlPullParserException, IOException {
        double d11 = Double.NEGATIVE_INFINITY;
        String str = null;
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MIN_VALUE;
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("MediaFiles")) {
                break;
            }
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("MediaFile")) {
                String str2 = bw.uym;
                String attributeValue = xmlPullParser.getAttributeValue(str2, HandleInvocationsFromAdViewer.KEY_AD_TYPE);
                int iYpw = bw.ypw(xmlPullParser.getAttributeValue(str2, "width"));
                int iYpw2 = bw.ypw(xmlPullParser.getAttributeValue(str2, "height"));
                int iYpw3 = bw.ypw(xmlPullParser.getAttributeValue(str2, "bitrate"));
                String strYpw = bw.ypw(xmlPullParser, "MediaFile");
                if (iYpw > 0 && iYpw2 > 0 && com.bytedance.sdk.openadsdk.core.sup.xq.dg.emc.contains(attributeValue) && !TextUtils.isEmpty(strYpw)) {
                    double dEmc = com.bytedance.sdk.openadsdk.core.sup.xq.dg.emc(i10, d10, iYpw, iYpw2, iYpw3, attributeValue);
                    if (dEmc > d11) {
                        str = strYpw;
                        d11 = dEmc;
                        i11 = iYpw;
                        i12 = iYpw2;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            emcVar.dg(str);
            emcVar.emc(i11);
            emcVar.ypw(i12);
        }
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.bytedance.sdk.openadsdk.core.sup.ypw emc(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        com.bytedance.sdk.openadsdk.core.sup.ypw ypwVar;
        com.bytedance.sdk.openadsdk.core.sup.ypw ypwVar2;
        int i10;
        int i11;
        int i12;
        emc.EnumC0157emc enumC0157emc;
        com.bytedance.sdk.openadsdk.core.sup.ypw ypwVar3 = null;
        while (true) {
            int i13 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("Icons")) {
                return ypwVar3;
            }
            xmlPullParser.next();
            int i14 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Icon")) {
                String str = bw.uym;
                int iYpw = bw.ypw(xmlPullParser.getAttributeValue(str, "width"));
                int iYpw2 = bw.ypw(xmlPullParser.getAttributeValue(str, "height"));
                if (iYpw > 0 && iYpw <= 300 && iYpw2 > 0 && iYpw2 <= 300) {
                    int iEmc = com.bytedance.sdk.openadsdk.core.sup.ypw.emc.emc(xmlPullParser.getAttributeValue(str, "offset"));
                    int iEmc2 = com.bytedance.sdk.openadsdk.core.sup.ypw.emc.emc(xmlPullParser.getAttributeValue(str, "duration"));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    bw.emc emcVar = null;
                    String strYpw = null;
                    while (true) {
                        if (xmlPullParser.next() == i13 && xmlPullParser.getName().equals("Icon")) {
                            if (emcVar != null && (ypwVar3 == null || TextUtils.isEmpty(ypwVar3.ycc()))) {
                                ypwVar3 = new com.bytedance.sdk.openadsdk.core.sup.ypw(iYpw, iYpw2, iEmc, iEmc2, emcVar.ypw, emcVar.xq, emcVar.emc, arrayList, arrayList2, strYpw);
                                bw.emc(xmlPullParser, "Icons", i13);
                            }
                        } else {
                            ArrayList arrayList3 = arrayList;
                            ArrayList arrayList4 = arrayList2;
                            if (xmlPullParser.getEventType() == i14) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                ypwVar2 = ypwVar3;
                                i10 = iEmc2;
                                switch (name) {
                                    case "IconViewTracking":
                                        i11 = 3;
                                        i12 = 2;
                                        arrayList4.add(new xq.emc(bw.ypw(xmlPullParser, "IconViewTracking")).emc());
                                        break;
                                    case "IFrameResource":
                                        i11 = 3;
                                        i12 = 2;
                                        if (emcVar == null) {
                                            emcVar = new bw.emc(bw.ypw(xmlPullParser, "IFrameResource"), emc.EnumC0157emc.NONE, emc.ypw.IFRAME_RESOURCE);
                                            break;
                                        } else {
                                            bw.emc(xmlPullParser);
                                            break;
                                        }
                                    case "StaticResource":
                                        i11 = 3;
                                        i12 = 2;
                                        emc.EnumC0157emc enumC0157emc2 = emc.EnumC0157emc.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(bw.uym, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.sup.xq.emc.emc;
                                        String strYpw2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.sup.xq.emc.ypw.contains(lowerCase)) ? bw.ypw(xmlPullParser, "StaticResource") : null;
                                        if (set.contains(lowerCase)) {
                                            enumC0157emc = emc.EnumC0157emc.IMAGE;
                                        } else {
                                            enumC0157emc = emc.EnumC0157emc.JAVASCRIPT;
                                        }
                                        emcVar = new bw.emc(strYpw2, enumC0157emc, emc.ypw.STATIC_RESOURCE);
                                        break;
                                    case "IconClicks":
                                        while (true) {
                                            i11 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("IconClicks")) {
                                                i12 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2) {
                                                if (xmlPullParser.getName().equals("IconClickThrough")) {
                                                    strYpw = bw.ypw(xmlPullParser, "IconClickThrough");
                                                } else if (xmlPullParser.getName().equals("IconClickTracking")) {
                                                    arrayList3.add(new xq.emc(bw.ypw(xmlPullParser, "IconClickTracking")).emc());
                                                }
                                            }
                                        }
                                        break;
                                    case "HTMLResource":
                                        if (emcVar == null || emcVar.xq == emc.ypw.IFRAME_RESOURCE) {
                                            emcVar = new bw.emc(bw.ypw(xmlPullParser, "HTMLResource"), emc.EnumC0157emc.NONE, emc.ypw.HTML_RESOURCE);
                                            ypwVar3 = ypwVar2;
                                            iEmc2 = i10;
                                            i13 = 3;
                                            i14 = 2;
                                            break;
                                        }
                                        i11 = 3;
                                        i12 = 2;
                                        bw.emc(xmlPullParser);
                                        break;
                                    default:
                                        i11 = 3;
                                        i12 = 2;
                                        bw.emc(xmlPullParser);
                                        break;
                                }
                                arrayList = arrayList3;
                                arrayList2 = arrayList4;
                            } else {
                                ypwVar2 = ypwVar3;
                                i10 = iEmc2;
                                i11 = i13;
                                i12 = i14;
                            }
                            i13 = i11;
                            i14 = i12;
                            ypwVar3 = ypwVar2;
                            iEmc2 = i10;
                            arrayList = arrayList3;
                            arrayList2 = arrayList4;
                        }
                    }
                } else {
                    ypwVar = ypwVar3;
                    bw.emc(xmlPullParser);
                    ypwVar3 = ypwVar;
                }
            } else {
                ypwVar = ypwVar3;
                ypwVar3 = ypwVar;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void emc(org.xmlpull.v1.XmlPullParser r8, com.bytedance.sdk.openadsdk.core.sup.dg r9) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.sup.emc.emc.xq.emc(org.xmlpull.v1.XmlPullParser, com.bytedance.sdk.openadsdk.core.sup.dg):void");
    }

    private static void emc(XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.sup.emc emcVar) throws XmlPullParserException, IOException {
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("VideoClicks")) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                name.getClass();
                if (name.equals("ClickThrough")) {
                    emcVar.xq(bw.ypw(xmlPullParser, "ClickThrough"));
                } else if (!name.equals("ClickTracking")) {
                    bw.emc(xmlPullParser);
                } else {
                    emcVar.emc().uym(bw.emc(xmlPullParser, "ClickTracking"));
                }
            }
        }
    }

    private static List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> emc(XmlPullParser xmlPullParser, boolean z10) throws XmlPullParserException, IOException {
        return bw.emc(xmlPullParser, "Tracking", z10);
    }
}
