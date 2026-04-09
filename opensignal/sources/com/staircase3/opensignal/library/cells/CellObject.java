package com.staircase3.opensignal.library.cells;

import android.os.Parcel;
import android.os.Parcelable;
import com.staircase3.opensignal.utils.j;
import i6.a;

/* loaded from: classes.dex */
public class CellObject implements Parcelable {
    public static final Parcelable.Creator<CellObject> CREATOR = new a(18);
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public int f6121a;

    /* renamed from: d, reason: collision with root package name */
    public int f6122d;

    /* renamed from: g, reason: collision with root package name */
    public int f6123g;

    /* renamed from: r, reason: collision with root package name */
    public String f6124r;

    /* renamed from: x, reason: collision with root package name */
    public boolean f6125x;

    /* renamed from: y, reason: collision with root package name */
    public j f6126y;

    public CellObject(boolean z10) {
        this.f6121a = -1;
        this.f6122d = -1;
        this.f6123g = -1;
    }

    public int d() {
        return this.f6121a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public int e() {
        return this.f6122d;
    }

    public double f() {
        if (this.f6126y == null) {
            return 0.0d;
        }
        return r0.f6185a / 1000000.0f;
    }

    public double g() {
        if (this.f6126y == null) {
            return 0.0d;
        }
        return r0.f6186b / 1000000.0f;
    }

    public int h() {
        return this.f6123g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(e());
        parcel.writeInt(d());
        parcel.writeByte(this.f6125x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.B ? (byte) 1 : (byte) 0);
        parcel.writeFloat((float) f());
        parcel.writeFloat((float) g());
        parcel.writeString(this.f6124r);
        parcel.writeInt(this.f6123g);
    }

    public CellObject() {
        this(false);
        this.f6124r = "- ";
        this.f6125x = true;
        this.B = false;
    }
}
