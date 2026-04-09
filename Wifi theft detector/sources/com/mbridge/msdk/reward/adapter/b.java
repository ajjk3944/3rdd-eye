package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout;
import com.mbridge.msdk.videocommon.a;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, f> f16492g;

    /* renamed from: a, reason: collision with root package name */
    private final m f16493a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16494b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16495c;

    /* renamed from: d, reason: collision with root package name */
    private final String f16496d;

    /* renamed from: e, reason: collision with root package name */
    private final String f16497e;

    /* renamed from: f, reason: collision with root package name */
    private volatile List<WindVaneWebView> f16498f;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f16499a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f16500b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f16501c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f16502d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f16503e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f16504f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f16505g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ n f16506h;

        public a(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i10, String str2, String str3, String str4, n nVar) {
            this.f16499a = copyOnWriteArrayList;
            this.f16500b = context;
            this.f16501c = str;
            this.f16502d = i10;
            this.f16503e = str2;
            this.f16504f = str3;
            this.f16505g = str4;
            this.f16506h = nVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x02df  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x02b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0279 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01f3  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0257  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() throws java.security.NoSuchAlgorithmException {
            /*
                Method dump skipped, instructions count: 993
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a.run():void");
        }
    }

    public class c implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f16511a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f16512b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f16513c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CampaignEx f16514d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f16515e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f16516f;

        public c(String str, String str2, String str3, CampaignEx campaignEx, n nVar, Context context) {
            this.f16511a = str;
            this.f16512b = str2;
            this.f16513c = str3;
            this.f16514d = campaignEx;
            this.f16515e = nVar;
            this.f16516f = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onFailed(java.lang.String r22, java.lang.String r23) {
            /*
                Method dump skipped, instructions count: 410
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.c.onFailed(java.lang.String, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                q0.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16511a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16512b);
                bundle.putString("request_id", this.f16513c);
                bundle.putString("key", this.f16511a + "_" + this.f16513c + "_" + this.f16514d.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                b.this.f16493a.sendMessage(messageObtain);
                n nVar = this.f16515e;
                if (nVar != null) {
                    nVar.a(this.f16512b, this.f16511a, this.f16513c, str);
                }
                if (z10) {
                    return;
                }
                b.this.a(this.f16516f, 1, this.f16514d, str, "", this.f16511a, str2);
            } catch (Exception e10) {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = Sdk$SDKError.Reason.AD_IS_PLAYING_VALUE;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16511a);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f16512b);
                bundle2.putString("request_id", this.f16513c);
                bundle2.putString("key", this.f16511a + "_" + this.f16513c + "_" + this.f16514d.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                b.this.f16493a.sendMessage(messageObtain2);
                if (this.f16515e != null) {
                    try {
                        this.f16515e.a(str, this.f16513c, b.b(880005, new MBridgeIds(this.f16512b, this.f16511a, this.f16513c), "", e10, null));
                    } catch (Exception e11) {
                        q0.b("RewardCampaignsResourceManager", e11.getMessage());
                    }
                }
                b.this.a(this.f16516f, 3, this.f16514d, str, e10.getLocalizedMessage(), this.f16511a, str2);
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f16518a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f16519b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f16520c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f16521d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f16522e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f16523f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f16524g;

        public d(CampaignEx campaignEx, Context context, int i10, String str, String str2, String str3, String str4) {
            this.f16518a = campaignEx;
            this.f16519b = context;
            this.f16520c = i10;
            this.f16521d = str;
            this.f16522e = str2;
            this.f16523f = str3;
            this.f16524g = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f16518a == null || this.f16519b == null) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("m_download_end");
                Context context = this.f16519b;
                if (context != null) {
                    nVar.c(m0.s(context.getApplicationContext()));
                }
                nVar.d(this.f16520c);
                CampaignEx campaignEx = this.f16518a;
                if (campaignEx != null) {
                    nVar.b(campaignEx.getId());
                    nVar.n(this.f16518a.getRequestId());
                    nVar.k(this.f16518a.getCurrentLocalRid());
                    nVar.o(this.f16518a.getRequestIdNotice());
                }
                nVar.b("url", this.f16521d);
                nVar.t(this.f16521d);
                nVar.m(this.f16522e);
                nVar.u(this.f16523f);
                if (!TextUtils.isEmpty(this.f16524g)) {
                    nVar.q(this.f16524g);
                }
                nVar.e(1);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f16518a);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f16526a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WindVaneWebView f16527b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f16528c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f16529d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f16530e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.videocommon.setting.c f16531f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f16532g;

        public e(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.setting.c cVar, String str2) {
            this.f16526a = z10;
            this.f16527b = windVaneWebView;
            this.f16528c = campaignEx;
            this.f16529d = copyOnWriteArrayList;
            this.f16530e = str;
            this.f16531f = cVar;
            this.f16532g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f16526a, this.f16527b, this.f16528c.getRewardTemplateMode().j(), 0, this.f16528c, (CopyOnWriteArrayList<CampaignEx>) this.f16529d, H5DownLoadManager.getInstance().getH5ResAddress(this.f16528c.getRewardTemplateMode().j()), this.f16530e, this.f16531f, this.f16532g, b.this.f16494b);
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        boolean f16534a;

        /* renamed from: b, reason: collision with root package name */
        boolean f16535b;

        /* renamed from: c, reason: collision with root package name */
        int f16536c;

        /* renamed from: d, reason: collision with root package name */
        int f16537d;

        /* renamed from: e, reason: collision with root package name */
        String f16538e;

        /* renamed from: f, reason: collision with root package name */
        String f16539f;

        /* renamed from: g, reason: collision with root package name */
        int f16540g;

        /* renamed from: h, reason: collision with root package name */
        CopyOnWriteArrayList<CampaignEx> f16541h;

        /* renamed from: i, reason: collision with root package name */
        CopyOnWriteArrayList<CampaignEx> f16542i;

        public f(boolean z10, boolean z11, int i10, int i11, String str, String str2, int i12, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f16534a = z10;
            this.f16535b = z11;
            this.f16536c = i10;
            this.f16537d = i11;
            this.f16538e = str;
            this.f16539f = str2;
            this.f16540g = i12;
            this.f16541h = copyOnWriteArrayList;
            this.f16542i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    public interface h {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar);
    }

    public static final class i implements H5DownLoadManager.IH5SourceDownloadListener {

        /* renamed from: b, reason: collision with root package name */
        private int f16564b;

        /* renamed from: c, reason: collision with root package name */
        private final String f16565c;

        /* renamed from: d, reason: collision with root package name */
        private final String f16566d;

        /* renamed from: e, reason: collision with root package name */
        private final String f16567e;

        /* renamed from: f, reason: collision with root package name */
        private CampaignEx f16568f;

        /* renamed from: g, reason: collision with root package name */
        private n f16569g;

        /* renamed from: h, reason: collision with root package name */
        private Handler f16570h;

        /* renamed from: i, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f16571i;

        /* renamed from: a, reason: collision with root package name */
        private boolean f16563a = false;

        /* renamed from: j, reason: collision with root package name */
        private final long f16572j = System.currentTimeMillis();

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f16573a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f16574b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f16575c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f16576d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f16577e;

            public a(int i10, long j10, String str, String str2, String str3) {
                this.f16573a = i10;
                this.f16574b = j10;
                this.f16575c = str;
                this.f16576d = str2;
                this.f16577e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f16568f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f16573a, this.f16574b + "", this.f16575c, i.this.f16568f.getId(), i.this.f16566d, this.f16576d, "2");
                    nVar.n(i.this.f16568f.getRequestId());
                    nVar.k(i.this.f16568f.getCurrentLocalRid());
                    nVar.o(i.this.f16568f.getRequestIdNotice());
                    nVar.b(i.this.f16568f.getId());
                    nVar.a(i.this.f16568f.getAdSpaceT());
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f16575c);
                    if (i.this.f16568f.getAdType() == 287) {
                        nVar.a("3");
                    } else if (i.this.f16568f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    if (!TextUtils.isEmpty(this.f16577e)) {
                        nVar.q(this.f16577e);
                    }
                    b.b(nVar, i.this.f16568f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, i.this.f16566d, i.this.f16568f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public i(int i10, String str, String str2, String str3, CampaignEx campaignEx, n nVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f16564b = i10;
            this.f16565c = str;
            this.f16566d = str2;
            this.f16567e = str3;
            this.f16568f = campaignEx;
            this.f16569g = nVar;
            this.f16570h = handler;
            this.f16571i = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i10 = this.f16564b;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16566d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16565c);
                bundle.putString("request_id", this.f16567e);
                bundle.putString("key", this.f16566d + "_" + this.f16567e + "_" + this.f16568f.getSecondRequestIndex());
                bundle.putString("url", str);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain.setData(bundle);
                this.f16570h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16566d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f16565c);
                bundle2.putString("request_id", this.f16567e);
                bundle2.putString("key", this.f16566d + "_" + this.f16567e + "_" + this.f16568f.getSecondRequestIndex());
                bundle2.putString("url", str);
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain2.setData(bundle2);
                this.f16570h.sendMessage(messageObtain2);
                if (this.f16563a) {
                    a(3, System.currentTimeMillis() - this.f16572j, str, "url download failed", "");
                }
            } else if (i10 == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = Sdk$SDKError.Reason.AD_IS_PLAYING_VALUE;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16566d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f16565c);
                bundle3.putString("request_id", this.f16567e);
                bundle3.putString("key", this.f16566d + "_" + this.f16567e + "_" + this.f16568f.getSecondRequestIndex());
                bundle3.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain3.setData(bundle3);
                this.f16570h.sendMessage(messageObtain3);
                if (this.f16569g != null) {
                    try {
                        this.f16569g.a(str, this.f16567e, b.b(880006, new MBridgeIds(this.f16565c, this.f16566d, this.f16567e), str2, null, null));
                    } catch (Exception e10) {
                        q0.b("RewardCampaignsResourceManager", e10.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i10 = this.f16564b;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16566d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16565c);
                bundle.putString("request_id", this.f16567e);
                bundle.putString("key", this.f16566d + "_" + this.f16567e + "_" + this.f16568f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f16570h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16566d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f16565c);
                bundle2.putString("request_id", this.f16567e);
                bundle2.putString("key", this.f16566d + "_" + this.f16567e + "_" + this.f16568f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f16570h.sendMessage(messageObtain2);
                if (this.f16563a) {
                    a(1, System.currentTimeMillis() - this.f16572j, str, "", str2);
                }
            } else if (i10 == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 105;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16566d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f16565c);
                bundle3.putString("request_id", this.f16567e);
                bundle3.putString("key", this.f16566d + "_" + this.f16567e + "_" + this.f16568f.getSecondRequestIndex());
                messageObtain3.setData(bundle3);
                this.f16570h.sendMessage(messageObtain3);
                n nVar = this.f16569g;
                if (nVar != null) {
                    nVar.a(this.f16565c, this.f16566d, this.f16567e, str);
                }
            }
        }

        public void a(boolean z10) {
            this.f16563a = z10;
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, j10, str, str2, str3));
        }
    }

    public static final class j implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        private Handler f16579a;

        /* renamed from: b, reason: collision with root package name */
        private int f16580b;

        /* renamed from: c, reason: collision with root package name */
        private String f16581c;

        /* renamed from: d, reason: collision with root package name */
        private String f16582d;

        /* renamed from: e, reason: collision with root package name */
        private String f16583e;

        /* renamed from: f, reason: collision with root package name */
        private CampaignEx f16584f;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f16585a;

            public a(String str) {
                this.f16585a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (j.this.f16584f != null) {
                    try {
                        com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                        q0.a("RewardCampaignsResourceManager", "campaign is null");
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.j("2000044");
                        nVar.c(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                        nVar.b(j.this.f16584f.getId());
                        nVar.i(j.this.f16584f.getImageUrl());
                        nVar.n(j.this.f16584f.getRequestId());
                        nVar.k(j.this.f16584f.getCurrentLocalRid());
                        nVar.o(j.this.f16584f.getRequestIdNotice());
                        nVar.u(j.this.f16581c);
                        nVar.m(this.f16585a);
                        nVar.b("scenes", "1");
                        nVarA.a(nVar);
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public j(Handler handler, int i10, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f16579a = handler;
            this.f16580b = i10;
            this.f16582d = str;
            this.f16581c = str2;
            this.f16583e = str3;
            this.f16584f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f16580b == 0 ? Sdk$SDKError.Reason.AD_CONSUMED_VALUE : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16581c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16582d);
            bundle.putString("request_id", this.f16583e);
            bundle.putString("key", this.f16581c + "_" + this.f16583e + "_" + this.f16584f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f16579a.sendMessage(messageObtain);
            a aVar = new a(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f16580b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16581c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16582d);
            bundle.putString("request_id", this.f16583e);
            bundle.putString("key", this.f16581c + "_" + this.f16583e + "_" + this.f16584f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f16579a.sendMessage(messageObtain);
        }
    }

    public static final class l implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: b, reason: collision with root package name */
        private Context f16593b;

        /* renamed from: c, reason: collision with root package name */
        private String f16594c;

        /* renamed from: d, reason: collision with root package name */
        private String f16595d;

        /* renamed from: e, reason: collision with root package name */
        private String f16596e;

        /* renamed from: f, reason: collision with root package name */
        private CampaignEx f16597f;

        /* renamed from: g, reason: collision with root package name */
        private int f16598g;

        /* renamed from: h, reason: collision with root package name */
        private Handler f16599h;

        /* renamed from: i, reason: collision with root package name */
        private n f16600i;

        /* renamed from: j, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f16601j;

        /* renamed from: a, reason: collision with root package name */
        private boolean f16592a = false;

        /* renamed from: k, reason: collision with root package name */
        private long f16602k = System.currentTimeMillis();

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f16603a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f16604b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f16605c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f16606d;

            public a(int i10, String str, String str2, String str3) {
                this.f16603a = i10;
                this.f16604b = str;
                this.f16605c = str2;
                this.f16606d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f16597f == null || l.this.f16593b == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.j("m_download_end");
                    if (l.this.f16593b != null) {
                        nVar.c(m0.s(l.this.f16593b.getApplicationContext()));
                    }
                    nVar.d(this.f16603a);
                    if (l.this.f16597f != null) {
                        nVar.b(l.this.f16597f.getId());
                        nVar.n(l.this.f16597f.getRequestId());
                        nVar.k(l.this.f16597f.getCurrentLocalRid());
                        nVar.o(l.this.f16597f.getRequestIdNotice());
                    }
                    nVar.t(this.f16604b);
                    nVar.m(this.f16605c);
                    nVar.u(l.this.f16594c);
                    if (!TextUtils.isEmpty(this.f16606d)) {
                        nVar.q(this.f16606d);
                    }
                    nVar.e(2);
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f16604b);
                    b.b(nVar, l.this.f16597f);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, l.this.f16597f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        /* renamed from: com.mbridge.msdk.reward.adapter.b$l$b, reason: collision with other inner class name */
        public class RunnableC0296b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f16608a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f16609b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f16610c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f16611d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f16612e;

            public RunnableC0296b(int i10, long j10, String str, String str2, String str3) {
                this.f16608a = i10;
                this.f16609b = j10;
                this.f16610c = str;
                this.f16611d = str2;
                this.f16612e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f16597f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f16608a, this.f16609b + "", this.f16610c, l.this.f16597f.getId(), l.this.f16594c, this.f16611d, "1");
                    nVar.n(l.this.f16597f.getRequestId());
                    nVar.k(l.this.f16597f.getCurrentLocalRid());
                    nVar.o(l.this.f16597f.getRequestIdNotice());
                    nVar.b(l.this.f16597f.getId());
                    nVar.a(l.this.f16597f.getAdSpaceT());
                    nVar.q(this.f16612e);
                    nVar.b("scenes", "1");
                    if (l.this.f16597f.getAdType() == 287) {
                        nVar.a("3");
                    } else if (l.this.f16597f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    nVar.b("url", this.f16610c);
                    nVar.e(3);
                    b.b(nVar, l.this.f16597f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, l.this.f16594c, l.this.f16597f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public l(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i10, Handler handler, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f16593b = context;
            this.f16595d = str;
            this.f16594c = str2;
            this.f16596e = str3;
            this.f16597f = campaignEx;
            this.f16598g = i10;
            this.f16599h = handler;
            this.f16600i = nVar;
            this.f16601j = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f16602k;
            int i10 = this.f16598g;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16594c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16595d);
                bundle.putString("request_id", this.f16596e);
                bundle.putString("key", this.f16594c + "_" + this.f16596e + "_" + this.f16597f.getSecondRequestIndex());
                bundle.putString("url", str2);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain.setData(bundle);
                this.f16599h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16594c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f16595d);
                bundle2.putString("request_id", this.f16596e);
                bundle2.putString("url", str2);
                bundle2.putString("key", this.f16594c + "_" + this.f16596e + "_" + this.f16597f.getSecondRequestIndex());
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain2.setData(bundle2);
                this.f16599h.sendMessage(messageObtain2);
                if (this.f16592a) {
                    a(3, jCurrentTimeMillis, str2, "zip download failed", "");
                }
            } else if (i10 == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = Sdk$SDKError.Reason.AD_IS_LOADING_VALUE;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16594c);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f16595d);
                bundle3.putString("request_id", this.f16596e);
                bundle3.putString("url", str2);
                bundle3.putString("key", this.f16594c + "_" + this.f16596e + "_" + this.f16597f.getSecondRequestIndex());
                bundle3.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain3.setData(bundle3);
                this.f16599h.sendMessage(messageObtain3);
                if (this.f16600i != null) {
                    try {
                        this.f16600i.a(str2, this.f16596e, b.b(880006, new MBridgeIds(this.f16595d, this.f16594c, this.f16596e), "", null, null));
                    } catch (Exception e10) {
                        q0.b("RewardCampaignsResourceManager", e10.getMessage());
                    }
                }
                a(3, str2, str, "");
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f16602k;
            int i10 = this.f16598g;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16594c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16595d);
                bundle.putString("request_id", this.f16596e);
                bundle.putString("key", this.f16594c + "_" + this.f16596e + "_" + this.f16597f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f16599h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16594c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f16595d);
                bundle2.putString("request_id", this.f16596e);
                bundle2.putString("key", this.f16594c + "_" + this.f16596e + "_" + this.f16597f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f16599h.sendMessage(messageObtain2);
                if (this.f16592a) {
                    a(1, jCurrentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16594c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f16595d);
            bundle3.putString("request_id", this.f16596e);
            bundle3.putString("key", this.f16594c + "_" + this.f16596e + "_" + this.f16597f.getSecondRequestIndex());
            messageObtain3.setData(bundle3);
            this.f16599h.sendMessage(messageObtain3);
            n nVar = this.f16600i;
            if (nVar != null) {
                nVar.a(this.f16595d, this.f16594c, this.f16596e, str);
            }
            if (z10) {
                return;
            }
            a(1, str, "", str2);
        }

        public void a(boolean z10) {
            this.f16592a = z10;
        }

        private void a(int i10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, str, str2, str3));
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new RunnableC0296b(i10, j10, str, str2, str3));
        }
    }

    public static final class m extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private Context f16614a;

        /* renamed from: b, reason: collision with root package name */
        private ConcurrentHashMap<String, h> f16615b;

        /* renamed from: c, reason: collision with root package name */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f16616c;

        public m(Looper looper) {
            super(looper);
            this.f16615b = new ConcurrentHashMap<>();
            this.f16616c = new ConcurrentHashMap<>();
        }

        public void a(String str, h hVar) {
            this.f16615b.put(str, hVar);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean zA;
            Bundle data = message.getData();
            String string = data.getString(MBridgeConstans.PLACEMENT_ID);
            String string2 = data.getString(MBridgeConstans.PROPERTIES_UNIT_ID);
            String string3 = data.getString("request_id");
            String string4 = data.getString("key");
            f fVar = (f) b.f16492g.get(string4);
            h hVar = this.f16615b.get(string4);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f16616c.get(string4);
            int i10 = message.what;
            switch (i10) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                    break;
                default:
                    switch (i10) {
                        case 200:
                        case 201:
                        case AD_IS_LOADING_VALUE:
                        case AD_IS_PLAYING_VALUE:
                            if (fVar != null && hVar != null) {
                                String string5 = data.getString(PglCryptUtils.KEY_MESSAGE);
                                if (string5 == null) {
                                    string5 = "";
                                }
                                int iC = b.c(message.what);
                                String str = "resource download failed " + b.d(message.what) + " " + string5;
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = fVar.f16541h;
                                try {
                                    CampaignEx campaignEx = (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) ? null : fVar.f16541h.get(0);
                                    if (!fVar.f16534a || fVar.f16542i == null) {
                                        if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f16538e, fVar.f16535b, fVar.f16537d, fVar.f16534a, fVar.f16536c, copyOnWriteArrayList)) {
                                            hVar.a(string, string2, string3, fVar.f16541h);
                                        } else {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                                int i11 = message.what;
                                                if (i11 != 200) {
                                                    if (i11 != 201) {
                                                        if (i11 != 203) {
                                                            if (i11 == 205 && campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                                break;
                                                            }
                                                        } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                            break;
                                                        }
                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                        break;
                                                    }
                                                } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                    break;
                                                }
                                            }
                                            hVar.a(fVar.f16541h, b.b(iC, new MBridgeIds(string, string2, string3), str, null, null));
                                        }
                                        this.f16615b.remove(string4);
                                        b.f16492g.remove(string4);
                                        this.f16616c.remove(string4);
                                        break;
                                    } else if (fVar.f16536c == 1) {
                                        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                            int i12 = message.what;
                                            if (i12 == 200) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                    break;
                                                }
                                            } else if (i12 == 201) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                    break;
                                                }
                                            } else if (i12 == 203) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                    break;
                                                }
                                            } else if (i12 == 205) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                    break;
                                                } else {
                                                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = fVar.f16541h;
                                                    if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                                                        CampaignEx campaignEx2 = fVar.f16541h.get(0);
                                                        if (campaignEx2.getCMPTEntryUrl().equals(campaignEx2.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        hVar.a(fVar.f16541h, b.b(iC, new MBridgeIds(string, string2, string3), str, null, null));
                                        this.f16615b.remove(string4);
                                        b.f16492g.remove(string4);
                                        this.f16616c.remove(string4);
                                        break;
                                    } else {
                                        String string6 = data.getString("url");
                                        int i13 = message.what;
                                        if (i13 == 200) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                q0.c("RewardCampaignsResourceManager", "Is TPL but  video download fail but hit ignoreCheckRule");
                                                break;
                                            } else {
                                                for (int i14 = 0; i14 < fVar.f16542i.size(); i14++) {
                                                    if (fVar.f16542i.get(i14).getVideoUrlEncode().equals(string6)) {
                                                        fVar.f16542i.remove(i14);
                                                    }
                                                }
                                                b.f16492g.remove(string4);
                                                b.f16492g.put(string4, fVar);
                                            }
                                        } else if (i13 == 201) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                q0.c("RewardCampaignsResourceManager", "Is TPL but download endcard fail but hit ignoreCheckRule");
                                                break;
                                            } else {
                                                for (int i15 = 0; i15 < fVar.f16542i.size(); i15++) {
                                                    CampaignEx campaignEx3 = fVar.f16542i.get(i15);
                                                    if (campaignEx3.getRewardTemplateMode() != null && campaignEx3.getRewardTemplateMode().h().equals(string6)) {
                                                        fVar.f16542i.remove(i15);
                                                    }
                                                    if (!TextUtils.isEmpty(campaignEx3.getendcard_url()) && campaignEx3.getendcard_url().equals(string6)) {
                                                        fVar.f16542i.remove(i15);
                                                    }
                                                }
                                                b.f16492g.remove(string4);
                                                b.f16492g.put(string4, fVar);
                                            }
                                        } else if (i13 == 203) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                q0.c("RewardCampaignsResourceManager", "Is TPL but download template fail but hit ignoreCheckRule");
                                                break;
                                            } else {
                                                for (int i16 = 0; i16 < fVar.f16542i.size(); i16++) {
                                                    CampaignEx campaignEx4 = fVar.f16542i.get(i16);
                                                    if (campaignEx4.getRewardTemplateMode() != null && campaignEx4.getRewardTemplateMode().j().equals(string6)) {
                                                        fVar.f16542i.remove(i16);
                                                    }
                                                }
                                                b.f16492g.remove(string4);
                                                b.f16492g.put(string4, fVar);
                                            }
                                        } else if (i13 == 205) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                q0.c("RewardCampaignsResourceManager", "Is TPL but download BTL Template fail but hit ignoreCheckRule");
                                                break;
                                            } else {
                                                fVar.f16542i.clear();
                                                b.f16492g.remove(string4);
                                                b.f16492g.put(string4, fVar);
                                            }
                                        }
                                        if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f16538e, fVar.f16535b, fVar.f16537d, fVar.f16534a, fVar.f16536c, copyOnWriteArrayList)) {
                                            hVar.a(string, string2, string3, fVar.f16541h);
                                            this.f16615b.remove(string4);
                                            b.f16492g.remove(string4);
                                            this.f16616c.remove(string4);
                                            break;
                                        } else if (fVar.f16542i.size() == 0) {
                                            hVar.a(fVar.f16541h, b.b(iC, new MBridgeIds(string, string2, string3), str, null, null));
                                            this.f16615b.remove(string4);
                                            b.f16492g.remove(string4);
                                            this.f16616c.remove(string4);
                                            break;
                                        }
                                    }
                                } catch (Exception e10) {
                                    hVar.a(fVar.f16541h, b.b(iC, new MBridgeIds(string, string2, string3), str, e10, null));
                                    return;
                                }
                            }
                            break;
                    }
                    return;
            }
            if (fVar == null || hVar == null) {
                return;
            }
            try {
                zA = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f16538e, fVar.f16535b, fVar.f16537d, fVar.f16534a, fVar.f16536c, copyOnWriteArrayList);
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
                }
                zA = false;
            }
            if (zA) {
                hVar.a(string, string2, string3, fVar.f16541h);
                this.f16615b.remove(string4);
                b.f16492g.remove(string4);
                this.f16616c.remove(string4);
            }
        }

        public void a(Context context) {
            this.f16614a = context;
        }

        public void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f16616c.put(str, copyOnWriteArrayList);
        }
    }

    public interface n {
        void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    public interface o {
        void a(String str, String str2, String str3, a.C0347a c0347a, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, a.C0347a c0347a);
    }

    public static class p extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        private Handler f16617a;

        /* renamed from: b, reason: collision with root package name */
        private Runnable f16618b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16619c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f16620d;

        /* renamed from: e, reason: collision with root package name */
        private String f16621e;

        /* renamed from: f, reason: collision with root package name */
        private final o f16622f;

        /* renamed from: g, reason: collision with root package name */
        private final WindVaneWebView f16623g;

        /* renamed from: h, reason: collision with root package name */
        private final String f16624h;

        /* renamed from: i, reason: collision with root package name */
        private final String f16625i;

        /* renamed from: j, reason: collision with root package name */
        private final String f16626j;

        /* renamed from: k, reason: collision with root package name */
        private final a.C0347a f16627k;

        /* renamed from: l, reason: collision with root package name */
        private final CampaignEx f16628l;

        /* renamed from: m, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f16629m;

        /* renamed from: n, reason: collision with root package name */
        private long f16630n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f16631o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f16632p;

        /* renamed from: q, reason: collision with root package name */
        private final Runnable f16633q;

        /* renamed from: r, reason: collision with root package name */
        private final Runnable f16634r;

        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f16635a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.C0347a f16636b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f16637c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f16638d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f16639e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f16640f;

            public a(o oVar, a.C0347a c0347a, String str, String str2, String str3, String str4) {
                this.f16635a = oVar;
                this.f16636b = c0347a;
                this.f16637c = str;
                this.f16638d = str2;
                this.f16639e = str3;
                this.f16640f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                a.C0347a c0347a;
                if (this.f16635a != null && (c0347a = this.f16636b) != null) {
                    c0347a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16637c + "_" + this.f16638d + "_" + this.f16639e, true);
                    o oVar = this.f16635a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f16637c);
                    sb.append("_");
                    sb.append(this.f16639e);
                    oVar.a(sb.toString(), this.f16640f, this.f16637c, this.f16638d, this.f16639e, this.f16636b);
                }
                a.C0347a c0347a2 = this.f16636b;
                if (c0347a2 == null || (windVaneWebViewB = c0347a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        /* renamed from: com.mbridge.msdk.reward.adapter.b$p$b, reason: collision with other inner class name */
        public class RunnableC0297b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f16642a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.C0347a f16643b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f16644c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f16645d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f16646e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f16647f;

            public RunnableC0297b(o oVar, a.C0347a c0347a, String str, String str2, String str3, String str4) {
                this.f16642a = oVar;
                this.f16643b = c0347a;
                this.f16644c = str;
                this.f16645d = str2;
                this.f16646e = str3;
                this.f16647f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                a.C0347a c0347a;
                if (this.f16642a != null && (c0347a = this.f16643b) != null) {
                    c0347a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16644c + "_" + this.f16645d + "_" + this.f16646e, true);
                    o oVar = this.f16642a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f16644c);
                    sb.append("_");
                    sb.append(this.f16646e);
                    oVar.a(sb.toString(), this.f16647f, this.f16644c, this.f16645d, this.f16646e, this.f16643b);
                }
                a.C0347a c0347a2 = this.f16643b;
                if (c0347a2 == null || (windVaneWebViewB = c0347a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        public p(Handler handler, Runnable runnable, boolean z10, boolean z11, String str, o oVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, a.C0347a c0347a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j10) {
            this.f16617a = handler;
            this.f16618b = runnable;
            this.f16619c = z10;
            this.f16620d = z11;
            this.f16621e = str;
            this.f16622f = oVar;
            this.f16623g = windVaneWebView;
            this.f16624h = str2;
            this.f16625i = str4;
            this.f16626j = str3;
            this.f16627k = c0347a;
            this.f16628l = campaignEx;
            this.f16629m = copyOnWriteArrayList;
            this.f16630n = j10;
            a aVar = new a(oVar, c0347a, str4, str, str2, str3);
            this.f16634r = aVar;
            this.f16633q = new RunnableC0297b(oVar, c0347a, str4, str, str2, str3);
            if (handler != null) {
                handler.postDelayed(aVar, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i10);
            Handler handler2 = this.f16617a;
            if (handler2 != null && (runnable2 = this.f16633q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f16617a;
            if (handler3 != null && (runnable = this.f16634r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f16628l, eVar);
            } catch (Throwable th) {
                q0.b("WindVaneWebView", th.getMessage());
            }
            if (this.f16632p) {
                return;
            }
            String str = this.f16625i + "_" + this.f16624h;
            if (i10 == 1) {
                Runnable runnable3 = this.f16618b;
                if (runnable3 != null && (handler = this.f16617a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16625i + "_" + this.f16621e + "_" + this.f16624h, true);
                a.C0347a c0347a = this.f16627k;
                if (c0347a != null) {
                    c0347a.a(true);
                }
                if (this.f16619c) {
                    if (this.f16620d) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f16628l.getRequestIdNotice(), this.f16627k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f16628l.getRequestIdNotice(), this.f16627k);
                    }
                } else if (this.f16620d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f16628l.getRequestIdNotice(), this.f16627k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f16628l.getRequestIdNotice(), this.f16627k);
                }
                o oVar = this.f16622f;
                if (oVar != null) {
                    oVar.a(str, this.f16626j, this.f16625i, this.f16621e, this.f16624h, this.f16627k);
                }
            } else if (this.f16622f != null) {
                this.f16622f.a(str, this.f16621e, this.f16624h, this.f16627k, b.b(880009, new MBridgeIds(this.f16626j, this.f16625i, this.f16621e), "readyState:" + i10, null, this.f16628l));
            }
            this.f16632p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            Handler handler2 = this.f16617a;
            if (handler2 != null && (runnable2 = this.f16634r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f16631o) {
                return;
            }
            if (str.contains("wfr=1")) {
                Handler handler3 = this.f16617a;
                if (handler3 != null && (runnable = this.f16633q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            } else {
                String str2 = this.f16625i + "_" + this.f16624h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16625i + "_" + this.f16621e + "_" + this.f16624h, true);
                Runnable runnable3 = this.f16618b;
                if (runnable3 != null && (handler = this.f16617a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                a.C0347a c0347a = this.f16627k;
                if (c0347a != null) {
                    c0347a.a(true);
                }
                if (this.f16619c) {
                    if (this.f16628l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f16628l.getRequestIdNotice(), this.f16627k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f16628l.getRequestIdNotice(), this.f16627k);
                    }
                } else if (this.f16628l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f16628l.getRequestIdNotice(), this.f16627k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f16628l.getRequestIdNotice(), this.f16627k);
                }
                o oVar = this.f16622f;
                if (oVar != null) {
                    oVar.a(str2, this.f16626j, this.f16625i, this.f16621e, this.f16624h, this.f16627k);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f16631o = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16625i + "_" + this.f16621e + "_" + this.f16624h, false);
            Handler handler = this.f16617a;
            if (handler != null) {
                if (this.f16633q != null) {
                    handler.removeCallbacks(this.f16634r);
                }
                Runnable runnable = this.f16633q;
                if (runnable != null) {
                    this.f16617a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f16625i + "_" + this.f16624h;
                a.C0347a c0347a = this.f16627k;
                if (c0347a != null) {
                    c0347a.a(false);
                }
                if (this.f16622f != null) {
                    this.f16622f.a(str3, this.f16621e, str2, this.f16627k, b.b(880009, new MBridgeIds(this.f16626j, this.f16625i, this.f16621e), i10 + "#" + str, null, this.f16628l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16625i + "_" + this.f16621e + "_" + this.f16624h, false);
            Handler handler = this.f16617a;
            if (handler != null) {
                if (this.f16633q != null) {
                    handler.removeCallbacks(this.f16634r);
                }
                Runnable runnable = this.f16633q;
                if (runnable != null) {
                    this.f16617a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f16625i + "_" + this.f16624h;
                a.C0347a c0347a = this.f16627k;
                if (c0347a != null) {
                    c0347a.a(false);
                }
                if (this.f16622f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.f16626j, this.f16625i, this.f16621e);
                    StringBuilder sb = new StringBuilder();
                    sb.append("onReceivedSslError:");
                    sb.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f16622f.a(str, this.f16621e, this.f16624h, this.f16627k, b.b(880009, mBridgeIds, sb.toString(), null, this.f16628l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }
    }

    public static class q extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        private String f16649a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f16650b;

        /* renamed from: c, reason: collision with root package name */
        private final WindVaneWebView f16651c;

        /* renamed from: d, reason: collision with root package name */
        private final String f16652d;

        /* renamed from: e, reason: collision with root package name */
        private final String f16653e;

        /* renamed from: f, reason: collision with root package name */
        private final a.C0347a f16654f;

        /* renamed from: g, reason: collision with root package name */
        private final CampaignEx f16655g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f16656h;

        /* renamed from: i, reason: collision with root package name */
        private String f16657i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f16658j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f16659k;

        public q(String str, boolean z10, WindVaneWebView windVaneWebView, String str2, String str3, a.C0347a c0347a, CampaignEx campaignEx, boolean z11, String str4) {
            this.f16650b = z10;
            this.f16651c = windVaneWebView;
            this.f16652d = str2;
            this.f16653e = str3;
            this.f16654f = c0347a;
            this.f16655g = campaignEx;
            this.f16649a = str;
            this.f16656h = z11;
            this.f16657i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) throws JSONException {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f16655g, eVar);
            } catch (Throwable th) {
                q0.b("WindVaneWebView", th.getMessage());
            }
            if (this.f16659k) {
                return;
            }
            if (this.f16651c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f16649a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i10);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f16651c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
            String str = this.f16653e + "_" + this.f16655g.getId() + "_" + this.f16655g.getRequestId() + "_" + this.f16652d;
            if (i10 == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16653e + "_" + this.f16657i + "_" + this.f16652d, true);
                a.C0347a c0347a = this.f16654f;
                if (c0347a != null) {
                    c0347a.a(true);
                }
                if (this.f16650b) {
                    if (this.f16655g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f16654f, false, this.f16656h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f16654f, false, this.f16656h);
                    }
                } else if (this.f16655g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f16654f, false, this.f16656h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f16654f, false, this.f16656h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16653e + "_" + this.f16657i + "_" + this.f16652d, false);
                a.C0347a c0347a2 = this.f16654f;
                if (c0347a2 != null) {
                    c0347a2.a(false);
                }
            }
            this.f16659k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) throws JSONException {
            if (this.f16658j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f16651c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f16649a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f16651c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("WindVaneWebView", e10.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16653e + "_" + this.f16657i + "_" + this.f16652d, true);
                a.C0347a c0347a = this.f16654f;
                if (c0347a != null) {
                    c0347a.a(true);
                }
                String str2 = this.f16653e + "_" + this.f16655g.getId() + "_" + this.f16655g.getRequestId() + "_" + this.f16652d;
                if (this.f16650b) {
                    if (this.f16655g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f16655g.getRequestIdNotice(), this.f16654f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f16654f, false, this.f16656h);
                    }
                } else if (this.f16655g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f16655g.getRequestIdNotice(), this.f16654f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f16654f, false, this.f16656h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f16658j = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) throws JSONException {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16653e + "_" + this.f16657i + "_" + this.f16652d, false);
            a.C0347a c0347a = this.f16654f;
            if (c0347a != null) {
                c0347a.a(false);
            }
            if (this.f16651c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f16649a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f16651c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
        }
    }

    public static final class r {

        /* renamed from: a, reason: collision with root package name */
        private static final b f16660a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i10) {
        if (i10 == 200) {
            return 880004;
        }
        if (i10 == 201) {
            return 880007;
        }
        if (i10 != 203) {
            return i10 != 205 ? 880024 : 880005;
        }
        return 880006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String d(int i10) {
        return i10 != 200 ? i10 != 201 ? i10 != 203 ? i10 != 205 ? "unknown" : "tpl" : "temp" : "zip/html" : "video";
    }

    private b() {
        this.f16495c = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.f16496d = "down_type";
        this.f16497e = "h3c";
        this.f16498f = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f16492g = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f16493a = new m(handlerThread.getLooper());
    }

    public void c() {
    }

    public static b b() {
        return r.f16660a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            q0.b("RewardCampaignsResourceManager", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mbridge.msdk.foundation.error.b b(int i10, MBridgeIds mBridgeIds, String str, Throwable th, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i10);
        bVar.a(mBridgeIds);
        bVar.a(th);
        bVar.c(str);
        bVar.a(campaignEx);
        return bVar;
    }

    public static final class k implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f16587a;

        /* renamed from: b, reason: collision with root package name */
        private final String f16588b;

        /* renamed from: c, reason: collision with root package name */
        private final String f16589c;

        /* renamed from: d, reason: collision with root package name */
        private final String f16590d;

        /* renamed from: e, reason: collision with root package name */
        private final String f16591e;

        public k(Handler handler, String str, String str2, String str3, String str4) {
            this.f16587a = handler;
            this.f16589c = str;
            this.f16588b = str2;
            this.f16590d = str3;
            this.f16591e = str4;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16588b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16589c);
            bundle.putString("request_id", this.f16590d);
            bundle.putString("key", this.f16591e);
            bundle.putString("url", str);
            messageObtain.setData(bundle);
            this.f16587a.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f16588b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f16589c);
            bundle.putString("request_id", this.f16590d);
            bundle.putString("url", str2);
            bundle.putString("key", this.f16591e);
            bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
            messageObtain.setData(bundle);
            this.f16587a.sendMessage(messageObtain);
        }
    }

    public synchronized void a(Context context, boolean z10, int i10, boolean z11, int i11, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, h hVar, n nVar) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        String str4 = str2 + "_" + str3 + "_" + copyOnWriteArrayList2.get(0).getSecondRequestIndex();
        f16492g.put(str4, new f(z10, z11, i10, copyOnWriteArrayList2.size(), str2, str3, i11, copyOnWriteArrayList2));
        this.f16493a.a(str4, hVar);
        this.f16493a.a(context);
        this.f16493a.a(str4, copyOnWriteArrayList2);
        this.f16493a.post(new a(copyOnWriteArrayList2, context, str2, i11, str, str3, str4, nVar));
    }

    /* renamed from: com.mbridge.msdk.reward.adapter.b$b, reason: collision with other inner class name */
    public class C0295b implements z.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f16508a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f16509b;

        public C0295b(int i10, CampaignEx campaignEx) {
            this.f16508a = i10;
            this.f16509b = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i10 = this.f16508a;
                if (i10 == 0) {
                    nVar.e(1);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 1) {
                    nVar.e(2);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 2) {
                    nVar.e(3);
                    nVar.d(1);
                    nVar.j("m_download_end");
                    nVar.b(this.f16509b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                    nVar.f("1");
                }
                nVar.o(this.f16509b.getRequestIdNotice());
                nVar.b("url", str);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f16509b);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i10 = this.f16508a;
            if (i10 == 0) {
                nVar.e(1);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 1) {
                nVar.e(2);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 2) {
                nVar.e(3);
                nVar.d(3);
                nVar.j("m_download_end");
                nVar.b(this.f16509b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                nVar.f("1");
            }
            b.b(nVar, this.f16509b);
            nVar.o(this.f16509b.getRequestIdNotice());
            nVar.m(message);
            nVar.b("scenes", "1");
            nVar.b("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f16509b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, CampaignEx campaignEx, String str, String str2) {
        z.a(i10, str, str2, new C0295b(i10, campaignEx), campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean zIsEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                l lVar = new l(context, str, str2, str3, campaignEx, 497, this.f16493a, nVar, copyOnWriteArrayList);
                lVar.a(zIsEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, lVar);
                return;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            i iVar = new i(497, str, str2, str3, campaignEx, nVar, this.f16493a, copyOnWriteArrayList);
            iVar.a(zIsEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, iVar);
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
            }
        }
    }

    public static class g extends com.mbridge.msdk.mbsignalcommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f16543a;

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f16544b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16545c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f16546d;

        /* renamed from: e, reason: collision with root package name */
        private int f16547e;

        /* renamed from: f, reason: collision with root package name */
        private String f16548f;

        /* renamed from: g, reason: collision with root package name */
        private String f16549g;

        /* renamed from: h, reason: collision with root package name */
        private String f16550h;

        /* renamed from: i, reason: collision with root package name */
        private String f16551i;

        /* renamed from: j, reason: collision with root package name */
        private a.C0347a f16552j;

        /* renamed from: k, reason: collision with root package name */
        private CampaignEx f16553k;

        /* renamed from: l, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f16554l;

        /* renamed from: m, reason: collision with root package name */
        private com.mbridge.msdk.videocommon.setting.c f16555m;

        /* renamed from: n, reason: collision with root package name */
        private final o f16556n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f16557o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f16558p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f16559q;

        /* renamed from: r, reason: collision with root package name */
        private int f16560r = 0;

        /* renamed from: s, reason: collision with root package name */
        private boolean f16561s;

        /* renamed from: t, reason: collision with root package name */
        private long f16562t;

        public g(boolean z10, Handler handler, Runnable runnable, boolean z11, boolean z12, int i10, String str, String str2, String str3, String str4, a.C0347a c0347a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13, long j10) {
            this.f16543a = handler;
            this.f16544b = runnable;
            this.f16545c = z11;
            this.f16546d = z12;
            this.f16547e = i10;
            this.f16548f = str;
            this.f16550h = str2;
            this.f16549g = str3;
            this.f16551i = str4;
            this.f16552j = c0347a;
            this.f16553k = campaignEx;
            this.f16554l = copyOnWriteArrayList;
            this.f16555m = cVar;
            this.f16556n = oVar;
            this.f16557o = z13;
            this.f16561s = z10;
            this.f16562t = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 1);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f16553k, eVar);
            } catch (Throwable th) {
                q0.b("RVWindVaneWebView", th.getMessage());
            }
            if (this.f16559q) {
                return;
            }
            String str = this.f16549g + "_" + this.f16548f;
            if (i10 == 1) {
                if (this.f16557o) {
                    com.mbridge.msdk.videocommon.a.d(this.f16549g + "_" + this.f16551i);
                } else {
                    com.mbridge.msdk.videocommon.a.c(this.f16549g + "_" + this.f16551i);
                }
                com.mbridge.msdk.videocommon.a.a(this.f16549g + "_" + this.f16551i + "_" + this.f16548f, this.f16552j, true, this.f16557o);
                Handler handler = this.f16543a;
                if (handler != null && (runnable = this.f16544b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16549g + "_" + this.f16551i + "_" + this.f16548f, true);
                a.C0347a c0347a = this.f16552j;
                if (c0347a != null) {
                    c0347a.a(true);
                }
                o oVar = this.f16556n;
                if (oVar != null) {
                    oVar.a(str, this.f16550h, this.f16549g, this.f16551i, this.f16548f, this.f16552j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16549g + "_" + this.f16551i + "_" + this.f16548f, false);
                a.C0347a c0347a2 = this.f16552j;
                if (c0347a2 != null) {
                    c0347a2.a(false);
                }
                if (this.f16556n != null) {
                    this.f16556n.a(str, this.f16551i, this.f16548f, this.f16552j, b.b(880008, new MBridgeIds(this.f16550h, this.f16549g, this.f16551i), "readyState:" + i10, null, this.f16553k));
                }
            }
            this.f16559q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (this.f16558p) {
                return;
            }
            String str2 = this.f16549g + "_" + this.f16548f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16549g + "_" + this.f16551i + "_" + this.f16548f, true);
                Handler handler = this.f16543a;
                if (handler != null && (runnable = this.f16544b) != null) {
                    handler.removeCallbacks(runnable);
                }
                a.C0347a c0347a = this.f16552j;
                if (c0347a != null) {
                    c0347a.a(true);
                }
                o oVar = this.f16556n;
                if (oVar != null) {
                    oVar.a(str2, this.f16550h, this.f16549g, this.f16551i, this.f16548f, this.f16552j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f16558p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i10, String str, String str2) {
            super.onReceivedError(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f16549g + "_" + this.f16551i + "_" + this.f16548f, false);
            if (this.f16556n != null) {
                String str3 = this.f16549g + "_" + this.f16548f;
                a.C0347a c0347a = this.f16552j;
                if (c0347a != null) {
                    c0347a.a(false);
                }
                this.f16556n.a(str3, this.f16551i, this.f16548f, this.f16552j, b.b(880008, new MBridgeIds(this.f16550h, this.f16549g, this.f16551i), "onReceivedError： " + i10 + "  " + str, null, this.f16553k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            if (webView != null) {
                try {
                    com.mbridge.msdk.video.bt.component.d.c().c(this.f16549g, this.f16551i);
                } catch (Throwable th) {
                    q0.b("RVWindVaneWebView", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(WebView webView, String str, String str2, int i10, int i11) {
            boolean z10 = true;
            if (i10 == 1) {
                try {
                    com.mbridge.msdk.reward.controller.a aVar = new com.mbridge.msdk.reward.controller.a();
                    aVar.e(false);
                    if (i11 != 2) {
                        z10 = false;
                    }
                    aVar.d(z10);
                    aVar.c(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.orglistener.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, i11, str2, true, 1));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RVWindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String strOptString = new JSONObject(str).optString("id");
                    com.mbridge.msdk.video.bt.component.d.c().b(obj, strOptString);
                    String strF = com.mbridge.msdk.video.bt.component.d.c().f(strOptString);
                    CampaignEx campaignExC = com.mbridge.msdk.video.bt.component.d.c().c(strOptString);
                    com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.video.bt.component.d.c().d(strOptString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(campaignExC);
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f16244b;
                    if (windVaneWebView != null) {
                        b.b().a(this.f16561s, windVaneWebView, campaignExC, (CopyOnWriteArrayList<CampaignEx>) copyOnWriteArrayList, cVarD, strF, strOptString, this.f16560r == 0 ? 3 : 6);
                        this.f16560r++;
                    }
                } catch (Throwable th) {
                    q0.b("RVWindVaneWebView", th.getMessage());
                }
            }
        }
    }

    public synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, n nVar) {
        try {
            this.f16493a.a(context);
            if (campaignEx != null) {
                String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                if (campaignEx.isDynamicView()) {
                    if (v0.c(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                        a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                    }
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 105;
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString("request_id", str3);
                    bundle.putString("key", str2 + "_" + str3 + "_" + campaignEx.getSecondRequestIndex());
                    bundle.putString("url", cMPTEntryUrl);
                    messageObtain.setData(bundle);
                    this.f16493a.sendMessage(messageObtain);
                    if (nVar != null) {
                        nVar.a(str, str2, str3, cMPTEntryUrl);
                    }
                    return;
                }
            }
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
                    if (cVarB == null) {
                        cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = cVarB;
                    cVar.a(campaignEx);
                    cVar.e(1);
                    cVar.f(a(campaignEx));
                    H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getCMPTEntryUrl(), new c(str2, str, str3, campaignEx, nVar, context));
                } catch (Exception e10) {
                    q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i10, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(campaignEx, context, i10, str, str2, str3, str4));
    }

    public synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, WindVaneWebView windVaneWebView, String str, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, String str4, String str5, String str6, com.mbridge.msdk.videocommon.setting.c cVar, o oVar) {
        String str7;
        String str8;
        com.mbridge.msdk.video.signal.impl.k kVar;
        String str9 = str4;
        synchronized (this) {
            String str10 = str9 + "_" + str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
            } catch (Exception e10) {
                e = e10;
                str7 = str5;
                str8 = str10;
            }
            if (v0.i(str)) {
                if (oVar != null) {
                    try {
                        oVar.a(str10, str3, str9, str5, str, null);
                    } catch (Exception e11) {
                        e = e11;
                        str8 = str10;
                    }
                }
                return;
            }
            str8 = str10;
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
                a.C0347a c0347a = new a.C0347a();
                try {
                    try {
                        WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                        if (campaignEx != null) {
                            windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                        }
                        windVaneWebView2.setTempTypeForMetrics(2);
                        try {
                            c0347a.a(windVaneWebView2);
                            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                            } else {
                                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                            }
                            com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
                            kVar2.g(i10);
                            kVar2.setUnitId(str9);
                            kVar2.setRewardUnitSetting(cVar);
                            kVar2.d(z10);
                            str7 = str5;
                            try {
                                windVaneWebView2.setWebViewListener(new p(handler, null, z11, z12, str7, oVar, windVaneWebView, str, str3, str9, c0347a, campaignEx, copyOnWriteArrayList, jCurrentTimeMillis));
                                windVaneWebView2.setObject(kVar2);
                                windVaneWebView2.loadUrl(str2);
                                windVaneWebView2.setRid(str7);
                            } catch (Exception e12) {
                                e = e12;
                                str9 = str9;
                            }
                        } catch (Exception e13) {
                            e = e13;
                        }
                    } catch (Exception unused) {
                        if (oVar != null) {
                            c0347a.a(true);
                            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str9 + "_" + str5 + "_" + str, true);
                            StringBuilder sb = new StringBuilder();
                            sb.append(str9);
                            sb.append("_");
                            sb.append(str);
                            oVar.a(sb.toString(), str3, str9, str5, str, c0347a);
                            return;
                        }
                        return;
                    } catch (Throwable unused2) {
                        if (oVar != null) {
                            c0347a.a(true);
                            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str9 + "_" + str5 + "_" + str, true);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str9);
                            sb2.append("_");
                            sb2.append(str);
                            oVar.a(sb2.toString(), str3, str9, str5, str, c0347a);
                            return;
                        }
                        return;
                    }
                } catch (Exception e14) {
                    e = e14;
                }
            } catch (Exception e15) {
                e = e15;
            }
            str7 = str5;
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
            }
            if (oVar != null) {
                oVar.a(str8, str7, str, null, b(880009, new MBridgeIds(str3, str9, str7), "", e, campaignEx));
            }
        }
    }

    public synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, String str, String str2, String str3, String str4, String str5, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str6, String str7, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13) {
        String str8;
        a.C0347a c0347a;
        WindVaneWebView windVaneWebView;
        String strB;
        String strB2;
        com.mbridge.msdk.video.signal.impl.k kVar;
        com.mbridge.msdk.video.signal.impl.k kVar2;
        String str9 = str4;
        synchronized (this) {
            this.f16494b = z13;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str10 = str9 + "_" + str5;
            this.f16494b = z13;
            if (v0.i(str5)) {
                if (oVar != null) {
                    oVar.a(str10, str3, str9, str, str5, null);
                }
                return;
            }
            try {
                q0.a("RewardCampaignsResourceManager", "开始预加载大模板资源");
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
                c0347a = new a.C0347a();
                windVaneWebView = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                if (campaignEx != null) {
                    windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                windVaneWebView.setTempTypeForMetrics(1);
                c0347a.a(windVaneWebView);
                strB = com.mbridge.msdk.video.bt.component.d.c().b();
                strB2 = com.mbridge.msdk.video.bt.component.d.c().b();
                c0347a.a(strB2);
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str9);
                    if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                        for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                            CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                            for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                                if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                    campaignEx2.setReady(true);
                                    copyOnWriteArrayList.set(i11, campaignEx2);
                                }
                            }
                        }
                    }
                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                } else {
                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                }
                kVar.g(i10);
                kVar.setUnitId(str7);
                kVar.c(strB2);
                kVar.d(strB);
                kVar.c(true);
                kVar.setRewardUnitSetting(cVar);
                kVar.d(z10);
                kVar2 = kVar;
                try {
                    str9 = str4;
                    str8 = str;
                } catch (Exception e10) {
                    e = e10;
                    str9 = str4;
                    str8 = str;
                }
            } catch (Exception e11) {
                e = e11;
                str8 = str;
            }
            try {
                windVaneWebView.setWebViewListener(new g(z10, handler, null, z11, z12, i10, str5, str3, str4, str, c0347a, campaignEx, copyOnWriteArrayList, cVar, oVar, z13, jCurrentTimeMillis));
                windVaneWebView.setObject(kVar2);
                windVaneWebView.loadUrl(str6);
                windVaneWebView.setRid(str8);
                MBridgeBTRootLayout mBridgeBTRootLayout = new MBridgeBTRootLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                mBridgeBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                mBridgeBTRootLayout.setInstanceId(strB);
                mBridgeBTRootLayout.setUnitId(str9);
                MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                mBridgeBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                mBridgeBTLayout.setInstanceId(strB2);
                mBridgeBTLayout.setUnitId(str9);
                mBridgeBTLayout.setWebView(windVaneWebView);
                LinkedHashMap<String, View> linkedHashMapB = com.mbridge.msdk.video.bt.component.d.c().b(str9, str8);
                linkedHashMapB.put(strB2, mBridgeBTLayout);
                linkedHashMapB.put(strB, mBridgeBTRootLayout);
                mBridgeBTRootLayout.addView(mBridgeBTLayout, new FrameLayout.LayoutParams(-1, -1));
            } catch (Exception e12) {
                e = e12;
                if (oVar != null) {
                    oVar.a(str10, str8, str5, null, b(880008, new MBridgeIds(str3, str9, str8), "", e, campaignEx));
                }
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, String str, String str2, int i10) throws JSONException {
        if (windVaneWebView != null) {
            if (campaignEx != null && cVar != null && campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) && campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                    q0.a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new e(z10, windVaneWebView, campaignEx, copyOnWriteArrayList, str, cVar, str2), i10 * 1000);
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, String str, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, com.mbridge.msdk.videocommon.setting.c cVar, String str4, boolean z11) {
        com.mbridge.msdk.video.signal.impl.k kVar;
        String requestId;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a(HandleInvocationsFromAdViewer.KEY_AD_TYPE, 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            a.C0347a c0347a = new a.C0347a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c0347a.a(windVaneWebView2);
            String requestId2 = "";
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str3);
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                        for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i11, campaignEx2);
                            }
                        }
                    }
                }
                com.mbridge.msdk.video.signal.impl.k kVar2 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                requestId = copyOnWriteArrayList.get(0).getRequestId();
                kVar = kVar2;
            } else {
                com.mbridge.msdk.video.signal.impl.k kVar3 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                if (campaignEx != null) {
                    requestId2 = campaignEx.getRequestId();
                }
                kVar = kVar3;
                requestId = requestId2;
            }
            kVar.g(i10);
            kVar.setUnitId(str3);
            kVar.c(str4);
            kVar.setRewardUnitSetting(cVar);
            kVar.d(z10);
            windVaneWebView2.setWebViewListener(new q(str4, false, windVaneWebView, str, str3, c0347a, campaignEx, z11, requestId));
            windVaneWebView2.setObject(kVar);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(requestId);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
            }
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th) {
            q0.b("RewardCampaignsResourceManager", th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = campaignEx != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid()) : null;
        if (cVarB == null) {
            cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        cVarB.a(campaignEx);
        cVarB.f(a(campaignEx));
        cVarB.e(i10);
        return cVarB;
    }
}
