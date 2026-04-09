package com.google.android.recaptcha.internal;

import Zg.AbstractC3689v;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC6492s;
import mh.InterfaceC6839p;

/* loaded from: classes3.dex */
public final class zzfy extends zzfx {
    private final InterfaceC6839p zza;
    private final String zzb;

    public zzfy(InterfaceC6839p interfaceC6839p, String str, Object obj) {
        super(obj);
        this.zza = interfaceC6839p;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        Collection collectionL;
        if (!AbstractC6492s.d(method.getName(), this.zzb)) {
            return false;
        }
        zztf zztfVarZzf = zzti.zzf();
        if (objArr != null) {
            collectionL = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zztg zztgVarZzf = zzth.zzf();
                zztgVarZzf.zzw(obj2.toString());
                collectionL.add((zzth) zztgVarZzf.zzk());
            }
        } else {
            collectionL = AbstractC3689v.l();
        }
        zztfVarZzf.zze(collectionL);
        zzti zztiVar = (zzti) zztfVarZzf.zzk();
        InterfaceC6839p interfaceC6839p = this.zza;
        byte[] bArrZzd = zztiVar.zzd();
        interfaceC6839p.invoke(objArr, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
