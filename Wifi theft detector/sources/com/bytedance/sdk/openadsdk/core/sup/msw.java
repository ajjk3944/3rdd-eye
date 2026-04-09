package com.bytedance.sdk.openadsdk.core.sup;

import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
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

/* loaded from: classes.dex */
public class msw {
    @NonNull
    public static uym emc(@NonNull View view, @NonNull Set<ru> set) {
        AdSession adSessionEmc = emc(CreativeType.VIDEO, set, Owner.NATIVE);
        return new zz(adSessionEmc, AdEvents.createAdEvents(adSessionEmc), view, MediaEvents.createMediaEvents(adSessionEmc));
    }

    public static uym emc(WebView webView) {
        Partner partnerEmc = bw.emc();
        if (partnerEmc != null) {
            AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(partnerEmc, webView, "", ""));
            return new uym(adSessionCreateAdSession, AdEvents.createAdEvents(adSessionCreateAdSession), webView);
        }
        throw new IllegalArgumentException("Parameter 'partner' may not be null.");
    }

    private static AdSession emc(CreativeType creativeType, Set<ru> set, Owner owner) {
        List<VerificationScriptResource> listEmc = emc(set);
        listEmc.isEmpty();
        Partner partnerEmc = bw.emc();
        if (partnerEmc == null) {
            return null;
        }
        return AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(creativeType, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, owner, false), AdSessionContext.createNativeAdSessionContext(partnerEmc, bw.ypw(), listEmc, "", ""));
    }

    private static List<VerificationScriptResource> emc(Set<ru> set) {
        ArrayList arrayList = new ArrayList();
        for (ru ruVar : set) {
            try {
                if (!TextUtils.isEmpty(ruVar.emc()) && !TextUtils.isEmpty(ruVar.ypw())) {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithParameters(ruVar.emc(), ruVar.xq(), ruVar.ypw()));
                } else {
                    arrayList.add(VerificationScriptResource.createVerificationScriptResourceWithoutParameters(ruVar.xq()));
                }
            } catch (Throwable unused) {
            }
        }
        return arrayList;
    }
}
