package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.lifecycle.d;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final String f1683b;

    /* renamed from: c, reason: collision with root package name */
    final String f1684c;

    /* renamed from: d, reason: collision with root package name */
    final boolean f1685d;

    /* renamed from: e, reason: collision with root package name */
    final int f1686e;

    /* renamed from: f, reason: collision with root package name */
    final int f1687f;

    /* renamed from: g, reason: collision with root package name */
    final String f1688g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f1689h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f1690i;

    /* renamed from: j, reason: collision with root package name */
    final boolean f1691j;

    /* renamed from: k, reason: collision with root package name */
    final Bundle f1692k;

    /* renamed from: l, reason: collision with root package name */
    final boolean f1693l;

    /* renamed from: m, reason: collision with root package name */
    final int f1694m;

    /* renamed from: n, reason: collision with root package name */
    Bundle f1695n;

    /* renamed from: o, reason: collision with root package name */
    Fragment f1696o;

    static class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i2) {
            return new m[i2];
        }
    }

    m(Parcel parcel) {
        this.f1683b = parcel.readString();
        this.f1684c = parcel.readString();
        this.f1685d = parcel.readInt() != 0;
        this.f1686e = parcel.readInt();
        this.f1687f = parcel.readInt();
        this.f1688g = parcel.readString();
        this.f1689h = parcel.readInt() != 0;
        this.f1690i = parcel.readInt() != 0;
        this.f1691j = parcel.readInt() != 0;
        this.f1692k = parcel.readBundle();
        this.f1693l = parcel.readInt() != 0;
        this.f1695n = parcel.readBundle();
        this.f1694m = parcel.readInt();
    }

    m(Fragment fragment) {
        this.f1683b = fragment.getClass().getName();
        this.f1684c = fragment.f1534f;
        this.f1685d = fragment.f1542n;
        this.f1686e = fragment.f1551w;
        this.f1687f = fragment.f1552x;
        this.f1688g = fragment.f1553y;
        this.f1689h = fragment.B;
        this.f1690i = fragment.f1541m;
        this.f1691j = fragment.A;
        this.f1692k = fragment.f1535g;
        this.f1693l = fragment.f1554z;
        this.f1694m = fragment.S.ordinal();
    }

    public Fragment a(ClassLoader classLoader, f fVar) {
        Fragment fragment;
        Bundle bundle;
        if (this.f1696o == null) {
            Bundle bundle2 = this.f1692k;
            if (bundle2 != null) {
                bundle2.setClassLoader(classLoader);
            }
            Fragment fragmentA = fVar.a(classLoader, this.f1683b);
            this.f1696o = fragmentA;
            fragmentA.f1(this.f1692k);
            Bundle bundle3 = this.f1695n;
            if (bundle3 != null) {
                bundle3.setClassLoader(classLoader);
                fragment = this.f1696o;
                bundle = this.f1695n;
            } else {
                fragment = this.f1696o;
                bundle = new Bundle();
            }
            fragment.f1531c = bundle;
            Fragment fragment2 = this.f1696o;
            fragment2.f1534f = this.f1684c;
            fragment2.f1542n = this.f1685d;
            fragment2.f1544p = true;
            fragment2.f1551w = this.f1686e;
            fragment2.f1552x = this.f1687f;
            fragment2.f1553y = this.f1688g;
            fragment2.B = this.f1689h;
            fragment2.f1541m = this.f1690i;
            fragment2.A = this.f1691j;
            fragment2.f1554z = this.f1693l;
            fragment2.S = d.b.values()[this.f1694m];
            if (i.I) {
                Log.v("FragmentManager", "Instantiated fragment " + this.f1696o);
            }
        }
        return this.f1696o;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1683b);
        sb.append(" (");
        sb.append(this.f1684c);
        sb.append(")}:");
        if (this.f1685d) {
            sb.append(" fromLayout");
        }
        if (this.f1687f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1687f));
        }
        String str = this.f1688g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f1688g);
        }
        if (this.f1689h) {
            sb.append(" retainInstance");
        }
        if (this.f1690i) {
            sb.append(" removing");
        }
        if (this.f1691j) {
            sb.append(" detached");
        }
        if (this.f1693l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1683b);
        parcel.writeString(this.f1684c);
        parcel.writeInt(this.f1685d ? 1 : 0);
        parcel.writeInt(this.f1686e);
        parcel.writeInt(this.f1687f);
        parcel.writeString(this.f1688g);
        parcel.writeInt(this.f1689h ? 1 : 0);
        parcel.writeInt(this.f1690i ? 1 : 0);
        parcel.writeInt(this.f1691j ? 1 : 0);
        parcel.writeBundle(this.f1692k);
        parcel.writeInt(this.f1693l ? 1 : 0);
        parcel.writeBundle(this.f1695n);
        parcel.writeInt(this.f1694m);
    }
}
