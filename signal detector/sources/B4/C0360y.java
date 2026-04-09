package b4;

import h0.C2351a;

/* renamed from: b4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0360y extends AbstractRunnableC0359x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c3.f f5779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a4.i f5780c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0339d f5781d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0360y(C0339d c0339d, c3.f fVar, c3.f fVar2, a4.i iVar) {
        super(fVar);
        this.f5781d = c0339d;
        this.f5779b = fVar2;
        this.f5780c = iVar;
    }

    @Override // b4.AbstractRunnableC0359x
    public final void a() {
        synchronized (this.f5781d.f5742f) {
            try {
                C0339d c0339d = this.f5781d;
                c3.f fVar = this.f5779b;
                c0339d.f5741e.add(fVar);
                fVar.f5902a.a(new C2351a(c0339d, 20, fVar));
                if (this.f5781d.f5746k.getAndIncrement() > 0) {
                    this.f5781d.f5738b.c("Already connected to the service.", new Object[0]);
                }
                C0339d.b(this.f5781d, this.f5780c);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
