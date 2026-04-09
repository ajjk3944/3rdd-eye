package h2;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.t;
import androidx.work.v;
import b2.C1819F;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: ParcelableWorkQuery.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class m implements Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final v f38181b;

    /* compiled from: ParcelableWorkQuery.java */
    public class a implements Parcelable.Creator<m> {
        @Override // android.os.Parcelable.Creator
        public final m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final m[] newArray(int i) {
            return new m[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public m(Parcel parcel) {
        ?? arrayList = Collections.EMPTY_LIST;
        int i = parcel.readInt();
        if (i > 0) {
            arrayList = new ArrayList(i);
            for (int i10 = 0; i10 < i; i10++) {
                arrayList.add(UUID.fromString(parcel.readString()));
            }
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
        ?? arrayList2 = Collections.EMPTY_LIST;
        int i11 = parcel.readInt();
        if (i11 > 0) {
            arrayList2 = new ArrayList(i11);
            for (int i12 = 0; i12 < i11; i12++) {
                arrayList2.add(C1819F.f(parcel.readInt()));
            }
        }
        v.a aVar = new v.a();
        ArrayList arrayList3 = new ArrayList();
        aVar.f17038a = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        aVar.f17039b = arrayList4;
        ArrayList arrayList5 = new ArrayList();
        aVar.f17040c = arrayList5;
        ArrayList arrayList6 = new ArrayList();
        aVar.f17041d = arrayList6;
        arrayList3.addAll(arrayList);
        arrayList4.addAll(arrayListCreateStringArrayList);
        arrayList5.addAll(arrayListCreateStringArrayList2);
        arrayList6.addAll(arrayList2);
        if (arrayList3.isEmpty() && arrayList4.isEmpty() && arrayList5.isEmpty() && arrayList6.isEmpty()) {
            throw new IllegalArgumentException("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
        }
        this.f38181b = new v(aVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        v vVar = this.f38181b;
        ArrayList arrayList = vVar.f17034a;
        parcel.writeInt(arrayList.size());
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeString(((UUID) it.next()).toString());
            }
        }
        parcel.writeStringList(vVar.f17035b);
        parcel.writeStringList(vVar.f17036c);
        ArrayList arrayList2 = vVar.f17037d;
        parcel.writeInt(arrayList2.size());
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(C1819F.j((t.b) it2.next()));
        }
    }
}
