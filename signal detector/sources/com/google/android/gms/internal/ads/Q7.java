package com.google.android.gms.internal.ads;

import android.os.Parcel;
import k2.InterfaceC2625d;

/* loaded from: classes.dex */
public final class Q7 extends B7 implements q2.W {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f10579b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2625d f10580a;

    public Q7(InterfaceC2625d interfaceC2625d) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.f10580a = interfaceC2625d;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        C7.f(parcel);
        q0(string, string2);
        parcel2.writeNoException();
        return true;
    }

    @Override // q2.W
    public final void q0(String str, String str2) {
        this.f10580a.s(str, str2);
    }
}
