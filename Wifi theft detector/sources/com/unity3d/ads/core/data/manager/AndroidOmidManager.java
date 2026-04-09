package com.unity3d.ads.core.data.manager;

import android.content.Context;
import android.webkit.WebView;
import com.iab.omid.library.unity3d.adsession.CreativeType;
import com.iab.omid.library.unity3d.adsession.ImpressionType;
import com.iab.omid.library.unity3d.adsession.Owner;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import y5.c;
import y5.d;
import y5.e;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0011\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J7\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010,\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidOmidManager;", "Lcom/unity3d/ads/core/data/manager/OmidManager;", "<init>", "()V", "Landroid/content/Context;", "context", "Ly8/s;", "activate", "(Landroid/content/Context;)V", "Ly5/e;", "partner", "Landroid/webkit/WebView;", "adView", "", "contentUrl", "customReferenceData", "Ly5/d;", "createHtmlAdSessionContext", "(Ly5/e;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)Ly5/d;", "createJavaScriptAdSessionContext", "Lcom/iab/omid/library/unity3d/adsession/CreativeType;", "creativeType", "Lcom/iab/omid/library/unity3d/adsession/ImpressionType;", "impressionType", "Lcom/iab/omid/library/unity3d/adsession/Owner;", "owner", "mediaEventsOwner", "", "isolateVerificationScripts", "Ly5/c;", "createAdSessionConfiguration", "(Lcom/iab/omid/library/unity3d/adsession/CreativeType;Lcom/iab/omid/library/unity3d/adsession/ImpressionType;Lcom/iab/omid/library/unity3d/adsession/Owner;Lcom/iab/omid/library/unity3d/adsession/Owner;Z)Ly5/c;", "adSessionConfiguration", "Ly5/b;", "createAdSession", "(Ly5/c;Ly5/d;)Ly5/b;", "adSession", "Ly5/a;", "createAdEvents", "(Ly5/b;)Ly5/a;", "isActive", "()Z", MobileAdsBridge.versionMethodName, "()Ljava/lang/String;", "version", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidOmidManager implements OmidManager {
    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public void activate(@NotNull Context context) {
        p.e(context, "context");
        x5.a.a(context);
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public y5.a createAdEvents(@NotNull y5.b adSession) {
        p.e(adSession, "adSession");
        y5.a aVarA = y5.a.a(adSession);
        p.d(aVarA, "createAdEvents(adSession)");
        return aVarA;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public y5.b createAdSession(@NotNull c adSessionConfiguration, @NotNull d context) {
        p.e(adSessionConfiguration, "adSessionConfiguration");
        p.e(context, "context");
        y5.b bVarA = y5.b.a(adSessionConfiguration, context);
        p.d(bVarA, "createAdSession(adSessionConfiguration, context)");
        return bVarA;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public c createAdSessionConfiguration(@NotNull CreativeType creativeType, @NotNull ImpressionType impressionType, @NotNull Owner owner, @NotNull Owner mediaEventsOwner, boolean isolateVerificationScripts) {
        p.e(creativeType, "creativeType");
        p.e(impressionType, "impressionType");
        p.e(owner, "owner");
        p.e(mediaEventsOwner, "mediaEventsOwner");
        c cVarA = c.a(creativeType, impressionType, owner, mediaEventsOwner, isolateVerificationScripts);
        p.d(cVarA, "createAdSessionConfigura…VerificationScripts\n    )");
        return cVarA;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public d createHtmlAdSessionContext(@Nullable e partner, @Nullable WebView adView, @Nullable String contentUrl, @Nullable String customReferenceData) {
        d dVarA = d.a(partner, adView, contentUrl, customReferenceData);
        p.d(dVarA, "createHtmlAdSessionConte…customReferenceData\n    )");
        return dVarA;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public d createJavaScriptAdSessionContext(@Nullable e partner, @Nullable WebView adView, @Nullable String contentUrl, @Nullable String customReferenceData) {
        d dVarB = d.b(partner, adView, contentUrl, customReferenceData);
        p.d(dVarB, "createJavascriptAdSessio…customReferenceData\n    )");
        return dVarB;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    @NotNull
    public String getVersion() {
        String strB = x5.a.b();
        p.d(strB, "getVersion()");
        return strB;
    }

    @Override // com.unity3d.ads.core.data.manager.OmidManager
    public boolean isActive() {
        return x5.a.c();
    }
}
