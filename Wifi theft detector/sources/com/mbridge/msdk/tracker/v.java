package com.mbridge.msdk.tracker;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.tracker.network.t;
import com.mbridge.msdk.tracker.network.v;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class v<T> extends com.mbridge.msdk.tracker.network.t<T> {
    private com.mbridge.msdk.tracker.network.e A;

    /* renamed from: w, reason: collision with root package name */
    private Map<String, String> f18462w;

    /* renamed from: x, reason: collision with root package name */
    private t.a f18463x;

    /* renamed from: y, reason: collision with root package name */
    private v.b<T> f18464y;

    /* renamed from: z, reason: collision with root package name */
    private w f18465z;

    public v(String str, int i10) {
        super(i10, str);
    }

    public v.b<T> C() {
        return this.f18464y;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public boolean a() {
        return false;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> f() {
        HashMap map = new HashMap();
        map.put(CommonGatewayClient.HEADER_CONTENT_TYPE, "application/x-www-form-urlencoded");
        map.put("Charset", C.UTF8_NAME);
        return map;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public Map<String, String> i() {
        return this.f18462w;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public t.a l() {
        return this.f18463x;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.x o() {
        if (y.b(this.A)) {
            this.A = new com.mbridge.msdk.tracker.network.e(30000, 0);
        }
        return this.A;
    }

    public v(String str, int i10, int i11) {
        super(i10, str, i11);
    }

    public void a(w wVar) {
        this.f18465z = wVar;
    }

    public void a(t.a aVar) {
        this.f18463x = aVar;
    }

    public void a(Map<String, String> map) {
        this.f18462w = map;
    }

    public void a(v.b<T> bVar) {
        this.f18464y = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public com.mbridge.msdk.tracker.network.v<T> a(com.mbridge.msdk.tracker.network.q qVar) {
        return this.f18465z.a(qVar);
    }

    @Override // com.mbridge.msdk.tracker.network.t
    public void a(T t10) {
        v.b<T> bVarC = C();
        this.f18464y = bVarC;
        if (bVarC != null) {
            bVarC.a(t10);
        }
    }
}
