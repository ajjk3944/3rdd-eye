package h2;

import android.annotation.SuppressLint;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ParcelableRuntimeExtras.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class h implements Parcelable {
    public static final Parcelable.Creator<h> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public WorkerParameters.a f38169b;

    /* compiled from: ParcelableRuntimeExtras.java */
    public class a implements Parcelable.Creator<h> {
        @Override // android.os.Parcelable.Creator
        public final h createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            h hVar = new h();
            ClassLoader classLoader = h.class.getClassLoader();
            Network network = parcel.readInt() == 1 ? (Network) parcel.readParcelable(classLoader) : null;
            if (parcel.readInt() == 1) {
                Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
                arrayList = new ArrayList(parcelableArray.length);
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((Uri) parcelable);
                }
            } else {
                arrayList = null;
            }
            ArrayList<String> arrayListCreateStringArrayList = parcel.readInt() == 1 ? parcel.createStringArrayList() : null;
            WorkerParameters.a aVar = new WorkerParameters.a();
            hVar.f38169b = aVar;
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                aVar.f16864c = network;
            }
            if (i >= 24) {
                if (arrayList != null) {
                    aVar.f16863b = arrayList;
                }
                if (arrayListCreateStringArrayList != null) {
                    aVar.f16862a = arrayListCreateStringArrayList;
                }
            }
            return hVar;
        }

        @Override // android.os.Parcelable.Creator
        public final h[] newArray(int i) {
            return new h[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @SuppressLint({"NewApi"})
    public final void writeToParcel(Parcel parcel, int i) {
        List<String> list;
        int i10 = Build.VERSION.SDK_INT;
        WorkerParameters.a aVar = this.f38169b;
        List<Uri> list2 = null;
        Network network = i10 >= 28 ? aVar.f16864c : null;
        int i11 = 0;
        int i12 = network != null ? 1 : 0;
        parcel.writeInt(i12);
        if (i12 != 0) {
            parcel.writeParcelable(b.a(network), i);
        }
        if (i10 >= 24) {
            list2 = aVar.f16863b;
            list = aVar.f16862a;
        } else {
            list = null;
        }
        int i13 = (list2 == null || list2.isEmpty()) ? 0 : 1;
        parcel.writeInt(i13);
        if (i13 != 0) {
            int size = list2.size();
            Uri[] uriArr = new Uri[size];
            for (int i14 = 0; i14 < size; i14++) {
                uriArr[i14] = list2.get(i14);
            }
            parcel.writeParcelableArray(uriArr, i);
        }
        if (list != null && !list.isEmpty()) {
            i11 = 1;
        }
        parcel.writeInt(i11);
        if (i11 != 0) {
            parcel.writeStringList(list);
        }
    }

    /* compiled from: ParcelableRuntimeExtras.java */
    public static class b {
        public static Parcelable a(Network network) {
            return network;
        }
    }
}
