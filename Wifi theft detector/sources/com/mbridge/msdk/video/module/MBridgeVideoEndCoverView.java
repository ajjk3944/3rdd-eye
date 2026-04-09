package com.mbridge.msdk.video.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.video.module.listener.impl.j;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class MBridgeVideoEndCoverView extends MBridgeBaseView {

    /* renamed from: m, reason: collision with root package name */
    private final String f19072m;

    /* renamed from: n, reason: collision with root package name */
    private View f19073n;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f19074o;

    /* renamed from: p, reason: collision with root package name */
    private ImageView f19075p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f19076q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f19077r;

    /* renamed from: s, reason: collision with root package name */
    private TextView f19078s;

    /* renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.factory.b f19079t;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBridgeVideoEndCoverView.this.notifyListener.a(104, "");
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            MBridgeVideoEndCoverView.this.g();
        }
    }

    public MBridgeVideoEndCoverView(Context context) {
        super(context);
        this.f19072m = "MBridgeVideoEndCoverView";
    }

    private boolean a(View view) {
        if (view == null) {
            return true;
        }
        try {
            this.f19074o = (ImageView) view.findViewById(findID("mbridge_vec_iv_icon"));
            this.f19075p = (ImageView) view.findViewById(findID("mbridge_vec_iv_close"));
            this.f19076q = (TextView) view.findViewById(findID("mbridge_vec_tv_title"));
            this.f19077r = (TextView) view.findViewById(findID("mbridge_vec_tv_desc"));
            this.f19078s = (TextView) view.findViewById(findID("mbridge_vec_btn"));
            return true;
        } catch (Throwable th) {
            q0.b("MBridgeVideoEndCoverView", th.getMessage());
            return false;
        }
    }

    private void e() {
        ImageView imageView;
        CampaignEx campaignEx = this.f18952b;
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getIconUrl()) && (imageView = this.f19074o) != null) {
                b1.a(imageView, this.f18952b.getLocalRequestId(), this.f18952b.getLocalAllowTrackClick());
                com.mbridge.msdk.foundation.same.image.b.a(this.f18951a.getApplicationContext()).a(this.f18952b.getIconUrl(), new j(this.f19074o, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 8.0f)));
            }
            TextView textView = this.f19076q;
            if (textView != null) {
                textView.setText(this.f18952b.getAppName());
            }
            TextView textView2 = this.f19078s;
            if (textView2 != null) {
                b1.a(textView2, this.f18952b.getLocalRequestId(), this.f18952b.getLocalAllowTrackClick());
                this.f19078s.setText(this.f18952b.getAdCall());
            }
            TextView textView3 = this.f19077r;
            if (textView3 != null) {
                textView3.setText(this.f18952b.getAppDesc());
            }
        }
    }

    private void f() {
        View view = this.f19073n;
        if (view == null) {
            init(this.f18951a);
            preLoadData(this.f19079t);
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) this.f19073n.getParent()).removeView(this.f19073n);
        }
        addView(this.f19073n);
        a(this.f19073n);
        d();
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void d() {
        super.d();
        this.f19075p.setOnClickListener(new a());
        this.f19074o.setOnClickListener(new b());
        this.f19078s.setOnClickListener(new c());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|34|2|(2:28|3)|(5:26|4|30|5|9)|16|32|17|24|25|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
    
        r1.printStackTrace();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void g() throws org.json.JSONException {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7d
            r0.<init>()     // Catch: org.json.JSONException -> L7d
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L63
            r1.<init>()     // Catch: org.json.JSONException -> L63
            java.lang.String r0 = com.mbridge.msdk.foundation.same.a.f15033h     // Catch: org.json.JSONException -> L61
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: org.json.JSONException -> L61
            android.content.Context r2 = r2.d()     // Catch: org.json.JSONException -> L61
            float r3 = r5.f18956f     // Catch: org.json.JSONException -> L61
            int r2 = com.mbridge.msdk.foundation.tools.v0.b(r2, r3)     // Catch: org.json.JSONException -> L61
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L61
            java.lang.String r0 = com.mbridge.msdk.foundation.same.a.f15034i     // Catch: org.json.JSONException -> L61
            com.mbridge.msdk.foundation.controller.c r2 = com.mbridge.msdk.foundation.controller.c.n()     // Catch: org.json.JSONException -> L61
            android.content.Context r2 = r2.d()     // Catch: org.json.JSONException -> L61
            float r3 = r5.f18957g     // Catch: org.json.JSONException -> L61
            int r2 = com.mbridge.msdk.foundation.tools.v0.b(r2, r3)     // Catch: org.json.JSONException -> L61
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L61
            java.lang.String r0 = com.mbridge.msdk.foundation.same.a.f15038m     // Catch: org.json.JSONException -> L61
            r2 = 0
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L61
            android.content.Context r0 = r5.getContext()     // Catch: java.lang.Exception -> L47
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L47
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Exception -> L47
            int r0 = r0.orientation     // Catch: java.lang.Exception -> L47
            r5.f18954d = r0     // Catch: java.lang.Exception -> L47
            goto L4b
        L47:
            r0 = move-exception
            r0.printStackTrace()     // Catch: org.json.JSONException -> L61
        L4b:
            java.lang.String r0 = com.mbridge.msdk.foundation.same.a.f15036k     // Catch: org.json.JSONException -> L61
            int r2 = r5.f18954d     // Catch: org.json.JSONException -> L61
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L61
            java.lang.String r0 = com.mbridge.msdk.foundation.same.a.f15037l     // Catch: org.json.JSONException -> L61
            android.content.Context r2 = r5.getContext()     // Catch: org.json.JSONException -> L61
            float r2 = com.mbridge.msdk.foundation.tools.v0.d(r2)     // Catch: org.json.JSONException -> L61
            double r2 = (double) r2     // Catch: org.json.JSONException -> L61
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L61
            goto L70
        L61:
            r0 = move-exception
            goto L67
        L63:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L67:
            java.lang.String r2 = "MBridgeVideoEndCoverView"
            java.lang.String r0 = r0.getMessage()     // Catch: org.json.JSONException -> L7d
            com.mbridge.msdk.foundation.tools.q0.b(r2, r0)     // Catch: org.json.JSONException -> L7d
        L70:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L7d
            r0.<init>()     // Catch: org.json.JSONException -> L7d
            java.lang.String r2 = com.mbridge.msdk.foundation.same.a.f15035j     // Catch: org.json.JSONException -> L7b
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L7b
            goto L83
        L7b:
            r1 = move-exception
            goto L80
        L7d:
            r0 = move-exception
            r1 = r0
            r0 = 0
        L80:
            r1.printStackTrace()
        L83:
            com.mbridge.msdk.video.module.listener.a r1 = r5.notifyListener
            r2 = 105(0x69, float:1.47E-43)
            r1.a(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.module.MBridgeVideoEndCoverView.g():void");
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoend_cover");
        if (i0.a(iFindLayout)) {
            View viewInflate = this.f18953c.inflate(iFindLayout, (ViewGroup) null);
            this.f19073n = viewInflate;
            if (viewInflate != null) {
                this.f18955e = a(viewInflate);
                addView(this.f19073n, -1, -1);
                d();
            }
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f18956f = motionEvent.getRawX();
        this.f18957g = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        this.f18954d = configuration.orientation;
        removeView(this.f19073n);
        f();
    }

    public void preLoadData(com.mbridge.msdk.video.signal.factory.b bVar) {
        this.f19079t = bVar;
        try {
            if (this.f18952b == null || !this.f18955e) {
                return;
            }
            e();
        } catch (Throwable th) {
            q0.a("MBridgeVideoEndCoverView", th.getMessage());
        }
    }

    public MBridgeVideoEndCoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19072m = "MBridgeVideoEndCoverView";
    }
}
