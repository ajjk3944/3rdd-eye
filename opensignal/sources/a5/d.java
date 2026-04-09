package a5;

import n0.g2;

/* loaded from: classes.dex */
public final class d implements g2, q8.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f103a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f104d;

    @Override // q8.k
    public boolean a(m8.h hVar) {
        return this.f104d;
    }

    @Override // q8.k
    public boolean b() {
        return this.f104d;
    }

    public synchronized void c() {
        this.f104d = false;
    }

    public synchronized boolean d() {
        int i10 = this.f103a;
        synchronized (this) {
            switch (i10) {
                case 0:
                    if (this.f104d) {
                        return false;
                    }
                    this.f104d = true;
                    notifyAll();
                    return true;
                default:
                    if (this.f104d) {
                        return false;
                    }
                    this.f104d = true;
                    notifyAll();
                    return true;
            }
        }
    }

    @Override // n0.g2
    public Object getValue() {
        return Boolean.valueOf(this.f104d);
    }

    public /* synthetic */ d(int i10, boolean z10) {
        this.f103a = i10;
        this.f104d = z10;
    }
}
