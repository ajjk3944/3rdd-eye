package u3;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import s3.C7904t;

/* renamed from: u3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8130a extends A3.a implements IInterface {
    C8130a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void n0(C7904t c7904t) {
        Parcel parcelB = b();
        A3.c.c(parcelB, c7904t);
        f(1, parcelB);
    }
}
