package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.a80;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.bn;
import com.google.android.gms.internal.ads.c20;
import com.google.android.gms.internal.ads.cv;
import com.google.android.gms.internal.ads.es1;
import com.google.android.gms.internal.ads.f20;
import com.google.android.gms.internal.ads.fe0;
import com.google.android.gms.internal.ads.ft;
import com.google.android.gms.internal.ads.g10;
import com.google.android.gms.internal.ads.gp0;
import com.google.android.gms.internal.ads.gs1;
import com.google.android.gms.internal.ads.j90;
import com.google.android.gms.internal.ads.k10;
import com.google.android.gms.internal.ads.k50;
import com.google.android.gms.internal.ads.l90;
import com.google.android.gms.internal.ads.lt0;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.na0;
import com.google.android.gms.internal.ads.ng;
import com.google.android.gms.internal.ads.nn1;
import com.google.android.gms.internal.ads.nw;
import com.google.android.gms.internal.ads.oa0;
import com.google.android.gms.internal.ads.pf0;
import com.google.android.gms.internal.ads.pk0;
import com.google.android.gms.internal.ads.qd0;
import com.google.android.gms.internal.ads.qh0;
import com.google.android.gms.internal.ads.r10;
import com.google.android.gms.internal.ads.rk0;
import com.google.android.gms.internal.ads.so0;
import com.google.android.gms.internal.ads.sp0;
import com.google.android.gms.internal.ads.to0;
import com.google.android.gms.internal.ads.tp0;
import com.google.android.gms.internal.ads.u10;
import com.google.android.gms.internal.ads.uk0;
import com.google.android.gms.internal.ads.xk0;
import com.google.android.gms.internal.ads.yq;
import com.google.android.gms.internal.ads.zm0;
import com.google.android.gms.internal.ads.zo;
import com.google.android.gms.internal.ads.zs;
import fb.h;
import java.util.HashMap;
import ua.i;
import va.c3;
import va.h0;
import va.h1;
import va.l0;
import va.s0;
import va.t1;
import va.x0;
import vb.a;
import vb.b;
import xa.d;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class ClientApi extends mg implements x0 {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // va.x0
    public final l0 A0(a aVar, c3 c3Var, String str, ar arVar, int i4) {
        Context context = (Context) b.U0(aVar);
        k10 k10Var = k10.a(context, arVar, i4).f12924b;
        str.getClass();
        context.getClass();
        gs1 gs1VarB = gs1.b(context);
        gs1 gs1VarB2 = gs1.b(str);
        es1 es1Var = k10Var.I0;
        gp0 gp0Var = new gp0(gs1VarB, es1Var, k10Var.J0, 0);
        es1 es1VarB = es1.b(new zm0(es1Var, 6));
        es1 es1Var2 = k10Var.f12926c;
        gs1 gs1Var = k10Var.F;
        g10 g10Var = k10Var.f12935h;
        return (so0) es1.b(new k50(gs1Var, gs1VarB, gs1VarB2, es1.b(new j90(gs1VarB, es1Var2, gs1Var, gp0Var, es1VarB, g10Var)), es1VarB, g10Var, k10Var.j)).a();
    }

    @Override // va.x0
    public final l0 H2(a aVar, c3 c3Var, String str, ar arVar, int i4) {
        Context context = (Context) b.U0(aVar);
        k10 k10Var = k10.a(context, arVar, i4).f12924b;
        context.getClass();
        c3Var.getClass();
        str.getClass();
        gs1 gs1VarB = gs1.b(context);
        gs1 gs1VarB2 = gs1.b(c3Var);
        es1 es1Var = k10Var.j;
        es1 es1VarB = es1.b(new f20(es1Var, 23));
        to0 to0Var = (to0) es1.b(new k50(gs1VarB, k10Var.f12926c, gs1VarB2, k10Var.F, es1VarB, es1.b(a80.G), es1.b(nn1.f14350o))).a();
        uk0 uk0Var = (uk0) es1VarB.a();
        za.a aVar2 = k10Var.f12922a.f17808a;
        al0.z(aVar2);
        return new rk0(context, c3Var, str, to0Var, uk0Var, aVar2, (qd0) es1Var.a());
    }

    @Override // va.x0
    public final nw N3(a aVar, ar arVar, int i4) {
        return (h) k10.a((Context) b.U0(aVar), arVar, i4).O.a();
    }

    @Override // va.x0
    public final l0 V3(a aVar, c3 c3Var, String str, ar arVar, int i4) {
        Context context = (Context) b.U0(aVar);
        k10 k10Var = k10.a(context, arVar, i4).f12924b;
        context.getClass();
        c3Var.getClass();
        str.getClass();
        return (xk0) new u10(k10Var, context, str, c3Var).f17031a.a();
    }

    @Override // va.x0
    public final h0 f1(a aVar, String str, ar arVar, int i4) {
        Context context = (Context) b.U0(aVar);
        return new pk0(k10.a(context, arVar, i4), context, str);
    }

    @Override // va.x0
    public final t1 g0(a aVar, ar arVar, int i4) {
        return (pf0) k10.a((Context) b.U0(aVar), arVar, i4).f12966x.a();
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        zo zoVar = null;
        switch (i4) {
            case 1:
                a aVarR0 = b.r0(parcel.readStrongBinder());
                c3 c3Var = (c3) ng.b(parcel, c3.CREATOR);
                String string = parcel.readString();
                ar arVarH4 = yq.h4(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                ng.f(parcel);
                l0 l0VarH2 = H2(aVarR0, c3Var, string, arVarH4, i10);
                parcel2.writeNoException();
                ng.e(parcel2, l0VarH2);
                return true;
            case 2:
                a aVarR02 = b.r0(parcel.readStrongBinder());
                c3 c3Var2 = (c3) ng.b(parcel, c3.CREATOR);
                String string2 = parcel.readString();
                ar arVarH42 = yq.h4(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                ng.f(parcel);
                l0 l0VarV3 = V3(aVarR02, c3Var2, string2, arVarH42, i11);
                parcel2.writeNoException();
                ng.e(parcel2, l0VarV3);
                return true;
            case 3:
                a aVarR03 = b.r0(parcel.readStrongBinder());
                String string3 = parcel.readString();
                ar arVarH43 = yq.h4(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                ng.f(parcel);
                h0 h0VarF1 = f1(aVarR03, string3, arVarH43, i12);
                parcel2.writeNoException();
                ng.e(parcel2, h0VarF1);
                return true;
            case 4:
                b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                a aVarR04 = b.r0(parcel.readStrongBinder());
                a aVarR05 = b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                bn bnVarS3 = s3(aVarR04, aVarR05);
                parcel2.writeNoException();
                ng.e(parcel2, bnVarS3);
                return true;
            case 6:
                a aVarR06 = b.r0(parcel.readStrongBinder());
                ar arVarH44 = yq.h4(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                ng.f(parcel);
                Context context = (Context) b.U0(aVarR06);
                k10 k10Var = k10.a(context, arVarH44, i13).f12924b;
                context.getClass();
                tp0 tp0Var = (tp0) ((es1) new l90(k10Var, context, (String) null).f13426b).a();
                parcel2.writeNoException();
                ng.e(parcel2, tp0Var);
                return true;
            case 7:
                b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                a aVarR07 = b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                ft ftVarO = o(aVarR07);
                parcel2.writeNoException();
                ng.e(parcel2, ftVarO);
                return true;
            case 9:
                a aVarR08 = b.r0(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                ng.f(parcel);
                h1 h1VarN0 = n0(aVarR08, i14);
                parcel2.writeNoException();
                ng.e(parcel2, h1VarN0);
                return true;
            case 10:
                a aVarR09 = b.r0(parcel.readStrongBinder());
                c3 c3Var3 = (c3) ng.b(parcel, c3.CREATOR);
                String string4 = parcel.readString();
                int i15 = parcel.readInt();
                ng.f(parcel);
                l0 l0VarX2 = x2(aVarR09, c3Var3, string4, i15);
                parcel2.writeNoException();
                ng.e(parcel2, l0VarX2);
                return true;
            case 11:
                a aVarR010 = b.r0(parcel.readStrongBinder());
                a aVarR011 = b.r0(parcel.readStrongBinder());
                a aVarR012 = b.r0(parcel.readStrongBinder());
                ng.f(parcel);
                na0 na0Var = new na0((View) b.U0(aVarR010), (HashMap) b.U0(aVarR011), (HashMap) b.U0(aVarR012));
                parcel2.writeNoException();
                ng.e(parcel2, na0Var);
                return true;
            case 12:
                a aVarR013 = b.r0(parcel.readStrongBinder());
                String string5 = parcel.readString();
                ar arVarH45 = yq.h4(parcel.readStrongBinder());
                int i16 = parcel.readInt();
                ng.f(parcel);
                cv cvVarH2 = h2(aVarR013, string5, arVarH45, i16);
                parcel2.writeNoException();
                ng.e(parcel2, cvVarH2);
                return true;
            case 13:
                a aVarR014 = b.r0(parcel.readStrongBinder());
                c3 c3Var4 = (c3) ng.b(parcel, c3.CREATOR);
                String string6 = parcel.readString();
                ar arVarH46 = yq.h4(parcel.readStrongBinder());
                int i17 = parcel.readInt();
                ng.f(parcel);
                l0 l0VarA0 = A0(aVarR014, c3Var4, string6, arVarH46, i17);
                parcel2.writeNoException();
                ng.e(parcel2, l0VarA0);
                return true;
            case 14:
                a aVarR015 = b.r0(parcel.readStrongBinder());
                ar arVarH47 = yq.h4(parcel.readStrongBinder());
                int i18 = parcel.readInt();
                ng.f(parcel);
                nw nwVarN3 = N3(aVarR015, arVarH47, i18);
                parcel2.writeNoException();
                ng.e(parcel2, nwVarN3);
                return true;
            case 15:
                a aVarR016 = b.r0(parcel.readStrongBinder());
                ar arVarH48 = yq.h4(parcel.readStrongBinder());
                int i19 = parcel.readInt();
                ng.f(parcel);
                zs zsVarW3 = w3(aVarR016, arVarH48, i19);
                parcel2.writeNoException();
                ng.e(parcel2, zsVarW3);
                return true;
            case 16:
                a aVarR017 = b.r0(parcel.readStrongBinder());
                ar arVarH49 = yq.h4(parcel.readStrongBinder());
                int i20 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    zoVar = iInterfaceQueryLocalInterface instanceof zo ? (zo) iInterfaceQueryLocalInterface : new zo(strongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener", 1);
                }
                ng.f(parcel);
                Context context2 = (Context) b.U0(aVarR017);
                k10 k10Var2 = k10.a(context2, arVarH49, i20).f12924b;
                context2.getClass();
                zoVar.getClass();
                fe0 fe0Var = (fe0) new r10(k10Var2, context2, zoVar).f15501e.a();
                parcel2.writeNoException();
                ng.e(parcel2, fe0Var);
                return true;
            case 17:
                a aVarR018 = b.r0(parcel.readStrongBinder());
                ar arVarH410 = yq.h4(parcel.readStrongBinder());
                int i21 = parcel.readInt();
                ng.f(parcel);
                t1 t1VarG0 = g0(aVarR018, arVarH410, i21);
                parcel2.writeNoException();
                ng.e(parcel2, t1VarG0);
                return true;
            case 18:
                a aVarR019 = b.r0(parcel.readStrongBinder());
                ar arVarH411 = yq.h4(parcel.readStrongBinder());
                int i22 = parcel.readInt();
                ng.f(parcel);
                s0 s0VarY0 = y0(aVarR019, arVarH411, i22);
                parcel2.writeNoException();
                ng.e(parcel2, s0VarY0);
                return true;
            default:
                return false;
        }
    }

    @Override // va.x0
    public final cv h2(a aVar, String str, ar arVar, int i4) {
        Context context = (Context) b.U0(aVar);
        k10 k10Var = k10.a(context, arVar, i4).f12924b;
        context.getClass();
        return (sp0) ((es1) new l90(k10Var, context, str).f13427c).a();
    }

    @Override // va.x0
    public final h1 n0(a aVar, int i4) {
        return (c20) k10.a((Context) b.U0(aVar), null, i4).D.a();
    }

    @Override // va.x0
    public final ft o(a aVar) {
        Activity activity = (Activity) b.U0(aVar);
        AdOverlayInfoParcel adOverlayInfoParcelA = AdOverlayInfoParcel.a(activity.getIntent());
        if (adOverlayInfoParcelA == null) {
            return new d(activity, 4);
        }
        int i4 = adOverlayInfoParcelA.f9027k;
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? i4 != 5 ? new d(activity, 4) : new d(activity, 0) : new xa.b(activity, adOverlayInfoParcelA) : new d(activity, 2) : new d(activity, 1) : new d(activity, 3);
    }

    @Override // va.x0
    public final bn s3(a aVar, a aVar2) {
        return new oa0((FrameLayout) b.U0(aVar), (FrameLayout) b.U0(aVar2));
    }

    @Override // va.x0
    public final zs w3(a aVar, ar arVar, int i4) {
        return (qh0) k10.a((Context) b.U0(aVar), arVar, i4).L.a();
    }

    @Override // va.x0
    public final l0 x2(a aVar, c3 c3Var, String str, int i4) {
        return new i((Context) b.U0(aVar), c3Var, str, new za.a(ModuleDescriptor.MODULE_VERSION, i4, 0, true, false));
    }

    @Override // va.x0
    public final s0 y0(a aVar, ar arVar, int i4) {
        return (lt0) k10.a((Context) b.U0(aVar), arVar, i4).E.a();
    }
}
