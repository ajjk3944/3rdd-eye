package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class hk2 implements ca4 {
    public final ba4 a;
    public final ba4 b;
    public final ba4 c;

    public hk2(ba4 ba4Var, ba4 ba4Var2, ba4 ba4Var3) {
        this.a = ba4Var;
        this.b = ba4Var2;
        this.c = ba4Var3;
    }

    @Override // defpackage.ga4
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final go2 d() {
        return new go2((ScheduledExecutorService) this.a.d(), (ym) this.b.d(), (mv2) this.c.d());
    }
}
