package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import o4.o0;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new a(0);
    public final int B;
    public final int D;
    public final CharSequence E;
    public final int F;
    public final CharSequence G;
    public final ArrayList H;
    public final ArrayList I;
    public final boolean J;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1379a;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1380d;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1381g;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f1382r;

    /* renamed from: x, reason: collision with root package name */
    public final int f1383x;

    /* renamed from: y, reason: collision with root package name */
    public final String f1384y;

    public BackStackRecordState(o4.a aVar) {
        int size = aVar.f18758a.size();
        this.f1379a = new int[size * 6];
        if (!aVar.f18764g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1380d = new ArrayList(size);
        this.f1381g = new int[size];
        this.f1382r = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            o0 o0Var = (o0) aVar.f18758a.get(i11);
            int i12 = i10 + 1;
            this.f1379a[i10] = o0Var.f18826a;
            ArrayList arrayList = this.f1380d;
            b bVar = o0Var.f18827b;
            arrayList.add(bVar != null ? bVar.f1433y : null);
            int[] iArr = this.f1379a;
            iArr[i12] = o0Var.f18828c ? 1 : 0;
            iArr[i10 + 2] = o0Var.f18829d;
            iArr[i10 + 3] = o0Var.f18830e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = o0Var.f18831f;
            i10 += 6;
            iArr[i13] = o0Var.f18832g;
            this.f1381g[i11] = o0Var.f18833h.ordinal();
            this.f1382r[i11] = o0Var.f18834i.ordinal();
        }
        this.f1383x = aVar.f18763f;
        this.f1384y = aVar.f18765h;
        this.B = aVar.f18774s;
        this.D = aVar.f18766i;
        this.E = aVar.j;
        this.F = aVar.k;
        this.G = aVar.f18767l;
        this.H = aVar.f18768m;
        this.I = aVar.f18769n;
        this.J = aVar.f18770o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f1379a);
        parcel.writeStringList(this.f1380d);
        parcel.writeIntArray(this.f1381g);
        parcel.writeIntArray(this.f1382r);
        parcel.writeInt(this.f1383x);
        parcel.writeString(this.f1384y);
        parcel.writeInt(this.B);
        parcel.writeInt(this.D);
        TextUtils.writeToParcel(this.E, parcel, 0);
        parcel.writeInt(this.F);
        TextUtils.writeToParcel(this.G, parcel, 0);
        parcel.writeStringList(this.H);
        parcel.writeStringList(this.I);
        parcel.writeInt(this.J ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f1379a = parcel.createIntArray();
        this.f1380d = parcel.createStringArrayList();
        this.f1381g = parcel.createIntArray();
        this.f1382r = parcel.createIntArray();
        this.f1383x = parcel.readInt();
        this.f1384y = parcel.readString();
        this.B = parcel.readInt();
        this.D = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.E = (CharSequence) creator.createFromParcel(parcel);
        this.F = parcel.readInt();
        this.G = (CharSequence) creator.createFromParcel(parcel);
        this.H = parcel.createStringArrayList();
        this.I = parcel.createStringArrayList();
        this.J = parcel.readInt() != 0;
    }
}
