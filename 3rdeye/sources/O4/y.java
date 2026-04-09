package O4;

import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class y implements Callable<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f10359a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f10360b;

    public y(v vVar, String str) {
        this.f10360b = vVar;
        this.f10359a = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        v.a(this.f10360b, this.f10359a, Boolean.FALSE);
        return null;
    }
}
