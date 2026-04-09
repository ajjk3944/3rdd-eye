package r3;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import s3.r0;
import t3.AbstractC8026a;
import x3.InterfaceC8420a;

/* loaded from: classes.dex */
public final class D extends AbstractC8026a {
    public static final Parcelable.Creator<D> CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    private final String f60058a;

    /* renamed from: b, reason: collision with root package name */
    private final u f60059b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f60060c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f60061d;

    D(String str, u uVar, boolean z10, boolean z11) {
        this.f60058a = str;
        this.f60059b = uVar;
        this.f60060c = z10;
        this.f60061d = z11;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.f60058a;
        int iA = t3.b.a(parcel);
        t3.b.q(parcel, 1, str, false);
        u uVar = this.f60059b;
        if (uVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            uVar = null;
        }
        t3.b.j(parcel, 2, uVar, false);
        t3.b.c(parcel, 3, this.f60060c);
        t3.b.c(parcel, 4, this.f60061d);
        t3.b.b(parcel, iA);
    }

    D(String str, IBinder iBinder, boolean z10, boolean z11) {
        this.f60058a = str;
        v vVar = null;
        if (iBinder != null) {
            try {
                InterfaceC8420a interfaceC8420aZzd = r0.c(iBinder).zzd();
                byte[] bArr = interfaceC8420aZzd == null ? null : (byte[]) x3.b.f(interfaceC8420aZzd);
                if (bArr != null) {
                    vVar = new v(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e10);
            }
        }
        this.f60059b = vVar;
        this.f60060c = z10;
        this.f60061d = z11;
    }
}
