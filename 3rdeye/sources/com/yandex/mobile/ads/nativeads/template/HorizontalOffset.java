package com.yandex.mobile.ads.nativeads.template;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.x91;
import kotlin.jvm.internal.l;

/* loaded from: classes3.dex */
public final class HorizontalOffset implements x91, Parcelable {
    public static final Parcelable.Creator<HorizontalOffset> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    private final float f36869b;

    /* renamed from: c, reason: collision with root package name */
    private final float f36870c;

    public static final class a implements Parcelable.Creator<HorizontalOffset> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset createFromParcel(Parcel parcel) {
            l.f(parcel, "parcel");
            return new HorizontalOffset(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalOffset[] newArray(int i) {
            return new HorizontalOffset[i];
        }
    }

    public HorizontalOffset(float f10, float f11) {
        this.f36869b = f10;
        this.f36870c = f11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!HorizontalOffset.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        l.d(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.HorizontalOffset");
        HorizontalOffset horizontalOffset = (HorizontalOffset) obj;
        return getLeft() == horizontalOffset.getLeft() && getRight() == horizontalOffset.getRight();
    }

    @Override // com.yandex.mobile.ads.impl.x91
    public float getLeft() {
        return this.f36869b;
    }

    @Override // com.yandex.mobile.ads.impl.x91
    public float getRight() {
        return this.f36870c;
    }

    public int hashCode() {
        return Float.floatToIntBits(getRight()) + (Float.floatToIntBits(getLeft()) * 31);
    }

    public String toString() {
        return getLeft() + ", " + getRight();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        l.f(out, "out");
        out.writeFloat(this.f36869b);
        out.writeFloat(this.f36870c);
    }
}
