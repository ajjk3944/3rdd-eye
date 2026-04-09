package ya;

import android.content.Context;
import com.google.android.gms.internal.ads.fx;
import com.google.android.gms.internal.ads.r7;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u extends a8.a {

    /* renamed from: c, reason: collision with root package name */
    public final za.l f37487c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37488d;

    /* renamed from: e, reason: collision with root package name */
    public final z.e f37489e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Context context, String str, String str2, z.e eVar) {
        super(10);
        String strF = ua.j.C.f35261c.F(context, str);
        this.f37487c = new za.l(context, strF);
        this.f37488d = str2;
        this.f37489e = eVar;
    }

    @Override // a8.a
    public final void z() {
        String str = this.f37488d;
        z.e eVar = this.f37489e;
        if (eVar == null) {
            this.f37487c.a(null, str);
            return;
        }
        new r7((za.h) eVar.f37798a, this.f37487c, fx.f11278e, null, null, 9).c(str);
    }
}
