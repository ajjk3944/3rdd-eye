package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class g2 implements d31 {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g2 f11346b = new g2(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ g2 f11347c = new g2(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ g2 f11348d = new g2(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ g2 f11349e = new g2(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11350a;

    public /* synthetic */ g2(int i4) {
        this.f11350a = i4;
    }

    @Override // com.google.android.gms.internal.ads.d31
    public final /* synthetic */ boolean c(Object obj) {
        switch (this.f11350a) {
            case 0:
                i4 i4Var = (i4) obj;
                return i4Var.f12138b.equals("com.apple.iTunes") && i4Var.f12139c.equals("iTunSMPB");
            case 1:
                return ((d4) obj).f10314c.equals("iTunSMPB");
            case 2:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
