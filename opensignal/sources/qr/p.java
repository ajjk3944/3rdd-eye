package qr;

import com.google.android.gms.internal.measurement.e5;
import java.util.List;
import mq.b0;
import mq.w;
import vs.y;

/* loaded from: classes.dex */
public final class p extends br.n implements ar.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20997d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r f20998g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(r rVar, int i10) {
        super(0);
        this.f20997d = i10;
        this.f20998g = rVar;
    }

    @Override // ar.a
    public final Object c() {
        int i10 = this.f20997d;
        r rVar = this.f20998g;
        switch (i10) {
            case 0:
                return rVar.f21003a.f23623x.e();
            default:
                or.h hVar = rVar.f21003a.f23623x;
                qs.g gVar = sr.e.f22212a;
                br.l.e(hVar, "<this>");
                List listH = e5.H(new sr.j(hVar, or.n.f19699m, b0.R(new lq.l(sr.e.f22212a, new y("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new lq.l(sr.e.f22213b, new vs.a((Object) new sr.j(hVar, or.n.f19701o, b0.R(new lq.l(sr.e.f22215d, new y("")), new lq.l(sr.e.f22216e, new vs.b(w.f16945a, new j1.a(9, hVar))))))), new lq.l(sr.e.f22214c, new vs.i(qs.b.j(or.n.f19700n), qs.g.e("WARNING"))))));
                return listH.isEmpty() ? sr.g.f22217a : new sr.i(0, listH);
        }
    }
}
