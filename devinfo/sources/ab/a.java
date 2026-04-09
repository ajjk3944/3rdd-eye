package ab;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.internal.ads.sk;
import com.google.android.gms.internal.ads.sl;
import com.google.android.gms.internal.ads.up;
import pa.g;
import pb.y;
import va.s;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class a {
    public static void a(Context context, String str, g gVar, b bVar) {
        y.i(context, "Context cannot be null.");
        y.i(str, "AdUnitId cannot be null.");
        y.i(gVar, "AdRequest cannot be null.");
        y.d("#008 Must be called on the main UI thread.");
        sk.a(context);
        if (((Boolean) sl.f16462i.u()).booleanValue()) {
            if (((Boolean) s.f36163e.f36166c.a(sk.f16373vc)).booleanValue()) {
                za.b.f38135b.execute(new c(context, str, gVar, bVar, 0));
                return;
            }
        }
        new up(context, str).c(gVar.f31526a, bVar);
    }

    public abstract void b(Activity activity);
}
