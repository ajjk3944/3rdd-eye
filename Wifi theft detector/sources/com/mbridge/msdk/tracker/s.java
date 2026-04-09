package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private final c f18437a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18438b;

    /* renamed from: c, reason: collision with root package name */
    private final int f18439c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18440d;

    /* renamed from: e, reason: collision with root package name */
    private final k f18441e;

    /* renamed from: i, reason: collision with root package name */
    private Handler f18445i;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f18442f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f18443g = new AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    private final Object f18444h = new Object();

    /* renamed from: j, reason: collision with root package name */
    private boolean f18446j = true;

    /* renamed from: k, reason: collision with root package name */
    private long f18447k = 0;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f18448l = false;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f18449m = false;

    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final s f18452a;

        public b(Looper looper, s sVar) {
            super(looper);
            this.f18452a = sVar;
        }

        private void a(String str) {
            Log.d("TrackManager", this.f18452a.f18441e.v() + " " + str + this.f18452a.f18443g.addAndGet(0) + " 数据库记录数：" + this.f18452a.f18437a.b());
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f18222a) {
                    Log.e("TrackManager", this.f18452a.f18441e.v() + " removeMessages failed ", e10);
                }
            }
            if (this.f18452a.g()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), y.a(this.f18452a.f18442f.get(), this.f18452a.f18447k, this.f18452a.f18439c));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f18222a) {
                    Log.e("TrackManager", this.f18452a.f18441e.v() + " sendMessageDelayed failed ", e11);
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            int i10 = message.what;
            if (i10 == 2 || i10 == 3) {
                b();
                if (com.mbridge.msdk.tracker.a.f18222a) {
                    a("触发上报（report result）当前 Event 数量：");
                }
                a();
                return;
            }
            if (i10 == 5) {
                if (com.mbridge.msdk.tracker.a.f18222a) {
                    a("触发删除 当前 Event 数量：");
                }
                this.f18452a.a();
                sendMessageDelayed(Message.obtain(this, 5), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
                return;
            }
            if (i10 != 6) {
                if (i10 != 7) {
                    b();
                    if (com.mbridge.msdk.tracker.a.f18222a) {
                        a("触发上报（timer）当前 Event 数量：");
                    }
                    a();
                    return;
                }
                this.f18452a.k();
                b();
                if (com.mbridge.msdk.tracker.a.f18222a) {
                    a("触发上报（flush）当前 Event 数量：");
                }
                a();
                return;
            }
            Object obj = message.obj;
            e eVar = obj instanceof e ? (e) obj : null;
            if (com.mbridge.msdk.tracker.a.f18222a && !y.b(eVar)) {
                a(String.format("收到 Event( %s )，当前 Event 数量：", eVar.g()));
            }
            if (y.a(eVar) || this.f18452a.f()) {
                b();
                if (com.mbridge.msdk.tracker.a.f18222a) {
                    a("触发上报（notice check）当前 Event 数量：");
                }
                a();
            }
        }

        private synchronized void a() {
            try {
                this.f18452a.h();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f18222a) {
                    Log.e("TrackManager", this.f18452a.f18441e.v() + " report failed ", e10);
                }
            }
        }
    }

    public s(k kVar) {
        this.f18437a = kVar.d();
        this.f18438b = kVar.i();
        this.f18439c = kVar.l();
        this.f18440d = kVar.j();
        this.f18441e = kVar;
    }

    private void l() {
        this.f18437a.c();
    }

    public void k() {
        synchronized (this.f18444h) {
            try {
                if (!this.f18448l) {
                    this.f18448l = true;
                    l();
                }
                if (!this.f18449m) {
                    this.f18449m = true;
                    this.f18443g.addAndGet(this.f18437a.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private List<i> c() {
        return this.f18437a.a(this.f18438b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        return this.f18442f.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<i> listC = c();
        if (y.b((List<?>) listC)) {
            if (com.mbridge.msdk.tracker.a.f18222a) {
                Log.d("TrackManager", this.f18441e.v() + " report: 没有可以上报的数据");
                return;
            }
            return;
        }
        a(listC);
        int size = listC.size();
        this.f18443g.addAndGet(-size);
        boolean zA = false;
        if (com.mbridge.msdk.tracker.a.f18222a) {
            Log.d("TrackManager", this.f18441e.v() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + this.f18443g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f18437a.b());
        }
        try {
            zA = this.f18441e.a();
        } catch (IllegalStateException e10) {
            if (com.mbridge.msdk.tracker.a.f18222a) {
                Log.e("TrackManager", this.f18441e.v() + " report environment check failed ", e10);
            }
        }
        if (!zA) {
            if (com.mbridge.msdk.tracker.a.f18222a) {
                Log.e("TrackManager", this.f18441e.v() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        o oVarM = this.f18441e.m();
        oVarM.a(new a(this.f18445i, this));
        Map<String, String> map = new HashMap<>();
        try {
            map = this.f18441e.f().a(this.f18441e.u(), listC, this.f18441e.o());
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f18222a) {
                Log.e("TrackManager", this.f18441e.v() + " report decorate request params failed ", e11);
            }
        }
        oVarM.b(new t(listC), map, y.a(listC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f18442f.set(0);
    }

    public void b() {
        this.f18445i.removeMessages(1);
        Handler handler = this.f18445i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public void e() {
        this.f18443g.incrementAndGet();
    }

    public boolean f() {
        return this.f18443g.addAndGet(0) >= this.f18438b;
    }

    public boolean g() {
        return this.f18446j;
    }

    public void j() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.f18445i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.f18445i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f18439c);
        this.f18446j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<i> list) {
        if (y.b((List<?>) list)) {
            return;
        }
        this.f18437a.c(list);
    }

    public void a(e eVar) {
        if (this.f18445i.hasMessages(6)) {
            return;
        }
        long jA = y.a(this.f18442f.get(), this.f18447k, this.f18439c);
        if (jA > this.f18439c) {
            Handler handler = this.f18445i;
            handler.sendMessageDelayed(Message.obtain(handler, 6, eVar), (long) (jA * 0.1f));
        } else {
            Handler handler2 = this.f18445i;
            handler2.sendMessage(Message.obtain(handler2, 6, eVar));
        }
    }

    public static final class a implements r {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f18450a;

        /* renamed from: b, reason: collision with root package name */
        private final s f18451b;

        public a(Handler handler, s sVar) {
            this.f18450a = handler;
            this.f18451b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar) {
            this.f18451b.b(tVar.a());
            this.f18451b.i();
            this.f18451b.f18447k = 0L;
            if (this.f18451b.f()) {
                Handler handler = this.f18450a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.f18222a) {
                Log.d("TrackManager", this.f18451b.f18441e.v() + " report success " + tVar.a().size() + " 剩余事件数：" + this.f18451b.f18443g.addAndGet(0) + " 个，数据库记录数：" + this.f18451b.f18437a.b() + " 个");
            }
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar, int i10, String str) {
            this.f18451b.a(tVar.a(), str);
            this.f18451b.f18447k = System.currentTimeMillis();
            int iD = this.f18451b.d();
            if (iD <= 10) {
                this.f18450a.removeMessages(3);
                Handler handler = this.f18450a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), iD * 1000);
            }
            if (com.mbridge.msdk.tracker.a.f18222a) {
                Log.d("TrackManager", this.f18451b.f18441e.v() + " report failed " + tVar.a().size() + " 剩余事件数：" + this.f18451b.f18443g.addAndGet(0) + " 个，数据库记录数：" + this.f18451b.f18437a.b() + " 个 连续失败次数： " + iD);
            }
        }
    }

    private void a(List<i> list) {
        this.f18437a.b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (com.mbridge.msdk.tracker.a.f18222a) {
            return;
        }
        int iA = this.f18437a.a();
        if (com.mbridge.msdk.tracker.a.f18222a) {
            Log.d("TrackManager", this.f18441e.v() + " 删除无效数据的数量 = " + iA + " 当前剩余事件数 = " + this.f18443g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f18437a.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<i> list, String str) {
        if (y.b((List<?>) list)) {
            return;
        }
        int i10 = 0;
        for (i iVar : list) {
            if (!y.b(iVar)) {
                boolean z10 = !iVar.l() && iVar.h() >= this.f18440d;
                boolean z11 = !iVar.m() && iVar.g() < System.currentTimeMillis();
                if (!z10 && !z11) {
                    iVar.a(iVar.h() + 1);
                    iVar.b(3);
                    iVar.a(str);
                    i10++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        this.f18437a.a(list);
        this.f18443g.addAndGet(i10);
    }
}
