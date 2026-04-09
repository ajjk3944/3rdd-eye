package ee;

import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f23412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f23413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o7.c f23414d;

    public /* synthetic */ e(g gVar, Runnable runnable, o7.c cVar, int i4) {
        this.f23411a = i4;
        this.f23412b = gVar;
        this.f23413c = runnable;
        this.f23414d = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f23411a) {
            case 0:
                ExecutorService executorService = this.f23412b.f23419a;
                final int i4 = 0;
                final Runnable runnable = this.f23413c;
                final o7.c cVar = this.f23414d;
                executorService.execute(new Runnable() { // from class: ee.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i4) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e2) {
                                    ((i) cVar.f30419b).l(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) cVar.f30419b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) cVar.f30419b;
                                try {
                                    runnable2.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    iVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f23412b.f23419a;
                final int i10 = 2;
                final Runnable runnable2 = this.f23413c;
                final o7.c cVar2 = this.f23414d;
                executorService2.execute(new Runnable() { // from class: ee.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e2) {
                                    ((i) cVar2.f30419b).l(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) cVar2.f30419b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) cVar2.f30419b;
                                try {
                                    runnable22.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    iVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f23412b.f23419a;
                final int i11 = 1;
                final Runnable runnable3 = this.f23413c;
                final o7.c cVar3 = this.f23414d;
                executorService3.execute(new Runnable() { // from class: ee.b
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e2) {
                                    ((i) cVar3.f30419b).l(e2);
                                    throw e2;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) cVar3.f30419b).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) cVar3.f30419b;
                                try {
                                    runnable22.run();
                                    iVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    iVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
