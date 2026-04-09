package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.viewpoint.core.C02434v;
import com.instagram.common.viewpoint.core.C0567Ib;
import com.instagram.common.viewpoint.core.IZ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new IZ();
    public final List<C0567Ib> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int i4 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i4);
        for (int i10 = 0; i10 < i4; i10++) {
            arrayList.add(C0567Ib.A00(parcel));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, IZ iz) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<C0567Ib> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(C02434v c02434v) {
        int iA0I = c02434v.A0I();
        ArrayList arrayList = new ArrayList(iA0I);
        for (int i4 = 0; i4 < iA0I; i4++) {
            arrayList.add(C0567Ib.A02(c02434v));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.A00.get(i10).A04(parcel);
        }
    }
}
