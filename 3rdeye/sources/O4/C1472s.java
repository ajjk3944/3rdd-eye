package O4;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* compiled from: CrashlyticsController.java */
/* renamed from: O4.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1472s implements SuccessContinuation<Void, Boolean> {
    @Override // com.google.android.gms.tasks.SuccessContinuation
    public final Task<Boolean> then(Void r12) throws Exception {
        return Tasks.forResult(Boolean.TRUE);
    }
}
