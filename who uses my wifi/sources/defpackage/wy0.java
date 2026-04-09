package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Binder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class wy0 implements ILoggerFactory, iq3 {
    public boolean f;
    public Object g;
    public Object h;

    public wy0(Context context, int i) {
        switch (i) {
            case 4:
                ExecutorService executorService = uu1.b;
                this.h = executorService;
                executorService.execute(new jq3(this, context, 26));
                break;
            default:
                this.h = new Object();
                break;
        }
    }

    @Override // org.slf4j.ILoggerFactory
    public synchronized i80 a(String str) {
        vy0 vy0Var;
        vy0Var = (vy0) ((HashMap) this.g).get(str);
        if (vy0Var == null) {
            vy0Var = new vy0(str, (LinkedBlockingQueue) this.h, this.f);
            ((HashMap) this.g).put(str, vy0Var);
        }
        return vy0Var;
    }

    public void b(Context context) {
        synchronized (this.g) {
            try {
                if (!this.f) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
                    if (application == null) {
                        gi2.i0("Can not cast Context to Application");
                        return;
                    }
                    if (((vv1) this.h) == null) {
                        this.h = new vv1();
                    }
                    vv1 vv1Var = (vv1) this.h;
                    if (!vv1Var.n) {
                        application.registerActivityLifecycleCallbacks(vv1Var);
                        if (context instanceof Activity) {
                            vv1Var.a((Activity) context);
                        }
                        vv1Var.g = application;
                        vv1Var.o = ((Long) tw1.e.c.a(mz1.c1)).longValue();
                        vv1Var.n = true;
                    }
                    this.f = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(je4 je4Var) {
        synchronized (this.g) {
            try {
                if (((ArrayDeque) this.h) == null) {
                    this.h = new ArrayDeque();
                }
                ((ArrayDeque) this.h).add(je4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ void d() {
        synchronized (this.h) {
            try {
                vw1 vw1Var = (vw1) this.g;
                if (vw1Var == null) {
                    return;
                }
                vw1Var.k();
                this.g = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void e(int i) {
        if (this.f) {
            return;
        }
        this.f = true;
        j(new nx2(i, b23.c(((c03) this.g).a, i), "undefined", null, null));
    }

    public void f(wv1 wv1Var) {
        synchronized (this.g) {
            try {
                if (((vv1) this.h) == null) {
                    this.h = new vv1();
                }
                vv1 vv1Var = (vv1) this.h;
                synchronized (vv1Var.h) {
                    vv1Var.k.add(wv1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g(gi4 gi4Var) {
        je4 je4Var;
        synchronized (this.g) {
            if (((ArrayDeque) this.h) != null && !this.f) {
                this.f = true;
                while (true) {
                    synchronized (this.g) {
                        try {
                            je4Var = (je4) ((ArrayDeque) this.h).poll();
                            if (je4Var == null) {
                                this.f = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    je4Var.a(gi4Var);
                }
            }
        }
    }

    public void h(wv1 wv1Var) {
        synchronized (this.g) {
            try {
                vv1 vv1Var = (vv1) this.h;
                if (vv1Var == null) {
                    return;
                }
                synchronized (vv1Var.h) {
                    vv1Var.k.remove(wv1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Activity i() {
        synchronized (this.g) {
            try {
                vv1 vv1Var = (vv1) this.h;
                if (vv1Var == null) {
                    return null;
                }
                return vv1Var.f;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized void j(nx2 nx2Var) {
        int i = 1;
        if (true == ((Boolean) tw1.e.c.a(mz1.V5)).booleanValue()) {
            i = 3;
        }
        ((pd2) this.h).b(new d03(i, nx2Var));
    }

    public boolean k() {
        synchronized (this.g) {
            try {
                vv1 vv1Var = (vv1) this.h;
                if (vv1Var == null) {
                    return false;
                }
                return vv1Var.i.get();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.iq3
    public void p(Object obj) {
        aa3 aa3Var = (aa3) this.h;
        aa3Var.b(true);
        da3 da3Var = (da3) this.g;
        da3Var.a(aa3Var);
        if (this.f) {
            da3Var.h();
        }
    }

    @Override // defpackage.iq3
    public void s(Throwable th) {
        aa3 aa3Var = (aa3) this.h;
        if (aa3Var.d()) {
            da3 da3Var = (da3) this.g;
            aa3Var.j(th);
            aa3Var.b(false);
            da3Var.a(aa3Var);
            if (this.f) {
                da3Var.h();
            }
        }
    }

    public wy0(int i) {
        switch (i) {
            case 2:
                this.g = new Object();
                this.h = null;
                this.f = false;
                break;
            case 3:
            case 5:
            case 6:
            default:
                this.f = false;
                this.g = new HashMap();
                this.h = new LinkedBlockingQueue();
                break;
            case 4:
                this.h = uu1.b;
                break;
            case 7:
                this.g = new ArrayList();
                this.h = hv3.b;
                this.f = false;
                break;
            case 8:
                this.g = new Object();
                break;
        }
    }
}
