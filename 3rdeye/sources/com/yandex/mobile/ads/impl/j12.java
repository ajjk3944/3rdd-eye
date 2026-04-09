package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class j12 extends f12 {
    public static final Parcelable.Creator<j12> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final List<c> f28916b;

    public class a implements Parcelable.Creator<j12> {
        @Override // android.os.Parcelable.Creator
        public final j12 createFromParcel(Parcel parcel) {
            return new j12(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final j12[] newArray(int i) {
            return new j12[i];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f28917a;

        /* renamed from: b, reason: collision with root package name */
        public final long f28918b;

        public /* synthetic */ b(int i, long j4, int i10) {
            this(i, j4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        private b(int i, long j4) {
            this.f28917a = i;
            this.f28918b = j4;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f28919a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f28920b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f28921c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f28922d;

        /* renamed from: e, reason: collision with root package name */
        public final long f28923e;

        /* renamed from: f, reason: collision with root package name */
        public final List<b> f28924f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f28925g;

        /* renamed from: h, reason: collision with root package name */
        public final long f28926h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final int f28927j;

        /* renamed from: k, reason: collision with root package name */
        public final int f28928k;

        public /* synthetic */ c(long j4, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j10, boolean z13, long j11, int i, int i10, int i11, int i12) {
            this(j4, z10, z11, z12, arrayList, j10, z13, j11, i, i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c a(Parcel parcel) {
            return new c(parcel);
        }

        private c(long j4, boolean z10, boolean z11, boolean z12, ArrayList arrayList, long j10, boolean z13, long j11, int i, int i10, int i11) {
            this.f28919a = j4;
            this.f28920b = z10;
            this.f28921c = z11;
            this.f28922d = z12;
            this.f28924f = Collections.unmodifiableList(arrayList);
            this.f28923e = j10;
            this.f28925g = z13;
            this.f28926h = j11;
            this.i = i;
            this.f28927j = i10;
            this.f28928k = i11;
        }

        private c(Parcel parcel) {
            this.f28919a = parcel.readLong();
            this.f28920b = parcel.readByte() == 1;
            this.f28921c = parcel.readByte() == 1;
            this.f28922d = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i10 = 0; i10 < i; i10++) {
                arrayList.add(b.a(parcel));
            }
            this.f28924f = Collections.unmodifiableList(arrayList);
            this.f28923e = parcel.readLong();
            this.f28925g = parcel.readByte() == 1;
            this.f28926h = parcel.readLong();
            this.i = parcel.readInt();
            this.f28927j = parcel.readInt();
            this.f28928k = parcel.readInt();
        }
    }

    public /* synthetic */ j12(Parcel parcel, int i) {
        this(parcel);
    }

    public static j12 a(uf1 uf1Var) {
        boolean z10;
        int i;
        long j4;
        boolean z11;
        boolean z12;
        int i10;
        int iT;
        int iT2;
        ArrayList arrayList;
        long j10;
        long j11;
        boolean z13;
        boolean z14;
        long jV;
        int iT3 = uf1Var.t();
        ArrayList arrayList2 = new ArrayList(iT3);
        int i11 = 0;
        int i12 = 0;
        while (i12 < iT3) {
            long jV2 = uf1Var.v();
            boolean z15 = true;
            if ((uf1Var.t() & 128) != 0) {
                z10 = true;
            } else {
                z10 = true;
                z15 = false;
            }
            ArrayList arrayList3 = new ArrayList();
            if (z15) {
                i = iT3;
                j4 = jV2;
                z11 = false;
                z12 = false;
                i10 = 0;
                iT = 0;
                iT2 = 0;
                arrayList = arrayList3;
                j10 = -9223372036854775807L;
                j11 = -9223372036854775807L;
                z13 = false;
            } else {
                int iT4 = uf1Var.t();
                boolean z16 = (iT4 & 128) != 0 ? z10 : false;
                boolean z17 = (iT4 & 64) != 0 ? z10 : false;
                boolean z18 = (iT4 & 32) != 0 ? z10 : false;
                long jV3 = z17 ? uf1Var.v() : -9223372036854775807L;
                if (!z17) {
                    int iT5 = uf1Var.t();
                    ArrayList arrayList4 = new ArrayList(iT5);
                    int i13 = 0;
                    while (i13 < iT5) {
                        arrayList4.add(new b(uf1Var.t(), uf1Var.v(), i11));
                        i13++;
                        jV2 = jV2;
                        iT3 = iT3;
                    }
                    arrayList3 = arrayList4;
                }
                i = iT3;
                j4 = jV2;
                if (z18) {
                    long jT = uf1Var.t();
                    z14 = (128 & jT) != 0;
                    jV = ((((jT & 1) << 32) | uf1Var.v()) * 1000) / 90;
                } else {
                    z14 = false;
                    jV = -9223372036854775807L;
                }
                int iZ = uf1Var.z();
                arrayList = arrayList3;
                z13 = z16;
                j10 = jV3;
                j11 = jV;
                iT = uf1Var.t();
                iT2 = uf1Var.t();
                z11 = z17;
                z12 = z14;
                i10 = iZ;
            }
            arrayList2.add(new c(j4, z15, z13, z11, arrayList, j10, z12, j11, i10, iT, iT2, 0));
            i12++;
            iT3 = i;
        }
        return new j12(arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.f28916b.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.f28916b.get(i10);
            parcel.writeLong(cVar.f28919a);
            parcel.writeByte(cVar.f28920b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f28921c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f28922d ? (byte) 1 : (byte) 0);
            int size2 = cVar.f28924f.size();
            parcel.writeInt(size2);
            for (int i11 = 0; i11 < size2; i11++) {
                b bVar = cVar.f28924f.get(i11);
                parcel.writeInt(bVar.f28917a);
                parcel.writeLong(bVar.f28918b);
            }
            parcel.writeLong(cVar.f28923e);
            parcel.writeByte(cVar.f28925g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f28926h);
            parcel.writeInt(cVar.i);
            parcel.writeInt(cVar.f28927j);
            parcel.writeInt(cVar.f28928k);
        }
    }

    private j12(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i10 = 0; i10 < i; i10++) {
            arrayList.add(c.a(parcel));
        }
        this.f28916b = Collections.unmodifiableList(arrayList);
    }

    private j12(ArrayList arrayList) {
        this.f28916b = Collections.unmodifiableList(arrayList);
    }
}
