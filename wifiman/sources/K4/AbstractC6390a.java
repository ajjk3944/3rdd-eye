package k4;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: k4.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC6390a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    private final IBinder f51198a;

    /* renamed from: b, reason: collision with root package name */
    private final String f51199b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected AbstractC6390a(IBinder iBinder, String str) {
        this.f51198a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f51198a;
    }

    protected final Parcel b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.f51199b);
        return parcelObtain;
    }

    protected final void c(int i10, Parcel parcel) {
        try {
            this.f51198a.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
