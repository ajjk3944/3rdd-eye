package O4;

import java.util.concurrent.Callable;

/* compiled from: CrashlyticsController.java */
/* loaded from: classes2.dex */
public final class w implements Callable<Void> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f10352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f10353b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f10354c;

    public w(v vVar, long j4, String str) {
        this.f10354c = vVar;
        this.f10352a = j4;
        this.f10353b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        v vVar = this.f10354c;
        I i = vVar.f10346n;
        if (i != null && i.f10260e.get()) {
            return null;
        }
        vVar.i.f10611b.c(this.f10352a, this.f10353b);
        return null;
    }
}
