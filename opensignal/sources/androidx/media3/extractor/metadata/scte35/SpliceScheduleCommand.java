package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import cc.a0;
import h6.c;
import h6.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a0(27);

    /* renamed from: a, reason: collision with root package name */
    public final List f2032a;

    public SpliceScheduleCommand(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(new d(parcel));
        }
        this.f2032a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f2032a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            d dVar = (d) list.get(i11);
            parcel.writeLong(dVar.f9985a);
            parcel.writeByte(dVar.f9986b ? (byte) 1 : (byte) 0);
            parcel.writeByte(dVar.f9987c ? (byte) 1 : (byte) 0);
            parcel.writeByte(dVar.f9988d ? (byte) 1 : (byte) 0);
            List list2 = dVar.f9990f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i12 = 0; i12 < size2; i12++) {
                c cVar = (c) list2.get(i12);
                parcel.writeInt(cVar.f9983a);
                parcel.writeLong(cVar.f9984b);
            }
            parcel.writeLong(dVar.f9989e);
            parcel.writeByte(dVar.f9991g ? (byte) 1 : (byte) 0);
            parcel.writeLong(dVar.f9992h);
            parcel.writeInt(dVar.f9993i);
            parcel.writeInt(dVar.j);
            parcel.writeInt(dVar.k);
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f2032a = Collections.unmodifiableList(arrayList);
    }
}
