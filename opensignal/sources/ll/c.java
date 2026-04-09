package ll;

import android.content.Context;
import bf.n;
import br.l;
import com.staircase3.opensignal.utils.r;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f15545a;

    public c(a aVar) {
        l.e(aVar, "getNetworkTypeUseCase");
        this.f15545a = aVar;
    }

    public final boolean a() {
        a aVar = this.f15545a;
        r rVar = aVar.f15542b;
        Context applicationContext = aVar.f15541a.getApplicationContext();
        l.d(applicationContext, "getApplicationContext(...)");
        int i10 = b.f15544a[aVar.f15543c.b(rVar.a(applicationContext)).f22890a.ordinal()];
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2 || i10 == 3) {
            return false;
        }
        throw new n();
    }
}
