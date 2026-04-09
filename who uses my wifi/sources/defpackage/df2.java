package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import java.util.HashMap;
import org.json.JSONException;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class df2 implements Runnable {
    public final /* synthetic */ int f = 0;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ df2(sg2 sg2Var, View view, sb2 sb2Var, int i) {
        this.h = sg2Var;
        this.i = view;
        this.j = sb2Var;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException, JSONException {
        switch (this.f) {
            case 0:
                HashMap map = new HashMap();
                map.put("event", "precacheComplete");
                map.put("src", (String) this.h);
                map.put("cachedSrc", (String) this.i);
                map.put("totalBytes", Integer.toString(this.g));
                ((ff2) this.j).n(map);
                return;
            case 1:
                ((sg2) this.h).s((View) this.i, (sb2) this.j, this.g - 1);
                return;
            default:
                rk3 rk3Var = (rk3) this.h;
                pk3 pk3Var = (pk3) this.i;
                int i = this.g;
                it3 it3Var = (it3) this.j;
                String str = rk3Var.b;
                try {
                    x03 x03Var = rk3Var.a;
                    if (x03Var == null) {
                        throw null;
                    }
                    kk3 kk3Var = (kk3) x03Var.o;
                    if (kk3Var == null) {
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("callerPackage", str);
                    bundle.putInt("displayMode", i);
                    String str2 = pk3Var.a;
                    if (!rk3.b(str2)) {
                        str2.getClass();
                        bundle.putString("sessionToken", str2.trim());
                    }
                    String str3 = pk3Var.b;
                    if (!rk3.b(str3)) {
                        str3.getClass();
                        bundle.putString("appId", str3.trim());
                    }
                    qk3 qk3Var = new qk3(rk3Var, it3Var);
                    ik3 ik3Var = (ik3) kk3Var;
                    Parcel parcelU = ik3Var.U();
                    iv1.c(parcelU, bundle);
                    iv1.e(parcelU, qk3Var);
                    ik3Var.X0(parcelU, 3);
                    return;
                } catch (RemoteException e) {
                    rk3.c.f(e, "switchDisplayMode overlay display to %d from: %s", Integer.valueOf(i), str);
                    return;
                }
        }
    }

    public /* synthetic */ df2(rk3 rk3Var, pk3 pk3Var, int i, it3 it3Var) {
        this.h = rk3Var;
        this.i = pk3Var;
        this.g = i;
        this.j = it3Var;
    }

    public df2(ff2 ff2Var, String str, String str2, int i) {
        this.h = str;
        this.i = str2;
        this.g = i;
        this.j = ff2Var;
    }
}
