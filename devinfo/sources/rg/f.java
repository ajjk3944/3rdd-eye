package rg;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import b5.s;
import b5.u0;
import b5.z;
import com.liuzh.deviceinfo.DeviceInfoApp;
import com.liuzh.deviceinfo.R;
import t7.m;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class f extends s {
    public static void j0(int i4, z zVar) {
        u0 u0VarO = zVar.o();
        Bundle bundle = new Bundle();
        bundle.putString("title", DeviceInfoApp.f21145f.getString(R.string.missing_permission));
        bundle.putString("msg", DeviceInfoApp.f21145f.getString(i4));
        f fVar = new f();
        fVar.Z(bundle);
        fVar.f0(false);
        fVar.h0(u0VarO, fVar.toString());
    }

    public static void k0(Context context, int i4, Runnable runnable) {
        m mVar = new m(context);
        mVar.y(R.string.missing_permission);
        mVar.v(i4);
        mVar.x(R.string.grant, new e(0, runnable));
        mVar.w(android.R.string.cancel, null);
        i.e eVarA = mVar.A();
        com.liuzh.deviceinfo.utilities.f fVar = com.liuzh.deviceinfo.utilities.f.f21256b;
        dj.b.s(eVarA, com.liuzh.deviceinfo.utilities.f.d());
    }

    @Override // b5.s
    public final Dialog e0(Bundle bundle) {
        String string;
        String string2;
        Bundle bundle2 = this.g;
        if (bundle2 != null) {
            string = bundle2.getString("title");
            string2 = bundle2.getString("msg");
        } else {
            string = "";
            string2 = "";
        }
        m mVar = new m(W());
        i.b bVar = (i.b) mVar.f34474c;
        bVar.f25233d = string;
        bVar.f25235f = string2;
        mVar.x(R.string.grant, new eg.d(6, this));
        mVar.w(android.R.string.cancel, null);
        i.e eVarF = mVar.f();
        eVarF.setOnShowListener(new eg.e(eVarF, 2));
        return eVarF;
    }
}
