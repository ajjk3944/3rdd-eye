package com.google.android.gms.ads.internal;

import A2.BinderC0126n;
import S2.a;
import S2.b;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractC0933bL;
import com.google.android.gms.internal.ads.AbstractC1114el;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.BinderC0718Rp;
import com.google.android.gms.internal.ads.BinderC0751To;
import com.google.android.gms.internal.ads.BinderC1327ii;
import com.google.android.gms.internal.ads.BinderC1494lo;
import com.google.android.gms.internal.ads.BinderC1607nt;
import com.google.android.gms.internal.ads.BinderC1874sr;
import com.google.android.gms.internal.ads.BinderC1982ur;
import com.google.android.gms.internal.ads.BinderC2252zr;
import com.google.android.gms.internal.ads.C0636Nb;
import com.google.android.gms.internal.ads.C0642Nh;
import com.google.android.gms.internal.ads.C0663Ol;
import com.google.android.gms.internal.ads.C0710Rh;
import com.google.android.gms.internal.ads.C0784Vn;
import com.google.android.gms.internal.ads.C0829Yh;
import com.google.android.gms.internal.ads.C0889ae;
import com.google.android.gms.internal.ads.C0901aq;
import com.google.android.gms.internal.ads.C1283hr;
import com.google.android.gms.internal.ads.C1661ot;
import com.google.android.gms.internal.ads.C1715pt;
import com.google.android.gms.internal.ads.C1799rN;
import com.google.android.gms.internal.ads.C1907tN;
import com.google.android.gms.internal.ads.C1927tq;
import com.google.android.gms.internal.ads.C2090wr;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.Hv;
import com.google.android.gms.internal.ads.InterfaceC0570Jd;
import com.google.android.gms.internal.ads.InterfaceC0603Lc;
import com.google.android.gms.internal.ads.InterfaceC0605Le;
import com.google.android.gms.internal.ads.InterfaceC0672Pd;
import com.google.android.gms.internal.ads.InterfaceC0703Ra;
import com.google.android.gms.internal.ads.InterfaceC2132xf;
import com.google.android.gms.internal.ads.Nt;
import com.google.android.gms.internal.ads.Ot;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC1869sm;
import com.google.android.gms.internal.ads.ViewTreeObserverOnGlobalLayoutListenerC1923tm;
import java.util.HashMap;
import p2.i;
import q2.H;
import q2.InterfaceC2823i0;
import q2.InterfaceC2846u0;
import q2.L;
import q2.T;
import q2.Y;
import q2.d1;
import s2.BinderC2892b;
import s2.BinderC2894d;
import u2.C2951a;

/* loaded from: classes.dex */
public class ClientApi extends B7 implements Y {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // q2.Y
    public final InterfaceC0672Pd D(a aVar) {
        Activity activity = (Activity) b.n1(aVar);
        AdOverlayInfoParcel adOverlayInfoParcelA = AdOverlayInfoParcel.a(activity.getIntent());
        if (adOverlayInfoParcelA == null) {
            return new BinderC2894d(activity, 4);
        }
        int i = adOverlayInfoParcelA.f6872k;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new BinderC2894d(activity, 4) : new BinderC2894d(activity, 0) : new BinderC2892b(activity, adOverlayInfoParcelA) : new BinderC2894d(activity, 2) : new BinderC2894d(activity, 1) : new BinderC2894d(activity, 3);
    }

    @Override // q2.Y
    public final T E0(a aVar, InterfaceC0603Lc interfaceC0603Lc, int i) {
        return (Hv) C0710Rh.a((Context) b.n1(aVar), interfaceC0603Lc, i).f10952E.c();
    }

