package com.bytedance.sdk.openadsdk.core.model;

import L1.c;
import U4.e;
import android.R;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.http.SslError;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.activity.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.dg.xq;
import com.bytedance.sdk.openadsdk.utils.iyl;
import com.bytedance.sdk.openadsdk.utils.tp;
import com.bytedance.sdk.openadsdk.utils.vw;
import com.google.android.gms.internal.ads.AbstractC1135f5;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ul implements Handler.Callback {
    private View aa;
    private int but;
    View bw;
    private Handler cf;
    private AtomicBoolean cn;
    private String cuf;
    private View db;
    FrameLayout dg;
    private long dr;
    private com.bytedance.sdk.openadsdk.common.sup ee;
    ImageView emc;
    private com.bytedance.sdk.openadsdk.core.ycc.dg ffd;
    private com.bytedance.sdk.openadsdk.core.widget.aa fu;
    ObjectAnimator gbl;
    private FrameLayout hj;
    private FrameLayout hxp;
    private int iyl;
    private final Activity lt;
    private final View mkp;
    FrameLayout msw;
    private com.bytedance.sdk.openadsdk.ul.emc.emc.xq mxo;
    private com.bytedance.sdk.openadsdk.core.zz.ul ndl;
    private com.bytedance.sdk.openadsdk.core.ycc.msw nw;
    private ValueAnimator pe;
    private final boolean pm;
    com.bytedance.sdk.openadsdk.core.xq.ypw qh;
    private com.bytedance.sdk.component.zz.ycc rie;
    private ypw rig;
    private final com.bytedance.sdk.openadsdk.core.sz.dg.ypw rtt;
    ValueAnimator ru;
    private ImageView sb;
    private TextView sba;
    private View sf;
    private com.bytedance.sdk.openadsdk.core.rtt sra;
    c sup;
    com.bytedance.sdk.openadsdk.core.xq.emc sz;
    private com.bytedance.sdk.openadsdk.dg.sz tp;
    private com.bytedance.sdk.openadsdk.core.widget.aa ul;
    final rie uym;
    private View vk;
    private boolean vw;
    private int wad;
    private LinearLayout.LayoutParams wbn;
    private com.bytedance.sdk.openadsdk.common.bw wd;
    private boolean wo;
    private ILoader wpn;
    TextView xq;
    private com.bytedance.sdk.openadsdk.core.widget.emc.bw xxg;
    RelativeLayout ycc;
    private TextView ylm;
    FrameLayout ypw;
    private String yz;
    private TextView yzg;
    ObjectAnimator zz;
    private final AtomicBoolean xmt = new AtomicBoolean(false);
    private final AtomicBoolean ra = new AtomicBoolean(false);
    private volatile int pxa = 0;
    private volatile int wa = 0;
    private volatile int rqm = 0;
    private float xhi = -1.0f;
    private final AtomicBoolean jp = new AtomicBoolean(false);
    private long ltx = -1;
    private final AtomicBoolean yid = new AtomicBoolean(false);
    private long bv = 0;

    public static class emc implements com.bytedance.sdk.component.bw.msw {
        @Override // com.bytedance.sdk.component.bw.msw
        public Bitmap emc(Bitmap bitmap) {
            return com.bytedance.sdk.component.adexpress.dg.emc.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), bitmap, 25);
        }
    }

    public static class ypw implements com.bytedance.sdk.openadsdk.dg.sup {
        private final WeakReference<ul> dg;
        private final int emc;
        private final String xq;
        private final rie ypw;

        public ypw(int i, rie rieVar, String str, ul ulVar) {
            this.emc = i;
            this.ypw = rieVar;
            this.xq = str;
            this.dg = new WeakReference<>(ulVar);
        }

        @Override // com.bytedance.sdk.openadsdk.dg.sup
        public void emc(int i) {
            ul ulVar = this.dg.get();
            if (ulVar != null) {
                xq.emc.emc(this.emc, ulVar.rqm, ulVar.wa, ulVar.pxa - ulVar.wa, this.ypw, this.xq, i);
            }
        }
    }

    public ul(Activity activity, final rie rieVar, String str, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar, View view) {
        this.lt = activity;
        this.uym = rieVar;
        this.cuf = str;
        this.rtt = ypwVar;
        this.mkp = view;
        this.iyl = tp.emc(str);
        if (rieVar != null) {
            this.yz = rieVar.qlw();
        }
        this.pm = rieVar.wpn() && bw(rieVar);
        if (!TextUtils.isEmpty(this.yz)) {
            this.wpn = com.bytedance.sdk.openadsdk.uym.ypw.emc().ypw();
            int iEmc = com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(this.wpn, this.yz);
            this.wad = iEmc;
            this.but = iEmc > 0 ? 2 : 0;
        }
        boolean zDg = dg(rieVar);
        boolean zUym = uym(rieVar);
        boolean zYpw = ypw(rieVar);
        if (zYpw) {
            this.cuf = "landingpage_split_screen";
        } else if (zDg) {
            this.cuf = "landingpage_direct";
        } else if (zUym) {
            this.cuf = "aggregate_page";
        } else if (xq(rieVar)) {
            this.cuf = "landingpage_split_ceiling";
        }
        this.sz = new com.bytedance.sdk.openadsdk.core.xq.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), rieVar, this.cuf, tp.emc(str));
        HashMap map = new HashMap();
        map.put("click_scence", 1);
        this.sz.emc(map);
        View viewFindViewById = activity.findViewById(R.id.content);
        this.sz.emc(viewFindViewById);
        com.bytedance.sdk.openadsdk.core.xq.ypw ypwVar2 = new com.bytedance.sdk.openadsdk.core.xq.ypw(activity, rieVar, this.cuf, tp.emc(str), true) { // from class: com.bytedance.sdk.openadsdk.core.model.ul.1
            @Override // com.bytedance.sdk.openadsdk.core.xq.ypw
            public boolean emc(sup supVar, Map<String, Object> map2) {
                if (ul.ru(rieVar) && ul.this.xxg != null) {
                    ul.this.xxg.emc(supVar);
                    ul.this.xxg.emc(map2);
                    if (ul.zz(ul.this.uym) || ul.this.wo) {
                        return true;
                    }
                }
                return super.emc(supVar, map2);
            }
        };
        this.qh = ypwVar2;
        ypwVar2.emc(map);
        this.qh.emc(viewFindViewById);
        this.msw = frameLayout;
        if (zYpw || zDg || zUym) {
            try {
                this.cf = new Handler(Looper.getMainLooper(), this);
            } catch (Exception e6) {
                Log.e("LandingPageModel", "LandingPageModel: ", e6);
                return;
            }
        }
        if (rieVar.wpn()) {
            return;
        }
        if (zDg || zUym) {
            Handler handler = this.cf;
            handler.sendMessage(handler.obtainMessage(100, 0, 0));
        }
    }

    public static /* synthetic */ int cf(ul ulVar) {
        int i = ulVar.rqm;
        ulVar.rqm = i + 1;
        return i;
    }

    public static /* synthetic */ int qh(ul ulVar) {
        int i = ulVar.wa;
        ulVar.wa = i + 1;
        return i;
    }

    public static /* synthetic */ int sup(ul ulVar) {
        int i = ulVar.pxa;
        ulVar.pxa = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean xq(int i) {
        return i == 1 || i == 2 || i == 4 || i == 5;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        rie rieVar;
        rie rieVar2;
        int i = message.what;
        if (i == 100) {
            int i3 = message.arg1;
            long jDg = (!dg(this.uym) || (rieVar2 = this.uym) == null || rieVar2.hxp() == null) ? (!uym(this.uym) || (rieVar = this.uym) == null || rieVar.hxp() == null) ? 20L : this.uym.hxp().dg() : this.uym.hxp().ypw();
            c cVar = this.sup;
            if (cVar != null) {
                cVar.emc(i3 * 1000, jDg * 1000);
            }
            long j6 = i3;
            if (j6 >= jDg) {
                c cVar2 = this.sup;
                if (cVar2 != null) {
                    cVar2.emc(jDg * 1000, 100);
                }
            } else if (j6 < jDg && this.cf != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 100;
                messageObtain.arg1 = i3 + 1;
                this.cf.sendMessageDelayed(messageObtain, 1000L);
            }
        } else if (i == 101) {
            ru();
        }
        return true;
    }

    private void aa() {
        com.bytedance.sdk.openadsdk.common.gbl loadingStyle;
        com.bytedance.sdk.openadsdk.common.sup supVar = this.ee;
        if (supVar != null && (loadingStyle = supVar.getLoadingStyle()) != null) {
            this.fu = loadingStyle.ypw();
            this.nw = loadingStyle.xq();
        }
        com.bytedance.sdk.openadsdk.core.ycc.dg dgVar = this.ffd;
        if (dgVar != null) {
            dgVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (ul.this.ffd.getTag() != null) {
                        if (ul.this.ffd.getTag().equals(1)) {
                            ul.this.ypw(3);
                        } else if (ul.this.ffd.getTag().equals(2)) {
                            ul.this.ypw(4);
                        }
                    }
                }
            });
        }
    }

    public static boolean bw(rie rieVar) {
        db dbVarIvb;
        return rieVar != null && rieVar.sx() == 3 && !dr.ypw(rieVar) && (rieVar.kx() == 0.0f || rieVar.kx() == 100.0f) && (dbVarIvb = rieVar.ivb()) != null && dbVarIvb.emc() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void cf() {
        LinearLayout.LayoutParams layoutParams;
        if (this.xmt.get()) {
            return;
        }
        vk();
        this.ra.set(true);
        emc(-1);
        this.rtt.sup();
        com.bytedance.sdk.openadsdk.common.sup supVar = this.ee;
        if (supVar != null) {
            supVar.ypw();
        }
        if (uym(this.uym)) {
            com.bytedance.sdk.openadsdk.dg.xq.emc(System.currentTimeMillis(), this.uym, this.cuf, "show_agg_backup");
            View view = this.aa;
            if (view != null) {
                view.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.aa.getLayoutParams();
                layoutParams2.addRule(13);
                layoutParams2.addRule(10, 0);
                this.aa.setLayoutParams(layoutParams2);
                RelativeLayout relativeLayout = this.ycc;
                if (relativeLayout != null) {
                    relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.2
                        @Override // android.view.View.OnClickListener
                        public void onClick(View view2) {
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        this.vk.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) this.vk.getLayoutParams();
        layoutParams3.addRule(13);
        layoutParams3.addRule(10, 0);
        this.vk.setLayoutParams(layoutParams3);
        if (this.uym.ya() != null && !TextUtils.isEmpty(this.uym.ya().emc())) {
            com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.uym.ya().emc(), this.uym.ya().ypw(), this.uym.ya().xq(), this.ul, this.uym);
        }
        this.sba.setText(this.uym.hs());
        this.yzg.setText(this.uym.vyk());
        if (this.ylm != null) {
            ypw();
            this.ylm.setClickable(true);
            this.ylm.setOnClickListener(this.sz);
            this.ylm.setOnTouchListener(this.sz);
        }
        if (!xq(this.uym) || (layoutParams = this.wbn) == null) {
            return;
        }
        if (layoutParams.weight < 30.0f) {
            dg(8);
        } else {
            dg(0);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void gbl() {
        ul ulVar;
        com.bytedance.sdk.component.zz.ycc yccVar = this.rie;
        if (yccVar == null || yccVar.getWebView() == null) {
            ulVar = this;
        } else {
            com.bytedance.sdk.openadsdk.core.widget.emc.xq.emc(com.bytedance.sdk.openadsdk.core.aa.emc()).emc(false).ypw(false).emc(this.rie.getWebView());
            com.bytedance.sdk.component.zz.ycc yccVar2 = this.rie;
            if (yccVar2 != null && yccVar2.getWebView() != null) {
                this.rig = new ypw(this.wad, this.uym, this.cuf, this);
                if (this.rie.k_() && (this.rie.getWebViewClient() instanceof com.bytedance.sdk.openadsdk.core.widget.emc.bw)) {
                    com.bytedance.sdk.openadsdk.dg.sz szVarYpw = ((com.bytedance.sdk.openadsdk.core.widget.emc.bw) this.rie.getWebViewClient()).ypw();
                    this.tp = szVarYpw;
                    if (szVarYpw != null) {
                        szVarYpw.emc(this.rig);
                        this.tp.ypw(true);
                    }
                } else {
                    this.tp = new com.bytedance.sdk.openadsdk.dg.sz(this.uym, this.rie.getWebView(), this.rig, this.but).ypw(true);
                }
                this.tp.emc(this.cuf);
                com.bytedance.sdk.openadsdk.common.bw bwVarEmc = tp.emc(this.uym, this.rie, this.lt, this.cuf);
                this.wd = bwVarEmc;
                if (bwVarEmc != null) {
                    bwVarEmc.emc(this.cuf);
                }
                tp.emc(this.uym, this.rie);
            }
            sup();
            if (this.rie.k_()) {
                ul();
            }
            this.rie.setLandingPage(true);
            this.rie.setTag(this.cuf);
            this.rie.setMaterialMeta(this.uym.wg());
            ulVar = this;
            com.bytedance.sdk.openadsdk.core.widget.emc.bw bwVar = new com.bytedance.sdk.openadsdk.core.widget.emc.bw(com.bytedance.sdk.openadsdk.core.aa.emc(), this.sra, this.uym.ye(), this.wd, this.tp, true) { // from class: com.bytedance.sdk.openadsdk.core.model.ul.12
                @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    ul.this.sz();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    ul.this.rtt.fu();
                    ul.this.dr = System.currentTimeMillis();
                    if (!ul.ypw(ul.this.uym) || ul.this.cf == null || rie.bw(ul.this.uym)) {
                        return;
                    }
                    ul.this.cf.sendEmptyMessageDelayed(101, 2000L);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    String strDg = com.bytedance.sdk.openadsdk.core.widget.emc.bw.dg(str2);
                    boolean z6 = false;
                    if (this.ycc != null) {
                        this.ycc.emc(webView, i, str, str2, com.bytedance.sdk.openadsdk.core.widget.emc.bw.dg(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                    }
                    boolean z7 = strDg != null && strDg.startsWith("image");
                    if (strDg != null && strDg.startsWith("mp4")) {
                        z6 = true;
                    }
                    if (z7 || z6 || ul.this.xmt.get()) {
                        return;
                    }
                    ul.this.cf();
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    if (sslErrorHandler != null) {
                        ul.this.cf();
                    }
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TextUtils.isEmpty(ul.this.yz)) {
                            return super.shouldInterceptRequest(webView, str);
                        }
                        ul.sup(ul.this);
                        WebResourceResponseModel webResourceResponseModelEmc = com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(ul.this.wpn, ul.this.yz, str);
                        if (webResourceResponseModelEmc != null && webResourceResponseModelEmc.getWebResourceResponse() != null) {
                            ul.qh(ul.this);
                            return webResourceResponseModelEmc.getWebResourceResponse();
                        }
                        if (webResourceResponseModelEmc != null && webResourceResponseModelEmc.getMsg() == 2) {
                            ul.cf(ul.this);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.ul.emc("LandingPageModel", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.emc.bw, android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (!ul.xq(ul.this.uym) || tp.emc(webView) != 1) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Intent intent = new Intent(ul.this.lt, (Class<?>) TTCeilingLandingPageActivity.class);
                    ul.this.uym.bw(str);
                    intent.putExtra("meta_index", com.bytedance.sdk.openadsdk.core.sf.emc().emc(ul.this.uym));
                    com.bytedance.sdk.component.utils.ypw.emc(this.dg, intent, null);
                    return true;
                }
            };
            ulVar.xxg = bwVar;
            ulVar.rie.setWebViewClient(bwVar);
            ulVar.xxg.emc(ulVar.uym);
            ulVar.xxg.emc(ulVar.cuf);
            ulVar.xxg.emc(ulVar.rtt);
            ulVar.rie.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.emc.dg(ulVar.sra, ulVar.tp, ulVar.wd) { // from class: com.bytedance.sdk.openadsdk.core.model.ul.13
                @Override // com.bytedance.sdk.openadsdk.core.widget.emc.dg, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (ul.this.lt != null && !ul.this.lt.isFinishing() && i == 100) {
                        ul.this.sz();
                    }
                    if (ul.this.ee != null) {
                        ul.this.ee.emc(i);
                    }
                }
            });
            if (ulVar.mxo == null) {
                ulVar.mxo = com.bytedance.sdk.openadsdk.ul.emc.emc.dg.emc(com.bytedance.sdk.openadsdk.core.aa.emc(), ulVar.cuf);
            }
            ulVar.rie.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.14
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j6) {
                    if (ul.this.mxo != null) {
                        ul.this.mxo.emc(ul.this.uym);
                    }
                }
            });
            com.bytedance.sdk.component.zz.ycc yccVar3 = ulVar.rie;
            yccVar3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.yzg.emc(yccVar3.getWebView(), BuildConfig.VERSION_CODE));
            ulVar.rie.setMixedContentMode(0);
            ulVar.rie.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.15
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i3, int i6, int i7) {
                    if (ul.this.tp != null) {
                        ul.this.tp.ypw(i3);
                    }
                }
            });
            ulVar.rie.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.16
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (ul.this.zz()) {
                        int action = motionEvent.getAction();
                        if (action == 0) {
                            ul.this.xhi = motionEvent.getY();
                        } else if (action == 1) {
                            if (vw.emc(ul.this.xhi, motionEvent.getY(), ul.this.lt)) {
                                ul.this.ypw(5);
                            }
                        } else if (action == 2) {
                            motionEvent.setAction(3);
                        }
                    }
                    if (ul.this.pm && motionEvent.getAction() == 1 && ul.this.rtt != null) {
                        ul.this.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.16.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ul.this.rtt.ndl();
                            }
                        });
                    }
                    if ((!ul.this.wo || ul.ru(ul.this.uym)) && !ul.uym(ul.this.uym)) {
                        ul.this.qh.onTouch(view, motionEvent);
                    }
                    if ((!ul.this.wo || ul.ru(ul.this.uym)) && !ul.uym(ul.this.uym) && motionEvent.getAction() == 1 && ul.this.qh.ycc()) {
                        ul.this.rie.getWebView().performClick();
                        ul.this.wo = true;
                    }
                    if (ul.this.tp != null) {
                        ul.this.tp.emc(motionEvent);
                    }
                    if (ul.this.wd == null) {
                        return false;
                    }
                    ul.this.wd.emc(motionEvent);
                    return false;
                }
            });
            ulVar.rie.getWebView().setOnClickListener(ulVar.qh);
            com.bytedance.sdk.openadsdk.dg.xq.emc(ulVar.uym, ulVar.cuf, ulVar.but);
            if (!ulVar.rie.k_()) {
                com.bytedance.sdk.component.utils.ul.emc("LandingPageModel", "loadUrlWithRefer url  = " + ulVar.uym.xst());
                com.bytedance.sdk.openadsdk.utils.sra.emc(ulVar.rie, ulVar.uym.xst());
            }
            ulVar.vw = true;
        }
        com.bytedance.sdk.component.zz.ycc yccVar4 = ulVar.rie;
        if (yccVar4 == null || ulVar.ee == null || yccVar4.xq()) {
            return;
        }
        ulVar.ee.emc();
    }

    public static boolean msw(rie rieVar) {
        return dg(rieVar) && !gbl(rieVar);
    }

    private void qh() {
        this.ycc.setVisibility(8);
        if (dg(this.uym) || uym(this.uym) || !dg() || xq(this.uym)) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "timeVisible", 0.0f, 1.0f);
        this.gbl = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(100L);
        this.gbl.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ul.this.hxp.getLayoutParams();
                layoutParams.weight = (float) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.25d);
                ul.this.emc((float) (1.0d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.2d)));
                ul.this.hxp.setLayoutParams(layoutParams);
            }
        });
        this.gbl.start();
    }

    public static boolean ru(rie rieVar) {
        if (rieVar != null) {
            return rieVar.fu() == 19 || rieVar.fu() == 20;
        }
        return false;
    }

    private void sba() {
        if (dg()) {
            this.db.setVisibility(0);
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.sb, "translationY", 16.0f, 0.0f).setDuration(500L);
            this.zz = duration;
            duration.setRepeatMode(2);
            this.zz.setRepeatCount(-1);
            this.zz.start();
            this.db.setClickable(true);
            this.db.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.5
                @Override // android.view.View.OnTouchListener
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (!ul.this.wo) {
                        ul.this.qh.onTouch(view, motionEvent);
                    }
                    if (motionEvent.getAction() != 3 && motionEvent.getAction() != 1) {
                        return false;
                    }
                    ul.this.ru = ObjectAnimator.ofFloat(this, "timeSlide", 0.0f, 1.0f);
                    ul.this.ru.setDuration(200L);
                    ul.this.ru.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.5.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ul.this.hxp.getLayoutParams();
                            layoutParams.weight = (float) ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 2.07f) + 0.25d);
                            ul.this.emc((float) (0.800000011920929d - (((Float) valueAnimator.getAnimatedValue()).floatValue() * 0.5d)));
                            ul.this.hxp.setLayoutParams(layoutParams);
                        }
                    });
                    if (ul.this.qh.ycc()) {
                        ul.this.db.performClick();
                        ul.this.wo = true;
                    }
                    ul.this.ru.start();
                    ul.this.db.setVisibility(8);
                    return true;
                }
            });
            this.db.setOnClickListener(this.qh);
        }
        if (!yzg()) {
            this.msw.setVisibility(8);
            this.ypw.setVisibility(0);
            this.emc.setScaleType(ImageView.ScaleType.FIT_CENTER);
            this.emc.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    ul ulVar = ul.this;
                    com.bytedance.sdk.openadsdk.dg.xq.ypw(ulVar.uym, ulVar.cuf);
                }
            });
            rie rieVar = this.uym;
            if (rieVar != null && rieVar.rr() != null && this.uym.rr().size() > 0 && this.uym.rr().get(0) != null && !TextUtils.isEmpty(this.uym.rr().get(0).emc())) {
                com.bytedance.sdk.openadsdk.yzg.ypw.ypw().emc(this.uym.rr().get(0), this.emc, this.uym, new com.bytedance.sdk.component.bw.vk() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.7
                    @Override // com.bytedance.sdk.component.bw.vk
                    public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
                        if (ul.this.cf != null) {
                            ul.this.cf.removeMessages(101);
                        }
                    }

                    @Override // com.bytedance.sdk.component.bw.vk
                    public void emc(int i, String str, Throwable th) {
                        if (ul.this.cf != null) {
                            ul.this.cf.removeMessages(101);
                        }
                        ul.this.ru();
                    }
                });
            }
        }
        try {
            String strEmc = this.uym.rr().get(0).emc();
            com.bytedance.sdk.openadsdk.ru.dg.emc().emc(strEmc).emc(this.uym.rr().get(0).ypw()).ypw(this.uym.rr().get(0).xq()).bw(vw.bw(com.bytedance.sdk.openadsdk.core.aa.emc())).dg(vw.xq(com.bytedance.sdk.openadsdk.core.aa.emc())).xq(1).emc(new emc()).emc(new com.bytedance.sdk.openadsdk.ru.ypw(this.uym, strEmc, new com.bytedance.sdk.component.bw.vk() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.8
                @Override // com.bytedance.sdk.component.bw.vk
                public void emc(int i, String str, Throwable th) {
                }

                @Override // com.bytedance.sdk.component.bw.vk
                public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
                    Drawable bitmapDrawable;
                    try {
                        Object objYpw = gblVar.ypw();
                        if (objYpw != null && gblVar.xq() != null) {
                            if (objYpw instanceof Bitmap) {
                                bitmapDrawable = new BitmapDrawable(com.bytedance.sdk.openadsdk.core.aa.emc().getResources(), (Bitmap) objYpw);
                            } else if (objYpw instanceof Drawable) {
                                if (Build.VERSION.SDK_INT >= 28 && e.t(objYpw)) {
                                    a.j(objYpw).start();
                                }
                                bitmapDrawable = (Drawable) objYpw;
                            } else {
                                bitmapDrawable = null;
                            }
                            if (!ul.this.yzg()) {
                                ul.this.ypw.setBackground(bitmapDrawable);
                                return;
                            }
                            ul.this.dg.setBackground(bitmapDrawable);
                            View viewVk = ul.this.rtt.vk();
                            if (viewVk == null || !(viewVk.getParent() instanceof View)) {
                                return;
                            }
                            ((View) viewVk.getParent()).setBackground(bitmapDrawable);
                        }
                    } catch (Exception unused) {
                    }
                }
            }));
        } catch (Exception unused) {
        }
    }

    private void sup() {
        com.bytedance.sdk.openadsdk.core.rtt rttVar = new com.bytedance.sdk.openadsdk.core.rtt(this.lt);
        this.sra = rttVar;
        rttVar.emc(this.rtt);
        this.sra.ypw(this.rie).emc(com.bytedance.sdk.openadsdk.core.zz.emc.ypw.emc(this.uym)).xq(this.uym.ye()).dg(this.uym.wdp()).emc(this.uym).ypw(uym(this.uym) ? this.iyl : -1).emc(this.uym.nx()).ypw(this.cuf).bw(this.uym.drx()).emc(this.rie).emc(new com.bytedance.sdk.openadsdk.core.widget.bw() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.17
            @Override // com.bytedance.sdk.openadsdk.core.widget.bw
            public void emc() {
                if (ul.uym(ul.this.uym) && (ul.this.lt instanceof com.bytedance.sdk.openadsdk.core.sz.dg.ypw)) {
                    ((com.bytedance.sdk.openadsdk.core.sz.dg.ypw) ul.this.lt).mkp();
                } else if (ul.this.xxg != null) {
                    ul.this.xxg.xq();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sz() {
        this.xmt.get();
        this.ra.get();
        if (this.xmt.get() || this.ra.get()) {
            return;
        }
        this.xmt.set(true);
        emc(0);
        long jElapsedRealtime = this.ltx == -1 ? 0L : SystemClock.elapsedRealtime() - this.ltx;
        if (xq(this.uym)) {
            com.bytedance.sdk.openadsdk.dg.xq.xq(this.uym, this.cuf, jElapsedRealtime);
        }
        com.bytedance.sdk.openadsdk.dg.xq.emc(this.uym, this.cuf, System.currentTimeMillis() - this.dr, true);
        qh();
    }

    private void ul() {
        com.bytedance.sdk.component.zz.ycc yccVar = this.rie;
        if (yccVar == null || yccVar.getWebView() == null) {
            return;
        }
        this.pxa = this.rie.emc;
        this.wa = this.rie.ypw;
        this.rqm = this.rie.xq;
        if (this.rie.ypw()) {
            this.rtt.fu();
            this.dr = System.currentTimeMillis();
        }
        if (this.rie.dg()) {
            sz();
        }
        if (this.rie.xq()) {
            sz();
            int iEmc = tp.emc(this.rie.getWebView());
            ypw ypwVar = this.rig;
            if (ypwVar != null) {
                ypwVar.emc(iEmc != 1 ? 0 : 1);
            }
        }
    }

    public static boolean uym(rie rieVar) {
        return rieVar != null && rieVar.fu() == 33;
    }

    private void vk() {
        if ((dg(this.uym) || uym(this.uym)) && (this.lt instanceof com.bytedance.sdk.openadsdk.core.sz.dg.ypw)) {
            this.rtt.fu();
            this.rtt.aa();
        }
    }

    public static boolean ycc(rie rieVar) {
        db dbVarIvb;
        return (rieVar == null || (dbVarIvb = rieVar.ivb()) == null || dbVarIvb.emc() != 2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean yzg() {
        return rie.bw(this.uym);
    }

    public static boolean zz(rie rieVar) {
        return (rieVar == null || rieVar.tf() == 1 || !ru(rieVar)) ? false : true;
    }

    public boolean dg() {
        return this.uym.in() == 15 || this.uym.in() == 16;
    }

    public void msw() {
        com.bytedance.sdk.openadsdk.dg.sz szVar = this.tp;
        if (szVar != null) {
            szVar.msw();
        }
    }

    public void uym() {
        com.bytedance.sdk.openadsdk.core.rtt rttVar = this.sra;
        if (rttVar != null) {
            rttVar.gbl();
        }
        com.bytedance.sdk.openadsdk.dg.sz szVar = this.tp;
        if (szVar != null) {
            szVar.uym();
        }
    }

    public void xq() {
        if (yzg()) {
            try {
                String str = this.uym.iat().f6585f;
                com.bytedance.sdk.openadsdk.ru.dg.emc().emc(str).emc(this.uym.iat().f6581b).ypw(this.uym.iat().f6580a).bw(vw.bw(com.bytedance.sdk.openadsdk.core.aa.emc())).dg(vw.xq(com.bytedance.sdk.openadsdk.core.aa.emc())).xq(2).emc(new emc()).emc(new com.bytedance.sdk.openadsdk.ru.ypw(this.uym, str, new com.bytedance.sdk.component.bw.vk() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.4
                    @Override // com.bytedance.sdk.component.bw.vk
                    public void emc(int i, String str2, Throwable th) {
                    }

                    @Override // com.bytedance.sdk.component.bw.vk
                    public void emc(com.bytedance.sdk.component.bw.gbl gblVar) {
                        try {
                            Object objYpw = gblVar.ypw();
                            if (objYpw != null && gblVar.xq() != null) {
                                BitmapDrawable bitmapDrawable = objYpw instanceof Bitmap ? new BitmapDrawable(com.bytedance.sdk.openadsdk.core.aa.emc().getResources(), (Bitmap) objYpw) : null;
                                View viewVk = ul.this.rtt.vk();
                                if (bitmapDrawable == null || viewVk == null || !(viewVk.getParent() instanceof View)) {
                                    return;
                                }
                                ((View) viewVk.getParent()).setBackground(bitmapDrawable);
                            }
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.ul.xq("LandingPageModel", th.getMessage());
                        }
                    }
                }));
            } catch (Exception unused) {
            }
        }
    }

    public void ypw() {
        rie rieVar = this.uym;
        if (rieVar == null || TextUtils.isEmpty(rieVar.xxo())) {
            return;
        }
        this.ylm.setText(this.uym.xxo());
    }

    public static boolean dg(rie rieVar) {
        if (rieVar == null) {
            return false;
        }
        if (gbl(rieVar)) {
            return true;
        }
        return rieVar.sx() == 3 && (rieVar.fu() == 5 || bw(rieVar)) && !dr.ypw(rieVar) && (rieVar.kx() == 0.0f || rieVar.kx() == 100.0f);
    }

    public void ru() {
        if ("landingpage_split_screen".equals(this.cuf) && com.bytedance.sdk.openadsdk.sra.emc.emc("default_split_style", false) && this.yid.compareAndSet(false, true)) {
            iyl.emc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.10
                @Override // java.lang.Runnable
                public void run() {
                    ul.this.pe = ValueAnimator.ofFloat(1.0f, 0.0f);
                    ul.this.pe.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.10.1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public void onAnimationUpdate(ValueAnimator valueAnimator) {
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            if (ul.this.sf != null) {
                                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ul.this.sf.getLayoutParams();
                                layoutParams.weight = fFloatValue;
                                ul.this.sf.setLayoutParams(layoutParams);
                            }
                        }
                    });
                    ul.this.pe.setDuration(500L);
                    ul.this.pe.start();
                    if (ul.this.db != null) {
                        ul.this.db.setVisibility(8);
                    }
                }
            });
        }
    }

    public void ycc() {
        com.bytedance.sdk.component.zz.ycc yccVar;
        com.bytedance.sdk.openadsdk.dg.sz szVar = this.tp;
        if (szVar != null && (yccVar = this.rie) != null) {
            szVar.emc(yccVar);
        }
        Handler handler = this.cf;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        ValueAnimator valueAnimator = this.pe;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            this.pe.cancel();
        }
        ValueAnimator valueAnimator2 = this.ru;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
            this.ru.cancel();
        }
        ObjectAnimator objectAnimator = this.gbl;
        if (objectAnimator != null) {
            objectAnimator.removeAllUpdateListeners();
            this.gbl.cancel();
        }
        com.bytedance.sdk.openadsdk.common.sup supVar = this.ee;
        if (supVar != null) {
            supVar.ypw();
        }
        ObjectAnimator objectAnimator2 = this.zz;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        com.bytedance.sdk.component.zz.ycc yccVar2 = this.rie;
        if (yccVar2 != null) {
            com.bytedance.sdk.openadsdk.core.tp.emc(yccVar2.getWebView());
        }
        this.rie = null;
        com.bytedance.sdk.openadsdk.core.rtt rttVar = this.sra;
        if (rttVar != null) {
            rttVar.sup();
        }
        com.bytedance.sdk.openadsdk.dg.sz szVar2 = this.tp;
        if (szVar2 != null) {
            szVar2.dg(true);
        }
        if (!TextUtils.isEmpty(this.yz) && this.vw) {
            xq.emc.emc(this.wa, this.pxa, this.uym);
        }
        com.bytedance.sdk.openadsdk.uym.ypw.emc().emc(this.wpn);
    }

    public boolean zz() {
        AtomicBoolean atomicBoolean;
        return (!xq(this.uym) || (atomicBoolean = this.cn) == null || atomicBoolean.get()) ? false : true;
    }

    public static boolean ypw(rie rieVar) {
        return rieVar != null && rieVar.sx() == 3 && rieVar.fu() == 6 && !dr.ypw(rieVar) && rieVar.ono() == 1 && (rieVar.kx() == 0.0f || rieVar.kx() == 100.0f);
    }

    public void bw() {
        FrameLayout frameLayout = this.hxp;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            View view = this.sf;
            if (view != null) {
                view.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dg(int i) {
        vw.emc((View) this.fu, i);
        vw.emc((View) this.nw, i);
        if (this.ra.get()) {
            vw.emc((View) this.sba, i);
            vw.emc((View) this.yzg, i);
            vw.emc((View) this.ul, i);
            vw.emc((View) this.ylm, 0);
        }
    }

    public void emc(c cVar) {
        this.sup = cVar;
    }

    public void emc() {
        long jEmc;
        View view;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.zz.ycc yccVar = (com.bytedance.sdk.component.zz.ycc) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.sra);
        this.rie = yccVar;
        if (yccVar != null && !rie.emc(this.uym)) {
            if (!this.rie.k_()) {
                this.rie.bw();
            }
        } else {
            vw.emc((View) this.rie, 8);
        }
        this.hxp = (FrameLayout) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.ylm);
        this.ee = (com.bytedance.sdk.openadsdk.common.sup) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.db);
        this.db = this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.rie);
        this.sb = (ImageView) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.hxp);
        this.sf = this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.mkp);
        this.ypw = (FrameLayout) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.yzg);
        this.emc = (ImageView) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.ul);
        this.ycc = (RelativeLayout) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.ee);
        this.xq = (TextView) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.ono);
        this.dg = (FrameLayout) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.sup);
        View viewFindViewById = this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.sb);
        this.vk = viewFindViewById;
        if (viewFindViewById == null) {
            this.vk = this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.mxo);
        }
        this.aa = this.lt.findViewById(com.bytedance.sdk.openadsdk.utils.vk.sf);
        this.sba = (TextView) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.xmt);
        this.yzg = (TextView) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.lt);
        this.ul = (com.bytedance.sdk.openadsdk.core.widget.aa) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.dr);
        this.ylm = (TextView) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.cuf);
        if (this.xq != null && this.uym.hxp() != null) {
            this.xq.setText(this.uym.hxp().bw());
        }
        this.bw = this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.rtt);
        this.ffd = (com.bytedance.sdk.openadsdk.core.ycc.dg) this.mkp.findViewById(com.bytedance.sdk.openadsdk.utils.vk.jl);
        if ((dg(this.uym) || ypw(this.uym) || uym(this.uym) || xq(this.uym)) && this.uym.hxp() != null) {
            View view2 = this.bw;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            if (uym(this.uym)) {
                jEmc = this.uym.hxp().xq();
            } else {
                jEmc = this.uym.hxp().emc();
            }
            com.bytedance.sdk.openadsdk.core.qh.xq().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.11
                @Override // java.lang.Runnable
                public void run() {
                    if (ul.this.xmt.get()) {
                        return;
                    }
                    ul ulVar = ul.this;
                    com.bytedance.sdk.openadsdk.dg.xq.emc(ulVar.uym, ulVar.cuf, System.currentTimeMillis() - ul.this.dr, false);
                    ul.this.cf();
                }
            }, jEmc * 1000);
        }
        gbl();
        if (ypw(this.uym)) {
            sba();
            if (!dg()) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.hxp.getLayoutParams();
                layoutParams.weight = 2.33f;
                this.hxp.setLayoutParams(layoutParams);
            }
        }
        if ((dg(this.uym) || uym(this.uym)) && (view = this.sf) != null) {
            view.setVisibility(8);
        }
        com.bytedance.sdk.openadsdk.common.sup supVar = this.ee;
        if (supVar != null) {
            supVar.emc(this.uym);
        }
        if (xq(this.uym)) {
            aa();
        }
        xq.emc.emc(SystemClock.elapsedRealtime() - jElapsedRealtime, this.uym, this.cuf, this.wpn, this.yz);
    }

    public void ypw(int i) {
        com.bytedance.sdk.openadsdk.core.zz.ul ulVar = this.ndl;
        if (ulVar != null) {
            ulVar.bw(i);
        }
    }

    public static boolean sz(rie rieVar) {
        if (rieVar != null) {
            return bw(rieVar) || ycc(rieVar);
        }
        return false;
    }

    public static boolean sup(rie rieVar) {
        return rieVar != null && rieVar.fu() == 8 && rieVar.wbn() == 1;
    }

    public static boolean xq(rie rieVar) {
        return rieVar != null && rieVar.sx() == 3 && rieVar.nw() == 38 && rieVar.ono() == 1;
    }

    public static boolean gbl(rie rieVar) {
        return rieVar != null && rieVar.fu() == 19;
    }

    public static boolean emc(rie rieVar) {
        if (rieVar == null || gbl(rieVar) || ycc(rieVar) || bw(rieVar)) {
            return false;
        }
        return dg(rieVar) || ypw(rieVar) || uym(rieVar);
    }

    public void emc(int i) {
        com.bytedance.sdk.openadsdk.core.sz.dg.ypw ypwVar = this.rtt;
        if (ypwVar != null) {
            ypwVar.bw();
        }
    }

    public void emc(float f2) {
        try {
            this.rtt.cf();
        } catch (Throwable unused) {
        }
    }

    public void emc(com.bytedance.sdk.openadsdk.core.zz.ul ulVar, FrameLayout frameLayout) {
        this.ndl = ulVar;
        this.hj = frameLayout;
    }

    public void emc(final int i, com.bytedance.sdk.component.adexpress.ypw.qh qhVar) {
        float f2;
        int iYcc;
        if ((i != 3 && !xq(i)) || this.hj == null || qhVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = this.cn;
        if (atomicBoolean != null) {
            if (i == 1) {
                return;
            }
            if (i == 5 && atomicBoolean.get()) {
                return;
            }
        }
        final LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.sf.getLayoutParams();
        this.wbn = (LinearLayout.LayoutParams) this.hxp.getLayoutParams();
        final float f5 = layoutParams.weight;
        yzg yzgVarDb = this.uym.db();
        if (xq(i)) {
            if (yzgVarDb != null) {
                iYcc = yzgVarDb.bw();
                f2 = iYcc;
            } else {
                f2 = 30.0f;
            }
        } else if (yzgVarDb != null) {
            iYcc = yzgVarDb.ycc();
            f2 = iYcc;
        } else {
            f2 = 70.0f;
        }
        final float f6 = f2;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.hj.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        }
        final FrameLayout.LayoutParams layoutParams3 = layoutParams2;
        final int i3 = layoutParams3.height;
        final int i6 = layoutParams3.width;
        final int i7 = layoutParams3.leftMargin;
        final int i8 = layoutParams3.topMargin;
        final int iYpw = vw.ypw(this.lt, (float) qhVar.uym());
        final int iYpw2 = vw.ypw(this.lt, (float) qhVar.msw());
        final int iYpw3 = vw.ypw(this.lt, (float) qhVar.bw());
        final int iYpw4 = vw.ypw(this.lt, (float) qhVar.ycc());
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.ru = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.ru.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.openadsdk.core.model.ul.9
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                LinearLayout.LayoutParams layoutParams4 = layoutParams;
                float f7 = f5;
                layoutParams4.weight = AbstractC1135f5.h(f6, f7, fFloatValue, f7);
                ul.this.wbn.weight = 100.0f - layoutParams.weight;
                if (ul.this.sf != null) {
                    ul.this.sf.setLayoutParams(layoutParams);
                }
                if (ul.this.hxp != null) {
                    ul.this.hxp.setLayoutParams(ul.this.wbn);
                }
                if (ul.this.wbn.weight < 30.0f) {
                    ul.this.dg(8);
                } else {
                    ul.this.dg(0);
                }
                FrameLayout.LayoutParams layoutParams5 = layoutParams3;
                layoutParams5.width = i6 + ((int) ((iYpw - r2) * fFloatValue));
                layoutParams5.height = i3 + ((int) ((iYpw2 - r2) * fFloatValue));
                layoutParams5.leftMargin = i7 + ((int) ((iYpw3 - r2) * fFloatValue));
                layoutParams5.topMargin = i8 + ((int) ((iYpw4 - r2) * fFloatValue));
                if (ul.this.hj != null) {
                    ul.this.hj.setLayoutParams(layoutParams3);
                }
                ul.this.emc(0.0f);
                if (fFloatValue == 1.0f) {
                    if (ul.this.ffd != null) {
                        vw.emc((View) ul.this.ffd, 0);
                        if (ul.this.xq(i)) {
                            ul.this.ffd.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(ul.this.lt, "tt_ad_zoom_down"));
                            ul.this.ffd.setTag(1);
                        } else {
                            ul.this.ffd.setImageDrawable(com.bytedance.sdk.component.utils.rie.xq(ul.this.lt, "tt_ad_zoom_up"));
                            ul.this.ffd.setTag(2);
                        }
                    }
                    if (ul.this.cn == null) {
                        ul.this.cn = new AtomicBoolean();
                    }
                    ul.this.cn.set(ul.this.xq(i));
                }
            }
        });
        com.bytedance.sdk.openadsdk.dg.xq.dg(this.uym, this.cuf, i);
        this.ru.start();
        if (this.jp.compareAndSet(false, true)) {
            this.ltx = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.dg.sz szVar = this.tp;
        if (szVar != null) {
            szVar.emc(true, SystemClock.elapsedRealtime());
        }
        vw.emc((View) this.ffd, 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean emc(Runnable runnable) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.bv < 100) {
            return false;
        }
        this.bv = jCurrentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
