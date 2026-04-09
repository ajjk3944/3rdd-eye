package N4;

import android.util.Log;

/* compiled from: DisabledBreadcrumbSource.java */
/* loaded from: classes2.dex */
public final class c implements b {
    @Override // N4.b
    public final void e(a aVar) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Could not register handler for breadcrumbs events.", null);
        }
    }
}
