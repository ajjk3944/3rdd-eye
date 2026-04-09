package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class a extends ac.a implements c {
    public final Bundle D2(String str, String str2, Bundle bundle) {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(9);
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        int i4 = d.f20097a;
        parcelA2.writeInt(1);
        bundle.writeToParcel(parcelA2, 0);
        Parcel parcelF2 = f2(parcelA2, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(parcelF2);
        parcelF2.recycle();
        return bundle2;
    }

    public final Bundle O3(String str, String str2, String str3) {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(3);
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        parcelA2.writeString(str3);
        Parcel parcelF2 = f2(parcelA2, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(parcelF2);
        parcelF2.recycle();
        return bundle;
    }

    public final Bundle g4(int i4, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i4);
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        parcelA2.writeString(str3);
        int i10 = d.f20097a;
        parcelA2.writeInt(1);
        bundle.writeToParcel(parcelA2, 0);
        Parcel parcelF2 = f2(parcelA2, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(parcelF2);
        parcelF2.recycle();
        return bundle2;
    }

    public final Bundle h3(String str, String str2, String str3) {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(3);
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        parcelA2.writeString(str3);
        parcelA2.writeString(null);
        Parcel parcelF2 = f2(parcelA2, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d.a(parcelF2);
        parcelF2.recycle();
        return bundle;
    }

    public final Bundle h4(int i4, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i4);
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        int i10 = d.f20097a;
        parcelA2.writeInt(1);
        bundle.writeToParcel(parcelA2, 0);
        parcelA2.writeInt(1);
        bundle2.writeToParcel(parcelA2, 0);
        Parcel parcelF2 = f2(parcelA2, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) d.a(parcelF2);
        parcelF2.recycle();
        return bundle3;
    }

    public final int k2(int i4, String str, String str2, Bundle bundle) {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i4);
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        int i10 = d.f20097a;
        parcelA2.writeInt(1);
        bundle.writeToParcel(parcelA2, 0);
        Parcel parcelF2 = f2(parcelA2, 10);
        int i11 = parcelF2.readInt();
        parcelF2.recycle();
        return i11;
    }

    public final Bundle r2(String str, String str2, Bundle bundle) {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(9);
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        int i4 = d.f20097a;
        parcelA2.writeInt(1);
        bundle.writeToParcel(parcelA2, 0);
        Parcel parcelF2 = f2(parcelA2, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(parcelF2);
        parcelF2.recycle();
        return bundle2;
    }

    public final Bundle u3(int i4, String str, String str2, String str3, Bundle bundle) {
        Parcel parcelA2 = a2();
        parcelA2.writeInt(i4);
        parcelA2.writeString(str);
        parcelA2.writeString(str2);
        parcelA2.writeString(str3);
        parcelA2.writeString(null);
        int i10 = d.f20097a;
        parcelA2.writeInt(1);
        bundle.writeToParcel(parcelA2, 0);
        Parcel parcelF2 = f2(parcelA2, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) d.a(parcelF2);
        parcelF2.recycle();
        return bundle2;
    }
}
