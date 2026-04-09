package cg;

import android.content.Context;
import android.os.UserManager;
import bf.q;
import com.google.android.gms.internal.measurement.e5;
import dd.r;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d implements f, h {

    /* renamed from: a, reason: collision with root package name */
    public final q f3747a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3748b;

    /* renamed from: c, reason: collision with root package name */
    public final eg.b f3749c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f3750d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f3751e;

    public d(Context context, String str, Set set, eg.b bVar, Executor executor) {
        this.f3747a = new q(new bf.h(context, 1, str));
        this.f3750d = set;
        this.f3751e = executor;
        this.f3749c = bVar;
        this.f3748b = context;
    }

    public final r a() {
        if (!((UserManager) this.f3748b.getSystemService(UserManager.class)).isUserUnlocked()) {
            return e5.u("");
        }
        return e5.n(this.f3751e, new c(this, 0));
    }

    public final void b() {
        if (this.f3750d.size() <= 0) {
            e5.u(null);
        } else if (!((UserManager) this.f3748b.getSystemService(UserManager.class)).isUserUnlocked()) {
            e5.u(null);
        } else {
            e5.n(this.f3751e, new c(this, 1));
        }
    }
}
