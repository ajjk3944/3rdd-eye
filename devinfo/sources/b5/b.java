package b5;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new androidx.recyclerview.widget.i0(3);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1731a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1732b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1733c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1734d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1735e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1736f;
    public final int g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1737h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f1738i;
    public final int j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1739k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1740l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1741m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1742n;

    public b(a aVar) {
        int size = aVar.f1710c.size();
        this.f1731a = new int[size * 6];
        if (!aVar.f1715i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1732b = new ArrayList(size);
        this.f1733c = new int[size];
        this.f1734d = new int[size];
        int i4 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c1 c1Var = (c1) aVar.f1710c.get(i10);
            int i11 = i4 + 1;
            this.f1731a[i4] = c1Var.f1754a;
            ArrayList arrayList = this.f1732b;
            z zVar = c1Var.f1755b;
            arrayList.add(zVar != null ? zVar.f1934f : null);
            int[] iArr = this.f1731a;
            iArr[i11] = c1Var.f1756c ? 1 : 0;
            iArr[i4 + 2] = c1Var.f1757d;
            iArr[i4 + 3] = c1Var.f1758e;
            int i12 = i4 + 5;
            iArr[i4 + 4] = c1Var.f1759f;
            i4 += 6;
            iArr[i12] = c1Var.g;
            this.f1733c[i10] = c1Var.f1760h.ordinal();
            this.f1734d[i10] = c1Var.f1761i.ordinal();
        }
        this.f1735e = aVar.f1714h;
        this.f1736f = aVar.j;
        this.g = aVar.f1726u;
        this.f1737h = aVar.f1716k;
        this.f1738i = aVar.f1717l;
        this.j = aVar.f1718m;
        this.f1739k = aVar.f1719n;
        this.f1740l = aVar.f1720o;
        this.f1741m = aVar.f1721p;
        this.f1742n = aVar.f1722q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f1731a);
        parcel.writeStringList(this.f1732b);
        parcel.writeIntArray(this.f1733c);
        parcel.writeIntArray(this.f1734d);
        parcel.writeInt(this.f1735e);
        parcel.writeString(this.f1736f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.f1737h);
        TextUtils.writeToParcel(this.f1738i, parcel, 0);
        parcel.writeInt(this.j);
        TextUtils.writeToParcel(this.f1739k, parcel, 0);
        parcel.writeStringList(this.f1740l);
        parcel.writeStringList(this.f1741m);
        parcel.writeInt(this.f1742n ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f1731a = parcel.createIntArray();
        this.f1732b = parcel.createStringArrayList();
        this.f1733c = parcel.createIntArray();
        this.f1734d = parcel.createIntArray();
        this.f1735e = parcel.readInt();
        this.f1736f = parcel.readString();
        this.g = parcel.readInt();
        this.f1737h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1738i = (CharSequence) creator.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.f1739k = (CharSequence) creator.createFromParcel(parcel);
        this.f1740l = parcel.createStringArrayList();
        this.f1741m = parcel.createStringArrayList();
        this.f1742n = parcel.readInt() != 0;
    }
}
