package xe;

import android.os.Bundle;
import io.sentry.internal.debugmeta.c;
import java.util.HashSet;
import oe.k0;
import oh.p;
import om.f;
import zc.p1;
import zc.q1;

/* loaded from: classes.dex */
public final class b implements q1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25306b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f25305a = i10;
        this.f25306b = obj;
    }

    @Override // zc.q1
    public final void a(long j, Bundle bundle, String str, String str2) {
        int i10 = this.f25305a;
        Object obj = this.f25306b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                if (((HashSet) fVar.f19554d).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    k0 k0Var = a.f25299a;
                    String strG = p1.g(str2, p1.f27077c, p1.f27075a);
                    if (strG != null) {
                        str2 = strG;
                    }
                    bundle2.putString("events", str2);
                    ((c) fVar.f19555g).x(bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !a.f25299a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((c) ((p) obj).f19481d).x(bundle3);
                    break;
                }
                break;
        }
    }
}
