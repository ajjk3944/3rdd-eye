package P6;

import hg.InterfaceC6043c;
import java.util.concurrent.atomic.AtomicBoolean;
import kg.InterfaceC6468e;

/* loaded from: classes3.dex */
public class F implements gg.x, InterfaceC6468e {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f18057a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private final gg.t f18058b;

    /* renamed from: c, reason: collision with root package name */
    private final O6.i f18059c;

    public F(gg.t tVar, O6.i iVar) {
        this.f18058b = tVar;
        this.f18059c = iVar;
        tVar.d(this);
    }

    @Override // gg.x
    public void a() {
        this.f18059c.release();
        this.f18058b.a();
    }

    public synchronized boolean b() {
        return this.f18057a.get();
    }

    @Override // gg.x
    public void c(InterfaceC6043c interfaceC6043c) {
    }

    @Override // kg.InterfaceC6468e
    public synchronized void cancel() {
        this.f18057a.set(true);
    }

    @Override // gg.x
    public void h(Object obj) {
        this.f18058b.h(obj);
    }

    @Override // gg.x
    public void onError(Throwable th2) {
        this.f18059c.release();
        this.f18058b.c(th2);
    }
}
