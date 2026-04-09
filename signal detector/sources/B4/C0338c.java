package b4;

/* renamed from: b4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0338c extends AbstractRunnableC0359x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5734b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5735c;

    public /* synthetic */ C0338c(int i, Object obj) {
        this.f5734b = i;
        this.f5735c = obj;
    }

    @Override // b4.AbstractRunnableC0359x
    public final void a() {
        switch (this.f5734b) {
            case 0:
                C0339d c0339d = (C0339d) ((S3.o) this.f5735c).f3497b;
                c0339d.f5738b.c("unlinkToDeath", new Object[0]);
                c0339d.f5748m.asBinder().unlinkToDeath(c0339d.f5745j, 0);
                c0339d.f5748m = null;
                c0339d.f5743g = false;
                return;
            default:
                synchronized (((C0339d) this.f5735c).f5742f) {
                    try {
                        if (((C0339d) this.f5735c).f5746k.get() > 0 && ((C0339d) this.f5735c).f5746k.decrementAndGet() > 0) {
                            ((C0339d) this.f5735c).f5738b.c("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C0339d c0339d2 = (C0339d) this.f5735c;
                        if (c0339d2.f5748m != null) {
                            c0339d2.f5738b.c("Unbind from service.", new Object[0]);
                            C0339d c0339d3 = (C0339d) this.f5735c;
                            c0339d3.f5737a.unbindService(c0339d3.f5747l);
                            C0339d c0339d4 = (C0339d) this.f5735c;
                            c0339d4.f5743g = false;
                            c0339d4.f5748m = null;
                            c0339d4.f5747l = null;
                        }
                        ((C0339d) this.f5735c).d();
                        return;
                    } finally {
                    }
                }
        }
    }
}
