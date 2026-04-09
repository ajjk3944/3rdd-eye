package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcfe;

/* compiled from: com.google.android.gms:play-services-ads@@24.4.0 */
/* loaded from: classes.dex */
public final class zzi {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzi(zzcfe zzcfeVar) throws zzg {
        this.zzb = zzcfeVar.getLayoutParams();
        ViewParent parent = zzcfeVar.getParent();
        this.zzd = zzcfeVar.zzE();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new zzg("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.zzc = viewGroup;
        this.zza = viewGroup.indexOfChild(zzcfeVar.zzF());
        viewGroup.removeView(zzcfeVar.zzF());
        zzcfeVar.zzaq(true);
    }
}
