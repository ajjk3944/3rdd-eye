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
        float f2;
        com.bytedance.sdk.openadsdk.core.sup.xq xqVar;
        bw.emc emcVar;
        int i;
        char c6;
        if (context == null) {
            bw.emc(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i3 = displayMetrics.widthPixels;
        int i6 = displayMetrics.heightPixels;
        float f5 = displayMetrics.density;
        int i7 = (int) (i3 / f5);
        int i8 = (int) (i6 / f5);
        float f6 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.sup.xq xqVar2 = null;
        while (true) {
            int i9 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return xqVar2;
            }
            xmlPullParser.next();
            int i10 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Companion")) {
                String str = bw.uym;
                int iYpw = bw.ypw(xmlPullParser.getAttributeValue(str, "width"));
                int iYpw2 = bw.ypw(xmlPullParser.getAttributeValue(str, "height"));
                if (iYpw < 300 || iYpw2 < 250) {
                    f2 = f6;
                    xqVar = xqVar2;
                    bw.emc(xmlPullParser);
                    f6 = f2;
                    xqVar2 = xqVar;
                } else {
                    bw.emc emcVar2 = new bw.emc();
                    while (true) {
                        if (xmlPullParser.getEventType() != i9 || !xmlPullParser.getName().equals("Companion")) {
                            int i11 = iYpw2;
                            int i12 = iYpw;
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == i10) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                float f7 = f6;
                                com.bytedance.sdk.openadsdk.core.sup.xq xqVar3 = xqVar2;
                                char c7 = 65535;
                                switch (name.hashCode()) {
                                    case -375340334:
                                        if (name.equals("IFrameResource")) {
                                            c6 = 0;
                                            c7 = c6;
                                            break;
                                        }
                                        break;
                                    case -348198615:
                                        if (name.equals("CompanionClickThrough")) {
                                            c6 = 1;
                                            c7 = c6;
                                            break;
                                        }
                                        break;
                                    case 611554000:
                                        if (name.equals("TrackingEvents")) {
                                            c7 = 2;
                                            break;
                                        }
                                        break;
                                    case 676623548:
                                        if (name.equals("StaticResource")) {
                                            c7 = 3;
                                            break;
                                        }
                                        break;
                                    case 1877773523:
                                        if (name.equals("CompanionClickTracking")) {
                                            c6 = 4;
                                            c7 = c6;
                                            break;
                                        }
                                        break;
                                    case 1928285401:
                                        if (name.equals("HTMLResource")) {
                                            c6 = 5;
                                            c7 = c6;
                                            break;
                                        }
                                        break;
                                }
                                switch (c7) {
                                    case 0:
                                        bw.emc emcVar3 = emcVar2;
                                        i = 2;
                                        Point pointEmc = com.bytedance.sdk.openadsdk.core.sup.xq.emc.emc(context, i12, i11, emc.ypw.HTML_RESOURCE);
                                        int i13 = pointEmc.x;
                                        int i14 = pointEmc.y;
                                        emc.ypw ypwVar = emc.ypw.IFRAME_RESOURCE;
                                        emc.EnumC0072emc enumC0072emc = emc.EnumC0072emc.NONE;
                                        float fEmc = com.bytedance.sdk.openadsdk.core.sup.xq.emc(i7, i8, i13, i14, ypwVar, enumC0072emc);
                                        String strYpw = bw.ypw(xmlPullParser, "IFrameResource");
                                        if (!TextUtils.isEmpty(strYpw) && fEmc > emcVar3.uym && fEmc > f7) {
                                            emcVar3.uym = fEmc;
                                            emcVar3.emc(strYpw, enumC0072emc, ypwVar);
                                            emcVar2 = emcVar3;
                                            i10 = i;
                                            iYpw = i12;
                                            iYpw2 = i11;
                                            f6 = f7;
                                            xqVar2 = xqVar3;
                                            i9 = 3;
                                            break;
                                        } else {
                                            bw.emc(xmlPullParser, "IFrameResource", 3);
                                            emcVar2 = emcVar3;
                                            i9 = 3;
                                            i10 = 2;
                                            iYpw = i12;
                                            iYpw2 = i11;
                                            f6 = f7;
                                            xqVar2 = xqVar3;
                                            break;
                                        }
                                    case 1:
                                        i = 2;
                                        emcVar2.dg = bw.ypw(xmlPullParser, "CompanionClickThrough");
                                        i10 = i;
                                        iYpw = i12;
                                        iYpw2 = i11;
                                        f6 = f7;
                                        xqVar2 = xqVar3;
                                        i9 = 3;
                                        break;
                                    case 2:
                                        emcVar = emcVar2;
                                        while (true) {
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                iYpw = i12;
                                                emcVar2 = emcVar;
                                                iYpw2 = i11;
                                                f6 = f7;
                                                xqVar2 = xqVar3;
                                                i9 = 3;
                                                i10 = 2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                emcVar.ypw(bw.ypw(xmlPullParser, "Tracking"));
                                            }
                                        }
                                        break;
                                    case 3:
                                        emcVar = emcVar2;
                                        emc.EnumC0072emc enumC0072emc2 = emc.EnumC0072emc.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(bw.uym, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.sup.xq.emc.emc;
                                        emc.EnumC0072emc enumC0072emc3 = set.contains(lowerCase) ? emc.EnumC0072emc.IMAGE : emc.EnumC0072emc.JAVASCRIPT;
                                        emc.ypw ypwVar2 = emc.ypw.STATIC_RESOURCE;
                                        Point pointEmc2 = com.bytedance.sdk.openadsdk.core.sup.xq.emc.emc(context, i12, i11, ypwVar2);
                                        float fEmc2 = com.bytedance.sdk.openadsdk.core.sup.xq.emc(i7, i8, pointEmc2.x, pointEmc2.y, ypwVar2, enumC0072emc3);
                                        String strYpw2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.sup.xq.emc.ypw.contains(lowerCase)) ? bw.ypw(xmlPullParser, "StaticResource") : null;
                                        if (fEmc2 >= emcVar.uym && fEmc2 > f7 && !TextUtils.isEmpty(strYpw2)) {
                                            emcVar.uym = fEmc2;
                                            emcVar.emc(strYpw2, enumC0072emc3, ypwVar2);
                                            iYpw = i12;
                                            emcVar2 = emcVar;
                                            iYpw2 = i11;
                                            f6 = f7;
                                            xqVar2 = xqVar3;
                                            i9 = 3;
                                            i10 = 2;
                                            break;
                                        } else {
                                            bw.emc(xmlPullParser, "StaticResource", 3);
                                            iYpw = i12;
                                            emcVar2 = emcVar;
                                            iYpw2 = i11;
                                            f6 = f7;
                                            i10 = 2;
                                            i9 = 3;
                                            xqVar2 = xqVar3;
                                            break;
                                        }
                                    case 4:
                                        emcVar2.emc(bw.ypw(xmlPullParser, "CompanionClickTracking"));
                                        iYpw = i12;
                                        iYpw2 = i11;
                                        f6 = f7;
                                        xqVar2 = xqVar3;
                                        i9 = 3;
                                        i10 = 2;
                                        break;
                                    case 5:
                                        emc.ypw ypwVar3 = emc.ypw.HTML_RESOURCE;
                                        Point pointEmc3 = com.bytedance.sdk.openadsdk.core.sup.xq.emc.emc(context, i12, i11, ypwVar3);
                                        int i15 = pointEmc3.x;
                                        int i16 = pointEmc3.y;
                                        emc.EnumC0072emc enumC0072emc4 = emc.EnumC0072emc.NONE;
                                        emcVar = emcVar2;
                                        float fEmc3 = com.bytedance.sdk.openadsdk.core.sup.xq.emc(i7, i8, i15, i16, ypwVar3, enumC0072emc4);
                                        String strYpw3 = bw.ypw(xmlPullParser, "HTMLResource");
                                        if (!TextUtils.isEmpty(strYpw3) && fEmc3 > emcVar.uym && fEmc3 > f7) {
                                            emcVar.uym = fEmc3;
                                            emcVar.emc(strYpw3, enumC0072emc4, ypwVar3);
                                            iYpw = i12;
                                            emcVar2 = emcVar;
                                            iYpw2 = i11;
                                            f6 = f7;
                                            xqVar2 = xqVar3;
                                            i9 = 3;
                                            i10 = 2;
                                            break;
                                        } else {
                                            bw.emc(xmlPullParser, "HTMLResource", 3);
                                            iYpw = i12;
                                            emcVar2 = emcVar;
                                            iYpw2 = i11;
                                            f6 = f7;
                                            xqVar2 = xqVar3;
                                            i10 = 2;
                                            i9 = 3;
                                            break;
                                        }
                                        break;
                                    default:
                                        bw.emc(xmlPullParser);
                                        emcVar = emcVar2;
                                        iYpw = i12;
                                        emcVar2 = emcVar;
                                        iYpw2 = i11;
                                        f6 = f7;
                                        xqVar2 = xqVar3;
                                        i9 = 3;
                                        i10 = 2;
                                        break;
                                }
                            } else {
                                iYpw = i12;
                                iYpw2 = i11;
                            }
                        } else if (!TextUtils.isEmpty(emcVar2.emc) && emcVar2.uym >= f6) {
                            com.bytedance.sdk.openadsdk.core.sup.xq xqVar4 = new com.bytedance.sdk.openadsdk.core.sup.xq(iYpw, iYpw2, emcVar2.ypw, emcVar2.xq, emcVar2.emc, emcVar2.bw, emcVar2.ycc, emcVar2.dg);
                            f6 = emcVar2.uym;
                            xqVar2 = xqVar4;
                        }
                    }
                }
            } else {
                f2 = f6;
                xqVar = xqVar2;
                f6 = f2;
                xqVar2 = xqVar;
            }
        }
    }
}
