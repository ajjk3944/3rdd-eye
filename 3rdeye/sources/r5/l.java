package r5;

import com.singular.sdk.internal.Constants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import s5.C5578d;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45702a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f45703b;

    public /* synthetic */ l(Object obj, int i) {
        this.f45702a = i;
        this.f45703b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        com.google.firebase.remoteconfig.internal.b bVarA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th;
        switch (this.f45702a) {
            case 0:
                return ((n) this.f45703b).b();
            default:
                C5578d c5578d = (C5578d) this.f45703b;
                synchronized (c5578d) {
                    bVarA = null;
                    try {
                        fileInputStreamOpenFileInput = c5578d.f46081a.openFileInput(c5578d.f46082b);
                    } catch (FileNotFoundException | JSONException unused) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th2) {
                        fileInputStreamOpenFileInput = null;
                        th = th2;
                    }
                    try {
                        int iAvailable = fileInputStreamOpenFileInput.available();
                        byte[] bArr = new byte[iAvailable];
                        fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                        bVarA = com.google.firebase.remoteconfig.internal.b.a(new JSONObject(new String(bArr, Constants.ENCODING)));
                        fileInputStreamOpenFileInput.close();
                    } catch (FileNotFoundException | JSONException unused2) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        return bVarA;
                    } catch (Throwable th3) {
                        th = th3;
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        throw th;
                    }
                }
                return bVarA;
        }
    }
}
