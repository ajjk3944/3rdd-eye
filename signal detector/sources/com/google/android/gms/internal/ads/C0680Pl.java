package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Pl, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0680Pl implements InterfaceC1920tj {

    /* renamed from: a, reason: collision with root package name */
    public final Map f10495a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f10496b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f10497c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC2069wN f10498d;

    /* renamed from: e, reason: collision with root package name */
    public final C1708pm f10499e;

    public C0680Pl(Map map, Map map2, Map map3, InterfaceC2069wN interfaceC2069wN, C1708pm c1708pm) {
        this.f10495a = map;
        this.f10496b = map2;
        this.f10497c = map3;
        this.f10498d = interfaceC2069wN;
        this.f10499e = c1708pm;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1920tj
    public final InterfaceC0956bq a(int i, String str) {
        InterfaceC0956bq interfaceC0956bqA;
        InterfaceC0956bq interfaceC0956bq = (InterfaceC0956bq) this.f10495a.get(str);
        if (interfaceC0956bq != null) {
            return interfaceC0956bq;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            C0532Gq c0532Gq = (C0532Gq) this.f10497c.get(str);
            if (c0532Gq != null) {
                return new C1010cq(c0532Gq, C1563n2.f15715g);
            }
            interfaceC0956bqA = (InterfaceC0956bq) this.f10496b.get(str);
            if (interfaceC0956bqA == null) {
                return null;
            }
        } else if (this.f10499e.f16219d == null || (interfaceC0956bqA = ((InterfaceC1920tj) this.f10498d.c()).a(i, str)) == null) {
            return null;
        }
        return new C1010cq(interfaceC0956bqA, C1563n2.f15714f);
    }
}
