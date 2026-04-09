package com.bytedance.sdk.component.emc;

import android.webkit.WebView;
import com.bytedance.sdk.component.emc.xq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class cf {
    private volatile boolean bw;
    private final List<sup> dg;
    private final emc emc;
    private final zz xq;
    private final WebView ypw;

    public cf(zz zzVar) {
        ArrayList arrayList = new ArrayList();
        this.dg = arrayList;
        this.bw = false;
        this.xq = zzVar;
        if (zzVar.emc != null) {
            emc emcVar = zzVar.ypw;
            if (emcVar == null) {
                this.emc = new ul();
            } else {
                this.emc = emcVar;
            }
        } else {
            this.emc = zzVar.ypw;
        }
        this.emc.xq(zzVar);
        this.ypw = zzVar.emc;
        arrayList.add(zzVar.zz);
        yzg.emc(zzVar.uym);
    }

    public static zz emc(WebView webView) {
        return new zz(webView);
    }

    private void ypw() {
        if (this.bw) {
            msw.emc(new IllegalStateException("JsBridge2 is already released!!!"));
        }
    }

    public cf emc(String str, dg<?, ?> dgVar) {
        return emc(str, (String) null, dgVar);
    }

    public cf emc(Set<String> set, sba<?, ?> sbaVar) {
        return emc(set, (String) null, sbaVar);
    }

    public cf emc(String str, String str2, dg<?, ?> dgVar) {
        ypw();
        this.emc.uym.emc(str, dgVar);
        return this;
    }

    public cf emc(Set<String> set, String str, sba<?, ?> sbaVar) {
        ypw();
        this.emc.uym.emc(set, sbaVar);
        return this;
    }

    public cf emc(String str, xq.ypw ypwVar) {
        return emc(str, (String) null, ypwVar);
    }

    public cf emc(String str, String str2, xq.ypw ypwVar) {
        ypw();
        this.emc.uym.emc(str, ypwVar);
        return this;
    }

    public void emc() {
        if (this.bw) {
            return;
        }
        this.emc.ypw();
        this.bw = true;
        Iterator<sup> it = this.dg.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
