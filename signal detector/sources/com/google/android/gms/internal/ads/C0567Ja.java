package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Ja, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0567Ja {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9310a;

    public C0567Ja(InterfaceC0550Ia interfaceC0550Ia, int i) {
        IBinder iBinder;
        switch (i) {
            case 1:
                this.f9310a = new ArrayList();
                try {
                    interfaceC0550Ia.c();
                } catch (RemoteException e6) {
                    u2.k.f("", e6);
                }
                try {
                    ArrayList arrayListF = interfaceC0550Ia.f();
                    int size = arrayListF.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayListF.get(i3);
                        i3++;
                        InterfaceC0635Na interfaceC0635NaK3 = obj instanceof IBinder ? BinderC0465Da.K3((IBinder) obj) : null;
                        if (interfaceC0635NaK3 != null) {
                            this.f9310a.add(new C0889ae(interfaceC0635NaK3));
                        }
                    }
                    break;
                } catch (RemoteException e7) {
                    u2.k.f("", e7);
                    return;
                }
            default:
                this.f9310a = new ArrayList();
                try {
                    interfaceC0550Ia.c();
                } catch (RemoteException e8) {
                    u2.k.f("", e8);
                }
                try {
                    ArrayList arrayListF2 = interfaceC0550Ia.f();
                    int size2 = arrayListF2.size();
                    int i6 = 0;
                    while (i6 < size2) {
                        Object obj2 = arrayListF2.get(i6);
                        i6++;
                        InterfaceC0635Na c0618Ma = null;
                        if ((obj2 instanceof IBinder) && (iBinder = (IBinder) obj2) != null) {
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                            c0618Ma = iInterfaceQueryLocalInterface instanceof InterfaceC0635Na ? (InterfaceC0635Na) iInterfaceQueryLocalInterface : new C0618Ma(iBinder);
                        }
                        if (c0618Ma != null) {
                            this.f9310a.add(new C0652Oa(c0618Ma));
                        }
                    }
                    break;
                } catch (RemoteException e9) {
                    u2.k.f("", e9);
                }
                break;
        }
    }
}
