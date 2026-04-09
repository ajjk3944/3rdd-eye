package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.mbnative.controller.c;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.core.fid.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class NativeController extends com.mbridge.msdk.mbnative.controller.a {

    /* renamed from: c0, reason: collision with root package name */
    private static final String f15940c0 = "NativeController";

    /* renamed from: d0, reason: collision with root package name */
    public static Map<String, Long> f15941d0 = new HashMap();

    /* renamed from: e0, reason: collision with root package name */
    private static boolean f15942e0;
    private int A;
    private int B;
    private com.mbridge.msdk.foundation.same.task.b C;
    private List<com.mbridge.msdk.mbnative.controller.c> D;
    private List<c.d> E;
    private CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.task.a> F;
    private Hashtable<String, o5.b> G;
    private int H;
    private int I;
    private n J;
    private boolean K;
    private boolean L;
    private Timer M;
    private String N;
    private String O;
    private ViewTreeObserver.OnGlobalLayoutListener P;
    private com.mbridge.msdk.setting.l Q;
    private long R;
    private int S;
    private int T;
    private boolean U;
    private int V;
    private int W;
    private boolean X;
    private List<Campaign> Y;
    private String Z;

    /* renamed from: a0, reason: collision with root package name */
    private o5.b f15943a0;

    /* renamed from: b, reason: collision with root package name */
    protected List<Integer> f15944b;

    /* renamed from: b0, reason: collision with root package name */
    private o5.a f15945b0;

    /* renamed from: c, reason: collision with root package name */
    protected List<Integer> f15946c;

    /* renamed from: d, reason: collision with root package name */
    Map<String, Object> f15947d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.setting.j f15948e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.mbnative.listener.a f15949f;

    /* renamed from: g, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f15950g;

    /* renamed from: h, reason: collision with root package name */
    private Context f15951h;

    /* renamed from: i, reason: collision with root package name */
    private String f15952i;

    /* renamed from: j, reason: collision with root package name */
    private String f15953j;

    /* renamed from: k, reason: collision with root package name */
    private Queue<Integer> f15954k;

    /* renamed from: l, reason: collision with root package name */
    private Queue<Long> f15955l;

    /* renamed from: m, reason: collision with root package name */
    private String f15956m;

    /* renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.h f15957n;

    /* renamed from: o, reason: collision with root package name */
    private String f15958o;

    /* renamed from: p, reason: collision with root package name */
    private com.mbridge.msdk.click.a f15959p;

    /* renamed from: q, reason: collision with root package name */
    private int f15960q;

    /* renamed from: r, reason: collision with root package name */
    private int f15961r;

    /* renamed from: s, reason: collision with root package name */
    private int f15962s;

    /* renamed from: t, reason: collision with root package name */
    private int f15963t;

    /* renamed from: u, reason: collision with root package name */
    private String f15964u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f15965v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f15966w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f15967x;

    /* renamed from: y, reason: collision with root package name */
    private int f15968y;

    /* renamed from: z, reason: collision with root package name */
    private int f15969z;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f15970a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ NativeListener.NativeAdListener f15971b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f15972c;

        public a(List list, NativeListener.NativeAdListener nativeAdListener, int i10) {
            this.f15970a = list;
            this.f15971b = nativeAdListener;
            this.f15972c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.f15970a;
            if (list != null && list.size() > 0) {
                CampaignEx campaignEx = (CampaignEx) this.f15970a.get(0);
                NativeController.this.O = campaignEx.getRequestId();
                NativeController.this.Y = this.f15970a;
            }
            NativeController.this.f15965v = true;
            this.f15971b.onAdLoaded(this.f15970a, this.f15972c);
            com.mbridge.msdk.mbnative.report.a.a(NativeController.this.f15951h, (List<Campaign>) this.f15970a, NativeController.this.f15952i);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f15974a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15975b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f15976c;

        public b(com.mbridge.msdk.mbnative.listener.a aVar, CampaignEx campaignEx, String str) {
            this.f15974a = aVar;
            this.f15975b = campaignEx;
            this.f15976c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15974a.a(this.f15975b, this.f15976c);
        }
    }

    public class c implements com.mbridge.msdk.foundation.same.image.c {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
        }
    }

    public class d extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f15979a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f15980b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f15981c;

        public d(long j10, o oVar, List list) {
            this.f15979a = j10;
            this.f15980b = oVar;
            this.f15981c = list;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            boolean z10;
            if (System.currentTimeMillis() - this.f15979a >= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                this.f15980b.a();
                NativeController.this.c();
                return;
            }
            int iS = m0.s(NativeController.this.f15951h);
            int iQ = NativeController.this.h().q();
            if (iS != 9 && iQ == 2) {
                this.f15980b.a();
                NativeController.this.c();
                return;
            }
            if (iQ == 3) {
                this.f15980b.a();
                NativeController.this.c();
                return;
            }
            loop0: while (true) {
                z10 = false;
                for (Campaign campaign : this.f15981c) {
                    String id = campaign.getId();
                    if (campaign instanceof CampaignEx) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(id);
                        CampaignEx campaignEx = (CampaignEx) campaign;
                        sb.append(campaignEx.getVideoUrlEncode());
                        sb.append(campaignEx.getBidToken());
                        id = sb.toString();
                    }
                    com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(NativeController.this.f15952i, id);
                    if (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, NativeController.this.h().C())) {
                        break;
                    } else {
                        z10 = true;
                    }
                }
            }
            if (z10) {
                this.f15980b.a();
                NativeController.this.c();
            }
        }
    }

    public class e implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ImageView f15983a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f15984b;

        public e(ImageView imageView, View view) {
            this.f15983a = imageView;
            this.f15984b = view;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.f15983a != null) {
                this.f15983a.setLayoutParams(new FrameLayout.LayoutParams(this.f15984b.getWidth(), this.f15984b.getHeight()));
            }
        }
    }

    public class f extends com.mbridge.msdk.widget.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15986b;

        public f(CampaignEx campaignEx) {
            this.f15986b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f15986b);
        }
    }

    public class g extends com.mbridge.msdk.widget.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15988b;

        public g(CampaignEx campaignEx) {
            this.f15988b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f15988b);
        }
    }

    public class h implements com.mbridge.msdk.widget.dialog.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15990a;

        public h(CampaignEx campaignEx) {
            this.f15990a = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            NativeController.this.f15959p.a(this.f15990a, NativeController.this.f15949f);
            NativeController.this.b(this.f15990a);
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
        }
    }

    public class i extends com.mbridge.msdk.widget.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15992b;

        public i(CampaignEx campaignEx) {
            this.f15992b = campaignEx;
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            NativeController.this.b(view.getContext(), this.f15992b);
        }
    }

    public class j implements a.InterfaceC0267a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f15994a;

        public j(s sVar) {
            this.f15994a = sVar;
        }

        @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0267a
        public void a(a.b bVar) {
            if (bVar != a.b.FINISH || NativeController.this.F == null || NativeController.this.F.size() <= 0 || !NativeController.this.F.contains(this.f15994a)) {
                return;
            }
            NativeController.this.F.remove(this.f15994a);
        }
    }

    public class k implements c.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f15996a;

        public k(CampaignEx campaignEx) {
            this.f15996a = campaignEx;
        }

        @Override // com.mbridge.msdk.mbnative.controller.c.d
        public void a(ArrayList<View> arrayList, ArrayList<View> arrayList2) {
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            com.mbridge.msdk.mbnative.report.b.a(this.f15996a, NativeController.this.f15951h, NativeController.this.f15952i, NativeController.this.f15949f);
        }
    }

    public class l implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f15998a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f15999b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f16000c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f16001d;

        public l(List list, int i10, com.mbridge.msdk.mbnative.listener.a aVar, List list2) {
            this.f15998a = list;
            this.f15999b = i10;
            this.f16000c = aVar;
            this.f16001d = list2;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.o
        public void a() {
            List listA = NativeController.this.a((List<Campaign>) this.f15998a, true);
            if (listA == null || listA.size() <= 0) {
                NativeController.this.a(this.f16000c, "has no ads", (CampaignEx) this.f16001d.get(0));
            } else {
                NativeController.this.a((List<Campaign>) listA, this.f15999b, this.f16000c);
            }
        }
    }

    public class m implements o {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f16003a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f16004b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbnative.listener.a f16005c;

        public m(List list, int i10, com.mbridge.msdk.mbnative.listener.a aVar) {
            this.f16003a = list;
            this.f16004b = i10;
            this.f16005c = aVar;
        }

        @Override // com.mbridge.msdk.mbnative.controller.NativeController.o
        public void a() {
            List listA = NativeController.this.a((List<Campaign>) this.f16003a, false);
            if (listA == null || listA.size() <= 0) {
                NativeController.this.a(this.f16005c, "has no ads", (CampaignEx) null);
            } else {
                NativeController.this.a((List<Campaign>) listA, this.f16004b, this.f16005c);
            }
        }
    }

    public class n extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {

        /* renamed from: d, reason: collision with root package name */
        private Runnable f16008d;

        /* renamed from: c, reason: collision with root package name */
        private boolean f16007c = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f16009e = true;

        /* renamed from: f, reason: collision with root package name */
        private List<String> f16010f = null;

        public class a extends c.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f16012a;

            public a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f16012a = campaignEx;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f16012a, NativeController.this.f15951h, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        public n() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z10) {
            this.f16007c = z10;
        }

        public void b(boolean z10) {
            this.f16009e = z10;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<com.mbridge.msdk.tracker.network.g> list, CampaignUnit campaignUnit) {
            Integer num;
            boolean z10 = true;
            NativeController.this.U = true;
            com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(NativeController.this.f15951h));
            jVarA.d();
            Runnable runnable = this.f16008d;
            if (runnable != null) {
                NativeController.this.f16033a.removeCallbacks(runnable);
            }
            if (com.mbridge.msdk.util.b.a()) {
                NativeController.this.a(campaignUnit);
            }
            if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                this.unitId = "0_" + this.unitId;
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f15962s, this.unitId);
                NativeController.this.f15963t = 0;
                return;
            }
            NativeController.this.f15958o = campaignUnit.getSessionId();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i10 = 2;
            if (NativeController.this.S <= 0) {
                if (NativeController.this.S == -3) {
                    NativeController.this.S = campaignUnit.getAds().size();
                } else {
                    NativeController nativeController = NativeController.this;
                    nativeController.S = nativeController.f15961r;
                }
                if (NativeController.this.V != 0 && campaignUnit.getTemplate() == 2) {
                    NativeController nativeController2 = NativeController.this;
                    nativeController2.S = nativeController2.V;
                }
                if (NativeController.this.W != 0 && campaignUnit.getTemplate() == 3) {
                    NativeController nativeController3 = NativeController.this;
                    nativeController3.S = nativeController3.W;
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 42);
            if (TextUtils.isEmpty(b())) {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, b(), eVar, campaignUnit.getAds().get(0), this.unitId);
            int i11 = 0;
            while (i11 < campaignUnit.getAds().size()) {
                CampaignEx campaignEx = campaignUnit.getAds().get(i11);
                campaignEx.setLocalRequestId(cVarA.t());
                campaignEx.setCampaignUnitId(this.unitId);
                if (!TextUtils.isEmpty(NativeController.this.N)) {
                    campaignEx.setBidToken(NativeController.this.N);
                    campaignEx.setIsBidCampaign(z10);
                }
                if (NativeController.f15942e0) {
                    campaignEx.loadIconUrlAsyncWithBlock(null);
                    campaignEx.loadImageUrlAsyncWithBlock(null);
                }
                boolean zC = v0.c(NativeController.this.f15951h, campaignEx.getPackageName());
                NativeController nativeController4 = NativeController.this;
                nativeController4.a(nativeController4.f15951h, campaignEx);
                if (i11 < NativeController.this.f15961r && campaignEx.getOfferType() != 99) {
                    if (v0.c(campaignEx)) {
                        campaignEx.setRtinsType(zC ? 1 : i10);
                    }
                    if (com.mbridge.msdk.foundation.same.c.b(NativeController.this.f15951h, campaignEx)) {
                        arrayList.add(campaignEx);
                        if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                            arrayList3.add(campaignEx);
                        }
                    } else {
                        v0.a(this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.f15049x);
                        NativeController.this.Z = "APP ALREADY INSTALLED";
                    }
                    a(campaignEx, null, null);
                }
                if (i11 < NativeController.this.S && campaignEx.getOfferType() != 99) {
                    if (v0.c(campaignEx)) {
                        campaignEx.setRtinsType(zC ? 1 : 2);
                    }
                    if (!zC || v0.c(campaignEx)) {
                        arrayList2.add(campaignEx);
                    }
                }
                if (!jVarA.a(campaignEx.getId())) {
                    com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                    gVar.a(campaignEx.getId());
                    gVar.b(campaignEx.getFca());
                    gVar.c(campaignEx.getFcb());
                    gVar.a(0);
                    gVar.d(0);
                    gVar.a(System.currentTimeMillis());
                    jVarA.b(gVar);
                }
                com.mbridge.msdk.click.c.a(NativeController.this.f15951h, campaignEx.getMaitve(), campaignEx.getMaitve_src());
                i11++;
                z10 = true;
                i10 = 2;
            }
            NativeController.this.d(arrayList3);
            int type = campaignUnit.getAds().get(0) != null ? campaignUnit.getAds().get(0).getType() : 1;
            com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(type);
            if (bVarA != null) {
                bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) this.unitId, (String) arrayList2, NativeController.this.N);
            }
            if (arrayList.size() == 0) {
                if (NativeController.this.Z.contains("INSTALLED")) {
                    NativeController.this.a("APP ALREADY INSTALLED", a(), b(), campaignUnit.getAds().get(0));
                    new com.mbridge.msdk.foundation.error.b(880021, "APP ALREADY INSTALLED");
                    return;
                } else {
                    NativeController.this.a("v3 response error", a(), b(), campaignUnit.getAds().get(0));
                    new com.mbridge.msdk.foundation.error.b(880003);
                    return;
                }
            }
            NativeController nativeController5 = NativeController.this;
            nativeController5.c((List<Campaign>) nativeController5.a(type, (List<Campaign>) nativeController5.a(arrayList)));
            if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.unitId) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.unitId))) {
                com.mbridge.msdk.mbnative.controller.d.a(NativeController.this.f15962s, this.unitId);
                return;
            }
            int iIntValue = (!com.mbridge.msdk.mbnative.controller.d.d().containsKey(this.unitId) || (num = com.mbridge.msdk.mbnative.controller.d.d().get(this.unitId)) == null) ? 1 : num.intValue();
            int i12 = NativeController.this.f15961r + NativeController.this.f15963t;
            NativeController.this.f15963t = i12 <= iIntValue ? i12 : 0;
        }

        public void b(List<String> list) {
            this.f16010f = list;
        }

        private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                com.mbridge.msdk.foundation.same.c.a(campaignEx, NativeController.this.f15951h, cVar, new a(campaignEx, aVar));
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i10, String str) {
            NativeController.this.U = true;
            if (this.f16007c) {
                if (NativeController.this.f15965v || !this.f16009e) {
                    return;
                }
                NativeController.this.a(str, a(), b(), (CampaignEx) null);
                return;
            }
            if (i10 == -1) {
                com.mbridge.msdk.mbnative.controller.d.b(NativeController.this.f15962s, this.unitId);
                NativeController.this.f15963t = 0;
            }
            Runnable runnable = this.f16008d;
            if (runnable != null) {
                NativeController.this.f16033a.removeCallbacks(runnable);
            }
            if (NativeController.this.f15965v) {
                return;
            }
            if (a() == 1 || this.f16009e) {
                NativeController.this.a(str, a(), b(), (CampaignEx) null);
            }
        }

        public void a(Runnable runnable) {
            this.f16008d = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            if (this.f16007c) {
                return;
            }
            Runnable runnable = this.f16008d;
            if (runnable != null) {
                NativeController.this.f16033a.removeCallbacks(runnable);
            }
            if (list == null || list.size() == 0) {
                if (NativeController.this.f15949f != null) {
                    NativeController.this.f15965v = true;
                    NativeController.this.f15949f.onAdLoadError("frame is empty");
                    return;
                }
                return;
            }
            Iterator<Frame> it = list.iterator();
            while (it.hasNext()) {
                List<CampaignEx> campaigns = it.next().getCampaigns();
                if (campaigns == null || campaigns.size() == 0) {
                    if (NativeController.this.f15949f != null) {
                        NativeController.this.f15965v = true;
                        NativeController.this.f15949f.onAdLoadError("ads in frame is empty");
                        return;
                    }
                    return;
                }
                for (CampaignEx campaignEx : campaigns) {
                    if (NativeController.f15942e0) {
                        campaignEx.loadImageUrlAsyncWithBlock(null);
                        campaignEx.loadIconUrlAsyncWithBlock(null);
                    }
                }
            }
            if (NativeController.this.f15949f != null) {
                NativeController.this.f15949f.onAdFramesLoaded(list);
            }
        }
    }

    public interface o {
        void a();
    }

    public class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private int f16014a;

        /* renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.task.d f16015b;

        /* renamed from: c, reason: collision with root package name */
        private int f16016c;

        /* renamed from: d, reason: collision with root package name */
        private String f16017d;

        public p(int i10, com.mbridge.msdk.foundation.same.task.d dVar, int i11, String str) {
            this.f16014a = i10;
            this.f16015b = dVar;
            this.f16016c = i11;
            this.f16017d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f16015b.a(true);
            int i10 = this.f16014a;
            if (i10 == 1) {
                NativeController.this.U = true;
                NativeController.this.a("REQUEST_TIMEOUT", this.f16016c, this.f16017d, (CampaignEx) null);
            } else {
                if (i10 != 2) {
                    return;
                }
                if (!NativeController.this.f15965v || this.f16016c == 1) {
                    NativeController.this.a("REQUEST_TIMEOUT", this.f16016c, this.f16017d, (CampaignEx) null);
                }
            }
        }
    }

    public static class q implements H5DownLoadManager.IH5SourceDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        private String f16019a;

        /* renamed from: b, reason: collision with root package name */
        private CampaignEx f16020b;

        /* renamed from: c, reason: collision with root package name */
        private long f16021c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private boolean f16022d;

        public q(String str, CampaignEx campaignEx, boolean z10) {
            this.f16022d = true;
            this.f16019a = str;
            this.f16020b = campaignEx;
            this.f16022d = z10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            try {
                if (this.f16022d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f16021c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 3, jCurrentTimeMillis + "", str, this.f16020b.getId(), this.f16019a, str2, "2");
                    nVar.n(this.f16020b.getRequestId());
                    nVar.k(this.f16020b.getCurrentLocalRid());
                    nVar.o(this.f16020b.getRequestIdNotice());
                    CampaignEx campaignEx = this.f16020b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f16020b.getId());
                    }
                    CampaignEx campaignEx2 = this.f16020b;
                    if (campaignEx2 != null) {
                        nVar.a(campaignEx2.getAdSpaceT());
                    }
                    nVar.a("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f16019a, this.f16020b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f15940c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                if (this.f16022d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f16021c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 1, jCurrentTimeMillis + "", str, this.f16020b.getId(), this.f16019a, "", "2");
                    CampaignEx campaignEx = this.f16020b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f16020b.getId());
                    }
                    CampaignEx campaignEx2 = this.f16020b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.o(this.f16020b.getRequestIdNotice());
                        nVar.k(this.f16020b.getCurrentLocalRid());
                        nVar.a(this.f16020b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.q(str2);
                    }
                    nVar.a("1");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f16019a, this.f16020b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f15940c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    public static class r extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<NativeController> f16023a;

        public r(NativeController nativeController) {
            this.f16023a = new WeakReference<>(nativeController);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<NativeController> weakReference;
            NativeController nativeController;
            super.handleMessage(message);
            try {
                if (message.what == 0 && (weakReference = this.f16023a) != null && (nativeController = weakReference.get()) != null) {
                    nativeController.f15957n.a(message.arg1, (String) message.obj);
                }
                if (message.what == 1) {
                    WeakReference<NativeController> weakReference2 = this.f16023a;
                    NativeController nativeController2 = (weakReference2 == null || weakReference2.get() == null) ? null : this.f16023a.get();
                    if (nativeController2 != null) {
                        nativeController2.f15966w = true;
                        List<Campaign> listA = nativeController2.a(nativeController2.f15952i, nativeController2.f15961r, nativeController2.N);
                        if (nativeController2.f15965v) {
                            return;
                        }
                        nativeController2.c(listA);
                    }
                }
            } catch (Exception e10) {
                q0.b(NativeController.f15940c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    public static class s extends com.mbridge.msdk.foundation.same.task.a {

        /* renamed from: a, reason: collision with root package name */
        private CampaignEx f16024a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<View> f16025b;

        /* renamed from: c, reason: collision with root package name */
        private WeakReference<List<View>> f16026c;

        /* renamed from: d, reason: collision with root package name */
        private WeakReference<NativeController> f16027d;

        /* renamed from: e, reason: collision with root package name */
        private WeakReference<o5.b> f16028e;

        public s(CampaignEx campaignEx, View view, List<View> list, NativeController nativeController, o5.b bVar) {
            this.f16024a = campaignEx;
            this.f16025b = new WeakReference<>(view);
            this.f16026c = new WeakReference<>(list);
            this.f16027d = new WeakReference<>(nativeController);
            this.f16028e = new WeakReference<>(bVar);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            WeakReference<View> weakReference;
            try {
                if (this.f16027d == null || (weakReference = this.f16025b) == null || this.f16026c == null) {
                    return;
                }
                View view = weakReference.get();
                List<View> list = this.f16026c.get();
                NativeController nativeController = this.f16027d.get();
                WeakReference<o5.b> weakReference2 = this.f16028e;
                o5.b bVar = weakReference2 != null ? weakReference2.get() : null;
                if (view == null || nativeController == null) {
                    return;
                }
                nativeController.a(this.f16024a, view, list, bVar);
            } catch (Exception e10) {
                q0.b(NativeController.f15940c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    public static final class t implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        String f16029a;

        /* renamed from: b, reason: collision with root package name */
        CampaignEx f16030b;

        /* renamed from: c, reason: collision with root package name */
        private long f16031c = System.currentTimeMillis();

        /* renamed from: d, reason: collision with root package name */
        private boolean f16032d;

        public t(String str, CampaignEx campaignEx, boolean z10) {
            this.f16032d = true;
            this.f16029a = str;
            this.f16030b = campaignEx;
            this.f16032d = z10;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            try {
                if (this.f16032d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f16031c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 3, jCurrentTimeMillis + "", str2, this.f16030b.getId(), this.f16029a, str, "1");
                    CampaignEx campaignEx = this.f16030b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f16030b.getId());
                    }
                    CampaignEx campaignEx2 = this.f16030b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.k(this.f16030b.getCurrentLocalRid());
                        nVar.o(this.f16030b.getRequestIdNotice());
                        nVar.a(this.f16030b.getAdSpaceT());
                    }
                    nVar.a("2");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f16029a, this.f16030b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f15940c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                if (this.f16032d) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.f16031c;
                    com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("2000043", 1, jCurrentTimeMillis + "", str, this.f16030b.getId(), this.f16029a, "", "1");
                    CampaignEx campaignEx = this.f16030b;
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getId())) {
                        nVar.b(this.f16030b.getId());
                    }
                    CampaignEx campaignEx2 = this.f16030b;
                    if (campaignEx2 != null) {
                        nVar.n(campaignEx2.getRequestId());
                        nVar.k(this.f16030b.getCurrentLocalRid());
                        nVar.o(this.f16030b.getRequestIdNotice());
                        nVar.a(this.f16030b.getAdSpaceT());
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        nVar.q(str2);
                    }
                    nVar.a("2");
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, this.f16029a, this.f16030b);
                }
            } catch (Exception e10) {
                q0.b(NativeController.f15940c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            }
        }
    }

    public NativeController(com.mbridge.msdk.mbnative.listener.a aVar, NativeListener.NativeTrackingListener nativeTrackingListener, Map<String, Object> map, Context context) {
        int iIntValue;
        Object obj;
        this.f15960q = 1;
        this.f15961r = 1;
        this.f15962s = -1;
        this.f15963t = 0;
        this.f15965v = false;
        this.f15966w = false;
        this.f15967x = false;
        this.f15968y = 0;
        this.f15969z = 0;
        this.A = 0;
        this.B = 0;
        this.F = new CopyOnWriteArrayList<>();
        this.G = new Hashtable<>();
        this.H = 1;
        this.I = 2;
        this.N = "";
        this.O = "";
        this.Z = "";
        this.f15951h = context;
        this.f15947d = map;
        this.f15948e = new com.mbridge.msdk.setting.j();
        this.f15949f = aVar;
        this.f15950g = nativeTrackingListener;
        this.D = new ArrayList();
        this.E = new ArrayList();
        String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        this.f15952i = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!map.containsKey(MBridgeConstans.PLACEMENT_ID) || map.get(MBridgeConstans.PLACEMENT_ID) == null) {
            this.f15953j = "";
        } else {
            this.f15953j = (String) map.get(MBridgeConstans.PLACEMENT_ID);
        }
        if (map.containsKey(MBridgeConstans.PREIMAGE) && (obj = map.get(MBridgeConstans.PREIMAGE)) != null) {
            f15942e0 = ((Boolean) obj).booleanValue();
        }
        this.f15954k = new LinkedList();
        this.f15955l = new LinkedList();
        this.C = new com.mbridge.msdk.foundation.same.task.b(this.f15951h);
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f16033a = new r(this);
        if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
            this.f15964u = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
        }
        try {
            boolean zEquals = com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f15952i) ? Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f15952i)) : false;
            Object obj2 = map.get("ad_num");
            Object obj3 = map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM);
            if (!zEquals) {
                if (map.containsKey("ad_num") && obj2 != null) {
                    try {
                        iIntValue = ((Integer) obj2).intValue();
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b(f15940c0, e10.getMessage());
                        }
                        iIntValue = 1;
                    }
                    iIntValue = iIntValue < 1 ? 1 : iIntValue;
                    iIntValue = iIntValue > 10 ? 10 : iIntValue;
                    this.f15961r = iIntValue;
                    this.f15960q = iIntValue;
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                    try {
                        this.A = ((Integer) obj3).intValue();
                    } catch (Exception e11) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b(f15940c0, e11.getMessage());
                        }
                    }
                }
            } else if (com.mbridge.msdk.mbnative.controller.d.c().containsKey(this.f15952i)) {
                Integer num = com.mbridge.msdk.mbnative.controller.d.c().get(this.f15952i);
                if (num != null) {
                    this.f15961r = num.intValue();
                }
                if (map.containsKey("ad_num") && obj2 != null) {
                    int iIntValue2 = ((Integer) obj2).intValue();
                    this.f15968y = iIntValue2;
                    this.f15960q = iIntValue2;
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM) && obj3 != null) {
                    int iIntValue3 = ((Integer) obj3).intValue();
                    this.f15969z = iIntValue3;
                    this.A = iIntValue3;
                }
            }
        } catch (Exception e12) {
            q0.b(f15940c0, com.mbridge.msdk.mbnative.common.a.a(e12));
        }
        this.f15957n = new com.mbridge.msdk.foundation.same.report.h(this.f15951h);
        this.f15959p = new com.mbridge.msdk.click.a(this.f15951h, this.f15952i);
        try {
            int i10 = MBMediaView.f16359p0;
            this.L = true;
            Map<String, Object> map2 = this.f15947d;
            if (map2 != null && (map2.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) || this.f15947d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) || map.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT))) {
                this.K = true;
            }
            com.mbridge.msdk.mbnative.controller.e.a(this.f15951h, this.f15952i);
            o0.a();
            if (TextUtils.isEmpty(this.f15952i)) {
                return;
            }
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f15951h)).d();
            int iA = a(map.containsKey(MBridgeConstans.NATIVE_INFO) ? (String) map.get(MBridgeConstans.NATIVE_INFO) : null);
            List<Campaign> listA = a(this.f15952i, iA <= 0 ? this.f15960q : iA);
            if (listA != null) {
                ArrayList arrayList = new ArrayList();
                for (int i11 = 0; i11 < listA.size(); i11++) {
                    CampaignEx campaignEx = (CampaignEx) listA.get(i11);
                    if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        arrayList.add(campaignEx);
                    }
                }
                if (arrayList.size() > 0) {
                    Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, context, this.f15952i, new CopyOnWriteArrayList(arrayList), 1, null);
                    com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, this.f15952i);
                }
            }
        } catch (Throwable unused) {
            q0.b(f15940c0, "please import the nativex aar");
        }
    }

    private List<Campaign> e(List<Campaign> list) {
        if (list != null) {
            CampaignEx campaignEx = null;
            for (int size = list.size() - 1; size >= 0; size--) {
                try {
                    campaignEx = (CampaignEx) list.get(size);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                    Campaign campaignRemove = list.remove(size);
                    com.mbridge.msdk.mbnative.cache.c.a(campaignEx.getType()).a(this.f15952i, campaignRemove, this.N);
                    q0.a(f15940c0, "remove no videoURL ads:" + campaignRemove);
                }
            }
        }
        return list;
    }

    private void f() throws JSONException {
        try {
            if (this.f15956m == null) {
                return;
            }
            JSONArray jSONArray = new JSONArray(this.f15956m);
            if (jSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                    int iOptInt = jSONObject.optInt("id", 0);
                    if (2 == iOptInt) {
                        this.V = jSONObject.optInt("ad_num");
                        if (this.T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.T);
                        }
                    } else if (3 == iOptInt) {
                        this.W = jSONObject.optInt("ad_num");
                        if (this.T > 0) {
                            jSONObject.remove("ad_num");
                            jSONObject.put("ad_num", this.T);
                        }
                    }
                }
            }
            this.H = Math.max(this.V, this.W);
            this.f15956m = jSONArray.toString();
        } catch (JSONException e10) {
            q0.b(f15940c0, com.mbridge.msdk.mbnative.common.a.a(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.setting.l h() {
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e("", this.f15952i);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(this.f15952i);
        }
        return this.Q;
    }

    public String g() {
        return this.O;
    }

    public void i() {
        com.mbridge.msdk.foundation.same.task.a next;
        com.mbridge.msdk.foundation.same.task.b bVar = this.C;
        if (bVar != null) {
            bVar.a();
            this.C = null;
        }
        Hashtable<String, o5.b> hashtable = this.G;
        if (hashtable != null) {
            for (o5.b bVar2 : hashtable.values()) {
                if (bVar2 != null) {
                    bVar2.c();
                }
            }
            this.G.clear();
        }
        Handler handler = this.f16033a;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        this.f15950g = null;
        this.f15959p.c();
        try {
            Context context = this.f15951h;
            if (context != null) {
                com.mbridge.msdk.foundation.same.image.b.a(context).b();
            }
            List<com.mbridge.msdk.mbnative.controller.c> list = this.D;
            if (list != null && list.size() > 0) {
                Iterator<com.mbridge.msdk.mbnative.controller.c> it = this.D.iterator();
                while (it.hasNext()) {
                    it.next().a();
                }
                this.D.clear();
                this.D = null;
            }
            List<c.d> list2 = this.E;
            if (list2 != null && list2.size() > 0) {
                for (c.d dVar : this.E) {
                }
                this.E.clear();
                this.E = null;
            }
            CopyOnWriteArrayList<com.mbridge.msdk.foundation.same.task.a> copyOnWriteArrayList = this.F;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return;
            }
            Iterator<com.mbridge.msdk.foundation.same.task.a> it2 = this.F.iterator();
            if (it2.hasNext() && (next = it2.next()) != null) {
                next.cancel();
                this.f16033a.removeCallbacks(next);
            }
            this.F.clear();
        } catch (Exception unused) {
        }
    }

    public void j() {
        List<Integer> list = this.f15944b;
        if (list != null && list.size() > 0) {
            Queue<Integer> queue = this.f15954k;
            if (queue != null && queue.size() > 0) {
                this.f15954k.clear();
            }
            for (Integer num : this.f15944b) {
                Queue<Integer> queue2 = this.f15954k;
                if (queue2 != null) {
                    queue2.add(num);
                }
            }
        }
        List<Integer> list2 = this.f15946c;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        Queue<Long> queue3 = this.f15955l;
        if (queue3 != null && queue3.size() > 0) {
            this.f15955l.clear();
        }
        for (Integer num2 : this.f15946c) {
            Queue<Long> queue4 = this.f15955l;
            if (queue4 != null) {
                queue4.add(Long.valueOf(num2.intValue() * 1000));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i10 = MBMediaView.f16359p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod(Constants.GET_INSTANCE, null).invoke(null, null);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, this.f15951h, this.f15952i, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, this.f15952i);
                        }
                        Iterator<CampaignEx> it = list.iterator();
                        while (it.hasNext()) {
                            CampaignEx next = it.next();
                            if (next != null && !TextUtils.isEmpty(next.getImageUrl())) {
                                com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(next.getImageUrl(), new c());
                            }
                            String str = "";
                            if (next != null) {
                                try {
                                    str = next.getendcard_url();
                                } catch (Exception unused) {
                                }
                            }
                            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            cVar.a(next);
                            if (!TextUtils.isEmpty(str)) {
                                cVar.f((next == null || next.getAabEntity() == null) ? 0 : next.getAabEntity().h3c);
                                if (str.contains(".zip") && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, str, new t(this.f15952i, next, TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str))));
                                } else {
                                    H5DownLoadManager.getInstance().downloadH5Res(cVar, str, new q(this.f15952i, next, TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str))));
                                }
                            }
                        }
                    } catch (Throwable unused2) {
                        q0.b(f15940c0, "please import the videocommon and nativex aar");
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    th.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(List<Campaign> list) {
        if (!TextUtils.isEmpty(this.N) && list != null && list.size() == 0) {
            return false;
        }
        if (list == null || list.size() <= 0) {
            return false;
        }
        com.mbridge.msdk.mbnative.listener.a aVar = this.f15949f;
        if (aVar == null) {
            return true;
        }
        CampaignEx campaignEx = (CampaignEx) list.get(0);
        if (campaignEx != null && campaignEx.isActiveOm()) {
            o5.b bVarA = a(campaignEx);
            this.f15943a0 = bVarA;
            if (bVarA != null) {
                bVarA.g();
                o5.a aVarA = o5.a.a(this.f15943a0);
                this.f15945b0 = aVarA;
                aVarA.c();
            }
        }
        int template = campaignEx != null ? campaignEx.getTemplate() : 2;
        com.mbridge.msdk.foundation.db.j jVarA = com.mbridge.msdk.foundation.db.j.a(com.mbridge.msdk.foundation.db.g.a(this.f15951h));
        jVarA.d();
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx2 = (CampaignEx) list.get(i10);
            if (!jVarA.a(campaignEx2.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx2.getId());
                gVar.b(campaignEx2.getFca());
                gVar.c(campaignEx2.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                jVarA.b(gVar);
            }
        }
        if (this.L && this.K) {
            if (h().m() == 3) {
                List<Campaign> listE = e(list);
                if (list.size() > 0) {
                    a(list, new l(listE, template, aVar, list));
                    return true;
                }
                a(aVar, "has no ads", (CampaignEx) null);
                return true;
            }
            List<Campaign> listB = b(list);
            if (listB != null && listB.size() > 0) {
                a(listB, new m(list, template, aVar));
                return true;
            }
            a(list, template, aVar);
            return true;
        }
        if (list.size() > 0) {
            Iterator<Campaign> it = list.iterator();
            while (it.hasNext()) {
                it.next().setVideoLength(0);
            }
            a(list, template, aVar);
            return true;
        }
        a(aVar, "has no ads", (CampaignEx) null);
        return true;
    }

    public static boolean b(Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        try {
            if (map.containsKey(MBridgeConstans.APP_ID) && map.containsKey(MBridgeConstans.APP_KEY) && map.containsKey(MBridgeConstans.KEY_WORD)) {
                return map.get(MBridgeConstans.KEY_WORD) != null;
            }
            return false;
        } catch (Exception e10) {
            q0.b(f15940c0, com.mbridge.msdk.mbnative.common.a.a(e10));
            return false;
        }
    }

    public void b(int i10, String str) {
        com.mbridge.msdk.mbnative.listener.a aVar;
        Long lPoll;
        Queue<Integer> queue = this.f15954k;
        if (queue != null && queue.size() > 0) {
            Integer numPoll = this.f15954k.poll();
            int iIntValue = numPoll != null ? numPoll.intValue() : 1;
            this.R = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.f15955l;
            if (queue2 != null && queue2.size() > 0 && (lPoll = this.f15955l.poll()) != null) {
                this.R = lPoll.longValue();
            }
            b(iIntValue, this.R, i10, str);
            return;
        }
        if (this.f15965v || (aVar = this.f15949f) == null) {
            return;
        }
        this.f15965v = true;
        aVar.onAdLoadError("no ad source");
    }

    public String e() {
        ArrayList arrayList = new ArrayList();
        List<Campaign> list = this.Y;
        if (list != null) {
            for (Campaign campaign : list) {
                CampaignEx campaignEx = new CampaignEx();
                campaignEx.setCreativeId(campaign.getCreativeId());
                arrayList.add(campaignEx);
            }
        }
        return com.mbridge.msdk.foundation.same.c.b(arrayList);
    }

    public static List<String> a(Map<String, Object> map) {
        Exception e10;
        ArrayList arrayList = null;
        try {
            if (!(map.get(MBridgeConstans.KEY_WORD) instanceof String)) {
                return null;
            }
            String str = (String) map.get(MBridgeConstans.KEY_WORD);
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                try {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString(TtmlNode.TAG_P);
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList2.add(strOptString);
                        }
                    }
                } catch (Exception e11) {
                    e10 = e11;
                    arrayList = arrayList2;
                    q0.b(f15940c0, com.mbridge.msdk.mbnative.common.a.a(e10));
                    return arrayList;
                }
            }
            return arrayList2;
        } catch (Exception e12) {
            e10 = e12;
        }
    }

    public void b(int i10, long j10, int i11, String str) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        if (i11 == 0 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10)) != null) {
            if ((i10 == 1 || i10 == 2) && this.f15947d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                this.f15961r = this.H;
            } else {
                this.f15961r = this.f15960q;
            }
            if (c(a(i10, a(bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) this.f15952i, this.f15961r))))) {
                return;
            }
        }
        if (i10 == 1) {
            a(j10, i11, true, this.f15952i, str);
        } else if (i10 != 2) {
            a(i10, j10, i11, str);
        } else {
            a(2, j10, i11, str);
        }
    }

    public List<Campaign> a(String str, int i10) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e("", str);
        this.Q = lVarE;
        if (lVarE == null) {
            this.Q = com.mbridge.msdk.setting.l.i(str);
        }
        List<Integer> listB = this.Q.b();
        this.f15944b = listB;
        if (listB == null || listB.size() <= 0 || !this.f15944b.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context, CampaignEx campaignEx) {
        NativeController nativeController;
        CampaignEx campaignEx2;
        if (campaignEx != null) {
            try {
                if (campaignEx.needShowIDialog() && com.mbridge.msdk.util.b.a()) {
                    h hVar = new h(campaignEx);
                    if (com.mbridge.msdk.click.c.a(campaignEx) && campaignEx.needShowIDialog()) {
                        nativeController = this;
                        campaignEx2 = campaignEx;
                        try {
                            if (nativeController.a(this.f15959p, context, campaignEx2, this.f15952i, hVar)) {
                                return;
                            }
                            b(campaignEx2);
                            nativeController.f15949f.onAdClick(campaignEx2);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            q0.a(f15940c0, th.getMessage());
                            nativeController.f15959p.a(campaignEx2, nativeController.f15949f);
                            b(campaignEx2);
                        }
                    }
                }
                nativeController = this;
                campaignEx2 = campaignEx;
            } catch (Throwable th2) {
                th = th2;
                nativeController = this;
                campaignEx2 = campaignEx;
            }
        } else {
            nativeController = this;
            campaignEx2 = campaignEx;
        }
        nativeController.f15959p.a(campaignEx2, nativeController.f15949f);
        b(campaignEx2);
    }

    private int a(String str) {
        if (str != null) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObject = (JSONObject) jSONArray.opt(i10);
                        if (2 == jSONObject.optInt("id", 0)) {
                            return jSONObject.optInt("ad_num");
                        }
                    }
                }
            } catch (Exception e10) {
                q0.b(f15940c0, com.mbridge.msdk.mbnative.common.a.a(e10));
                return 0;
            }
        }
        return 0;
    }

    public void d() {
        o0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(CampaignEx campaignEx) {
        if (campaignEx == null || campaignEx.isReportClick()) {
            return;
        }
        campaignEx.setReportClick(true);
        if (campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().i() == null) {
            return;
        }
        com.mbridge.msdk.click.a.a(this.f15951h, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().i(), false, false);
    }

    public void a(String str, String str2) {
        this.f15948e.a(this.f15951h, str, str2, this.f15952i);
    }

    public void a(int i10, String str) throws JSONException {
        boolean zEquals = false;
        this.f15965v = false;
        this.f15966w = false;
        this.f15967x = false;
        this.U = false;
        this.N = str;
        this.f15949f.a(!TextUtils.isEmpty(str));
        this.J = null;
        Map<String, Long> map = f15941d0;
        if (map != null && map.size() > 0) {
            f15941d0.clear();
        }
        if (com.mbridge.msdk.mbnative.controller.d.g() != null && com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f15952i)) {
            zEquals = Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f15952i));
        }
        a(zEquals, i10);
    }

    public void b(Campaign campaign, View view) {
        b(campaign, view, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Timer timer = this.M;
        if (timer != null) {
            timer.cancel();
            this.M = null;
        }
    }

    public void b(Campaign campaign, View view, List<View> list) {
        Class<MBMediaView> cls;
        if (view != null && this.P != null) {
            try {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.P);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        if (campaign != null) {
            int type = campaign.getType();
            if (type == 1 || type == 2) {
                try {
                    cls = MBMediaView.class;
                    int i10 = MBMediaView.f16359p0;
                } catch (Throwable unused) {
                    cls = null;
                }
                if (list == null || list.size() <= 0) {
                    if (view != null) {
                        a(view, cls);
                    }
                } else {
                    Iterator<View> it = list.iterator();
                    while (it.hasNext()) {
                        a(it.next(), cls);
                    }
                }
            }
        }
    }

    private List<Campaign> b(List<Campaign> list) {
        ArrayList arrayList = null;
        if (list != null) {
            for (Campaign campaign : list) {
                if (campaign instanceof CampaignEx) {
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx.getImageUrl()) && !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(campaign);
                    }
                }
            }
        }
        return arrayList;
    }

    private void a(boolean z10, int i10) throws JSONException {
        boolean zB;
        NativeController nativeController;
        int i11;
        if (!z10 || i10 != 1 || !a(i10)) {
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            String strC = com.mbridge.msdk.foundation.controller.c.n().c();
            if (this.f15947d.containsKey(MBridgeConstans.APP_ID) && this.f15947d.containsKey(MBridgeConstans.APP_KEY) && this.f15947d.containsKey(MBridgeConstans.KEY_WORD)) {
                strB = (String) this.f15947d.get(MBridgeConstans.APP_ID);
                strC = (String) this.f15947d.get(MBridgeConstans.APP_KEY);
            }
            a(strB, strC);
            com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(strB, this.f15952i);
            this.Q = lVarE;
            if (lVarE == null) {
                this.Q = com.mbridge.msdk.setting.l.i(this.f15952i);
            }
            com.mbridge.msdk.mbnative.controller.d.d().put(this.f15952i, Integer.valueOf(this.Q.y() * this.f15961r));
            this.f15944b = this.Q.b();
            this.f15946c = this.Q.c();
            this.T = this.Q.f();
            this.S = this.Q.e();
            this.f15961r = this.f15960q;
            List<Integer> list = this.f15944b;
            if (list != null && list.size() != 0) {
                try {
                    zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                } catch (Exception unused) {
                    zB = false;
                }
                if (!zB) {
                    com.mbridge.msdk.mbnative.listener.a aVar = this.f15949f;
                    if (aVar != null) {
                        aVar.onAdLoadError("webview is not available");
                    }
                } else {
                    if (this.f15947d.containsKey(MBridgeConstans.NATIVE_INFO) && this.f15956m == null) {
                        this.f15956m = (String) this.f15947d.get(MBridgeConstans.NATIVE_INFO);
                        f();
                    }
                    if ((this.f15944b.contains(1) && this.f15944b.get(0).intValue() != 1) || i10 != 0 || !c(a(this.f15952i, this.f15961r, this.N))) {
                        this.X = true;
                        if (this.f15944b.contains(1) && i10 == 0 && this.f15944b.get(0).intValue() != 1) {
                            int iIntValue = this.f15944b.get(0).intValue();
                            com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(iIntValue);
                            if (iIntValue == 2 && this.f15947d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                                this.f15961r = this.H;
                            } else {
                                this.f15961r = this.f15960q;
                            }
                            if (bVarA == null || !c(a(iIntValue, a(bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) this.f15952i, this.f15961r))))) {
                                this.X = false;
                                try {
                                    nativeController = this;
                                    i11 = i10;
                                    try {
                                        nativeController.a(this.f15946c.get(this.f15944b.indexOf(1)).intValue() * 1000, i11, false, this.f15952i, this.N);
                                    } catch (Exception unused2) {
                                    }
                                } catch (Exception unused3) {
                                }
                            }
                        } else {
                            nativeController = this;
                            i11 = i10;
                        }
                        nativeController.f16033a.sendEmptyMessageDelayed(1, nativeController.Q.K() * 1000);
                        j();
                        b(i11, nativeController.N);
                    }
                }
            } else {
                com.mbridge.msdk.mbnative.listener.a aVar2 = this.f15949f;
                if (aVar2 != null) {
                    this.f15965v = true;
                    aVar2.onAdLoadError("do not have sorceList");
                }
            }
        }
    }

    public NativeController() {
        this.f15960q = 1;
        this.f15961r = 1;
        this.f15962s = -1;
        this.f15963t = 0;
        this.f15965v = false;
        this.f15966w = false;
        this.f15967x = false;
        this.f15968y = 0;
        this.f15969z = 0;
        this.A = 0;
        this.B = 0;
        this.F = new CopyOnWriteArrayList<>();
        this.G = new Hashtable<>();
        this.H = 1;
        this.I = 2;
        this.N = "";
        this.O = "";
        this.Z = "";
    }

    public boolean a(int i10) {
        int iMin;
        int iOptInt;
        int iOptInt2;
        com.mbridge.msdk.mbnative.listener.a aVar;
        int i11 = 0;
        if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f15952i) && Boolean.TRUE.equals(com.mbridge.msdk.mbnative.controller.d.g().get(this.f15952i))) {
            Map<String, Map<Long, Object>> mapF = com.mbridge.msdk.mbnative.controller.d.f();
            Map<Long, Object> map = mapF.get(i10 + "_" + this.f15952i);
            Integer num = com.mbridge.msdk.mbnative.controller.d.c().get(this.f15952i);
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (num != null) {
                this.f15961r = num.intValue();
            }
            if (map != null && map.size() > 0) {
                Long next = map.keySet().iterator().next();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                if (jCurrentTimeMillis - next.longValue() >= gVarD.b0() * 1000) {
                    mapF.remove(i10 + "_" + this.f15952i);
                } else {
                    if (i10 == 1) {
                        List<Frame> list = (List) map.get(next);
                        if (list == null || list.size() <= 0 || (aVar = this.f15949f) == null) {
                            return false;
                        }
                        if (this.A >= list.size()) {
                            mapF.remove(i10 + "_" + this.f15952i);
                            aVar.onAdFramesLoaded(list);
                            return true;
                        }
                        if (this.A == 0) {
                            return false;
                        }
                        List<Frame> listSubList = list.subList(0, this.f15969z);
                        aVar.onAdFramesLoaded(list);
                        list.removeAll(listSubList);
                        map.put(next, listSubList);
                        ArrayList arrayList = new ArrayList();
                        for (Frame frame : list) {
                            if (i11 >= this.A) {
                                arrayList.add(frame);
                            }
                            i11++;
                        }
                        map.put(next, arrayList);
                        mapF.put(i10 + "_" + this.f15952i, map);
                        aVar.onAdFramesLoaded(listSubList);
                        return true;
                    }
                    List list2 = (List) map.get(next);
                    if (list2 != null && list2.size() > 0) {
                        List<Campaign> arrayList2 = new ArrayList<>();
                        if (((CampaignEx) list2.get(0)).getType() == 1) {
                            if (TextUtils.isEmpty(this.f15956m)) {
                                iMin = Math.min(this.f15968y, list2.size());
                            } else {
                                try {
                                    JSONArray jSONArray = new JSONArray(this.f15956m);
                                    if (jSONArray.length() > 0) {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                                            JSONObject jSONObject = (JSONObject) jSONArray.opt(i12);
                                            int iOptInt3 = jSONObject.optInt("id", 0);
                                            if (2 == iOptInt3) {
                                                iOptInt = jSONObject.optInt("ad_num");
                                            } else if (3 == iOptInt3) {
                                                iOptInt2 = jSONObject.optInt("ad_num");
                                            }
                                        }
                                    } else {
                                        iOptInt = 0;
                                        iOptInt2 = 0;
                                    }
                                    if (3 == ((CampaignEx) list2.get(0)).getTemplate()) {
                                        iMin = Math.min(iOptInt2, list2.size());
                                    } else {
                                        iMin = Math.min(iOptInt, list2.size());
                                    }
                                } catch (Exception unused) {
                                    q0.b(f15940c0, "load from catch error in get nativeinfo adnum");
                                    iMin = 0;
                                }
                            }
                            if (iMin <= 0) {
                                return false;
                            }
                            Iterator it = list2.iterator();
                            while (it.hasNext() && i11 != iMin) {
                                CampaignEx campaignEx = (CampaignEx) it.next();
                                campaignEx.getTemplate();
                                arrayList2.add(campaignEx);
                                it.remove();
                                i11++;
                            }
                        } else {
                            int iMin2 = Math.min(this.f15968y, list2.size());
                            if (iMin2 > 0) {
                                Iterator it2 = list2.iterator();
                                while (it2.hasNext() && i11 != iMin2) {
                                    CampaignEx campaignEx2 = (CampaignEx) it2.next();
                                    campaignEx2.getTemplate();
                                    arrayList2.add(campaignEx2);
                                    it2.remove();
                                    i11++;
                                }
                            }
                        }
                        c(arrayList2);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void a(String str, int i10, String str2, CampaignEx campaignEx) {
        Queue<Integer> queue = this.f15954k;
        if ((queue != null && queue.size() <= 0) || this.f15954k == null) {
            com.mbridge.msdk.mbnative.listener.a aVar = this.f15949f;
            if (aVar == null || this.f15965v) {
                return;
            }
            this.f15965v = true;
            aVar.a(campaignEx, str);
            return;
        }
        b(i10, str2);
    }

    @Override // com.mbridge.msdk.mbnative.controller.a
    public synchronized void a(int i10, long j10, int i11, String str) {
        com.mbridge.msdk.foundation.same.net.wrapper.c cVar;
        com.mbridge.msdk.foundation.entity.k kVar;
        try {
            try {
                if (this.f15947d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    this.f15961r = Math.max(this.V, this.W);
                }
                if (i11 == 0) {
                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(i10);
                    if (bVarA != null && c(a(1, a(bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) this.f15952i, this.f15961r))))) {
                        return;
                    }
                    n nVar = this.J;
                    if (nVar != null && !this.U) {
                        nVar.b(true);
                    }
                    if (this.U && !this.f15965v) {
                        a("mb load failed", i11, str, (CampaignEx) null);
                    }
                    if (!this.X) {
                        return;
                    }
                }
                int i12 = this.f15962s;
                if (i12 == -1) {
                    this.f15962s = i10;
                } else if (i12 != i10) {
                    this.f15963t = 0;
                }
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f15951h)).d();
                com.mbridge.msdk.foundation.same.net.wrapper.c aVar = new com.mbridge.msdk.mbnative.service.net.a(this.f15951h);
                com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                String strC = com.mbridge.msdk.foundation.controller.c.n().c();
                Map<String, Object> map = this.f15947d;
                if (map != null && map.containsKey(MBridgeConstans.APP_ID) && this.f15947d.containsKey(MBridgeConstans.APP_KEY) && this.f15947d.containsKey(MBridgeConstans.KEY_WORD) && this.f15947d.get(MBridgeConstans.KEY_WORD) != null) {
                    if (this.f15947d.get(MBridgeConstans.APP_ID) instanceof String) {
                        strB = (String) this.f15947d.get(MBridgeConstans.APP_ID);
                    }
                    if (this.f15947d.get(MBridgeConstans.APP_KEY) instanceof String) {
                        strC = (String) this.f15947d.get(MBridgeConstans.APP_KEY);
                    }
                    String str2 = this.f15947d.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.f15947d.get(MBridgeConstans.KEY_WORD) : null;
                    if (!TextUtils.isEmpty(str2)) {
                        eVar.a("smart", k0.b(str2));
                    }
                }
                eVar.a(MBridgeConstans.APP_ID, strB);
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, this.f15952i);
                if (!TextUtils.isEmpty(this.f15953j)) {
                    eVar.a(MBridgeConstans.PLACEMENT_ID, this.f15953j);
                }
                eVar.a("req_type", "2");
                if (!TextUtils.isEmpty(this.f15964u)) {
                    eVar.a("category", this.f15964u);
                }
                eVar.a("sign", SameMD5.getMD5(strB + strC));
                if (this.T > 0 && i11 == 0) {
                    eVar.a("ad_num", this.T + "");
                } else {
                    eVar.a("ad_num", this.f15960q + "");
                }
                String strD = v0.d(this.f15952i);
                if (!TextUtils.isEmpty(strD)) {
                    eVar.a("j", strD);
                }
                eVar.a("only_impression", "1");
                eVar.a("ping_mode", "1");
                if (this.A != 0) {
                    eVar.a("frame_num", this.A + "");
                }
                if (!TextUtils.isEmpty(this.f15956m)) {
                    eVar.a(MBridgeConstans.NATIVE_INFO, this.f15956m);
                    if (i10 == 1) {
                        eVar.a("tnum", this.H + "");
                    }
                } else if (i10 == 1) {
                    eVar.a("tnum", this.f15960q + "");
                }
                a(eVar, i10);
                String strA = com.mbridge.msdk.foundation.same.buffer.b.a(this.f15952i, "native");
                if (!TextUtils.isEmpty(strA)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f15197g, strA);
                }
                if (this.f15947d.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.f15947d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                    eVar.a("video_width", ((Integer) this.f15947d.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.f15947d.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.f15947d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                    eVar.a("video_height", ((Integer) this.f15947d.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                if (this.f15947d.containsKey(MBridgeConstans.NATIVE_VIDEO_SUPPORT) && (this.f15947d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT) instanceof Boolean)) {
                    ((Boolean) this.f15947d.get(MBridgeConstans.NATIVE_VIDEO_SUPPORT)).getClass();
                }
                eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                if (com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                    com.mbridge.msdk.setting.h.b().a();
                }
                if (!b(this.f15947d)) {
                    JSONArray jSONArrayB = v0.b(this.f15951h, this.f15952i);
                    if (jSONArrayB.length() > 0) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f15198h, v0.a(jSONArrayB));
                    }
                }
                if (com.mbridge.msdk.mbnative.controller.d.g().containsKey(this.f15952i) && com.mbridge.msdk.mbnative.controller.d.g().get(this.f15952i).booleanValue() && com.mbridge.msdk.mbnative.controller.d.e().get(this.f15952i) != null && (kVar = com.mbridge.msdk.mbnative.controller.d.e().get(this.f15952i)) != null) {
                    if (i10 == 1) {
                        this.f15963t = kVar.a();
                    } else if (i10 == 2) {
                        this.f15963t = kVar.b();
                    }
                }
                eVar.a("offset", this.f15963t + "");
                eVar.a("ad_type", "42");
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i10 + "");
                if (!TextUtils.isEmpty(this.f15958o)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f15199i, this.f15958o);
                }
                n nVar2 = new n();
                nVar2.b(a(this.f15947d));
                nVar2.setUnitId(this.f15952i);
                nVar2.setPlacementId(this.f15953j);
                nVar2.setAdType(42);
                nVar2.b(true);
                p pVar = new p(1, nVar2, i11, str);
                nVar2.a(pVar);
                nVar2.a(i11);
                nVar2.a(str);
                if (i11 == 0) {
                    if (!TextUtils.isEmpty(str)) {
                        eVar.a(BidResponsed.KEY_TOKEN, str);
                    }
                    aVar.choiceV3OrV5BySetting(1, eVar, nVar2, str, com.mbridge.msdk.foundation.same.c.a(j10, 30000L));
                    cVar = aVar;
                } else {
                    cVar = aVar;
                }
                if (i11 == 1) {
                    cVar.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().f15162b0, eVar, nVar2, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j10, 30000L));
                }
                this.f16033a.postDelayed(pVar, j10);
            } catch (Exception e10) {
                String str3 = f15940c0;
                q0.b(str3, com.mbridge.msdk.mbnative.common.a.a(e10));
                q0.b(str3, e10.getMessage());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void a(View view, CampaignEx campaignEx) {
        BitmapDrawable bitmapDrawableA;
        ImageView imageView;
        if (!(view instanceof FrameLayout) || (bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.n().a(this.f15952i, campaignEx.getAdType())) == null) {
            return;
        }
        try {
            int childCount = ((ViewGroup) view).getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    imageView = null;
                    break;
                }
                View childAt = ((ViewGroup) view).getChildAt(i10);
                if ((childAt instanceof ImageView) && childAt.getTag() != null && "mb_wm".equals((String) childAt.getTag())) {
                    ((ImageView) childAt).setLayoutParams(new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                    imageView = (ImageView) childAt;
                    break;
                }
                i10++;
            }
            if (imageView == null) {
                imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.n().d());
                imageView.setTag("mb_wm");
                v0.a(imageView, bitmapDrawableA, view.getResources().getDisplayMetrics());
                if (imageView.getParent() == null) {
                    ((FrameLayout) view).addView(imageView, new FrameLayout.LayoutParams(view.getWidth(), view.getHeight()));
                }
                o5.b bVar = this.f15943a0;
                if (bVar != null) {
                    bVar.a(imageView, FriendlyObstructionPurpose.OTHER, null);
                }
            }
            this.P = new e(imageView, view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.P);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(Campaign campaign, View view, List<View> list) {
        Class<MBMediaView> cls;
        try {
            a(view, (CampaignEx) campaign);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f15950g;
            if (nativeTrackingListener != null) {
                this.f15959p.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f15952i, campaign, this.N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            try {
                cls = MBMediaView.class;
                int i10 = MBMediaView.f16359p0;
            } catch (Throwable unused) {
                cls = null;
            }
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f15952i, campaignEx, "native");
            if (view != null) {
                if (cls != null && cls.isInstance(view)) {
                    return;
                }
                b1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
                view.setOnClickListener(new f(campaignEx));
            }
            if (list != null && list.size() > 0) {
                for (View view2 : list) {
                    if (cls != null && cls.isInstance(view2)) {
                        break;
                    }
                    b1.a(view2, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
                    view2.setOnClickListener(new g(campaignEx));
                }
            }
            if (campaignEx.isReport()) {
                return;
            }
            a(campaignEx, view, list);
            Log.e(f15940c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            q0.b(f15940c0, "registerview exception!");
        }
    }

    public void a(Campaign campaign, View view) {
        try {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f15950g;
            if (nativeTrackingListener != null) {
                this.f15959p.a(nativeTrackingListener);
            }
            com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f15952i, campaign, this.N);
            CampaignEx campaignEx = (CampaignEx) campaign;
            com.mbridge.msdk.foundation.same.buffer.b.a(this.f15952i, campaignEx, "native");
            b1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
            i iVar = new i(campaignEx);
            try {
                int i10 = MBMediaView.f16359p0;
                a(campaignEx, view, iVar, MBMediaView.class);
            } catch (Throwable unused) {
                a(campaignEx, view, iVar, (Class) null);
            }
            if (!com.mbridge.msdk.util.b.a()) {
                a(view, (CampaignEx) campaign);
            }
            if (campaignEx.isReport()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            a(campaignEx, view, (List<View>) arrayList);
            q0.c(f15940c0, "sendImpression" + campaignEx);
        } catch (Exception unused2) {
            q0.b(f15940c0, "registerview exception!");
        }
    }

    private o5.b a(CampaignEx campaignEx) {
        if (this.G == null) {
            this.G = new Hashtable<>();
        }
        String requestIdNotice = campaignEx.getRequestIdNotice();
        o5.b bVarA = this.G.get(requestIdNotice);
        if (bVarA == null && campaignEx.isActiveOm() && TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
            bVarA = com.mbridge.msdk.omsdk.b.a(this.f15951h, true, campaignEx.getOmid(), campaignEx.getRequestId(), campaignEx.getId(), this.f15952i, "", campaignEx.getRequestIdNotice());
        }
        if (bVarA != null) {
            this.G.put(requestIdNotice, bVarA);
        }
        return bVarA;
    }

    private void a(CampaignEx campaignEx, View view, List<View> list) {
        Exception exc;
        o5.b bVarA;
        try {
            if (this.f15951h == null || campaignEx == null) {
                bVarA = null;
            } else {
                try {
                    bVarA = a(campaignEx);
                    if (bVarA != null) {
                        bVarA.d(view);
                        bVarA.g();
                    }
                } catch (Exception e10) {
                    exc = e10;
                    q0.b(f15940c0, com.mbridge.msdk.mbnative.common.a.a(exc));
                }
            }
            o5.b bVar = bVarA;
            com.mbridge.msdk.setting.l lVar = this.Q;
            int iS = lVar != null ? lVar.s() : 0;
            if (campaignEx != null) {
                if (campaignEx.getImpReportType() == 1) {
                    iS = 0;
                }
            }
            try {
                s sVar = new s(campaignEx, view, list, this, bVar);
                if (this.F == null) {
                    this.F = new CopyOnWriteArrayList<>();
                }
                this.F.add(sVar);
                sVar.setOnStateChangeListener(new j(sVar));
                Handler handler = this.f16033a;
                if (handler != null) {
                    handler.postDelayed(sVar, iS * 1000);
                }
            } catch (Exception e11) {
                e = e11;
                exc = e;
                q0.b(f15940c0, com.mbridge.msdk.mbnative.common.a.a(exc));
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    private void a(CampaignEx campaignEx, View view, View.OnClickListener onClickListener, Class cls) {
        if (view == null || onClickListener == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(onClickListener);
        b1.a(view, campaignEx.getLocalRequestId(), campaignEx.getLocalAllowTrackClick());
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(campaignEx, viewGroup.getChildAt(i10), onClickListener, cls);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, View view, List<View> list, o5.b bVar) {
        try {
            k kVar = new k(campaignEx);
            com.mbridge.msdk.mbnative.controller.c cVar = new com.mbridge.msdk.mbnative.controller.c(list, kVar, new Handler(Looper.getMainLooper()), campaignEx.getImpReportType());
            cVar.a(view);
            List<com.mbridge.msdk.mbnative.controller.c> list2 = this.D;
            if (list2 != null) {
                list2.add(cVar);
            }
            List<c.d> list3 = this.E;
            if (list3 != null) {
                list3.add(kVar);
            }
            o5.a aVar = this.f15945b0;
            if (aVar != null) {
                aVar.b();
            }
        } catch (Exception unused) {
        }
    }

    private void a(View view, Class cls) {
        if (view == null) {
            return;
        }
        if (cls != null) {
            try {
                if (cls.isInstance(view)) {
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        view.setOnClickListener(null);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10), cls);
            }
        }
    }

    public List<Campaign> a(String str, int i10, String str2) {
        int i11;
        int i12;
        List<Campaign> listA = null;
        if (this.f15944b != null) {
            ArrayList arrayList = new ArrayList(this.f15944b);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(((Integer) arrayList.get(i13)).intValue());
                if (bVarA != null) {
                    if ((((Integer) arrayList.get(i13)).intValue() == 1 || ((Integer) arrayList.get(i13)).intValue() == 2) && this.f15947d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i12 = this.H;
                    } else {
                        i12 = this.f15960q;
                    }
                    listA = a(((Integer) arrayList.get(i13)).intValue(), bVarA.a((com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>>) str, i12));
                    if (listA != null) {
                        break;
                    }
                }
            }
            if (listA == null) {
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA2 = com.mbridge.msdk.mbnative.cache.c.a(((Integer) arrayList.get(i14)).intValue());
                    if ((((Integer) arrayList.get(i14)).intValue() == 1 || ((Integer) arrayList.get(i14)).intValue() == 2) && this.f15947d.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i11 = this.H;
                    } else {
                        i11 = this.f15960q;
                    }
                    listA = a(((Integer) arrayList.get(i14)).intValue(), bVarA2.b(str, i11));
                    if (listA != null) {
                        break;
                    }
                }
            }
        }
        return a(listA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<Campaign> list, int i10, NativeListener.NativeAdListener nativeAdListener) {
        this.f16033a.post(new a(list, nativeAdListener, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.mbnative.listener.a aVar, String str, CampaignEx campaignEx) {
        this.f16033a.post(new b(aVar, campaignEx, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(int i10, List<Campaign> list) {
        if (i10 == 1 && this.f15947d.containsKey(MBridgeConstans.NATIVE_INFO) && list != null && list.size() > 0) {
            CampaignEx campaignEx = (CampaignEx) list.get(0);
            int template = campaignEx != null ? campaignEx.getTemplate() : 1;
            if (template == 2) {
                int size = list.size();
                int i11 = this.V;
                if (size >= i11) {
                    return list.subList(0, i11);
                }
            } else if (template == 3) {
                int size2 = list.size();
                int i12 = this.W;
                if (size2 >= i12) {
                    return list.subList(0, i12);
                }
            }
        }
        return list;
    }

    private void a(List<Campaign> list, o oVar) {
        c();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Timer timer = new Timer();
        this.M = timer;
        timer.schedule(new d(jCurrentTimeMillis, oVar, list), 0L, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(List<Campaign> list, boolean z10) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                Campaign campaign = list.get(size);
                String id = campaign.getId();
                boolean z11 = campaign instanceof CampaignEx;
                if (z11) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(id);
                    CampaignEx campaignEx = (CampaignEx) campaign;
                    sb.append(campaignEx.getVideoUrlEncode());
                    sb.append(campaignEx.getBidToken());
                    id = sb.toString();
                }
                com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(this.f15952i, id);
                if (z10) {
                    if (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, h().C())) {
                        com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f15952i, list.remove(size), this.N);
                    }
                } else if (z11) {
                    CampaignEx campaignEx2 = (CampaignEx) campaign;
                    if (TextUtils.isEmpty(campaignEx2.getImageUrl()) && !TextUtils.isEmpty(campaignEx2.getVideoUrlEncode()) && (aVarA == null || !com.mbridge.msdk.videocommon.download.l.a(aVarA, h().C()))) {
                        com.mbridge.msdk.mbnative.cache.c.a(campaign.getType()).a(this.f15952i, list.remove(size), this.N);
                    }
                }
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Campaign> a(List<Campaign> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        for (Campaign campaign : list) {
            if (campaign instanceof CampaignEx) {
                CampaignEx campaignEx = (CampaignEx) campaign;
                if (TextUtils.isEmpty(this.N) && TextUtils.isEmpty(campaignEx.getBidToken()) && !campaignEx.isBidCampaign()) {
                    arrayList2.add(campaignEx);
                } else if (!TextUtils.isEmpty(this.N) && TextUtils.equals(campaignEx.getBidToken(), this.N)) {
                    arrayList.add(campaign);
                }
            } else {
                arrayList2.add(campaign);
            }
        }
        return TextUtils.isEmpty(this.N) ? arrayList2 : arrayList;
    }
}
