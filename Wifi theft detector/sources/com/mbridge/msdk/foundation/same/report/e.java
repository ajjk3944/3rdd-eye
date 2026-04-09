package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.BatchReportDao;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.s0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: l, reason: collision with root package name */
    private static final String f15238l = "e";

    /* renamed from: m, reason: collision with root package name */
    private static String f15239m = "roas";

    /* renamed from: n, reason: collision with root package name */
    private static volatile e f15240n;

    /* renamed from: a, reason: collision with root package name */
    private AtomicInteger f15241a;

    /* renamed from: b, reason: collision with root package name */
    private BatchReportDao f15242b;

    /* renamed from: c, reason: collision with root package name */
    private int f15243c = 1;

    /* renamed from: d, reason: collision with root package name */
    private long f15244d = 0;

    /* renamed from: e, reason: collision with root package name */
    private String f15245e = com.mbridge.msdk.foundation.same.net.utils.d.h().O;

    /* renamed from: f, reason: collision with root package name */
    private volatile int f15246f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f15247g = false;

    /* renamed from: h, reason: collision with root package name */
    private Executor f15248h = Executors.newSingleThreadExecutor();

    /* renamed from: i, reason: collision with root package name */
    private Handler f15249i;

    /* renamed from: j, reason: collision with root package name */
    private Stack<Long> f15250j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.tracker.m f15251k;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws UnsupportedEncodingException {
            int i10 = message.what;
            if (i10 == 1) {
                Bundle data = message.getData();
                if (e.this.f15249i == null || e.this.f15242b == null || data == null) {
                    return;
                }
                e.this.f15249i.removeMessages(2);
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList<BatchReportMessage> batchReportMessages = e.this.f15242b.getBatchReportMessages(jCurrentTimeMillis, 2);
                e.this.b(batchReportMessages, jCurrentTimeMillis);
                e.this.f15241a.set(0);
                String str = e.f15238l;
                StringBuilder sb = new StringBuilder();
                sb.append("超时上报触发了，需要上报的数据： ");
                sb.append(batchReportMessages != null ? batchReportMessages.size() : 0);
                q0.a(str, sb.toString());
                return;
            }
            if (i10 == 2) {
                Bundle data2 = message.getData();
                if (e.this.f15249i == null || e.this.f15242b == null || data2 == null) {
                    return;
                }
                e.this.f15249i.removeMessages(1);
                long j10 = data2.getLong("last_report_time");
                ArrayList<BatchReportMessage> batchReportMessages2 = e.this.f15242b.getBatchReportMessages(j10, 2);
                e.this.b(batchReportMessages2, j10);
                String str2 = e.f15238l;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("队列上报触发了，需要上报的数据： ");
                sb2.append(batchReportMessages2 != null ? batchReportMessages2.size() : 0);
                q0.a(str2, sb2.toString());
                return;
            }
            if (i10 == 3) {
                Bundle data3 = message.getData();
                if (data3 != null) {
                    e.this.a((ArrayList<BatchReportMessage>) data3.getParcelableArrayList("report_message"), data3.getLong("last_report_time"));
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            Bundle data4 = message.getData();
            if (e.this.f15249i == null || e.this.f15242b == null || data4 == null || !e.this.f15247g) {
                return;
            }
            e.this.f15249i.removeMessages(4);
            ArrayList<BatchReportMessage> batchReportMessages3 = e.this.f15242b.getBatchReportMessages(System.currentTimeMillis(), 2);
            if (batchReportMessages3 != null && batchReportMessages3.size() > 0) {
                for (int i11 = 0; i11 < batchReportMessages3.size(); i11++) {
                    BatchReportMessage batchReportMessage = batchReportMessages3.get(i11);
                    e.this.a(batchReportMessage.getReportMessage(), batchReportMessage.getTimestamp());
                }
            }
            String str3 = e.f15238l;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("切换上报lib，需要上报的数据： ");
            sb3.append(batchReportMessages3 != null ? batchReportMessages3.size() : 0);
            q0.a(str3, sb3.toString());
        }
    }

    public class b extends com.mbridge.msdk.foundation.same.report.net.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f15253b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f15254c;

        public b(long j10, ArrayList arrayList) {
            this.f15253b = j10;
            this.f15254c = arrayList;
        }

        @Override // com.mbridge.msdk.foundation.same.report.net.b
        public void a(String str) {
            Stack stack;
            q0.a(e.f15238l, "批量上报失败： " + str);
            e.this.a(2, str);
            synchronized (e.this.f15250j) {
                try {
                    e.this.f15250j.add(Long.valueOf(this.f15253b));
                    if (e.this.f15242b != null) {
                        e.this.f15242b.updateMessagesReportState(this.f15254c);
                    }
                    if (e.this.f15250j.size() >= 5) {
                        q0.a(e.f15238l, "批量上报失败，上报失败的数据超过阈值");
                        try {
                            try {
                                e.this.f15250j.pop();
                                long jLongValue = ((Long) e.this.f15250j.pop()).longValue();
                                e.this.f15250j.clear();
                                if (e.this.f15242b != null) {
                                    e.this.f15242b.deleteBatchReportMessagesByTimestamp(jLongValue);
                                }
                                stack = e.this.f15250j;
                            } catch (Exception e10) {
                                q0.b(e.f15238l, e10.getMessage());
                                stack = e.this.f15250j;
                            }
                            stack.clear();
                        } catch (Throwable th) {
                            e.this.f15250j.clear();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.same.report.net.b
        public void b(String str) {
            q0.a(e.f15238l, "批量上报成功");
            e.this.a(1, "");
            try {
                if (e.this.f15242b != null) {
                    e.this.f15242b.deleteBatchReportMessagesByTimestamp(this.f15253b);
                }
            } catch (Exception e10) {
                q0.b(e.f15238l, e10.getMessage());
            }
            synchronized (e.this.f15250j) {
                e.this.f15250j.clear();
            }
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f15256a;

        public c(String str) {
            this.f15256a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f15242b == null) {
                return;
            }
            q0.a(e.f15238l, "接收到上报数据： " + this.f15256a);
            if (!e.this.f15247g) {
                if (e.this.f15246f != 1) {
                    e.this.c(this.f15256a);
                }
            } else {
                e.this.a(this.f15256a, 0L);
                if (((Integer) y0.a(com.mbridge.msdk.foundation.controller.c.n().d(), "roas_use_event", 0)).intValue() == 0) {
                    y0.b(com.mbridge.msdk.foundation.controller.c.n().d(), "roas_use_event", 1);
                    e.this.f15249i.sendEmptyMessage(4);
                }
            }
        }
    }

    private e() throws JSONException {
        d();
    }

    public static synchronized e c() {
        try {
            if (f15240n == null) {
                f15240n = new e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15240n;
    }

    private void d() throws JSONException {
        com.mbridge.msdk.setting.a aVarJ;
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
        if (gVarD != null && (aVarJ = gVarD.j()) != null) {
            this.f15243c = aVarJ.a();
            this.f15244d = aVarJ.c() * 1000;
            this.f15245e = com.mbridge.msdk.foundation.same.net.utils.d.h().O;
            this.f15246f = aVarJ.b();
            boolean z10 = aVarJ.d() == 1;
            this.f15247g = z10;
            if (z10 && this.f15246f != 1) {
                int iB = s0.a().b("bcp", HandleInvocationsFromAdViewer.KEY_AD_TYPE, s0.a().b("t_r_t", 1));
                if (iB != 0 && iB != 1) {
                    iB = 0;
                }
                this.f15251k = com.mbridge.msdk.tracker.m.b(f15239m, com.mbridge.msdk.foundation.controller.c.n().d(), new x.b().a(new d()).a(new n()).a(iB, a(iB)).a(s0.a().b("t_m_e_t", 604800000)).b(s0.a().b("t_m_e_s", 50)).d(s0.a().b("t_m_r_c", 50)).c(s0.a().b("t_m_t", DefaultLoadControl.DEFAULT_MIN_BUFFER_MS)).e(s0.a().b("t_m_r_t_s", 1)).a());
                JSONObject jSONObjectB = com.mbridge.msdk.foundation.same.report.c.b();
                try {
                    jSONObjectB.put("device_type", m0.E(com.mbridge.msdk.foundation.controller.c.n().d()) ? "pad" : "phone");
                    if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                        jSONObjectB.put(com.mbridge.msdk.foundation.same.net.wrapper.e.f15200j, m0.v());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                this.f15251k.a(jSONObjectB);
                this.f15251k.h();
            }
        }
        q0.a(f15238l, "初始化批量上报： " + this.f15245e + " " + this.f15243c + " " + this.f15244d + " " + this.f15246f);
        this.f15241a = new AtomicInteger(0);
        this.f15250j = new Stack<>();
        this.f15242b = BatchReportDao.getInstance(com.mbridge.msdk.foundation.controller.c.n().d());
        HandlerThread handlerThread = new HandlerThread("mb_revenue_batch_report_thread");
        handlerThread.start();
        this.f15249i = new a(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ArrayList<BatchReportMessage> arrayList, long j10) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Message messageObtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("report_message", arrayList);
        bundle.putLong("last_report_time", j10);
        messageObtain.setData(bundle);
        messageObtain.what = 3;
        this.f15249i.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        this.f15242b.addReportMessage(str, 2);
        Handler handler = this.f15249i;
        if (handler != null && !handler.hasMessages(1)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            this.f15249i.sendMessageDelayed(messageObtain, this.f15244d);
        }
        if (this.f15241a.incrementAndGet() < this.f15243c || this.f15249i == null) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putLong("last_report_time", System.currentTimeMillis());
        messageObtain2.setData(bundle);
        messageObtain2.what = 2;
        this.f15249i.sendMessage(messageObtain2);
        this.f15241a.set(0);
    }

    private p a(int i10) {
        if (i10 == 1) {
            return new p(new m((byte) 2), com.mbridge.msdk.foundation.same.net.utils.d.h().f15176l, com.mbridge.msdk.foundation.same.net.utils.d.h().f15180p);
        }
        return new p(new com.mbridge.msdk.tracker.network.toolbox.h(), com.mbridge.msdk.foundation.same.net.utils.d.h().O, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<BatchReportMessage> arrayList, long j10) throws UnsupportedEncodingException {
        if (arrayList != null && arrayList.size() > 0) {
            q0.a(f15238l, "需要上报的数据条数： " + arrayList.size());
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (contextD == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = j.a(contextD);
            eVarA.a(MBridgeConstans.APP_ID, com.mbridge.msdk.foundation.controller.c.n().b());
            eVarA.a("m_sdk", "msdk");
            eVarA.a("lqswt", String.valueOf(1));
            eVarA.a("device_type", m0.E(contextD) ? "pad" : "phone");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                eVarA.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f15200j, m0.v());
            }
            StringBuilder sb = new StringBuilder();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    BatchReportMessage batchReportMessage = arrayList.get(i10);
                    if (batchReportMessage != null) {
                        sb.append(batchReportMessage.getReportMessage() + "&ts=" + batchReportMessage.getTimestamp());
                        if (i10 >= 0 && i10 < size - 1) {
                            sb.append("\n");
                        }
                    }
                } catch (Throwable th) {
                    q0.b(f15238l, th.getMessage());
                }
            }
            try {
                String strEncode = URLEncoder.encode(sb.toString(), "utf-8");
                eVarA.a("data", strEncode);
                q0.a(f15238l, "需要批量上报的数据： " + strEncode);
                com.mbridge.msdk.foundation.same.report.net.a aVar = new com.mbridge.msdk.foundation.same.report.net.a(com.mbridge.msdk.foundation.controller.c.n().d());
                a(0, "");
                aVar.post(0, this.f15245e, eVarA, new b(j10, arrayList), "roas", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                return;
            } catch (Exception e10) {
                q0.b(f15238l, e10.getMessage());
                return;
            }
        }
        q0.a(f15238l, "需要上报的数据条数： 0");
    }

    public void b() {
        Handler handler = this.f15249i;
        if (handler == null || handler.hasMessages(1) || this.f15246f == 1 || this.f15247g) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.f15249i.sendMessageDelayed(messageObtain, 5000L);
    }

    public synchronized void b(String str) {
        Executor executor;
        try {
            if (this.f15246f == 1) {
                return;
            }
            c cVar = new c(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e() && (executor = this.f15248h) != null) {
                executor.execute(cVar);
            } else {
                cVar.run();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j10) {
        if (this.f15251k != null) {
            com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e("roas");
            eVar.a(true);
            if (j10 != 0) {
                eVar.c(j10);
            }
            eVar.a(1);
            try {
                eVar.a(a(str));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f15251k.d(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("state", Integer.valueOf(i10));
        if (i10 == 2) {
            eVar.a("reason", str);
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a("m_ad_rev_s_s", eVar);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_ad_rev_s_s", cVar);
    }

    private JSONObject a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                for (String str2 : str.split("&")) {
                    String[] strArrSplit = str2.split("=");
                    if (strArrSplit.length == 2) {
                        jSONObject.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return jSONObject;
            }
        }
        return jSONObject;
    }
}
