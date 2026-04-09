package t6;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f34389b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h3.h f34390c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mk.a f34391d;

    public /* synthetic */ p(AtomicBoolean atomicBoolean, h3.h hVar, mk.a aVar, int i4) {
        this.f34388a = i4;
        this.f34389b = atomicBoolean;
        this.f34390c = hVar;
        this.f34391d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34388a) {
            case 0:
                h3.h hVar = this.f34390c;
                mk.a aVar = this.f34391d;
                if (!this.f34389b.get()) {
                    try {
                        hVar.a(aVar.invoke());
                        break;
                    } catch (Throwable th2) {
                        hVar.b(th2);
                        return;
                    }
                }
                break;
            default:
                h3.h hVar2 = this.f34390c;
                mk.a aVar2 = this.f34391d;
                if (!this.f34389b.get()) {
                    try {
                        hVar2.a(aVar2.invoke());
                        break;
                    } catch (Throwable th3) {
                        hVar2.b(th3);
                    }
                }
                break;
        }
    }
}
