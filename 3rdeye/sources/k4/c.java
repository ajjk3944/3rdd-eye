package K4;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: FirebaseCrashlytics.java */
/* loaded from: classes2.dex */
public final class c implements Continuation<Void, Object> {
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task<Void> task) throws Exception {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
    }
}
