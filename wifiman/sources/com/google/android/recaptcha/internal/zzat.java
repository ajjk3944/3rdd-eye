package com.google.android.recaptcha.internal;

import Zg.U;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6494u;
import mh.InterfaceC6824a;

/* loaded from: classes3.dex */
final class zzat extends AbstractC6494u implements InterfaceC6824a {
    public static final zzat zza = new zzat();

    zzat() {
        super(0);
    }

    public static final Map zza() {
        Map map = zzav.zzc;
        LinkedHashMap linkedHashMap = new LinkedHashMap(U.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((zzaw) entry.getValue()).zzb());
        }
        return linkedHashMap;
    }

    @Override // mh.InterfaceC6824a
    public final /* bridge */ /* synthetic */ Object invoke() {
        return zza();
    }
}
