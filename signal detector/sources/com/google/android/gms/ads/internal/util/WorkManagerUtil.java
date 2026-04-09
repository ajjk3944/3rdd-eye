package com.google.android.gms.ads.internal.util;

import S2.a;
import S2.b;
import S4.r;
import V0.c;
import V0.e;
import V0.f;
import W0.k;
import android.content.Context;
import android.os.Build;
import android.os.Parcel;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.internal.ads.B7;
import com.google.android.gms.internal.ads.C7;
import e1.h;
import f1.C2324b;
import java.util.HashMap;
import java.util.HashSet;
import r2.C2876a;
import t2.w;

/* loaded from: classes.dex */
public class WorkManagerUtil extends B7 implements w {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a aVarD1 = b.d1(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            C7.f(parcel);
            boolean zZze = zze(aVarD1, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
            return true;
        }
        if (i == 2) {
            a aVarD12 = b.d1(parcel.readStrongBinder());
            C7.f(parcel);
            zzf(aVarD12);
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            return false;
        }
        a aVarD13 = b.d1(parcel.readStrongBinder());
        C2876a c2876a = (C2876a) C7.b(parcel, C2876a.CREATOR);
        C7.f(parcel);
        boolean zZzg = zzg(aVarD13, c2876a);
        parcel2.writeNoException();
        parcel2.writeInt(zZzg ? 1 : 0);
        return true;
    }

    @Override // t2.w
    public final boolean zze(a aVar, String str, String str2) {
        return zzg(aVar, new C2876a(str, str2, ""));
    }

    @Override // t2.w
    public final void zzf(a aVar) {
        Context context = (Context) b.n1(aVar);
        try {
            k.H(context.getApplicationContext(), new V0.b(new r(4)));
        } catch (IllegalStateException unused) {
        }
        try {
            k kVarG = k.G(context);
            kVarG.f3993l.o(new C2324b(kVarG, 0));
            e eVar = new e();
            c cVar = new c();
            cVar.f3808a = 1;
            cVar.f3813f = -1L;
            cVar.f3814g = -1L;
            cVar.f3815h = new e();
            cVar.f3809b = false;
            int i = Build.VERSION.SDK_INT;
            cVar.f3810c = false;
            cVar.f3808a = 2;
            cVar.f3811d = false;
            cVar.f3812e = false;
            if (i >= 24) {
                cVar.f3815h = eVar;
                cVar.f3813f = -1L;
                cVar.f3814g = -1L;
            }
            V2.e eVar2 = new V2.e(OfflinePingSender.class);
            ((h) eVar2.f3869c).f19916j = cVar;
            ((HashSet) eVar2.f3870d).add("offline_ping_sender_work");
            kVarG.k(eVar2.l());
        } catch (IllegalStateException e6) {
            u2.k.i("Failed to instantiate WorkManager.", e6);
        }
    }

    @Override // t2.w
    public final boolean zzg(a aVar, C2876a c2876a) throws Throwable {
        Context context = (Context) b.n1(aVar);
        try {
            k.H(context.getApplicationContext(), new V0.b(new r(4)));
        } catch (IllegalStateException unused) {
        }
        e eVar = new e();
        c cVar = new c();
        cVar.f3808a = 1;
        cVar.f3813f = -1L;
        cVar.f3814g = -1L;
        cVar.f3815h = new e();
        cVar.f3809b = false;
        int i = Build.VERSION.SDK_INT;
        cVar.f3810c = false;
        cVar.f3808a = 2;
        cVar.f3811d = false;
        cVar.f3812e = false;
        if (i >= 24) {
            cVar.f3815h = eVar;
            cVar.f3813f = -1L;
            cVar.f3814g = -1L;
        }
        HashMap map = new HashMap();
        map.put("uri", c2876a.f23393a);
        map.put("gws_query_id", c2876a.f23394b);
        map.put("image_url", c2876a.f23395c);
        f fVar = new f(map);
        f.c(fVar);
        V2.e eVar2 = new V2.e(OfflineNotificationPoster.class);
        h hVar = (h) eVar2.f3869c;
        hVar.f19916j = cVar;
        hVar.f19912e = fVar;
        ((HashSet) eVar2.f3870d).add("offline_notification_work");
        try {
            k.G(context).k(eVar2.l());
            return true;
        } catch (IllegalStateException e6) {
            u2.k.i("Failed to instantiate WorkManager.", e6);
            return false;
        }
    }
}
