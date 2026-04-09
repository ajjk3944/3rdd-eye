package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gh0 extends androidx.recyclerview.widget.d0 {

    /* renamed from: h, reason: collision with root package name */
    public static final SparseArray f11520h;

    /* renamed from: c, reason: collision with root package name */
    public final Context f11521c;

    /* renamed from: d, reason: collision with root package name */
    public final v50 f11522d;

    /* renamed from: e, reason: collision with root package name */
    public final TelephonyManager f11523e;

    /* renamed from: f, reason: collision with root package name */
    public final eh0 f11524f;
    public int g;

    static {
        SparseArray sparseArray = new SparseArray();
        f11520h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), vi.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        vi viVar = vi.CONNECTING;
        sparseArray.put(iOrdinal, viVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), viVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), viVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), vi.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        vi viVar2 = vi.DISCONNECTED;
        sparseArray.put(iOrdinal2, viVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), viVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), viVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), viVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), viVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), vi.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), viVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), viVar);
    }

    public gh0(Context context, v50 v50Var, eh0 eh0Var, l90 l90Var, ya.c0 c0Var) {
        super(l90Var, c0Var);
        this.f11521c = context;
        this.f11522d = v50Var;
        this.f11524f = eh0Var;
        this.f11523e = (TelephonyManager) context.getSystemService("phone");
    }
}
