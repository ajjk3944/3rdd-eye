package r3;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import s3.AbstractC7901p;
import s3.N;
import s3.r0;
import x3.InterfaceC8420a;

/* loaded from: classes.dex */
abstract class u extends r0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f60105a;

    protected u(byte[] bArr) {
        AbstractC7901p.a(bArr.length == 25);
        this.f60105a = Arrays.hashCode(bArr);
    }

    protected static byte[] f(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public final boolean equals(Object obj) {
        InterfaceC8420a interfaceC8420aZzd;
        if (obj != null && (obj instanceof N)) {
            try {
                N n10 = (N) obj;
                if (n10.zzc() == this.f60105a && (interfaceC8420aZzd = n10.zzd()) != null) {
                    return Arrays.equals(n0(), (byte[]) x3.b.f(interfaceC8420aZzd));
                }
                return false;
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f60105a;
    }

    abstract byte[] n0();

    @Override // s3.N
    public final int zzc() {
        return this.f60105a;
    }

    @Override // s3.N
    public final InterfaceC8420a zzd() {
        return x3.b.n0(n0());
    }
}
