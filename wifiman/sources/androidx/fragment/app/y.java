package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.w;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    ArrayList f31543a;

    /* renamed from: b, reason: collision with root package name */
    ArrayList f31544b;

    /* renamed from: c, reason: collision with root package name */
    C3991b[] f31545c;

    /* renamed from: d, reason: collision with root package name */
    int f31546d;

    /* renamed from: e, reason: collision with root package name */
    String f31547e;

    /* renamed from: f, reason: collision with root package name */
    ArrayList f31548f;

    /* renamed from: g, reason: collision with root package name */
    ArrayList f31549g;

    /* renamed from: h, reason: collision with root package name */
    ArrayList f31550h;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y createFromParcel(Parcel parcel) {
            return new y(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y[] newArray(int i10) {
            return new y[i10];
        }
    }

    public y() {
        this.f31547e = null;
        this.f31548f = new ArrayList();
        this.f31549g = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringList(this.f31543a);
        parcel.writeStringList(this.f31544b);
        parcel.writeTypedArray(this.f31545c, i10);
        parcel.writeInt(this.f31546d);
        parcel.writeString(this.f31547e);
        parcel.writeStringList(this.f31548f);
        parcel.writeTypedList(this.f31549g);
        parcel.writeTypedList(this.f31550h);
    }

    public y(Parcel parcel) {
        this.f31547e = null;
        this.f31548f = new ArrayList();
        this.f31549g = new ArrayList();
        this.f31543a = parcel.createStringArrayList();
        this.f31544b = parcel.createStringArrayList();
        this.f31545c = (C3991b[]) parcel.createTypedArray(C3991b.CREATOR);
        this.f31546d = parcel.readInt();
        this.f31547e = parcel.readString();
        this.f31548f = parcel.createStringArrayList();
        this.f31549g = parcel.createTypedArrayList(C3992c.CREATOR);
        this.f31550h = parcel.createTypedArrayList(w.k.CREATOR);
    }
}
