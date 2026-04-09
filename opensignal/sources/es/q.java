package es;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class q extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8329d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s f8330g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, int i10) {
        super(0);
        this.f8329d = i10;
        this.f8330g = sVar;
    }

    @Override // ar.a
    public final Object c() {
        switch (this.f8329d) {
            case 0:
                s sVar = this.f8330g;
                js.h hVar = ((ds.a) sVar.E.f3974d).f7455l;
                sVar.f23629y.b();
                hVar.getClass();
                return mq.b0.V(new ArrayList());
            case 1:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) io.sentry.config.a.Z(this.f8330g.F, s.J[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    wr.b bVar = (wr.b) entry.getValue();
                    ys.b bVarD = ys.b.d(str);
                    ks.c cVar = bVar.f24589b;
                    ks.b bVar2 = (ks.b) cVar.f14489c;
                    int i10 = r.f8331a[bVar2.ordinal()];
                    if (i10 == 1) {
                        String str2 = (String) cVar.f14494h;
                        if (bVar2 != ks.b.MULTIFILE_CLASS_PART) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            map.put(bVarD, ys.b.d(str2));
                        }
                    } else if (i10 == 2) {
                        map.put(bVarD, bVarD);
                    }
                }
                return map;
            default:
                this.f8330g.D.getClass();
                return new ArrayList(mq.p.a0(mq.w.f16945a, 10));
        }
    }
}
