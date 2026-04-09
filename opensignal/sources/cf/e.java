package cf;

import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3723a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f3724d;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Runnable f3725g;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a2.g f3726r;

    public /* synthetic */ e(g gVar, Runnable runnable, a2.g gVar2, int i10) {
        this.f3723a = i10;
        this.f3724d = gVar;
        this.f3725g = runnable;
        this.f3726r = gVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3723a) {
            case 0:
                ExecutorService executorService = this.f3724d.f3731a;
                final int i10 = 0;
                final Runnable runnable = this.f3725g;
                final a2.g gVar = this.f3726r;
                executorService.execute(new Runnable() { // from class: cf.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e4) {
                                    ((i) gVar.f31a).k(e4);
                                    throw e4;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) gVar.f31a).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                i iVar = (i) gVar.f31a;
                                try {
                                    runnable2.run();
                                    iVar.j(null);
                                    return;
                                } catch (Exception e11) {
                                    iVar.k(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.f3724d.f3731a;
                final int i11 = 2;
                final Runnable runnable2 = this.f3725g;
                final a2.g gVar2 = this.f3726r;
                executorService2.execute(new Runnable() { // from class: cf.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e4) {
                                    ((i) gVar2.f31a).k(e4);
                                    throw e4;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) gVar2.f31a).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable2;
                                i iVar = (i) gVar2.f31a;
                                try {
                                    runnable22.run();
                                    iVar.j(null);
                                    return;
                                } catch (Exception e11) {
                                    iVar.k(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.f3724d.f3731a;
                final int i12 = 1;
                final Runnable runnable3 = this.f3725g;
                final a2.g gVar3 = this.f3726r;
                executorService3.execute(new Runnable() { // from class: cf.c
                    @Override // java.lang.Runnable
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e4) {
                                    ((i) gVar3.f31a).k(e4);
                                    throw e4;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((i) gVar3.f31a).k(e10);
                                    return;
                                }
                            default:
                                Runnable runnable22 = runnable3;
                                i iVar = (i) gVar3.f31a;
                                try {
                                    runnable22.run();
                                    iVar.j(null);
                                    return;
                                } catch (Exception e11) {
                                    iVar.k(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
