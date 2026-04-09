package zb;

import android.os.Parcel;
import android.os.RemoteException;
import cc.i0;
import cc.s;
import io.sentry.android.core.e0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class l extends mc.a implements i0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f26832f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final int f26833e;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 1);
        s.b(bArr.length == 25);
        this.f26833e = Arrays.hashCode(bArr);
    }

    public static byte[] V(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // mc.a
    public final boolean S(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            jc.b bVarC = c();
            parcel2.writeNoException();
            oc.h.b(parcel2, bVarC);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f26833e);
        return true;
    }

    public abstract byte[] U();

    @Override // cc.i0
    public final int a() {
        return this.f26833e;
    }

    @Override // cc.i0
    public final jc.b c() {
        return new jc.d(U());
    }

    public final boolean equals(Object obj) {
        jc.b bVarC;
        if (obj instanceof i0) {
            try {
                i0 i0Var = (i0) obj;
                if (i0Var.a() == this.f26833e && (bVarC = i0Var.c()) != null) {
                    return Arrays.equals(U(), (byte[]) jc.d.V(bVarC));
                }
            } catch (RemoteException e4) {
                e0.c("GoogleCertificates", "Failed to get Google certificates from remote", e4);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26833e;
    }
}
