package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-6c2465e8d13ff8e5d50a476d17d9ba5832a97d3f7cd313d64bb1ddbb52494e1b */
/* loaded from: classes.dex */
public abstract class ta4 extends fc1 implements kd1 {
    public final int g;

    public ta4(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        ou1.f(bArr.length == 25);
        this.g = Arrays.hashCode(bArr);
    }

    public static byte[] X0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    @Override // defpackage.fc1
    public final boolean M0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            oi0 oi0Var = new oi0(l1());
            parcel2.writeNoException();
            cc2.c(parcel2, oi0Var);
            return true;
        }
        if (i != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.g);
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof kd1)) {
            try {
                kd1 kd1Var = (kd1) obj;
                if (((ta4) kd1Var).g == this.g) {
                    return Arrays.equals(l1(), (byte[]) oi0.l1(new oi0(((ta4) kd1Var).l1())));
                }
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g;
    }

    public abstract byte[] l1();
}
