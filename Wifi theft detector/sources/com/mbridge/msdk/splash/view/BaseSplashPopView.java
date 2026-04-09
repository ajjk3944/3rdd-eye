package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a0;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f17358v = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    protected String f17359a;

    /* renamed from: b, reason: collision with root package name */
    protected String f17360b;

    /* renamed from: c, reason: collision with root package name */
    private int f17361c;

    /* renamed from: d, reason: collision with root package name */
    private CampaignEx f17362d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.splash.middle.d f17363e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f17364f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f17365g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f17366h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f17367i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f17368j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f17369k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f17370l;

    /* renamed from: m, reason: collision with root package name */
    private int f17371m;

    /* renamed from: n, reason: collision with root package name */
    protected Handler f17372n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f17373o;

    /* renamed from: p, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f17374p;

    /* renamed from: q, reason: collision with root package name */
    private j f17375q;

    /* renamed from: r, reason: collision with root package name */
    private Runnable f17376r;

    /* renamed from: s, reason: collision with root package name */
    private Runnable f17377s;

    /* renamed from: t, reason: collision with root package name */
    View.OnClickListener f17378t;

    /* renamed from: u, reason: collision with root package name */
    View.OnClickListener f17379u;

    public class a implements j {
        public a() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            u0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            int iA;
            int iA2;
            if (BaseSplashPopView.this.f17361c == 1) {
                int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                int iA3 = (v0.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                iA = v0.a(BaseSplashPopView.this.getContext(), 23.0f) + iA3;
                iA2 = v0.a(BaseSplashPopView.this.getContext(), 10.0f) + iA3;
            } else {
                iA = 0;
                iA2 = 0;
            }
            u0.a(campaign, BaseSplashPopView.this, iA, iA2);
        }
    }

    public class b implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f17381a;

        public b(boolean z10) {
            this.f17381a = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                Bitmap bitmapB = this.f17381a ? p0.b(bitmap) : p0.a(bitmap, 1, 16);
                ImageView imageView = BaseSplashPopView.this.f17364f;
                if (bitmapB != null) {
                    bitmap = bitmapB;
                }
                imageView.setImageBitmap(bitmap);
            } catch (Throwable th) {
                q0.b("MBSplashPopView", th.getMessage());
            }
        }
    }

    public class c implements com.mbridge.msdk.foundation.same.image.c {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f17366h.setImageBitmap(a0.a(bitmap, 10));
            } catch (Throwable th) {
                q0.b("MBSplashPopView", th.getMessage());
            }
        }
    }

    public class d implements com.mbridge.msdk.foundation.same.image.c {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            q0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f17365g.setImageBitmap(p0.a(bitmap, 1, 16));
            } catch (Throwable th) {
                q0.b("MBSplashPopView", th.getMessage());
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseSplashPopView.this.f17370l != null) {
                if (BaseSplashPopView.this.f17371m != 0) {
                    BaseSplashPopView.g(BaseSplashPopView.this);
                    BaseSplashPopView.this.f17370l.setText(String.valueOf(BaseSplashPopView.this.f17371m));
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.f17372n.postDelayed(baseSplashPopView.f17376r, 1000L);
                    return;
                }
                BaseSplashPopView.this.f17371m = -1;
                BaseSplashPopView.this.g();
                BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                baseSplashPopView2.f17372n.removeCallbacks(baseSplashPopView2.f17376r);
                BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView3.f17363e;
                if (dVar != null) {
                    dVar.a(new MBridgeIds(baseSplashPopView3.f17359a, baseSplashPopView3.f17360b), 5);
                }
            }
        }
    }

    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView.f17363e;
            if (dVar != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f17359a, baseSplashPopView.f17360b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f17361c);
            }
        }
    }

    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            if (baseSplashPopView.f17363e != null) {
                baseSplashPopView.b(baseSplashPopView.f17362d);
            }
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView;
            com.mbridge.msdk.splash.middle.d dVar;
            if (BaseSplashPopView.this.f17371m <= 0 && (dVar = (baseSplashPopView = BaseSplashPopView.this).f17363e) != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f17359a, baseSplashPopView.f17360b), 4);
            }
        }
    }

    public static class i {

        /* renamed from: a, reason: collision with root package name */
        private String f17389a;

        /* renamed from: b, reason: collision with root package name */
        private String f17390b;

        /* renamed from: c, reason: collision with root package name */
        private int f17391c;

        /* renamed from: d, reason: collision with root package name */
        private CampaignEx f17392d;

        public i(String str, String str2, int i10, CampaignEx campaignEx) {
            this.f17389a = str;
            this.f17390b = str2;
            this.f17391c = i10;
            this.f17392d = campaignEx;
        }

        public CampaignEx a() {
            return this.f17392d;
        }

        public String b() {
            return this.f17389a;
        }

        public String c() {
            return this.f17390b;
        }

        public int d() {
            return this.f17391c;
        }
    }

    public BaseSplashPopView(Context context, i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        super(context);
        this.f17361c = 1;
        this.f17371m = -1;
        this.f17372n = new Handler();
        this.f17373o = false;
        this.f17375q = new a();
        this.f17376r = new e();
        this.f17377s = new f();
        this.f17378t = new g();
        this.f17379u = new h();
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f17360b = iVar.c();
        this.f17359a = iVar.b();
        this.f17361c = iVar.d();
        this.f17362d = iVar.a();
        this.f17363e = dVar;
        a();
    }

    public static /* synthetic */ int g(BaseSplashPopView baseSplashPopView) {
        int i10 = baseSplashPopView.f17371m;
        baseSplashPopView.f17371m = i10 - 1;
        return i10;
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f17358v;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    private void setBackgroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new c());
    }

    private void setForegroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new d());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f17363e != null) {
            postDelayed(this.f17377s, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f17373o = true;
        if (this.f17370l != null) {
            this.f17372n.removeCallbacks(this.f17376r);
        }
    }

    public void reStartCountDown() {
        if (this.f17373o) {
            this.f17373o = false;
            int i10 = this.f17371m;
            if (i10 == -1 || i10 == 0) {
                g();
                return;
            }
            TextView textView = this.f17370l;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
                this.f17372n.postDelayed(this.f17376r, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.f17372n.removeCallbacks(this.f17377s);
            this.f17372n.removeCallbacks(this.f17376r);
            this.f17376r = null;
            detachAllViewsFromParent();
            this.f17362d = null;
            this.f17363e = null;
        } catch (Exception e10) {
            q0.b("MBSplashPopView", e10.getMessage());
        }
    }

    public void setPopViewType(i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f17360b = iVar.c();
        this.f17359a = iVar.b();
        this.f17361c = iVar.d();
        this.f17362d = iVar.a();
        this.f17363e = dVar;
        a();
    }

    public void startCountDown() {
        this.f17372n.removeCallbacks(this.f17376r);
        CampaignEx campaignEx = this.f17362d;
        if (campaignEx == null || this.f17361c != 1) {
            return;
        }
        int flbSkipTime = campaignEx.getFlbSkipTime();
        if (flbSkipTime <= 0) {
            g();
            return;
        }
        this.f17371m = flbSkipTime;
        TextView textView = this.f17370l;
        if (textView != null) {
            textView.setText(String.valueOf(flbSkipTime));
            this.f17372n.postDelayed(this.f17376r, 1000L);
        }
    }

    private void b() {
        String language;
        this.f17367i = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 32.0f), v0.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f17364f.getId());
        this.f17367i.setLayoutParams(layoutParams);
        try {
            language = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th) {
            q0.b("MBSplashPopView", th.getMessage());
            language = "ZH";
        }
        this.f17367i.setBackgroundResource((language.toUpperCase().equals("CN") || language.toUpperCase().equals("ZH")) ? getResources().getIdentifier("mbridge_splash_pop_ad", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()) : getResources().getIdentifier("mbridge_splash_pop_ad_en", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f17367i);
    }

    private void c() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 80.0f), v0.a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = v0.a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_default", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        this.f17364f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(v0.a(getContext(), 60.0f), v0.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = v0.a(getContext(), 7.0f);
        layoutParams2.leftMargin = v0.a(getContext(), 10.0f);
        this.f17364f.setId(generateViewId());
        this.f17364f.setLayoutParams(layoutParams2);
        this.f17364f.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.f17362d;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            a(this.f17362d.getIconUrl(), true);
        }
        this.f17370l = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = v0.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = v0.a(getContext(), 70.0f);
        this.f17370l.setId(generateViewId());
        this.f17370l.setTextSize(10.0f);
        this.f17370l.setTextColor(-1);
        this.f17370l.setGravity(17);
        this.f17370l.setMinWidth(v0.a(getContext(), 16.0f));
        this.f17370l.setMaxHeight(v0.a(getContext(), 16.0f));
        this.f17370l.setLayoutParams(layoutParams3);
        this.f17370l.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(imageView);
        addView(this.f17370l);
        addView(this.f17364f);
        CampaignEx campaignEx2 = this.f17362d;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            g();
        }
        CampaignEx campaignEx3 = this.f17362d;
        if (campaignEx3 != null) {
            b1.a(this, campaignEx3.getLocalRequestId(), this.f17362d.getLocalAllowTrackClick());
        }
        setOnClickListener(this.f17378t);
        this.f17370l.setOnClickListener(this.f17379u);
    }

    private void d() {
        this.f17366h = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, v0.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f17366h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f17366h.setId(generateViewId());
        this.f17366h.setLayoutParams(layoutParams);
        setBackgroundImage(this.f17362d.getImageUrl());
        this.f17365g = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, v0.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f17365g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f17365g.setId(generateViewId());
        this.f17365g.setLayoutParams(layoutParams2);
        setForegroundImage(this.f17362d.getImageUrl());
        this.f17364f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f17366h.getId());
        layoutParams3.topMargin = 20;
        this.f17364f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f17364f.setId(generateViewId());
        this.f17364f.setLayoutParams(layoutParams3);
        a(this.f17362d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f17364f.getId());
        layoutParams4.addRule(6, this.f17364f.getId());
        layoutParams4.addRule(8, this.f17364f.getId());
        layoutParams4.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams4.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f17368j = textView;
        textView.setId(generateViewId());
        this.f17368j.setGravity(16);
        this.f17368j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f17368j.setTextSize(12.0f);
        this.f17368j.setTextColor(-16777216);
        TextView textView2 = this.f17368j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f17368j.setMarqueeRepeatLimit(-1);
        this.f17368j.setSelected(true);
        this.f17368j.setSingleLine(true);
        this.f17368j.setText(this.f17362d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f17369k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f17368j.getId());
        layoutParams5.addRule(3, this.f17368j.getId());
        layoutParams5.topMargin = v0.a(getContext(), 4.0f);
        layoutParams5.rightMargin = v0.a(getContext(), 36.0f);
        this.f17369k.setGravity(16);
        this.f17369k.setLayoutParams(layoutParams5);
        this.f17369k.setTextSize(8.0f);
        this.f17369k.setTextColor(-10066330);
        this.f17369k.setEllipsize(truncateAt);
        this.f17369k.setMarqueeRepeatLimit(-1);
        this.f17369k.setSelected(true);
        this.f17369k.setSingleLine(true);
        this.f17369k.setText(this.f17362d.getAppDesc());
        relativeLayout.addView(this.f17368j);
        relativeLayout.addView(this.f17369k);
        addView(this.f17366h);
        addView(this.f17365g);
        addView(this.f17364f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f17362d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f17362d.getBidToken(), eVar, this.f17362d, this.f17360b).t(), this.f17362d.getLocalAllowTrackClick());
        setOnClickListener(this.f17378t);
    }

    private void e() {
        int iA = v0.a(getContext(), 4.0f);
        this.f17364f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 50.0f), v0.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f17364f.setId(generateViewId());
        this.f17364f.setLayoutParams(layoutParams);
        this.f17364f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f17364f.setPadding(iA, iA, iA, iA);
        a(this.f17362d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f17364f.getId());
        layoutParams2.addRule(6, this.f17364f.getId());
        layoutParams2.addRule(8, this.f17364f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 8.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f17368j = textView;
        textView.setId(generateViewId());
        this.f17368j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f17368j.setGravity(16);
        this.f17368j.setTextSize(12.0f);
        this.f17368j.setSelected(true);
        TextView textView2 = this.f17368j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f17368j.setMarqueeRepeatLimit(-1);
        this.f17368j.setSingleLine(true);
        this.f17368j.setTextColor(-16777216);
        this.f17368j.setText(this.f17362d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f17369k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f17368j.getId());
        layoutParams3.addRule(3, this.f17368j.getId());
        layoutParams3.topMargin = v0.a(getContext(), 4.0f);
        layoutParams3.rightMargin = v0.a(getContext(), 36.0f);
        this.f17369k.setGravity(16);
        this.f17369k.setLayoutParams(layoutParams3);
        this.f17369k.setTextSize(8.0f);
        this.f17369k.setTextColor(-10066330);
        this.f17369k.setEllipsize(truncateAt);
        this.f17369k.setMarqueeRepeatLimit(-1);
        this.f17369k.setSelected(true);
        this.f17369k.setSingleLine(true);
        this.f17369k.setText(this.f17362d.getAppDesc());
        relativeLayout.addView(this.f17368j);
        relativeLayout.addView(this.f17369k);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f17364f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f17362d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f17362d.getBidToken(), eVar, this.f17362d, this.f17360b).t(), this.f17362d.getLocalAllowTrackClick());
        setOnClickListener(this.f17378t);
    }

    private void f() {
        int iA = v0.a(getContext(), 4.0f);
        this.f17364f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(v0.a(getContext(), 28.0f), v0.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f17364f.setId(generateViewId());
        this.f17364f.setLayoutParams(layoutParams);
        this.f17364f.setPadding(iA, iA, iA, iA);
        this.f17364f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f17362d.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.f17368j = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f17364f.getId());
        layoutParams2.addRule(6, this.f17364f.getId());
        layoutParams2.addRule(8, this.f17364f.getId());
        layoutParams2.leftMargin = v0.a(getContext(), 4.0f);
        layoutParams2.rightMargin = v0.a(getContext(), 40.0f);
        this.f17368j.setLayoutParams(layoutParams2);
        this.f17368j.setGravity(16);
        this.f17368j.setTextSize(10.0f);
        this.f17368j.setSelected(true);
        this.f17368j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f17368j.setMarqueeRepeatLimit(-1);
        this.f17368j.setSingleLine(true);
        this.f17368j.setTextColor(-16777216);
        this.f17368j.setText(this.f17362d.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        addView(this.f17364f);
        addView(this.f17368j);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f17362d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        b1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f17362d.getBidToken(), eVar, this.f17362d, this.f17360b).t(), this.f17362d.getLocalAllowTrackClick());
        setOnClickListener(this.f17378t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.f17370l;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = v0.a(getContext(), 16.0f);
            layoutParams.height = v0.a(getContext(), 16.0f);
            this.f17370l.setLayoutParams(layoutParams);
            this.f17370l.setText("");
            this.f17370l.setSelected(true);
            this.f17370l.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_close", "drawable", com.mbridge.msdk.foundation.controller.c.n().i()));
        }
    }

    private void a() {
        if (this.f17362d == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i10 = this.f17361c;
        if (i10 == 1) {
            c();
            return;
        }
        if (i10 == 2) {
            f();
        } else if (i10 == 3) {
            e();
        } else {
            if (i10 != 4) {
                return;
            }
            d();
        }
    }

    private void a(String str, boolean z10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, new b(z10));
    }

    public void a(CampaignEx campaignEx) {
        if (this.f17374p == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f17360b);
            this.f17374p = aVar;
            aVar.a(this.f17375q);
        }
        campaignEx.setCampaignUnitId(this.f17360b);
        this.f17374p.a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f17363e;
        if (dVar != null) {
            dVar.a(new MBridgeIds(this.f17359a, this.f17360b));
            this.f17363e.a(new MBridgeIds(this.f17359a, this.f17360b), 6);
        }
    }

    public void b(CampaignEx campaignEx) throws JSONException {
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f17360b);
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.f17361c = 1;
        this.f17371m = -1;
        this.f17372n = new Handler();
        this.f17373o = false;
        this.f17375q = new a();
        this.f17376r = new e();
        this.f17377s = new f();
        this.f17378t = new g();
        this.f17379u = new h();
        this.f17361c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17361c = 1;
        this.f17371m = -1;
        this.f17372n = new Handler();
        this.f17373o = false;
        this.f17375q = new a();
        this.f17376r = new e();
        this.f17377s = new f();
        this.f17378t = new g();
        this.f17379u = new h();
        this.f17361c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f17361c = 1;
        this.f17371m = -1;
        this.f17372n = new Handler();
        this.f17373o = false;
        this.f17375q = new a();
        this.f17376r = new e();
        this.f17377s = new f();
        this.f17378t = new g();
        this.f17379u = new h();
        this.f17361c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    @RequiresApi(api = 21)
    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f17361c = 1;
        this.f17371m = -1;
        this.f17372n = new Handler();
        this.f17373o = false;
        this.f17375q = new a();
        this.f17376r = new e();
        this.f17377s = new f();
        this.f17378t = new g();
        this.f17379u = new h();
        this.f17361c = 1;
        q0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }
}
