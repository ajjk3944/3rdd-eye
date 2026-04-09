package on;

import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19612a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ io.sentry.k f19613d;

    public /* synthetic */ f(io.sentry.k kVar, String str, int i10) {
        this.f19612a = i10;
        this.f19613d = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19612a) {
            case 0:
                io.sentry.k kVar = this.f19613d;
                br.l.e(kVar, "this$0");
                Iterator it = kVar.Y().iterator();
                while (it.hasNext()) {
                    ((kn.c) it.next()).getClass();
                }
                break;
            default:
                io.sentry.k kVar2 = this.f19613d;
                br.l.e(kVar2, "this$0");
                Iterator it2 = kVar2.Y().iterator();
                while (it2.hasNext()) {
                    kn.c cVar = (kn.c) it2.next();
                    cVar.getClass();
                    an.a aVar = cVar.f14450b.f14456e;
                    String str = cVar.f14451c;
                    aVar.getClass();
                    br.l.e(str, "entityId");
                    aVar.f882a.d("CATEGORY_OSCA", "osca_survey_closed", mq.b0.R(new lq.l("entity_id", str), new lq.l("connection", aVar.b())));
                    al.c.m(cVar);
                }
                break;
        }
    }
}
