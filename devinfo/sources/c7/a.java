package c7;

import android.app.Application;
import android.net.NetworkRequest;
import android.util.Log;
import t6.v;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public abstract class a {
    public static h a(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i4 : iArr) {
            try {
                builder.addCapability(i4);
            } catch (IllegalArgumentException e2) {
                v vVarE = v.e();
                String str = h.f2781b;
                String str2 = h.f2781b;
                String str3 = "Ignoring adding capability '" + i4 + '\'';
                if (vVarE.f34400a <= 5) {
                    Log.w(str2, str3, e2);
                }
            }
        }
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = i.f2783a[i10];
            if (!zj.m.J(i11, iArr)) {
                try {
                    builder.removeCapability(i11);
                } catch (IllegalArgumentException e10) {
                    v vVarE2 = v.e();
                    String str4 = h.f2781b;
                    String str5 = h.f2781b;
                    String str6 = "Ignoring removing default capability '" + i11 + '\'';
                    if (vVarE2.f34400a <= 5) {
                        Log.w(str5, str6, e10);
                    }
                }
            }
        }
        for (int i12 : iArr2) {
            builder.addTransportType(i12);
        }
        NetworkRequest networkRequestBuild = builder.build();
        nk.k.d(networkRequestBuild, "build(...)");
        return new h(networkRequestBuild);
    }

    public static String b() {
        String processName = Application.getProcessName();
        nk.k.d(processName, "getProcessName(...)");
        return processName;
    }

    public static boolean c(NetworkRequest networkRequest, int i4) {
        nk.k.e(networkRequest, "request");
        return networkRequest.hasCapability(i4);
    }

    public static boolean d(NetworkRequest networkRequest, int i4) {
        nk.k.e(networkRequest, "request");
        return networkRequest.hasTransport(i4);
    }
}
