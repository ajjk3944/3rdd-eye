package com.google.android.gms.internal.ads;

import B4.g;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzaqb implements Comparable {
    private final zzaqm zza;
    private final int zzb;
    private final String zzc;
    private final int zzd;
    private final Object zze;
    private final zzaqf zzf;
    private Integer zzg;
    private zzaqe zzh;
    private boolean zzi;
    private zzapk zzj;
    private zzaqa zzk;
    private final zzapp zzl;

    public zzaqb(int i, String str, zzaqf zzaqfVar) {
        Uri uri;
        String host;
        this.zza = zzaqm.zza ? new zzaqm() : null;
        this.zze = new Object();
        int iHashCode = 0;
        this.zzi = false;
        this.zzj = null;
        this.zzb = i;
        this.zzc = str;
        this.zzf = zzaqfVar;
        this.zzl = new zzapp();
        if (!TextUtils.isEmpty(str) && (uri = Uri.parse(str)) != null && (host = uri.getHost()) != null) {
            iHashCode = host.hashCode();
        }
        this.zzd = iHashCode;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzg.intValue() - ((zzaqb) obj).zzg.intValue();
    }

    public final String toString() {
        String strValueOf = String.valueOf(Integer.toHexString(this.zzd));
        zzw();
        return "[ ] " + this.zzc + " " + "0x".concat(strValueOf) + " NORMAL " + this.zzg;
    }

    public final int zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzl.zzb();
    }

    public final int zzc() {
        return this.zzd;
    }

    public final zzapk zzd() {
        return this.zzj;
    }

    public final zzaqb zze(zzapk zzapkVar) {
        this.zzj = zzapkVar;
        return this;
    }

    public final zzaqb zzf(zzaqe zzaqeVar) {
        this.zzh = zzaqeVar;
        return this;
    }

    public final zzaqb zzg(int i) {
        this.zzg = Integer.valueOf(i);
        return this;
    }

    public abstract zzaqh zzh(zzapx zzapxVar);

    public final String zzj() {
        int i = this.zzb;
        String str = this.zzc;
        return i != 0 ? g.o(Integer.toString(1), "-", str) : str;
    }

    public final String zzk() {
        return this.zzc;
    }

    public Map zzl() throws zzapj {
        return Collections.EMPTY_MAP;
    }

    public final void zzm(String str) {
        if (zzaqm.zza) {
            this.zza.zza(str, Thread.currentThread().getId());
        }
    }

    public final void zzn(zzaqk zzaqkVar) {
        zzaqf zzaqfVar;
        synchronized (this.zze) {
            zzaqfVar = this.zzf;
        }
        zzaqfVar.zza(zzaqkVar);
    }

    public abstract void zzo(Object obj);

    public final void zzp(String str) {
        zzaqe zzaqeVar = this.zzh;
        if (zzaqeVar != null) {
            zzaqeVar.zzb(this);
        }
        if (zzaqm.zza) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new zzapz(this, str, id));
                return;
            }
            zzaqm zzaqmVar = this.zza;
            zzaqmVar.zza(str, id);
            zzaqmVar.zzb(toString());
        }
    }

    public final void zzq() {
        synchronized (this.zze) {
            this.zzi = true;
        }
    }

    public final void zzr() {
        zzaqa zzaqaVar;
        synchronized (this.zze) {
            zzaqaVar = this.zzk;
        }
        if (zzaqaVar != null) {
            zzaqaVar.zza(this);
        }
    }

    public final void zzs(zzaqh zzaqhVar) {
        zzaqa zzaqaVar;
        synchronized (this.zze) {
            zzaqaVar = this.zzk;
        }
        if (zzaqaVar != null) {
            zzaqaVar.zzb(this, zzaqhVar);
        }
    }

    public final void zzt(int i) {
        zzaqe zzaqeVar = this.zzh;
        if (zzaqeVar != null) {
            zzaqeVar.zzc(this, i);
        }
    }

    public final void zzu(zzaqa zzaqaVar) {
        synchronized (this.zze) {
            this.zzk = zzaqaVar;
        }
    }

    public final boolean zzv() {
        boolean z10;
        synchronized (this.zze) {
            z10 = this.zzi;
        }
        return z10;
    }

    public final boolean zzw() {
        synchronized (this.zze) {
        }
        return false;
    }

    public byte[] zzx() throws zzapj {
        return null;
    }

    public final zzapp zzy() {
        return this.zzl;
    }
}
