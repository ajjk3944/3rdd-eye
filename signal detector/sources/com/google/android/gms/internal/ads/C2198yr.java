package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import q2.InterfaceC2806a;
import q2.InterfaceC2847v;

/* renamed from: com.google.android.gms.internal.ads.yr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2198yr implements InterfaceC2806a, InterfaceC2084wl {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC2847v f17779a;

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final synchronized void L() {
        InterfaceC2847v interfaceC2847v = this.f17779a;
        if (interfaceC2847v != null) {
            try {
                interfaceC2847v.z();
            } catch (RemoteException e6) {
                u2.k.i("Remote Exception at onPhysicalClick.", e6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2084wl
    public final synchronized void M() {
    }

    @Override // q2.InterfaceC2806a
    public final synchronized void onAdClicked() {
        InterfaceC2847v interfaceC2847v = this.f17779a;
        if (interfaceC2847v != null) {
            try {
                interfaceC2847v.z();
            } catch (RemoteException e6) {
                u2.k.i("Remote Exception at onAdClicked.", e6);
            }
        }
    }
}
