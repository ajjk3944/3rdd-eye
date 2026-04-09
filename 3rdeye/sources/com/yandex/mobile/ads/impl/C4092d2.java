package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.yandex.mobile.ads.impl.d2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4092d2 implements Parcelable {
    public static final Parcelable.Creator<C4092d2> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final String f25929b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25930c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25931d;

    /* renamed from: com.yandex.mobile.ads.impl.d2$a */
    public static final class a implements Parcelable.Creator<C4092d2> {
        @Override // android.os.Parcelable.Creator
        public final C4092d2 createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.l.f(parcel, "parcel");
            return new C4092d2(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final C4092d2[] newArray(int i) {
            return new C4092d2[i];
        }
    }

    public C4092d2(String str, String str2, String str3) {
        this.f25929b = str;
        this.f25930c = str2;
        this.f25931d = str3;
    }

    public final String c() {
        return this.f25930c;
    }

    public final String d() {
        return this.f25929b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f25931d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        kotlin.jvm.internal.l.f(out, "out");
        out.writeString(this.f25929b);
        out.writeString(this.f25930c);
        out.writeString(this.f25931d);
    }
}
