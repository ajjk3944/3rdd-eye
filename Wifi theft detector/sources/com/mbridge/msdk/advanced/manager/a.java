package com.mbridge.msdk.advanced.manager;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.l;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    protected CampaignEx f12691b;

    /* renamed from: c, reason: collision with root package name */
    protected MBNativeAdvancedView f12692c;

    /* renamed from: d, reason: collision with root package name */
    protected com.mbridge.msdk.advanced.middle.d f12693d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f12694e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.c f12695f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12696g;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f12698i;

    /* renamed from: j, reason: collision with root package name */
    protected String f12699j;

    /* renamed from: k, reason: collision with root package name */
    private String f12700k;

    /* renamed from: l, reason: collision with root package name */
    protected MBridgeIds f12701l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f12702m;

    /* renamed from: a, reason: collision with root package name */
    private String f12690a = "NativeAdvancedShowManager";

    /* renamed from: h, reason: collision with root package name */
    private int f12697h = -1;

    /* renamed from: n, reason: collision with root package name */
    private View.OnClickListener f12703n = new ViewOnClickListenerC0231a();

    /* renamed from: o, reason: collision with root package name */
    public Handler f12704o = new b(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.advanced.middle.a f12705p = new c();

    /* renamed from: com.mbridge.msdk.advanced.manager.a$a, reason: collision with other inner class name */
    public class ViewOnClickListenerC0231a implements View.OnClickListener {
        public ViewOnClickListenerC0231a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (a.this.f12696g) {
                a.this.a(1);
            }
        }
    }

    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            CampaignEx campaignEx;
            MBNativeAdvancedView mBNativeAdvancedView;
            MBNativeAdvancedWebview advancedNativeWebview;
            super.handleMessage(message);
            if (message.what != 2 || (campaignEx = a.this.f12691b) == null || !campaignEx.isActiveOm() || (mBNativeAdvancedView = a.this.f12692c) == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null) {
                return;
            }
            try {
                o5.b adSession = advancedNativeWebview.getAdSession();
                if (adSession != null) {
                    o5.a aVarA = o5.a.a(adSession);
                    aVarA.c();
                    aVarA.b();
                    q0.a("OMSDK", "adSession.impressionOccurred()");
                }
            } catch (Throwable th) {
                q0.a("OMSDK", th.getMessage());
                CampaignEx campaignEx2 = a.this.f12691b;
                if (campaignEx2 != null) {
                    String requestId = campaignEx2.getRequestId();
                    String requestIdNotice = a.this.f12691b.getRequestIdNotice();
                    String id = a.this.f12691b.getId();
                    new h(advancedNativeWebview.getContext()).a(requestId, requestIdNotice, id, a.this.f12699j, "fetch OM failed, exception" + th.getMessage());
                }
            }
        }
    }

    public class c implements com.mbridge.msdk.advanced.middle.a {
        public c() {
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(CampaignEx campaignEx) {
            a.this.a(campaignEx, false, "");
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void close() {
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void toggleCloseBtn(int i10) {
            a.this.f12697h = i10;
            MBNativeAdvancedView mBNativeAdvancedView = a.this.f12692c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.changeCloseBtnState(i10);
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void triggerCloseBtn(Object obj, String str) {
            MBNativeAdvancedView mBNativeAdvancedView = a.this.f12692c;
            if (mBNativeAdvancedView != null) {
                mBNativeAdvancedView.setVisibility(8);
            }
            a.this.a(1);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(int i10) {
            q0.b(a.this.f12690a, "resetCountdown" + i10);
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z10) {
            a aVar = a.this;
            if (aVar.f12693d != null) {
                aVar.f12702m = z10;
                if (z10) {
                    a aVar2 = a.this;
                    aVar2.f12693d.f(aVar2.f12701l);
                } else {
                    a aVar3 = a.this;
                    aVar3.f12693d.a(aVar3.f12701l);
                }
            }
        }

        @Override // com.mbridge.msdk.advanced.middle.a
        public void a(boolean z10, String str) {
            try {
                if (a.this.f12693d != null) {
                    if (TextUtils.isEmpty(str)) {
                        a aVar = a.this;
                        aVar.f12693d.b(aVar.f12701l);
                        a aVar2 = a.this;
                        aVar2.f12693d.d(aVar2.f12701l);
                        return;
                    }
                    CampaignEx campaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(a.this.f12691b));
                    campaignWithBackData.setClickTempSource(2);
                    campaignWithBackData.setClickType(2);
                    campaignWithBackData.setTriggerClickSource(2);
                    campaignWithBackData.setClickURL(str);
                    a.this.a(campaignWithBackData, z10, str);
                }
            } catch (Exception e10) {
                q0.b(a.this.f12690a, e10.getMessage());
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f12711a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f12712b;

        public e(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView) {
            this.f12711a = campaignEx;
            this.f12712b = mBNativeAdvancedView;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.a(this.f12711a, this.f12712b, false);
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f12714a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f12715b;

        public f(Context context, CampaignEx campaignEx) {
            this.f12714a = context;
            this.f12715b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j.a(g.a(this.f12714a)).b(this.f12715b.getId());
            } catch (Exception unused) {
                q0.b(a.this.f12690a, "campain can't insert db");
            }
        }
    }

    public a(Context context, String str, String str2) {
        this.f12699j = str2;
        this.f12700k = str;
        this.f12701l = new MBridgeIds(str, str2);
        if (this.f12698i == null) {
            ImageView imageView = new ImageView(context);
            this.f12698i = imageView;
            imageView.setPadding(v0.a(context, 2.0f), v0.a(context, 2.0f), v0.a(context, 2.0f), v0.a(context, 2.0f));
            d();
        }
    }

    private void d() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f12698i.setScaleType(ImageView.ScaleType.FIT_XY);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f12698i.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(v0.a(contextD, 29.0f), v0.a(contextD, 16.0f));
        }
        this.f12698i.setLayoutParams(layoutParams);
        this.f12698i.setImageResource(contextD.getResources().getIdentifier("mbridge_native_advanced_close_icon", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
    }

    private void h() {
        if (this.f12691b.isReport()) {
            return;
        }
        a(this.f12691b);
        com.mbridge.msdk.advanced.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12691b, this.f12699j);
        com.mbridge.msdk.advanced.middle.d dVar = this.f12693d;
        if (dVar != null) {
            dVar.e(this.f12701l);
        }
    }

    private void i() {
        CampaignEx campaignEx;
        MBNativeAdvancedView mBNativeAdvancedView = this.f12692c;
        if (mBNativeAdvancedView == null || (campaignEx = this.f12691b) == null) {
            return;
        }
        mBNativeAdvancedView.setAdChoiceCampaign(campaignEx);
    }

    public void a(CampaignEx campaignEx, boolean z10, String str) {
        throw null;
    }

    public String c() {
        CampaignEx campaignEx = this.f12691b;
        return (campaignEx == null || campaignEx.getRequestId() == null) ? "" : this.f12691b.getRequestId();
    }

    public void e() {
        MBNativeAdvancedWebview advancedNativeWebview;
        MBNativeAdvancedView mBNativeAdvancedView = this.f12692c;
        if (mBNativeAdvancedView == null || (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) advancedNativeWebview, "onViewDisappeared", "");
    }

    public void f() {
        MBNativeAdvancedWebview advancedNativeWebview;
        if (this.f12692c == null || com.mbridge.msdk.foundation.feedback.b.f14986f || (advancedNativeWebview = this.f12692c.getAdvancedNativeWebview()) == null || advancedNativeWebview.isDestoryed()) {
            return;
        }
        com.mbridge.msdk.advanced.signal.a.a(advancedNativeWebview, "onViewAppeared", "");
    }

    public void g() {
        if (this.f12693d != null) {
            this.f12693d = null;
        }
        if (this.f12705p != null) {
            this.f12705p = null;
        }
        if (this.f12703n != null) {
            this.f12703n = null;
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f12692c;
        if (mBNativeAdvancedView != null) {
            MBNativeAdvancedWebview advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
            this.f12692c.destroy();
        }
        if (this.f12695f != null) {
            this.f12695f = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f12699j);
    }

    public com.mbridge.msdk.advanced.middle.a b() {
        return this.f12705p;
    }

    private void b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    return;
                }
                com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f13050n);
            } catch (Throwable th) {
                q0.b(this.f12690a, th.getMessage());
            }
        }
    }

    private void c(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls == null || pv_urls.size() <= 0) {
                    return;
                }
                Iterator<String> it = pv_urls.iterator();
                while (it.hasNext()) {
                    CampaignEx campaignEx2 = campaignEx;
                    Context context2 = context;
                    String str2 = str;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, str2, it.next(), false, true);
                    context = context2;
                    campaignEx = campaignEx2;
                    str = str2;
                }
            } catch (Throwable th) {
                q0.b(this.f12690a, th.getMessage());
            }
        }
    }

    public void a(com.mbridge.msdk.advanced.middle.c cVar) {
        this.f12695f = cVar;
    }

    public void a(com.mbridge.msdk.advanced.middle.d dVar) {
        this.f12693d = dVar;
    }

    public String a() {
        ArrayList arrayList = new ArrayList();
        CampaignEx campaignEx = this.f12691b;
        if (campaignEx != null) {
            arrayList.add(campaignEx);
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    public class d implements com.mbridge.msdk.foundation.feedback.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBNativeAdvancedView f12709a;

        public d(MBNativeAdvancedView mBNativeAdvancedView) {
            this.f12709a = mBNativeAdvancedView;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            String string;
            a.this.e();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 1);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(a.this.f12690a, th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f12709a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(a.this.f12690a, th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f12709a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            String string;
            a.this.f();
            try {
                JSONObject jSONObject = new JSONObject();
                if (com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                    jSONObject.put(NotificationCompat.CATEGORY_STATUS, 2);
                }
                string = jSONObject.toString();
            } catch (Throwable th) {
                q0.b(a.this.f12690a, th.getMessage(), th);
                string = "";
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f12709a.getAdvancedNativeWebview(), "onFeedbackAlertStatusNotify", Base64.encodeToString(string.getBytes(), 2));
        }
    }

    public void a(CampaignEx campaignEx, MBNativeAdvancedView mBNativeAdvancedView, boolean z10) {
        MBNativeAdvancedWebview advancedNativeWebview;
        View viewA;
        RelativeLayout.LayoutParams layoutParams;
        if (mBNativeAdvancedView == null) {
            return;
        }
        this.f12691b = campaignEx;
        this.f12692c = mBNativeAdvancedView;
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f12699j, new d(mBNativeAdvancedView));
        if (campaignEx.isMraid() && com.mbridge.msdk.foundation.feedback.b.b().a() && (viewA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f12699j)) != null) {
            try {
                layoutParams = (RelativeLayout.LayoutParams) viewA.getLayoutParams();
            } catch (Exception e10) {
                e10.printStackTrace();
                layoutParams = null;
            }
            if (layoutParams == null) {
                layoutParams = new RelativeLayout.LayoutParams(com.mbridge.msdk.foundation.feedback.b.f14985e, com.mbridge.msdk.foundation.feedback.b.f14984d);
            }
            layoutParams.addRule(12);
            ViewGroup viewGroup = (ViewGroup) viewA.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(viewA);
            }
            mBNativeAdvancedView.addView(viewA, layoutParams);
        }
        a(this.f12696g);
        com.mbridge.msdk.advanced.signal.b advancedNativeSignalCommunicationImpl = mBNativeAdvancedView.getAdvancedNativeSignalCommunicationImpl();
        campaignEx.setLocalRequestId(campaignEx.getCurrentLocalRid());
        List<CampaignEx> arrayList = new ArrayList<>();
        arrayList.add(campaignEx);
        if (advancedNativeSignalCommunicationImpl == null) {
            advancedNativeSignalCommunicationImpl = new com.mbridge.msdk.advanced.signal.b(mBNativeAdvancedView.getContext(), this.f12700k, this.f12699j);
            advancedNativeSignalCommunicationImpl.a(arrayList);
        }
        advancedNativeSignalCommunicationImpl.a(this.f12696g ? 1 : 0);
        advancedNativeSignalCommunicationImpl.a(this.f12705p);
        mBNativeAdvancedView.setAdvancedNativeSignalCommunicationImpl(advancedNativeSignalCommunicationImpl);
        b1.a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (campaignEx.isHasMBTplMark() || !this.f12696g) {
            this.f12698i.setVisibility(8);
        }
        a(this.f12698i);
        mBNativeAdvancedView.setCloseView(this.f12698i);
        if (mBNativeAdvancedView.getVisibility() != 0) {
            mBNativeAdvancedView.setVisibility(0);
        }
        l lVarA = com.mbridge.msdk.foundation.tools.h.a(mBNativeAdvancedView.getAdvancedNativeWebview(), campaignEx.getImpReportType());
        if (this.f12695f == null || !lVarA.a() || this.f12695f.d() == null || this.f12695f.d().getAlpha() < 0.5f || this.f12695f.d().getVisibility() != 0 || this.f12702m) {
            if (z10) {
                mBNativeAdvancedView.postDelayed(new e(campaignEx, mBNativeAdvancedView), 200L);
                return;
            }
            return;
        }
        com.mbridge.msdk.foundation.tools.h.a(arrayList, lVarA);
        mBNativeAdvancedView.show();
        com.mbridge.msdk.foundation.controller.c.n().a(mBNativeAdvancedView.getContext());
        campaignEx.setCampaignUnitId(this.f12699j);
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f12699j, campaignEx);
        CampaignEx campaignEx2 = this.f12691b;
        if (campaignEx2 != null && campaignEx2.isActiveOm() && (advancedNativeWebview = mBNativeAdvancedView.getAdvancedNativeWebview()) != null) {
            try {
                o5.b bVarA = com.mbridge.msdk.omsdk.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), advancedNativeWebview, advancedNativeWebview.getUrl(), this.f12691b);
                if (bVarA != null) {
                    advancedNativeWebview.setAdSession(bVarA);
                    bVarA.d(advancedNativeWebview);
                    bVarA.g();
                    q0.a("OMSDK", "adSession.start()");
                }
            } catch (Throwable th) {
                q0.a("OMSDK", th.getMessage());
                CampaignEx campaignEx3 = this.f12691b;
                if (campaignEx3 != null) {
                    String requestId = campaignEx3.getRequestId();
                    String requestIdNotice = this.f12691b.getRequestIdNotice();
                    String id = this.f12691b.getId();
                    new h(com.mbridge.msdk.foundation.controller.c.n().d()).a(requestId, requestIdNotice, id, this.f12699j, "fetch OM failed, exception" + th.getMessage());
                }
            }
        }
        h();
        if (campaignEx.isMraid()) {
            i();
        }
        int i10 = this.f12697h;
        if (i10 != -1) {
            mBNativeAdvancedView.changeCloseBtnState(i10);
        }
        com.mbridge.msdk.advanced.manager.d.b(this.f12699j);
        com.mbridge.msdk.advanced.common.c.b(this.f12700k + this.f12699j + campaignEx.getRequestId());
        this.f12704o.sendEmptyMessageDelayed(2, 1000L);
        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f12691b.getMaitve(), this.f12691b.getMaitve_src());
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx.isHasMBTplMark()) {
            return;
        }
        a(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f12699j);
        campaignEx.setReport(true);
        com.mbridge.msdk.foundation.same.buffer.b.a(this.f12699j, campaignEx, "h5_native");
        b(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f12699j);
        c(campaignEx, com.mbridge.msdk.foundation.controller.c.n().d(), this.f12699j);
    }

    public void a(boolean z10) {
        this.f12696g = z10;
    }

    private void a(View view) {
        if (view != null) {
            view.setOnClickListener(this.f12703n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10) {
        com.mbridge.msdk.advanced.middle.d dVar = this.f12693d;
        if (dVar != null) {
            dVar.c(this.f12701l);
            this.f12693d = null;
            com.mbridge.msdk.advanced.report.a.a(this.f12699j, this.f12691b);
        }
        com.mbridge.msdk.advanced.report.a.a(this.f12699j, i10, this.f12691b);
        MBNativeAdvancedView mBNativeAdvancedView = this.f12692c;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.setVisibility(8);
            e();
            MBNativeAdvancedWebview advancedNativeWebview = this.f12692c.getAdvancedNativeWebview();
            if (advancedNativeWebview != null) {
                advancedNativeWebview.finishAdSession();
            }
        }
        Handler handler = this.f12704o;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void a(CampaignEx campaignEx, Context context, String str) {
        com.mbridge.msdk.foundation.controller.c.n().a(context);
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new f(context, campaignEx)).start();
            com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, com.mbridge.msdk.click.retry.a.f13049m);
        }
        if (TextUtils.isEmpty(str) || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().p() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(context, campaignEx, str, campaignEx.getNativeVideoTracking().p(), false, false);
    }
}
