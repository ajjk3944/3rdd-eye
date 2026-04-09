package com.bytedance.sdk.openadsdk.core.ryl.ouw.ouw;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.ryl.tlj;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    public static Set<tlj> ouw(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        tlj tljVarOuw;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(yu.ra, "vendor");
                    String strOuw = null;
                    String strOuw2 = null;
                    String strOuw3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(yu.ra, "event"))) {
                                            break;
                                        } else {
                                            strOuw3 = yu.ouw(xmlPullParser, "Tracking");
                                            break;
                                        }
                                    case "JavaScriptResource":
                                        if (!"omid".equals(xmlPullParser.getAttributeValue(yu.ra, "apiFramework"))) {
                                            break;
                                        } else {
                                            strOuw = yu.ouw(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                    case "VerificationParameters":
                                        strOuw2 = yu.ouw(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strOuw) && (tljVarOuw = tlj.ouw(strOuw, attributeValue, strOuw2, strOuw3)) != null) {
                            hashSet.add(tljVarOuw);
                        }
                    }
                } else {
                    yu.ouw(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
