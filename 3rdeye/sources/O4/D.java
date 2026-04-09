package O4;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes2.dex */
public final class D implements Callable<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f10232a;

    public D(F f10) {
        this.f10232a = f10;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        try {
            E7.b bVar = this.f10232a.f10238e;
            String str = (String) bVar.f1475b;
            T4.e eVar = (T4.e) bVar.f1476c;
            eVar.getClass();
            boolean zDelete = new File(eVar.f12285c, str).delete();
            if (!zDelete) {
                Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
            }
            return Boolean.valueOf(zDelete);
        } catch (Exception e4) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e4);
            return Boolean.FALSE;
        }
    }
}
