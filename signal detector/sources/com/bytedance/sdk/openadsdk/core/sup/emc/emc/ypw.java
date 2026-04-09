package com.bytedance.sdk.openadsdk.core.sup.emc.emc;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class ypw {
    public static com.bytedance.sdk.openadsdk.core.sup.emc emc(Context context, XmlPullParser xmlPullParser, List<com.bytedance.sdk.openadsdk.core.sup.ypw.xq> list, int i, double d6) throws XmlPullParserException, IOException {
        String name;
        xmlPullParser.require(2, bw.uym, "InLine");
        com.bytedance.sdk.openadsdk.core.sup.emc emcVar = new com.bytedance.sdk.openadsdk.core.sup.emc();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                emcVar.emc().ru(list);
                return emcVar;
            }
            if (xmlPullParser.getEventType() == 2) {
                name = xmlPullParser.getName();
                name.getClass();
                switch (name) {
                    case "AdVerifications":
                        emcVar.emc(dg.emc(xmlPullParser));
                        context = context;
                        break;
                    case "Creatives":
                        if (TextUtils.isEmpty(emcVar.uym()) || emcVar.xq() == null) {
                            while (xmlPullParser.next() != 3) {
                                if (xmlPullParser.getEventType() == 2) {
                                    if ("Creative".equals(xmlPullParser.getName())) {
                                        emc(context, xmlPullParser, emcVar, i, d6);
                                    } else {
                                        bw.emc(xmlPullParser);
                                    }
                                }
                            }
                        } else {
                            bw.emc(xmlPullParser);
                        }
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i = i;
                        d6 = d6;
                        break;
                    case "Description":
                        emcVar.ypw(bw.ypw(xmlPullParser, name));
                        break;
                    case "Error":
                        list.addAll(bw.emc(xmlPullParser, name));
                        break;
                    case "Extensions":
                        while (true) {
                            if (xmlPullParser.getEventType() == 3 && "Extensions".equals(xmlPullParser.getName())) {
                                context = context;
                                xmlPullParser = xmlPullParser;
                                i = i;
                                d6 = d6;
                                break;
                            } else {
                                xmlPullParser.next();
                                if (xmlPullParser.getEventType() == 2 && "AdVerifications".equals(xmlPullParser.getName())) {
                                    emcVar.emc(dg.emc(xmlPullParser));
                                }
                            }
                        }
                        break;
                    case "AdTitle":
                        emcVar.emc(bw.ypw(xmlPullParser, name));
                        break;
                    case "Impression":
                        emcVar.emc().emc(bw.emc(xmlPullParser, name));
                        break;
                    default:
                        bw.emc(xmlPullParser);
                        context = context;
                        xmlPullParser = xmlPullParser;
                        i = i;
                        d6 = d6;
                        break;
                }
            }
        }
    }

    public static void emc(Context context, XmlPullParser xmlPullParser, com.bytedance.sdk.openadsdk.core.sup.emc emcVar, int i, double d6) throws XmlPullParserException, IOException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(emcVar.uym())) {
                    xq.emc(xmlPullParser, emcVar, i, d6);
                } else if ("CompanionAds".equals(xmlPullParser.getName()) && emcVar.xq() == null) {
                    emcVar.emc(emc.emc(context, xmlPullParser));
                } else {
                    bw.emc(xmlPullParser);
                }
            }
        }
    }
}
