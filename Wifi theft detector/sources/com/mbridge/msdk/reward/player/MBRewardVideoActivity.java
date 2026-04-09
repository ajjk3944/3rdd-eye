package com.mbridge.msdk.reward.player;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.reward.adapter.RewardUnitCacheManager;
import com.mbridge.msdk.scheme.applet.AppletModelManager;
import com.mbridge.msdk.video.bt.module.MBTempContainer;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.bt.module.orglistener.h;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.activity.AbstractJSActivity;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.videocommon.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public class MBRewardVideoActivity extends AbstractJSActivity {
    public static String INTENT_LOCAL_REQUEST_ID = "lRid";
    public static String SAVE_STATE_KEY_REPORT = "hasRelease";
    private MBTempContainer A;
    private MBridgeBTContainer B;
    private WindVaneWebView C;
    private com.mbridge.msdk.video.bt.module.listener.a D;
    private String E;
    private String F;
    private boolean G;
    private String O;
    private com.mbridge.msdk.foundation.same.report.metrics.c P;
    private boolean R;

    /* renamed from: g, reason: collision with root package name */
    private String f16861g;

    /* renamed from: h, reason: collision with root package name */
    private String f16862h;

    /* renamed from: i, reason: collision with root package name */
    private String f16863i;

    /* renamed from: j, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.entity.c f16864j;

    /* renamed from: n, reason: collision with root package name */
    private int f16868n;

    /* renamed from: o, reason: collision with root package name */
    private int f16869o;

    /* renamed from: p, reason: collision with root package name */
    private int f16870p;

    /* renamed from: s, reason: collision with root package name */
    private h f16873s;

    /* renamed from: t, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f16874t;

    /* renamed from: w, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.download.a f16877w;

    /* renamed from: x, reason: collision with root package name */
    private CampaignEx f16878x;

    /* renamed from: y, reason: collision with root package name */
    private List<com.mbridge.msdk.videocommon.download.a> f16879y;

    /* renamed from: z, reason: collision with root package name */
    private List<CampaignEx> f16880z;

    /* renamed from: k, reason: collision with root package name */
    private int f16865k = 2;

    /* renamed from: l, reason: collision with root package name */
    private boolean f16866l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f16867m = false;

    /* renamed from: q, reason: collision with root package name */
    private boolean f16871q = false;

    /* renamed from: r, reason: collision with root package name */
    private boolean f16872r = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f16875u = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f16876v = false;
    private int H = 1;
    private int I = 0;
    private int J = 0;
    private int K = 0;
    private int L = 0;
    private int M = 0;
    private int N = 0;
    private boolean Q = false;
    private o5.b S = null;
    private com.iab.omid.library.mmadbridge.adsession.media.a T = null;
    private o5.a U = null;
    private long V = 0;
    private String W = "";
    private Boolean X = null;
    private int Y = 0;
    private boolean Z = false;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f16855a0 = false;

    /* renamed from: b0, reason: collision with root package name */
    private boolean f16856b0 = false;

    /* renamed from: c0, reason: collision with root package name */
    private int f16857c0 = -1;

    /* renamed from: d0, reason: collision with root package name */
    private String f16858d0 = "null";

    /* renamed from: e0, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.a f16859e0 = new a();

    /* renamed from: f0, reason: collision with root package name */
    private com.mbridge.msdk.video.dynview.listener.d f16860f0 = new b();

    public class a implements com.mbridge.msdk.video.dynview.listener.a {
        public a() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.a
        public void a(Map<String, Object> map) {
            if (map == null) {
                return;
            }
            if (map.containsKey(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                MBRewardVideoActivity.this.f16865k = ((Integer) map.get(CampaignEx.JSON_NATIVE_VIDEO_MUTE)).intValue();
            }
            if (map.containsKey("position")) {
                int iIntValue = ((Integer) map.get("position")).intValue();
                if (MBRewardVideoActivity.this.f16880z == null || MBRewardVideoActivity.this.f16880z.size() <= 0 || iIntValue < 1) {
                    return;
                }
                MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
                mBRewardVideoActivity.f16878x = (CampaignEx) mBRewardVideoActivity.f16880z.get(iIntValue);
                MBRewardVideoActivity.m(MBRewardVideoActivity.this);
                int i10 = iIntValue - 1;
                if (MBRewardVideoActivity.this.f16880z.get(i10) != null) {
                    MBRewardVideoActivity mBRewardVideoActivity2 = MBRewardVideoActivity.this;
                    MBRewardVideoActivity.b(mBRewardVideoActivity2, ((CampaignEx) mBRewardVideoActivity2.f16880z.get(i10)).getVideoLength());
                }
                MBRewardVideoActivity mBRewardVideoActivity3 = MBRewardVideoActivity.this;
                MBRewardVideoActivity.this.f16878x.setVideoCompleteTime(mBRewardVideoActivity3.a(mBRewardVideoActivity3.f16878x.getVideoCompleteTime(), MBRewardVideoActivity.this.H));
                MBRewardVideoActivity.this.f16878x.setShowIndex(MBRewardVideoActivity.this.H);
                MBRewardVideoActivity.this.f16878x.setShowType(1);
                MBRewardVideoActivity mBRewardVideoActivity4 = MBRewardVideoActivity.this;
                mBRewardVideoActivity4.c(mBRewardVideoActivity4.f16878x);
            }
        }
    }

    public class d implements com.mbridge.msdk.foundation.feedback.a {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            MBRewardVideoActivity.this.onPause();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            MBRewardVideoActivity.this.onResume();
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            MBRewardVideoActivity.this.onResume();
        }
    }

    public static final class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f16885a;

        /* renamed from: b, reason: collision with root package name */
        private final String f16886b;

        /* renamed from: c, reason: collision with root package name */
        private final String f16887c;

        public e(List<com.mbridge.msdk.videocommon.download.a> list, String str, String str2) {
            this.f16885a = list;
            this.f16886b = str;
            this.f16887c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f16885a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f16885a) {
                    if (aVar != null && aVar.h() != null) {
                        CampaignEx campaignExH = aVar.h();
                        try {
                            AppletModelManager.getInstance().remove(campaignExH);
                        } catch (Exception e10) {
                            if (MBridgeConstans.DEBUG) {
                                q0.b("MBRewardVideoActivity", "AppletModelManager remove error", e10);
                            }
                        }
                        com.mbridge.msdk.videocommon.download.b.getInstance().c(this.f16886b, campaignExH.getRequestId() + campaignExH.getId() + campaignExH.getVideoUrlEncode());
                        if (campaignExH.getRewardTemplateMode() != null) {
                            if (!TextUtils.isEmpty(campaignExH.getRewardTemplateMode().j())) {
                                com.mbridge.msdk.videocommon.a.e(this.f16886b + "_" + campaignExH.getId() + "_" + this.f16887c + "_" + campaignExH.getRewardTemplateMode().j());
                                com.mbridge.msdk.videocommon.a.b(campaignExH.getAdType(), campaignExH);
                            }
                            if (!TextUtils.isEmpty(campaignExH.getCMPTEntryUrl())) {
                                com.mbridge.msdk.videocommon.a.e(this.f16886b + "_" + this.f16887c + "_" + campaignExH.getCMPTEntryUrl());
                            }
                            com.mbridge.msdk.videocommon.cache.a.a().a(this.f16886b, campaignExH);
                        }
                    }
                }
            } catch (Exception e11) {
                q0.a("MBRewardVideoActivity", e11.getMessage());
            }
        }
    }

    public static final class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final List<com.mbridge.msdk.videocommon.download.a> f16888a;

        /* renamed from: b, reason: collision with root package name */
        private final String f16889b;

        public f(String str, List<com.mbridge.msdk.videocommon.download.a> list) {
            this.f16888a = list;
            this.f16889b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                List<com.mbridge.msdk.videocommon.download.a> list = this.f16888a;
                if (list == null || list.size() <= 0) {
                    return;
                }
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f16888a) {
                    if (aVar != null && aVar.h() != null) {
                        com.mbridge.msdk.videocommon.cache.a.a().a(aVar.h(), this.f16889b);
                    }
                }
            } catch (Throwable th) {
                q0.b("MBRewardVideoActivity", th.getMessage());
            }
        }
    }

    public static /* synthetic */ int m(MBRewardVideoActivity mBRewardVideoActivity) {
        int i10 = mBRewardVideoActivity.H;
        mBRewardVideoActivity.H = i10 + 1;
        return i10;
    }

    public void changeHalfScreenPadding(int i10) {
        int iF;
        int iG;
        int iG2;
        float f10;
        try {
            CampaignEx campaignEx = this.f16878x;
            if (campaignEx == null || campaignEx.getAdSpaceT() != 2) {
                return;
            }
            getWindow().getDecorView().setBackgroundColor(-1728053248);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.A.getLayoutParams();
            layoutParams.gravity = 17;
            if (this.f16878x.getRewardTemplateMode().g() == 0) {
                if (i10 == 2) {
                    iF = (int) (v0.f(this) * 0.6f);
                    iG2 = v0.g(this);
                    f10 = iG2 * 0.6f;
                } else {
                    iF = (int) (v0.f(this) * 0.6f);
                    iG = v0.g(this);
                    f10 = iG * 0.7f;
                }
            } else if (this.f16878x.getRewardTemplateMode().g() == 2) {
                iF = (int) (v0.f(this) * 0.6f);
                iG2 = v0.g(this);
                f10 = iG2 * 0.6f;
            } else {
                iF = (int) (v0.f(this) * 0.6f);
                iG = v0.g(this);
                f10 = iG * 0.7f;
            }
            int i11 = (int) f10;
            layoutParams.height = iF;
            layoutParams.width = i11;
            this.A.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            q0.b("MBRewardVideoActivity", th.getMessage());
        }
    }

    public int findID(String str) {
        return i0.a(getApplicationContext(), str, "id");
    }

    public int findLayout(String str) {
        return i0.a(getApplicationContext(), str, TtmlNode.TAG_LAYOUT);
    }

    @Override // android.app.Activity
    public void finish() {
        this.Z = true;
        com.mbridge.msdk.foundation.controller.c.n().b(0);
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.A = null;
        }
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f16861g);
        if (this.S != null) {
            q0.b("omsdk", "mbrewardvideoac finish");
            this.S.e();
            this.S.c();
            this.S = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.B = null;
        }
        super.finish();
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void onBackDispatched() {
        this.f16856b0 = true;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onBackPressed() {
        this.f16855a0 = true;
        super.onBackPressed();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onBackPressed();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onBackPressed();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.A != null) {
            changeHalfScreenPadding(configuration.orientation);
            this.A.onConfigurationChanged(configuration);
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onConfigurationChanged(configuration);
        }
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        List<com.mbridge.msdk.videocommon.download.a> list;
        String cMPTEntryUrl = "";
        super.onCreate(bundle);
        MBridgeConstans.isRewardActivityShowing = true;
        if (com.mbridge.msdk.foundation.controller.c.n().f() != null) {
            this.f16858d0 = com.mbridge.msdk.foundation.controller.c.n().f().getClass().getSimpleName();
        }
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        this.V = SystemClock.elapsedRealtime();
        if (TextUtils.isEmpty(this.W)) {
            str = "onCreate";
        } else {
            str = this.W + "_onCreate";
        }
        this.W = str;
        try {
            Intent intent = getIntent();
            this.f16861g = intent.getStringExtra(MBridgeConstans.UNIT_ID);
            this.f16862h = intent.getStringExtra(MBridgeConstans.PLACEMENT_ID);
            this.f16864j = com.mbridge.msdk.videocommon.entity.c.a(intent.getStringExtra(MBridgeConstans.REWARD_ID));
            this.f16863i = intent.getStringExtra(MBridgeConstans.USER_ID);
            this.f16865k = intent.getIntExtra(MBridgeConstans.MUTE_STATE, 2);
            this.f16866l = intent.getBooleanExtra(MBridgeConstans.IS_IV, false);
            com.mbridge.msdk.foundation.controller.c.n().b(this.f16866l ? 287 : 94);
            this.f16867m = intent.getBooleanExtra(MBridgeConstans.IS_BID, false);
            this.F = intent.getStringExtra(MBridgeConstans.EXTRA_DATA);
            this.Q = intent.getBooleanExtra("is_refactor", false);
            if ((intent.getFlags() & 268435456) != 0) {
                this.f16857c0 = 0;
            } else {
                this.f16857c0 = 1;
            }
            if (this.Q) {
                this.f16873s = MBridgeGlobalCommon.showRewardListenerMap.get(this.f16861g);
            } else {
                this.f16873s = com.mbridge.msdk.reward.controller.a.f16761f0.get(this.f16861g);
            }
            if (this.f16866l) {
                this.f16868n = intent.getIntExtra(MBridgeConstans.IV_REWARD_MODE_TYPE, 0);
                this.f16869o = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE_TYPE, 0);
                this.f16870p = intent.getIntExtra(MBridgeConstans.IV_REWARD_VALUE, 0);
            }
            this.f16871q = intent.getBooleanExtra(MBridgeConstans.IS_BIG_OFFER, false);
            this.f16879y = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f16861g);
            this.f16880z = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.f16861g);
            int iFindLayout = findLayout("mbridge_more_offer_activity");
            if (!i0.a(iFindLayout)) {
                b("no mbridge_more_offer_activity layout");
                return;
            }
            setContentView(iFindLayout);
            if (TextUtils.isEmpty(this.f16861g)) {
                b("data empty error");
                return;
            }
            com.mbridge.msdk.video.signal.factory.b bVar = new com.mbridge.msdk.video.signal.factory.b(this);
            this.jsFactory = bVar;
            registerJsFactory(bVar);
            h hVar = this.f16873s;
            if (hVar == null) {
                b("showRewardListener is null");
                return;
            }
            this.Y = hVar.hashCode();
            com.mbridge.msdk.videocommon.setting.c cVar = RewardUnitCacheManager.getInstance().get(this.f16862h, this.f16861g);
            this.f16874t = cVar;
            if (cVar == null) {
                com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f16861g);
                this.f16874t = cVarC;
                if (cVarC == null) {
                    this.f16874t = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f16861g, this.f16866l);
                }
            }
            com.mbridge.msdk.videocommon.setting.c cVar2 = this.f16874t;
            if (cVar2 != null) {
                this.f16864j.a(cVar2.d());
                this.f16864j.b(this.f16874t.s());
            }
            com.mbridge.msdk.videocommon.entity.c cVar3 = this.f16864j;
            if (cVar3 != null && cVar3.a() <= 0) {
                this.f16864j.a(1);
            }
            int iA = i0.a(this, "mbridge_reward_activity_open", "anim");
            int iA2 = i0.a(this, "mbridge_reward_activity_stay", "anim");
            if (i0.a(iA) && i0.a(iA2)) {
                overridePendingTransition(iA, iA2);
            }
            if (bundle != null) {
                try {
                    this.f16876v = bundle.getBoolean(SAVE_STATE_KEY_REPORT);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
            q0.a("DynamicViewCampaignResourceDownloader", "进入 show，大模板 " + this.f16871q);
            if (!this.f16871q) {
                List<com.mbridge.msdk.videocommon.download.a> list2 = this.f16879y;
                if (list2 != null && list2.size() > 0) {
                    this.f16877w = this.f16879y.get(0);
                }
                com.mbridge.msdk.videocommon.download.a aVar = this.f16877w;
                if (aVar != null) {
                    this.f16878x = aVar.h();
                    this.f16877w.b(true);
                    this.f16877w.d(false);
                    CampaignEx campaignEx = this.f16878x;
                    if (campaignEx != null) {
                        this.O = campaignEx.getCurrentLocalRid();
                        this.f16878x.setShowIndex(1);
                        this.f16878x.setShowType(1);
                        com.mbridge.msdk.reward.controller.a.f16757b0 = this.f16878x.getEcppv();
                        com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f16878x.getMaitve(), this.f16878x.getMaitve_src());
                    }
                }
                CampaignEx campaignEx2 = this.f16878x;
                if (campaignEx2 != null && !com.mbridge.msdk.foundation.tools.h.a(campaignEx2, this, (View) null, campaignEx2.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                if (this.f16877w != null && this.f16878x != null && this.f16864j != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f16878x);
                    a(arrayList);
                    b(this.f16878x);
                    j();
                    if (com.mbridge.msdk.util.b.a()) {
                        return;
                    }
                    e();
                    return;
                }
                b("data empty error");
                return;
            }
            a(this.f16880z);
            this.E = "";
            List<CampaignEx> list3 = this.f16880z;
            if (list3 != null && list3.size() > 0) {
                CampaignEx campaignEx3 = this.f16880z.get(0);
                if (!com.mbridge.msdk.foundation.tools.h.a(this.f16880z, this, (View) null, campaignEx3.getImpReportType())) {
                    b("env is exception");
                    return;
                }
                b(campaignEx3);
                cMPTEntryUrl = campaignEx3.getCMPTEntryUrl();
                this.E = campaignEx3.getRequestId();
                this.O = campaignEx3.getCurrentLocalRid();
                com.mbridge.msdk.reward.controller.a.f16757b0 = campaignEx3.getEcppv();
                com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx3.getMaitve(), campaignEx3.getMaitve_src());
            }
            WindVaneWebView windVaneWebViewA = a(this.f16861g + "_" + this.E + "_" + cMPTEntryUrl);
            this.C = windVaneWebViewA;
            if (windVaneWebViewA == null) {
                if (this.f16877w == null && (list = this.f16879y) != null && list.size() > 0) {
                    this.f16877w = this.f16879y.get(0);
                }
                if (this.f16877w == null) {
                    this.f16877w = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f16866l ? 287 : 94, this.f16861g, this.f16867m);
                }
                com.mbridge.msdk.videocommon.download.a aVar2 = this.f16877w;
                if (aVar2 != null) {
                    this.f16878x = aVar2.h();
                    this.f16877w.b(true);
                    this.f16877w.d(false);
                }
                if (this.f16877w != null && this.f16878x != null && this.f16864j != null) {
                    this.f16871q = false;
                    List<CampaignEx> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.f16880z);
                    if (listA == null) {
                        b("no available campaign");
                        return;
                    }
                    int size = listA.size();
                    if (size == 0) {
                        b("no available campaign");
                        return;
                    }
                    if (listA.get(0) == null || !listA.get(0).isDynamicView()) {
                        j();
                    } else if (size == 1) {
                        CampaignEx campaignEx4 = listA.get(0);
                        this.f16878x = campaignEx4;
                        if (campaignEx4 != null) {
                            this.O = campaignEx4.getCurrentLocalRid();
                            this.f16878x.setCampaignIsFiltered(true);
                        }
                        c(this.f16878x);
                    } else {
                        b(listA);
                    }
                }
                b("data empty error");
                return;
            }
            b(this.f16880z.get(0));
            WindVaneWebView windVaneWebView = this.C;
            if (windVaneWebView != null) {
                b1.a(windVaneWebView, this.f16880z.get(0).getLocalRequestId(), this.f16880z.get(0).getLocalAllowTrackClick());
                try {
                    k kVar = (k) this.C.getObject();
                    kVar.setAdEvents(this.U);
                    kVar.setAdSession(this.S);
                    kVar.setVideoEvents(this.T);
                    this.C.setObject(kVar);
                } catch (Exception e11) {
                    q0.b("MBRewardVideoActivity", e11.getMessage());
                }
            }
            k();
            if (com.mbridge.msdk.util.b.a()) {
                return;
            }
            e();
        } catch (Throwable th) {
            a(this.f16880z);
            b("onCreate error" + th);
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onDestroy() {
        String str;
        if (TextUtils.isEmpty(this.W)) {
            str = "onDestroy";
        } else {
            str = this.W + "_onDestroy";
        }
        this.W = str;
        super.onDestroy();
        f();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("activity_life_cycle", TextUtils.isEmpty(this.W) ? "unKnown" : this.W);
        eVar.a("activity_duration", Long.valueOf(SystemClock.elapsedRealtime() - this.V));
        Boolean bool = this.X;
        eVar.a("is_unexpected_destroy", Integer.valueOf(bool == null ? 0 : bool.booleanValue() ? 1 : 2));
        eVar.a("is_listener_null", Integer.valueOf(this.f16873s == null ? 1 : 2));
        eVar.a("is_called_finish", Integer.valueOf(this.Z ? 1 : 2));
        eVar.a("is_back_pressed", Integer.valueOf(this.f16855a0 ? 1 : 2));
        eVar.a("is_back_dispatcher_invoked", Integer.valueOf(this.f16856b0 ? 1 : 2));
        h hVar = this.f16873s;
        eVar.a("is_listener_change", Integer.valueOf(hVar != null ? hVar.hashCode() == this.Y ? 1 : 2 : 0));
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000151", this.f16878x, eVar);
        g();
        com.mbridge.msdk.video.module.report.b.a(this.f16861g);
        h();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onDestroy();
            this.A = null;
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onDestroy();
            this.B = null;
        }
        this.f16859e0 = null;
        this.f16860f0 = null;
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f16861g + "_1");
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f16861g + "_2");
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(this.f16879y, this.f16861g, this.E));
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, android.app.Activity
    public void onPause() {
        String str;
        super.onPause();
        if (TextUtils.isEmpty(this.W)) {
            str = "onPause";
        } else {
            str = this.W + "_onPause";
        }
        this.W = str;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onPause();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onPause();
        }
    }

    @Override // android.app.Activity
    public void onRestart() {
        String str;
        super.onRestart();
        if (TextUtils.isEmpty(this.W)) {
            str = "onRestart";
        } else {
            str = this.W + "_onRestart";
        }
        this.W = str;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onRestart();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onRestart();
        }
    }

    @Override // com.mbridge.msdk.video.signal.activity.AbstractJSActivity, com.mbridge.msdk.activity.MBBaseActivity, android.app.Activity
    public void onResume() {
        String str;
        MBridgeVideoView mBridgeVideoView;
        super.onResume();
        if (TextUtils.isEmpty(this.W)) {
            str = "onResume";
        } else {
            str = this.W + "_onResume";
        }
        this.W = str;
        if (com.mbridge.msdk.foundation.feedback.b.f14986f) {
            MBTempContainer mBTempContainer = this.A;
            if (mBTempContainer == null || (mBridgeVideoView = mBTempContainer.mbridgeVideoView) == null) {
                return;
            }
            mBridgeVideoView.setCover(false);
            return;
        }
        com.mbridge.msdk.foundation.controller.c.n().a(this);
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new f(this.f16861g, this.f16879y));
        } catch (Throwable th) {
            q0.b("MBRewardVideoActivity", th.getMessage());
        }
        MBTempContainer mBTempContainer2 = this.A;
        if (mBTempContainer2 != null) {
            mBTempContainer2.onResume();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onResume();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(SAVE_STATE_KEY_REPORT, this.f16876v);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        String str;
        super.onStart();
        if (TextUtils.isEmpty(this.W)) {
            str = "onStart";
        } else {
            str = this.W + "_onStart";
        }
        this.W = str;
        if (com.mbridge.msdk.foundation.feedback.b.f14986f) {
            return;
        }
        new d();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onStart();
            this.f16878x.setCampaignUnitId(this.f16861g);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f16861g + "_1", this.f16878x);
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStart();
            List<CampaignEx> list = this.f16880z;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = this.f16880z.get(0);
                campaignEx.setCampaignUnitId(this.f16861g);
                com.mbridge.msdk.foundation.feedback.b.b().a(this.f16861g + "_1", campaignEx);
            }
        }
        if (this.G) {
            return;
        }
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f16861g + "_1", 1);
        com.mbridge.msdk.foundation.feedback.b.b().d(this.f16861g + "_2");
        this.G = true;
    }

    @Override // android.app.Activity
    public void onStop() {
        String str;
        if (TextUtils.isEmpty(this.W)) {
            str = "onStop";
        } else {
            str = this.W + "_onStop";
        }
        this.W = str;
        MBridgeConstans.isRewardActivityShowing = false;
        super.onStop();
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.onStop();
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.onStop();
        }
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i10) {
        super.setTheme(i0.a(this, "mbridge_transparent_theme", TtmlNode.TAG_STYLE));
    }

    @Override // com.mbridge.msdk.activity.MBBaseActivity
    public void setTopControllerPadding(int i10, int i11, int i12, int i13, int i14) throws JSONException {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        this.J = i11;
        this.L = i12;
        this.K = i13;
        this.M = i14;
        this.N = i10;
        MBTempContainer mBTempContainer = this.A;
        if (mBTempContainer != null) {
            mBTempContainer.setNotchPadding(i10, i11, i12, i13, i14);
            i19 = i14;
            i18 = i13;
            i17 = i12;
            i16 = i11;
            i15 = i10;
        } else {
            i15 = i10;
            i16 = i11;
            i17 = i12;
            i18 = i13;
            i19 = i14;
        }
        MBridgeBTContainer mBridgeBTContainer = this.B;
        if (mBridgeBTContainer != null) {
            mBridgeBTContainer.setNotchPadding(i15, i16, i17, i18, i19);
        }
        com.mbridge.msdk.video.dynview.constant.a.a(i15, i16, i17, i18, i19);
    }

    public class c implements com.mbridge.msdk.video.bt.module.listener.a {
        public c() {
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a() {
            if (MBRewardVideoActivity.this.f16873s != null) {
                MBRewardVideoActivity.this.f16873s.a(MBRewardVideoActivity.this.P);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void b(String str, String str2) {
            if (MBRewardVideoActivity.this.f16873s != null) {
                MBRewardVideoActivity.this.f16873s.b(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, com.mbridge.msdk.videocommon.entity.c cVar) {
            if (MBRewardVideoActivity.this.f16873s != null) {
                MBRewardVideoActivity.this.f16873s.a(MBRewardVideoActivity.this.P, z10, cVar);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, int i10) {
            if (MBRewardVideoActivity.this.f16873s != null) {
                MBRewardVideoActivity.this.f16873s.a(z10, i10);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str) {
            if (MBRewardVideoActivity.this.f16873s != null) {
                MBRewardVideoActivity.this.f16873s.a(MBRewardVideoActivity.this.P, str);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(boolean z10, String str, String str2) {
            if (MBRewardVideoActivity.this.f16873s != null) {
                MBRewardVideoActivity.this.f16873s.a(z10, str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(String str, String str2) {
            if (MBRewardVideoActivity.this.f16873s != null) {
                MBRewardVideoActivity.this.f16873s.a(str, str2);
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.listener.a
        public void a(int i10, String str, String str2) {
            if (MBRewardVideoActivity.this.f16873s != null) {
                MBRewardVideoActivity.this.f16873s.a(i10, str, str2);
            }
        }
    }

    public static /* synthetic */ int b(MBRewardVideoActivity mBRewardVideoActivity, int i10) {
        int i11 = mBRewardVideoActivity.I - i10;
        mBRewardVideoActivity.I = i11;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignEx campaignEx) {
        CampaignEx campaignExH;
        try {
            List<com.mbridge.msdk.videocommon.download.a> list = this.f16879y;
            if (list != null && list.size() > 0) {
                for (com.mbridge.msdk.videocommon.download.a aVar : this.f16879y) {
                    if (aVar != null && (campaignExH = aVar.h()) != null && TextUtils.equals(campaignExH.getId(), campaignEx.getId()) && TextUtils.equals(campaignExH.getRequestId(), campaignEx.getRequestId())) {
                        this.f16877w = aVar;
                    }
                }
            }
            this.f16871q = true;
            j();
            MBTempContainer mBTempContainer = this.A;
            if (mBTempContainer != null) {
                mBTempContainer.setNotchPadding(this.N, this.J, this.L, this.K, this.M);
            }
        } catch (Exception e10) {
            q0.b("MBRewardVideoActivity", e10.getMessage());
            b("more offer to one offer exception");
        }
    }

    private void d(CampaignEx campaignEx) {
        com.mbridge.msdk.reward.player.a.a(this, campaignEx, this.f16874t, this.f16861g);
    }

    private void e() {
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            BitmapDrawable bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f16861g, this.f16866l ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94);
            if (bitmapDrawableA != null) {
                ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                v0.a(imageView, bitmapDrawableA, getResources().getDisplayMetrics());
                ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).addView(imageView, new ViewGroup.LayoutParams(-1, -1));
                o5.b bVar = this.S;
                if (bVar != null) {
                    bVar.a(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void f() {
        h hVar = this.f16873s;
        if (hVar == null || !(hVar instanceof com.mbridge.msdk.video.bt.module.orglistener.b)) {
            return;
        }
        try {
            com.mbridge.msdk.video.bt.module.orglistener.b bVar = (com.mbridge.msdk.video.bt.module.orglistener.b) hVar;
            Boolean boolD = bVar.d();
            Boolean boolC = bVar.c();
            if (boolD == null && boolC == null) {
                this.X = null;
            } else {
                Boolean bool = Boolean.FALSE;
                this.X = Boolean.valueOf(bool.equals(boolD) && bool.equals(boolC));
            }
        } catch (Throwable th) {
            q0.b("MBRewardVideoActivity", th.getMessage());
        }
    }

    private void g() {
        try {
            Boolean bool = this.X;
            if (bool != null && !bool.booleanValue()) {
                return;
            }
            h hVar = this.f16873s;
            if (hVar != null) {
                hVar.a(this.P, "show fail : unexpected destroy");
            }
        } catch (Throwable th) {
            q0.b("MBRewardVideoActivity", th.getMessage());
        }
    }

    private void h() {
        try {
            List<CampaignEx> list = this.f16880z;
            if (list != null && list.size() > 0) {
                Iterator<CampaignEx> it = this.f16880z.iterator();
                while (it.hasNext()) {
                    a(it.next());
                }
            }
            CampaignEx campaignEx = this.f16878x;
            if (campaignEx != null) {
                a(campaignEx);
            }
        } catch (Throwable th) {
            q0.b("MBRewardVideoActivity", th.getMessage());
        }
    }

    private com.mbridge.msdk.video.bt.module.listener.a i() {
        if (this.D == null) {
            this.D = new c();
        }
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        List<CampaignEx> list;
        RewardPlus rewardPlus;
        CampaignEx campaignEx;
        List<CampaignEx> list2;
        int iFindID = findID("mbridge_temp_container");
        if (!i0.a(iFindID)) {
            b("no id mbridge_bt_container in mbridge_more_offer_activity layout");
        }
        MBTempContainer mBTempContainer = (MBTempContainer) findViewById(iFindID);
        this.A = mBTempContainer;
        if (mBTempContainer == null) {
            b("env error");
        }
        List<CampaignEx> list3 = this.f16880z;
        if (list3 == null || list3.size() <= 0 || !this.f16880z.get(0).isDynamicView()) {
            this.A.setVisibility(0);
        } else {
            new com.mbridge.msdk.video.dynview.ui.b().a(this.A, 500L);
        }
        changeHalfScreenPadding(-1);
        this.A.setActivity(this);
        this.A.setBidCampaign(this.f16867m);
        this.A.setBigOffer(this.f16871q);
        this.A.setUnitId(this.f16861g);
        this.A.setCampaign(this.f16878x);
        if (this.f16878x.getDynamicTempCode() == 5 && (list2 = this.f16880z) != null && list2.size() > 1) {
            View viewFindViewById = findViewById(findID("mbridge_reward_root_container"));
            if (viewFindViewById != null) {
                viewFindViewById.setBackgroundColor(-16777216);
            }
            this.A.removeAllViews();
            this.A.setCampOrderViewData(this.f16880z, this.I);
            this.A.setCamPlayOrderCallback(this.f16859e0, this.H);
        }
        this.A.setCampaignDownLoadTask(this.f16877w);
        this.A.setIV(this.f16866l);
        CampaignEx campaignEx2 = this.f16878x;
        if (campaignEx2 == null || campaignEx2.getAdSpaceT() != 2) {
            this.A.setIVRewardEnable(this.f16868n, this.f16869o, this.f16870p);
        } else {
            this.A.setIVRewardEnable(0, 0, 0);
        }
        this.A.setMute(this.f16865k);
        CampaignEx campaignEx3 = this.f16878x;
        if (((campaignEx3 != null && (rewardPlus = campaignEx3.getRewardPlus()) != null) || ((list = this.f16880z) != null && list.size() > 0 && this.f16880z.get(0) != null && (rewardPlus = this.f16880z.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.f16864j = cVar;
        }
        this.A.setReward(this.f16864j);
        this.A.setRewardUnitSetting(this.f16874t);
        this.A.setPlacementId(this.f16862h);
        this.A.setUserId(this.f16863i);
        this.A.setShowRewardListener(this.f16873s);
        this.A.setDeveloperExtraData(this.F);
        this.A.init(this);
        this.A.setAdSession(this.S);
        this.A.setAdEvents(this.U);
        this.A.setVideoEvents(this.T);
        this.A.onCreate();
        if (!com.mbridge.msdk.util.b.a() || (campaignEx = this.f16878x) == null) {
            return;
        }
        d(campaignEx);
    }

    private void k() {
        RewardPlus rewardPlus;
        List<CampaignEx> list;
        int iFindID = findID("mbridge_bt_container");
        if (!i0.a(iFindID)) {
            b("no mbridge_webview_framelayout in mbridge_more_offer_activity layout");
        }
        MBridgeBTContainer mBridgeBTContainer = (MBridgeBTContainer) findViewById(iFindID);
        this.B = mBridgeBTContainer;
        if (mBridgeBTContainer == null) {
            b("env error");
        }
        this.B.setVisibility(0);
        com.mbridge.msdk.video.bt.module.listener.a aVarI = i();
        this.D = aVarI;
        this.B.setBTContainerCallback(aVarI);
        this.B.setShowRewardVideoListener(this.f16873s);
        this.B.setChoiceOneCallback(this.f16860f0);
        this.B.setCampaigns(this.f16880z);
        this.B.setCampaignDownLoadTasks(this.f16879y);
        this.B.setRewardUnitSetting(this.f16874t);
        this.B.setUnitId(this.f16861g);
        this.B.setPlacementId(this.f16862h);
        this.B.setUserId(this.f16863i);
        this.B.setActivity(this);
        CampaignEx campaignEx = this.f16878x;
        if (((campaignEx != null && (rewardPlus = campaignEx.getRewardPlus()) != null) || (this.f16880z.get(0) != null && (rewardPlus = this.f16880z.get(0).getRewardPlus()) != null)) && !TextUtils.isEmpty(rewardPlus.getName()) && rewardPlus.getAmount() > 0) {
            com.mbridge.msdk.videocommon.entity.c cVar = new com.mbridge.msdk.videocommon.entity.c(rewardPlus.getName(), rewardPlus.getAmount());
            if (cVar.a() < 0) {
                cVar.a(1);
            }
            this.f16864j = cVar;
        }
        this.B.setReward(this.f16864j);
        this.B.setIVRewardEnable(this.f16868n, this.f16869o, this.f16870p);
        this.B.setIV(this.f16866l);
        this.B.setMute(this.f16865k);
        this.B.setJSFactory((com.mbridge.msdk.video.signal.factory.b) this.jsFactory);
        this.B.setDeveloperExtraData(this.F);
        this.B.init(this);
        this.B.setAdSession(this.S);
        this.B.setVideoEvents(this.T);
        this.B.setAdEvents(this.U);
        this.B.onCreate(this.Q);
        if (!com.mbridge.msdk.util.b.a() || (list = this.f16880z) == null || list.size() <= 0 || this.f16880z.get(0) == null) {
            return;
        }
        d(this.f16880z.get(0));
    }

    private void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.isActiveOm() && this.S == null) {
                    o5.b bVarA = com.mbridge.msdk.omsdk.b.a(getApplicationContext(), false, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f16861g, campaignEx.getVideoUrlEncode(), campaignEx.getRequestIdNotice());
                    this.S = bVarA;
                    if (bVarA != null) {
                        this.U = o5.a.a(bVarA);
                        this.T = com.iab.omid.library.mmadbridge.adsession.media.a.g(this.S);
                    }
                }
            } catch (Throwable th) {
                q0.b("MBRewardVideoActivity", th.getMessage());
            }
        }
    }

    public class b implements com.mbridge.msdk.video.dynview.listener.d {
        public b() {
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a(CampaignEx campaignEx) {
            if (campaignEx == null) {
                MBRewardVideoActivity.this.b("campaign is null");
                return;
            }
            if (MBRewardVideoActivity.this.B != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.B, 500L);
            }
            MBRewardVideoActivity.this.f16878x = campaignEx;
            MBRewardVideoActivity.this.f16878x.setShowType(2);
            MBRewardVideoActivity mBRewardVideoActivity = MBRewardVideoActivity.this;
            mBRewardVideoActivity.c(mBRewardVideoActivity.f16878x);
        }

        @Override // com.mbridge.msdk.video.dynview.listener.d
        public void a() throws JSONException {
            if (MBRewardVideoActivity.this.B != null) {
                new com.mbridge.msdk.video.dynview.ui.b().b(MBRewardVideoActivity.this.B, 500L);
            }
            MBRewardVideoActivity.this.f16871q = true;
            MBRewardVideoActivity.this.j();
            if (MBRewardVideoActivity.this.A != null) {
                MBRewardVideoActivity.this.A.setNotchPadding(MBRewardVideoActivity.this.N, MBRewardVideoActivity.this.J, MBRewardVideoActivity.this.L, MBRewardVideoActivity.this.K, MBRewardVideoActivity.this.M);
            }
        }
    }

    private WindVaneWebView a(String str) {
        a.C0347a c0347aB = com.mbridge.msdk.videocommon.a.b(str);
        if (c0347aB != null) {
            return c0347aB.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i10, int i11) {
        List<CampaignEx> list = this.f16880z;
        if (list != null && list.size() != 0) {
            int videoLength = 0;
            int videoCompleteTime = 0;
            for (int i12 = 0; i12 < this.f16880z.size(); i12++) {
                if (this.f16880z.get(0) != null) {
                    if (i12 == 0) {
                        videoCompleteTime = this.f16880z.get(0).getVideoCompleteTime();
                    }
                    videoLength += this.f16880z.get(i12).getVideoLength();
                }
            }
            if (i11 == 1) {
                if (i10 == 0) {
                    if (videoLength >= 45) {
                        return 45;
                    }
                } else if (videoLength > i10) {
                    if (i10 > 45) {
                        return 45;
                    }
                }
                return videoLength;
            }
            int videoLength2 = 0;
            for (int i13 = 0; i13 < i11 - 1; i13++) {
                if (this.f16880z.get(i13) != null) {
                    videoLength2 += this.f16880z.get(i13).getVideoLength();
                }
            }
            if (videoCompleteTime > videoLength2) {
                return videoCompleteTime - videoLength2;
            }
            return 0;
        }
        return i10;
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            int iA = a(campaignEx.getVideoCompleteTime(), this.H);
            this.f16878x = campaignEx;
            campaignEx.setCampaignIsFiltered(true);
            this.H = 1;
            this.f16878x.setVideoCompleteTime(iA);
            this.f16878x.setShowIndex(this.H);
            this.f16878x.setShowType(1);
            c(this.f16878x);
            return;
        }
        b("campaign is less");
    }

    private void b(List<CampaignEx> list) {
        int dynamicTempCode;
        if (list == null) {
            b("no available campaign");
            return;
        }
        if (list.size() == 0) {
            b("no available campaign");
            return;
        }
        if (list.get(0) != null) {
            dynamicTempCode = list.get(0).getDynamicTempCode();
            this.O = list.get(0).getCurrentLocalRid();
        } else {
            dynamicTempCode = 0;
        }
        if (dynamicTempCode != 5) {
            k();
            return;
        }
        for (CampaignEx campaignEx : list) {
            if (campaignEx != null) {
                this.I += campaignEx.getVideoLength();
            }
        }
        e(list.get(0));
    }

    private void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (!TextUtils.isEmpty(campaignEx.getImageUrl())) {
                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getImageUrl());
            }
            if (TextUtils.isEmpty(campaignEx.getIconUrl())) {
                return;
            }
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getIconUrl());
        }
    }

    private void a(List<CampaignEx> list) {
        CampaignEx campaignEx;
        if (this.R) {
            return;
        }
        if (list == null) {
            try {
                if (this.f16871q) {
                    list = this.f16880z;
                } else {
                    list = new ArrayList<>();
                    List<com.mbridge.msdk.videocommon.download.a> list2 = this.f16879y;
                    if (list2 != null && list2.get(0) != null && this.f16879y.get(0).h() != null) {
                        list.add(this.f16879y.get(0).h());
                    }
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                    return;
                }
                return;
            }
        }
        String currentLocalRid = "";
        if (list != null && !list.isEmpty() && (campaignEx = list.get(0)) != null) {
            currentLocalRid = campaignEx.getCurrentLocalRid();
        }
        if (!TextUtils.isEmpty(currentLocalRid)) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("context_status", Integer.valueOf(this.f16857c0));
            eVar.a("activity_name", this.f16858d0);
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
            this.P = cVarB;
            cVarB.a("2000129", eVar);
        }
        if (this.P == null) {
            this.P = new com.mbridge.msdk.foundation.same.report.metrics.c();
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16861g);
            eVar2.a(CampaignEx.JSON_KEY_HB, Integer.valueOf(this.f16867m ? 1 : 0));
            eVar2.a("adtp", Integer.valueOf(this.f16866l ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94));
            eVar2.a("lrid", this.O);
            eVar2.a("his_reason", "show campaign is null");
            eVar2.a("context_status", Integer.valueOf(this.f16857c0));
            eVar2.a("activity_name", this.f16858d0);
            this.P.a("2000129", eVar2);
        }
        if (list != null) {
            this.P.b(list);
        }
        this.R = true;
        com.mbridge.msdk.reward.report.metrics.a.a().a("2000129", this.P);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        q0.b("MBRewardVideoActivity", str);
        a(this.f16880z);
        h hVar = this.f16873s;
        if (hVar != null) {
            hVar.a(this.P, str);
        }
        finish();
    }
}
