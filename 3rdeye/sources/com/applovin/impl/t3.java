package com.applovin.impl;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* loaded from: classes.dex */
public class t3 extends s3 {
    public t3(com.applovin.impl.sdk.ad.a aVar) {
        super(aVar);
    }

    @Override // com.applovin.impl.s3
    public AdSessionContext a(WebView webView) {
        try {
            return this.f20927a.getOpenMeasurementVerificationScriptResources().size() > 0 ? AdSessionContext.createNativeAdSessionContext(this.f20928b.d0().b(), this.f20928b.d0().a(), this.f20927a.getOpenMeasurementVerificationScriptResources(), this.f20927a.getOpenMeasurementContentUrl(), this.f20927a.getOpenMeasurementCustomReferenceData()) : AdSessionContext.createHtmlAdSessionContext(this.f20928b.d0().b(), webView, this.f20927a.getOpenMeasurementContentUrl(), this.f20927a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f20929c.a(this.f20930d, "Failed to create ad session context", th);
            return null;
        }
    }

    @Override // com.applovin.impl.s3
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f20929c.a(this.f20930d, "Failed to create ad session configuration", th);
            return null;
        }
    }
}
