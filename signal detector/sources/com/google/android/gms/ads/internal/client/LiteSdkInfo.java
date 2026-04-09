package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.BinderC0569Jc;
import com.google.android.gms.internal.ads.InterfaceC0603Lc;
import q2.AbstractBinderC2813d0;
import q2.L0;

/* loaded from: classes.dex */
public class LiteSdkInfo extends AbstractBinderC2813d0 {
    public LiteSdkInfo(Context context) {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // q2.InterfaceC2815e0
    public InterfaceC0603Lc getAdapterCreator() {
        return new BinderC0569Jc();
    }

    @Override // q2.InterfaceC2815e0
    public L0 getLiteSdkVersion() {
        return new L0(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "24.9.0");
    }
}
