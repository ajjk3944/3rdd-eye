package com.bytedance.sdk.component.adexpress.bw;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.sdk.component.emc.ul;
import com.bytedance.sdk.component.utils.dr;
import com.bytedance.sdk.component.zz.ycc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class bw {
    private static final byte[] bw = new byte[0];
    private static int msw = 10;
    private static int ycc = 10;
    private static volatile bw zz;
    private final AtomicBoolean uym = new AtomicBoolean(false);
    private List<ycc> emc = new ArrayList();
    private List<ycc> ypw = new ArrayList();
    private Map<Integer, xq> xq = new HashMap();
    private Map<Integer, dg> dg = new HashMap();

    private bw() {
        com.bytedance.sdk.component.adexpress.emc.emc.xq xqVarXq = com.bytedance.sdk.component.adexpress.emc.emc.emc.emc().xq();
        if (xqVarXq != null) {
            ycc = xqVarXq.ru();
            msw = xqVarXq.gbl();
        }
    }

    public static bw emc() {
        if (zz == null) {
            synchronized (bw.class) {
                try {
                    if (zz == null) {
                        zz = new bw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return zz;
    }

    private void ycc(ycc yccVar) {
        if (yccVar == null) {
            return;
        }
        if (dr.ypw(yccVar.getScene())) {
            dr.emc(yccVar);
            return;
        }
        if (this.emc.size() >= ycc) {
            try {
                Context context = yccVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                yccVar.vk();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.emc.contains(yccVar)) {
            return;
        }
        try {
            Context context2 = yccVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                yccVar.setRecycler(true);
                this.emc.add(yccVar);
                xq();
            }
        } catch (Throwable th2) {
            xq();
            th2.getMessage();
        }
    }

    public void bw(ycc yccVar) {
        WebView webView;
        if (yccVar == null || (webView = yccVar.getWebView()) == null) {
            return;
        }
        xq xqVar = this.xq.get(Integer.valueOf(webView.hashCode()));
        if (xqVar != null) {
            xqVar.emc(null);
        }
        yccVar.b_("SDK_INJECT_GLOBAL");
    }

    public boolean dg(ycc yccVar) {
        if (yccVar == null) {
            return false;
        }
        try {
            Context context = yccVar.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            yccVar.vk();
            return true;
        } catch (Throwable th) {
            th.getMessage();
            return true;
        }
    }

    public void xq(ycc yccVar) {
        if (yccVar == null) {
            return;
        }
        dr.ypw(yccVar);
        yccVar.b_("SDK_INJECT_GLOBAL");
        bw(yccVar);
        ycc(yccVar);
    }

    public void ypw(ycc yccVar) {
        if (yccVar == null) {
            return;
        }
        dr.ypw(yccVar);
        yccVar.b_("SDK_INJECT_GLOBAL");
        bw(yccVar);
        emc(yccVar);
    }

    public int xq() {
        return this.emc.size();
    }

    public ycc ypw(Context context, String str) {
        ycc.xq xqVar = ycc.xq.ADS;
        if (dr.ypw(xqVar)) {
            if (!com.bytedance.sdk.component.adexpress.dg.bw.emc(str) || dr.emc(xqVar) > 1) {
                return dr.emc(context, null, 0, xqVar);
            }
            return null;
        }
        if (xq() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.dg.bw.emc(str) && xq() <= 1) {
            xq();
            return null;
        }
        ycc yccVarRemove = this.emc.remove(0);
        if (yccVarRemove == null) {
            return null;
        }
        try {
            Context context2 = yccVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                yccVarRemove.setRecycler(false);
                xq();
            }
            return yccVarRemove;
        } catch (Throwable unused) {
            xq();
            return null;
        }
    }

    public int dg() {
        return this.ypw.size();
    }

    public ycc emc(Context context, String str) {
        ycc.xq xqVar = ycc.xq.ADS_V3;
        if (dr.ypw(xqVar)) {
            if (!com.bytedance.sdk.component.adexpress.dg.bw.emc(str) || dr.emc(xqVar) > 1) {
                return dr.emc(context, null, 0, xqVar);
            }
            return null;
        }
        if (dg() <= 0) {
            return null;
        }
        if (com.bytedance.sdk.component.adexpress.dg.bw.emc(str) && dg() <= 1) {
            dg();
            return null;
        }
        ycc yccVarRemove = this.ypw.remove(0);
        if (yccVarRemove == null) {
            return null;
        }
        try {
            Context context2 = yccVarRemove.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context.getApplicationContext());
                yccVarRemove.setRecycler(false);
                dg();
            }
            return yccVarRemove;
        } catch (Throwable unused) {
            dg();
            return null;
        }
    }

    public void ypw() {
        for (ycc yccVar : this.emc) {
            if (yccVar != null) {
                try {
                    Context context = yccVar.getContext();
                    if (context instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    }
                    yccVar.vk();
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        this.emc.clear();
        for (ycc yccVar2 : this.ypw) {
            if (yccVar2 != null) {
                try {
                    Context context2 = yccVar2.getContext();
                    if (context2 instanceof MutableContextWrapper) {
                        ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                    }
                    yccVar2.vk();
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }
        }
        this.ypw.clear();
    }

    public void emc(ycc yccVar) {
        if (yccVar == null) {
            return;
        }
        if (dr.ypw(yccVar.getScene())) {
            dr.emc(yccVar);
            return;
        }
        if (this.ypw.size() >= msw) {
            try {
                Context context = yccVar.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                }
                yccVar.vk();
                return;
            } catch (Throwable th) {
                th.getMessage();
                return;
            }
        }
        if (this.ypw.contains(yccVar)) {
            return;
        }
        try {
            Context context2 = yccVar.getContext();
            if (context2 instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context2).setBaseContext(context2.getApplicationContext());
                yccVar.setRecycler(true);
                this.ypw.add(yccVar);
                dg();
            }
        } catch (Throwable th2) {
            dg();
            th2.getMessage();
        }
    }

    public void ypw(int i) {
        synchronized (bw) {
            msw = i;
        }
    }

    @SuppressLint({"JavascriptInterface"})
    public void emc(ycc yccVar, ypw ypwVar) {
        WebView webView;
        if (yccVar == null || ypwVar == null || (webView = yccVar.getWebView()) == null) {
            return;
        }
        xq xqVar = this.xq.get(Integer.valueOf(webView.hashCode()));
        if (xqVar != null) {
            xqVar.emc(ypwVar);
        } else {
            xqVar = new xq(ypwVar);
            this.xq.put(Integer.valueOf(webView.hashCode()), xqVar);
        }
        yccVar.emc(xqVar, "SDK_INJECT_GLOBAL");
    }

    @SuppressLint({"JavascriptInterface"})
    public void emc(WebView webView, ul ulVar, String str) {
        if (webView == null || ulVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        dg dgVar = this.dg.get(Integer.valueOf(webView.hashCode()));
        if (dgVar != null) {
            dgVar.emc(ulVar);
        } else {
            dgVar = new dg(ulVar);
            this.dg.put(Integer.valueOf(webView.hashCode()), dgVar);
        }
        webView.addJavascriptInterface(dgVar, str);
    }

    public void emc(WebView webView, String str) {
        if (webView == null || TextUtils.isEmpty(str)) {
            return;
        }
        dg dgVar = this.dg.get(Integer.valueOf(webView.hashCode()));
        if (dgVar != null) {
            dgVar.emc(null);
        }
        webView.removeJavascriptInterface(str);
    }

    public void emc(int i) {
        synchronized (bw) {
            ycc = i;
        }
    }
}
