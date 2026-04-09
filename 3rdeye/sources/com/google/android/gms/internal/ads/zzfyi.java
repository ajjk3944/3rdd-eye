package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public abstract class zzfyi implements Map, Serializable {
    private transient zzfyk zza;
    private transient zzfyk zzb;
    private transient zzfya zzc;

    public static zzfyi zzc(Map map) {
        Set setEntrySet = map.entrySet();
        zzfyh zzfyhVar = new zzfyh(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzfyhVar.zzb(setEntrySet);
        return zzfyhVar.zzc();
    }

    public static zzfyi zzd() {
        return zzfzw.zza;
    }

    public static zzfyi zze(Object obj, Object obj2) {
        zzfxc.zzb("dialog_not_shown_reason", obj2);
        return zzfzw.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzfzc.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgah.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfxc.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z10 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public abstract zzfya zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfya values() {
        zzfya zzfyaVar = this.zzc;
        if (zzfyaVar != null) {
            return zzfyaVar;
        }
        zzfya zzfyaVarZza = zza();
        this.zzc = zzfyaVarZza;
        return zzfyaVarZza;
    }

    public abstract zzfyk zzf();

    public abstract zzfyk zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzfyk entrySet() {
        zzfyk zzfykVar = this.zza;
        if (zzfykVar != null) {
            return zzfykVar;
        }
        zzfyk zzfykVarZzf = zzf();
        this.zza = zzfykVarZzf;
        return zzfykVarZzf;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzfyk keySet() {
        zzfyk zzfykVar = this.zzb;
        if (zzfykVar != null) {
            return zzfykVar;
        }
        zzfyk zzfykVarZzg = zzg();
        this.zzb = zzfykVarZzg;
        return zzfykVarZzg;
    }
}
