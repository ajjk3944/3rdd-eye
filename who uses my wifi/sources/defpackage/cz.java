package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class cz extends w9 implements v4 {
    public final Set y;

    /* JADX WARN: Illegal instructions before constructor call */
    public cz(Context context, Looper looper, int i, bu1 bu1Var, hz hzVar, iz izVar) {
        nf4 nf4VarA = nf4.a(context);
        fz fzVar = fz.d;
        ou1.j(hzVar);
        ou1.j(izVar);
        super(context, looper, nf4VarA, fzVar, i, new zs1(8, hzVar), new f23(10, izVar), (String) bu1Var.j);
        Set set = (Set) bu1Var.h;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.y = set;
    }

    @Override // defpackage.v4
    public final Set c() {
        return l() ? this.y : Collections.EMPTY_SET;
    }

    @Override // defpackage.w9
    public final Account p() {
        return null;
    }

    @Override // defpackage.w9
    public final Set s() {
        return this.y;
    }
}
