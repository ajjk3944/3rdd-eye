package com.google.android.gms.internal.ads;

import A2.C0117e;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0842Zd extends B7 implements InterfaceC1970uf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D2.a f12907a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC0842Zd(C0889ae c0889ae, D2.a aVar) {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
        this.f12907a = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1970uf
    public final void F3(String str, Bundle bundle, String str2) {
        this.f12907a.b(new C0117e(4, new B2.a(str, 5)));
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            C7.f(parcel);
        } else if (i == 2) {
            String string = parcel.readString();
            C7.f(parcel);
            v(string);
        } else {
            if (i != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) C7.b(parcel, Bundle.CREATOR);
            C7.f(parcel);
            F3(string2, bundle, string3);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1970uf
    public final void v(String str) {
        this.f12907a.a(str);
    }
}
