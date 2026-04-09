package io.sentry.android.replay;

import io.sentry.b5;
import io.sentry.x5;
import io.sentry.z5;
import java.io.File;

/* loaded from: classes.dex */
public final class i extends br.n implements ar.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11927d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f11928g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f11929r;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f11930x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, long j, Object obj2, int i10) {
        super(1);
        this.f11927d = i10;
        this.f11928g = j;
        this.f11929r = obj;
        this.f11930x = obj2;
    }

    @Override // ar.k
    public final Object a(Object obj) {
        switch (this.f11927d) {
            case 0:
                k kVar = (k) obj;
                br.l.e(kVar, "it");
                if (kVar.f11938b < this.f11928g) {
                    ((j) this.f11929r).f(kVar.f11937a);
                    return Boolean.TRUE;
                }
                br.w wVar = (br.w) this.f11930x;
                if (wVar.f2917a == null) {
                    wVar.f2917a = kVar.f11939c;
                }
                return Boolean.FALSE;
            case 1:
                io.sentry.android.replay.capture.j jVar = (io.sentry.android.replay.capture.j) obj;
                io.sentry.android.replay.capture.g gVar = (io.sentry.android.replay.capture.g) this.f11929r;
                br.l.e(jVar, "it");
                z5 z5Var = jVar.f11890a;
                if (z5Var.Q.getTime() >= this.f11928g) {
                    return Boolean.FALSE;
                }
                gVar.k(gVar.i() - 1);
                File file = z5Var.L;
                x5 x5Var = gVar.f11885r;
                if (file != null) {
                    try {
                        if (!file.delete()) {
                            x5Var.getLogger().m(b5.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                        }
                    } catch (Throwable th2) {
                        x5Var.getLogger().f(b5.ERROR, th2, "Failed to delete replay segment: %s", file.getAbsolutePath());
                    }
                }
                ((br.t) this.f11930x).f2914a = true;
                return Boolean.TRUE;
            default:
                cj.l lVar = (cj.l) obj;
                br.l.e(lVar, "listener");
                String str = (String) this.f11929r;
                vj.c cVar = (vj.c) this.f11930x;
                lVar.v(this.f11928g, str, cVar != null ? cVar.h() : "");
                return lq.b0.f15562a;
        }
    }
}
