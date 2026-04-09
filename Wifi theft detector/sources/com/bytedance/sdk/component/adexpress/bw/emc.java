package com.bytedance.sdk.component.adexpress.bw;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.UiThread;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.ypw.gbl;
import com.bytedance.sdk.component.adexpress.ypw.msw;
import com.bytedance.sdk.component.adexpress.ypw.sz;
import com.bytedance.sdk.component.adexpress.ypw.uym;
import com.bytedance.sdk.component.utils.qh;
import com.bytedance.sdk.component.zz.ycc;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class emc implements com.bytedance.sdk.component.adexpress.emc, com.bytedance.sdk.component.adexpress.theme.emc, com.bytedance.sdk.component.adexpress.ypw.dg<ycc>, gbl {
    protected ycc dg;
    protected JSONObject emc;
    private msw gbl;
    private String msw;
    private int qh;
    private volatile uym ru;
    private sz sup;
    private boolean sz;
    private Context uym;
    protected boolean xq;
    protected boolean ypw;
    private String zz;
    protected int bw = 8;
    protected AtomicBoolean ycc = new AtomicBoolean(false);

    public emc(Context context, sz szVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.ypw = false;
        this.uym = context;
        this.sup = szVar;
        this.msw = szVar.dg();
        themeStatusBroadcastReceiver.emc(this);
        if (com.bytedance.sdk.component.adexpress.dg.ypw()) {
            sup();
            return;
        }
        ycc yccVarSz = sz();
        this.dg = yccVarSz;
        if (yccVarSz != null) {
            this.ypw = true;
            Log.d("WebViewRender", "initWebView: reuse WebView");
        } else {
            Log.d("WebViewRender", "initWebView: create WebView");
            if (com.bytedance.sdk.component.adexpress.dg.emc() != null) {
                this.dg = new ycc(com.bytedance.sdk.component.adexpress.dg.emc(), ycc.xq.ADS);
            }
        }
    }

    private void qh() {
        if (this.sup.rie()) {
            bw.emc().ypw(this.dg);
        } else {
            bw.emc().xq(this.dg);
        }
    }

    private void sup() {
        if (this.uym == null && com.bytedance.sdk.component.adexpress.dg.emc() != null) {
            this.uym = com.bytedance.sdk.component.adexpress.dg.emc();
        }
        if (this.uym != null) {
            ycc yccVarSz = sz();
            this.dg = yccVarSz;
            if (yccVarSz == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.dg = new ycc(new MutableContextWrapper(this.uym.getApplicationContext()), this.sup.rie() ? ycc.xq.ADS_V3 : ycc.xq.ADS);
            } else {
                this.ypw = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    private ycc sz() {
        return this.sup.rie() ? bw.emc().emc(this.uym, this.msw) : bw.emc().ypw(this.uym, this.msw);
    }

    public void dg() {
        if (this.ycc.get()) {
            return;
        }
        this.ycc.set(true);
        uym();
        if (this.dg.getParent() != null) {
            ((ViewGroup) this.dg.getParent()).removeView(this.dg);
        }
        if (this.xq) {
            qh();
        } else {
            bw.emc().dg(this.dg);
        }
    }

    public abstract void emc(int i10);

    public sz gbl() {
        return this.sup;
    }

    public void msw() {
        zz();
        Activity activityEmc = com.bytedance.sdk.component.utils.ypw.emc(this.dg);
        if (activityEmc != null) {
            this.qh = ypw(activityEmc);
        }
    }

    public void ru() {
    }

    public abstract void uym();

    @Override // com.bytedance.sdk.component.adexpress.ypw.dg
    public int xq() {
        return 0;
    }

    public void ycc() {
        if (emc() == null) {
            return;
        }
        try {
            emc().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.dg
    /* renamed from: ypw, reason: merged with bridge method [inline-methods] */
    public ycc bw() {
        return emc();
    }

    public void zz() {
    }

    private int ypw(Activity activity) {
        return activity.hashCode();
    }

    public void emc(String str) {
        this.zz = str;
    }

    public ycc emc() {
        return this.dg;
    }

    public void emc(msw mswVar) {
        this.gbl = mswVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.dg
    public void emc(uym uymVar) {
        String str;
        this.ru = uymVar;
        if (emc() != null && emc().getWebView() != null) {
            if (TextUtils.isEmpty(this.zz)) {
                this.ru.emc(102, "url is empty");
                return;
            }
            if (!this.sup.rie()) {
                if (!com.bytedance.sdk.component.adexpress.emc.ypw.ypw.emc(this.emc)) {
                    uym uymVar2 = this.ru;
                    StringBuilder sb = new StringBuilder("data null is ");
                    sb.append(this.emc == null);
                    uymVar2.emc(103, sb.toString());
                    return;
                }
            } else if (xq() == 9 && !com.bytedance.sdk.component.adexpress.emc.ypw.ypw.ypw(this.emc)) {
                uym uymVar3 = this.ru;
                StringBuilder sb2 = new StringBuilder("data null is ");
                sb2.append(this.emc == null);
                uymVar3.emc(103, sb2.toString());
                return;
            }
            this.sup.bw().emc(this.ypw);
            if (this.ypw) {
                try {
                    int iEe = this.sup.ee();
                    if (this.sup.rie() && iEe == 1) {
                        this.sup.xq();
                        str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.sup.xq() + ";") + "window.SDK_TRIGGER_RENDER();";
                    } else {
                        str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
                    }
                    this.dg.aa();
                    this.sup.bw();
                    qh.emc(this.dg.getWebView(), str);
                    return;
                } catch (Exception e10) {
                    bw.emc().dg(this.dg);
                    this.ru.emc(102, "load exception is " + e10.getMessage());
                    return;
                }
            }
            ycc yccVarEmc = emc();
            yccVarEmc.aa();
            this.sup.bw();
            yccVarEmc.a_(this.zz);
            return;
        }
        uym uymVar4 = this.ru;
        StringBuilder sb3 = new StringBuilder("SSWebview null is ");
        sb3.append(emc() == null);
        sb3.append(" or Webview is null");
        uymVar4.emc(102, sb3.toString());
    }

    public void emc(boolean z10) {
        this.sz = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.gbl
    public void emc(final com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
        if (qhVar == null) {
            if (this.ru != null) {
                this.ru.emc(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean zYpw = qhVar.ypw();
        final float fXq = (float) qhVar.xq();
        final float fDg = (float) qhVar.dg();
        if (xq() == 0 && (fXq <= 0.0f || fDg <= 0.0f)) {
            if (this.ru != null) {
                this.ru.emc(105, "width is " + fXq + "height is " + fDg);
                return;
            }
            return;
        }
        this.xq = zYpw;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            emc(qhVar, fXq, fDg);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bw.emc.1
                @Override // java.lang.Runnable
                public void run() {
                    emc.this.emc(qhVar, fXq, fDg);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void emc(com.bytedance.sdk.component.adexpress.ypw.qh qhVar, float f10, float f11) {
        qhVar.ru();
        boolean z10 = this.xq;
        if (z10 && !this.sz) {
            emc(f10, f11);
            emc(this.bw);
            if (this.ru != null) {
                this.ru.emc(emc(), qhVar);
                return;
            }
            return;
        }
        if (!z10) {
            bw.emc().dg(this.dg);
        }
        emc(qhVar.ru(), qhVar.zz());
    }

    @Override // com.bytedance.sdk.component.adexpress.ypw.gbl
    public void emc(View view, int i10, com.bytedance.sdk.component.adexpress.xq xqVar) {
        msw mswVar = this.gbl;
        if (mswVar != null) {
            mswVar.emc(view, i10, xqVar);
        }
    }

    @UiThread
    private void emc(float f10, float f11) {
        this.sup.bw().bw();
        if (xq() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) emc().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            emc().setLayoutParams(layoutParams);
            return;
        }
        int iEmc = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.uym, f10);
        int iEmc2 = (int) com.bytedance.sdk.component.adexpress.dg.uym.emc(this.uym, f11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) emc().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iEmc, iEmc2);
        }
        layoutParams2.width = iEmc;
        layoutParams2.height = iEmc2;
        emc().setLayoutParams(layoutParams2);
    }

    private void emc(int i10, String str) {
        if (this.ru != null) {
            this.ru.emc(i10, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.emc
    public void emc(Activity activity) {
        if (this.qh == 0 || activity == null || activity.hashCode() != this.qh) {
            return;
        }
        dg();
        ru();
    }

    public void emc(JSONObject jSONObject) {
        this.emc = jSONObject;
    }
}
