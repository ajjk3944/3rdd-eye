package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import c7.h;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.mg;
import com.google.android.gms.internal.ads.ng;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import nk.k;
import t6.e;
import t6.w;
import t6.x;
import t6.y;
import t6.z;
import u6.r;
import vb.a;
import vb.b;
import ya.t;
import za.i;
import zj.n;
import zj.u;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public class WorkManagerUtil extends mg implements t {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            a aVarR0 = b.r0(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            ng.f(parcel);
            boolean zZze = zze(aVarR0, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
            return true;
        }
        if (i4 == 2) {
            a aVarR02 = b.r0(parcel.readStrongBinder());
            ng.f(parcel);
            zzf(aVarR02);
            parcel2.writeNoException();
            return true;
        }
        if (i4 != 3) {
            return false;
        }
        a aVarR03 = b.r0(parcel.readStrongBinder());
        wa.a aVar = (wa.a) ng.b(parcel, wa.a.CREATOR);
        ng.f(parcel);
        boolean zZzg = zzg(aVarR03, aVar);
        parcel2.writeNoException();
        parcel2.writeInt(zZzg ? 1 : 0);
        return true;
    }

    @Override // ya.t
    public final boolean zze(a aVar, String str, String str2) {
        return zzg(aVar, new wa.a(str, str2, ""));
    }

    @Override // ya.t
    public final void zzf(a aVar) {
        Context context = (Context) b.U0(aVar);
        try {
            Context applicationContext = context.getApplicationContext();
            t6.b bVar = new t6.b(new x());
            k.e(applicationContext, "context");
            synchronized (r.f35174p) {
                try {
                    r rVar = r.f35172n;
                    if (rVar != null && r.f35173o != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                    if (rVar == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        if (r.f35173o == null) {
                            r.f35173o = u6.t.i(applicationContext2, bVar);
                        }
                        r.f35172n = r.f35173o;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException unused) {
        }
        try {
            k.e(context, "context");
            r rVarD = r.D(context);
            rVarD.B("offline_ping_sender_work");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            e eVar = new e(new h(null), w.f34402b, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? n.v0(linkedHashSet) : u.f38319a);
            y yVar = new y(0, OfflinePingSender.class);
            ((b7.r) yVar.f25040b).j = eVar;
            ((LinkedHashSet) yVar.f25041c).add("offline_ping_sender_work");
            rVarD.f((z) yVar.a());
        } catch (IllegalStateException e2) {
            i.i("Failed to instantiate WorkManager.", e2);
        }
    }

    @Override // ya.t
    public final boolean zzg(a aVar, wa.a aVar2) {
        Context context = (Context) b.U0(aVar);
        try {
            Context applicationContext = context.getApplicationContext();
            t6.b bVar = new t6.b(new x());
            k.e(applicationContext, "context");
            synchronized (r.f35174p) {
                try {
                    r rVar = r.f35172n;
                    if (rVar != null && r.f35173o != null) {
                        throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                    }
                    if (rVar == null) {
                        Context applicationContext2 = applicationContext.getApplicationContext();
                        if (r.f35173o == null) {
                            r.f35173o = u6.t.i(applicationContext2, bVar);
                        }
                        r.f35172n = r.f35173o;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException unused) {
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        e eVar = new e(new h(null), w.f34402b, false, false, false, false, -1L, -1L, Build.VERSION.SDK_INT >= 24 ? n.v0(linkedHashSet) : u.f38319a);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("uri", aVar2.f36576a);
        linkedHashMap.put("gws_query_id", aVar2.f36577b);
        linkedHashMap.put("image_url", aVar2.f36578c);
        t6.h hVar = new t6.h(linkedHashMap);
        jm.a.A(hVar);
        y yVar = new y(0, OfflineNotificationPoster.class);
        b7.r rVar2 = (b7.r) yVar.f25040b;
        rVar2.j = eVar;
        rVar2.f2034e = hVar;
        ((LinkedHashSet) yVar.f25041c).add("offline_notification_work");
        z zVar = (z) yVar.a();
        try {
            k.e(context, "context");
            r.D(context).f(zVar);
            return true;
        } catch (IllegalStateException e2) {
            i.i("Failed to instantiate WorkManager.", e2);
            return false;
        }
    }
}
