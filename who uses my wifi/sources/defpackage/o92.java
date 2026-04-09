package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.Map;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public final class o92 extends l0 {
    public static final Parcelable.Creator<o92> CREATOR = new p92(0);
    public final View f;
    public final Map g;

    public o92(IBinder iBinder, IBinder iBinder2) {
        this.f = (View) oi0.l1(oi0.X0(iBinder));
        this.g = (Map) oi0.l1(oi0.X0(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int I = uk2.I(parcel, 20293);
        uk2.B(parcel, 1, new oi0(this.f));
        uk2.B(parcel, 2, new oi0(this.g));
        uk2.O(parcel, I);
    }
}