    @Override // q2.Y
    public final L H0(a aVar, d1 d1Var, String str, InterfaceC0603Lc interfaceC0603Lc, int i) {
        Context context = (Context) b.n1(aVar);
        C0710Rh c0710Rh = C0710Rh.a(context, interfaceC0603Lc, i).f10986b;
        context.getClass();
        d1Var.getClass();
        str.getClass();
        return (BinderC2252zr) ((C1799rN) new C1283hr(c0710Rh, context, str, d1Var).f14592b).c();
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        C0636Nb c0636Nb = null;
        switch (i) {
            case 1:
                a aVarD1 = b.d1(parcel.readStrongBinder());
                d1 d1Var = (d1) C7.b(parcel, d1.CREATOR);
                String string = parcel.readString();
                InterfaceC0603Lc interfaceC0603LcK3 = BinderC0569Jc.K3(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                C7.f(parcel);
                L lY0 = Y0(aVarD1, d1Var, string, interfaceC0603LcK3, i3);
                parcel2.writeNoException();
                C7.e(parcel2, lY0);
                return true;
            case 2:
                a aVarD12 = b.d1(parcel.readStrongBinder());
                d1 d1Var2 = (d1) C7.b(parcel, d1.CREATOR);
                String string2 = parcel.readString();
                InterfaceC0603Lc interfaceC0603LcK32 = BinderC0569Jc.K3(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                C7.f(parcel);
                L lH0 = H0(aVarD12, d1Var2, string2, interfaceC0603LcK32, i6);
                parcel2.writeNoException();
                C7.e(parcel2, lH0);
                return true;
            case 3:
                a aVarD13 = b.d1(parcel.readStrongBinder());
                String string3 = parcel.readString();
                InterfaceC0603Lc interfaceC0603LcK33 = BinderC0569Jc.K3(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                C7.f(parcel);
                H hT0 = T0(aVarD13, string3, interfaceC0603LcK33, i7);
                parcel2.writeNoException();
                C7.e(parcel2, hT0);
                return true;
            case 4:
                b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                a aVarD14 = b.d1(parcel.readStrongBinder());
                a aVarD15 = b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                InterfaceC0703Ra interfaceC0703RaQ1 = q1(aVarD14, aVarD15);
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0703RaQ1);
                return true;
            case 6:
                a aVarD16 = b.d1(parcel.readStrongBinder());
                InterfaceC0603Lc interfaceC0603LcK34 = BinderC0569Jc.K3(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                C7.f(parcel);
                Context context = (Context) b.n1(aVarD16);
                C0710Rh c0710Rh = C0710Rh.a(context, interfaceC0603LcK34, i8).f10986b;
                context.getClass();
                Ot ot = (Ot) ((C1799rN) new C0889ae(c0710Rh, context, (String) null).f13150b).c();
                parcel2.writeNoException();
                C7.e(parcel2, ot);
                return true;
            case 7:
                b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                a aVarD17 = b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                InterfaceC0672Pd interfaceC0672PdD = D(aVarD17);
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0672PdD);
                return true;
            case 9:
                a aVarD18 = b.d1(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                C7.f(parcel);
                InterfaceC2823i0 interfaceC2823i0Q1 = Q1(aVarD18, i9);
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC2823i0Q1);
                return true;
            case 10:
                a aVarD19 = b.d1(parcel.readStrongBinder());
                d1 d1Var3 = (d1) C7.b(parcel, d1.CREATOR);
                String string4 = parcel.readString();
                int i10 = parcel.readInt();
                C7.f(parcel);
                L lY2 = y2(aVarD19, d1Var3, string4, i10);
                parcel2.writeNoException();
                C7.e(parcel2, lY2);
                return true;
            case 11:
                a aVarD110 = b.d1(parcel.readStrongBinder());
                a aVarD111 = b.d1(parcel.readStrongBinder());
                a aVarD112 = b.d1(parcel.readStrongBinder());
                C7.f(parcel);
                ViewTreeObserverOnGlobalLayoutListenerC1869sm viewTreeObserverOnGlobalLayoutListenerC1869sm = new ViewTreeObserverOnGlobalLayoutListenerC1869sm((View) b.n1(aVarD110), (HashMap) b.n1(aVarD111), (HashMap) b.n1(aVarD112));
                parcel2.writeNoException();
                C7.e(parcel2, viewTreeObserverOnGlobalLayoutListenerC1869sm);
                return true;
            case 12:
                a aVarD113 = b.d1(parcel.readStrongBinder());
                String string5 = parcel.readString();
                InterfaceC0603Lc interfaceC0603LcK35 = BinderC0569Jc.K3(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                C7.f(parcel);
                InterfaceC0605Le interfaceC0605LeJ3 = j3(aVarD113, string5, interfaceC0603LcK35, i11);
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0605LeJ3);
                return true;
            case 13:
                a aVarD114 = b.d1(parcel.readStrongBinder());
                d1 d1Var4 = (d1) C7.b(parcel, d1.CREATOR);
                String string6 = parcel.readString();
                InterfaceC0603Lc interfaceC0603LcK36 = BinderC0569Jc.K3(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                C7.f(parcel);
                L lU1 = U1(aVarD114, d1Var4, string6, interfaceC0603LcK36, i12);
                parcel2.writeNoException();
                C7.e(parcel2, lU1);
                return true;
            case 14:
                a aVarD115 = b.d1(parcel.readStrongBinder());
                InterfaceC0603Lc interfaceC0603LcK37 = BinderC0569Jc.K3(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                C7.f(parcel);
                InterfaceC2132xf interfaceC2132xfZ2 = Z2(aVarD115, interfaceC0603LcK37, i13);
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC2132xfZ2);
                return true;
            case 15:
                a aVarD116 = b.d1(parcel.readStrongBinder());
                InterfaceC0603Lc interfaceC0603LcK38 = BinderC0569Jc.K3(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                C7.f(parcel);
                InterfaceC0570Jd interfaceC0570JdO3 = o3(aVarD116, interfaceC0603LcK38, i14);
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC0570JdO3);
                return true;
            case 16:
                a aVarD117 = b.d1(parcel.readStrongBinder());
                InterfaceC0603Lc interfaceC0603LcK39 = BinderC0569Jc.K3(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    c0636Nb = iInterfaceQueryLocalInterface instanceof C0636Nb ? (C0636Nb) iInterfaceQueryLocalInterface : new C0636Nb(strongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener", 2);
                }
                C7.f(parcel);
                Context context2 = (Context) b.n1(aVarD117);
                C0710Rh c0710Rh2 = C0710Rh.a(context2, interfaceC0603LcK39, i15).f10986b;
                context2.getClass();
                c0636Nb.getClass();
                BinderC1494lo binderC1494lo = (BinderC1494lo) new C0829Yh(c0710Rh2, context2, c0636Nb).f12652e.c();
                parcel2.writeNoException();
                C7.e(parcel2, binderC1494lo);
                return true;
            case 17:
                a aVarD118 = b.d1(parcel.readStrongBinder());
                InterfaceC0603Lc interfaceC0603LcK310 = BinderC0569Jc.K3(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                C7.f(parcel);
                InterfaceC2846u0 interfaceC2846u0P0 = P0(aVarD118, interfaceC0603LcK310, i16);
                parcel2.writeNoException();
                C7.e(parcel2, interfaceC2846u0P0);
                return true;
            case 18:
                a aVarD119 = b.d1(parcel.readStrongBinder());
                InterfaceC0603Lc interfaceC0603LcK311 = BinderC0569Jc.K3(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                C7.f(parcel);
                T tE0 = E0(aVarD119, interfaceC0603LcK311, i17);
                parcel2.writeNoException();
                C7.e(parcel2, tE0);
                return true;
            default:
                return false;
        }
    }

    @Override // q2.Y
    public final InterfaceC2846u0 P0(a aVar, InterfaceC0603Lc interfaceC0603Lc, int i) {
        return (BinderC0751To) C0710Rh.a((Context) b.n1(aVar), interfaceC0603Lc, i).f11027x.c();
    }

    @Override // q2.Y
    public final InterfaceC2823i0 Q1(a aVar, int i) {
        return (BinderC1327ii) C0710Rh.a((Context) b.n1(aVar), null, i).f10950D.c();
    }

    @Override // q2.Y
    public final H T0(a aVar, String str, InterfaceC0603Lc interfaceC0603Lc, int i) {
        Context context = (Context) b.n1(aVar);
        return new BinderC1874sr(C0710Rh.a(context, interfaceC0603Lc, i), context, str);
    }

    @Override // q2.Y
    public final L U1(a aVar, d1 d1Var, String str, InterfaceC0603Lc interfaceC0603Lc, int i) {
        Context context = (Context) b.n1(aVar);
        C0710Rh c0710Rh = C0710Rh.a(context, interfaceC0603Lc, i).f10986b;
        str.getClass();
        context.getClass();
        C1907tN c1907tNA = C1907tN.a(context);
        C1907tN c1907tNA2 = C1907tN.a(str);
        C1799rN c1799rN = c0710Rh.f10961I0;
        C1927tq c1927tq = new C1927tq(c1907tNA, c1799rN, c0710Rh.f10963J0, 6);
        C1799rN c1799rNA = C1799rN.a(new C0901aq(c1799rN, 15));
        C1799rN c1799rN2 = c0710Rh.f10987c;
        C1907tN c1907tN = c0710Rh.f10954F;
        C0642Nh c0642Nh = c0710Rh.f10997h;
        return (BinderC1607nt) C1799rN.a(new C1661ot(c1907tN, c1907tNA, c1907tNA2, C1799rN.a(new C0663Ol(c1907tNA, c1799rN2, c1907tN, c1927tq, c1799rNA, c0642Nh, 6)), c1799rNA, c0642Nh, c0710Rh.f11000j)).c();
    }

    @Override // q2.Y
    public final L Y0(a aVar, d1 d1Var, String str, InterfaceC0603Lc interfaceC0603Lc, int i) {
        Context context = (Context) b.n1(aVar);
        C0710Rh c0710Rh = C0710Rh.a(context, interfaceC0603Lc, i).f10986b;
        context.getClass();
        d1Var.getClass();
        str.getClass();
        C1907tN c1907tNA = C1907tN.a(context);
        C1907tN c1907tNA2 = C1907tN.a(d1Var);
        C1799rN c1799rN = c0710Rh.f11000j;
        C1799rN c1799rNA = C1799rN.a(new C0901aq(c1799rN, 2));
        C1715pt c1715pt = (C1715pt) C1799rN.a(new C1661ot(c1907tNA, c0710Rh.f10987c, c1907tNA2, c0710Rh.f10954F, c1799rNA, C1799rN.a(AbstractC1114el.f13938G), C1799rN.a(AbstractC0933bL.f13364o))).c();
        C2090wr c2090wr = (C2090wr) c1799rNA.c();
        C2951a c2951a = c0710Rh.f10984a.f7821a;
        Cr.v(c2951a);
        return new BinderC1982ur(context, d1Var, str, c1715pt, c2090wr, c2951a, (C0784Vn) c1799rN.c());
    }

    @Override // q2.Y
    public final InterfaceC2132xf Z2(a aVar, InterfaceC0603Lc interfaceC0603Lc, int i) {
        return (BinderC0126n) C0710Rh.a((Context) b.n1(aVar), interfaceC0603Lc, i).f10971O.c();
    }

    @Override // q2.Y
    public final InterfaceC0605Le j3(a aVar, String str, InterfaceC0603Lc interfaceC0603Lc, int i) {
        Context context = (Context) b.n1(aVar);
        C0710Rh c0710Rh = C0710Rh.a(context, interfaceC0603Lc, i).f10986b;
        context.getClass();
        return (Nt) ((C1799rN) new C0889ae(c0710Rh, context, str).f13151c).c();
    }

    @Override // q2.Y
    public final InterfaceC0570Jd o3(a aVar, InterfaceC0603Lc interfaceC0603Lc, int i) {
        return (BinderC0718Rp) C0710Rh.a((Context) b.n1(aVar), interfaceC0603Lc, i).f10966L.c();
    }

    @Override // q2.Y
    public final InterfaceC0703Ra q1(a aVar, a aVar2) {
        return new ViewTreeObserverOnGlobalLayoutListenerC1923tm((FrameLayout) b.n1(aVar), (FrameLayout) b.n1(aVar2));
    }

    @Override // q2.Y
    public final L y2(a aVar, d1 d1Var, String str, int i) {
        return new i((Context) b.n1(aVar), d1Var, str, new C2951a(ModuleDescriptor.MODULE_VERSION, i, 0, true, false));
    }
}
