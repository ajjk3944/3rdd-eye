package nb;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import pb.n0;
import pb.y;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class n extends ac.i implements n0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f29916b;

    public n(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        y.b(bArr.length == 25);
        this.f29916b = Arrays.hashCode(bArr);
    }

    public static byte[] U0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // pb.n0
    public final int c() {
        return this.f29916b;
    }

    @Override // ac.i
    public final boolean e0(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            vb.a aVarF = f();
            parcel2.writeNoException();
            ac.j.b(parcel2, aVarF);
            return true;
        }
        if (i4 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f29916b);
        return true;
    }

    public final boolean equals(Object obj) {
        vb.a aVarF;
        if (obj instanceof n0) {
            try {
                n0 n0Var = (n0) obj;
                if (n0Var.c() == this.f29916b && (aVarF = n0Var.f()) != null) {
                    return Arrays.equals(r0(), (byte[]) vb.b.U0(aVarF));
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return false;
            }
        }
        return false;
    }

    @Override // pb.n0
    public final vb.a f() {
        return new vb.b(r0());
    }

    public final int hashCode() {
        return this.f29916b;
    }

    public abstract byte[] r0();
}
