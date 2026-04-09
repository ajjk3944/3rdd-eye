package hf;

import android.util.Log;
import io.sentry.android.core.e0;
import io.sentry.k0;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.NavigableSet;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10685a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10686b;

    public /* synthetic */ n(int i10, Object obj) {
        this.f10685a = i10;
        this.f10686b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        pg.d dVarA;
        FileInputStream fileInputStreamOpenFileInput;
        Throwable th2;
        switch (this.f10685a) {
            case 0:
                l lVar = ((q) this.f10686b).f10698g;
                lVar.getClass();
                jf.d.a();
                bm.e eVar = lVar.f10669c;
                of.b bVar = (of.b) eVar.f2831g;
                String str = (String) eVar.f2830d;
                bVar.getClass();
                boolean z10 = true;
                if (new File((File) bVar.f19423g, str).exists()) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    of.b bVar2 = (of.b) eVar.f2831g;
                    bVar2.getClass();
                    new File((File) bVar2.f19423g, str).delete();
                } else {
                    NavigableSet navigableSetC = ((of.a) lVar.f10677m.f10471d).c();
                    String str2 = !navigableSetC.isEmpty() ? (String) navigableSetC.first() : null;
                    if (str2 == null || !lVar.j.c(str2)) {
                        z10 = false;
                    }
                }
                return Boolean.valueOf(z10);
            case 1:
                k0 k0Var = (k0) this.f10686b;
                try {
                    k0Var.f12407e.getClass();
                    k0Var.f12404b = InetAddress.getLocalHost().getCanonicalHostName();
                    k0Var.f12405c = System.currentTimeMillis() + k0Var.f12403a;
                    k0Var.f12406d.set(false);
                    return null;
                } catch (Throwable th3) {
                    k0Var.f12406d.set(false);
                    throw th3;
                }
            case 2:
                return ((og.j) this.f10686b).a();
            case 3:
                pg.n nVar = (pg.n) this.f10686b;
                synchronized (nVar) {
                    dVarA = null;
                    try {
                        fileInputStreamOpenFileInput = nVar.f20555a.openFileInput(nVar.f20556b);
                        try {
                            int iAvailable = fileInputStreamOpenFileInput.available();
                            byte[] bArr = new byte[iAvailable];
                            fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                            dVarA = pg.d.a(new JSONObject(new String(bArr, "UTF-8")));
                            fileInputStreamOpenFileInput.close();
                        } catch (FileNotFoundException | JSONException unused) {
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                            return dVarA;
                        } catch (Throwable th4) {
                            th2 = th4;
                            if (fileInputStreamOpenFileInput != null) {
                                fileInputStreamOpenFileInput.close();
                            }
                            throw th2;
                        }
                    } catch (FileNotFoundException | JSONException unused2) {
                        fileInputStreamOpenFileInput = null;
                    } catch (Throwable th5) {
                        fileInputStreamOpenFileInput = null;
                        th2 = th5;
                    }
                }
                return dVarA;
            case 4:
                al.b bVar3 = (al.b) ((om.f) this.f10686b).f19555g;
                bu.t tVar = (bu.t) bVar3.f815g;
                qf.e eVar2 = (qf.e) bVar3.f811c;
                tVar.getClass();
                jf.d.b();
                try {
                    HashMap mapL = bu.t.l(eVar2);
                    io.sentry.k kVar = new io.sentry.k(tVar.f2990d, mapL);
                    kVar.d0("User-Agent", "Crashlytics Android SDK/20.0.3");
                    kVar.d0("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    bu.t.i(kVar, eVar2);
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    mapL.toString();
                    Log.isLoggable("FirebaseCrashlytics", 2);
                    return tVar.m(kVar.S());
                } catch (IOException e4) {
                    e0.c("FirebaseCrashlytics", "Settings request failed.", e4);
                    return null;
                }
            default:
                return r8.l.d((ByteArrayInputStream) this.f10686b, null);
        }
    }
}
