package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.n;
import androidx.lifecycle.d;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    final int[] f1581b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<String> f1582c;

    /* renamed from: d, reason: collision with root package name */
    final int[] f1583d;

    /* renamed from: e, reason: collision with root package name */
    final int[] f1584e;

    /* renamed from: f, reason: collision with root package name */
    final int f1585f;

    /* renamed from: g, reason: collision with root package name */
    final int f1586g;

    /* renamed from: h, reason: collision with root package name */
    final String f1587h;

    /* renamed from: i, reason: collision with root package name */
    final int f1588i;

    /* renamed from: j, reason: collision with root package name */
    final int f1589j;

    /* renamed from: k, reason: collision with root package name */
    final CharSequence f1590k;

    /* renamed from: l, reason: collision with root package name */
    final int f1591l;

    /* renamed from: m, reason: collision with root package name */
    final CharSequence f1592m;

    /* renamed from: n, reason: collision with root package name */
    final ArrayList<String> f1593n;

    /* renamed from: o, reason: collision with root package name */
    final ArrayList<String> f1594o;

    /* renamed from: p, reason: collision with root package name */
    final boolean f1595p;

    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i2) {
            return new b[i2];
        }
    }

    public b(Parcel parcel) {
        this.f1581b = parcel.createIntArray();
        this.f1582c = parcel.createStringArrayList();
        this.f1583d = parcel.createIntArray();
        this.f1584e = parcel.createIntArray();
        this.f1585f = parcel.readInt();
        this.f1586g = parcel.readInt();
        this.f1587h = parcel.readString();
        this.f1588i = parcel.readInt();
        this.f1589j = parcel.readInt();
        this.f1590k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1591l = parcel.readInt();
        this.f1592m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1593n = parcel.createStringArrayList();
        this.f1594o = parcel.createStringArrayList();
        this.f1595p = parcel.readInt() != 0;
    }

    public b(androidx.fragment.app.a aVar) {
        int size = aVar.f1697a.size();
        this.f1581b = new int[size * 5];
        if (!aVar.f1704h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1582c = new ArrayList<>(size);
        this.f1583d = new int[size];
        this.f1584e = new int[size];
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            n.a aVar2 = aVar.f1697a.get(i2);
            int i4 = i3 + 1;
            this.f1581b[i3] = aVar2.f1715a;
            ArrayList<String> arrayList = this.f1582c;
            Fragment fragment = aVar2.f1716b;
            arrayList.add(fragment != null ? fragment.f1534f : null);
            int[] iArr = this.f1581b;
            int i5 = i4 + 1;
            iArr[i4] = aVar2.f1717c;
            int i6 = i5 + 1;
            iArr[i5] = aVar2.f1718d;
            int i7 = i6 + 1;
            iArr[i6] = aVar2.f1719e;
            iArr[i7] = aVar2.f1720f;
            this.f1583d[i2] = aVar2.f1721g.ordinal();
            this.f1584e[i2] = aVar2.f1722h.ordinal();
            i2++;
            i3 = i7 + 1;
        }
        this.f1585f = aVar.f1702f;
        this.f1586g = aVar.f1703g;
        this.f1587h = aVar.f1706j;
        this.f1588i = aVar.f1580u;
        this.f1589j = aVar.f1707k;
        this.f1590k = aVar.f1708l;
        this.f1591l = aVar.f1709m;
        this.f1592m = aVar.f1710n;
        this.f1593n = aVar.f1711o;
        this.f1594o = aVar.f1712p;
        this.f1595p = aVar.f1713q;
    }

    public androidx.fragment.app.a a(i iVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(iVar);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f1581b.length) {
            n.a aVar2 = new n.a();
            int i4 = i2 + 1;
            aVar2.f1715a = this.f1581b[i2];
            if (i.I) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i3 + " base fragment #" + this.f1581b[i4]);
            }
            String str = this.f1582c.get(i3);
            aVar2.f1716b = str != null ? iVar.f1620h.get(str) : null;
            aVar2.f1721g = d.b.values()[this.f1583d[i3]];
            aVar2.f1722h = d.b.values()[this.f1584e[i3]];
            int[] iArr = this.f1581b;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            aVar2.f1717c = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar2.f1718d = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar2.f1719e = i10;
            int i11 = iArr[i9];
            aVar2.f1720f = i11;
            aVar.f1698b = i6;
            aVar.f1699c = i8;
            aVar.f1700d = i10;
            aVar.f1701e = i11;
            aVar.c(aVar2);
            i3++;
            i2 = i9 + 1;
        }
        aVar.f1702f = this.f1585f;
        aVar.f1703g = this.f1586g;
        aVar.f1706j = this.f1587h;
        aVar.f1580u = this.f1588i;
        aVar.f1704h = true;
        aVar.f1707k = this.f1589j;
        aVar.f1708l = this.f1590k;
        aVar.f1709m = this.f1591l;
        aVar.f1710n = this.f1592m;
        aVar.f1711o = this.f1593n;
        aVar.f1712p = this.f1594o;
        aVar.f1713q = this.f1595p;
        aVar.j(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1581b);
        parcel.writeStringList(this.f1582c);
        parcel.writeIntArray(this.f1583d);
        parcel.writeIntArray(this.f1584e);
        parcel.writeInt(this.f1585f);
        parcel.writeInt(this.f1586g);
        parcel.writeString(this.f1587h);
        parcel.writeInt(this.f1588i);
        parcel.writeInt(this.f1589j);
        TextUtils.writeToParcel(this.f1590k, parcel, 0);
        parcel.writeInt(this.f1591l);
        TextUtils.writeToParcel(this.f1592m, parcel, 0);
        parcel.writeStringList(this.f1593n);
        parcel.writeStringList(this.f1594o);
        parcel.writeInt(this.f1595p ? 1 : 0);
    }
}
