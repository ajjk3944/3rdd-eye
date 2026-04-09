package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
abstract class zzgcb extends zzgcg {
    private static final zzgdk zza = new zzgdk(zzgcb.class);
    private zzfya zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzgcb(zzfya zzfyaVar, boolean z10, boolean z11) {
        super(zzfyaVar.size());
        this.zzb = zzfyaVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzD(int i, Future future) {
        try {
            zzx(i, zzgee.zza(future));
        } catch (ExecutionException e4) {
            zzF(e4.getCause());
        } catch (Throwable th) {
            zzF(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzE(zzfya zzfyaVar) {
        int iZzB = zzB();
        int i = 0;
        zzfve.zzm(iZzB >= 0, "Less than 0 remaining futures");
        if (iZzB == 0) {
            if (zzfyaVar != null) {
                zzgal it = zzfyaVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzD(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            zzy();
            zzA(2);
        }
    }

    private final void zzF(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzI(zzC(), th)) {
            zzG(th);
        } else if (th instanceof Error) {
            zzG(th);
        }
    }

    private static void zzG(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzH(int i, A4.a aVar) {
        try {
            if (aVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzD(i, aVar);
            }
            zzE(null);
        } catch (Throwable th) {
            zzE(null);
            throw th;
        }
    }

    private static boolean zzI(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    public void zzA(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final String zza() {
        zzfya zzfyaVar = this.zzb;
        return zzfyaVar != null ? "futures=".concat(zzfyaVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgbp
    public final void zzb() {
        zzfya zzfyaVar = this.zzb;
        zzA(1);
        if ((zzfyaVar != null) && isCancelled()) {
            boolean zZzo = zzo();
            zzgal it = zzfyaVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzo);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcg
    public final void zzw(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzi = zzi();
        Objects.requireNonNull(thZzi);
        zzI(set, thZzi);
    }

    public abstract void zzx(int i, Object obj);

    public abstract void zzy();

    public final void zzz() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzy();
            return;
        }
        if (this.zzc) {
            zzgal it = this.zzb.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final A4.a aVar = (A4.a) it.next();
                int i10 = i + 1;
                if (aVar.isDone()) {
                    zzH(i, aVar);
                } else {
                    aVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbz
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzH(i, aVar);
                        }
                    }, zzgcp.INSTANCE);
                }
                i = i10;
            }
            return;
        }
        zzfya zzfyaVar = this.zzb;
        final zzfya zzfyaVar2 = true != this.zzd ? null : zzfyaVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgca
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzE(zzfyaVar2);
            }
        };
        zzgal it2 = zzfyaVar.iterator();
        while (it2.hasNext()) {
            A4.a aVar2 = (A4.a) it2.next();
            if (aVar2.isDone()) {
                zzE(zzfyaVar2);
            } else {
                aVar2.addListener(runnable, zzgcp.INSTANCE);
            }
        }
    }
}
