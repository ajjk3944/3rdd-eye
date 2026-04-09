package com.bytedance.sdk.openadsdk.core.ryl;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.ko;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSession;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.CreativeType;
import com.iab.omid.library.bytedance2.adsession.ImpressionType;
import com.iab.omid.library.bytedance2.adsession.Owner;
import com.iab.omid.library.bytedance2.adsession.Partner;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class pno {
    public static ra ouw(View view, Set<tlj> set) {
        AdSession adSessionOuw = ouw(CreativeType.VIDEO, set, Owner.NATIVE);
        return new bly(adSessionOuw, AdEvents.createAdEvents(adSessionOuw), view, MediaEvents.createMediaEvents(adSessionOuw));
    }

    public static ra ouw(WebView webView) {
        Partner partnerOuw = fkw.ouw();
        if (partnerOuw != null) {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(partnerOuw, webView, "", ""));
            return new ra(adSessionCreateAdSession, AdEvents.createAdEvents(adSessionCreateAdSession), webView);
        }
        throw new IllegalArgumentException("Parameter 'partner' may not be null.");
    }

    private static AdSession ouw(CreativeType creativeType, Set<tlj> set, Owner owner) {
        List<VerificationScriptResource> listOuw = ouw(set);
        if (listOuw.isEmpty()) {
            ko.yu("verificationScriptResources is empty");
        }
        Partner partnerOuw = fkw.ouw();
        if (partnerOuw == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(partnerOuw, fkw.vt(), listOuw, "", ""));
    }

    private static List<VerificationScriptResource> ouw(Set<tlj> set) {
        ArrayList arrayList = new ArrayList();
        for (tlj tljVar : set) {
            try {
                if (!TextUtils.isEmpty(tljVar.ouw) && !TextUtils.isEmpty(tljVar.f8421lh)) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(tljVar.ouw, tljVar.vt, tljVar.f8421lh));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(tljVar.vt));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
