package com.bytedance.sdk.openadsdk.core.sup.emc.emc;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.sup.emc.emc.bw;
import com.bytedance.sdk.openadsdk.core.sup.xq.emc;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class emc {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static com.bytedance.sdk.openadsdk.core.sup.xq emc(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        float f10;
        com.bytedance.sdk.openadsdk.core.sup.xq xqVar;
        bw.emc emcVar;
        int i10;
        char c10;
        if (context == null) {
            bw.emc(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        float f11 = displayMetrics.density;
        int i13 = (int) (i11 / f11);
        int i14 = (int) (i12 / f11);
        float f12 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.sup.xq xqVar2 = null;
        while (true) {
            int i15 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return xqVar2;
            }
            xmlPullParser.next();
            int i16 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Companion")) {
                String str = bw.uym;
                int iYpw = bw.ypw(xmlPullParser.getAttributeValue(str, "width"));
                int iYpw2 = bw.ypw(xmlPullParser.getAttributeValue(str, "height"));
                if (iYpw < 300 || iYpw2 < 250) {
                    f10 = f12;
                    xqVar = xqVar2;
                    bw.emc(xmlPullParser);
                    f12 = f10;
                    xqVar2 = xqVar;
                } else {
                    bw.emc emcVar2 = new bw.emc();
                    while (true) {
                        if (xmlPullParser.getEventType() != i15 || !xmlPullParser.getName().equals("Companion")) {
                            int i17 = iYpw2;
                            int i18 = iYpw;
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == i16) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                float f13 = f12;
                                com.bytedance.sdk.openadsdk.core.sup.xq xqVar3 = xqVar2;
                                char c11 = 65535;
                                switch (name.hashCode()) {
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            c10 = 0;
                                            c11 = c10;
                                            break;
                                        }
                                        break;
                                    case -348198615:
                                        if (name.equals("CompanionClickThrough")) {
                                            c10 = 1;
                                            c11 = c10;
                                            break;
                                        }
                                        break;
                                    case 611554000:
                                        if (name.equals("TrackingEvents")) {
                                            c11 = 2;
                                            break;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            c11 = 3;
                                            break;
                                        }
                                        break;
                                    case 1877773523:
                                        if (name.equals("CompanionClickTracking")) {
                                            c10 = 4;
                                            c11 = c10;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            c10 = 5;
                                            c11 = c10;
                                            break;
                                        }
                                        break;
                                }
                                switch (c11) {
                                    case 0:
                                        bw.emc emcVar3 = emcVar2;
                                        i10 = 2;
                                        Point pointEmc = com.bytedance.sdk.openadsdk.core.sup.xq.emc.emc(context, i18, i17, emc.ypw.HTML_RESOURCE);
                                        int i19 = pointEmc.x;
                                        int i20 = pointEmc.y;
                                        emc.ypw ypwVar = emc.ypw.IFRAME_RESOURCE;
                                        emc.EnumC0157emc enumC0157emc = emc.EnumC0157emc.NONE;
                                        float fEmc = com.bytedance.sdk.openadsdk.core.sup.xq.emc(i13, i14, i19, i20, ypwVar, enumC0157emc);
                                        String strYpw = bw.ypw(xmlPullParser, "IFrameResource");
                                        if (!TextUtils.isEmpty(strYpw) && fEmc > emcVar3.uym && fEmc > f13) {
                                            emcVar3.uym = fEmc;
                                            emcVar3.emc(strYpw, enumC0157emc, ypwVar);
                                            emcVar2 = emcVar3;
                                            i16 = i10;
                                            iYpw = i18;
                                            iYpw2 = i17;
                                            f12 = f13;
                                            xqVar2 = xqVar3;
                                            i15 = 3;
                                            break;
                                        } else {
                                            bw.emc(xmlPullParser, "IFrameResource", 3);
                                            emcVar2 = emcVar3;
                                            i15 = 3;
                                            i16 = 2;
                                            iYpw = i18;
                                            iYpw2 = i17;
                                            f12 = f13;
                                            xqVar2 = xqVar3;
                                            break;
                                        }
                                    case 1:
                                        i10 = 2;
                                        emcVar2.dg = bw.ypw(xmlPullParser, "CompanionClickThrough");
                                        i16 = i10;
                                        iYpw = i18;
                                        iYpw2 = i17;
                                        f12 = f13;
                                        xqVar2 = xqVar3;
                                        i15 = 3;
                                        break;
                                    case 2:
                                        emcVar = emcVar2;
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                iYpw = i18;
                                                emcVar2 = emcVar;
                                                iYpw2 = i17;
                                                f12 = f13;
                                                xqVar2 = xqVar3;
                                                i15 = 3;
                                                i16 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                emcVar.ypw(bw.ypw(xmlPullParser, "Tracking"));
                                            }
                                        }
                                        break;
                                    case 3:
                                        emcVar = emcVar2;
                                        emc.EnumC0157emc enumC0157emc2 = emc.EnumC0157emc.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(bw.uym, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.sup.xq.emc.emc;
                                        emc.EnumC0157emc enumC0157emc3 = set.contains(lowerCase) ? emc.EnumC0157emc.IMAGE : emc.EnumC0157emc.JAVASCRIPT;
                                        emc.ypw ypwVar2 = emc.ypw.STATIC_RESOURCE;
                                        Point pointEmc2 = com.bytedance.sdk.openadsdk.core.sup.xq.emc.emc(context, i18, i17, ypwVar2);
                                        float fEmc2 = com.bytedance.sdk.openadsdk.core.sup.xq.emc(i13, i14, pointEmc2.x, pointEmc2.y, ypwVar2, enumC0157emc3);
                                        String strYpw2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.sup.xq.emc.ypw.contains(lowerCase)) ? bw.ypw(xmlPullParser, "StaticResource") : null;
                                        if (fEmc2 >= emcVar.uym && fEmc2 > f13 && !TextUtils.isEmpty(strYpw2)) {
                                            emcVar.uym = fEmc2;
                                            emcVar.emc(strYpw2, enumC0157emc3, ypwVar2);
                                            iYpw = i18;
                                            emcVar2 = emcVar;
                                            iYpw2 = i17;
                                            f12 = f13;
                                            xqVar2 = xqVar3;
                                            i15 = 3;
                                            i16 = 2;
                                            break;
                                        } else {
                                            bw.emc(xmlPullParser, "StaticResource", 3);
                                            iYpw = i18;
                                            emcVar2 = emcVar;
                                            iYpw2 = i17;
                                            f12 = f13;
                                            i16 = 2;
                                            i15 = 3;
                                            xqVar2 = xqVar3;
                                            break;
                                        }
                                    case 4:
                                        emcVar2.emc(bw.ypw(xmlPullParser, "CompanionClickTracking"));
                                        iYpw = i18;
                                        iYpw2 = i17;
                                        f12 = f13;
                                        xqVar2 = xqVar3;
                                        i15 = 3;
                                        i16 = 2;
                                        break;
                                    case 5:
                                        emc.ypw ypwVar3 = emc.ypw.HTML_RESOURCE;
                                        Point pointEmc3 = com.bytedance.sdk.openadsdk.core.sup.xq.emc.emc(context, i18, i17, ypwVar3);
                                        int i21 = pointEmc3.x;
                                        int i22 = pointEmc3.y;
                                        emc.EnumC0157emc enumC0157emc4 = emc.EnumC0157emc.NONE;
                                        emcVar = emcVar2;
                                        float fEmc3 = com.bytedance.sdk.openadsdk.core.sup.xq.emc(i13, i14, i21, i22, ypwVar3, enumC0157emc4);
                                        String strYpw3 = bw.ypw(xmlPullParser, "HTMLResource");
                                        if (!TextUtils.isEmpty(strYpw3) && fEmc3 > emcVar.uym && fEmc3 > f13) {
                                            emcVar.uym = fEmc3;
                                            emcVar.emc(strYpw3, enumC0157emc4, ypwVar3);
                                            iYpw = i18;
                                            emcVar2 = emcVar;
                                            iYpw2 = i17;
                                            f12 = f13;
                                            xqVar2 = xqVar3;
                                            i15 = 3;
                                            i16 = 2;
                                            break;
                                        } else {
                                            bw.emc(xmlPullParser, "HTMLResource", 3);
                                            iYpw = i18;
                                            emcVar2 = emcVar;
                                            iYpw2 = i17;
                                            f12 = f13;
                                            xqVar2 = xqVar3;
                                            i16 = 2;
                                            i15 = 3;
                                            break;
                                        }
                                        break;
                                    default:
                                        bw.emc(xmlPullParser);
                                        emcVar = emcVar2;
                                        iYpw = i18;
                                        emcVar2 = emcVar;
                                        iYpw2 = i17;
                                        f12 = f13;
                                        xqVar2 = xqVar3;
                                        i15 = 3;
                                        i16 = 2;
                                        break;
                                }
                            } else {
                                iYpw = i18;
                                iYpw2 = i17;
                            }
                        } else if (!TextUtils.isEmpty(emcVar2.emc) && emcVar2.uym >= f12) {
                            com.bytedance.sdk.openadsdk.core.sup.xq xqVar4 = new com.bytedance.sdk.openadsdk.core.sup.xq(iYpw, iYpw2, emcVar2.ypw, emcVar2.xq, emcVar2.emc, emcVar2.bw, emcVar2.ycc, emcVar2.dg);
                            f12 = emcVar2.uym;
                            xqVar2 = xqVar4;
                        }
                    }
                }
            } else {
                f10 = f12;
                xqVar = xqVar2;
                f12 = f10;
                xqVar2 = xqVar;
            }
        }
    }
}
