package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class a40 implements Comparator<b>, Parcelable {
    public static final Parcelable.Creator<a40> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final b[] f24429b;

    /* renamed from: c, reason: collision with root package name */
    private int f24430c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24431d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24432e;

    public class a implements Parcelable.Creator<a40> {
        @Override // android.os.Parcelable.Creator
        public final a40 createFromParcel(Parcel parcel) {
            return new a40(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final a40[] newArray(int i) {
            return new a40[i];
        }
    }

    public a40(Parcel parcel) {
        this.f24431d = parcel.readString();
        b[] bVarArr = (b[]) s82.a((b[]) parcel.createTypedArray(b.CREATOR));
        this.f24429b = bVarArr;
        this.f24432e = bVarArr.length;
    }

    public final a40 a(String str) {
        return s82.a(this.f24431d, str) ? this : new a40(str, false, this.f24429b);
    }

    @Override // java.util.Comparator
    public final int compare(b bVar, b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        UUID uuid = lm.f30038a;
        return uuid.equals(bVar3.f24434c) ? uuid.equals(bVar4.f24434c) ? 0 : 1 : bVar3.f24434c.compareTo(bVar4.f24434c);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a40.class == obj.getClass()) {
            a40 a40Var = (a40) obj;
            if (s82.a(this.f24431d, a40Var.f24431d) && Arrays.equals(this.f24429b, a40Var.f24429b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f24430c == 0) {
            String str = this.f24431d;
            this.f24430c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f24429b);
        }
        return this.f24430c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f24431d);
        parcel.writeTypedArray(this.f24429b, 0);
    }

    public final b a(int i) {
        return this.f24429b[i];
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private int f24433b;

        /* renamed from: c, reason: collision with root package name */
        public final UUID f24434c;

        /* renamed from: d, reason: collision with root package name */
        public final String f24435d;

        /* renamed from: e, reason: collision with root package name */
        public final String f24436e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f24437f;

        public class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b(Parcel parcel) {
            this.f24434c = new UUID(parcel.readLong(), parcel.readLong());
            this.f24435d = parcel.readString();
            this.f24436e = (String) s82.a(parcel.readString());
            this.f24437f = parcel.createByteArray();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            return s82.a(this.f24435d, bVar.f24435d) && s82.a(this.f24436e, bVar.f24436e) && s82.a(this.f24434c, bVar.f24434c) && Arrays.equals(this.f24437f, bVar.f24437f);
        }

        public final int hashCode() {
            if (this.f24433b == 0) {
                int iHashCode = this.f24434c.hashCode() * 31;
                String str = this.f24435d;
                this.f24433b = Arrays.hashCode(this.f24437f) + C4121h3.a(this.f24436e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            }
            return this.f24433b;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f24434c.getMostSignificantBits());
            parcel.writeLong(this.f24434c.getLeastSignificantBits());
            parcel.writeString(this.f24435d);
            parcel.writeString(this.f24436e);
            parcel.writeByteArray(this.f24437f);
        }

        public b(UUID uuid, String str, String str2, byte[] bArr) {
            this.f24434c = (UUID) zf.a(uuid);
            this.f24435d = str;
            this.f24436e = (String) zf.a(str2);
            this.f24437f = bArr;
        }
    }

    private a40(String str, boolean z10, b... bVarArr) {
        this.f24431d = str;
        bVarArr = z10 ? (b[]) bVarArr.clone() : bVarArr;
        this.f24429b = bVarArr;
        this.f24432e = bVarArr.length;
        Arrays.sort(bVarArr, this);
    }

    public a40(ArrayList arrayList) {
        this(null, false, (b[]) arrayList.toArray(new b[0]));
    }

    public a40(b... bVarArr) {
        this(null, true, bVarArr);
    }
}
