package com.bytedance.sdk.component.emc;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class zz {
    Context bw;
    uym dg;
    WebView emc;
    gbl msw;
    boolean sz;
    boolean uym;
    boolean ycc;
    emc ypw;
    sup zz;
    String xq = "IESJSBridge";
    String ru = "host";
    final Set<String> gbl = new LinkedHashSet();
    final Set<String> sup = new LinkedHashSet();

    public zz(WebView webView) {
        this.emc = webView;
    }

    public zz emc(emc emcVar) {
        this.ypw = emcVar;
        return this;
    }

    public zz ypw(boolean z6) {
        this.uym = z6;
        return this;
    }

    private void ypw() {
        if ((this.emc == null && !this.sz && this.ypw == null) || ((TextUtils.isEmpty(this.xq) && this.emc != null) || this.dg == null)) {
            throw new IllegalArgumentException("Requested arguments aren't set properly when building JsBridge.");
        }
    }

    public zz emc(String str) {
        this.xq = str;
        return this;
    }

    public zz emc(ru ruVar) {
        this.dg = uym.emc(ruVar);
        return this;
    }

    public zz emc(boolean z6) {
        this.ycc = z6;
        return this;
    }

    public cf emc() {
        ypw();
        return new cf(this);
    }

    public zz() {
    }
}
