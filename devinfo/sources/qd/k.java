package qd;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class k extends i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32251c;

    public /* synthetic */ k(int i4, Object obj) {
        this.f32250b = i4;
        this.f32251c = obj;
    }

    @Override // qd.i
    public final void a() {
        switch (this.f32250b) {
            case 0:
                synchronized (((n) this.f32251c).f32262f) {
                    try {
                        if (((n) this.f32251c).f32265k.get() > 0 && ((n) this.f32251c).f32265k.decrementAndGet() > 0) {
                            ((n) this.f32251c).f32258b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        n nVar = (n) this.f32251c;
                        if (nVar.f32267m != null) {
                            nVar.f32258b.d("Unbind from service.", new Object[0]);
                            n nVar2 = (n) this.f32251c;
                            nVar2.f32257a.unbindService(nVar2.f32266l);
                            n nVar3 = (n) this.f32251c;
                            nVar3.g = false;
                            nVar3.f32267m = null;
                            nVar3.f32266l = null;
                        }
                        ((n) this.f32251c).d();
                        return;
                    } finally {
                    }
                }
            default:
                n nVar4 = (n) ((m) this.f32251c).f32255b;
                nVar4.f32258b.d("unlinkToDeath", new Object[0]);
                nVar4.f32267m.asBinder().unlinkToDeath(nVar4.j, 0);
                nVar4.f32267m = null;
                nVar4.g = false;
                return;
        }
    }
}
