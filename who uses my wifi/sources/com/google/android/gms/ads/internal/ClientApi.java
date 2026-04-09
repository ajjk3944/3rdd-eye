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
import defpackage.ar2;
import defpackage.as2;
import defpackage.ba2;
import defpackage.ba4;
import defpackage.bm2;
import defpackage.bw2;
import defpackage.c92;
import defpackage.ca4;
import defpackage.ci2;
import defpackage.cr1;
import defpackage.cs2;
import defpackage.da4;
import defpackage.e51;
import defpackage.ek2;
import defpackage.ex2;
import defpackage.f22;
import defpackage.ga4;
import defpackage.hv1;
import defpackage.i41;
import defpackage.iv1;
import defpackage.jh1;
import defpackage.kh2;
import defpackage.l73;
import defpackage.m42;
import defpackage.mb3;
import defpackage.mv2;
import defpackage.o23;
import defpackage.of3;
import defpackage.oi0;
import defpackage.oi2;
import defpackage.ou1;
import defpackage.pf4;
import defpackage.ph2;
import defpackage.pz2;
import defpackage.q23;
import defpackage.re1;
import defpackage.ri2;
import defpackage.s23;
import defpackage.s62;
import defpackage.th2;
import defpackage.u10;
import defpackage.u43;
import defpackage.u62;
import defpackage.uv2;
import defpackage.vq2;
import defpackage.w23;
import defpackage.w82;
import defpackage.wc2;
import defpackage.x72;
import defpackage.x73;
import defpackage.xe4;
import defpackage.y63;
import defpackage.y73;
import defpackage.ya2;
import defpackage.yb;
import defpackage.z63;
import defpackage.zn2;
import java.util.HashMap;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class ClientApi extends hv1 implements ek2 {
    public ClientApi() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        m42 m42Var = null;
        switch (i) {
            case 1:
                u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
                xe4 xe4Var = (xe4) iv1.b(parcel, xe4.CREATOR);
                String string = parcel.readString();
                u62 u62VarB3 = s62.B3(parcel.readStrongBinder());
                int i2 = parcel.readInt();
                iv1.f(parcel);
                ba2 ba2VarT1 = T1(u10VarX0, xe4Var, string, u62VarB3, i2);
                parcel2.writeNoException();
                iv1.e(parcel2, ba2VarT1);
                return true;
            case 2:
                u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
                xe4 xe4Var2 = (xe4) iv1.b(parcel, xe4.CREATOR);
                String string2 = parcel.readString();
                u62 u62VarB32 = s62.B3(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                iv1.f(parcel);
                ba2 ba2VarE2 = E2(u10VarX02, xe4Var2, string2, u62VarB32, i3);
                parcel2.writeNoException();
                iv1.e(parcel2, ba2VarE2);
                return true;
            case 3:
                u10 u10VarX03 = oi0.X0(parcel.readStrongBinder());
                String string3 = parcel.readString();
                u62 u62VarB33 = s62.B3(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                iv1.f(parcel);
                x72 x72VarI1 = i1(u10VarX03, string3, u62VarB33, i4);
                parcel2.writeNoException();
                iv1.e(parcel2, x72VarI1);
                return true;
            case 4:
                oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 5:
                u10 u10VarX04 = oi0.X0(parcel.readStrongBinder());
                u10 u10VarX05 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                f22 f22VarX1 = x1(u10VarX04, u10VarX05);
                parcel2.writeNoException();
                iv1.e(parcel2, f22VarX1);
                return true;
            case 6:
                u10 u10VarX06 = oi0.X0(parcel.readStrongBinder());
                u62 u62VarB34 = s62.B3(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                iv1.f(parcel);
                Context context = (Context) oi0.l1(u10VarX06);
                th2 th2Var = th2.a(context, u62VarB34, i5).b;
                context.getClass();
                y73 y73Var = (y73) ((ba4) new vq2(th2Var, context, (String) null).g).d();
                parcel2.writeNoException();
                iv1.e(parcel2, y73Var);
                return true;
            case 7:
                oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                parcel2.writeNoException();
                parcel2.writeStrongBinder(null);
                return true;
            case 8:
                u10 u10VarX07 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                c92 c92VarM = M(u10VarX07);
                parcel2.writeNoException();
                iv1.e(parcel2, c92VarM);
                return true;
            case 9:
                u10 u10VarX08 = oi0.X0(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                iv1.f(parcel);
                zn2 zn2VarI2 = I2(u10VarX08, i6);
                parcel2.writeNoException();
                iv1.e(parcel2, zn2VarI2);
                return true;
            case 10:
                u10 u10VarX09 = oi0.X0(parcel.readStrongBinder());
                xe4 xe4Var3 = (xe4) iv1.b(parcel, xe4.CREATOR);
                String string4 = parcel.readString();
                int i7 = parcel.readInt();
                iv1.f(parcel);
                ba2 ba2VarB1 = b1(u10VarX09, xe4Var3, string4, i7);
                parcel2.writeNoException();
                iv1.e(parcel2, ba2VarB1);
                return true;
            case 11:
                u10 u10VarX010 = oi0.X0(parcel.readStrongBinder());
                u10 u10VarX011 = oi0.X0(parcel.readStrongBinder());
                u10 u10VarX012 = oi0.X0(parcel.readStrongBinder());
                iv1.f(parcel);
                as2 as2Var = new as2((View) oi0.l1(u10VarX010), (HashMap) oi0.l1(u10VarX011), (HashMap) oi0.l1(u10VarX012));
                parcel2.writeNoException();
                iv1.e(parcel2, as2Var);
                return true;
            case 12:
                u10 u10VarX013 = oi0.X0(parcel.readStrongBinder());
                String string5 = parcel.readString();
                u62 u62VarB35 = s62.B3(parcel.readStrongBinder());
                int i8 = parcel.readInt();
                iv1.f(parcel);
                ya2 ya2VarS2 = s2(u10VarX013, string5, u62VarB35, i8);
                parcel2.writeNoException();
                iv1.e(parcel2, ya2VarS2);
                return true;
            case 13:
                u10 u10VarX014 = oi0.X0(parcel.readStrongBinder());
                xe4 xe4Var4 = (xe4) iv1.b(parcel, xe4.CREATOR);
                String string6 = parcel.readString();
                u62 u62VarB36 = s62.B3(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                iv1.f(parcel);
                ba2 ba2VarY2 = Y2(u10VarX014, xe4Var4, string6, u62VarB36, i9);
                parcel2.writeNoException();
                iv1.e(parcel2, ba2VarY2);
                return true;
            case 14:
                u10 u10VarX015 = oi0.X0(parcel.readStrongBinder());
                u62 u62VarB37 = s62.B3(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                iv1.f(parcel);
                wc2 wc2VarC2 = c2(u10VarX015, u62VarB37, i10);
                parcel2.writeNoException();
                iv1.e(parcel2, wc2VarC2);
                return true;
            case 15:
                u10 u10VarX016 = oi0.X0(parcel.readStrongBinder());
                u62 u62VarB38 = s62.B3(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                iv1.f(parcel);
                w82 w82VarR1 = r1(u10VarX016, u62VarB38, i11);
                parcel2.writeNoException();
                iv1.e(parcel2, w82VarR1);
                return true;
            case 16:
                u10 u10VarX017 = oi0.X0(parcel.readStrongBinder());
                u62 u62VarB39 = s62.B3(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
                    m42Var = iInterfaceQueryLocalInterface instanceof m42 ? (m42) iInterfaceQueryLocalInterface : new m42(strongBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener", 2);
                }
                iv1.f(parcel);
                Context context2 = (Context) oi0.l1(u10VarX017);
                th2 th2Var2 = th2.a(context2, u62VarB39, i12).b;
                context2.getClass();
                m42Var.getClass();
                bw2 bw2Var = (bw2) new ci2(th2Var2, context2, m42Var).e.d();
                parcel2.writeNoException();
                iv1.e(parcel2, bw2Var);
                return true;
            case 17:
                u10 u10VarX018 = oi0.X0(parcel.readStrongBinder());
                u62 u62VarB310 = s62.B3(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                iv1.f(parcel);
                uv2 uv2VarY0 = Y0(u10VarX018, u62VarB310, i13);
                parcel2.writeNoException();
                iv1.e(parcel2, uv2VarY0);
                return true;
            case 18:
                u10 u10VarX019 = oi0.X0(parcel.readStrongBinder());
                u62 u62VarB311 = s62.B3(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                iv1.f(parcel);
                kh2 kh2VarT0 = T0(u10VarX019, u62VarB311, i14);
                parcel2.writeNoException();
                iv1.e(parcel2, kh2VarT0);
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.ek2
    public final ba2 E2(u10 u10Var, xe4 xe4Var, String str, u62 u62Var, int i) {
        Context context = (Context) oi0.l1(u10Var);
        th2 th2Var = th2.a(context, u62Var, i).b;
        context.getClass();
        xe4Var.getClass();
        str.getClass();
        return (w23) ((ba4) new of3(th2Var, context, str, xe4Var).g).d();
    }

    @Override // defpackage.ek2
    public final zn2 I2(u10 u10Var, int i) {
        return (oi2) th2.a((Context) oi0.l1(u10Var), null, i).B.d();
    }

    @Override // defpackage.ek2
    public final c92 M(u10 u10Var) {
        Activity activity = (Activity) oi0.l1(u10Var);
        AdOverlayInfoParcel adOverlayInfoParcelA = AdOverlayInfoParcel.a(activity.getIntent());
        if (adOverlayInfoParcelA == null) {
            return new jh1(activity, 4);
        }
        int i = adOverlayInfoParcelA.p;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? new jh1(activity, 4) : new jh1(activity, 0) : new re1(activity, adOverlayInfoParcelA) : new jh1(activity, 2) : new jh1(activity, 1) : new jh1(activity, 3);
    }

    @Override // defpackage.ek2
    public final kh2 T0(u10 u10Var, u62 u62Var, int i) {
        return (mb3) th2.a((Context) oi0.l1(u10Var), u62Var, i).C.d();
    }

    @Override // defpackage.ek2
    public final ba2 T1(u10 u10Var, xe4 xe4Var, String str, u62 u62Var, int i) {
        Context context = (Context) oi0.l1(u10Var);
        th2 th2Var = th2.a(context, u62Var, i).b;
        context.getClass();
        xe4Var.getClass();
        str.getClass();
        da4 da4VarA = da4.a(context);
        da4 da4VarA2 = da4.a(xe4Var);
        ba4 ba4Var = th2Var.j;
        ba4 ba4VarA = ba4.a(new ri2(ba4Var, 23));
        z63 z63Var = (z63) ba4.a(new bm2(da4VarA, th2Var.c, da4VarA2, th2Var.D, ba4VarA, ba4.a(yb.p), ba4.a(ou1.o))).d();
        s23 s23Var = (s23) ba4VarA.d();
        e51 e51Var = th2Var.a.a;
        i41.M(e51Var);
        return new q23(context, xe4Var, str, z63Var, s23Var, e51Var, (mv2) ba4Var.d());
    }

    @Override // defpackage.ek2
    public final uv2 Y0(u10 u10Var, u62 u62Var, int i) {
        return (ex2) th2.a((Context) oi0.l1(u10Var), u62Var, i).x.d();
    }

    @Override // defpackage.ek2
    public final ba2 Y2(u10 u10Var, xe4 xe4Var, String str, u62 u62Var, int i) {
        Context context = (Context) oi0.l1(u10Var);
        th2 th2Var = th2.a(context, u62Var, i).b;
        str.getClass();
        context.getClass();
        da4 da4VarA = da4.a(context);
        da4 da4VarA2 = da4.a(str);
        ba4 ba4Var = th2Var.I0;
        l73 l73Var = new l73(da4VarA, ba4Var, th2Var.J0, 0);
        ba4 ba4VarA = ba4.a(new u43(ba4Var, 6));
        ba4 ba4Var2 = th2Var.c;
        da4 da4Var = th2Var.D;
        ph2 ph2Var = th2Var.h;
        return (y63) ba4.a(new bm2(da4Var, da4VarA, da4VarA2, ba4.a(new ar2(da4VarA, ba4Var2, da4Var, (ca4) l73Var, ba4VarA, (ga4) ph2Var, 7)), ba4VarA, ph2Var, th2Var.j)).d();
    }

    @Override // defpackage.ek2
    public final ba2 b1(u10 u10Var, xe4 xe4Var, String str, int i) {
        return new pf4((Context) oi0.l1(u10Var), xe4Var, str, new e51(ModuleDescriptor.MODULE_VERSION, i, 0, true, false));
    }

    @Override // defpackage.ek2
    public final wc2 c2(u10 u10Var, u62 u62Var, int i) {
        return (cr1) th2.a((Context) oi0.l1(u10Var), u62Var, i).M.d();
    }

    @Override // defpackage.ek2
    public final x72 i1(u10 u10Var, String str, u62 u62Var, int i) {
        Context context = (Context) oi0.l1(u10Var);
        return new o23(th2.a(context, u62Var, i), context, str);
    }

    @Override // defpackage.ek2
    public final w82 r1(u10 u10Var, u62 u62Var, int i) {
        return (pz2) th2.a((Context) oi0.l1(u10Var), u62Var, i).J.d();
    }

    @Override // defpackage.ek2
    public final ya2 s2(u10 u10Var, String str, u62 u62Var, int i) {
        Context context = (Context) oi0.l1(u10Var);
        th2 th2Var = th2.a(context, u62Var, i).b;
        context.getClass();
        return (x73) ((ba4) new vq2(th2Var, context, str).h).d();
    }

    @Override // defpackage.ek2
    public final f22 x1(u10 u10Var, u10 u10Var2) {
        return new cs2((FrameLayout) oi0.l1(u10Var), (FrameLayout) oi0.l1(u10Var2));
    }
}
