package q2;

import android.os.Parcel;
import com.google.android.gms.internal.ads.B7;

/* renamed from: q2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2836p extends B7 implements InterfaceC2847v {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2806a f23258a;

    public BinderC2836p(InterfaceC2806a interfaceC2806a) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f23258a = interfaceC2806a;
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        z();
        parcel2.writeNoException();
        return true;
    }

    @Override // q2.InterfaceC2847v
    public final void z() {
        this.f23258a.onAdClicked();
    }
}
