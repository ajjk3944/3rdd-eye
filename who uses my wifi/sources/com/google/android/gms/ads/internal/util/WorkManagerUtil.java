package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import defpackage.fd;
import defpackage.gd1;
import defpackage.gi2;
import defpackage.ha1;
import defpackage.hj;
import defpackage.hv1;
import defpackage.im;
import defpackage.iv1;
import defpackage.oa1;
import defpackage.oi0;
import defpackage.pz;
import defpackage.ri;
import defpackage.ru0;
import defpackage.u10;
import defpackage.xb4;
import defpackage.y42;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class WorkManagerUtil extends hv1 implements y42 {
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // defpackage.hv1
    public final boolean A3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            u10 u10VarX0 = oi0.X0(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            iv1.f(parcel);
            boolean zZze = zze(u10VarX0, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
            return true;
        }
        if (i == 2) {
            u10 u10VarX02 = oi0.X0(parcel.readStrongBinder());
            iv1.f(parcel);
            zzf(u10VarX02);
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return false;
        }
        u10 u10VarX03 = oi0.X0(parcel.readStrongBinder());
        gd1 gd1Var = (gd1) iv1.b(parcel, gd1.CREATOR);
        iv1.f(parcel);
        boolean zZzg = zzg(u10VarX03, gd1Var);
        parcel2.writeNoException();
        parcel2.writeInt(zZzg ? 1 : 0);
        return true;
    }

    @Override // defpackage.y42
    public final boolean zze(u10 u10Var, String str, String str2) {
        return zzg(u10Var, new gd1(str, str2, ""));
    }

    @Override // defpackage.y42
    public final void zzf(u10 u10Var) {
        Context context = (Context) oi0.l1(u10Var);
        try {
            ha1.k0(context.getApplicationContext(), new ru0(new pz(15)));
        } catch (IllegalStateException unused) {
        }
        try {
            ha1 ha1VarJ0 = ha1.j0(context);
            ha1VarJ0.s.j(new fd(ha1VarJ0, 0));
            hj hjVar = new hj();
            ri riVar = new ri();
            riVar.a = 1;
            riVar.f = -1L;
            riVar.g = -1L;
            new HashSet();
            riVar.b = false;
            riVar.c = false;
            riVar.a = 2;
            riVar.d = false;
            riVar.e = false;
            riVar.h = hjVar;
            riVar.f = -1L;
            riVar.g = -1L;
            xb4 xb4Var = new xb4(OfflinePingSender.class);
            ((oa1) xb4Var.h).j = riVar;
            ((HashSet) xb4Var.i).add("offline_ping_sender_work");
            ha1VarJ0.n(xb4Var.f());
        } catch (IllegalStateException unused2) {
            gi2.q0(5);
        }
    }

    @Override // defpackage.y42
    public final boolean zzg(u10 u10Var, gd1 gd1Var) throws Throwable {
        Context context = (Context) oi0.l1(u10Var);
        try {
            ha1.k0(context.getApplicationContext(), new ru0(new pz(15)));
        } catch (IllegalStateException unused) {
        }
        hj hjVar = new hj();
        ri riVar = new ri();
        riVar.a = 1;
        riVar.f = -1L;
        riVar.g = -1L;
        new HashSet();
        riVar.b = false;
        riVar.c = false;
        riVar.a = 2;
        riVar.d = false;
        riVar.e = false;
        riVar.h = hjVar;
        riVar.f = -1L;
        riVar.g = -1L;
        HashMap map = new HashMap();
        map.put("uri", gd1Var.f);
        map.put("gws_query_id", gd1Var.g);
        map.put("image_url", gd1Var.h);
        im imVar = new im(map);
        im.c(imVar);
        xb4 xb4Var = new xb4(OfflineNotificationPoster.class);
        oa1 oa1Var = (oa1) xb4Var.h;
        oa1Var.j = riVar;
        oa1Var.e = imVar;
        ((HashSet) xb4Var.i).add("offline_notification_work");
        try {
            ha1.j0(context).n(xb4Var.f());
            return true;
        } catch (IllegalStateException unused2) {
            gi2.q0(5);
            return false;
        }
    }
}
