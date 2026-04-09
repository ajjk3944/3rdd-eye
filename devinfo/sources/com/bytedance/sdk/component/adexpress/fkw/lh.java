package com.bytedance.sdk.component.adexpress.fkw;

import android.webkit.JavascriptInterface;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class lh {
    private WeakReference<vt> ouw;

    public lh(vt vtVar) {
        this.ouw = new WeakReference<>(vtVar);
    }

    @JavascriptInterface
    public final void adAnalysisData(String str) {
        WeakReference<vt> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get();
    }

    @JavascriptInterface
    public final String adInfo() {
        WeakReference<vt> weakReference = this.ouw;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ouw.get().adInfo();
    }

    @JavascriptInterface
    public final String appInfo() {
        WeakReference<vt> weakReference = this.ouw;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ouw.get().appInfo();
    }

    @JavascriptInterface
    public final void changeVideoState(String str) {
        WeakReference<vt> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().changeVideoState(str);
    }

    @JavascriptInterface
    public final void clickEvent(String str) {
        WeakReference<vt> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().clickEvent(str);
    }

    @JavascriptInterface
    public final void dynamicTrack(String str) {
        WeakReference<vt> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().dynamicTrack(str);
    }

    @JavascriptInterface
    public final String getCurrentVideoState() {
        WeakReference<vt> weakReference = this.ouw;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ouw.get().getCurrentVideoState();
    }

    @JavascriptInterface
    public final String getData(String str) {
        WeakReference<vt> weakReference = this.ouw;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ouw.get().getData(str);
    }

    @JavascriptInterface
    public final String getTemplateInfo() {
        WeakReference<vt> weakReference = this.ouw;
        return (weakReference == null || weakReference.get() == null) ? "" : this.ouw.get().getTemplateInfo();
    }

    @JavascriptInterface
    public final void initRenderFinish() {
        WeakReference<vt> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().initRenderFinish();
    }

    @JavascriptInterface
    public final void muteVideo(String str) {
        WeakReference<vt> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().muteVideo(str);
    }

    public final void ouw(vt vtVar) {
        this.ouw = new WeakReference<>(vtVar);
    }

    @JavascriptInterface
    public final void renderDidFinish(String str) {
        WeakReference<vt> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().renderDidFinish(str);
    }

    @JavascriptInterface
    public final void requestPauseVideo(String str) {
        WeakReference<vt> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().ouw(str);
    }

    @JavascriptInterface
    public final void skipVideo() {
        WeakReference<vt> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().skipVideo();
    }

    @JavascriptInterface
    public final void videoFrameChanged(String str) {
        WeakReference<vt> weakReference = this.ouw;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ouw.get().videoFrameChanged(str);
    }
}
