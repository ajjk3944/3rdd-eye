package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.view.View;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import m2.AbstractC2656c;

/* renamed from: com.google.android.gms.internal.ads.gd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1215gd extends B7 implements InterfaceC0790Wc {

    /* renamed from: a, reason: collision with root package name */
    public final w2.w f14279a;

    public BinderC1215gd(w2.w wVar) {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        this.f14279a = wVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final void C2(S2.a aVar, S2.a aVar2, S2.a aVar3) {
        HashMap map = (HashMap) S2.b.n1(aVar2);
        this.f14279a.a((View) S2.b.n1(aVar), map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final float H() {
        this.f14279a.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final void J() {
        this.f14279a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                String str = this.f14279a.f23953a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 3:
                List listD = d();
                parcel2.writeNoException();
                parcel2.writeList(listD);
                return true;
            case 4:
                String str2 = this.f14279a.f23955c;
                parcel2.writeNoException();
                parcel2.writeString(str2);
                return true;
            case 5:
                InterfaceC0635Na interfaceC0635NaG = g();
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0635NaG);
                return true;
            case 6:
                String str3 = this.f14279a.f23957e;
                parcel2.writeNoException();
                parcel2.writeString(str3);
                return true;
            case 7:
                String str4 = this.f14279a.f23958f;
                parcel2.writeNoException();
                parcel2.writeString(str4);
                return true;
            case 8:
                double dK = k();
                parcel2.writeNoException();
                parcel2.writeDouble(dK);
                return true;
            case 9:
                String str5 = this.f14279a.f23960h;
                parcel2.writeNoException();
                parcel2.writeString(str5);
                return true;
            case 10:
                String str6 = this.f14279a.i;
                parcel2.writeNoException();
                parcel2.writeString(str6);
                return true;
            case 11:
                q2.B0 b0O = o();
                parcel2.writeNoException();
                C7.e(parcel2, b0O);
                return true;
            case 12:
                parcel2.writeNoException();
                ClassLoader classLoader = C7.f7544a;
                parcel2.writeStrongBinder(null);
                return true;
            case 13:
                S2.a aVarQ = q();
                parcel2.writeNoException();
                C7.e(parcel2, aVarQ);
                return true;
            case 14:
                S2.a aVarL = l();
                parcel2.writeNoException();
                C7.e(parcel2, aVarL);
                return true;
            case 15:
                S2.a aVarW = w();
                parcel2.writeNoException();
                C7.e(parcel2, aVarW);
                return true;
            case 16:
                Bundle bundle = this.f14279a.f23965n;
                parcel2.writeNoException();
                C7.d(parcel2, bundle);
                return true;
            case 17:
                boolean z6 = this.f14279a.f23966o;
                parcel2.writeNoException();
                ClassLoader classLoader2 = C7.f7544a;
                parcel2.writeInt(z6 ? 1 : 0);
                return true;
            case 18:
                boolean z7 = this.f14279a.f23967p;
                parcel2.writeNoException();
                ClassLoader classLoader3 = C7.f7544a;
                parcel2.writeInt(z7 ? 1 : 0);
                return true;
            case 19:
                u();
                parcel2.writeNoException();
                return true;
            case 20:
                S2.a aVarD1 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                m0(aVarD1);
                parcel2.writeNoException();
                return true;
            case 21:
                S2.a aVarD12 = S2.b.d1(parcel.readStrongBinder());
                S2.a aVarD13 = S2.b.d1(parcel.readStrongBinder());
                S2.a aVarD14 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                C2(aVarD12, aVarD13, aVarD14);
                parcel2.writeNoException();
                return true;
            case 22:
                S2.a aVarD15 = S2.b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                N0(aVarD15);
                parcel2.writeNoException();
                return true;
            case 23:
                S();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 24:
                M();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 25:
                H();
                parcel2.writeNoException();
                parcel2.writeFloat(0.0f);
                return true;
            case 26:
                J();
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final float M() {
        this.f14279a.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final boolean N() {
        return this.f14279a.f23966o;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final void N0(S2.a aVar) {
        this.f14279a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final float S() {
        this.f14279a.getClass();
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final boolean W() {
        return this.f14279a.f23967p;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final String b() {
        return this.f14279a.f23953a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final List d() {
        List<AbstractC2656c> list = this.f14279a.f23954b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (AbstractC2656c abstractC2656c : list) {
                arrayList.add(new BinderC0465Da(abstractC2656c.a(), abstractC2656c.c(), abstractC2656c.b(), abstractC2656c.d(), abstractC2656c.e(), null));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final String e() {
        return this.f14279a.f23955c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final InterfaceC0635Na g() {
        AbstractC2656c abstractC2656c = this.f14279a.f23956d;
        if (abstractC2656c != null) {
            return new BinderC0465Da(abstractC2656c.a(), abstractC2656c.c(), abstractC2656c.b(), abstractC2656c.d(), abstractC2656c.e(), null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final String h() {
        return this.f14279a.f23958f;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final String i() {
        return this.f14279a.f23960h;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final String j() {
        return this.f14279a.f23957e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final double k() {
        Double d6 = this.f14279a.f23959g;
        if (d6 != null) {
            return d6.doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final S2.a l() {
        PAGMediaView pAGMediaView = this.f14279a.f23963l;
        if (pAGMediaView == null) {
            return null;
        }
        return new S2.b(pAGMediaView);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final void m0(S2.a aVar) {
        this.f14279a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final String n() {
        return this.f14279a.i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final q2.B0 o() {
        q2.B0 b0;
        j2.s sVar = this.f14279a.f23961j;
        if (sVar == null) {
            return null;
        }
        synchronized (sVar.f21360a) {
            b0 = sVar.f21361b;
        }
        return b0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final InterfaceC0550Ia p() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final S2.a q() {
        View view = this.f14279a.f23962k;
        if (view == null) {
            return null;
        }
        return new S2.b(view);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final Bundle r() {
        return this.f14279a.f23965n;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final void u() {
        this.f14279a.getClass();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0790Wc
    public final S2.a w() {
        Object obj = this.f14279a.f23964m;
        if (obj == null) {
            return null;
        }
        return new S2.b(obj);
    }
}
