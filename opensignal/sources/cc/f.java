package cc;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import h9.r2;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class f extends e implements ac.c {

    /* renamed from: z, reason: collision with root package name */
    public final Set f3646z;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(Context context, Looper looper, int i10, r2 r2Var, ac.g gVar, ac.h hVar) {
        e0 e0VarA = e0.a(context);
        zb.c cVar = zb.c.f26814e;
        s.h(gVar);
        s.h(hVar);
        super(context, looper, e0VarA, cVar, i10, new h(gVar), new h(hVar), (String) r2Var.f10473r);
        Set set = (Set) r2Var.f10471d;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f3646z = set;
    }

    @Override // cc.e
    public final Account g() {
        return null;
    }

    @Override // cc.e
    public final Executor i() {
        return null;
    }

    @Override // cc.e
    public final Set l() {
        return this.f3646z;
    }
}
