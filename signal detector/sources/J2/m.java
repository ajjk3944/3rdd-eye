package J2;

import M2.I;
import M2.u;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class m extends S3.d implements I {

    /* renamed from: b, reason: collision with root package name */
    public final int f2074b;

    public m(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        u.a(bArr.length == 25);
        this.f2074b = Arrays.hashCode(bArr);
    }

    public static byte[] n1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }

    @Override // S3.d
    public final boolean I0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            S2.b bVar = new S2.b(d1());
            parcel2.writeNoException();
            X2.g.b(parcel2, bVar);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f2074b);
        return true;
    }

    public abstract byte[] d1();

    public final boolean equals(Object obj) {
        if (obj instanceof I) {
            try {
                I i = (I) obj;
                if (((m) i).f2074b == this.f2074b) {
                    return Arrays.equals(d1(), (byte[]) S2.b.n1(new S2.b(((m) i).d1())));
                }
            } catch (RemoteException e6) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2074b;
    }
}
