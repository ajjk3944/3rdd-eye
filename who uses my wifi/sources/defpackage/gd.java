package defpackage;

import android.database.SQLException;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class gd implements Runnable {
    public final sj0 f = new sj0();

    public static void a(ha1 ha1Var, String str) throws SQLException {
        WorkDatabase workDatabase = ha1Var.r;
        h2 h2VarN = workDatabase.n();
        l92 l92VarI = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iE = h2VarN.e(str2);
            if (iE != 3 && iE != 4) {
                h2VarN.n(6, str2);
            }
            linkedList.addAll(l92VarI.x(str2));
        }
        om0 om0Var = ha1Var.u;
        synchronized (om0Var.p) {
            try {
                h80 h80VarD = h80.d();
                String str3 = om0.q;
                h80VarD.a(new Throwable[0]);
                om0Var.n.add(str);
                wa1 wa1Var = (wa1) om0Var.k.remove(str);
                boolean z = wa1Var != null;
                if (wa1Var == null) {
                    wa1Var = (wa1) om0Var.l.remove(str);
                }
                om0.c(str, wa1Var);
                if (z) {
                    om0Var.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = ha1Var.t.iterator();
        while (it.hasNext()) {
            ((et0) it.next()).b(str);
        }
    }

    public abstract void b();

    @Override // java.lang.Runnable
    public final void run() {
        sj0 sj0Var = this.f;
        try {
            b();
            sj0Var.a(sj0.c);
        } catch (Throwable th) {
            sj0Var.a(new pj0(th));
        }
    }
}
