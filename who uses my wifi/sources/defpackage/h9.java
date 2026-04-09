package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class h9 implements Parcelable {
    public static final Parcelable.Creator<h9> CREATOR = new k2(2);
    public final int[] f;
    public final ArrayList g;
    public final int[] h;
    public final int[] i;
    public final int j;
    public final String k;
    public final int l;
    public final int m;
    public final CharSequence n;
    public final int o;
    public final CharSequence p;
    public final ArrayList q;
    public final ArrayList r;
    public final boolean s;

    public h9(g9 g9Var) {
        int size = g9Var.a.size();
        this.f = new int[size * 6];
        if (!g9Var.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.g = new ArrayList(size);
        this.h = new int[size];
        this.i = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            ix ixVar = (ix) g9Var.a.get(i2);
            int i3 = i + 1;
            this.f[i] = ixVar.a;
            ArrayList arrayList = this.g;
            iw iwVar = ixVar.b;
            arrayList.add(iwVar != null ? iwVar.j : null);
            int[] iArr = this.f;
            iArr[i3] = ixVar.c ? 1 : 0;
            iArr[i + 2] = ixVar.d;
            iArr[i + 3] = ixVar.e;
            int i4 = i + 5;
            iArr[i + 4] = ixVar.f;
            i += 6;
            iArr[i4] = ixVar.g;
            this.h[i2] = ixVar.h.ordinal();
            this.i[i2] = ixVar.i.ordinal();
        }
        this.j = g9Var.f;
        this.k = g9Var.i;
        this.l = g9Var.s;
        this.m = g9Var.j;
        this.n = g9Var.k;
        this.o = g9Var.l;
        this.p = g9Var.m;
        this.q = g9Var.n;
        this.r = g9Var.o;
        this.s = g9Var.p;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f);
        parcel.writeStringList(this.g);
        parcel.writeIntArray(this.h);
        parcel.writeIntArray(this.i);
        parcel.writeInt(this.j);
        parcel.writeString(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        TextUtils.writeToParcel(this.n, parcel, 0);
        parcel.writeInt(this.o);
        TextUtils.writeToParcel(this.p, parcel, 0);
        parcel.writeStringList(this.q);
        parcel.writeStringList(this.r);
        parcel.writeInt(this.s ? 1 : 0);
    }

    public h9(Parcel parcel) {
        this.f = parcel.createIntArray();
        this.g = parcel.createStringArrayList();
        this.h = parcel.createIntArray();
        this.i = parcel.createIntArray();
        this.j = parcel.readInt();
        this.k = parcel.readString();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.n = (CharSequence) creator.createFromParcel(parcel);
        this.o = parcel.readInt();
        this.p = (CharSequence) creator.createFromParcel(parcel);
        this.q = parcel.createStringArrayList();
        this.r = parcel.createStringArrayList();
        this.s = parcel.readInt() != 0;
    }
}
