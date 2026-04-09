package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.m;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class a implements Serializable {
    private int A;
    private File B;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private com.mbridge.msdk.setting.l H;
    private com.mbridge.msdk.videocommon.setting.c I;
    private com.mbridge.msdk.setting.l J;

    /* renamed from: b, reason: collision with root package name */
    private int f19602b;

    /* renamed from: c, reason: collision with root package name */
    private int f19603c;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f19607g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f19608h;

    /* renamed from: i, reason: collision with root package name */
    private CampaignEx f19609i;

    /* renamed from: j, reason: collision with root package name */
    private String f19610j;

    /* renamed from: k, reason: collision with root package name */
    private Context f19611k;

    /* renamed from: l, reason: collision with root package name */
    private long f19612l;

    /* renamed from: m, reason: collision with root package name */
    private String f19613m;

    /* renamed from: n, reason: collision with root package name */
    private String f19614n;

    /* renamed from: p, reason: collision with root package name */
    private String f19616p;

    /* renamed from: r, reason: collision with root package name */
    private long f19618r;

    /* renamed from: u, reason: collision with root package name */
    private m f19621u;

    /* renamed from: w, reason: collision with root package name */
    private String f19623w;

    /* renamed from: x, reason: collision with root package name */
    private DownloadRequest f19624x;

    /* renamed from: y, reason: collision with root package name */
    private int f19625y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f19626z;

    /* renamed from: a, reason: collision with root package name */
    private boolean f19601a = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19604d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f19605e = 0;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> f19606f = new CopyOnWriteArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    private long f19615o = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19617q = false;

    /* renamed from: s, reason: collision with root package name */
    private int f19619s = 100;

    /* renamed from: t, reason: collision with root package name */
    private boolean f19620t = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f19622v = false;
    private int C = 1;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private boolean O = false;
    private boolean P = false;
    private boolean Q = false;
    private OnDownloadStateListener R = new b();
    private OnProgressStateListener S = new c();

    /* renamed from: com.mbridge.msdk.videocommon.download.a$a, reason: collision with other inner class name */
    public class RunnableC0349a implements Runnable {
        public RunnableC0349a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f19621u == null) {
                a.this.f19621u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            try {
                try {
                    a.this.f19621u.a(a.this.f19613m);
                    if (!s0.a().a("r_d_v_b_l", true)) {
                        File file = new File(a.this.f19616p);
                        if (file.exists() && file.isFile()) {
                            file.delete();
                        }
                    }
                } catch (Throwable unused) {
                    q0.b("CampaignDownLoadTask", "del DB or file failed");
                }
            } finally {
                a.this.f19605e = 0;
            }
        }
    }

    public class b implements OnDownloadStateListener {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                q0.b("CampaignDownLoadTask", "onDownloadComplete callback : " + a.this.f19615o + "    " + a.this.f19612l);
                if (a.this.f19621u == null) {
                    a.this.f19621u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                }
                a.this.f19621u.a(a.this.f19613m, a.this.f19615o, 5, a.this.f19612l);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th) {
                        q0.b("CampaignDownLoadTask", th.getMessage());
                    }
                } else {
                    str = "";
                }
                a aVar = a.this;
                aVar.a(aVar.f19615o, true, str);
                a.this.a(1, true, "");
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            if (a.this.f19624x == null || a.this.f19624x.getStatus() == DownloadStatus.CANCELLED) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", a.this.f19624x.get("cache", "2"));
            a aVar = a.this;
            aVar.a(aVar.f19609i, eVar);
            String message = (downloadError == null || downloadError.getException() == null) ? "Video Download Error" : downloadError.getException().getMessage();
            a.this.r();
            a.this.a(3, message, "");
            a.this.b(message);
            a aVar2 = a.this;
            aVar2.a(3, aVar2.f19626z, message);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
            a.this.f19605e = 1;
            if (a.this.f19621u == null) {
                a.this.f19621u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            a.this.f19621u.a(a.this.f19609i, a.this.f19612l, a.this.f19616p, a.this.f19605e);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onResponseStart(DownloadMessage downloadMessage) {
        }
    }

    public class c implements OnProgressStateListener {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", a.this.f19624x.get("cache", "2"));
                a aVar = a.this;
                aVar.a(aVar.f19609i, eVar);
                a.this.f19615o = downloadProgress.getCurrent();
                a.this.f19612l = downloadProgress.getTotal();
                a.this.f19625y = downloadProgress.getCurrentDownloadRate();
                if (a.this.f19619s != 100 && downloadProgress.getCurrentDownloadRate() >= a.this.f19619s) {
                    q0.b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + a.this.f19619s + " " + a.this.f19603c);
                    if (a.this.f19604d) {
                        return;
                    }
                    a.this.f19604d = true;
                    if (!a.this.f19626z) {
                        a.this.a(1, true, "");
                        a.this.a(downloadProgress.getCurrent(), false, "");
                    }
                    if (a.this.f19624x == null || a.this.C != 2 || a.this.f19626z) {
                        return;
                    }
                    a.this.f19624x.cancel(downloadMessage);
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }
    }

    public a(Context context, CampaignEx campaignEx, String str, int i10) throws IOException {
        this.f19602b = 1;
        this.G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarB != null) {
            this.G = gVarB.H0();
        }
        this.D = com.mbridge.msdk.foundation.same.a.f15046u;
        this.E = com.mbridge.msdk.foundation.same.a.f15047v;
        this.F = com.mbridge.msdk.foundation.same.a.f15045t;
        this.f19618r = System.currentTimeMillis();
        this.f19611k = com.mbridge.msdk.foundation.controller.c.n().d();
        this.f19609i = campaignEx;
        this.f19610j = str;
        this.f19602b = i10;
        if (campaignEx != null) {
            this.f19613m = campaignEx.getVideoUrlEncode();
        }
        this.f19623w = o0.d(this.f19613m);
        this.f19614n = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC) + File.separator;
        this.f19616p = this.f19614n + this.f19623w;
        q0.c("CampaignDownLoadTask", this.f19609i.getAppName() + " videoLocalPath:" + this.f19616p + " videoUrl: " + this.f19609i.getVideoUrlEncode() + " " + this.f19619s);
        q();
    }

    private void q() throws IOException {
        File file;
        File file2;
        try {
            if (TextUtils.isEmpty(this.f19613m)) {
                return;
            }
            if (TextUtils.isEmpty(this.f19614n)) {
                file = null;
            } else {
                file = new File(this.f19614n);
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            if (file != null && file.exists() && ((file2 = this.B) == null || !file2.exists())) {
                File file3 = new File(file + "/.nomedia");
                this.B = file3;
                if (!file3.exists()) {
                    this.B.createNewFile();
                }
            }
            z();
            a(this.f19613m);
        } catch (Exception e10) {
            q0.c("CampaignDownLoadTask", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        try {
            v0.a(this.f19610j, this.f19609i, com.mbridge.msdk.foundation.same.a.f15049x);
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    private void z() {
        if (this.f19621u == null) {
            this.f19621u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        com.mbridge.msdk.foundation.entity.m mVarB = this.f19621u.b(this.f19613m, "");
        if (mVarB != null) {
            this.f19615o = mVarB.c();
            if (this.f19605e != 2) {
                this.f19605e = mVarB.b();
            }
            if (this.f19605e == 1) {
                this.f19605e = 2;
            }
            this.f19612l = mVarB.d();
            if (mVarB.a() > 0) {
                this.f19618r = mVarB.a();
            }
            if (this.f19605e == 5) {
                if (Objects.exists(new File(this.f19614n + this.f19623w), this.f19614n, this.f19623w)) {
                    this.f19616p = this.f19614n + this.f19623w;
                } else {
                    d();
                }
            } else if (this.f19605e != 0) {
                this.f19616p = this.f19614n + this.f19623w;
            }
        } else {
            this.f19621u.a(this.f19613m, this.f19618r);
        }
        try {
            long j10 = this.f19612l;
            if (j10 <= 0 || this.f19615o * 100 < j10 * c(this.f19609i)) {
                return;
            }
            if (c(this.f19609i) != 100 && this.f19605e != 5) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            a(this.f19609i, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public void A() {
        if (this.Q) {
            return;
        }
        try {
            this.f19626z = true;
            if (this.C == 1) {
                q0.b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.C);
                return;
            }
            if (this.f19602b == 3) {
                q0.b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.f19602b);
                return;
            }
            q0.b("CampaignDownLoadTask", "resume()");
            this.O = false;
            this.P = false;
            DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.f19613m, this.f19623w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            downloadMessage.setUseCronetDownload(a(this.f19609i));
            DownloadRequest<?> downloadRequestA = a(downloadMessage, this.R, this.S, "2");
            this.f19624x = downloadRequestA;
            downloadRequestA.start();
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    public void B() {
        q0.b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.f19613m)) {
                return;
            }
            if (i() != null) {
                q0.b("CampaignDownLoadTask", new URL(i()).getPath());
            }
            if (this.f19619s == 0 && this.C == 2) {
                q0.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.f19624x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f19607g;
            if (aVar != null) {
                aVar.a("VideoUrl is not illegal, Please check it.", "");
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f19608h;
            if (aVar2 != null) {
                aVar2.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public void C() {
        q0.b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.f19613m)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f19607g;
                if (aVar != null) {
                    aVar.a(this.f19613m);
                    return;
                }
                return;
            }
            if (i() != null) {
                q0.b("CampaignDownLoadTask", new URL(i()).getPath());
            }
            if (this.f19602b == 3) {
                q0.b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f19607g;
                if (aVar2 != null) {
                    aVar2.a(this.f19613m);
                    return;
                }
                return;
            }
            if (this.f19619s == 0 && this.C == 2) {
                q0.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f19607g;
                if (aVar3 != null) {
                    aVar3.a(this.f19613m);
                    return;
                }
                return;
            }
            try {
                if (this.f19605e == 5 && Utils.getDownloadRate(this.f19612l, this.f19615o) >= this.f19619s) {
                    if (Objects.exists(new File(this.f19614n + this.f19623w), this.f19614n, this.f19623w)) {
                        this.f19616p = this.f19614n + this.f19623w;
                        com.mbridge.msdk.videocommon.listener.a aVar4 = this.f19607g;
                        if (aVar4 != null) {
                            aVar4.a(this.f19613m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", "startForLoadRefactor: " + e10.getMessage());
            }
            DownloadRequest downloadRequest = this.f19624x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar5 = this.f19607g;
            if (aVar5 != null) {
                aVar5.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public int o() {
        return this.f19605e;
    }

    public String p() {
        return this.f19616p;
    }

    public boolean s() {
        return this.K;
    }

    public boolean t() {
        return this.f19622v;
    }

    public boolean u() {
        return this.L;
    }

    public boolean v() {
        return this.Q;
    }

    public boolean w() {
        return this.N;
    }

    public boolean x() {
        return this.M;
    }

    public void y() {
        if (this.f19606f != null) {
            this.f19606f = null;
        }
    }

    public void c(boolean z10) {
        this.L = z10;
    }

    public void d(boolean z10) {
        this.f19617q = z10;
    }

    public void e(boolean z10) {
        this.N = z10;
    }

    public void f(boolean z10) {
        this.M = z10;
    }

    public void g() {
        try {
            d();
            CampaignEx campaignEx = this.f19609i;
            if (campaignEx == null || campaignEx.getPlayable_ads_without_video() != 2) {
                com.mbridge.msdk.videocommon.cache.a aVarA = com.mbridge.msdk.videocommon.cache.a.a();
                if (aVarA != null) {
                    aVarA.a(this.f19609i);
                }
            }
        } catch (Exception unused) {
            q0.b("CampaignDownLoadTask", "del file is failed");
        } finally {
            this.f19605e = 0;
        }
    }

    public CampaignEx h() {
        return this.f19609i;
    }

    public String i() {
        return this.f19613m;
    }

    public long j() {
        return this.f19612l;
    }

    public String k() {
        String message = "";
        if (this.f19602b == 3) {
            return "";
        }
        String str = this.f19614n + this.f19623w;
        File file = new File(str);
        try {
            if (!Objects.exists(file, this.f19614n, this.f19623w)) {
                message = "file is not exist ";
            } else if (!file.isFile()) {
                message = "file is not file ";
            } else if (!file.canRead()) {
                message = "file can not read ";
            } else if (file.length() > 0) {
                this.f19616p = str;
            } else {
                message = "file length is 0 ";
            }
        } catch (Throwable th) {
            q0.b("CampaignDownLoadTask", th.getMessage());
            message = th.getMessage();
        }
        if (this.f19605e == 5 && !TextUtils.isEmpty(message)) {
            d();
        }
        return message;
    }

    public String l() {
        if (this.Q) {
            try {
                File file = new File(this.f19616p);
                return (file.exists() && file.isFile()) ? this.f19616p : this.f19613m;
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
                return this.f19613m;
            }
        }
        try {
            File file2 = new File(this.f19616p);
            if (Objects.exists(file2, this.f19614n, this.f19623w) && file2.isFile()) {
                return this.f19616p;
            }
        } catch (Exception e11) {
            q0.b("CampaignDownLoadTask", e11.getMessage());
        }
        return this.f19613m;
    }

    public long m() {
        return this.f19615o;
    }

    public long n() {
        return this.f19618r;
    }

    public void c(int i10) {
        this.f19602b = i10;
    }

    public void d(int i10) {
        q0.a("CampaignDownLoadTask", "set ready rate: " + i10);
        this.f19619s = i10;
    }

    public void e(CampaignEx campaignEx) {
        this.f19609i = campaignEx;
    }

    private int c(CampaignEx campaignEx) {
        int iD;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            iD = campaignEx.getReady_rate();
            q0.a("CampaignDownLoadTask", "ready_rate(campaign): " + iD);
        } else {
            iD = d(campaignEx);
            q0.a("CampaignDownLoadTask", "ready_rate(reward_unit_setting): " + iD);
        }
        try {
            return Math.max(iD, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    public void b(int i10) {
        this.f19603c = i10;
    }

    public void e(int i10) {
        this.C = i10;
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.H == null) {
                    this.H = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f19610j);
                }
                return this.H.C();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.J == null) {
                    this.J = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.f19610j);
                }
                return b((CampaignEx) null);
            }
            if (this.I == null) {
                this.I = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f19610j, false);
            }
            return this.I.w();
        } catch (Throwable th) {
            q0.b("CampaignDownLoadTask", th.getMessage(), th);
            return 100;
        }
    }

    public void b(boolean z10) {
        this.f19622v = z10;
    }

    public void b(String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = this.f19607g;
        if (aVar != null) {
            aVar.a(str, this.f19613m);
        }
        com.mbridge.msdk.videocommon.listener.a aVar2 = this.f19608h;
        if (aVar2 != null) {
            aVar2.a(str, this.f19613m);
        }
        q0.b("CampaignDownLoadTask", "Video download stop : " + str);
        if (this.f19605e == 4 || this.f19605e == 2 || this.f19605e == 5) {
            return;
        }
        this.f19605e = 4;
        CampaignEx campaignEx = this.f19609i;
        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.f19609i.getRsIgnoreCheckRule().size() > 0 && this.f19609i.getRsIgnoreCheckRule().contains(0)) {
            q0.c("CampaignDownLoadTask", "Is not check video download status");
        } else {
            a(this.f19615o, this.f19605e);
        }
    }

    public void a(boolean z10) {
        this.K = z10;
    }

    public void a(int i10, int i11) {
        this.f19605e = i10;
        if (this.f19621u == null) {
            this.f19621u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
        }
        this.f19621u.a(this.f19613m, i11, i10, this.f19612l);
    }

    public void c(String str) {
        r();
        a(2, str, "");
        this.f19605e = 4;
    }

    public void a(int i10) {
        this.A = i10;
    }

    public void a(String str) {
        int iC;
        if (TextUtils.isEmpty(str)) {
            this.f19608h.a("VideoUrl is NULL, Please check it.", "");
            return;
        }
        if (this.f19605e == 1) {
            q0.a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
            return;
        }
        if (this.f19605e == 5 && Utils.getDownloadRate(this.f19612l, this.f19615o) >= this.f19619s) {
            q0.a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
            com.mbridge.msdk.videocommon.listener.a aVar = this.f19607g;
            if (aVar != null) {
                aVar.a(this.f19613m);
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f19608h;
            if (aVar2 != null) {
                aVar2.a(this.f19613m);
            }
            try {
                File file = new File(this.f19616p);
                if (Objects.exists(file, this.f19614n, this.f19623w) && file.isFile()) {
                    file.setLastModified(System.currentTimeMillis());
                }
            } catch (Exception e10) {
                q0.b("CampaignDownLoadTask", e10.getMessage());
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            a(this.f19609i, eVar);
            return;
        }
        if (this.f19602b == 3) {
            q0.a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
            a(0L, false, "");
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("cache", 1);
            a(this.f19609i, eVar2);
            return;
        }
        try {
            iC = c(this.f19609i);
        } catch (Exception unused) {
            iC = 100;
        }
        d(iC);
        if (iC == 0) {
            com.mbridge.msdk.videocommon.listener.a aVar3 = this.f19607g;
            if (aVar3 != null) {
                aVar3.a(this.f19613m);
            }
            com.mbridge.msdk.videocommon.listener.a aVar4 = this.f19608h;
            if (aVar4 != null) {
                aVar4.a(this.f19613m);
            }
        }
        DownloadMessage downloadMessage = new DownloadMessage(this.f19609i, str, this.f19623w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        downloadMessage.setUseCronetDownload(a(this.f19609i));
        downloadMessage.addExtra("resource_type", 4);
        this.f19624x = a(downloadMessage, this.R, this.S, "1");
    }

    private void d() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0349a());
    }

    private int b(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.setting.l lVar = this.J;
            if (lVar != null) {
                return lVar.C();
            }
            return 100;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            q0.b("CampaignDownLoadTask", e10.getMessage());
            return 100;
        }
    }

    public void b(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f19608h = aVar;
    }

    private DownloadRequest<?> a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.D).withConnectTimeout(this.F).withWriteTimeout(this.E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f19614n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("do_us_fi_re", Boolean.toString(this.G)).with("download_scene", "download_video").with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f19619s)).with("scenes", str).build();
    }

    public void a(long j10, boolean z10, String str) {
        q0.b("CampaignDownLoadTask", "setStateToDone 下载完成  ： mProgressSize" + this.f19615o + "  progressSize " + j10 + "  " + this.f19625y + "%   FileSize : " + this.f19612l + "  " + this.f19609i.getAppName());
        if (this.f19619s == 100 && this.f19602b != 3 && j10 != this.f19612l && !z10) {
            File file = new File(this.f19616p);
            q0.b("CampaignDownLoadTask", "progressSize = " + j10 + " fileSize = " + this.f19612l + " " + z10 + " absFileSize = " + (Objects.exists(file, this.f19614n, this.f19623w) ? file.length() : 0L));
            b("File size is not match witch download size.");
            return;
        }
        this.f19605e = 5;
        if (j10 == this.f19612l) {
            a(1, "", str);
        }
        this.f19601a = false;
        a(j10, this.f19605e);
    }

    public void a(com.mbridge.msdk.videocommon.download.c cVar) {
        CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> copyOnWriteArrayList = this.f19606f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        }
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f19607g = aVar;
    }

    private void a(long j10, int i10) {
        long j11;
        this.f19615o = j10;
        int i11 = this.f19619s;
        if (100 * j10 >= i11 * this.f19612l && !this.f19620t && i10 != 4) {
            if (i11 == 100 && i10 != 5) {
                this.f19605e = 5;
                return;
            }
            this.f19620t = true;
            q0.b("CampaignDownLoadTask", "UpdateListener : state: " + i10 + " progress : " + j10);
            String strK = k();
            if (TextUtils.isEmpty(strK)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f19607g;
                if (aVar != null) {
                    aVar.a(this.f19613m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f19608h;
                if (aVar2 != null) {
                    aVar2.a(this.f19613m);
                }
            } else {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f19607g;
                if (aVar3 != null) {
                    aVar3.a("file is not effective " + strK, this.f19613m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f19608h;
                if (aVar4 != null) {
                    aVar4.a("file is not effective " + strK, this.f19613m);
                }
            }
        }
        if (this.f19601a || j10 <= 0) {
            j11 = j10;
        } else {
            this.f19601a = true;
            if (this.f19621u == null) {
                this.f19621u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
            }
            j11 = j10;
            this.f19621u.a(this.f19613m, j11, this.f19605e, this.f19612l);
        }
        CopyOnWriteArrayList<com.mbridge.msdk.videocommon.download.c> copyOnWriteArrayList = this.f19606f;
        if (copyOnWriteArrayList != null) {
            Iterator<com.mbridge.msdk.videocommon.download.c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.videocommon.download.c next = it.next();
                if (next != null) {
                    next.onProgress(j11, i10);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, String str2) {
        n nVar = new n(this.f19611k, this.f19609i, i10, Long.toString(this.f19618r != 0 ? System.currentTimeMillis() - this.f19618r : 0L), this.f19612l, this.A);
        nVar.b(this.f19609i.getId());
        nVar.v(this.f19609i.getVideoUrlEncode());
        nVar.m(str);
        nVar.n(this.f19609i.getRequestId());
        nVar.k(this.f19609i.getCurrentLocalRid());
        nVar.o(this.f19609i.getRequestIdNotice());
        nVar.u(this.f19610j);
        nVar.q(str2);
        nVar.b(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f19619s));
        nVar.b("url", this.f19609i.getVideoUrlEncode());
        nVar.e(4);
        DownloadRequest downloadRequest = this.f19624x;
        if (downloadRequest != null) {
            nVar.b("scenes", downloadRequest.get("scenes", ""));
            nVar.b("resumed_breakpoint", this.f19624x.get("resumed_breakpoint", ""));
        }
        int i11 = this.A;
        if (i11 == 94 || i11 == 287) {
            return;
        }
        com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(nVar);
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
            q0.b("CampaignDownLoadTask", th.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, boolean z10, String str) {
        if (this.P) {
            return;
        }
        try {
            this.P = true;
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            DownloadRequest downloadRequest = this.f19624x;
            if (downloadRequest != null) {
                eVar.a("scenes", downloadRequest.get("scenes", ""));
                eVar.a("url", this.f19613m);
                eVar.a("resumed_breakpoint", this.f19624x.get("resumed_breakpoint", ""));
                eVar.a("h3c", "");
            }
            eVar.a("resource_type", 4);
            eVar.a("file_size", Long.valueOf(this.f19612l));
            eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.f19619s));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("reason", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_end", this.f19609i, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (this.O || campaignEx == null || eVar == null) {
            return;
        }
        this.O = true;
        try {
            eVar.a("resource_type", 4);
            DownloadRequest downloadRequest = this.f19624x;
            if (downloadRequest != null) {
                eVar.a("scenes", downloadRequest.get("scenes", "1"));
                eVar.a("resumed_breakpoint", this.f19624x.get("resumed_breakpoint", "2"));
            } else {
                eVar.a("scenes", "1");
                eVar.a("resumed_breakpoint", "1");
            }
            eVar.a("url", campaignEx.getVideoUrlEncode());
            eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(c(campaignEx)));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
        } catch (Exception e10) {
            q0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }
}
