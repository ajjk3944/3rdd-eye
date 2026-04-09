package com.google.android.gms.ads;

import android.os.RemoteException;
import defpackage.f53;
import defpackage.gi2;
import defpackage.zn2;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public class MobileAds {
    private static void setPlugin(String str) {
        f53 f53VarD = f53.d();
        synchronized (f53VarD.e) {
            zn2 zn2Var = f53VarD.f;
            if (!(zn2Var != null)) {
                throw new IllegalStateException("MobileAds.initialize() must be called prior to setting the plugin.");
            }
            try {
                zn2Var.i0(str);
            } catch (RemoteException e) {
                gi2.c0("Unable to set plugin.", e);
            }
        }
    }
}
