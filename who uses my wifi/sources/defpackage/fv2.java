package defpackage;

import android.os.SystemClock;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class fv2 implements v93 {
    public final /* synthetic */ int f = 0;
    public final Object g;
    public final Object h;

    public fv2(cx1 cx1Var, Map map) {
        this.g = map;
        this.h = cx1Var;
    }

    @Override // defpackage.v93
    public final void H(s93 s93Var, String str, Throwable th) {
        switch (this.f) {
            case 0:
                Map map = (Map) this.g;
                if (map.containsKey(s93Var)) {
                    ((cx1) this.h).b(((ev2) map.get(s93Var)).c);
                    return;
                }
                return;
            default:
                if (((Boolean) tw1.e.c.a(mz1.C6)).booleanValue() && s93.j == s93Var) {
                    ez2 ez2Var = (ez2) this.g;
                    if (ez2Var.b() != 0) {
                        hg4.C.k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - ez2Var.b();
                        synchronized (ez2Var) {
                            synchronized (ez2Var.j) {
                                ez2Var.e = jElapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.v93
    public final void R(String str, s93 s93Var) {
        switch (this.f) {
            case 0:
                Map map = (Map) this.g;
                if (map.containsKey(s93Var)) {
                    ((cx1) this.h).b(((ev2) map.get(s93Var)).b);
                    return;
                }
                return;
            default:
                if (((Boolean) tw1.e.c.a(mz1.C6)).booleanValue() && s93.j == s93Var) {
                    ez2 ez2Var = (ez2) this.g;
                    if (ez2Var.b() != 0) {
                        hg4.C.k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() - ez2Var.b();
                        synchronized (ez2Var) {
                            synchronized (ez2Var.j) {
                                ez2Var.e = jElapsedRealtime;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.v93
    public final void s(String str) {
        int i = this.f;
    }

    @Override // defpackage.v93
    public final void w(String str, s93 s93Var) {
        switch (this.f) {
            case 0:
                Map map = (Map) this.g;
                if (map.containsKey(s93Var)) {
                    ((cx1) this.h).b(((ev2) map.get(s93Var)).a);
                    return;
                }
                return;
            default:
                if (((Boolean) tw1.e.c.a(mz1.C6)).booleanValue()) {
                    if (s93.j == s93Var) {
                        ez2 ez2Var = (ez2) this.g;
                        hg4.C.k.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        synchronized (ez2Var) {
                            synchronized (ez2Var.i) {
                                ez2Var.d = jElapsedRealtime;
                            }
                        }
                        return;
                    }
                    if (s93.C == s93Var || s93.i == s93Var) {
                        ez2 ez2Var2 = (ez2) this.g;
                        hg4.C.k.getClass();
                        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                        synchronized (ez2Var2) {
                            synchronized (ez2Var2.f) {
                                ez2Var2.a = jElapsedRealtime2;
                            }
                        }
                        fz2 fz2Var = (fz2) this.h;
                        ((wt2) fz2Var.b).e(new ue(fz2Var, ez2Var2.a(), 6));
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public fv2(ez2 ez2Var, fz2 fz2Var) {
        this.g = ez2Var;
        this.h = fz2Var;
    }

    private final void a(String str) {
    }

    private final void b(String str) {
    }
}
