package com.mbridge.msdk.config.component.common.network.connect.okhttp;

import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.api.reward.BackupConstant;
import com.mbridge.msdk.config.component.common.network.listener.EventListenerOKHttp;
import com.mbridge.msdk.config.component.common.util.c;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.d;
import com.mbridge.msdk.thrid.okhttp.e;
import com.mbridge.msdk.thrid.okhttp.i;
import com.mbridge.msdk.thrid.okhttp.m;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: h, reason: collision with root package name */
    private static volatile v f13225h;

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.model.a f13226a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.result.a f13227b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.a f13228c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.config.component.common.network.retry.a f13229d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.config.component.nori.monitor.a f13230e;

    /* renamed from: f, reason: collision with root package name */
    private String f13231f;

    /* renamed from: g, reason: collision with root package name */
    private d f13232g;

    public a(com.mbridge.msdk.config.component.nori.model.a aVar, com.mbridge.msdk.config.component.common.network.result.a aVar2, com.mbridge.msdk.config.component.common.network.a aVar3) {
        this.f13226a = aVar;
        this.f13227b = aVar2;
        this.f13228c = aVar3;
        this.f13230e = aVar2.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.f13228c == null) {
            return;
        }
        if (c.a(this.f13227b.g())) {
            this.f13228c.b(this.f13227b);
            return;
        }
        if (this.f13227b.g() == 200) {
            this.f13228c.c(this.f13227b);
            com.mbridge.msdk.config.component.common.network.retry.a aVar = this.f13229d;
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        com.mbridge.msdk.config.component.common.network.retry.a aVar2 = this.f13229d;
        if (aVar2 != null) {
            aVar2.b();
        } else if (this.f13226a.g() <= 0) {
            this.f13228c.d(this.f13227b);
        } else {
            this.f13230e.a(true);
            new com.mbridge.msdk.config.component.common.network.retry.c(this.f13231f, this.f13226a, this.f13228c, this.f13227b).c();
        }
    }

    private static v b() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        m mVar = new m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, new SynchronousQueue(), com.mbridge.msdk.thrid.okhttp.internal.c.a("OkHttp Dispatcher", false)));
        mVar.b(50);
        mVar.a(256);
        ArrayList arrayList = new ArrayList();
        arrayList.add(w.HTTP_1_1);
        arrayList.add(w.HTTP_2);
        return new v.b().a(arrayList).a(new i(32, 5L, TimeUnit.MINUTES)).a(mVar).b(30L, timeUnit).d(30L, timeUnit).e(30L, timeUnit).a();
    }

    public com.mbridge.msdk.config.component.common.network.result.a a(String str) {
        this.f13231f = str;
        com.mbridge.msdk.config.component.nori.monitor.a aVar = this.f13230e;
        if (aVar != null) {
            aVar.m();
        }
        d dVarB = b(str, this.f13226a);
        this.f13232g = dVarB;
        if (dVarB != null) {
            dVarB.a(new C0241a());
            return this.f13227b;
        }
        q0.b("OkHttpClientConnection", "");
        this.f13227b.c(1002);
        this.f13227b.a(1002);
        this.f13227b.a("create Call fail");
        c();
        return this.f13227b;
    }

    public void a() {
        if (this.f13232g != null) {
            q0.b("OkHttpClientConnection", "取消当前重试任务");
            this.f13232g.cancel();
        }
    }

    private static y a(String str, com.mbridge.msdk.config.component.nori.model.a aVar) {
        y.a aVarB = new y.a().b(str);
        a(aVarB, aVar);
        try {
            b(aVarB, aVar);
        } catch (IOException e10) {
            q0.b("OkHttpClientConnection", "Failed to set connection parameters: " + e10.getMessage());
        }
        return aVarB.a();
    }

    private d b(String str, com.mbridge.msdk.config.component.nori.model.a aVar) {
        try {
            if (f13225h == null) {
                f13225h = b();
            }
            v vVarA = f13225h.s().a(new EventListenerOKHttp(this.f13230e)).a(new MBridgeHostnameVerifier(str)).a(Math.max(aVar.k(), 30L), TimeUnit.SECONDS).a(false).a();
            a(vVarA);
            return vVarA.a(a(str, aVar));
        } catch (Exception e10) {
            q0.b("OkHttpClientConnection", "Failed to create request: " + e10.getMessage());
            return null;
        }
    }

    /* renamed from: com.mbridge.msdk.config.component.common.network.connect.okhttp.a$a, reason: collision with other inner class name */
    public class C0241a implements e {
        public C0241a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.e
        public void a(d dVar, IOException iOException) {
            if (dVar.h()) {
                a.this.f13227b.a("Request was cancelled");
            } else if (iOException instanceof SocketTimeoutException) {
                a.this.f13227b.c(1001);
                a.this.f13227b.a(1001);
                a.this.f13227b.a("Connection timeout: " + iOException.getMessage());
            } else if (iOException instanceof UnknownHostException) {
                a.this.f13227b.c(TTAdConstant.IMAGE_MODE_1011);
                a.this.f13227b.a(TTAdConstant.IMAGE_MODE_1011);
                a.this.f13227b.a("Host unreachable: " + iOException.getMessage());
            } else if (iOException instanceof ConnectException) {
                a.this.f13227b.c(1002);
                a.this.f13227b.a(1002);
                a.this.f13227b.a("Connection refused: " + iOException.getMessage());
            } else {
                a.this.f13227b.c(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);
                a.this.f13227b.a(BackupConstant.SCENE_CLOSED_WITHOUT_SHOW);
                a.this.f13227b.a("Network error: " + iOException.getMessage());
            }
            a.this.f13227b.b(2);
            a.this.c();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.e
        public void a(d dVar, a0 a0Var) throws IOException {
            a.this.f13227b.c(a0Var.k());
            a.this.f13227b.a(a0Var.o());
            if (c.a(a0Var.k())) {
                String strB = a0Var.b("Location");
                if (strB != null && !strB.isEmpty()) {
                    a.this.f13227b.b(strB);
                    a.this.f13227b.b(1);
                    Log.d("OkHttpClientConnection", "Redirect to: " + strB);
                }
            } else if (a0Var.d() == null) {
                a.this.f13227b.b(2);
                a.this.f13227b.a("Response body is null");
                Log.e("OkHttpClientConnection", "Response body is null");
            } else {
                String strN = a0Var.d().n();
                a.this.f13227b.b(strN);
                a.this.f13227b.b(1);
                StringBuilder sb = new StringBuilder();
                sb.append("Response data length: ");
                sb.append(strN != null ? strN.length() : 0);
                Log.d("OkHttpClientConnection", sb.toString());
            }
            a0Var.close();
            a.this.c();
        }
    }

    private static void a(y.a aVar, com.mbridge.msdk.config.component.nori.model.a aVar2) {
        Map<String, Object> mapB = aVar2.b();
        if (mapB != null && !mapB.isEmpty()) {
            for (Map.Entry<String, Object> entry : mapB.entrySet()) {
                aVar.b(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        aVar.a("Connection", "close");
    }

    public void a(com.mbridge.msdk.config.component.common.network.retry.a aVar) {
        this.f13229d = aVar;
    }

    private void a(v vVar) {
        if (this.f13230e == null || vVar == null) {
            return;
        }
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) vVar.j().a();
        this.f13230e.a(threadPoolExecutor.getPoolSize(), threadPoolExecutor.getActiveCount(), threadPoolExecutor.getQueue().size());
    }

    private static void b(y.a aVar, com.mbridge.msdk.config.component.nori.model.a aVar2) throws IOException {
        String strE = aVar2.e();
        if (strE != null) {
            String upperCase = strE.toUpperCase();
            upperCase.getClass();
            switch (upperCase) {
                case "OPTIONS":
                    aVar.a("OPTIONS", (z) null);
                    return;
                case "GET":
                    aVar.c();
                    return;
                case "PUT":
                    Map<String, Object> mapA = aVar2.a();
                    if (mapA == null || mapA.isEmpty()) {
                        return;
                    }
                    p.a aVar3 = new p.a();
                    for (Map.Entry<String, Object> entry : mapA.entrySet()) {
                        aVar3.a(entry.getKey(), String.valueOf(entry.getValue()));
                    }
                    aVar.d(aVar3.a());
                    return;
                case "HEAD":
                    aVar.d();
                    return;
                case "POST":
                    Map<String, Object> mapA2 = aVar2.a();
                    p.a aVar4 = new p.a();
                    if (mapA2 != null && !mapA2.isEmpty()) {
                        for (Map.Entry<String, Object> entry2 : mapA2.entrySet()) {
                            aVar4.a(entry2.getKey(), String.valueOf(entry2.getValue()));
                        }
                    }
                    aVar.c(aVar4.a());
                    return;
                case "PATCH":
                    Map<String, Object> mapA3 = aVar2.a();
                    if (mapA3 == null || mapA3.isEmpty()) {
                        return;
                    }
                    p.a aVar5 = new p.a();
                    for (Map.Entry<String, Object> entry3 : mapA3.entrySet()) {
                        aVar5.a(entry3.getKey(), String.valueOf(entry3.getValue()));
                    }
                    aVar.b(aVar5.a());
                    return;
                case "TRACE":
                    aVar.a("TRACE", (z) null);
                    return;
                case "DELETE":
                    aVar.b();
                    return;
                default:
                    throw new IllegalStateException("Unknown method type: " + strE);
            }
        }
        throw new IOException("Request method cannot be null");
    }
}
