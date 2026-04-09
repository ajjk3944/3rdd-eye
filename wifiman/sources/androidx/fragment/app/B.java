package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.AbstractC4013k;

/* loaded from: classes.dex */
final class B implements Parcelable {
    public static final Parcelable.Creator<B> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final String f31166a;

    /* renamed from: b, reason: collision with root package name */
    final String f31167b;

    /* renamed from: c, reason: collision with root package name */
    final boolean f31168c;

    /* renamed from: d, reason: collision with root package name */
    final int f31169d;

    /* renamed from: e, reason: collision with root package name */
    final int f31170e;

    /* renamed from: f, reason: collision with root package name */
    final String f31171f;

    /* renamed from: g, reason: collision with root package name */
    final boolean f31172g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f31173h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f31174i;

    /* renamed from: j, reason: collision with root package name */
    final Bundle f31175j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f31176k;

    /* renamed from: l, reason: collision with root package name */
    final int f31177l;

    /* renamed from: m, reason: collision with root package name */
    Bundle f31178m;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public B createFromParcel(Parcel parcel) {
            return new B(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public B[] newArray(int i10) {
            return new B[i10];
        }
    }

    B(Fragment fragment) {
        this.f31166a = fragment.getClass().getName();
        this.f31167b = fragment.f31241f;
        this.f31168c = fragment.f31259o;
        this.f31169d = fragment.f31272x;
        this.f31170e = fragment.f31273y;
        this.f31171f = fragment.f31274z;
        this.f31172g = fragment.f31224C;
        this.f31173h = fragment.f31255m;
        this.f31174i = fragment.f31223B;
        this.f31175j = fragment.f31243g;
        this.f31176k = fragment.f31222A;
        this.f31177l = fragment.f31248i1.ordinal();
    }

    Fragment a(n nVar, ClassLoader classLoader) {
        Fragment fragmentA = nVar.a(classLoader, this.f31166a);
        Bundle bundle = this.f31175j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.v1(this.f31175j);
        fragmentA.f31241f = this.f31167b;
        fragmentA.f31259o = this.f31168c;
        fragmentA.f31263q = true;
        fragmentA.f31272x = this.f31169d;
        fragmentA.f31273y = this.f31170e;
        fragmentA.f31274z = this.f31171f;
        fragmentA.f31224C = this.f31172g;
        fragmentA.f31255m = this.f31173h;
        fragmentA.f31223B = this.f31174i;
        fragmentA.f31222A = this.f31176k;
        fragmentA.f31248i1 = AbstractC4013k.b.values()[this.f31177l];
        Bundle bundle2 = this.f31178m;
        if (bundle2 != null) {
            fragmentA.f31237b = bundle2;
        } else {
            fragmentA.f31237b = new Bundle();
        }
        return fragmentA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f31166a);
        sb2.append(" (");
        sb2.append(this.f31167b);
        sb2.append(")}:");
        if (this.f31168c) {
            sb2.append(" fromLayout");
        }
        if (this.f31170e != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f31170e));
        }
        String str = this.f31171f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f31171f);
        }
        if (this.f31172g) {
            sb2.append(" retainInstance");
        }
        if (this.f31173h) {
            sb2.append(" removing");
        }
        if (this.f31174i) {
            sb2.append(" detached");
        }
        if (this.f31176k) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f31166a);
        parcel.writeString(this.f31167b);
        parcel.writeInt(this.f31168c ? 1 : 0);
        parcel.writeInt(this.f31169d);
        parcel.writeInt(this.f31170e);
        parcel.writeString(this.f31171f);
        parcel.writeInt(this.f31172g ? 1 : 0);
        parcel.writeInt(this.f31173h ? 1 : 0);
        parcel.writeInt(this.f31174i ? 1 : 0);
        parcel.writeBundle(this.f31175j);
        parcel.writeInt(this.f31176k ? 1 : 0);
        parcel.writeBundle(this.f31178m);
        parcel.writeInt(this.f31177l);
    }

    B(Parcel parcel) {
        this.f31166a = parcel.readString();
        this.f31167b = parcel.readString();
        this.f31168c = parcel.readInt() != 0;
        this.f31169d = parcel.readInt();
        this.f31170e = parcel.readInt();
        this.f31171f = parcel.readString();
        this.f31172g = parcel.readInt() != 0;
        this.f31173h = parcel.readInt() != 0;
        this.f31174i = parcel.readInt() != 0;
        this.f31175j = parcel.readBundle();
        this.f31176k = parcel.readInt() != 0;
        this.f31178m = parcel.readBundle();
        this.f31177l = parcel.readInt();
    }
}
