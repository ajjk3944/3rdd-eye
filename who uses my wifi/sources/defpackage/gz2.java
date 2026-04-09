package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class gz2 extends e6 {
    public static final SparseArray h;
    public final Context c;
    public final km2 d;
    public final TelephonyManager e;
    public final ez2 f;
    public int g;

    static {
        SparseArray sparseArray = new SparseArray();
        h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), mx1.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        mx1 mx1Var = mx1.CONNECTING;
        sparseArray.put(iOrdinal, mx1Var);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), mx1Var);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), mx1Var);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), mx1.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        mx1 mx1Var2 = mx1.DISCONNECTED;
        sparseArray.put(iOrdinal2, mx1Var2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), mx1Var2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), mx1Var2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), mx1Var2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), mx1Var2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), mx1.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), mx1Var);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), mx1Var);
    }

    public gz2(Context context, km2 km2Var, ez2 ez2Var, wt2 wt2Var, ra4 ra4Var) {
        super(wt2Var, ra4Var);
        this.c = context;
        this.d = km2Var;
        this.f = ez2Var;
        this.e = (TelephonyManager) context.getSystemService("phone");
    }
}
