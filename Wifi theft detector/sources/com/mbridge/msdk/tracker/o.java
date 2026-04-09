package com.mbridge.msdk.tracker;

import android.util.Log;
import com.mbridge.msdk.tracker.network.b0;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.v;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class o {

    /* renamed from: a, reason: collision with root package name */
    private r f18421a;

    /* renamed from: b, reason: collision with root package name */
    private final int f18422b;

    /* renamed from: c, reason: collision with root package name */
    private final p f18423c;

    /* renamed from: d, reason: collision with root package name */
    private final w f18424d;

    /* renamed from: e, reason: collision with root package name */
    private final int f18425e;

    /* renamed from: f, reason: collision with root package name */
    private com.mbridge.msdk.tracker.network.u f18426f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f18427g;

    public class a implements ThreadFactory {
        public a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "MBridgeReportResponseThread");
        }
    }

    public static final class b implements v.a {

        /* renamed from: a, reason: collision with root package name */
        private final r f18429a;

        /* renamed from: b, reason: collision with root package name */
        private final t f18430b;

        public b(r rVar, t tVar) {
            this.f18429a = rVar;
            this.f18430b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.a
        public void a(b0 b0Var) {
            int iD;
            int iG;
            String message;
            if (y.a(this.f18429a)) {
                if (b0Var != null) {
                    try {
                        iD = b0Var.d();
                        iG = b0Var.g();
                        message = b0Var.getMessage();
                    } catch (Exception e10) {
                        if (com.mbridge.msdk.tracker.a.f18222a) {
                            Log.e("TrackManager", "onErrorResponse error", e10);
                            return;
                        }
                        return;
                    }
                } else {
                    message = "";
                    iD = 0;
                    iG = 0;
                }
                this.f18429a.a(this.f18430b, 0, String.format("volleyError:%s,responseCode:%s,errorMessage:%s", Integer.valueOf(iD), Integer.valueOf(iG), message));
            }
        }
    }

    public static final class c implements v.b {

        /* renamed from: a, reason: collision with root package name */
        private final r f18431a;

        /* renamed from: b, reason: collision with root package name */
        private final t f18432b;

        public c(r rVar, t tVar) {
            this.f18431a = rVar;
            this.f18432b = tVar;
        }

        @Override // com.mbridge.msdk.tracker.network.v.b
        public void a(Object obj) {
            if (y.a(this.f18431a)) {
                try {
                    this.f18431a.a(this.f18432b);
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f18222a) {
                        Log.e("TrackManager", "onResponse error", e10);
                    }
                }
            }
        }
    }

    public o(int i10, p pVar, w wVar, int i11) {
        this.f18422b = i10;
        this.f18423c = pVar;
        this.f18424d = wVar;
        this.f18425e = i11;
        this.f18427g = new ThreadPoolExecutor(i10, i10, 20L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a(), new ThreadPoolExecutor.DiscardPolicy());
    }

    public void a(r rVar) {
        this.f18421a = rVar;
    }

    public void b(t tVar, Map<String, String> map, boolean z10) {
        if (y.b(map)) {
            r rVar = this.f18421a;
            if (rVar != null) {
                try {
                    rVar.a(tVar, 0, "params is null");
                    return;
                } catch (Exception e10) {
                    if (com.mbridge.msdk.tracker.a.f18222a) {
                        Log.e("TrackManager", "send error", e10);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        try {
            a();
            this.f18426f.a(a(tVar, map, z10));
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f18222a) {
                Log.e("TrackManager", "send error", e11);
            }
            if (y.a(this.f18421a)) {
                this.f18421a.a(tVar, 0, e11.getMessage());
            }
        }
    }

    private v<Object> a(t tVar, Map<String, String> map, boolean z10) {
        v<Object> vVar = this.f18425e == 1 ? new v<>(this.f18423c.c(), 1, this.f18423c.a()) : new v<>(this.f18423c.c(), 1);
        vVar.a(map);
        vVar.a(false);
        vVar.c(true);
        vVar.b(true);
        vVar.a(this.f18424d);
        vVar.a(z10 ? t.a.HIGH : t.a.NORMAL);
        vVar.a((v.b<Object>) new c(this.f18421a, tVar));
        vVar.a((v.a) new b(this.f18421a, tVar));
        return vVar;
    }

    private void a() {
        if (y.a(this.f18426f)) {
            return;
        }
        com.mbridge.msdk.tracker.network.u uVarA = com.mbridge.msdk.tracker.network.toolbox.o.a(new com.mbridge.msdk.tracker.network.toolbox.b(this.f18423c.b()), new com.mbridge.msdk.tracker.network.f(this.f18427g), this.f18422b, null);
        this.f18426f = uVarA;
        uVarA.b();
    }
}
