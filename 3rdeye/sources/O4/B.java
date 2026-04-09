package O4;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsCore.java */
/* loaded from: classes2.dex */
public final class B implements Callable<Task<Void>> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V4.h f10227a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F f10228b;

    public B(F f10, V4.h hVar) {
        this.f10228b = f10;
        this.f10227a = hVar;
    }

    @Override // java.util.concurrent.Callable
    public final Task<Void> call() throws Exception {
        return F.a(this.f10228b, this.f10227a);
    }
}
