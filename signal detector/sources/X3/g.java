package X3;

import S3.o;

/* loaded from: classes.dex */
public final class g extends f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4177c;

    public /* synthetic */ g(int i, Object obj) {
        this.f4176b = i;
        this.f4177c = obj;
    }

    @Override // X3.f
    public final void a() {
        switch (this.f4176b) {
            case 0:
                h hVar = (h) this.f4177c;
                if (hVar.f4190m != null) {
                    hVar.f4180b.c("Unbind from service.", new Object[0]);
                    hVar.f4179a.unbindService(hVar.f4189l);
                    hVar.f4185g = false;
                    hVar.f4190m = null;
                    hVar.f4189l = null;
                }
                hVar.b();
                break;
            default:
                h hVar2 = (h) ((o) this.f4177c).f3497b;
                hVar2.f4180b.c("unlinkToDeath", new Object[0]);
                hVar2.f4190m.asBinder().unlinkToDeath(hVar2.f4187j, 0);
                hVar2.f4190m = null;
                hVar2.f4185g = false;
                break;
        }
    }
}
