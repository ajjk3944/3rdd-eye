package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.cm2;
import defpackage.s62;
import defpackage.u62;
import defpackage.w63;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class LiteSdkInfo extends cm2 {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // defpackage.nm2
    public u62 getAdapterCreator() {
        return new s62();
    }

    @Override // defpackage.nm2
    public w63 getLiteSdkVersion() {
        return new w63("24.7.0", ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION);
    }
}
