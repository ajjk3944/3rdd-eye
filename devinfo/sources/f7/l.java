package f7;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f23769b;

    public /* synthetic */ l(int i4, Object obj) {
        this.f23768a = i4;
        this.f23769b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        lf.c cVarA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        switch (this.f23768a) {
            case 0:
                return o.d((ByteArrayInputStream) this.f23769b, null);
            case 1:
                je.m mVar = ((je.q) this.f23769b).g;
                mVar.getClass();
                ke.c.a();
                yb.i iVar = mVar.f27570c;
                pe.c cVar = (pe.c) iVar.f37517c;
                String str = (String) iVar.f37516b;
                cVar.getClass();
                boolean z3 = true;
                if (new File((File) cVar.f31752d, str).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    pe.c cVar2 = (pe.c) iVar.f37517c;
                    cVar2.getClass();
                    new File((File) cVar2.f31752d, str).delete();
                } else {
                    String strE = mVar.e();
                    if (strE == null || !mVar.j.c(strE)) {
                        z3 = false;
                    }
                }
                return Boolean.valueOf(z3);
            case 2:
                return ((kf.i) this.f23769b).a();
            case 3:
                lf.m mVar2 = (lf.m) this.f23769b;
                synchronized (mVar2) {
                    cVarA = null;
                    try {
                        fileInputStreamOpenFileInput = mVar2.f28802a.openFileInput(mVar2.f28803b);
                    } catch (FileNotFoundException | JSONException unused) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th3) {
                        fileInputStreamOpenFileInput = null;
                        th2 = th3;
                    }
                    try {
                        int iAvailable = fileInputStreamOpenFileInput.available();
                        byte[] bArr = new byte[iAvailable];
                        fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                        cVarA = lf.c.a(new JSONObject(new String(bArr, "UTF-8")));
                        fileInputStreamOpenFileInput.close();
                    } catch (FileNotFoundException | JSONException unused2) {
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        return cVarA;
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                        throw th2;
                    }
                }
                return cVarA;
            case 4:
                return new p6.f((JsReplyProxyBoundaryInterface) this.f23769b);
            default:
                com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) ((km.o) this.f23769b).f28446b;
                cl.u uVar = (cl.u) dVar.f19300f;
                re.c cVar3 = (re.c) dVar.f19296b;
                String str2 = uVar.f2942b;
                ke.c.b();
                try {
                    HashMap mapB = cl.u.b(cVar3);
                    i0.f fVar = new i0.f(mapB, str2);
                    fVar.F("User-Agent", "Crashlytics Android SDK/20.0.3");
                    fVar.F("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    cl.u.a(fVar, cVar3);
                    String str3 = "Requesting settings from " + str2;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", str3, null);
                    }
                    String str4 = "Settings query params were: " + mapB;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", str4, null);
                    }
                    return uVar.c(fVar.v());
                } catch (IOException e2) {
                    Log.e("FirebaseCrashlytics", "Settings request failed.", e2);
                    return null;
                }
        }
    }
}
