package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.aw0;
import com.yandex.mobile.ads.impl.yz0;

@Deprecated
/* loaded from: classes3.dex */
public class qi2 implements yz0.b {
    public static final Parcelable.Creator<qi2> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f32229b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32230c;

    public class a implements Parcelable.Creator<qi2> {
        @Override // android.os.Parcelable.Creator
        public final qi2 createFromParcel(Parcel parcel) {
            return new qi2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final qi2[] newArray(int i) {
            return new qi2[i];
        }
    }

    public qi2(Parcel parcel) {
        this.f32229b = (String) s82.a(parcel.readString());
        this.f32230c = (String) s82.a(parcel.readString());
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ dc0 a() {
        return N4.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final /* synthetic */ byte[] b() {
        return N4.c(this);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            qi2 qi2Var = (qi2) obj;
            if (this.f32229b.equals(qi2Var.f32229b) && this.f32230c.equals(qi2Var.f32230c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f32230c.hashCode() + C4121h3.a(this.f32229b, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.f32229b + "=" + this.f32230c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f32229b);
        parcel.writeString(this.f32230c);
    }

    @Override // com.yandex.mobile.ads.impl.yz0.b
    public final void a(aw0.a aVar) {
        String str = this.f32229b;
        str.getClass();
        switch (str) {
            case "ALBUM":
                aVar.b(this.f32230c);
                break;
            case "TITLE":
                aVar.i(this.f32230c);
                break;
            case "DESCRIPTION":
                aVar.f(this.f32230c);
                break;
            case "ALBUMARTIST":
                aVar.a(this.f32230c);
                break;
            case "ARTIST":
                aVar.c(this.f32230c);
                break;
        }
    }

    public qi2(String str, String str2) {
        this.f32229b = str;
        this.f32230c = str2;
    }
}
