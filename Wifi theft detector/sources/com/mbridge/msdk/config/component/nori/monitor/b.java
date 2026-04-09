package com.mbridge.msdk.config.component.nori.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.q0;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private long f13653a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13654b = false;

    /* renamed from: c, reason: collision with root package name */
    private Handler f13655c;

    /* renamed from: d, reason: collision with root package name */
    private HandlerThread f13656d;

    /* renamed from: e, reason: collision with root package name */
    private Runnable f13657e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f13658f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f13659g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.b f13660h;

    /* renamed from: i, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.b f13661i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.b("MonitorNetworkTimeout", "超时结束触发");
            if (b.this.f13658f != null && !b.this.f13659g.h()) {
                b.this.a();
                b.this.f13658f.d(b.this.f13659g);
            }
            b.this.e();
        }
    }

    public b(long j10) {
        if (this.f13653a < 0) {
            this.f13653a = 30L;
        } else {
            this.f13653a = j10;
        }
    }

    public void d() {
        Runnable runnable;
        if (this.f13654b) {
            q0.d("MonitorNetworkTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f13654b = true;
        try {
            HandlerThread handlerThread = new HandlerThread("NetComponentThread");
            this.f13656d = handlerThread;
            handlerThread.start();
            this.f13655c = new Handler(this.f13656d.getLooper());
            c();
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f13655c = new Handler(Looper.getMainLooper());
            c();
        }
        if (this.f13655c == null) {
            e();
            com.mbridge.msdk.config.component.common.network.a aVar = this.f13658f;
            if (aVar != null) {
                aVar.d(this.f13659g);
            }
        }
        q0.c("MonitorNetworkTimeout", "开始网络请求，超时时间：" + this.f13653a + "ms");
        Handler handler = this.f13655c;
        if (handler == null || (runnable = this.f13657e) == null) {
            return;
        }
        handler.postDelayed(runnable, this.f13653a * 1000);
    }

    public void e() {
        Runnable runnable;
        if (this.f13654b) {
            this.f13654b = false;
            Handler handler = this.f13655c;
            if (handler != null && (runnable = this.f13657e) != null) {
                handler.removeCallbacks(runnable);
            }
            q0.c("MonitorNetworkTimeout", "停止net超时监控");
        }
    }

    private void c() {
        this.f13657e = new a();
    }

    public void a(com.mbridge.msdk.config.component.common.network.b bVar) {
        this.f13660h = bVar;
    }

    public void b() {
        try {
            e();
            Handler handler = this.f13655c;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f13655c = null;
            }
            HandlerThread handlerThread = this.f13656d;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.f13656d.join(1000L);
                    } catch (InterruptedException e10) {
                        q0.d("MonitorNetworkTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                        q0.b("MonitorNetworkTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f13656d = null;
                }
                this.f13657e = null;
                this.f13654b = false;
                q0.c("MonitorNetworkTimeout", "MonitorNetworkTimeout资源已完全清理");
            } catch (Throwable th) {
                this.f13656d = null;
                throw th;
            }
        } catch (Exception e12) {
            q0.b("MonitorNetworkTimeout", "销毁MonitorNetworkTimeout时发生异常：" + e12.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.b bVar) {
        this.f13661i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            if (this.f13660h != null) {
                q0.c("MonitorNetworkTimeout", "取消网络请求");
                this.f13660h.a();
            }
            if (this.f13661i != null) {
                q0.c("MonitorNetworkTimeout", "取消重试任务");
                this.f13661i.a();
            }
        } catch (Exception e10) {
            q0.b("MonitorNetworkTimeout", "取消任务时发生异常：" + e10.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.common.network.result.a aVar) {
        this.f13659g = aVar;
    }

    public void a(com.mbridge.msdk.config.component.common.network.a aVar) {
        this.f13658f = aVar;
    }
}
