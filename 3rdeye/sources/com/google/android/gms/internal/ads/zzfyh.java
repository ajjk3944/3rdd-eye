package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfyh {
    Object[] zza;
    int zzb;
    zzfyg zzc;

    public zzfyh() {
        this(4);
    }

    private final void zzd(int i) {
        Object[] objArr = this.zza;
        int length = objArr.length;
        int i10 = i + i;
        if (i10 > length) {
            this.zza = Arrays.copyOf(objArr, zzfxz.zze(length, i10));
        }
    }

    public final zzfyh zza(Object obj, Object obj2) {
        zzd(this.zzb + 1);
        zzfxc.zzb(obj, obj2);
        Object[] objArr = this.zza;
        int i = this.zzb;
        int i10 = i + i;
        objArr[i10] = obj;
        objArr[i10 + 1] = obj2;
        this.zzb = i + 1;
        return this;
    }

    public final zzfyh zzb(Iterable iterable) {
        if (iterable instanceof Collection) {
            zzd(((Collection) iterable).size() + this.zzb);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            zza(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public final zzfyi zzc() {
        zzfyg zzfygVar = this.zzc;
        if (zzfygVar != null) {
            throw zzfygVar.zza();
        }
        zzfzw zzfzwVarZzj = zzfzw.zzj(this.zzb, this.zza, this);
        zzfyg zzfygVar2 = this.zzc;
        if (zzfygVar2 == null) {
            return zzfzwVarZzj;
        }
        throw zzfygVar2.zza();
    }

    public zzfyh(int i) {
        this.zza = new Object[i + i];
        this.zzb = 0;
    }
}
