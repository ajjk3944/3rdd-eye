package com.mbridge.msdk.tracker;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final c f18238a;

    /* renamed from: b, reason: collision with root package name */
    private final s f18239b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicLong f18240c = new AtomicLong(0);

    /* renamed from: d, reason: collision with root package name */
    private final long[] f18241d = new long[2];

    public g(c cVar, s sVar) {
        this.f18238a = cVar;
        this.f18239b = sVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        try {
            long jIncrementAndGet = this.f18240c.incrementAndGet();
            this.f18241d[0] = System.currentTimeMillis();
            this.f18241d[1] = jIncrementAndGet;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "notice error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        try {
            i iVar = new i(eVar);
            iVar.a(1);
            iVar.b(0);
            iVar.a(System.currentTimeMillis() + eVar.k());
            this.f18238a.a(iVar);
            this.f18239b.k();
            this.f18239b.e();
            this.f18239b.a(eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("TrackManager", "process error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        long[] jArr = this.f18241d;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
