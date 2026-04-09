package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class cl extends ei0 {
    public static final Parcelable.Creator<cl> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f25694c;

    public class a implements Parcelable.Creator<cl> {
        @Override // android.os.Parcelable.Creator
        public final cl createFromParcel(Parcel parcel) {
            return new cl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final cl[] newArray(int i) {
            return new cl[i];
        }
    }

    public cl(Parcel parcel) {
        super((String) s82.a(parcel.readString()));
        this.f25694c = (byte[]) s82.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cl.class == obj.getClass()) {
            cl clVar = (cl) obj;
            if (this.f26869b.equals(clVar.f26869b) && Arrays.equals(this.f25694c, clVar.f25694c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25694c) + C4121h3.a(this.f26869b, 527, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f26869b);
        parcel.writeByteArray(this.f25694c);
    }

    public cl(String str, byte[] bArr) {
        super(str);
        this.f25694c = bArr;
    }
}
