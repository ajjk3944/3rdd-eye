package io.sentry;

import java.util.TimerTask;

/* loaded from: classes.dex */
public final class e6 extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12239a;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g6 f12240d;

    public /* synthetic */ e6(g6 g6Var, int i10) {
        this.f12239a = i10;
        this.f12240d = g6Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f12239a) {
            case 0:
                g6 g6Var = this.f12240d;
                o6 o6VarU = g6Var.u();
                if (o6VarU == null) {
                    o6VarU = o6.OK;
                }
                g6Var.x(o6VarU, null);
                g6Var.f12284l.set(false);
                break;
            default:
                g6 g6Var2 = this.f12240d;
                o6 o6VarU2 = g6Var2.u();
                if (o6VarU2 == null) {
                    o6VarU2 = o6.DEADLINE_EXCEEDED;
                }
                g6Var2.e(o6VarU2, g6Var2.f12290r.f12743g != null, null);
                g6Var2.f12285m.set(false);
                break;
        }
    }
}
