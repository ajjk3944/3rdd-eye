package pb;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class h extends e implements ob.c {

    /* renamed from: y, reason: collision with root package name */
    public final Set f31613y;

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Context context, Looper looper, int i4, va.o oVar, ob.g gVar, ob.h hVar) {
        k0 k0VarA = k0.a(context);
        nb.e eVar = nb.e.f29897d;
        y.h(gVar);
        y.h(hVar);
        super(context, looper, k0VarA, eVar, i4, new k(gVar), new k(hVar), (String) oVar.f36149e);
        Set set = (Set) oVar.f36147c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f31613y = set;
    }

    @Override // ob.c
    public final Set a() {
        return m() ? this.f31613y : Collections.EMPTY_SET;
    }

    @Override // pb.e
    public final Account p() {
        return null;
    }

    @Override // pb.e
    public final Set s() {
        return this.f31613y;
    }
}
