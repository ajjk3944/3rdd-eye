package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.measurement.i4;
import java.util.ArrayList;
import java.util.List;
import wc.h;
import zc.k2;

/* loaded from: classes.dex */
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new h(25);

    /* renamed from: a, reason: collision with root package name */
    public final List f5418a;

    public zzoo(ArrayList arrayList) {
        this.f5418a = arrayList;
    }

    public static zzoo d(k2... k2VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(k2VarArr[0].zza()));
        return new zzoo(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iU = i4.U(parcel, 20293);
        List list = this.f5418a;
        if (list != null) {
            int iU2 = i4.U(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                parcel.writeInt(((Integer) list.get(i11)).intValue());
            }
            i4.W(parcel, iU2);
        }
        i4.W(parcel, iU);
    }
}
