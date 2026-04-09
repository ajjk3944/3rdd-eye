package com.bytedance.sdk.component.adexpress.fkw;

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
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.adexpress.vt.cf;
import com.bytedance.sdk.component.adexpress.vt.mwh;
import com.bytedance.sdk.component.adexpress.vt.pno;
import com.bytedance.sdk.component.adexpress.vt.ra;
import com.bytedance.sdk.component.bly.le;
import com.bytedance.sdk.component.utils.jg;
import com.bytedance.sdk.component.utils.ko;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class ouw implements com.bytedance.sdk.component.adexpress.ouw, com.bytedance.sdk.component.adexpress.theme.ouw, cf, com.bytedance.sdk.component.adexpress.vt.yu<le> {

    /* renamed from: cf, reason: collision with root package name */
    private String f7316cf;
    public mwh fkw;

    /* renamed from: jg, reason: collision with root package name */
    private int f7317jg;

    /* renamed from: le, reason: collision with root package name */
    public le f7318le;

    /* renamed from: lh, reason: collision with root package name */
    protected boolean f7319lh;
    private volatile ra mwh;
    protected JSONObject ouw;
    public boolean ra;
    private String ryl;
    private Context tlj;
    protected boolean vt;
    public pno yu;
    protected int pno = 8;
    public AtomicBoolean bly = new AtomicBoolean(false);

    public ouw(Context context, mwh mwhVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver) {
        this.vt = false;
        this.tlj = context;
        this.fkw = mwhVar;
        this.f7316cf = mwhVar.ouw;
        themeStatusBroadcastReceiver.ouw(this);
        if (!com.bytedance.sdk.component.adexpress.yu.vt()) {
            le leVarBly = bly();
            this.f7318le = leVarBly;
            if (leVarBly != null) {
                this.vt = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
                return;
            } else {
                Log.d("WebViewRender", "initWebView: create WebView");
                if (com.bytedance.sdk.component.adexpress.yu.ouw() != null) {
                    this.f7318le = new le(com.bytedance.sdk.component.adexpress.yu.ouw(), le.lh.ADS);
                    return;
                }
                return;
            }
        }
        if (this.tlj == null && com.bytedance.sdk.component.adexpress.yu.ouw() != null) {
            this.tlj = com.bytedance.sdk.component.adexpress.yu.ouw();
        }
        if (this.tlj != null) {
            le leVarBly2 = bly();
            this.f7318le = leVarBly2;
            if (leVarBly2 == null) {
                Log.d("WebViewRender", "initWebView: create WebView by act");
                this.f7318le = new le(new MutableContextWrapper(this.tlj.getApplicationContext()), this.fkw.vpp ? le.lh.ADS_V3 : le.lh.ADS);
            } else {
                this.vt = true;
                Log.d("WebViewRender", "initWebView: reuse WebView");
            }
        }
    }

    private le bly() {
        return this.fkw.vpp ? fkw.ouw().ouw(this.tlj, this.f7316cf) : fkw.ouw().vt(this.tlj, this.f7316cf);
    }

    public abstract void fkw();

    public void le() {
        ra();
        Activity activityOuw = com.bytedance.sdk.component.utils.vt.ouw(this.f7318le);
        if (activityOuw != null) {
            this.f7317jg = activityOuw.hashCode();
        }
    }

    public abstract void ouw(int i4);

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public int vt() {
        return 0;
    }

    public void yu() {
        if (this.bly.get()) {
            return;
        }
        this.bly.set(true);
        fkw();
        if (this.f7318le.getParent() != null) {
            ((ViewGroup) this.f7318le.getParent()).removeView(this.f7318le);
        }
        if (!this.f7319lh) {
            fkw.ouw();
            fkw.lh(this.f7318le);
        } else if (this.fkw.vpp) {
            fkw.ouw().ouw(this.f7318le);
        } else {
            fkw.ouw().vt(this.f7318le);
        }
    }

    public final void ouw(String str) {
        this.ryl = str;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    /* renamed from: ouw, reason: merged with bridge method [inline-methods] */
    public le lh() {
        return this.f7318le;
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.yu
    public void ouw(ra raVar) {
        String str;
        this.mwh = raVar;
        if (lh() != null && lh().getWebView() != null) {
            if (TextUtils.isEmpty(this.ryl)) {
                this.mwh.ouw(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, "url is empty");
                return;
            }
            if (!this.fkw.vpp) {
                if (!com.bytedance.sdk.component.adexpress.ouw.vt.vt.ouw(this.ouw)) {
                    ra raVar2 = this.mwh;
                    StringBuilder sb2 = new StringBuilder("data null is ");
                    sb2.append(this.ouw == null);
                    raVar2.ouw(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, sb2.toString());
                    return;
                }
            } else if (vt() == 9 && !com.bytedance.sdk.component.adexpress.ouw.vt.vt.vt(this.ouw)) {
                ra raVar3 = this.mwh;
                StringBuilder sb3 = new StringBuilder("data null is ");
                sb3.append(this.ouw == null);
                raVar3.ouw(FacebookMediationAdapter.ERROR_REQUIRES_ACTIVITY_CONTEXT, sb3.toString());
                return;
            }
            this.fkw.vt.ouw(this.vt);
            if (this.vt) {
                try {
                    mwh mwhVar = this.fkw;
                    int i4 = mwhVar.ex;
                    if (mwhVar.vpp && i4 == 1) {
                        ko.ouw("Android_jsb", "trigger SDK_INJECT_DATA in reuse, templateInfo is：", mwhVar.ouw());
                        str = "javascript:window.SDK_RESET_RENDER();" + ("window.SDK_INJECT_DATA=" + this.fkw.ouw() + ";") + "window.SDK_TRIGGER_RENDER();";
                    } else {
                        str = "javascript:window.SDK_RESET_RENDER();window.SDK_TRIGGER_RENDER();";
                    }
                    this.f7318le.tlj();
                    this.fkw.vt.fkw();
                    jg.ouw(this.f7318le.getWebView(), str);
                    return;
                } catch (Exception e2) {
                    ko.vt("WebViewRender", "reuse webview load fail ");
                    fkw.ouw();
                    fkw.lh(this.f7318le);
                    this.mwh.ouw(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, "load exception is " + e2.getMessage());
                    return;
                }
            }
            le leVarLh = lh();
            leVarLh.tlj();
            this.fkw.vt.fkw();
            leVarLh.a_(this.ryl);
            return;
        }
        ra raVar4 = this.mwh;
        StringBuilder sb4 = new StringBuilder("SSWebview null is ");
        sb4.append(lh() == null);
        sb4.append(" or Webview is null");
        raVar4.ouw(FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH, sb4.toString());
    }

    public void pno() {
    }

    public void ra() {
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public void ouw(final com.bytedance.sdk.component.adexpress.vt.jg jgVar) {
        if (jgVar == null) {
            if (this.mwh != null) {
                this.mwh.ouw(105, "renderResult is null");
                return;
            }
            return;
        }
        boolean z3 = jgVar.vt;
        final float f10 = (float) jgVar.f7393lh;
        final float f11 = (float) jgVar.yu;
        if (vt() == 0 && (f10 <= 0.0f || f11 <= 0.0f)) {
            if (this.mwh != null) {
                this.mwh.ouw(105, "width is " + f10 + "height is " + f11);
                return;
            }
            return;
        }
        this.f7319lh = z3;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ouw(jgVar, f10, f11);
        } else {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.fkw.ouw.1
                @Override // java.lang.Runnable
                public final void run() {
                    ouw.this.ouw(jgVar, f10, f11);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ouw(com.bytedance.sdk.component.adexpress.vt.jg jgVar, float f10, float f11) {
        boolean z3 = this.f7319lh;
        if (z3 && !this.ra) {
            ouw(f10, f11);
            ouw(this.pno);
            if (this.mwh != null) {
                this.mwh.ouw(lh(), jgVar);
                return;
            }
            return;
        }
        if (!z3) {
            fkw.ouw();
            fkw.lh(this.f7318le);
        }
        ouw(jgVar.f7391jg, jgVar.mwh);
    }

    @Override // com.bytedance.sdk.component.adexpress.vt.cf
    public final void ouw(View view, int i4, com.bytedance.sdk.component.adexpress.lh lhVar) {
        pno pnoVar = this.yu;
        if (pnoVar != null) {
            pnoVar.ouw(view, i4, lhVar);
        }
    }

    private void ouw(float f10, float f11) {
        this.fkw.vt.le();
        if (vt() == 9) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) lh().getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new FrameLayout.LayoutParams(-1, -1);
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            lh().setLayoutParams(layoutParams);
            return;
        }
        int iOuw = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.tlj, f10);
        int iOuw2 = (int) com.bytedance.sdk.component.adexpress.yu.ra.ouw(this.tlj, f11);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) lh().getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iOuw, iOuw2);
        }
        layoutParams2.width = iOuw;
        layoutParams2.height = iOuw2;
        lh().setLayoutParams(layoutParams2);
    }

    private void ouw(int i4, String str) {
        if (this.mwh != null) {
            this.mwh.ouw(i4, str);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.ouw
    public final void ouw(Activity activity) {
        if (this.f7317jg == 0 || activity == null || activity.hashCode() != this.f7317jg) {
            return;
        }
        ko.vt("WebViewRender", "release from activity onDestroy");
        yu();
        pno();
    }

    public final void ouw(JSONObject jSONObject) {
        this.ouw = jSONObject;
    }
}
