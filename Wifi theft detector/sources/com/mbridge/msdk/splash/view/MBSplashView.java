package com.mbridge.msdk.splash.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.AdError;
import com.mbridge.msdk.dycreator.listener.DyCountDownListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.d0;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.h;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.unity3d.ads.BuildConfig;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MBSplashView extends RelativeLayout {

    /* renamed from: u, reason: collision with root package name */
    private static String f17395u = "MBSplashView";

    /* renamed from: a, reason: collision with root package name */
    private int f17396a;

    /* renamed from: b, reason: collision with root package name */
    private MBSplashWebview f17397b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.splash.view.a f17398c;

    /* renamed from: d, reason: collision with root package name */
    private ViewGroup f17399d;

    /* renamed from: e, reason: collision with root package name */
    private View f17400e;

    /* renamed from: f, reason: collision with root package name */
    private View f17401f;

    /* renamed from: g, reason: collision with root package name */
    private int f17402g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f17403h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17404i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f17405j;

    /* renamed from: k, reason: collision with root package name */
    private ViewGroup f17406k;

    /* renamed from: l, reason: collision with root package name */
    private View f17407l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f17408m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f17409n;

    /* renamed from: o, reason: collision with root package name */
    private RelativeLayout.LayoutParams f17410o;

    /* renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.splash.signal.b f17411p;

    /* renamed from: q, reason: collision with root package name */
    private DyCountDownListener f17412q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f17413r;

    /* renamed from: s, reason: collision with root package name */
    private View.OnTouchListener f17414s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f17415t;

    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return !MBSplashView.this.f17413r;
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f17417a;

        public b(CampaignEx campaignEx) {
            this.f17417a = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            MBSplashView.this.b(this.f17417a);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                q0.a(MBSplashView.f17395u, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBSplashView.this.f17397b.getLocationOnScreen(iArr);
                    q0.b(MBSplashView.f17395u, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[0]));
                    jSONObject.put("startY", v0.b(com.mbridge.msdk.foundation.controller.c.n().d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    q0.b(MBSplashView.f17395u, th.getMessage(), th);
                }
                int[] iArr2 = new int[2];
                MBSplashView.this.f17397b.getLocationInWindow(iArr2);
                MBSplashView.transInfoForMraid(MBSplashView.this.f17397b, iArr2[0], iArr2[1], MBSplashView.this.f17397b.getWidth(), MBSplashView.this.f17397b.getHeight());
                f.a().a((WebView) MBSplashView.this.f17397b, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public MBSplashView(Context context) {
        this(context, null);
    }

    public static void transInfoForMraid(WebView webView, int i10, int i11, int i12, int i13) {
        q0.b(f17395u, "transInfoForMraid");
        try {
            int i14 = com.mbridge.msdk.foundation.controller.c.n().d().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, i14 == 2 ? "landscape" : i14 == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            float fN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
            float fM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
            HashMap mapV = m0.v(com.mbridge.msdk.foundation.controller.c.n().d());
            int iIntValue = ((Integer) mapV.get("width")).intValue();
            int iIntValue2 = ((Integer) mapV.get("height")).intValue();
            HashMap map = new HashMap();
            map.put("placementType", "Interstitial");
            map.put("state", BuildConfig.FLAVOR);
            map.put("viewable", "true");
            map.put("currentAppOrientation", jSONObject);
            float f10 = i10;
            float f11 = i11;
            float f12 = i12;
            float f13 = i13;
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, f10, f11, f12, f13);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().b(webView, fN, fM);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, iIntValue, iIntValue2);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView, map);
            com.mbridge.msdk.mbsignalcommon.mraid.a.a().a(webView);
        } catch (Throwable th) {
            q0.b(f17395u, "transInfoForMraid", th);
        }
    }

    public void changeCloseBtnState(int i10) {
        View view = this.f17400e;
        if (view != null) {
            if (i10 == 2) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
    }

    public void clearResState() {
        this.f17405j = false;
        this.f17404i = false;
        this.f17403h = false;
    }

    public void destroy() {
        removeAllViews();
        ViewGroup viewGroup = this.f17406k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        MBSplashWebview mBSplashWebview = this.f17397b;
        if (mBSplashWebview == null || mBSplashWebview.isDestoryed()) {
            return;
        }
        this.f17397b.finishAdSession();
        com.mbridge.msdk.splash.signal.c.a(this.f17397b, "onSystemDestory", "");
        this.f17397b.release();
        this.f17397b = null;
    }

    public View.OnTouchListener getAllowClickSplashTouchListener() {
        return this.f17414s;
    }

    public View getCloseView() {
        return this.f17400e;
    }

    public ViewGroup getDevContainer() {
        return this.f17406k;
    }

    public View getIconVg() {
        return this.f17401f;
    }

    public View getSplashNativeView() {
        return this.f17407l;
    }

    public com.mbridge.msdk.splash.signal.b getSplashSignalCommunicationImpl() {
        return this.f17411p;
    }

    public MBSplashWebview getSplashWebview() {
        return this.f17397b;
    }

    public boolean isAttach() {
        return this.f17409n;
    }

    public boolean isDynamicView() {
        return this.f17408m;
    }

    public boolean isH5Ready() {
        return this.f17403h;
    }

    public boolean isImageReady() {
        return this.f17405j;
    }

    public boolean isVideoReady() {
        return this.f17404i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17409n = true;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
    }

    public void onPause() {
        View view = this.f17407l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(true);
    }

    public void onResume() {
        View view = this.f17407l;
        if (view == null || !(view instanceof MBSplashNativeView)) {
            return;
        }
        ((MBSplashNativeView) view).setIsPause(false);
    }

    public void resetLoadState() {
        this.f17404i = false;
        this.f17403h = false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setAllowClickSplash(boolean z10) {
        this.f17413r = z10;
        setOnTouchListener(this.f17414s);
    }

    public void setCloseView(View view) {
        this.f17400e = view;
        if (view != null) {
            view.setContentDescription("closeButton");
        }
    }

    public void setDevContainer(ViewGroup viewGroup) {
        this.f17406k = viewGroup;
    }

    public void setDyCountDownListener(DyCountDownListener dyCountDownListener) {
        this.f17412q = dyCountDownListener;
    }

    public void setDynamicView(boolean z10) {
        this.f17408m = z10;
    }

    public void setH5Ready(boolean z10) {
        this.f17403h = z10;
    }

    public void setIconVg(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f17401f = view;
        this.f17410o = layoutParams;
    }

    public void setImageReady(boolean z10) {
        this.f17405j = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) throws JSONException {
        View view = this.f17407l;
        if (view != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).setNotchPadding(i10, i11, i12, i13);
        }
        if (this.f17397b != null) {
            f.a().a((WebView) this.f17397b, "oncutoutfetched", Base64.encodeToString(d0.a(-999, i10, i11, i12, i13).getBytes(), 0));
        }
    }

    public void setSplashNativeView(View view) {
        if (view != null) {
            this.f17407l = view;
        }
    }

    public void setSplashSignalCommunicationImpl(com.mbridge.msdk.splash.signal.b bVar) {
        this.f17411p = bVar;
        MBSplashWebview mBSplashWebview = this.f17397b;
        if (mBSplashWebview != null) {
            mBSplashWebview.setObject(bVar);
        }
    }

    public void setSplashWebView() {
        if (this.f17397b == null) {
            try {
                MBSplashWebview mBSplashWebview = new MBSplashWebview(getContext());
                this.f17397b = mBSplashWebview;
                com.mbridge.msdk.splash.signal.b bVar = this.f17411p;
                if (bVar != null) {
                    mBSplashWebview.setObject(bVar);
                }
                com.mbridge.msdk.splash.view.a aVar = this.f17398c;
                if (aVar != null) {
                    this.f17397b.setWebViewClient(aVar);
                    return;
                }
                com.mbridge.msdk.splash.view.a aVar2 = new com.mbridge.msdk.splash.view.a();
                this.f17398c = aVar2;
                this.f17397b.setWebViewClient(aVar2);
            } catch (Throwable th) {
                q0.b(f17395u, th.getMessage());
            }
        }
    }

    public void setVideoReady(boolean z10) {
        this.f17404i = z10;
    }

    public void show(CampaignEx campaignEx) {
        ViewGroup viewGroup;
        if (this.f17411p != null && (viewGroup = this.f17406k) != null && (viewGroup.getContext() instanceof Activity)) {
            this.f17411p.a(this.f17406k.getContext());
            com.mbridge.msdk.splash.view.a aVar = this.f17398c;
            if (aVar != null) {
                aVar.a(this.f17411p.a());
            }
        }
        a(campaignEx);
        clearResState();
    }

    public void updateCountdown(int i10) throws JSONException {
        DyCountDownListener dyCountDownListener;
        View view;
        if (this.f17397b != null && !this.f17408m) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("countdown", i10);
                f.a().a((WebView) this.f17397b, "updateCountdown", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        if (this.f17408m && (view = this.f17407l) != null && (view instanceof MBSplashNativeView)) {
            ((MBSplashNativeView) view).updateCountDown(i10);
        }
        if (!this.f17408m || (dyCountDownListener = this.f17412q) == null) {
            return;
        }
        dyCountDownListener.getCountDownValue(i10);
    }

    public MBSplashView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void b() {
        setBackgroundColor(0);
        this.f17396a = getResources().getConfiguration().orientation;
    }

    public MBSplashView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17413r = true;
        this.f17414s = new a();
        this.f17415t = true;
        b();
    }

    private void a(CampaignEx campaignEx) {
        View view;
        View view2;
        View view3;
        this.f17415t = true;
        if (this.f17401f == null) {
            if (this.f17408m && (view3 = this.f17407l) != null) {
                if (view3.getParent() != null) {
                    f1.a(this.f17407l);
                }
                addView(this.f17407l, new ViewGroup.LayoutParams(-1, -1));
            } else {
                MBSplashWebview mBSplashWebview = this.f17397b;
                if (mBSplashWebview != null && mBSplashWebview.getParent() == null) {
                    addView(this.f17397b, new ViewGroup.LayoutParams(-1, -1));
                }
                b(campaignEx);
            }
        } else {
            if (this.f17399d == null) {
                RelativeLayout relativeLayout = new RelativeLayout(getContext());
                this.f17399d = relativeLayout;
                relativeLayout.setId(2147482647);
            }
            if (this.f17396a == 2) {
                this.f17402g = v0.g(getContext());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(0, this.f17399d.getId());
                if (this.f17408m && (view2 = this.f17407l) != null) {
                    if (view2.getParent() != null) {
                        f1.a(this.f17407l);
                    }
                    addView(this.f17407l, layoutParams);
                } else {
                    MBSplashWebview mBSplashWebview2 = this.f17397b;
                    if (mBSplashWebview2 != null && mBSplashWebview2.getParent() == null) {
                        addView(this.f17397b, layoutParams);
                    }
                    b(campaignEx);
                }
                ViewGroup viewGroup = this.f17399d;
                if (viewGroup != null && viewGroup.getParent() == null) {
                    int i10 = this.f17410o.width;
                    f1.a(this.f17401f);
                    int i11 = this.f17402g / 4;
                    if (i10 > i11) {
                        this.f17399d.addView(this.f17401f, i11, -1);
                        i10 = i11;
                    } else {
                        this.f17399d.addView(this.f17401f, i10, -1);
                    }
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i10, -1);
                    layoutParams2.addRule(11);
                    layoutParams2.addRule(13);
                    addView(this.f17399d, layoutParams2);
                }
            } else {
                this.f17402g = v0.f(getContext());
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams3.addRule(2, this.f17399d.getId());
                if (this.f17408m && (view = this.f17407l) != null) {
                    if (view.getParent() != null) {
                        f1.a(this.f17407l);
                    }
                    addView(this.f17407l, layoutParams3);
                } else {
                    MBSplashWebview mBSplashWebview3 = this.f17397b;
                    if (mBSplashWebview3 != null && mBSplashWebview3.getParent() == null) {
                        addView(this.f17397b, layoutParams3);
                    }
                    b(campaignEx);
                }
                ViewGroup viewGroup2 = this.f17399d;
                if (viewGroup2 != null && viewGroup2.getParent() == null) {
                    int i12 = this.f17410o.height;
                    int i13 = this.f17402g / 4;
                    if (i12 > i13) {
                        i12 = i13;
                    }
                    f1.a(this.f17401f);
                    this.f17399d.addView(this.f17401f, -1, i12);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, i12);
                    layoutParams4.addRule(12);
                    addView(this.f17399d, layoutParams4);
                }
            }
        }
        View view4 = this.f17400e;
        if (view4 != null) {
            if (view4.getParent() == null) {
                RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(v0.a(getContext(), 100.0f), v0.a(getContext(), 30.0f));
                layoutParams5.addRule(10);
                layoutParams5.addRule(11);
                layoutParams5.rightMargin = v0.a(getContext(), 10.0f);
                layoutParams5.topMargin = v0.a(getContext(), 10.0f);
                addView(this.f17400e, layoutParams5);
                return;
            }
            bringChildToFront(this.f17400e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        MBSplashWebview mBSplashWebview = this.f17397b;
        if (mBSplashWebview != null) {
            if (!(campaignEx != null ? h.b(campaignEx, null, mBSplashWebview, campaignEx.getImpReportType()) : true)) {
                if (this.f17415t) {
                    this.f17415t = false;
                    this.f17397b.postDelayed(new b(campaignEx), 200L);
                    return;
                }
                return;
            }
            this.f17397b.setObject(this.f17411p);
            this.f17397b.post(new c());
        }
    }
}
