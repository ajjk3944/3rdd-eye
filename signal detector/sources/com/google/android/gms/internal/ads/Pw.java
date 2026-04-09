package com.google.android.gms.internal.ads;

import M2.InterfaceC0162b;
import M2.InterfaceC0163c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class Pw extends p2.b {

    /* renamed from: y, reason: collision with root package name */
    public final int f10540y;

    public Pw(Context context, Looper looper, InterfaceC0162b interfaceC0162b, InterfaceC0163c interfaceC0163c, int i) {
        super(context, looper, 116, interfaceC0162b, interfaceC0163c);
        this.f10540y = i;
    }

    @Override // M2.AbstractC0165e, K2.c
    public final int j() {
        return this.f10540y;
    }

    @Override // M2.AbstractC0165e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        return iInterfaceQueryLocalInterface instanceof Sw ? (Sw) iInterfaceQueryLocalInterface : new Sw(iBinder, "com.google.android.gms.gass.internal.IGassService", 2);
    }

    @Override // M2.AbstractC0165e
    public final String u() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    @Override // M2.AbstractC0165e
    public final String v() {
        return "com.google.android.gms.gass.START";
    }
}
