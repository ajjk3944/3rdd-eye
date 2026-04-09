package h2;

import T1.D;
import T1.s;
import T1.z;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.work.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ParcelableWorkContinuationImpl.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class j implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public b f38173b;

    /* renamed from: c, reason: collision with root package name */
    public static final androidx.work.g[] f38172c = androidx.work.g.values();
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* compiled from: ParcelableWorkContinuationImpl.java */
    public class a implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        public final j createFromParcel(Parcel parcel) {
            j jVar = new j();
            ArrayList arrayList = null;
            String string = parcel.readInt() == 1 ? parcel.readString() : null;
            androidx.work.g gVar = j.f38172c[parcel.readInt()];
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            ClassLoader classLoader = j.class.getClassLoader();
            for (int i10 = 0; i10 < i; i10++) {
                arrayList2.add((D) ((n) parcel.readParcelable(classLoader)).f38182b);
            }
            if (parcel.readInt() == 1) {
                int i11 = parcel.readInt();
                arrayList = new ArrayList(i11);
                for (int i12 = 0; i12 < i11; i12++) {
                    arrayList.add(((j) parcel.readParcelable(classLoader)).f38173b);
                }
            }
            jVar.f38173b = new b(string, gVar, arrayList2, arrayList);
            return jVar;
        }

        @Override // android.os.Parcelable.Creator
        public final j[] newArray(int i) {
            return new j[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        b bVar = this.f38173b;
        String str = bVar.f38174a;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        parcel.writeInt(!zIsEmpty ? 1 : 0);
        if (!zIsEmpty) {
            parcel.writeString(str);
        }
        parcel.writeInt(bVar.f38175b.ordinal());
        List<? extends w> list = bVar.f38176c;
        parcel.writeInt(list.size());
        if (!list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                parcel.writeParcelable(new n(list.get(i10)), i);
            }
        }
        ArrayList arrayList = bVar.f38177d;
        int i11 = (arrayList == null || arrayList.isEmpty()) ? 0 : 1;
        parcel.writeInt(i11);
        if (i11 != 0) {
            parcel.writeInt(arrayList.size());
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                b bVar2 = (b) arrayList.get(i12);
                j jVar = new j();
                jVar.f38173b = bVar2;
                parcel.writeParcelable(jVar, i);
            }
        }
    }

    /* compiled from: ParcelableWorkContinuationImpl.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f38174a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.work.g f38175b;

        /* renamed from: c, reason: collision with root package name */
        public final List<? extends w> f38176c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f38177d;

        public b(s sVar) {
            this.f38174a = sVar.f12213c;
            this.f38175b = sVar.f12214d;
            this.f38176c = sVar.f12215e;
            this.f38177d = null;
            List<s> list = sVar.f12218h;
            if (list != null) {
                this.f38177d = new ArrayList(list.size());
                Iterator<s> it = list.iterator();
                while (it.hasNext()) {
                    this.f38177d.add(new b(it.next()));
                }
            }
        }

        public static ArrayList a(z zVar, ArrayList arrayList) {
            if (arrayList == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                arrayList2.add(new s(zVar, bVar.f38174a, bVar.f38175b, bVar.f38176c, a(zVar, bVar.f38177d)));
            }
            return arrayList2;
        }

        public b(String str, androidx.work.g gVar, ArrayList arrayList, ArrayList arrayList2) {
            this.f38174a = str;
            this.f38175b = gVar;
            this.f38176c = arrayList;
            this.f38177d = arrayList2;
        }
    }
}
