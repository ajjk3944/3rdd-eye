package O4;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* renamed from: O4.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1467m implements Continuation<Void, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Callable f10319b;

    public C1467m(Callable callable) {
        this.f10319b = callable;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task<Void> task) throws Exception {
        return this.f10319b.call();
    }
}
