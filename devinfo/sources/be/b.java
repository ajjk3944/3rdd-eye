package be;

import android.os.Bundle;
import ec.b2;
import ec.c2;
import java.util.HashSet;
import jf.c;
import ud.f;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class b implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2147b;

    public /* synthetic */ b(int i4, Object obj) {
        this.f2146a = i4;
        this.f2147b = obj;
    }

    @Override // ec.c2
    public final void a(long j, Bundle bundle, String str, String str2) {
        int i4 = this.f2146a;
        Object obj = this.f2147b;
        switch (i4) {
            case 0:
                y4.a aVar = (y4.a) obj;
                if (((HashSet) aVar.f37323a).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    f fVar = a.f2140a;
                    String strG = b2.g(str2, b2.f22580c, b2.f22578a);
                    if (strG != null) {
                        str2 = strG;
                    }
                    bundle2.putString("events", str2);
                    ((y4.a) aVar.f37324b).m(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !a.f2140a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((y4.a) ((c) obj).f27642b).m(3, bundle3);
                    break;
                }
                break;
        }
    }
}
