package defpackage;

import android.os.RemoteException;
import com.phuongpn.whousemywifi.networkscanner.MainActivity;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class ta0 extends mz0 implements hy {
    public final /* synthetic */ MainActivity j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta0(MainActivity mainActivity, oj ojVar) {
        super(2, ojVar);
        this.j = mainActivity;
    }

    @Override // defpackage.hy
    public final Object f(Object obj, Object obj2) {
        ta0 ta0Var = (ta0) h((oj) obj2, (qk) obj);
        z31 z31Var = z31.a;
        ta0Var.m(z31Var);
        return z31Var;
    }

    @Override // defpackage.s9
    public final oj h(oj ojVar, Object obj) {
        return new ta0(this.j, ojVar);
    }

    @Override // defpackage.s9
    public final Object m(Object obj) {
        bd2.x(obj);
        MainActivity mainActivity = this.j;
        sa0 sa0Var = new sa0();
        final f53 f53VarD = f53.d();
        synchronized (f53VarD.a) {
            try {
                if (f53VarD.c) {
                    f53VarD.b.add(sa0Var);
                } else if (f53VarD.d) {
                    f53VarD.e();
                } else {
                    f53VarD.c = true;
                    f53VarD.b.add(sa0Var);
                    synchronized (f53VarD.e) {
                        try {
                            f53VarD.b(mainActivity);
                            f53VarD.f.y2(new tw2(1, f53VarD));
                            f53VarD.f.x2(new s62());
                            f53VarD.g.getClass();
                            f53VarD.g.getClass();
                        } catch (RemoteException unused) {
                            gi2.q0(5);
                        }
                        mz1.a(mainActivity);
                        if (((Boolean) q02.a.w()).booleanValue()) {
                            if (((Boolean) tw1.e.c.a(mz1.Vb)).booleanValue()) {
                                gi2.U("Initializing on bg thread");
                                final int i = 1;
                                uu1.a.execute(new Runnable() { // from class: a43
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        switch (i) {
                                            case 0:
                                                f53 f53Var = f53VarD;
                                                synchronized (f53Var.e) {
                                                    f53Var.c();
                                                }
                                                return;
                                            default:
                                                f53 f53Var2 = f53VarD;
                                                synchronized (f53Var2.e) {
                                                    f53Var2.c();
                                                }
                                                return;
                                        }
                                    }
                                });
                            }
                            new r23(mainActivity);
                            new r23(mainActivity);
                            new r23(mainActivity);
                        }
                        if (((Boolean) q02.b.w()).booleanValue()) {
                            if (((Boolean) tw1.e.c.a(mz1.Vb)).booleanValue()) {
                                final int i2 = 0;
                                uu1.b.execute(new Runnable() { // from class: a43
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        switch (i2) {
                                            case 0:
                                                f53 f53Var = f53VarD;
                                                synchronized (f53Var.e) {
                                                    f53Var.c();
                                                }
                                                return;
                                            default:
                                                f53 f53Var2 = f53VarD;
                                                synchronized (f53Var2.e) {
                                                    f53Var2.c();
                                                }
                                                return;
                                        }
                                    }
                                });
                            }
                            new r23(mainActivity);
                            new r23(mainActivity);
                            new r23(mainActivity);
                        }
                        gi2.U("Initializing on calling thread");
                        f53VarD.c();
                        new r23(mainActivity);
                        new r23(mainActivity);
                        new r23(mainActivity);
                    }
                }
            } finally {
            }
        }
        MainActivity mainActivity2 = this.j;
        mainActivity2.runOnUiThread(new la0(mainActivity2, 7));
        return z31.a;
    }
}
