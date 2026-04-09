package wa;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f24395a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24396b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24397c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24398d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24399e;

    /* renamed from: f, reason: collision with root package name */
    public final List f24400f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24401g;

    /* renamed from: h, reason: collision with root package name */
    public final long f24402h;

    /* renamed from: i, reason: collision with root package name */
    public final int f24403i;
    public final int j;
    public final int k;

    public d(long j, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j7, boolean z13, long j10, int i10, int i11, int i12) {
        this.f24395a = j;
        this.f24396b = z10;
        this.f24397c = z11;
        this.f24398d = z12;
        this.f24400f = Collections.unmodifiableList(arrayList);
        this.f24399e = j7;
        this.f24401g = z13;
        this.f24402h = j10;
        this.f24403i = i10;
        this.j = i11;
        this.k = i12;
    }

    public d(Parcel parcel) {
        this.f24395a = parcel.readLong();
        this.f24396b = parcel.readByte() == 1;
        this.f24397c = parcel.readByte() == 1;
        this.f24398d = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new c(parcel.readInt(), parcel.readLong()));
        }
        this.f24400f = Collections.unmodifiableList(arrayList);
        this.f24399e = parcel.readLong();
        this.f24401g = parcel.readByte() == 1;
        this.f24402h = parcel.readLong();
        this.f24403i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
