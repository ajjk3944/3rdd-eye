package com.bytedance.sdk.openadsdk.core.sup.emc.emc;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.core.sup.ru;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class dg {
    public static Set<ru> emc(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ru ruVarEmc;
        if (xmlPullParser == null) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Verification".equals(xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(bw.uym, "vendor");
                    String strYpw = null;
                    String strYpw2 = null;
                    String strYpw3 = null;
                    while (true) {
                        if (xmlPullParser.getEventType() != 3 || !"Verification".equals(xmlPullParser.getName())) {
                            xmlPullParser.next();
                            if (xmlPullParser.getEventType() == 2) {
                                String name = xmlPullParser.getName();
                                name.getClass();
                                switch (name) {
                                    case "Tracking":
                                        if (!"verificationNotExecuted".equals(xmlPullParser.getAttributeValue(bw.uym, NotificationCompat.CATEGORY_EVENT))) {
                                            break;
                                        } else {
                                            strYpw3 = bw.ypw(xmlPullParser, "Tracking");
                                            break;
                                        }
                                    case "JavaScriptResource":
                                        if (!CampaignEx.KEY_OMID.equals(xmlPullParser.getAttributeValue(bw.uym, "apiFramework"))) {
                                            break;
                                        } else {
                                            strYpw = bw.ypw(xmlPullParser, "JavaScriptResource");
                                            break;
                                        }
                                    case "VerificationParameters":
                                        strYpw2 = bw.ypw(xmlPullParser, "VerificationParameters");
                                        break;
                                }
                            }
                        } else if (!TextUtils.isEmpty(strYpw) && (ruVarEmc = ru.emc(strYpw, attributeValue, strYpw2, strYpw3)) != null) {
                            hashSet.add(ruVarEmc);
                        }
                    }
                } else {
                    bw.emc(xmlPullParser);
                }
            }
        }
        return hashSet;
    }
}
