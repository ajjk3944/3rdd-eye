package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final /* synthetic */ class Oz implements NA {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ Oz f10287b = new Oz(0);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Oz f10288c = new Oz(1);

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Oz f10289d = new Oz(2);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ Oz f10290e = new Oz(3);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ Oz f10291f = new Oz(4);

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ Oz f10292g = new Oz(5);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10293a;

    public /* synthetic */ Oz(int i) {
        this.f10293a = i;
    }

    @Override // com.google.android.gms.internal.ads.NA
    public final Object apply(Object obj) {
        switch (this.f10293a) {
            case 0:
                return null;
            case 1:
                return Sz.b(5);
            case 2:
                C2126xQ c2126xQ = (C2126xQ) obj;
                int i = TP.f11373N;
                String str = c2126xQ.f17590a;
                String str2 = c2126xQ.f17591b;
                return AbstractC1135f5.n(new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length()), str, ": ", str2);
            case 3:
                InterfaceC1992v0 interfaceC1992v0 = (InterfaceC1992v0) obj;
                interfaceC1992v0.getClass();
                return interfaceC1992v0.getClass().getSimpleName();
            case 4:
                return LB.m(AbstractC0582Jp.G(((InterfaceC1695pQ) obj).m().f11185b, f10292g));
            default:
                SQ sq = SQ.f11183d;
                return Integer.valueOf(((C2108x8) obj).f17548c);
        }
    }
}
