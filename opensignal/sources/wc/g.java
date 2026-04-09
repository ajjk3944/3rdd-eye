package wc;

import android.os.Parcel;
import com.google.android.gms.maps.model.Tile;
import qc.k;
import qc.l;

/* loaded from: classes.dex */
public final class g extends mc.a implements k {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f24413f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f24414e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(f fVar) {
        super("com.google.android.gms.maps.model.internal.ITileProviderDelegate", 3);
        this.f24414e = fVar;
    }

    @Override // mc.a
    public final boolean S(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 != 1) {
            return false;
        }
        int i11 = parcel.readInt();
        int i12 = parcel.readInt();
        int i13 = parcel.readInt();
        l.b(parcel);
        Tile tileA = this.f24414e.a(i11, i12, i13);
        parcel2.writeNoException();
        parcel2.writeInt(1);
        tileA.writeToParcel(parcel2, 1);
        return true;
    }
}
