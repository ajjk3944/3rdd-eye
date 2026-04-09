package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wr extends mg implements lr {

    /* renamed from: a, reason: collision with root package name */
    public final bb.a0 f18148a;

    public wr(bb.a0 a0Var) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.f18148a = a0Var;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final String A1() {
        return this.f18148a.f2099f;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final String B1() {
        return this.f18148a.f2100h;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final String C1() {
        return this.f18148a.f2098e;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final double D1() {
        Double d10 = this.f18148a.g;
        if (d10 != null) {
            return d10.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final vb.a E1() {
        View view = this.f18148a.f2104m;
        if (view == null) {
            return null;
        }
        return new vb.b(view);
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final String F1() {
        return this.f18148a.f2101i;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final boolean G() {
        return this.f18148a.f2108q;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final va.a2 G1() {
        va.a2 a2Var;
        pa.s sVar = this.f18148a.j;
        if (sVar == null) {
            return null;
        }
        synchronized (sVar.f31549a) {
            a2Var = sVar.f31550b;
        }
        return a2Var;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final tm H1() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final vb.a I1() {
        View view = this.f18148a.f2103l;
        if (view == null) {
            return null;
        }
        return new vb.b(view);
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final Bundle J1() {
        return this.f18148a.f2106o;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final vb.a L1() {
        Object obj = this.f18148a.f2105n;
        if (obj == null) {
            return null;
        }
        return new vb.b(obj);
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final boolean N1() {
        return this.f18148a.f2107p;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final String c() {
        return this.f18148a.f2094a;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final List d() {
        List<sa.c> list = this.f18148a.f2095b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (sa.c cVar : list) {
                arrayList.add(new om(cVar.a(), cVar.c(), cVar.b(), cVar.d(), cVar.e(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final String e() {
        return this.f18148a.f2096c;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void e1(vb.a aVar) {
        this.f18148a.b();
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 2:
                String str = this.f18148a.f2094a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List listD = d();
                parcel2.writeNoException();
                parcel2.writeList(listD);
                return true;
            case 4:
                String str2 = this.f18148a.f2096c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                xm xmVarZ1 = z1();
                parcel2.writeNoException();
                ng.e(parcel2, xmVarZ1);
                return true;
            case 6:
                String str3 = this.f18148a.f2098e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = this.f18148a.f2099f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                double dD1 = D1();
                parcel2.writeNoException();
                parcel2.writeDouble(dD1);
                return true;
            case 9:
                String str5 = this.f18148a.f2100h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = this.f18148a.f2101i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                va.a2 a2VarG1 = G1();
                parcel2.writeNoException();
                ng.e(parcel2, a2VarG1);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = ng.f14287a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                vb.a aVarI1 = I1();
                parcel2.writeNoException();
                ng.e(parcel2, aVarI1);
                return true;
            case 14:
                vb.a aVarE1 = E1();
                parcel2.writeNoException();
                ng.e(parcel2, aVarE1);
                return true;
            case 15:
                vb.a aVarL1 = L1();
                parcel2.writeNoException();
                ng.e(parcel2, aVarL1);
                return true;
            case 16:
                Bundle bundle = this.f18148a.f2106o;
                parcel2.writeNoException();
                ng.d(parcel2, bundle);
                return true;
            case 17:
                boolean z3 = this.f18148a.f2107p;
                parcel2.writeNoException();
                ClassLoader classLoader2 = ng.f14287a;
                parcel2.writeInt(z3 ? 1 : 0);
                return true;
            case 18:
                boolean z10 = this.f18148a.f2108q;
                parcel2.writeNoException();
                ClassLoader classLoader3 = ng.f14287a;
                parcel2.writeInt(z10 ? 1 : 0);
                return true;
            case 19:
                i();
                parcel2.writeNoException();
                return true;
            case 20:
                vb.a aVarR0 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                w(aVarR0);
                parcel2.writeNoException();
                return true;
            case 21:
                vb.a aVarR02 = vb.b.r0(parcel.readStrongBinder());
                vb.a aVarR03 = vb.b.r0(parcel.readStrongBinder());
                vb.a aVarR04 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                k0(aVarR02, aVarR03, aVarR04);
                parcel2.writeNoException();
                return true;
            case 22:
                vb.a aVarR05 = vb.b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                e1(aVarR05);
                parcel2.writeNoException();
                return true;
            case 23:
                z();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                u();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                r();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 26:
                s();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void i() {
        this.f18148a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void k0(vb.a aVar, vb.a aVar2, vb.a aVar3) {
        HashMap map = (HashMap) vb.b.U0(aVar2);
        this.f18148a.a((View) vb.b.U0(aVar), map);
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final float r() {
        this.f18148a.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void s() {
        this.f18148a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final float u() {
        this.f18148a.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final void w(vb.a aVar) {
        this.f18148a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final float z() {
        this.f18148a.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.lr
    public final xm z1() {
        sa.c cVar = this.f18148a.f2097d;
        if (cVar != null) {
            return new om(cVar.a(), cVar.c(), cVar.b(), cVar.d(), cVar.e(), null);
        }
        return null;
    }
}
