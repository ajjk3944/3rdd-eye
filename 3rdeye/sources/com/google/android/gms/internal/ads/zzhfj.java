package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public class zzhfj implements Iterator, Closeable, zzarp {
    private static final zzaro zza = new zzhfi("eof ");
    protected zzarl zzb;
    protected zzhfk zzc;
    zzaro zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzhfq.zzb(zzhfj.class);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzaro zzaroVar = this.zzd;
        if (zzaroVar == zza) {
            return false;
        }
        if (zzaroVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        int i = 0;
        while (true) {
            List list = this.zzg;
            if (i >= list.size()) {
                sb.append("]");
                return sb.toString();
            }
            if (i > 0) {
                sb.append(";");
            }
            sb.append(((zzaro) list.get(i)).toString());
            i++;
        }
    }

    @Override // java.util.Iterator
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzaro next() {
        zzaro zzaroVarZzb;
        zzaro zzaroVar = this.zzd;
        if (zzaroVar != null && zzaroVar != zza) {
            this.zzd = null;
            return zzaroVar;
        }
        zzhfk zzhfkVar = this.zzc;
        if (zzhfkVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzhfkVar) {
                this.zzc.zze(this.zze);
                zzaroVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzb();
            }
            return zzaroVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public final List zzd() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzhfp(this.zzg, this);
    }

    public final void zze(zzhfk zzhfkVar, long j4, zzarl zzarlVar) throws IOException {
        this.zzc = zzhfkVar;
        this.zze = zzhfkVar.zzb();
        zzhfkVar.zze(zzhfkVar.zzb() + j4);
        this.zzf = zzhfkVar.zzb();
        this.zzb = zzarlVar;
    }

    public void close() throws IOException {
    }
}
