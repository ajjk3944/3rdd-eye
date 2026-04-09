package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbpo;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class LiteSdkInfo extends zzcx {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public zzbpo getAdapterCreator() {
        return new zzbpk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public zzfd getLiteSdkVersion() {
        return new zzfd(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "24.4.0");
    }
}
