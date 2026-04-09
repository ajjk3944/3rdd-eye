package androidx.media3.extractor.metadata.scte35;

import a5.d0;
import android.os.Parcel;
import android.os.Parcelable;
import cc.a0;

/* loaded from: classes.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new a0(24);

    /* renamed from: a, reason: collision with root package name */
    public final long f2023a;

    /* renamed from: d, reason: collision with root package name */
    public final long f2024d;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f2025g;

    public PrivateCommand(long j, byte[] bArr, long j7) {
        this.f2023a = j7;
        this.f2024d = j;
        this.f2025g = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f2023a);
        parcel.writeLong(this.f2024d);
        parcel.writeByteArray(this.f2025g);
    }

    public PrivateCommand(Parcel parcel) {
        this.f2023a = parcel.readLong();
        this.f2024d = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i10 = d0.f105a;
        this.f2025g = bArrCreateByteArray;
    }
}
