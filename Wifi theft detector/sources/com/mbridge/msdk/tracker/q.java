package com.mbridge.msdk.tracker;

import android.util.Log;

/* loaded from: classes3.dex */
class q implements l {

    /* renamed from: a, reason: collision with root package name */
    private final g f18436a;

    public q(g gVar) {
        this.f18436a = gVar;
    }

    @Override // com.mbridge.msdk.tracker.l
    public void a(e eVar) {
        if (y.b(this.f18436a)) {
            return;
        }
        this.f18436a.a(eVar);
    }

    @Override // com.mbridge.msdk.tracker.l
    public void b(e eVar) {
        if (y.b(this.f18436a)) {
            return;
        }
        try {
            h hVarJ = eVar.j();
            if (y.a(hVarJ)) {
                eVar.a(hVarJ.a(eVar));
            }
            this.f18436a.b(eVar);
        } catch (Exception e10) {
            if (a.f18222a) {
                Log.e("TrackManager", "process event error", e10);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.l
    public long[] a() {
        if (y.b(this.f18436a)) {
            return new long[]{0, 0};
        }
        return this.f18436a.a();
    }
}
