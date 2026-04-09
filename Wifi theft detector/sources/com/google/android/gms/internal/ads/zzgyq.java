package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* loaded from: classes2.dex */
abstract class zzgyq extends zzgyu {
    private static final zzgzw zza = new zzgzw(zzgyq.class);
    private zzgub zzb;
    private final boolean zzc;
    private final boolean zzd;

    public zzgyq(zzgub zzgubVar, boolean z10, boolean z11) {
        super(zzgubVar.size());
        this.zzb = zzgubVar;
        this.zzc = z10;
        this.zzd = z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i10, com.google.common.util.concurrent.a aVar) {
        try {
            if (aVar.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i10, aVar);
            }
            zzz(null);
        } catch (Throwable th) {
            zzz(null);
            throw th;
        }
    }

    private final void zzE(Throwable th) {
        th.getClass();
        if (this.zzc && !zzb(th) && zzI(zzB(), th)) {
            zzF(th);
        } else if (th instanceof Error) {
            zzF(th);
        }
    }

    private static void zzF(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void zzG(int i10, Future future) {
        try {
            zzw(i10, zzhap.zza(future));
        } catch (ExecutionException e10) {
            zzE(e10.getCause());
        } catch (Throwable th) {
            zzE(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgub zzgubVar) {
        int iZzC = zzC();
        int i10 = 0;
        zzgrc.zzj(iZzC >= 0, "Less than 0 remaining futures");
        if (iZzC == 0) {
            if (zzgubVar != null) {
                zzgwt it = zzgubVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i10, future);
                    }
                    i10++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
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

    public void zzA(int i10) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final void zzc() {
        zzgub zzgubVar = this.zzb;
        zzA(1);
        if ((zzgubVar != null) && isCancelled()) {
            boolean zZzj = zzj();
            zzgwt it = zzgubVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    public final String zzd() {
        zzgub zzgubVar = this.zzb;
        return zzgubVar != null ? "futures=".concat(zzgubVar.toString()) : super.zzd();
    }

    public final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzgwt it = this.zzb.iterator();
            final int i10 = 0;
            while (it.hasNext()) {
                final com.google.common.util.concurrent.a aVar = (com.google.common.util.concurrent.a) it.next();
                int i11 = i10 + 1;
                if (aVar.isDone()) {
                    zzy(i10, aVar);
                } else {
                    aVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgyp
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzy(i10, aVar);
                        }
                    }, zzgzd.INSTANCE);
                }
                i10 = i11;
            }
            return;
        }
        zzgub zzgubVar = this.zzb;
        final zzgub zzgubVar2 = true != this.zzd ? null : zzgubVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgyo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzz(zzgubVar2);
            }
        };
        zzgwt it2 = zzgubVar.iterator();
        while (it2.hasNext()) {
            com.google.common.util.concurrent.a aVar2 = (com.google.common.util.concurrent.a) it2.next();
            if (aVar2.isDone()) {
                zzz(zzgubVar2);
            } else {
                aVar2.addListener(runnable, zzgzd.INSTANCE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyu
    public final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzI(set, thZzl);
    }

    public abstract void zzw(int i10, Object obj);

    public abstract void zzx();
}
