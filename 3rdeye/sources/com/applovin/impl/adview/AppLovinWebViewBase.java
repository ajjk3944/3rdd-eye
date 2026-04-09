package com.applovin.impl.adview;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.applovin.impl.AbstractC2128k0;

/* loaded from: classes.dex */
public class AppLovinWebViewBase extends WebView {
    public AppLovinWebViewBase(Context context) {
        super(context);
    }

    public void applySettings(com.applovin.impl.sdk.ad.b bVar) {
        Boolean boolM;
        loadUrl("about:blank");
        int iX0 = bVar.x0();
        if (iX0 >= 0) {
            setLayerType(iX0, null);
        }
        getSettings().setMediaPlaybackRequiresUserGesture(bVar.L());
        if (bVar.R0()) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
        m mVarY0 = bVar.y0();
        if (mVarY0 != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState pluginStateB = mVarY0.b();
            if (pluginStateB != null) {
                settings.setPluginState(pluginStateB);
            }
            Boolean boolE = mVarY0.e();
            if (boolE != null) {
                settings.setAllowFileAccess(boolE.booleanValue());
            }
            Boolean boolI = mVarY0.i();
            if (boolI != null) {
                settings.setLoadWithOverviewMode(boolI.booleanValue());
            }
            Boolean boolQ = mVarY0.q();
            if (boolQ != null) {
                settings.setUseWideViewPort(boolQ.booleanValue());
            }
            Boolean boolD = mVarY0.d();
            if (boolD != null) {
                settings.setAllowContentAccess(boolD.booleanValue());
            }
            Boolean boolP = mVarY0.p();
            if (boolP != null) {
                settings.setBuiltInZoomControls(boolP.booleanValue());
            }
            Boolean boolH = mVarY0.h();
            if (boolH != null) {
                settings.setDisplayZoomControls(boolH.booleanValue());
            }
            Boolean boolL = mVarY0.l();
            if (boolL != null) {
                settings.setSaveFormData(boolL.booleanValue());
            }
            Boolean boolC = mVarY0.c();
            if (boolC != null) {
                settings.setGeolocationEnabled(boolC.booleanValue());
            }
            Boolean boolJ = mVarY0.j();
            if (boolJ != null) {
                settings.setNeedInitialFocus(boolJ.booleanValue());
            }
            Boolean boolF = mVarY0.f();
            if (boolF != null) {
                settings.setAllowFileAccessFromFileURLs(boolF.booleanValue());
            }
            Boolean boolG = mVarY0.g();
            if (boolG != null) {
                settings.setAllowUniversalAccessFromFileURLs(boolG.booleanValue());
            }
            Boolean boolO = mVarY0.o();
            if (boolO != null) {
                settings.setLoadsImagesAutomatically(boolO.booleanValue());
            }
            Boolean boolN = mVarY0.n();
            if (boolN != null) {
                settings.setBlockNetworkImage(boolN.booleanValue());
            }
            if (AbstractC2128k0.d()) {
                Integer numA = mVarY0.a();
                if (numA != null) {
                    settings.setMixedContentMode(numA.intValue());
                }
                if (AbstractC2128k0.e()) {
                    Boolean boolK = mVarY0.k();
                    if (boolK != null) {
                        settings.setOffscreenPreRaster(boolK.booleanValue());
                    }
                    if (!AbstractC2128k0.j() || (boolM = mVarY0.m()) == null) {
                        return;
                    }
                    settings.setAlgorithmicDarkeningAllowed(boolM.booleanValue());
                }
            }
        }
    }
}
