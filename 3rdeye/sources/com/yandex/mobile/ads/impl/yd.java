package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.aw0;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class yd extends ei0 {
    public static final Parcelable.Creator<yd> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f35719c;

    /* renamed from: d, reason: collision with root package name */
    public final String f35720d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35721e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f35722f;

    public class a implements Parcelable.Creator<yd> {
        @Override // android.os.Parcelable.Creator
        public final yd createFromParcel(Parcel parcel) {
            return new yd(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final yd[] newArray(int i) {
            return new yd[i];
        }
    }

    public yd(Parcel parcel) {
        super("APIC");
        this.f35719c = (String) s82.a(parcel.readString());
        this.f35720d = parcel.readString();
        this.f35721e = parcel.readInt();
        this.f35722f = (byte[]) s82.a(parcel.createByteArray());
    }

    @Override // com.yandex.mobile.ads.impl.ei0, com.yandex.mobile.ads.impl.yz0.b
    public final void a(aw0.a aVar) {
        aVar.a(this.f35721e, this.f35722f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yd.class == obj.getClass()) {
            yd ydVar = (yd) obj;
            if (this.f35721e == ydVar.f35721e && s82.a(this.f35719c, ydVar.f35719c) && s82.a(this.f35720d, ydVar.f35720d) && Arrays.equals(this.f35722f, ydVar.f35722f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f35721e + 527) * 31;
        String str = this.f35719c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f35720d;
        return Arrays.hashCode(this.f35722f) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.yandex.mobile.ads.impl.ei0
    public final String toString() {
        return this.f26869b + ": mimeType=" + this.f35719c + ", description=" + this.f35720d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f35719c);
        parcel.writeString(this.f35720d);
        parcel.writeInt(this.f35721e);
        parcel.writeByteArray(this.f35722f);
    }

    public yd(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f35719c = str;
        this.f35720d = str2;
        this.f35721e = i;
        this.f35722f = bArr;
    }
}
