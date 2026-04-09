package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.x;
import java.util.ArrayList;

/* compiled from: FragmentManagerState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class A implements Parcelable {
    public static final Parcelable.Creator<A> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<String> f15742b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<String> f15743c;

    /* renamed from: d, reason: collision with root package name */
    public C1749b[] f15744d;

    /* renamed from: e, reason: collision with root package name */
    public int f15745e;

    /* renamed from: f, reason: collision with root package name */
    public String f15746f = null;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList<String> f15747g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList<C1750c> f15748h = new ArrayList<>();
    public ArrayList<x.l> i;

    /* compiled from: FragmentManagerState.java */
    public class a implements Parcelable.Creator<A> {
        @Override // android.os.Parcelable.Creator
        public final A createFromParcel(Parcel parcel) {
            A a10 = new A();
            a10.f15746f = null;
            a10.f15747g = new ArrayList<>();
            a10.f15748h = new ArrayList<>();
            a10.f15742b = parcel.createStringArrayList();
            a10.f15743c = parcel.createStringArrayList();
            a10.f15744d = (C1749b[]) parcel.createTypedArray(C1749b.CREATOR);
            a10.f15745e = parcel.readInt();
            a10.f15746f = parcel.readString();
            a10.f15747g = parcel.createStringArrayList();
            a10.f15748h = parcel.createTypedArrayList(C1750c.CREATOR);
            a10.i = parcel.createTypedArrayList(x.l.CREATOR);
            return a10;
        }

        @Override // android.os.Parcelable.Creator
        public final A[] newArray(int i) {
            return new A[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f15742b);
        parcel.writeStringList(this.f15743c);
        parcel.writeTypedArray(this.f15744d, i);
        parcel.writeInt(this.f15745e);
        parcel.writeString(this.f15746f);
        parcel.writeStringList(this.f15747g);
        parcel.writeTypedList(this.f15748h);
        parcel.writeTypedList(this.i);
    }
}
