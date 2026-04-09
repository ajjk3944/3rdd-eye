package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import f4.InterfaceFutureC2326a;
import java.util.Set;
import q2.C2841s;
import u2.C2951a;

/* loaded from: classes.dex */
public final class Jr implements Ms {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9384a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9385b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9386c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9387d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f9388e;

    public Jr(Context context, ID id, C0960bu c0960bu, C2951a c2951a) {
        this.f9384a = 6;
        this.f9386c = context;
        this.f9387d = id;
        this.f9385b = c0960bu;
        this.f9388e = c2951a;
    }

    public static final int b(int i, float f2) {
        if (f2 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i / f2);
    }

    public static final J.c d(J.c cVar, float f2) {
        return f2 == 0.0f ? J.c.f2006e : J.c.b((int) Math.ceil(cVar.f2007a / f2), (int) Math.ceil(cVar.f2008b / f2), (int) Math.ceil(cVar.f2009c / f2), (int) Math.ceil(cVar.f2010d / f2));
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final InterfaceFutureC2326a a() {
        Ur ur;
        switch (this.f9384a) {
            case 0:
                H9.a((Context) this.f9386c);
                return ((C0623Mf) ((ID) this.f9387d)).b(new J6(7, this));
            case 1:
                return AbstractC1984ut.G(((C1552ms) this.f9387d).a(), new C1754qe(3, this), AbstractC0640Nf.f10011g);
            case 2:
                Vr vr = (Vr) this.f9388e;
                E9 e9 = H9.Qc;
                C2841s c2841s = C2841s.f23267e;
                G9 g9 = c2841s.f23270c;
                G9 g92 = c2841s.f23270c;
                if (((Boolean) g9.a(e9)).booleanValue() && (ur = vr.f12093b) != null) {
                    return AbstractC1984ut.e(ur);
                }
                if (C1476lN.k((String) g92.a(H9.f8644O1)) || (!((Boolean) g92.a(e9)).booleanValue() && (vr.f12092a.get() || !((C2087wo) this.f9385b).f17474b))) {
                    return AbstractC1984ut.e(new Ur(0, new Bundle()));
                }
                vr.f12092a.set(true);
                return ((C0623Mf) ((ID) this.f9387d)).b(new J6(9, this));
            case 3:
                return ((C0623Mf) ((ID) this.f9387d)).b(new J6(15, this));
            case 4:
                return ((C0623Mf) ((ID) this.f9387d)).b(new J6(19, this));
            case 5:
                return ((C0623Mf) ((ID) this.f9387d)).b(new J6(21, this));
            case 6:
                return ((C0623Mf) ((ID) this.f9387d)).b(new J6(23, this));
            default:
                return ((C0623Mf) ((ID) this.f9387d)).b(new J6(25, this));
        }
    }

    @Override // com.google.android.gms.internal.ads.Ms
    public final int c() {
        switch (this.f9384a) {
            case 0:
                return 3;
            case 1:
                return 7;
            case 2:
                return 1;
            case 3:
                return 17;
            case 4:
                return 22;
            case 5:
                return 26;
            case 6:
                return 53;
            default:
                return 35;
        }
    }

    public Jr(ID id, ViewGroup viewGroup, Context context, Set set) {
        this.f9384a = 4;
        this.f9387d = id;
        this.f9385b = set;
        this.f9388e = viewGroup;
        this.f9386c = context;
    }

    public /* synthetic */ Jr(ID id, Object obj, Object obj2, Object obj3, int i) {
        this.f9384a = i;
        this.f9387d = id;
        this.f9386c = obj;
        this.f9385b = obj2;
        this.f9388e = obj3;
    }

    public /* synthetic */ Jr(Object obj, C0960bu c0960bu, Object obj2, Object obj3, int i) {
        this.f9384a = i;
        this.f9387d = obj;
        this.f9385b = c0960bu;
        this.f9386c = obj2;
        this.f9388e = obj3;
    }
}
