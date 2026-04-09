package t;

import sh.s0;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33842a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f33843b;

    public /* synthetic */ f(m mVar, int i4) {
        this.f33842a = i4;
        this.f33843b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33842a) {
            case 0:
                s sVar = this.f33843b.f33848a0;
                if (sVar.f33855c == null) {
                    sVar.f33855c = new s0(1);
                }
                sVar.f33855c.p();
                break;
            case 1:
                this.f33843b.f33848a0.f33871u = false;
                break;
            default:
                s sVar2 = this.f33843b.f33848a0;
                if (sVar2.f33855c == null) {
                    sVar2.f33855c = new s0(1);
                }
                sVar2.f33855c.q();
                break;
        }
    }

    public f(m mVar, p pVar) {
        this.f33842a = 2;
        this.f33843b = mVar;
    }
}
