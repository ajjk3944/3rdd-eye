package h2;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.d;
import b2.C1819F;
import c9.C2097r;
import c9.C2101v;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: ParcelableConstraints.java */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4408b implements Parcelable {
    public static final Parcelable.Creator<C4408b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final androidx.work.d f38160b;

    /* compiled from: ParcelableConstraints.java */
    /* renamed from: h2.b$a */
    public class a implements Parcelable.Creator<C4408b> {
        @Override // android.os.Parcelable.Creator
        public final C4408b createFromParcel(Parcel parcel) {
            return new C4408b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final C4408b[] newArray(int i) {
            return new C4408b[i];
        }
    }

    public C4408b(androidx.work.d dVar) {
        this.f38160b = dVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        androidx.work.d dVar = this.f38160b;
        parcel.writeInt(C1819F.g(dVar.f16882a));
        parcel.writeInt(dVar.f16885d ? 1 : 0);
        parcel.writeInt(dVar.f16883b ? 1 : 0);
        parcel.writeInt(dVar.f16886e ? 1 : 0);
        int i10 = Build.VERSION.SDK_INT;
        parcel.writeInt(dVar.f16884c ? 1 : 0);
        if (i10 >= 24) {
            boolean zA = dVar.a();
            parcel.writeInt(zA ? 1 : 0);
            if (zA) {
                parcel.writeByteArray(C1819F.i(dVar.f16889h));
            }
            parcel.writeLong(dVar.f16888g);
            parcel.writeLong(dVar.f16887f);
        }
    }

    public C4408b(Parcel parcel) {
        long millis;
        long millis2;
        Set setL0;
        long j4;
        long j10;
        androidx.work.n nVar = androidx.work.n.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        androidx.work.n networkType = C1819F.d(parcel.readInt());
        kotlin.jvm.internal.l.f(networkType, "networkType");
        boolean z10 = parcel.readInt() == 1;
        boolean z11 = parcel.readInt() == 1;
        boolean z12 = parcel.readInt() == 1;
        int i = Build.VERSION.SDK_INT;
        boolean z13 = parcel.readInt() == 1;
        if (i >= 24) {
            if (parcel.readInt() == 1) {
                for (d.a aVar : C1819F.b(parcel.createByteArray())) {
                    linkedHashSet.add(new d.a(aVar.f16891b, aVar.f16890a));
                }
            }
            long j11 = parcel.readLong();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            kotlin.jvm.internal.l.f(timeUnit, "timeUnit");
            millis = timeUnit.toMillis(j11);
            millis2 = timeUnit.toMillis(parcel.readLong());
        } else {
            millis = -1;
            millis2 = -1;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            setL0 = C2097r.L0(linkedHashSet);
            j4 = millis2;
            j10 = millis;
        } else {
            setL0 = C2101v.f18583b;
            j4 = -1;
            j10 = -1;
        }
        this.f38160b = new androidx.work.d(networkType, z11, z13, z10, z12, j4, j10, setL0);
    }
}
