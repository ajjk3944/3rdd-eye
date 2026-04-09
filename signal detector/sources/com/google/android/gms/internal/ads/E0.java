package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class E0 implements RA {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ E0 f7863b = new E0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ E0 f7864c = new E0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ E0 f7865d = new E0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ E0 f7866e = new E0(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7867a;

    public /* synthetic */ E0(int i) {
        this.f7867a = i;
    }

    @Override // com.google.android.gms.internal.ads.RA
    public final /* synthetic */ boolean b(Object obj) {
        switch (this.f7867a) {
            case 0:
                H1 h12 = (H1) obj;
                return h12.f8535b.equals("com.apple.iTunes") && h12.f8536c.equals("iTunSMPB");
            case 1:
                return ((C1) obj).f7491c.equals("iTunSMPB");
            case 2:
                return ((Map.Entry) obj).getKey() != null;
            default:
                return ((String) obj) != null;
        }
    }
}
