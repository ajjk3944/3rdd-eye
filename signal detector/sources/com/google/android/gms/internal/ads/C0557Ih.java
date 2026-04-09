package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import q2.InterfaceC2815e0;

/* renamed from: com.google.android.gms.internal.ads.Ih, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0557Ih implements InterfaceC1853sN {

    /* renamed from: a, reason: collision with root package name */
    public final C0540Hh f9137a;

    public C0557Ih(C0540Hh c0540Hh) {
        this.f9137a = c0540Hh;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2069wN
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String c() {
        q2.L0 liteSdkVersion;
        InterfaceC2815e0 interfaceC2815e0 = (InterfaceC2815e0) C1338iu.o(this.f9137a.a()).f14823c;
        if (interfaceC2815e0 != null) {
            try {
                liteSdkVersion = interfaceC2815e0.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        } else {
            liteSdkVersion = null;
        }
        if (liteSdkVersion != null) {
            return liteSdkVersion.f23131c;
        }
        return null;
    }
}
