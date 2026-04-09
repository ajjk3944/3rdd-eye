package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
abstract class zzgzv extends AtomicReference implements Runnable {
    private static final Runnable zza = new zzgzu(null);
    private static final Runnable zzb = new zzgzu(null);

    private final void zzb(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzgzt zzgztVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!(runnable instanceof zzgzt)) {
                if (runnable != zzb) {
                    break;
                }
            } else {
                zzgztVar = (zzgzt) runnable;
            }
            i10++;
            if (i10 > 1000) {
                Runnable runnable2 = zzb;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z10 = Thread.interrupted() || z10;
                    LockSupport.park(zzgztVar);
                }
            } else {
                Thread.yield();
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objZza = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zZzd = zzd();
            if (!zZzd) {
                try {
                    objZza = zza();
                } catch (Throwable th) {
                    try {
                        zzhag.zza(th);
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzg(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, zza)) {
                            zzb(threadCurrentThread);
                        }
                        zzf(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, zza)) {
                zzb(threadCurrentThread);
            }
            if (zZzd) {
                return;
            }
            zzf(objZza);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = (Runnable) get();
        if (runnable == zza) {
            string = "running=[DONE]";
        } else if (runnable instanceof zzgzt) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strZzc = zzc();
        StringBuilder sb2 = new StringBuilder(string.length() + 2 + String.valueOf(strZzc).length());
        sb2.append(string);
        sb2.append(", ");
        sb2.append(strZzc);
        return sb2.toString();
    }

    public abstract Object zza() throws Exception;

    public abstract String zzc();

    public abstract boolean zzd();

    public abstract void zzf(Object obj);

    public abstract void zzg(Throwable th);

    public final void zzh() {
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            zzgzt zzgztVar = new zzgzt(this, null);
            zzgztVar.zza(Thread.currentThread());
            if (compareAndSet(runnable, zzgztVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(zza)) == zzb) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }
}
