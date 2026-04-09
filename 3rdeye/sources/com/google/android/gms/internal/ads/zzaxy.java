package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzaxy extends zzayi {
    private List zzh;
    private final Context zzi;

    public zzaxy(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i, int i10, Context context) {
        super(zzawvVar, "G1O+5tqulLBNCxZxcYiJSAGrazgAMWmQ49z8g8PEPhhOgnBizp9p2UWwJMiSx+ju", "xfUFYLaeYlsk7z1gy27YVxCq/UzpfsdVkNtosT4BuNc=", zzasrVar, i, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzayi
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzasr zzasrVar = this.zzd;
        zzasrVar.zzU(-1L);
        zzasrVar.zzQ(-1L);
        Context contextZzb = this.zzi;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, contextZzb);
        }
        List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (zzasrVar) {
            zzasrVar.zzU(((Long) this.zzh.get(0)).longValue());
            zzasrVar.zzQ(((Long) this.zzh.get(1)).longValue());
        }
    }
}
