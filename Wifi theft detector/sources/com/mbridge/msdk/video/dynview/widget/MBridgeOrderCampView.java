package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.video.bt.module.orglistener.f;
import com.mbridge.msdk.video.module.MBridgeBaseView;
import com.mbridge.msdk.widget.FeedBackButton;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class MBridgeOrderCampView extends MBridgeBaseView {

    /* renamed from: m, reason: collision with root package name */
    private MBridgeOrderCampView f18850m;

    /* renamed from: n, reason: collision with root package name */
    private List<CampaignEx> f18851n;

    /* renamed from: o, reason: collision with root package name */
    private int f18852o;

    /* renamed from: p, reason: collision with root package name */
    private int f18853p;

    /* renamed from: q, reason: collision with root package name */
    private int f18854q;

    /* renamed from: r, reason: collision with root package name */
    private int f18855r;

    /* renamed from: s, reason: collision with root package name */
    private String f18856s;

    /* renamed from: t, reason: collision with root package name */
    private FeedBackButton f18857t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f18858u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f18859v;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.c f18860w;

    /* renamed from: x, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.b f18861x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f18862y;

    public class a implements com.mbridge.msdk.video.dynview.listener.c {
        public a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.c
        public void a(CampaignEx campaignEx, int i10) {
            if (campaignEx != null) {
                try {
                    MBridgeOrderCampView.this.setCampaign(campaignEx);
                    campaignEx.setClickTempSource(2);
                    campaignEx.setTriggerClickSource(2);
                    MBridgeOrderCampView.this.a(campaignEx, 0, i10);
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.c
        public void close() {
            MBridgeOrderCampView.this.g();
        }
    }

    public class c implements com.mbridge.msdk.foundation.feedback.a {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
        }
    }

    public class d implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f18867a;

        public d(String str) {
            this.f18867a = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.click.c.e(((MBridgeBaseView) MBridgeOrderCampView.this).f18951a, this.f18867a);
        }
    }

    public MBridgeOrderCampView(Context context) {
        super(context);
        this.f18859v = false;
        this.f18860w = new a();
        this.f18862y = false;
    }

    private void f() {
        if (this.f18858u == null) {
            return;
        }
        g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD == null) {
            this.f18858u.setVisibility(8);
            return;
        }
        String strC = gVarD.c();
        if (TextUtils.isEmpty(strC)) {
            this.f18858u.setVisibility(8);
        }
        this.f18858u.setOnClickListener(new d(strC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            e eVar = new e();
            eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000152", eVar);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000134", this.f18952b);
        } catch (Throwable th) {
            q0.a(MBridgeBaseView.TAG, th.getMessage());
        }
        try {
            com.mbridge.msdk.video.dynview.moffer.a.a().b();
        } catch (Exception e10) {
            q0.b(MBridgeBaseView.TAG, e10.getMessage());
        }
        com.mbridge.msdk.video.module.listener.a aVar = this.notifyListener;
        if (aVar != null) {
            aVar.a(104, "");
        }
    }

    public void createView(ViewGroup viewGroup) {
        if (this.f18851n == null) {
            com.mbridge.msdk.video.dynview.listener.b bVar = this.f18861x;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        HashMap map = new HashMap();
        map.put("order_view_callback", this.f18860w);
        com.mbridge.msdk.video.dynview.b.a().a(new com.mbridge.msdk.video.dynview.wrapper.c().b(com.mbridge.msdk.foundation.controller.c.n().d(), this.f18851n), new b(viewGroup), map);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        this.f18850m = this;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002d A[SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() throws org.json.JSONException {
        /*
            r4 = this;
            super.onAttachedToWindow()
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r4.f18851n
            if (r0 != 0) goto L8
            goto L30
        L8:
            r0 = 0
        L9:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r4.f18851n
            int r1 = r1.size()
            if (r0 >= r1) goto L30
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1e
            r1.<init>()     // Catch: org.json.JSONException -> L1e
            java.lang.String r2 = "camp_position"
            r1.put(r2, r0)     // Catch: org.json.JSONException -> L1c
            goto L24
        L1c:
            r2 = move-exception
            goto L21
        L1e:
            r1 = move-exception
            r2 = r1
            r1 = 0
        L21:
            r2.printStackTrace()
        L24:
            com.mbridge.msdk.video.module.listener.a r2 = r4.notifyListener
            if (r2 == 0) goto L2d
            r3 = 110(0x6e, float:1.54E-43)
            r2.a(r3, r1)
        L2d:
            int r0 = r0 + 1
            goto L9
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.onAttachedToWindow():void");
    }

    public void setCampOrderViewBuildCallback(com.mbridge.msdk.video.dynview.listener.b bVar) {
        this.f18861x = bVar;
    }

    public void setCampaignExes(List<CampaignEx> list) {
        this.f18851n = list;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        this.f18852o = i10;
        this.f18853p = i11;
        this.f18854q = i12;
        this.f18855r = i13;
        setViewStatus();
    }

    public void setRewarded(boolean z10) {
        this.f18862y = z10;
    }

    public void setViewStatus() {
        MBridgeOrderCampView mBridgeOrderCampView = this.f18850m;
        if (mBridgeOrderCampView == null || !this.f18862y) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) mBridgeOrderCampView.findViewById(filterFindViewId(this.f18859v, "mbridge_native_order_camp_controller"));
        this.f18857t = (FeedBackButton) this.f18850m.findViewById(filterFindViewId(this.f18859v, "mbridge_native_order_camp_feed_btn"));
        this.f18858u = (ImageView) this.f18850m.findViewById(filterFindViewId(this.f18859v, "mbridge_iv_link"));
        if (relativeLayout != null) {
            relativeLayout.setPadding(this.f18852o, this.f18854q, this.f18853p, this.f18855r);
        }
        if (this.f18857t != null) {
            try {
                e();
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
        if (this.f18858u != null) {
            try {
                f();
            } catch (Exception e11) {
                q0.b(MBridgeBaseView.TAG, e11.getMessage());
            }
        }
    }

    public void startAlphaAnimation() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(500L);
        this.f18850m.startAnimation(alphaAnimation);
    }

    public void startTranslateAnimation() {
        TranslateAnimation translateAnimation = new TranslateAnimation(2, 1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        translateAnimation.setDuration(500L);
        this.f18850m.startAnimation(translateAnimation);
    }

    private void e() {
        List<CampaignEx> list = this.f18851n;
        if (list == null || list.get(0) == null) {
            FeedBackButton feedBackButton = this.f18857t;
            if (feedBackButton != null) {
                feedBackButton.setVisibility(8);
                return;
            }
            return;
        }
        this.f18856s = this.f18851n.get(0).getCampaignUnitId();
        this.f18952b = this.f18851n.get(0);
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f18856s + "_2", this.f18952b);
        if (this.f18857t == null) {
            return;
        }
        if (!com.mbridge.msdk.foundation.feedback.b.b().a()) {
            this.f18857t.setVisibility(8);
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f18856s + "_2", new c());
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f18856s + "_2", this.f18857t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.mbridge.msdk.foundation.entity.CampaignEx r9, int r10, int r11) throws org.json.JSONException {
        /*
            r8 = this;
            if (r9 == 0) goto L62
            boolean r0 = r9.isDynamicView()
            if (r0 == 0) goto L62
            com.mbridge.msdk.foundation.entity.CampaignEx$c r0 = r9.getRewardTemplateMode()     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = ""
            if (r0 == 0) goto L23
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r2.<init>()     // Catch: java.lang.Exception -> L25
            int r0 = r0.k()     // Catch: java.lang.Exception -> L25
            r2.append(r0)     // Catch: java.lang.Exception -> L25
            r2.append(r1)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L25
        L23:
            r7 = r1
            goto L28
        L25:
            r0 = move-exception
            r9 = r0
            goto L59
        L28:
            com.mbridge.msdk.foundation.controller.c r0 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: java.lang.Exception -> L25
            android.content.Context r0 = r0.d()     // Catch: java.lang.Exception -> L25
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L25
            r1.<init>()     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = "order_view_click"
            r1.append(r2)     // Catch: java.lang.Exception -> L25
            r1.append(r7)     // Catch: java.lang.Exception -> L25
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L25
            java.lang.String r2 = r9.getCampaignUnitId()     // Catch: java.lang.Exception -> L25
            boolean r3 = r9.isBidCampaign()     // Catch: java.lang.Exception -> L25
            java.lang.String r4 = r9.getRequestId()     // Catch: java.lang.Exception -> L25
            java.lang.String r5 = r9.getRequestIdNotice()     // Catch: java.lang.Exception -> L25
            java.lang.String r6 = r9.getId()     // Catch: java.lang.Exception -> L25
            com.mbridge.msdk.foundation.same.report.j.a(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L25
            goto L62
        L59:
            java.lang.String r9 = r9.getMessage()
            java.lang.String r0 = "MBridgeBaseView"
            com.mbridge.msdk.foundation.tools.q0.b(r0, r9)
        L62:
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L79
            r9.<init>()     // Catch: org.json.JSONException -> L79
            java.lang.String r0 = com.mbridge.msdk.foundation.same.a.f15035j     // Catch: org.json.JSONException -> L76
            org.json.JSONObject r10 = r8.a(r10)     // Catch: org.json.JSONException -> L76
            r9.put(r0, r10)     // Catch: org.json.JSONException -> L76
            java.lang.String r10 = "camp_position"
            r9.put(r10, r11)     // Catch: org.json.JSONException -> L76
            goto L80
        L76:
            r0 = move-exception
            r10 = r0
            goto L7d
        L79:
            r0 = move-exception
            r9 = r0
            r10 = r9
            r9 = 0
        L7d:
            r10.printStackTrace()
        L80:
            com.mbridge.msdk.video.module.listener.a r10 = r8.notifyListener
            if (r10 == 0) goto L89
            r11 = 105(0x69, float:1.47E-43)
            r10.a(r11, r9)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.dynview.widget.MBridgeOrderCampView.a(com.mbridge.msdk.foundation.entity.CampaignEx, int, int):void");
    }

    public MBridgeOrderCampView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18859v = false;
        this.f18860w = new a();
        this.f18862y = false;
    }

    public class b implements com.mbridge.msdk.video.dynview.listener.h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f18864a;

        public b(ViewGroup viewGroup) {
            this.f18864a = viewGroup;
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.a aVar) {
            if (aVar != null) {
                try {
                    MBridgeOrderCampView.this.f18850m.addView(aVar.b());
                    MBridgeOrderCampView.this.f18859v = aVar.c();
                    this.f18864a.removeAllViews();
                    this.f18864a.addView(MBridgeOrderCampView.this.f18850m);
                    f.a(com.mbridge.msdk.foundation.controller.c.n().d(), (List<CampaignEx>) MBridgeOrderCampView.this.f18851n, ((CampaignEx) MBridgeOrderCampView.this.f18851n.get(0)).getCampaignUnitId());
                    MBridgeOrderCampView.this.setViewStatus();
                    if (MBridgeOrderCampView.this.f18861x != null) {
                        MBridgeOrderCampView.this.f18861x.a();
                    }
                } catch (Exception e10) {
                    q0.b(MBridgeBaseView.TAG, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.dynview.listener.h
        public void a(com.mbridge.msdk.video.dynview.error.a aVar) {
            try {
                f.a(com.mbridge.msdk.foundation.controller.c.n().d(), (List<CampaignEx>) MBridgeOrderCampView.this.f18851n, ((CampaignEx) MBridgeOrderCampView.this.f18851n.get(0)).getCampaignUnitId(), aVar.h());
                if (MBridgeOrderCampView.this.f18861x != null) {
                    MBridgeOrderCampView.this.f18861x.b();
                }
            } catch (Exception e10) {
                q0.b(MBridgeBaseView.TAG, e10.getMessage());
            }
        }
    }
}
