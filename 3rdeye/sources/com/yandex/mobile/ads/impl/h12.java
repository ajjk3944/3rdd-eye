package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class h12 extends f12 {
    public static final Parcelable.Creator<h12> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f28068b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28069c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28070d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28071e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f28072f;

    /* renamed from: g, reason: collision with root package name */
    public final long f28073g;

    /* renamed from: h, reason: collision with root package name */
    public final long f28074h;
    public final List<b> i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f28075j;

    /* renamed from: k, reason: collision with root package name */
    public final long f28076k;

    /* renamed from: l, reason: collision with root package name */
    public final int f28077l;

    /* renamed from: m, reason: collision with root package name */
    public final int f28078m;

    /* renamed from: n, reason: collision with root package name */
    public final int f28079n;

    public class a implements Parcelable.Creator<h12> {
        @Override // android.os.Parcelable.Creator
        public final h12 createFromParcel(Parcel parcel) {
            return new h12(parcel, 0);
        }

        @Override // android.os.Parcelable.Creator
        public final h12[] newArray(int i) {
            return new h12[i];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f28080a;

        /* renamed from: b, reason: collision with root package name */
        public final long f28081b;

        /* renamed from: c, reason: collision with root package name */
        public final long f28082c;

        public /* synthetic */ b(int i, int i10, long j4, long j10) {
            this(i, j4, j10);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private b(int i, long j4, long j10) {
            this.f28080a = i;
            this.f28081b = j4;
            this.f28082c = j10;
        }
    }

    public /* synthetic */ h12(Parcel parcel, int i) {
        this(parcel);
    }

    public static h12 a(uf1 uf1Var, long j4, c52 c52Var) {
        boolean z10;
        List list;
        long j10;
        boolean z11;
        boolean z12;
        boolean z13;
        long j11;
        int i;
        int i10;
        int iT;
        long j12;
        boolean z14;
        boolean z15;
        long jV;
        long jV2 = uf1Var.v();
        boolean z16 = (uf1Var.t() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        if (z16) {
            z10 = z16;
            list = list2;
            j10 = -9223372036854775807L;
            z11 = false;
            z12 = false;
            z13 = false;
            j11 = -9223372036854775807L;
            i = 0;
            i10 = 0;
            iT = 0;
            j12 = jV2;
            z14 = false;
        } else {
            int iT2 = uf1Var.t();
            boolean z17 = (iT2 & 128) != 0;
            boolean z18 = (iT2 & 64) != 0;
            boolean z19 = (iT2 & 32) != 0;
            boolean z20 = (iT2 & 16) != 0;
            long jA = (!z18 || z20) ? -9223372036854775807L : t42.a(j4, uf1Var);
            if (!z18) {
                int iT3 = uf1Var.t();
                ArrayList arrayList = new ArrayList(iT3);
                for (int i11 = 0; i11 < iT3; i11++) {
                    int iT4 = uf1Var.t();
                    long jA2 = !z20 ? t42.a(j4, uf1Var) : -9223372036854775807L;
                    arrayList.add(new b(iT4, 0, jA2, c52Var.b(jA2)));
                }
                list2 = arrayList;
            }
            if (z19) {
                long jT = uf1Var.t();
                boolean z21 = (128 & jT) != 0;
                jV = ((((jT & 1) << 32) | uf1Var.v()) * 1000) / 90;
                z15 = z21;
            } else {
                z15 = false;
                jV = -9223372036854775807L;
            }
            int iZ = uf1Var.z();
            int iT5 = uf1Var.t();
            i = iZ;
            z10 = z16;
            z11 = z20;
            z13 = z15;
            z12 = z17;
            long j13 = jA;
            iT = uf1Var.t();
            i10 = iT5;
            j10 = j13;
            list = list2;
            j12 = jV2;
            z14 = z18;
            j11 = jV;
        }
        return new h12(j12, z10, z12, z14, z11, j10, c52Var.b(j10), list, z13, j11, i, i10, iT);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f28068b);
        parcel.writeByte(this.f28069c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f28070d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f28071e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f28072f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f28073g);
        parcel.writeLong(this.f28074h);
        int size = this.i.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.i.get(i10);
            parcel.writeInt(bVar.f28080a);
            parcel.writeLong(bVar.f28081b);
            parcel.writeLong(bVar.f28082c);
        }
        parcel.writeByte(this.f28075j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f28076k);
        parcel.writeInt(this.f28077l);
        parcel.writeInt(this.f28078m);
        parcel.writeInt(this.f28079n);
    }

    private h12(long j4, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, List<b> list, boolean z14, long j12, int i, int i10, int i11) {
        this.f28068b = j4;
        this.f28069c = z10;
        this.f28070d = z11;
        this.f28071e = z12;
        this.f28072f = z13;
        this.f28073g = j10;
        this.f28074h = j11;
        this.i = Collections.unmodifiableList(list);
        this.f28075j = z14;
        this.f28076k = j12;
        this.f28077l = i;
        this.f28078m = i10;
        this.f28079n = i11;
    }

    private h12(Parcel parcel) {
        this.f28068b = parcel.readLong();
        this.f28069c = parcel.readByte() == 1;
        this.f28070d = parcel.readByte() == 1;
        this.f28071e = parcel.readByte() == 1;
        this.f28072f = parcel.readByte() == 1;
        this.f28073g = parcel.readLong();
        this.f28074h = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i10 = 0; i10 < i; i10++) {
            arrayList.add(b.a(parcel));
        }
        this.i = Collections.unmodifiableList(arrayList);
        this.f28075j = parcel.readByte() == 1;
        this.f28076k = parcel.readLong();
        this.f28077l = parcel.readInt();
        this.f28078m = parcel.readInt();
        this.f28079n = parcel.readInt();
    }
}
