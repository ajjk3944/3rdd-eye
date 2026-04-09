package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final b f37962a;

    /* renamed from: b, reason: collision with root package name */
    private final b f37963b;

    /* renamed from: c, reason: collision with root package name */
    final int f37964c;

    /* renamed from: d, reason: collision with root package name */
    int f37965d;

    /* renamed from: e, reason: collision with root package name */
    int f37966e;

    /* renamed from: f, reason: collision with root package name */
    int f37967f;

    /* renamed from: g, reason: collision with root package name */
    int f37968g;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        this.f37965d = i10;
        this.f37966e = i11;
        this.f37967f = i12;
        this.f37964c = i13;
        this.f37968g = c(i10);
        this.f37962a = new b(59);
        this.f37963b = new b(i13 == 1 ? 23 : 12);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f37965d == eVar.f37965d && this.f37966e == eVar.f37966e && this.f37964c == eVar.f37964c && this.f37967f == eVar.f37967f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f37964c), Integer.valueOf(this.f37965d), Integer.valueOf(this.f37966e), Integer.valueOf(this.f37967f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f37965d);
        parcel.writeInt(this.f37966e);
        parcel.writeInt(this.f37967f);
        parcel.writeInt(this.f37964c);
    }

    protected e(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
