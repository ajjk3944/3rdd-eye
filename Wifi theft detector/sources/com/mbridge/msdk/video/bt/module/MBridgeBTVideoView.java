package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.PlayerErrorConstant;
import com.mbridge.msdk.playercommon.PlayerView;
import com.mbridge.msdk.widget.FeedBackButton;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class MBridgeBTVideoView extends BTBaseView {
    private static boolean P = false;
    private static long Q;
    private o5.b A;
    private o5.a B;
    private com.iab.omid.library.mmadbridge.adsession.media.a C;
    private d D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private int I;
    private String J;
    private boolean K;
    private boolean L;
    private boolean M;
    private RelativeLayout N;
    private ProgressBar O;

    /* renamed from: p, reason: collision with root package name */
    private PlayerView f18630p;

    /* renamed from: q, reason: collision with root package name */
    private SoundImageView f18631q;

    /* renamed from: r, reason: collision with root package name */
    private TextView f18632r;

    /* renamed from: s, reason: collision with root package name */
    private View f18633s;

    /* renamed from: t, reason: collision with root package name */
    private FeedBackButton f18634t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f18635u;

    /* renamed from: v, reason: collision with root package name */
    private WebView f18636v;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f18637w;

    /* renamed from: x, reason: collision with root package name */
    private int f18638x;

    /* renamed from: y, reason: collision with root package name */
    private int f18639y;

    /* renamed from: z, reason: collision with root package name */
    private int f18640z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            boolean zIsSilent = MBridgeBTVideoView.this.f18630p.isSilent();
            if (MBridgeBTVideoView.this.f18636v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f18535n);
                    jSONObject.put("id", MBridgeBTVideoView.this.f18540d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(CampaignEx.JSON_NATIVE_VIDEO_MUTE, MBridgeBTVideoView.this.E);
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTVideoView.this.f18636v, "onPlayerMuteBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    q0.a("OperateViews", "onPlayerMuteBtnClicked isMute = " + zIsSilent + " mute = " + MBridgeBTVideoView.this.E);
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTVideoView.this.f18636v, e10.getMessage());
                }
            }
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (MBridgeBTVideoView.this.f18636v != null) {
                BTBaseView.a(MBridgeBTVideoView.this.f18636v, "onPlayerCloseBtnClicked", MBridgeBTVideoView.this.f18540d);
            }
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (MBridgeBTVideoView.this.C != null) {
                try {
                    MBridgeBTVideoView.this.C.a(InteractionType.CLICK);
                    q0.a("omsdk", "btv adUserInteraction click");
                } catch (Exception e10) {
                    q0.b("omsdk", e10.getMessage());
                }
            }
            if (MBridgeBTVideoView.this.f18636v != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f18535n);
                    jSONObject.put("id", MBridgeBTVideoView.this.f18540d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("x", String.valueOf(view.getX()));
                    jSONObject2.put("y", String.valueOf(view.getY()));
                    jSONObject.put("data", jSONObject2);
                    f.a().a(MBridgeBTVideoView.this.f18636v, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception unused) {
                    com.mbridge.msdk.video.bt.component.d.c().a(MBridgeBTVideoView.this.f18636v, "onClicked", MBridgeBTVideoView.this.f18540d);
                }
            }
        }
    }

    public static final class d extends DefaultVideoPlayerStatusListener {

        /* renamed from: a, reason: collision with root package name */
        private MBridgeBTVideoView f18644a;

        /* renamed from: b, reason: collision with root package name */
        private WebView f18645b;

        /* renamed from: c, reason: collision with root package name */
        private com.iab.omid.library.mmadbridge.adsession.media.a f18646c;

        /* renamed from: d, reason: collision with root package name */
        private String f18647d;

        /* renamed from: e, reason: collision with root package name */
        private String f18648e;

        /* renamed from: f, reason: collision with root package name */
        private int f18649f;

        /* renamed from: g, reason: collision with root package name */
        private int f18650g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f18651h;

        /* renamed from: l, reason: collision with root package name */
        private int f18655l;

        /* renamed from: m, reason: collision with root package name */
        private int f18656m;

        /* renamed from: i, reason: collision with root package name */
        private boolean f18652i = false;

        /* renamed from: j, reason: collision with root package name */
        private boolean f18653j = false;

        /* renamed from: k, reason: collision with root package name */
        private boolean f18654k = false;

        /* renamed from: n, reason: collision with root package name */
        private boolean f18657n = false;

        /* renamed from: o, reason: collision with root package name */
        private boolean f18658o = false;

        public d(MBridgeBTVideoView mBridgeBTVideoView, WebView webView, com.iab.omid.library.mmadbridge.adsession.media.a aVar) {
            this.f18644a = mBridgeBTVideoView;
            this.f18645b = webView;
            this.f18646c = aVar;
            if (mBridgeBTVideoView != null) {
                this.f18647d = mBridgeBTVideoView.f18540d;
                this.f18648e = mBridgeBTVideoView.f18539c;
            }
        }

        public void b(int i10, int i11) {
            this.f18655l = i10;
            this.f18656m = i11;
            a();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingEnd() {
            try {
                super.onBufferingEnd();
                if (this.f18646c == null || !this.f18658o) {
                    return;
                }
                q0.b("omsdk", "bt onBufferingEnd");
                this.f18658o = false;
                this.f18646c.b();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingStart(String str) {
            try {
                q0.b("omsdk", "bt onBufferingStart1");
                super.onBufferingStart(str);
                if (this.f18646c != null) {
                    q0.b("omsdk", "bt onBufferingStart");
                    this.f18646c.c();
                    this.f18658o = true;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onBufferingTimeOut(String str) throws JSONException {
            try {
                if (!str.equals(PlayerErrorConstant.PREPARE_TIMEOUT) && !str.equals(PlayerErrorConstant.PLAYERING_TIMEOUT)) {
                    return;
                }
                if (this.f18645b != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", BTBaseView.f18535n);
                        jSONObject.put("id", this.f18647d);
                        jSONObject.put("data", new JSONObject());
                        f.a().a(this.f18645b, "onPlayerTimeout", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        com.mbridge.msdk.video.bt.component.d.c().a(this.f18645b, e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayCompleted() throws JSONException {
            super.onPlayCompleted();
            MBridgeBTVideoView mBridgeBTVideoView = this.f18644a;
            CampaignEx campaignEx = mBridgeBTVideoView.f18538b;
            if (campaignEx == null) {
                mBridgeBTVideoView.f18632r.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            } else if (campaignEx.getVideoCompleteTime() > 0) {
                this.f18644a.f18632r.setText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", "string"));
            } else {
                this.f18644a.f18632r.setText(MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            this.f18644a.f18630p.setClickable(false);
            WebView webView = this.f18645b;
            if (webView != null) {
                BTBaseView.a(webView, "onPlayerFinish", this.f18647d);
            }
            com.iab.omid.library.mmadbridge.adsession.media.a aVar = this.f18646c;
            if (aVar != null) {
                aVar.d();
                q0.a("omsdk", "play:  videoEvents.complete()");
            }
            this.f18649f = this.f18650g;
            boolean unused = MBridgeBTVideoView.P = true;
            this.f18644a.stop();
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayError(String str) throws JSONException {
            super.onPlayError(str);
            if (this.f18645b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f18536o);
                    jSONObject.put("id", this.f18647d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error", str);
                    jSONObject2.put("id", this.f18647d);
                    jSONObject.put("data", jSONObject2);
                    f.a().a(this.f18645b, "onPlayerFailed", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(this.f18645b, e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayProgress(int i10, int i11) throws JSONException {
            int videoCompleteTime;
            StringBuilder sb;
            String str;
            String string;
            super.onPlayProgress(i10, i11);
            if (MBridgeBTVideoView.Q == 0) {
                long unused = MBridgeBTVideoView.Q = System.currentTimeMillis();
            }
            MBridgeBTVideoView mBridgeBTVideoView = this.f18644a;
            if (mBridgeBTVideoView.f18544h) {
                CampaignEx campaignEx = mBridgeBTVideoView.f18538b;
                if (campaignEx != null) {
                    videoCompleteTime = campaignEx.getVideoCompleteTime();
                    com.mbridge.msdk.foundation.feedback.b.b().b(this.f18644a.f18538b.getCampaignUnitId() + "_1", i10);
                } else {
                    videoCompleteTime = 0;
                }
                if (videoCompleteTime > i11 || videoCompleteTime <= 0) {
                    videoCompleteTime = i11;
                }
                int i12 = videoCompleteTime <= 0 ? i11 - i10 : videoCompleteTime - i10;
                if (i12 <= 0) {
                    string = videoCompleteTime <= 0 ? MBridgeConstans.ENDCARD_URL_TYPE_PL : (String) this.f18644a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_complete", "string"));
                } else {
                    if (videoCompleteTime <= 0) {
                        sb = new StringBuilder();
                        sb.append(i12);
                        str = "";
                    } else {
                        sb = new StringBuilder();
                        sb.append(i12);
                        str = (String) this.f18644a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left", "string"));
                    }
                    sb.append(str);
                    string = sb.toString();
                }
                CampaignEx campaignEx2 = this.f18644a.f18538b;
                if (campaignEx2 != null && campaignEx2.getUseSkipTime() == 1) {
                    int iMin = Math.min(this.f18644a.f18538b.getVst(), i11);
                    if (iMin >= videoCompleteTime || iMin < 0) {
                        int i13 = videoCompleteTime - i10;
                        if (this.f18644a.f18538b.getAdType() == 287) {
                            if (i13 > 0) {
                                string = i13 + ((String) this.f18644a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                            } else if (i13 == 0) {
                                this.f18644a.f18632r.setVisibility(4);
                            }
                        }
                    } else {
                        int i14 = iMin - i10;
                        if (i14 > 0) {
                            string = i14 + ((String) this.f18644a.getContext().getResources().getText(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_view_reward_time_left_skip_time", "string")));
                        } else if (this.f18644a.f18538b.getAdType() == 287 && i14 == 0) {
                            this.f18644a.f18632r.setVisibility(4);
                        }
                    }
                }
                this.f18644a.f18632r.setText(string);
            }
            this.f18650g = i11;
            this.f18649f = i10;
            this.f18644a.O.setMax(this.f18650g);
            this.f18644a.O.setProgress(this.f18649f);
            if (this.f18645b != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", BTBaseView.f18535n);
                    jSONObject.put("id", this.f18647d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", this.f18647d);
                    jSONObject2.put(NotificationCompat.CATEGORY_PROGRESS, MBridgeBTVideoView.b(i10, i11));
                    jSONObject2.put("time", String.valueOf(i10));
                    jSONObject2.put("duration", String.valueOf(i11));
                    jSONObject.put("data", jSONObject2);
                    f.a().a(this.f18645b, "onPlayerProgressChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.video.bt.component.d.c().a(this.f18645b, e10.getMessage());
                }
            }
            com.iab.omid.library.mmadbridge.adsession.media.a aVar = this.f18646c;
            if (aVar != null) {
                int i15 = (i10 * 100) / i11;
                int i16 = ((i10 + 1) * 100) / i11;
                if (i15 <= 25 && 25 < i16 && !this.f18652i) {
                    this.f18652i = true;
                    aVar.h();
                    q0.a("omsdk", "play:  videoEvents.firstQuartile()");
                } else if (i15 <= 50 && 50 < i16 && !this.f18653j) {
                    this.f18653j = true;
                    aVar.i();
                    q0.a("omsdk", "play:  videoEvents.midpoint()");
                } else if (i15 <= 75 && 75 < i16 && !this.f18654k) {
                    this.f18654k = true;
                    aVar.o();
                    q0.a("omsdk", "play:  videoEvents.thirdQuartile()");
                }
            }
            a(i10, i11);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlaySetDataSourceError(String str) {
            super.onPlaySetDataSourceError(str);
        }

        @Override // com.mbridge.msdk.playercommon.DefaultVideoPlayerStatusListener, com.mbridge.msdk.playercommon.VideoPlayerStatusListener
        public void onPlayStarted(int i10) throws JSONException {
            super.onPlayStarted(i10);
            if (!this.f18651h) {
                this.f18644a.O.setMax(i10);
                WebView webView = this.f18645b;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f18647d);
                }
                this.f18651h = true;
                if (this.f18646c != null) {
                    try {
                        MBridgeBTVideoView mBridgeBTVideoView = this.f18644a;
                        this.f18646c.n(i10, (mBridgeBTVideoView == null || mBridgeBTVideoView.f18630p == null) ? 0.0f : this.f18644a.f18630p.getVolume());
                        q0.a("omsdk", "play2: videoEvents.start()");
                    } catch (Exception e10) {
                        q0.b("omsdk", e10.getMessage());
                    }
                }
            }
            boolean unused = MBridgeBTVideoView.P = false;
        }

        private void a() {
            int i10;
            MBridgeBTVideoView mBridgeBTVideoView;
            CampaignEx campaignEx;
            String str;
            if (!s0.a().a("h_c_r_w_p_c", false) || (i10 = this.f18655l) == 100 || this.f18656m != 0 || this.f18657n || i10 == 0 || (mBridgeBTVideoView = this.f18644a) == null || (campaignEx = mBridgeBTVideoView.f18538b) == null) {
                return;
            }
            try {
                if (campaignEx.getAdType() == 94 || this.f18644a.f18538b.getAdType() == 287) {
                    str = this.f18644a.f18538b.getRequestId() + this.f18644a.f18538b.getId() + this.f18644a.f18538b.getVideoUrlEncode();
                } else {
                    str = this.f18644a.f18538b.getId() + this.f18644a.f18538b.getVideoUrlEncode() + this.f18644a.f18538b.getBidToken();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f18648e, str);
                if (aVarA != null) {
                    aVarA.A();
                    this.f18657n = true;
                    if (MBridgeConstans.DEBUG) {
                        q0.b("DefaultVideoPlayerStatusListener", "CDRate is : 0  and start download when player create!");
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("DefaultVideoPlayerStatusListener", e10.getMessage());
                }
            }
        }

        private void a(int i10, int i11) {
            int i12;
            int i13;
            String str;
            try {
                int i14 = this.f18655l;
                if (i14 == 100 || this.f18657n || i14 == 0 || (i12 = this.f18656m) < 0 || i10 < (i13 = (i11 * i12) / 100)) {
                    return;
                }
                if (this.f18644a.f18538b.getAdType() != 94 && this.f18644a.f18538b.getAdType() != 287) {
                    str = this.f18644a.f18538b.getId() + this.f18644a.f18538b.getVideoUrlEncode() + this.f18644a.f18538b.getBidToken();
                } else {
                    str = this.f18644a.f18538b.getRequestId() + this.f18644a.f18538b.getId() + this.f18644a.f18538b.getVideoUrlEncode();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f18648e, str);
                if (aVarA != null) {
                    aVarA.A();
                    this.f18657n = true;
                    q0.b("DefaultVideoPlayerStatusListener", "CDRate is : " + i13 + " and start download !");
                }
            } catch (Exception e10) {
                q0.b("DefaultVideoPlayerStatusListener", e10.getMessage());
            }
        }
    }

    public MBridgeBTVideoView(Context context) {
        super(context);
        this.f18638x = 0;
        this.f18639y = 0;
        this.f18640z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.K = false;
        this.L = false;
        this.M = false;
    }

    private int getBufferTimeout() {
        try {
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC == null) {
                com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            i = aVarC != null ? (int) aVarC.i() : 5;
            q0.c(BTBaseView.TAG, "MBridgeBaseView buffetTimeout:" + i);
            return i;
        } catch (Throwable th) {
            th.printStackTrace();
            return i;
        }
    }

    private int getCDRate() {
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f18539c, false).g();
    }

    private String getPlayURL() {
        String videoUrlEncode = "";
        try {
            videoUrlEncode = this.f18538b.getVideoUrlEncode();
            com.mbridge.msdk.videocommon.download.a aVar = this.f18637w;
            if (aVar != null) {
                String strP = aVar.p();
                if (!a1.a(strP)) {
                    if (new File(strP).exists()) {
                        return strP;
                    }
                }
            }
            return videoUrlEncode;
        } catch (Throwable th) {
            q0.b(BTBaseView.TAG, th.getMessage(), th);
            return videoUrlEncode;
        }
    }

    public o5.a getAdEvents() {
        return this.B;
    }

    public o5.b getAdSession() {
        return this.A;
    }

    public int getMute() {
        return this.E;
    }

    public com.iab.omid.library.mmadbridge.adsession.media.a getVideoEvents() {
        return this.C;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int iFindLayout = findLayout("mbridge_reward_videoview_item");
        if (i0.a(iFindLayout)) {
            this.f18542f.inflate(iFindLayout, this);
            boolean zE = e();
            this.f18544h = zE;
            if (!zE) {
                q0.b(BTBaseView.TAG, "MBridgeVideoView init fail");
            }
            b();
        }
        P = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View rootView;
        super.onAttachedToWindow();
        if (!this.M) {
            this.H = com.mbridge.msdk.video.bt.component.d.c().g(this.f18539c);
        }
        View view = this.f18633s;
        if (view != null) {
            view.setVisibility(this.f18639y == 0 ? 8 : 0);
        }
        SoundImageView soundImageView = this.f18631q;
        if (soundImageView != null) {
            soundImageView.setVisibility(this.f18640z == 0 ? 8 : 0);
        }
        CampaignEx campaignEx = this.f18538b;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.f18539c);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f18539c + "_1", this.f18538b);
        }
        TextView textView = this.f18632r;
        if (textView != null) {
            textView.setVisibility(this.f18638x == 0 ? 8 : 0);
            if (this.f18632r.getVisibility() == 0 && com.mbridge.msdk.foundation.feedback.b.b().a()) {
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f18539c + "_1", this.f18634t);
            }
        }
        if (this.A == null || (rootView = getRootView()) == null) {
            return;
        }
        this.A.f(rootView);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
        try {
            if (this.f18630p != null) {
                o5.b bVar = this.A;
                if (bVar != null) {
                    bVar.c();
                }
                this.f18630p.setOnClickListener(null);
                this.f18630p.release();
                this.f18630p = null;
                if (!TextUtils.isEmpty(this.J)) {
                    e eVar = new e();
                    long jCurrentTimeMillis = Q;
                    if (jCurrentTimeMillis != 0) {
                        jCurrentTimeMillis = System.currentTimeMillis() - Q;
                    }
                    eVar.a("duration", Long.valueOf(jCurrentTimeMillis));
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000146", this.f18538b, eVar);
                }
            }
            SoundImageView soundImageView = this.f18631q;
            if (soundImageView != null) {
                soundImageView.setOnClickListener(null);
            }
            View view = this.f18633s;
            if (view != null) {
                view.setOnClickListener(null);
            }
            if (this.f18636v != null) {
                this.f18636v = null;
            }
            if (this.A != null) {
                this.A = null;
            }
            if (this.C != null) {
                this.C = null;
            }
            setOnClickListener(null);
        } catch (Throwable th) {
            q0.a(BTBaseView.TAG, th.getMessage());
        }
    }

    public void onPause() {
        PlayerView playerView = this.f18630p;
        if (playerView != null) {
            boolean zIsPlayIng = playerView.isPlayIng();
            this.L = zIsPlayIng;
            this.f18630p.setIsBTVideoPlaying(zIsPlayIng);
            com.iab.omid.library.mmadbridge.adsession.media.a aVar = this.C;
            if (aVar != null) {
                this.f18630p.setVideoEvents(aVar);
            }
            this.f18630p.onPause();
        }
    }

    public void onResume() {
        PlayerView playerView = this.f18630p;
        if (playerView != null) {
            playerView.setDesk(true);
            this.f18630p.setIsCovered(false);
            if (this.L) {
                this.f18630p.start(true);
            }
            this.f18630p.resumeOMSDK();
        }
    }

    public void onStop() {
        PlayerView playerView = this.f18630p;
        if (playerView != null) {
            playerView.setIsCovered(true);
        }
    }

    public void pause() {
        try {
            PlayerView playerView = this.f18630p;
            if (playerView != null) {
                playerView.pause();
                WebView webView = this.f18636v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPause", this.f18540d);
                }
            }
        } catch (Exception e10) {
            q0.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
    }

    public void play() {
        d dVar;
        try {
            if (this.M) {
                if (this.G) {
                    this.f18630p.playVideo(0);
                    this.G = false;
                } else {
                    this.f18630p.start(false);
                }
                try {
                    com.iab.omid.library.mmadbridge.adsession.media.a aVar = this.C;
                    if (aVar != null) {
                        aVar.l();
                        q0.a("omsdk", "btv play2:  videoEvents.resume()");
                    }
                } catch (Throwable th) {
                    q0.a(BTBaseView.TAG, th.getMessage());
                }
                WebView webView = this.f18636v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerPlay", this.f18540d);
                    return;
                }
                return;
            }
            String playURL = getPlayURL();
            this.J = playURL;
            this.f18630p.initVFPData(playURL, this.f18538b.getVideoUrlEncode(), this.D);
            if (this.H == 1) {
                playMute();
            } else {
                playUnMute();
            }
            try {
                if (this.B != null) {
                    q0.b("omsdk", "bt impressionOccurred");
                    this.B.b();
                }
            } catch (Throwable th2) {
                q0.a(BTBaseView.TAG, th2.getMessage());
            }
            if (!this.f18630p.playVideo() && (dVar = this.D) != null) {
                dVar.onPlayError("play video failed");
            }
            this.M = true;
            return;
        } catch (Exception e10) {
            q0.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
        q0.b(BTBaseView.TAG, e10.getMessage(), e10);
    }

    public boolean playMute() {
        try {
            PlayerView playerView = this.f18630p;
            if (playerView != null && this.f18636v != null) {
                playerView.closeSound();
                this.f18631q.setSoundStatus(false);
                this.E = 1;
                try {
                    com.iab.omid.library.mmadbridge.adsession.media.a aVar = this.C;
                    if (aVar != null) {
                        aVar.p(0.0f);
                    }
                } catch (Exception e10) {
                    q0.a("OMSDK", e10.getMessage());
                }
                BTBaseView.a(this.f18636v, "onPlayerMute", this.f18540d);
                return true;
            }
        } catch (Exception e11) {
            q0.b(BTBaseView.TAG, e11.getMessage());
        }
        return false;
    }

    public boolean playUnMute() {
        try {
            PlayerView playerView = this.f18630p;
            if (playerView == null || this.f18636v == null) {
                return false;
            }
            playerView.openSound();
            this.f18631q.setSoundStatus(true);
            this.E = 2;
            try {
                com.iab.omid.library.mmadbridge.adsession.media.a aVar = this.C;
                if (aVar != null) {
                    aVar.p(1.0f);
                }
            } catch (Exception e10) {
                q0.a("OMSDK", e10.getMessage());
            }
            BTBaseView.a(this.f18636v, "onUnmute", this.f18540d);
            return true;
        } catch (Exception e11) {
            q0.b(BTBaseView.TAG, e11.getMessage());
            return false;
        }
    }

    public void preLoadData() {
        d();
        this.F = getBufferTimeout();
        String playURL = getPlayURL();
        this.J = playURL;
        if (this.f18544h && !TextUtils.isEmpty(playURL) && this.f18538b != null) {
            o5.b bVar = this.A;
            if (bVar != null) {
                bVar.d(this.f18630p);
                o5.b bVar2 = this.A;
                SoundImageView soundImageView = this.f18631q;
                FriendlyObstructionPurpose friendlyObstructionPurpose = FriendlyObstructionPurpose.OTHER;
                bVar2.a(soundImageView, friendlyObstructionPurpose, null);
                this.A.a(this.f18632r, friendlyObstructionPurpose, null);
                this.A.a(this.f18633s, FriendlyObstructionPurpose.VIDEO_CONTROLS, null);
            }
            d dVar = new d(this, this.f18636v, this.C);
            this.D = dVar;
            dVar.b(a(this.f18538b), getCDRate());
            this.f18630p.setDesk(false);
            this.f18630p.initBufferIngParam(this.F);
            soundOperate(this.E, -1, null);
        }
        P = false;
    }

    public void resume() {
        try {
            PlayerView playerView = this.f18630p;
            if (playerView != null) {
                if (this.G) {
                    playerView.playVideo(0);
                    this.G = false;
                } else {
                    playerView.onResume();
                }
                try {
                    com.iab.omid.library.mmadbridge.adsession.media.a aVar = this.C;
                    if (aVar != null) {
                        aVar.l();
                        q0.a("omsdk", "btv play3:  videoEvents.resume()");
                    }
                } catch (Throwable th) {
                    q0.a(BTBaseView.TAG, th.getMessage());
                }
                WebView webView = this.f18636v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerResume", this.f18540d);
                }
            }
        } catch (Exception e10) {
            q0.b(BTBaseView.TAG, e10.getMessage());
        }
    }

    public void setAdEvents(o5.a aVar) {
        this.B = aVar;
    }

    public void setAdSession(o5.b bVar) {
        this.A = bVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setCampaign(CampaignEx campaignEx) {
        super.setCampaign(campaignEx);
        if (campaignEx == null || campaignEx.getVideoCompleteTime() <= 0) {
            this.f18632r.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_shape_progress", "drawable"));
            this.f18632r.setWidth(v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 30.0f));
            return;
        }
        this.f18632r.setBackgroundResource(i0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "mbridge_reward_video_time_count_num_bg", "drawable"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 30.0f));
        int iA = v0.a(com.mbridge.msdk.foundation.controller.c.n().d(), 5.0f);
        layoutParams.setMargins(iA, 0, 0, 0);
        this.f18632r.setPadding(iA, 0, iA, 0);
        this.f18632r.setLayoutParams(layoutParams);
    }

    public void setCloseViewVisable(int i10) {
        this.f18633s.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setCountDownTextViewVisable(int i10) {
        this.f18632r.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setCreateWebView(WebView webView) {
        this.f18636v = webView;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        if (i10 <= 0) {
            i10 = this.N.getPaddingLeft();
        }
        if (i11 <= 0) {
            i11 = this.N.getPaddingRight();
        }
        if (i12 <= 0) {
            i12 = this.N.getPaddingTop();
        }
        if (i13 <= 0) {
            i13 = this.N.getPaddingBottom();
        }
        q0.b(BTBaseView.TAG, "NOTCH BTVideoView " + String.format("%1s-%2s-%3s-%4s", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)));
        this.N.setPadding(i10, i12, i11, i13);
    }

    public void setOrientation(int i10) {
        this.I = i10;
    }

    public void setPlaybackParams(float f10) {
        PlayerView playerView = this.f18630p;
        if (playerView != null) {
            playerView.setPlaybackParams(f10);
        }
    }

    public void setProgressBarState(int i10) {
        ProgressBar progressBar = this.O;
        if (progressBar != null) {
            progressBar.setVisibility(i10 == 0 ? 8 : 0);
            CampaignEx campaignEx = this.f18538b;
            if (campaignEx == null || campaignEx.getProgressBarShow() != 1) {
                return;
            }
            this.O.setVisibility(0);
        }
    }

    public void setShowClose(int i10) {
        this.f18639y = i10;
    }

    public void setShowMute(int i10) {
        this.f18640z = i10;
    }

    public void setShowTime(int i10) {
        this.f18638x = i10;
    }

    public void setSoundImageViewVisble(int i10) {
        this.f18631q.setVisibility(i10 == 0 ? 4 : 0);
    }

    public void setVideoEvents(com.iab.omid.library.mmadbridge.adsession.media.a aVar) {
        this.C = aVar;
        d dVar = this.D;
        if (dVar != null) {
            dVar.f18646c = aVar;
        }
        PlayerView playerView = this.f18630p;
        if (playerView != null) {
            playerView.setVideoEvents(aVar);
        }
    }

    public void setVolume(float f10, float f11) {
        PlayerView playerView = this.f18630p;
        if (playerView != null) {
            playerView.setVolume(f10, f11);
        }
    }

    public void soundOperate(int i10, int i11, String str) {
        if (this.f18544h) {
            this.E = i10;
            if (i10 == 1) {
                this.f18631q.setSoundStatus(false);
                this.f18630p.closeSound();
            } else if (i10 == 2) {
                this.f18631q.setSoundStatus(true);
                this.f18630p.openSound();
            }
            if (i11 == 1) {
                this.f18631q.setVisibility(8);
            } else if (i11 == 2) {
                this.f18631q.setVisibility(0);
            }
            com.iab.omid.library.mmadbridge.adsession.media.a aVar = this.C;
            if (aVar != null) {
                try {
                    aVar.p(this.f18630p.getVolume());
                } catch (Exception e10) {
                    q0.b("omsdk", e10.getMessage());
                }
            }
        }
    }

    public void stop() {
        try {
            PlayerView playerView = this.f18630p;
            if (playerView != null) {
                playerView.pause();
                this.f18630p.stop();
                this.G = true;
                WebView webView = this.f18636v;
                if (webView != null) {
                    BTBaseView.a(webView, "onPlayerStop", this.f18540d);
                }
            }
        } catch (Exception e10) {
            q0.b(BTBaseView.TAG, e10.getMessage(), e10);
        }
    }

    private void d() {
        String str;
        if (this.f18538b.getAdType() == 94 || this.f18538b.getAdType() == 287) {
            str = this.f18538b.getRequestId() + this.f18538b.getId() + this.f18538b.getVideoUrlEncode();
        } else {
            str = this.f18538b.getId() + this.f18538b.getVideoUrlEncode() + this.f18538b.getBidToken();
        }
        com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f18539c, str);
        if (aVarA != null) {
            this.f18637w = aVarA;
        }
    }

    private boolean e() {
        try {
            this.f18630p = (PlayerView) findViewById(findID("mbridge_vfpv"));
            this.f18631q = (SoundImageView) findViewById(findID("mbridge_sound_switch"));
            this.f18632r = (TextView) findViewById(findID("mbridge_tv_count"));
            this.f18633s = findViewById(findID("mbridge_rl_playing_close"));
            this.N = (RelativeLayout) findViewById(findID("mbridge_top_control"));
            this.O = (ProgressBar) findViewById(findID("mbridge_video_progress_bar"));
            this.f18630p.setIsBTVideo(true);
            this.f18634t = (FeedBackButton) findViewById(findID("mbridge_native_endcard_feed_btn"));
            this.f18635u = (ImageView) findViewById(findID("mbridge_iv_link"));
            return isNotNULL(this.f18630p, this.f18631q, this.f18632r, this.f18633s);
        } catch (Throwable th) {
            q0.b(BTBaseView.TAG, th.getMessage(), th);
            return false;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void b() {
        super.b();
        if (this.f18544h) {
            this.f18631q.setOnClickListener(new a());
            this.f18633s.setOnClickListener(new b());
            setOnClickListener(new c());
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (campaignEx.getReady_rate() != -1) {
                return campaignEx.getReady_rate();
            }
            return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f18539c, false).w();
        }
        return com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f18539c, false).w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10, int i11) {
        if (i11 != 0) {
            try {
                return v0.a(Double.valueOf(i10 / i11)) + "";
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i11 + "";
    }

    public MBridgeBTVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18638x = 0;
        this.f18639y = 0;
        this.f18640z = 0;
        this.E = 2;
        this.G = false;
        this.H = 2;
        this.I = 1;
        this.K = false;
        this.L = false;
        this.M = false;
    }
}
