package M2;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import q2.C2834o;

/* renamed from: M2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0168h extends AbstractC0165e implements K2.c {

    /* renamed from: y, reason: collision with root package name */
    public final Set f2776y;

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC0168h(Context context, Looper looper, int i, C2834o c2834o, K2.g gVar, K2.h hVar) {
        G gA = G.a(context);
        J2.e eVar = J2.e.f2057d;
        u.e(gVar);
        u.e(hVar);
        super(context, looper, gA, eVar, i, new k(gVar), new k(hVar), (String) c2834o.f23255e);
        Set set = (Set) c2834o.f23253c;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        this.f2776y = set;
    }

    @Override // K2.c
    public final Set a() {
        return m() ? this.f2776y : Collections.EMPTY_SET;
    }

    @Override // M2.AbstractC0165e
    public final Account p() {
        return null;
    }

    @Override // M2.AbstractC0165e
    public final Set s() {
        return this.f2776y;
    }
}
