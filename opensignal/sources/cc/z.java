package cc;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
public final class z extends n {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ e f3682g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e eVar, int i10, Bundle bundle) {
        super(eVar, i10, bundle);
        this.f3682g = eVar;
    }

    @Override // cc.n
    public final boolean a() {
        this.f3682g.j.a(ConnectionResult.f4805y);
        return true;
    }

    @Override // cc.n
    public final void b(ConnectionResult connectionResult) {
        e eVar = this.f3682g;
        eVar.getClass();
        eVar.j.a(connectionResult);
        System.currentTimeMillis();
    }
}
