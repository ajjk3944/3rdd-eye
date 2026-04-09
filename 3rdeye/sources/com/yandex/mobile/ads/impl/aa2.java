package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class aa2 implements Parcelable {
    public static final Parcelable.Creator<aa2> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final b f24583b;

    /* renamed from: c, reason: collision with root package name */
    private final float f24584c;

    public static final class a implements Parcelable.Creator<aa2> {
        @Override // android.os.Parcelable.Creator
        public final aa2 createFromParcel(Parcel source) {
            kotlin.jvm.internal.l.f(source, "source");
            return new aa2(source.readInt() == -1 ? null : b.values()[source.readInt()], source.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final aa2[] newArray(int i) {
            return new aa2[i];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f24585b;

        /* renamed from: c, reason: collision with root package name */
        public static final b f24586c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f24587d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f24588e;

        static {
            b bVar = new b(0, "MILLISECONDS");
            f24585b = bVar;
            b bVar2 = new b(1, "PERCENTS");
            f24586c = bVar2;
            b bVar3 = new b(2, "POSITION");
            f24587d = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            f24588e = bVarArr;
            com.google.gson.internal.c.l(bVarArr);
        }

        private b(int i, String str) {
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f24588e.clone();
        }
    }

    public aa2(b bVar, float f10) {
        this.f24583b = bVar;
        this.f24584c = f10;
    }

    public final b c() {
        return this.f24583b;
    }

    public final float d() {
        return this.f24584c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        kotlin.jvm.internal.l.f(dest, "dest");
        b bVar = this.f24583b;
        dest.writeInt(bVar != null ? bVar.ordinal() : -1);
        dest.writeFloat(this.f24584c);
    }
}
