package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.aw0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class yz0 implements Parcelable {
    public static final Parcelable.Creator<yz0> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final b[] f36115b;

    public class a implements Parcelable.Creator<yz0> {
        @Override // android.os.Parcelable.Creator
        public final yz0 createFromParcel(Parcel parcel) {
            return new yz0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final yz0[] newArray(int i) {
            return new yz0[i];
        }
    }

    public interface b extends Parcelable {
        dc0 a();

        void a(aw0.a aVar);

        byte[] b();
    }

    public yz0(Parcel parcel) {
        this.f36115b = new b[parcel.readInt()];
        int i = 0;
        while (true) {
            b[] bVarArr = this.f36115b;
            if (i >= bVarArr.length) {
                return;
            }
            bVarArr[i] = (b) parcel.readParcelable(b.class.getClassLoader());
            i++;
        }
    }

    public final yz0 a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new yz0((b[]) s82.a((Object[]) this.f36115b, (Object[]) bVarArr));
    }

    public final int c() {
        return this.f36115b.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yz0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f36115b, ((yz0) obj).f36115b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f36115b);
    }

    public final String toString() {
        return "entries=" + Arrays.toString(this.f36115b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f36115b.length);
        for (b bVar : this.f36115b) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public final yz0 a(yz0 yz0Var) {
        return yz0Var == null ? this : a(yz0Var.f36115b);
    }

    public final b a(int i) {
        return this.f36115b[i];
    }

    public yz0(List<? extends b> list) {
        this.f36115b = (b[]) list.toArray(new b[0]);
    }

    public yz0(b... bVarArr) {
        this.f36115b = bVarArr;
    }
}
