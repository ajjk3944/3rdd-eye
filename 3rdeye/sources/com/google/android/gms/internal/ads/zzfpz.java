package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfpz {
    final zzfqc zza;
    final boolean zzb;

    private zzfpz(zzfqc zzfqcVar) {
        this.zza = zzfqcVar;
        this.zzb = zzfqcVar != null;
    }

    public static zzfpz zzb(Context context, String str, String str2) throws zzfpb {
        zzfqc zzfqaVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderInstantiate == null) {
                        zzfqaVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfqaVar = iInterfaceQueryLocalInterface instanceof zzfqc ? (zzfqc) iInterfaceQueryLocalInterface : new zzfqa(iBinderInstantiate);
                    }
                    zzfqaVar.zze(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfpz(zzfqaVar);
                } catch (Exception e4) {
                    throw new zzfpb(e4);
                }
            } catch (Exception e10) {
                throw new zzfpb(e10);
            }
        } catch (RemoteException | zzfpb | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new zzfpz(new zzfqd());
        }
    }

    public static zzfpz zzc() {
        zzfqd zzfqdVar = new zzfqd();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfpz(zzfqdVar);
    }

    public final zzfpx zza(byte[] bArr) {
        return new zzfpx(this, bArr, null);
    }
}
