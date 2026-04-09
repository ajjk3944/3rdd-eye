package V2;

import A2.C0117e;
import G3.C0152f;
import S4.r;
import android.content.Context;
import c3.j;
import com.google.android.gms.common.api.Status;
import h0.C2351a;

/* loaded from: classes.dex */
public final class g extends K2.f implements G2.a {

    /* renamed from: k, reason: collision with root package name */
    public static final C2351a f3872k = new C2351a("AppSet.API", new O2.b(1), new C0152f(19));
    public final Context i;

    /* renamed from: j, reason: collision with root package name */
    public final J2.f f3873j;

    public g(Context context, J2.f fVar) {
        super(context, f3872k, K2.b.f2146a, K2.e.f2148b);
        this.i = context;
        this.f3873j = fVar;
    }

    @Override // G2.a
    public final j b() {
        if (this.f3873j.c(this.i, 212800000) != 0) {
            return com.bumptech.glide.d.r(new K2.d(new Status(17, null, null, null)));
        }
        C0117e c0117e = new C0117e(8, false);
        J2.d[] dVarArr = {G2.d.f1517a};
        c0117e.f245b = new r(this);
        return c(0, new H3.g(c0117e, dVarArr, false, 27601));
    }
}
