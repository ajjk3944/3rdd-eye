package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
final class zzfuc implements ServiceConnection {
    final /* synthetic */ zzfue zza;

    public /* synthetic */ zzfuc(zzfue zzfueVar, zzfud zzfudVar) {
        this.zza = zzfueVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzfue zzfueVar = this.zza;
        zzfueVar.zzc.zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzfueVar.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfua
            @Override // java.lang.Runnable
            public final void run() throws RemoteException {
                IInterface iInterface;
                zzfse zzfseVarZzb = zzfsd.zzb(iBinder);
                zzfuc zzfucVar = this.zza;
                zzfue zzfueVar2 = zzfucVar.zza;
                zzfueVar2.zzj = zzfseVarZzb;
                zzfueVar2.zzc.zzc("linkToDeath", new Object[0]);
                try {
                    iInterface = zzfueVar2.zzj;
                } catch (RemoteException e4) {
                    zzfucVar.zza.zzc.zzb(e4, "linkToDeath failed", new Object[0]);
                }
                if (iInterface == null) {
                    throw null;
                }
                iInterface.asBinder().linkToDeath(zzfueVar2.zzh, 0);
                zzfue zzfueVar3 = zzfucVar.zza;
                zzfueVar3.zzf = false;
                synchronized (zzfueVar3.zze) {
                    try {
                        Iterator it = zzfueVar3.zze.iterator();
                        while (it.hasNext()) {
                            ((Runnable) it.next()).run();
                        }
                        zzfueVar3.zze.clear();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfue zzfueVar = this.zza;
        zzfueVar.zzc.zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzfueVar.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfub
            @Override // java.lang.Runnable
            public final void run() {
                zzfue zzfueVar2 = this.zza.zza;
                zzfueVar2.zzc.zzc("unlinkToDeath", new Object[0]);
                IInterface iInterface = zzfueVar2.zzj;
                iInterface.getClass();
                iInterface.asBinder().unlinkToDeath(zzfueVar2.zzh, 0);
                zzfueVar2.zzj = null;
                zzfueVar2.zzf = false;
            }
        });
    }
}
