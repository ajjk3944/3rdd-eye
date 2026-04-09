package O4;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class z implements Callable<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10361a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f10362b;

    public z(v vVar, long j4) {
        this.f10362b = vVar;
        this.f10361a = j4;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f10361a);
        this.f10362b.f10343k.d(bundle);
        return null;
    }
}
