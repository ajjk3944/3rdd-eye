package J5;

import gg.x;

/* loaded from: classes3.dex */
final class e extends d {

    /* renamed from: a, reason: collision with root package name */
    private final d f9783a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f9784b;

    /* renamed from: c, reason: collision with root package name */
    private a f9785c;

    e(d dVar) {
        this.f9783a = dVar;
    }

    private void k1() {
        a aVar;
        while (true) {
            synchronized (this) {
                try {
                    aVar = this.f9785c;
                    if (aVar == null) {
                        this.f9784b = false;
                        return;
                    }
                    this.f9785c = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            aVar.a(this.f9783a);
        }
    }

    @Override // gg.s
    protected void L0(x xVar) {
        this.f9783a.d(xVar);
    }

    @Override // J5.d, kg.InterfaceC6469f
    public void accept(Object obj) {
        synchronized (this) {
            try {
                if (!this.f9784b) {
                    this.f9784b = true;
                    this.f9783a.accept(obj);
                    k1();
                } else {
                    a aVar = this.f9785c;
                    if (aVar == null) {
                        aVar = new a(4);
                        this.f9785c = aVar;
                    }
                    aVar.b(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // J5.d
    public boolean i1() {
        return this.f9783a.i1();
    }
}
