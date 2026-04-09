package m2;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public d2.j f23395a;

    /* renamed from: b, reason: collision with root package name */
    public String f23396b;

    /* renamed from: c, reason: collision with root package name */
    public WorkerParameters.a f23397c;

    public l(d2.j jVar, String str, WorkerParameters.a aVar) {
        this.f23395a = jVar;
        this.f23396b = str;
        this.f23397c = aVar;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        this.f23395a.m().k(this.f23396b, this.f23397c);
    }
}
