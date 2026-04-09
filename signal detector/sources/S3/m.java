package S3;

/* loaded from: classes.dex */
public final class m extends k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3492b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3493c;

    public /* synthetic */ m(int i, Object obj) {
        this.f3492b = i;
        this.f3493c = obj;
    }

    @Override // S3.k
    public final void a() {
        switch (this.f3492b) {
            case 0:
                synchronized (((p) this.f3493c).f3504f) {
                    try {
                        if (((p) this.f3493c).f3508k.get() > 0 && ((p) this.f3493c).f3508k.decrementAndGet() > 0) {
                            ((p) this.f3493c).f3500b.f("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        p pVar = (p) this.f3493c;
                        if (pVar.f3510m != null) {
                            pVar.f3500b.f("Unbind from service.", new Object[0]);
                            p pVar2 = (p) this.f3493c;
                            pVar2.f3499a.unbindService(pVar2.f3509l);
                            p pVar3 = (p) this.f3493c;
                            pVar3.f3505g = false;
                            pVar3.f3510m = null;
                            pVar3.f3509l = null;
                        }
                        ((p) this.f3493c).d();
                        return;
                    } finally {
                    }
                }
            default:
                p pVar4 = (p) ((o) this.f3493c).f3497b;
                pVar4.f3500b.f("unlinkToDeath", new Object[0]);
                pVar4.f3510m.asBinder().unlinkToDeath(pVar4.f3507j, 0);
                pVar4.f3510m = null;
                pVar4.f3505g = false;
                return;
        }
    }
}
