package O4;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes2.dex */
public final class E implements Callable<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F f10233a;

    public E(F f10) {
        this.f10233a = f10;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        v vVar = this.f10233a.f10240g;
        E7.b bVar = vVar.f10336c;
        String str = (String) bVar.f1475b;
        T4.e eVar = (T4.e) bVar.f1476c;
        eVar.getClass();
        boolean z10 = true;
        if (new File(eVar.f12285c, str).exists()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
            }
            String str2 = (String) bVar.f1475b;
            eVar.getClass();
            new File(eVar.f12285c, str2).delete();
        } else {
            String strE = vVar.e();
            if (strE == null || !vVar.f10342j.c(strE)) {
                z10 = false;
            }
        }
        return Boolean.valueOf(z10);
    }
}
