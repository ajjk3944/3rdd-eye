package d8;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import java.io.IOException;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class f implements w, j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f22011a;

    public /* synthetic */ f(Context context) {
        this.f22011a = context;
    }

    public static FingerprintManager e(Context context) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 == 23) {
            return (FingerprintManager) context.getSystemService(FingerprintManager.class);
        }
        if (i4 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint")) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    @Override // d8.j
    public Class a() {
        return AssetFileDescriptor.class;
    }

    public void b(w4.m mVar, a4.d dVar, o.e eVar) {
        CancellationSignal cancellationSignal;
        CancellationSignal cancellationSignal2;
        FingerprintManager.CryptoObject cryptoObject = null;
        if (dVar != null) {
            synchronized (dVar) {
                try {
                    if (((CancellationSignal) dVar.f189b) == null) {
                        CancellationSignal cancellationSignal3 = new CancellationSignal();
                        dVar.f189b = cancellationSignal3;
                        if (dVar.f188a) {
                            cancellationSignal3.cancel();
                        }
                    }
                    cancellationSignal2 = (CancellationSignal) dVar.f189b;
                } finally {
                }
            }
            cancellationSignal = cancellationSignal2;
        } else {
            cancellationSignal = null;
        }
        FingerprintManager fingerprintManagerE = e(this.f22011a);
        if (fingerprintManagerE != null) {
            if (mVar != null) {
                Mac mac = (Mac) mVar.f36444c;
                Signature signature = (Signature) mVar.f36442a;
                Cipher cipher = (Cipher) mVar.f36443b;
                if (cipher != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(cipher);
                } else if (signature != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(signature);
                } else if (mac != null) {
                    cryptoObject = new FingerprintManager.CryptoObject(mac);
                }
            }
            fingerprintManagerE.authenticate(cryptoObject, cancellationSignal, 0, new x3.a(eVar), null);
        }
    }

    @Override // d8.j
    public Object c(int i4, Resources.Theme theme, Resources resources) {
        return resources.openRawResourceFd(i4);
    }

    @Override // d8.j
    public void d(Object obj) throws IOException {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // d8.w
    public v i(b0 b0Var) {
        return new b(this.f22011a, this);
    }
}
