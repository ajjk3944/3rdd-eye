package com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.bytedance.sdk.openadsdk.core.ryl.lh.ouw;
import com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw.yu;
import com.bytedance.sdk.openadsdk.core.ryl.vt.lh;
import java.io.IOException;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class ouw {
    public static com.bytedance.sdk.openadsdk.core.ryl.lh ouw(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        float f10;
        com.bytedance.sdk.openadsdk.core.ryl.lh lhVar;
        float f11;
        com.bytedance.sdk.openadsdk.core.ryl.lh lhVar2;
        yu.ouw ouwVar;
        int i4;
        yu.ouw ouwVar2;
        if (context == null) {
            yu.ouw(xmlPullParser);
            return null;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        float f12 = displayMetrics.density;
        int i12 = (int) (i10 / f12);
        int i13 = (int) (i11 / f12);
        float f13 = Float.MIN_VALUE;
        com.bytedance.sdk.openadsdk.core.ryl.lh lhVar3 = null;
        while (true) {
            int i14 = 3;
            if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals("CompanionAds")) {
                return lhVar3;
            }
            xmlPullParser.next();
            int i15 = 2;
            if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Companion")) {
                String str = yu.ra;
                int iVt = yu.vt(xmlPullParser.getAttributeValue(str, "width"));
                int iVt2 = yu.vt(xmlPullParser.getAttributeValue(str, "height"));
                if (iVt < 300 || iVt2 < 250) {
                    f10 = f13;
                    lhVar = lhVar3;
                    yu.ouw(xmlPullParser);
                    f13 = f10;
                    lhVar3 = lhVar;
                } else {
                    yu.ouw ouwVar3 = new yu.ouw();
                    while (true) {
                        if (xmlPullParser.getEventType() != i14 || !xmlPullParser.getName().equals("Companion")) {
                            int i16 = iVt2;
                            int i17 = iVt;
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == i15) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                f11 = f13;
                                lhVar2 = lhVar3;
                                switch (name) {
                                    case "IFrameResource":
                                        yu.ouw ouwVar4 = ouwVar3;
                                        Point pointOuw = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.ouw(context, i17, i16, ouw.vt.HTML_RESOURCE);
                                        int i18 = pointOuw.x;
                                        int i19 = pointOuw.y;
                                        ouw.vt vtVar = ouw.vt.IFRAME_RESOURCE;
                                        ouw.EnumC0095ouw enumC0095ouw = ouw.EnumC0095ouw.NONE;
                                        float fOuw = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw(i12, i13, i18, i19, vtVar, enumC0095ouw);
                                        String strOuw = yu.ouw(xmlPullParser, "IFrameResource");
                                        if (TextUtils.isEmpty(strOuw) || fOuw <= ouwVar4.ra || fOuw <= f11) {
                                            yu.vt(xmlPullParser, "IFrameResource");
                                        } else {
                                            ouwVar4.ra = fOuw;
                                            ouwVar4.ouw(strOuw, enumC0095ouw, vtVar);
                                        }
                                        ouwVar3 = ouwVar4;
                                        i14 = 3;
                                        iVt = i17;
                                        iVt2 = i16;
                                        i15 = 2;
                                        f13 = f11;
                                        lhVar3 = lhVar2;
                                        break;
                                    case "CompanionClickThrough":
                                        ouwVar3.yu = yu.ouw(xmlPullParser, "CompanionClickThrough");
                                        i15 = 2;
                                        f13 = f11;
                                        i14 = 3;
                                        iVt = i17;
                                        iVt2 = i16;
                                        lhVar3 = lhVar2;
                                        break;
                                    case "TrackingEvents":
                                        ouwVar = ouwVar3;
                                        while (true) {
                                            i4 = 3;
                                            if (xmlPullParser.next() == 3 && xmlPullParser.getName().equals("TrackingEvents")) {
                                                iVt = i17;
                                                ouwVar3 = ouwVar;
                                                iVt2 = i16;
                                                f13 = f11;
                                                i15 = 2;
                                                i14 = i4;
                                                lhVar3 = lhVar2;
                                                break;
                                            } else if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals("Tracking")) {
                                                ouwVar.f8414le.add(new lh.ouw(yu.ouw(xmlPullParser, "Tracking")).ouw());
                                            }
                                        }
                                        break;
                                    case "StaticResource":
                                        ouwVar2 = ouwVar3;
                                        ouw.EnumC0095ouw enumC0095ouw2 = ouw.EnumC0095ouw.NONE;
                                        String lowerCase = xmlPullParser.getAttributeValue(yu.ra, "creativeType").toLowerCase();
                                        Set<String> set = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.ouw;
                                        ouw.EnumC0095ouw enumC0095ouw3 = set.contains(lowerCase) ? ouw.EnumC0095ouw.IMAGE : ouw.EnumC0095ouw.JAVASCRIPT;
                                        ouw.vt vtVar2 = ouw.vt.STATIC_RESOURCE;
                                        Point pointOuw2 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.ouw(context, i17, i16, vtVar2);
                                        float fOuw2 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw(i12, i13, pointOuw2.x, pointOuw2.y, vtVar2, enumC0095ouw3);
                                        String strOuw2 = (set.contains(lowerCase) || com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.vt.contains(lowerCase)) ? yu.ouw(xmlPullParser, "StaticResource") : null;
                                        if (fOuw2 < ouwVar2.ra || fOuw2 <= f11 || TextUtils.isEmpty(strOuw2)) {
                                            yu.vt(xmlPullParser, "StaticResource");
                                        } else {
                                            ouwVar2.ra = fOuw2;
                                            ouwVar2.ouw(strOuw2, enumC0095ouw3, vtVar2);
                                        }
                                        iVt = i17;
                                        ouwVar3 = ouwVar2;
                                        iVt2 = i16;
                                        f13 = f11;
                                        lhVar3 = lhVar2;
                                        i14 = 3;
                                        i15 = 2;
                                        break;
                                    case "CompanionClickTracking":
                                        ouwVar3.fkw.add(new lh.ouw(yu.ouw(xmlPullParser, "CompanionClickTracking")).ouw());
                                        iVt = i17;
                                        iVt2 = i16;
                                        f13 = f11;
                                        lhVar3 = lhVar2;
                                        i14 = 3;
                                        i15 = 2;
                                        break;
                                    case "HTMLResource":
                                        ouw.vt vtVar3 = ouw.vt.HTML_RESOURCE;
                                        Point pointOuw3 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw.ouw(context, i17, i16, vtVar3);
                                        int i20 = pointOuw3.x;
                                        int i21 = pointOuw3.y;
                                        ouw.EnumC0095ouw enumC0095ouw4 = ouw.EnumC0095ouw.NONE;
                                        ouwVar2 = ouwVar3;
                                        float fOuw3 = com.bytedance.sdk.openadsdk.core.ryl.lh.ouw(i12, i13, i20, i21, vtVar3, enumC0095ouw4);
                                        String strOuw3 = yu.ouw(xmlPullParser, "HTMLResource");
                                        if (TextUtils.isEmpty(strOuw3) || fOuw3 <= ouwVar2.ra || fOuw3 <= f11) {
                                            yu.vt(xmlPullParser, "HTMLResource");
                                        } else {
                                            ouwVar2.ra = fOuw3;
                                            ouwVar2.ouw(strOuw3, enumC0095ouw4, vtVar3);
                                        }
                                        iVt = i17;
                                        ouwVar3 = ouwVar2;
                                        iVt2 = i16;
                                        f13 = f11;
                                        lhVar3 = lhVar2;
                                        i14 = 3;
                                        i15 = 2;
                                        break;
                                    default:
                                        yu.ouw(xmlPullParser);
                                        ouwVar = ouwVar3;
                                        i4 = 3;
                                        iVt = i17;
                                        ouwVar3 = ouwVar;
                                        iVt2 = i16;
                                        f13 = f11;
                                        i15 = 2;
                                        i14 = i4;
                                        lhVar3 = lhVar2;
                                        break;
                                }
                            } else {
                                iVt = i17;
                                iVt2 = i16;
                            }
                        } else if (!TextUtils.isEmpty(ouwVar3.ouw) && ouwVar3.ra >= f13) {
                            com.bytedance.sdk.openadsdk.core.ryl.lh lhVar4 = new com.bytedance.sdk.openadsdk.core.ryl.lh(iVt, iVt2, ouwVar3.vt, ouwVar3.f8415lh, ouwVar3.ouw, ouwVar3.fkw, ouwVar3.f8414le, ouwVar3.yu);
                            f13 = ouwVar3.ra;
                            lhVar3 = lhVar4;
                        }
                    }
                }
            } else {
                f10 = f13;
                lhVar = lhVar3;
                f13 = f10;
                lhVar3 = lhVar;
            }
        }
    }
}
