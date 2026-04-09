package h6;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f9985a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f9986b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9987c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9988d;

    /* renamed from: e, reason: collision with root package name */
    public final long f9989e;

    /* renamed from: f, reason: collision with root package name */
    public final List f9990f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f9991g;

    /* renamed from: h, reason: collision with root package name */
    public final long f9992h;

    /* renamed from: i, reason: collision with root package name */
    public final int f9993i;
    public final int j;
    public final int k;

    public d(long j, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j7, boolean z13, long j10, int i10, int i11, int i12) {
        this.f9985a = j;
        this.f9986b = z10;
        this.f9987c = z11;
        this.f9988d = z12;
        this.f9990f = Collections.unmodifiableList(arrayList);
        this.f9989e = j7;
        this.f9991g = z13;
        this.f9992h = j10;
        this.f9993i = i10;
        this.j = i11;
        this.k = i12;
    }

    public d(Parcel parcel) {
        this.f9985a = parcel.readLong();
        this.f9986b = parcel.readByte() == 1;
        this.f9987c = parcel.readByte() == 1;
        this.f9988d = parcel.readByte() == 1;
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new c(parcel.readInt(), parcel.readLong()));
        }
        this.f9990f = Collections.unmodifiableList(arrayList);
        this.f9989e = parcel.readLong();
        this.f9991g = parcel.readByte() == 1;
        this.f9992h = parcel.readLong();
        this.f9993i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
