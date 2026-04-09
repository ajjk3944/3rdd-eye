package V4;

import W4.c;
import android.net.Uri;
import com.google.android.gms.common.util.g;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final c f22975a;

    /* renamed from: b, reason: collision with root package name */
    private final W4.a f22976b;

    public b(W4.a aVar) {
        if (aVar == null) {
            this.f22976b = null;
            this.f22975a = null;
        } else {
            if (aVar.b() == 0) {
                aVar.k(g.d().a());
            }
            this.f22976b = aVar;
            this.f22975a = new c(aVar);
        }
    }

    public Uri a() {
        String strE;
        W4.a aVar = this.f22976b;
        if (aVar == null || (strE = aVar.e()) == null) {
            return null;
        }
        return Uri.parse(strE);
    }

    public int b() {
        W4.a aVar = this.f22976b;
        if (aVar == null) {
            return 0;
        }
        return aVar.i();
    }
}
