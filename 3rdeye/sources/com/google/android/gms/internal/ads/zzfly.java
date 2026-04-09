package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzfly extends zzfmb {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzfly zzb = new zzfly();

    private zzfly() {
    }

    public static zzfly zza() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final void zzb(boolean z10) {
        Iterator it = zzflz.zza().zzc().iterator();
        while (it.hasNext()) {
            ((zzflh) it.next()).zzg().zzk(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmb
    public final boolean zzc() {
        Iterator it = zzflz.zza().zzb().iterator();
        while (it.hasNext()) {
            View viewZzf = ((zzflh) it.next()).zzf();
            if (viewZzf != null && viewZzf.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
