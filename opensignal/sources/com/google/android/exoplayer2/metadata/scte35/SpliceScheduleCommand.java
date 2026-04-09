package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tc.c;
import wa.d;

/* loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new c(24);

    /* renamed from: a, reason: collision with root package name */
    public final List f4328a;

    public SpliceScheduleCommand(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new d(parcel));
        }
        this.f4328a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f4328a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) list.get(i11);
            parcel.writeLong(dVar.f24395a);
            parcel.writeByte(dVar.f24396b ? (byte) 1 : (byte) 0);
            parcel.writeByte(dVar.f24397c ? (byte) 1 : (byte) 0);
            parcel.writeByte(dVar.f24398d ? (byte) 1 : (byte) 0);
            List list2 = dVar.f24400f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                wa.c cVar = (wa.c) list2.get(i12);
                parcel.writeInt(cVar.f24393a);
                parcel.writeLong(cVar.f24394b);
            }
            parcel.writeLong(dVar.f24399e);
            parcel.writeByte(dVar.f24401g ? (byte) 1 : (byte) 0);
            parcel.writeLong(dVar.f24402h);
            parcel.writeInt(dVar.f24403i);
            parcel.writeInt(dVar.j);
            parcel.writeInt(dVar.k);
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f4328a = Collections.unmodifiableList(arrayList);
    }
}
