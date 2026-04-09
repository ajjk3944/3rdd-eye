package com.mbridge.msdk.splash.view;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import o5.b;

/* loaded from: classes3.dex */
public class MBSplashWebview extends WindVaneWebView {

    /* renamed from: r, reason: collision with root package name */
    private String f17420r;

    /* renamed from: s, reason: collision with root package name */
    private b f17421s;

    public MBSplashWebview(Context context) {
        super(context);
        setBackgroundColor(0);
    }

    public void finishAdSession() {
        try {
            b bVar = this.f17421s;
            if (bVar != null) {
                bVar.c();
                this.f17421s = null;
                q0.a("OMSDK", "finish adSession");
            }
        } catch (Exception e10) {
            q0.a("OMSDK", e10.getMessage());
        }
    }

    public b getAdSession() {
        return this.f17421s;
    }

    public String getRequestId() {
        return this.f17420r;
    }

    public void setAdSession(b bVar) {
        this.f17421s = bVar;
    }

    public void setRequestId(String str) {
        this.f17420r = str;
    }
}
