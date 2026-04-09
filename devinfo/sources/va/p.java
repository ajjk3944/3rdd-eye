package va;

import android.os.Parcel;
import com.google.android.gms.internal.ads.mg;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class p extends mg implements v {

    /* renamed from: a, reason: collision with root package name */
    public final a f36154a;

    public p(a aVar) {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
        this.f36154a = aVar;
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 != 1) {
            return false;
        }
        m();
        parcel2.writeNoException();
        return true;
    }

    @Override // va.v
    public final void m() {
        this.f36154a.onAdClicked();
    }
}
