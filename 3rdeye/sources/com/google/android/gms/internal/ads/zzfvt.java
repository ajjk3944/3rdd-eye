package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfvt {
    private final zzfvs zza;

    private zzfvt(zzfvs zzfvsVar) {
        int i = zzfuo.zzb;
        this.zza = zzfvsVar;
    }

    public static zzfvt zza(int i) {
        final int i10 = 4000;
        return new zzfvt(new zzfvs(i10) { // from class: com.google.android.gms.internal.ads.zzfvk
            @Override // com.google.android.gms.internal.ads.zzfvs
            public final Iterator zza(zzfvt zzfvtVar, CharSequence charSequence) {
                return new zzfvp(zzfvtVar, charSequence, 4000);
            }
        });
    }

    public static zzfvt zzb(final zzfup zzfupVar) {
        return new zzfvt(new zzfvs() { // from class: com.google.android.gms.internal.ads.zzfvl
            @Override // com.google.android.gms.internal.ads.zzfvs
            public final Iterator zza(zzfvt zzfvtVar, CharSequence charSequence) {
                return new zzfvn(zzfvtVar, charSequence, zzfupVar);
            }
        });
    }

    public static zzfvt zzc(Pattern pattern) {
        final zzfuv zzfuvVar = new zzfuv(pattern);
        zzfve.zzi(!((zzfuu) zzfuvVar.zza("")).zza.matches(), "The pattern may not match the empty string: %s", zzfuvVar);
        return new zzfvt(new zzfvs() { // from class: com.google.android.gms.internal.ads.zzfvm
            @Override // com.google.android.gms.internal.ads.zzfvs
            public final Iterator zza(zzfvt zzfvtVar, CharSequence charSequence) {
                return new zzfvo(zzfvtVar, charSequence, zzfuvVar.zza(charSequence));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator zzg(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfvq(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        Iterator itZzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itZzg.hasNext()) {
            arrayList.add((String) itZzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
