package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.Hp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0548Hp extends B3.u {

    /* renamed from: h, reason: collision with root package name */
    public static final SparseArray f9001h;

    /* renamed from: c, reason: collision with root package name */
    public final Context f9002c;

    /* renamed from: d, reason: collision with root package name */
    public final C0831Yj f9003d;

    /* renamed from: e, reason: collision with root package name */
    public final TelephonyManager f9004e;

    /* renamed from: f, reason: collision with root package name */
    public final C0514Fp f9005f;

    /* renamed from: g, reason: collision with root package name */
    public int f9006g;

    static {
        SparseArray sparseArray = new SparseArray();
        f9001h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), K8.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        K8 k8 = K8.CONNECTING;
        sparseArray.put(iOrdinal, k8);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), k8);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), k8);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), K8.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        K8 k82 = K8.DISCONNECTED;
        sparseArray.put(iOrdinal2, k82);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), k82);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), k82);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), k82);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), k82);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), K8.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), k8);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), k8);
    }

    public C0548Hp(Context context, C0831Yj c0831Yj, C0514Fp c0514Fp, C0697Ql c0697Ql, C2909E c2909e) {
        super(c0697Ql, c2909e);
        this.f9002c = context;
        this.f9003d = c0831Yj;
        this.f9005f = c0514Fp;
        this.f9004e = (TelephonyManager) context.getSystemService("phone");
    }
}
