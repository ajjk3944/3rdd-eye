package com.mbridge.msdk.config.component.midi.monitor;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.File;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private int f13589a;

    /* renamed from: b, reason: collision with root package name */
    private long f13590b;

    /* renamed from: c, reason: collision with root package name */
    private long f13591c;

    /* renamed from: g, reason: collision with root package name */
    private Handler f13595g;

    /* renamed from: h, reason: collision with root package name */
    private HandlerThread f13596h;

    /* renamed from: i, reason: collision with root package name */
    private Runnable f13597i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f13598j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.config.component.midi.monitor.a f13599k;

    /* renamed from: m, reason: collision with root package name */
    private String f13601m;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13592d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f13593e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13594f = false;

    /* renamed from: l, reason: collision with root package name */
    private int f13600l = 0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c.this.f13599k != null) {
                c.this.f13599k.a("Video first frame render timeout : " + c.this.f13590b + "ms");
            }
            c.this.h();
        }
    }

    public c(int i10, String str) {
        this.f13589a = 3;
        this.f13601m = str;
        this.f13590b = i10 > 0 ? i10 : 3000L;
        this.f13589a = i10 / 1000;
        try {
            HandlerThread handlerThread = new HandlerThread("PlayerComponentThread");
            this.f13596h = handlerThread;
            handlerThread.start();
            this.f13595g = new Handler(this.f13596h.getLooper());
            d();
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "初始化MonitorPlayerTimeout失败：" + e10.getMessage());
            this.f13595g = new Handler(Looper.getMainLooper());
            d();
        }
    }

    private void d() {
        this.f13597i = new a();
        this.f13598j = new b();
    }

    public boolean e() {
        return this.f13592d;
    }

    public void f() {
        Runnable runnable;
        if (!this.f13592d || this.f13594f) {
            return;
        }
        this.f13594f = true;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f13591c;
        q0.c("MonitorPlayerTimeout", "第一帧播放完成，耗时：" + jCurrentTimeMillis + "ms");
        Handler handler = this.f13595g;
        if (handler != null && (runnable = this.f13598j) != null) {
            handler.removeCallbacks(runnable);
        }
        if (jCurrentTimeMillis > this.f13590b) {
            q0.d("MonitorPlayerTimeout", "播放超时，但第一帧已播放，耗时：" + jCurrentTimeMillis + "ms");
        }
        h();
    }

    public void g() {
        Runnable runnable;
        if (this.f13595g == null) {
            h();
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f13599k;
            if (aVar != null) {
                aVar.a("playerHandler is null");
            }
        }
        if (this.f13592d) {
            q0.d("MonitorPlayerTimeout", "已经启动监控条件 不满足");
            return;
        }
        this.f13592d = true;
        this.f13593e = false;
        this.f13594f = false;
        this.f13600l = 0;
        this.f13591c = System.currentTimeMillis();
        q0.c("MonitorPlayerTimeout", "开始播放超时监控，超时时间：" + this.f13590b + "ms");
        Handler handler = this.f13595g;
        if (handler != null && (runnable = this.f13598j) != null) {
            handler.postDelayed(runnable, this.f13590b);
        }
        a();
    }

    public void h() {
        if (this.f13592d) {
            this.f13592d = false;
            Handler handler = this.f13595g;
            if (handler != null) {
                Runnable runnable = this.f13597i;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                Runnable runnable2 = this.f13598j;
                if (runnable2 != null) {
                    this.f13595g.removeCallbacks(runnable2);
                }
            }
            q0.c("MonitorPlayerTimeout", "停止播放超时监控");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        if (!this.f13592d || this.f13593e || TextUtils.isEmpty(this.f13601m)) {
            q0.b("MonitorPlayerTimeout", "check 条件 不满足");
            return;
        }
        try {
            String strC = c();
            if (TextUtils.isEmpty(strC)) {
                this.f13600l++;
                q0.d("MonitorPlayerTimeout", "检查本地地址次数 " + this.f13600l);
                if (this.f13600l >= this.f13589a) {
                    q0.d("MonitorPlayerTimeout", "检查本地地址次数已达上限，停止检查");
                    return;
                }
                Handler handler = this.f13595g;
                if (handler == null || (runnable2 = this.f13597i) == null) {
                    return;
                }
                handler.postDelayed(runnable2, 1000L);
                return;
            }
            this.f13593e = true;
            q0.c("MonitorPlayerTimeout", "本地视频地址准备完成：" + strC);
            com.mbridge.msdk.config.component.midi.monitor.a aVar = this.f13599k;
            if (aVar != null) {
                aVar.b(strC);
            }
            Handler handler2 = this.f13595g;
            if (handler2 == null || (runnable3 = this.f13597i) == null) {
                return;
            }
            handler2.removeCallbacks(runnable3);
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "检查本地地址异常：" + e10.getMessage());
            Handler handler3 = this.f13595g;
            if (handler3 == null || (runnable = this.f13597i) == null) {
                return;
            }
            handler3.postDelayed(runnable, 1000L);
        }
    }

    private String c() {
        try {
            if (this.f13601m.startsWith(q7.a.FILE_SCHEME) || this.f13601m.startsWith("/")) {
                File file = new File(this.f13601m.replace(q7.a.FILE_SCHEME, ""));
                if (file.exists() && file.isFile()) {
                    return this.f13601m;
                }
            }
            if (this.f13601m.startsWith("http")) {
                com.mbridge.msdk.config.component.common.file.b bVarE = com.mbridge.msdk.config.component.common.file.a.e(this.f13601m);
                String strA = bVarE != null ? bVarE.a() : "";
                File file2 = new File(strA.replace(q7.a.FILE_SCHEME, ""));
                if (file2.exists() && file2.isFile()) {
                    return strA;
                }
            }
            return null;
        } catch (Exception e10) {
            q0.b("MonitorPlayerTimeout", "获取本地视频地址异常：" + e10.getMessage());
            return null;
        }
    }

    public void b() {
        try {
            h();
            Handler handler = this.f13595g;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
                this.f13595g = null;
            }
            HandlerThread handlerThread = this.f13596h;
            try {
                if (handlerThread != null) {
                    try {
                        handlerThread.quitSafely();
                        this.f13596h.join(1000L);
                    } catch (InterruptedException e10) {
                        q0.d("MonitorPlayerTimeout", "等待HandlerThread退出时被中断：" + e10.getMessage());
                        Thread.currentThread().interrupt();
                    } catch (Exception e11) {
                        q0.b("MonitorPlayerTimeout", "清理HandlerThread时发生异常：" + e11.getMessage());
                    }
                    this.f13596h = null;
                }
                this.f13597i = null;
                this.f13598j = null;
                this.f13599k = null;
                this.f13592d = false;
                this.f13593e = false;
                this.f13594f = false;
                this.f13600l = 0;
                q0.c("MonitorPlayerTimeout", "MonitorPlayerTimeout资源已完全清理");
            } catch (Throwable th) {
                this.f13596h = null;
                throw th;
            }
        } catch (Exception e12) {
            q0.b("MonitorPlayerTimeout", "销毁MonitorPlayerTimeout时发生异常：" + e12.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.component.midi.monitor.a aVar) {
        this.f13599k = aVar;
    }
}
