package com.bytedance.sdk.component.adexpress.bw;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class xq {
    private WeakReference<ypw> emc;

    public xq(ypw ypwVar) {
        this.emc = new WeakReference<>(ypwVar);
    }

    @JavascriptInterface
    public void adAnalysisData(String str) {
        WeakReference<ypw> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.emc.get();
    }

    @JavascriptInterface
    public String adInfo() {
        WeakReference<ypw> weakReference = this.emc;
        return (weakReference == null || weakReference.get() == null) ? "" : this.emc.get().adInfo();
    }

    @JavascriptInterface
    public String appInfo() {
        WeakReference<ypw> weakReference = this.emc;
        return (weakReference == null || weakReference.get() == null) ? "" : this.emc.get().appInfo();
    }

    @JavascriptInterface
    public void changeVideoState(String str) {
        WeakReference<ypw> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.emc.get().changeVideoState(str);
    }

    @JavascriptInterface
    public void clickEvent(String str) {
        WeakReference<ypw> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.emc.get().clickEvent(str);
    }

    @JavascriptInterface
    public void dynamicTrack(String str) {
        WeakReference<ypw> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.emc.get().dynamicTrack(str);
    }

    public void emc(ypw ypwVar) {
        this.emc = new WeakReference<>(ypwVar);
    }

    @JavascriptInterface
    public String getCurrentVideoState() {
        WeakReference<ypw> weakReference = this.emc;
        return (weakReference == null || weakReference.get() == null) ? "" : this.emc.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public String getData(String str) {
        WeakReference<ypw> weakReference = this.emc;
        return (weakReference == null || weakReference.get() == null) ? "" : this.emc.get().getData(str);
    }

    @JavascriptInterface
    public String getTemplateInfo() {
        WeakReference<ypw> weakReference = this.emc;
        return (weakReference == null || weakReference.get() == null) ? "" : this.emc.get().getTemplateInfo();
    }

    @JavascriptInterface
    public void initRenderFinish() {
        WeakReference<ypw> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.emc.get().initRenderFinish();
    }

    @JavascriptInterface
    public void muteVideo(String str) {
        WeakReference<ypw> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.emc.get().muteVideo(str);
    }

    @JavascriptInterface
    public void renderDidFinish(String str) {
        WeakReference<ypw> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.emc.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public void requestPauseVideo(String str) {
        WeakReference<ypw> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.emc.get().emc(str);
    }

    @JavascriptInterface
    public void skipVideo() {
        WeakReference<ypw> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.emc.get().skipVideo();
    }

    @JavascriptInterface
    public void videoFrameChanged(String str) {
        WeakReference<ypw> weakReference = this.emc;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.emc.get().videoFrameChanged(str);
    }
}
