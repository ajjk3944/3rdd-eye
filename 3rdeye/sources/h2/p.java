package h2;

import android.annotation.SuppressLint;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;
import g0.C4356c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

/* compiled from: ParcelableWorkerParameters.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class p implements Parcelable {
    public static final Parcelable.Creator<p> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final UUID f38184b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.work.e f38185c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f38186d;

    /* renamed from: e, reason: collision with root package name */
    public final WorkerParameters.a f38187e;

    /* renamed from: f, reason: collision with root package name */
    public final int f38188f;

    /* renamed from: g, reason: collision with root package name */
    public final int f38189g;

    /* compiled from: ParcelableWorkerParameters.java */
    public class a implements Parcelable.Creator<p> {
        @Override // android.os.Parcelable.Creator
        public final p createFromParcel(Parcel parcel) {
            return new p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final p[] newArray(int i) {
            return new p[i];
        }
    }

    public p(WorkerParameters workerParameters) {
        this.f38184b = workerParameters.f16852a;
        this.f38185c = workerParameters.f16853b;
        this.f38186d = workerParameters.f16854c;
        this.f38187e = workerParameters.f16855d;
        this.f38188f = workerParameters.f16856e;
        this.f38189g = workerParameters.f16861k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f38184b.toString());
        new C4409c(this.f38185c).writeToParcel(parcel, i);
        parcel.writeStringList(new ArrayList(this.f38186d));
        h hVar = new h();
        hVar.f38169b = this.f38187e;
        hVar.writeToParcel(parcel, i);
        parcel.writeInt(this.f38188f);
        parcel.writeInt(this.f38189g);
    }

    public p(Parcel parcel) {
        ArrayList arrayList;
        this.f38184b = UUID.fromString(parcel.readString());
        HashMap map = new HashMap();
        int i = parcel.readInt();
        int i10 = 0;
        while (true) {
            Object objValueOf = null;
            if (i10 < i) {
                byte b10 = parcel.readByte();
                switch (b10) {
                    case 0:
                        break;
                    case 1:
                        objValueOf = Boolean.valueOf(parcel.readInt() == 1);
                        break;
                    case 2:
                        objValueOf = Byte.valueOf(parcel.readByte());
                        break;
                    case 3:
                        objValueOf = Integer.valueOf(parcel.readInt());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(parcel.readLong());
                        break;
                    case 5:
                        objValueOf = Float.valueOf(parcel.readFloat());
                        break;
                    case 6:
                        objValueOf = Double.valueOf(parcel.readDouble());
                        break;
                    case 7:
                        objValueOf = parcel.readString();
                        break;
                    case 8:
                        objValueOf = androidx.work.e.a(parcel.createBooleanArray());
                        break;
                    case 9:
                        objValueOf = androidx.work.e.b(parcel.createByteArray());
                        break;
                    case 10:
                        objValueOf = androidx.work.e.e(parcel.createIntArray());
                        break;
                    case 11:
                        objValueOf = androidx.work.e.f(parcel.createLongArray());
                        break;
                    case 12:
                        objValueOf = androidx.work.e.d(parcel.createFloatArray());
                        break;
                    case 13:
                        objValueOf = androidx.work.e.c(parcel.createDoubleArray());
                        break;
                    case 14:
                        objValueOf = parcel.createStringArray();
                        break;
                    default:
                        throw new IllegalStateException(C4356c.h(b10, "Unsupported type "));
                }
                map.put(parcel.readString(), objValueOf);
                i10++;
            } else {
                this.f38185c = new androidx.work.e(map);
                this.f38186d = new HashSet(parcel.createStringArrayList());
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
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28) {
                    aVar.f16864c = network;
                }
                if (i11 >= 24) {
                    if (arrayList != null) {
                        aVar.f16863b = arrayList;
                    }
                    if (arrayListCreateStringArrayList != null) {
                        aVar.f16862a = arrayListCreateStringArrayList;
                    }
                }
                this.f38187e = aVar;
                this.f38188f = parcel.readInt();
                this.f38189g = parcel.readInt();
                return;
            }
        }
    }
}
